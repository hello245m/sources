package com.tencent.qqmusic.mediaplayer.audiofx;

import android.content.Context;
import android.os.Bundle;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public interface IAudioListenerBuilder {
    IAudioListener createAudioEffect(Bundle bundle);

    Bundle getConfiguration(int i2, Bundle bundle);

    String getId();

    void init(Context context);

    boolean isEnabled();

    void release();

    void setConfiguration(int i2, Bundle bundle);

    boolean setEnabled(boolean z);

    void setListener(OnBuilderStateChangedListener onBuilderStateChangedListener);
}
