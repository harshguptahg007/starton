package com.example.saumyagupta.starton;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class UpdateItem extends Activity {
    EditText editText,editText2;
    Button addButton,addButton2;
    ListView listView,listView2;
    ArrayList<String> listItems;
    ArrayList<String> listItems2;
    ArrayAdapter<String> adapter;
    ArrayAdapter<String> adapter2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_item);

        editText = findViewById(R.id.editText);
        editText2 = findViewById(R.id.ed2);
        addButton = (Button) findViewById(R.id.addItem);
        addButton2 = findViewById(R.id.aq);
        listView = (ListView) findViewById(R.id.listView);
        listView2 = findViewById(R.id.listView2);
        listItems = new ArrayList<String>();
        listItems2 = new ArrayList<String>();
        listItems.add("ITEMS");
        listItems2.add("QUANTITY");
        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, listItems);

        adapter2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, listItems2);

        listView.setAdapter(adapter);
        addButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                listItems.add(editText.getText().toString());
                adapter.notifyDataSetChanged();
            }
        });

        listView2.setAdapter(adapter2);
        addButton2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                listItems2.add(editText2.getText().toString());
                adapter2.notifyDataSetChanged();
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position,
                                    long id) {
                Toast.makeText(UpdateItem.this, "Clicked", Toast.LENGTH_LONG)
                        .show();
            }
        });
    }
}