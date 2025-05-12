package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class ViewStubCompat extends View {
    public int a;
    public int b;
    public WeakReference<View> c;
    public LayoutInflater d;
    public a e;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface a {
        void a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
    }

    public View a() {
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
    }

    public LayoutInflater getLayoutInflater() {
    }

    public int getLayoutResource() {
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
    }

    public void setInflatedId(int i2) {
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
    }

    public void setLayoutResource(int i2) {
    }

    public void setOnInflateListener(a aVar) {
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i2) {
    }
}
