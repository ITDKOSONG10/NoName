package com.psg.approvepsg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView h ;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        h = findViewById (R.id.helloword);

        Animation animation = AnimationUtils.loadAnimation (this,R.anim.bounce);
        h.startAnimation (animation);
    }
}