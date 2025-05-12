package com.google.android.exoplayer2.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import java.util.List;
import k.d.a.a.e3;
import k.d.a.a.f3;
import k.d.a.a.f4;
import k.d.a.a.g4;
import k.d.a.a.n3;
import k.d.a.a.p3;
import k.d.a.a.q2;
import k.d.a.a.q3;
import k.d.a.a.t4.f;
import k.d.a.a.u4.a0;
import k.d.a.a.v4.i;
import k.d.a.a.v4.j;
import k.d.a.a.v4.p;
import k.d.a.a.x4.o;
import k.d.a.a.y4.b0;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

@Deprecated
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class PlayerView extends FrameLayout implements j {
    public final a a;
    public final AspectRatioFrameLayout b;
    public final View c;
    public final View d;
    public final boolean e;
    public final ImageView f;
    public final SubtitleView g;
    public final View h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f377i;

    /* renamed from: j, reason: collision with root package name */
    public final p f378j;

    /* renamed from: k, reason: collision with root package name */
    public final FrameLayout f379k;

    /* renamed from: l, reason: collision with root package name */
    public final FrameLayout f380l;

    /* renamed from: m, reason: collision with root package name */
    public q3 f381m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f382n;

    /* renamed from: o, reason: collision with root package name */
    public p.e f383o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f384p;

    /* renamed from: q, reason: collision with root package name */
    public Drawable f385q;

    /* renamed from: r, reason: collision with root package name */
    public int f386r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f387s;

    /* renamed from: t, reason: collision with root package name */
    public o<? super n3> f388t;
    public CharSequence u;
    public int v;
    public boolean w;
    public boolean x;
    public boolean y;
    public int z;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public final class a implements q3.d, View.OnLayoutChangeListener, View.OnClickListener, p.e {
        public final f4.b a;
        public Object b;
        public final /* synthetic */ PlayerView c;

        public a(PlayerView playerView) {
        }

        @Override // k.d.a.a.q3.d
        public /* synthetic */ void A(p3 p3Var) {
        }

        @Override // k.d.a.a.q3.d
        public /* synthetic */ void C0(a0 a0Var) {
        }

        @Override // k.d.a.a.q3.d
        public void D(q3.e eVar, q3.e eVar2, int i2) {
        }

        @Override // k.d.a.a.q3.d
        public /* synthetic */ void D0(int i2, int i3) {
        }

        @Override // k.d.a.a.q3.d
        public /* synthetic */ void E(int i2) {
        }

        @Override // k.d.a.a.q3.d
        public /* synthetic */ void F(boolean z) {
        }

        @Override // k.d.a.a.q3.d
        public /* synthetic */ void G(int i2) {
        }

        @Override // k.d.a.a.q3.d
        public /* synthetic */ void J0(n3 n3Var) {
        }

        @Override // k.d.a.a.q3.d
        public void K(g4 g4Var) {
        }

        @Override // k.d.a.a.q3.d
        public /* synthetic */ void L(boolean z) {
        }

        @Override // k.d.a.a.q3.d
        public /* synthetic */ void M() {
        }

        @Override // k.d.a.a.q3.d
        public /* synthetic */ void N(n3 n3Var) {
        }

        @Override // k.d.a.a.q3.d
        public /* synthetic */ void N0(boolean z) {
        }

        @Override // k.d.a.a.q3.d
        public /* synthetic */ void O(q3.b bVar) {
        }

        @Override // k.d.a.a.q3.d
        public /* synthetic */ void P(f4 f4Var, int i2) {
        }

        @Override // k.d.a.a.q3.d
        public void T(int i2) {
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

        @Override // k.d.a.a.q3.d
        public /* synthetic */ void b0(q3 q3Var, q3.c cVar) {
        }

        @Override // k.d.a.a.v4.p.e
        public void c(int i2) {
        }

        @Override // k.d.a.a.q3.d
        public void h(f fVar) {
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

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        }

        @Override // k.d.a.a.q3.d
        public /* synthetic */ void r(int i2) {
        }

        @Override // k.d.a.a.q3.d
        public /* synthetic */ void s(List list) {
        }

        @Override // k.d.a.a.q3.d
        public void s0() {
        }

        @Override // k.d.a.a.q3.d
        public /* synthetic */ void t0(e3 e3Var, int i2) {
        }

        @Override // k.d.a.a.q3.d
        public void y(b0 b0Var) {
        }

        @Override // k.d.a.a.q3.d
        public void z0(boolean z, int i2) {
        }
    }

    public PlayerView(Context context, AttributeSet attributeSet) {
    }

    public static void B(AspectRatioFrameLayout aspectRatioFrameLayout, int i2) {
    }

    public static void F(q3 q3Var, PlayerView playerView, PlayerView playerView2) {
    }

    public static /* synthetic */ SubtitleView a(PlayerView playerView) {
    }

    public static /* synthetic */ void b(PlayerView playerView) {
    }

    public static /* synthetic */ int c(PlayerView playerView) {
    }

    public static /* synthetic */ void d(TextureView textureView, int i2) {
    }

    public static /* synthetic */ void e(PlayerView playerView) {
    }

    public static /* synthetic */ void f(PlayerView playerView) {
    }

    public static /* synthetic */ View g(PlayerView playerView) {
    }

    public static /* synthetic */ q3 h(PlayerView playerView) {
    }

    public static /* synthetic */ void i(PlayerView playerView, boolean z) {
    }

    public static /* synthetic */ void j(PlayerView playerView) {
    }

    public static /* synthetic */ void k(PlayerView playerView) {
    }

    public static /* synthetic */ void l(PlayerView playerView) {
    }

    public static /* synthetic */ boolean m(PlayerView playerView) {
    }

    public static /* synthetic */ boolean n(PlayerView playerView) {
    }

    public static void o(TextureView textureView, int i2) {
    }

    public static void q(Context context, Resources resources, ImageView imageView) {
    }

    public static void r(Context context, Resources resources, ImageView imageView) {
    }

    @RequiresNonNull({"artworkView"})
    public final boolean A(Drawable drawable) {
    }

    public final boolean C() {
    }

    public void D() {
    }

    public final void E(boolean z) {
    }

    public final void G() {
    }

    public final void H() {
    }

    public final void I() {
    }

    public final void J() {
    }

    public final void K() {
    }

    public final void L() {
    }

    public final void M(boolean z) {
    }

    @EnsuresNonNullIf(expression = {"artworkView"}, result = true)
    public final boolean N() {
    }

    @EnsuresNonNullIf(expression = {"controller"}, result = true)
    public final boolean O() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
    }

    public List<i> getAdOverlayInfos() {
    }

    public ViewGroup getAdViewGroup() {
    }

    public boolean getControllerAutoShow() {
    }

    public boolean getControllerHideOnTouch() {
    }

    public int getControllerShowTimeoutMs() {
    }

    public Drawable getDefaultArtwork() {
    }

    public FrameLayout getOverlayFrameLayout() {
    }

    public q3 getPlayer() {
    }

    public int getResizeMode() {
    }

    public SubtitleView getSubtitleView() {
    }

    public boolean getUseArtwork() {
    }

    public boolean getUseController() {
    }

    public View getVideoSurfaceView() {
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
    }

    public final void p() {
    }

    @Override // android.view.View
    public boolean performClick() {
    }

    public boolean s(KeyEvent keyEvent) {
    }

    public void setAspectRatioListener(AspectRatioFrameLayout.b bVar) {
    }

    public void setControllerAutoShow(boolean z) {
    }

    public void setControllerHideDuringAds(boolean z) {
    }

    public void setControllerHideOnTouch(boolean z) {
    }

    public void setControllerShowTimeoutMs(int i2) {
    }

    public void setControllerVisibilityListener(p.e eVar) {
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
    }

    public void setDefaultArtwork(Drawable drawable) {
    }

    public void setErrorMessageProvider(o<? super n3> oVar) {
    }

    public void setKeepContentOnPlayerReset(boolean z) {
    }

    public void setPlayer(q3 q3Var) {
    }

    public void setRepeatToggleModes(int i2) {
    }

    public void setResizeMode(int i2) {
    }

    public void setShowBuffering(int i2) {
    }

    public void setShowFastForwardButton(boolean z) {
    }

    public void setShowMultiWindowTimeBar(boolean z) {
    }

    public void setShowNextButton(boolean z) {
    }

    public void setShowPreviousButton(boolean z) {
    }

    public void setShowRewindButton(boolean z) {
    }

    public void setShowShuffleButton(boolean z) {
    }

    public void setShutterBackgroundColor(int i2) {
    }

    public void setUseArtwork(boolean z) {
    }

    public void setUseController(boolean z) {
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
    }

    public final void t() {
    }

    public void u() {
    }

    @SuppressLint({"InlinedApi"})
    public final boolean v(int i2) {
    }

    public final boolean w() {
    }

    public final void x(boolean z) {
    }

    public void y(AspectRatioFrameLayout aspectRatioFrameLayout, float f) {
    }

    @RequiresNonNull({"artworkView"})
    public final boolean z(f3 f3Var) {
    }

    public PlayerView(Context context, AttributeSet attributeSet, int i2) {
    }
}
