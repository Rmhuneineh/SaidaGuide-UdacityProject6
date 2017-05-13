package com.example.android.saidaguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MallsFragment extends Fragment {


    public MallsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.leMall), getString(R.string.leMallAdd), R.drawable.le_mall));
        places.add(new Place(getString(R.string.theSpot), getString(R.string.theSpotAdd), R.drawable.the_spot));

        PlaceRecyclerAdapter adapter = new PlaceRecyclerAdapter(getContext(), places, R.color.place_mall);

        final RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);




        return rootView;
    }

}
