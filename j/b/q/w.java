package j.b.q;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class w extends Spinner implements j.g.t.e0 {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f2850i = null;
    public final j.b.q.e a;
    public final Context b;
    public h0 c;
    public SpinnerAdapter d;
    public final boolean e;
    public g f;
    public int g;
    public final Rect h;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a extends h0 {

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ e f2851j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ w f2852k;

        public a(w wVar, View view, e eVar) {
        }

        @Override // j.b.q.h0
        public j.b.p.j.p b() {
        }

        @Override // j.b.q.h0
        @SuppressLint({"SyntheticAccessor"})
        public boolean c() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ w a;

        public b(w wVar) {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class c implements g, DialogInterface.OnClickListener {
        public j.b.k.c a;
        public ListAdapter b;
        public CharSequence c;
        public final /* synthetic */ w d;

        public c(w wVar) {
        }

        @Override // j.b.q.w.g
        public void a(Drawable drawable) {
        }

        @Override // j.b.q.w.g
        public boolean b() {
        }

        @Override // j.b.q.w.g
        public int c() {
        }

        @Override // j.b.q.w.g
        public void dismiss() {
        }

        @Override // j.b.q.w.g
        public void e(int i2) {
        }

        @Override // j.b.q.w.g
        public CharSequence f() {
        }

        @Override // j.b.q.w.g
        public Drawable i() {
        }

        @Override // j.b.q.w.g
        public void j(CharSequence charSequence) {
        }

        @Override // j.b.q.w.g
        public void l(int i2) {
        }

        @Override // j.b.q.w.g
        public void m(int i2) {
        }

        @Override // j.b.q.w.g
        public void n(int i2, int i3) {
        }

        @Override // j.b.q.w.g
        public int o() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
        }

        @Override // j.b.q.w.g
        public void p(ListAdapter listAdapter) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class d implements ListAdapter, SpinnerAdapter {
        public SpinnerAdapter a;
        public ListAdapter b;

        public d(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        }

        @Override // android.widget.Adapter
        public Object getItem(int i2) {
        }

        @Override // android.widget.Adapter
        public long getItemId(int i2) {
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i2) {
        }

        @Override // android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i2) {
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class e extends j0 implements g {
        public CharSequence I;
        public ListAdapter J;
        public final Rect K;
        public int L;
        public final /* synthetic */ w M;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a implements AdapterView.OnItemClickListener {
            public final /* synthetic */ e a;

            public a(e eVar, w wVar) {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public final /* synthetic */ e a;

            public b(e eVar) {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class c implements PopupWindow.OnDismissListener {
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener a;
            public final /* synthetic */ e b;

            public c(e eVar, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
            }
        }

        public e(w wVar, Context context, AttributeSet attributeSet, int i2) {
        }

        public static /* synthetic */ void R(e eVar) {
        }

        public void S() {
        }

        public int T() {
        }

        public boolean U(View view) {
        }

        @Override // j.b.q.w.g
        public CharSequence f() {
        }

        @Override // j.b.q.w.g
        public void j(CharSequence charSequence) {
        }

        @Override // j.b.q.w.g
        public void m(int i2) {
        }

        @Override // j.b.q.w.g
        public void n(int i2, int i3) {
        }

        @Override // j.b.q.j0, j.b.q.w.g
        public void p(ListAdapter listAdapter) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class f extends View.BaseSavedState {
        public static final Parcelable.Creator<f> CREATOR = null;
        public boolean a;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a implements Parcelable.Creator<f> {
            public f a(Parcel parcel) {
            }

            public f[] b(int i2) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ f createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ f[] newArray(int i2) {
            }
        }

        public f(Parcelable parcelable) {
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
        }

        public f(Parcel parcel) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface g {
        void a(Drawable drawable);

        boolean b();

        int c();

        void dismiss();

        void e(int i2);

        CharSequence f();

        Drawable i();

        void j(CharSequence charSequence);

        void l(int i2);

        void m(int i2);

        void n(int i2, int i3);

        int o();

        void p(ListAdapter listAdapter);
    }

    public w(Context context, AttributeSet attributeSet) {
    }

    public int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
    }

    public void b() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
    }

    public final g getInternalPopup() {
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
    }

    @Override // j.g.t.e0
    public ColorStateList getSupportBackgroundTintList() {
    }

    @Override // j.g.t.e0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
    }

    @Override // android.widget.AdapterView
    public /* bridge */ /* synthetic */ void setAdapter(SpinnerAdapter spinnerAdapter) {
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i2) {
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
    }

    @Override // j.g.t.e0
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
    }

    @Override // j.g.t.e0
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
    }

    public w(Context context, AttributeSet attributeSet, int i2) {
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner
    /* renamed from: setAdapter, reason: avoid collision after fix types in other method */
    public void setAdapter2(SpinnerAdapter spinnerAdapter) {
    }

    public w(Context context, AttributeSet attributeSet, int i2, int i3) {
    }

    public w(Context context, AttributeSet attributeSet, int i2, int i3, Resources.Theme theme) {
    }
}
