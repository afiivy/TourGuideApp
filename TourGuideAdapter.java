package com.example.android.tourguideapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TourGuideAdapter extends ArrayAdapter<TourGuide> {
    TourGuideAdapter(Activity context, ArrayList<TourGuide> tourguide) {
        super ( context, 0, tourguide);
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from ( getContext () ).inflate (
                    R.layout.list_item, parent, false );
        }
        TourGuide currentTourGuide = getItem ( position );
        TextView detailsTextView = listItemView.findViewById ( R.id.details_text_view );
        assert currentTourGuide != null;
        detailsTextView.setText ( currentTourGuide.getDetails () );
        TextView headingTextView = listItemView.findViewById (R.id.heading_text_view );
        headingTextView.setText ( currentTourGuide.getHeading ());
        ImageView imageView = listItemView.findViewById(R.id.image);
        if(currentTourGuide.hasImage()){
            imageView.setImageResource(currentTourGuide.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }
        else {
            //Make sure image is gone and not just invisible.
            imageView.setVisibility(View.GONE);
        }
        return listItemView;
    }

}
