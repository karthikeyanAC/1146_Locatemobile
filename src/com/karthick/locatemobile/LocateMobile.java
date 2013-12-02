package com.karthick.locatemobile;

import org.apache.cordova.DroidGap;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;

public class LocateMobile extends /* Activity */DroidGap {

	 // @Override
    // protected void onCreate(Bundle savedInstanceState) {
    // super.onCreate(savedInstanceState);
    // setContentView(R.layout.activity_main);
    // }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.html");

        super.appView.setOnLongClickListener(new View.OnLongClickListener() {

            public boolean onLongClick(View v) {
                return true;
            }
        });
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_locate_mobile, menu);
        return true;
    }
    
   
}
