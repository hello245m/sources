package com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public abstract class CharsetRecog_mbcs extends CharsetRecognizer {

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class CharsetRecog_big5 extends CharsetRecog_mbcs {
        public static int[] commonChars;

        @Override // com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecognizer
        public String getLanguage() {
        }

        @Override // com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_mbcs, com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecognizer
        public String getName() {
        }

        @Override // com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecognizer
        public CharsetMatch match(CharsetDetector charsetDetector) {
        }

        @Override // com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_mbcs
        public boolean nextChar(iteratedChar iteratedchar, CharsetDetector charsetDetector) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static abstract class CharsetRecog_euc extends CharsetRecog_mbcs {

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static class CharsetRecog_euc_jp extends CharsetRecog_euc {
            public static int[] commonChars;

            @Override // com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecognizer
            public String getLanguage() {
            }

            @Override // com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_mbcs, com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecognizer
            public String getName() {
            }

            @Override // com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecognizer
            public CharsetMatch match(CharsetDetector charsetDetector) {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static class CharsetRecog_euc_kr extends CharsetRecog_euc {
            public static int[] commonChars;

            @Override // com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecognizer
            public String getLanguage() {
            }

            @Override // com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_mbcs, com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecognizer
            public String getName() {
            }

            @Override // com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecognizer
            public CharsetMatch match(CharsetDetector charsetDetector) {
            }
        }

        @Override // com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_mbcs
        public boolean nextChar(iteratedChar iteratedchar, CharsetDetector charsetDetector) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class CharsetRecog_gb_18030 extends CharsetRecog_mbcs {
        public static int[] commonChars;

        @Override // com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecognizer
        public String getLanguage() {
        }

        @Override // com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_mbcs, com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecognizer
        public String getName() {
        }

        @Override // com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecognizer
        public CharsetMatch match(CharsetDetector charsetDetector) {
        }

        @Override // com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_mbcs
        public boolean nextChar(iteratedChar iteratedchar, CharsetDetector charsetDetector) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class CharsetRecog_sjis extends CharsetRecog_mbcs {
        public static int[] commonChars;

        @Override // com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecognizer
        public String getLanguage() {
        }

        @Override // com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_mbcs, com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecognizer
        public String getName() {
        }

        @Override // com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecognizer
        public CharsetMatch match(CharsetDetector charsetDetector) {
        }

        @Override // com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_mbcs
        public boolean nextChar(iteratedChar iteratedchar, CharsetDetector charsetDetector) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class iteratedChar {
        public int charValue;
        public boolean done;
        public boolean error;
        public int nextIndex;

        public int nextByte(CharsetDetector charsetDetector) {
        }

        public void reset() {
        }
    }

    @Override // com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecognizer
    public abstract String getName();

    public int match(CharsetDetector charsetDetector, int[] iArr) {
    }

    public abstract boolean nextChar(iteratedChar iteratedchar, CharsetDetector charsetDetector);
}
