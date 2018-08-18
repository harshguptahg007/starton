package com.example.saumyagupta.starton;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class finch extends AppCompatActivity {
    ProgressBar p1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finch);


        p1 = (ProgressBar)findViewById(R.id.put);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                p1.setVisibility(View.INVISIBLE);

            }
        }, 2000);
    }
    @Override
    public void onBackPressed() {
        Intent i = new Intent(finch.this, vision_main.class);
        startActivity(i);
        finish();
    }
}
