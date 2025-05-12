package com.tencent.qqmusic.mediaplayer;

import android.os.Handler;
import com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent;
import com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener;
import com.tencent.qqmusic.mediaplayer.util.WaitNotify;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class StaticDecodeDataComponent extends BaseDecodeDataComponent {
    private static final String TAG = "StaticDecodeDataComponent";
    private int mAllBufferSize;
    private List<BufferInfo> mAllPcmBufferList;
    private boolean mHasTerminal;
    private boolean mIsfirstStarted;

    /* renamed from: com.tencent.qqmusic.mediaplayer.StaticDecodeDataComponent$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ StaticDecodeDataComponent this$0;

        public AnonymousClass1(StaticDecodeDataComponent staticDecodeDataComponent) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.qqmusic.mediaplayer.StaticDecodeDataComponent$2, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass2 implements WaitNotify.WaitListener {
        public final /* synthetic */ StaticDecodeDataComponent this$0;

        public AnonymousClass2(StaticDecodeDataComponent staticDecodeDataComponent) {
        }

        @Override // com.tencent.qqmusic.mediaplayer.util.WaitNotify.WaitListener
        public boolean keepWaiting() {
        }
    }

    /* renamed from: com.tencent.qqmusic.mediaplayer.StaticDecodeDataComponent$3, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass3 implements Runnable {
        public final /* synthetic */ StaticDecodeDataComponent this$0;

        public AnonymousClass3(StaticDecodeDataComponent staticDecodeDataComponent) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.qqmusic.mediaplayer.StaticDecodeDataComponent$4, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass4 implements Runnable {
        public final /* synthetic */ StaticDecodeDataComponent this$0;

        public AnonymousClass4(StaticDecodeDataComponent staticDecodeDataComponent) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.qqmusic.mediaplayer.StaticDecodeDataComponent$5, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass5 implements Runnable {
        public final /* synthetic */ StaticDecodeDataComponent this$0;

        public AnonymousClass5(StaticDecodeDataComponent staticDecodeDataComponent) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public StaticDecodeDataComponent(CorePlayer corePlayer, PlayerStateRunner playerStateRunner, AudioInformation audioInformation, PlayerCallback playerCallback, BaseDecodeDataComponent.HandleDecodeDataCallback handleDecodeDataCallback, Handler handler, int i2, IAudioListener iAudioListener, IAudioListener iAudioListener2) {
    }

    private boolean createAudioTrack() {
    }

    private boolean decodeAllData() {
    }

    private void playAudioTrack() {
    }

    private boolean writeAudioTrack() {
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent
    public int getAudioStreamType() {
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent
    public long getCurPosition() {
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent
    public void handleDecodeData() {
    }
}
