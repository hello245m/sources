package com.tencent.mp.feature.base.ui.videopreview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.VideoView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tencent.mp.feature.base.ui.widget.VideoPlayButton;
import com.tencent.xweb.util.WXWebReporter;
import java.util.Map;
import n.u;
import o.a.f2;
import o.a.t0;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class VideoPreviewActivity extends k.i.h.b.d.b1.b {
    public static final a D = null;
    public boolean A;
    public boolean B;
    public Map<Integer, View> C;
    public final n.d h;

    /* renamed from: i, reason: collision with root package name */
    public final n.d f1338i;

    /* renamed from: j, reason: collision with root package name */
    public final n.d f1339j;

    /* renamed from: k, reason: collision with root package name */
    public final n.d f1340k;

    /* renamed from: l, reason: collision with root package name */
    public final n.d f1341l;

    /* renamed from: m, reason: collision with root package name */
    public final n.d f1342m;

    /* renamed from: n, reason: collision with root package name */
    public final n.d f1343n;

    /* renamed from: o, reason: collision with root package name */
    public final n.d f1344o;

    /* renamed from: p, reason: collision with root package name */
    public final n.d f1345p;

    /* renamed from: q, reason: collision with root package name */
    public final n.d f1346q;

    /* renamed from: r, reason: collision with root package name */
    public final n.d f1347r;

    /* renamed from: s, reason: collision with root package name */
    public final n.d f1348s;

    /* renamed from: t, reason: collision with root package name */
    public f2 f1349t;
    public boolean u;
    public Integer v;
    public boolean w;
    public boolean x;
    public Animator y;
    public f2 z;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(n.d0.d.h hVar) {
        }

        public final Intent a(Context context, Uri uri) {
        }

        public final void b(Activity activity, Uri uri, View view) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public final class b extends GestureDetector.SimpleOnGestureListener {
        public final /* synthetic */ VideoPreviewActivity a;

        public b(VideoPreviewActivity videoPreviewActivity) {
        }

        public final boolean a(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public final class c implements SeekBar.OnSeekBarChangeListener {
        public boolean a;
        public final /* synthetic */ VideoPreviewActivity b;

        public c(VideoPreviewActivity videoPreviewActivity) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class d extends AnimatorListenerAdapter {
        public final /* synthetic */ View[] a;

        public d(View[] viewArr) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class e extends AnimatorListenerAdapter {
        public final /* synthetic */ View[] a;

        public e(View[] viewArr) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class f extends n.d0.d.o implements n.d0.c.a<ImageView> {
        public final /* synthetic */ VideoPreviewActivity a;

        public f(VideoPreviewActivity videoPreviewActivity) {
        }

        public final ImageView b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ ImageView invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class g extends n.d0.d.o implements n.d0.c.a<TextView> {
        public final /* synthetic */ VideoPreviewActivity a;

        public g(VideoPreviewActivity videoPreviewActivity) {
        }

        public final TextView b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ TextView invoke() {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.base.ui.videopreview.VideoPreviewActivity$delayHideControlViews$1", f = "VideoPreviewActivity.kt", l = {338}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class h extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super u>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ VideoPreviewActivity c;

        public h(VideoPreviewActivity videoPreviewActivity, n.a0.d<? super h> dVar) {
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
    public static final class i extends n.d0.d.o implements n.d0.c.a<TextView> {
        public final /* synthetic */ VideoPreviewActivity a;

        public i(VideoPreviewActivity videoPreviewActivity) {
        }

        public final TextView b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ TextView invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class j extends n.d0.d.o implements n.d0.c.a<GestureDetector> {
        public final /* synthetic */ VideoPreviewActivity a;

        public j(VideoPreviewActivity videoPreviewActivity) {
        }

        public final GestureDetector b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ GestureDetector invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class k extends n.d0.d.o implements n.d0.c.a<b> {
        public final /* synthetic */ VideoPreviewActivity a;

        public k(VideoPreviewActivity videoPreviewActivity) {
        }

        public final b b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ b invoke() {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.base.ui.videopreview.VideoPreviewActivity$onPrepared$2", f = "VideoPreviewActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class l extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super u>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ VideoPreviewActivity c;

        @n.a0.k.a.f(c = "com.tencent.mp.feature.base.ui.videopreview.VideoPreviewActivity$onPrepared$2$1", f = "VideoPreviewActivity.kt", l = {WXWebReporter.WXXWEB_IDKEY_XWEB_LOAD_URL_MAX_FAILED, WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_FROM_WEB}, m = "invokeSuspend")
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super u>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ VideoPreviewActivity c;

            @n.a0.k.a.f(c = "com.tencent.mp.feature.base.ui.videopreview.VideoPreviewActivity$onPrepared$2$1$1", f = "VideoPreviewActivity.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.tencent.mp.feature.base.ui.videopreview.VideoPreviewActivity$l$a$a, reason: collision with other inner class name */
            /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
            public static final class C0047a extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super u>, Object> {
                public int a;
                public final /* synthetic */ VideoPreviewActivity b;

                public C0047a(VideoPreviewActivity videoPreviewActivity, n.a0.d<? super C0047a> dVar) {
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

            public a(VideoPreviewActivity videoPreviewActivity, n.a0.d<? super a> dVar) {
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

        public l(VideoPreviewActivity videoPreviewActivity, n.a0.d<? super l> dVar) {
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
    public static final class m extends n.d0.d.o implements n.d0.c.a<ImageView> {
        public final /* synthetic */ VideoPreviewActivity a;

        public m(VideoPreviewActivity videoPreviewActivity) {
        }

        public final ImageView b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ ImageView invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class n extends n.d0.d.o implements n.d0.c.a<VideoPlayButton> {
        public final /* synthetic */ VideoPreviewActivity a;

        public n(VideoPreviewActivity videoPreviewActivity) {
        }

        public final VideoPlayButton b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ VideoPlayButton invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class o extends n.d0.d.o implements n.d0.c.a<SeekBar> {
        public final /* synthetic */ VideoPreviewActivity a;

        public o(VideoPreviewActivity videoPreviewActivity) {
        }

        public final SeekBar b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ SeekBar invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class p extends n.d0.d.o implements n.d0.c.a<ConstraintLayout> {
        public final /* synthetic */ VideoPreviewActivity a;

        public p(VideoPreviewActivity videoPreviewActivity) {
        }

        public final ConstraintLayout b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ ConstraintLayout invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class q extends n.d0.d.o implements n.d0.c.a<Uri> {
        public final /* synthetic */ VideoPreviewActivity a;

        public q(VideoPreviewActivity videoPreviewActivity) {
        }

        public final Uri b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ Uri invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class r extends n.d0.d.o implements n.d0.c.a<VideoView> {
        public final /* synthetic */ VideoPreviewActivity a;

        public r(VideoPreviewActivity videoPreviewActivity) {
        }

        public final VideoView b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ VideoView invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class s extends n.d0.d.o implements n.d0.c.a<Boolean> {
        public final /* synthetic */ VideoPreviewActivity a;

        public s(VideoPreviewActivity videoPreviewActivity) {
        }

        public final Boolean b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ Boolean invoke() {
        }
    }

    public static /* synthetic */ void A2(VideoPreviewActivity videoPreviewActivity, View view) {
    }

    public static /* synthetic */ void B2(VideoPreviewActivity videoPreviewActivity, MediaPlayer mediaPlayer) {
    }

    public static /* synthetic */ boolean C2(VideoPreviewActivity videoPreviewActivity, MediaPlayer mediaPlayer, int i2, int i3) {
    }

    public static final void F2(VideoPreviewActivity videoPreviewActivity, MediaPlayer mediaPlayer, int i2, int i3) {
    }

    public static final /* synthetic */ void H1(VideoPreviewActivity videoPreviewActivity) {
    }

    public static final /* synthetic */ void I1(VideoPreviewActivity videoPreviewActivity) {
    }

    public static final /* synthetic */ void J1(VideoPreviewActivity videoPreviewActivity) {
    }

    public static final /* synthetic */ void K1(VideoPreviewActivity videoPreviewActivity) {
    }

    public static final /* synthetic */ String L1(VideoPreviewActivity videoPreviewActivity, int i2) {
    }

    public static final /* synthetic */ boolean M1(VideoPreviewActivity videoPreviewActivity) {
    }

    public static final /* synthetic */ TextView N1(VideoPreviewActivity videoPreviewActivity) {
    }

    public static final /* synthetic */ b O1(VideoPreviewActivity videoPreviewActivity) {
    }

    public static final /* synthetic */ ConstraintLayout P1(VideoPreviewActivity videoPreviewActivity) {
    }

    public static final /* synthetic */ boolean Q1(VideoPreviewActivity videoPreviewActivity) {
    }

    public static final /* synthetic */ VideoView R1(VideoPreviewActivity videoPreviewActivity) {
    }

    public static final /* synthetic */ void S1(VideoPreviewActivity videoPreviewActivity, boolean z) {
    }

    public static final /* synthetic */ void T1(VideoPreviewActivity videoPreviewActivity, boolean z) {
    }

    public static final /* synthetic */ void U1(VideoPreviewActivity videoPreviewActivity) {
    }

    public static final void n2(VideoPreviewActivity videoPreviewActivity, View view) {
    }

    public static final void o2(VideoPreviewActivity videoPreviewActivity, MediaPlayer mediaPlayer) {
    }

    public static final boolean p2(VideoPreviewActivity videoPreviewActivity, MediaPlayer mediaPlayer, int i2, int i3) {
    }

    public static final void q2(VideoPreviewActivity videoPreviewActivity, MediaPlayer mediaPlayer) {
    }

    public static final void r2(VideoPreviewActivity videoPreviewActivity, View view) {
    }

    public static final void s2(VideoPreviewActivity videoPreviewActivity, View view) {
    }

    public static final void u2(VideoPreviewActivity videoPreviewActivity) {
    }

    public static /* synthetic */ void v2(VideoPreviewActivity videoPreviewActivity) {
    }

    public static /* synthetic */ void w2(VideoPreviewActivity videoPreviewActivity, MediaPlayer mediaPlayer, int i2, int i3) {
    }

    public static /* synthetic */ void x2(VideoPreviewActivity videoPreviewActivity, View view) {
    }

    public static /* synthetic */ void y2(VideoPreviewActivity videoPreviewActivity, View view) {
    }

    public static /* synthetic */ void z2(VideoPreviewActivity videoPreviewActivity, MediaPlayer mediaPlayer) {
    }

    public final void D2() {
    }

    public final void E2(MediaPlayer mediaPlayer) {
    }

    public View G1(int i2) {
    }

    public final void G2() {
    }

    public final void H2() {
    }

    public final void I2() {
    }

    public final void J2(int i2, int i3) {
    }

    public final void K2() {
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

    public final void Y1() {
    }

    public final String Z1(int i2) {
    }

    public final ImageView a2() {
    }

    public final TextView b2() {
    }

    public final TextView c2() {
    }

    public final GestureDetector d2() {
    }

    public final b e2() {
    }

    public final ImageView f2() {
    }

    public final VideoPlayButton g2() {
    }

    public final SeekBar h2() {
    }

    public final ConstraintLayout i2() {
    }

    public final Uri j2() {
    }

    public final VideoView k2() {
    }

    public final boolean l2() {
    }

    public final void m2() {
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

    @Override // android.app.Activity
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    public final void t2() {
    }
}
