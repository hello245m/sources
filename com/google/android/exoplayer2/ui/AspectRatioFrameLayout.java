package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class AspectRatioFrameLayout extends FrameLayout {
    public final c a;
    public b b;
    public float c;
    public int d;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface b {
        void a(float f, float f2, boolean z);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public final class c implements Runnable {
        public float a;
        public float b;
        public boolean c;
        public boolean d;
        public final /* synthetic */ AspectRatioFrameLayout e;

        public c(AspectRatioFrameLayout aspectRatioFrameLayout) {
        }

        public void a(float f, float f2, boolean z) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        public /* synthetic */ c(AspectRatioFrameLayout aspectRatioFrameLayout, a aVar) {
        }
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
    }

    public static /* synthetic */ b a(AspectRatioFrameLayout aspectRatioFrameLayout) {
    }

    public int getResizeMode() {
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
    }

    public void setAspectRatio(float f) {
    }

    public void setAspectRatioListener(b bVar) {
    }

    public void setResizeMode(int i2) {
    }
}
