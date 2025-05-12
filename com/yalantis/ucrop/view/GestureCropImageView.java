package com.yalantis.ucrop.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import k.j.a.d.h;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
public class GestureCropImageView extends k.j.a.e.b {
    public ScaleGestureDetector E;
    public h F;
    public GestureDetector G;
    public float H;
    public float I;
    public boolean J;
    public boolean K;
    public boolean L;
    public int M;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public class b extends GestureDetector.SimpleOnGestureListener {
        public final /* synthetic */ GestureCropImageView a;

        public b(GestureCropImageView gestureCropImageView) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        }

        public /* synthetic */ b(GestureCropImageView gestureCropImageView, a aVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public class c extends h.b {
        public final /* synthetic */ GestureCropImageView a;

        public c(GestureCropImageView gestureCropImageView) {
        }

        @Override // k.j.a.d.h.a
        public boolean a(h hVar) {
        }

        public /* synthetic */ c(GestureCropImageView gestureCropImageView, a aVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public class d extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public final /* synthetic */ GestureCropImageView a;

        public d(GestureCropImageView gestureCropImageView) {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        }

        public /* synthetic */ d(GestureCropImageView gestureCropImageView, a aVar) {
        }
    }

    public GestureCropImageView(Context context, AttributeSet attributeSet) {
    }

    public static /* synthetic */ float D(GestureCropImageView gestureCropImageView) {
    }

    public static /* synthetic */ float E(GestureCropImageView gestureCropImageView) {
    }

    public final void F() {
    }

    public int getDoubleTapScaleSteps() {
    }

    public float getDoubleTapTargetScale() {
    }

    @Override // k.j.a.e.e
    public void i() {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    public void setDoubleTapScaleSteps(int i2) {
    }

    public void setGestureEnabled(boolean z) {
    }

    public void setRotateEnabled(boolean z) {
    }

    public void setScaleEnabled(boolean z) {
    }

    public GestureCropImageView(Context context, AttributeSet attributeSet, int i2) {
    }
}
