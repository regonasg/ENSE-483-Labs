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

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FirstList extends Activity {
    private static final String TAG  = "FirstList";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_list_layout);
        ListView list = (ListView) findViewById(R.id.list_view);

        Log.d(TAG, "OnCreate: Started");

        //Title Text
        TextView titleText = (TextView) findViewById(R.id.textView1);
        titleText.setText("List of Fruits");

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,fruits);
        list.setAdapter(adapter);

        //back button
        Button mainButton = (Button) findViewById(R.id.btnMain);
        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: clicked btn_main.");

                Intent intent = new Intent(FirstList.this, MainActivity.class);
                startActivity(intent);
            }
        });



    }
}
