package com.example.animationwithframes;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private AnimationDrawable animation_cat;
    private ImageView imagen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        imagen=findViewById(R.id.imageAnimation);
        imagen.setBackgroundResource(R.drawable.cat_animation);
        animation_cat=(AnimationDrawable)imagen.getBackground();
        animation_cat.run();

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            if(animation_cat.isRunning()){
                animation_cat.stop();
            }else{
            animation_cat.start();
        }
        }
            return super.onTouchEvent(event);
        }

}