package com.example.android.miwok;

/**
 * {@link Word} this class translates Miwok words to english (or the default language
 * Created by jorge on 12/28/16.
 */

public class Word {

    //default string translation for the word
    private String mDefaultTranslation;

    //miwok translation for the word
    private String mMiwokTranslation;

    //constructor for miwok Word class (requires two parameters)
    public Word(String mDefaultTranslation, String mMiwokTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
    }

    /**
     * get method that returns miwok translation     *
     * @return mMiwokTranslation (miwok translation of miwok word)
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * get method that return the default translation of the word
     * @return mDefaultTranslation
     */
    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }


}
