package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import j.c.f.d;
import j.c.f.e;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class CardView extends FrameLayout {
    public static final int[] h = null;

    /* renamed from: i, reason: collision with root package name */
    public static final e f170i = null;
    public boolean a;
    public boolean b;
    public int c;
    public int d;
    public final Rect e;
    public final Rect f;
    public final d g;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements d {
        public Drawable a;
        public final /* synthetic */ CardView b;

        public a(CardView cardView) {
        }

        @Override // j.c.f.d
        public void b(int i2, int i3, int i4, int i5) {
        }

        @Override // j.c.f.d
        public void c(int i2, int i3) {
        }

        @Override // j.c.f.d
        public void d(Drawable drawable) {
        }

        @Override // j.c.f.d
        public boolean e() {
        }

        @Override // j.c.f.d
        public boolean f() {
        }

        @Override // j.c.f.d
        public Drawable g() {
        }

        @Override // j.c.f.d
        public View h() {
        }
    }

    public CardView(Context context, AttributeSet attributeSet) {
    }

    public static /* synthetic */ void c(CardView cardView, int i2, int i3, int i4, int i5) {
    }

    public static /* synthetic */ void d(CardView cardView, int i2) {
    }

    public static /* synthetic */ void e(CardView cardView, int i2) {
    }

    public ColorStateList getCardBackgroundColor() {
    }

    public float getCardElevation() {
    }

    public int getContentPaddingBottom() {
    }

    public int getContentPaddingLeft() {
    }

    public int getContentPaddingRight() {
    }

    public int getContentPaddingTop() {
    }

    public float getMaxCardElevation() {
    }

    public boolean getPreventCornerOverlap() {
    }

    public float getRadius() {
    }

    public boolean getUseCompatPadding() {
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
    }

    public void setCardBackgroundColor(int i2) {
    }

    public void setCardElevation(float f) {
    }

    public void setMaxCardElevation(float f) {
    }

    @Override // android.view.View
    public void setMinimumHeight(int i2) {
    }

    @Override // android.view.View
    public void setMinimumWidth(int i2) {
    }

    @Override // android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i2, int i3, int i4, int i5) {
    }

    public void setPreventCornerOverlap(boolean z) {
    }

    public void setRadius(float f) {
    }

    public void setUseCompatPadding(boolean z) {
    }

    public CardView(Context context, AttributeSet attributeSet, int i2) {
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
    }
}
