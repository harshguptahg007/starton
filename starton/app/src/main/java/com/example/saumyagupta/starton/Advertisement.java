package com.example.saumyagupta.starton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.saumyagupta.starton.R;

public class Advertisement extends AppCompatActivity {
    EditText et1;
    Button b1;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advertisement);
        et1=(EditText)findViewById(R.id.edit);
        b1=(Button)findViewById(R.id.btnStartProgress);
        tv=(TextView)findViewById(R.id.res);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s= et1.getText().toString();
                int a=Integer.parseInt(s);
                int sum=0;
                sum=a*25;
                tv.setText("₹"+sum);

            }
        });

    }

}


