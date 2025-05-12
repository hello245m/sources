package com.tencent.android.tpush;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Pair;
import android.widget.RemoteViews;
import org.json.JSONObject;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class XGPushNotificationBuilder {
    public static final String BASIC_NOTIFICATION_BUILDER_TYPE = "basic";
    public static final String CUSTOM_NOTIFICATION_BUILDER_TYPE = "custom";
    public Bitmap A;
    public Integer B;
    public String C;
    private String D;
    private boolean E;
    public String a;
    public String b;
    public Integer c;
    public PendingIntent d;
    public RemoteViews e;
    public RemoteViews f;
    public int g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public Integer f735i;

    /* renamed from: j, reason: collision with root package name */
    public PendingIntent f736j;

    /* renamed from: k, reason: collision with root package name */
    public Integer f737k;

    /* renamed from: l, reason: collision with root package name */
    public Integer f738l;

    /* renamed from: m, reason: collision with root package name */
    public Integer f739m;

    /* renamed from: n, reason: collision with root package name */
    public Integer f740n;

    /* renamed from: o, reason: collision with root package name */
    public Integer f741o;

    /* renamed from: p, reason: collision with root package name */
    public Integer f742p;

    /* renamed from: q, reason: collision with root package name */
    public Integer f743q;

    /* renamed from: r, reason: collision with root package name */
    public Uri f744r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f745s;

    /* renamed from: t, reason: collision with root package name */
    public long[] f746t;
    public Long u;
    public Integer v;
    public Bitmap w;
    public Integer x;
    public String y;
    public Integer z;

    private Object a(Notification.Builder builder, Context context) {
    }

    private int b(Context context) {
    }

    private Notification c(Context context) {
    }

    public static void createNotificationChannel(Context context, Object obj) {
    }

    public abstract void a(JSONObject jSONObject);

    public abstract void b(JSONObject jSONObject);

    public abstract Pair<Notification, Object> buildNotification(Context context);

    public void decode(String str) {
    }

    public void encode(JSONObject jSONObject) {
    }

    public int getApplicationIcon(Context context) {
    }

    public int getAudioStringType() {
    }

    public String getChannelId(Context context) {
    }

    public String getChannelName(Context context) {
    }

    @SuppressLint({"NewApi"})
    public Pair<Notification, Object> getChannelNotification(Context context) {
    }

    public Integer getColor() {
    }

    public PendingIntent getContentIntent() {
    }

    public String getCurrentChannelId() {
    }

    public int getCustomLayoutType() {
    }

    public int getDefaults() {
    }

    public int getFlags() {
    }

    public Integer getIcon() {
    }

    public int getIconLevel() {
    }

    public Bitmap getLargeIcon() {
    }

    public int getLedARGB() {
    }

    public int getLedOffMS() {
    }

    public int getLedOnMS() {
    }

    public Integer getNotificationLargeIcon() {
    }

    public int getNumber() {
    }

    public Bitmap getRichIcon() {
    }

    public Integer getSmallIcon() {
    }

    public Uri getSound() {
    }

    public String getThread_id() {
    }

    public CharSequence getTickerText() {
    }

    public String getTitle(Context context) {
    }

    public abstract String getType();

    public long[] getVibrate() {
    }

    public long getWhen() {
    }

    public XGPushNotificationBuilder setAudioStringType(int i2) {
    }

    public void setChannelId(String str) {
    }

    public void setChannelName(String str) {
    }

    public XGPushNotificationBuilder setColor(Integer num) {
    }

    public XGPushNotificationBuilder setContentIntent(PendingIntent pendingIntent) {
    }

    public XGPushNotificationBuilder setContentView(RemoteViews remoteViews) {
    }

    public XGPushNotificationBuilder setCustomLayoutType(int i2) {
    }

    public XGPushNotificationBuilder setDefaults(int i2) {
    }

    public XGPushNotificationBuilder setFlags(int i2) {
    }

    public XGPushNotificationBuilder setIcon(Integer num) {
    }

    public XGPushNotificationBuilder setIconLevel(int i2) {
    }

    public XGPushNotificationBuilder setLargeIcon(Bitmap bitmap) {
    }

    public XGPushNotificationBuilder setLedARGB(int i2) {
    }

    public XGPushNotificationBuilder setLedOffMS(int i2) {
    }

    public XGPushNotificationBuilder setLedOnMS(int i2) {
    }

    public XGPushNotificationBuilder setNotificationLargeIcon(int i2) {
    }

    public XGPushNotificationBuilder setNumber(int i2) {
    }

    public XGPushNotificationBuilder setRichIcon(Bitmap bitmap) {
    }

    public void setRunAsSysAndAndBuildSdk26(boolean z) {
    }

    public XGPushNotificationBuilder setSmallIcon(Integer num) {
    }

    public XGPushNotificationBuilder setSound(Uri uri) {
    }

    public void setThread_id(String str) {
    }

    public XGPushNotificationBuilder setTickerText(CharSequence charSequence) {
    }

    public void setTitle(String str) {
    }

    public void setUseStdStyle(int i2) {
    }

    public XGPushNotificationBuilder setVibrate(long[] jArr) {
    }

    public XGPushNotificationBuilder setWhen(long j2) {
    }

    public XGPushNotificationBuilder setbigContentView(RemoteViews remoteViews) {
    }

    public Pair<Notification, Object> a(Context context) {
    }
}
