package com.tencent.mp.feature.article.edit.ui;

import android.animation.ValueAnimator;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.tencent.xweb.util.WXWebReporter;
import com.yalantis.ucrop.view.GestureVideoPlayer;
import java.util.ArrayList;
import k.i.h.b.b.b.m.w;
import k.j.a.e.f;
import n.d0.c.p;
import n.d0.d.o;
import n.u;
import o.a.f2;
import o.a.t0;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class SelectVideoCoverActivity extends k.i.h.b.d.b1.b {
    public final n.d h;

    /* renamed from: i, reason: collision with root package name */
    public long f1223i;

    /* renamed from: j, reason: collision with root package name */
    public int f1224j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1225k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1226l;

    /* renamed from: m, reason: collision with root package name */
    public b f1227m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1228n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList<ImageView> f1229o;

    /* renamed from: p, reason: collision with root package name */
    public final n.d f1230p;

    /* renamed from: q, reason: collision with root package name */
    public final Matrix f1231q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1232r;

    /* renamed from: s, reason: collision with root package name */
    public final n.d f1233s;

    /* renamed from: t, reason: collision with root package name */
    public final n.d f1234t;
    public final n.d u;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public final class a implements b {
        public ValueAnimator a;
        public final /* synthetic */ SelectVideoCoverActivity b;

        public a(SelectVideoCoverActivity selectVideoCoverActivity) {
        }

        public static final void d(SelectVideoCoverActivity selectVideoCoverActivity, ValueAnimator valueAnimator) {
        }

        public static /* synthetic */ void e(SelectVideoCoverActivity selectVideoCoverActivity, ValueAnimator valueAnimator) {
        }

        @Override // com.tencent.mp.feature.article.edit.ui.SelectVideoCoverActivity.b
        public void a() {
        }

        @Override // com.tencent.mp.feature.article.edit.ui.SelectVideoCoverActivity.b
        public void b(float f, long j2) {
        }

        @Override // com.tencent.mp.feature.article.edit.ui.SelectVideoCoverActivity.b
        public void c(float f) {
        }

        @Override // com.tencent.mp.feature.article.edit.ui.SelectVideoCoverActivity.b
        public void cancel() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface b {
        void a();

        void b(float f, long j2);

        void c(float f);

        void cancel();
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.article.edit.ui.SelectVideoCoverActivity$confirm$1", f = "SelectVideoCoverActivity.kt", l = {358}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class c extends n.a0.k.a.l implements p<t0, n.a0.d<? super u>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ SelectVideoCoverActivity c;

        @n.a0.k.a.f(c = "com.tencent.mp.feature.article.edit.ui.SelectVideoCoverActivity$confirm$1$1", f = "SelectVideoCoverActivity.kt", l = {}, m = "invokeSuspend")
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a extends n.a0.k.a.l implements p<t0, n.a0.d<? super Boolean>, Object> {
            public int a;
            public final /* synthetic */ String b;
            public final /* synthetic */ Bitmap c;

            public a(String str, Bitmap bitmap, n.a0.d<? super a> dVar) {
            }

            @Override // n.a0.k.a.a
            public final n.a0.d<u> create(Object obj, n.a0.d<?> dVar) {
            }

            @Override // n.d0.c.p
            public /* bridge */ /* synthetic */ Object invoke(t0 t0Var, n.a0.d<? super Boolean> dVar) {
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(t0 t0Var, n.a0.d<? super Boolean> dVar) {
            }

            @Override // n.a0.k.a.a
            public final Object invokeSuspend(Object obj) {
            }
        }

        public c(SelectVideoCoverActivity selectVideoCoverActivity, n.a0.d<? super c> dVar) {
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

    @n.a0.k.a.f(c = "com.tencent.mp.feature.article.edit.ui.SelectVideoCoverActivity$initPreviewImageList$1", f = "SelectVideoCoverActivity.kt", l = {210}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class d extends n.a0.k.a.l implements p<t0, n.a0.d<? super u>, Object> {
        public int a;
        public final /* synthetic */ SelectVideoCoverActivity b;

        @n.a0.k.a.f(c = "com.tencent.mp.feature.article.edit.ui.SelectVideoCoverActivity$initPreviewImageList$1$1", f = "SelectVideoCoverActivity.kt", l = {229, WXWebReporter.KEY_SET_DATA_SUFFIX_INVOKE_METHOD_FAILED, WXWebReporter.KEY_FREQ_LOAD_FAILED_15_TIMES}, m = "invokeSuspend")
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a extends n.a0.k.a.l implements p<t0, n.a0.d<? super u>, Object> {
            public Object a;
            public Object b;
            public Object c;
            public Object d;
            public int e;
            public int f;
            public long g;
            public int h;

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ SelectVideoCoverActivity f1235i;

            @n.a0.k.a.f(c = "com.tencent.mp.feature.article.edit.ui.SelectVideoCoverActivity$initPreviewImageList$1$1$1$bitmap$1", f = "SelectVideoCoverActivity.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.tencent.mp.feature.article.edit.ui.SelectVideoCoverActivity$d$a$a, reason: collision with other inner class name */
            /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
            public static final class C0037a extends n.a0.k.a.l implements p<t0, n.a0.d<? super Bitmap>, Object> {
                public int a;
                public final /* synthetic */ MediaMetadataRetriever b;
                public final /* synthetic */ int c;

                public C0037a(MediaMetadataRetriever mediaMetadataRetriever, int i2, n.a0.d<? super C0037a> dVar) {
                }

                @Override // n.a0.k.a.a
                public final n.a0.d<u> create(Object obj, n.a0.d<?> dVar) {
                }

                @Override // n.d0.c.p
                public /* bridge */ /* synthetic */ Object invoke(t0 t0Var, n.a0.d<? super Bitmap> dVar) {
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(t0 t0Var, n.a0.d<? super Bitmap> dVar) {
                }

                @Override // n.a0.k.a.a
                public final Object invokeSuspend(Object obj) {
                }
            }

            public a(SelectVideoCoverActivity selectVideoCoverActivity, n.a0.d<? super a> dVar) {
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

        public d(SelectVideoCoverActivity selectVideoCoverActivity, n.a0.d<? super d> dVar) {
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
    public static final class e implements f.a {
        public final /* synthetic */ SelectVideoCoverActivity a;
        public final /* synthetic */ GestureVideoPlayer b;

        public e(SelectVideoCoverActivity selectVideoCoverActivity, GestureVideoPlayer gestureVideoPlayer) {
        }

        @Override // k.j.a.e.f.a
        public void a() {
        }

        @Override // k.j.a.e.f.a
        public void b() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class f extends o implements n.d0.c.a<w> {
        public final /* synthetic */ SelectVideoCoverActivity a;

        public f(SelectVideoCoverActivity selectVideoCoverActivity) {
        }

        public final w b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ w invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class g extends o implements n.d0.c.a<Integer> {
        public static final g a = null;

        public final Integer b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ Integer invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class h extends o implements n.d0.c.a<Integer> {
        public final /* synthetic */ SelectVideoCoverActivity a;

        public h(SelectVideoCoverActivity selectVideoCoverActivity) {
        }

        public final Integer b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ Integer invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class i extends o implements n.d0.c.a<Uri> {
        public final /* synthetic */ SelectVideoCoverActivity a;

        public i(SelectVideoCoverActivity selectVideoCoverActivity) {
        }

        public final Uri b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ Uri invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class j extends o implements n.d0.c.a<Integer> {
        public final /* synthetic */ SelectVideoCoverActivity a;

        public j(SelectVideoCoverActivity selectVideoCoverActivity) {
        }

        public final Integer b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ Integer invoke() {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.article.edit.ui.SelectVideoCoverActivity$prepareImageView$2", f = "SelectVideoCoverActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class k extends n.a0.k.a.l implements p<t0, n.a0.d<? super ImageView>, Object> {
        public int a;
        public final /* synthetic */ SelectVideoCoverActivity b;

        public k(SelectVideoCoverActivity selectVideoCoverActivity, n.a0.d<? super k> dVar) {
        }

        @Override // n.a0.k.a.a
        public final n.a0.d<u> create(Object obj, n.a0.d<?> dVar) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ Object invoke(t0 t0Var, n.a0.d<? super ImageView> dVar) {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(t0 t0Var, n.a0.d<? super ImageView> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.article.edit.ui.SelectVideoCoverActivity", f = "SelectVideoCoverActivity.kt", l = {254}, m = "showImage")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class l extends n.a0.k.a.d {
        public /* synthetic */ Object a;
        public final /* synthetic */ SelectVideoCoverActivity b;
        public int c;

        public l(SelectVideoCoverActivity selectVideoCoverActivity, n.a0.d<? super l> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.article.edit.ui.SelectVideoCoverActivity$showImage$2", f = "SelectVideoCoverActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class m extends n.a0.k.a.l implements p<t0, n.a0.d<? super k.a.a.t.l.k<ImageView, Drawable>>, Object> {
        public int a;
        public final /* synthetic */ SelectVideoCoverActivity b;
        public final /* synthetic */ Bitmap c;
        public final /* synthetic */ ImageView d;

        public m(SelectVideoCoverActivity selectVideoCoverActivity, Bitmap bitmap, ImageView imageView, n.a0.d<? super m> dVar) {
        }

        @Override // n.a0.k.a.a
        public final n.a0.d<u> create(Object obj, n.a0.d<?> dVar) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ Object invoke(t0 t0Var, n.a0.d<? super k.a.a.t.l.k<ImageView, Drawable>> dVar) {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(t0 t0Var, n.a0.d<? super k.a.a.t.l.k<ImageView, Drawable>> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    public static /* synthetic */ void A2(GestureVideoPlayer gestureVideoPlayer, SelectVideoCoverActivity selectVideoCoverActivity, MediaPlayer mediaPlayer) {
    }

    public static final void D2(SelectVideoCoverActivity selectVideoCoverActivity, DialogInterface dialogInterface, int i2) {
    }

    public static final /* synthetic */ void G1(SelectVideoCoverActivity selectVideoCoverActivity, String str) {
    }

    public static final /* synthetic */ String H1(SelectVideoCoverActivity selectVideoCoverActivity) {
    }

    public static final /* synthetic */ boolean I1(SelectVideoCoverActivity selectVideoCoverActivity) {
    }

    public static final /* synthetic */ Matrix J1(SelectVideoCoverActivity selectVideoCoverActivity) {
    }

    public static final /* synthetic */ w K1(SelectVideoCoverActivity selectVideoCoverActivity) {
    }

    public static final /* synthetic */ int L1(SelectVideoCoverActivity selectVideoCoverActivity) {
    }

    public static final /* synthetic */ ArrayList M1(SelectVideoCoverActivity selectVideoCoverActivity) {
    }

    public static final /* synthetic */ int N1(SelectVideoCoverActivity selectVideoCoverActivity) {
    }

    public static final /* synthetic */ Uri O1(SelectVideoCoverActivity selectVideoCoverActivity) {
    }

    public static final /* synthetic */ int P1(SelectVideoCoverActivity selectVideoCoverActivity) {
    }

    public static final /* synthetic */ void Q1(SelectVideoCoverActivity selectVideoCoverActivity) {
    }

    public static final /* synthetic */ Object R1(SelectVideoCoverActivity selectVideoCoverActivity, n.a0.d dVar) {
    }

    public static final /* synthetic */ void S1(SelectVideoCoverActivity selectVideoCoverActivity, boolean z) {
    }

    public static final /* synthetic */ void T1(SelectVideoCoverActivity selectVideoCoverActivity, long j2) {
    }

    public static final /* synthetic */ Object U1(SelectVideoCoverActivity selectVideoCoverActivity, Bitmap bitmap, ImageView imageView, n.a0.d dVar) {
    }

    public static final boolean f2(SelectVideoCoverActivity selectVideoCoverActivity, View view, MotionEvent motionEvent) {
    }

    public static final void g2(SelectVideoCoverActivity selectVideoCoverActivity, View view) {
    }

    public static final void h2(SelectVideoCoverActivity selectVideoCoverActivity, View view) {
    }

    public static final void i2(SelectVideoCoverActivity selectVideoCoverActivity, View view) {
    }

    public static final void l2(SelectVideoCoverActivity selectVideoCoverActivity, View view) {
    }

    public static final void n2(GestureVideoPlayer gestureVideoPlayer, SelectVideoCoverActivity selectVideoCoverActivity, MediaPlayer mediaPlayer) {
    }

    public static final void o2(SelectVideoCoverActivity selectVideoCoverActivity, MediaPlayer mediaPlayer) {
    }

    public static final boolean p2(SelectVideoCoverActivity selectVideoCoverActivity, MediaPlayer mediaPlayer, int i2, int i3) {
    }

    public static /* synthetic */ void s2(SelectVideoCoverActivity selectVideoCoverActivity, MediaPlayer mediaPlayer) {
    }

    public static /* synthetic */ void t2(SelectVideoCoverActivity selectVideoCoverActivity, View view) {
    }

    public static /* synthetic */ void u2(SelectVideoCoverActivity selectVideoCoverActivity, View view) {
    }

    public static /* synthetic */ boolean v2(SelectVideoCoverActivity selectVideoCoverActivity, MediaPlayer mediaPlayer, int i2, int i3) {
    }

    public static /* synthetic */ void w2(SelectVideoCoverActivity selectVideoCoverActivity, DialogInterface dialogInterface, int i2) {
    }

    public static /* synthetic */ boolean x2(SelectVideoCoverActivity selectVideoCoverActivity, View view, MotionEvent motionEvent) {
    }

    public static /* synthetic */ void y2(SelectVideoCoverActivity selectVideoCoverActivity, View view) {
    }

    public static /* synthetic */ void z2(SelectVideoCoverActivity selectVideoCoverActivity, View view) {
    }

    public final void B2() {
    }

    public final void C2() {
    }

    public final void E2() {
    }

    public final Object F2(n.a0.d<? super ImageView> dVar) {
    }

    public final Object G2(Bitmap bitmap, ImageView imageView, n.a0.d<? super k.a.a.t.l.k<ImageView, Drawable>> dVar) {
    }

    public final void H2(int i2) {
    }

    public final void I2() {
    }

    public final void J2() {
    }

    public final void K2(float f2, float f3) {
    }

    public final void L2(float f2) {
    }

    public final void V1() {
    }

    public final f2 W1() {
    }

    @Override // k.i.h.b.d.b1.a
    public j.z.a X0() {
    }

    public final void X1(String str) {
    }

    public final String Y1() {
    }

    public final w Z1() {
    }

    public final int a2() {
    }

    public final int b2() {
    }

    public final Uri c2() {
    }

    public final int d2() {
    }

    public final void e2() {
    }

    public final f2 j2() {
    }

    public final void k2() {
    }

    public final void m2() {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // k.i.h.b.d.b1.b, k.i.h.b.d.b1.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, j.g.j.h, android.app.Activity
    public void onCreate(Bundle bundle) {
    }

    public final void q2() {
    }

    public final void r2() {
    }
}
