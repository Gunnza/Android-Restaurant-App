package com.mcgovern.chris.googlemapsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoginSuccessActivity extends AppCompatActivity {

    MapsActivity  mapsActivity = new MapsActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_success);

        TextView txtname = (TextView) findViewById(R.id.txt_success_name);
        TextView btnlogout = (TextView) findViewById(R.id.btn_logout);
        TextView btnRestaurantsInOmagh = (TextView) findViewById(R.id.buttonRestaurantsInOmagh);
        TextView btnRestaurantsInEniskillen = (TextView) findViewById(R.id.buttonRestaurantsInEniskillen);
        TextView btnRestaurantsInStrabane = (TextView) findViewById(R.id.buttonRestaurantsInStrabane);

        Intent intent = getIntent();

        String loginName = intent.getStringExtra("fullname");
        txtname.setText("Welcome, " + loginName);

        btnlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginSuccessActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btnRestaurantsInOmagh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mapsActivity.Omagh = true;
                Intent intent = new Intent(LoginSuccessActivity.this, MapsActivity.class);
                startActivity(intent);
                finish();
            }
        });
        btnRestaurantsInEniskillen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mapsActivity.Eniskillen = true;
                Intent intent = new Intent(LoginSuccessActivity.this, MapsActivity.class);
                startActivity(intent);
                finish();
            }
        });
        btnRestaurantsInStrabane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mapsActivity.Strabane = true;
                Intent intent = new Intent(LoginSuccessActivity.this, MapsActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}


