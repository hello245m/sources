package com.tencent.android.tpush;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class XGPushTextMessage implements Parcelable {
    public static final Parcelable.Creator<XGPushTextMessage> CREATOR = null;
    public long a;
    public String b;
    public String c;
    public String d;
    public int e;
    public String f;
    public String g;
    private Intent h;

    /* renamed from: com.tencent.android.tpush.XGPushTextMessage$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass1 implements Parcelable.Creator<XGPushTextMessage> {
        public XGPushTextMessage a(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ XGPushTextMessage createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ XGPushTextMessage[] newArray(int i2) {
        }

        public XGPushTextMessage[] a(int i2) {
        }
    }

    public XGPushTextMessage() {
    }

    public void a(Intent intent) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String getContent() {
    }

    public String getCustomContent() {
    }

    public long getMsgId() {
    }

    public int getPushChannel() {
    }

    public String getTemplateId() {
    }

    public String getTitle() {
    }

    public String getTraceId() {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public Intent a() {
    }

    public XGPushTextMessage(Parcel parcel) {
    }
}
