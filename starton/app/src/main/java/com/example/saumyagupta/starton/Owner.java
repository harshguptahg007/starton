package com.example.saumyagupta.starton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Owner extends AppCompatActivity {

    EditText editText;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_owner);
        b1 = (Button)findViewById(R.id.btn_signup);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String st = editText.getText().toString();
                Intent i = new Intent(Owner.this,InterfaceOwner.class);
                i.putExtra("passer",st);
                startActivity(i);
                finish();
            }
        });


        editText=findViewById(R.id.firmname);



    }
}
