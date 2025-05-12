package com.tencent.mp.feature.base.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class MMSwitchBtn extends View {
    public String A;
    public String B;
    public c C;
    public b D;
    public float a;
    public float b;
    public long c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1363i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1364j;

    /* renamed from: k, reason: collision with root package name */
    public int f1365k;

    /* renamed from: l, reason: collision with root package name */
    public int f1366l;

    /* renamed from: m, reason: collision with root package name */
    public float f1367m;

    /* renamed from: n, reason: collision with root package name */
    public float f1368n;

    /* renamed from: o, reason: collision with root package name */
    public int f1369o;

    /* renamed from: p, reason: collision with root package name */
    public int f1370p;

    /* renamed from: q, reason: collision with root package name */
    public int f1371q;

    /* renamed from: r, reason: collision with root package name */
    public int f1372r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1373s;

    /* renamed from: t, reason: collision with root package name */
    public Paint f1374t;
    public RectF u;
    public RectF v;
    public int w;
    public int x;
    public int y;
    public int z;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface b {
        void a(boolean z);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class c extends Animation {
        public int a;
        public float b;
        public long c;
        public final /* synthetic */ MMSwitchBtn d;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public class a implements Animation.AnimationListener {
            public final /* synthetic */ c a;

            /* renamed from: com.tencent.mp.feature.base.ui.widget.MMSwitchBtn$c$a$a, reason: collision with other inner class name */
            /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
            public class RunnableC0049a implements Runnable {
                public final /* synthetic */ a a;

                public RunnableC0049a(a aVar) {
                }

                @Override // java.lang.Runnable
                public void run() {
                }
            }

            public a(c cVar, MMSwitchBtn mMSwitchBtn) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        }

        public /* synthetic */ c(MMSwitchBtn mMSwitchBtn, a aVar) {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
        }

        public c(MMSwitchBtn mMSwitchBtn) {
        }
    }

    public MMSwitchBtn(Context context, AttributeSet attributeSet) {
    }

    public static /* synthetic */ boolean a(MMSwitchBtn mMSwitchBtn) {
    }

    public static /* synthetic */ boolean b(MMSwitchBtn mMSwitchBtn, boolean z) {
    }

    public static /* synthetic */ b c(MMSwitchBtn mMSwitchBtn) {
    }

    public static /* synthetic */ boolean d(MMSwitchBtn mMSwitchBtn, boolean z) {
    }

    public static /* synthetic */ RectF e(MMSwitchBtn mMSwitchBtn) {
    }

    public static /* synthetic */ void f(MMSwitchBtn mMSwitchBtn) {
    }

    public final void g() {
    }

    public final void h(boolean z) {
    }

    public final void i(boolean z) {
    }

    public final void j() {
    }

    public final void k() {
    }

    public final boolean l(float f, float f2) {
    }

    public final void m(TypedArray typedArray) {
    }

    public final void n() {
    }

    public void o(boolean z) {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    public final void p(float f) {
    }

    public void setCheck(boolean z) {
    }

    public void setSwitchListener(b bVar) {
    }
}
