package com.tencent.mp.feature.base.ui.smiley;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import java.util.Map;
import k.i.h.b.d.b1.f.d;
import n.d0.c.l;
import n.d0.d.h;
import n.d0.d.o;
import n.u;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class SmileyPanel extends d {
    public final n.d b;
    public final n.d c;
    public Map<Integer, View> d;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a extends o implements l<String, u> {
        public final /* synthetic */ SmileyPanel a;

        public a(SmileyPanel smileyPanel) {
        }

        public final void b(String str) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ u invoke(String str) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class b extends o implements n.d0.c.a<ImageView> {
        public final /* synthetic */ SmileyPanel a;

        public b(SmileyPanel smileyPanel) {
        }

        public final ImageView b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ ImageView invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class c extends o implements n.d0.c.a<SmileyList> {
        public final /* synthetic */ SmileyPanel a;

        public c(SmileyPanel smileyPanel) {
        }

        public final SmileyList b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ SmileyList invoke() {
        }
    }

    public SmileyPanel(Context context) {
    }

    public SmileyPanel(Context context, AttributeSet attributeSet) {
    }

    private final ImageView getDeleteIV() {
    }

    private final SmileyList getSmileyList() {
    }

    public static final void h(SmileyPanel smileyPanel, View view) {
    }

    public static final /* synthetic */ d.a i(SmileyPanel smileyPanel) {
    }

    public static /* synthetic */ void j(SmileyPanel smileyPanel, View view) {
    }

    @Override // k.i.h.b.d.b1.f.d
    public void b() {
    }

    @Override // k.i.h.b.d.b1.f.d
    public void c(boolean z) {
    }

    @Override // k.i.h.b.d.b1.f.d
    public void d() {
    }

    @Override // k.i.h.b.d.b1.f.d
    public void e() {
    }

    @Override // k.i.h.b.d.b1.f.d
    public void f() {
    }

    public View g(int i2) {
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i2, int i3) {
    }

    public final void setNestedScrollingEnable(boolean z) {
    }

    @Override // k.i.h.b.d.b1.f.d
    public void setPortHeightPx(int i2) {
    }

    @Override // k.i.h.b.d.b1.f.d
    public void setSendButtonEnable(boolean z) {
    }

    @Override // k.i.h.b.d.b1.f.d
    public void setTalkerName(String str) {
    }

    public /* synthetic */ SmileyPanel(Context context, AttributeSet attributeSet, int i2, h hVar) {
    }
}
