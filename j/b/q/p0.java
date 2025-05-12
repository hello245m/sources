package j.b.q;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import j.b.k.a;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class p0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {
    public Runnable a;
    public c b;
    public i0 c;
    public Spinner d;
    public boolean e;
    public int f;
    public int g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f2839i;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements Runnable {
        public final /* synthetic */ View a;
        public final /* synthetic */ p0 b;

        public a(p0 p0Var, View view) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b extends BaseAdapter {
        public final /* synthetic */ p0 a;

        public b(p0 p0Var) {
        }

        @Override // android.widget.Adapter
        public int getCount() {
        }

        @Override // android.widget.Adapter
        public Object getItem(int i2) {
        }

        @Override // android.widget.Adapter
        public long getItemId(int i2) {
        }

        @Override // android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class c implements View.OnClickListener {
        public final /* synthetic */ p0 a;

        public c(p0 p0Var) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class d extends LinearLayout {
        public final int[] a;
        public a.c b;
        public TextView c;
        public ImageView d;
        public View e;
        public final /* synthetic */ p0 f;

        public d(p0 p0Var, Context context, a.c cVar, boolean z) {
        }

        public void a(a.c cVar) {
        }

        public a.c b() {
        }

        public void c() {
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i2, int i3) {
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
        }
    }

    public void a(int i2) {
    }

    public final Spinner b() {
    }

    public d c(a.c cVar, boolean z) {
    }

    public final boolean d() {
    }

    public final void e() {
    }

    public final boolean f() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
    }

    public void setContentHeight(int i2) {
    }

    public void setTabSelected(int i2) {
    }
}
