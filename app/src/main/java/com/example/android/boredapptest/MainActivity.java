package com.example.android.boredapptest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openMovies(View view){
        Button moviesButton;
        moviesButton = (Button) findViewById(R.id.MoviesButton);

        moviesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, Movies.class);
                startActivity(myIntent);

            }
        });
    }


    /** Called when the user taps the Send button */
    public void openRestaurants(View view) {
        Log.d("restaurants", "restaurants was clicked");
        Intent intent = new Intent(this, Main2Activity.class);
        //EditText editText = (EditText) findViewById(R.id.editText);
        //String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }


}
