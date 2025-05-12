package j.b.k;

import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import j.b.p.b;
import j.b.p.j.g;
import j.b.p.j.m;
import j.b.q.c0;
import j.b.q.g0;
import j.g.t.k0;
import j.g.t.m0;
import j.g.t.p0;
import j.g.t.z;
import java.lang.Thread;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class g extends j.b.k.f implements g.a, LayoutInflater.Factory2 {
    public static final j.d.g<String, Integer> h0 = null;
    public static final boolean i0 = false;
    public static final int[] j0 = null;
    public static final boolean k0 = false;
    public static final boolean l0 = false;
    public static boolean m0;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public u[] G;
    public u H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public int N;
    public int O;
    public boolean P;
    public boolean Q;
    public q R;
    public q S;
    public boolean T;
    public int U;
    public final Runnable V;
    public boolean W;
    public Rect X;
    public Rect Y;
    public j.b.k.i Z;
    public final Object d;
    public final Context e;
    public Window f;
    public o g;
    public j.b.k.j g0;
    public final j.b.k.e h;

    /* renamed from: i, reason: collision with root package name */
    public j.b.k.a f2643i;

    /* renamed from: j, reason: collision with root package name */
    public MenuInflater f2644j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f2645k;

    /* renamed from: l, reason: collision with root package name */
    public c0 f2646l;

    /* renamed from: m, reason: collision with root package name */
    public i f2647m;

    /* renamed from: n, reason: collision with root package name */
    public v f2648n;

    /* renamed from: o, reason: collision with root package name */
    public j.b.p.b f2649o;

    /* renamed from: p, reason: collision with root package name */
    public ActionBarContextView f2650p;

    /* renamed from: q, reason: collision with root package name */
    public PopupWindow f2651q;

    /* renamed from: r, reason: collision with root package name */
    public Runnable f2652r;

    /* renamed from: s, reason: collision with root package name */
    public k0 f2653s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2654t;
    public boolean u;
    public ViewGroup v;
    public TextView w;
    public View x;
    public boolean y;
    public boolean z;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements Thread.UncaughtExceptionHandler {
        public final /* synthetic */ Thread.UncaughtExceptionHandler a;

        public a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        }

        public final boolean a(Throwable th) {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b implements Runnable {
        public final /* synthetic */ g a;

        public b(g gVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class c implements z {
        public final /* synthetic */ g a;

        public c(g gVar) {
        }

        @Override // j.g.t.z
        public p0 a(View view, p0 p0Var) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class d implements g0.a {
        public final /* synthetic */ g a;

        public d(g gVar) {
        }

        @Override // j.b.q.g0.a
        public void a(Rect rect) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class e implements ContentFrameLayout.a {
        public final /* synthetic */ g a;

        public e(g gVar) {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class f implements Runnable {
        public final /* synthetic */ g a;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a extends m0 {
            public final /* synthetic */ f a;

            public a(f fVar) {
            }

            @Override // j.g.t.l0
            public void b(View view) {
            }

            @Override // j.g.t.m0, j.g.t.l0
            public void c(View view) {
            }
        }

        public f(g gVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: j.b.k.g$g, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class C0111g extends m0 {
        public final /* synthetic */ g a;

        public C0111g(g gVar) {
        }

        @Override // j.g.t.l0
        public void b(View view) {
        }

        @Override // j.g.t.m0, j.g.t.l0
        public void c(View view) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class h implements j.b.k.b {
        public h(g gVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public final class i implements m.a {
        public final /* synthetic */ g a;

        public i(g gVar) {
        }

        @Override // j.b.p.j.m.a
        public void a(j.b.p.j.g gVar, boolean z) {
        }

        @Override // j.b.p.j.m.a
        public boolean b(j.b.p.j.g gVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class j implements b.a {
        public b.a a;
        public final /* synthetic */ g b;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a extends m0 {
            public final /* synthetic */ j a;

            public a(j jVar) {
            }

            @Override // j.g.t.l0
            public void b(View view) {
            }
        }

        public j(g gVar, b.a aVar) {
        }

        @Override // j.b.p.b.a
        public void a(j.b.p.b bVar) {
        }

        @Override // j.b.p.b.a
        public boolean b(j.b.p.b bVar, Menu menu) {
        }

        @Override // j.b.p.b.a
        public boolean c(j.b.p.b bVar, Menu menu) {
        }

        @Override // j.b.p.b.a
        public boolean d(j.b.p.b bVar, MenuItem menuItem) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class k {
        public static Context a(Context context, Configuration configuration) {
        }

        public static void b(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class l {
        public static boolean a(PowerManager powerManager) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class m {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class n {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class p extends q {
        public final PowerManager c;
        public final /* synthetic */ g d;

        public p(g gVar, Context context) {
        }

        @Override // j.b.k.g.q
        public IntentFilter b() {
        }

        @Override // j.b.k.g.q
        public int c() {
        }

        @Override // j.b.k.g.q
        public void d() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public abstract class q {
        public BroadcastReceiver a;
        public final /* synthetic */ g b;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a extends BroadcastReceiver {
            public final /* synthetic */ q a;

            public a(q qVar) {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
            }
        }

        public q(g gVar) {
        }

        public void a() {
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public void e() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class r extends q {
        public final j.b.k.n c;
        public final /* synthetic */ g d;

        public r(g gVar, j.b.k.n nVar) {
        }

        @Override // j.b.k.g.q
        public IntentFilter b() {
        }

        @Override // j.b.k.g.q
        public int c() {
        }

        @Override // j.b.k.g.q
        public void d() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class s {
        public static void a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class t extends ContentFrameLayout {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ g f2655i;

        public t(g gVar, Context context) {
        }

        public final boolean c(int i2, int i3) {
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        }

        @Override // android.view.View
        public void setBackgroundResource(int i2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class u {
        public int a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public ViewGroup g;
        public View h;

        /* renamed from: i, reason: collision with root package name */
        public View f2656i;

        /* renamed from: j, reason: collision with root package name */
        public j.b.p.j.g f2657j;

        /* renamed from: k, reason: collision with root package name */
        public j.b.p.j.e f2658k;

        /* renamed from: l, reason: collision with root package name */
        public Context f2659l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f2660m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f2661n;

        /* renamed from: o, reason: collision with root package name */
        public boolean f2662o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f2663p;

        /* renamed from: q, reason: collision with root package name */
        public boolean f2664q;

        /* renamed from: r, reason: collision with root package name */
        public boolean f2665r;

        /* renamed from: s, reason: collision with root package name */
        public Bundle f2666s;

        public u(int i2) {
        }

        public j.b.p.j.n a(m.a aVar) {
        }

        public boolean b() {
        }

        public void c(j.b.p.j.g gVar) {
        }

        public void d(Context context) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public final class v implements m.a {
        public final /* synthetic */ g a;

        public v(g gVar) {
        }

        @Override // j.b.p.j.m.a
        public void a(j.b.p.j.g gVar, boolean z) {
        }

        @Override // j.b.p.j.m.a
        public boolean b(j.b.p.j.g gVar) {
        }
    }

    public g(Activity activity, j.b.k.e eVar) {
    }

    public static Configuration c0(Configuration configuration, Configuration configuration2) {
    }

    @Override // j.b.k.f
    public boolean A(int i2) {
    }

    public final void A0(u uVar, KeyEvent keyEvent) {
    }

    @Override // j.b.k.f
    public void B(int i2) {
    }

    public final j.b.k.a B0() {
    }

    @Override // j.b.k.f
    public void C(View view) {
    }

    public final boolean C0(u uVar, int i2, KeyEvent keyEvent, int i3) {
    }

    @Override // j.b.k.f
    public void D(View view, ViewGroup.LayoutParams layoutParams) {
    }

    public final boolean D0(u uVar, KeyEvent keyEvent) {
    }

    @Override // j.b.k.f
    public void E(Toolbar toolbar) {
    }

    public final void E0(boolean z) {
    }

    @Override // j.b.k.f
    public void F(int i2) {
    }

    public final int F0(int i2) {
    }

    @Override // j.b.k.f
    public final void G(CharSequence charSequence) {
    }

    public final boolean G0() {
    }

    @Override // j.b.k.f
    public j.b.p.b H(b.a aVar) {
    }

    public final boolean H0(ViewParent viewParent) {
    }

    public boolean I() {
    }

    public j.b.p.b I0(b.a aVar) {
    }

    public final boolean J(boolean z) {
    }

    public final void J0() {
    }

    public final void K() {
    }

    public final j.b.k.d K0() {
    }

    public final void L(Window window) {
    }

    public final boolean L0(int i2, boolean z) {
    }

    public final int M() {
    }

    public final void M0(int i2, boolean z, Configuration configuration) {
    }

    public void N(int i2, u uVar, Menu menu) {
    }

    public final int N0(p0 p0Var, Rect rect) {
    }

    public void O(j.b.p.j.g gVar) {
    }

    public final void O0(View view) {
    }

    public final void P() {
    }

    public void Q(int i2) {
    }

    public void R(u uVar, boolean z) {
    }

    public final Configuration S(Context context, int i2, Configuration configuration) {
    }

    public final ViewGroup T() {
    }

    public View U(View view, String str, Context context, AttributeSet attributeSet) {
    }

    public void V() {
    }

    public boolean W(KeyEvent keyEvent) {
    }

    public void X(int i2) {
    }

    public void Y() {
    }

    public final void Z() {
    }

    @Override // j.b.p.j.g.a
    public boolean a(j.b.p.j.g gVar, MenuItem menuItem) {
    }

    public final void a0() {
    }

    @Override // j.b.p.j.g.a
    public void b(j.b.p.j.g gVar) {
    }

    public u b0(Menu menu) {
    }

    @Override // j.b.k.f
    public void d(View view, ViewGroup.LayoutParams layoutParams) {
    }

    public final Context d0() {
    }

    public final q e0(Context context) {
    }

    @Override // j.b.k.f
    public Context f(Context context) {
    }

    public final q f0(Context context) {
    }

    public u g0(int i2, boolean z) {
    }

    public final CharSequence h0() {
    }

    @Override // j.b.k.f
    public <T extends View> T i(int i2) {
    }

    public final Window.Callback i0() {
    }

    public final void j0() {
    }

    @Override // j.b.k.f
    public final j.b.k.b k() {
    }

    public final boolean k0(u uVar) {
    }

    @Override // j.b.k.f
    public int l() {
    }

    public final boolean l0(u uVar) {
    }

    @Override // j.b.k.f
    public MenuInflater m() {
    }

    public final boolean m0(u uVar) {
    }

    @Override // j.b.k.f
    public j.b.k.a n() {
    }

    public final void n0(int i2) {
    }

    @Override // j.b.k.f
    public void o() {
    }

    public final boolean o0() {
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
    }

    @Override // j.b.k.f
    public void p() {
    }

    public boolean p0() {
    }

    @Override // j.b.k.f
    public void q(Configuration configuration) {
    }

    public int q0(Context context, int i2) {
    }

    @Override // j.b.k.f
    public void r(Bundle bundle) {
    }

    public boolean r0() {
    }

    @Override // j.b.k.f
    public void s() {
    }

    public boolean s0(int i2, KeyEvent keyEvent) {
    }

    @Override // j.b.k.f
    public void t(Bundle bundle) {
    }

    public final boolean t0(int i2, KeyEvent keyEvent) {
    }

    @Override // j.b.k.f
    public void u() {
    }

    public boolean u0(int i2, KeyEvent keyEvent) {
    }

    @Override // j.b.k.f
    public void v(Bundle bundle) {
    }

    public boolean v0(int i2, KeyEvent keyEvent) {
    }

    @Override // j.b.k.f
    public void w() {
    }

    public final boolean w0(int i2, KeyEvent keyEvent) {
    }

    @Override // j.b.k.f
    public void x() {
    }

    public void x0(int i2) {
    }

    public void y0(int i2) {
    }

    public void z0(ViewGroup viewGroup) {
    }

    public g(Dialog dialog, j.b.k.e eVar) {
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
    }

    public g(Context context, Window window, j.b.k.e eVar, Object obj) {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class o extends j.b.p.i {
        public final /* synthetic */ g b;

        public o(g gVar, Window.Callback callback) {
        }

        public final ActionMode b(ActionMode.Callback callback) {
        }

        @Override // j.b.p.i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        }

        @Override // j.b.p.i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        }

        @Override // j.b.p.i, android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // j.b.p.i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i2, Menu menu) {
        }

        @Override // j.b.p.i, android.view.Window.Callback
        public boolean onMenuOpened(int i2, Menu menu) {
        }

        @Override // j.b.p.i, android.view.Window.Callback
        public void onPanelClosed(int i2, Menu menu) {
        }

        @Override // j.b.p.i, android.view.Window.Callback
        public boolean onPreparePanel(int i2, View view, Menu menu) {
        }

        @Override // j.b.p.i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i2) {
        }

        @Override // j.b.p.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        }

        @Override // j.b.p.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i2) {
        }
    }
}
