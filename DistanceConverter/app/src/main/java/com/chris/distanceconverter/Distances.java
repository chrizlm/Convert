package com.chris.distanceconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class Distances extends AppCompatActivity {

    Button convertButton;
    TextInputEditText inchesInput;
    TextView displayCentimeters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distances);

        convertButton = findViewById(R.id.button);
        inchesInput = findViewById(R.id.inches);
        displayCentimeters = findViewById(R.id.centimeters);



        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float inches = Float.parseFloat(inchesInput.getText().toString().trim());
                float result = (float) (inches * 2.54);
                displayCentimeters.setText("RESULT: "+ result + "cm");
            }
        });

    }
}