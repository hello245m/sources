package j.g.u;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import j.g.r.d;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Locale;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class i {
    public static Field a;
    public static boolean b;
    public static Field c;
    public static boolean d;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class a {
        public static boolean a(TextView textView) {
        }

        public static int b(TextView textView) {
        }

        public static int c(TextView textView) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class b {
        public static Drawable[] a(TextView textView) {
        }

        public static int b(View view) {
        }

        public static int c(View view) {
        }

        public static Locale d(TextView textView) {
        }

        public static void e(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        }

        public static void f(TextView textView, int i2, int i3, int i4, int i5) {
        }

        public static void g(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        }

        public static void h(View view, int i2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class c {
        public static int a(TextView textView) {
        }

        public static ColorStateList b(TextView textView) {
        }

        public static PorterDuff.Mode c(TextView textView) {
        }

        public static int d(TextView textView) {
        }

        public static void e(TextView textView, int i2) {
        }

        public static void f(TextView textView, ColorStateList colorStateList) {
        }

        public static void g(TextView textView, PorterDuff.Mode mode) {
        }

        public static void h(TextView textView, int i2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class d {
        public static DecimalFormatSymbols a(Locale locale) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class e {
        public static String[] a(DecimalFormatSymbols decimalFormatSymbols) {
        }

        public static PrecomputedText.Params b(TextView textView) {
        }

        public static void c(TextView textView, int i2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class f implements ActionMode.Callback {
        public final ActionMode.Callback a;
        public final TextView b;
        public Class<?> c;
        public Method d;
        public boolean e;
        public boolean f;

        public f(ActionMode.Callback callback, TextView textView) {
        }

        public final Intent a() {
        }

        public final Intent b(ResolveInfo resolveInfo, TextView textView) {
        }

        public final List<ResolveInfo> c(Context context, PackageManager packageManager) {
        }

        public final boolean d(TextView textView) {
        }

        public final boolean e(ResolveInfo resolveInfo, Context context) {
        }

        public final void f(Menu menu) {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        }
    }

    public static Drawable[] a(TextView textView) {
    }

    public static int b(TextView textView) {
    }

    public static int c(TextView textView) {
    }

    public static int d(TextView textView) {
    }

    public static int e(TextDirectionHeuristic textDirectionHeuristic) {
    }

    public static TextDirectionHeuristic f(TextView textView) {
    }

    public static d.a g(TextView textView) {
    }

    public static Field h(String str) {
    }

    public static int i(Field field, TextView textView) {
    }

    public static void j(TextView textView, ColorStateList colorStateList) {
    }

    public static void k(TextView textView, PorterDuff.Mode mode) {
    }

    public static void l(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
    }

    public static void m(TextView textView, int i2) {
    }

    public static void n(TextView textView, int i2) {
    }

    public static void o(TextView textView, int i2) {
    }

    public static void p(TextView textView, j.g.r.d dVar) {
    }

    public static void q(TextView textView, int i2) {
    }

    public static void r(TextView textView, d.a aVar) {
    }

    public static ActionMode.Callback s(TextView textView, ActionMode.Callback callback) {
    }
}
