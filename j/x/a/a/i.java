package j.x.a.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import j.g.l.c;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class i extends j.x.a.a.h {

    /* renamed from: j, reason: collision with root package name */
    public static final PorterDuff.Mode f3567j = null;
    public h b;
    public PorterDuffColorFilter c;
    public ColorFilter d;
    public boolean e;
    public boolean f;
    public final float[] g;
    public final Matrix h;

    /* renamed from: i, reason: collision with root package name */
    public final Rect f3568i;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class b extends f {
        public b() {
        }

        @Override // j.x.a.a.i.f
        public boolean c() {
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
        }

        public final void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
        }

        public b(b bVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class e {
        public e() {
        }

        public boolean a() {
        }

        public boolean b(int[] iArr) {
        }

        public /* synthetic */ e(a aVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class h extends Drawable.ConstantState {
        public int a;
        public g b;
        public ColorStateList c;
        public PorterDuff.Mode d;
        public boolean e;
        public Bitmap f;
        public ColorStateList g;
        public PorterDuff.Mode h;

        /* renamed from: i, reason: collision with root package name */
        public int f3591i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f3592j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f3593k;

        /* renamed from: l, reason: collision with root package name */
        public Paint f3594l;

        public h(h hVar) {
        }

        public boolean a(int i2, int i3) {
        }

        public boolean b() {
        }

        public void c(int i2, int i3) {
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
        }

        public Paint e(ColorFilter colorFilter) {
        }

        public boolean f() {
        }

        public boolean g() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
        }

        public boolean h(int[] iArr) {
        }

        public void i() {
        }

        public void j(int i2, int i3) {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
        }

        public h() {
        }
    }

    public i() {
    }

    public static int a(int i2, float f2) {
    }

    public static i b(Resources resources, int i2, Resources.Theme theme) {
    }

    public static i c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
    }

    public static PorterDuff.Mode g(int i2, PorterDuff.Mode mode) {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
    }

    public Object d(String str) {
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
    }

    public final void e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
    }

    public final boolean f() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
    }

    public void h(boolean z) {
    }

    public final void i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
    }

    public PorterDuffColorFilter j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j2) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable, j.g.l.l.f
    public void setTint(int i2) {
    }

    @Override // android.graphics.drawable.Drawable, j.g.l.l.f
    public void setTintList(ColorStateList colorStateList) {
    }

    @Override // android.graphics.drawable.Drawable, j.g.l.l.f
    public void setTintMode(PorterDuff.Mode mode) {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
    }

    /* renamed from: j.x.a.a.i$i, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class C0187i extends Drawable.ConstantState {
        public final Drawable.ConstantState a;

        public C0187i(Drawable.ConstantState constantState) {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class f extends e {
        public c.b[] a;
        public String b;
        public int c;
        public int d;

        public f() {
        }

        public boolean c() {
        }

        public void d(Path path) {
        }

        public c.b[] getPathData() {
        }

        public String getPathName() {
        }

        public void setPathData(c.b[] bVarArr) {
        }

        public f(f fVar) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
    }

    public i(h hVar) {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class c extends f {
        public int[] e;
        public j.g.k.f.f f;
        public float g;
        public j.g.k.f.f h;

        /* renamed from: i, reason: collision with root package name */
        public float f3569i;

        /* renamed from: j, reason: collision with root package name */
        public float f3570j;

        /* renamed from: k, reason: collision with root package name */
        public float f3571k;

        /* renamed from: l, reason: collision with root package name */
        public float f3572l;

        /* renamed from: m, reason: collision with root package name */
        public float f3573m;

        /* renamed from: n, reason: collision with root package name */
        public Paint.Cap f3574n;

        /* renamed from: o, reason: collision with root package name */
        public Paint.Join f3575o;

        /* renamed from: p, reason: collision with root package name */
        public float f3576p;

        public c() {
        }

        @Override // j.x.a.a.i.e
        public boolean a() {
        }

        @Override // j.x.a.a.i.e
        public boolean b(int[] iArr) {
        }

        public final Paint.Cap e(int i2, Paint.Cap cap) {
        }

        public final Paint.Join f(int i2, Paint.Join join) {
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
        }

        public float getFillAlpha() {
        }

        public int getFillColor() {
        }

        public float getStrokeAlpha() {
        }

        public int getStrokeColor() {
        }

        public float getStrokeWidth() {
        }

        public float getTrimPathEnd() {
        }

        public float getTrimPathOffset() {
        }

        public float getTrimPathStart() {
        }

        public final void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        }

        public void setFillAlpha(float f) {
        }

        public void setFillColor(int i2) {
        }

        public void setStrokeAlpha(float f) {
        }

        public void setStrokeColor(int i2) {
        }

        public void setStrokeWidth(float f) {
        }

        public void setTrimPathEnd(float f) {
        }

        public void setTrimPathOffset(float f) {
        }

        public void setTrimPathStart(float f) {
        }

        public c(c cVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class g {

        /* renamed from: q, reason: collision with root package name */
        public static final Matrix f3582q = null;
        public final Path a;
        public final Path b;
        public final Matrix c;
        public Paint d;
        public Paint e;
        public PathMeasure f;
        public int g;
        public final d h;

        /* renamed from: i, reason: collision with root package name */
        public float f3583i;

        /* renamed from: j, reason: collision with root package name */
        public float f3584j;

        /* renamed from: k, reason: collision with root package name */
        public float f3585k;

        /* renamed from: l, reason: collision with root package name */
        public float f3586l;

        /* renamed from: m, reason: collision with root package name */
        public int f3587m;

        /* renamed from: n, reason: collision with root package name */
        public String f3588n;

        /* renamed from: o, reason: collision with root package name */
        public Boolean f3589o;

        /* renamed from: p, reason: collision with root package name */
        public final j.d.a<String, Object> f3590p;

        public g() {
        }

        public static float a(float f, float f2, float f3, float f4) {
        }

        public void b(Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
        }

        public final void c(d dVar, Matrix matrix, Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
        }

        public final void d(d dVar, f fVar, Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
        }

        public final float e(Matrix matrix) {
        }

        public boolean f() {
        }

        public boolean g(int[] iArr) {
        }

        public float getAlpha() {
        }

        public int getRootAlpha() {
        }

        public void setAlpha(float f) {
        }

        public void setRootAlpha(int i2) {
        }

        public g(g gVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class d extends e {
        public final Matrix a;
        public final ArrayList<e> b;
        public float c;
        public float d;
        public float e;
        public float f;
        public float g;
        public float h;

        /* renamed from: i, reason: collision with root package name */
        public float f3577i;

        /* renamed from: j, reason: collision with root package name */
        public final Matrix f3578j;

        /* renamed from: k, reason: collision with root package name */
        public int f3579k;

        /* renamed from: l, reason: collision with root package name */
        public int[] f3580l;

        /* renamed from: m, reason: collision with root package name */
        public String f3581m;

        public d(d dVar, j.d.a<String, Object> aVar) {
        }

        @Override // j.x.a.a.i.e
        public boolean a() {
        }

        @Override // j.x.a.a.i.e
        public boolean b(int[] iArr) {
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
        }

        public final void d() {
        }

        public final void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
        }

        public String getGroupName() {
        }

        public Matrix getLocalMatrix() {
        }

        public float getPivotX() {
        }

        public float getPivotY() {
        }

        public float getRotation() {
        }

        public float getScaleX() {
        }

        public float getScaleY() {
        }

        public float getTranslateX() {
        }

        public float getTranslateY() {
        }

        public void setPivotX(float f) {
        }

        public void setPivotY(float f) {
        }

        public void setRotation(float f) {
        }

        public void setScaleX(float f) {
        }

        public void setScaleY(float f) {
        }

        public void setTranslateX(float f) {
        }

        public void setTranslateY(float f) {
        }

        public d() {
        }
    }
}
