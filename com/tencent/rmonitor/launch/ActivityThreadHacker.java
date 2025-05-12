package com.tencent.rmonitor.launch;

import android.os.Handler;
import android.os.Message;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class ActivityThreadHacker {
    public final IApplicationCreateListener a;
    public boolean b;
    public long c;
    public HackCallback d;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class HackCallback implements Handler.Callback {
        public static int e = 10;
        public final Handler.Callback a;
        public final ActivityThreadHacker b;
        public boolean c;
        public Method d;

        public HackCallback(Handler.Callback callback, ActivityThreadHacker activityThreadHacker) {
        }

        public final void a(boolean z, boolean z2, boolean z3) {
        }

        public final boolean b(Message message) {
        }

        public final boolean c(Message message) {
        }

        public final boolean d(Message message) {
        }

        public final boolean e(Message message) {
        }

        public final void f() {
        }

        public Handler.Callback getOriginalCallback() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface IApplicationCreateListener {
        void onApplicationLaunchEnd(AppLaunchMode appLaunchMode);
    }

    public ActivityThreadHacker(IApplicationCreateListener iApplicationCreateListener) {
    }

    public static /* synthetic */ long a(ActivityThreadHacker activityThreadHacker, long j2) {
    }

    public static /* synthetic */ void b(ActivityThreadHacker activityThreadHacker, AppLaunchMode appLaunchMode) {
    }

    public final Field c(Object obj) throws NoSuchFieldException {
    }

    public Object d() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
    }

    public boolean e() {
    }

    public final void f(AppLaunchMode appLaunchMode) {
    }

    public void g(Object obj) throws NoSuchFieldException, IllegalAccessException {
    }

    public void h(Object obj) throws NoSuchFieldException, IllegalAccessException {
    }

    public void i() {
    }

    public void j() {
    }
}
