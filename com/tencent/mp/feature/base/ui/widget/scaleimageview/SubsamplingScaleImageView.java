package com.tencent.mp.feature.base.ui.widget.scaleimageview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReadWriteLock;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class SubsamplingScaleImageView extends View {
    public static final String C0 = null;
    public static final List<Integer> D0 = null;
    public static final List<Integer> E0 = null;
    public static final List<Integer> F0 = null;
    public static final List<Integer> G0 = null;
    public static final List<Integer> H0 = null;
    public static Bitmap.Config I0;
    public PointF A;
    public final float[] A0;
    public PointF B;
    public final float B0;
    public Float C;
    public PointF D;
    public PointF E;
    public int F;
    public int G;
    public int H;
    public Rect I;
    public Rect J;
    public boolean K;
    public boolean L;
    public boolean M;
    public int N;
    public GestureDetector O;
    public GestureDetector P;
    public k.i.h.b.d.b1.p.c0.c.d Q;
    public final ReadWriteLock R;
    public k.i.h.b.d.b1.p.c0.c.b<? extends k.i.h.b.d.b1.p.c0.c.c> S;
    public k.i.h.b.d.b1.p.c0.c.b<? extends k.i.h.b.d.b1.p.c0.c.d> T;
    public PointF U;
    public float V;
    public final float W;
    public Bitmap a;
    public boolean b;
    public boolean c;
    public Uri d;
    public int e;
    public Map<Integer, List<k>> f;
    public boolean g;
    public float g0;
    public int h;
    public boolean h0;

    /* renamed from: i, reason: collision with root package name */
    public float f1376i;
    public PointF i0;

    /* renamed from: j, reason: collision with root package name */
    public float f1377j;
    public PointF j0;

    /* renamed from: k, reason: collision with root package name */
    public int f1378k;
    public PointF k0;

    /* renamed from: l, reason: collision with root package name */
    public int f1379l;
    public d l0;

    /* renamed from: m, reason: collision with root package name */
    public int f1380m;
    public boolean m0;

    /* renamed from: n, reason: collision with root package name */
    public int f1381n;
    public boolean n0;

    /* renamed from: o, reason: collision with root package name */
    public int f1382o;
    public h o0;

    /* renamed from: p, reason: collision with root package name */
    public Executor f1383p;
    public i p0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1384q;
    public View.OnLongClickListener q0;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1385r;
    public final Handler r0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1386s;
    public Paint s0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1387t;
    public Paint t0;
    public float u;
    public Paint u0;
    public int v;
    public Paint v0;
    public int w;
    public j w0;
    public float x;
    public Matrix x0;
    public float y;
    public RectF y0;
    public PointF z;
    public final float[] z0;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class a implements Handler.Callback {
        public final /* synthetic */ SubsamplingScaleImageView a;

        public a(SubsamplingScaleImageView subsamplingScaleImageView) {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class b extends GestureDetector.SimpleOnGestureListener {
        public final /* synthetic */ Context a;
        public final /* synthetic */ SubsamplingScaleImageView b;

        public b(SubsamplingScaleImageView subsamplingScaleImageView, Context context) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class c extends GestureDetector.SimpleOnGestureListener {
        public final /* synthetic */ SubsamplingScaleImageView a;

        public c(SubsamplingScaleImageView subsamplingScaleImageView) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public final class e {
        public final float a;
        public final PointF b;
        public final PointF c;
        public long d;
        public int e;
        public int f;
        public boolean g;
        public boolean h;

        /* renamed from: i, reason: collision with root package name */
        public g f1393i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ SubsamplingScaleImageView f1394j;

        public /* synthetic */ e(SubsamplingScaleImageView subsamplingScaleImageView, float f, PointF pointF, PointF pointF2, a aVar) {
        }

        public static /* synthetic */ e a(e eVar, boolean z) {
        }

        public static /* synthetic */ e b(e eVar, int i2) {
        }

        public void c() {
        }

        public e d(long j2) {
        }

        public e e(int i2) {
        }

        public e f(boolean z) {
        }

        public final e g(int i2) {
        }

        public final e h(boolean z) {
        }

        public /* synthetic */ e(SubsamplingScaleImageView subsamplingScaleImageView, float f, PointF pointF, a aVar) {
        }

        public /* synthetic */ e(SubsamplingScaleImageView subsamplingScaleImageView, PointF pointF, a aVar) {
        }

        public e(SubsamplingScaleImageView subsamplingScaleImageView, PointF pointF) {
        }

        public e(SubsamplingScaleImageView subsamplingScaleImageView, float f, PointF pointF) {
        }

        public e(SubsamplingScaleImageView subsamplingScaleImageView, float f, PointF pointF, PointF pointF2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class f extends AsyncTask<Void, Void, Integer> {
        public final WeakReference<SubsamplingScaleImageView> a;
        public final WeakReference<Context> b;
        public final WeakReference<k.i.h.b.d.b1.p.c0.c.b<? extends k.i.h.b.d.b1.p.c0.c.c>> c;
        public final Uri d;
        public final boolean e;
        public Bitmap f;
        public Exception g;

        public f(SubsamplingScaleImageView subsamplingScaleImageView, Context context, k.i.h.b.d.b1.p.c0.c.b<? extends k.i.h.b.d.b1.p.c0.c.c> bVar, Uri uri, boolean z) {
        }

        public Integer a(Void... voidArr) {
        }

        public void b(Integer num) {
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Integer doInBackground(Void[] voidArr) {
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(Integer num) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface g {
        void c();

        void d();

        void e();
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface h {
        void a(Exception exc);

        void b();

        void c();

        void d(Exception exc);

        void e();

        void f(Exception exc);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface i {
        void a(PointF pointF, int i2);

        void b(float f, int i2);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class j {
        public float a;
        public final PointF b;

        public /* synthetic */ j(float f, PointF pointF, a aVar) {
        }

        public static /* synthetic */ float a(j jVar) {
        }

        public static /* synthetic */ float b(j jVar, float f) {
        }

        public static /* synthetic */ PointF c(j jVar) {
        }

        public j(float f, PointF pointF) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class k {
        public Rect a;
        public int b;
        public Bitmap c;
        public boolean d;
        public boolean e;
        public Rect f;
        public Rect g;

        public k() {
        }

        public static /* synthetic */ boolean a(k kVar) {
        }

        public static /* synthetic */ boolean b(k kVar) {
        }

        public static /* synthetic */ boolean c(k kVar, boolean z) {
        }

        public static /* synthetic */ boolean d(k kVar, boolean z) {
        }

        public static /* synthetic */ Rect e(k kVar) {
        }

        public static /* synthetic */ Rect f(k kVar, Rect rect) {
        }

        public static /* synthetic */ Rect g(k kVar) {
        }

        public static /* synthetic */ Rect h(k kVar, Rect rect) {
        }

        public static /* synthetic */ int i(k kVar) {
        }

        public static /* synthetic */ int j(k kVar, int i2) {
        }

        public static /* synthetic */ Bitmap k(k kVar) {
        }

        public static /* synthetic */ Rect l(k kVar) {
        }

        public static /* synthetic */ Rect m(k kVar, Rect rect) {
        }

        public static /* synthetic */ Bitmap n(k kVar, Bitmap bitmap) {
        }

        public /* synthetic */ k(a aVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class l extends AsyncTask<Void, Void, Bitmap> {
        public final WeakReference<SubsamplingScaleImageView> a;
        public final WeakReference<k.i.h.b.d.b1.p.c0.c.d> b;
        public final WeakReference<k> c;
        public Exception d;

        public l(SubsamplingScaleImageView subsamplingScaleImageView, k.i.h.b.d.b1.p.c0.c.d dVar, k kVar) {
        }

        public Bitmap a(Void... voidArr) {
        }

        public void b(Bitmap bitmap) {
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Bitmap doInBackground(Void[] voidArr) {
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(Bitmap bitmap) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class m extends AsyncTask<Void, Void, int[]> {
        public final WeakReference<SubsamplingScaleImageView> a;
        public final WeakReference<Context> b;
        public final WeakReference<k.i.h.b.d.b1.p.c0.c.b<? extends k.i.h.b.d.b1.p.c0.c.d>> c;
        public final Uri d;
        public k.i.h.b.d.b1.p.c0.c.d e;
        public Exception f;

        public m(SubsamplingScaleImageView subsamplingScaleImageView, Context context, k.i.h.b.d.b1.p.c0.c.b<? extends k.i.h.b.d.b1.p.c0.c.d> bVar, Uri uri) {
        }

        public int[] a(Void... voidArr) {
        }

        public void b(int[] iArr) {
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ int[] doInBackground(Void[] voidArr) {
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(int[] iArr) {
        }
    }

    public SubsamplingScaleImageView(Context context, AttributeSet attributeSet) {
    }

    public static /* synthetic */ ReadWriteLock A(SubsamplingScaleImageView subsamplingScaleImageView) {
    }

    public static /* synthetic */ void B(SubsamplingScaleImageView subsamplingScaleImageView, Rect rect, Rect rect2) {
    }

    public static /* synthetic */ void C(SubsamplingScaleImageView subsamplingScaleImageView) {
    }

    public static /* synthetic */ boolean D(SubsamplingScaleImageView subsamplingScaleImageView) {
    }

    public static /* synthetic */ void E(SubsamplingScaleImageView subsamplingScaleImageView, Bitmap bitmap) {
    }

    public static /* synthetic */ void F(SubsamplingScaleImageView subsamplingScaleImageView, Bitmap bitmap, int i2, boolean z) {
    }

    public static /* synthetic */ List G() {
    }

    public static /* synthetic */ d H(SubsamplingScaleImageView subsamplingScaleImageView) {
    }

    public static /* synthetic */ d I(SubsamplingScaleImageView subsamplingScaleImageView, d dVar) {
    }

    public static /* synthetic */ float J(SubsamplingScaleImageView subsamplingScaleImageView, float f2) {
    }

    public static /* synthetic */ PointF K(SubsamplingScaleImageView subsamplingScaleImageView, float f2, float f3, float f4, PointF pointF) {
    }

    public static /* synthetic */ void L(SubsamplingScaleImageView subsamplingScaleImageView, boolean z, j jVar) {
    }

    public static /* synthetic */ boolean M(SubsamplingScaleImageView subsamplingScaleImageView) {
    }

    public static /* synthetic */ PointF N(SubsamplingScaleImageView subsamplingScaleImageView) {
    }

    public static /* synthetic */ boolean O(SubsamplingScaleImageView subsamplingScaleImageView) {
    }

    public static /* synthetic */ boolean P(SubsamplingScaleImageView subsamplingScaleImageView, boolean z) {
    }

    public static /* synthetic */ View.OnLongClickListener a(SubsamplingScaleImageView subsamplingScaleImageView) {
    }

    public static /* synthetic */ float b(SubsamplingScaleImageView subsamplingScaleImageView) {
    }

    public static /* synthetic */ int c(SubsamplingScaleImageView subsamplingScaleImageView, int i2) {
    }

    public static /* synthetic */ boolean d(SubsamplingScaleImageView subsamplingScaleImageView) {
    }

    public static /* synthetic */ void e(SubsamplingScaleImageView subsamplingScaleImageView, Context context) {
    }

    public static /* synthetic */ boolean f(SubsamplingScaleImageView subsamplingScaleImageView) {
    }

    public static /* synthetic */ PointF g(SubsamplingScaleImageView subsamplingScaleImageView) {
    }

    public static Bitmap.Config getPreferredBitmapConfig() {
    }

    private int getRequiredRotation() {
    }

    public static /* synthetic */ PointF h(SubsamplingScaleImageView subsamplingScaleImageView, PointF pointF) {
    }

    public static /* synthetic */ PointF i(SubsamplingScaleImageView subsamplingScaleImageView, PointF pointF) {
    }

    public static /* synthetic */ float j(SubsamplingScaleImageView subsamplingScaleImageView, float f2) {
    }

    public static /* synthetic */ boolean k(SubsamplingScaleImageView subsamplingScaleImageView, boolean z) {
    }

    public static /* synthetic */ void l(SubsamplingScaleImageView subsamplingScaleImageView, View.OnLongClickListener onLongClickListener) {
    }

    public static /* synthetic */ float m(SubsamplingScaleImageView subsamplingScaleImageView, float f2) {
    }

    public static /* synthetic */ PointF n(SubsamplingScaleImageView subsamplingScaleImageView) {
    }

    public static /* synthetic */ PointF o(SubsamplingScaleImageView subsamplingScaleImageView, PointF pointF) {
    }

    public static /* synthetic */ PointF p(SubsamplingScaleImageView subsamplingScaleImageView, PointF pointF) {
    }

    public static /* synthetic */ PointF q(SubsamplingScaleImageView subsamplingScaleImageView, PointF pointF) {
    }

    public static /* synthetic */ boolean r(SubsamplingScaleImageView subsamplingScaleImageView, boolean z) {
    }

    public static /* synthetic */ void s(SubsamplingScaleImageView subsamplingScaleImageView, PointF pointF, PointF pointF2) {
    }

    private void setGestureDetector(Context context) {
    }

    public static void setPreferredBitmapConfig(Bitmap.Config config) {
    }

    public static /* synthetic */ void t(SubsamplingScaleImageView subsamplingScaleImageView, View.OnLongClickListener onLongClickListener) {
    }

    public static /* synthetic */ void u(SubsamplingScaleImageView subsamplingScaleImageView, String str, Object[] objArr) {
    }

    public static /* synthetic */ int v(SubsamplingScaleImageView subsamplingScaleImageView, Context context, String str) {
    }

    public static /* synthetic */ Rect w(SubsamplingScaleImageView subsamplingScaleImageView) {
    }

    public static /* synthetic */ String x() {
    }

    public static /* synthetic */ void y(SubsamplingScaleImageView subsamplingScaleImageView, k.i.h.b.d.b1.p.c0.c.d dVar, int i2, int i3, int i4) {
    }

    public static /* synthetic */ h z(SubsamplingScaleImageView subsamplingScaleImageView) {
    }

    public final void A0(k.i.h.b.d.b1.p.c0.b bVar) {
    }

    public final int B0() {
    }

    public final int C0() {
    }

    public final void D0(float f2, PointF pointF, int i2) {
    }

    public final void E0(k.i.h.b.d.b1.p.c0.a aVar, k.i.h.b.d.b1.p.c0.a aVar2, k.i.h.b.d.b1.p.c0.b bVar) {
    }

    public final void F0(float[] fArr, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
    }

    public final void G0(float f2, PointF pointF) {
    }

    public final PointF H0(float f2, float f3, PointF pointF) {
    }

    public final PointF I0(PointF pointF) {
    }

    public final void J0(Rect rect, Rect rect2) {
    }

    public final float K0(float f2) {
    }

    public final float L0(float f2) {
    }

    public final boolean M0(k kVar) {
    }

    public final PointF N0(float f2, float f3, float f4) {
    }

    public final PointF O0(float f2, float f3) {
    }

    public final PointF P0(float f2, float f3, PointF pointF) {
    }

    public final int Q(float f2) {
    }

    public final PointF Q0(PointF pointF) {
    }

    public final boolean R() {
    }

    public final float R0(float f2) {
    }

    public final boolean S() {
    }

    public final float S0(float f2) {
    }

    public final void T() {
    }

    public final void U(String str, Object... objArr) {
    }

    public final float V(float f2, float f3, float f4, float f5) {
    }

    public final void W(PointF pointF, PointF pointF2) {
    }

    public final float X(int i2, long j2, float f2, float f3, long j3) {
    }

    public final float Y(long j2, float f2, float f3, long j3) {
    }

    public final float Z(long j2, float f2, float f3, long j3) {
    }

    public final void a0(AsyncTask<Void, Void, ?> asyncTask) {
    }

    public final void b0(Rect rect, Rect rect2) {
    }

    public final void c0(boolean z) {
    }

    public final void d0(boolean z, j jVar) {
    }

    public final int e0(Context context, String str) {
    }

    public final Point f0(Canvas canvas) {
    }

    public final synchronized void g0(Point point) {
    }

    public final int getAppliedOrientation() {
    }

    public final PointF getCenter() {
    }

    public float getMaxScale() {
    }

    public final float getMinScale() {
    }

    public final int getOrientation() {
    }

    public final int getSHeight() {
    }

    public final int getSWidth() {
    }

    public final float getScale() {
    }

    public final k.i.h.b.d.b1.p.c0.b getState() {
    }

    public final void h0(Point point) {
    }

    public final boolean i0() {
    }

    public final boolean j0() {
    }

    public final PointF k0(float f2, float f3, float f4, PointF pointF) {
    }

    public final float l0(float f2) {
    }

    public final float m0() {
    }

    public void n0() {
    }

    public final synchronized void o0(Bitmap bitmap, int i2, boolean z) {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    public final synchronized void p0(Bitmap bitmap) {
    }

    public void q0() {
    }

    public final synchronized void r0() {
    }

    public final synchronized void s0(k.i.h.b.d.b1.p.c0.c.d dVar, int i2, int i3, int i4) {
    }

    public final void setBitmapDecoderClass(Class<? extends k.i.h.b.d.b1.p.c0.c.c> cls) {
    }

    public final void setBitmapDecoderFactory(k.i.h.b.d.b1.p.c0.c.b<? extends k.i.h.b.d.b1.p.c0.c.c> bVar) {
    }

    public final void setDebug(boolean z) {
    }

    public final void setDoubleTapZoomDpi(int i2) {
    }

    public final void setDoubleTapZoomDuration(int i2) {
    }

    public final void setDoubleTapZoomScale(float f2) {
    }

    public final void setDoubleTapZoomStyle(int i2) {
    }

    public void setEagerLoadingEnabled(boolean z) {
    }

    public void setExecutor(Executor executor) {
    }

    public final void setImage(k.i.h.b.d.b1.p.c0.a aVar) {
    }

    public final void setMaxScale(float f2) {
    }

    public void setMaxTileSize(int i2) {
    }

    public final void setMaximumDpi(int i2) {
    }

    public final void setMinScale(float f2) {
    }

    public final void setMinimumDpi(int i2) {
    }

    public final void setMinimumScaleType(int i2) {
    }

    public void setMinimumTileDpi(int i2) {
    }

    public void setOnImageEventListener(h hVar) {
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
    }

    public void setOnStateChangedListener(i iVar) {
    }

    public final void setOrientation(int i2) {
    }

    public final void setPanEnabled(boolean z) {
    }

    public final void setPanLimit(int i2) {
    }

    public final void setQuickScaleEnabled(boolean z) {
    }

    public final void setRegionDecoderClass(Class<? extends k.i.h.b.d.b1.p.c0.c.d> cls) {
    }

    public final void setRegionDecoderFactory(k.i.h.b.d.b1.p.c0.c.b<? extends k.i.h.b.d.b1.p.c0.c.d> bVar) {
    }

    public final void setTileBackgroundColor(int i2) {
    }

    public final void setZoomEnabled(boolean z) {
    }

    public final boolean t0(MotionEvent motionEvent) {
    }

    public final void u0() {
    }

    public final int v0(int i2) {
    }

    public void w0() {
    }

    public final void x0(boolean z) {
    }

    public final void y0(boolean z) {
    }

    public final void z0(boolean z) {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class d {
        public float a;
        public float b;
        public PointF c;
        public PointF d;
        public PointF e;
        public PointF f;
        public PointF g;
        public long h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f1388i;

        /* renamed from: j, reason: collision with root package name */
        public int f1389j;

        /* renamed from: k, reason: collision with root package name */
        public int f1390k;

        /* renamed from: l, reason: collision with root package name */
        public long f1391l;

        /* renamed from: m, reason: collision with root package name */
        public g f1392m;

        public d() {
        }

        public static /* synthetic */ boolean a(d dVar) {
        }

        public static /* synthetic */ boolean b(d dVar, boolean z) {
        }

        public static /* synthetic */ g c(d dVar) {
        }

        public static /* synthetic */ g d(d dVar, g gVar) {
        }

        public static /* synthetic */ PointF e(d dVar) {
        }

        public static /* synthetic */ PointF f(d dVar, PointF pointF) {
        }

        public static /* synthetic */ long g(d dVar) {
        }

        public static /* synthetic */ long h(d dVar, long j2) {
        }

        public static /* synthetic */ long i(d dVar) {
        }

        public static /* synthetic */ long j(d dVar, long j2) {
        }

        public static /* synthetic */ int k(d dVar) {
        }

        public static /* synthetic */ int l(d dVar, int i2) {
        }

        public static /* synthetic */ float m(d dVar) {
        }

        public static /* synthetic */ float n(d dVar, float f) {
        }

        public static /* synthetic */ float o(d dVar) {
        }

        public static /* synthetic */ float p(d dVar, float f) {
        }

        public static /* synthetic */ PointF q(d dVar) {
        }

        public static /* synthetic */ PointF r(d dVar, PointF pointF) {
        }

        public static /* synthetic */ PointF s(d dVar) {
        }

        public static /* synthetic */ PointF t(d dVar, PointF pointF) {
        }

        public static /* synthetic */ int u(d dVar) {
        }

        public static /* synthetic */ int v(d dVar, int i2) {
        }

        public static /* synthetic */ PointF w(d dVar) {
        }

        public static /* synthetic */ PointF x(d dVar, PointF pointF) {
        }

        public static /* synthetic */ PointF y(d dVar) {
        }

        public static /* synthetic */ PointF z(d dVar, PointF pointF) {
        }

        public /* synthetic */ d(a aVar) {
        }
    }
}
