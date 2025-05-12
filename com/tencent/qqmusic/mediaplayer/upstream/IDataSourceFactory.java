package com.tencent.qqmusic.mediaplayer.upstream;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public interface IDataSourceFactory {
    IDataSource createDataSource() throws DataSourceException;

    INativeDataSource createNativeDataSource() throws DataSourceException;
}
