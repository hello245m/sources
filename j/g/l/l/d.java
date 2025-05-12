package j.g.l.l;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class d extends Drawable {
    public final Bitmap a;
    public int b;
    public int c;
    public final Paint d;
    public final BitmapShader e;
    public final Matrix f;
    public float g;
    public final Rect h;

    /* renamed from: i, reason: collision with root package name */
    public final RectF f3267i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3268j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3269k;

    /* renamed from: l, reason: collision with root package name */
    public int f3270l;

    /* renamed from: m, reason: collision with root package name */
    public int f3271m;

    public d(Resources resources, Bitmap bitmap) {
    }

    public static boolean d(float f) {
    }

    public final void a() {
    }

    public float b() {
    }

    public abstract void c(int i2, int i3, int i4, Rect rect, Rect rect2);

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
    }

    public void e(boolean z) {
    }

    public void f(float f) {
    }

    public final void g() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
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

    public void h() {
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
    }
}
