package j.b.m.a;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import j.b.m.a.b;
import j.b.m.a.d;
import j.d.h;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@SuppressLint({"RestrictedAPI"})
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class a extends j.b.m.a.d implements j.g.l.l.f {

    /* renamed from: o, reason: collision with root package name */
    public c f2679o;

    /* renamed from: p, reason: collision with root package name */
    public g f2680p;

    /* renamed from: q, reason: collision with root package name */
    public int f2681q;

    /* renamed from: r, reason: collision with root package name */
    public int f2682r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2683s;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class b extends g {
        public final Animatable a;

        public b(Animatable animatable) {
        }

        @Override // j.b.m.a.a.g
        public void c() {
        }

        @Override // j.b.m.a.a.g
        public void d() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class c extends d.a {
        public j.d.d<Long> K;
        public h<Integer> L;

        public c(c cVar, a aVar, Resources resources) {
        }

        public static long D(int i2, int i3) {
        }

        public int B(int[] iArr, Drawable drawable, int i2) {
        }

        public int C(int i2, int i3, Drawable drawable, boolean z) {
        }

        public int E(int i2) {
        }

        public int F(int[] iArr) {
        }

        public int G(int i2, int i3) {
        }

        public boolean H(int i2, int i3) {
        }

        public boolean I(int i2, int i3) {
        }

        @Override // j.b.m.a.d.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
        }

        @Override // j.b.m.a.d.a, j.b.m.a.b.d
        public void r() {
        }

        @Override // j.b.m.a.d.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class d extends g {
        public final j.x.a.a.c a;

        public d(j.x.a.a.c cVar) {
        }

        @Override // j.b.m.a.a.g
        public void c() {
        }

        @Override // j.b.m.a.a.g
        public void d() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class e extends g {
        public final ObjectAnimator a;
        public final boolean b;

        public e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
        }

        @Override // j.b.m.a.a.g
        public boolean a() {
        }

        @Override // j.b.m.a.a.g
        public void b() {
        }

        @Override // j.b.m.a.a.g
        public void c() {
        }

        @Override // j.b.m.a.a.g
        public void d() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class f implements TimeInterpolator {
        public int[] a;
        public int b;
        public int c;

        public f(AnimationDrawable animationDrawable, boolean z) {
        }

        public int a() {
        }

        public int b(AnimationDrawable animationDrawable, boolean z) {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class g {
        public g() {
        }

        public boolean a() {
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();

        public /* synthetic */ g(C0113a c0113a) {
        }
    }

    public a() {
    }

    public static a m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws IOException, XmlPullParserException {
    }

    @Override // j.b.m.a.d, j.b.m.a.b
    public /* bridge */ /* synthetic */ b.d b() {
    }

    @Override // j.b.m.a.d, j.b.m.a.b
    public void h(b.d dVar) {
    }

    @Override // j.b.m.a.d, android.graphics.drawable.Drawable
    public boolean isStateful() {
    }

    @Override // j.b.m.a.d
    public /* bridge */ /* synthetic */ d.a j() {
    }

    @Override // j.b.m.a.b, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
    }

    public c l() {
    }

    @Override // j.b.m.a.d, j.b.m.a.b, android.graphics.drawable.Drawable
    public Drawable mutate() {
    }

    public void n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
    }

    public final void o(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
    }

    @Override // j.b.m.a.d, j.b.m.a.b, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
    }

    public final void p() {
    }

    public final int q(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
    }

    public final int r(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
    }

    public final boolean s(int i2) {
    }

    @Override // j.b.m.a.b, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
    }

    public final void t(TypedArray typedArray) {
    }

    public a(c cVar, Resources resources) {
    }
}
