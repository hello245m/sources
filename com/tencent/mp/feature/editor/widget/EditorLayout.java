package com.tencent.mp.feature.editor.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import j.e.c.d;
import j.g.t.k;
import k.i.h.b.b.a.s.n.g;
import n.d;
import n.d0.c.l;
import n.d0.d.o;
import n.u;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class EditorLayout extends g {

    /* renamed from: n, reason: collision with root package name */
    public n.d0.c.a<u> f1489n;

    /* renamed from: o, reason: collision with root package name */
    public final d f1490o;

    /* renamed from: p, reason: collision with root package name */
    public final d f1491p;

    /* renamed from: q, reason: collision with root package name */
    public final d f1492q;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public final class a extends GestureDetector.SimpleOnGestureListener {
        public final /* synthetic */ EditorLayout a;

        public a(EditorLayout editorLayout) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class b extends o implements l<j.e.c.d, u> {
        public final /* synthetic */ l<d.a, u> a;

        public b(l<? super d.a, u> lVar) {
        }

        public final void b(j.e.c.d dVar) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ u invoke(j.e.c.d dVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class c extends o implements l<d.a, u> {
        public final /* synthetic */ int a;

        public c(int i2) {
        }

        public final void b(d.a aVar) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ u invoke(d.a aVar) {
        }
    }

    public EditorLayout(Context context, AttributeSet attributeSet) {
    }

    public static final /* synthetic */ EditorWebView f(EditorLayout editorLayout) {
    }

    public static final /* synthetic */ n.d0.c.a g(EditorLayout editorLayout) {
    }

    private final EditorWebView getEditorWebView() {
    }

    private final k getMDetector() {
    }

    private final EditText getTitleET() {
    }

    public static final /* synthetic */ EditText h(EditorLayout editorLayout) {
    }

    @Override // k.i.h.b.d.b1.p.m
    public void e(View[] viewArr, int i2) {
    }

    @Override // k.i.h.b.d.b1.p.m
    public View[] getPanelViews() {
    }

    public final void i() {
    }

    public final void j() {
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
    }

    @Override // k.i.h.b.b.a.s.n.g, k.i.h.b.d.b1.p.m, android.widget.LinearLayout, android.view.View
    public void onMeasure(int i2, int i3) {
    }

    public final void setOnScrollTriggerListener(n.d0.c.a<u> aVar) {
    }
}
