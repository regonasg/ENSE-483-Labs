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

public class TvList extends Activity {
    private static final String TAG = "TvList";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tv_layout);

        ListView tvList = (ListView) findViewById(R.id.tvList);

        Log.d(TAG, "onClick: Started");

        ArrayList<String> tv = new ArrayList<>();
        tv.add("Friends");
        tv.add("Supernatural");
        tv.add("The 100");
        tv.add("How I Met Your Mother");
        tv.add("Grey's Anatomy");

        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,tv);
        tvList.setAdapter(adapter);

        //Buttons
        Button backBtn = (Button) findViewById(R.id.backBtnOne);
        Button nextList = (Button) findViewById(R.id.nextBtnOne);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TvList.this, MoreList.class);
                startActivity(intent);
            }
        });

        nextList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (TvList.this, MoviesList.class);
                startActivity(intent);
            }
        });


    }
}
