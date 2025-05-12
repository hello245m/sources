package kotlinx.coroutines.android;

import androidx.annotation.Keep;
import java.lang.reflect.Method;
import kotlinx.coroutines.CoroutineExceptionHandler;
import n.a0.a;
import n.a0.g;

@Keep
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
public final class AndroidExceptionPreHandler extends a implements CoroutineExceptionHandler {
    private volatile Object _preHandler;

    private final Method preHandler() {
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(g gVar, Throwable th) {
    }
}
