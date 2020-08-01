package com.spatel.groupapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    public void contact(View view) {
        Intent i = new Intent(WelcomeActivity.this,ContactUsActivity .class);
        startActivity(i);
    }

    public void login(View view) {
        Intent i = new Intent(WelcomeActivity.this,LoginActivity .class);
        startActivity(i);
    }

    public void about(View view) {
        Intent i = new Intent(WelcomeActivity.this,AboutUsActivity .class);
        startActivity(i);
    }
}