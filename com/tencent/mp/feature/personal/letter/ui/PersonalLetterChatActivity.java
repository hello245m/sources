package com.tencent.mp.feature.personal.letter.ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.mp.feature.base.ui.chat.ChatFooter;
import com.tencent.mp.feature.base.ui.chat.ChattingAppPanel;
import com.tencent.mp.framework.ui.widget.recyclerview.WrapperLinearLayoutManager;
import java.io.File;
import java.util.List;
import k.i.h.b.d.b1.p.r;
import n.d0.c.p;
import n.d0.d.o;
import n.u;
import o.a.s;
import o.a.t0;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class PersonalLetterChatActivity extends k.i.h.b.d.b1.b {
    public ChatFooter h;

    /* renamed from: i, reason: collision with root package name */
    public k.i.h.b.d.b1.f.c f1668i;

    /* renamed from: j, reason: collision with root package name */
    public b f1669j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1670k;

    /* renamed from: l, reason: collision with root package name */
    public final n.d f1671l;

    /* renamed from: m, reason: collision with root package name */
    public File f1672m;

    /* renamed from: n, reason: collision with root package name */
    public k.i.h.b.y.a.h.b f1673n;

    /* renamed from: o, reason: collision with root package name */
    public final n.d f1674o;

    /* renamed from: p, reason: collision with root package name */
    public final n.d f1675p;

    /* renamed from: q, reason: collision with root package name */
    public final n.d f1676q;

    /* renamed from: r, reason: collision with root package name */
    public String f1677r;

    /* renamed from: s, reason: collision with root package name */
    public String f1678s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1679t;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public final class a implements ChattingAppPanel.a {
        public final /* synthetic */ PersonalLetterChatActivity a;

        public a(PersonalLetterChatActivity personalLetterChatActivity) {
        }

        @Override // com.tencent.mp.feature.base.ui.chat.ChattingAppPanel.a
        public void a() {
        }

        @Override // com.tencent.mp.feature.base.ui.chat.ChattingAppPanel.a
        public void b() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public final class b implements k.i.h.b.d.b1.f.b {
        public r a;
        public final /* synthetic */ PersonalLetterChatActivity b;

        public b(PersonalLetterChatActivity personalLetterChatActivity, k.i.h.b.d.b1.f.c cVar) {
        }

        @Override // k.i.h.b.d.b1.f.b
        public void a(boolean z) {
        }

        @Override // k.i.h.b.d.b1.f.b
        public void b(View view) {
        }

        @Override // k.i.h.b.d.b1.f.b
        public void c(View view, MotionEvent motionEvent) {
        }

        @Override // k.i.h.b.d.b1.f.b
        public boolean d() {
        }

        @Override // k.i.h.b.d.b1.f.b
        public boolean e(String str) {
        }

        @Override // k.i.h.b.d.b1.f.b
        public void f(View view) {
        }

        @Override // k.i.h.b.d.b1.f.b
        public void onResume() {
        }

        @Override // k.i.h.b.d.b1.f.b
        public void release() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class c extends o implements n.d0.c.a<k.i.h.b.y.a.k.f0.g> {
        public final /* synthetic */ PersonalLetterChatActivity a;

        public c(PersonalLetterChatActivity personalLetterChatActivity) {
        }

        public final k.i.h.b.y.a.k.f0.g b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ k.i.h.b.y.a.k.f0.g invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class d implements k.i.d.a.d.b<Boolean> {
        public final /* synthetic */ PersonalLetterChatActivity a;

        public d(PersonalLetterChatActivity personalLetterChatActivity) {
        }

        @Override // k.i.d.a.d.b
        public /* bridge */ /* synthetic */ void a(Boolean bool) {
        }

        public void b(Boolean bool) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class e extends o implements n.d0.c.a<u> {
        public final /* synthetic */ PersonalLetterChatActivity a;

        public e(PersonalLetterChatActivity personalLetterChatActivity) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class f implements k.i.h.b.d.m0.n.g {
        public final /* synthetic */ PersonalLetterChatActivity a;

        public f(PersonalLetterChatActivity personalLetterChatActivity) {
        }

        @Override // k.i.h.b.d.m0.n.g
        public void a() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class g extends RecyclerView.u {
        public boolean a;
        public final /* synthetic */ PersonalLetterChatActivity b;

        public g(PersonalLetterChatActivity personalLetterChatActivity) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void a(RecyclerView recyclerView, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i2, int i3) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class h extends o implements n.d0.c.a<WrapperLinearLayoutManager> {
        public final /* synthetic */ PersonalLetterChatActivity a;

        public h(PersonalLetterChatActivity personalLetterChatActivity) {
        }

        public final WrapperLinearLayoutManager b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ WrapperLinearLayoutManager invoke() {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.personal.letter.ui.PersonalLetterChatActivity$loadAndPickImageColor$2", f = "PersonalLetterChatActivity.kt", l = {542}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class i extends n.a0.k.a.l implements p<t0, n.a0.d<? super Integer>, Object> {
        public Object a;
        public Object b;
        public int c;
        public final /* synthetic */ PersonalLetterChatActivity d;
        public final /* synthetic */ String e;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a extends k.a.a.t.l.h<Bitmap> {
            public final /* synthetic */ s<Bitmap> d;

            public a(s<? super Bitmap> sVar) {
            }

            @Override // k.a.a.t.l.j
            public /* bridge */ /* synthetic */ void b(Object obj, k.a.a.t.m.f fVar) {
            }

            public void m(Bitmap bitmap, k.a.a.t.m.f<? super Bitmap> fVar) {
            }
        }

        public i(PersonalLetterChatActivity personalLetterChatActivity, String str, n.a0.d<? super i> dVar) {
        }

        @Override // n.a0.k.a.a
        public final n.a0.d<u> create(Object obj, n.a0.d<?> dVar) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ Object invoke(t0 t0Var, n.a0.d<? super Integer> dVar) {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(t0 t0Var, n.a0.d<? super Integer> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.personal.letter.ui.PersonalLetterChatActivity$refreshUserAvatar$1", f = "PersonalLetterChatActivity.kt", l = {509, 510}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class j extends n.a0.k.a.l implements p<t0, n.a0.d<? super u>, Object> {
        public int a;
        public int b;
        public int c;
        public final /* synthetic */ PersonalLetterChatActivity d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;

        public j(PersonalLetterChatActivity personalLetterChatActivity, String str, String str2, n.a0.d<? super j> dVar) {
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
    public static final class k extends o implements n.d0.c.a<ViewModelStore> {
        public final /* synthetic */ k.i.h.b.d.b1.b a;

        public k(k.i.h.b.d.b1.b bVar) {
        }

        public final ViewModelStore b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ ViewModelStore invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class l extends o implements n.d0.c.a<k.i.h.b.d.d1.c> {
        public final /* synthetic */ n.d0.c.a a;
        public final /* synthetic */ k.i.h.b.d.b1.b b;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a extends o implements n.d0.c.a<ViewModelProvider.Factory> {
            public final /* synthetic */ k.i.h.b.d.b1.b a;

            public a(k.i.h.b.d.b1.b bVar) {
            }

            public final ViewModelProvider.Factory b() {
            }

            @Override // n.d0.c.a
            public /* bridge */ /* synthetic */ ViewModelProvider.Factory invoke() {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class b extends o implements n.d0.c.l<ViewModel, u> {
            public final /* synthetic */ k.i.h.b.d.b1.b a;

            public b(k.i.h.b.d.b1.b bVar) {
            }

            public final void b(ViewModel viewModel) {
            }

            @Override // n.d0.c.l
            public /* bridge */ /* synthetic */ u invoke(ViewModel viewModel) {
            }
        }

        public l(n.d0.c.a aVar, k.i.h.b.d.b1.b bVar) {
        }

        public final k.i.h.b.d.d1.c b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ k.i.h.b.d.d1.c invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class m extends o implements n.d0.c.l<k.i.h.b.y.a.k.j0.a, u> {
        public final /* synthetic */ k.i.h.b.d.b1.b a;

        public m(k.i.h.b.d.b1.b bVar) {
        }

        public final void b(k.i.h.b.y.a.k.j0.a aVar) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ u invoke(k.i.h.b.y.a.k.j0.a aVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class n extends o implements n.d0.c.a<String> {
        public final /* synthetic */ PersonalLetterChatActivity a;

        public n(PersonalLetterChatActivity personalLetterChatActivity) {
        }

        public final String b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ String invoke() {
        }
    }

    public static final /* synthetic */ k.i.h.b.y.a.k.f0.g G1(PersonalLetterChatActivity personalLetterChatActivity) {
    }

    public static final /* synthetic */ k.i.h.b.y.a.h.b H1(PersonalLetterChatActivity personalLetterChatActivity) {
    }

    public static final /* synthetic */ boolean I1(PersonalLetterChatActivity personalLetterChatActivity) {
    }

    public static final /* synthetic */ ChatFooter J1(PersonalLetterChatActivity personalLetterChatActivity) {
    }

    public static final /* synthetic */ k.i.h.b.d.b1.f.c K1(PersonalLetterChatActivity personalLetterChatActivity) {
    }

    public static final /* synthetic */ k.i.h.b.y.a.k.j0.a L1(PersonalLetterChatActivity personalLetterChatActivity) {
    }

    public static final /* synthetic */ void M1(PersonalLetterChatActivity personalLetterChatActivity) {
    }

    public static final /* synthetic */ Object N1(PersonalLetterChatActivity personalLetterChatActivity, String str, n.a0.d dVar) {
    }

    public static final /* synthetic */ void O1(PersonalLetterChatActivity personalLetterChatActivity, boolean z) {
    }

    public static final /* synthetic */ void P1(PersonalLetterChatActivity personalLetterChatActivity, File file) {
    }

    public static final void X1(PersonalLetterChatActivity personalLetterChatActivity, int i2) {
    }

    public static final void Y1(View view) {
    }

    public static final void a2(PersonalLetterChatActivity personalLetterChatActivity, n.i iVar) {
    }

    public static final void b2(PersonalLetterChatActivity personalLetterChatActivity, n.i iVar) {
    }

    public static final void c2(PersonalLetterChatActivity personalLetterChatActivity, k.i.h.b.y.a.j.f.a aVar) {
    }

    public static final void d2(PersonalLetterChatActivity personalLetterChatActivity, k.i.h.b.y.a.k.g0.d.e eVar) {
    }

    public static final void f2(PersonalLetterChatActivity personalLetterChatActivity, View view) {
    }

    public static /* synthetic */ void g2(PersonalLetterChatActivity personalLetterChatActivity, boolean z) {
    }

    public static /* synthetic */ void h2(PersonalLetterChatActivity personalLetterChatActivity, k.i.h.b.y.a.j.f.a aVar) {
    }

    public static /* synthetic */ void i2(View view) {
    }

    public static /* synthetic */ void j2(PersonalLetterChatActivity personalLetterChatActivity, n.i iVar) {
    }

    public static /* synthetic */ void k2(PersonalLetterChatActivity personalLetterChatActivity, int i2) {
    }

    public static /* synthetic */ void l2(PersonalLetterChatActivity personalLetterChatActivity, k.i.h.b.y.a.k.g0.d.e eVar) {
    }

    public static /* synthetic */ void m2(PersonalLetterChatActivity personalLetterChatActivity, n.i iVar) {
    }

    public static /* synthetic */ void n2(PersonalLetterChatActivity personalLetterChatActivity, View view) {
    }

    public static final void t2(PersonalLetterChatActivity personalLetterChatActivity, boolean z) {
    }

    public final k.i.h.b.y.a.k.f0.g Q1() {
    }

    public final WrapperLinearLayoutManager R1() {
    }

    public final String S1() {
    }

    public final k.i.h.b.y.a.k.j0.a T1() {
    }

    public final void U1() {
    }

    public final int V1(k.i.h.b.y.a.k.g0.e.b bVar) {
    }

    public final void W1() {
    }

    public final void Z1() {
    }

    public final void e2() {
    }

    public final Object o2(String str, n.a0.d<? super Integer> dVar) {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // k.i.h.b.d.b1.b, k.i.h.b.d.b1.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, j.g.j.h, android.app.Activity
    public void onCreate(Bundle bundle) {
    }

    @Override // k.i.h.b.d.b1.b, j.b.k.d, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    @Override // k.i.h.b.d.b1.b, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
    }

    @Override // k.i.h.b.d.b1.b, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
    }

    public final void p2(boolean z, String str) {
    }

    public final void q2() {
    }

    public final void r2(k.i.h.b.y.a.k.j0.f fVar, List<k.i.h.b.y.a.k.g0.e.b> list) {
    }

    public final void s2(boolean z) {
    }
}
