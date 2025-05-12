package i.a.a.b.a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public interface a extends IInterface {

    /* renamed from: i.a.a.b.a.a$a, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class AbstractBinderC0103a extends Binder implements a {
        @Override // android.os.IInterface
        public IBinder asBinder() {
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        }
    }

    void A(CharSequence charSequence) throws RemoteException;

    void B() throws RemoteException;

    void C(MediaMetadataCompat mediaMetadataCompat) throws RemoteException;

    void D(int i2) throws RemoteException;

    void I(PlaybackStateCompat playbackStateCompat) throws RemoteException;

    void J(String str, Bundle bundle) throws RemoteException;

    void K(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException;

    void r(int i2) throws RemoteException;

    void u() throws RemoteException;

    void v(Bundle bundle) throws RemoteException;

    void w(List<MediaSessionCompat.QueueItem> list) throws RemoteException;

    void y(boolean z) throws RemoteException;

    void z(boolean z) throws RemoteException;
}
