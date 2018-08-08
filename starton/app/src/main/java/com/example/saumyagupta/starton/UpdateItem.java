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
    EditText editText;
    Button addButton;
    ListView listView;
    ArrayList<String> listItems;
    ArrayAdapter<String> adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_item);

        editText = (EditText) findViewById(R.id.editText);
        addButton = (Button) findViewById(R.id.addItem);
        listView = (ListView) findViewById(R.id.listView);
        listItems = new ArrayList<String>();
        listItems.add("First Item - added on Activity Create");
        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, listItems);
        listView.setAdapter(adapter);
        addButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                listItems.add(editText.getText().toString());
                adapter.notifyDataSetChanged();
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