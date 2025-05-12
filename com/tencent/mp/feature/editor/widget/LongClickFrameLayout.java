package com.tencent.mp.feature.editor.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import n.d0.c.l;
import n.d0.d.h;
import n.u;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class LongClickFrameLayout extends FrameLayout {
    public GestureDetector a;
    public n.d0.c.a<u> b;
    public l<? super MotionEvent, u> c;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a extends GestureDetector.SimpleOnGestureListener {
        public final /* synthetic */ LongClickFrameLayout a;

        public a(LongClickFrameLayout longClickFrameLayout) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
        }
    }

    public LongClickFrameLayout(Context context, AttributeSet attributeSet) {
    }

    public LongClickFrameLayout(Context context, AttributeSet attributeSet, int i2) {
    }

    public final n.d0.c.a<u> getOnClick() {
    }

    public final l<MotionEvent, u> getOnLongClick() {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    public final void setOnClick(n.d0.c.a<u> aVar) {
    }

    public final void setOnLongClick(l<? super MotionEvent, u> lVar) {
    }

    public /* synthetic */ LongClickFrameLayout(Context context, AttributeSet attributeSet, int i2, int i3, h hVar) {
    }
}
