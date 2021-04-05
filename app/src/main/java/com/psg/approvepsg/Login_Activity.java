package com.psg.approvepsg;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Login_Activity extends AppCompatActivity {

    TextView t;
    ImageView i;
    EditText e;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_login_);

        t = findViewById (R.id.header);
        i = findViewById (R.id.logoPSG);
        e = findViewById (R.id.username);

        Animation animation = AnimationUtils.loadAnimation (this,R.anim.bounce);

        t.startAnimation (animation);
        i.startAnimation (animation);
        e.startAnimation (animation);
    }
}