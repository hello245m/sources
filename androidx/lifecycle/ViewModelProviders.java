package androidx.lifecycle;

import android.app.Application;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;

@Deprecated
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class ViewModelProviders {

    @Deprecated
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class DefaultFactory extends ViewModelProvider.AndroidViewModelFactory {
        @Deprecated
        public DefaultFactory(Application application) {
        }
    }

    @Deprecated
    public ViewModelProviders() {
    }

    @Deprecated
    public static ViewModelProvider of(Fragment fragment) {
    }

    @Deprecated
    public static ViewModelProvider of(FragmentActivity fragmentActivity) {
    }

    @Deprecated
    public static ViewModelProvider of(Fragment fragment, ViewModelProvider.Factory factory) {
    }

    @Deprecated
    public static ViewModelProvider of(FragmentActivity fragmentActivity, ViewModelProvider.Factory factory) {
    }
}
