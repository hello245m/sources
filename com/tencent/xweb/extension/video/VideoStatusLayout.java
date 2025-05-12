package com.tencent.xweb.extension.video;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class VideoStatusLayout extends RelativeLayout {
    public static final String TAG = "VideoStatusLayout";
    public int duration;
    public HideRunnable mHideRunnable;
    public ImageView mImage;
    public VideoDotPercentIndicator mIndicator;
    public LinearLayout mLayoutStatus;
    public TextView mTvProgress;
    public TextView mTvStatus;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class HideRunnable implements Runnable {
        public final /* synthetic */ VideoStatusLayout this$0;

        public HideRunnable(VideoStatusLayout videoStatusLayout) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        public /* synthetic */ HideRunnable(VideoStatusLayout videoStatusLayout, AnonymousClass1 anonymousClass1) {
        }
    }

    public VideoStatusLayout(Context context) {
    }

    private void init(Context context) {
    }

    public void setBrightProgress(int i2) {
    }

    public void setDuration(int i2) {
    }

    public void setVideoTimeProgress(String str) {
    }

    public void setVolumeProgress(int i2) {
    }

    public void show() {
    }

    public VideoStatusLayout(Context context, AttributeSet attributeSet) {
    }
}
