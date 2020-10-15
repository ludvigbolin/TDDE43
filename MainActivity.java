package com.example.introduktion;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        /*Button button = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                updateOurUI();
                

            }
        });{

        }

         */
    }

    private void updateOurUI() {
        //TextView tw = findViewById(R.id.textView);
       // tw.setText("Button is clicked");

    }


}