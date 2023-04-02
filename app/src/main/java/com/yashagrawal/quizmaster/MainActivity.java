package com.yashagrawal.quizmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final int SPLASH_SCREEN = 4500;
    private MediaPlayer mediaPlayer;
    Animation topAnim,bottomAnim;
    ImageView logo;
    TextView title,slogan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logo = findViewById(R.id.imageView);
        title = findViewById(R.id.textView);
        slogan = findViewById(R.id.textView2);

        mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.heat_waves);
        mediaPlayer.start();

        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        logo.setAnimation(topAnim);
        title.setAnimation(bottomAnim);
        slogan.setAnimation(bottomAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);
    }
}