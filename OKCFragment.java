package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class OKCFragment extends Fragment {
    public OKCFragment (){
    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate
                ( R.layout.tour_guide,container,false);
        final ArrayList<TourGuide> tourGuide = new ArrayList<TourGuide> (  );
        tourGuide.add ( new TourGuide ( R.string.okc_city,R.string.okc_boomer_sooner,R.drawable.tail ) );
        tourGuide.add(new TourGuide( R.string.okc_thunder ,
                R.string.okc_basketball,R.drawable.thunder));
        tourGuide.add ( new TourGuide ( R.string.okc_garden, R.string.okc_myriad, R.drawable.myriad) );
        tourGuide.add ( new TourGuide ( R.string.okc_run,
                R.string.okc_marathon, R.drawable. marathon) );
        tourGuide.add ( new TourGuide ( R.string.okc_fair_grounds,
                R.string.okc_fair, R.drawable.statefair2 ) );
        ListView listView = rootView.findViewById ( R.id.list );
        TourGuideAdapter adapter = new TourGuideAdapter
                ( getActivity (), tourGuide );
        listView.setAdapter ( adapter );
        return rootView;
    }

}
