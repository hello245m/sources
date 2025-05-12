package com.tencent.mp.feature.statistics.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.ktx.libraries.charts.LineChart;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Map;
import n.d0.c.l;
import n.d0.c.q;
import n.d0.d.h;
import n.d0.d.o;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class ArticleFinishReadView extends FrameLayout {
    public final n.d a;
    public final n.d b;
    public final n.d c;
    public Map<Integer, View> d;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a extends o implements l<Integer, String> {
        public static final a a = null;

        public final String b(int i2) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ String invoke(Integer num) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class b extends o implements l<String, String> {
        public final /* synthetic */ ArticleFinishReadView a;

        public b(ArticleFinishReadView articleFinishReadView) {
        }

        public final String b(String str) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ String invoke(String str) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class d extends o implements n.d0.c.a<TextView> {
        public final /* synthetic */ ArticleFinishReadView a;

        public d(ArticleFinishReadView articleFinishReadView) {
        }

        public final TextView b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ TextView invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class e extends o implements n.d0.c.a<LineChart> {
        public final /* synthetic */ ArticleFinishReadView a;

        public e(ArticleFinishReadView articleFinishReadView) {
        }

        public final LineChart b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ LineChart invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class f extends o implements n.d0.c.a<DecimalFormat> {
        public static final f a = null;

        public final DecimalFormat b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ DecimalFormat invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class g extends o implements q<String, LineChart.d, Integer, String> {
        public final /* synthetic */ ArticleFinishReadView a;
        public final /* synthetic */ List<c.a> b;

        public g(ArticleFinishReadView articleFinishReadView, List<c.a> list) {
        }

        @Override // n.d0.c.q
        public /* bridge */ /* synthetic */ String a(String str, LineChart.d dVar, Integer num) {
        }

        public final String b(String str, LineChart.d dVar, int i2) {
        }
    }

    public ArticleFinishReadView(Context context, AttributeSet attributeSet) {
    }

    public ArticleFinishReadView(Context context, AttributeSet attributeSet, int i2) {
    }

    private final TextView getEmptyTV() {
    }

    private final LineChart getFinishReadLineChart() {
    }

    private final DecimalFormat getNumberFormat() {
    }

    public View a(int i2) {
    }

    public final void setData(c cVar) {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class c {
        public List<a> a;
        public int b;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a {
            public float a;
            public int b;

            public a(float f, int i2) {
            }

            public final int a() {
            }

            public final float b() {
            }

            public final void c(int i2) {
            }

            public boolean equals(Object obj) {
            }

            public int hashCode() {
            }

            public String toString() {
            }
        }

        public c() {
        }

        public c(List<a> list, int i2) {
        }

        public final List<a> a() {
        }

        public final int b() {
        }

        public final void c(List<a> list) {
        }

        public final void d(int i2) {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }

        public /* synthetic */ c(List list, int i2, int i3, h hVar) {
        }
    }

    public /* synthetic */ ArticleFinishReadView(Context context, AttributeSet attributeSet, int i2, int i3, h hVar) {
    }
}
