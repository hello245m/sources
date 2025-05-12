package com.google.android.material.chip;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class ChipGroup extends k.d.a.c.f0.c {

    /* renamed from: n, reason: collision with root package name */
    public static final int f469n = 0;
    public int e;
    public int f;
    public boolean g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public d f470i;

    /* renamed from: j, reason: collision with root package name */
    public final b f471j;

    /* renamed from: k, reason: collision with root package name */
    public e f472k;

    /* renamed from: l, reason: collision with root package name */
    public int f473l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f474m;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b implements CompoundButton.OnCheckedChangeListener {
        public final /* synthetic */ ChipGroup a;

        public b(ChipGroup chipGroup) {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        }

        public /* synthetic */ b(ChipGroup chipGroup, a aVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class c extends ViewGroup.MarginLayoutParams {
        public c(Context context, AttributeSet attributeSet) {
        }

        public c(ViewGroup.LayoutParams layoutParams) {
        }

        public c(int i2, int i3) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface d {
        void a(ChipGroup chipGroup, int i2);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class e implements ViewGroup.OnHierarchyChangeListener {
        public ViewGroup.OnHierarchyChangeListener a;
        public final /* synthetic */ ChipGroup b;

        public e(ChipGroup chipGroup) {
        }

        public static /* synthetic */ ViewGroup.OnHierarchyChangeListener a(e eVar, ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
        }

        public /* synthetic */ e(ChipGroup chipGroup, a aVar) {
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
    }

    public static /* synthetic */ b e(ChipGroup chipGroup) {
    }

    public static /* synthetic */ boolean f(ChipGroup chipGroup) {
    }

    public static /* synthetic */ boolean g(ChipGroup chipGroup) {
    }

    private int getChipCount() {
    }

    public static /* synthetic */ void h(ChipGroup chipGroup, int i2, boolean z) {
    }

    public static /* synthetic */ void i(ChipGroup chipGroup, int i2, boolean z) {
    }

    public static /* synthetic */ int j(ChipGroup chipGroup) {
    }

    public static /* synthetic */ boolean k(ChipGroup chipGroup) {
    }

    public static /* synthetic */ void l(ChipGroup chipGroup, int i2) {
    }

    private void setCheckedId(int i2) {
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
    }

    @Override // k.d.a.c.f0.c
    public boolean c() {
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
    }

    public int getCheckedChipId() {
    }

    public List<Integer> getCheckedChipIds() {
    }

    public int getChipSpacingHorizontal() {
    }

    public int getChipSpacingVertical() {
    }

    public void m(int i2) {
    }

    public void n() {
    }

    public int o(View view) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
    }

    public boolean p() {
    }

    public final void q(int i2, boolean z) {
    }

    public final void r(int i2, boolean z) {
    }

    public void setChipSpacing(int i2) {
    }

    public void setChipSpacingHorizontal(int i2) {
    }

    public void setChipSpacingHorizontalResource(int i2) {
    }

    public void setChipSpacingResource(int i2) {
    }

    public void setChipSpacingVertical(int i2) {
    }

    public void setChipSpacingVerticalResource(int i2) {
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
    }

    @Deprecated
    public void setFlexWrap(int i2) {
    }

    public void setOnCheckedChangeListener(d dVar) {
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
    }

    public void setSelectionRequired(boolean z) {
    }

    @Deprecated
    public void setShowDividerHorizontal(int i2) {
    }

    @Deprecated
    public void setShowDividerVertical(int i2) {
    }

    @Override // k.d.a.c.f0.c
    public void setSingleLine(boolean z) {
    }

    public void setSingleSelection(boolean z) {
    }

    public ChipGroup(Context context, AttributeSet attributeSet, int i2) {
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    public void setSingleLine(int i2) {
    }

    public void setSingleSelection(int i2) {
    }
}
