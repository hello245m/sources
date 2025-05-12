package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.SearchableInfo;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import j.b.q.i0;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class SearchView extends i0 implements j.b.p.c {
    public static final n w0 = null;
    public Rect A;
    public int[] B;
    public int[] C;
    public final ImageView D;
    public final Drawable E;
    public final int F;
    public final int G;
    public final Intent H;
    public final Intent I;
    public final CharSequence J;
    public l K;
    public k L;
    public View.OnFocusChangeListener M;
    public m N;
    public View.OnClickListener O;
    public boolean P;
    public boolean Q;
    public j.h.a.a R;
    public boolean S;
    public CharSequence T;
    public boolean U;
    public boolean V;
    public int W;
    public boolean g0;
    public CharSequence h0;
    public CharSequence i0;
    public boolean j0;
    public int k0;
    public SearchableInfo l0;
    public Bundle m0;
    public final Runnable n0;
    public Runnable o0;

    /* renamed from: p, reason: collision with root package name */
    public final SearchAutoComplete f141p;
    public final WeakHashMap<String, Drawable.ConstantState> p0;

    /* renamed from: q, reason: collision with root package name */
    public final View f142q;
    public final View.OnClickListener q0;

    /* renamed from: r, reason: collision with root package name */
    public final View f143r;
    public View.OnKeyListener r0;

    /* renamed from: s, reason: collision with root package name */
    public final View f144s;
    public final TextView.OnEditorActionListener s0;

    /* renamed from: t, reason: collision with root package name */
    public final ImageView f145t;
    public final AdapterView.OnItemClickListener t0;
    public final ImageView u;
    public final AdapterView.OnItemSelectedListener u0;
    public final ImageView v;
    public TextWatcher v0;
    public final ImageView w;
    public final View x;
    public p y;
    public Rect z;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class SearchAutoComplete extends j.b.q.d {
        public int d;
        public SearchView e;
        public boolean f;
        public final Runnable g;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a implements Runnable {
            public final /* synthetic */ SearchAutoComplete a;

            public a(SearchAutoComplete searchAutoComplete) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
        }

        private int getSearchViewTextMinWidthDp() {
        }

        public void a() {
        }

        public boolean b() {
        }

        public void c() {
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
        }

        @Override // j.b.q.d, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        }

        @Override // android.view.View
        public void onFinishInflate() {
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onFocusChanged(boolean z, int i2, Rect rect) {
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i2, KeyEvent keyEvent) {
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z) {
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
        }

        public void setSearchView(SearchView searchView) {
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i2) {
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements TextWatcher {
        public final /* synthetic */ SearchView a;

        public a(SearchView searchView) {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b implements Runnable {
        public final /* synthetic */ SearchView a;

        public b(SearchView searchView) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class c implements Runnable {
        public final /* synthetic */ SearchView a;

        public c(SearchView searchView) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class d implements View.OnFocusChangeListener {
        public final /* synthetic */ SearchView a;

        public d(SearchView searchView) {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class e implements View.OnLayoutChangeListener {
        public final /* synthetic */ SearchView a;

        public e(SearchView searchView) {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class f implements View.OnClickListener {
        public final /* synthetic */ SearchView a;

        public f(SearchView searchView) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class g implements View.OnKeyListener {
        public final /* synthetic */ SearchView a;

        public g(SearchView searchView) {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class h implements TextView.OnEditorActionListener {
        public final /* synthetic */ SearchView a;

        public h(SearchView searchView) {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class i implements AdapterView.OnItemClickListener {
        public final /* synthetic */ SearchView a;

        public i(SearchView searchView) {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class j implements AdapterView.OnItemSelectedListener {
        public final /* synthetic */ SearchView a;

        public j(SearchView searchView) {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface k {
        boolean a();
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface l {
        boolean a(String str);

        boolean b(String str);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface m {
        boolean a(int i2);

        boolean b(int i2);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class n {
        public Method a;
        public Method b;
        public Method c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        public n() {
        }

        public static void d() {
        }

        public void a(AutoCompleteTextView autoCompleteTextView) {
        }

        public void b(AutoCompleteTextView autoCompleteTextView) {
        }

        public void c(AutoCompleteTextView autoCompleteTextView) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class o extends j.i.a.a {
        public static final Parcelable.Creator<o> CREATOR = null;
        public boolean c;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a implements Parcelable.ClassLoaderCreator<o> {
            public o a(Parcel parcel) {
            }

            public o b(Parcel parcel, ClassLoader classLoader) {
            }

            public o[] c(int i2) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object[] newArray(int i2) {
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public /* bridge */ /* synthetic */ o createFromParcel(Parcel parcel, ClassLoader classLoader) {
            }
        }

        public o(Parcelable parcelable) {
        }

        public String toString() {
        }

        @Override // j.i.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
        }

        public o(Parcel parcel, ClassLoader classLoader) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class p extends TouchDelegate {
        public final View a;
        public final Rect b;
        public final Rect c;
        public final Rect d;
        public final int e;
        public boolean f;

        public p(Rect rect, Rect rect2, View view) {
        }

        public void a(Rect rect, Rect rect2) {
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
        }
    }

    public SearchView(Context context) {
    }

    public static boolean M(Context context) {
    }

    private int getPreferredHeight() {
    }

    private int getPreferredWidth() {
    }

    private void setQuery(CharSequence charSequence) {
    }

    public void B() {
    }

    public final Intent C(String str, Uri uri, String str2, String str3, int i2, String str4) {
    }

    public final Intent D(Cursor cursor, int i2, String str) {
    }

    public final Intent E(Intent intent, SearchableInfo searchableInfo) {
    }

    public final Intent F(Intent intent, SearchableInfo searchableInfo) {
    }

    public final void G() {
    }

    public void H() {
    }

    public final void I(View view, Rect rect) {
    }

    public final CharSequence J(CharSequence charSequence) {
    }

    public final boolean K() {
    }

    public boolean L() {
    }

    public final boolean N() {
    }

    public final void O(Intent intent) {
    }

    public void P(int i2, String str, String str2) {
    }

    public final boolean Q(int i2, int i3, String str) {
    }

    public void R() {
    }

    public boolean S(int i2, int i3, String str) {
    }

    public boolean T(int i2) {
    }

    public void U(CharSequence charSequence) {
    }

    public void V() {
    }

    public void W() {
    }

    public boolean X(View view, int i2, KeyEvent keyEvent) {
    }

    public void Y(CharSequence charSequence) {
    }

    public void Z() {
    }

    public void a0() {
    }

    public final void b0() {
    }

    @Override // j.b.p.c
    public void c() {
    }

    public final void c0(int i2) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
    }

    public void d0(CharSequence charSequence, boolean z) {
    }

    public final void e0() {
    }

    @Override // j.b.p.c
    public void f() {
    }

    public void f0() {
    }

    public final void g0() {
    }

    public int getImeOptions() {
    }

    public int getInputType() {
    }

    public int getMaxWidth() {
    }

    public CharSequence getQuery() {
    }

    public CharSequence getQueryHint() {
    }

    public int getSuggestionCommitIconResId() {
    }

    public int getSuggestionRowLayout() {
    }

    public j.h.a.a getSuggestionsAdapter() {
    }

    public final void h0() {
    }

    public final void i0() {
    }

    public final void j0(boolean z) {
    }

    public final void k0(boolean z) {
    }

    public final void l0(boolean z) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
    }

    @Override // j.b.q.i0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // j.b.q.i0, android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i2, Rect rect) {
    }

    public void setAppSearchData(Bundle bundle) {
    }

    public void setIconified(boolean z) {
    }

    public void setIconifiedByDefault(boolean z) {
    }

    public void setImeOptions(int i2) {
    }

    public void setInputType(int i2) {
    }

    public void setMaxWidth(int i2) {
    }

    public void setOnCloseListener(k kVar) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
    }

    public void setOnQueryTextListener(l lVar) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
    }

    public void setOnSuggestionListener(m mVar) {
    }

    public void setQueryHint(CharSequence charSequence) {
    }

    public void setQueryRefinementEnabled(boolean z) {
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
    }

    public void setSubmitButtonEnabled(boolean z) {
    }

    public void setSuggestionsAdapter(j.h.a.a aVar) {
    }

    public SearchView(Context context, AttributeSet attributeSet) {
    }

    public SearchView(Context context, AttributeSet attributeSet, int i2) {
    }
}
