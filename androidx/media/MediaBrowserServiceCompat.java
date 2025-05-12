package androidx.media;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class MediaBrowserServiceCompat extends Service {
    public static final boolean h = false;
    public g a;
    public final f b;
    public final ArrayList<f> c;
    public final j.d.a<IBinder, f> d;
    public f e;
    public final r f;
    public MediaSessionCompat.Token g;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a extends m<List<MediaBrowserCompat.MediaItem>> {
        public final /* synthetic */ f f;
        public final /* synthetic */ String g;
        public final /* synthetic */ Bundle h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Bundle f255i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ MediaBrowserServiceCompat f256j;

        public a(MediaBrowserServiceCompat mediaBrowserServiceCompat, Object obj, f fVar, String str, Bundle bundle, Bundle bundle2) {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.m
        public /* bridge */ /* synthetic */ void d(List<MediaBrowserCompat.MediaItem> list) {
        }

        public void h(List<MediaBrowserCompat.MediaItem> list) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b extends m<MediaBrowserCompat.MediaItem> {
        public final /* synthetic */ i.a.a.c.b f;

        public b(MediaBrowserServiceCompat mediaBrowserServiceCompat, Object obj, i.a.a.c.b bVar) {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.m
        public /* bridge */ /* synthetic */ void d(MediaBrowserCompat.MediaItem mediaItem) {
        }

        public void h(MediaBrowserCompat.MediaItem mediaItem) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class c extends m<List<MediaBrowserCompat.MediaItem>> {
        public final /* synthetic */ i.a.a.c.b f;

        public c(MediaBrowserServiceCompat mediaBrowserServiceCompat, Object obj, i.a.a.c.b bVar) {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.m
        public /* bridge */ /* synthetic */ void d(List<MediaBrowserCompat.MediaItem> list) {
        }

        public void h(List<MediaBrowserCompat.MediaItem> list) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class d extends m<Bundle> {
        public final /* synthetic */ i.a.a.c.b f;

        public d(MediaBrowserServiceCompat mediaBrowserServiceCompat, Object obj, i.a.a.c.b bVar) {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.m
        public void c(Bundle bundle) {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.m
        public /* bridge */ /* synthetic */ void d(Bundle bundle) {
        }

        public void h(Bundle bundle) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class e {
        public final String a;
        public final Bundle b;

        public e(String str, Bundle bundle) {
        }

        public static /* synthetic */ String a(e eVar) {
        }

        public static /* synthetic */ Bundle b(e eVar) {
        }

        public Bundle c() {
        }

        public String d() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class f implements IBinder.DeathRecipient {
        public final String a;
        public final int b;
        public final int c;
        public final p d;
        public final HashMap<String, List<j.g.s.d<IBinder, Bundle>>> e;
        public e f;
        public final /* synthetic */ MediaBrowserServiceCompat g;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a implements Runnable {
            public final /* synthetic */ f a;

            public a(f fVar) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public f(MediaBrowserServiceCompat mediaBrowserServiceCompat, String str, int i2, int i3, Bundle bundle, p pVar) {
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface g {
        IBinder a(Intent intent);

        void onCreate();
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class h implements g {
        public final List<Bundle> a;
        public MediaBrowserService b;
        public Messenger c;
        public final /* synthetic */ MediaBrowserServiceCompat d;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a extends m<List<MediaBrowserCompat.MediaItem>> {
            public final /* synthetic */ n f;

            public a(h hVar, Object obj, n nVar) {
            }

            @Override // androidx.media.MediaBrowserServiceCompat.m
            public /* bridge */ /* synthetic */ void d(List<MediaBrowserCompat.MediaItem> list) {
            }

            public void h(List<MediaBrowserCompat.MediaItem> list) {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class b extends MediaBrowserService {
            public final /* synthetic */ h a;

            public b(h hVar, Context context) {
            }

            @Override // android.service.media.MediaBrowserService
            @SuppressLint({"SyntheticAccessor"})
            public MediaBrowserService.BrowserRoot onGetRoot(String str, int i2, Bundle bundle) {
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
            }
        }

        public h(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.g
        public IBinder a(Intent intent) {
        }

        public e b(String str, int i2, Bundle bundle) {
        }

        public void c(String str, n<List<Parcel>> nVar) {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.g
        public void onCreate() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class i extends h {
        public final /* synthetic */ MediaBrowserServiceCompat e;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a extends m<MediaBrowserCompat.MediaItem> {
            public final /* synthetic */ n f;

            public a(i iVar, Object obj, n nVar) {
            }

            @Override // androidx.media.MediaBrowserServiceCompat.m
            public /* bridge */ /* synthetic */ void d(MediaBrowserCompat.MediaItem mediaItem) {
            }

            public void h(MediaBrowserCompat.MediaItem mediaItem) {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class b extends h.b {
            public final /* synthetic */ i b;

            public b(i iVar, Context context) {
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadItem(String str, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
            }
        }

        public i(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
        }

        public void d(String str, n<Parcel> nVar) {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.h, androidx.media.MediaBrowserServiceCompat.g
        public void onCreate() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class j extends i {
        public final /* synthetic */ MediaBrowserServiceCompat f;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a extends m<List<MediaBrowserCompat.MediaItem>> {
            public final /* synthetic */ n f;
            public final /* synthetic */ Bundle g;
            public final /* synthetic */ j h;

            public a(j jVar, Object obj, n nVar, Bundle bundle) {
            }

            @Override // androidx.media.MediaBrowserServiceCompat.m
            public /* bridge */ /* synthetic */ void d(List<MediaBrowserCompat.MediaItem> list) {
            }

            public void h(List<MediaBrowserCompat.MediaItem> list) {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class b extends i.b {
            public final /* synthetic */ j c;

            public b(j jVar, Context context) {
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, Bundle bundle) {
            }
        }

        public j(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
        }

        public void e(String str, n<List<Parcel>> nVar, Bundle bundle) {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.i, androidx.media.MediaBrowserServiceCompat.h, androidx.media.MediaBrowserServiceCompat.g
        public void onCreate() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class k extends j {
        public k(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class l implements g {
        public Messenger a;
        public final /* synthetic */ MediaBrowserServiceCompat b;

        public l(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.g
        public IBinder a(Intent intent) {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.g
        public void onCreate() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class m<T> {
        public final Object a;
        public boolean b;
        public boolean c;
        public boolean d;
        public int e;

        public m(Object obj) {
        }

        public int a() {
        }

        public boolean b() {
        }

        public void c(Bundle bundle) {
        }

        public void d(T t2) {
        }

        public void e(Bundle bundle) {
        }

        public void f(T t2) {
        }

        public void g(int i2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class n<T> {
        public MediaBrowserService.Result a;

        public n(MediaBrowserService.Result result) {
        }

        public List<MediaBrowser.MediaItem> a(List<Parcel> list) {
        }

        public void b(T t2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class o {
        public final /* synthetic */ MediaBrowserServiceCompat a;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a implements Runnable {
            public final /* synthetic */ p a;
            public final /* synthetic */ String b;
            public final /* synthetic */ int c;
            public final /* synthetic */ int d;
            public final /* synthetic */ Bundle e;
            public final /* synthetic */ o f;

            public a(o oVar, p pVar, String str, int i2, int i3, Bundle bundle) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class b implements Runnable {
            public final /* synthetic */ p a;
            public final /* synthetic */ o b;

            public b(o oVar, p pVar) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class c implements Runnable {
            public final /* synthetic */ p a;
            public final /* synthetic */ String b;
            public final /* synthetic */ IBinder c;
            public final /* synthetic */ Bundle d;
            public final /* synthetic */ o e;

            public c(o oVar, p pVar, String str, IBinder iBinder, Bundle bundle) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class d implements Runnable {
            public final /* synthetic */ p a;
            public final /* synthetic */ String b;
            public final /* synthetic */ IBinder c;
            public final /* synthetic */ o d;

            public d(o oVar, p pVar, String str, IBinder iBinder) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class e implements Runnable {
            public final /* synthetic */ p a;
            public final /* synthetic */ String b;
            public final /* synthetic */ i.a.a.c.b c;
            public final /* synthetic */ o d;

            public e(o oVar, p pVar, String str, i.a.a.c.b bVar) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class f implements Runnable {
            public final /* synthetic */ p a;
            public final /* synthetic */ int b;
            public final /* synthetic */ String c;
            public final /* synthetic */ int d;
            public final /* synthetic */ Bundle e;
            public final /* synthetic */ o f;

            public f(o oVar, p pVar, int i2, String str, int i3, Bundle bundle) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class g implements Runnable {
            public final /* synthetic */ p a;
            public final /* synthetic */ o b;

            public g(o oVar, p pVar) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class h implements Runnable {
            public final /* synthetic */ p a;
            public final /* synthetic */ String b;
            public final /* synthetic */ Bundle c;
            public final /* synthetic */ i.a.a.c.b d;
            public final /* synthetic */ o e;

            public h(o oVar, p pVar, String str, Bundle bundle, i.a.a.c.b bVar) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class i implements Runnable {
            public final /* synthetic */ p a;
            public final /* synthetic */ String b;
            public final /* synthetic */ Bundle c;
            public final /* synthetic */ i.a.a.c.b d;
            public final /* synthetic */ o e;

            public i(o oVar, p pVar, String str, Bundle bundle, i.a.a.c.b bVar) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public o(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
        }

        public void a(String str, IBinder iBinder, Bundle bundle, p pVar) {
        }

        public void b(String str, int i2, int i3, Bundle bundle, p pVar) {
        }

        public void c(p pVar) {
        }

        public void d(String str, i.a.a.c.b bVar, p pVar) {
        }

        public void e(p pVar, String str, int i2, int i3, Bundle bundle) {
        }

        public void f(String str, IBinder iBinder, p pVar) {
        }

        public void g(String str, Bundle bundle, i.a.a.c.b bVar, p pVar) {
        }

        public void h(String str, Bundle bundle, i.a.a.c.b bVar, p pVar) {
        }

        public void i(p pVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface p {
        void a(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException;

        IBinder asBinder();

        void b() throws RemoteException;

        void c(String str, MediaSessionCompat.Token token, Bundle bundle) throws RemoteException;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class q implements p {
        public final Messenger a;

        public q(Messenger messenger) {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.p
        public void a(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.p
        public IBinder asBinder() {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.p
        public void b() throws RemoteException {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.p
        public void c(String str, MediaSessionCompat.Token token, Bundle bundle) throws RemoteException {
        }

        public final void d(int i2, Bundle bundle) throws RemoteException {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public final class r extends Handler {
        public final o a;
        public final /* synthetic */ MediaBrowserServiceCompat b;

        public r(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
        }

        public void a(Runnable runnable) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }

        @Override // android.os.Handler
        public boolean sendMessageAtTime(Message message, long j2) {
        }
    }

    public void a(String str, f fVar, IBinder iBinder, Bundle bundle) {
    }

    public List<MediaBrowserCompat.MediaItem> b(List<MediaBrowserCompat.MediaItem> list, Bundle bundle) {
    }

    public boolean c(String str, int i2) {
    }

    public void d(String str, Bundle bundle, m<Bundle> mVar) {
    }

    @Override // android.app.Service
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public abstract e e(String str, int i2, Bundle bundle);

    public abstract void f(String str, m<List<MediaBrowserCompat.MediaItem>> mVar);

    public void g(String str, m<List<MediaBrowserCompat.MediaItem>> mVar, Bundle bundle) {
    }

    public void h(String str, m<MediaBrowserCompat.MediaItem> mVar) {
    }

    public void i(String str, Bundle bundle, m<List<MediaBrowserCompat.MediaItem>> mVar) {
    }

    public void j(String str, Bundle bundle) {
    }

    public void k(String str) {
    }

    public void l(String str, Bundle bundle, f fVar, i.a.a.c.b bVar) {
    }

    public void m(String str, f fVar, Bundle bundle, Bundle bundle2) {
    }

    public void n(String str, f fVar, i.a.a.c.b bVar) {
    }

    public void o(String str, Bundle bundle, f fVar, i.a.a.c.b bVar) {
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
    }

    @Override // android.app.Service
    public void onCreate() {
    }

    public boolean p(String str, f fVar, IBinder iBinder) {
    }
}
