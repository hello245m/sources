package com.tencent.tinker.loader.shareutil;

import android.os.Handler;
import android.os.Message;
import com.tencent.tinker.anno.Keep;
import com.tencent.tinker.loader.shareutil.ShareTinkerLog;
import java.text.SimpleDateFormat;
import java.util.List;

@Keep
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class TinkerLogInlineFence extends Handler {
    private static final String TAG = "Tinker.TinkerLogInlineFence";
    private static final Handler mainThreadHandler = null;
    private static final List<Object[]> pendingLogs = null;

    /* renamed from: com.tencent.tinker.loader.shareutil.TinkerLogInlineFence$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class AnonymousClass1 implements Runnable {
        public final /* synthetic */ ShareTinkerLog.TinkerLogImp val$logImp;

        /* renamed from: com.tencent.tinker.loader.shareutil.TinkerLogInlineFence$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public class RunnableC00811 implements Runnable {
            public final /* synthetic */ AnonymousClass1 this$0;
            public final /* synthetic */ Object[] val$argsRef;
            public final /* synthetic */ SimpleDateFormat val$timestampFmt;

            public RunnableC00811(AnonymousClass1 anonymousClass1, SimpleDateFormat simpleDateFormat, Object[] objArr) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public AnonymousClass1(ShareTinkerLog.TinkerLogImp tinkerLogImp) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public static /* synthetic */ List access$000() {
    }

    public static /* synthetic */ Handler access$100() {
    }

    private static void dummyThrowExceptionMethod() {
    }

    private void handleMessageImpl(Message message) {
    }

    private void handleMessage_$noinline$(Message message) {
    }

    private static void printPendingLogs(ShareTinkerLog.TinkerLogImp tinkerLogImp) {
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
    }
}
