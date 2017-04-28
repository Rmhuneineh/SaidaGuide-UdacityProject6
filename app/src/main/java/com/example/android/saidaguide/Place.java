package com.example.android.saidaguide;

/**
 * Created by rmhuneineh on 24/02/2017.
 */

public class Place {

    private String mName;

    private String mAddress;

    private int mImageResourceId;


    public Place(String name, String address, int imageResourceId) {
        mName = name;
        mAddress = address;
        mImageResourceId = imageResourceId;
    }

    public String getName(){ return mName; }

    public String getAddress(){ return mAddress; }

    public int getImageID(){ return mImageResourceId; }
}
