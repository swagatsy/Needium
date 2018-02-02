package com.example.donnie_darko.needium;

import android.content.Intent;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        SystemClock.sleep(12000);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(MainActivity.this,HomeActivity.class);
                startActivity(mainIntent);
                finish();
            }
        }, 3000);
//        Intent intent = new Intent(MainActivity.this,HomeActivity.class);
//        startActivity(intent);
//        finish();


    }
}
