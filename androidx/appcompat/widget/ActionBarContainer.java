package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import j.b.q.p0;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class ActionBarContainer extends FrameLayout {
    public boolean a;
    public View b;
    public View c;
    public View d;
    public Drawable e;
    public Drawable f;
    public Drawable g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f110i;

    /* renamed from: j, reason: collision with root package name */
    public int f111j;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
    }

    public final int a(View view) {
    }

    public final boolean b(View view) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
    }

    public View getTabContainer() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
    }

    @Override // android.view.View
    public void onFinishInflate() {
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    public void setPrimaryBackground(Drawable drawable) {
    }

    public void setSplitBackground(Drawable drawable) {
    }

    public void setStackedBackground(Drawable drawable) {
    }

    public void setTabContainer(p0 p0Var) {
    }

    public void setTransitioning(boolean z) {
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i2) {
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
    }
}
