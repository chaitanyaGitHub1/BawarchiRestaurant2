package com.example.raghavendra.bawarchirestaurant;

/**
 * Created by raghavendra on 4/5/2017.
 */

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/*
* {@link AndroidFlavorAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
* based on a data source, which is a list of {@link AndroidFlavor} objects.
* */
public class FoodItemAdapter extends ArrayAdapter<FoodItem> {

    private int quantity = 0;

    private static final String LOG_TAG = FoodItemAdapter.class.getSimpleName();


    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context        The current context. Used to inflate the layout file.
     * @param androidFlavors A List of AndroidFlavor objects to display in a list
     */
    public FoodItemAdapter(Activity context, ArrayList<FoodItem> androidFlavors) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, androidFlavors);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        FoodItem currentFoodItem = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.item_name);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        nameTextView.setText(currentFoodItem.getItemName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView priceTextView = (TextView) listItemView.findViewById(R.id.item_price);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        priceTextView.setText(currentFoodItem.getItemPrice());


        TextView quantityTextView = (TextView) listItemView.findViewById(R.id.quantity_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        quantityTextView.setInputType(currentFoodItem.displayQuantity());


        ImageView img = (ImageView) listItemView.findViewById(R.id.cart_minus_img);
        img.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (quantity == 0) {
                    return;
                }
                quantity = quantity - 1;

            }
        });

        ImageView img2 = (ImageView) listItemView.findViewById(R.id.cart_minus_img);
        img2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (quantity == 100) {
                    return;
                }
                quantity = quantity + 1;

            }
        });


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

    public int displayQuantity() {

        return quantity;
    }


}



