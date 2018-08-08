package com.example.saumyagupta.starton;

import android.app.ActionBar;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.saumyagupta.starton.R;

public class MyItems extends AppCompatActivity {

    ListView listView;
    String[] title;
    String[] discription;
    String[] Qty;


    int[] img={R.drawable.candlestand, R.drawable.ceramicwork,R.drawable.lampfixture,R.drawable.roundbasket};

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_items);

        listView = (ListView) findViewById(R.id.kuchbhi);
        Resources res = getResources();
        title = res.getStringArray(R.array.Title);
        discription= res.getStringArray(R.array.discription);
        Qty= res.getStringArray(R.array.Quantity);
        FlipBox flipBox = new FlipBox(this,title,discription,Qty,img);
        listView.setAdapter(flipBox);

    }
}

class FlipBox extends ArrayAdapter<String>
{
    Context  context;
    String[] title;
    String[] discription;
    String[] Qty;

    int[] img;

    public FlipBox( Context context,String[] title,String[] discription,String[] Qty,int[] img) {
        super(context,R.layout.custom_my_item,R.id.textView,title );
        this.context =context;
        this.title=title;
        this.Qty=Qty;
        this.discription = discription;
        this.img = img;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row= inflater.inflate(R.layout.custom_my_item,parent,false);
        TextView textView = (TextView) row.findViewById(R.id.textView);
        TextView disco= (TextView) row.findViewById(R.id.textView4);
        TextView qunato= (TextView) row.findViewById(R.id.textView5);
        ImageView imageView = (ImageView) row.findViewById(R.id.imageView);

        textView.setText(title[position]);
        disco.setText(discription[position]);
        qunato.setText(Qty[position]);
        imageView.setImageResource(img[position]);

        return row;
    }
}
