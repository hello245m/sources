package com.tencent.android.tpush.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.jg.EType;
import com.jg.JgClassChecked;
import com.tencent.android.tpush.service.protocol.m;
import com.tencent.android.tpush.service.protocol.n;
import com.tencent.android.tpush.service.protocol.r;
import com.tencent.tpns.baseapi.base.logger.TBaseLogger;
import com.tencent.tpns.baseapi.base.util.TTask;
import java.util.ArrayList;

@JgClassChecked(author = 1, fComment = "确认已进行安全校验", lastDate = "20150316", reviewer = 3, vComment = {EType.INTENTCHECK})
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class a {
    private static a a;
    private static volatile C0019a b;
    private static volatile c c;
    private static volatile d d;
    private volatile boolean e;
    private ArrayList<Intent> f;

    /* renamed from: com.tencent.android.tpush.service.a$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass1 extends TTask {
        public final /* synthetic */ Context a;
        public final /* synthetic */ a b;

        public AnonymousClass1(a aVar, Context context) {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
        }
    }

    /* renamed from: com.tencent.android.tpush.service.a$2, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass2 implements com.tencent.android.tpush.service.c.a {
        public final /* synthetic */ String a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ String c;
        public final /* synthetic */ Intent d;
        public final /* synthetic */ a e;

        public AnonymousClass2(a aVar, String str, Context context, String str2, Intent intent) {
        }

        @Override // com.tencent.android.tpush.service.c.a
        public void a(int i2, String str, com.tencent.android.tpush.service.protocol.d dVar) {
        }

        @Override // com.tencent.android.tpush.service.c.a
        public void b(int i2, String str, com.tencent.android.tpush.service.protocol.d dVar) {
        }
    }

    /* renamed from: com.tencent.android.tpush.service.a$3, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass3 implements com.tencent.android.tpush.service.c.a {
        public final /* synthetic */ Context a;
        public final /* synthetic */ m b;
        public final /* synthetic */ a c;

        public AnonymousClass3(a aVar, Context context, m mVar) {
        }

        @Override // com.tencent.android.tpush.service.c.a
        public void a(int i2, String str, com.tencent.android.tpush.service.protocol.d dVar) {
        }

        @Override // com.tencent.android.tpush.service.c.a
        public void b(int i2, String str, com.tencent.android.tpush.service.protocol.d dVar) {
        }
    }

    /* renamed from: com.tencent.android.tpush.service.a$4, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass4 implements com.tencent.android.tpush.service.c.a {
        public final /* synthetic */ long a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ int e;
        public final /* synthetic */ a f;

        public AnonymousClass4(a aVar, long j2, String str, String str2, String str3, int i2) {
        }

        @Override // com.tencent.android.tpush.service.c.a
        public void a(int i2, String str, com.tencent.android.tpush.service.protocol.d dVar) {
        }

        @Override // com.tencent.android.tpush.service.c.a
        public void b(int i2, String str, com.tencent.android.tpush.service.protocol.d dVar) {
        }
    }

    /* renamed from: com.tencent.android.tpush.service.a$5, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass5 implements com.tencent.android.tpush.service.c.a {
        public final /* synthetic */ long a;
        public final /* synthetic */ int b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ a f;

        public AnonymousClass5(a aVar, long j2, int i2, String str, String str2, String str3) {
        }

        @Override // com.tencent.android.tpush.service.c.a
        public void a(int i2, String str, com.tencent.android.tpush.service.protocol.d dVar) {
        }

        @Override // com.tencent.android.tpush.service.c.a
        public void b(int i2, String str, com.tencent.android.tpush.service.protocol.d dVar) {
        }
    }

    /* renamed from: com.tencent.android.tpush.service.a$6, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass6 implements com.tencent.android.tpush.service.c.a {
        public final /* synthetic */ long a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;
        public final /* synthetic */ a g;

        public AnonymousClass6(a aVar, long j2, int i2, int i3, String str, String str2, String str3) {
        }

        @Override // com.tencent.android.tpush.service.c.a
        public void a(int i2, String str, com.tencent.android.tpush.service.protocol.d dVar) {
        }

        @Override // com.tencent.android.tpush.service.c.a
        public void b(int i2, String str, com.tencent.android.tpush.service.protocol.d dVar) {
        }
    }

    /* renamed from: com.tencent.android.tpush.service.a$7, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass7 implements com.tencent.android.tpush.service.c.a {
        public final /* synthetic */ long a;
        public final /* synthetic */ int b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ a f;

        public AnonymousClass7(a aVar, long j2, int i2, String str, String str2, String str3) {
        }

        @Override // com.tencent.android.tpush.service.c.a
        public void a(int i2, String str, com.tencent.android.tpush.service.protocol.d dVar) {
        }

        @Override // com.tencent.android.tpush.service.c.a
        public void b(int i2, String str, com.tencent.android.tpush.service.protocol.d dVar) {
        }
    }

    /* renamed from: com.tencent.android.tpush.service.a$8, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass8 implements com.tencent.android.tpush.service.c.a {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;
        public final /* synthetic */ a c;

        public AnonymousClass8(a aVar, String str, String str2) {
        }

        @Override // com.tencent.android.tpush.service.c.a
        public void a(int i2, String str, com.tencent.android.tpush.service.protocol.d dVar) {
        }

        @Override // com.tencent.android.tpush.service.c.a
        public void b(int i2, String str, com.tencent.android.tpush.service.protocol.d dVar) {
        }
    }

    /* renamed from: com.tencent.android.tpush.service.a$9, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass9 implements com.tencent.android.tpush.service.c.a {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ a e;

        public AnonymousClass9(a aVar, String str, String str2, String str3, String str4) {
        }

        @Override // com.tencent.android.tpush.service.c.a
        public void a(int i2, String str, com.tencent.android.tpush.service.protocol.d dVar) {
        }

        @Override // com.tencent.android.tpush.service.c.a
        public void b(int i2, String str, com.tencent.android.tpush.service.protocol.d dVar) {
        }
    }

    /* renamed from: com.tencent.android.tpush.service.a$a, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class C0019a extends BroadcastReceiver {
        public final /* synthetic */ a a;

        private C0019a(a aVar) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }

        public /* synthetic */ C0019a(a aVar, AnonymousClass1 anonymousClass1) {
        }
    }

    @JgClassChecked(author = 1, fComment = "确认已进行安全校验", lastDate = "20150316", reviewer = 3, vComment = {EType.INTENTCHECK})
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b extends TTask {
        public final /* synthetic */ a a;
        private Context b;
        private Intent c;

        /* renamed from: com.tencent.android.tpush.service.a$b$1, reason: invalid class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class AnonymousClass1 implements TBaseLogger.WriteFileCallback {
            public final /* synthetic */ b a;

            public AnonymousClass1(b bVar) {
            }

            @Override // com.tencent.tpns.baseapi.base.logger.TBaseLogger.WriteFileCallback
            public void onFinished() {
            }
        }

        public b(a aVar, Context context, Intent intent) {
        }

        public static /* synthetic */ Intent a(b bVar) {
        }

        public static /* synthetic */ Context b(b bVar) {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class c extends BroadcastReceiver {
        public final /* synthetic */ a a;

        private c(a aVar) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }

        public /* synthetic */ c(a aVar, AnonymousClass1 anonymousClass1) {
        }
    }

    private a() {
    }

    public static /* synthetic */ void a(a aVar) {
    }

    private static boolean a(Object obj) {
    }

    public static /* synthetic */ void b(a aVar, int i2, int i3, int i4, String str, String str2, String str3) {
    }

    public static /* synthetic */ ArrayList c(a aVar) {
    }

    public static /* synthetic */ void d(a aVar, Context context, Intent intent) {
    }

    public static /* synthetic */ void e(a aVar, Context context, Intent intent) {
    }

    public static /* synthetic */ void f(a aVar, Context context, Intent intent) {
    }

    public static /* synthetic */ void g(a aVar, Context context, Intent intent) {
    }

    public static /* synthetic */ void h(a aVar, Context context, Intent intent) {
    }

    public static /* synthetic */ void i(a aVar, Context context, Intent intent) {
    }

    public static /* synthetic */ void j(a aVar, Context context, Intent intent) {
    }

    public static /* synthetic */ void k(a aVar, Context context, Intent intent) {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class d extends BroadcastReceiver {
        public long a;
        public final /* synthetic */ a b;

        /* renamed from: com.tencent.android.tpush.service.a$d$1, reason: invalid class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class AnonymousClass1 extends TTask {
            public final /* synthetic */ Context a;
            public final /* synthetic */ d b;

            public AnonymousClass1(d dVar, Context context) {
            }

            @Override // com.tencent.tpns.baseapi.base.util.TTask
            public void TRun() {
            }
        }

        /* renamed from: com.tencent.android.tpush.service.a$d$2, reason: invalid class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class AnonymousClass2 extends TTask {
            public final /* synthetic */ Context a;
            public final /* synthetic */ d b;

            public AnonymousClass2(d dVar, Context context) {
            }

            @Override // com.tencent.tpns.baseapi.base.util.TTask
            public void TRun() {
            }
        }

        private d(a aVar) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }

        public /* synthetic */ d(a aVar, AnonymousClass1 anonymousClass1) {
        }
    }

    public static /* synthetic */ void a(a aVar, int i2, int i3, int i4, String str, String str2, String str3) {
    }

    public static /* synthetic */ void b(a aVar, int i2, String str, String str2, int i3, String str3, String str4) {
    }

    public static /* synthetic */ void c(a aVar, Context context, Intent intent) {
    }

    private void d(Context context, Intent intent) {
    }

    private void e(Context context, Intent intent) {
    }

    private void f(Context context, Intent intent) {
    }

    private void g(Context context, Intent intent) {
    }

    private void h(Context context, Intent intent) {
    }

    private void i(Context context, Intent intent) {
    }

    private void j(Context context, Intent intent) {
    }

    private void k(Context context, Intent intent) {
    }

    public static /* synthetic */ void a(a aVar, int i2, n nVar, m mVar, String str, boolean z, String str2) {
    }

    public static /* synthetic */ void b(a aVar, Context context, Intent intent) {
    }

    public synchronized void c(Context context) {
    }

    public static /* synthetic */ void a(a aVar, int i2, r rVar, String str) {
    }

    public static /* synthetic */ boolean b(a aVar) {
    }

    public static /* synthetic */ void a(a aVar, int i2, String str, int i3, String str2, String str3) {
    }

    public synchronized void b(Context context) {
    }

    public static /* synthetic */ void a(a aVar, int i2, String str, int i3, String str2, String str3, String str4) {
    }

    public static /* synthetic */ void a(a aVar, int i2, String str, m mVar, String str2) {
    }

    public static /* synthetic */ void a(a aVar, int i2, String str, r rVar, String str2) {
    }

    public static /* synthetic */ void a(a aVar, int i2, String str, String str2, int i3, String str3) {
    }

    public static /* synthetic */ void a(a aVar, int i2, String str, String str2, int i3, String str3, String str4) {
    }

    public static /* synthetic */ void a(a aVar, int i2, String str, String str2, String str3, int i3, String str4) {
    }

    public static /* synthetic */ void a(a aVar, Context context, Intent intent) {
    }

    public synchronized void a(Context context) {
    }

    private void c(Context context, Intent intent) {
    }

    private void c(int i2, String str, int i3, String str2, String str3) {
    }

    public static synchronized a a() {
    }

    private void a(Context context, Intent intent) {
    }

    private void a(int i2, String str, int i3, String str2) {
    }

    private void a(int i2, String str, int i3, String str2, String str3, String str4) {
    }

    private void b(Context context, Intent intent) {
    }

    private void a(int i2, String str, String str2, int i3, String str3, String str4) {
    }

    private void b() {
    }

    private void b(int i2, String str, int i3, String str2, String str3) {
    }

    private void a(int i2, m mVar, String str, String str2, long j2, String str3) {
    }

    private void b(int i2, String str, String str2, int i3, String str3) {
    }

    private void b(int i2, String str, String str2, int i3, String str3, String str4) {
    }

    private void a(int i2, String str) {
    }

    private void a(int i2, String str, String str2, int i3, String str3) {
    }

    private void b(int i2, int i3, int i4, String str, String str2, String str3) {
    }

    private void a(int i2, String str, int i3, String str2, String str3) {
    }

    private void a(int i2, String str, String str2, String str3) {
    }

    private void a(int i2, n nVar, m mVar, String str, boolean z, String str2) {
    }

    private void a(int i2, String str, m mVar, String str2) {
    }

    private void a(int i2, r rVar, String str) {
    }

    private void a(int i2, String str, r rVar, String str2) {
    }

    private void a(int i2, String str, String str2, String str3, int i3, String str4) {
    }

    private void a(int i2, int i3, int i4, String str, String str2, String str3) {
    }
}
