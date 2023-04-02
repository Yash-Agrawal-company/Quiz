package com.yashagrawal.quizmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    Animation topAnim,rightAnimation;
    ImageView logoImage;
    TextView welcome,newAccount,forget;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        welcome = findViewById(R.id.welcome);
        logoImage = findViewById(R.id.logoImage);
        forget = findViewById(R.id.forget);
        login = findViewById(R.id.login);
        newAccount = findViewById(R.id.newAccount);

        topAnim = AnimationUtils.loadAnimation(MainActivity2.this,R.anim.top_animation);
        rightAnimation = AnimationUtils.loadAnimation(MainActivity2.this,R.anim.right_side_animation);


        logoImage.setAnimation(topAnim);
        welcome.setAnimation(rightAnimation);

        newAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(intent);
            }
        });

    }
}