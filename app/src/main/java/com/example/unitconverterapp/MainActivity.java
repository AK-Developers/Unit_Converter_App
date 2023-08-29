package com.example.unitconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText inputInKg;
TextView inPounds;
Button convert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputInKg = findViewById(R.id.editText);
        inPounds = findViewById(R.id.textView2);
        convert = findViewById(R.id.button);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inKilos = inputInKg.getText().toString();
                double inputKg = Double.parseDouble(inKilos);

                inPounds.setText(""+convertToPound(inputKg)+" lb");
            }
        });
    }

    public double convertToPound(double valueInKg){
        return valueInKg*2.20462;
    }
}