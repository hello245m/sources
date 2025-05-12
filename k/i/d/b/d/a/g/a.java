package k.i.d.b.d.a.g;

import android.content.Context;
import android.view.View;
import android.widget.BaseAdapter;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class a<ITEM, MODEL, VIEWHOLDER> extends BaseAdapter {
    public AbstractC0298a<? super ITEM, ? super MODEL, VIEWHOLDER> a;
    public final k.i.d.b.d.a.a<ITEM> b;
    public final k.i.d.b.d.a.b<ITEM> c;

    /* renamed from: k.i.d.b.d.a.g.a$a, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class AbstractC0298a<ITEM, MODEL, VIEWHOLDER> {
        public abstract void a(b<VIEWHOLDER> bVar, int i2, ITEM item, MODEL model);

        public VIEWHOLDER b() {
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

    public a(Context context, String str, int i2, AbstractC0298a<? super ITEM, ? super MODEL, VIEWHOLDER> abstractC0298a) {
    }

    public final k.i.d.b.d.a.b<ITEM> a() {
    }

    public final AbstractC0298a<ITEM, MODEL, VIEWHOLDER> b() {
    }
}
