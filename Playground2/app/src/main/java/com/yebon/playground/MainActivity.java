package com.yebon.playground;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView image;
    private AnimatedVectorDrawable vector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vector = (AnimatedVectorDrawable) ContextCompat.getDrawable(this, R.drawable.avd);
        image = findViewById(R.id.image);
        image.setImageDrawable(vector);
        vector.start();
    }
}