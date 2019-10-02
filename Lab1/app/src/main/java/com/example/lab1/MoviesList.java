package com.example.lab1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MoviesList extends Activity {
    private static final String TAG = "MoviesList";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movies_list_layout);

        ListView movieList = (ListView) findViewById(R.id.moviesList);

        Log.d(TAG, "onClick: Started");

        ArrayList<String> movies = new ArrayList<>();
        movies.add("The Avengers");
        movies.add("IT Chapter 2");
        movies.add("Spiderman: Homecoming");
        movies.add("Avengers: End Game");
        movies.add("The Notebook");

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,movies);
        movieList.setAdapter(adapter);

        //Buttons
        Button backButton = (Button) findViewById(R.id.backBtnTwo);
        Button mainButton = (Button) findViewById(R.id.mainBtnOne);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent intent = new Intent(MoviesList.this, TvList.class);
                startActivity(intent);
            }
        });

        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (MoviesList.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }
}
