package com.tencent.wcdb.database;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class SQLiteCipherSpec {
    public static final int HMAC_DEFAULT = -1;
    public static final int HMAC_SHA1 = 0;
    public static final int HMAC_SHA256 = 1;
    public static final int HMAC_SHA512 = 2;
    public int hmacAlgorithm;
    public boolean hmacEnabled;
    public int kdfAlgorithm;
    public int kdfIteration;
    public int pageSize;

    public SQLiteCipherSpec() {
    }

    public SQLiteCipherSpec setHmacAlgorithm(int i2) {
    }

    public SQLiteCipherSpec setKDFIteration(int i2) {
    }

    public SQLiteCipherSpec setKdfAlgorithm(int i2) {
    }

    public SQLiteCipherSpec setPageSize(int i2) {
    }

    public SQLiteCipherSpec setSQLCipherVersion(int i2) {
    }

    public SQLiteCipherSpec withHMACEnabled(boolean z) {
    }

    public SQLiteCipherSpec(SQLiteCipherSpec sQLiteCipherSpec) {
    }
}
