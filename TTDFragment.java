package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class TTDFragment extends Fragment {
    public TTDFragment (){

    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate
                ( R.layout.tour_guide,container,false);
        final ArrayList<TourGuide> tourGuide = new ArrayList<TourGuide> (  );
        tourGuide.add(new TourGuide(R.string.ttd_museum_address,
                R.string.ttd_cowboy_museum,R.drawable.western));
        tourGuide.add(new TourGuide(R.string.ttd_native,R.string.ttd_cultural_center,
                R.drawable.center));
        tourGuide.add(new TourGuide(R.string.ttd_food_truck,
                R.string.ttd_h8th,R.drawable.h8th));
        tourGuide.add(new TourGuide(R.string.ttd_mountains,
                R.string.ttd_refuge,
                R.drawable.wichita));
        ListView listView = rootView.findViewById ( R.id.list );
        TourGuideAdapter adapter = new TourGuideAdapter
                ( getActivity (), tourGuide );
        listView.setAdapter ( adapter );
        return rootView;
    }

}

