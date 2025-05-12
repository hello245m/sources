package com.tencent.raft.measure.report;

import java.io.Closeable;
import org.json.JSONArray;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class ATTAReporter {
    public static final String ATTA_TYPE = "Atta-Type";
    private static final String AT_URL = "https://h.trace.qq.com/kv";
    public static final String BATCH_REPORT = "batch-report";
    private static final String KEY_ATTA_ID = "attaid";
    public static final String KEY_CONTENT_LENGTH = "Content-Length";
    public static final String KEY_CONTENT_TYPE = "Content-Type";
    private static final String KEY_DATA = "datas";
    private static final String KEY_TOKEN = "token";
    private static final String KEY_TYPE = "type";
    private static final String KEY_VERSION = "version";
    private static final String METHOD_POST = "POST";
    private static final String TAG = "ATTAReporter";
    public static final int TIMEOUT = 300000;
    private static final String VAL_BATCH = "batch";
    public static final String VAL_TEXT_PLAIN_CHARSET_UTF_8 = "text/plain;charset=UTF-8";
    private static final String VAL_VERSION_DEFAULT = "v1.0.0";
    private final String attaId;
    private final String token;

    public ATTAReporter(String str, String str2) {
    }

    private void closeQuietly(Closeable closeable) {
    }

    private void doPost(String str, String str2) {
    }

    public final void doPostBatchReport(JSONArray jSONArray) {
    }
}
