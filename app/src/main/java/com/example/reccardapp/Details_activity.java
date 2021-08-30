package com.example.reccardapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Details_activity extends AppCompatActivity {

    TextView countryID, areaID, religionID, populationID, detailsArea, animalsID, birdsID;
    ImageView flagID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        countryID = findViewById(R.id.countryID);
        areaID = findViewById(R.id.areaID);
        religionID = findViewById(R.id.religionID);
        populationID = findViewById(R.id.populationID);
        detailsArea = findViewById(R.id.detailsArea);
        animalsID = findViewById(R.id.animalsID);
        birdsID = findViewById(R.id.birdsID);
        flagID = findViewById(R.id.flagID);

        flagID.setImageResource(getIntent().getIntExtra("flag", 0));
        countryID.setText(getIntent().getStringExtra("countryname"));
        countryID.setText(getIntent().getStringExtra("area"));
        countryID.setText(getIntent().getStringExtra("religion"));
        countryID.setText(getIntent().getStringExtra("population"));
        countryID.setText(getIntent().getStringExtra("detailsarea"));
        countryID.setText(getIntent().getStringExtra("animals"));
        countryID.setText(getIntent().getStringExtra("birds"));

    }
}