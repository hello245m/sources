package j.b.q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class m0 {
    public static final PorterDuff.Mode h = null;

    /* renamed from: i, reason: collision with root package name */
    public static m0 f2837i;

    /* renamed from: j, reason: collision with root package name */
    public static final c f2838j = null;
    public WeakHashMap<Context, j.d.h<ColorStateList>> a;
    public j.d.g<String, e> b;
    public j.d.h<String> c;
    public final WeakHashMap<Context, j.d.d<WeakReference<Drawable.ConstantState>>> d;
    public TypedValue e;
    public boolean f;
    public f g;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class a implements e {
        @Override // j.b.q.m0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class b implements e {
        @Override // j.b.q.m0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class c extends j.d.e<Integer, PorterDuffColorFilter> {
        public c(int i2) {
        }

        public static int i(int i2, PorterDuff.Mode mode) {
        }

        public PorterDuffColorFilter j(int i2, PorterDuff.Mode mode) {
        }

        public PorterDuffColorFilter k(int i2, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class d implements e {
        @Override // j.b.q.m0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface e {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface f {
        boolean a(Context context, int i2, Drawable drawable);

        PorterDuff.Mode b(int i2);

        Drawable c(m0 m0Var, Context context, int i2);

        ColorStateList d(Context context, int i2);

        boolean e(Context context, int i2, Drawable drawable);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class g implements e {
        @Override // j.b.q.m0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        }
    }

    public static long e(TypedValue typedValue) {
    }

    public static PorterDuffColorFilter g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
    }

    public static synchronized m0 h() {
    }

    public static synchronized PorterDuffColorFilter l(int i2, PorterDuff.Mode mode) {
    }

    public static void p(m0 m0Var) {
    }

    public static boolean q(Drawable drawable) {
    }

    public static void w(Drawable drawable, u0 u0Var, int[] iArr) {
    }

    public final void a(String str, e eVar) {
    }

    public final synchronized boolean b(Context context, long j2, Drawable drawable) {
    }

    public final void c(Context context, int i2, ColorStateList colorStateList) {
    }

    public final void d(Context context) {
    }

    public final Drawable f(Context context, int i2) {
    }

    public final synchronized Drawable i(Context context, long j2) {
    }

    public synchronized Drawable j(Context context, int i2) {
    }

    public synchronized Drawable k(Context context, int i2, boolean z) {
    }

    public synchronized ColorStateList m(Context context, int i2) {
    }

    public final ColorStateList n(Context context, int i2) {
    }

    public PorterDuff.Mode o(int i2) {
    }

    public final Drawable r(Context context, int i2) {
    }

    public synchronized void s(Context context) {
    }

    public synchronized Drawable t(Context context, b1 b1Var, int i2) {
    }

    public synchronized void u(f fVar) {
    }

    public final Drawable v(Context context, int i2, boolean z, Drawable drawable) {
    }

    public boolean x(Context context, int i2, Drawable drawable) {
    }
}
