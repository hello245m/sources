package k.i.h.b.k.o.i2;

import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.viewpager.widget.ViewPager;
import com.huawei.agconnect.exception.AGCServerException;
import com.tencent.mp.feature.base.ui.widget.watcher.FingerLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import k.i.h.b.d.x0.b;
import k.i.h.b.k.o.i2.i;
import n.d0.c.p;
import n.u;
import o.a.f2;
import o.a.t0;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class h extends k.i.h.b.k.o.i2.g implements View.OnClickListener, ViewPager.j, i.b {
    public static final a E = null;
    public boolean A;
    public int B;
    public int C;
    public Map<Integer, View> D;

    /* renamed from: r, reason: collision with root package name */
    public final n.d f7079r;

    /* renamed from: s, reason: collision with root package name */
    public final n.d f7080s;

    /* renamed from: t, reason: collision with root package name */
    public final n.d f7081t;
    public int u;
    public k.i.h.b.k.m.b v;
    public final n.d w;
    public k.i.h.b.k.o.i2.i x;
    public f2 y;
    public boolean z;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(n.d0.d.h hVar) {
        }

        public final h a(ArrayList<k.i.h.b.b.a.k.b> arrayList, int i2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class b extends n.d0.d.o implements n.d0.c.a<k.i.h.b.k.o.f2.e> {
        public final /* synthetic */ h a;

        public b(h hVar) {
        }

        public final k.i.h.b.k.o.f2.e b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ k.i.h.b.k.o.f2.e invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class c extends n.d0.d.o implements n.d0.c.l<Integer, u> {
        public final /* synthetic */ List<String> a;

        public c(List<String> list) {
        }

        public final void b(int i2) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ u invoke(Integer num) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.fragment.ImageEditorPreviewFragment$downloadAllImage$1", f = "ImageEditorPreviewFragment.kt", l = {399, AGCServerException.TOKEN_INVALID, 405, 410}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class d extends n.a0.k.a.l implements p<t0, n.a0.d<? super u>, Object> {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public int f;
        public int g;
        public final /* synthetic */ h h;

        public d(h hVar, n.a0.d<? super d> dVar) {
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

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.fragment.ImageEditorPreviewFragment$downloadCurrentImage$1", f = "ImageEditorPreviewFragment.kt", l = {384, 388, 391, 394}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class e extends n.a0.k.a.l implements p<t0, n.a0.d<? super u>, Object> {
        public Object a;
        public Object b;
        public int c;
        public final /* synthetic */ h d;

        public e(h hVar, n.a0.d<? super e> dVar) {
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

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.fragment.ImageEditorPreviewFragment", f = "ImageEditorPreviewFragment.kt", l = {479, 484, 492, 494, 501, 502}, m = "downloadImage")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class f extends n.a0.k.a.d {
        public Object a;
        public /* synthetic */ Object b;
        public final /* synthetic */ h c;
        public int d;

        public f(h hVar, n.a0.d<? super f> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class g extends n.d0.d.o implements n.d0.c.a<Integer> {
        public final /* synthetic */ h a;

        public g(h hVar) {
        }

        public final Integer b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ Integer invoke() {
        }
    }

    /* renamed from: k.i.h.b.k.o.i2.h$h, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class C0570h extends n.d0.d.o implements n.d0.c.a<u> {
        public final /* synthetic */ h a;

        public C0570h(h hVar) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class i extends n.d0.d.o implements n.d0.c.a<u> {
        public final /* synthetic */ h a;

        public i(h hVar) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class j extends b.c {
        public final /* synthetic */ n.a0.d<Boolean> a;
        public final /* synthetic */ h b;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a implements DialogInterface.OnClickListener {
            public final /* synthetic */ h a;

            public a(h hVar) {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
            }
        }

        public j(n.a0.d<? super Boolean> dVar, h hVar) {
        }

        @Override // k.i.h.b.d.x0.b.c
        public void a() {
        }

        @Override // k.i.h.b.d.x0.b.c
        public void b() {
        }

        @Override // k.i.h.b.d.x0.b.c
        public void c() {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.fragment.ImageEditorPreviewFragment", f = "ImageEditorPreviewFragment.kt", l = {593}, m = "savePictureToGallery")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class k extends n.a0.k.a.d {
        public /* synthetic */ Object a;
        public final /* synthetic */ h b;
        public int c;

        public k(h hVar, n.a0.d<? super k> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.fragment.ImageEditorPreviewFragment$savePictureToGallery$2$uri$1", f = "ImageEditorPreviewFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class l extends n.a0.k.a.l implements p<t0, n.a0.d<? super Uri>, Object> {
        public int a;
        public final /* synthetic */ h b;
        public final /* synthetic */ File c;

        public l(h hVar, File file, n.a0.d<? super l> dVar) {
        }

        @Override // n.a0.k.a.a
        public final n.a0.d<u> create(Object obj, n.a0.d<?> dVar) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ Object invoke(t0 t0Var, n.a0.d<? super Uri> dVar) {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(t0 t0Var, n.a0.d<? super Uri> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.fragment.ImageEditorPreviewFragment$startHideActionBarJob$1", f = "ImageEditorPreviewFragment.kt", l = {266, 267}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class m extends n.a0.k.a.l implements p<t0, n.a0.d<? super u>, Object> {
        public int a;
        public final /* synthetic */ h b;

        @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.fragment.ImageEditorPreviewFragment$startHideActionBarJob$1$1", f = "ImageEditorPreviewFragment.kt", l = {}, m = "invokeSuspend")
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a extends n.a0.k.a.l implements p<t0, n.a0.d<? super u>, Object> {
            public int a;
            public final /* synthetic */ h b;

            public a(h hVar, n.a0.d<? super a> dVar) {
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

        public m(h hVar, n.a0.d<? super m> dVar) {
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

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class n extends n.d0.d.o implements n.d0.c.a<Integer> {
        public final /* synthetic */ h a;

        public n(h hVar) {
        }

        public final Integer b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ Integer invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class o extends n.d0.d.o implements n.d0.c.a<ArrayList<k.i.h.b.b.a.k.b>> {
        public final /* synthetic */ h a;

        public o(h hVar) {
        }

        public final ArrayList<k.i.h.b.b.a.k.b> b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ ArrayList<k.i.h.b.b.a.k.b> invoke() {
        }
    }

    public static final void A1(h hVar, MenuItem menuItem, int i2) {
    }

    public static final void E1(h hVar, int i2, k.i.h.b.d.b1.d.d dVar) {
    }

    public static final void F1(h hVar, MenuItem menuItem, int i2) {
    }

    public static final /* synthetic */ void T0(h hVar, List list) {
    }

    public static final /* synthetic */ Object U0(h hVar, k.i.h.b.b.a.k.b bVar, n.a0.d dVar) {
    }

    public static final /* synthetic */ void V0(h hVar) {
    }

    public static final /* synthetic */ k.i.h.b.k.o.f2.e W0(h hVar) {
    }

    public static final /* synthetic */ n.i X0(h hVar, File file) {
    }

    public static final /* synthetic */ Object Y0(h hVar, n.a0.d dVar) {
    }

    public static final /* synthetic */ Object Z0(h hVar, File file, n.a0.d dVar) {
    }

    public static final /* synthetic */ Object a1(h hVar, boolean z, boolean z2, n.a0.d dVar) {
    }

    public static /* synthetic */ void p1(h hVar, boolean z, int i2, Object obj) {
    }

    public static /* synthetic */ void r1(h hVar, MenuItem menuItem, int i2) {
    }

    public static /* synthetic */ void s1(h hVar, MenuItem menuItem, int i2) {
    }

    public static /* synthetic */ void t1(k.i.h.b.d.b1.d.d dVar) {
    }

    public static /* synthetic */ void u1(h hVar, int i2, k.i.h.b.d.b1.d.d dVar) {
    }

    public static final void z1(k.i.h.b.d.b1.d.d dVar) {
    }

    public final Object B1(boolean z, boolean z2, n.a0.d<? super u> dVar) {
    }

    public final void C1() {
    }

    public final void D1() {
    }

    public final f2 G1() {
    }

    public final void H1(int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void I(int i2, float f2, int i3) {
    }

    public final void I1(int i2) {
    }

    @Override // k.i.h.b.k.o.i2.i.b
    public void J() {
    }

    public final void J1(int i2, k.i.h.b.b.a.k.b bVar) {
    }

    public final void K1(int i2) {
    }

    @Override // k.i.h.b.k.o.i2.g
    public void L0() {
    }

    public final void L1(int i2) {
    }

    @Override // k.i.h.b.k.o.i2.g
    public void O0() {
    }

    @Override // k.i.h.b.k.o.i2.g
    public void Q0(Window window) {
    }

    @Override // k.i.h.b.k.o.i2.i.b
    public void R(k.i.h.b.k.o.i2.i iVar) {
    }

    @Override // k.i.h.b.k.o.i2.i.b
    public void U(k.i.h.b.k.o.i2.i iVar, FingerLayout fingerLayout) {
    }

    public final void b1() {
    }

    @Override // k.i.h.b.k.o.i2.i.b
    public void c(FingerLayout fingerLayout, float f2) {
    }

    public final void c1(List<String> list) {
    }

    public final f2 d1() {
    }

    public final f2 e1() {
    }

    public final Object f1(k.i.h.b.b.a.k.b bVar, n.a0.d<? super String> dVar) {
    }

    public final void g1() {
    }

    public final k.i.h.b.k.o.f2.e h1() {
    }

    public final k.i.h.b.k.m.b i1() {
    }

    public final int j1() {
    }

    public final int k1() {
    }

    @Override // k.i.h.b.k.o.i2.i.b
    public void l(FingerLayout fingerLayout, float f2) {
    }

    public final n.i<String, String> l1(File file) {
    }

    public final int m1() {
    }

    public final ArrayList<k.i.h.b.b.a.k.b> n1() {
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void o0(int i2) {
    }

    public final void o1(boolean z) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
    }

    @Override // k.i.h.b.k.o.i2.g, j.k.d.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
    }

    @Override // k.i.h.b.k.o.i2.g, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
    }

    public final void q1() {
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void u0(int i2) {
    }

    public final void v1(int i2) {
    }

    public final Object w1(n.a0.d<? super Boolean> dVar) {
    }

    public final Object x1(File file, n.a0.d<? super Boolean> dVar) {
    }

    public final void y1() {
    }
}
