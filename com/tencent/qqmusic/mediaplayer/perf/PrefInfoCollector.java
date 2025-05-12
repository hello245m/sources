package com.tencent.qqmusic.mediaplayer.perf;

import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.qqmusic.mediaplayer.AudioInformation;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class PrefInfoCollector implements PlayerInfoCollector {
    private static final String ENCODING_UTF_8 = "utf-8";
    private static final String FILE_NAME = "pref_infos.xml";
    private static final String NAMESPACE = null;
    private static final String ROOT = "root";
    private static final String TAG = "PrefInfoCollector";
    private static PrefInfoCollector instance;
    private HandlerThread mHandlerThread;
    private Handler mReportHandler;
    private FileOutputStream outputStream;
    private HashMap<String, Long> prefInfos;
    private String reportFilePath;
    private XmlSerializer xmlSerializer;

    /* renamed from: com.tencent.qqmusic.mediaplayer.perf.PrefInfoCollector$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass1 implements Comparator<Map.Entry<String, Long>> {
        public final /* synthetic */ PrefInfoCollector this$0;

        public AnonymousClass1(PrefInfoCollector prefInfoCollector) {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Map.Entry<String, Long> entry, Map.Entry<String, Long> entry2) {
        }

        /* renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(Map.Entry<String, Long> entry, Map.Entry<String, Long> entry2) {
        }
    }

    /* renamed from: com.tencent.qqmusic.mediaplayer.perf.PrefInfoCollector$2, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass2 implements Runnable {
        public final /* synthetic */ PrefInfoCollector this$0;
        public final /* synthetic */ AudioInformation val$audioInformation;

        public AnonymousClass2(PrefInfoCollector prefInfoCollector, AudioInformation audioInformation) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    private PrefInfoCollector() {
    }

    public static /* synthetic */ void access$000(PrefInfoCollector prefInfoCollector) {
    }

    public static /* synthetic */ void access$100(PrefInfoCollector prefInfoCollector, AudioInformation audioInformation) throws IOException {
    }

    public static /* synthetic */ void access$200(PrefInfoCollector prefInfoCollector) throws IOException {
    }

    public static /* synthetic */ String access$300() {
    }

    private void createOutputs() {
    }

    public static synchronized PrefInfoCollector getInstance() {
    }

    private void printPrefInfos(AudioInformation audioInformation) throws IOException {
    }

    private void printProperty(String str, String str2) throws IOException {
    }

    private void upLoadByCommonPost() throws IOException {
    }

    public void printAudioInfomation(AudioInformation audioInformation) throws IOException {
    }

    @Override // com.tencent.qqmusic.mediaplayer.perf.PlayerInfoCollector
    public void putBoolean(String str, boolean z) {
    }

    @Override // com.tencent.qqmusic.mediaplayer.perf.PlayerInfoCollector
    public void putInt(String str, int i2) {
    }

    @Override // com.tencent.qqmusic.mediaplayer.perf.PlayerInfoCollector
    public void putLong(String str, long j2) {
    }

    @Override // com.tencent.qqmusic.mediaplayer.perf.PlayerInfoCollector
    public void putString(String str, String str2) {
    }

    @Override // com.tencent.qqmusic.mediaplayer.perf.PlayerInfoCollector
    public void putUri(String str, Uri uri) {
    }

    public void upLoadPrefInfos(AudioInformation audioInformation) {
    }
}
