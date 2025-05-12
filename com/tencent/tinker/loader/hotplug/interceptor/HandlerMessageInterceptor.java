package com.tencent.tinker.loader.hotplug.interceptor;

import android.os.Handler;
import android.os.Message;
import com.tencent.tinker.loader.hotplug.interceptor.Interceptor;
import java.lang.reflect.Field;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class HandlerMessageInterceptor extends Interceptor<Handler.Callback> {
    public static Field sMCallbackField;
    public final MessageHandler mMessageHandler;
    public final Handler mTarget;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class CallbackWrapper implements Handler.Callback, Interceptor.ITinkerHotplugProxy {
        public volatile boolean mIsInHandleMethod;
        public final MessageHandler mMessageHandler;
        public final Handler.Callback mOrigCallback;

        public CallbackWrapper(MessageHandler messageHandler, Handler.Callback callback) {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface MessageHandler {
        boolean handleMessage(Message message);
    }

    public HandlerMessageInterceptor(Handler handler, MessageHandler messageHandler) {
    }

    @Override // com.tencent.tinker.loader.hotplug.interceptor.Interceptor
    public /* bridge */ /* synthetic */ Handler.Callback decorate(Handler.Callback callback) throws Throwable {
    }

    @Override // com.tencent.tinker.loader.hotplug.interceptor.Interceptor
    public /* bridge */ /* synthetic */ Handler.Callback fetchTarget() throws Throwable {
    }

    @Override // com.tencent.tinker.loader.hotplug.interceptor.Interceptor
    public /* bridge */ /* synthetic */ void inject(Handler.Callback callback) throws Throwable {
    }

    /* renamed from: decorate, reason: avoid collision after fix types in other method */
    public Handler.Callback decorate2(Handler.Callback callback) throws Throwable {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.tinker.loader.hotplug.interceptor.Interceptor
    public Handler.Callback fetchTarget() throws Throwable {
    }

    /* renamed from: inject, reason: avoid collision after fix types in other method */
    public void inject2(Handler.Callback callback) throws Throwable {
    }
}
