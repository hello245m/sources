package com.tencent.mp.feature.statistics.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.ktx.libraries.charts.LineChart;
import java.util.Map;
import java.util.Set;
import n.d;
import n.d0.c.l;
import n.d0.c.q;
import n.d0.d.h;
import n.d0.d.o;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class LineChartWithLegend extends FrameLayout {
    public final d a;
    public final d b;
    public final d c;
    public LineChart.c d;
    public boolean e;
    public final Set<Integer> f;
    public Map<Integer, View> g;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a extends o implements n.d0.c.a<TextView> {
        public final /* synthetic */ LineChartWithLegend a;

        public a(LineChartWithLegend lineChartWithLegend) {
        }

        public final TextView b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ TextView invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class b extends o implements n.d0.c.a<LinearLayout> {
        public final /* synthetic */ LineChartWithLegend a;

        public b(LineChartWithLegend lineChartWithLegend) {
        }

        public final LinearLayout b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ LinearLayout invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class c extends o implements n.d0.c.a<LineChart> {
        public final /* synthetic */ LineChartWithLegend a;

        public c(LineChartWithLegend lineChartWithLegend) {
        }

        public final LineChart b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ LineChart invoke() {
        }
    }

    public LineChartWithLegend(Context context, AttributeSet attributeSet) {
    }

    public LineChartWithLegend(Context context, AttributeSet attributeSet, int i2) {
    }

    public static /* synthetic */ void b(LineChartWithLegend lineChartWithLegend, int i2, View view) {
    }

    public static final void d(LineChartWithLegend lineChartWithLegend, int i2, View view) {
    }

    private final TextView getEmptyTV() {
    }

    private final LinearLayout getLegendLL() {
    }

    private final LineChart getLineChart() {
    }

    public View a(int i2) {
    }

    public final void c() {
    }

    public final void setData(LineChart.c cVar) {
    }

    public final void setHideIndexEnable(boolean z) {
    }

    public final void setSelectedDescBuilder(q<? super String, ? super LineChart.d, ? super Integer, String> qVar) {
    }

    public final void setSelectedTitleBuilder(l<? super String, String> lVar) {
    }

    public final void setYAxisTagBuilder(l<? super Integer, String> lVar) {
    }

    public /* synthetic */ LineChartWithLegend(Context context, AttributeSet attributeSet, int i2, int i3, h hVar) {
    }
}
