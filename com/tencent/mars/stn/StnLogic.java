package com.tencent.mars.stn;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class StnLogic {
    public static final int CONNECTED = 4;
    public static final int CONNECTTING = 3;
    public static int ECHECK_NEVER = 0;
    public static int ECHECK_NEXT = 0;
    public static int ECHECK_NOW = 0;
    public static final int GATEWAY_FAILED = 1;
    public static final int INVALID_TASK_ID = -1;
    public static final int NETWORK_UNAVAILABLE = 0;
    public static final int NETWORK_UNKNOWN = -1;
    public static int RESP_FAIL_HANDLE_DEFAULT = 0;
    public static int RESP_FAIL_HANDLE_NORMAL = 0;
    public static int RESP_FAIL_HANDLE_SESSION_TIMEOUT = 0;
    public static int RESP_FAIL_HANDLE_TASK_END = 0;
    public static final int SERVER_DOWN = 5;
    public static final int SERVER_FAILED = 2;
    private static final String TAG = "mars.StnLogic";
    private static ICallBack callBack = null;
    public static final int ectDial = 2;
    public static final int ectDns = 3;
    public static final int ectEnDecode = 7;
    public static final int ectFalse = 1;
    public static final int ectHttp = 5;
    public static final int ectLocal = 9;
    public static final int ectNetMsgXP = 6;
    public static final int ectOK = 0;
    public static final int ectServer = 8;
    public static final int ectSocket = 4;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface ICallBack {
        public static final int BaseNetDetectEnd = 2;
        public static final int DetectConnectFail = 1;
        public static final int DetectConnectOK = 0;
        public static final int DetectEnd = 4;
        public static final int DetectLongLinkEnd = 0;
        public static final int DetectNotStart = 3;
        public static final int DetectShortLinkEnd = 1;
        public static final int DetectTimeout = 2;

        int buf2Resp(int i2, Object obj, byte[] bArr, int[] iArr, int[] iArr2, int i3);

        int getLongLinkIdentifyCheckBuffer(String str, ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2, int[] iArr);

        boolean isLogoned();

        boolean makesureAuthed(String str);

        void networkAnalysisCallBack(int i2, int i3, boolean z, String str);

        boolean onLongLinkIdentifyResp(String str, byte[] bArr, byte[] bArr2);

        String[] onNewDns(String str);

        void onPush(String str, int i2, int i3, byte[] bArr);

        int onTaskEnd(int i2, Object obj, int i3, int i4);

        void reportConnectInfo(int i2, int i3);

        boolean req2Buf(int i2, Object obj, ByteArrayOutputStream byteArrayOutputStream, int[] iArr, int i3, String str);

        void requestDoSync();

        String[] requestNetCheckShortLinkHosts();
    }

    private static int buf2Resp(int i2, Object obj, byte[] bArr, int[] iArr, int[] iArr2, int i3) {
    }

    public static native void clearTask();

    private static String exception2String(Exception exc) {
    }

    public static native int genTaskID();

    private static native ArrayList<String> getLoadLibraries();

    private static int getLongLinkIdentifyCheckBuffer(String str, ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2, int[] iArr) {
    }

    public static native boolean hasTask(int i2);

    public static boolean isLogoned() {
    }

    public static native void keepSignalling();

    private static boolean makesureAuthed(String str) {
    }

    public static native void makesureLongLinkConnected();

    private static void networkAnalysisCallBack(int i2, int i3, boolean z, String str) {
    }

    private static boolean onLongLinkIdentifyResp(String str, byte[] bArr, byte[] bArr2) {
    }

    private static String[] onNewDns(String str) {
    }

    private static void onPush(String str, int i2, int i3, byte[] bArr) {
    }

    private static int onTaskEnd(int i2, Object obj, int i3, int i4) {
    }

    public static native void redoTask();

    private static void reportConnectStatus(int i2, int i3) {
    }

    private static void reportTaskProfile(String str) {
    }

    private static boolean req2Buf(int i2, Object obj, ByteArrayOutputStream byteArrayOutputStream, int[] iArr, int i3, String str) {
    }

    public static void requestDoSync() {
    }

    private static String[] requestNetCheckShortLinkHosts() {
    }

    public static native void reset();

    public static native void setBackupIPs(String str, String[] strArr);

    public static void setCallBack(ICallBack iCallBack) {
    }

    public static native void setClientVersion(int i2);

    public static native void setDebugIP(String str, String str2);

    public static void setLonglinkSvrAddr(String str, int[] iArr) {
    }

    public static native void setLonglinkSvrAddr(String str, int[] iArr, String str2);

    public static void setShortlinkSvrAddr(int i2) {
    }

    public static native void setShortlinkSvrAddr(int i2, String str);

    public static native void setSignallingStrategy(long j2, long j3);

    public static native boolean startNetworkAnalysis();

    public static native void startTask(Task task);

    public static native void stopSignalling();

    public static native void stopTask(int i2);

    private static void trafficData(int i2, int i3) {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class Task {
        public static final int EBoth = 3;
        public static final int EFAST = 1;
        public static final int ELong = 2;
        public static final int ENORMAL = 0;
        public static final int EShort = 1;
        public static final int ETASK_PRIORITY_0 = 0;
        public static final int ETASK_PRIORITY_1 = 1;
        public static final int ETASK_PRIORITY_2 = 2;
        public static final int ETASK_PRIORITY_3 = 3;
        public static final int ETASK_PRIORITY_4 = 4;
        public static final int ETASK_PRIORITY_5 = 5;
        public static final int ETASK_PRIORITY_HIGHEST = 0;
        public static final int ETASK_PRIORITY_LOWEST = 5;
        public static final int ETASK_PRIORITY_NORMAL = 3;
        public String cgi;
        public int channelSelect;
        public int channelStrategy;
        public int cmdID;
        public Map<String, String> headers;
        public boolean limitFlow;
        public boolean limitFrequency;
        public boolean longPolling;
        public int longPollingTimeout;
        public boolean needAuthed;
        public boolean networkStatusSensitive;
        public int priority;
        public String reportArg;
        public int retryCount;
        public boolean sendOnly;
        public int serverProcessCost;
        public ArrayList<String> shortLinkHostList;
        public int taskID;
        public int totalTimeout;
        public Object userContext;

        public Task() {
        }

        public Task(int i2, int i3, String str, ArrayList<String> arrayList) {
        }
    }

    private static int buf2Resp(int i2, Object obj, byte[] bArr, int[] iArr, int i3) {
    }
}
