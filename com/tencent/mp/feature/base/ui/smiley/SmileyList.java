package com.tencent.mp.feature.base.ui.smiley;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import k.i.h.b.d.b1.m.c.d;
import n.d0.c.l;
import n.d0.d.h;
import n.u;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class SmileyList extends RecyclerView {
    public l<? super String, u> R0;
    public final GridLayoutManager S0;
    public final a T0;
    public final List<d.a> U0;
    public final Rect V0;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public final class a extends RecyclerView.h<RecyclerView.e0> {
        public final /* synthetic */ SmileyList d;

        public a(SmileyList smileyList) {
        }

        public static /* synthetic */ void T(SmileyList smileyList, d.a aVar, View view) {
        }

        public static final void U(SmileyList smileyList, d.a aVar, View view) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void H(RecyclerView.e0 e0Var, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public RecyclerView.e0 J(ViewGroup viewGroup, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int q() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int s(int i2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public final class b extends GridLayoutManager.c {
        public final /* synthetic */ SmileyList e;

        public b(SmileyList smileyList) {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int f(int i2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public final class c extends RecyclerView.u {
        public final /* synthetic */ SmileyList a;

        public c(SmileyList smileyList) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i2, int i3) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class d extends RecyclerView.e0 {
        public final ImageView a;

        public d(Context context, View view) {
        }

        public final ImageView c() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class e extends RecyclerView.e0 {
        public final TextView a;

        public e(View view) {
        }

        public final TextView c() {
        }
    }

    public SmileyList(Context context, AttributeSet attributeSet) {
    }

    public SmileyList(Context context, AttributeSet attributeSet, int i2) {
    }

    public static final /* synthetic */ a E1(SmileyList smileyList) {
    }

    public static final /* synthetic */ GridLayoutManager F1(SmileyList smileyList) {
    }

    public static final /* synthetic */ List G1(SmileyList smileyList) {
    }

    public static final /* synthetic */ void H1(SmileyList smileyList) {
    }

    public final void I1() {
    }

    public final void J1(int i2, int i3, int i4, int i5) {
    }

    public final l<String, u> getOnSmileyAppendListener() {
    }

    public final void setOnSmileyAppendListener(l<? super String, u> lVar) {
    }

    public /* synthetic */ SmileyList(Context context, AttributeSet attributeSet, int i2, int i3, h hVar) {
    }
}
