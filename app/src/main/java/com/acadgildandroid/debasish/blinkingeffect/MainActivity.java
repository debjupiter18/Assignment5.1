package com.acadgildandroid.debasish.blinkingeffect;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView txt;
    private Button blinkBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt=(TextView)findViewById(R.id.txt);
        blinkBtn=(Button)findViewById(R.id.btn);
        blinkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){

                manageBlinkEffect();

            }
        });

    }

    private void manageBlinkEffect(){

        ObjectAnimator anim=ObjectAnimator.ofInt(txt,"backgroundColor", Color.WHITE,Color.RED,Color.WHITE);
        anim.setDuration(800);
        anim.setEvaluator(new ArgbEvaluator());
        //anim.setRepeatMode(Animation.REVERSE);
        anim.setRepeatCount(Animation.INFINITE);
        anim.start();
    }
}
