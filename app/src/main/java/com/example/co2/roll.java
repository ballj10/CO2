package com.example.co2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class roll extends AppCompatActivity {

    EditText et_min, et, et_max;
    Button b_generate;
    TextView tv_output;

    Random r;
    int min, max, output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roll);

        r = new Random();

        //et_min = (EditText) findViewById(R.id.min);
        //et_max = (EditText) findViewById(R.id.et_max);
        b_generate = (Button) findViewById(R.id.generate);
        tv_output = (TextView) findViewById(R.id.testText);

        b_generate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View j) {

                // THE HECK IS WRONG
                String tempMin, tempMax;
                //tempMin = et_min.getText().toString();
                //tempMax = et_max.getText().toString();
                System.out.println(r.nextInt(20));
                tv_output.setText("" + (r.nextInt(20) + 1));

                /*
                String tempMin, tempMax;
                tempMin = et_min.getText().toString();
                tempMax = et_max.getText().toString();

                output = r.nextInt((max - min) + 1) + min;
                tv_output.setText("" + output);


                if(tempMin.equals("") && !tempMax.equals("")){

                    min = Integer.parseInt(tempMin);
                    max = Integer.parseInt(tempMax);
                    if(max > min) {
                        output = r.nextInt((max - min) + 1) + min;
                        tv_output.setText("" + output);
                    }

                }

                */

            }
        });
    }
}
