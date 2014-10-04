package com.stepin2it.mobile.mobileclient;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by coder on 10/4/14.
 */
public class SplashScreenActivity {
    private static final String TAG = "SplashScreenActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Button button1 = (Button) findViewById(R.id.button1);
        ImageView imageView1 = (ImageView) findViewById(R.id.imageView1);
        ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);

        TextView textView1 = (TextView) findViewById(R.id.textView1);

        final TextView textView2 = (TextView) findViewById(R.id.textView2);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView2.setText("This is a demo of setting text on a TextView object");
            }
        });

    }
}
