package com.tencent.mp.feature.base.ui.widget.scaleimageview.decoder;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import androidx.annotation.Keep;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import k.i.h.b.d.b1.p.c0.c.d;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class SkiaImageRegionDecoder implements d {
    public BitmapRegionDecoder a;
    public final ReadWriteLock b;
    public final Bitmap.Config c;

    @Keep
    public SkiaImageRegionDecoder() {
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

    public final Lock e() {
    }

    @SuppressLint({"NewApi"})
    public SkiaImageRegionDecoder(Bitmap.Config config) {
    }
}
