package com.tencent.mp.feature.article.history.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.mp.feature.base.ui.widget.SearchViewBar;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import k.i.h.c.d.a.h.e.f;
import n.d0.c.l;
import n.d0.d.o;
import n.u;
import q.xa;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class ArticleHistorySearchActivity extends k.i.h.b.d.b1.b {
    public final n.d h;

    /* renamed from: i, reason: collision with root package name */
    public final n.d f1289i;

    /* renamed from: j, reason: collision with root package name */
    public String f1290j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList<k.i.h.b.b.c.m.b.c> f1291k;

    /* renamed from: l, reason: collision with root package name */
    public final k.i.h.c.d.a.h.e.f<k.i.h.b.b.c.m.b.c, RecyclerView.e0> f1292l;

    /* renamed from: m, reason: collision with root package name */
    public Map<Integer, View> f1293m;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a implements SearchViewBar.b {
        public final Handler a;
        public boolean b;
        public final /* synthetic */ ArticleHistorySearchActivity c;

        /* renamed from: com.tencent.mp.feature.article.history.ui.ArticleHistorySearchActivity$a$a, reason: collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class RunnableC0042a implements Runnable {
            public final /* synthetic */ ArticleHistorySearchActivity a;
            public final /* synthetic */ a b;

            public RunnableC0042a(ArticleHistorySearchActivity articleHistorySearchActivity, a aVar) {
            }

            public static /* synthetic */ void a(ArticleHistorySearchActivity articleHistorySearchActivity, k.i.h.b.d.w0.d.b bVar) {
            }

            public static final void b(ArticleHistorySearchActivity articleHistorySearchActivity, k.i.h.b.d.w0.d.b bVar) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public a(ArticleHistorySearchActivity articleHistorySearchActivity) {
        }

        @Override // com.tencent.mp.feature.base.ui.widget.SearchViewBar.b
        public void a(String str) {
        }

        @Override // com.tencent.mp.feature.base.ui.widget.SearchViewBar.b
        public void b(String str) {
        }

        public final Handler c() {
        }

        public final void d(boolean z) {
        }

        @Override // com.tencent.mp.feature.base.ui.widget.SearchViewBar.b
        public void onCancel() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class b extends f.a<k.i.h.b.b.c.m.b.c, RecyclerView.e0> {
        public final /* synthetic */ ArticleHistorySearchActivity a;

        public b(ArticleHistorySearchActivity articleHistorySearchActivity) {
        }

        public static final void f(ArticleHistorySearchActivity articleHistorySearchActivity, k.i.h.b.b.c.m.b.c cVar, View view) {
        }

        public static final void g(ArticleHistorySearchActivity articleHistorySearchActivity, k.i.h.b.b.c.m.b.c cVar, View view) {
        }

        public static /* synthetic */ void j(ArticleHistorySearchActivity articleHistorySearchActivity, k.i.h.b.b.c.m.b.c cVar, View view) {
        }

        public static /* synthetic */ void k(ArticleHistorySearchActivity articleHistorySearchActivity, k.i.h.b.b.c.m.b.c cVar, View view) {
        }

        @Override // k.i.h.c.d.a.h.e.f.a
        public /* bridge */ /* synthetic */ void a(f.b<RecyclerView.e0> bVar, int i2, k.i.h.b.b.c.m.b.c cVar) {
        }

        @Override // k.i.h.c.d.a.h.e.f.a
        public /* bridge */ /* synthetic */ RecyclerView.e0 b(View view, int i2) {
        }

        @Override // k.i.h.c.d.a.h.e.f.a
        public int c(int i2) {
        }

        @Override // k.i.h.c.d.a.h.e.f.a
        public /* bridge */ /* synthetic */ int d(int i2, k.i.h.b.b.c.m.b.c cVar) {
        }

        public void e(f.b<RecyclerView.e0> bVar, int i2, k.i.h.b.b.c.m.b.c cVar) {
        }

        public RecyclerView.e0 h(View view, int i2) {
        }

        public int i(int i2, k.i.h.b.b.c.m.b.c cVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class c extends o implements n.d0.c.a<Integer> {
        public final /* synthetic */ Activity a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Object c;

        public c(Activity activity, String str, Object obj) {
        }

        @Override // n.d0.c.a
        public final Integer invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class d extends o implements n.d0.c.a<ViewModelStore> {
        public final /* synthetic */ k.i.h.b.d.b1.b a;

        public d(k.i.h.b.d.b1.b bVar) {
        }

        public final ViewModelStore b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ ViewModelStore invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class e extends o implements n.d0.c.a<k.i.h.b.d.d1.c> {
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
        public static final class b extends o implements l<ViewModel, u> {
            public final /* synthetic */ k.i.h.b.d.b1.b a;

            public b(k.i.h.b.d.b1.b bVar) {
            }

            public final void b(ViewModel viewModel) {
            }

            @Override // n.d0.c.l
            public /* bridge */ /* synthetic */ u invoke(ViewModel viewModel) {
            }
        }

        public e(n.d0.c.a aVar, k.i.h.b.d.b1.b bVar) {
        }

        public final k.i.h.b.d.d1.c b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ k.i.h.b.d.d1.c invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class f extends o implements l<k.i.h.b.b.c.p.e, u> {
        public final /* synthetic */ k.i.h.b.d.b1.b a;

        public f(k.i.h.b.d.b1.b bVar) {
        }

        public final void b(k.i.h.b.b.c.p.e eVar) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ u invoke(k.i.h.b.b.c.p.e eVar) {
        }
    }

    public static final /* synthetic */ ArrayList H1(ArticleHistorySearchActivity articleHistorySearchActivity) {
    }

    public static final /* synthetic */ int I1(ArticleHistorySearchActivity articleHistorySearchActivity) {
    }

    public static final /* synthetic */ k.i.h.b.b.c.p.e J1(ArticleHistorySearchActivity articleHistorySearchActivity) {
    }

    public static final /* synthetic */ String K1(ArticleHistorySearchActivity articleHistorySearchActivity) {
    }

    public static final /* synthetic */ k.i.h.c.d.a.h.e.f L1(ArticleHistorySearchActivity articleHistorySearchActivity) {
    }

    public static final /* synthetic */ void M1(ArticleHistorySearchActivity articleHistorySearchActivity, String str) {
    }

    public static final /* synthetic */ void N1(ArticleHistorySearchActivity articleHistorySearchActivity, k.i.h.b.d.w0.d.b bVar) {
    }

    public static final void S1(ArticleHistorySearchActivity articleHistorySearchActivity) {
    }

    public static final void T1(ArticleHistorySearchActivity articleHistorySearchActivity, k.i.h.b.d.w0.d.b bVar) {
    }

    public static /* synthetic */ void U1(ArticleHistorySearchActivity articleHistorySearchActivity, k.i.h.b.d.w0.d.b bVar) {
    }

    public static /* synthetic */ void V1(ArticleHistorySearchActivity articleHistorySearchActivity, k.i.h.b.d.w0.d.b bVar) {
    }

    public static /* synthetic */ void W1(ArticleHistorySearchActivity articleHistorySearchActivity) {
    }

    public static /* synthetic */ void X1(ArticleHistorySearchActivity articleHistorySearchActivity, k.i.h.a.a.a aVar) {
    }

    public static final void Z1(ArticleHistorySearchActivity articleHistorySearchActivity, k.i.h.a.a.a aVar) {
    }

    public static final void a2(ArticleHistorySearchActivity articleHistorySearchActivity, k.i.h.b.d.w0.d.b bVar) {
    }

    public View G1(int i2) {
    }

    public final int O1() {
    }

    public final k.i.h.b.b.c.p.e P1() {
    }

    public final void Q1() {
    }

    public final void R1() {
    }

    @Override // k.i.h.b.d.b1.a
    public int W0() {
    }

    public final void Y1() {
    }

    public final void b2(List<xa> list) {
    }

    public final void c2(k.i.h.b.d.w0.d.b<List<xa>> bVar) {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
    }

    @Override // k.i.h.b.d.b1.b, k.i.h.b.d.b1.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, j.g.j.h, android.app.Activity
    public void onCreate(Bundle bundle) {
    }
}
