package com.ntkduy1604.androidmultiscreenudacitymiwok;

/**
 * Created by NTKDUY on 2/26/2017
 * for PIGGY HOUSE
 * you can contact me at: ntkduy1604@gmail.com
 */

public class Word {
    // Default translation for the word
    private String mDefaultTranslation;
    // Miwok translation for the word
    private String mMiwokTranslation;

    public Word(String vDefaultTranslation, String vMiwokTranslation){
        mDefaultTranslation = vDefaultTranslation;
        mMiwokTranslation   = vMiwokTranslation;
    }

    // Get the default translation of the word
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    // Get the Miwok translation of the word
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
}
