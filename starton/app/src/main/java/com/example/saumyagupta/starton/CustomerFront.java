package com.example.saumyagupta.starton;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.CardView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomerFront extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    GridLayout mainGrid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_front);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //getSupportActionBar().setTitle("Customer Front");

        mainGrid=(GridLayout)findViewById(R.id.mainGrid);
        setSingleEvent(mainGrid);
//
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });


        ImageView cameraIcon = findViewById(R.id.cameraIcon);
        cameraIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),vision_main.class);
                startActivity(intent);
            }
        });

        ImageView searchIcon = findViewById(R.id.searchIcon);
        final AutoCompleteTextView textView = findViewById(R.id.autoCompleteTextView);

        searchIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView appTitle = findViewById(R.id.appTitle);

                if (appTitle.getVisibility()==View.INVISIBLE){
                    appTitle.setVisibility(View.VISIBLE);
                    textView.setVisibility(View.INVISIBLE);
                } else {
                    appTitle.setVisibility(View.INVISIBLE);
                    textView.setVisibility(View.VISIBLE);
                }
            }
        });

            textView.setThreshold(0);
            Resources res = getResources();
            String []actv1 = res.getStringArray(R.array.actv);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, actv1);
        textView.setAdapter(adapter);



            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
            ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                    this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
            drawer.addDrawerListener(toggle);
            toggle.syncState();

            NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
            navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            Intent i = new Intent(CustomerFront.this, MainActivity.class);
            startActivity(i);
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_share) {

            Intent intent = new Intent(CustomerFront.this,Activity_Two.class);
            startActivity(intent);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void setSingleEvent(GridLayout mainGrid)
    {
        for(int i=0;i<mainGrid.getChildCount();i++)
        {
            CardView cardView =(CardView)mainGrid.getChildAt(i);
            final int finall=i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(finall==0){
                        Intent j = new Intent(CustomerFront.this,CClothes.class);
                        startActivity(j);
                        finish();
                    }
                    else if(finall==1){
                        Intent j = new Intent(CustomerFront.this,ArtAndCraft.class);
                        startActivity(j);
                    }

                    else if(finall==2) {
                        Intent j = new Intent(CustomerFront.this, Electronics.class);
                        startActivity(j);
                    }
                    else if(finall==3) {
                        Intent j = new Intent(CustomerFront.this, HomeDecor.class);
                        startActivity(j);
                    }

                    else if(finall==4) {
                        Intent j = new Intent(CustomerFront.this, Pottery.class);
                        startActivity(j);
                    }
                    else if(finall==5) {
                        Intent j = new Intent(CustomerFront.this, Shoes.class);
                        startActivity(j);
                    }
                }
            });

        }
    }


}