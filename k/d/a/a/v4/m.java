package k.d.a.a.v4;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.Formatter;
import java.util.concurrent.CopyOnWriteArraySet;
import k.d.a.a.v4.a0;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class m extends View implements a0 {
    public int A;
    public long B;
    public int C;
    public Rect D;
    public ValueAnimator E;
    public float F;
    public boolean G;
    public boolean H;
    public long I;
    public long J;
    public long K;
    public long L;
    public int M;
    public long[] N;
    public boolean[] O;
    public final Rect a;
    public final Rect b;
    public final Rect c;
    public final Rect d;
    public final Paint e;
    public final Paint f;
    public final Paint g;
    public final Paint h;

    /* renamed from: i, reason: collision with root package name */
    public final Paint f5034i;

    /* renamed from: j, reason: collision with root package name */
    public final Paint f5035j;

    /* renamed from: k, reason: collision with root package name */
    public final Drawable f5036k;

    /* renamed from: l, reason: collision with root package name */
    public final int f5037l;

    /* renamed from: m, reason: collision with root package name */
    public final int f5038m;

    /* renamed from: n, reason: collision with root package name */
    public final int f5039n;

    /* renamed from: o, reason: collision with root package name */
    public final int f5040o;

    /* renamed from: p, reason: collision with root package name */
    public final int f5041p;

    /* renamed from: q, reason: collision with root package name */
    public final int f5042q;

    /* renamed from: r, reason: collision with root package name */
    public final int f5043r;

    /* renamed from: s, reason: collision with root package name */
    public final int f5044s;

    /* renamed from: t, reason: collision with root package name */
    public final int f5045t;
    public final StringBuilder u;
    public final Formatter v;
    public final Runnable w;
    public final CopyOnWriteArraySet<a0.a> x;
    public final Point y;
    public final float z;

    public m(Context context, AttributeSet attributeSet, int i2, AttributeSet attributeSet2) {
    }

    public static int c(float f, int i2) {
    }

    private /* synthetic */ void g() {
    }

    private long getPositionIncrement() {
    }

    private String getProgressText() {
    }

    private long getScrubberPosition() {
    }

    private /* synthetic */ void i(ValueAnimator valueAnimator) {
    }

    public static int l(float f, int i2) {
    }

    public static boolean p(Drawable drawable, int i2) {
    }

    @Override // k.d.a.a.v4.a0
    public void a(long[] jArr, boolean[] zArr, int i2) {
    }

    @Override // k.d.a.a.v4.a0
    public void b(a0.a aVar) {
    }

    public final void d(Canvas canvas) {
    }

    @Override // android.view.View
    public void drawableStateChanged() {
    }

    public final void e(Canvas canvas) {
    }

    public final boolean f(float f, float f2) {
    }

    @Override // k.d.a.a.v4.a0
    public long getPreferredUpdateDelay() {
    }

    public /* synthetic */ void h() {
    }

    public /* synthetic */ void j(ValueAnimator valueAnimator) {
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
    }

    public final void k(float f) {
    }

    public final Point m(MotionEvent motionEvent) {
    }

    public final boolean n(long j2) {
    }

    public final boolean o(Drawable drawable) {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i2, Rect rect) {
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i2) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i2, Bundle bundle) {
    }

    public final void q(int i2, int i3) {
    }

    public final void r(long j2) {
    }

    public final void s(boolean z) {
    }

    public void setAdMarkerColor(int i2) {
    }

    public void setBufferedColor(int i2) {
    }

    @Override // k.d.a.a.v4.a0
    public void setBufferedPosition(long j2) {
    }

    @Override // k.d.a.a.v4.a0
    public void setDuration(long j2) {
    }

    @Override // android.view.View, k.d.a.a.v4.a0
    public void setEnabled(boolean z) {
    }

    public void setKeyCountIncrement(int i2) {
    }

    public void setKeyTimeIncrement(long j2) {
    }

    public void setPlayedAdMarkerColor(int i2) {
    }

    public void setPlayedColor(int i2) {
    }

    @Override // k.d.a.a.v4.a0
    public void setPosition(long j2) {
    }

    public void setScrubberColor(int i2) {
    }

    public void setUnplayedColor(int i2) {
    }

    public final void t() {
    }

    public final void u() {
    }

    public final void v(long j2) {
    }

    public m(Context context, AttributeSet attributeSet, int i2, AttributeSet attributeSet2, int i3) {
    }
}
