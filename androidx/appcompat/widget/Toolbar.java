package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import j.b.k.a;
import j.b.p.j.g;
import j.b.p.j.i;
import j.b.p.j.m;
import j.b.p.j.r;
import j.b.q.d0;
import j.b.q.o0;
import j.b.q.x0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class Toolbar extends ViewGroup {
    public ColorStateList A;
    public boolean B;
    public boolean C;
    public final ArrayList<View> D;
    public final ArrayList<View> E;
    public final int[] F;
    public f G;
    public final ActionMenuView.e H;
    public x0 I;
    public j.b.q.c J;
    public d K;
    public m.a L;
    public g.a M;
    public boolean N;
    public final Runnable O;
    public ActionMenuView a;
    public TextView b;
    public TextView c;
    public ImageButton d;
    public ImageView e;
    public Drawable f;
    public CharSequence g;
    public ImageButton h;

    /* renamed from: i, reason: collision with root package name */
    public View f158i;

    /* renamed from: j, reason: collision with root package name */
    public Context f159j;

    /* renamed from: k, reason: collision with root package name */
    public int f160k;

    /* renamed from: l, reason: collision with root package name */
    public int f161l;

    /* renamed from: m, reason: collision with root package name */
    public int f162m;

    /* renamed from: n, reason: collision with root package name */
    public int f163n;

    /* renamed from: o, reason: collision with root package name */
    public int f164o;

    /* renamed from: p, reason: collision with root package name */
    public int f165p;

    /* renamed from: q, reason: collision with root package name */
    public int f166q;

    /* renamed from: r, reason: collision with root package name */
    public int f167r;

    /* renamed from: s, reason: collision with root package name */
    public int f168s;

    /* renamed from: t, reason: collision with root package name */
    public o0 f169t;
    public int u;
    public int v;
    public int w;
    public CharSequence x;
    public CharSequence y;
    public ColorStateList z;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements ActionMenuView.e {
        public final /* synthetic */ Toolbar a;

        public a(Toolbar toolbar) {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b implements Runnable {
        public final /* synthetic */ Toolbar a;

        public b(Toolbar toolbar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class c implements View.OnClickListener {
        public final /* synthetic */ Toolbar a;

        public c(Toolbar toolbar) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class d implements m {
        public j.b.p.j.g a;
        public i b;
        public final /* synthetic */ Toolbar c;

        public d(Toolbar toolbar) {
        }

        @Override // j.b.p.j.m
        public void a(j.b.p.j.g gVar, boolean z) {
        }

        @Override // j.b.p.j.m
        public void c(boolean z) {
        }

        @Override // j.b.p.j.m
        public boolean d() {
        }

        @Override // j.b.p.j.m
        public boolean e(j.b.p.j.g gVar, i iVar) {
        }

        @Override // j.b.p.j.m
        public boolean f(j.b.p.j.g gVar, i iVar) {
        }

        @Override // j.b.p.j.m
        public int getId() {
        }

        @Override // j.b.p.j.m
        public void i(Context context, j.b.p.j.g gVar) {
        }

        @Override // j.b.p.j.m
        public void j(Parcelable parcelable) {
        }

        @Override // j.b.p.j.m
        public boolean l(r rVar) {
        }

        @Override // j.b.p.j.m
        public Parcelable m() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
    }

    private MenuInflater getMenuInflater() {
    }

    public boolean A() {
    }

    public final int B(View view, int i2, int[] iArr, int i3) {
    }

    public final int C(View view, int i2, int[] iArr, int i3) {
    }

    public final int D(View view, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    public final void E(View view, int i2, int i3, int i4, int i5, int i6) {
    }

    public final void F() {
    }

    public void G() {
    }

    public void H(int i2, int i3) {
    }

    public void I(j.b.p.j.g gVar, j.b.q.c cVar) {
    }

    public void J(m.a aVar, g.a aVar2) {
    }

    public void K(Context context, int i2) {
    }

    public void L(Context context, int i2) {
    }

    public final boolean M() {
    }

    public final boolean N(View view) {
    }

    public boolean O() {
    }

    public void a() {
    }

    public final void b(List<View> list, int i2) {
    }

    public final void c(View view, boolean z) {
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    public boolean d() {
    }

    public void e() {
    }

    public void f() {
    }

    public void g() {
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
    }

    public CharSequence getCollapseContentDescription() {
    }

    public Drawable getCollapseIcon() {
    }

    public int getContentInsetEnd() {
    }

    public int getContentInsetEndWithActions() {
    }

    public int getContentInsetLeft() {
    }

    public int getContentInsetRight() {
    }

    public int getContentInsetStart() {
    }

    public int getContentInsetStartWithNavigation() {
    }

    public int getCurrentContentInsetEnd() {
    }

    public int getCurrentContentInsetLeft() {
    }

    public int getCurrentContentInsetRight() {
    }

    public int getCurrentContentInsetStart() {
    }

    public Drawable getLogo() {
    }

    public CharSequence getLogoDescription() {
    }

    public Menu getMenu() {
    }

    public CharSequence getNavigationContentDescription() {
    }

    public Drawable getNavigationIcon() {
    }

    public j.b.q.c getOuterActionMenuPresenter() {
    }

    public Drawable getOverflowIcon() {
    }

    public Context getPopupContext() {
    }

    public int getPopupTheme() {
    }

    public CharSequence getSubtitle() {
    }

    public final TextView getSubtitleTextView() {
    }

    public CharSequence getTitle() {
    }

    public int getTitleMarginBottom() {
    }

    public int getTitleMarginEnd() {
    }

    public int getTitleMarginStart() {
    }

    public int getTitleMarginTop() {
    }

    public final TextView getTitleTextView() {
    }

    public d0 getWrapper() {
    }

    public final void h() {
    }

    public final void i() {
    }

    public final void j() {
    }

    public final void k() {
    }

    public final void l() {
    }

    public e m() {
    }

    public e n(AttributeSet attributeSet) {
    }

    public e o(ViewGroup.LayoutParams layoutParams) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i2) {
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    public final int p(int i2) {
    }

    public final int q(View view, int i2) {
    }

    public final int r(int i2) {
    }

    public final int s(View view) {
    }

    public void setCollapseContentDescription(int i2) {
    }

    public void setCollapseIcon(int i2) {
    }

    public void setCollapsible(boolean z) {
    }

    public void setContentInsetEndWithActions(int i2) {
    }

    public void setContentInsetStartWithNavigation(int i2) {
    }

    public void setLogo(int i2) {
    }

    public void setLogoDescription(int i2) {
    }

    public void setNavigationContentDescription(int i2) {
    }

    public void setNavigationIcon(int i2) {
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
    }

    public void setOnMenuItemClickListener(f fVar) {
    }

    public void setOverflowIcon(Drawable drawable) {
    }

    public void setPopupTheme(int i2) {
    }

    public void setSubtitle(int i2) {
    }

    public void setSubtitleTextColor(int i2) {
    }

    public void setTitle(int i2) {
    }

    public void setTitleMarginBottom(int i2) {
    }

    public void setTitleMarginEnd(int i2) {
    }

    public void setTitleMarginStart(int i2) {
    }

    public void setTitleMarginTop(int i2) {
    }

    public void setTitleTextColor(int i2) {
    }

    public final int t(View view) {
    }

    public final int u(List<View> list, int[] iArr) {
    }

    public boolean v() {
    }

    public boolean w() {
    }

    public void x(int i2) {
    }

    public final boolean y(View view) {
    }

    public boolean z() {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class e extends a.C0110a {
        public int b;

        public e(Context context, AttributeSet attributeSet) {
        }

        public void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        }

        public e(int i2, int i3) {
        }

        public e(e eVar) {
        }

        public e(a.C0110a c0110a) {
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
        }

        public e(ViewGroup.LayoutParams layoutParams) {
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i2) {
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
    }

    public void setCollapseIcon(Drawable drawable) {
    }

    public void setLogo(Drawable drawable) {
    }

    public void setLogoDescription(CharSequence charSequence) {
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
    }

    public void setNavigationIcon(Drawable drawable) {
    }

    public void setSubtitle(CharSequence charSequence) {
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
    }

    public void setTitle(CharSequence charSequence) {
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class g extends j.i.a.a {
        public static final Parcelable.Creator<g> CREATOR = null;
        public int c;
        public boolean d;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a implements Parcelable.ClassLoaderCreator<g> {
            public g a(Parcel parcel) {
            }

            public g b(Parcel parcel, ClassLoader classLoader) {
            }

            public g[] c(int i2) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object[] newArray(int i2) {
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public /* bridge */ /* synthetic */ g createFromParcel(Parcel parcel, ClassLoader classLoader) {
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
        }

        @Override // j.i.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
        }

        public g(Parcelable parcelable) {
        }
    }
}
