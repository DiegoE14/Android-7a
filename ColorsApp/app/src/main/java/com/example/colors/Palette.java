package com.example.colors;

import androidx.annotation.NavigationRes;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatViewInflater;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.SeekBar;
import android.widget.Toast;

import java.util.NavigableSet;

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

        //Show the context menu when i do a long press in the component
        registerForContextMenu(vFilter);
    }
    //#################################
    // OPTIONS MENUS
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
            case R.id.icHelp :
                Intent intent = new Intent(this, activity_help.class);
                startActivity(intent);
                break;
            case R.id.icTransparent :
                vAlpha.setProgress(0);
                break;
            case R.id.iteTransparent:
                //Code to change color
                vAlpha.setProgress(0);
                break;
            case R.id.iteSemitransparent:
                //Code to change color
                vRed.setProgress(0);
                vGreen.setProgress(0);
                vBlue.setProgress(0);
                vAlpha.setProgress(128);
                break;
            case R.id.iteOpaque:
                //Code to change color
                vAlpha.setProgress(255);
                break;
            case R.id.iteBlack:
                //Code to change color
                //WORK
                vRed.setProgress(0);
                vGreen.setProgress(0);
                vBlue.setProgress(0);
                vAlpha.setProgress(200);
                break;
            case R.id.iteWhite:
                //Code to change color
                //WORK
                vRed.setProgress(255);
                vGreen.setProgress(255);
                vBlue.setProgress(255);
                vAlpha.setProgress(200);
                break;
            case R.id.iteRed:
                //Code to change color
                vRed.setProgress(255);
                vGreen.setProgress(0);
                vBlue.setProgress(0);
                vAlpha.setProgress(128);
                break;
            case R.id.iteGreen:
                //Code to change color to green
                vRed.setProgress(0);
                vGreen.setProgress(255);
                vBlue.setProgress(0);
                vAlpha.setProgress(128);
                break;
            case R.id.iteBlue:
                //Code to change color to blue
                vRed.setProgress(0);
                vGreen.setProgress(0);
                vBlue.setProgress(255);
                vAlpha.setProgress(128);
                break;
            case R.id.iteCyan:
                //Code to change color
                //WORK
                vRed.setProgress(0);
                vGreen.setProgress(255);
                vBlue.setProgress(255);
                vAlpha.setProgress(128);
                break;
            case R.id.iteMagenta:
                //Code to change color
                //WORK
                vRed.setProgress(150);
                vGreen.setProgress(45);
                vBlue.setProgress(110);
                vAlpha.setProgress(128);
                break;
            case R.id.iteYellow:
                //Code to change color
                //WORK
                vRed.setProgress(255);
                vGreen.setProgress(255 );
                vBlue.setProgress(0);
                vAlpha.setProgress(128);
                break;
            case R.id.iteReset:
                //Code to change color
                vRed.setProgress(0);
                vGreen.setProgress(0);
                vBlue.setProgress(0);
                vAlpha.setProgress(0);
                break;
            case R.id.iteAboutof:
                //Go to ABoutOf Activity
                Intent intent2 = new Intent(this, activity_Aboutof.class);
                startActivity(intent2);
                break;
            case R.id.iteCloseApp:
                //Close App
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    //#################################
    // CONTEXT MENUS
    //#################################

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater2 = getMenuInflater();
        inflater2.inflate(R.menu.menu2, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.iteReset:
                vRed.setProgress(0);
                vGreen.setProgress(0);
                vBlue.setProgress(0);
                vAlpha.setProgress(0);
                break;
            case R.id.ic2Help:
                Intent intent = new Intent(this, activity_help.class);
                startActivity(intent);
                break;
        }
        return super.onContextItemSelected(item);
    }

    //#################################
    // SEEKBARS
    //#################################

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
