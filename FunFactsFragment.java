package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class FunFactsFragment extends Fragment {
    public FunFactsFragment (){

    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate
                ( R.layout.tour_guide,container,false);
        final ArrayList<TourGuide> tourGuide = new ArrayList<TourGuide> (  );
        tourGuide.add(new TourGuide( R.string.funfacts_worlds_largest_totem_pole_address,
                R.string.funfacts_totem, R.drawable.okhill));
        tourGuide.add(new TourGuide (R.string.funfacts_manmade,
                R.string.funfacts_lakes ,R.drawable.lakes));
        tourGuide.add(new TourGuide (R.string.funfacts_alabaster,
              R.string.funfacts_caverns,
                R.drawable.alabaster));
        ListView listView = rootView.findViewById ( R.id.list );
        TourGuideAdapter adapter = new TourGuideAdapter
                ( getActivity (), tourGuide );
        listView.setAdapter ( adapter );
        return rootView;
    }
}
