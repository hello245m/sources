package k.j.a.e;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.AttributeSet;
import java.lang.ref.WeakReference;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
public class c extends f {
    public Runnable A;
    public Runnable B;
    public float C;
    public float D;
    public long E;
    public final RectF v;
    public final Matrix w;
    public float x;
    public float y;
    public k.j.a.a.c z;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static class a implements Runnable {
        public final WeakReference<c> a;
        public final long b;
        public final long c;
        public final float d;
        public final float e;
        public final float f;
        public final float g;
        public final float h;

        /* renamed from: i, reason: collision with root package name */
        public final float f8360i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f8361j;

        public a(c cVar, long j2, float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static class b implements Runnable {
        public final WeakReference<c> a;
        public final long b;
        public final long c;
        public final float d;
        public final float e;
        public final float f;
        public final float g;

        public b(c cVar, long j2, float f, float f2, float f3, float f4) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public c(Context context, AttributeSet attributeSet) {
    }

    public static /* synthetic */ RectF x(c cVar) {
    }

    public final void A(float f, float f2) {
    }

    public void B() {
    }

    public boolean C() {
    }

    public boolean D(float[] fArr) {
    }

    public void E(TypedArray typedArray) {
    }

    public void F() {
    }

    public final void G(float f, float f2) {
    }

    public void H(float f, float f2, float f3, long j2) {
    }

    public void I(float f, float f2, float f3) {
    }

    public Bitmap getCropBitmap() {
    }

    public k.j.a.a.c getCropBoundsChangeListener() {
    }

    public Matrix getCurrentMatrix() {
    }

    public float getMaxScale() {
    }

    public float getMinScale() {
    }

    public float getTargetAspectRatio() {
    }

    @Override // k.j.a.e.f
    public void s() {
    }

    public void setCropBoundsChangeListener(k.j.a.a.c cVar) {
    }

    public void setCropRect(RectF rectF) {
    }

    public void setImageToWrapCropBounds(boolean z) {
    }

    public void setImageToWrapCropBoundsAnimDuration(long j2) {
    }

    public void setMaxResultImageSizeX(int i2) {
    }

    public void setMaxResultImageSizeY(int i2) {
    }

    public void setMaxScaleMultiplier(float f) {
    }

    public void setTargetAspectRatio(float f) {
    }

    @Override // k.j.a.e.f
    public void u(float f, float f2, float f3) {
    }

    public final float[] y() {
    }

    public final void z() {
    }
}
