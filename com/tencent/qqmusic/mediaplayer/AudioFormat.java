package com.tencent.qqmusic.mediaplayer;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class AudioFormat {
    private static final String EXTENSION_AAC = "aac";
    private static final String EXTENSION_AMR = "amr";
    private static final String EXTENSION_APE = "ape";
    private static final String EXTENSION_FLAC = "flac";
    private static final String EXTENSION_M4A = "m4a";
    private static final String EXTENSION_MP3 = "mp3";
    private static final String EXTENSION_MP4 = "mp4";
    private static final String EXTENSION_OGG = "ogg";
    private static final String EXTENSION_WAV = "wav";
    private static final String EXTENSION_WMA = "wma";
    private static final int VALUE_AAC = 11;
    private static final int VALUE_AMR = 6;
    private static final int VALUE_APE = 5;
    private static final int VALUE_FLAC = 2;
    private static final int VALUE_M4A = 3;
    private static final int VALUE_MP3 = 9;
    private static final int VALUE_MP4 = 10;
    private static final int VALUE_OGG = 4;
    private static final int VALUE_UNSUPPORT = 1;
    private static final int VALUE_WAV = 8;
    private static final int VALUE_WMA = 7;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class AudioType {
        private static final /* synthetic */ AudioType[] $VALUES = null;
        public static final AudioType AAC = null;
        public static final AudioType AMR = null;
        public static final AudioType APE = null;
        public static final AudioType FLAC = null;
        public static final AudioType M4A = null;
        public static final AudioType MP3 = null;
        public static final AudioType MP4 = null;
        public static final AudioType OGG = null;
        public static final AudioType UNSUPPORT = null;
        public static final AudioType WAV = null;
        public static final AudioType WMA = null;
        private String extension;
        private int value;

        private AudioType(String str, int i2, int i3, String str2) {
        }

        public static /* synthetic */ int access$000(AudioType audioType) {
        }

        public static AudioType valueOf(String str) {
        }

        public static AudioType[] values() {
        }

        public String getExtension() {
        }

        public int getValue() {
        }
    }

    public static AudioType getAudioType(int i2) {
    }

    public static boolean isAudioType(AudioType audioType) {
    }
}
