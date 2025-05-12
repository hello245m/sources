package com.tencent.mp.feature.base.ui.widget.scaleimageview.decoder;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import androidx.annotation.Keep;
import java.util.Map;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReadWriteLock;
import k.i.h.b.d.b1.p.c0.c.d;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class SkiaPooledImageRegionDecoder implements d {

    /* renamed from: i, reason: collision with root package name */
    public static final String f1395i = "SkiaPooledImageRegionDecoder";

    /* renamed from: j, reason: collision with root package name */
    public static boolean f1396j = false;
    public b a;
    public final ReadWriteLock b;
    public final Bitmap.Config c;
    public Context d;
    public Uri e;
    public long f;
    public final Point g;
    public final AtomicBoolean h;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class a extends Thread {
        public final /* synthetic */ SkiaPooledImageRegionDecoder a;

        public a(SkiaPooledImageRegionDecoder skiaPooledImageRegionDecoder) {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        }
    }

    @Keep
    public SkiaPooledImageRegionDecoder() {
    }

    public static /* synthetic */ b e(SkiaPooledImageRegionDecoder skiaPooledImageRegionDecoder) {
    }

    public static /* synthetic */ long f(SkiaPooledImageRegionDecoder skiaPooledImageRegionDecoder) {
    }

    public static /* synthetic */ void g(SkiaPooledImageRegionDecoder skiaPooledImageRegionDecoder, String str) {
    }

    public static /* synthetic */ void h(SkiaPooledImageRegionDecoder skiaPooledImageRegionDecoder) throws Exception {
    }

    @Keep
    public static void setDebug(boolean z) {
    }

    @Override // k.i.h.b.d.b1.p.c0.c.d
    public synchronized void a() {
    }

    @Override // k.i.h.b.d.b1.p.c0.c.d
    public Point b(Context context, Uri uri) throws Exception {
    }

    @Override // k.i.h.b.d.b1.p.c0.c.d
    public Bitmap c(Rect rect, int i2) {
    }

    @Override // k.i.h.b.d.b1.p.c0.c.d
    public synchronized boolean d() {
    }

    public boolean i(int i2, long j2) {
    }

    public final void j(String str) {
    }

    public final int k() {
    }

    public final void l() throws Exception {
    }

    public final boolean m() {
    }

    public final void n() {
    }

    @SuppressLint({"NewApi"})
    public SkiaPooledImageRegionDecoder(Bitmap.Config config) {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class b {
        public final Semaphore a;
        public final Map<BitmapRegionDecoder, Boolean> b;

        public b() {
        }

        public static /* synthetic */ void a(b bVar) {
        }

        public static /* synthetic */ int b(b bVar) {
        }

        public static /* synthetic */ void c(b bVar, BitmapRegionDecoder bitmapRegionDecoder) {
        }

        public static /* synthetic */ BitmapRegionDecoder d(b bVar) {
        }

        public static /* synthetic */ void e(b bVar, BitmapRegionDecoder bitmapRegionDecoder) {
        }

        public static /* synthetic */ boolean f(b bVar) {
        }

        public final BitmapRegionDecoder g() {
        }

        public final synchronized void h(BitmapRegionDecoder bitmapRegionDecoder) {
        }

        public final synchronized BitmapRegionDecoder i() {
        }

        public final synchronized boolean j() {
        }

        public final synchronized boolean k(BitmapRegionDecoder bitmapRegionDecoder) {
        }

        public final synchronized void l() {
        }

        public final void m(BitmapRegionDecoder bitmapRegionDecoder) {
        }

        public final synchronized int n() {
        }

        public /* synthetic */ b(a aVar) {
        }
    }
}
