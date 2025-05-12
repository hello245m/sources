package com.tencent.rfix.loader.engine;

import com.tencent.rfix.loader.entity.RFixLoadResult;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public interface IPatchLoadEngine {
    IPatchLoader getLoader(String str);

    boolean registerLoader(IPatchLoader iPatchLoader);

    RFixLoadResult tryLoadPatch();
}
