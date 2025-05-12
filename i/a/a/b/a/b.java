package i.a.a.b.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.KeyEvent;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public interface b extends IInterface {

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class a extends Binder implements b {

        /* renamed from: i.a.a.b.a.b$a$a, reason: collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public static class C0104a implements b {
            public static b b;
            public IBinder a;

            public C0104a(IBinder iBinder) {
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
            }

            @Override // i.a.a.b.a.b
            public void b(i.a.a.b.a.a aVar) throws RemoteException {
            }

            @Override // i.a.a.b.a.b
            public boolean i(KeyEvent keyEvent) throws RemoteException {
            }
        }

        public static b q(IBinder iBinder) {
        }

        public static b s() {
        }
    }

    void b(i.a.a.b.a.a aVar) throws RemoteException;

    boolean i(KeyEvent keyEvent) throws RemoteException;
}
