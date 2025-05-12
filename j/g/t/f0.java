package j.g.t;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import j.g.t.r0.c;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class f0 {
    public static final AtomicInteger a = null;
    public static Field b;
    public static boolean c;
    public static Field d;
    public static boolean e;
    public static WeakHashMap<View, String> f;
    public static WeakHashMap<View, k0> g;
    public static Field h;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f3272i;

    /* renamed from: j, reason: collision with root package name */
    public static ThreadLocal<Rect> f3273j;

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f3274k = null;

    /* renamed from: l, reason: collision with root package name */
    public static final b0 f3275l = null;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a extends f<Boolean> {
        public a(int i2, Class cls, int i3) {
        }

        @Override // j.g.t.f0.f
        public /* bridge */ /* synthetic */ Boolean d(View view) {
        }

        @Override // j.g.t.f0.f
        public /* bridge */ /* synthetic */ void e(View view, Boolean bool) {
        }

        @Override // j.g.t.f0.f
        public /* bridge */ /* synthetic */ boolean h(Boolean bool, Boolean bool2) {
        }

        public Boolean i(View view) {
        }

        public void j(View view, Boolean bool) {
        }

        public boolean k(Boolean bool, Boolean bool2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b extends f<CharSequence> {
        public b(int i2, Class cls, int i3, int i4) {
        }

        @Override // j.g.t.f0.f
        public /* bridge */ /* synthetic */ CharSequence d(View view) {
        }

        @Override // j.g.t.f0.f
        public /* bridge */ /* synthetic */ void e(View view, CharSequence charSequence) {
        }

        @Override // j.g.t.f0.f
        public /* bridge */ /* synthetic */ boolean h(CharSequence charSequence, CharSequence charSequence2) {
        }

        public CharSequence i(View view) {
        }

        public void j(View view, CharSequence charSequence) {
        }

        public boolean k(CharSequence charSequence, CharSequence charSequence2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class c extends f<CharSequence> {
        public c(int i2, Class cls, int i3, int i4) {
        }

        @Override // j.g.t.f0.f
        public /* bridge */ /* synthetic */ CharSequence d(View view) {
        }

        @Override // j.g.t.f0.f
        public /* bridge */ /* synthetic */ void e(View view, CharSequence charSequence) {
        }

        @Override // j.g.t.f0.f
        public /* bridge */ /* synthetic */ boolean h(CharSequence charSequence, CharSequence charSequence2) {
        }

        public CharSequence i(View view) {
        }

        public void j(View view, CharSequence charSequence) {
        }

        public boolean k(CharSequence charSequence, CharSequence charSequence2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class d extends f<Boolean> {
        public d(int i2, Class cls, int i3) {
        }

        @Override // j.g.t.f0.f
        public /* bridge */ /* synthetic */ Boolean d(View view) {
        }

        @Override // j.g.t.f0.f
        public /* bridge */ /* synthetic */ void e(View view, Boolean bool) {
        }

        @Override // j.g.t.f0.f
        public /* bridge */ /* synthetic */ boolean h(Boolean bool, Boolean bool2) {
        }

        public Boolean i(View view) {
        }

        public void j(View view, Boolean bool) {
        }

        public boolean k(Boolean bool, Boolean bool2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
        public final WeakHashMap<View, Boolean> a;

        public final void a(View view, boolean z) {
        }

        public final void b(View view) {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class f<T> {
        public final int a;
        public final Class<T> b;
        public final int c;
        public final int d;

        public f(int i2, Class<T> cls, int i3) {
        }

        public boolean a(Boolean bool, Boolean bool2) {
        }

        public final boolean b() {
        }

        public final boolean c() {
        }

        public abstract T d(View view);

        public abstract void e(View view, T t2);

        public T f(View view) {
        }

        public void g(View view, T t2) {
        }

        public abstract boolean h(T t2, T t3);

        public f(int i2, Class<T> cls, int i3, int i4) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class g {
        public static boolean a(View view) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class h {
        public static AccessibilityNodeProvider a(View view) {
        }

        public static boolean b(View view) {
        }

        public static int c(View view) {
        }

        public static int d(View view) {
        }

        public static int e(View view) {
        }

        public static ViewParent f(View view) {
        }

        public static int g(View view) {
        }

        public static boolean h(View view) {
        }

        public static boolean i(View view) {
        }

        public static boolean j(View view, int i2, Bundle bundle) {
        }

        public static void k(View view) {
        }

        public static void l(View view, int i2, int i3, int i4, int i5) {
        }

        public static void m(View view, Runnable runnable) {
        }

        public static void n(View view, Runnable runnable, long j2) {
        }

        public static void o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        }

        public static void p(View view) {
        }

        public static void q(View view, Drawable drawable) {
        }

        public static void r(View view, boolean z) {
        }

        public static void s(View view, int i2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class i {
        public static int a() {
        }

        public static Display b(View view) {
        }

        public static int c(View view) {
        }

        public static int d(View view) {
        }

        public static int e(View view) {
        }

        public static int f(View view) {
        }

        public static boolean g(View view) {
        }

        public static void h(View view, int i2) {
        }

        public static void i(View view, Paint paint) {
        }

        public static void j(View view, int i2) {
        }

        public static void k(View view, int i2, int i3, int i4, int i5) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class j {
        public static Rect a(View view) {
        }

        public static boolean b(View view) {
        }

        public static void c(View view, Rect rect) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class k {
        public static int a(View view) {
        }

        public static boolean b(View view) {
        }

        public static boolean c(View view) {
        }

        public static boolean d(View view) {
        }

        public static void e(ViewParent viewParent, View view, View view2, int i2) {
        }

        public static void f(View view, int i2) {
        }

        public static void g(AccessibilityEvent accessibilityEvent, int i2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class l {
        public static WindowInsets a(View view, WindowInsets windowInsets) {
        }

        public static WindowInsets b(View view, WindowInsets windowInsets) {
        }

        public static void c(View view) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class m {

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a implements View.OnApplyWindowInsetsListener {
            public p0 a;
            public final /* synthetic */ View b;
            public final /* synthetic */ z c;

            public a(View view, z zVar) {
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            }
        }

        public static void a(WindowInsets windowInsets, View view) {
        }

        public static p0 b(View view, p0 p0Var, Rect rect) {
        }

        public static boolean c(View view, float f, float f2, boolean z) {
        }

        public static boolean d(View view, float f, float f2) {
        }

        public static boolean e(View view, int i2, int i3, int[] iArr, int[] iArr2) {
        }

        public static boolean f(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        }

        public static ColorStateList g(View view) {
        }

        public static PorterDuff.Mode h(View view) {
        }

        public static float i(View view) {
        }

        public static p0 j(View view) {
        }

        public static String k(View view) {
        }

        public static float l(View view) {
        }

        public static float m(View view) {
        }

        public static boolean n(View view) {
        }

        public static boolean o(View view) {
        }

        public static boolean p(View view) {
        }

        public static void q(View view, ColorStateList colorStateList) {
        }

        public static void r(View view, PorterDuff.Mode mode) {
        }

        public static void s(View view, float f) {
        }

        public static void t(View view, boolean z) {
        }

        public static void u(View view, z zVar) {
        }

        public static void v(View view, String str) {
        }

        public static void w(View view, float f) {
        }

        public static void x(View view, float f) {
        }

        public static boolean y(View view, int i2) {
        }

        public static void z(View view) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class n {
        public static p0 a(View view) {
        }

        public static int b(View view) {
        }

        public static void c(View view, int i2) {
        }

        public static void d(View view, int i2, int i3) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class o {
        public static void a(View view) {
        }

        public static void b(View view) {
        }

        public static void c(View view) {
        }

        public static void d(View view, PointerIcon pointerIcon) {
        }

        public static boolean e(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i2) {
        }

        public static void f(View view, View.DragShadowBuilder dragShadowBuilder) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class p {
        public static void a(View view, Collection<View> collection, int i2) {
        }

        public static int b(View view) {
        }

        public static int c(View view) {
        }

        public static boolean d(View view) {
        }

        public static boolean e(View view) {
        }

        public static boolean f(View view) {
        }

        public static boolean g(View view) {
        }

        public static View h(View view, View view2, int i2) {
        }

        public static boolean i(View view) {
        }

        public static void j(View view, String... strArr) {
        }

        public static void k(View view, boolean z) {
        }

        public static void l(View view, int i2) {
        }

        public static void m(View view, boolean z) {
        }

        public static void n(View view, int i2) {
        }

        public static void o(View view, CharSequence charSequence) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class q {
        public static void a(View view, v vVar) {
        }

        public static CharSequence b(View view) {
        }

        public static boolean c(View view) {
        }

        public static boolean d(View view) {
        }

        public static void e(View view, v vVar) {
        }

        public static <T> T f(View view, int i2) {
        }

        public static void g(View view, boolean z) {
        }

        public static void h(View view, CharSequence charSequence) {
        }

        public static void i(View view, boolean z) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class r {
        public static View.AccessibilityDelegate a(View view) {
        }

        public static List<Rect> b(View view) {
        }

        public static void c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
        }

        public static void d(View view, List<Rect> list) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class s {
        public static CharSequence a(View view) {
        }

        public static void b(View view, CharSequence charSequence) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class t {
        public static String[] a(View view) {
        }

        public static j.g.t.i b(View view, j.g.t.i iVar) {
        }

        public static void c(View view, String[] strArr, a0 a0Var) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class u implements OnReceiveContentListener {
        public final a0 a;

        public u(a0 a0Var) {
        }

        @Override // android.view.OnReceiveContentListener
        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface v {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class w {
        public static final ArrayList<WeakReference<View>> d = null;
        public WeakHashMap<View, Boolean> a;
        public SparseArray<WeakReference<View>> b;
        public WeakReference<KeyEvent> c;

        public static w a(View view) {
        }

        public boolean b(View view, KeyEvent keyEvent) {
        }

        public final View c(View view, KeyEvent keyEvent) {
        }

        public final SparseArray<WeakReference<View>> d() {
        }

        public final boolean e(View view, KeyEvent keyEvent) {
        }

        public boolean f(KeyEvent keyEvent) {
        }

        public final void g() {
        }
    }

    public static Rect A() {
    }

    @Deprecated
    public static void A0(View view, boolean z) {
    }

    public static b0 B(View view) {
    }

    public static void B0(View view, boolean z) {
    }

    public static boolean C(View view) {
    }

    public static void C0(View view, int i2) {
    }

    public static int D(View view) {
    }

    public static void D0(View view, int i2) {
    }

    @SuppressLint({"InlinedApi"})
    public static int E(View view) {
    }

    public static void E0(View view, z zVar) {
    }

    public static int F(View view) {
    }

    public static void F0(View view, int i2, int i3, int i4, int i5) {
    }

    public static int G(View view) {
    }

    public static void G0(View view, d0 d0Var) {
    }

    public static int H(View view) {
    }

    public static void H0(View view, int i2, int i3) {
    }

    public static String[] I(View view) {
    }

    public static void I0(View view, CharSequence charSequence) {
    }

    public static int J(View view) {
    }

    public static void J0(View view, String str) {
    }

    public static int K(View view) {
    }

    public static void K0(View view, float f2) {
    }

    public static p0 L(View view) {
    }

    public static void L0(View view) {
    }

    public static CharSequence M(View view) {
    }

    public static f<CharSequence> M0() {
    }

    public static String N(View view) {
    }

    public static void N0(View view) {
    }

    public static float O(View view) {
    }

    public static void O0(View view) {
    }

    @Deprecated
    public static int P(View view) {
    }

    public static float Q(View view) {
    }

    public static boolean R(View view) {
    }

    public static boolean S(View view) {
    }

    public static boolean T(View view) {
    }

    public static boolean U(View view) {
    }

    public static boolean V(View view) {
    }

    public static boolean W(View view) {
    }

    public static boolean X(View view) {
    }

    public static boolean Y(View view) {
    }

    public static boolean Z(View view) {
    }

    public static f<Boolean> a() {
    }

    public static /* synthetic */ j.g.t.i a0(j.g.t.i iVar) {
    }

    public static int b(View view, CharSequence charSequence, j.g.t.r0.f fVar) {
    }

    public static void b0(View view, int i2) {
    }

    public static void c(View view, c.a aVar) {
    }

    public static void c0(View view, int i2) {
    }

    public static k0 d(View view) {
    }

    public static void d0(View view, int i2) {
    }

    @Deprecated
    public static boolean e(View view, int i2) {
    }

    public static p0 e0(View view, p0 p0Var) {
    }

    @Deprecated
    public static boolean f(View view, int i2) {
    }

    public static void f0(View view, j.g.t.r0.c cVar) {
    }

    public static void g(View view, int i2) {
    }

    public static f<CharSequence> g0() {
    }

    public static void h(View view, int i2) {
    }

    public static boolean h0(View view, int i2, Bundle bundle) {
    }

    public static p0 i(View view, p0 p0Var, Rect rect) {
    }

    public static j.g.t.i i0(View view, j.g.t.i iVar) {
    }

    public static p0 j(View view, p0 p0Var) {
    }

    public static void j0(View view) {
    }

    public static boolean k(View view, KeyEvent keyEvent) {
    }

    public static void k0(View view, Runnable runnable) {
    }

    public static boolean l(View view, KeyEvent keyEvent) {
    }

    @SuppressLint({"LambdaLast"})
    public static void l0(View view, Runnable runnable, long j2) {
    }

    public static void m(View view) {
    }

    public static void m0(View view, int i2) {
    }

    public static int n() {
    }

    public static void n0(int i2, View view) {
    }

    public static j.g.t.g o(View view) {
    }

    public static void o0(View view, c.a aVar, CharSequence charSequence, j.g.t.r0.f fVar) {
    }

    public static View.AccessibilityDelegate p(View view) {
    }

    public static void p0(View view) {
    }

    public static View.AccessibilityDelegate q(View view) {
    }

    public static void q0(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
    }

    public static int r(View view) {
    }

    public static f<Boolean> r0() {
    }

    public static CharSequence s(View view) {
    }

    public static void s0(View view, j.g.t.g gVar) {
    }

    public static List<c.a> t(View view) {
    }

    public static void t0(View view, boolean z) {
    }

    public static int u(View view, CharSequence charSequence) {
    }

    public static void u0(View view, int i2) {
    }

    public static ColorStateList v(View view) {
    }

    public static void v0(View view, Drawable drawable) {
    }

    public static PorterDuff.Mode w(View view) {
    }

    public static void w0(View view, ColorStateList colorStateList) {
    }

    public static Rect x(View view) {
    }

    public static void x0(View view, PorterDuff.Mode mode) {
    }

    public static Display y(View view) {
    }

    public static void y0(View view, Rect rect) {
    }

    public static float z(View view) {
    }

    public static void z0(View view, float f2) {
    }
}
