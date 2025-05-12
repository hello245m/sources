package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import j.s.g0;
import j.s.h0;
import java.util.HashMap;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class MultiInstanceInvalidationService extends Service {
    public int a;
    public final HashMap<Integer, String> b;
    public final RemoteCallbackList<g0> c;
    public final h0.a d;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a extends RemoteCallbackList<g0> {
        public final /* synthetic */ MultiInstanceInvalidationService a;

        public a(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        }

        public void a(g0 g0Var, Object obj) {
        }

        @Override // android.os.RemoteCallbackList
        public /* bridge */ /* synthetic */ void onCallbackDied(g0 g0Var, Object obj) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b extends h0.a {
        public final /* synthetic */ MultiInstanceInvalidationService a;

        public b(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        }

        @Override // j.s.h0
        public int e(g0 g0Var, String str) {
        }

        @Override // j.s.h0
        public void m(int i2, String[] strArr) {
        }

        @Override // j.s.h0
        public void o(g0 g0Var, int i2) {
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
    }
}
