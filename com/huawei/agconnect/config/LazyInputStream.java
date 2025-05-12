package com.huawei.agconnect.config;

import android.content.Context;
import java.io.InputStream;

@Deprecated
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class LazyInputStream {
    private final Context mContext;
    private InputStream mInput;

    public LazyInputStream(Context context) {
    }

    public final void close() {
    }

    public abstract InputStream get(Context context);

    public InputStream loadInputStream() {
    }
}
