package edu.rosehulman.zhangh1.dogpedia.utils;

import android.content.Context;
import android.graphics.Typeface;

/**
 * Created by Samzsagit on 7/9/2016.
 * Font Awesome helper class.
 * Inspired by: http://code.tutsplus.com/tutorials/how-to-use-fontawesome-in-an-android-app--cms-24167
 */
public class FontManager {

    public static final String ROOT = "fonts/",
            FONTAWESOME = ROOT + "fontawesome-webfont.ttf";

    public static Typeface getTypeface(Context context, String font) {
        return Typeface.createFromAsset(context.getAssets(), font);
    }

}
