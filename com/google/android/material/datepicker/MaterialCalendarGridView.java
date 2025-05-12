package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import j.g.t.g;
import j.g.t.r0.c;
import java.util.Calendar;
import k.d.a.c.z.m;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class MaterialCalendarGridView extends GridView {
    public final Calendar a;
    public final boolean b;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a extends g {
        public a(MaterialCalendarGridView materialCalendarGridView) {
        }

        @Override // j.g.t.g
        public void g(View view, c cVar) {
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
    }

    public static int c(View view) {
    }

    public static boolean d(Long l2, Long l3, Long l4, Long l5) {
    }

    public final void a(int i2, Rect rect) {
    }

    public m b() {
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public /* bridge */ /* synthetic */ ListAdapter getAdapter() {
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onFocusChanged(boolean z, int i2, Rect rect) {
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @Override // android.widget.AdapterView
    public /* bridge */ /* synthetic */ void setAdapter(ListAdapter listAdapter) {
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i2) {
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i2) {
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: getAdapter, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ ListAdapter getAdapter2() {
    }

    @Override // android.widget.GridView, android.widget.AbsListView
    /* renamed from: setAdapter, reason: avoid collision after fix types in other method */
    public final void setAdapter2(ListAdapter listAdapter) {
    }
}
