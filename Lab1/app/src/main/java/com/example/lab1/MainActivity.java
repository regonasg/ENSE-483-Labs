package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG  = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: Started");
        //For TextView
        TextView theTextView = (TextView) findViewById(R.id.textView1);
        theTextView.setText("Lab 1: Android Intro");

        String stringFromTextView = theTextView.getText().toString();

        Log.d(TAG, "onCreate: " + stringFromTextView);

        //For Buttons
        Button firstButton = (Button) findViewById(R.id.btnOne);
        Button secondButton = (Button) findViewById(R.id.btnTwo);
        Button thirdButton = (Button) findViewById(R.id.btnThree);
        Button fourthButton = (Button) findViewById(R.id.btnFour);

        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: clicked firstButton.");

                Intent intent = new Intent(MainActivity.this, FirstList.class);
                startActivity(intent);
            }
        });

        secondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: Clicked Button Two!");

                Intent intent = new Intent (MainActivity.this, PlacesList.class);
                startActivity(intent);
            }
        });

        //button that shows an image in a different screen when clicked
        thirdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: Clicked Button Three!");

                Intent intent = new Intent(MainActivity.this, ImageScreen.class);
                startActivity(intent);
            }
        });

        //button that shows a list of buttons that will show different lists
        fourthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: Clicked Button Four!");

                Intent intent = new Intent (MainActivity.this, MoreList.class);
                startActivity(intent);
            }
        });





    }

    /**
     * Prints out the message as a toast
     * @param message
     */
    private void toastMessage(String message){
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
    }
}

