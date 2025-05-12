package k.i.d.b.c.a.a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public interface c extends IInterface {

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class a extends Binder implements c {

        /* renamed from: k.i.d.b.c.a.a.c$a$a, reason: collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public static class C0294a implements c {
            public static c b;
            public IBinder a;

            public C0294a(IBinder iBinder) {
            }

            @Override // k.i.d.b.c.a.a.c
            public void F(int i2, int i3, int i4) throws RemoteException {
            }

            @Override // k.i.d.b.c.a.a.c
            public Bundle G(int i2, int i3, int i4) throws RemoteException {
            }

            @Override // k.i.d.b.c.a.a.c
            public int H(byte[] bArr, int i2, int i3, int i4) throws RemoteException {
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
            }

            @Override // k.i.d.b.c.a.a.c
            public Bundle x() throws RemoteException {
            }
        }

        public static c q(IBinder iBinder) {
        }

        public static c s() {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        }
    }

    void F(int i2, int i3, int i4) throws RemoteException;

    Bundle G(int i2, int i3, int i4) throws RemoteException;

    int H(byte[] bArr, int i2, int i3, int i4) throws RemoteException;

    Bundle x() throws RemoteException;
}
