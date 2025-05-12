package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import j.b.q.m;
import j.g.t.g;
import j.g.t.r0.c;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class CheckableImageButton extends m implements Checkable {
    public static final int[] f = null;
    public boolean c;
    public boolean d;
    public boolean e;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a extends g {
        public final /* synthetic */ CheckableImageButton d;

        public a(CheckableImageButton checkableImageButton) {
        }

        @Override // j.g.t.g
        public void f(View view, AccessibilityEvent accessibilityEvent) {
        }

        @Override // j.g.t.g
        public void g(View view, c cVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class b extends j.i.a.a {
        public static final Parcelable.Creator<b> CREATOR = null;
        public boolean c;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public static class a implements Parcelable.ClassLoaderCreator<b> {
            public b a(Parcel parcel) {
            }

            public b b(Parcel parcel, ClassLoader classLoader) {
            }

            public b[] c(int i2) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object[] newArray(int i2) {
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public /* bridge */ /* synthetic */ b createFromParcel(Parcel parcel, ClassLoader classLoader) {
            }
        }

        public b(Parcelable parcelable) {
        }

        public final void d(Parcel parcel) {
        }

        @Override // j.i.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
        }

        public b(Parcel parcel, ClassLoader classLoader) {
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
    }

    public boolean a() {
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i2) {
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
    }

    public void setCheckable(boolean z) {
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
    }

    public void setPressable(boolean z) {
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
    }

    @Override // android.widget.Checkable
    public void toggle() {
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i2) {
    }
}
