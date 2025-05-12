package j.b.q;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ListView;
import java.lang.reflect.Field;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class f0 extends ListView {
    public final Rect a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public Field g;
    public a h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2807i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2808j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2809k;

    /* renamed from: l, reason: collision with root package name */
    public j.g.t.k0 f2810l;

    /* renamed from: m, reason: collision with root package name */
    public j.g.u.f f2811m;

    /* renamed from: n, reason: collision with root package name */
    public b f2812n;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class a extends j.b.m.a.c {
        public boolean b;

        public a(Drawable drawable) {
        }

        public void c(boolean z) {
        }

        @Override // j.b.m.a.c, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
        }

        @Override // j.b.m.a.c, android.graphics.drawable.Drawable
        public void setHotspot(float f, float f2) {
        }

        @Override // j.b.m.a.c, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i2, int i3, int i4, int i5) {
        }

        @Override // j.b.m.a.c, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
        }

        @Override // j.b.m.a.c, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z, boolean z2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b implements Runnable {
        public final /* synthetic */ f0 a;

        public b(f0 f0Var) {
        }

        public void a() {
        }

        public void b() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public f0(Context context, boolean z) {
    }

    private void setSelectorEnabled(boolean z) {
    }

    public final void a() {
    }

    public final void b(View view, int i2) {
    }

    public final void c(Canvas canvas) {
    }

    public int d(int i2, int i3, int i4, int i5, int i6) {
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
    }

    public boolean e(MotionEvent motionEvent, int i2) {
    }

    public final void f(int i2, View view) {
    }

    public final void g(int i2, View view) {
    }

    public final void h(int i2, View view, float f, float f2) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
    }

    public final void i(View view, int i2, float f, float f2) {
    }

    @Override // android.view.View
    public boolean isFocused() {
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
    }

    public final boolean j() {
    }

    public final void k() {
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    public void setListSelectionHidden(boolean z) {
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
    }
}
