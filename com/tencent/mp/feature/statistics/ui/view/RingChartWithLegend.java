package com.tencent.mp.feature.statistics.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.ktx.libraries.charts.RingChart;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Map;
import java.util.Set;
import n.d0.d.h;
import n.d0.d.o;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class RingChartWithLegend extends FrameLayout {
    public final n.d a;
    public final n.d b;
    public final n.d c;
    public List<RingChart.b> d;
    public boolean e;
    public final Set<Integer> f;
    public final n.d g;
    public Map<Integer, View> h;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a extends o implements n.d0.c.a<TextView> {
        public final /* synthetic */ RingChartWithLegend a;

        public a(RingChartWithLegend ringChartWithLegend) {
        }

        public final TextView b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ TextView invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class b extends o implements n.d0.c.a<LinearLayout[]> {
        public final /* synthetic */ RingChartWithLegend a;

        public b(RingChartWithLegend ringChartWithLegend) {
        }

        public final LinearLayout[] b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ LinearLayout[] invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class c extends o implements n.d0.c.a<DecimalFormat> {
        public static final c a = null;

        public final DecimalFormat b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ DecimalFormat invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class d extends o implements n.d0.c.a<RingChart> {
        public final /* synthetic */ RingChartWithLegend a;

        public d(RingChartWithLegend ringChartWithLegend) {
        }

        public final RingChart b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ RingChart invoke() {
        }
    }

    public RingChartWithLegend(Context context, AttributeSet attributeSet) {
    }

    public RingChartWithLegend(Context context, AttributeSet attributeSet, int i2) {
    }

    public static /* synthetic */ void b(RingChartWithLegend ringChartWithLegend, int i2, View view) {
    }

    public static final void d(RingChartWithLegend ringChartWithLegend, int i2, View view) {
    }

    private final TextView getEmptyTV() {
    }

    private final LinearLayout[] getLegendLLs() {
    }

    private final DecimalFormat getPercentageFormat() {
    }

    private final RingChart getRingChart() {
    }

    public View a(int i2) {
    }

    public final void c() {
    }

    public final void setData(List<RingChart.b> list) {
    }

    public final void setHideIndexEnable(boolean z) {
    }

    public /* synthetic */ RingChartWithLegend(Context context, AttributeSet attributeSet, int i2, int i3, h hVar) {
    }
}
