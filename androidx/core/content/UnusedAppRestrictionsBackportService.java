package androidx.core.content;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import j.g.j.s.b;
import j.g.k.e;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class UnusedAppRestrictionsBackportService extends Service {
    public b.a a;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a extends b.a {
        public final /* synthetic */ UnusedAppRestrictionsBackportService a;

        public a(UnusedAppRestrictionsBackportService unusedAppRestrictionsBackportService) {
        }

        @Override // j.g.j.s.b
        public void f(j.g.j.s.a aVar) throws RemoteException {
        }
    }

    public abstract void a(e eVar);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
    }
}
