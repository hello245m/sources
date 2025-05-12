package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import k.d.a.a.g4;
import k.d.a.a.s4.g1;
import k.d.a.a.u4.z;
import k.d.a.a.v4.b0;
import k.d.a.a.y2;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class TrackSelectionView extends LinearLayout {
    public final int a;
    public final LayoutInflater b;
    public final CheckedTextView c;
    public final CheckedTextView d;
    public final b e;
    public final List<g4.a> f;
    public final Map<g1, z> g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f391i;

    /* renamed from: j, reason: collision with root package name */
    public b0 f392j;

    /* renamed from: k, reason: collision with root package name */
    public CheckedTextView[][] f393k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f394l;

    /* renamed from: m, reason: collision with root package name */
    public Comparator<c> f395m;

    /* renamed from: n, reason: collision with root package name */
    public d f396n;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b implements View.OnClickListener {
        public final /* synthetic */ TrackSelectionView a;

        public b(TrackSelectionView trackSelectionView) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }

        public /* synthetic */ b(TrackSelectionView trackSelectionView, a aVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class c {
        public final g4.a a;
        public final int b;

        public c(g4.a aVar, int i2) {
        }

        public y2 a() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface d {
        void a(boolean z, Map<g1, z> map);
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
    }

    public static /* synthetic */ void a(TrackSelectionView trackSelectionView, View view) {
    }

    public static Map<g1, z> b(Map<g1, z> map, List<g4.a> list, boolean z) {
    }

    public final void c(View view) {
    }

    public final void d() {
    }

    public final void e() {
    }

    public final void f(View view) {
    }

    public final boolean g(g4.a aVar) {
    }

    public boolean getIsDisabled() {
    }

    public Map<g1, z> getOverrides() {
    }

    public final boolean h() {
    }

    public final void i() {
    }

    public final void j() {
    }

    public void setAllowAdaptiveSelections(boolean z) {
    }

    public void setAllowMultipleOverrides(boolean z) {
    }

    public void setShowDisableOption(boolean z) {
    }

    public void setTrackNameProvider(b0 b0Var) {
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet, int i2) {
    }
}
