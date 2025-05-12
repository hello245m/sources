package com.tencent.xweb;

import android.os.AsyncTask;
import com.tencent.xweb.downloader.IFileDownloaderProxyCallback;
import com.tencent.xweb.downloader.WXFileDownloaderBridge;
import com.tencent.xweb.updater.UpdateConfig;
import java.io.File;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class XWebDownloader {
    public static final int DOWNLOAD_FAILED = -1;
    public static final int DOWNLOAD_SUCCESS = 0;
    public static final int DOWNLOAD_TYPE_CDN = 2;
    public static final int DOWNLOAD_TYPE_HTTP = 1;
    public static final int ERROR_CODE_DOWNLOADER_TIMEOUT = -100;
    public static final int ERROR_CODE_EXCEPTION = -101;
    public static final int ERROR_CODE_FAILED = -1;
    public static final int ERROR_CODE_SUCCESS = 0;
    public static final int ERROR_TYPE_DOWNLOADER = 1;
    public static final int ERROR_TYPE_NONE = 0;
    public static final int ERROR_TYPE_USER = 2;
    public static final String TAG = "XWebDownloader";
    public static AsyncTask<Void, Integer, Integer> sDownloadTask;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class DownloadInfo {
        public int mBizType;
        public int mDownloadType;
        public int mErrorCode;
        public int mErrorType;
        public long mFileTotalSize;
        public boolean mIsDownloadResume;
        public boolean mIsRuntime;
        public int mNetWorkType;
        public int mRetryTimes;
        public String mSavePath;
        public long mStartTimestamp;
        public String mUrl;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class HttpDownloadTask extends AsyncTask<Void, Integer, Integer> {
        public static final String TAG_TASK = "HttpDownloadTask";
        public static final int UPDATE_INTERVAL_MS = 500;
        public final DownloadInfo mDownloadInfo;
        public final File mDownloadedFile;
        public final XWebDownloadListener mListener;
        public long mProgressUpdateTime;

        public HttpDownloadTask(boolean z, XWebDownloadListener xWebDownloadListener, String str, String str2) {
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Integer doInBackground(Void[] voidArr) {
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onCancelled(Integer num) {
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(Integer num) {
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onProgressUpdate(Integer[] numArr) {
        }

        /* renamed from: doInBackground, reason: avoid collision after fix types in other method */
        public Integer doInBackground2(Void... voidArr) {
        }

        /* renamed from: onCancelled, reason: avoid collision after fix types in other method */
        public void onCancelled2(Integer num) {
        }

        /* renamed from: onPostExecute, reason: avoid collision after fix types in other method */
        public void onPostExecute2(Integer num) {
        }

        /* renamed from: onProgressUpdate, reason: avoid collision after fix types in other method */
        public void onProgressUpdate2(Integer... numArr) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class WXFileDownloaderTask extends AsyncTask<Void, Integer, Integer> implements IFileDownloaderProxyCallback {
        public static final String TAG_TASK = "WXFileDownloaderTask";
        public final Object lockObj;
        public final DownloadInfo mDownloadInfo;
        public final XWebDownloadListener mListener;
        public final WXFileDownloaderBridge mWXFileDownloaderBridge;
        public boolean mWaitTimeout;

        public WXFileDownloaderTask(boolean z, XWebDownloadListener xWebDownloadListener, String str, String str2, int i2) {
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Integer doInBackground(Void[] voidArr) {
        }

        public boolean isValid() {
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onCancelled(Integer num) {
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(Integer num) {
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onProgressUpdate(Integer[] numArr) {
        }

        @Override // com.tencent.xweb.downloader.IFileDownloaderProxyCallback
        public void onTaskFailed(String str, int i2, boolean z) {
        }

        @Override // com.tencent.xweb.downloader.IFileDownloaderProxyCallback
        public void onTaskFinished(String str, String str2, boolean z) {
        }

        @Override // com.tencent.xweb.downloader.IFileDownloaderProxyCallback
        public void onTaskProgressChanged(String str, long j2, long j3) {
        }

        /* renamed from: doInBackground, reason: avoid collision after fix types in other method */
        public Integer doInBackground2(Void... voidArr) {
        }

        /* renamed from: onCancelled, reason: avoid collision after fix types in other method */
        public void onCancelled2(Integer num) {
        }

        /* renamed from: onPostExecute, reason: avoid collision after fix types in other method */
        public void onPostExecute2(Integer num) {
        }

        /* renamed from: onProgressUpdate, reason: avoid collision after fix types in other method */
        public void onProgressUpdate2(Integer... numArr) {
        }
    }

    public static /* synthetic */ void access$000(String str, DownloadInfo downloadInfo, AsyncTask asyncTask) {
    }

    public static /* synthetic */ void access$100(XWebDownloadListener xWebDownloadListener, Integer[] numArr) {
    }

    public static /* synthetic */ void access$200(DownloadInfo downloadInfo, XWebDownloadListener xWebDownloadListener, String str) {
    }

    public static /* synthetic */ void access$300(DownloadInfo downloadInfo, XWebDownloadListener xWebDownloadListener, String str, Integer num) {
    }

    public static boolean isDownloading() {
    }

    public static void startDownload(XWebDownloadListener xWebDownloadListener, UpdateConfig updateConfig) {
    }

    public static void taskOnCancelled(DownloadInfo downloadInfo, XWebDownloadListener xWebDownloadListener, String str) {
    }

    public static void taskOnPostExecute(DownloadInfo downloadInfo, XWebDownloadListener xWebDownloadListener, String str, Integer num) {
    }

    public static void taskOnPreExecute(String str, DownloadInfo downloadInfo, AsyncTask<Void, Integer, Integer> asyncTask) {
    }

    public static void taskOnProgressUpdate(XWebDownloadListener xWebDownloadListener, Integer... numArr) {
    }
}
