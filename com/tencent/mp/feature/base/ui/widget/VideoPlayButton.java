package com.tencent.mp.feature.base.ui.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import n.d0.d.h;
import n.d0.d.o;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class VideoPlayButton extends View {
    public a a;
    public int b;
    public final Paint c;
    public final RectF d;
    public final n.d e;
    public final n.d f;
    public final n.d g;
    public long h;

    /* renamed from: i, reason: collision with root package name */
    public Animator f1375i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a {
        public static final a a = null;
        public static final a b = null;
        public static final a c = null;
        public static final a d = null;
        public static final a e = null;
        public static final /* synthetic */ a[] f = null;

        public a(String str, int i2) {
        }

        public static final /* synthetic */ a[] a() {
        }

        public static a valueOf(String str) {
        }

        public static a[] values() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a = null;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class c extends AnimatorListenerAdapter {
        public final /* synthetic */ VideoPlayButton a;

        public c(VideoPlayButton videoPlayButton) {
        }

        public static /* synthetic */ void a(VideoPlayButton videoPlayButton) {
        }

        public static final void b(VideoPlayButton videoPlayButton) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class d extends o implements n.d0.c.a<Drawable> {
        public final /* synthetic */ VideoPlayButton a;

        public d(VideoPlayButton videoPlayButton) {
        }

        public final Drawable b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ Drawable invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class e extends o implements n.d0.c.a<Drawable> {
        public final /* synthetic */ VideoPlayButton a;

        public e(VideoPlayButton videoPlayButton) {
        }

        public final Drawable b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ Drawable invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class f extends o implements n.d0.c.a<Drawable> {
        public final /* synthetic */ VideoPlayButton a;

        public f(VideoPlayButton videoPlayButton) {
        }

        public final Drawable b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ Drawable invoke() {
        }
    }

    public VideoPlayButton(Context context, AttributeSet attributeSet) {
    }

    public VideoPlayButton(Context context, AttributeSet attributeSet, int i2) {
    }

    private final Drawable getErrorDrawable() {
    }

    private final Drawable getPauseDrawable() {
    }

    private final Drawable getPlayDrawable() {
    }

    public final void a() {
    }

    public final void b(int i2) {
    }

    public final void c(Canvas canvas, Drawable drawable) {
    }

    public final void d(Canvas canvas) {
    }

    public final int getLoadingProgress() {
    }

    public final a getState() {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    public final void setLoadingProgress(int i2) {
    }

    public final void setState(a aVar) {
    }

    public /* synthetic */ VideoPlayButton(Context context, AttributeSet attributeSet, int i2, int i3, h hVar) {
    }
}
