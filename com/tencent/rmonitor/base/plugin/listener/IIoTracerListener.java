package com.tencent.rmonitor.base.plugin.listener;

import com.tencent.rmonitor.base.meta.CloseableLeakMeta;
import com.tencent.rmonitor.base.meta.IOMeta;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public interface IIoTracerListener extends IBaseListener {
    void onCloseableLeakPublish(CloseableLeakMeta closeableLeakMeta);

    void onIOInfoPublish(List<IOMeta> list);

    void onIOStart(int i2, String str, long j2);

    void onIOStop(int i2, String str, long j2, IOMeta iOMeta);
}
