package com.designstudios.crazywithkids.dailyallotment;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class CarbCountFragment extends Fragment {

    Button Button5, Button10, Button25, Button15, Button1, save, reset;
    TextView calTotal;
    int calories = 0;
    EditText userLimit;
    int limit = 0;
    SharedPreferences calCount, userCal;
    ToggleButton toggleButton, toggleButton1, toggleButton2, toggleButton3, toggleButton4, toggleButton5, toggleButton6, toggleButton7;
    boolean selected;
    SharedPreferences preferences;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ConstraintLayout rootView = (ConstraintLayout) inflater.inflate(R.layout.fragment_carb_counter, container, false);

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
        Button15 = rootView.findViewById(R.id.button50);
        Button1 = rootView.findViewById(R.id.button100);
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

        Button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                calories = calories + 15;


                SharedPreferences.Editor editor = calCount.edit();
                editor.putInt("calories", calories);
                editor.apply();
                displayCalories(calories);
            }
        });

        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                calories = calories + 1;


                SharedPreferences.Editor editor = calCount.edit();
                editor.putInt("calories", calories);
                editor.apply();
                displayCalories(calories);
            }
        });


        displayCalories(calories);

        toggleButton = rootView.findViewById(R.id.toggleButton);
        toggleButton1 = rootView.findViewById(R.id.toggleButton1);
        toggleButton2 = rootView.findViewById(R.id.toggleButton2);
        toggleButton3 = rootView.findViewById(R.id.toggleButton3);
        toggleButton4 = rootView.findViewById(R.id.toggleButton4);
        toggleButton5 = rootView.findViewById(R.id.toggleButton5);
        toggleButton6 = rootView.findViewById(R.id.toggleButton6);
        toggleButton7 = rootView.findViewById(R.id.toggleButton7);

        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                preferences = getActivity().getSharedPreferences("checkedState", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = preferences.edit();
                editor.putBoolean("tbpref", toggleButton.isChecked());
                editor.apply();

                Toast toast = Toast.makeText(getContext(), "Nom Nom Nom", Toast.LENGTH_SHORT);
                toast.show();

            }
        });

        toggleButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                preferences = getActivity().getSharedPreferences("checkedState", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = preferences.edit();
                editor.putBoolean("tb1pref", toggleButton1.isChecked());
                editor.apply();

                Toast toast = Toast.makeText(getContext(), "You've got this!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        toggleButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preferences = getActivity().getSharedPreferences("checkedState", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = preferences.edit();
                editor.putBoolean("tb2pref", toggleButton1.isChecked());
                editor.apply();

                Toast toast = Toast.makeText(getContext(), "Look at you go!!!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        toggleButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preferences = getActivity().getSharedPreferences("checkedState", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = preferences.edit();
                editor.putBoolean("tb3pref", toggleButton1.isChecked());
                editor.apply();

                Toast toast = Toast.makeText(getContext(), "You are crushing this!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        toggleButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preferences = getActivity().getSharedPreferences("checkedState", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = preferences.edit();
                editor.putBoolean("tb4pref", toggleButton1.isChecked());
                editor.apply();

                Toast toast = Toast.makeText(getContext(), "Killin' IT!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        toggleButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                preferences = getActivity().getSharedPreferences("checkedState", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = preferences.edit();
                editor.putBoolean("tb5pref", toggleButton1.isChecked());
                editor.apply();

                Toast toast = Toast.makeText(getContext(), "Carbs don't control you!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        toggleButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preferences = getActivity().getSharedPreferences("checkedState", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = preferences.edit();
                editor.putBoolean("tb6pref", toggleButton1.isChecked());
                editor.apply();

                Toast toast = Toast.makeText(getContext(), "You're so awesome", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        toggleButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preferences = getActivity().getSharedPreferences("checkedState", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = preferences.edit();
                editor.putBoolean("tb7pref", toggleButton1.isChecked());
                editor.apply();

                Toast toast = Toast.makeText(getContext(), "Kickin' butt and taking names", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences.Editor editor = calCount.edit();
                editor.clear();
                editor.commit();
                calories = 0;

                displayCalories(0);

                toggleButton.setChecked(false);
                toggleButton1.setChecked(false);
                toggleButton2.setChecked(false);
                toggleButton3.setChecked(false);
                toggleButton4.setChecked(false);
                toggleButton5.setChecked(false);
                toggleButton6.setChecked(false);
                toggleButton7.setChecked(false);


                Toast toast = Toast.makeText(getContext(), "Ready to go again!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        preferences = getActivity().getSharedPreferences("checkedState", Context.MODE_PRIVATE);
        if (preferences.contains("tbpref")) {
            selected = preferences.getBoolean("tbpref", false);
            toggleButton.setChecked(selected);
        }
        if (preferences.contains("tb1pref")) {
            selected = preferences.getBoolean("tbpref", false);
            toggleButton1.setChecked(selected);
        }
        if (preferences.contains("tb2pref")) {
            selected = preferences.getBoolean("tbpref", false);
            toggleButton2.setChecked(selected);
        }
        if (preferences.contains("tb3pref")) {
            selected = preferences.getBoolean("tbpref", false);
            toggleButton3.setChecked(selected);
        }
        if (preferences.contains("tb4pref")) {
            selected = preferences.getBoolean("tbpref", false);
            toggleButton4.setChecked(selected);
        }
        if (preferences.contains("tb5pref")) {
            selected = preferences.getBoolean("tbpref", false);
            toggleButton5.setChecked(selected);
        }
        if (preferences.contains("tb6pref")) {
            selected = preferences.getBoolean("tbpref", false);
            toggleButton6.setChecked(selected);
        }
        if (preferences.contains("tb7pref")) {
            selected = preferences.getBoolean("tbpref", false);
            toggleButton7.setChecked(selected);
        }

        return rootView;
    }


    private void displayCalories(int calories) {

        calTotal.setText(String.valueOf(calories));

        }
}

