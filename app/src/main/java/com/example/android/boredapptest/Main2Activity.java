package com.example.android.boredapptest;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import com.google.android.gms.location.places.ui.PlacePicker;
import com.google.android.gms.maps.model.LatLngBounds;

import static com.example.android.boredapptest.R.id.button;
import static com.example.android.boredapptest.R.id.mexicanBox;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);

        final MediaPlayer song;
        CheckBox mexicanBox;

        mexicanBox = (CheckBox) findViewById(R.id.mexicanBox);
        song= MediaPlayer.create(this, R.raw.pop);
        song.setLooping(false);
        SharedPreferences prefs= PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        Boolean music=prefs.getBoolean("music", true);
        if(music == true)

            song.stop();

        mexicanBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //is yourCheckbox checked?
                if (((CheckBox) v).isChecked()) {
                    song.start();
                }
            }
        });

     //https://www.youtube.com/watch?v=6DxEALtxoJw


    }
}
