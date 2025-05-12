package com.tencent.mp.framework.ui.widget.refreshlayout;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class CustomSwipeRefreshLayout extends ViewGroup {
    public o A;
    public MotionEvent B;
    public int C;
    public boolean D;
    public int E;
    public int F;
    public float G;
    public float H;
    public float I;
    public final Animation.AnimationListener J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public int O;
    public final Animation.AnimationListener P;
    public boolean Q;
    public int R;
    public final Runnable S;
    public final Runnable T;
    public final Animation.AnimationListener U;
    public final Runnable V;
    public Animation W;
    public final DecelerateInterpolator a;
    public final AccelerateInterpolator b;
    public final Animation c;
    public boolean d;
    public boolean e;
    public int f;
    public s g;
    public final Runnable g0;
    public s h;
    public final Animation h0;

    /* renamed from: i, reason: collision with root package name */
    public p f1918i;
    public final Animation i0;

    /* renamed from: j, reason: collision with root package name */
    public r f1919j;
    public k.i.h.c.d.a.i.b j0;

    /* renamed from: k, reason: collision with root package name */
    public q f1920k;

    /* renamed from: l, reason: collision with root package name */
    public int f1921l;

    /* renamed from: m, reason: collision with root package name */
    public int f1922m;

    /* renamed from: n, reason: collision with root package name */
    public float f1923n;

    /* renamed from: o, reason: collision with root package name */
    public int f1924o;

    /* renamed from: p, reason: collision with root package name */
    public int f1925p;

    /* renamed from: q, reason: collision with root package name */
    public int f1926q;

    /* renamed from: r, reason: collision with root package name */
    public int f1927r;

    /* renamed from: s, reason: collision with root package name */
    public int f1928s;

    /* renamed from: t, reason: collision with root package name */
    public int f1929t;
    public k.i.h.c.d.a.i.a u;
    public View v;
    public boolean w;
    public View x;
    public int y;
    public n z;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class a extends Animation {
        public final /* synthetic */ CustomSwipeRefreshLayout a;

        public a(CustomSwipeRefreshLayout customSwipeRefreshLayout) {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class b extends Animation {
        public final /* synthetic */ CustomSwipeRefreshLayout a;

        public b(CustomSwipeRefreshLayout customSwipeRefreshLayout) {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class c extends Animation {
        public c(CustomSwipeRefreshLayout customSwipeRefreshLayout) {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class d extends l {
        public final /* synthetic */ CustomSwipeRefreshLayout a;

        public d(CustomSwipeRefreshLayout customSwipeRefreshLayout) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class e extends l {
        public final /* synthetic */ CustomSwipeRefreshLayout a;

        public e(CustomSwipeRefreshLayout customSwipeRefreshLayout) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class f implements Runnable {
        public final /* synthetic */ CustomSwipeRefreshLayout a;

        public f(CustomSwipeRefreshLayout customSwipeRefreshLayout) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class g implements Runnable {
        public final /* synthetic */ CustomSwipeRefreshLayout a;

        public g(CustomSwipeRefreshLayout customSwipeRefreshLayout) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class h extends l {
        public final /* synthetic */ CustomSwipeRefreshLayout a;

        public h(CustomSwipeRefreshLayout customSwipeRefreshLayout) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class i implements Runnable {
        public final /* synthetic */ CustomSwipeRefreshLayout a;

        public i(CustomSwipeRefreshLayout customSwipeRefreshLayout) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class j extends Animation {
        public final /* synthetic */ CustomSwipeRefreshLayout a;

        public j(CustomSwipeRefreshLayout customSwipeRefreshLayout) {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class k implements Runnable {
        public final /* synthetic */ CustomSwipeRefreshLayout a;

        public k(CustomSwipeRefreshLayout customSwipeRefreshLayout) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class l implements Animation.AnimationListener {
        public l(CustomSwipeRefreshLayout customSwipeRefreshLayout) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }

        public /* synthetic */ l(CustomSwipeRefreshLayout customSwipeRefreshLayout, c cVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface m {
        void a(s sVar, s sVar2);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface n {
        void a();
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface o {
        void a(s sVar, s sVar2);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface p {
        boolean a();
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface q {
        boolean a(View view, int i2);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface r {
        boolean a(View view);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class s {
        public int a;
        public float b;
        public int c;
        public int d;

        public s(int i2) {
        }

        public int a() {
        }

        public float b() {
        }

        public int c() {
        }

        public void d(int i2, int i3, int i4) {
        }

        public String toString() {
        }
    }

    public CustomSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
    }

    public static /* synthetic */ float a(CustomSwipeRefreshLayout customSwipeRefreshLayout) {
    }

    public static /* synthetic */ void b(CustomSwipeRefreshLayout customSwipeRefreshLayout, Animation.AnimationListener animationListener) {
    }

    public static /* synthetic */ float c(CustomSwipeRefreshLayout customSwipeRefreshLayout, float f2) {
    }

    public static /* synthetic */ float d(CustomSwipeRefreshLayout customSwipeRefreshLayout) {
    }

    public static /* synthetic */ float e(CustomSwipeRefreshLayout customSwipeRefreshLayout, float f2) {
    }

    public static /* synthetic */ k.i.h.c.d.a.i.a f(CustomSwipeRefreshLayout customSwipeRefreshLayout) {
    }

    public static /* synthetic */ int g(CustomSwipeRefreshLayout customSwipeRefreshLayout) {
    }

    private View getContentView() {
    }

    public static /* synthetic */ Animation h(CustomSwipeRefreshLayout customSwipeRefreshLayout) {
    }

    public static /* synthetic */ Animation.AnimationListener i(CustomSwipeRefreshLayout customSwipeRefreshLayout) {
    }

    public static /* synthetic */ DecelerateInterpolator j(CustomSwipeRefreshLayout customSwipeRefreshLayout) {
    }

    public static /* synthetic */ int k(CustomSwipeRefreshLayout customSwipeRefreshLayout) {
    }

    public static /* synthetic */ int l(CustomSwipeRefreshLayout customSwipeRefreshLayout) {
    }

    public static /* synthetic */ void m(CustomSwipeRefreshLayout customSwipeRefreshLayout, int i2, boolean z) {
    }

    public static /* synthetic */ int n(CustomSwipeRefreshLayout customSwipeRefreshLayout) {
    }

    public static /* synthetic */ boolean o(CustomSwipeRefreshLayout customSwipeRefreshLayout, boolean z) {
    }

    public static /* synthetic */ View p(CustomSwipeRefreshLayout customSwipeRefreshLayout) {
    }

    public static /* synthetic */ Animation.AnimationListener q(CustomSwipeRefreshLayout customSwipeRefreshLayout) {
    }

    public static /* synthetic */ void r(CustomSwipeRefreshLayout customSwipeRefreshLayout, int i2, Animation.AnimationListener animationListener) {
    }

    public static /* synthetic */ void s(CustomSwipeRefreshLayout customSwipeRefreshLayout, int i2, Animation.AnimationListener animationListener) {
    }

    private void setRefreshState(int i2) {
    }

    private void setTriggerPercentage(float f2) {
    }

    public static /* synthetic */ Runnable t(CustomSwipeRefreshLayout customSwipeRefreshLayout) {
    }

    public static /* synthetic */ boolean u(CustomSwipeRefreshLayout customSwipeRefreshLayout, boolean z) {
    }

    public static /* synthetic */ Animation.AnimationListener v(CustomSwipeRefreshLayout customSwipeRefreshLayout) {
    }

    public final boolean A(View view, MotionEvent motionEvent) {
    }

    public final boolean B(View view, MotionEvent motionEvent, int i2) {
    }

    public final boolean C(View view, MotionEvent motionEvent) {
    }

    public final boolean D() {
    }

    public void E(boolean z) {
    }

    public final void F() {
    }

    public boolean G() {
    }

    public boolean H() {
    }

    public void I() {
    }

    public void J(int i2, int i3, int i4, int i5) {
    }

    public final void K(int i2, boolean z) {
    }

    public void L() {
    }

    public final void M(int i2, boolean z) {
    }

    public final void N(boolean z) {
    }

    public final void O(boolean z) {
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    public int getProgressBarHeight() {
    }

    public int getRefreshCompleteTimeout() {
    }

    public int getRefreshMode() {
    }

    public float getResistanceFactor() {
    }

    public int getReturnToHeaderDuration() {
    }

    public int getReturnToOriginalTimeout() {
    }

    public int getReturnToTopDuration() {
    }

    public int getTriggerDistance() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
    }

    public void setCustomHeadview(View view) {
    }

    public void setEnableHorizontalScroll(boolean z) {
    }

    public void setKeepTopRefreshingHead(boolean z) {
    }

    public void setOnRefreshListener(n nVar) {
    }

    public void setOnStateChangeListener(o oVar) {
    }

    public void setProgressBarHeight(int i2) {
    }

    public void setRefreshCheckHandler(p pVar) {
    }

    public void setRefreshCompleteTimeout(int i2) {
    }

    public void setRefreshMode(int i2) {
    }

    public void setRefreshing(boolean z) {
    }

    public void setResistanceFactor(float f2) {
    }

    public void setReturnToHeaderDuration(int i2) {
    }

    public void setReturnToOriginalTimeout(int i2) {
    }

    public void setReturnToTopDuration(int i2) {
    }

    public void setScroolLeftOrRightHandler(q qVar) {
    }

    public void setScroolUpHandler(r rVar) {
    }

    public void setSwipeBarColor(int i2) {
    }

    public void setTriggerDistance(int i2) {
    }

    public final void w(int i2, Animation.AnimationListener animationListener) {
    }

    public final void x(int i2, Animation.AnimationListener animationListener) {
    }

    public final void y(Animation.AnimationListener animationListener) {
    }

    public final boolean z(View view, MotionEvent motionEvent, int i2) {
    }

    public CustomSwipeRefreshLayout(Context context, AttributeSet attributeSet, int i2) {
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
    }
}
