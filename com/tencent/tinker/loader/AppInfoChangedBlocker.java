package com.tencent.tinker.loader;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Message;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class AppInfoChangedBlocker {

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class HackerCallback implements Handler.Callback {
        public final int APPLICATION_INFO_CHANGED;
        public Handler.Callback origin;

        public HackerCallback(Handler.Callback callback, Class cls) {
        }

        public final boolean hackMessage(Message message) {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
        }
    }

    public static Handler fetchMHObject(Context context) throws Exception {
    }

    public static void interceptHandler(Handler handler) throws Exception {
    }

    public static boolean tryStart(Application application) {
    }
}
