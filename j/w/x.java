package j.w;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class x implements Cloneable {
    public static final int[] G = null;
    public static final r H = null;
    public static ThreadLocal<j.d.a<Animator, d>> I;
    public ArrayList<f> A;
    public ArrayList<Animator> B;
    public a0 C;
    public e D;
    public j.d.a<String, String> E;
    public r F;
    public String a;
    public long b;
    public long c;
    public TimeInterpolator d;
    public ArrayList<Integer> e;
    public ArrayList<View> f;
    public ArrayList<String> g;
    public ArrayList<Class<?>> h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList<Integer> f3551i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList<View> f3552j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList<Class<?>> f3553k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList<String> f3554l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList<Integer> f3555m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList<View> f3556n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList<Class<?>> f3557o;

    /* renamed from: p, reason: collision with root package name */
    public e0 f3558p;

    /* renamed from: q, reason: collision with root package name */
    public e0 f3559q;

    /* renamed from: r, reason: collision with root package name */
    public b0 f3560r;

    /* renamed from: s, reason: collision with root package name */
    public int[] f3561s;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList<d0> f3562t;
    public ArrayList<d0> u;
    public boolean v;
    public ArrayList<Animator> w;
    public int x;
    public boolean y;
    public boolean z;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class a extends r {
        @Override // j.w.r
        public Path a(float f, float f2, float f3, float f4) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b extends AnimatorListenerAdapter {
        public final /* synthetic */ j.d.a a;
        public final /* synthetic */ x b;

        public b(x xVar, j.d.a aVar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class c extends AnimatorListenerAdapter {
        public final /* synthetic */ x a;

        public c(x xVar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class d {
        public View a;
        public String b;
        public d0 c;
        public x0 d;
        public x e;

        public d(View view, String str, x xVar, x0 x0Var, d0 d0Var) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class e {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface f {
        void a(x xVar);

        void b(x xVar);

        void c(x xVar);

        void d(x xVar);

        void e(x xVar);
    }

    public static j.d.a<Animator, d> A() {
    }

    public static boolean K(d0 d0Var, d0 d0Var2, String str) {
    }

    public static void d(e0 e0Var, View view, d0 d0Var) {
    }

    public long B() {
    }

    public List<Integer> C() {
    }

    public List<String> D() {
    }

    public List<Class<?>> E() {
    }

    public List<View> F() {
    }

    public String[] G() {
    }

    public d0 H(View view, boolean z) {
    }

    public boolean I(d0 d0Var, d0 d0Var2) {
    }

    public boolean J(View view) {
    }

    public final void M(j.d.a<View, d0> aVar, j.d.a<View, d0> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
    }

    public final void N(j.d.a<View, d0> aVar, j.d.a<View, d0> aVar2) {
    }

    public final void O(j.d.a<View, d0> aVar, j.d.a<View, d0> aVar2, j.d.d<View> dVar, j.d.d<View> dVar2) {
    }

    public final void P(j.d.a<View, d0> aVar, j.d.a<View, d0> aVar2, j.d.a<String, View> aVar3, j.d.a<String, View> aVar4) {
    }

    public final void Q(e0 e0Var, e0 e0Var2) {
    }

    public void R(View view) {
    }

    public void S(ViewGroup viewGroup) {
    }

    public x T(f fVar) {
    }

    public x U(View view) {
    }

    public void V(View view) {
    }

    public final void W(Animator animator, j.d.a<Animator, d> aVar) {
    }

    public void X() {
    }

    public x Y(long j2) {
    }

    public void Z(e eVar) {
    }

    public x a(f fVar) {
    }

    public x a0(TimeInterpolator timeInterpolator) {
    }

    public x b(View view) {
    }

    public void b0(r rVar) {
    }

    public final void c(j.d.a<View, d0> aVar, j.d.a<View, d0> aVar2) {
    }

    public void c0(a0 a0Var) {
    }

    public /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
    }

    public x d0(long j2) {
    }

    public void e(Animator animator) {
    }

    public void e0() {
    }

    public String f0(String str) {
    }

    public void g() {
    }

    public abstract void h(d0 d0Var);

    public final void i(View view, boolean z) {
    }

    public void j(d0 d0Var) {
    }

    public abstract void k(d0 d0Var);

    public void l(ViewGroup viewGroup, boolean z) {
    }

    public void n(boolean z) {
    }

    public x o() {
    }

    public Animator p(ViewGroup viewGroup, d0 d0Var, d0 d0Var2) {
    }

    public void q(ViewGroup viewGroup, e0 e0Var, e0 e0Var2, ArrayList<d0> arrayList, ArrayList<d0> arrayList2) {
    }

    public void r() {
    }

    public long t() {
    }

    public String toString() {
    }

    public e u() {
    }

    public TimeInterpolator v() {
    }

    public d0 w(View view, boolean z) {
    }

    public String x() {
    }

    public r y() {
    }

    public a0 z() {
    }
}
