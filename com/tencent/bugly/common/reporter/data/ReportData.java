package com.tencent.bugly.common.reporter.data;

import java.util.ArrayList;
import n.d;
import n.d0.c.l;
import n.d0.d.h;
import n.d0.d.o;
import n.i0.i;
import org.json.JSONObject;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class ReportData extends BaseJsonObject {
    public static final /* synthetic */ i[] $$delegatedProperties = null;
    private int dbId;
    private String eventName;
    private final ArrayList<FileInfo> fileList;
    private final d md5Salt$delegate;
    private JSONObject params;
    private final d paramsMD5$delegate;
    private final ReportStrategy reportStrategy;
    private int reportType;
    private String uin;
    private String uploadFilePath;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class a extends o implements n.d0.c.a<String> {
        public static final a a = null;

        public final String b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ String invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class b extends o implements n.d0.c.a<String> {
        public final /* synthetic */ ReportData a;

        public b(ReportData reportData) {
        }

        public final String b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ String invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class c extends o implements l<FileInfo, String> {
        public static final c a = null;

        public final String b(FileInfo fileInfo) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ String invoke(FileInfo fileInfo) {
        }
    }

    public ReportData() {
    }

    public /* synthetic */ ReportData(String str, int i2, String str2, JSONObject jSONObject, int i3, h hVar) {
    }

    public static /* synthetic */ ReportData copy$default(ReportData reportData, String str, int i2, String str2, JSONObject jSONObject, int i3, Object obj) {
    }

    private final String zipUploadFile() {
    }

    public final void addFile(String str, boolean z, boolean z2) throws IllegalStateException {
    }

    public final void checkAndDelFiles(boolean z) {
    }

    public final String component1() {
    }

    public final int component2() {
    }

    public final String component3() {
    }

    public final JSONObject component4() {
    }

    public final ReportData copy(String str, int i2, String str2, JSONObject jSONObject) {
    }

    public boolean equals(Object obj) {
    }

    public final boolean fromCache() {
    }

    public final int getDbId() {
    }

    public final String getEventName() {
    }

    public final String getMd5Salt() {
    }

    public final JSONObject getParams() {
    }

    public final String getParamsMD5() {
    }

    public final int getPlugin() {
    }

    public final ReportStrategy getReportStrategy() {
    }

    public final int getReportType() {
    }

    public final String getUin() {
    }

    public final String getUploadFilePath() {
    }

    public int hashCode() {
    }

    public final void setDbId(int i2) {
    }

    public final void setEventName(String str) {
    }

    public final void setParams(JSONObject jSONObject) {
    }

    public final void setReportType(int i2) {
    }

    public final void setUin(String str) {
    }

    public String toString() {
    }

    public ReportData(String str, int i2, String str2, JSONObject jSONObject) {
    }
}
