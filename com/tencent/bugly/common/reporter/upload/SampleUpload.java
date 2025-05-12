package com.tencent.bugly.common.reporter.upload;

import java.net.URL;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class SampleUpload extends QAPMUpload {
    private static final String TAG = "CrashReport";
    private JSONObject mRequestJson;
    private JSONObject mResponseJson;

    public SampleUpload(URL url, JSONObject jSONObject) {
    }

    private void buildHeader(HashMap<String, String> hashMap) {
    }

    public JSONObject getResponseJson() {
    }

    @Override // com.tencent.bugly.common.reporter.upload.BaseUpload
    public void request() {
    }
}
