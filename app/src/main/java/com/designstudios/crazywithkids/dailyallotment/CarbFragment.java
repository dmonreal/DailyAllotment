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
import android.widget.Toast;
import android.widget.ToggleButton;

import com.designstudios.crazywithkids.dailyallotment.R;

public class CarbFragment extends Fragment {

    ToggleButton toggleButton, toggleButton1, toggleButton2, toggleButton3, toggleButton4, toggleButton5, toggleButton6, toggleButton7;
    Button reset;
    boolean selected;
    SharedPreferences preferences;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ConstraintLayout rootView = (ConstraintLayout) inflater.inflate(R.layout.fragment_carb_count, container, false);


        toggleButton = rootView.findViewById(R.id.toggleButton);
        toggleButton1 = rootView.findViewById(R.id.toggleButton1);
        toggleButton2 = rootView.findViewById(R.id.toggleButton2);
        toggleButton3 = rootView.findViewById(R.id.toggleButton3);
        toggleButton4 = rootView.findViewById(R.id.toggleButton4);
        toggleButton5 = rootView.findViewById(R.id.toggleButton5);
        toggleButton6 = rootView.findViewById(R.id.toggleButton6);
        toggleButton7 = rootView.findViewById(R.id.toggleButton7);
        reset = rootView.findViewById(R.id.button);

        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                toggleButton.setBackgroundColor(Color.DKGRAY);
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

                toggleButton1.setBackgroundColor(Color.DKGRAY);
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
                toggleButton2.setBackgroundColor(Color.DKGRAY);
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
                toggleButton3.setBackgroundColor(Color.DKGRAY);
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
                toggleButton4.setBackgroundColor(Color.DKGRAY);
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

                toggleButton5.setBackgroundColor(Color.DKGRAY);
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
                toggleButton6.setBackgroundColor(Color.DKGRAY);
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
                toggleButton7.setBackgroundColor(Color.DKGRAY);
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

                SharedPreferences.Editor editor = preferences.edit();
                editor.clear();
                editor.apply();

                toggleButton.setChecked(false);
                toggleButton.setBackgroundColor(Color.rgb(255, 153, 153));
                toggleButton1.setChecked(false);
                toggleButton1.setBackgroundColor(Color.rgb(255, 219, 153));
                toggleButton2.setChecked(false);
                toggleButton2.setBackgroundColor(Color.rgb(255, 255, 153));
                toggleButton3.setChecked(false);
                toggleButton3.setBackgroundColor(Color.rgb(153, 255, 153));
                toggleButton4.setChecked(false);
                toggleButton4.setBackgroundColor(Color.rgb(153, 153, 255));
                toggleButton5.setChecked(false);
                toggleButton5.setBackgroundColor(Color.rgb(255, 153, 255));
                toggleButton6.setChecked(false);
                toggleButton6.setBackgroundColor(Color.rgb(255, 255, 255));
                toggleButton7.setChecked(false);
                toggleButton7.setBackgroundColor(Color.rgb(204, 204, 204));


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
}