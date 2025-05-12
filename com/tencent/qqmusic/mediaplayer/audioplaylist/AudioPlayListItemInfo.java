package com.tencent.qqmusic.mediaplayer.audioplaylist;

import android.os.Parcelable;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public abstract class AudioPlayListItemInfo implements Parcelable {
    public static int TYPE_CUE = 1;
    public static int TYPE_M3U = 2;
    public static int TYPE_NONE;
    public int mType;
    public String mUri;

    public int getType() {
    }
}
