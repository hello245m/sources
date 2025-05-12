package com.tencent.rmonitor.base.plugin.listener;

import com.tencent.rmonitor.base.meta.DBMeta;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public interface IDBTracerListener extends IBaseListener {
    void onDBInfoPublish(List<DBMeta> list);
}
