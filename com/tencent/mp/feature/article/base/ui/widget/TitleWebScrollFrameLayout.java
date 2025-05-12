package com.tencent.mp.feature.article.base.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.xweb.WebView;
import j.g.t.k;
import n.d;
import n.d0.d.o;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class TitleWebScrollFrameLayout extends FrameLayout {
    public View a;
    public WebView b;
    public final d c;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public final class a extends GestureDetector.SimpleOnGestureListener {
        public final /* synthetic */ TitleWebScrollFrameLayout a;

        public a(TitleWebScrollFrameLayout titleWebScrollFrameLayout) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class b extends o implements n.d0.c.a<k> {
        public final /* synthetic */ Context a;
        public final /* synthetic */ TitleWebScrollFrameLayout b;

        public b(Context context, TitleWebScrollFrameLayout titleWebScrollFrameLayout) {
        }

        public final k b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ k invoke() {
        }
    }

    public TitleWebScrollFrameLayout(Context context, AttributeSet attributeSet) {
    }

    public static final /* synthetic */ View a(TitleWebScrollFrameLayout titleWebScrollFrameLayout) {
    }

    public static final /* synthetic */ WebView b(TitleWebScrollFrameLayout titleWebScrollFrameLayout) {
    }

    private final k getDetector() {
    }

    @Override // android.view.View
    public void onFinishInflate() {
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
    }
}
