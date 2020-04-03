package com.example.colors;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.SeekBar;
import android.widget.Toast;

public class Palette extends AppCompatActivity
    implements SeekBar.OnSeekBarChangeListener {

    //Variables
    private SeekBar vRed = null;
    private SeekBar vGreen = null;
    private SeekBar vBlue = null;
    private SeekBar vAlpha = null;
    private View vFilter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palette);

        //Code here
        //Get components Id's
        vRed= findViewById(R.id.sbrRed);
        vGreen= findViewById(R.id.sbrGreen);
        vBlue= findViewById(R.id.sbrBlue);
        vAlpha= findViewById(R.id.sbrAlpha);
        vFilter=findViewById(R.id.vieColors);

        vRed.setOnSeekBarChangeListener(this);
        vGreen.setOnSeekBarChangeListener(this);
        vBlue.setOnSeekBarChangeListener(this);
        vAlpha.setOnSeekBarChangeListener(this);
    }
    //#################################
    //MENUS
    //#################################
    // Shown the options menu on the Device

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu1, menu);

        return super.onCreateOptionsMenu(menu);
    }
    // Item actions.
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.iteTransparent:
                Toast.makeText(this, "This color ig going to change to transparent", Toast.LENGTH_SHORT).show();
                break;
            case R.id.iteSemitransparent:
                //Code to change color
                break;
            case R.id.iteOpaque:
                //Code to change color
                break;
            case R.id.iteBlack:
                //Code to change color
                break;
            case R.id.iteWhite:
                //Code to change color
                break;
            case R.id.iteRed:
                //Code to change color
                break;
            case R.id.iteGreen:
                //Code to change color
                break;
            case R.id.iteBlue:
                //Code to change color
                break;
            case R.id.iteCyan:
                //Code to change color
                break;
            case R.id.iteMagenta:
                //Code to change color
                break;
            case R.id.iteYellow:
                //Code to change color
                break;
            case R.id.iteReset:
                //Code to change color
                break;
            case R.id.iteAboutof:
                //Code to change color
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean bo) {
        //1. Get SeekBar Values
        int r = vRed.getProgress();
        int g = vGreen.getProgress();
        int b = vBlue.getProgress();
        int a = vAlpha.getProgress();

        //2. Convert values (in step 1) to a ARGB function
        int filter_color = Color.argb(a,r,g,b); // Alpha, Red, Green, Blue

        //3. Set the new color to Image (View)
        vFilter.setBackgroundColor(filter_color);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
