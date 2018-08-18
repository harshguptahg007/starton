package com.example.saumyagupta.starton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class bird_grid extends AppCompatActivity {

    ImageButton i1,i2,i3,i4,i5,i6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bird_grid);

        i1 = (ImageButton) findViewById(R.id.b1);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(bird_grid.this, humming.class);
                startActivity(i);
                finish();
            }
        });

        i2 = (ImageButton) findViewById(R.id.b2);
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(bird_grid.this, parrot.class);
                startActivity(i);
                finish();
            }
        });

        i3 = (ImageButton) findViewById(R.id.b3);
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(bird_grid.this, kingf.class);
                startActivity(i);
                finish();
            }
        });

        i4 = (ImageButton) findViewById(R.id.b4);
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(bird_grid.this, Processing.class);
                startActivity(i);
                finish();
            }
        });

        i5 = (ImageButton) findViewById(R.id.b5);
        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(bird_grid.this, hornbill.class);
                startActivity(i);
                finish();
            }
        });

        i6 = (ImageButton) findViewById(R.id.b6);
        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(bird_grid.this, finch.class);
                startActivity(i);
                finish();
            }
        });
    }
}
