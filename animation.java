package com.example.raksha_ramya.imageani;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class animation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animation_main);
    }

    public void didTapButton(View view) {
        Button button = (Button) findViewById(R.id.button);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);
        button.startAnimation(myAnim);
    }
    public void didTapButton1(View view) {
        Button button = (Button) findViewById(R.id.button1);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce1);
        button.startAnimation(myAnim);

    }

}
