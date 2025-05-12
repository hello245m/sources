package com.tencent.rfix.loader.engine;

import com.tencent.rfix.loader.entity.RFixLoadResult;
import java.io.File;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public interface IPatchLoader {
    boolean cleanPatch(File file);

    String getPatchType();

    boolean loadPatch(RFixLoadResult rFixLoadResult);
}
