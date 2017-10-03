package com.example.james.navigationdrawer;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen_activity);
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.move_up);
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setAnimation(anim);
        TextView textView = (TextView) findViewById(R.id.textView);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(Splash_screen.this,MainActivity.class));
                finish();
            }
        }, 6000);
    }
}
