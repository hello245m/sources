package j.h.a;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import j.h.a.b;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {
    public boolean a;
    public boolean b;
    public Cursor c;
    public Context d;
    public int e;
    public C0149a f;
    public DataSetObserver g;
    public j.h.a.b h;

    /* renamed from: j.h.a.a$a, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class C0149a extends ContentObserver {
        public final /* synthetic */ a a;

        public C0149a(a aVar) {
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b extends DataSetObserver {
        public final /* synthetic */ a a;

        public b(a aVar) {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
        }
    }

    public a(Context context, Cursor cursor, boolean z) {
    }

    public void a(Cursor cursor) {
    }

    @Override // j.h.a.b.a
    public Cursor b() {
    }

    public abstract CharSequence c(Cursor cursor);

    public abstract void e(View view, Context context, Cursor cursor);

    public void f(Context context, Cursor cursor, int i2) {
    }

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
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

    public abstract View h(Context context, Cursor cursor, ViewGroup viewGroup);

    public void i() {
    }

    public Cursor j(Cursor cursor) {
    }
}
