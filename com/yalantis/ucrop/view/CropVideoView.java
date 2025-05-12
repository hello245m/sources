package com.yalantis.ucrop.view;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import k.j.a.a.c;
import k.j.a.a.e;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
public class CropVideoView extends FrameLayout {
    public GestureVideoPlayer a;
    public final OverlayView b;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public class a implements c {
        public final /* synthetic */ CropVideoView a;

        public a(CropVideoView cropVideoView) {
        }

        @Override // k.j.a.a.c
        public void a(float f) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public class b implements e {
        public final /* synthetic */ CropVideoView a;

        public b(CropVideoView cropVideoView) {
        }

        @Override // k.j.a.a.e
        public void a(RectF rectF) {
        }
    }

    public CropVideoView(Context context, AttributeSet attributeSet) {
    }

    public static /* synthetic */ OverlayView a(CropVideoView cropVideoView) {
    }

    public static /* synthetic */ GestureVideoPlayer b(CropVideoView cropVideoView) {
    }

    public final void c() {
    }

    public GestureVideoPlayer getCropImageView() {
    }

    public OverlayView getOverlayView() {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
    }

    public CropVideoView(Context context, AttributeSet attributeSet, int i2) {
    }
}
