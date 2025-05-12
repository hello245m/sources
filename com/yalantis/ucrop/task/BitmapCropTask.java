package com.yalantis.ucrop.task;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.RectF;
import android.os.AsyncTask;
import java.io.IOException;
import k.j.a.a.a;
import k.j.a.b.b;
import k.j.a.b.c;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
public class BitmapCropTask extends AsyncTask<Void, Void, Throwable> {
    public Bitmap a;
    public final RectF b;
    public final RectF c;
    public float d;
    public float e;
    public final int f;
    public final int g;
    public final Bitmap.CompressFormat h;

    /* renamed from: i, reason: collision with root package name */
    public final int f2544i;

    /* renamed from: j, reason: collision with root package name */
    public final String f2545j;

    /* renamed from: k, reason: collision with root package name */
    public final String f2546k;

    /* renamed from: l, reason: collision with root package name */
    public final b f2547l;

    /* renamed from: m, reason: collision with root package name */
    public final Point f2548m;

    /* renamed from: n, reason: collision with root package name */
    public final a f2549n;

    /* renamed from: o, reason: collision with root package name */
    public int f2550o;

    /* renamed from: p, reason: collision with root package name */
    public int f2551p;

    /* renamed from: q, reason: collision with root package name */
    public int f2552q;

    /* renamed from: r, reason: collision with root package name */
    public int f2553r;

    public BitmapCropTask(Bitmap bitmap, c cVar, k.j.a.b.a aVar, a aVar2) {
    }

    public static native boolean cropCImg(String str, String str2, int i2, int i3, int i4, int i5, float f, float f2, int i6, int i7, int i8, int i9) throws IOException, OutOfMemoryError;

    public final boolean a(float f) throws IOException {
    }

    public Throwable b(Void... voidArr) {
    }

    public void c(Throwable th) {
    }

    public final float d() {
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ Throwable doInBackground(Void[] voidArr) {
    }

    public final boolean e(int i2, int i3) {
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(Throwable th) {
    }
}
