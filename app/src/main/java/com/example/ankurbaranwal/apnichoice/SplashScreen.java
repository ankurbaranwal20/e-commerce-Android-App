package com.example.ankurbaranwal.apnichoice;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ViewFlipper;

public class SplashScreen extends AppCompatActivity {

    ImageView imageView;
    ViewFlipper flip1;
    ProgressBar pb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        imageView =(ImageView)findViewById(R.id.splash_image);
        pb  = (ProgressBar)findViewById(R.id.pb);

        flip1=findViewById(R.id.Splash_viewFlipper);

        Animation in = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.my_anim);
        imageView.setAnimation(in);

        Animation inn= AnimationUtils.loadAnimation(this,android.R.anim.slide_in_left);
        flip1.setInAnimation(inn);
        Animation out= AnimationUtils.loadAnimation(this,android.R.anim.slide_out_right);
        flip1.setOutAnimation(out);
        flip1.showNext();


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },3000);

    }
}
