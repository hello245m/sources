package k.i.d.b.d.a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class d<MODEL, VIEWHOLDER> extends BaseAdapter implements Filterable {
    public final Context a;
    public final a<MODEL, VIEWHOLDER> b;
    public final e<MODEL> c;
    public Filter d;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class a<MODEL, VIEWHOLDER> {
        public abstract void a(b<VIEWHOLDER> bVar, int i2, MODEL model);

        public VIEWHOLDER b(View view, int i2, MODEL model) {
        }

        public abstract int c(int i2, MODEL model);

        public int d(int i2, MODEL model) {
        }

        public int e() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class b<VIEWHOLDER> {
        public final View a;
        public final VIEWHOLDER b;

        public b(View view, VIEWHOLDER viewholder) {
        }

        public final View a() {
        }
    }

    public d(Context context, a<? super MODEL, VIEWHOLDER> aVar, e<MODEL> eVar) {
    }

    @Override // android.widget.Adapter
    public int getCount() {
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
    }

    @Override // android.widget.Adapter
    public MODEL getItem(int i2) {
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i2) {
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
    }
}
