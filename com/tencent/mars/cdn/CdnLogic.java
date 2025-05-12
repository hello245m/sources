package com.tencent.mars.cdn;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.mars.cdn.CronetLogic;
import java.util.ArrayList;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class CdnLogic {
    public static final int HIT_FILEID = 1;
    public static final int HIT_UPLOADCHECKMD5 = 2;
    public static final int HIT_UPLOADWITHMD5 = 3;
    public static final int ImageFormat_HEVC = 2;
    public static final int ImageFormat_JPEG = 1;
    public static final int MediaTypeAppImage = 20301;
    public static final int MediaTypeFriendsADImageThumb = 20204;
    public static final int MediaTypeFriendsImageThumb = 20205;
    public static final int MediaTypeFriendsVideoThumbImage = 20250;
    public static final int MediaType_F2F_VOICE_RESOURCE = 101;
    public static final int MediaType_FAVORITE_FILE = 10001;
    public static final int MediaType_FAVORITE_VIDEO = 10002;
    public static final int MediaType_FILE = 5;
    public static final int MediaType_FRIENDS = 20201;
    public static final int MediaType_FRIENDS_Video = 20202;
    public static final int MediaType_FULLSIZEIMAGE = 1;
    public static final int MediaType_GlanceVideo = 90;
    public static final int MediaType_IMAGE = 2;
    public static final int MediaType_SnsAdLangdingPageVideo = 100;
    public static final int MediaType_THUMBIMAGE = 3;
    public static final int MediaType_TinyVideo = 6;
    public static final int MediaType_VIDEO = 4;
    public static final int MediaType_WIMDownload = 19;
    public static final int NO_ERROR = 0;
    public static final int NO_HITCACHE = 0;
    public static final int PreloadMode = 2;
    public static final int StorageMode = 0;
    private static final String TAG = "mars.CdnLogic";
    public static final int VideoFormat_Unknown = 0;
    public static final int VideoFormat_X264 = 1;
    public static final int VideoFormat_X265 = 2;
    public static final int VideoPlayMode = 1;
    public static final String defaultApprovedVideoHosts = "vweixinf.tc.qq.com,szwbwxsns.video.qq.com,szxzwxsns.video.qq.com,szzjwxsns.video.qq.com,shwbwxsns.video.qq.com,shxzwxsns.video.qq.com,shzjwxsns.video.qq.com,wxsnsdy.wxs.qq.com,vweixinthumb.tc.qq.com,wxsnsdythumb.wxs.qq.com,wxappthumb.tc.qq.com,wxapp.tc.qq.com";
    public static final int kAppTypeAdImage = 109;
    public static final int kAppTypeAdVideo = 105;
    public static final int kAppTypeAny = 0;
    public static final int kAppTypeC2C = 1;
    public static final int kAppTypeC2CGroupChat = 2;
    public static final int kAppTypeEmoji = 110;
    public static final int kAppTypeFavorite = 10;
    public static final int kAppTypeFinderVideo = 251;
    public static final int kAppTypeHDVideo = 205;
    public static final int kAppTypeHwPage = 200;
    public static final int kAppTypeMultiJpeg = 101;
    public static final int kAppTypeMultiVCodec = 108;
    public static final int kAppTypeMultiWebp = 104;
    public static final int kAppTypeNearEvent = 201;
    public static final int kAppTypeSelfieEmoji = 111;
    public static final int kAppTypeShop = 200;
    public static final int kAppTypeSingleJpeg = 100;
    public static final int kAppTypeSingleVCodec = 107;
    public static final int kAppTypeSingleWebp = 103;
    public static final int kAppTypeUnknown = -1;
    public static final int kAppTypeVideo = 102;
    public static final int kAppTypeVideoThumb = 150;
    public static final int kAppTypeYunStorage = 202;
    public static final int kBizAny = 0;
    public static final int kBizApp = 4;
    public static final int kBizC2C = 1;
    public static final int kBizDC = 5;
    public static final int kBizFavorite = 2;
    public static final int kBizGeneric = 65535;
    public static final int kBizSns = 3;
    public static final int kBizUnknown = -1;
    public static final int kErrSafeProtoNoAeskey = -21111;
    public static final int kErrUploadHevcIllegal = -5103237;
    public static final int kIpSource_NewDNS = 1;
    public static final int kIpSource_None = 0;
    public static final int kIpSource_SysDNS = 2;
    public static final int kMediaGamePacket = 30002;
    public static final int kMediaLittleAppPacket = 30001;
    public static final int kMediaTypeAdImage = 20204;
    public static final int kMediaTypeAdVideo = 20210;
    public static final int kMediaTypeAny = 0;
    public static final int kMediaTypeAppFile = 20303;
    public static final int kMediaTypeAppImageStorage = 20304;
    public static final int kMediaTypeAppVideo = 20302;
    public static final int kMediaTypeBackupFile = 20001;
    public static final int kMediaTypeBeatificFile = 10011;
    public static final int kMediaTypeBigFile = 7;
    public static final int kMediaTypeEmojiGIF = 20402;
    public static final int kMediaTypeEmojiNormal = 20401;
    public static final int kMediaTypeEmojiWXAM = 20403;
    public static final int kMediaTypeExposeImage = 11000;
    public static final int kMediaTypeFavoriteBigFile = 10007;
    public static final int kMediaTypeFavoriteFile = 10001;
    public static final int kMediaTypeFavoriteVideo = 10002;
    public static final int kMediaTypeFile = 5;
    public static final int kMediaTypeFriends = 20201;
    public static final int kMediaTypeFriendsVideo = 20202;
    public static final int kMediaTypeFriendsVideoThumbImage = 20250;
    public static final int kMediaTypeFullSizeImage = 1;
    public static final int kMediaTypeHWDevice = 20322;
    public static final int kMediaTypeHWDeviceFile = 20303;
    public static final int kMediaTypeImage = 2;
    public static final int kMediaTypeNearEvent = 20310;
    public static final int kMediaTypeShop = 20301;
    public static final int kMediaTypeSmartHwPage = 20321;
    public static final int kMediaTypeStoryAudio = 40001;
    public static final int kMediaTypeThumbImage = 3;
    public static final int kMediaTypeTinyVideo = 6;
    public static final int kMediaTypeVideo = 4;
    public static final int kMultiImageDownload = 2;
    public static final int kNetTypeDisconnected = -1;
    public static final int kNetTypeMobile = 2;
    public static final int kNetTypeOther = 3;
    public static final int kNetTypeWifi = 1;
    public static final int kSingleImageDownload = 1;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface AppCallback {
        void onBadNetworkProbed();

        void reportFlow(int i2, int i3, int i4, int i5);

        void requestGetCDN(int i2);

        String[] resolveHost(String str, boolean z, int[] iArr);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class BatchSnsReqImageData {
        public String decryptKey;
        public String fileKey;
        public String imageCachePath;
        public int picIndex;
        public boolean retry;
        public int totalFileSize;
        public String url;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class C2CDownloadRequest {
        public String aeskey;
        public boolean allow_mobile_net_download;
        public String argInfo;
        public String bakup_url;
        public BatchSnsReqImageData[] batchSnsReqImageDatas;
        public String bigfileSignature;
        public int certificateVerifyPolicy;
        public int chatType;
        public int concurrentCount;
        public int connectionCount;
        public String customHeader;
        public String[] dcIpList;
        public int dcIpListSource;
        public String debugIP;
        public int expectImageFormat;
        public String fakeBigfileSignature;
        public String fakeBigfileSignatureAeskey;
        public String feedId;
        public int feedPicCount;
        public String fileKey;
        public int fileSize;
        public int fileType;
        public String fileid;
        public String host;
        public HostIPHint hostIPHint;
        public String httpMethod;
        public boolean isAutoStart;
        public boolean isColdSnsData;
        public boolean isLargeSVideo;
        public boolean isSilentTask;
        public boolean isSmallVideo;
        public boolean isStorageMode;
        public boolean is_resume_task;
        public int limitRate;
        public int marscdnAppType;
        public int marscdnBizType;
        public int maxHttpRedirectCount;
        public String msgExtra;
        public int msgType;
        public String[] ocIpList;
        public int ocIpListSource;
        public long preloadMinSize;
        public int preloadRatio;
        public int queueTimeoutSeconds;
        public CronetLogic.QuicTaskParams quicTaskParams;
        public String referer;
        public String requestVideoFlag;
        public int requestVideoFormat;
        private String savePath;
        public String serialized_verify_headers;
        public String signalQuality;
        public String snsCipherKey;
        public String snsScene;
        private String statePath;
        public long taskStartTime;
        public int transforTimeoutSeconds;
        public String url;
        public boolean useMultithread;
        public boolean useNewdns;
        public String videofileid;
        public int videoflagPolicy;
        public boolean wifiAutoStart;

        public static C2CDownloadRequest createC2C(String str, String str2, int i2, String str3) {
        }

        public static C2CDownloadRequest createC2CVideo(String str, String str2, int i2, String str3) {
        }

        public static C2CDownloadRequest createFavorite(String str, String str2, int i2, String str3) {
        }

        public static C2CDownloadRequest createHttp(String str, String str2) {
        }

        public static C2CDownloadRequest createHttpVideo(String str, String str2) {
        }

        public static C2CDownloadRequest createSNS(String str, int i2, String str2) {
        }

        public C2CDownloadRequest allow_mobile_net_download(boolean z) {
        }

        public C2CDownloadRequest argInfo(String str) {
        }

        public C2CDownloadRequest bakup_url(String str) {
        }

        public C2CDownloadRequest bigfileSignature(String str) {
        }

        public C2CDownloadRequest certificateVerifyPolicy(int i2) {
        }

        public C2CDownloadRequest chatType(int i2) {
        }

        public C2CDownloadRequest concurrentCount(int i2) {
        }

        public C2CDownloadRequest connectionCount(int i2) {
        }

        public C2CDownloadRequest customHeader(String str) {
        }

        public C2CDownloadRequest dcIpList(String[] strArr) {
        }

        public C2CDownloadRequest dcIpListSource(int i2) {
        }

        public C2CDownloadRequest expectImageFormat(int i2) {
        }

        public C2CDownloadRequest fakeBigfileSignature(String str) {
        }

        public C2CDownloadRequest fakeBigfileSignatureAeskey(String str) {
        }

        public C2CDownloadRequest host(String str) {
        }

        public C2CDownloadRequest isAutoStart(boolean z) {
        }

        public C2CDownloadRequest isColdSnsData(boolean z) {
        }

        public C2CDownloadRequest isLargeSVideo(boolean z) {
        }

        public C2CDownloadRequest isSilentTask(boolean z) {
        }

        public C2CDownloadRequest isSmallVideo(boolean z) {
        }

        public C2CDownloadRequest isStorageMode(boolean z) {
        }

        public C2CDownloadRequest is_resume_task(boolean z) {
        }

        public C2CDownloadRequest limitRate(int i2) {
        }

        public C2CDownloadRequest maxHttpRedirectCount(int i2) {
        }

        public C2CDownloadRequest msgExtra(String str) {
        }

        public C2CDownloadRequest ocIpList(String[] strArr) {
        }

        public C2CDownloadRequest ocIpListSource(int i2) {
        }

        public C2CDownloadRequest preloadRatio(int i2) {
        }

        public C2CDownloadRequest queueTimeoutSeconds(int i2) {
        }

        public C2CDownloadRequest referer(String str) {
        }

        public C2CDownloadRequest requestVideoFormat(int i2) {
        }

        public C2CDownloadRequest serialized_verify_headers(String str) {
        }

        public void setSavePath(String str) {
        }

        public void setStatePath(String str) {
        }

        public C2CDownloadRequest signalQuality(String str) {
        }

        public C2CDownloadRequest snsCipherKey(String str) {
        }

        public C2CDownloadRequest snsScene(String str) {
        }

        public C2CDownloadRequest statePath(String str) {
        }

        public C2CDownloadRequest transforTimeoutSeconds(int i2) {
        }

        public C2CDownloadRequest useMultithread(boolean z) {
        }

        public C2CDownloadRequest videofileid(String str) {
        }

        public C2CDownloadRequest wifiAutoStart(boolean z) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class C2CDownloadResult {
        public String argInfo;
        public long availableBytes;
        public int averageConnectCost;
        public int averageRequestCost;
        public int averageRequestSize;
        public int averageSpeed;
        public String batchImageFileKey;
        public BatchSnsReqImageData[] batchImageNeedRetry;
        public String batchPicFeedId;
        public int cSeqCheck;
        public String clientIP;
        public int connectCostTime;
        public CronetTaskResult cronetTaskResult;
        public boolean crossNet;
        public long currentFileSize;
        public int delayTime;
        public int detailErrorCode;
        public int detailErrorType;
        public int dnsCostTime;
        public long enQueueTime;
        public long endTime;
        public int errorCode;
        public long fileSize;
        public int fileType;
        public String fileid;
        public int firstConnectCost;
        public boolean firstRequestCompleted;
        public int firstRequestCost;
        public int firstRequestDownloadSize;
        public int firstRequestSize;
        public boolean fromCronet;
        public String httpResponseHeader;
        public int httpStatusCode;
        public boolean isResume;
        public boolean isSnsImageProtocolAvailable;
        public int lastNetType;
        public int lastSvrPort;
        public boolean moovCompleted;
        public int moovCost;
        public int moovFailReason;
        public int moovRequestTimes;
        public int moovSize;
        public int netConnectTimes;
        public String picCachePath;
        public int picIndex;
        public int previousCompletedSize;
        public String realUsedURL;
        public int receiveCostTime;
        public long recvedBytes;
        public int requestCompletedCount;
        public int requestTimeoutCount;
        public int requestTotalCount;
        public String serverIP;
        public long startTime;
        public int svrFallbackCount;
        public String systemErrorDescribe;
        public long taskStartTime;
        public String traceMsg;
        public String transforMsg;
        public int transportProtocol;
        public int transportProtocolError;
        public long tryWritenBytes;
        public boolean usePrivateProtocol;
        public String[] usedSvrIps;
        public String videoFlag;
        public int videoFormat;
        public int waitResponseCostTime;
        public String xErrorNo;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class C2CUploadRequest {
        public int apptype;
        public String bigfileSignature;
        public int bizscene;
        public int chatType;
        public boolean checkExistOnly;
        public int connectionCount;
        public String customHeader;
        public String debugIP;
        public String emojiExtinfo;
        public boolean enableHitCheck;
        public String fakeBigfileSignature;
        public String fakeBigfileSignatureAeskey;
        public byte[] fileBuffer;
        public String fileKey;
        private String filePath;
        public int fileSize;
        public int fileType;
        public String filemd5;
        public boolean forceNoSafeCdn;
        public String forwardAeskey;
        public String forwardFileid;
        public String host;
        public int isLargeSVideo;
        public boolean isSmallVideo;
        public boolean isSnsAdVideo;
        public boolean isStorageMode;
        public boolean isStreamMedia;
        public int lastError;
        public int marscdnBizType;
        public int midfileSize;
        public String midimgPath;
        public boolean needCompressImage;
        public boolean onlyCheckExist;
        public int queueTimeoutSeconds;
        public boolean sendmsgFromCDN;
        public int snsVersion;
        public String statePath;
        private String thumbfilePath;
        public byte[] thumbnailBuffer;
        public String toUser;
        public int transforTimeoutSeconds;
        public boolean trySafeCdn;
        public boolean useMultithread;
        public int videoSource;

        public void setFilePath(String str) {
        }

        public void setMidimgPath(String str) {
        }

        public void setThumbfilePath(String str) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class C2CUploadResult {
        public String aeskey;
        public String clientIP;
        public int connectCostTime;
        public boolean crossNet;
        public int delayTime;
        public int detailErrorCode;
        public int detailErrorType;
        public String emojiMD5;
        public int errorCode;
        public boolean existOnSvr;
        public int fileCrc32;
        public int fileSize;
        public String fileUrl;
        public String fileid;
        public String filemd5;
        public int filetype;
        public int hitCache;
        public boolean isResume;
        public boolean isVideoReduced;
        public int midfileSize;
        public String mp4identifymd5;
        public int receiveCostTime;
        public boolean sendmsgFromCDN;
        public String serverIP;
        public byte[] skeyrespbuf;
        public String systemErrorDescribe;
        public int thumbfileSize;
        public String thumbfileUrl;
        public String thumbfilemd5;
        public String touser;
        public String transforMsg;
        public int transportProtocol;
        public int transportProtocolError;
        public boolean uploadBySafecdn;
        public String[] usedSvrIps;
        public String videofileid;
        public int waitResponseCostTime;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class CdnInfo {
        public byte[] authkey;
        public int frontid;
        public String frontip1;
        public String frontip2;
        public int[] frontports;
        public int nettype;
        public int uin;
        public int ver;
        public int zoneid;
        public String zoneip1;
        public String zoneip2;
        public int[] zoneports;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class CdnInfoParams {
        public int c2CretryIntervalMs;
        public int c2CrwtimeoutMs;
        public int c2CshowErrorDelayMs;
        public int snsretryIntervalMs;
        public int snsrwtimeoutMs;
        public int snsshowErrorDelayMs;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class CdnTaskStateInfo {
        public static final int kCompleted = 104;
        public static final int kNotExits = 103;
        public static final int kPausing = 102;
        public static final int kRunning = 100;
        public static final int kWaiting = 101;
        public long completeSize;
        public long fileTotalSize;
        public int taskState;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class CertVerifyResult {
        public byte[][] certificateChain;
        public boolean isIssuedByKnownRoot;
        public int status;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class CertificateVerifyPolicy {
        public static final int kIngoreError = 2;
        public static final int kNoVerify = 0;
        public static final int kStrictVerify = 1;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class Config {
        public int AckSlice;
        public String ApprovedVideoHosts;
        public int C2COverloadDelaySeconds;
        public int EnableCDNVerifyConnect;
        public int EnableCDNVideoRedirectOC;
        public int EnableSafeCDN;
        public int EnableSnsImageDownload;
        public int EnableSnsStreamDownload;
        public int EnableSnsVideoRedirect;
        public int EnableStreamUploadVideo;
        public String MiscellaneousExptValues;
        public int MobileEtl;
        public int Ptl;
        public String QuicExptValues;
        public int SNSOverloadDelaySeconds;
        public int UseDynamicETL;
        public int UseStreamCDN;
        public int WifiEtl;

        public String toString() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class CronetTaskResult {
        public WebPageProfile performance;
        public int statusCode;
        public String statusText;
        public boolean useHttp2;
        public boolean useQuic;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface DownloadCallback {
        void onC2CDownloadCompleted(String str, C2CDownloadResult c2CDownloadResult);

        void onDownloadProgressChanged(String str, long j2, long j3, boolean z);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class GetCdnScene {
        public static final int GET_CDN_AUTH = 1;
        public static final int GET_CDN_CHECK = 4;
        public static final int GET_CDN_DEFAULT = 0;
        public static final int GET_CDN_IGNORE_FETCH_RETRY = 6;
        public static final int GET_CDN_MARS_CACHE_EXPIRED = 9;
        public static final int GET_CDN_MARS_SVR_REQUEST = 8;
        public static final int GET_CDN_MARS_TIMING_FETCH = 7;
        public static final int GET_CDN_NETWORK_CHANGE = 2;
        public static final int GET_CDN_NETWORK_CHANGE_RETRY = 3;
        public static final int GET_CDN_TEST = 5;
        public static final int GET_CDN_USER_ATTRIBUTE_CHANGED = 10;
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
    public interface SessionCallback {
        byte[] decodeSessionResponseBuf(String str, byte[] bArr);

        byte[] getSessionRequestBuf(String str, byte[] bArr);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class SnsUploadVersion {
        public static final int kVersion100M = 1;
        public static final int kVersion30M = 0;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class SpeedType {
        public static final int stDownload = 2;
        public static final int stUpload = 1;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class TransportProtocol {
        public static final int HTTP = 1;
        public static final int HTTP3 = 4;
        public static final int HTTPS = 2;
        public static final int QUIC = 3;
        public static final int TCP = 0;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface UploadCallback {
        void onC2CUploadCompleted(String str, C2CUploadResult c2CUploadResult);

        void onUploadProgressChanged(String str, long j2, long j3);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class VideoFlagPolicy {
        public static final int kVideoFlagAuto = 0;
        public static final int kVideoFlagMustMatch = 1;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface VideoStreamingCallback {
        void onDataAvailable(String str, long j2, long j3);

        void onDownloadToEnd(String str, long j2, long j3);

        void onMoovReadyWithFlag(String str, long j2, long j3, String str2);

        void onPreloadCompletedWithResult(String str, long j2, long j3, C2CDownloadResult c2CDownloadResult);
    }

    public static void InitSavePath(String str, AppCallback appCallback) {
    }

    public static void Initialize(String str, AppCallback appCallback, String str2, String str3, String str4, String str5) {
    }

    public static void UnInitialize() {
    }

    public static native boolean allowBatchImageDownload();

    public static native int calcFileCrc32(String str);

    public static native String calcFileMD5(String str);

    public static native String calcMP4IdentifyMD5(String str);

    public static native int cancelDownloadTaskWithResult(String str, C2CDownloadResult c2CDownloadResult);

    public static native void cancelTask(String str);

    public static native int cancelUploadTaskWithResult(String str, C2CUploadResult c2CUploadResult);

    public static native String createAeskey();

    public static native String createUniqueFilekey(String str, String str2);

    public static CertVerifyResult doCertificateVerifyWithDetail(String str, byte[][] bArr) {
    }

    private static native ArrayList<String> getLoadLibraries();

    public static native int getRecentAverageSpeed(int i2);

    public static native boolean getSnsImagePrivateProtocolAvalible();

    public static String getSystemProperty(String str) {
    }

    public static int getUSBState() {
    }

    public static native CdnTaskStateInfo httpMultiSocketDownloadTaskState(String str);

    public static int isFileReady(String str) {
    }

    public static native boolean isVideoDataAvailable(String str, long j2, long j3);

    private static native void onCreate(String str);

    public static native int pauseHttpMultiSocketDownloadTask(String str);

    public static native int queryContinuousSize(String str, long j2, long[] jArr);

    public static native int queryDownloadedSize(String str, long[] jArr);

    public static native long queryFilesizeLimit(int i2, int i3);

    public static long queryFreeSpace(String str) {
    }

    public static native boolean queryVideoMoovInfo(C2CDownloadRequest c2CDownloadRequest, long[] jArr);

    public static native int requestVideoData(String str, long j2, long j3, int i2);

    public static native int resumeHttpMultiSocketDownloadTask(String str);

    private static native void setAppCallback(AppCallback appCallback);

    public static native void setCdnInfo(byte[] bArr, byte[] bArr2);

    public static native void setCdnInfoParams(CdnInfoParams cdnInfoParams, CdnInfoParams cdnInfoParams2, int i2);

    public static native void setConfig(Config config);

    public static native void setDebugIP(String str);

    public static native void setFlowLimitPerHour(int i2);

    public static native void setLegacyCdnInfo(CdnInfo cdnInfo, CdnInfo cdnInfo2, CdnInfo cdnInfo3, CdnInfo cdnInfo4, byte[] bArr, byte[] bArr2);

    private static native void setRSAPublicKeyParams(String str, String str2, String str3);

    public static native void setSnsImagePrivateProtocolAvalible(boolean z);

    public static native void setSnsImageStreamProtocolAvalible(boolean z);

    private static native void setToUserCiper(String str);

    public static native void setUseIPv6Cdn(boolean z);

    public static native int startC2CDownload(C2CDownloadRequest c2CDownloadRequest, DownloadCallback downloadCallback);

    public static native int startC2CUpload(C2CUploadRequest c2CUploadRequest, UploadCallback uploadCallback);

    public static native int startCronetFileDownload(C2CDownloadRequest c2CDownloadRequest, DownloadCallback downloadCallback);

    public static native int startCronetSimpleRequest(C2CDownloadRequest c2CDownloadRequest, DownloadCallback downloadCallback);

    public static native int startFtnUpload(C2CUploadRequest c2CUploadRequest, UploadCallback uploadCallback);

    public static native int startHttpMultiSocketDownloadTask(C2CDownloadRequest c2CDownloadRequest, DownloadCallback downloadCallback);

    public static native int startHttpVideoStreamingDownload(C2CDownloadRequest c2CDownloadRequest, VideoStreamingCallback videoStreamingCallback, DownloadCallback downloadCallback, int i2);

    public static native int startHttpsDownload(C2CDownloadRequest c2CDownloadRequest, DownloadCallback downloadCallback);

    public static native int startSNSDownload(C2CDownloadRequest c2CDownloadRequest, VideoStreamingCallback videoStreamingCallback, DownloadCallback downloadCallback, int i2);

    public static native int startSSUpload(C2CUploadRequest c2CUploadRequest, SessionCallback sessionCallback, UploadCallback uploadCallback);

    public static native int startURLDownload(C2CDownloadRequest c2CDownloadRequest, DownloadCallback downloadCallback);

    public static native int startVideoStreamingDownload(C2CDownloadRequest c2CDownloadRequest, VideoStreamingCallback videoStreamingCallback, DownloadCallback downloadCallback, int i2);

    public static native boolean taskExist(String str);

    public static native void triggerPreConnect(String str, String[] strArr, boolean z);

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class WebPageProfile implements Parcelable {
        public static final Parcelable.Creator<WebPageProfile> CREATOR = null;
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

        /* renamed from: com.tencent.mars.cdn.CdnLogic$WebPageProfile$1, reason: invalid class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class AnonymousClass1 implements Parcelable.Creator<WebPageProfile> {
            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ WebPageProfile createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ WebPageProfile[] newArray(int i2) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public WebPageProfile createFromParcel(Parcel parcel) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public WebPageProfile[] newArray(int i2) {
            }
        }

        public WebPageProfile() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
        }

        public String toString() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
        }

        public WebPageProfile(Parcel parcel) {
        }
    }
}
