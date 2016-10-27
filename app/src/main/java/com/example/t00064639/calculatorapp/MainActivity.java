package com.example.t00064639.calculatorapp;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {


    Boolean add, substract, division, mod, multiply, clear, delete, posNeg;
    String zero = "0";
    private Toast g;
    DecimalFormat p4 = new DecimalFormat("0.0000");
    TextView result;
    TextView display;
    float a, b;
    float results;
    String output = "";

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
        findViewById(R.id.buttonMemRecal).setOnClickListener(click);
        ;
        findViewById(R.id.buttonMemAdd).setOnClickListener(click);
        ;
        findViewById(R.id.buttonMemSub).setOnClickListener(click);
        ;

        //TextView Definition
        result = (TextView) findViewById(R.id.textViewResult);
        display = (TextView) findViewById(R.id.textViewDisplay);


    }
    public void  operate(int what){
        switch(what){

            case 1:
               add = true;
                substract =
            case -1:
                add     = false;
                sub     = false;
                div     = false;
                squr    = false;
                mult    = false;
                num     = false;
                break;

    private View.OnClickListener click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            //Initialize Things
            Button pressBut = (Button) view;
            String calc =display.getText().toString();



                switch (pressBut.getId()) {

                    case R.id.button0:
                        calc+="0";
                        display.setText(calc);
                        break;

                    case R.id.button1:
                        calc+="1";
                        display.setText(calc);
                        break;

                    case R.id.button2:
                        calc+="2";
                        display.setText(calc);
                        break;

                    case R.id.button3:
                        calc+="3";
                        display.setText(calc);
                        break;

                    case R.id.button4:
                        calc+="4";
                        display.setText(calc);
                        break;

                    case R.id.button5:
                        calc+="5";
                        display.setText(calc);
                        break;

                    case R.id.button6:
                        calc+="6";
                        display.setText(calc);
                        break;

                    case R.id.button7:
                        calc+="7";
                        display.setText(calc);
                        break;

                    case R.id.button8:
                        calc+="8";
                        display.setText(calc);
                        break;

                    case R.id.button9:
                        calc+="9";
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