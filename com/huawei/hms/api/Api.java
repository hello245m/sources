package com.huawei.hms.api;

import com.huawei.hms.api.Api.ApiOptions;
import com.huawei.hms.common.api.ConnectionPostProcessor;
import com.huawei.hms.support.api.entity.auth.PermissionInfo;
import com.huawei.hms.support.api.entity.auth.Scope;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class Api<O extends ApiOptions> {
    private final String mApiName;
    public List<ConnectionPostProcessor> mConnetctPostList;
    private final Options<O> mOption;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface ApiOptions {

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public interface HasOptions extends ApiOptions {
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public static final class NoOptions implements NotRequiredOptions {
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public interface NotRequiredOptions extends ApiOptions {
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public interface Optional extends HasOptions, NotRequiredOptions {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class Options<O> {
        public List<PermissionInfo> getPermissionInfoList(O o2) {
        }

        public List<Scope> getScopeList(O o2) {
        }
    }

    public Api(String str) {
    }

    public String getApiName() {
    }

    public Options<O> getOptions() {
    }

    public List<ConnectionPostProcessor> getmConnetctPostList() {
    }

    public void setmConnetctPostList(List<ConnectionPostProcessor> list) {
    }

    public Api(String str, Options<O> options) {
    }
}
