package com.xiaomi.mipush.sdk;

import android.os.Bundle;
import com.xiaomi.mipush.sdk.PushMessageHandler;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class MiPushCommandMessage implements PushMessageHandler.a {
    private static final String KEY_AUTO_MARK_PKGS = "autoMarkPkgs";
    private static final String KEY_CATEGORY = "category";
    private static final String KEY_COMMAND = "command";
    private static final String KEY_COMMAND_ARGUMENTS = "commandArguments";
    private static final String KEY_REASON = "reason";
    private static final String KEY_RESULT_CODE = "resultCode";
    private static final long serialVersionUID = 1;
    private List<String> autoMarkPkgs;
    private String category;
    private String command;
    private List<String> commandArguments;
    private String reason;
    private long resultCode;

    public static MiPushCommandMessage fromBundle(Bundle bundle) {
    }

    public List<String> getAutoMarkPkgs() {
    }

    public String getCategory() {
    }

    public String getCommand() {
    }

    public List<String> getCommandArguments() {
    }

    public String getReason() {
    }

    public long getResultCode() {
    }

    public void setAutoMarkPkgs(List<String> list) {
    }

    public void setCategory(String str) {
    }

    public void setCommand(String str) {
    }

    public void setCommandArguments(List<String> list) {
    }

    public void setReason(String str) {
    }

    public void setResultCode(long j2) {
    }

    public Bundle toBundle() {
    }

    public String toString() {
    }
}
