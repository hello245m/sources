package com.tencent.mp.feature.base.ui.toast;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.WeakHashMap;
import n.d0.d.h;
import n.d0.d.o;

@SuppressLint({"ViewConstructor"})
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class TopToast extends FrameLayout implements DefaultLifecycleObserver {

    /* renamed from: q, reason: collision with root package name */
    public static final a f1328q = null;

    /* renamed from: r, reason: collision with root package name */
    public static final WeakHashMap<Context, TopToast> f1329r = null;
    public final LifecycleOwner a;
    public final n.d b;
    public final n.d c;
    public final n.d d;
    public final WindowManager.LayoutParams e;
    public final WindowManager f;
    public final Runnable g;
    public final LinearLayout h;

    /* renamed from: i, reason: collision with root package name */
    public final ImageView f1330i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f1331j;

    /* renamed from: k, reason: collision with root package name */
    public final ImageView f1332k;

    /* renamed from: l, reason: collision with root package name */
    public ValueAnimator f1333l;

    /* renamed from: m, reason: collision with root package name */
    public ValueAnimator f1334m;

    /* renamed from: n, reason: collision with root package name */
    public ViewPropertyAnimator f1335n;

    /* renamed from: o, reason: collision with root package name */
    public float f1336o;

    /* renamed from: p, reason: collision with root package name */
    public float f1337p;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
        }

        public static /* synthetic */ void b(a aVar, Context context, LifecycleOwner lifecycleOwner, int i2, String str, boolean z, int i3, Object obj) {
        }

        public final void a(Context context, LifecycleOwner lifecycleOwner, int i2, String str, boolean z) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class b extends o implements n.d0.c.a<Integer> {
        public final /* synthetic */ Context a;

        public b(Context context) {
        }

        public final Integer b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ Integer invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class c implements Animator.AnimatorListener {
        public final /* synthetic */ ValueAnimator a;
        public final /* synthetic */ TopToast b;

        public c(ValueAnimator valueAnimator, TopToast topToast) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class d implements Animator.AnimatorListener {
        public final /* synthetic */ ValueAnimator a;
        public final /* synthetic */ TopToast b;

        public d(ValueAnimator valueAnimator, TopToast topToast) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class e implements Animator.AnimatorListener {
        public final /* synthetic */ ValueAnimator a;
        public final /* synthetic */ TopToast b;

        public e(ValueAnimator valueAnimator, TopToast topToast) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class f extends o implements n.d0.c.a<Integer> {
        public final /* synthetic */ Context a;

        public f(Context context) {
        }

        public final Integer b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ Integer invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class g extends o implements n.d0.c.a<Integer> {
        public final /* synthetic */ Context a;

        public g(Context context) {
        }

        public final Integer b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ Integer invoke() {
        }
    }

    public TopToast(Context context, LifecycleOwner lifecycleOwner) {
    }

    public static final /* synthetic */ Runnable a(TopToast topToast) {
    }

    public static final /* synthetic */ WeakHashMap b() {
    }

    public static final /* synthetic */ void c(TopToast topToast) {
    }

    public static final /* synthetic */ void d(TopToast topToast) {
    }

    public static final /* synthetic */ void e(TopToast topToast, int i2, String str, boolean z) {
    }

    public static final void g(TopToast topToast) {
    }

    private final int getActionBarHeight() {
    }

    private final int getStatusBarHeight() {
    }

    private final int getTouchSlop() {
    }

    public static final void i(TopToast topToast, ValueAnimator valueAnimator) {
    }

    public static final void k(TopToast topToast, ValueAnimator valueAnimator) {
    }

    public static final void m(TopToast topToast, ValueAnimator valueAnimator) {
    }

    public static /* synthetic */ void n(TopToast topToast, ValueAnimator valueAnimator) {
    }

    public static /* synthetic */ void o(TopToast topToast) {
    }

    public static /* synthetic */ void p(TopToast topToast) {
    }

    public static /* synthetic */ void q(TopToast topToast, View view) {
    }

    public static /* synthetic */ void r(TopToast topToast, ValueAnimator valueAnimator) {
    }

    public static /* synthetic */ void s(TopToast topToast, ValueAnimator valueAnimator) {
    }

    public static final void u(TopToast topToast) {
    }

    public static final void y(TopToast topToast, View view) {
    }

    public final void f() {
    }

    public final LifecycleOwner getOwner() {
    }

    public final void h() {
    }

    public final void j(int i2) {
    }

    public final void l(int i2) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public void onDestroy(LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    public final void t(long j2) {
    }

    public final void v() {
    }

    public final void w() {
    }

    public final void x(int i2, String str, boolean z) {
    }
}
