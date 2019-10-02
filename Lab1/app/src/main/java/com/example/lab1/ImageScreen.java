package com.example.lab1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ImageScreen extends AppCompatActivity {
    private static final String TAG  = "ImageScreen";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_screen_layout);

        Log.d(TAG, "onCreate: Starting.");
    //loading the image
        ImageView sampleImage = (ImageView) findViewById(R.id.imageView1);
        int imageResource = getResources().getIdentifier("@drawable/image", null, this.getPackageName());
        sampleImage.setImageResource(imageResource);

        //button to go back to main page
        Button mainButton = (Button) findViewById(R.id.btn_main);
        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: clicked btn_main.");

                Intent intent = new Intent(ImageScreen.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
