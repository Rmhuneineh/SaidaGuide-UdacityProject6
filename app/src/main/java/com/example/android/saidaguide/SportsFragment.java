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
public class SportsFragment extends Fragment {


    public SportsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.fourB), getString(R.string.fourBAdd), R.drawable.four));
        places.add(new Place(getString(R.string.streetball), getString(R.string.streetballAdd), R.drawable.streetball));
        places.add(new Place(getString(R.string.haythamGym), getString(R.string.haythamGymAdd), R.drawable.haytham_gym));
        places.add(new Place(getString(R.string.radical), getString(R.string.radicalAdd), R.drawable.radical_fitness));
        places.add(new Place(getString(R.string.flex), getString(R.string.flexAdd), R.drawable.flex_fitness));
        places.add(new Place(getString(R.string.power), getString(R.string.powerAdd), R.drawable.power_gym));


        PlaceRecyclerAdapter adapter = new PlaceRecyclerAdapter(getContext(), places, R.color.place_sports);

        final RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);




        return rootView;
    }

}
