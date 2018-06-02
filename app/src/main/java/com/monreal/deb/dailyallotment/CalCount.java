package com.monreal.deb.dailyallotment;

import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalCount extends AppCompatActivity {

    Button Button5, Button10, Button25, Button50, Button100;
    TextView calTotal;
    int calories = 0;
    EditText userLimit;
    int limit;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal_count);

        Button5 = findViewById(R.id.button5);
        Button10 = findViewById(R.id.button10);
        Button25 = findViewById(R.id.button25);
        Button50 = findViewById(R.id.button50);
        Button100 = findViewById(R.id.button100);
        calTotal = findViewById(R.id.TVConsumed);
        userLimit = findViewById(R.id.userLimit);

        Button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                calories = calories + 5;
                displayCalories(calories);



            }
        });

        Button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                calories = calories + 10;
                displayCalories(calories);
            }
        });

        Button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                calories = calories + 25;
                displayCalories(calories);
            }
        });

        Button50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                calories = calories + 50;
                displayCalories(calories);
            }
        });

        Button100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                calories = calories + 100;
                displayCalories(calories);
            }
        });

    }

    private void displayCalories(int calories) {
        if (userLimit == null){
            Toast.makeText(CalCount.this, "You must enter a calorie goal first", Toast
                    .LENGTH_SHORT).show();
            }
        else{

            limit = Integer.parseInt(userLimit.getText().toString());
            calTotal.setText(String.valueOf(calories));
            if(calories > limit) {
                calTotal.setTextColor(Color.RED);
                }

            }
    }

    public void reset(View view){
        calories = 0;
        displayCalories(calories);
        calTotal.setTextColor(Color.rgb(255, 153, 255));
    }

    public void carbTracker(View view) {
        Intent intent = new Intent(this, CarbCount.class);
        startActivity(intent);
    }
}
