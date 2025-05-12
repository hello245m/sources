package j.k.d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import j.g.p.b;
import j.k.d.d0;
import j.k.d.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class c extends d0 {

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a = null;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b implements Runnable {
        public final /* synthetic */ List a;
        public final /* synthetic */ d0.e b;
        public final /* synthetic */ c c;

        public b(c cVar, List list, d0.e eVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: j.k.d.c$c, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class C0155c extends AnimatorListenerAdapter {
        public final /* synthetic */ ViewGroup a;
        public final /* synthetic */ View b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ d0.e d;
        public final /* synthetic */ k e;

        public C0155c(c cVar, ViewGroup viewGroup, View view, boolean z, d0.e eVar, k kVar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class d implements b.InterfaceC0137b {
        public final /* synthetic */ Animator a;

        public d(c cVar, Animator animator) {
        }

        @Override // j.g.p.b.InterfaceC0137b
        public void onCancel() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class e implements Animation.AnimationListener {
        public final /* synthetic */ ViewGroup a;
        public final /* synthetic */ View b;
        public final /* synthetic */ k c;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a implements Runnable {
            public final /* synthetic */ e a;

            public a(e eVar) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public e(c cVar, ViewGroup viewGroup, View view, k kVar) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class f implements b.InterfaceC0137b {
        public final /* synthetic */ View a;
        public final /* synthetic */ ViewGroup b;
        public final /* synthetic */ k c;

        public f(c cVar, View view, ViewGroup viewGroup, k kVar) {
        }

        @Override // j.g.p.b.InterfaceC0137b
        public void onCancel() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class g implements Runnable {
        public final /* synthetic */ d0.e a;
        public final /* synthetic */ d0.e b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ j.d.a d;

        public g(c cVar, d0.e eVar, d0.e eVar2, boolean z, j.d.a aVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class h implements Runnable {
        public final /* synthetic */ a0 a;
        public final /* synthetic */ View b;
        public final /* synthetic */ Rect c;

        public h(c cVar, a0 a0Var, View view, Rect rect) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class i implements Runnable {
        public final /* synthetic */ ArrayList a;

        public i(c cVar, ArrayList arrayList) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class j implements Runnable {
        public final /* synthetic */ m a;

        public j(c cVar, m mVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class k extends l {
        public boolean c;
        public boolean d;
        public e.d e;

        public k(d0.e eVar, j.g.p.b bVar, boolean z) {
        }

        public e.d e(Context context) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class l {
        public final d0.e a;
        public final j.g.p.b b;

        public l(d0.e eVar, j.g.p.b bVar) {
        }

        public void a() {
        }

        public d0.e b() {
        }

        public j.g.p.b c() {
        }

        public boolean d() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class m extends l {
        public final Object c;
        public final boolean d;
        public final Object e;

        public m(d0.e eVar, j.g.p.b bVar, boolean z, boolean z2) {
        }

        public a0 e() {
        }

        public final a0 f(Object obj) {
        }

        public Object g() {
        }

        public Object h() {
        }

        public boolean i() {
        }

        public boolean j() {
        }
    }

    public c(ViewGroup viewGroup) {
    }

    @Override // j.k.d.d0
    public void f(List<d0.e> list, boolean z) {
    }

    public void s(d0.e eVar) {
    }

    public void t(ArrayList<View> arrayList, View view) {
    }

    public void u(Map<String, View> map, View view) {
    }

    public void v(j.d.a<String, View> aVar, Collection<String> collection) {
    }

    public final void w(List<k> list, List<d0.e> list2, boolean z, Map<d0.e, Boolean> map) {
    }

    public final Map<d0.e, Boolean> x(List<m> list, List<d0.e> list2, boolean z, d0.e eVar, d0.e eVar2) {
    }
}
