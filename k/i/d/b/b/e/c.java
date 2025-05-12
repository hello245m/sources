package k.i.d.b.b.e;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import n.d;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class c extends View {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;
    public final d f;
    public int g;
    public float h;

    /* renamed from: i, reason: collision with root package name */
    public int f5755i;

    /* renamed from: j, reason: collision with root package name */
    public final TextPaint f5756j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5757k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5758l;

    /* renamed from: m, reason: collision with root package name */
    public float f5759m;

    /* renamed from: n, reason: collision with root package name */
    public long f5760n;

    /* renamed from: o, reason: collision with root package name */
    public final AccelerateDecelerateInterpolator f5761o;

    /* renamed from: p, reason: collision with root package name */
    public long f5762p;

    public c(Context context, AttributeSet attributeSet) {
    }

    public final void a(Canvas canvas, String str, int i2, float f, float f2, float f3) {
    }

    public final Rect b(String str, float f) {
    }

    public abstract void c(float f);

    public abstract void d();

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
    }

    public abstract boolean e();

    public abstract void f(Canvas canvas);

    public abstract boolean g(PointF pointF);

    public final float getAnimationCoefficient() {
    }

    public final float getINSIDE_PADDING() {
    }

    public final int getSelectedBackgroundColor() {
    }

    public final int getSelectedLineColor() {
    }

    public final float getSelectedTextSize() {
    }

    public final void h() {
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    public final void setSelectedBackgroundColor(int i2) {
    }

    public final void setSelectedLineColor(int i2) {
    }

    public final void setSelectedTextSize(float f) {
    }

    public c(Context context, AttributeSet attributeSet, int i2) {
    }
}
