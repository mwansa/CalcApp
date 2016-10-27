package com.example.t00064639.calculatorapp;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.util.function.DoublePredicate;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {


    Boolean add, substract, division, mod, multiply, clear, delete, posNeg;
    String zero = "0";
    private Toast g;
    Double answer;
    TextView result;
    String yellow;
    TextView display;
    Double output = 0.00;
    String calc ="";
    Double hello = null;
    String results ="";
    Boolean isOperator = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //all numbers 0-9
        findViewById(R.id.button0).setOnClickListener(click);
        findViewById(R.id.button1).setOnClickListener(click);
        findViewById(R.id.button2).setOnClickListener(click);
        ;
        findViewById(R.id.button3).setOnClickListener(click);
        ;
        findViewById(R.id.button4).setOnClickListener(click);
        ;
        findViewById(R.id.button5).setOnClickListener(click);
        ;
        findViewById(R.id.button6).setOnClickListener(click);
        ;
        findViewById(R.id.button7).setOnClickListener(click);
        ;
        findViewById(R.id.button8).setOnClickListener(click);
        ;
        findViewById(R.id.button9).setOnClickListener(click);
        ;


        //all operation
        findViewById(R.id.buttonAdd).setOnClickListener(click);
        ;
        findViewById(R.id.buttonSub).setOnClickListener(click);
        ;
        findViewById(R.id.buttonPosNeg).setOnClickListener(click);
        ;
        findViewById(R.id.buttonMultiply).setOnClickListener(click);
        ;
        findViewById(R.id.buttonDivision).setOnClickListener(click);
        ;
        findViewById(R.id.buttonDelete).setOnClickListener(click);
        ;
        findViewById(R.id.buttonClear).setOnClickListener(click);
        ;
        findViewById(R.id.buttonPoint).setOnClickListener(click);
        ;
        findViewById(R.id.buttonClear).setOnClickListener(click);
        ;
        findViewById(R.id.buttonMod).setOnClickListener(click);
        ;


        //TextView Definition
        result = (TextView) findViewById(R.id.textViewResult);
        display = (TextView) findViewById(R.id.textViewDisplay);
        calc =display.getText().toString();



    }

    private double operate(String a, String b, String op) {
        switch (op) {
            case "+":
                return Double.valueOf(a) + Double.valueOf(b);
            case "-":
                return Double.valueOf(a) - Double.valueOf(b);
            case "x":
                return Double.valueOf(a) * Double.valueOf(b);
            case "÷":
                try {
                    return Double.valueOf(a) / Double.valueOf(b);
                } catch (Exception e) {
                    Log.d("Calc", e.getMessage());
                }
            default:
                return hello;
        }
    }


        public void clickOperate(View view){

            }


        public void clickNegPos(View view){

        }



         public void clickEquals(View view){



         }




    private View.OnClickListener click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            //Initialize Things
            Button pressBut = (Button) view;





                switch (pressBut.getId()) {

                    case R.id.button0:
                        calc+="0";
                        results="0";
                        display.setText(calc);
                        break;

                    case R.id.button1:
                        calc+="1";
                        results="1";
                        display.setText(calc);
                        break;

                    case R.id.button2:
                        calc+="2";
                        results+="2";
                        display.setText(calc);
                        break;

                    case R.id.button3:
                        calc+="3";
                        results="3";
                        display.setText(calc);
                        break;

                    case R.id.button4:
                        calc+="4";
                        results="4";
                        display.setText(calc);
                        break;

                    case R.id.button5:
                        calc+="5";
                        results="5";
                        display.setText(calc);
                        break;

                    case R.id.button6:
                        calc+="6";
                        results="6";
                        display.setText(calc);
                        break;

                    case R.id.button7:
                        calc+="7";
                        results="7";
                        display.setText(calc);
                        break;

                    case R.id.button8:
                        calc+="8";
                        results="8";
                        display.setText(calc);
                        break;

                    case R.id.button9:
                        calc+="9";
                        results="9";
                        display.setText(calc);
                        break;

                    case R.id.buttonClear:
                        calc="";
                        result.setText("");
                        display.setText("");
                        break;

                    case R.id.buttonSub:
                        calc+="-";
                        display.setText(calc);
                         break;

                    case R.id.buttonMultiply:
                        calc+="x";
                        display.setText(calc);
                        break;

                    case R.id.buttonDivision:
                        calc+="/";
                        display.setText(calc);
                        break;

                    case R.id.buttonMod:
                        calc+="%";
                        display.setText(calc);
                        break;

                    case R.id.buttonAdd:
                        calc+="+";
                        display.setText(calc);

                        break;

                    case R.id.buttonPoint:
                        calc+=".";
                        display.setText(calc);
                        break;

            }
            display.setText(calc);

        }



    };
}