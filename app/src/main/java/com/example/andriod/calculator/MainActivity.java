package com.example.andriod.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.SubMenuBuilder;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button mul;
    private Button add;
    private Button sub;
    private Button div;
    private Button clear;
    private Button equals;
    private TextView result;
    private TextView info;
    private final char EQUAL = 0;
    private final char ADDITION = '+';
    private final char SUBTRACT = '-';
    private final char MULTIPLY = '*';
    private final char DIVIDE = '/';
    private double value1 = Double.NaN;
    private double value2;
    private char action;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpUIView();

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "0");


            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "1");


            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "2");


            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "3");


            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "4");


            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "5");


            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "6");


            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "7");


            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "8");


            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "9");


            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeOperation();
                action = ADDITION;
                result.setText(String.valueOf(value1) + "+");
                info.setText(null);

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeOperation();
                action = SUBTRACT;
                result.setText(String.valueOf(value1) + "-");
                info.setText(null);

            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeOperation();
                action = MULTIPLY;
                result.setText(String.valueOf(value1) + "*");
                info.setText(null);

            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeOperation();
                action = DIVIDE;
                result.setText(String.valueOf(value1) + "/");
                info.setText(null);

            }
        });

        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeOperation();
                action = EQUAL;
                result.setText(result.getText().toString() + String.valueOf(value2) + "=" + String.valueOf(value1));
                info.setText(null);
;            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if(info.getText().length() > 0)
                {
                    CharSequence name = info.getText().toString();
                    info.setText(name.subSequence(0, name.length()-1));
                }

                else
                {
                    value1 = Double.NaN;
                    value2 = Double.NaN;
                    info.setText(null);
                    result.setText(null);
                }
            }
        });
    }



    private void setUpUIView ()
    {
        zero = (Button)findViewById(R.id.button0);
        one = (Button)findViewById(R.id.button1);
        two = (Button)findViewById(R.id.button2);
        three = (Button)findViewById(R.id.button3);
        four = (Button)findViewById(R.id.button4);
        five = (Button)findViewById(R.id.button5);
        six = (Button)findViewById(R.id.button6);
        seven = (Button)findViewById(R.id.button7);
        eight = (Button)findViewById(R.id.button8);
        nine = (Button)findViewById(R.id.button9);
        mul = (Button)findViewById(R.id.buttonMultiply);
        add = (Button)findViewById(R.id.buttonPlus);
        sub = (Button)findViewById(R.id.buttonMinus);
        div = (Button)findViewById(R.id.buttonDiv);
        equals = (Button)findViewById(R.id.buttonEquals);
        clear = (Button)findViewById(R.id.buttonClear);
        result = (TextView) findViewById(R.id.result);
        info = (TextView) findViewById(R.id.Control);
    }

    private void computeOperation()
    {
        if(!Double.isNaN(value1))
        {
            value2 = Double.parseDouble(info.getText().toString());

            switch (action)
            {
                case ADDITION:
                    value1 = value1 + value2;
                    break;

                case SUBTRACT:
                    value1 = value1 - value2;
                    break;

                case MULTIPLY:
                    value1 = value1 * value2;
                    break;

                case DIVIDE:
                    value1 = value1 / value2;
                    break;

                case EQUAL:
                    break;
            }
        }

        else
        {
            value1 = (Double.parseDouble(info.getText().toString()));
        }
    }
}