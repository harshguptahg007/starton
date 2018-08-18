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

public class HomeDecor extends AppCompatActivity {



    ListView listView;
    String[] title;
    String[] discription;
    String[] Qty;

    public void onBackPressed() {
        Intent i = new Intent(HomeDecor.this, CustomerFront.class);
        startActivity(i);
        finish();
//        super.onBackPressed();
    }

    int[] img = {R.drawable.hd1, R.drawable.hd2, R.drawable.hd3, R.drawable.hd4};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_decor);


        listView = (ListView) findViewById(R.id.kuchbhi);
        Resources res = getResources();
        title = res.getStringArray(R.array.Titlehd);
        discription = res.getStringArray(R.array.discriptionhd);
        Qty = res.getStringArray(R.array.Quantity);
        FlipBox flipBox = new FlipBox(this, title, discription, Qty, img);
        listView.setAdapter(flipBox);
    }
}
class FlipBoxhd extends ArrayAdapter<String> {
    Context context;
    String[] title;
    String[] discription;
    String[] Qty;

    int[] img;

    public FlipBoxhd(Context context, String[] title, String[] discription, String[] Qty, int[] img) {
        super(context, R.layout.custom_decor, R.id.textView, title);
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
        View row = inflater.inflate(R.layout.custom_decor, parent, false);
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

