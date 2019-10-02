package com.example.lab1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MoreList extends Activity {
    private static final String TAG = "MoreList";

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.more_list_layout);

        //show the image
        ImageView image1 = (ImageView) findViewById(R.id.imageViewOne);
        int imageResource = getResources().getIdentifier("@drawable/list",null,this.getPackageName());
        image1.setImageResource(imageResource);

       ImageView image2 = (ImageView) findViewById(R.id.imageViewTwo);
       int imageResource1 = getResources().getIdentifier("@drawable/list1",null,this.getPackageName());
       image2.setImageResource(imageResource1);

       //Buttons
        Button programBtn = (Button) findViewById(R.id.programBtn);
        Button tvBtn = (Button) findViewById(R.id.tvBtn);
        Button moviesBtn = (Button) findViewById(R.id.moviesBtn);
        Button mainBtn = (Button) findViewById((R.id.mainBtn));

        programBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MoreList.this, ProgramList.class);
                startActivity(intent);
            }
        });

        tvBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (MoreList.this, TvList.class);
                startActivity(intent);
            }
        });

        mainBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent intent = new Intent(MoreList.this,MainActivity.class);
                startActivity(intent);
            }
        });

        moviesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent intent = new Intent (MoreList.this, MoviesList.class);
                startActivity(intent);
            }
        });






    }

}
