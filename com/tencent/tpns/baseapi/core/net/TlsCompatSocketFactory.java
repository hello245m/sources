package com.tencent.tpns.baseapi.core.net;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class TlsCompatSocketFactory extends SSLSocketFactory {
    private static final String TAG = "TlsCompatSocketFactory";
    private static final String[] TLS_VERSION_LIST_FOR_API_LEVEL_UNDER_20 = null;
    public final SSLSocketFactory target;

    public TlsCompatSocketFactory(SSLSocketFactory sSLSocketFactory) {
    }

    private Socket supportTLS(Socket socket) {
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i2, boolean z) {
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i2) {
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i2, InetAddress inetAddress, int i3) {
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i2) {
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i2, InetAddress inetAddress2, int i3) {
    }
}
