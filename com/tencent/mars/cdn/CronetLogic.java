package com.tencent.mars.cdn;

import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class CronetLogic {
    private static List<CronetTaskNetworkStateCallback> cronetTaskNetworkStateCallbackList = null;
    private static boolean useHttpdns = false;

    /* renamed from: com.tencent.mars.cdn.CronetLogic$1callback, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class C1callback implements CronetTaskCallback {
        private boolean logData;

        public C1callback(boolean z) {
        }

        @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
        public void onCronetReceiveChunkedData(ChunkedData chunkedData, long j2) {
        }

        @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
        public int onCronetReceiveHeader(ResponseHeader responseHeader, int i2, String str) {
        }

        @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
        public void onCronetReceiveUploadProgress(long j2, long j3) {
        }

        @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
        public void onCronetTaskCompleted(String str, CronetTaskResult cronetTaskResult, String str2) {
        }

        @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
        public void onDownloadProgressChanged(String str, CronetDownloadProgress cronetDownloadProgress) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class CertVerifyResult {
        public byte[][] certificateChain;
        public boolean isIssuedByKnownRoot;
        public int status;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class ChunkedData {
        public byte[] data;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class CronetDownloadProgress {
        public long currentWriteByte;
        public long totalByte;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class CronetHttpsCreateResult {
        public int createRet;
        public String taskId;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class CronetRequestParams {
        public boolean bindMobileNetwork;
        public byte[] bodyData;
        public boolean cachePerformance;
        public DefaultHttpTaskParams defaultHttpTaskParams;
        public boolean followRedirect;
        public boolean forbidSocketReuse;
        public String header;
        public HeaderMap[] headers;
        public HostIPHint hostIPHint;
        public int maxRedirectCount;
        public String method;
        public boolean miniPrograms;
        public boolean needGenerateId;
        public boolean needWirteCache;
        public String savePath;
        public boolean switchMobileNetworkIfNeed;
        public String taskId;
        public int taskType;
        public UploadParams uploadParams;
        public String url;
        public boolean useHttp2;
        public boolean useMemoryCache;
        public boolean useNewdns;
        public boolean useQuic;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public static class CronetTaskType {
            public static final int CUSTOM_FILE_DOWNLOAD = 9;
            public static final int DEFAULT_HTTP_REQUEST = 8;
            public static final int HTTP2_DOWNLOAD = 4;
            public static final int HTTP2_REQUEST = 3;
            public static final int HTTP_CHUNK_REQUEST = 10;
            public static final int HTTP_DOWNLOAD = 2;
            public static final int HTTP_REQUEST = 1;
            public static final int HTTP_UPLOAD = 7;
            public static final int QUIC_DOWNLOAD = 6;
            public static final int QUIC_REQUEST = 5;
        }

        public void makeRequestHeader(Map<String, String> map) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface CronetTaskCallback {
        void onCronetReceiveChunkedData(ChunkedData chunkedData, long j2);

        int onCronetReceiveHeader(ResponseHeader responseHeader, int i2, String str);

        void onCronetReceiveUploadProgress(long j2, long j3);

        void onCronetTaskCompleted(String str, CronetTaskResult cronetTaskResult, String str2);

        void onDownloadProgressChanged(String str, CronetDownloadProgress cronetDownloadProgress);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface CronetTaskNetworkStateCallback {
        void onNetWeakChange(boolean z);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class CronetTaskResult {
        public int cronetErrorCode;
        public byte[] data;
        public int errorCode;
        public String errorMsg;
        public HeaderMap[] headers;
        public String newLocation;
        public String originTaskId;
        public int quicErrorCode;
        public String rawHeader;
        public int statusCode;
        public String statusText;
        public long totalReceiveByte;
        public long totalSendByte;
        public long totalWriteByte;
        public WebPageProfile webPageProfile;

        public String getDataString() {
        }

        public Map<String, String> getHeaderMap() {
        }

        public Map<String, List<String>> getHeaderMapList() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class DefaultHttpTaskParams {
        public int reportId;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class HeaderMap {
        public String key;
        public String value;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class HostIPHint {
        public HostIpMap[] hostMap;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class HostIpMap {
        public String host;
        public String ip;
        public int port;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class QuicForceHost {
        public String host;
        public int port;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class QuicHostMap {
        public String host;
        public String ip;
        public int port;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class QuicTaskParams {
        public QuicForceHost[] quicForceHosts;
        public QuicHostMap[] quicHostMaps;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class ResponseHeader {
        public HeaderMap[] headers;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class UploadParams {
        public byte[] endData;
        public String filePath;
        public byte[] formData;
        public int reportId;
        public long uploadOffset;
        public long uploadRange;
        public boolean vfsPath;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class WebPageProfile {
        public long SSLconnectionEnd;
        public long SSLconnectionStart;
        public long connectEnd;
        public long connectStart;
        public long domainLookUpEnd;
        public long domainLookUpStart;
        public int downstreamThroughputKbpsEstimate;
        public long fetchStart;
        public int httpRttEstimate;
        public int networkTypeEstimate;
        public String peerIP;
        public int port;
        public String protocol;
        public long receivedBytedCount;
        public long redirectEnd;
        public long redirectStart;
        public long requestEnd;
        public long requestStart;
        public long responseEnd;
        public long responseStart;
        public int rtt;
        public long sendBytesCount;
        public boolean socketReused;
        public int statusCode;
        public int throughputKbps;
        public int transportRttEstimate;

        public String toString() {
        }
    }

    public static void addCronetTaskNetworkStateCallback(CronetTaskNetworkStateCallback cronetTaskNetworkStateCallback) {
    }

    public static native void cancelCronetTask(String str);

    public static CertVerifyResult convertToCronetResult(AndroidCertVerifyResult androidCertVerifyResult) {
    }

    public static void cronetActiveMobileNetwork() {
    }

    public static boolean cronetBindMobileSocket(int i2) {
    }

    public static void cronetDebugTest(String str) {
    }

    public static void cronetNativeMobileNetwork() {
    }

    public static Map<String, List<String>> getHeaderList(ResponseHeader responseHeader) {
    }

    public static Map<String, String> getHeaderMap(ResponseHeader responseHeader) {
    }

    public static String getSystemProperty(String str) {
    }

    public static boolean getUseHttpdns() {
    }

    public static native WebPageProfile getWebPagePerformanceWithURL(String str);

    public static void notifyCronetWeaknet(boolean z) {
    }

    public static void removeCronetTaskNetworkStateCallback(CronetTaskNetworkStateCallback cronetTaskNetworkStateCallback) {
    }

    public static native void removeUserCert();

    public static native void setGoodNetNotifyInterval(int i2);

    public static void setUseHttpdns(boolean z) {
    }

    public static native void setUserCertVerify(boolean z);

    public static native CronetHttpsCreateResult startCronetDefaultHttpTask(CronetRequestParams cronetRequestParams, CronetTaskCallback cronetTaskCallback);

    public static native CronetHttpsCreateResult startCronetDownloadTask(CronetRequestParams cronetRequestParams, CronetTaskCallback cronetTaskCallback);

    public static native CronetHttpsCreateResult startCronetHttpTask(CronetRequestParams cronetRequestParams, CronetTaskCallback cronetTaskCallback);

    public static native CronetHttpsCreateResult startCronetUploadTask(CronetRequestParams cronetRequestParams, CronetTaskCallback cronetTaskCallback);

    public static CertVerifyResult verifyCertWithUserCA(byte[][] bArr) {
    }
}
