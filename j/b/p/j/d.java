package j.b.p.j;

import android.content.Context;
import android.os.Handler;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ListView;
import android.widget.PopupWindow;
import j.b.p.j.m;
import j.b.q.k0;
import j.b.q.l0;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class d extends k implements m, View.OnKeyListener, PopupWindow.OnDismissListener {
    public static final int B = 0;
    public boolean A;
    public final Context b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public final Handler g;
    public final List<g> h;

    /* renamed from: i, reason: collision with root package name */
    public final List<C0115d> f2733i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f2734j;

    /* renamed from: k, reason: collision with root package name */
    public final View.OnAttachStateChangeListener f2735k;

    /* renamed from: l, reason: collision with root package name */
    public final k0 f2736l;

    /* renamed from: m, reason: collision with root package name */
    public int f2737m;

    /* renamed from: n, reason: collision with root package name */
    public int f2738n;

    /* renamed from: o, reason: collision with root package name */
    public View f2739o;

    /* renamed from: p, reason: collision with root package name */
    public View f2740p;

    /* renamed from: q, reason: collision with root package name */
    public int f2741q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2742r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2743s;

    /* renamed from: t, reason: collision with root package name */
    public int f2744t;
    public int u;
    public boolean v;
    public boolean w;
    public m.a x;
    public ViewTreeObserver y;
    public PopupWindow.OnDismissListener z;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ d a;

        public a(d dVar) {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b implements View.OnAttachStateChangeListener {
        public final /* synthetic */ d a;

        public b(d dVar) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class c implements k0 {
        public final /* synthetic */ d a;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a implements Runnable {
            public final /* synthetic */ C0115d a;
            public final /* synthetic */ MenuItem b;
            public final /* synthetic */ g c;
            public final /* synthetic */ c d;

            public a(c cVar, C0115d c0115d, MenuItem menuItem, g gVar) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public c(d dVar) {
        }

        @Override // j.b.q.k0
        public void d(g gVar, MenuItem menuItem) {
        }

        @Override // j.b.q.k0
        public void g(g gVar, MenuItem menuItem) {
        }
    }

    /* renamed from: j.b.p.j.d$d, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class C0115d {
        public final l0 a;
        public final g b;
        public final int c;

        public C0115d(l0 l0Var, g gVar, int i2) {
        }

        public ListView a() {
        }
    }

    public d(Context context, View view, int i2, int i3, boolean z) {
    }

    public final l0 B() {
    }

    public final int C(g gVar) {
    }

    public final MenuItem D(g gVar, g gVar2) {
    }

    public final View E(C0115d c0115d, g gVar) {
    }

    public final int F() {
    }

    public final int G(int i2) {
    }

    public final void H(g gVar) {
    }

    @Override // j.b.p.j.m
    public void a(g gVar, boolean z) {
    }

    @Override // j.b.p.j.p
    public boolean b() {
    }

    @Override // j.b.p.j.m
    public void c(boolean z) {
    }

    @Override // j.b.p.j.m
    public boolean d() {
    }

    @Override // j.b.p.j.p
    public void dismiss() {
    }

    @Override // j.b.p.j.m
    public void g(m.a aVar) {
    }

    @Override // j.b.p.j.p
    public void h() {
    }

    @Override // j.b.p.j.m
    public void j(Parcelable parcelable) {
    }

    @Override // j.b.p.j.p
    public ListView k() {
    }

    @Override // j.b.p.j.m
    public boolean l(r rVar) {
    }

    @Override // j.b.p.j.m
    public Parcelable m() {
    }

    @Override // j.b.p.j.k
    public void n(g gVar) {
    }

    @Override // j.b.p.j.k
    public boolean o() {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
    }

    @Override // j.b.p.j.k
    public void r(View view) {
    }

    @Override // j.b.p.j.k
    public void t(boolean z) {
    }

    @Override // j.b.p.j.k
    public void u(int i2) {
    }

    @Override // j.b.p.j.k
    public void v(int i2) {
    }

    @Override // j.b.p.j.k
    public void w(PopupWindow.OnDismissListener onDismissListener) {
    }

    @Override // j.b.p.j.k
    public void x(boolean z) {
    }

    @Override // j.b.p.j.k
    public void y(int i2) {
    }
}
