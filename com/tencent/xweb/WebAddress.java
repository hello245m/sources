package com.tencent.xweb;

import java.util.regex.Pattern;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class WebAddress {
    public static final int MATCH_GROUP_AUTHORITY = 2;
    public static final int MATCH_GROUP_HOST = 3;
    public static final int MATCH_GROUP_PATH = 5;
    public static final int MATCH_GROUP_PORT = 4;
    public static final int MATCH_GROUP_SCHEME = 1;
    public static Pattern sAddressPattern;
    public String mAuthInfo;
    public String mHost;
    public String mPath;
    public int mPort;
    public String mScheme;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class ParseException extends RuntimeException {
        public String response;

        public ParseException(String str) {
        }
    }

    public WebAddress(String str) throws ParseException {
    }

    public String getAuthInfo() {
    }

    public String getHost() {
    }

    public String getPath() {
    }

    public int getPort() {
    }

    public String getScheme() {
    }

    public void setAuthInfo(String str) {
    }

    public void setHost(String str) {
    }

    public void setPath(String str) {
    }

    public void setPort(int i2) {
    }

    public void setScheme(String str) {
    }

    public String toString() {
    }
}
