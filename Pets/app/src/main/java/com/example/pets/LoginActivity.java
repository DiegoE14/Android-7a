package com.example.pets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void Btn_Login(View view){
        Toast.makeText(this, "You have pressed login button", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent (  this, ImboxActivity.class);
        startActivity(intent);
    }
    public void Btn_signup(View view){
        Toast.makeText(this, "You have pressed sign up button", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }
}
