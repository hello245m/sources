package j.b.q;

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
import java.lang.reflect.Method;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class j0 implements j.b.p.j.p {
    public static Method F;
    public static Method G;
    public static Method H;
    public final Handler A;
    public final Rect B;
    public Rect C;
    public boolean D;
    public PopupWindow E;
    public Context a;
    public ListAdapter b;
    public f0 c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2821i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2822j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2823k;

    /* renamed from: l, reason: collision with root package name */
    public int f2824l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2825m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2826n;

    /* renamed from: o, reason: collision with root package name */
    public int f2827o;

    /* renamed from: p, reason: collision with root package name */
    public View f2828p;

    /* renamed from: q, reason: collision with root package name */
    public int f2829q;

    /* renamed from: r, reason: collision with root package name */
    public DataSetObserver f2830r;

    /* renamed from: s, reason: collision with root package name */
    public View f2831s;

    /* renamed from: t, reason: collision with root package name */
    public Drawable f2832t;
    public AdapterView.OnItemClickListener u;
    public AdapterView.OnItemSelectedListener v;
    public final f w;
    public final e x;
    public final d y;
    public final b z;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements AdapterView.OnItemSelectedListener {
        public final /* synthetic */ j0 a;

        public a(j0 j0Var) {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b implements Runnable {
        public final /* synthetic */ j0 a;

        public b(j0 j0Var) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class c extends DataSetObserver {
        public final /* synthetic */ j0 a;

        public c(j0 j0Var) {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class d implements AbsListView.OnScrollListener {
        public final /* synthetic */ j0 a;

        public d(j0 j0Var) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class e implements View.OnTouchListener {
        public final /* synthetic */ j0 a;

        public e(j0 j0Var) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class f implements Runnable {
        public final /* synthetic */ j0 a;

        public f(j0 j0Var) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public j0(Context context) {
    }

    public boolean A() {
    }

    public boolean B() {
    }

    public final void C() {
    }

    public void D(View view) {
    }

    public void E(int i2) {
    }

    public void F(int i2) {
    }

    public void G(int i2) {
    }

    public void H(Rect rect) {
    }

    public void I(int i2) {
    }

    public void J(boolean z) {
    }

    public void K(PopupWindow.OnDismissListener onDismissListener) {
    }

    public void L(AdapterView.OnItemClickListener onItemClickListener) {
    }

    public void M(boolean z) {
    }

    public final void N(boolean z) {
    }

    public void O(int i2) {
    }

    public void P(int i2) {
    }

    public void Q(int i2) {
    }

    public void a(Drawable drawable) {
    }

    @Override // j.b.p.j.p
    public boolean b() {
    }

    public int c() {
    }

    @Override // j.b.p.j.p
    public void dismiss() {
    }

    public void e(int i2) {
    }

    @Override // j.b.p.j.p
    public void h() {
    }

    public Drawable i() {
    }

    @Override // j.b.p.j.p
    public ListView k() {
    }

    public void l(int i2) {
    }

    public int o() {
    }

    public void p(ListAdapter listAdapter) {
    }

    public final int q() {
    }

    public void r() {
    }

    public f0 s(Context context, boolean z) {
    }

    public View t() {
    }

    public final int u(View view, int i2, boolean z) {
    }

    public Object v() {
    }

    public long w() {
    }

    public int x() {
    }

    public View y() {
    }

    public int z() {
    }

    public j0(Context context, AttributeSet attributeSet, int i2) {
    }

    public j0(Context context, AttributeSet attributeSet, int i2, int i3) {
    }
}
