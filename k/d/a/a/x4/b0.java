package k.d.a.a.x4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Handler;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class b0 {
    public static b0 e;
    public final Handler a;
    public final CopyOnWriteArrayList<WeakReference<c>> b;
    public final Object c;
    public int d;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class b {

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public static final class a extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
            public final b0 a;

            public a(b0 b0Var) {
            }

            @Override // android.telephony.TelephonyCallback.DisplayInfoListener
            public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
            }
        }

        public static void a(Context context, b0 b0Var) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface c {
        void a(int i2);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public final class d extends BroadcastReceiver {
        public final /* synthetic */ b0 a;

        public d(b0 b0Var) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }

        public /* synthetic */ d(b0 b0Var, a aVar) {
        }
    }

    public b0(Context context) {
    }

    public static /* synthetic */ int a(Context context) {
    }

    public static /* synthetic */ void b(b0 b0Var, int i2) {
    }

    public static synchronized b0 c(Context context) {
    }

    public static int d(NetworkInfo networkInfo) {
    }

    public static int f(Context context) {
    }

    private /* synthetic */ void g(c cVar) {
    }

    public int e() {
    }

    public /* synthetic */ void h(c cVar) {
    }

    public void i(c cVar) {
    }

    public final void j() {
    }

    public final void k(int i2) {
    }
}
