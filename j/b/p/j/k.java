package j.b.p.j;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class k implements p, m, AdapterView.OnItemClickListener {
    public Rect a;

    public static f A(ListAdapter listAdapter) {
    }

    public static int q(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i2) {
    }

    public static boolean z(g gVar) {
    }

    @Override // j.b.p.j.m
    public boolean e(g gVar, i iVar) {
    }

    @Override // j.b.p.j.m
    public boolean f(g gVar, i iVar) {
    }

    @Override // j.b.p.j.m
    public int getId() {
    }

    @Override // j.b.p.j.m
    public void i(Context context, g gVar) {
    }

    public abstract void n(g gVar);

    public boolean o() {
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
    }

    public Rect p() {
    }

    public abstract void r(View view);

    public void s(Rect rect) {
    }

    public abstract void t(boolean z);

    public abstract void u(int i2);

    public abstract void v(int i2);

    public abstract void w(PopupWindow.OnDismissListener onDismissListener);

    public abstract void x(boolean z);

    public abstract void y(int i2);
}
