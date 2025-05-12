package com.huawei.hms.common.data;

import android.os.Bundle;
import com.huawei.hms.support.api.client.Result;
import java.util.Iterator;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class AbstractDataBuffer<T> extends Result implements DataBuffer<T> {
    public final DataHolder mDataHolder;

    public AbstractDataBuffer(DataHolder dataHolder) {
    }

    @Override // com.huawei.hms.common.data.DataBuffer
    @Deprecated
    public final void close() {
    }

    @Override // com.huawei.hms.common.data.DataBuffer
    public abstract T get(int i2);

    @Override // com.huawei.hms.common.data.DataBuffer
    public int getCount() {
    }

    @Override // com.huawei.hms.common.data.DataBuffer
    public Bundle getMetadata() {
    }

    @Override // com.huawei.hms.common.data.DataBuffer
    @Deprecated
    public boolean isClosed() {
    }

    @Override // com.huawei.hms.common.data.DataBuffer, java.lang.Iterable
    public Iterator<T> iterator() {
    }

    @Override // com.huawei.hms.common.data.DataBuffer, com.huawei.hms.common.api.Releasable
    public void release() {
    }

    @Override // com.huawei.hms.common.data.DataBuffer
    public Iterator<T> singleRefIterator() {
    }
}
