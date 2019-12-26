package com.example.utlislibrary;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.WindowManager;

public class ScreenUtils {

    /**
     * dp 转 px
     *
     * @param dp
     * @return
     */
    public static float dp2px(float dp) {
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp,
                Resources.getSystem().getDisplayMetrics());
    }

    /**
     * dp 转 px
     * 尺寸转换并不像获取本地图片、String定义等和软件相关的资源，需要上下文环境，所以可以简写成上面的代码：
     *
     * @param dp
     * @param context
     * @return
     */
    @Deprecated
    public static float dp2px(float dp, Context context) {
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp,
                context.getResources().getDisplayMetrics());
    }

    /**
     * 在 camera 旋转中，获取  camera 在Z轴的坐标点
     * 方法做了不同手机屏幕的适配，-6是一个经验值
     *
     * @return
     */
    public static float getZForCamera() {
        return -6 * Resources.getSystem().getDisplayMetrics().density;
    }

    /**
     * 获取屏幕信息
     *
     * @param context
     * @return
     */
    public static DisplayMetrics getScreenMetrics(Context context) {
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics dm = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(dm);
        return dm;
    }
}
