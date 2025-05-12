package k.i.d.b.c.a.d;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public interface a extends IInterface {

    /* renamed from: k.i.d.b.c.a.d.a$a, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class AbstractBinderC0295a extends Binder implements a {

        /* renamed from: k.i.d.b.c.a.d.a$a$a, reason: collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public static class C0296a implements a {
            public static a b;
            public IBinder a;

            public C0296a(IBinder iBinder) {
            }

            @Override // k.i.d.b.c.a.d.a
            public void a(String str, Bundle bundle) throws RemoteException {
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
            }

            @Override // k.i.d.b.c.a.d.a
            public void g(k.i.d.b.c.a.a.b bVar) throws RemoteException {
            }

            @Override // k.i.d.b.c.a.d.a
            public int j(k.i.d.b.c.a.a.c cVar) throws RemoteException {
            }

            @Override // k.i.d.b.c.a.d.a
            public void l(int i2) throws RemoteException {
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

    void a(String str, Bundle bundle) throws RemoteException;

    void g(k.i.d.b.c.a.a.b bVar) throws RemoteException;

    int j(k.i.d.b.c.a.a.c cVar) throws RemoteException;

    void l(int i2) throws RemoteException;
}
