package com.example.raksha_ramya.creatingshapes;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Shapes extends AppCompatActivity {


    TextView txtCircle;
    Spinner spinner, spinnerColor;
    Button btnSubmit;
    String color = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shapes);
        spinner = (Spinner) findViewById(R.id.spinner);
        txtCircle = (TextView) findViewById(R.id.txtCircle);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        spinnerColor = (Spinner) findViewById(R.id.spinnerColor);


        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable background = txtCircle.getBackground();
                if (spinner.getSelectedItem().toString().equals("Circle")) {
                    txtCircle.setBackground(getResources().getDrawable(R.drawable.shapecircle));
                    if (spinnerColor.getSelectedItem().equals("RED")) {
                        txtCircle.setBackgroundColor(Color.RED);
                    } else if (spinnerColor.getSelectedItem().equals("YELLOW")) {
                        txtCircle.setBackgroundColor(Color.YELLOW);
                    } else {
                        txtCircle.setBackgroundColor(Color.GREEN);
                    }
                    //  ((ShapeDrawable)background).getPaint().setB(ContextCompat.getColor(mContext,R.color.colorToSet));
                } else if (spinner.getSelectedItem().toString().equals("Rectangle")) {
                    txtCircle.setBackground(getResources().getDrawable(R.drawable.rectangleshap));
                    if (spinnerColor.getSelectedItem().equals("RED")) {
                        txtCircle.setBackgroundColor(Color.RED);
                    } else if (spinnerColor.getSelectedItem().equals("YELLOW")) {
                        txtCircle.setBackgroundColor(Color.YELLOW);
                    } else {
                        txtCircle.setBackgroundColor(Color.GREEN);
                    }
                }
            }
        });
    }
}
