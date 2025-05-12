package j.w;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class d extends x {
    public static final String[] M = null;
    public static final Property<Drawable, PointF> N = null;
    public static final Property<k, PointF> O = null;
    public static final Property<k, PointF> P = null;
    public static final Property<View, PointF> Q = null;
    public static final Property<View, PointF> R = null;
    public static final Property<View, PointF> S = null;
    public static v T;
    public int[] J;
    public boolean K;
    public boolean L;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ ViewGroup a;
        public final /* synthetic */ BitmapDrawable b;
        public final /* synthetic */ View c;
        public final /* synthetic */ float d;

        public a(d dVar, ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class b extends Property<Drawable, PointF> {
        public Rect a;

        public b(Class cls, String str) {
        }

        public PointF a(Drawable drawable) {
        }

        public void b(Drawable drawable, PointF pointF) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(Drawable drawable) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(Drawable drawable, PointF pointF) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class c extends Property<k, PointF> {
        public c(Class cls, String str) {
        }

        public PointF a(k kVar) {
        }

        public void b(k kVar, PointF pointF) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(k kVar) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(k kVar, PointF pointF) {
        }
    }

    /* renamed from: j.w.d$d, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class C0183d extends Property<k, PointF> {
        public C0183d(Class cls, String str) {
        }

        public PointF a(k kVar) {
        }

        public void b(k kVar, PointF pointF) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(k kVar) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(k kVar, PointF pointF) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class e extends Property<View, PointF> {
        public e(Class cls, String str) {
        }

        public PointF a(View view) {
        }

        public void b(View view, PointF pointF) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(View view) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(View view, PointF pointF) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class f extends Property<View, PointF> {
        public f(Class cls, String str) {
        }

        public PointF a(View view) {
        }

        public void b(View view, PointF pointF) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(View view) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(View view, PointF pointF) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class g extends Property<View, PointF> {
        public g(Class cls, String str) {
        }

        public PointF a(View view) {
        }

        public void b(View view, PointF pointF) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(View view) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(View view, PointF pointF) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class h extends AnimatorListenerAdapter {
        public final /* synthetic */ k a;
        private k mViewBounds;

        public h(d dVar, k kVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class i extends AnimatorListenerAdapter {
        public boolean a;
        public final /* synthetic */ View b;
        public final /* synthetic */ Rect c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;
        public final /* synthetic */ int f;
        public final /* synthetic */ int g;

        public i(d dVar, View view, Rect rect, int i2, int i3, int i4, int i5) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class j extends y {
        public boolean a;
        public final /* synthetic */ ViewGroup b;

        public j(d dVar, ViewGroup viewGroup) {
        }

        @Override // j.w.y, j.w.x.f
        public void b(x xVar) {
        }

        @Override // j.w.x.f
        public void c(x xVar) {
        }

        @Override // j.w.y, j.w.x.f
        public void d(x xVar) {
        }

        @Override // j.w.y, j.w.x.f
        public void e(x xVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class k {
        public int a;
        public int b;
        public int c;
        public int d;
        public View e;
        public int f;
        public int g;

        public k(View view) {
        }

        public void a(PointF pointF) {
        }

        public final void b() {
        }

        public void c(PointF pointF) {
        }
    }

    @Override // j.w.x
    public String[] G() {
    }

    public final void g0(d0 d0Var) {
    }

    @Override // j.w.x
    public void h(d0 d0Var) {
    }

    public final boolean h0(View view, View view2) {
    }

    @Override // j.w.x
    public void k(d0 d0Var) {
    }

    @Override // j.w.x
    public Animator p(ViewGroup viewGroup, d0 d0Var, d0 d0Var2) {
    }
}
