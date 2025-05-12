package com.huawei.hms.common.data;

import android.os.Bundle;
import com.huawei.hms.common.api.Releasable;
import java.util.Iterator;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public interface DataBuffer<T> extends Releasable, Iterable<T> {
    @Deprecated
    void close();

    T get(int i2);

    int getCount();

    Bundle getMetadata();

    @Deprecated
    boolean isClosed();

    Iterator<T> iterator();

    @Override // com.huawei.hms.common.api.Releasable
    void release();

    Iterator<T> singleRefIterator();
}
