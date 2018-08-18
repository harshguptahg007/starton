package com.example.saumyagupta.starton;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Activity_Two extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__two);

        LinearLayout ll;
       // b1 = (Button)findViewById(R.id.pro);
       // b2 = (Button)findViewById(R.id.pro2);
        ll = findViewById(R.id.pro4);

        ll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent i=null,chooser=null;
                {
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse("geo:28.632595, 77.220129"));
                    Intent chooser=Intent.createChooser(i,"Launch Maps");
                    startActivity(chooser);

                    Toast.makeText(getApplicationContext(),"Opening MAPS",Toast.LENGTH_LONG).show();
                }
            }
        });

    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(Activity_Two.this, CustomerFront.class);
        startActivity(i);
    }


}
