package com.huawei.hms.api;

import java.util.Map;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class FailedBinderCallBack {
    private static final long AGING_TIME = 10000;
    public static final String CALLER_ID = "callId";
    private static final Object LOCK_OBJECT = null;
    private static final String TAG = "FailedBinderCallBack";
    private static Map<Long, BinderCallBack> binderCallBackMap;
    private static FailedBinderCallBack instance;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface BinderCallBack {
        void binderCallBack(int i2);
    }

    private FailedBinderCallBack() {
    }

    private void agingCheck() {
    }

    public static FailedBinderCallBack getInstance() {
    }

    private void putCallBackInMap(Long l2, BinderCallBack binderCallBack) {
    }

    public BinderCallBack getCallBack(Long l2) {
    }

    public void setCallBack(Long l2, BinderCallBack binderCallBack) {
    }
}
