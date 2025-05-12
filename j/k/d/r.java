package j.k.d;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

@Deprecated
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class r extends j.a0.a.a {
    public static final int BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT = 1;

    @Deprecated
    public static final int BEHAVIOR_SET_USER_VISIBLE_HINT = 0;
    private static final boolean DEBUG = false;
    private static final String TAG = "FragmentPagerAdapter";
    private final int mBehavior;
    private x mCurTransaction;
    private Fragment mCurrentPrimaryItem;
    private boolean mExecutingFinishUpdate;
    private final m mFragmentManager;

    @Deprecated
    public r(m mVar) {
    }

    private static String makeFragmentName(int i2, long j2) {
    }

    @Override // j.a0.a.a
    public void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
    }

    @Override // j.a0.a.a
    public void finishUpdate(ViewGroup viewGroup) {
    }

    public abstract Fragment getItem(int i2);

    public long getItemId(int i2) {
    }

    @Override // j.a0.a.a
    public Object instantiateItem(ViewGroup viewGroup, int i2) {
    }

    @Override // j.a0.a.a
    public boolean isViewFromObject(View view, Object obj) {
    }

    @Override // j.a0.a.a
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override // j.a0.a.a
    public Parcelable saveState() {
    }

    @Override // j.a0.a.a
    public void setPrimaryItem(ViewGroup viewGroup, int i2, Object obj) {
    }

    @Override // j.a0.a.a
    public void startUpdate(ViewGroup viewGroup) {
    }

    public r(m mVar, int i2) {
    }
}
