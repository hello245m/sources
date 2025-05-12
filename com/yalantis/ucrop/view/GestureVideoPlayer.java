package com.yalantis.ucrop.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import k.j.a.d.h;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
public class GestureVideoPlayer extends k.j.a.e.c {
    public ScaleGestureDetector F;
    public h G;
    public GestureDetector H;
    public float I;
    public float J;
    public int K;
    public boolean L;
    public boolean M;
    public boolean N;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public class b extends GestureDetector.SimpleOnGestureListener {
        public final /* synthetic */ GestureVideoPlayer a;

        public b(GestureVideoPlayer gestureVideoPlayer) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        }

        public /* synthetic */ b(GestureVideoPlayer gestureVideoPlayer, a aVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public class c extends h.b {
        public final /* synthetic */ GestureVideoPlayer a;

        public c(GestureVideoPlayer gestureVideoPlayer) {
        }

        @Override // k.j.a.d.h.a
        public boolean a(h hVar) {
        }

        public /* synthetic */ c(GestureVideoPlayer gestureVideoPlayer, a aVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public class d extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public final /* synthetic */ GestureVideoPlayer a;

        public d(GestureVideoPlayer gestureVideoPlayer) {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        }

        public /* synthetic */ d(GestureVideoPlayer gestureVideoPlayer, a aVar) {
        }
    }

    public GestureVideoPlayer(Context context, AttributeSet attributeSet) {
    }

    public static /* synthetic */ float J(GestureVideoPlayer gestureVideoPlayer) {
    }

    public static /* synthetic */ float K(GestureVideoPlayer gestureVideoPlayer) {
    }

    public final void L() {
    }

    public int getDoubleTapScaleSteps() {
    }

    public float getDoubleTapTargetScale() {
    }

    @Override // k.j.a.e.d, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    @Override // k.j.a.e.f
    public void p() {
    }

    public void setDoubleTapScaleSteps(int i2) {
    }

    public void setGestureEnabled(boolean z) {
    }

    public void setRotateEnabled(boolean z) {
    }

    public void setScaleEnabled(boolean z) {
    }
}
