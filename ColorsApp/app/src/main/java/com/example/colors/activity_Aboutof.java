package com.example.colors;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;

public class activity_Aboutof extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__aboutof);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        ImageView imageview = (ImageView) findViewById(R.id.imageView);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.perfil);
        RoundedBitmapDrawable roundedBitmapDrawable = RoundedBitmapDrawableFactory.create(getResources(), bitmap);
        roundedBitmapDrawable.setCircular(true);
        imageview.setImageDrawable(roundedBitmapDrawable);
    }
}
