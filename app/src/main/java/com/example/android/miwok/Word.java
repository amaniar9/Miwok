package com.example.android.miwok;



public class Word {


    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private int mImage;

    private int mAudio;





    public Word (String defaultTranslation, String miwokTranslation, int audioR){

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudio = audioR;


    }

    public Word (String defaultTranslation, String miwokTranslation, int resource, int audioR){

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImage = resource;
        mAudio = audioR;


    }

    public Word (String defaultTranslation, String miwokTranslation){

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;



    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getResourceId(){
        return mImage;
    }

    public int getAudioResourceId() { return mAudio; }

}
