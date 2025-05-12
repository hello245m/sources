package j.g.k.f;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.SparseArray;
import android.util.TypedValue;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class j {
    public static final ThreadLocal<TypedValue> a = null;
    public static final WeakHashMap<d, SparseArray<c>> b = null;
    public static final Object c = null;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class a {
        public static Drawable a(Resources resources, int i2, Resources.Theme theme) {
        }

        public static Drawable b(Resources resources, int i2, int i3, Resources.Theme theme) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class b {
        public static int a(Resources resources, int i2, Resources.Theme theme) {
        }

        public static ColorStateList b(Resources resources, int i2, Resources.Theme theme) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class c {
        public final ColorStateList a;
        public final Configuration b;
        public final int c;

        public c(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class d {
        public final Resources a;
        public final Resources.Theme b;

        public d(Resources resources, Resources.Theme theme) {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class e {
        public static Handler c(Handler handler) {
        }

        private /* synthetic */ void d(int i2) {
        }

        private /* synthetic */ void f(Typeface typeface) {
        }

        public final void a(int i2, Handler handler) {
        }

        public final void b(Typeface typeface, Handler handler) {
        }

        public /* synthetic */ void e(int i2) {
        }

        public /* synthetic */ void g(Typeface typeface) {
        }

        public abstract void h(int i2);

        public abstract void i(Typeface typeface);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class f {

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public static class a {
            public static final Object a = null;
            public static Method b;
            public static boolean c;

            @SuppressLint({"BanUncheckedReflection"})
            public static void a(Resources.Theme theme) {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public static class b {
            public static void a(Resources.Theme theme) {
            }
        }

        public static void a(Resources.Theme theme) {
        }
    }

    public static void a(d dVar, int i2, ColorStateList colorStateList, Resources.Theme theme) {
    }

    public static ColorStateList b(d dVar, int i2) {
    }

    public static ColorStateList c(Resources resources, int i2, Resources.Theme theme) throws Resources.NotFoundException {
    }

    public static Drawable d(Resources resources, int i2, Resources.Theme theme) throws Resources.NotFoundException {
    }

    public static Typeface e(Context context, int i2) throws Resources.NotFoundException {
    }

    public static Typeface f(Context context, int i2, TypedValue typedValue, int i3, e eVar) throws Resources.NotFoundException {
    }

    public static void g(Context context, int i2, e eVar, Handler handler) throws Resources.NotFoundException {
    }

    public static TypedValue h() {
    }

    public static ColorStateList i(Resources resources, int i2, Resources.Theme theme) {
    }

    public static boolean j(Resources resources, int i2) {
    }

    public static Typeface k(Context context, int i2, TypedValue typedValue, int i3, e eVar, Handler handler, boolean z, boolean z2) {
    }

    public static Typeface l(Context context, Resources resources, TypedValue typedValue, int i2, int i3, e eVar, Handler handler, boolean z, boolean z2) {
    }
}
