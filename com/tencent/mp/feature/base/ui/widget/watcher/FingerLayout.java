package com.tencent.mp.feature.base.ui.widget.watcher;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import n.d0.d.h;
import n.d0.d.o;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class FingerLayout extends FrameLayout {
    public static final a h = null;

    /* renamed from: i, reason: collision with root package name */
    public static final float f1409i = 0.12f;

    /* renamed from: j, reason: collision with root package name */
    public static final float f1410j = 4.0f;
    public b a;
    public final n.d b;
    public final n.d c;
    public float d;
    public float e;
    public boolean f;
    public float g;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
        }

        public final float a() {
        }

        public final float b() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface b {
        void c(FingerLayout fingerLayout, float f);

        void l(FingerLayout fingerLayout, float f);

        boolean m(FingerLayout fingerLayout);

        void n(FingerLayout fingerLayout);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class c extends o implements n.d0.c.a<Float> {
        public final /* synthetic */ FingerLayout a;

        public c(FingerLayout fingerLayout) {
        }

        public final Float b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ Float invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class d extends o implements n.d0.c.a<Float> {
        public final /* synthetic */ Context a;

        public d(Context context) {
        }

        public final Float b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ Float invoke() {
        }
    }

    public FingerLayout(Context context, AttributeSet attributeSet) {
    }

    public FingerLayout(Context context, AttributeSet attributeSet, int i2) {
    }

    public static final /* synthetic */ float a() {
    }

    public static final /* synthetic */ float b() {
    }

    private final float getDismissEdge() {
    }

    private final float getScaledTouchSlop() {
    }

    private final void setSingleTouch(boolean z) {
    }

    public final void c(float f, float f2) {
    }

    public final void d(MotionEvent motionEvent) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
    }

    public final void e() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
    }

    public final void setDragListener(b bVar) {
    }

    public /* synthetic */ FingerLayout(Context context, AttributeSet attributeSet, int i2, int i3, h hVar) {
    }
}
