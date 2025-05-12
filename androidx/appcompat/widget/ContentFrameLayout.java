package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class ContentFrameLayout extends FrameLayout {
    public TypedValue a;
    public TypedValue b;
    public TypedValue c;
    public TypedValue d;
    public TypedValue e;
    public TypedValue f;
    public final Rect g;
    public a h;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface a {
        void a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
    }

    public void a(Rect rect) {
    }

    public void b(int i2, int i3, int i4, int i5) {
    }

    public TypedValue getFixedHeightMajor() {
    }

    public TypedValue getFixedHeightMinor() {
    }

    public TypedValue getFixedWidthMajor() {
    }

    public TypedValue getFixedWidthMinor() {
    }

    public TypedValue getMinWidthMajor() {
    }

    public TypedValue getMinWidthMinor() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
    }

    public void setAttachListener(a aVar) {
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i2) {
    }
}
