package com.tencent.mp.feature.editor.widget.makeimage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import j.g.t.t;
import k.i.h.b.d.b1.g.g;
import n.d;
import n.d0.c.l;
import n.d0.d.o;
import n.u;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class MakeImageView extends FrameLayout implements t {
    public final d a;
    public k.i.h.b.k.s.a0.d b;
    public int c;
    public int d;
    public GestureImageView e;
    public final ResizableView f;
    public final View g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public int f1498i;

    /* renamed from: j, reason: collision with root package name */
    public int f1499j;

    /* renamed from: k, reason: collision with root package name */
    public final Rect f1500k;

    /* renamed from: l, reason: collision with root package name */
    public final Rect f1501l;

    /* renamed from: m, reason: collision with root package name */
    public g f1502m;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a extends o implements l<Integer, u> {
        public final /* synthetic */ MakeImageView a;

        public a(MakeImageView makeImageView) {
        }

        public final void b(int i2) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ u invoke(Integer num) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class b extends o implements n.d0.c.a<Integer> {
        public final /* synthetic */ Context a;

        public b(Context context) {
        }

        public final Integer b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ Integer invoke() {
        }
    }

    public MakeImageView(Context context, AttributeSet attributeSet) {
    }

    public static final /* synthetic */ int a(MakeImageView makeImageView) {
    }

    private final int getTouchSlop() {
    }

    public final void b() {
    }

    public final void c(boolean z) {
    }

    public final void d(k.i.h.b.k.o.j2.d.d dVar) {
    }

    public final void e() {
    }

    public final void f(boolean z) {
    }

    public final GestureImageView getImageView() {
    }

    public final boolean getInEditMode() {
    }

    public final int getLastHeight() {
    }

    public final View getMaskView() {
    }

    public final int getMaxHeight() {
    }

    public final int getMinHeight() {
    }

    public final ResizableView getOverlayView() {
    }

    public final int getStyle() {
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    public final void setImageView(GestureImageView gestureImageView) {
    }

    public final void setInEditMode(boolean z) {
    }

    public final void setLastHeight(int i2) {
    }

    public final void setMakeImageListener(k.i.h.b.k.s.a0.d dVar) {
    }

    public final void setMaxHeight(int i2) {
    }

    public final void setMinHeight(int i2) {
    }

    public final void setStyle(int i2) {
    }
}
