package com.example.raghavendra.bawarchirestaurant;

/**
 * Created by raghavendra on 4/5/2017.
 */

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;



/**
 * {@link  FoodItem} represents a single Android platform release.
 * Each object has 3 properties: name, version number, and image resource ID.
 */
public class FoodItem {


    // Name of the Android version (e.g. Gingerbread, Honeycomb, Ice Cream Sandwich)
    private String mItemName;

    // Android version number (e.g. 2.3-2.7, 3.0-3.2.6, 4.0-4.0.4)
    private String mItemPrice;


    int quantity;

    /*
    * Create a new AndroidFlavor object.
    *
    * @param vName is the name of the Android version (e.g. Gingerbread)
    * @param vNumber is the corresponding Android version number (e.g. 2.3-2.7)
    * @param image is drawable reference ID that corresponds to the Android version
    * */
    public FoodItem(String vName, String vPrice) {
        mItemName = vName;
        mItemPrice = vPrice;

    }

    /**
     * Get the name of the Android version
     */
    public String getItemName() {
        return mItemName;
    }

    /**
     * Get the Android version number
     */
    public String getItemPrice() {
        return mItemPrice;
    }


 public int displayQuantity(int quantity) {
      return   quantity;

    }

    /**
     * This method is called when the plus button is clicked.
     */
    public void increment(View view) {
        if (quantity == 100) {
            return;
        }
        quantity = quantity + 1;
        displayQuantity(quantity);
    }

    /**
     * This method is called when the minus button is clicked.
     */
    public void decrement(View view) {
        if (quantity == 0) {
            return;
        }
        quantity = quantity - 1;
        displayQuantity(quantity);
    }


}


