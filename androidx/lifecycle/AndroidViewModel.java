package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class AndroidViewModel extends ViewModel {

    @SuppressLint({"StaticFieldLeak"})
    private Application mApplication;

    public AndroidViewModel(Application application) {
    }

    public <T extends Application> T getApplication() {
    }
}
