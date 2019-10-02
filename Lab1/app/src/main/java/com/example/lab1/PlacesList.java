package com.example.lab1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class PlacesList extends Activity {
    private static final String TAG = "PlacesList";

    @Override
    protected void onCreate (Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.places_list_layout);

        ListView placesList = (ListView) findViewById(R.id.placesView);

        Log.d(TAG, "onCreate has started");

        //Title text
        TextView titleText = (TextView) findViewById(R.id.placesText);
        titleText.setText("List of Places");

        //Back Button
        Button backBtn = (Button) findViewById(R.id.btnBack);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View vew) {
                Log.d(TAG, "onClick: The back button was been clicked");

                Intent intent = new Intent (PlacesList.this, MainActivity.class);
                startActivity(intent);
            }

        });

        //Array list for the list of places
        ArrayList<String> places = new ArrayList<>();
        places.add("Regina");
        places.add("University of Regina");
        places.add("Saskatchewan");

        ArrayAdapter adapter1 = new ArrayAdapter(this,android.R.layout.simple_list_item_1,places);
        placesList.setAdapter(adapter1);





    }
}
