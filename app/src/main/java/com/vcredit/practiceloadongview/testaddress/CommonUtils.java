package com.vcredit.practiceloadongview.testaddress;

import android.content.Context;
import android.os.Handler;
import android.widget.Button;

/**
 * Created by wangzhengji on 2016/1/26.
 */
public class CommonUtils {
    // 自定义log参数
    private static final String LOG_TAG        = "GFB";
    private static final int    LOG_SIZE_LIMIT = 3500;

    // 定时器参数
    private static Button mBtn;
    private static int    mTime;
    private static Handler handler   = new Handler();
    private static boolean isSending = false;
    private static boolean mallowgetCode;
    private static boolean mispress;


    public static int Dp2Px(Context context, float dp) {
        return (int) (dp * context.getResources().getDisplayMetrics().density + 0.5f);
    }

    /**
     * px转dp
     *
     * @param px
     * @return
     */
    public static int Px2Dp(Context context, float px) {
        return (int) (px / context.getResources().getDisplayMetrics().density + 0.5f);
    }

  }
