package com.tencent.mp.feature.music.ui;

import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.mp.feature.base.ui.widget.SearchViewBar;
import java.util.List;
import java.util.Map;
import k.i.h.b.d.w0.c.i;
import k.i.h.c.d.a.h.e.b;
import q.t5;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class SearchMusicActivity extends k.i.h.b.d.b1.b {
    public Integer h;

    /* renamed from: i, reason: collision with root package name */
    public String f1651i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1652j;

    /* renamed from: k, reason: collision with root package name */
    public k.i.f.d.c f1653k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1654l;

    /* renamed from: m, reason: collision with root package name */
    public final MutableLiveData<i<t5>> f1655m;

    /* renamed from: n, reason: collision with root package name */
    public List<t5.b> f1656n;

    /* renamed from: o, reason: collision with root package name */
    public final k.i.d.b.d.a.c<k.i.f.d.c> f1657o;

    /* renamed from: p, reason: collision with root package name */
    public final k.i.h.c.d.a.h.e.b<k.i.f.d.c, a> f1658p;

    /* renamed from: q, reason: collision with root package name */
    public Map<Integer, View> f1659q;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public final class a extends RecyclerView.e0 {
        public final TextView a;
        public final TextView b;
        public final ImageView c;
        public final ImageView d;

        public a(SearchMusicActivity searchMusicActivity, View view) {
        }

        public final ImageView c() {
        }

        public final ImageView l() {
        }

        public final TextView n() {
        }

        public final TextView p() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class b implements SearchViewBar.b {
        public final Handler a;
        public boolean b;
        public final /* synthetic */ SearchMusicActivity c;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a implements Runnable {
            public final /* synthetic */ SearchMusicActivity a;
            public final /* synthetic */ b b;

            public a(SearchMusicActivity searchMusicActivity, b bVar) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public b(SearchMusicActivity searchMusicActivity) {
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
    public static final class c extends b.a<k.i.f.d.c, a> {
        public final /* synthetic */ SearchMusicActivity a;

        public c(SearchMusicActivity searchMusicActivity) {
        }

        public static final void f(SearchMusicActivity searchMusicActivity, k.i.f.d.c cVar, a aVar, View view) {
        }

        public static final void g(int i2, SearchMusicActivity searchMusicActivity, View view) {
        }

        public static /* synthetic */ void i(SearchMusicActivity searchMusicActivity, k.i.f.d.c cVar, a aVar, View view) {
        }

        public static /* synthetic */ void j(int i2, SearchMusicActivity searchMusicActivity, View view) {
        }

        @Override // k.i.h.c.d.a.h.e.b.a
        public /* bridge */ /* synthetic */ void a(a aVar, int i2, k.i.f.d.c cVar) {
        }

        @Override // k.i.h.c.d.a.h.e.b.a
        public /* bridge */ /* synthetic */ a b(View view, int i2) {
        }

        @Override // k.i.h.c.d.a.h.e.b.a
        public int c(int i2) {
        }

        public void e(a aVar, int i2, k.i.f.d.c cVar) {
        }

        public a h(View view, int i2) {
        }
    }

    public static final /* synthetic */ void H1(SearchMusicActivity searchMusicActivity) {
    }

    public static final /* synthetic */ void I1(SearchMusicActivity searchMusicActivity, String str) {
    }

    public static final /* synthetic */ k.i.f.d.c J1(SearchMusicActivity searchMusicActivity) {
    }

    public static final /* synthetic */ String K1(SearchMusicActivity searchMusicActivity) {
    }

    public static final /* synthetic */ boolean L1(SearchMusicActivity searchMusicActivity) {
    }

    public static final /* synthetic */ k.i.d.b.d.a.c M1(SearchMusicActivity searchMusicActivity) {
    }

    public static final /* synthetic */ List N1(SearchMusicActivity searchMusicActivity) {
    }

    public static final /* synthetic */ k.i.h.c.d.a.h.e.b O1(SearchMusicActivity searchMusicActivity) {
    }

    public static final /* synthetic */ void P1(SearchMusicActivity searchMusicActivity, k.i.f.d.c cVar) {
    }

    public static final /* synthetic */ void Q1(SearchMusicActivity searchMusicActivity, String str) {
    }

    public static final /* synthetic */ void R1(SearchMusicActivity searchMusicActivity, boolean z) {
    }

    public static final /* synthetic */ void S1(SearchMusicActivity searchMusicActivity, boolean z) {
    }

    public static final void W1(SearchMusicActivity searchMusicActivity) {
    }

    public static final boolean X1(SearchMusicActivity searchMusicActivity, View view, MotionEvent motionEvent) {
    }

    public static /* synthetic */ void Y1(SearchMusicActivity searchMusicActivity) {
    }

    public static /* synthetic */ boolean Z1(SearchMusicActivity searchMusicActivity, View view, MotionEvent motionEvent) {
    }

    public static /* synthetic */ void a2(SearchMusicActivity searchMusicActivity, i iVar) {
    }

    public static final void d2(SearchMusicActivity searchMusicActivity, i iVar) {
    }

    public View G1(int i2) {
    }

    public final void T1() {
    }

    public final void U1(String str) {
    }

    public final void V1() {
    }

    @Override // k.i.h.b.d.b1.a
    public int W0() {
    }

    public final void b2(List<? extends k.i.f.d.c> list) {
    }

    public final void c2() {
    }

    @Override // k.i.h.b.d.b1.b, k.i.h.b.d.b1.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, j.g.j.h, android.app.Activity
    public void onCreate(Bundle bundle) {
    }

    @Override // k.i.h.b.d.b1.b, j.b.k.d, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    @Override // j.b.k.d, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
    }
}
