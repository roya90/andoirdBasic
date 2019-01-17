package com.example.android.miwok;

import android.graphics.drawable.Drawable;

/**
 *
 *
 */

public class Word {


    private String mDefaultTranslation;
    private String mMiwoktTranslation;
    private int mImageResourceId=NO_IMAGE_PROVIDED;
    final private static int NO_IMAGE_PROVIDED=-1;



    public Word(String defaultTranslation,String miwoktTranslation){

        mDefaultTranslation=defaultTranslation;
        mMiwoktTranslation=miwoktTranslation;


    }

    public Word(String defaultTranslation,String miwoktTranslation, int imageResourceId){

        mDefaultTranslation=defaultTranslation;
        mMiwoktTranslation=miwoktTranslation;
        mImageResourceId=imageResourceId;


    }

    /**
     * Get the default translation of the word.
     */
    public String getmDefaultTranslation(){
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     * @return
     */
    public String getmMiwoktTranslation(){
        return mMiwoktTranslation;
    }

    public int getmImage(){return mImageResourceId;}

    public boolean hasImage(){return mImageResourceId!=NO_IMAGE_PROVIDED;}
}
