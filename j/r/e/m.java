package j.r.e;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class m extends RecyclerView.o implements RecyclerView.r {
    public g A;
    public final RecyclerView.t B;
    public Rect C;
    public long D;
    public final List<View> a;
    public final float[] b;
    public RecyclerView.e0 c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;

    /* renamed from: i, reason: collision with root package name */
    public float f3474i;

    /* renamed from: j, reason: collision with root package name */
    public float f3475j;

    /* renamed from: k, reason: collision with root package name */
    public float f3476k;

    /* renamed from: l, reason: collision with root package name */
    public int f3477l;

    /* renamed from: m, reason: collision with root package name */
    public f f3478m;

    /* renamed from: n, reason: collision with root package name */
    public int f3479n;

    /* renamed from: o, reason: collision with root package name */
    public int f3480o;

    /* renamed from: p, reason: collision with root package name */
    public List<h> f3481p;

    /* renamed from: q, reason: collision with root package name */
    public int f3482q;

    /* renamed from: r, reason: collision with root package name */
    public RecyclerView f3483r;

    /* renamed from: s, reason: collision with root package name */
    public final Runnable f3484s;

    /* renamed from: t, reason: collision with root package name */
    public VelocityTracker f3485t;
    public List<RecyclerView.e0> u;
    public List<Integer> v;
    public RecyclerView.k w;
    public View x;
    public int y;
    public j.g.t.k z;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements Runnable {
        public final /* synthetic */ m a;

        public a(m mVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b implements RecyclerView.t {
        public final /* synthetic */ m a;

        public b(m mVar) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void e(boolean z) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class c extends h {

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f3486n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.e0 f3487o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ m f3488p;

        public c(m mVar, RecyclerView.e0 e0Var, int i2, int i3, float f, float f2, float f3, float f4, int i4, RecyclerView.e0 e0Var2) {
        }

        @Override // j.r.e.m.h, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class d implements Runnable {
        public final /* synthetic */ h a;
        public final /* synthetic */ int b;
        public final /* synthetic */ m c;

        public d(m mVar, h hVar, int i2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class e implements RecyclerView.k {
        public final /* synthetic */ m a;

        public e(m mVar) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.k
        public int a(int i2, int i3) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class f {
        public static final Interpolator b = null;
        public static final Interpolator c = null;
        public int a;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class b implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
            }
        }

        public static int e(int i2, int i3) {
        }

        public static int s(int i2, int i3) {
        }

        public static int t(int i2, int i3) {
        }

        public void A(RecyclerView.e0 e0Var, int i2) {
        }

        public abstract void B(RecyclerView.e0 e0Var, int i2);

        public boolean a(RecyclerView recyclerView, RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2) {
        }

        public RecyclerView.e0 b(RecyclerView.e0 e0Var, List<RecyclerView.e0> list, int i2, int i3) {
        }

        public void c(RecyclerView recyclerView, RecyclerView.e0 e0Var) {
        }

        public int d(int i2, int i3) {
        }

        public final int f(RecyclerView recyclerView, RecyclerView.e0 e0Var) {
        }

        public long g(RecyclerView recyclerView, int i2, float f, float f2) {
        }

        public int h() {
        }

        public final int i(RecyclerView recyclerView) {
        }

        public float j(RecyclerView.e0 e0Var) {
        }

        public abstract int k(RecyclerView recyclerView, RecyclerView.e0 e0Var);

        public float l(float f) {
        }

        public float m(RecyclerView.e0 e0Var) {
        }

        public float n(float f) {
        }

        public boolean o(RecyclerView recyclerView, RecyclerView.e0 e0Var) {
        }

        public int p(RecyclerView recyclerView, int i2, int i3, int i4, long j2) {
        }

        public boolean q() {
        }

        public boolean r() {
        }

        public void u(Canvas canvas, RecyclerView recyclerView, RecyclerView.e0 e0Var, float f, float f2, int i2, boolean z) {
        }

        public void v(Canvas canvas, RecyclerView recyclerView, RecyclerView.e0 e0Var, float f, float f2, int i2, boolean z) {
        }

        public void w(Canvas canvas, RecyclerView recyclerView, RecyclerView.e0 e0Var, List<h> list, int i2, float f, float f2) {
        }

        public void x(Canvas canvas, RecyclerView recyclerView, RecyclerView.e0 e0Var, List<h> list, int i2, float f, float f2) {
        }

        public abstract boolean y(RecyclerView recyclerView, RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2);

        public void z(RecyclerView recyclerView, RecyclerView.e0 e0Var, int i2, RecyclerView.e0 e0Var2, int i3, int i4, int i5) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class g extends GestureDetector.SimpleOnGestureListener {
        public boolean a;
        public final /* synthetic */ m b;

        public g(m mVar) {
        }

        public void a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class h implements Animator.AnimatorListener {
        public final float a;
        public final float b;
        public final float c;
        public final float d;
        public final RecyclerView.e0 e;
        public final int f;
        public final ValueAnimator g;
        public boolean h;

        /* renamed from: i, reason: collision with root package name */
        public float f3489i;

        /* renamed from: j, reason: collision with root package name */
        public float f3490j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f3491k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f3492l;

        /* renamed from: m, reason: collision with root package name */
        public float f3493m;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            public final /* synthetic */ h a;

            public a(h hVar) {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
            }
        }

        public h(RecyclerView.e0 e0Var, int i2, int i3, float f, float f2, float f3, float f4) {
        }

        public void a() {
        }

        public void b(long j2) {
        }

        public void c(float f) {
        }

        public void d() {
        }

        public void e() {
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

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface i {
        void g(View view, View view2, int i2, int i3);
    }

    public m(f fVar) {
    }

    public static boolean y(View view, float f2, float f3, float f4, float f5) {
    }

    public void A() {
    }

    public void B(h hVar, int i2) {
    }

    public final void C() {
    }

    public void D(View view) {
    }

    public boolean E() {
    }

    public void F(RecyclerView.e0 e0Var, int i2) {
    }

    public final void G() {
    }

    public void H(RecyclerView.e0 e0Var) {
    }

    public final void I() {
    }

    public final void J() {
    }

    public final int K(RecyclerView.e0 e0Var) {
    }

    public void L(MotionEvent motionEvent, int i2, int i3) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void b(View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void d(View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void k(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
    }

    public final void l() {
    }

    public void m(RecyclerView recyclerView) {
    }

    public final int n(RecyclerView.e0 e0Var, int i2) {
    }

    public void o(int i2, MotionEvent motionEvent, int i3) {
    }

    public final int p(RecyclerView.e0 e0Var, int i2) {
    }

    public final void q() {
    }

    public void r(RecyclerView.e0 e0Var, boolean z) {
    }

    public h s(MotionEvent motionEvent) {
    }

    public View t(MotionEvent motionEvent) {
    }

    public final List<RecyclerView.e0> u(RecyclerView.e0 e0Var) {
    }

    public final RecyclerView.e0 v(MotionEvent motionEvent) {
    }

    public final void w(float[] fArr) {
    }

    public boolean x() {
    }

    public void z(RecyclerView.e0 e0Var) {
    }
}
