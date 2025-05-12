package j.b.m.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class b extends Drawable implements Drawable.Callback {
    public d a;
    public Rect b;
    public Drawable c;
    public Drawable d;
    public int e;
    public boolean f;
    public int g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public Runnable f2684i;

    /* renamed from: j, reason: collision with root package name */
    public long f2685j;

    /* renamed from: k, reason: collision with root package name */
    public long f2686k;

    /* renamed from: l, reason: collision with root package name */
    public c f2687l;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements Runnable {
        public final /* synthetic */ b a;

        public a(b bVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: j.b.m.a.b$b, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class C0114b {
        public static boolean a(Drawable.ConstantState constantState) {
        }

        public static void b(Drawable drawable, Outline outline) {
        }

        public static Resources c(Resources.Theme theme) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class c implements Drawable.Callback {
        public Drawable.Callback a;

        public Drawable.Callback a() {
        }

        public c b(Drawable.Callback callback) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class d extends Drawable.ConstantState {
        public int A;
        public int B;
        public boolean C;
        public ColorFilter D;
        public boolean E;
        public ColorStateList F;
        public PorterDuff.Mode G;
        public boolean H;
        public boolean I;
        public final b a;
        public Resources b;
        public int c;
        public int d;
        public int e;
        public SparseArray<Drawable.ConstantState> f;
        public Drawable[] g;
        public int h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f2688i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f2689j;

        /* renamed from: k, reason: collision with root package name */
        public Rect f2690k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f2691l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f2692m;

        /* renamed from: n, reason: collision with root package name */
        public int f2693n;

        /* renamed from: o, reason: collision with root package name */
        public int f2694o;

        /* renamed from: p, reason: collision with root package name */
        public int f2695p;

        /* renamed from: q, reason: collision with root package name */
        public int f2696q;

        /* renamed from: r, reason: collision with root package name */
        public boolean f2697r;

        /* renamed from: s, reason: collision with root package name */
        public int f2698s;

        /* renamed from: t, reason: collision with root package name */
        public boolean f2699t;
        public boolean u;
        public boolean v;
        public boolean w;
        public boolean x;
        public boolean y;
        public int z;

        public d(d dVar, b bVar, Resources resources) {
        }

        public final int a(Drawable drawable) {
        }

        public final void b(Resources.Theme theme) {
        }

        public boolean c() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
        }

        public void d() {
        }

        public final void e() {
        }

        public final int f() {
        }

        public final Drawable g(int i2) {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
        }

        public final int h() {
        }

        public final int i() {
        }

        public final int j() {
        }

        public final int k() {
        }

        public final Rect l() {
        }

        public final int m() {
        }

        public final int n() {
        }

        public void o(int i2, int i3) {
        }

        public void p() {
        }

        public final boolean q() {
        }

        public abstract void r();

        public final Drawable s(Drawable drawable) {
        }

        public final void t(boolean z) {
        }

        public final void u(int i2) {
        }

        public final void v(int i2) {
        }

        public final boolean w(int i2, int i3) {
        }

        public final void x(boolean z) {
        }

        public final void y(Resources resources) {
        }
    }

    public static int f(Resources resources, int i2) {
    }

    public void a(boolean z) {
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
    }

    public d b() {
    }

    public int c() {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
    }

    public final void d(Drawable drawable) {
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
    }

    public final boolean e() {
    }

    public boolean g(int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
    }

    public void h(d dVar) {
    }

    public final void i(Resources resources) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i2, int i3, int i4, int i5) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }
}
