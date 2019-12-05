package com.example.utlislibrary;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

public class DrawableUtils {

    /**
     * 将Bitmap包装成一个Drawable
     *
     * @param bitmap
     * @param context
     * @return
     */
    public static Drawable bitmapToDrawable(Bitmap bitmap, Context context) {
        BitmapDrawable drawbale = new BitmapDrawable(context.getResources(), bitmap);
        return drawbale;
    }
}
