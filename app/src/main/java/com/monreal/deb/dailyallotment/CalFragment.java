package com.monreal.deb.dailyallotment;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class CalFragment extends Fragment {

    Button Button5, Button10, Button25, Button50, Button100, reset;
    TextView calTotal;
    int calories = 0;
    EditText userLimit;
    int limit;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ConstraintLayout rootView = (ConstraintLayout) inflater.inflate(R.layout.fragment_cal_count, container, false);

        Button5 = rootView.findViewById(R.id.button5);
        Button10 = rootView.findViewById(R.id.button10);
        Button25 = rootView.findViewById(R.id.button25);
        Button50 = rootView.findViewById(R.id.button50);
        Button100 = rootView.findViewById(R.id.button100);
        calTotal = rootView.findViewById(R.id.TVConsumed);
        userLimit = rootView.findViewById(R.id.userLimit);
        reset = rootView.findViewById(R.id.reset);

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

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calories = 0;
               calTotal.setTextColor(Color.GREEN);
                displayCalories(calories);
            }
        });




        return rootView;

    }
        private void displayCalories(int calories) {

            limit = Integer.parseInt(userLimit.getText().toString());
            calTotal.setText(String.valueOf(calories));
            if(calories > limit) {
                calTotal.setTextColor(Color.RED);
            }

    }

}

