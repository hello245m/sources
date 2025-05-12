package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class AlertController {
    public NestedScrollView A;
    public int B;
    public Drawable C;
    public ImageView D;
    public TextView E;
    public TextView F;
    public View G;
    public ListAdapter H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public boolean P;
    public int Q;
    public Handler R;
    public final View.OnClickListener S;
    public final Context a;
    public final j.b.k.h b;
    public final Window c;
    public final int d;
    public CharSequence e;
    public CharSequence f;
    public ListView g;
    public View h;

    /* renamed from: i, reason: collision with root package name */
    public int f68i;

    /* renamed from: j, reason: collision with root package name */
    public int f69j;

    /* renamed from: k, reason: collision with root package name */
    public int f70k;

    /* renamed from: l, reason: collision with root package name */
    public int f71l;

    /* renamed from: m, reason: collision with root package name */
    public int f72m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f73n;

    /* renamed from: o, reason: collision with root package name */
    public Button f74o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f75p;

    /* renamed from: q, reason: collision with root package name */
    public Message f76q;

    /* renamed from: r, reason: collision with root package name */
    public Drawable f77r;

    /* renamed from: s, reason: collision with root package name */
    public Button f78s;

    /* renamed from: t, reason: collision with root package name */
    public CharSequence f79t;
    public Message u;
    public Drawable v;
    public Button w;
    public CharSequence x;
    public Message y;
    public Drawable z;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class RecycleListView extends ListView {
        public final int a;
        public final int b;

        public RecycleListView(Context context, AttributeSet attributeSet) {
        }

        public void a(boolean z, boolean z2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ AlertController a;

        public a(AlertController alertController) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b implements NestedScrollView.c {
        public final /* synthetic */ View a;
        public final /* synthetic */ View b;

        public b(AlertController alertController, View view, View view2) {
        }

        @Override // androidx.core.widget.NestedScrollView.c
        public void a(NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class c implements Runnable {
        public final /* synthetic */ View a;
        public final /* synthetic */ View b;
        public final /* synthetic */ AlertController c;

        public c(AlertController alertController, View view, View view2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class d implements AbsListView.OnScrollListener {
        public final /* synthetic */ View a;
        public final /* synthetic */ View b;

        public d(AlertController alertController, View view, View view2) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class e implements Runnable {
        public final /* synthetic */ View a;
        public final /* synthetic */ View b;
        public final /* synthetic */ AlertController c;

        public e(AlertController alertController, View view, View view2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class f {
        public int A;
        public int B;
        public int C;
        public int D;
        public boolean E;
        public boolean[] F;
        public boolean G;
        public boolean H;
        public int I;
        public DialogInterface.OnMultiChoiceClickListener J;
        public Cursor K;
        public String L;
        public String M;
        public AdapterView.OnItemSelectedListener N;
        public e O;
        public final Context a;
        public final LayoutInflater b;
        public int c;
        public Drawable d;
        public int e;
        public CharSequence f;
        public View g;
        public CharSequence h;

        /* renamed from: i, reason: collision with root package name */
        public CharSequence f80i;

        /* renamed from: j, reason: collision with root package name */
        public Drawable f81j;

        /* renamed from: k, reason: collision with root package name */
        public DialogInterface.OnClickListener f82k;

        /* renamed from: l, reason: collision with root package name */
        public CharSequence f83l;

        /* renamed from: m, reason: collision with root package name */
        public Drawable f84m;

        /* renamed from: n, reason: collision with root package name */
        public DialogInterface.OnClickListener f85n;

        /* renamed from: o, reason: collision with root package name */
        public CharSequence f86o;

        /* renamed from: p, reason: collision with root package name */
        public Drawable f87p;

        /* renamed from: q, reason: collision with root package name */
        public DialogInterface.OnClickListener f88q;

        /* renamed from: r, reason: collision with root package name */
        public boolean f89r;

        /* renamed from: s, reason: collision with root package name */
        public DialogInterface.OnCancelListener f90s;

        /* renamed from: t, reason: collision with root package name */
        public DialogInterface.OnDismissListener f91t;
        public DialogInterface.OnKeyListener u;
        public CharSequence[] v;
        public ListAdapter w;
        public DialogInterface.OnClickListener x;
        public int y;
        public View z;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a extends ArrayAdapter<CharSequence> {
            public final /* synthetic */ RecycleListView a;
            public final /* synthetic */ f b;

            public a(f fVar, Context context, int i2, int i3, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i2, View view, ViewGroup viewGroup) {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class b extends CursorAdapter {
            public final int a;
            public final int b;
            public final /* synthetic */ RecycleListView c;
            public final /* synthetic */ AlertController d;
            public final /* synthetic */ f e;

            public b(f fVar, Context context, Cursor cursor, boolean z, RecycleListView recycleListView, AlertController alertController) {
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class c implements AdapterView.OnItemClickListener {
            public final /* synthetic */ AlertController a;
            public final /* synthetic */ f b;

            public c(f fVar, AlertController alertController) {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class d implements AdapterView.OnItemClickListener {
            public final /* synthetic */ RecycleListView a;
            public final /* synthetic */ AlertController b;
            public final /* synthetic */ f c;

            public d(f fVar, RecycleListView recycleListView, AlertController alertController) {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public interface e {
            void a(ListView listView);
        }

        public f(Context context) {
        }

        public void a(AlertController alertController) {
        }

        public final void b(AlertController alertController) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class g extends Handler {
        public WeakReference<DialogInterface> a;

        public g(DialogInterface dialogInterface) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class h extends ArrayAdapter<CharSequence> {
        public h(Context context, int i2, int i3, CharSequence[] charSequenceArr) {
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i2) {
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
        }
    }

    public AlertController(Context context, j.b.k.h hVar, Window window) {
    }

    public static boolean a(View view) {
    }

    public static void f(View view, View view2, View view3) {
    }

    public static boolean z(Context context) {
    }

    public final void b(Button button) {
    }

    public int c(int i2) {
    }

    public ListView d() {
    }

    public void e() {
    }

    public boolean g(int i2, KeyEvent keyEvent) {
    }

    public boolean h(int i2, KeyEvent keyEvent) {
    }

    public final ViewGroup i(View view, View view2) {
    }

    public final int j() {
    }

    public void k(int i2, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
    }

    public void l(View view) {
    }

    public void m(int i2) {
    }

    public void n(Drawable drawable) {
    }

    public void o(CharSequence charSequence) {
    }

    public final void p(ViewGroup viewGroup, View view, int i2, int i3) {
    }

    public void q(CharSequence charSequence) {
    }

    public void r(int i2) {
    }

    public void s(View view) {
    }

    public void t(View view, int i2, int i3, int i4, int i5) {
    }

    public final void u(ViewGroup viewGroup) {
    }

    public final void v(ViewGroup viewGroup) {
    }

    public final void w(ViewGroup viewGroup) {
    }

    public final void x(ViewGroup viewGroup) {
    }

    public final void y() {
    }
}
