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

    //no image constant
    private int NO_IMAGE_CONSTANT = -1;

    //miwok image
    private int mMiwokSourceImage = NO_IMAGE_CONSTANT;

    /**
     * constructor of Word object taking 2 parameters
     * @param mDefaultTranslation default string translation
     * @param  mMiwokTranslation translation for the word
     */
    public Word(String mDefaultTranslation, String mMiwokTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
    }

    /**
     * constructor of Word object taking 2 parameters
     * @param mDefaultTranslation default string translation
     * @param  mMiwokTranslation translation for the word
     * @param mMiwokSourceImage image source id
     */
    public Word(String mDefaultTranslation, String mMiwokTranslation, int mMiwokSourceImage) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mMiwokSourceImage = mMiwokSourceImage;
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

    /**
     * get method that return the image source id
     * @return mDefaultTranslation
     */
    public int getmMiwokSourceImage() { return mMiwokSourceImage; }

    /**
     * method to determine if Word object has an image associated with it
     * @return true or false
     * */
    public boolean hasImage() {
        return mMiwokSourceImage != NO_IMAGE_CONSTANT;
    }
}
