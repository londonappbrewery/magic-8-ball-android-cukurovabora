package com.londonappbrewery.magiceightball;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button shakeBall = (Button) findViewById(R.id.button);

        final ImageView Ball_image = (ImageView) findViewById(R.id.ball_image);
        final int[] Ball_images = { R.drawable.ball1,
                                    R.drawable.ball2,
                                    R.drawable.ball3,
                                    R.drawable.ball4,
                                    R.drawable.ball5};

        final Random rand_number = new Random();

        shakeBall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int curr_number = rand_number.nextInt(5);
                Ball_image.setImageResource(Ball_images[curr_number]);

            }
        });

    }
}
