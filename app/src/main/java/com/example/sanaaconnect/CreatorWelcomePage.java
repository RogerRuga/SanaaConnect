package com.example.sanaaconnect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CreatorWelcomePage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creator_welcome_page);

        //Open Login Activity
        Button buttonLogin = findViewById(R.id.button_login);
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CreatorWelcomePage.this, CreatorLogin.class);
                startActivity(intent);
            }
        });

        //Open Register Activity

        Button buttonRegister = findViewById(R.id.button_register1);
        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CreatorWelcomePage.this, RegisterCreator.class);
                startActivity(intent);

            }
        });


    }
}