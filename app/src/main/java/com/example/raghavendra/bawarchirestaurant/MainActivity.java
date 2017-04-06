package com.example.raghavendra.bawarchirestaurant;


import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.raghavendra.bawarchirestaurant.R.id.cart_Plus_img;

/**
 * {@link MainActivity} shows a list of Android platform releases.
 * For each release, display the name, version number, and image.
 */
public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create an ArrayList of AndroidFlavor objects
        ArrayList<FoodItem> foodItems = new ArrayList<>();
        foodItems.add(new FoodItem("Chicken Briyani", "₹150"));
        foodItems.add(new FoodItem("Mutton Biryani", "₹150"));
        foodItems.add(new FoodItem("Fish Biyani ", "₹150"));
        foodItems.add(new FoodItem("Veg Biryani", "₹100"));
        foodItems.add(new FoodItem("Egg Curry", "₹150"));
        foodItems.add(new FoodItem("Chicken Curry", "₹120"));
        foodItems.add(new FoodItem("Mutton Curry", "₹140"));
        foodItems.add(new FoodItem("Fish Curry", "₹80"));


        // Create an {@link AndroidFlavorAdapter}, whose data source is a list of
        // {@link AndroidFlavor}s. The adapter knows how to create list item views for each item
        // in the list.
        FoodItemAdapter itemAdapter = new FoodItemAdapter(this, foodItems);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.listview_items);
        listView.setAdapter(itemAdapter);





    }







}
