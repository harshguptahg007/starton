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

public class MyLog extends AppCompatActivity {

    ListView listView;
    String[] title;
    String[] discription;
    String[] Qty;




    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_log);
        listView = (ListView) findViewById(R.id.kuchb);
        Resources res = getResources();
        title = res.getStringArray(R.array.Title4);
        discription= res.getStringArray(R.array.discription4);
        Qty= res.getStringArray(R.array.Quantity4);

        FlipBox4 flipBox = new FlipBox4(this,title,discription,Qty);
        listView.setAdapter(flipBox);
    }
}

class FlipBox4 extends ArrayAdapter<String>
{
    Context  context;
    String[] title;
    String[] discription;
    String[] Qty;





    public FlipBox4( Context context,String[] title,String[] discription,String[] Qty) {
        super(context,R.layout.custom_my_log,R.id.textView,title );
        this.context =context;
        this.title=title;
        this.Qty=Qty;
        this.discription = discription;


    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row= inflater.inflate(R.layout.custom_my_log,parent,false);
        TextView textView = (TextView) row.findViewById(R.id.textView);
        TextView disco= (TextView) row.findViewById(R.id.textView4);
        TextView qunato= (TextView) row.findViewById(R.id.textView5);



        textView.setText(title[position]);
        disco.setText(discription[position]);
        qunato.setText(Qty[position]);



        return row;
    }
}










