package com.xiaomi.push.service;

import android.content.Context;
import android.os.IBinder;
import android.os.Messenger;
import com.xiaomi.push.service.XMPushService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
public class aj {
    private static aj a;
    private ConcurrentHashMap<String, HashMap<String, b>> b;
    private List<a> c;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public interface a {
        void a();
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static class b {
        public String a;
        public String b;
        public String c;
        public String d;
        public boolean e;
        public String f;
        public String g;
        public String h;

        /* renamed from: i, reason: collision with root package name */
        public String f2506i;

        /* renamed from: j, reason: collision with root package name */
        public String f2507j;

        /* renamed from: k, reason: collision with root package name */
        public cf f2508k;

        /* renamed from: l, reason: collision with root package name */
        public Context f2509l;

        /* renamed from: m, reason: collision with root package name */
        public c f2510m;

        /* renamed from: n, reason: collision with root package name */
        public c f2511n;

        /* renamed from: o, reason: collision with root package name */
        public Messenger f2512o;

        /* renamed from: p, reason: collision with root package name */
        public IBinder.DeathRecipient f2513p;

        /* renamed from: q, reason: collision with root package name */
        public final C0101b f2514q;

        /* renamed from: r, reason: collision with root package name */
        private int f2515r;

        /* renamed from: s, reason: collision with root package name */
        private List<a> f2516s;

        /* renamed from: t, reason: collision with root package name */
        private XMPushService f2517t;
        private boolean u;
        private XMPushService.c v;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
        public interface a {
            void a(c cVar, c cVar2, int i2);
        }

        /* renamed from: com.xiaomi.push.service.aj$b$b, reason: collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
        public class C0101b extends XMPushService.j {
            public int a;
            public int b;
            public String c;
            public String d;
            public final /* synthetic */ b e;

            public C0101b(b bVar) {
            }

            public XMPushService.j a(int i2, int i3, String str, String str2) {
            }

            @Override // com.xiaomi.push.service.XMPushService.j
            public void a() {
            }

            @Override // com.xiaomi.push.service.XMPushService.j
            public String b() {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
        public class c implements IBinder.DeathRecipient {
            public final b a;
            public final Messenger b;
            public final /* synthetic */ b c;

            public c(b bVar, b bVar2, Messenger messenger) {
            }

            @Override // android.os.IBinder.DeathRecipient
            public void binderDied() {
            }
        }

        public b() {
        }

        public b(XMPushService xMPushService) {
        }

        public static /* synthetic */ XMPushService.c a(b bVar) {
        }

        public static String a(String str) {
        }

        private void a(int i2, int i3, String str, String str2) {
        }

        public static /* synthetic */ void a(b bVar, int i2, int i3, String str, String str2) {
        }

        private boolean a(int i2, int i3, String str) {
        }

        public static /* synthetic */ boolean a(b bVar, int i2, int i3, String str) {
        }

        public static /* synthetic */ XMPushService b(b bVar) {
        }

        private boolean b(int i2, int i3, String str) {
        }

        public String a(int i2) {
        }

        public void a() {
        }

        public void a(Messenger messenger) {
        }

        public void a(a aVar) {
        }

        public void a(c cVar, int i2, int i3, String str, String str2) {
        }

        public long b() {
        }

        public void b(a aVar) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static final class c {
        public static final c a = null;
        public static final c b = null;
        public static final c c = null;
        private static final /* synthetic */ c[] d = null;

        private c(String str, int i2) {
        }

        public static c valueOf(String str) {
        }

        public static c[] values() {
        }
    }

    private aj() {
    }

    public static synchronized aj a() {
    }

    private String d(String str) {
    }

    public synchronized void a(Context context) {
    }

    public synchronized void a(Context context, int i2) {
    }

    public synchronized void a(a aVar) {
    }

    public synchronized void a(b bVar) {
    }

    public synchronized void a(String str) {
    }

    public synchronized void a(String str, String str2) {
    }

    public synchronized b b(String str, String str2) {
    }

    public synchronized ArrayList<b> b() {
    }

    public synchronized List<String> b(String str) {
    }

    public synchronized int c() {
    }

    public synchronized Collection<b> c(String str) {
    }

    public synchronized void d() {
    }

    public synchronized void e() {
    }
}
