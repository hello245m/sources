package com.huawei.hms.push;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class RemoteMessage implements Parcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = null;
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_NORMAL = 2;
    public static final int PRIORITY_UNKNOWN = 0;
    private static final String[] c = null;
    private static final int[] d = null;
    private static final long[] e = null;
    private static final HashMap<String, Object> f = null;
    private static final HashMap<String, Object> g = null;
    private static final HashMap<String, Object> h = null;

    /* renamed from: i, reason: collision with root package name */
    private static final HashMap<String, Object> f677i = null;

    /* renamed from: j, reason: collision with root package name */
    private static final HashMap<String, Object> f678j = null;
    private Bundle a;
    private Notification b;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class Builder {
        private final Bundle a;
        private final Map<String, String> b;

        public Builder(String str) {
        }

        public Builder addData(String str, String str2) {
        }

        public RemoteMessage build() {
        }

        public Builder clearData() {
        }

        public Builder setCollapseKey(String str) {
        }

        public Builder setData(Map<String, String> map) {
        }

        public Builder setMessageId(String str) {
        }

        public Builder setMessageType(String str) {
        }

        public Builder setReceiptMode(int i2) {
        }

        public Builder setSendMode(int i2) {
        }

        public Builder setTtl(int i2) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public @interface MessagePriority {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class Notification implements Serializable {
        private final long[] A;
        private final String B;
        private final String a;
        private final String b;
        private final String[] c;
        private final String d;
        private final String e;
        private final String[] f;
        private final String g;
        private final String h;

        /* renamed from: i, reason: collision with root package name */
        private final String f679i;

        /* renamed from: j, reason: collision with root package name */
        private final String f680j;

        /* renamed from: k, reason: collision with root package name */
        private final String f681k;

        /* renamed from: l, reason: collision with root package name */
        private final String f682l;

        /* renamed from: m, reason: collision with root package name */
        private final String f683m;

        /* renamed from: n, reason: collision with root package name */
        private final Uri f684n;

        /* renamed from: o, reason: collision with root package name */
        private final int f685o;

        /* renamed from: p, reason: collision with root package name */
        private final String f686p;

        /* renamed from: q, reason: collision with root package name */
        private final int f687q;

        /* renamed from: r, reason: collision with root package name */
        private final int f688r;

        /* renamed from: s, reason: collision with root package name */
        private final int f689s;

        /* renamed from: t, reason: collision with root package name */
        private final int[] f690t;
        private final String u;
        private final int v;
        private final String w;
        private final int x;
        private final String y;
        private final String z;

        public /* synthetic */ Notification(Bundle bundle, a aVar) {
        }

        private Integer a(String str) {
        }

        public Integer getBadgeNumber() {
        }

        public String getBody() {
        }

        public String[] getBodyLocalizationArgs() {
        }

        public String getBodyLocalizationKey() {
        }

        public String getChannelId() {
        }

        public String getClickAction() {
        }

        public String getColor() {
        }

        public String getIcon() {
        }

        public Uri getImageUrl() {
        }

        public Integer getImportance() {
        }

        public String getIntentUri() {
        }

        public int[] getLightSettings() {
        }

        public Uri getLink() {
        }

        public int getNotifyId() {
        }

        public String getSound() {
        }

        public String getTag() {
        }

        public String getTicker() {
        }

        public String getTitle() {
        }

        public String[] getTitleLocalizationArgs() {
        }

        public String getTitleLocalizationKey() {
        }

        public long[] getVibrateConfig() {
        }

        public Integer getVisibility() {
        }

        public Long getWhen() {
        }

        public boolean isAutoCancel() {
        }

        public boolean isDefaultLight() {
        }

        public boolean isDefaultSound() {
        }

        public boolean isDefaultVibrate() {
        }

        public boolean isLocalOnly() {
        }

        private Notification(Bundle bundle) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements Parcelable.Creator<RemoteMessage> {
        public RemoteMessage a(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ RemoteMessage createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ RemoteMessage[] newArray(int i2) {
        }

        public RemoteMessage[] a(int i2) {
        }
    }

    public RemoteMessage(Bundle bundle) {
    }

    private Bundle a(Bundle bundle) {
    }

    private static JSONObject b(Bundle bundle) {
    }

    private static JSONObject c(JSONObject jSONObject) {
    }

    private static JSONObject d(JSONObject jSONObject) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
    }

    public String getAnalyticInfo() {
    }

    public Map<String, String> getAnalyticInfoMap() {
    }

    public String getCollapseKey() {
    }

    public String getData() {
    }

    public Map<String, String> getDataOfMap() {
    }

    public String getFrom() {
    }

    public String getMessageId() {
    }

    public String getMessageType() {
    }

    public Notification getNotification() {
    }

    public int getOriginalUrgency() {
    }

    public int getReceiptMode() {
    }

    public int getSendMode() {
    }

    public long getSentTime() {
    }

    public String getTo() {
    }

    public String getToken() {
    }

    public int getTtl() {
    }

    public int getUrgency() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public RemoteMessage(Parcel parcel) {
    }

    private static JSONObject b(JSONObject jSONObject) {
    }

    private Bundle a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5) {
    }

    private static JSONObject a(JSONObject jSONObject) {
    }
}
