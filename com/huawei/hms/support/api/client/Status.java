package com.huawei.hms.support.api.client;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.core.aidl.annotation.Packed;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class Status extends Result implements Parcelable {
    public static final Parcelable.Creator<Status> CREATOR = null;
    public static final Status CoreException = null;
    public static final Status FAILURE = null;
    public static final Status MessageNotFound = null;

    @Deprecated
    public static final Status RESULT_CANCELED = null;

    @Deprecated
    public static final Status RESULT_DEAD_CLIENT = null;

    @Deprecated
    public static final Status RESULT_INTERNAL_ERROR = null;

    @Deprecated
    public static final Status RESULT_INTERRUPTED = null;

    @Deprecated
    public static final Status RESULT_TIMEOUT = null;
    public static final Status SUCCESS = null;

    @Packed
    private Intent intent;

    @Packed
    private PendingIntent pendingIntent;

    @Packed
    private int statusCode;

    @Packed
    private String statusMessage;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public Status createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public Status[] newArray(int i2) {
        }
    }

    public Status(int i2) {
    }

    private static boolean equal(Object obj, Object obj2) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(Object obj) {
    }

    public String getErrorString() {
    }

    public PendingIntent getResolution() {
    }

    public Intent getResolutionIntent() {
    }

    @Override // com.huawei.hms.support.api.client.Result
    public Status getStatus() {
    }

    public int getStatusCode() {
    }

    public String getStatusMessage() {
    }

    public boolean hasResolution() {
    }

    public int hashCode() {
    }

    public boolean isCanceled() {
    }

    public boolean isInterrupted() {
    }

    public boolean isSuccess() {
    }

    public void setIntent(Intent intent) {
    }

    public void setPendingIntent(PendingIntent pendingIntent) {
    }

    public void startResolutionForResult(Activity activity, int i2) throws IntentSender.SendIntentException {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public Status(int i2, String str) {
    }

    public Status(int i2, String str, PendingIntent pendingIntent) {
    }

    public Status(int i2, String str, Intent intent) {
    }
}
