package com.tencent.mp.feature.article.edit.ui;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.mp.feature.base.ui.widget.MpTextView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import k.i.h.b.b.b.l.l;
import k.i.h.b.b.b.l.m;
import k.i.h.b.d.b1.d.k;
import k.i.h.b.d.w0.c.i;
import n.d0.d.o;
import n.u;
import q.ib;
import q.pc;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class PreviewArticleActivity extends k.i.h.b.d.b1.b {
    public String A;
    public k B;
    public Map<Integer, View> C;
    public final l h;

    /* renamed from: i, reason: collision with root package name */
    public final m f1139i;

    /* renamed from: j, reason: collision with root package name */
    public List<k.i.h.b.h.a.a.e.b.b> f1140j;

    /* renamed from: k, reason: collision with root package name */
    public a f1141k;

    /* renamed from: l, reason: collision with root package name */
    public List<k.i.h.b.h.a.a.e.b.b> f1142l;

    /* renamed from: m, reason: collision with root package name */
    public a f1143m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1144n;

    /* renamed from: o, reason: collision with root package name */
    public String f1145o;

    /* renamed from: p, reason: collision with root package name */
    public k.i.h.b.h.a.a.e.b.b f1146p;

    /* renamed from: q, reason: collision with root package name */
    public int f1147q;

    /* renamed from: r, reason: collision with root package name */
    public k.i.h.b.b.a.q.i.d f1148r;

    /* renamed from: s, reason: collision with root package name */
    public List<k.i.h.b.h.a.a.e.c.c> f1149s;

    /* renamed from: t, reason: collision with root package name */
    public List<ib> f1150t;
    public String u;
    public String v;
    public int w;
    public int x;
    public int y;
    public ArrayList<k.i.h.b.b.a.k.e> z;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public final class a extends RecyclerView.h<b> {
        public final List<k.i.h.b.h.a.a.e.b.b> d;
        public final /* synthetic */ PreviewArticleActivity e;

        public a(PreviewArticleActivity previewArticleActivity, List<k.i.h.b.h.a.a.e.b.b> list) {
        }

        public static /* synthetic */ void T(PreviewArticleActivity previewArticleActivity, k.i.h.b.h.a.a.e.b.b bVar, View view) {
        }

        public static final void V(PreviewArticleActivity previewArticleActivity, k.i.h.b.h.a.a.e.b.b bVar, View view) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public /* bridge */ /* synthetic */ void H(b bVar, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public /* bridge */ /* synthetic */ b J(ViewGroup viewGroup, int i2) {
        }

        public void U(b bVar, int i2) {
        }

        public b W(ViewGroup viewGroup, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int q() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class b extends RecyclerView.e0 {
        public LinearLayout a;
        public ImageView b;
        public MpTextView c;

        public b(View view) {
        }

        public final MpTextView c() {
        }

        public final LinearLayout l() {
        }

        public final ImageView n() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class c implements TextWatcher {
        public final /* synthetic */ PreviewArticleActivity a;

        public c(PreviewArticleActivity previewArticleActivity) {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class d implements k.i.h.b.b.b.l.k {
        public final /* synthetic */ PreviewArticleActivity a;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a extends o implements n.d0.c.a<u> {
            public final /* synthetic */ PreviewArticleActivity a;

            public a(PreviewArticleActivity previewArticleActivity) {
            }

            @Override // n.d0.c.a
            public /* bridge */ /* synthetic */ u invoke() {
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }
        }

        public d(PreviewArticleActivity previewArticleActivity) {
        }

        @Override // k.i.h.b.b.b.l.k
        public void H(k.i.h.b.b.a.o.k kVar) {
        }

        @Override // k.i.h.b.b.b.l.k
        public void Q(pc pcVar, String str) {
        }

        @Override // k.i.h.b.d.q0.a
        public void n(int i2, String str) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class e extends o implements n.d0.c.a<u> {
        public final /* synthetic */ PreviewArticleActivity a;

        public e(PreviewArticleActivity previewArticleActivity) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class f extends o implements n.d0.c.a<u> {
        public final /* synthetic */ PreviewArticleActivity a;

        public f(PreviewArticleActivity previewArticleActivity) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    public static final /* synthetic */ void H1(PreviewArticleActivity previewArticleActivity) {
    }

    public static final /* synthetic */ boolean I1(PreviewArticleActivity previewArticleActivity) {
    }

    public static final /* synthetic */ List J1(PreviewArticleActivity previewArticleActivity) {
    }

    public static final /* synthetic */ List K1(PreviewArticleActivity previewArticleActivity) {
    }

    public static final /* synthetic */ String L1(PreviewArticleActivity previewArticleActivity) {
    }

    public static final /* synthetic */ void M1(PreviewArticleActivity previewArticleActivity, k.i.h.b.h.a.a.e.b.b bVar) {
    }

    public static final /* synthetic */ void N1(PreviewArticleActivity previewArticleActivity, boolean z) {
    }

    public static final /* synthetic */ void O1(PreviewArticleActivity previewArticleActivity, boolean z) {
    }

    public static final /* synthetic */ void P1(PreviewArticleActivity previewArticleActivity, boolean z) {
    }

    public static final /* synthetic */ void Q1(PreviewArticleActivity previewArticleActivity, boolean z) {
    }

    public static final /* synthetic */ void R1(PreviewArticleActivity previewArticleActivity) {
    }

    public static final /* synthetic */ void S1(PreviewArticleActivity previewArticleActivity, boolean z) {
    }

    public static final /* synthetic */ void T1(PreviewArticleActivity previewArticleActivity, String str) {
    }

    public static final /* synthetic */ void U1(PreviewArticleActivity previewArticleActivity, boolean z) {
    }

    public static final void Y1(PreviewArticleActivity previewArticleActivity, View view, boolean z) {
    }

    public static final boolean Z1(PreviewArticleActivity previewArticleActivity, TextView textView, int i2, KeyEvent keyEvent) {
    }

    public static /* synthetic */ void a2(PreviewArticleActivity previewArticleActivity, DialogInterface dialogInterface, int i2) {
    }

    public static /* synthetic */ void b2(PreviewArticleActivity previewArticleActivity, i iVar) {
    }

    public static /* synthetic */ void c2(PreviewArticleActivity previewArticleActivity, Boolean bool) {
    }

    public static /* synthetic */ void d2(PreviewArticleActivity previewArticleActivity, View view, boolean z) {
    }

    public static /* synthetic */ boolean e2(PreviewArticleActivity previewArticleActivity, TextView textView, int i2, KeyEvent keyEvent) {
    }

    public static /* synthetic */ void f2(DialogInterface dialogInterface, int i2) {
    }

    public static final void k2(PreviewArticleActivity previewArticleActivity, DialogInterface dialogInterface, int i2) {
    }

    public static final void l2(DialogInterface dialogInterface, int i2) {
    }

    public static final void n2(PreviewArticleActivity previewArticleActivity, i iVar) {
    }

    public static final void t2(PreviewArticleActivity previewArticleActivity, Boolean bool) {
    }

    public View G1(int i2) {
    }

    public final void V1() {
    }

    @Override // k.i.h.b.d.b1.a
    public int W0() {
    }

    public final void W1() {
    }

    public final void X1() {
    }

    public final void g2() {
    }

    public final void h2(int i2, String str) {
    }

    public final void i2() {
    }

    public final void j2(k.i.h.b.h.a.a.e.b.b bVar) {
    }

    public final void m2(k.i.h.b.h.a.a.e.b.b bVar) {
    }

    public final void o2(boolean z) {
    }

    @Override // k.i.h.b.d.b1.b, k.i.h.b.d.b1.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, j.g.j.h, android.app.Activity
    public void onCreate(Bundle bundle) {
    }

    public final void p2(boolean z) {
    }

    public final void q2(boolean z) {
    }

    public final void r2(boolean z) {
    }

    public final void s2() {
    }

    public final void u2() {
    }

    public final void v2(boolean z) {
    }
}
