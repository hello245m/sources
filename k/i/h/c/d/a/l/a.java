package k.i.h.c.d.a.l;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.Scroller;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class a extends View implements Runnable {
    public static final String r0 = null;
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public final Handler a;
    public Paint b;
    public Scroller c;
    public VelocityTracker d;
    public boolean e;
    public InterfaceC0702a f;
    public b g;
    public boolean g0;
    public Rect h;
    public boolean h0;

    /* renamed from: i, reason: collision with root package name */
    public Rect f8028i;
    public boolean i0;

    /* renamed from: j, reason: collision with root package name */
    public Rect f8029j;
    public boolean j0;

    /* renamed from: k, reason: collision with root package name */
    public Rect f8030k;
    public boolean k0;

    /* renamed from: l, reason: collision with root package name */
    public Camera f8031l;
    public boolean l0;

    /* renamed from: m, reason: collision with root package name */
    public Matrix f8032m;
    public boolean m0;

    /* renamed from: n, reason: collision with root package name */
    public Matrix f8033n;
    public String n0;

    /* renamed from: o, reason: collision with root package name */
    public List f8034o;
    public final Vibrator o0;

    /* renamed from: p, reason: collision with root package name */
    public String f8035p;
    public boolean p0;

    /* renamed from: q, reason: collision with root package name */
    public int f8036q;
    public int q0;

    /* renamed from: r, reason: collision with root package name */
    public int f8037r;

    /* renamed from: s, reason: collision with root package name */
    public int f8038s;

    /* renamed from: t, reason: collision with root package name */
    public int f8039t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    /* renamed from: k.i.h.c.d.a.l.a$a, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface InterfaceC0702a {
        void a(a aVar, Object obj, int i2);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface b {
        void a(int i2);

        void b(int i2);

        void c(int i2);
    }

    public a(Context context, AttributeSet attributeSet) {
    }

    public final void a() {
    }

    public final int b(int i2) {
    }

    public final int c(int i2) {
    }

    public final void d() {
    }

    public final void e() {
    }

    public final void f() {
    }

    public final int g(int i2) {
    }

    public int getCurrentItemPosition() {
    }

    public int getCurtainColor() {
    }

    public List getData() {
    }

    public int getIndicatorColor() {
    }

    public int getIndicatorSize() {
    }

    public int getItemAlign() {
    }

    public int getItemSpace() {
    }

    public int getItemTextColor() {
    }

    public int getItemTextSize() {
    }

    public String getMaximumWidthText() {
    }

    public int getMaximumWidthTextPosition() {
    }

    public int getSelectedItemPosition() {
    }

    public int getSelectedItemTextColor() {
    }

    public Typeface getTypeface() {
    }

    public int getVisibleItemCount() {
    }

    public final void h() {
    }

    public final boolean i(int i2) {
    }

    public final int j(int i2, int i3, int i4) {
    }

    public void k(int i2, boolean z) {
    }

    public final void l() {
    }

    public final void m() {
    }

    public final void n() {
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

    @Override // java.lang.Runnable
    public void run() {
    }

    public void setAtmospheric(boolean z) {
    }

    public void setCurtain(boolean z) {
    }

    public void setCurtainColor(int i2) {
    }

    public void setCurved(boolean z) {
    }

    public void setCyclic(boolean z) {
    }

    public void setData(List list) {
    }

    public void setDebug(boolean z) {
    }

    public void setIndicator(boolean z) {
    }

    public void setIndicatorColor(int i2) {
    }

    public void setIndicatorSize(int i2) {
    }

    public void setItemAlign(int i2) {
    }

    public void setItemSpace(int i2) {
    }

    public void setItemTextColor(int i2) {
    }

    public void setItemTextSize(int i2) {
    }

    public void setMaximumWidthText(String str) {
    }

    public void setMaximumWidthTextPosition(int i2) {
    }

    public void setOnItemSelectedListener(InterfaceC0702a interfaceC0702a) {
    }

    public void setOnWheelChangeListener(b bVar) {
    }

    public void setPerformFeedback(boolean z) {
    }

    public void setSameWidth(boolean z) {
    }

    public void setSelectedItemPosition(int i2) {
    }

    public void setSelectedItemTextColor(int i2) {
    }

    public void setTypeface(Typeface typeface) {
    }

    public void setVisibleItemCount(int i2) {
    }
}
