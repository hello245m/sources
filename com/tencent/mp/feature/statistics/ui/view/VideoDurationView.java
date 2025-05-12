package com.tencent.mp.feature.statistics.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.ktx.libraries.charts.BarChart;
import java.util.List;
import java.util.Map;
import n.d;
import n.d0.c.l;
import n.d0.c.q;
import n.d0.d.h;
import n.d0.d.o;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class VideoDurationView extends FrameLayout {
    public final d a;
    public Map<Integer, View> b;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class b extends o implements l<Integer, String> {
        public static final b a = null;

        public final String b(int i2) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ String invoke(Integer num) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class c extends o implements q<String, BarChart.d, Integer, String> {
        public static final c a = null;

        @Override // n.d0.c.q
        public /* bridge */ /* synthetic */ String a(String str, BarChart.d dVar, Integer num) {
        }

        public final String b(String str, BarChart.d dVar, int i2) {
        }
    }

    public VideoDurationView(Context context, AttributeSet attributeSet) {
    }

    private final BarChart getBarChart() {
    }

    public View a(int i2) {
    }

    public final void b() {
    }

    public final void setData(a aVar) {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a {
        public List<C0071a> a;

        public a() {
        }

        public a(List<C0071a> list) {
        }

        public final List<C0071a> a() {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }

        /* renamed from: com.tencent.mp.feature.statistics.ui.view.VideoDurationView$a$a, reason: collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class C0071a {
            public String a;
            public int b;

            public C0071a() {
            }

            public C0071a(String str, int i2) {
            }

            public final String a() {
            }

            public final int b() {
            }

            public boolean equals(Object obj) {
            }

            public int hashCode() {
            }

            public String toString() {
            }

            public /* synthetic */ C0071a(String str, int i2, int i3, h hVar) {
            }
        }

        public /* synthetic */ a(List list, int i2, h hVar) {
        }
    }
}
