package com.spatel.groupapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ImageView imageview;
    Animation leftSmit,middlePujan,rightJenil,rotateLogo;
    private TextView txtSmit,txtPujan,txtJenil;
    private final int SPLASH_SCREEN_TIME = 5000;
    private ImageView splashLogo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN); //This method is used so that your splash activity
        //can cover the entire screen.\

        //Animation object
        leftSmit = AnimationUtils.loadAnimation(this,R.anim.smit_left_animation);
        middlePujan = AnimationUtils.loadAnimation(this,R.anim.pujan_middle_animation);
        rightJenil = AnimationUtils.loadAnimation(this,R.anim.jenil_right_animation);
        //rotateLogo = AnimationUtils.loadAnimation(this,R.anim.logo_rotate_animation);

        // text references
        txtSmit = findViewById(R.id.txtSmit);
        txtPujan = findViewById(R.id.txtPujan);
        txtJenil = findViewById(R.id.txtJenil);
        //splashLogo = findViewById(R.id.splashLogo);

        txtSmit.setAnimation(leftSmit);
        txtPujan.setAnimation(middlePujan);
        txtJenil.setAnimation(rightJenil);
        //splashLogo.setAnimation(rotateLogo);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this,WelcomeActivity .class);
                startActivity(i);
                finish();
                // current activity get finished
            }
        },SPLASH_SCREEN_TIME);

    }
}