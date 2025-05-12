package k.i.d.b.c.a.a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public interface b extends IInterface {

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class a extends Binder implements b {

        /* renamed from: k.i.d.b.c.a.a.b$a$a, reason: collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public static class C0293a implements b {
            public static b b;
            public IBinder a;

            public C0293a(IBinder iBinder) {
            }

            @Override // k.i.d.b.c.a.a.b
            public void a(String str, Bundle bundle) throws RemoteException {
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
            }
        }

        public static b q(IBinder iBinder) {
        }

        public static b s() {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        }
    }

    void a(String str, Bundle bundle) throws RemoteException;
}
