package com.vivo.push;

import android.content.Context;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class PushClient {
    public static final String DEFAULT_REQUEST_ID = "1";
    private static volatile PushClient sPushClient;

    private PushClient(Context context) {
    }

    private void checkParam(String str) {
    }

    public static synchronized PushClient getInstance(Context context) {
    }

    public void bindAlias(String str, IPushActionListener iPushActionListener) {
    }

    public void checkManifest() {
    }

    public void delTopic(String str, IPushActionListener iPushActionListener) {
    }

    public String getAlias() {
    }

    public String getRegId() {
    }

    public List<String> getTopics() {
    }

    public String getVersion() {
    }

    public void initialize() {
    }

    public boolean isSupport() {
    }

    public void setSystemModel(boolean z) {
    }

    public void setTopic(String str, IPushActionListener iPushActionListener) {
    }

    public void turnOffPush(IPushActionListener iPushActionListener) {
    }

    public void turnOnPush(IPushActionListener iPushActionListener) {
    }

    public void unBindAlias(String str, IPushActionListener iPushActionListener) {
    }
}
