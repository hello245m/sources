package kotlinx.coroutines.internal;

import java.util.List;
import o.a.r2;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
public interface MainDispatcherFactory {
    r2 createDispatcher(List<? extends MainDispatcherFactory> list);

    int getLoadPriority();

    String hintOnError();
}
