package com.example.pk.edu.uiitbasit_aamir_mohsin.myapplicationtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView img1,img2,img3;
    Animation top,bottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1=(ImageView)findViewById(R.id.logop);
        img2=(ImageView)findViewById(R.id.logoO);
        img3=(ImageView)findViewById(R.id.logos);

        top= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.logop);
        bottom= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.logoo);
        top= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.logos);


        img1.setAnimation(top);
        img2.setAnimation(bottom);
        img3.setAnimation(top);

    }

}