package com.example.android.miwok;

import android.content.Context;

/**
 * Created by Henrik on 14.05.2017.
 */

public class Word {
    private String MiWord;
    private String EnWord;


    public Word(String enTranslation, String miwokTranslation) {
        MiWord = miwokTranslation;
        EnWord = enTranslation;
    }


    public String getMiWord() {
        return MiWord;
    }

    public String getEnWord() {
        return EnWord;
    }

}