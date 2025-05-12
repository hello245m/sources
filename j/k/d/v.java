package j.k.d;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

@Deprecated
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class v extends j.a0.a.a {
    public final m a;
    public final int b;
    public x c;
    public ArrayList<Fragment.m> d;
    public ArrayList<Fragment> e;
    public Fragment f;
    public boolean g;

    public v(m mVar, int i2) {
    }

    @Override // j.a0.a.a
    public void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
    }

    @Override // j.a0.a.a
    public void finishUpdate(ViewGroup viewGroup) {
    }

    public abstract Fragment getItem(int i2);

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
}
