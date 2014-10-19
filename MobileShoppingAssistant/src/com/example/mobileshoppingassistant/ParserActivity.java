package com.example.mobileshoppingassistant;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class ParserActivity extends Activity {
	private static final String TAG = ParserActivity.class.getName();
	private List<User> mUserList = new ArrayList<User>();
	private ListView mListView;
	private Users mUsersResponse;
	private List<User> mListofUsers = new ArrayList<User>();
	private List<Contact> mListofcontacts = new ArrayList<Contact>();
	public class MyCustomAdapter extends ArrayAdapter<User> {

		public MyCustomAdapter(Context context, int textViewResourceId,
				List<User> list) {
			super(context, textViewResourceId, list);
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// TODO Fix compile errors in this class

			final int rownumber = position;
			View row = convertView;

			if (row == null) {
				LayoutInflater inflater = getLayoutInflater();
				row = inflater.inflate(R.layout.row_users, parent, false);
			}

			row.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {

				}

			});

			TextView list_name = (TextView) row.findViewById(R.id.list_name);

			TextView list_tagline = (TextView) row
					.findViewById(R.id.list_tagline);

			list_name.setText(mListofUsers.get(position).getFirstName());
			list_tagline.setText(" " + mListofUsers.get(position).getPhoneNumber());

			int i = 0;

			ImageView imageView1 = (ImageView) row
					.findViewById(R.id.imageView1);

			return row;

		}

	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_main);

		//this.populateUserData();

		mListView = (ListView) findViewById(R.id.listView);
		

		
		// TODO Although the following call to read will work 
		// PLease try to optimize the code using AsyncTask (refer to developer.android.com) 
		// http://developer.android.com/reference/android/os/AsyncTask.html
		// DEBUG it so that no exception is thrown
		//read();
		
		
		new AsyncIO().execute();

	}

	private void read() {
		//String jsonFileUrl = "http://10.96.168.135/users.json";
//		String jsonFileUrl = "http://169.254.6.143:8080/com.youtube.rest/";
		// String jsonFileUrl = "http://localhost:8080/com.youtube.rest/api/v1/status/gson";
		// mUsersResponse = ObjectsReader.readUsersResponse(jsonFileUrl);
		
		ObjectsReader reader = new ObjectsReader();
        
        mUsersResponse = reader.readUsersResponse(FeaturesConfiguration.JSON_URL);
		
	}
	private void display() {
		Log.d(TAG, "display was called");
		
		mListofUsers = mUsersResponse.getUsers();
		
		MyCustomAdapter adapter = new MyCustomAdapter(this, 0, mListofUsers);
		
		mListView.setAdapter(adapter);

	}
	
	private class AsyncIO extends AsyncTask<Void, Void, Void> {

	      @Override
          protected void onPreExecute() {
	    	  //TODO 
          }

          @Override
          protected void onProgressUpdate(Void... values) {
        	  //TODO
          }
		@Override
		protected Void doInBackground(Void... params) {
			//java.lang.System.out.println("url: " +  url);
			
			try{
				read();
			}
			catch(Exception ex){
				Log.e(TAG, ex.toString());
			}
			
			return null;
			
		}
		
		 protected void onPostExecute(Void result) {
			Log.d(TAG, "onPostExecute called");
			display();
		
		}
		
		
	}
	
	
	private void populateUserData() {
		User user = new User("John", "416-252-3999");
		
		
		mUserList.add(user);

		user = new User("Smith", "416-333-2232");

		mUserList.add(user);

		user = new User("Kevin", "416-233-3434");

		mUserList.add(user);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
