package j.s;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public interface h0 extends IInterface {

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class a extends Binder implements h0 {

        /* renamed from: j.s.h0$a$a, reason: collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public static class C0178a implements h0 {
            public static h0 b;
            public IBinder a;

            public C0178a(IBinder iBinder) {
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
            }

            @Override // j.s.h0
            public int e(g0 g0Var, String str) throws RemoteException {
            }

            @Override // j.s.h0
            public void m(int i2, String[] strArr) throws RemoteException {
            }
        }

        public static h0 q(IBinder iBinder) {
        }

        public static h0 s() {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        }
    }

    int e(g0 g0Var, String str) throws RemoteException;

    void m(int i2, String[] strArr) throws RemoteException;

    void o(g0 g0Var, int i2) throws RemoteException;
}
