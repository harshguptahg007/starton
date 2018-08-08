package com.example.saumyagupta.starton;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class CustomerOrder extends AppCompatActivity {

    ListView listView;
    String[] title;
    String[] discription;
    String[] Qty;
    String[] address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_order);
        listView = (ListView) findViewById(R.id.kuch);
        Resources res = getResources();
        title = res.getStringArray(R.array.Title1);
        discription= res.getStringArray(R.array.discription1);
        Qty= res.getStringArray(R.array.Quantity1);
        address= res.getStringArray(R.array.Address);
        FlipBox1 flipBox = new FlipBox1(this,title,discription,Qty,address);
        listView.setAdapter(flipBox);
    }
}

class FlipBox1 extends ArrayAdapter<String>
{
    Context  context;
    String[] title;
    String[] discription;
    String[] Qty;
    String[] address;




    public FlipBox1( Context context,String[] title,String[] discription,String[] Qty,String[] address) {
        super(context,R.layout.custom_customer_order,R.id.textView,title );
        this.context =context;
        this.title=title;
        this.Qty=Qty;
        this.discription = discription;
        this.address = address;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row= inflater.inflate(R.layout.custom_customer_order,parent,false);
        TextView textView = (TextView) row.findViewById(R.id.textView);
        TextView disco= (TextView) row.findViewById(R.id.textView4);
        TextView qunato= (TextView) row.findViewById(R.id.textView5);
        TextView add= (TextView) row.findViewById(R.id.textView6);

        textView.setText(title[position]);
        disco.setText(discription[position]);
        qunato.setText(Qty[position]);
        add.setText(address[position]);

        return row;
    }
}










