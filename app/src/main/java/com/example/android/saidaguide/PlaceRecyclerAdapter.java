package com.example.android.saidaguide;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by rmhuneineh on 13/05/2017.
 */

public class PlaceRecyclerAdapter extends RecyclerView.Adapter<PlaceRecyclerAdapter.ViewHolder> {

    List<Place> mPlaces;
    private int mColorResourceId;

    public PlaceRecyclerAdapter(List<Place> places, int colorResourceId) {
        this.mPlaces = places;
        this.mColorResourceId = colorResourceId;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        protected TextView placeTextView;
        protected TextView addressTextView;
        protected ImageView imageView;
        protected View textContainer;

        public ViewHolder(View itemView) {
            super(itemView);
            placeTextView = (TextView) itemView.findViewById(R.id.saida_text_view);
            addressTextView = (TextView) itemView.findViewById(R.id.address_text_view);
            imageView = (ImageView) itemView.findViewById(R.id.image);
            textContainer = (View) itemView.findViewById(R.id.text_container);
        }
    }


    @Override
    public PlaceRecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View listItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);

        ViewHolder vh = new ViewHolder(listItem);
        return vh;
    }

    @Override
    public void onBindViewHolder(PlaceRecyclerAdapter.ViewHolder holder, int position) {
        Place currentPlace = mPlaces.get(position);

        holder.placeTextView.setText(currentPlace.getName());
        holder.addressTextView.setText(currentPlace.getAddress());
        holder.imageView.setImageResource(currentPlace.getImageID());
        holder.textContainer.setBackgroundColor(mColorResourceId);
    }

    @Override
    public int getItemCount() {
        return mPlaces.size();
    }
}
