package com.tencent.mars.cdn;

import java.security.cert.X509Certificate;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class AndroidCertVerifyResult {
    private final List<X509Certificate> mCertificateChain;
    private final boolean mIsIssuedByHostMatched;
    private final boolean mIsIssuedByKnownRoot;
    private final int mStatus;

    public AndroidCertVerifyResult(int i2, boolean z, List<X509Certificate> list) {
    }

    public byte[][] getCertificateChainEncoded() {
    }

    public int getStatus() {
    }

    public boolean isIssuedByHostMatched() {
    }

    public boolean isIssuedByKnownRoot() {
    }

    public AndroidCertVerifyResult(int i2, boolean z, List<X509Certificate> list, boolean z2) {
    }

    public AndroidCertVerifyResult(int i2) {
    }
}
