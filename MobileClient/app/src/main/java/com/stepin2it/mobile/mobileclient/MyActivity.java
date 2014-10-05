package com.stepin2it.mobile.mobileclient;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class MyActivity extends Activity {
    private List<User> mUserList = new ArrayList<User>();
    private ListView mListView;

    public class MyCustomAdapter extends ArrayAdapter<Photo> {

        public MyCustomAdapter(Context context, int textViewResourceId, List<Photo> mListOfPhotos) {
            super(context, textViewResourceId, mListOfPhotos);
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

            TextView list_tagline = (TextView) row.findViewById(R.id.list_tagline);

            list_name.setText(mListOfPhotos.get(position).getTitle());
            list_tagline.setText(content);

            int i = 0;

            ImageView imageView1 = (ImageView) row.findViewById(R.id.imageView1);


            return row;


        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_my);

        this.populateUserData();

        mListView = (ListView) findViewById(R.id.listView);


    }

    private void populateUserData() {
        User user = new User(1, "John", 25);

        mUserList.add(user);

        user = new User(2, "Smith", 26);

        mUserList.add(user);

        user = new User(3, "Kevin", 27);

        mUserList.add(user);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
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
