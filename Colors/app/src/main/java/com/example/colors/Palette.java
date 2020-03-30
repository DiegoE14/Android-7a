package com.example.colors;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class Palette extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palette);

        //Code here
    }
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
                break;
            case R.id.iteOpaque:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
