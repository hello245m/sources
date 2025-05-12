package i.a.a.c;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public interface a extends IInterface {

    /* renamed from: i.a.a.c.a$a, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class AbstractBinderC0105a extends Binder implements a {

        /* renamed from: i.a.a.c.a$a$a, reason: collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public static class C0106a implements a {
            public static a b;
            public IBinder a;

            public C0106a(IBinder iBinder) {
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
            }

            @Override // i.a.a.c.a
            public void p(int i2, Bundle bundle) throws RemoteException {
            }
        }

        public static a q(IBinder iBinder) {
        }

        public static a s() {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        }
    }

    void p(int i2, Bundle bundle) throws RemoteException;
}
