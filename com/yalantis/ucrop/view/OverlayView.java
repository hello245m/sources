package com.yalantis.ucrop.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import k.j.a.a.d;
import k.j.a.a.e;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
public class OverlayView extends View {
    public d A;
    public boolean B;
    public final RectF a;
    public final RectF b;
    public int c;
    public int d;
    public float[] e;
    public int f;
    public int g;
    public float h;

    /* renamed from: i, reason: collision with root package name */
    public float[] f2554i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2555j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2556k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2557l;

    /* renamed from: m, reason: collision with root package name */
    public int f2558m;

    /* renamed from: n, reason: collision with root package name */
    public Path f2559n;

    /* renamed from: o, reason: collision with root package name */
    public Paint f2560o;

    /* renamed from: p, reason: collision with root package name */
    public Paint f2561p;

    /* renamed from: q, reason: collision with root package name */
    public Paint f2562q;

    /* renamed from: r, reason: collision with root package name */
    public Paint f2563r;

    /* renamed from: s, reason: collision with root package name */
    public int f2564s;

    /* renamed from: t, reason: collision with root package name */
    public float f2565t;
    public float u;
    public int v;
    public int w;
    public int x;
    public int y;
    public e z;

    public OverlayView(Context context, AttributeSet attributeSet) {
    }

    public void a(Canvas canvas) {
    }

    public void b(Canvas canvas) {
    }

    public final int c(float f, float f2) {
    }

    public void d() {
    }

    public final void e(TypedArray typedArray) {
    }

    public final void f(TypedArray typedArray) {
    }

    public void g(TypedArray typedArray) {
    }

    public RectF getCropViewRect() {
    }

    public d getFreestyleCropListener() {
    }

    public int getFreestyleCropMode() {
    }

    public e getOverlayViewChangeListener() {
    }

    public void h() {
    }

    public final void i(float f, float f2) {
    }

    public final void j() {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    public void setCircleDimmedLayer(boolean z) {
    }

    public void setCropFrameColor(int i2) {
    }

    public void setCropFrameStrokeWidth(int i2) {
    }

    public void setCropGridColor(int i2) {
    }

    public void setCropGridColumnCount(int i2) {
    }

    public void setCropGridCornerColor(int i2) {
    }

    public void setCropGridRowCount(int i2) {
    }

    public void setCropGridStrokeWidth(int i2) {
    }

    public void setDimmedColor(int i2) {
    }

    @Deprecated
    public void setFreestyleCropEnabled(boolean z) {
    }

    public void setFreestyleCropListener(d dVar) {
    }

    public void setFreestyleCropMode(int i2) {
    }

    public void setOverlayViewChangeListener(e eVar) {
    }

    public void setShowCropFrame(boolean z) {
    }

    public void setShowCropGrid(boolean z) {
    }

    public void setTargetAspectRatio(float f) {
    }

    public OverlayView(Context context, AttributeSet attributeSet, int i2) {
    }
}
