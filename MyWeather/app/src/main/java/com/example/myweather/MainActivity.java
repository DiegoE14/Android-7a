package com.example.myweather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainActivity extends AppCompatActivity {

    private ExecutorService queue = Executors.newSingleThreadExecutor();
    private final static String KEY = "6498e268f2de120d0cd71288c41cbcc6";
    private final static String DOMAIN = "https://meet.google.com/linkredirect?authuser=0&dest=https%3A%2F%2Fapi.openweathermap.org%2Fdata%2F2.5%2Fweather";
    private final static String IMGDOMAN = "https://meet.google.com/linkredirect?authuser=0&dest=https%3A%2F%2Fopenweathermap.org%2Fimg%2Fw%2F";
    private final static String FORMAT ="https://meet.google.com/linkredirect?authuser=0&dest=https%3A%2F%2Fapi.openweathermap.org%2Fdata%2F2.5%2Fweather%3Fq%3DCali%2Cco%26appid%3D6498e268f2de120d0cd71288c41cbcc6";

    private EditText txtSearch;
    private TextView lblCurrent, lblMin, lblMax, lblDescription;
    private ImageView imgWeather;

    private double lng = 0; //Lon
    private double lat = 0; //Lat


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtSearch  = findViewById(R.id.txtSearch);
        lblCurrent  = findViewById(R.id.lblCurrent);
        lblMin  = findViewById(R.id.lblMin);
        lblMax  = findViewById(R.id.lblMax);
        lblMax  = findViewById(R.id.lblMax);
        lblDescription  = findViewById(R.id.lblWeatherDescription);
        imgWeather  = findViewById(R.id.imgWeather);
    }
}
