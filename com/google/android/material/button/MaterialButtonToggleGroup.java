package com.google.android.material.button;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import j.g.t.g;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import k.d.a.c.l0.k;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: k, reason: collision with root package name */
    public static final String f452k = null;

    /* renamed from: l, reason: collision with root package name */
    public static final int f453l = 0;
    public final List<d> a;
    public final c b;
    public final f c;
    public final LinkedHashSet<e> d;
    public final Comparator<MaterialButton> e;
    public Integer[] f;
    public boolean g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f454i;

    /* renamed from: j, reason: collision with root package name */
    public int f455j;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements Comparator<MaterialButton> {
        public final /* synthetic */ MaterialButtonToggleGroup a;

        public a(MaterialButtonToggleGroup materialButtonToggleGroup) {
        }

        public int a(MaterialButton materialButton, MaterialButton materialButton2) {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(MaterialButton materialButton, MaterialButton materialButton2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b extends g {
        public final /* synthetic */ MaterialButtonToggleGroup d;

        public b(MaterialButtonToggleGroup materialButtonToggleGroup) {
        }

        @Override // j.g.t.g
        public void g(View view, j.g.t.r0.c cVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class c implements MaterialButton.a {
        public final /* synthetic */ MaterialButtonToggleGroup a;

        public c(MaterialButtonToggleGroup materialButtonToggleGroup) {
        }

        @Override // com.google.android.material.button.MaterialButton.a
        public void a(MaterialButton materialButton, boolean z) {
        }

        public /* synthetic */ c(MaterialButtonToggleGroup materialButtonToggleGroup, a aVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class d {
        public static final k.d.a.c.l0.c e = null;
        public k.d.a.c.l0.c a;
        public k.d.a.c.l0.c b;
        public k.d.a.c.l0.c c;
        public k.d.a.c.l0.c d;

        public d(k.d.a.c.l0.c cVar, k.d.a.c.l0.c cVar2, k.d.a.c.l0.c cVar3, k.d.a.c.l0.c cVar4) {
        }

        public static d a(d dVar) {
        }

        public static d b(d dVar, View view) {
        }

        public static d c(d dVar) {
        }

        public static d d(d dVar) {
        }

        public static d e(d dVar, View view) {
        }

        public static d f(d dVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface e {
        void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i2, boolean z);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class f implements MaterialButton.b {
        public final /* synthetic */ MaterialButtonToggleGroup a;

        public f(MaterialButtonToggleGroup materialButtonToggleGroup) {
        }

        @Override // com.google.android.material.button.MaterialButton.b
        public void a(MaterialButton materialButton, boolean z) {
        }

        public /* synthetic */ f(MaterialButtonToggleGroup materialButtonToggleGroup, a aVar) {
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
    }

    public static /* synthetic */ int a(MaterialButtonToggleGroup materialButtonToggleGroup, View view) {
    }

    public static /* synthetic */ boolean b(MaterialButtonToggleGroup materialButtonToggleGroup) {
    }

    public static /* synthetic */ boolean c(MaterialButtonToggleGroup materialButtonToggleGroup) {
    }

    public static /* synthetic */ int d(MaterialButtonToggleGroup materialButtonToggleGroup, int i2) {
    }

    public static /* synthetic */ boolean e(MaterialButtonToggleGroup materialButtonToggleGroup, int i2, boolean z) {
    }

    public static /* synthetic */ void f(MaterialButtonToggleGroup materialButtonToggleGroup, int i2, boolean z) {
    }

    private int getFirstVisibleChildIndex() {
    }

    private int getLastVisibleChildIndex() {
    }

    private int getVisibleButtonCount() {
    }

    private void setCheckedId(int i2) {
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
    }

    private void setupButtonChild(MaterialButton materialButton) {
    }

    public static void t(k.b bVar, d dVar) {
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    public void g(e eVar) {
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
    }

    public int getCheckedButtonId() {
    }

    public List<Integer> getCheckedButtonIds() {
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i2, int i3) {
    }

    public final void h() {
    }

    public final LinearLayout.LayoutParams i(View view) {
    }

    public final void j(int i2) {
    }

    public void k() {
    }

    public final void l(int i2, boolean z) {
    }

    public final MaterialButton m(int i2) {
    }

    public final int n(View view) {
    }

    public final d o(int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
    }

    public final boolean p(int i2) {
    }

    public boolean q() {
    }

    public final void r(int i2) {
    }

    public final void s(int i2, boolean z) {
    }

    public void setSelectionRequired(boolean z) {
    }

    public void setSingleSelection(boolean z) {
    }

    public final boolean u(int i2, boolean z) {
    }

    public final void v() {
    }

    public void w() {
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i2) {
    }

    public void setSingleSelection(int i2) {
    }
}
