package com.example.saumyagupta.starton;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.saumyagupta.starton.R;

public class CClothes extends AppCompatActivity {

    ListView listView;
    String[] title;
    String[] discription;
    String[] Qty;

    @Override
    public void onBackPressed() {
        Intent i = new Intent(CClothes.this, CustomerFront.class);
        startActivity(i);
        finish();
//        super.onBackPressed();
    }

    int[] img={R.drawable.tshirt,R.drawable.shirt,R.drawable.jacket,R.drawable.hoody};

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cclothes);
        listView = (ListView) findViewById(R.id.kuchbhi);
        Resources res = getResources();
        title = res.getStringArray(R.array.Title5);
        discription= res.getStringArray(R.array.discription5);
        Qty= res.getStringArray(R.array.Quantity5);
        FlipBox5 flipBox = new FlipBox5(this,title,discription,Qty,img);
        listView.setAdapter(flipBox);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
}

class FlipBox5 extends ArrayAdapter<String>
{
    Context  context;
    String[] title;
    String[] discription;
    String[] Qty;

    int[] img;

    public FlipBox5( Context context,String[] title,String[] discription,String[] Qty,int[] img) {
        super(context,R.layout.custom_cclothes,R.id.textView,title );
        this.context =context;
        this.title=title;
        this.Qty=Qty;
        this.discription = discription;
        this.img = img;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.custom_cclothes, parent, false);
        TextView textView = (TextView) row.findViewById(R.id.textView);
        TextView disco = (TextView) row.findViewById(R.id.textView4);
        TextView qunato = (TextView) row.findViewById(R.id.textView5);
        ImageView imageView = (ImageView) row.findViewById(R.id.imageView);

        textView.setText(title[position]);
        disco.setText(discription[position]);
        qunato.setText(Qty[position]);
        imageView.setImageResource(img[position]);

        return row;



    }


}
