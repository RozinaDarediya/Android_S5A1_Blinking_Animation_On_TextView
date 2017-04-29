/*
    Show Blinking animation on TextView
 */

package com.example.dell.blinking_animation_on_textview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            /* created reference of textview and button */
        final Button button = (Button)findViewById(R.id.button);
        final TextView text = (TextView) findViewById(R.id.text);

        /* on clicking the animation will start */
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blinking_animation);
                text.startAnimation(animation);
            }
        });
    }
}
