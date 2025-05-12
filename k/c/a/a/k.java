package k.c.a.a;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.OverScroller;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class k implements View.OnTouchListener, View.OnLayoutChangeListener {
    public static float E = 3.0f;
    public static float F = 1.75f;
    public static float G = 1.0f;
    public static int H = 200;
    public static int I = 1;
    public float A;
    public boolean B;
    public ImageView.ScaleType C;
    public k.c.a.a.c D;
    public Interpolator a;
    public int b;
    public float c;
    public float d;
    public float e;
    public boolean f;
    public boolean g;
    public ImageView h;

    /* renamed from: i, reason: collision with root package name */
    public GestureDetector f3899i;

    /* renamed from: j, reason: collision with root package name */
    public k.c.a.a.b f3900j;

    /* renamed from: k, reason: collision with root package name */
    public final Matrix f3901k;

    /* renamed from: l, reason: collision with root package name */
    public final Matrix f3902l;

    /* renamed from: m, reason: collision with root package name */
    public final Matrix f3903m;

    /* renamed from: n, reason: collision with root package name */
    public final RectF f3904n;

    /* renamed from: o, reason: collision with root package name */
    public final float[] f3905o;

    /* renamed from: p, reason: collision with root package name */
    public k.c.a.a.d f3906p;

    /* renamed from: q, reason: collision with root package name */
    public k.c.a.a.f f3907q;

    /* renamed from: r, reason: collision with root package name */
    public k.c.a.a.e f3908r;

    /* renamed from: s, reason: collision with root package name */
    public j f3909s;

    /* renamed from: t, reason: collision with root package name */
    public View.OnClickListener f3910t;
    public View.OnLongClickListener u;
    public g v;
    public h w;
    public i x;
    public f y;
    public int z;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements k.c.a.a.c {
        public final /* synthetic */ k a;

        public a(k kVar) {
        }

        @Override // k.c.a.a.c
        public void a(float f, float f2) {
        }

        @Override // k.c.a.a.c
        public void b(float f, float f2, float f3) {
        }

        @Override // k.c.a.a.c
        public void c(float f, float f2, float f3, float f4) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b extends GestureDetector.SimpleOnGestureListener {
        public final /* synthetic */ k a;

        public b(k kVar) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class c implements GestureDetector.OnDoubleTapListener {
        public final /* synthetic */ k a;

        public c(k kVar) {
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static /* synthetic */ class d {
        public static final /* synthetic */ int[] a = null;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class e implements Runnable {
        public final float a;
        public final float b;
        public final long c;
        public final float d;
        public final float e;
        public final /* synthetic */ k f;

        public e(k kVar, float f, float f2, float f3, float f4) {
        }

        public final float a() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class f implements Runnable {
        public final OverScroller a;
        public int b;
        public int c;
        public final /* synthetic */ k d;

        public f(k kVar, Context context) {
        }

        public void a() {
        }

        public void b(int i2, int i3, int i4, int i5) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public k(ImageView imageView) {
    }

    public static /* synthetic */ k.c.a.a.b a(k kVar) {
    }

    public static /* synthetic */ i b(k kVar) {
    }

    public static /* synthetic */ int c(k kVar, ImageView imageView) {
    }

    public static /* synthetic */ float d(k kVar) {
    }

    public static /* synthetic */ float e(k kVar) {
    }

    public static /* synthetic */ g f(k kVar) {
    }

    public static /* synthetic */ View.OnLongClickListener g(k kVar) {
    }

    public static /* synthetic */ h h(k kVar) {
    }

    public static /* synthetic */ float i() {
    }

    public static /* synthetic */ int j() {
    }

    public static /* synthetic */ View.OnClickListener k(k kVar) {
    }

    public static /* synthetic */ j l(k kVar) {
    }

    public static /* synthetic */ Matrix m(k kVar) {
    }

    public static /* synthetic */ k.c.a.a.f n(k kVar) {
    }

    public static /* synthetic */ k.c.a.a.e o(k kVar) {
    }

    public static /* synthetic */ k.c.a.a.c p(k kVar) {
    }

    public static /* synthetic */ int q(k kVar) {
    }

    public static /* synthetic */ Interpolator r(k kVar) {
    }

    public static /* synthetic */ void s(k kVar) {
    }

    public static /* synthetic */ ImageView t(k kVar) {
    }

    public static /* synthetic */ boolean u(k kVar) {
    }

    public static /* synthetic */ boolean v(k kVar) {
    }

    public static /* synthetic */ int w(k kVar) {
    }

    public static /* synthetic */ f x(k kVar) {
    }

    public static /* synthetic */ f y(k kVar, f fVar) {
    }

    public static /* synthetic */ int z(k kVar, ImageView imageView) {
    }

    public final void A() {
    }

    public final void B() {
    }

    public final boolean C() {
    }

    public RectF D() {
    }

    public final RectF E(Matrix matrix) {
    }

    public final Matrix F() {
    }

    public Matrix G() {
    }

    public final int H(ImageView imageView) {
    }

    public final int I(ImageView imageView) {
    }

    public float J() {
    }

    public float K() {
    }

    public float L() {
    }

    public float M() {
    }

    public ImageView.ScaleType N() {
    }

    public final float O(Matrix matrix, int i2) {
    }

    public final void P() {
    }

    public void Q(boolean z) {
    }

    public final void R(Matrix matrix) {
    }

    public void S(float f2) {
    }

    public void T(float f2) {
    }

    public void U(float f2) {
    }

    public void V(View.OnClickListener onClickListener) {
    }

    public void W(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
    }

    public void X(View.OnLongClickListener onLongClickListener) {
    }

    public void Y(k.c.a.a.d dVar) {
    }

    public void Z(k.c.a.a.e eVar) {
    }

    public void a0(k.c.a.a.f fVar) {
    }

    public void b0(g gVar) {
    }

    public void c0(h hVar) {
    }

    public void d0(i iVar) {
    }

    public void e0(j jVar) {
    }

    public void f0(float f2) {
    }

    public void g0(float f2) {
    }

    public void h0(float f2) {
    }

    public void i0(float f2, float f3, float f4, boolean z) {
    }

    public void j0(float f2, boolean z) {
    }

    public void k0(ImageView.ScaleType scaleType) {
    }

    public void l0(int i2) {
    }

    public void m0(boolean z) {
    }

    public void n0() {
    }

    public final void o0(Drawable drawable) {
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
    }
}
