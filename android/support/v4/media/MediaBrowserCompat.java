package android.support.v4.media;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.media.MediaDescription;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class MediaBrowserCompat {
    public static final boolean b = false;
    public final f a;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class CustomActionResultReceiver extends i.a.a.c.b {
        public final String d;
        public final Bundle e;
        public final d f;

        @Override // i.a.a.c.b
        public void a(int i2, Bundle bundle) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class ItemReceiver extends i.a.a.c.b {
        public final String d;
        public final e e;

        @Override // i.a.a.c.b
        public void a(int i2, Bundle bundle) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class SearchResultReceiver extends i.a.a.c.b {
        public final String d;
        public final Bundle e;
        public final l f;

        @Override // i.a.a.c.b
        public void a(int i2, Bundle bundle) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class a {
        public static MediaDescription a(MediaBrowser.MediaItem mediaItem) {
        }

        public static int b(MediaBrowser.MediaItem mediaItem) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class b extends Handler {
        public final WeakReference<k> a;
        public WeakReference<Messenger> b;

        public b(k kVar) {
        }

        public void a(Messenger messenger) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class c {
        public final MediaBrowser.ConnectionCallback a;
        public b b;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a extends MediaBrowser.ConnectionCallback {
            public final /* synthetic */ c a;

            public a(c cVar) {
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnected() {
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnectionFailed() {
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnectionSuspended() {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public interface b {
            void d();

            void g();

            void onConnected();
        }

        public void a() {
        }

        public void b() {
        }

        public void c() {
        }

        public void d(b bVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class d {
        public abstract void a(String str, Bundle bundle, Bundle bundle2);

        public abstract void b(String str, Bundle bundle, Bundle bundle2);

        public abstract void c(String str, Bundle bundle, Bundle bundle2);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class e {
        public abstract void a(String str);

        public abstract void b(MediaItem mediaItem);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface f {
        MediaSessionCompat.Token a();

        void disconnect();

        void e();
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class g implements f, k, c.b {
        public final Context a;
        public final MediaBrowser b;
        public final Bundle c;
        public final b d;
        public final j.d.a<String, n> e;
        public m f;
        public Messenger g;
        public MediaSessionCompat.Token h;

        public g(Context context, ComponentName componentName, c cVar, Bundle bundle) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        public MediaSessionCompat.Token a() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.k
        public void b(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.k
        public void c(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c.b
        public void d() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        public void disconnect() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        public void e() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.k
        public void f(Messenger messenger) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c.b
        public void g() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c.b
        public void onConnected() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class h extends g {
        public h(Context context, ComponentName componentName, c cVar, Bundle bundle) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class i extends h {
        public i(Context context, ComponentName componentName, c cVar, Bundle bundle) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class j implements f, k {
        public final Context a;
        public final ComponentName b;
        public final c c;
        public final Bundle d;
        public final b e;
        public final j.d.a<String, n> f;
        public int g;
        public c h;

        /* renamed from: i, reason: collision with root package name */
        public m f59i;

        /* renamed from: j, reason: collision with root package name */
        public Messenger f60j;

        /* renamed from: k, reason: collision with root package name */
        public String f61k;

        /* renamed from: l, reason: collision with root package name */
        public MediaSessionCompat.Token f62l;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a implements Runnable {
            public final /* synthetic */ j a;

            public a(j jVar) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class b implements Runnable {
            public final /* synthetic */ j a;

            public b(j jVar) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class c implements ServiceConnection {
            public final /* synthetic */ j a;

            /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
            public class a implements Runnable {
                public final /* synthetic */ ComponentName a;
                public final /* synthetic */ IBinder b;
                public final /* synthetic */ c c;

                public a(c cVar, ComponentName componentName, IBinder iBinder) {
                }

                @Override // java.lang.Runnable
                public void run() {
                }
            }

            /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
            public class b implements Runnable {
                public final /* synthetic */ ComponentName a;
                public final /* synthetic */ c b;

                public b(c cVar, ComponentName componentName) {
                }

                @Override // java.lang.Runnable
                public void run() {
                }
            }

            public c(j jVar) {
            }

            public boolean a(String str) {
            }

            public final void b(Runnable runnable) {
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
            }
        }

        public j(Context context, ComponentName componentName, c cVar, Bundle bundle) {
        }

        public static String h(int i2) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        public MediaSessionCompat.Token a() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.k
        public void b(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.k
        public void c(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2) {
        }

        public void d() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        public void disconnect() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        public void e() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.k
        public void f(Messenger messenger) {
        }

        public void g() {
        }

        public boolean i() {
        }

        public final boolean j(Messenger messenger, String str) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface k {
        void b(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);

        void c(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2);

        void f(Messenger messenger);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class l {
        public abstract void a(String str, Bundle bundle);

        public abstract void b(String str, Bundle bundle, List<MediaItem> list);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class m {
        public Messenger a;
        public Bundle b;

        public m(IBinder iBinder, Bundle bundle) {
        }

        public void a(String str, IBinder iBinder, Bundle bundle, Messenger messenger) throws RemoteException {
        }

        public void b(Context context, Messenger messenger) throws RemoteException {
        }

        public void c(Messenger messenger) throws RemoteException {
        }

        public void d(Context context, Messenger messenger) throws RemoteException {
        }

        public final void e(int i2, Bundle bundle, Messenger messenger) throws RemoteException {
        }

        public void f(Messenger messenger) throws RemoteException {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class n {
        public final List<o> a;
        public final List<Bundle> b;

        public o a(Bundle bundle) {
        }

        public List<o> b() {
        }

        public List<Bundle> c() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class o {
        public final IBinder a;
        public WeakReference<n> b;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a extends MediaBrowser.SubscriptionCallback {
            public final /* synthetic */ o a;

            public a(o oVar) {
            }

            public List<MediaItem> a(List<MediaItem> list, Bundle bundle) {
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list) {
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onError(String str) {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class b extends a {
            public final /* synthetic */ o b;

            public b(o oVar) {
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list, Bundle bundle) {
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onError(String str, Bundle bundle) {
            }
        }

        public void a(String str, List<MediaItem> list) {
        }

        public void b(String str, List<MediaItem> list, Bundle bundle) {
        }

        public void c(String str) {
        }

        public void d(String str, Bundle bundle) {
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, c cVar, Bundle bundle) {
    }

    public void a() {
    }

    public void b() {
    }

    public MediaSessionCompat.Token c() {
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = null;
        public final int a;
        public final MediaDescriptionCompat b;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a implements Parcelable.Creator<MediaItem> {
            public MediaItem a(Parcel parcel) {
            }

            public MediaItem[] b(int i2) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ MediaItem createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ MediaItem[] newArray(int i2) {
            }
        }

        public MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i2) {
        }

        public static MediaItem a(Object obj) {
        }

        public static List<MediaItem> d(List<?> list) {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
        }

        public String toString() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
        }

        public MediaItem(Parcel parcel) {
        }
    }
}
