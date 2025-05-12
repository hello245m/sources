package com.tencent.mp.feature.editor.widget.makeimage;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import k.i.h.b.k.s.a0.e;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class GestureImageView extends e {
    public GestureDetector A;
    public float B;
    public float C;
    public boolean D;
    public boolean E;
    public int F;
    public boolean G;
    public ScaleGestureDetector z;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class b extends GestureDetector.SimpleOnGestureListener {
        public final /* synthetic */ GestureImageView a;

        public b(GestureImageView gestureImageView) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        }

        public /* synthetic */ b(GestureImageView gestureImageView, a aVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class c extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public final /* synthetic */ GestureImageView a;

        public c(GestureImageView gestureImageView) {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        }

        public /* synthetic */ c(GestureImageView gestureImageView, a aVar) {
        }
    }

    public GestureImageView(Context context) {
    }

    public static /* synthetic */ float A(GestureImageView gestureImageView) {
    }

    public static /* synthetic */ boolean B(GestureImageView gestureImageView, RectF rectF) {
    }

    public static /* synthetic */ boolean y(GestureImageView gestureImageView) {
    }

    public static /* synthetic */ float z(GestureImageView gestureImageView) {
    }

    public final boolean C(RectF rectF) {
    }

    public final void D() {
    }

    @Override // k.i.h.b.k.s.a0.f
    public void g() {
    }

    public int getDoubleTapScaleSteps() {
    }

    public float getDoubleTapTargetScale() {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    public void setDoubleTapScaleSteps(int i2) {
    }

    public void setGestureEnabled(boolean z) {
    }

    public void setInTouchEditMode(boolean z) {
    }

    public void setScaleEnabled(boolean z) {
    }

    public GestureImageView(Context context, AttributeSet attributeSet) {
    }

    public GestureImageView(Context context, AttributeSet attributeSet, int i2) {
    }
}
