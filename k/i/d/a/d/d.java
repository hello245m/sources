package k.i.d.a.d;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Set;
import k.i.d.a.d.e;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class d implements Application.ActivityLifecycleCallbacks {
    public Set<a> a;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface a {
        void onActivityCreated(Activity activity, Bundle bundle);

        void onActivityDestroyed(Activity activity);

        void onActivityPaused(Activity activity);

        void onActivityResumed(Activity activity);

        void onActivitySaveInstanceState(Activity activity, Bundle bundle);

        void onActivityStarted(Activity activity);

        void onActivityStopped(Activity activity);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class b implements a {
        @Override // k.i.d.a.d.d.a
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // k.i.d.a.d.d.a
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // k.i.d.a.d.d.a
        public void onActivityPaused(Activity activity) {
        }

        @Override // k.i.d.a.d.d.a
        public void onActivityResumed(Activity activity) {
        }

        @Override // k.i.d.a.d.d.a
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // k.i.d.a.d.d.a
        public void onActivityStarted(Activity activity) {
        }

        @Override // k.i.d.a.d.d.a
        public void onActivityStopped(Activity activity) {
        }
    }

    public final void a(a aVar) {
    }

    public final void b(Activity activity, e.a aVar) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
