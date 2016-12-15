package com.demo.customplugin;

import android.os.Bundle;
import android.widget.Toast;

import org.apache.cordova.CordovaActivity;

/**
 * Created by xiaoshuai on 2016/12/14.
 */

public class NextActivity extends CordovaActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        Toast.makeText(this,getIntent().getStringExtra("arg"),Toast.LENGTH_LONG).show();

    }
}
