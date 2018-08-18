package com.example.saumyagupta.starton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class Payment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.payment);

        Intent pay = getIntent();
        int image = pay.getIntExtra("Image",R.drawable.tshirt);
        String title = pay.getStringExtra("Title");
        String price = pay.getStringExtra("Price");
        String code = pay.getStringExtra("Code");

        Log.d("VIVZ",image+" " +title + " " + price + " " + code);

        ImageView imageV =  findViewById(R.id.sh);
        TextView t1 = findViewById(R.id.titlePayment);
        TextView t2 = findViewById(R.id.pricePayment);
        TextView t3 = findViewById(R.id.codePayment);

        imageV.setImageResource(image);
        t1.setText(title);
        t2.setText(price);
        t3.setText(code);
    }
}
