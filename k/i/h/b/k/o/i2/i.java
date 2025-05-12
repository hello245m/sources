package k.i.h.b.k.o.i2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.github.chrisbanes.photoview.PhotoView;
import com.google.android.exoplayer2.ui.PlayerView;
import com.tencent.mp.feature.base.ui.widget.watcher.FingerLayout;
import com.tencent.mp.framework.ui.widget.progressbar.ProgressBarView;
import java.util.List;
import java.util.Map;
import k.a.a.p.p.q;
import k.a.a.t.l.j;
import k.d.a.a.e3;
import k.d.a.a.f3;
import k.d.a.a.f4;
import k.d.a.a.g4;
import k.d.a.a.n3;
import k.d.a.a.p3;
import k.d.a.a.q2;
import k.d.a.a.q3;
import k.d.a.a.u4.a0;
import k.d.a.a.y4.b0;
import n.a0.k.a.l;
import n.d0.c.p;
import n.u;
import o.a.f2;
import o.a.t0;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class i extends Fragment implements k.i.h.b.z.o.f.c, q3.d, t0 {

    /* renamed from: i, reason: collision with root package name */
    public static final a f7082i = null;
    public final /* synthetic */ t0 a;
    public PhotoView b;
    public PlayerView c;
    public q3 d;
    public boolean e;
    public boolean f;
    public b g;
    public Map<Integer, View> h;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(n.d0.d.h hVar) {
        }

        public final i a(k.i.h.b.b.a.k.b bVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface b {
        void J();

        void R(i iVar);

        void U(i iVar, FingerLayout fingerLayout);

        void c(FingerLayout fingerLayout, float f);

        void l(FingerLayout fingerLayout, float f);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class c implements FingerLayout.b {
        public final /* synthetic */ i a;

        public c(i iVar) {
        }

        @Override // com.tencent.mp.feature.base.ui.widget.watcher.FingerLayout.b
        public void c(FingerLayout fingerLayout, float f) {
        }

        @Override // com.tencent.mp.feature.base.ui.widget.watcher.FingerLayout.b
        public void l(FingerLayout fingerLayout, float f) {
        }

        @Override // com.tencent.mp.feature.base.ui.widget.watcher.FingerLayout.b
        public boolean m(FingerLayout fingerLayout) {
        }

        @Override // com.tencent.mp.feature.base.ui.widget.watcher.FingerLayout.b
        public void n(FingerLayout fingerLayout) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class d implements k.a.a.t.g<Drawable> {
        public final /* synthetic */ ProgressBarView a;
        public final /* synthetic */ TextView b;

        public d(ProgressBarView progressBarView, TextView textView) {
        }

        public boolean a(Drawable drawable, Object obj, j<Drawable> jVar, k.a.a.p.a aVar, boolean z) {
        }

        @Override // k.a.a.t.g
        public boolean e(q qVar, Object obj, j<Drawable> jVar, boolean z) {
        }

        @Override // k.a.a.t.g
        public /* bridge */ /* synthetic */ boolean h(Drawable drawable, Object obj, j<Drawable> jVar, k.a.a.p.a aVar, boolean z) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.fragment.PreviewImageFragment$loadLivePhoto$1", f = "PreviewImageFragment.kt", l = {213}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class e extends l implements p<t0, n.a0.d<? super u>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ k.i.h.b.b.a.k.b c;
        public final /* synthetic */ i d;

        public e(k.i.h.b.b.a.k.b bVar, i iVar, n.a0.d<? super e> dVar) {
        }

        @Override // n.a0.k.a.a
        public final n.a0.d<u> create(Object obj, n.a0.d<?> dVar) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ Object invoke(t0 t0Var, n.a0.d<? super u> dVar) {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(t0 t0Var, n.a0.d<? super u> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    public static /* synthetic */ void A0(i iVar, View view) {
    }

    public static final /* synthetic */ PhotoView d0(i iVar) {
    }

    public static final /* synthetic */ b g0(i iVar) {
    }

    public static final /* synthetic */ q3 i0(i iVar) {
    }

    public static final /* synthetic */ void m0(i iVar) {
    }

    public static final /* synthetic */ void n0(i iVar) {
    }

    public static final /* synthetic */ void q0(i iVar) {
    }

    public static final void y0(i iVar, View view) {
    }

    @Override // k.d.a.a.q3.d
    public /* synthetic */ void A(p3 p3Var) {
    }

    @Override // k.d.a.a.q3.d
    public /* synthetic */ void C0(a0 a0Var) {
    }

    @Override // k.d.a.a.q3.d
    public /* synthetic */ void D(q3.e eVar, q3.e eVar2, int i2) {
    }

    @Override // k.d.a.a.q3.d
    public /* synthetic */ void D0(int i2, int i3) {
    }

    @Override // k.d.a.a.q3.d
    public /* synthetic */ void E(int i2) {
    }

    public final void E0() {
    }

    @Override // k.d.a.a.q3.d
    public /* synthetic */ void F(boolean z) {
    }

    public final f2 F0(k.i.h.b.b.a.k.b bVar) {
    }

    @Override // k.d.a.a.q3.d
    public /* synthetic */ void G(int i2) {
    }

    public final void G0() {
    }

    public final void I0(boolean z) {
    }

    @Override // k.d.a.a.q3.d
    public /* synthetic */ void J0(n3 n3Var) {
    }

    @Override // k.d.a.a.q3.d
    public /* synthetic */ void K(g4 g4Var) {
    }

    @Override // k.d.a.a.q3.d
    public /* synthetic */ void L(boolean z) {
    }

    public final void L0() {
    }

    @Override // k.d.a.a.q3.d
    public /* synthetic */ void M() {
    }

    public final void M0() {
    }

    @Override // k.d.a.a.q3.d
    public /* synthetic */ void N(n3 n3Var) {
    }

    @Override // k.d.a.a.q3.d
    public void N0(boolean z) {
    }

    @Override // k.d.a.a.q3.d
    public /* synthetic */ void O(q3.b bVar) {
    }

    @Override // k.d.a.a.q3.d
    public /* synthetic */ void P(f4 f4Var, int i2) {
    }

    @Override // k.d.a.a.q3.d
    public /* synthetic */ void T(int i2) {
    }

    @Override // k.d.a.a.q3.d
    public /* synthetic */ void W(q2 q2Var) {
    }

    @Override // k.d.a.a.q3.d
    public /* synthetic */ void Y(f3 f3Var) {
    }

    @Override // k.d.a.a.q3.d
    public /* synthetic */ void Z(boolean z) {
    }

    @Override // k.d.a.a.q3.d
    public /* synthetic */ void a(boolean z) {
    }

    @Override // k.i.h.b.z.o.f.c
    public void a0() {
    }

    @Override // k.d.a.a.q3.d
    public /* synthetic */ void b0(q3 q3Var, q3.c cVar) {
    }

    public void c0() {
    }

    @Override // o.a.t0
    public n.a0.g getCoroutineContext() {
    }

    @Override // k.d.a.a.q3.d
    public /* synthetic */ void h(k.d.a.a.t4.f fVar) {
    }

    @Override // k.d.a.a.q3.d
    public /* synthetic */ void j0(int i2, boolean z) {
    }

    @Override // k.d.a.a.q3.d
    public /* synthetic */ void k(k.d.a.a.p4.a aVar) {
    }

    @Override // k.d.a.a.q3.d
    public /* synthetic */ void l0(boolean z, int i2) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
    }

    @Override // k.d.a.a.q3.d
    public /* synthetic */ void r(int i2) {
    }

    public final void r0() {
    }

    @Override // k.d.a.a.q3.d
    public /* synthetic */ void s(List list) {
    }

    @Override // k.d.a.a.q3.d
    public /* synthetic */ void s0() {
    }

    @Override // k.d.a.a.q3.d
    public /* synthetic */ void t0(e3 e3Var, int i2) {
    }

    public final void v0(Context context) {
    }

    public final void x0() {
    }

    @Override // k.d.a.a.q3.d
    public /* synthetic */ void y(b0 b0Var) {
    }

    @Override // k.d.a.a.q3.d
    public /* synthetic */ void z0(boolean z, int i2) {
    }
}
