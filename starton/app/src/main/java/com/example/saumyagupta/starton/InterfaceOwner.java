package com.example.saumyagupta.starton;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.TextView;
import android.widget.Toast;



public class InterfaceOwner extends AppCompatActivity {
    TextView tv ;
    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface_owner);

        mainGrid=(GridLayout)findViewById(R.id.mainGrid);
        setSingleEvent(mainGrid);

        tv = findViewById(R.id.textGrid);

        tv.setText(getIntent().getStringExtra("passer"));


    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(InterfaceOwner.this, MainActivity.class);
        startActivity(i);
    }

    private void setToggleEvent(final CardView cardView) {

            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(cardView.getCardBackgroundColor().getDefaultColor()==-1){
                        cardView.setCardBackgroundColor(Color.parseColor("#FF6F00"));
                        Toast.makeText(InterfaceOwner.this,"State :true",Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));

                        Toast.makeText(InterfaceOwner.this,"State :False",Toast.LENGTH_SHORT).show();
                    }
                }
            });

    }
    private void setSingleEvent(GridLayout mainGrid)
    {
        for(int i=0;i<mainGrid.getChildCount();i++)
        {
            final CardView cardView =(CardView)mainGrid.getChildAt(i);
            final int finall=i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(finall==0){
                        //setToggleEvent(cardView);
                        Intent j = new Intent(InterfaceOwner.this,CustomerOrder.class);
                        startActivity(j);
                    }
                    else if(finall==1){
                        Intent j = new Intent(InterfaceOwner.this,MyItems.class);
                        startActivity(j);
                    }

                    else if(finall==2) {
                        Intent j = new Intent(InterfaceOwner.this, UpdateItem.class);
                        startActivity(j);
                    }
                    else if(finall==3) {
                        Intent j = new Intent(InterfaceOwner.this, ProgressGraph.class);
                        startActivity(j);

                    }

                    else if(finall==4) {
                        Intent j = new Intent(InterfaceOwner.this, Limit.class);
                        startActivity(j);

                    }
                    else if(finall==5) {
                        Intent j = new Intent(InterfaceOwner.this, MyLog.class);
                        startActivity(j);
                    }
                    else if(finall==6) {
                        Intent j = new Intent(InterfaceOwner.this, Advertisement.class  );
                        startActivity(j);
                    }

                    else if(finall==7){
                        Intent j = new Intent(InterfaceOwner.this,Feedback.class);
                        startActivity(j);
                    }
                }
            });

        }
    }
}
