package com.example.saumyagupta.starton;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Pottery extends AppCompatActivity {


    ListView listView;
    String[] title;
    String[] discription;
    String[] Qty;

    public void onBackPressed() {
        Intent i = new Intent(Pottery.this, CustomerFront.class);
        startActivity(i);
        finish();
//        super.onBackPressed();
    }

    int[] img = {R.drawable.pots1, R.drawable.pots2, R.drawable.pots3, R.drawable.pots4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pottery);
        listView = (ListView) findViewById(R.id.kuchbhi);
        Resources res = getResources();
        title = res.getStringArray(R.array.Titlept);
        discription = res.getStringArray(R.array.discriptionpt);
        Qty = res.getStringArray(R.array.Quantity);
        FlipBox flipBox = new FlipBox(this, title, discription, Qty, img);
        listView.setAdapter(flipBox);

    }
}

class FlipBoxpot extends ArrayAdapter<String> {
    Context context;
    String[] title;
    String[] discription;
    String[] Qty;

    int[] img;

    public FlipBoxpot(Context context, String[] title, String[] discription, String[] Qty, int[] img) {
        super(context, R.layout.custom_pot, R.id.textView, title);
        this.context = context;
        this.title = title;
        this.Qty = Qty;
        this.discription = discription;
        this.img = img;

    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.custom_pot, parent, false);
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