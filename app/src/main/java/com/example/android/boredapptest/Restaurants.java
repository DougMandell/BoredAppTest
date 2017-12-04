package com.example.android.boredapptest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import static com.example.android.boredapptest.R.id.angry_btn;

/**
 * Created by jbourquein2872 on 10/24/2017.
 */

public class Restaurants extends AppCompatActivity {

    Button angry_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.restaurants);

        angry_btn = (Button)findViewById(R.id.angry_btn);
        angry_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(),Map.class);
                startActivity(i);
            }
        });

    }

}
