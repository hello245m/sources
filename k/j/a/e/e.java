package k.j.a.e;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
public class e extends AppCompatImageView {
    public final float[] c;
    public final float[] d;
    public final float[] e;
    public Matrix f;
    public int g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public b f8367i;

    /* renamed from: j, reason: collision with root package name */
    public float[] f8368j;

    /* renamed from: k, reason: collision with root package name */
    public float[] f8369k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8370l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8371m;

    /* renamed from: n, reason: collision with root package name */
    public int f8372n;

    /* renamed from: o, reason: collision with root package name */
    public String f8373o;

    /* renamed from: p, reason: collision with root package name */
    public String f8374p;

    /* renamed from: q, reason: collision with root package name */
    public k.j.a.b.b f8375q;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public class a implements k.j.a.a.b {
        public final /* synthetic */ e a;

        public a(e eVar) {
        }

        @Override // k.j.a.a.b
        public void a(Exception exc) {
        }

        @Override // k.j.a.a.b
        public void b(Bitmap bitmap, k.j.a.b.b bVar, String str, String str2, Point point) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public interface b {
        void a();

        void b(float f);

        void c();

        void d(Exception exc);

        void e(float f, float f2);

        void f(float f);
    }

    public e(Context context, AttributeSet attributeSet) {
    }

    public static /* synthetic */ String c(e eVar, String str) {
    }

    public static /* synthetic */ String d(e eVar, String str) {
    }

    public static /* synthetic */ k.j.a.b.b e(e eVar, k.j.a.b.b bVar) {
    }

    public float f(Matrix matrix) {
    }

    public float g(Matrix matrix) {
    }

    public float getCurrentAngle() {
    }

    public float getCurrentScale() {
    }

    public float getCurrentTranslateX() {
    }

    public float getCurrentTranslateY() {
    }

    public k.j.a.b.b getExifInfo() {
    }

    public String getImageInputPath() {
    }

    public String getImageOutputPath() {
    }

    public int getMaxBitmapSize() {
    }

    public Bitmap getViewBitmap() {
    }

    public float h(Matrix matrix, int i2) {
    }

    public void i() {
    }

    public void j() {
    }

    public void k(float f, float f2, float f3) {
    }

    public void l(float f, float f2, float f3) {
    }

    public void m(float f, float f2) {
    }

    public void n(Uri uri, Uri uri2) throws Exception {
    }

    public final void o() {
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
    }

    @Override // android.widget.ImageView
    public void setImageMatrix(Matrix matrix) {
    }

    public void setMaxBitmapSize(int i2) {
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
    }

    public void setTransformImageListener(b bVar) {
    }

    public e(Context context, AttributeSet attributeSet, int i2) {
    }
}
