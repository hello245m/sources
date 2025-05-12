package k.j.a.e;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.AttributeSet;
import java.lang.ref.WeakReference;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
public class b extends e {
    public float A;
    public int B;
    public int C;
    public long D;

    /* renamed from: r, reason: collision with root package name */
    public final RectF f8355r;

    /* renamed from: s, reason: collision with root package name */
    public final RectF f8356s;

    /* renamed from: t, reason: collision with root package name */
    public final Matrix f8357t;
    public float u;
    public float v;
    public k.j.a.a.c w;
    public Runnable x;
    public Runnable y;
    public float z;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static class a implements Runnable {
        public final WeakReference<b> a;
        public final long b;
        public final long c;
        public final float d;
        public final float e;
        public final float f;
        public final float g;
        public final float h;

        /* renamed from: i, reason: collision with root package name */
        public final float f8358i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f8359j;

        public a(b bVar, long j2, float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: k.j.a.e.b$b, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static class RunnableC0756b implements Runnable {
        public final WeakReference<b> a;
        public final long b;
        public final long c;
        public final float d;
        public final float e;
        public final float f;
        public final float g;

        public RunnableC0756b(b bVar, long j2, float f, float f2, float f3, float f4) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public b(Context context, AttributeSet attributeSet) {
    }

    public static /* synthetic */ RectF p(b bVar) {
    }

    public final void A(float f, float f2) {
    }

    public void B(float f, float f2, float f3, long j2) {
    }

    public void C(float f, float f2, float f3) {
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

    @Override // k.j.a.e.e
    public void j() {
    }

    @Override // k.j.a.e.e
    public void l(float f, float f2, float f3) {
    }

    public final float[] q() {
    }

    public final void r() {
    }

    public final void s(float f, float f2) {
    }

    public void setCropBoundsChangeListener(k.j.a.a.c cVar) {
    }

    public void setCropRect(RectF rectF) {
    }

    public void setImageToWrapCropBounds(boolean z) {
    }

    public void setImageToWrapCropBoundsAnimDuration(long j2) {
    }

    public void setInitRect(RectF rectF) {
    }

    public void setMaxResultImageSizeX(int i2) {
    }

    public void setMaxResultImageSizeY(int i2) {
    }

    public void setMaxScaleMultiplier(float f) {
    }

    public void setTargetAspectRatio(float f) {
    }

    public void t() {
    }

    public void u(Bitmap.CompressFormat compressFormat, int i2, k.j.a.a.a aVar) {
    }

    public boolean v() {
    }

    public boolean w(float[] fArr) {
    }

    public void x(TypedArray typedArray) {
    }

    public void y() {
    }

    public void z() {
    }

    public b(Context context, AttributeSet attributeSet, int i2) {
    }
}
