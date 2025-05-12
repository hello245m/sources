package com.tencent.xweb.extension.video;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class ClickableFrameLayout extends FrameLayout {
    public GestureDetector mGestureDetector;
    public View.OnClickListener mOnClickListener;

    public ClickableFrameLayout(Context context) {
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
    }

    public void setGestureDetector(GestureDetector gestureDetector) {
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
    }

    public ClickableFrameLayout(Context context, AttributeSet attributeSet) {
    }

    public ClickableFrameLayout(Context context, AttributeSet attributeSet, int i2) {
    }

    @TargetApi(21)
    public ClickableFrameLayout(Context context, AttributeSet attributeSet, int i2, int i3) {
    }
}
