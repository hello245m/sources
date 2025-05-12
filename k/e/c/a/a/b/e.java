package k.e.c.a.a.b;

import java.io.InputStream;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.X509TrustManager;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class e implements X509TrustManager {
    public static final String b = null;
    public List<X509TrustManager> a;

    public e(InputStream inputStream, String str) throws IllegalArgumentException {
    }

    public final void a(InputStream inputStream, String str) {
    }

    public void b(X509Certificate[] x509CertificateArr) {
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
    }
}
