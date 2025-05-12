package com.tencent.android.tpush.service.cache;

import android.content.Context;
import com.tencent.android.tpush.data.RegisterEntity;
import com.tencent.tpns.baseapi.base.util.TTask;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class CacheManager {
    private CacheManager() {
    }

    public static void UninstallInfoByPkgName(String str) {
    }

    public static void UninstallInfoSuccessByPkgName(String str) {
    }

    public static void UnregisterInfoByPkgName(String str) {
    }

    public static void UnregisterInfoSuccessByPkgName(String str) {
    }

    private static void a(String str) {
    }

    private static void a(String str, byte b) {
    }

    public static void addRegisterInfo(RegisterEntity registerEntity) {
    }

    public static void clearDomainServerItem(Context context) {
    }

    public static void clearTokenCache() {
    }

    public static String findValidPackageByAccessid(long j2) {
    }

    public static RegisterEntity findValidRegisterEntityByPkg(String str) {
    }

    public static Context getContext() {
    }

    public static RegisterEntity getCurrentAppRegisterEntity(Context context) {
    }

    public static String getDomain(Context context) {
    }

    public static ArrayList<String> getDomainKeyList(Context context) {
    }

    public static long getGuid(Context context) {
    }

    public static String getQua(Context context, long j2) {
    }

    public static Map<Long, RegisterEntity> getRegInfoByApps(Context context) {
    }

    public static synchronized Map<Long, RegisterEntity> getRegisterEntityMap() {
    }

    public static List<RegisterEntity> getRegisterInfo(Context context) {
    }

    public static RegisterEntity getRegisterInfoByPkgName(String str) {
    }

    public static List<String> getRegisterInfos(Context context) {
    }

    public static String getToken(Context context) {
    }

    public static void removeRegisterInfoByPkgName(String str) {
    }

    public static void removeRegisterInfos(String str) {
    }

    public static void saveDomain(Context context, String str) {
    }

    public static void saveDomainKey(Context context, String str) {
    }

    public static void saveDomainKeyList(Context context, ArrayList<String> arrayList) {
    }

    public static void setCurrentAppRegisterEntity(Context context, RegisterEntity registerEntity) {
    }

    public static void setQua(Context context, long j2, String str) {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class a extends TTask {
        private Context a;
        private Map<Long, RegisterEntity> b;

        public a(Context context) {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
        }

        public synchronized void a(Map<Long, RegisterEntity> map) {
        }

        public synchronized Map<Long, RegisterEntity> a() {
        }
    }

    private static String a(String str, String str2) {
    }
}
