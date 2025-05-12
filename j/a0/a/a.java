package j.a0.a;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class a {
    public static final int POSITION_NONE = -2;
    public static final int POSITION_UNCHANGED = -1;
    private final DataSetObservable mObservable;
    private DataSetObserver mViewPagerObserver;

    @Deprecated
    public void destroyItem(View view, int i2, Object obj) {
    }

    public abstract void destroyItem(ViewGroup viewGroup, int i2, Object obj);

    @Deprecated
    public void finishUpdate(View view) {
    }

    public abstract void finishUpdate(ViewGroup viewGroup);

    public abstract int getCount();

    public int getItemPosition(Object obj) {
    }

    public CharSequence getPageTitle(int i2) {
    }

    public float getPageWidth(int i2) {
    }

    @Deprecated
    public Object instantiateItem(View view, int i2) {
    }

    public abstract Object instantiateItem(ViewGroup viewGroup, int i2);

    public abstract boolean isViewFromObject(View view, Object obj);

    public void notifyDataSetChanged() {
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
    }

    public abstract void restoreState(Parcelable parcelable, ClassLoader classLoader);

    public abstract Parcelable saveState();

    @Deprecated
    public void setPrimaryItem(View view, int i2, Object obj) {
    }

    public abstract void setPrimaryItem(ViewGroup viewGroup, int i2, Object obj);

    public void setViewPagerObserver(DataSetObserver dataSetObserver) {
    }

    @Deprecated
    public void startUpdate(View view) {
    }

    public abstract void startUpdate(ViewGroup viewGroup);

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
    }
}
