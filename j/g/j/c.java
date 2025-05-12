package j.g.j;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class c extends j.g.k.b {
    public static f c;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements Runnable {
        public final /* synthetic */ String[] a;
        public final /* synthetic */ Activity b;
        public final /* synthetic */ int c;

        public a(String[] strArr, Activity activity, int i2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class b {
        public static void a(Activity activity) {
        }

        public static void b(Activity activity, Intent intent, int i2, Bundle bundle) {
        }

        public static void c(Activity activity, IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) throws IntentSender.SendIntentException {
        }
    }

    /* renamed from: j.g.j.c$c, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class C0130c {
        public static void a(Activity activity) {
        }

        public static void b(Activity activity) {
        }

        public static void c(Activity activity, SharedElementCallback sharedElementCallback) {
        }

        public static void d(Activity activity, SharedElementCallback sharedElementCallback) {
        }

        public static void e(Activity activity) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class d {
        public static void a(Object obj) {
        }

        public static void b(Activity activity, String[] strArr, int i2) {
        }

        public static boolean c(Activity activity, String str) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface e {
        void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface f {
        boolean a(Activity activity, String[] strArr, int i2);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface g {
        void validateRequestPermissionsRequestCode(int i2);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class h extends SharedElementCallback {
        public final q a;

        public h(q qVar) {
        }

        public static /* synthetic */ void a(SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
        }

        @Override // android.app.SharedElementCallback
        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
        }

        @Override // android.app.SharedElementCallback
        public View onCreateSnapshotView(Context context, Parcelable parcelable) {
        }

        @Override // android.app.SharedElementCallback
        public void onMapSharedElements(List<String> list, Map<String, View> map) {
        }

        @Override // android.app.SharedElementCallback
        public void onRejectSharedElements(List<View> list) {
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementsArrived(List<String> list, List<View> list2, SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
        }
    }

    public static void k(Activity activity) {
    }

    public static void l(Activity activity) {
    }

    public static /* synthetic */ void m(Activity activity) {
    }

    public static void n(Activity activity) {
    }

    public static void o(Activity activity) {
    }

    public static void p(Activity activity, String[] strArr, int i2) {
    }

    public static void q(Activity activity, q qVar) {
    }

    public static void r(Activity activity, q qVar) {
    }

    public static boolean s(Activity activity, String str) {
    }

    public static void t(Activity activity, Intent intent, int i2, Bundle bundle) {
    }

    public static void u(Activity activity, IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) throws IntentSender.SendIntentException {
    }

    public static void v(Activity activity) {
    }
}
