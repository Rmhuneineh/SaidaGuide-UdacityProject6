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
public class HistoricFragment extends Fragment {


    public HistoricFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.places_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place("Sea Castle", "Courniche El Baher", R.drawable.sea_castle));
        places.add(new Place("Saint Louis Caste", "Takkeyeddine El Solh Street", R.drawable.saint_louis));
        places.add(new Place("Khan El Franj", "Courniche El Baher", R.drawable.khan_franj));
        places.add(new Place("Soap Museum", "Moutran Street", R.drawable.soap_museum));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.place_historic);

        final ListView listView = (ListView) rootview.findViewById(R.id.list);
         listView.setAdapter(adapter);


        return rootview;
    }

}
