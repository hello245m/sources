package j.b.q;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import java.io.FileNotFoundException;
import java.util.WeakHashMap;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class q0 extends j.h.a.c implements View.OnClickListener {

    /* renamed from: l, reason: collision with root package name */
    public final SearchView f2840l;

    /* renamed from: m, reason: collision with root package name */
    public final SearchableInfo f2841m;

    /* renamed from: n, reason: collision with root package name */
    public final Context f2842n;

    /* renamed from: o, reason: collision with root package name */
    public final WeakHashMap<String, Drawable.ConstantState> f2843o;

    /* renamed from: p, reason: collision with root package name */
    public final int f2844p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2845q;

    /* renamed from: r, reason: collision with root package name */
    public int f2846r;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f2847s;

    /* renamed from: t, reason: collision with root package name */
    public int f2848t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class a {
        public final TextView a;
        public final TextView b;
        public final ImageView c;
        public final ImageView d;
        public final ImageView e;

        public a(View view) {
        }
    }

    public q0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
    }

    public static String o(Cursor cursor, String str) {
    }

    public static String w(Cursor cursor, int i2) {
    }

    public final void A(String str, Drawable drawable) {
    }

    public final void B(Cursor cursor) {
    }

    @Override // j.h.a.a, j.h.a.b.a
    public void a(Cursor cursor) {
    }

    @Override // j.h.a.a, j.h.a.b.a
    public CharSequence c(Cursor cursor) {
    }

    @Override // j.h.a.b.a
    public Cursor d(CharSequence charSequence) {
    }

    @Override // j.h.a.a
    public void e(View view, Context context, Cursor cursor) {
    }

    @Override // j.h.a.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
    }

    @Override // j.h.a.a, android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
    }

    @Override // j.h.a.c, j.h.a.a
    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
    }

    public final Drawable k(String str) {
    }

    public final CharSequence l(CharSequence charSequence) {
    }

    public final Drawable m(ComponentName componentName) {
    }

    public final Drawable n(ComponentName componentName) {
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    public final Drawable p() {
    }

    public final Drawable q(Uri uri) {
    }

    public Drawable r(Uri uri) throws FileNotFoundException {
    }

    public final Drawable s(String str) {
    }

    public final Drawable t(Cursor cursor) {
    }

    public final Drawable u(Cursor cursor) {
    }

    public Cursor v(SearchableInfo searchableInfo, String str, int i2) {
    }

    public void x(int i2) {
    }

    public final void y(ImageView imageView, Drawable drawable, int i2) {
    }

    public final void z(TextView textView, CharSequence charSequence) {
    }
}
