package com.softwarenerd.CalculatorApp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Button plus, minus, divide, multiply;
    TextView tvResultDisplay;
    EditText numberOne, numberTwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        divide = (Button) findViewById(R.id.divide);
        multiply = (Button) findViewById(R.id.multiply);

        numberOne = (EditText) findViewById(R.id.numberOne);
        numberTwo = (EditText) findViewById(R.id.numberTwo);

        tvResultDisplay = (TextView) findViewById(R.id.tvResultDisplay);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(numberOne.getText().toString().trim().length()>0 && numberTwo.getText().toString().trim().length()>0)
                    tvResultDisplay.setText("Answer is " + (Integer.parseInt(numberOne.getText().toString().trim()) +
                            Integer.parseInt(numberTwo.getText().toString().trim())));

            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(numberOne.getText().toString().trim().length()>0 && numberTwo.getText().toString().trim().length()>0)
                    tvResultDisplay.setText("Answer is " + (Integer.parseInt(numberOne.getText().toString().trim()) -
                            Integer.parseInt(numberTwo.getText().toString().trim())));

            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(numberOne.getText().toString().trim().length()>0 && numberTwo.getText().toString().trim().length()>0)
                    tvResultDisplay.setText("Answer is " + (Integer.parseInt(numberOne.getText().toString().trim()) *
                            Integer.parseInt(numberTwo.getText().toString().trim())));
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(numberOne.getText().toString().trim().length()>0 && numberTwo.getText().toString().trim().length()>0)
                    tvResultDisplay.setText("Answer is " + (Integer.parseInt(numberOne.getText().toString().trim()) /
                            Integer.parseInt(numberTwo.getText().toString().trim())));
            }
        });


    }
}