package com.tencent.mp.feature.photo.videocrop.ui.thumbnail.selector;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import n.d;
import n.d0.d.h;
import n.d0.d.o;
import n.i;
import o.a.s3.e;
import o.a.s3.u;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class RangeSelector extends View implements k.i.h.b.z.p.d.f.f.a {
    public float A;
    public i<Float, Float> a;
    public float b;
    public float c;
    public float d;
    public boolean e;
    public n.d0.c.a<Float> f;
    public final u<Integer> g;
    public final u<i<Float, Float>> h;

    /* renamed from: i, reason: collision with root package name */
    public final d f1711i;

    /* renamed from: j, reason: collision with root package name */
    public final Paint f1712j;

    /* renamed from: k, reason: collision with root package name */
    public final int f1713k;

    /* renamed from: l, reason: collision with root package name */
    public final int f1714l;

    /* renamed from: m, reason: collision with root package name */
    public final Drawable f1715m;

    /* renamed from: n, reason: collision with root package name */
    public final float f1716n;

    /* renamed from: o, reason: collision with root package name */
    public final int f1717o;

    /* renamed from: p, reason: collision with root package name */
    public final int f1718p;

    /* renamed from: q, reason: collision with root package name */
    public final int f1719q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f1720r;

    /* renamed from: s, reason: collision with root package name */
    public Integer f1721s;

    /* renamed from: t, reason: collision with root package name */
    public PointF f1722t;
    public Float u;
    public boolean v;
    public Integer w;
    public PointF x;
    public Float y;
    public boolean z;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a extends o implements n.d0.c.a<Vibrator> {
        public final /* synthetic */ Context a;

        public a(Context context) {
        }

        public final Vibrator b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ Vibrator invoke() {
        }
    }

    public RangeSelector(Context context, AttributeSet attributeSet) {
    }

    public RangeSelector(Context context, AttributeSet attributeSet, int i2) {
    }

    private final Vibrator getVibrator() {
    }

    @Override // k.i.h.b.z.p.d.f.f.a
    public void a(float f, float f2, float f3) {
    }

    public final boolean b(float f, float f2, int i2) {
    }

    public final boolean c(MotionEvent motionEvent) {
    }

    public final boolean d(int i2) {
    }

    public final void e() {
    }

    @Override // k.i.h.b.z.p.d.f.f.a
    public float getEndPosition() {
    }

    @Override // k.i.h.b.z.p.d.f.f.a
    public e<i<Float, Float>> getPositionFlow() {
    }

    @Override // k.i.h.b.z.p.d.f.f.a
    public float getStartPosition() {
    }

    @Override // k.i.h.b.z.p.d.f.f.a
    public e<Integer> getStateFlow() {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    @Override // k.i.h.b.z.p.d.f.f.a
    public void setCanSelect(boolean z) {
    }

    @Override // k.i.h.b.z.p.d.f.f.a
    public void setPlaying(boolean z) {
    }

    @Override // k.i.h.b.z.p.d.f.f.a
    public void setPlayingPositionProvider(n.d0.c.a<Float> aVar) {
    }

    public /* synthetic */ RangeSelector(Context context, AttributeSet attributeSet, int i2, int i3, h hVar) {
    }
}
