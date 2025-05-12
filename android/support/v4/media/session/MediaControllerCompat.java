package android.support.v4.media.session;

import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.view.KeyEvent;
import androidx.media.AudioAttributesCompat;
import i.a.a.b.a.a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class MediaControllerCompat {
    public final b a;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class MediaControllerImplApi21 implements b {
        public final MediaController a;
        public final Object b;
        public final List<a> c;
        public HashMap<a, a> d;
        public final MediaSessionCompat.Token e;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public static class ExtraBinderRequestResultReceiver extends ResultReceiver {
            public WeakReference<MediaControllerImplApi21> a;

            public ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
            }

            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i2, Bundle bundle) {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public static class a extends a.c {
            public a(a aVar) {
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, i.a.a.b.a.a
            public void A(CharSequence charSequence) throws RemoteException {
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, i.a.a.b.a.a
            public void B() throws RemoteException {
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, i.a.a.b.a.a
            public void C(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, i.a.a.b.a.a
            public void K(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, i.a.a.b.a.a
            public void v(Bundle bundle) throws RemoteException {
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, i.a.a.b.a.a
            public void w(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
            }
        }

        public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public boolean a(KeyEvent keyEvent) {
        }

        public void b() {
        }

        public final void c() {
        }

        public void d(String str, Bundle bundle, ResultReceiver resultReceiver) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class a implements IBinder.DeathRecipient {
        public b a;
        public i.a.a.b.a.a b;

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$a, reason: collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public static class C0000a extends MediaController.Callback {
            public final WeakReference<a> a;

            public C0000a(a aVar) {
            }

            @Override // android.media.session.MediaController.Callback
            public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            }

            @Override // android.media.session.MediaController.Callback
            public void onExtrasChanged(Bundle bundle) {
            }

            @Override // android.media.session.MediaController.Callback
            public void onMetadataChanged(MediaMetadata mediaMetadata) {
            }

            @Override // android.media.session.MediaController.Callback
            public void onPlaybackStateChanged(PlaybackState playbackState) {
            }

            @Override // android.media.session.MediaController.Callback
            public void onQueueChanged(List<MediaSession.QueueItem> list) {
            }

            @Override // android.media.session.MediaController.Callback
            public void onQueueTitleChanged(CharSequence charSequence) {
            }

            @Override // android.media.session.MediaController.Callback
            public void onSessionDestroyed() {
            }

            @Override // android.media.session.MediaController.Callback
            public void onSessionEvent(String str, Bundle bundle) {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class b extends Handler {
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public static class c extends a.AbstractBinderC0103a {
            public final WeakReference<a> a;

            public c(a aVar) {
            }

            public void A(CharSequence charSequence) throws RemoteException {
            }

            public void B() throws RemoteException {
            }

            public void C(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
            }

            @Override // i.a.a.b.a.a
            public void D(int i2) throws RemoteException {
            }

            @Override // i.a.a.b.a.a
            public void I(PlaybackStateCompat playbackStateCompat) throws RemoteException {
            }

            @Override // i.a.a.b.a.a
            public void J(String str, Bundle bundle) throws RemoteException {
            }

            public void K(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
            }

            @Override // i.a.a.b.a.a
            public void r(int i2) throws RemoteException {
            }

            @Override // i.a.a.b.a.a
            public void u() throws RemoteException {
            }

            public void v(Bundle bundle) throws RemoteException {
            }

            public void w(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
            }

            @Override // i.a.a.b.a.a
            public void y(boolean z) throws RemoteException {
            }

            @Override // i.a.a.b.a.a
            public void z(boolean z) throws RemoteException {
            }
        }

        public void a(d dVar) {
        }

        public void b(Bundle bundle) {
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
        }

        public void c(MediaMetadataCompat mediaMetadataCompat) {
        }

        public void d(PlaybackStateCompat playbackStateCompat) {
        }

        public void e(List<MediaSessionCompat.QueueItem> list) {
        }

        public void f(CharSequence charSequence) {
        }

        public void g() {
        }

        public void h(String str, Bundle bundle) {
        }

        public void i(int i2, Object obj, Bundle bundle) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface b {
        boolean a(KeyEvent keyEvent);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class c implements b {
        public i.a.a.b.a.b a;

        public c(MediaSessionCompat.Token token) {
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public boolean a(KeyEvent keyEvent) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class d {
        public d(int i2, int i3, int i4, int i5, int i6) {
        }

        public d(int i2, AudioAttributesCompat audioAttributesCompat, int i3, int i4, int i5) {
        }
    }

    public MediaControllerCompat(Context context, MediaSessionCompat.Token token) {
    }

    public boolean a(KeyEvent keyEvent) {
    }
}
