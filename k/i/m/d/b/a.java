package k.i.m.d.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class a implements b {
    public final Context a;
    public ServiceConnection b;

    /* renamed from: k.i.m.d.b.a$a, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class ServiceConnectionC0752a implements ServiceConnection {
        public final /* synthetic */ a a;

        public ServiceConnectionC0752a(a aVar) {
        }

        @Override // android.content.ServiceConnection
        public void onBindingDied(ComponentName componentName) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public a(Context context) {
    }

    public static /* synthetic */ ServiceConnection b(a aVar) {
    }

    @Override // k.i.m.d.b.b
    public int a(String str) {
    }

    public int c(String str, String str2) {
    }

    public final void d() {
    }
}
