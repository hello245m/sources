package k.i.h.b.d.b1.p;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class v {
    public boolean A;
    public final h a;
    public final g b;
    public final f c;
    public final d d;
    public int e;
    public Context f;
    public y g;
    public ListAdapter h;

    /* renamed from: i, reason: collision with root package name */
    public c f6400i;

    /* renamed from: j, reason: collision with root package name */
    public int f6401j;

    /* renamed from: k, reason: collision with root package name */
    public int f6402k;

    /* renamed from: l, reason: collision with root package name */
    public int f6403l;

    /* renamed from: m, reason: collision with root package name */
    public int f6404m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f6405n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f6406o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f6407p;

    /* renamed from: q, reason: collision with root package name */
    public View f6408q;

    /* renamed from: r, reason: collision with root package name */
    public int f6409r;

    /* renamed from: s, reason: collision with root package name */
    public DataSetObserver f6410s;

    /* renamed from: t, reason: collision with root package name */
    public View f6411t;
    public Drawable u;
    public AdapterView.OnItemClickListener v;
    public AdapterView.OnItemSelectedListener w;
    public Handler x;
    public Rect y;
    public boolean z;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class a implements Runnable {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class b implements AdapterView.OnItemSelectedListener {
        public final /* synthetic */ v a;

        public b(v vVar) {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class c extends ListView {
        public boolean a;
        public boolean b;

        public /* synthetic */ c(Context context, boolean z, a aVar) {
        }

        public static /* synthetic */ boolean a(c cVar, boolean z) {
        }

        public final int b(int i2, int i3, int i4, int i5, int i6) {
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean hasFocus() {
        }

        @Override // android.view.View
        public boolean hasWindowFocus() {
        }

        @Override // android.view.View
        public boolean isFocused() {
        }

        @Override // android.view.View
        public boolean isInTouchMode() {
        }

        public c(Context context, boolean z) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class d implements Runnable {
        public final /* synthetic */ v a;

        public d(v vVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        public /* synthetic */ d(v vVar, a aVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class e extends DataSetObserver {
        public final /* synthetic */ v a;

        public e(v vVar) {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
        }

        public /* synthetic */ e(v vVar, a aVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class f implements AbsListView.OnScrollListener {
        public final /* synthetic */ v a;

        public f(v vVar) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i2) {
        }

        public /* synthetic */ f(v vVar, a aVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class g implements View.OnTouchListener {
        public final /* synthetic */ v a;

        public g(v vVar) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
        }

        public /* synthetic */ g(v vVar, a aVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class h implements Runnable {
        public final /* synthetic */ v a;

        public h(v vVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        public /* synthetic */ h(v vVar, a aVar) {
        }
    }

    public v(Context context, AttributeSet attributeSet, int i2) {
    }

    public static /* synthetic */ h a(v vVar) {
    }

    public static /* synthetic */ Handler b(v vVar) {
    }

    public static /* synthetic */ View c(v vVar) {
    }

    public static /* synthetic */ ListAdapter d(v vVar) {
    }

    public static /* synthetic */ c e(v vVar) {
    }

    public static /* synthetic */ y f(v vVar) {
    }

    public void A(int i2) {
    }

    public void B() {
    }

    public final int g() {
    }

    public void h() {
    }

    public void i() {
    }

    public View j() {
    }

    public ListView k() {
    }

    public int l(View view, int i2, boolean z) {
    }

    public boolean m() {
    }

    public boolean n() {
    }

    public final void o() {
    }

    public void p(ListAdapter listAdapter) {
    }

    public void q(View view) {
    }

    public void r(int i2) {
    }

    public void s(Drawable drawable) {
    }

    public void t(int i2) {
    }

    public void u(int i2) {
    }

    public void v(int i2) {
    }

    public void w(boolean z) {
    }

    public void x(PopupWindow.OnDismissListener onDismissListener) {
    }

    public void y(AdapterView.OnItemClickListener onItemClickListener) {
    }

    public void z(int i2) {
    }
}
