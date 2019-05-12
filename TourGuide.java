package com.example.android.tourguideapp;

public class TourGuide  {
    private int mDetails;
    private int mHeading;
    private int mImageResourceId;
    private static final  int N0_IMAGE_PROVIDED = -1;

    TourGuide(int Details, int Heading, int imageResourceId){
        mDetails = Details;
        mHeading = Heading;
        mImageResourceId = imageResourceId;
    }

    public int getDetails() {
        return mDetails;
    }

    public int getHeading() {
        return mHeading;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != N0_IMAGE_PROVIDED;
    }
}
