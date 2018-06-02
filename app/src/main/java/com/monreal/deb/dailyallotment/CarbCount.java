package com.monreal.deb.dailyallotment;

import android.app.Fragment;
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
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class CarbCount extends AppCompatActivity {

    ToggleButton toggleButton, toggleButton1, toggleButton2, toggleButton3, toggleButton4, toggleButton5, toggleButton6, toggleButton7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleButton = findViewById(R.id.toggleButton);
        toggleButton1 = findViewById(R.id.toggleButton1);
        toggleButton2 = findViewById(R.id.toggleButton2);
        toggleButton3 = findViewById(R.id.toggleButton3);
        toggleButton4 = findViewById(R.id.toggleButton4);
        toggleButton5 = findViewById(R.id.toggleButton5);
        toggleButton6 = findViewById(R.id.toggleButton6);
        toggleButton7 = findViewById(R.id.toggleButton7);

    }

    public void reset(View view) {
        toggleButton.setChecked(false);
        toggleButton.setBackgroundColor(Color.rgb(255,153,153));
        toggleButton1.setChecked(false);
        toggleButton1.setBackgroundColor(Color.rgb(255,219,153));
        toggleButton2.setChecked(false);
        toggleButton2.setBackgroundColor(Color.rgb(255,255,153));
        toggleButton3.setChecked(false);
        toggleButton3.setBackgroundColor(Color.rgb(153,255,153));
        toggleButton4.setChecked(false);
        toggleButton4.setBackgroundColor(Color.rgb(153,153,255));
        toggleButton5.setChecked(false);
        toggleButton5.setBackgroundColor(Color.rgb(255,153,255));
        toggleButton6.setChecked(false);
        toggleButton6.setBackgroundColor(Color.rgb(255,255,255));
        toggleButton7.setChecked(false);
        toggleButton7.setBackgroundColor(Color.rgb(204,204,204));

        Toast toast = Toast.makeText(getApplicationContext(), "Ready to go again!", Toast.LENGTH_SHORT);
        toast.show();

    }


    public void setToggleButton(View view) {
        toggleButton.setBackgroundColor(Color.DKGRAY);

        Toast toast = Toast.makeText(getApplicationContext(), "Nom Nom Nom", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void setToggleButton1 (View view) {
        toggleButton1.setBackgroundColor(Color.DKGRAY);

        Toast toast = Toast.makeText(getApplicationContext(), "You've got this!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void setToggleButton2 (View view) {
        toggleButton2.setBackgroundColor(Color.DKGRAY);

        Toast toast = Toast.makeText(getApplicationContext(), "Look at you go!!!", Toast
                .LENGTH_SHORT);
        toast.show();
    }

    public void setToggleButton3 (View view) {
        toggleButton3.setBackgroundColor(Color.DKGRAY);

        Toast toast = Toast.makeText(getApplicationContext(), "You are crushing this!", Toast
                .LENGTH_SHORT);
        toast.show();
    }

    public void setToggleButton4 (View view) {
        toggleButton4.setBackgroundColor(Color.DKGRAY);

        Toast toast = Toast.makeText(getApplicationContext(), "Killin' IT!", Toast
                .LENGTH_SHORT);
        toast.show();
    }

    public void setToggleButton5 (View view) {
        toggleButton5.setBackgroundColor(Color.DKGRAY);

        Toast toast = Toast.makeText(getApplicationContext(), "Carbs don't control you!", Toast
                .LENGTH_SHORT);
        toast.show();
    }

    public void setToggleButton6 (View view) {
        toggleButton6.setBackgroundColor(Color.DKGRAY);

        Toast toast = Toast.makeText(getApplicationContext(), "You're so awesome", Toast
                .LENGTH_SHORT);
        toast.show();
    }

    public void setToggleButton7 (View view) {
        toggleButton7.setBackgroundColor(Color.DKGRAY);

        Toast toast = Toast.makeText(getApplicationContext(), "Kickin' butt and taking names",
                Toast
                .LENGTH_SHORT);
        toast.show();
    }

    public void calCounter(View view) {
        Intent intent = new Intent(this, CalCount.class);
        startActivity(intent);
    }
}

