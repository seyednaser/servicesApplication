package com.example.android.servicesapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Notification Running");

    }

    public void onStartService(View view) {
        Intent intent = new Intent(this, DelayedMessageService.class);
    }
}
