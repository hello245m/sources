package j.b.q;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatImageView;
import j.b.p.j.m;
import j.b.p.j.n;
import j.g.t.h;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class c extends j.b.p.j.b implements h.a {
    public b A;
    public final f B;
    public int C;

    /* renamed from: j, reason: collision with root package name */
    public d f2793j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f2794k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2795l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2796m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2797n;

    /* renamed from: o, reason: collision with root package name */
    public int f2798o;

    /* renamed from: p, reason: collision with root package name */
    public int f2799p;

    /* renamed from: q, reason: collision with root package name */
    public int f2800q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2801r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2802s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2803t;
    public boolean u;
    public int v;
    public final SparseBooleanArray w;
    public e x;
    public a y;
    public RunnableC0117c z;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a extends j.b.p.j.l {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ c f2804m;

        public a(c cVar, Context context, j.b.p.j.r rVar, View view) {
        }

        @Override // j.b.p.j.l
        public void e() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b extends ActionMenuItemView.b {
        public final /* synthetic */ c a;

        public b(c cVar) {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public j.b.p.j.p a() {
        }
    }

    /* renamed from: j.b.q.c$c, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class RunnableC0117c implements Runnable {
        public e a;
        public final /* synthetic */ c b;

        public RunnableC0117c(c cVar, e eVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class d extends AppCompatImageView implements ActionMenuView.a {
        public final /* synthetic */ c c;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a extends h0 {

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ d f2805j;

            public a(d dVar, View view, c cVar) {
            }

            @Override // j.b.q.h0
            public j.b.p.j.p b() {
            }

            @Override // j.b.q.h0
            public boolean c() {
            }

            @Override // j.b.q.h0
            public boolean d() {
            }
        }

        public d(c cVar, Context context) {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
        }

        @Override // android.view.View
        public boolean performClick() {
        }

        @Override // android.widget.ImageView
        public boolean setFrame(int i2, int i3, int i4, int i5) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class e extends j.b.p.j.l {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ c f2806m;

        public e(c cVar, Context context, j.b.p.j.g gVar, View view, boolean z) {
        }

        @Override // j.b.p.j.l
        public void e() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class f implements m.a {
        public final /* synthetic */ c a;

        public f(c cVar) {
        }

        @Override // j.b.p.j.m.a
        public void a(j.b.p.j.g gVar, boolean z) {
        }

        @Override // j.b.p.j.m.a
        public boolean b(j.b.p.j.g gVar) {
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class g implements Parcelable {
        public static final Parcelable.Creator<g> CREATOR = null;
        public int a;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a implements Parcelable.Creator<g> {
            public g a(Parcel parcel) {
            }

            public g[] b(int i2) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ g createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ g[] newArray(int i2) {
            }
        }

        public g() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
        }

        public g(Parcel parcel) {
        }
    }

    public c(Context context) {
    }

    public static /* synthetic */ j.b.p.j.g t(c cVar) {
    }

    public static /* synthetic */ j.b.p.j.g u(c cVar) {
    }

    public static /* synthetic */ j.b.p.j.n v(c cVar) {
    }

    public static /* synthetic */ j.b.p.j.g w(c cVar) {
    }

    public static /* synthetic */ j.b.p.j.g x(c cVar) {
    }

    public static /* synthetic */ j.b.p.j.g y(c cVar) {
    }

    public static /* synthetic */ j.b.p.j.n z(c cVar) {
    }

    public boolean A() {
    }

    public final View B(MenuItem menuItem) {
    }

    public Drawable C() {
    }

    public boolean D() {
    }

    public boolean E() {
    }

    public boolean F() {
    }

    public boolean G() {
    }

    public void H(Configuration configuration) {
    }

    public void I(boolean z) {
    }

    public void J(ActionMenuView actionMenuView) {
    }

    public void K(Drawable drawable) {
    }

    public void L(boolean z) {
    }

    public boolean M() {
    }

    @Override // j.b.p.j.b, j.b.p.j.m
    public void a(j.b.p.j.g gVar, boolean z) {
    }

    @Override // j.b.p.j.b, j.b.p.j.m
    public void c(boolean z) {
    }

    @Override // j.b.p.j.m
    public boolean d() {
    }

    @Override // j.b.p.j.b
    public void h(j.b.p.j.i iVar, n.a aVar) {
    }

    @Override // j.b.p.j.b, j.b.p.j.m
    public void i(Context context, j.b.p.j.g gVar) {
    }

    @Override // j.b.p.j.m
    public void j(Parcelable parcelable) {
    }

    @Override // j.b.p.j.b, j.b.p.j.m
    public boolean l(j.b.p.j.r rVar) {
    }

    @Override // j.b.p.j.m
    public Parcelable m() {
    }

    @Override // j.b.p.j.b
    public boolean n(ViewGroup viewGroup, int i2) {
    }

    @Override // j.b.p.j.b
    public View p(j.b.p.j.i iVar, View view, ViewGroup viewGroup) {
    }

    @Override // j.b.p.j.b
    public j.b.p.j.n q(ViewGroup viewGroup) {
    }

    @Override // j.b.p.j.b
    public boolean s(int i2, j.b.p.j.i iVar) {
    }
}
