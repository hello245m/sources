package com.tencent.rfix.loader.log;

import android.os.Handler;
import android.os.Message;
import androidx.annotation.Keep;
import java.util.List;

@Keep
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class RFixLogInlineFence extends Handler {
    public static final int MSG_PRINT_PENDING_LOGS = 240;
    private final Handler mainHandler;
    private final List<Object[]> pendingLogs;

    /* renamed from: com.tencent.rfix.loader.log.RFixLogInlineFence$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ IRFixLog a;
        public final /* synthetic */ RFixLogInlineFence b;

        /* renamed from: com.tencent.rfix.loader.log.RFixLogInlineFence$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public class RunnableC00771 implements Runnable {
            public final /* synthetic */ Object[] a;
            public final /* synthetic */ AnonymousClass1 b;

            public RunnableC00771(AnonymousClass1 anonymousClass1, Object[] objArr) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public AnonymousClass1(RFixLogInlineFence rFixLogInlineFence, IRFixLog iRFixLog) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public static /* synthetic */ List access$000(RFixLogInlineFence rFixLogInlineFence) {
    }

    public static /* synthetic */ void access$100(RFixLogInlineFence rFixLogInlineFence, IRFixLog iRFixLog, Object[] objArr, boolean z) {
    }

    public static /* synthetic */ Handler access$200(RFixLogInlineFence rFixLogInlineFence) {
    }

    private void dummyThrowExceptionMethod() {
    }

    private void handleMessageImpl(Message message) {
    }

    private void handleMessage_$noinline$(Message message) {
    }

    private void printLog(IRFixLog iRFixLog, Object[] objArr, boolean z) {
    }

    private boolean printLogCheck(IRFixLog iRFixLog, Object[] objArr) {
    }

    private void printLogError(IRFixLog iRFixLog, String str, String str2, Throwable th) {
    }

    private void printLogWarn(IRFixLog iRFixLog, String str, String str2, Throwable th) {
    }

    private void printPendingLogs(IRFixLog iRFixLog) {
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
    }
}
