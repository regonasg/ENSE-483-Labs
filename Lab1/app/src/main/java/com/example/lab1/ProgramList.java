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

public class ProgramList extends Activity {
    private static final String TAG = "ProgramList";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.program_list_layout);

        ListView programList = (ListView) findViewById(R.id.programList);

        Log.d(TAG, "onClick: Started");

        ArrayList<String> program = new ArrayList<>();
        program.add("Software System Engineering");
        program.add("Electronic System Engineering");
        program.add("Environmental System Engineering");
        program.add("Industrial System Engineering");
        program.add("Petroleum System Engineering");

        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, program);
        programList.setAdapter(adapter);

        //Buttons
        Button nextBtn = (Button) findViewById(R.id.nextBtn);
        Button backBtn = (Button) findViewById(R.id.moreBtn);

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProgramList.this, TvList.class);
                startActivity(intent);
            }
        });

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent intent = new Intent (ProgramList.this, MoreList.class);
                startActivity(intent);
            }
        });


    }
}
