package k.d.a.c.e0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class b {
    public static final TimeInterpolator F = null;
    public static final int[] G = null;
    public static final int[] H = null;
    public static final int[] I = null;
    public static final int[] J = null;
    public static final int[] K = null;
    public static final int[] L = null;
    public final Rect A;
    public final RectF B;
    public final RectF C;
    public final Matrix D;
    public ViewTreeObserver.OnPreDrawListener E;
    public k.d.a.c.l0.k a;
    public k.d.a.c.l0.g b;
    public Drawable c;
    public k.d.a.c.e0.a d;
    public Drawable e;
    public boolean f;
    public boolean g;
    public float h;

    /* renamed from: i, reason: collision with root package name */
    public float f5289i;

    /* renamed from: j, reason: collision with root package name */
    public float f5290j;

    /* renamed from: k, reason: collision with root package name */
    public int f5291k;

    /* renamed from: l, reason: collision with root package name */
    public final k.d.a.c.f0.g f5292l;

    /* renamed from: m, reason: collision with root package name */
    public k.d.a.c.m.h f5293m;

    /* renamed from: n, reason: collision with root package name */
    public k.d.a.c.m.h f5294n;

    /* renamed from: o, reason: collision with root package name */
    public Animator f5295o;

    /* renamed from: p, reason: collision with root package name */
    public k.d.a.c.m.h f5296p;

    /* renamed from: q, reason: collision with root package name */
    public k.d.a.c.m.h f5297q;

    /* renamed from: r, reason: collision with root package name */
    public float f5298r;

    /* renamed from: s, reason: collision with root package name */
    public float f5299s;

    /* renamed from: t, reason: collision with root package name */
    public int f5300t;
    public int u;
    public ArrayList<Animator.AnimatorListener> v;
    public ArrayList<Animator.AnimatorListener> w;
    public ArrayList<i> x;
    public final FloatingActionButton y;
    public final k.d.a.c.k0.b z;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a extends AnimatorListenerAdapter {
        public boolean a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ j c;
        public final /* synthetic */ b d;

        public a(b bVar, boolean z, j jVar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: k.d.a.c.e0.b$b, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class C0246b extends AnimatorListenerAdapter {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ j b;
        public final /* synthetic */ b c;

        public C0246b(b bVar, boolean z, j jVar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class c extends k.d.a.c.m.g {
        public final /* synthetic */ b d;

        public c(b bVar) {
        }

        @Override // k.d.a.c.m.g
        public Matrix a(float f, Matrix matrix, Matrix matrix2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class d implements TypeEvaluator<Float> {
        public FloatEvaluator a;

        public d(b bVar) {
        }

        public Float a(float f, Float f2, Float f3) {
        }

        @Override // android.animation.TypeEvaluator
        public /* bridge */ /* synthetic */ Float evaluate(float f, Float f2, Float f3) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class e implements ViewTreeObserver.OnPreDrawListener {
        public final /* synthetic */ b a;

        public e(b bVar) {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class f extends l {
        public f(b bVar) {
        }

        @Override // k.d.a.c.e0.b.l
        public float a() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class g extends l {
        public final /* synthetic */ b e;

        public g(b bVar) {
        }

        @Override // k.d.a.c.e0.b.l
        public float a() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class h extends l {
        public final /* synthetic */ b e;

        public h(b bVar) {
        }

        @Override // k.d.a.c.e0.b.l
        public float a() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface i {
        void a();

        void b();
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface j {
        void a();

        void b();
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class k extends l {
        public final /* synthetic */ b e;

        public k(b bVar) {
        }

        @Override // k.d.a.c.e0.b.l
        public float a() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public abstract class l extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        public boolean a;
        public float b;
        public float c;
        public final /* synthetic */ b d;

        public l(b bVar) {
        }

        public abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }

        public /* synthetic */ l(b bVar, a aVar) {
        }
    }

    public b(FloatingActionButton floatingActionButton, k.d.a.c.k0.b bVar) {
    }

    public static /* synthetic */ int a(b bVar, int i2) {
    }

    public static /* synthetic */ Animator b(b bVar, Animator animator) {
    }

    public static /* synthetic */ float c(b bVar, float f2) {
    }

    public void A() {
    }

    public void B() {
    }

    public void C(int[] iArr) {
    }

    public void D(float f2, float f3, float f4) {
    }

    public void E(Rect rect) {
    }

    public void F() {
    }

    public void G() {
    }

    public void H() {
    }

    public boolean I() {
    }

    public void J(ColorStateList colorStateList) {
    }

    public void K(PorterDuff.Mode mode) {
    }

    public final void L(float f2) {
    }

    public void M(boolean z) {
    }

    public final void N(k.d.a.c.m.h hVar) {
    }

    public final void O(float f2) {
    }

    public final void P(float f2) {
    }

    public final void Q(float f2) {
    }

    public void R(ColorStateList colorStateList) {
    }

    public void S(boolean z) {
    }

    public final void T(k.d.a.c.l0.k kVar) {
    }

    public final void U(k.d.a.c.m.h hVar) {
    }

    public boolean V() {
    }

    public final boolean W() {
    }

    public final boolean X() {
    }

    public void Y(j jVar, boolean z) {
    }

    public void Z() {
    }

    public final void a0() {
    }

    public final void b0() {
    }

    public void c0(float f2) {
    }

    public void d(Animator.AnimatorListener animatorListener) {
    }

    public final void d0(ObjectAnimator objectAnimator) {
    }

    public void e(Animator.AnimatorListener animatorListener) {
    }

    public void f(i iVar) {
    }

    public final void g(float f2, Matrix matrix) {
    }

    public final AnimatorSet h(k.d.a.c.m.h hVar, float f2, float f3, float f4) {
    }

    public final ValueAnimator i(l lVar) {
    }

    public final Drawable j() {
    }

    public final k.d.a.c.m.h k() {
    }

    public final k.d.a.c.m.h l() {
    }

    public float m() {
    }

    public boolean n() {
    }

    public final k.d.a.c.m.h o() {
    }

    public float p() {
    }

    public final ViewTreeObserver.OnPreDrawListener q() {
    }

    public void r(Rect rect) {
    }

    public float s() {
    }

    public final k.d.a.c.l0.k t() {
    }

    public final k.d.a.c.m.h u() {
    }

    public void v(j jVar, boolean z) {
    }

    public boolean w() {
    }

    public boolean x() {
    }

    public void y() {
    }

    public void z() {
    }
}
