package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import k.d.a.c.m.k;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {
    public final int P;
    public final k.d.a.c.l0.g Q;
    public Animator R;
    public Animator S;
    public int T;
    public int U;
    public boolean V;
    public int W;
    public ArrayList<g> g0;
    public int h0;
    public boolean i0;
    public boolean j0;
    public Behavior k0;
    public int l0;
    public int m0;
    public int n0;
    public AnimatorListenerAdapter o0;
    public k<FloatingActionButton> p0;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ BottomAppBar a;

        public a(BottomAppBar bottomAppBar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b extends FloatingActionButton.b {
        public final /* synthetic */ int a;
        public final /* synthetic */ BottomAppBar b;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a extends FloatingActionButton.b {
            public final /* synthetic */ b a;

            public a(b bVar) {
            }

            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
            public void b(FloatingActionButton floatingActionButton) {
            }
        }

        public b(BottomAppBar bottomAppBar, int i2) {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
        public void a(FloatingActionButton floatingActionButton) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class c extends AnimatorListenerAdapter {
        public final /* synthetic */ BottomAppBar a;

        public c(BottomAppBar bottomAppBar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class d extends AnimatorListenerAdapter {
        public boolean a;
        public final /* synthetic */ ActionMenuView b;
        public final /* synthetic */ int c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ BottomAppBar e;

        public d(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i2, boolean z) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class e implements Runnable {
        public final /* synthetic */ ActionMenuView a;
        public final /* synthetic */ int b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ BottomAppBar d;

        public e(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i2, boolean z) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class f extends AnimatorListenerAdapter {
        public final /* synthetic */ BottomAppBar a;

        public f(BottomAppBar bottomAppBar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface g {
        void a(BottomAppBar bottomAppBar);

        void b(BottomAppBar bottomAppBar);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class h extends j.i.a.a {
        public static final Parcelable.Creator<h> CREATOR = null;
        public int c;
        public boolean d;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public static class a implements Parcelable.ClassLoaderCreator<h> {
            public h a(Parcel parcel) {
            }

            public h b(Parcel parcel, ClassLoader classLoader) {
            }

            public h[] c(int i2) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object[] newArray(int i2) {
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public /* bridge */ /* synthetic */ h createFromParcel(Parcel parcel, ClassLoader classLoader) {
            }
        }

        public h(Parcelable parcelable) {
        }

        @Override // j.i.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
        }

        public h(Parcel parcel, ClassLoader classLoader) {
        }
    }

    public static /* synthetic */ boolean P(BottomAppBar bottomAppBar, boolean z) {
    }

    public static /* synthetic */ void Q(BottomAppBar bottomAppBar) {
    }

    public static /* synthetic */ void R(BottomAppBar bottomAppBar) {
    }

    public static /* synthetic */ void S(BottomAppBar bottomAppBar) {
    }

    public static /* synthetic */ Animator T(BottomAppBar bottomAppBar, Animator animator) {
    }

    public static /* synthetic */ float U(BottomAppBar bottomAppBar, int i2) {
    }

    public static /* synthetic */ Animator V(BottomAppBar bottomAppBar, Animator animator) {
    }

    public static /* synthetic */ int W(BottomAppBar bottomAppBar) {
    }

    public static /* synthetic */ void X(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i2, boolean z, boolean z2) {
    }

    public static /* synthetic */ FloatingActionButton Y(BottomAppBar bottomAppBar) {
    }

    public static /* synthetic */ float Z(BottomAppBar bottomAppBar) {
    }

    public static /* synthetic */ int a0(BottomAppBar bottomAppBar) {
    }

    public static /* synthetic */ int b0(BottomAppBar bottomAppBar) {
    }

    public static /* synthetic */ int c0(BottomAppBar bottomAppBar) {
    }

    public static /* synthetic */ int d0(BottomAppBar bottomAppBar) {
    }

    public static /* synthetic */ View e0(BottomAppBar bottomAppBar) {
    }

    public static /* synthetic */ void f0(BottomAppBar bottomAppBar, FloatingActionButton floatingActionButton) {
    }

    private ActionMenuView getActionMenuView() {
    }

    private int getBottomInset() {
    }

    private float getFabTranslationX() {
    }

    private float getFabTranslationY() {
    }

    private int getLeftInset() {
    }

    private int getRightInset() {
    }

    private k.d.a.c.p.a getTopEdgeTreatment() {
    }

    public final void A0(ActionMenuView actionMenuView, int i2, boolean z, boolean z2) {
    }

    public final void g0(FloatingActionButton floatingActionButton) {
    }

    public ColorStateList getBackgroundTint() {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public /* bridge */ /* synthetic */ CoordinatorLayout.c getBehavior() {
    }

    public float getCradleVerticalOffset() {
    }

    public int getFabAlignmentMode() {
    }

    public int getFabAnimationMode() {
    }

    public float getFabCradleMargin() {
    }

    public float getFabCradleRoundedCornerRadius() {
    }

    public boolean getHideOnScroll() {
    }

    public final void h0() {
    }

    public void i0(int i2, List<Animator> list) {
    }

    public final void j0(int i2, List<Animator> list) {
    }

    public final void k0(int i2, boolean z, List<Animator> list) {
    }

    public final void l0() {
    }

    public final void m0() {
    }

    public final FloatingActionButton n0() {
    }

    public final View o0() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public Parcelable onSaveInstanceState() {
    }

    public int p0(ActionMenuView actionMenuView, int i2, boolean z) {
    }

    public final float q0(int i2) {
    }

    public final boolean r0() {
    }

    public final void s0(int i2, boolean z) {
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
    }

    public void setCradleVerticalOffset(float f2) {
    }

    @Override // android.view.View
    public void setElevation(float f2) {
    }

    public void setFabAlignmentMode(int i2) {
    }

    public void setFabAnimationMode(int i2) {
    }

    public void setFabCradleMargin(float f2) {
    }

    public void setFabCradleRoundedCornerRadius(float f2) {
    }

    public void setHideOnScroll(boolean z) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public final void t0(int i2) {
    }

    public void u0(int i2) {
    }

    public final void v0() {
    }

    public final void w0() {
    }

    public void x0(int i2, int i3) {
    }

    public boolean y0(int i2) {
    }

    public final void z0(ActionMenuView actionMenuView, int i2, boolean z) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public Behavior getBehavior() {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        public final Rect e;
        public WeakReference<BottomAppBar> f;
        public int g;
        public final View.OnLayoutChangeListener h;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a implements View.OnLayoutChangeListener {
            public final /* synthetic */ Behavior a;

            public a(Behavior behavior) {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            }
        }

        public Behavior() {
        }

        public static /* synthetic */ WeakReference f(Behavior behavior) {
        }

        public static /* synthetic */ Rect g(Behavior behavior) {
        }

        public static /* synthetic */ int h(Behavior behavior) {
        }

        public boolean i(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i2) {
        }

        public boolean j(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i2, int i3) {
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i2) {
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i2, int i3) {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
        }
    }
}
