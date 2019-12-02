package com.example.utlislibrary;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;

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
}
