package com.designstudios.crazywithkids.dailyallotment;

import android.content.Context;
import android.content.SharedPreferences;
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

public class CalFragment extends Fragment {

    Button Button5, Button10, Button25, Button50, Button100, save, reset;
    TextView calTotal;
    int calories = 0;
    EditText userLimit;
    int limit;
    SharedPreferences calCount, userCal;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ConstraintLayout rootView = (ConstraintLayout) inflater.inflate(R.layout.fragment_cal_count, container, false);

        calCount = getActivity().getSharedPreferences("userCalories", Context.MODE_PRIVATE);
        if (calCount.contains("calories")) {
            calories = calCount.getInt("calories", 0);

        } else {
            calories = 0;
        }

        userCal = getActivity().getSharedPreferences("enteredCal", Context.MODE_PRIVATE);
        if (userCal.contains("upperLimit")) {
            limit = userCal.getInt("upperLimit", 0);
        } else {
            limit = 0;
        }


        Button5 = rootView.findViewById(R.id.button5);
        Button10 = rootView.findViewById(R.id.button10);
        Button25 = rootView.findViewById(R.id.button25);
        Button50 = rootView.findViewById(R.id.button50);
        Button100 = rootView.findViewById(R.id.button100);
        calTotal = rootView.findViewById(R.id.TVConsumed);
        userLimit = rootView.findViewById(R.id.userLimit);
        reset = rootView.findViewById(R.id.reset);
        save = rootView.findViewById(R.id.save);

        Button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                calories += 5;

                SharedPreferences.Editor editor = calCount.edit();
                editor.putInt("calories", calories);
                editor.apply();

                displayCalories(calories);

            }
        });

        Button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                calories = calories + 10;


                SharedPreferences.Editor editor = calCount.edit();
                editor.putInt("calories", calories);
                editor.apply();
                displayCalories(calories);
            }
        });

        Button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                calories = calories + 25;


                SharedPreferences.Editor editor = calCount.edit();
                editor.putInt("calories", calories);
                editor.apply();
                displayCalories(calories);
            }
        });

        Button50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                calories = calories + 50;


                SharedPreferences.Editor editor = calCount.edit();
                editor.putInt("calories", calories);
                editor.apply();
                displayCalories(calories);
            }
        });

        Button100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                calories = calories + 100;


                SharedPreferences.Editor editor = calCount.edit();
                editor.putInt("calories", calories);
                editor.apply();
                displayCalories(calories);
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences.Editor editor = calCount.edit();
                editor.clear();
                editor.commit();
                calories = 0;

                calTotal.setTextColor(Color.GREEN);

                SharedPreferences.Editor editor1 = userCal.edit();
                editor1.clear();
                editor1.commit();
                limit = 0;

                userLimit.setText(String.valueOf(limit));
                displayCalories(calories);
            }
        });

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                limit = Integer.parseInt(userLimit.getText().toString());

                SharedPreferences.Editor editor1 = userCal.edit();
                editor1.putInt("upperLimit", limit);
                editor1.apply();

                Toast.makeText(getContext(), "Input Saved", Toast.LENGTH_SHORT).show();

            }
        });


        displayCalories(calories);

        displayLimit(limit);
        return rootView;

    }

    public void displayLimit(int limit) {
        userLimit.setText(String.valueOf(limit));
    }

    private void displayCalories(int calories) {

        calTotal.setText(String.valueOf(calories));

        if (calories > limit) {
            calTotal.setTextColor(Color.RED);
        } else {
            calTotal.setTextColor(Color.GREEN);
        }


    }
}

