package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import java.util.List;
import k.d.a.a.t4.c;
import k.d.a.a.v4.l;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class SubtitleView extends FrameLayout {
    public List<c> a;
    public l b;
    public int c;
    public float d;
    public float e;
    public boolean f;
    public boolean g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public a f389i;

    /* renamed from: j, reason: collision with root package name */
    public View f390j;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface a {
        void a(List<c> list, l lVar, float f, int i2, float f2);
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
    }

    private List<c> getCuesWithStylingPreferencesApplied() {
    }

    private float getUserCaptionFontScale() {
    }

    private l getUserCaptionStyle() {
    }

    private <T extends View & a> void setView(T t2) {
    }

    public final c a(c cVar) {
    }

    public void b(float f, boolean z) {
    }

    public final void c(int i2, float f) {
    }

    public void d() {
    }

    public void e() {
    }

    public final void f() {
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
    }

    public void setApplyEmbeddedStyles(boolean z) {
    }

    public void setBottomPaddingFraction(float f) {
    }

    public void setCues(List<c> list) {
    }

    public void setFractionalTextSize(float f) {
    }

    public void setStyle(l lVar) {
    }

    public void setViewType(int i2) {
    }
}
