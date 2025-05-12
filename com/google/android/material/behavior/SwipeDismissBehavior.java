package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import j.g.t.r0.f;
import j.i.b.c;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public j.i.b.c a;
    public c b;
    public boolean c;
    public float d;
    public boolean e;
    public int f;
    public float g;
    public float h;

    /* renamed from: i, reason: collision with root package name */
    public float f428i;

    /* renamed from: j, reason: collision with root package name */
    public final c.AbstractC0153c f429j;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a extends c.AbstractC0153c {
        public int a;
        public int b;
        public final /* synthetic */ SwipeDismissBehavior c;

        public a(SwipeDismissBehavior swipeDismissBehavior) {
        }

        @Override // j.i.b.c.AbstractC0153c
        public int a(View view, int i2, int i3) {
        }

        @Override // j.i.b.c.AbstractC0153c
        public int b(View view, int i2, int i3) {
        }

        @Override // j.i.b.c.AbstractC0153c
        public int d(View view) {
        }

        @Override // j.i.b.c.AbstractC0153c
        public void i(View view, int i2) {
        }

        @Override // j.i.b.c.AbstractC0153c
        public void j(int i2) {
        }

        @Override // j.i.b.c.AbstractC0153c
        public void k(View view, int i2, int i3, int i4, int i5) {
        }

        @Override // j.i.b.c.AbstractC0153c
        public void l(View view, float f, float f2) {
        }

        @Override // j.i.b.c.AbstractC0153c
        public boolean m(View view, int i2) {
        }

        public final boolean n(View view, float f) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b implements f {
        public final /* synthetic */ SwipeDismissBehavior a;

        public b(SwipeDismissBehavior swipeDismissBehavior) {
        }

        @Override // j.g.t.r0.f
        public boolean a(View view, f.a aVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface c {
        void a(View view);

        void b(int i2);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class d implements Runnable {
        public final View a;
        public final boolean b;
        public final /* synthetic */ SwipeDismissBehavior c;

        public d(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public static float b(float f, float f2, float f3) {
    }

    public static int c(int i2, int i3, int i4) {
    }

    public static float e(float f, float f2, float f3) {
    }

    public boolean a(View view) {
    }

    public final void d(ViewGroup viewGroup) {
    }

    public void f(float f) {
    }

    public void g(float f) {
    }

    public void h(int i2) {
    }

    public final void i(View view) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i2) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
    }
}
