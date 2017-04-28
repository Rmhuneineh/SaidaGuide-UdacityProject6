package com.example.android.saidaguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SportsFragment extends Fragment {


    public SportsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("4B Sporting Club", "Nafaa Street", R.drawable.four));
        places.add(new Place("Streetball", "Ayye'a", R.drawable.streetball));
        places.add(new Place("Haytham Gym", "El Wastani", R.drawable.haytham_gym));
        places.add(new Place("Radical Fitness", "Spinneys", R.drawable.radical_fitness));
        places.add(new Place("Flex Fitness", "Eastern Boulevard - Nour Bldg", R.drawable.flex_fitness));
        places.add(new Place("Power Gym", "Majdelyoun Street", R.drawable.power_gym));




        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.place_sports);

        final ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);




        return rootView;
    }

}
