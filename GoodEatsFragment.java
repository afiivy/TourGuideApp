package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class GoodEatsFragment extends Fragment {
    public GoodEatsFragment (){
    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate
                ( R.layout.tour_guide,container,false);
        final ArrayList<TourGuide> tourGuide = new ArrayList<TourGuide> (  );
        tourGuide.add(new TourGuide(R.string.goodeats_mall,
                R.string.goodeats_whiskey_cake,R.drawable.cake));
        tourGuide.add(new TourGuide(R.string.goodeats_address,
                R.string.goodeats_charleston,R.drawable.charleston));
        tourGuide.add(new TourGuide(R.string.goodeats_devon,
                R.string.goodeats_vast,R.drawable.vast));
        tourGuide.add(new TourGuide(R.string.goodeats_waffle_address,
                R.string.goodeats_waffle_champion,R.drawable.waffle));
        ListView listView = rootView.findViewById ( R.id.list );
        TourGuideAdapter adapter = new TourGuideAdapter
                ( getActivity (), tourGuide );
        listView.setAdapter ( adapter );
        return rootView;

    }

}

