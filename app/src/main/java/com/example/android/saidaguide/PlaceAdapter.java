package com.example.android.saidaguide;


import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by rmhuneineh on 24/02/2017.
 */

public class PlaceAdapter extends ArrayAdapter<Place> {

    private int mColorResourceId;

    public PlaceAdapter(Activity context, ArrayList<Place> places, int colorResourceId){
        super(context, 0, places);
        mColorResourceId = colorResourceId;
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Place currentPlace = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok text view
        TextView placeTextView = (TextView) listItemView.findViewById(R.id.saida_text_view);
        // Get the miwok text view from the current Word object and
        // set this text on the miwok TextView
        placeTextView.setText(currentPlace.getName());

        // Find the TextView in the list_item.xml layout with the ID default text view
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address_text_view);
        // Get the default text view from the current Word object and
        // set this text on the default TextView
        addressTextView.setText(currentPlace.getAddress());

        //Find the ImageView in the list_item.xml layout with the ID image view
        ImageView imageView = (ImageView) listItemView.findViewById((R.id.image));
        imageView.setImageResource(currentPlace.getImageID());
        imageView.setVisibility(View.VISIBLE);


        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
