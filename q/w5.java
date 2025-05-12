package q;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import k.d.c.b0;
import k.d.c.z;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
public final class w5 extends k.d.c.z<w5, a> implements x5 {
    public static final int AD_INFO_FIELD_NUMBER = 49;
    public static final int APP_COVER_AUTO_FIELD_NUMBER = 58;
    public static final int AUTHOR_FIELD_NUMBER = 15;
    public static final int AUTHOR_OPENID_FIELD_NUMBER = 33;
    public static final int AUTO_GEN_DIGEST_FIELD_NUMBER = 31;
    public static final int BAN_EDIT_WORDING_FIELD_NUMBER = 41;
    public static final int CAN_REWARD_FIELD_NUMBER = 23;
    public static final int CATEGORY_ID_FIELD_NUMBER = 36;
    public static final int CONTENT_FIELD_NUMBER = 13;
    public static final int CONTENT_URL_FIELD_NUMBER = 12;
    public static final int COORDINATE_16_9_FIELD_NUMBER = 55;
    public static final int COORDINATE_1_1_FIELD_NUMBER = 52;
    public static final int COORDINATE_235_1_FIELD_NUMBER = 51;
    public static final int COORDINATE_3_4_FIELD_NUMBER = 67;
    public static final int COPYRIGHT_TYPE_FIELD_NUMBER = 17;
    public static final int COVER_FIELD_NUMBER = 9;
    private static final w5 DEFAULT_INSTANCE = null;
    public static final int DIGEST_FIELD_NUMBER = 11;
    public static final int EXTRA_JSON_STR_FIELD_NUMBER = 45;
    public static final int FINDER_INFO_FIELD_NUMBER = 59;
    public static final int FREE_CONTENT_FIELD_NUMBER = 26;
    public static final int FUNC_FLAG_FIELD_NUMBER = 29;
    public static final int INSERT_AD_MODE_FIELD_NUMBER = 35;
    public static final int IS_BAN_EDIT_FIELD_NUMBER = 40;
    public static final int IS_CARTOON_COPYRIGHT_FIELD_NUMBER = 39;
    public static final int IS_PAY_SUBSCRIBE_FIELD_NUMBER = 37;
    public static final int ITEM_SHOW_TYPE_FIELD_NUMBER = 32;
    public static final int NEED_OPEN_COMMENT_FIELD_NUMBER = 25;
    public static final int ONLY_CAN_COMMENT_FIELD_NUMBER = 38;
    public static final int OPEN_FANSMSG_FIELD_NUMBER = 50;
    public static final int OPEN_TOPIC_FIELD_NUMBER = 43;
    public static final int ORIGINAL_ARTICLE_TYPE_FIELD_NUMBER = 22;
    private static volatile k.d.c.b1<w5> PARSER = null;
    public static final int PAY_ALBUM_INFO_FIELD_NUMBER = 61;
    public static final int PAY_SUBSCRIBE_INFO_FIELD_NUMBER = 60;
    public static final int PIC_CDN_URL_16_9_FIELD_NUMBER = 56;
    public static final int PIC_CDN_URL_1_1_FIELD_NUMBER = 54;
    public static final int PIC_CDN_URL_235_1_FIELD_NUMBER = 53;
    public static final int PIC_CDN_URL_3_4_FIELD_NUMBER = 66;
    public static final int PIC_CDN_URL_BACK_FIELD_NUMBER = 57;
    public static final int PLATFORM_FIELD_NUMBER = 19;
    public static final int PLAY_LENGTH_FIELD_NUMBER = 46;
    public static final int RELEASE_FIRST_FIELD_NUMBER = 18;
    public static final int RELEASE_TIME_FIELD_NUMBER = 20;
    public static final int REPLY_FLAG_FIELD_NUMBER = 42;
    public static final int REPRINT_ALLOW_EDIT_FIELD_NUMBER = 63;
    public static final int REPRINT_PERMIT_TYPE_FIELD_NUMBER = 21;
    public static final int REPRINT_STYLE_FIELD_NUMBER = 34;
    public static final int REPRINT_TYPE_FIELD_NUMBER = 64;
    public static final int REWARD_WORDING_FIELD_NUMBER = 24;
    public static final int SAVE_RESULT_MSG_FIELD_NUMBER = 47;
    public static final int SHARE_IMAGEINFO_FIELD_NUMBER = 48;
    public static final int SHARE_PAGE_TYPE_FIELD_NUMBER = 65;
    public static final int SHOW_COVER_PIC_FIELD_NUMBER = 16;
    public static final int SOURCE_REPRINT_STATUS_FIELD_NUMBER = 62;
    public static final int SOURCE_URL_FIELD_NUMBER = 14;
    public static final int TITLE_FIELD_NUMBER = 10;
    public static final int TOPICS_FIELD_NUMBER = 44;
    public static final int VIDEO_ID_FIELD_NUMBER = 30;
    private b3 adInfo_;
    private int appCoverAuto_;
    private String authorOpenid_;
    private String author_;
    private int autoGenDigest_;
    private String banEditWording_;
    private int bitField0_;
    private int bitField1_;
    private int canReward_;
    private b0.g categoryId_;
    private String contentUrl_;
    private String content_;
    private q3 coordinate11_;
    private q3 coordinate169_;
    private q3 coordinate2351_;
    private q3 coordinate34_;
    private int copyrightType_;
    private String cover_;
    private String digest_;
    private String extraJsonStr_;
    private b finderInfo_;
    private String freeContent_;
    private int funcFlag_;
    private int insertAdMode_;
    private int isBanEdit_;
    private int isCartoonCopyright_;
    private int isPaySubscribe_;
    private int itemShowType_;
    private int needOpenComment_;
    private int onlyCanComment_;
    private int openFansmsg_;
    private int openTopic_;
    private String originalArticleType_;
    private v6 payAlbumInfo_;
    private c paySubscribeInfo_;
    private String picCdnUrl11_;
    private String picCdnUrl169_;
    private String picCdnUrl2351_;
    private String picCdnUrl34_;
    private String picCdnUrlBack_;
    private String platform_;
    private int playLength_;
    private int releaseFirst_;
    private int releaseTime_;
    private int replyFlag_;
    private int reprintAllowEdit_;
    private int reprintPermitType_;
    private int reprintStyle_;
    private int reprintType_;
    private String rewardWording_;
    private String saveResultMsg_;
    private b0.i<z4> shareImageinfo_;
    private int sharePageType_;
    private int showCoverPic_;
    private int sourceReprintStatus_;
    private String sourceUrl_;
    private String title_;
    private b0.i<v6> topics_;
    private b0.i<String> videoId_;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static final class a extends z.b<w5, a> implements x5 {
        public /* synthetic */ a(a3 a3Var) {
        }

        public a() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static final class b extends k.d.c.z<b, a> implements Object {
        public static final int CAN_IMPORT_TO_FINDER_FIELD_NUMBER = 1;
        private static final b DEFAULT_INSTANCE = null;
        public static final int IMPORT_FROM_FINDER_EXPORT_ID_FIELD_NUMBER = 2;
        private static volatile k.d.c.b1<b> PARSER;
        private int bitField0_;
        private int canImportToFinder_;
        private String importFromFinderExportId_;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
        public static final class a extends z.b<b, a> implements Object {
            public /* synthetic */ a(a3 a3Var) {
            }

            public a() {
            }
        }

        private b() {
        }

        public static /* synthetic */ b access$000() {
        }

        public static /* synthetic */ void access$100(b bVar, int i2) {
        }

        public static /* synthetic */ void access$200(b bVar) {
        }

        public static /* synthetic */ void access$300(b bVar, String str) {
        }

        public static /* synthetic */ void access$400(b bVar) {
        }

        public static /* synthetic */ void access$500(b bVar, k.d.c.i iVar) {
        }

        private void clearCanImportToFinder() {
        }

        private void clearImportFromFinderExportId() {
        }

        public static b getDefaultInstance() {
        }

        public static a newBuilder() {
        }

        public static b parseDelimitedFrom(InputStream inputStream) throws IOException {
        }

        public static b parseFrom(ByteBuffer byteBuffer) throws k.d.c.c0 {
        }

        public static k.d.c.b1<b> parser() {
        }

        private void setCanImportToFinder(int i2) {
        }

        private void setImportFromFinderExportId(String str) {
        }

        private void setImportFromFinderExportIdBytes(k.d.c.i iVar) {
        }

        @Override // k.d.c.z
        public final Object dynamicMethod(z.g gVar, Object obj, Object obj2) {
        }

        public int getCanImportToFinder() {
        }

        public String getImportFromFinderExportId() {
        }

        public k.d.c.i getImportFromFinderExportIdBytes() {
        }

        public boolean hasCanImportToFinder() {
        }

        public boolean hasImportFromFinderExportId() {
        }

        public static a newBuilder(b bVar) {
        }

        public static b parseDelimitedFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
        }

        public static b parseFrom(ByteBuffer byteBuffer, k.d.c.q qVar) throws k.d.c.c0 {
        }

        public static b parseFrom(k.d.c.i iVar) throws k.d.c.c0 {
        }

        public static b parseFrom(k.d.c.i iVar, k.d.c.q qVar) throws k.d.c.c0 {
        }

        public static b parseFrom(byte[] bArr) throws k.d.c.c0 {
        }

        public static b parseFrom(byte[] bArr, k.d.c.q qVar) throws k.d.c.c0 {
        }

        public static b parseFrom(InputStream inputStream) throws IOException {
        }

        public static b parseFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
        }

        public static b parseFrom(k.d.c.j jVar) throws IOException {
        }

        public static b parseFrom(k.d.c.j jVar, k.d.c.q qVar) throws IOException {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static final class c extends k.d.c.z<c, a> implements Object {
        private static final c DEFAULT_INSTANCE = null;
        public static final int DESC_FIELD_NUMBER = 4;
        public static final int FEE_FIELD_NUMBER = 2;
        public static final int GIFTS_COUNT_FIELD_NUMBER = 5;
        private static volatile k.d.c.b1<c> PARSER = null;
        public static final int PREVIEW_PERCENT_FIELD_NUMBER = 1;
        public static final int WECOIN_COUNT_FIELD_NUMBER = 3;
        private int bitField0_;
        private String desc_;
        private int fee_;
        private int giftsCount_;
        private int previewPercent_;
        private int wecoinCount_;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
        public static final class a extends z.b<c, a> implements Object {
            public /* synthetic */ a(a3 a3Var) {
            }

            public a() {
            }
        }

        private c() {
        }

        public static /* synthetic */ void access$1000(c cVar, int i2) {
        }

        public static /* synthetic */ void access$1100(c cVar) {
        }

        public static /* synthetic */ void access$1200(c cVar, int i2) {
        }

        public static /* synthetic */ void access$1300(c cVar) {
        }

        public static /* synthetic */ void access$1400(c cVar, String str) {
        }

        public static /* synthetic */ void access$1500(c cVar) {
        }

        public static /* synthetic */ void access$1600(c cVar, k.d.c.i iVar) {
        }

        public static /* synthetic */ void access$1700(c cVar, int i2) {
        }

        public static /* synthetic */ void access$1800(c cVar) {
        }

        public static /* synthetic */ c access$700() {
        }

        public static /* synthetic */ void access$800(c cVar, int i2) {
        }

        public static /* synthetic */ void access$900(c cVar) {
        }

        private void clearDesc() {
        }

        private void clearFee() {
        }

        private void clearGiftsCount() {
        }

        private void clearPreviewPercent() {
        }

        private void clearWecoinCount() {
        }

        public static c getDefaultInstance() {
        }

        public static a newBuilder() {
        }

        public static c parseDelimitedFrom(InputStream inputStream) throws IOException {
        }

        public static c parseFrom(ByteBuffer byteBuffer) throws k.d.c.c0 {
        }

        public static k.d.c.b1<c> parser() {
        }

        private void setDesc(String str) {
        }

        private void setDescBytes(k.d.c.i iVar) {
        }

        private void setFee(int i2) {
        }

        private void setGiftsCount(int i2) {
        }

        private void setPreviewPercent(int i2) {
        }

        private void setWecoinCount(int i2) {
        }

        @Override // k.d.c.z
        public final Object dynamicMethod(z.g gVar, Object obj, Object obj2) {
        }

        public String getDesc() {
        }

        public k.d.c.i getDescBytes() {
        }

        public int getFee() {
        }

        public int getGiftsCount() {
        }

        public int getPreviewPercent() {
        }

        public int getWecoinCount() {
        }

        public boolean hasDesc() {
        }

        public boolean hasFee() {
        }

        public boolean hasGiftsCount() {
        }

        public boolean hasPreviewPercent() {
        }

        public boolean hasWecoinCount() {
        }

        public static a newBuilder(c cVar) {
        }

        public static c parseDelimitedFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
        }

        public static c parseFrom(ByteBuffer byteBuffer, k.d.c.q qVar) throws k.d.c.c0 {
        }

        public static c parseFrom(k.d.c.i iVar) throws k.d.c.c0 {
        }

        public static c parseFrom(k.d.c.i iVar, k.d.c.q qVar) throws k.d.c.c0 {
        }

        public static c parseFrom(byte[] bArr) throws k.d.c.c0 {
        }

        public static c parseFrom(byte[] bArr, k.d.c.q qVar) throws k.d.c.c0 {
        }

        public static c parseFrom(InputStream inputStream) throws IOException {
        }

        public static c parseFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
        }

        public static c parseFrom(k.d.c.j jVar) throws IOException {
        }

        public static c parseFrom(k.d.c.j jVar, k.d.c.q qVar) throws IOException {
        }
    }

    private w5() {
    }

    public static /* synthetic */ void access$10000(w5 w5Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$10100(w5 w5Var, int i2) {
    }

    public static /* synthetic */ void access$10200(w5 w5Var) {
    }

    public static /* synthetic */ void access$10300(w5 w5Var, int i2) {
    }

    public static /* synthetic */ void access$10400(w5 w5Var) {
    }

    public static /* synthetic */ void access$10500(w5 w5Var, int i2, v6 v6Var) {
    }

    public static /* synthetic */ void access$10600(w5 w5Var, v6 v6Var) {
    }

    public static /* synthetic */ void access$10700(w5 w5Var, int i2, v6 v6Var) {
    }

    public static /* synthetic */ void access$10800(w5 w5Var, Iterable iterable) {
    }

    public static /* synthetic */ void access$10900(w5 w5Var) {
    }

    public static /* synthetic */ void access$11000(w5 w5Var, int i2) {
    }

    public static /* synthetic */ void access$11100(w5 w5Var, String str) {
    }

    public static /* synthetic */ void access$11200(w5 w5Var) {
    }

    public static /* synthetic */ void access$11300(w5 w5Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$11400(w5 w5Var, int i2) {
    }

    public static /* synthetic */ void access$11500(w5 w5Var) {
    }

    public static /* synthetic */ void access$11600(w5 w5Var, String str) {
    }

    public static /* synthetic */ void access$11700(w5 w5Var) {
    }

    public static /* synthetic */ void access$11800(w5 w5Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$11900(w5 w5Var, int i2, z4 z4Var) {
    }

    public static /* synthetic */ void access$12000(w5 w5Var, z4 z4Var) {
    }

    public static /* synthetic */ void access$12100(w5 w5Var, int i2, z4 z4Var) {
    }

    public static /* synthetic */ void access$12200(w5 w5Var, Iterable iterable) {
    }

    public static /* synthetic */ void access$12300(w5 w5Var) {
    }

    public static /* synthetic */ void access$12400(w5 w5Var, int i2) {
    }

    public static /* synthetic */ void access$12500(w5 w5Var, b3 b3Var) {
    }

    public static /* synthetic */ void access$12600(w5 w5Var, b3 b3Var) {
    }

    public static /* synthetic */ void access$12700(w5 w5Var) {
    }

    public static /* synthetic */ void access$12800(w5 w5Var, int i2) {
    }

    public static /* synthetic */ void access$12900(w5 w5Var) {
    }

    public static /* synthetic */ void access$13000(w5 w5Var, q3 q3Var) {
    }

    public static /* synthetic */ void access$13100(w5 w5Var, q3 q3Var) {
    }

    public static /* synthetic */ void access$13200(w5 w5Var) {
    }

    public static /* synthetic */ void access$13300(w5 w5Var, q3 q3Var) {
    }

    public static /* synthetic */ void access$13400(w5 w5Var, q3 q3Var) {
    }

    public static /* synthetic */ void access$13500(w5 w5Var) {
    }

    public static /* synthetic */ void access$13600(w5 w5Var, String str) {
    }

    public static /* synthetic */ void access$13700(w5 w5Var) {
    }

    public static /* synthetic */ void access$13800(w5 w5Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$13900(w5 w5Var, String str) {
    }

    public static /* synthetic */ void access$14000(w5 w5Var) {
    }

    public static /* synthetic */ void access$14100(w5 w5Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$14200(w5 w5Var, q3 q3Var) {
    }

    public static /* synthetic */ void access$14300(w5 w5Var, q3 q3Var) {
    }

    public static /* synthetic */ void access$14400(w5 w5Var) {
    }

    public static /* synthetic */ void access$14500(w5 w5Var, String str) {
    }

    public static /* synthetic */ void access$14600(w5 w5Var) {
    }

    public static /* synthetic */ void access$14700(w5 w5Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$14800(w5 w5Var, String str) {
    }

    public static /* synthetic */ void access$14900(w5 w5Var) {
    }

    public static /* synthetic */ void access$15000(w5 w5Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$15100(w5 w5Var, int i2) {
    }

    public static /* synthetic */ void access$15200(w5 w5Var) {
    }

    public static /* synthetic */ void access$15300(w5 w5Var, b bVar) {
    }

    public static /* synthetic */ void access$15400(w5 w5Var, b bVar) {
    }

    public static /* synthetic */ void access$15500(w5 w5Var) {
    }

    public static /* synthetic */ void access$15600(w5 w5Var, c cVar) {
    }

    public static /* synthetic */ void access$15700(w5 w5Var, c cVar) {
    }

    public static /* synthetic */ void access$15800(w5 w5Var) {
    }

    public static /* synthetic */ void access$15900(w5 w5Var, v6 v6Var) {
    }

    public static /* synthetic */ void access$16000(w5 w5Var, v6 v6Var) {
    }

    public static /* synthetic */ void access$16100(w5 w5Var) {
    }

    public static /* synthetic */ void access$16200(w5 w5Var, int i2) {
    }

    public static /* synthetic */ void access$16300(w5 w5Var) {
    }

    public static /* synthetic */ void access$16400(w5 w5Var, int i2) {
    }

    public static /* synthetic */ void access$16500(w5 w5Var) {
    }

    public static /* synthetic */ void access$16600(w5 w5Var, int i2) {
    }

    public static /* synthetic */ void access$16700(w5 w5Var) {
    }

    public static /* synthetic */ void access$16800(w5 w5Var, int i2) {
    }

    public static /* synthetic */ void access$16900(w5 w5Var) {
    }

    public static /* synthetic */ void access$17000(w5 w5Var, String str) {
    }

    public static /* synthetic */ void access$17100(w5 w5Var) {
    }

    public static /* synthetic */ void access$17200(w5 w5Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$17300(w5 w5Var, q3 q3Var) {
    }

    public static /* synthetic */ void access$17400(w5 w5Var, q3 q3Var) {
    }

    public static /* synthetic */ void access$17500(w5 w5Var) {
    }

    public static /* synthetic */ w5 access$2000() {
    }

    public static /* synthetic */ void access$2100(w5 w5Var, String str) {
    }

    public static /* synthetic */ void access$2200(w5 w5Var) {
    }

    public static /* synthetic */ void access$2300(w5 w5Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$2400(w5 w5Var, String str) {
    }

    public static /* synthetic */ void access$2500(w5 w5Var) {
    }

    public static /* synthetic */ void access$2600(w5 w5Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$2700(w5 w5Var, String str) {
    }

    public static /* synthetic */ void access$2800(w5 w5Var) {
    }

    public static /* synthetic */ void access$2900(w5 w5Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$3000(w5 w5Var, String str) {
    }

    public static /* synthetic */ void access$3100(w5 w5Var) {
    }

    public static /* synthetic */ void access$3200(w5 w5Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$3300(w5 w5Var, String str) {
    }

    public static /* synthetic */ void access$3400(w5 w5Var) {
    }

    public static /* synthetic */ void access$3500(w5 w5Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$3600(w5 w5Var, String str) {
    }

    public static /* synthetic */ void access$3700(w5 w5Var) {
    }

    public static /* synthetic */ void access$3800(w5 w5Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$3900(w5 w5Var, String str) {
    }

    public static /* synthetic */ void access$4000(w5 w5Var) {
    }

    public static /* synthetic */ void access$4100(w5 w5Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$4200(w5 w5Var, int i2) {
    }

    public static /* synthetic */ void access$4300(w5 w5Var) {
    }

    public static /* synthetic */ void access$4400(w5 w5Var, int i2) {
    }

    public static /* synthetic */ void access$4500(w5 w5Var) {
    }

    public static /* synthetic */ void access$4600(w5 w5Var, int i2) {
    }

    public static /* synthetic */ void access$4700(w5 w5Var) {
    }

    public static /* synthetic */ void access$4800(w5 w5Var, String str) {
    }

    public static /* synthetic */ void access$4900(w5 w5Var) {
    }

    public static /* synthetic */ void access$5000(w5 w5Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$5100(w5 w5Var, int i2) {
    }

    public static /* synthetic */ void access$5200(w5 w5Var) {
    }

    public static /* synthetic */ void access$5300(w5 w5Var, int i2) {
    }

    public static /* synthetic */ void access$5400(w5 w5Var) {
    }

    public static /* synthetic */ void access$5500(w5 w5Var, String str) {
    }

    public static /* synthetic */ void access$5600(w5 w5Var) {
    }

    public static /* synthetic */ void access$5700(w5 w5Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$5800(w5 w5Var, int i2) {
    }

    public static /* synthetic */ void access$5900(w5 w5Var) {
    }

    public static /* synthetic */ void access$6000(w5 w5Var, String str) {
    }

    public static /* synthetic */ void access$6100(w5 w5Var) {
    }

    public static /* synthetic */ void access$6200(w5 w5Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$6300(w5 w5Var, int i2) {
    }

    public static /* synthetic */ void access$6400(w5 w5Var) {
    }

    public static /* synthetic */ void access$6500(w5 w5Var, String str) {
    }

    public static /* synthetic */ void access$6600(w5 w5Var) {
    }

    public static /* synthetic */ void access$6700(w5 w5Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$6800(w5 w5Var, int i2) {
    }

    public static /* synthetic */ void access$6900(w5 w5Var) {
    }

    public static /* synthetic */ void access$7000(w5 w5Var, int i2, String str) {
    }

    public static /* synthetic */ void access$7100(w5 w5Var, String str) {
    }

    public static /* synthetic */ void access$7200(w5 w5Var, Iterable iterable) {
    }

    public static /* synthetic */ void access$7300(w5 w5Var) {
    }

    public static /* synthetic */ void access$7400(w5 w5Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$7500(w5 w5Var, int i2) {
    }

    public static /* synthetic */ void access$7600(w5 w5Var) {
    }

    public static /* synthetic */ void access$7700(w5 w5Var, int i2) {
    }

    public static /* synthetic */ void access$7800(w5 w5Var) {
    }

    public static /* synthetic */ void access$7900(w5 w5Var, String str) {
    }

    public static /* synthetic */ void access$8000(w5 w5Var) {
    }

    public static /* synthetic */ void access$8100(w5 w5Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$8200(w5 w5Var, int i2) {
    }

    public static /* synthetic */ void access$8300(w5 w5Var) {
    }

    public static /* synthetic */ void access$8400(w5 w5Var, int i2) {
    }

    public static /* synthetic */ void access$8500(w5 w5Var) {
    }

    public static /* synthetic */ void access$8600(w5 w5Var, int i2, int i3) {
    }

    public static /* synthetic */ void access$8700(w5 w5Var, int i2) {
    }

    public static /* synthetic */ void access$8800(w5 w5Var, Iterable iterable) {
    }

    public static /* synthetic */ void access$8900(w5 w5Var) {
    }

    public static /* synthetic */ void access$9000(w5 w5Var, int i2) {
    }

    public static /* synthetic */ void access$9100(w5 w5Var) {
    }

    public static /* synthetic */ void access$9200(w5 w5Var, int i2) {
    }

    public static /* synthetic */ void access$9300(w5 w5Var) {
    }

    public static /* synthetic */ void access$9400(w5 w5Var, int i2) {
    }

    public static /* synthetic */ void access$9500(w5 w5Var) {
    }

    public static /* synthetic */ void access$9600(w5 w5Var, int i2) {
    }

    public static /* synthetic */ void access$9700(w5 w5Var) {
    }

    public static /* synthetic */ void access$9800(w5 w5Var, String str) {
    }

    public static /* synthetic */ void access$9900(w5 w5Var) {
    }

    private void addAllCategoryId(Iterable<? extends Integer> iterable) {
    }

    private void addAllShareImageinfo(Iterable<? extends z4> iterable) {
    }

    private void addAllTopics(Iterable<? extends v6> iterable) {
    }

    private void addAllVideoId(Iterable<String> iterable) {
    }

    private void addCategoryId(int i2) {
    }

    private void addShareImageinfo(z4 z4Var) {
    }

    private void addTopics(v6 v6Var) {
    }

    private void addVideoId(String str) {
    }

    private void addVideoIdBytes(k.d.c.i iVar) {
    }

    private void clearAdInfo() {
    }

    private void clearAppCoverAuto() {
    }

    private void clearAuthor() {
    }

    private void clearAuthorOpenid() {
    }

    private void clearAutoGenDigest() {
    }

    private void clearBanEditWording() {
    }

    private void clearCanReward() {
    }

    private void clearCategoryId() {
    }

    private void clearContent() {
    }

    private void clearContentUrl() {
    }

    private void clearCoordinate11() {
    }

    private void clearCoordinate169() {
    }

    private void clearCoordinate2351() {
    }

    private void clearCoordinate34() {
    }

    private void clearCopyrightType() {
    }

    private void clearCover() {
    }

    private void clearDigest() {
    }

    private void clearExtraJsonStr() {
    }

    private void clearFinderInfo() {
    }

    private void clearFreeContent() {
    }

    private void clearFuncFlag() {
    }

    private void clearInsertAdMode() {
    }

    private void clearIsBanEdit() {
    }

    private void clearIsCartoonCopyright() {
    }

    private void clearIsPaySubscribe() {
    }

    private void clearItemShowType() {
    }

    private void clearNeedOpenComment() {
    }

    private void clearOnlyCanComment() {
    }

    private void clearOpenFansmsg() {
    }

    private void clearOpenTopic() {
    }

    private void clearOriginalArticleType() {
    }

    private void clearPayAlbumInfo() {
    }

    private void clearPaySubscribeInfo() {
    }

    private void clearPicCdnUrl11() {
    }

    private void clearPicCdnUrl169() {
    }

    private void clearPicCdnUrl2351() {
    }

    private void clearPicCdnUrl34() {
    }

    private void clearPicCdnUrlBack() {
    }

    private void clearPlatform() {
    }

    private void clearPlayLength() {
    }

    private void clearReleaseFirst() {
    }

    private void clearReleaseTime() {
    }

    private void clearReplyFlag() {
    }

    private void clearReprintAllowEdit() {
    }

    private void clearReprintPermitType() {
    }

    private void clearReprintStyle() {
    }

    private void clearReprintType() {
    }

    private void clearRewardWording() {
    }

    private void clearSaveResultMsg() {
    }

    private void clearShareImageinfo() {
    }

    private void clearSharePageType() {
    }

    private void clearShowCoverPic() {
    }

    private void clearSourceReprintStatus() {
    }

    private void clearSourceUrl() {
    }

    private void clearTitle() {
    }

    private void clearTopics() {
    }

    private void clearVideoId() {
    }

    private void ensureCategoryIdIsMutable() {
    }

    private void ensureShareImageinfoIsMutable() {
    }

    private void ensureTopicsIsMutable() {
    }

    private void ensureVideoIdIsMutable() {
    }

    public static w5 getDefaultInstance() {
    }

    private void mergeAdInfo(b3 b3Var) {
    }

    private void mergeCoordinate11(q3 q3Var) {
    }

    private void mergeCoordinate169(q3 q3Var) {
    }

    private void mergeCoordinate2351(q3 q3Var) {
    }

    private void mergeCoordinate34(q3 q3Var) {
    }

    private void mergeFinderInfo(b bVar) {
    }

    private void mergePayAlbumInfo(v6 v6Var) {
    }

    private void mergePaySubscribeInfo(c cVar) {
    }

    public static a newBuilder() {
    }

    public static w5 parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static w5 parseFrom(ByteBuffer byteBuffer) throws k.d.c.c0 {
    }

    public static k.d.c.b1<w5> parser() {
    }

    private void removeShareImageinfo(int i2) {
    }

    private void removeTopics(int i2) {
    }

    private void setAdInfo(b3 b3Var) {
    }

    private void setAppCoverAuto(int i2) {
    }

    private void setAuthor(String str) {
    }

    private void setAuthorBytes(k.d.c.i iVar) {
    }

    private void setAuthorOpenid(String str) {
    }

    private void setAuthorOpenidBytes(k.d.c.i iVar) {
    }

    private void setAutoGenDigest(int i2) {
    }

    private void setBanEditWording(String str) {
    }

    private void setBanEditWordingBytes(k.d.c.i iVar) {
    }

    private void setCanReward(int i2) {
    }

    private void setCategoryId(int i2, int i3) {
    }

    private void setContent(String str) {
    }

    private void setContentBytes(k.d.c.i iVar) {
    }

    private void setContentUrl(String str) {
    }

    private void setContentUrlBytes(k.d.c.i iVar) {
    }

    private void setCoordinate11(q3 q3Var) {
    }

    private void setCoordinate169(q3 q3Var) {
    }

    private void setCoordinate2351(q3 q3Var) {
    }

    private void setCoordinate34(q3 q3Var) {
    }

    private void setCopyrightType(int i2) {
    }

    private void setCover(String str) {
    }

    private void setCoverBytes(k.d.c.i iVar) {
    }

    private void setDigest(String str) {
    }

    private void setDigestBytes(k.d.c.i iVar) {
    }

    private void setExtraJsonStr(String str) {
    }

    private void setExtraJsonStrBytes(k.d.c.i iVar) {
    }

    private void setFinderInfo(b bVar) {
    }

    private void setFreeContent(String str) {
    }

    private void setFreeContentBytes(k.d.c.i iVar) {
    }

    private void setFuncFlag(int i2) {
    }

    private void setInsertAdMode(int i2) {
    }

    private void setIsBanEdit(int i2) {
    }

    private void setIsCartoonCopyright(int i2) {
    }

    private void setIsPaySubscribe(int i2) {
    }

    private void setItemShowType(int i2) {
    }

    private void setNeedOpenComment(int i2) {
    }

    private void setOnlyCanComment(int i2) {
    }

    private void setOpenFansmsg(int i2) {
    }

    private void setOpenTopic(int i2) {
    }

    private void setOriginalArticleType(String str) {
    }

    private void setOriginalArticleTypeBytes(k.d.c.i iVar) {
    }

    private void setPayAlbumInfo(v6 v6Var) {
    }

    private void setPaySubscribeInfo(c cVar) {
    }

    private void setPicCdnUrl11(String str) {
    }

    private void setPicCdnUrl11Bytes(k.d.c.i iVar) {
    }

    private void setPicCdnUrl169(String str) {
    }

    private void setPicCdnUrl169Bytes(k.d.c.i iVar) {
    }

    private void setPicCdnUrl2351(String str) {
    }

    private void setPicCdnUrl2351Bytes(k.d.c.i iVar) {
    }

    private void setPicCdnUrl34(String str) {
    }

    private void setPicCdnUrl34Bytes(k.d.c.i iVar) {
    }

    private void setPicCdnUrlBack(String str) {
    }

    private void setPicCdnUrlBackBytes(k.d.c.i iVar) {
    }

    private void setPlatform(String str) {
    }

    private void setPlatformBytes(k.d.c.i iVar) {
    }

    private void setPlayLength(int i2) {
    }

    private void setReleaseFirst(int i2) {
    }

    private void setReleaseTime(int i2) {
    }

    private void setReplyFlag(int i2) {
    }

    private void setReprintAllowEdit(int i2) {
    }

    private void setReprintPermitType(int i2) {
    }

    private void setReprintStyle(int i2) {
    }

    private void setReprintType(int i2) {
    }

    private void setRewardWording(String str) {
    }

    private void setRewardWordingBytes(k.d.c.i iVar) {
    }

    private void setSaveResultMsg(String str) {
    }

    private void setSaveResultMsgBytes(k.d.c.i iVar) {
    }

    private void setShareImageinfo(int i2, z4 z4Var) {
    }

    private void setSharePageType(int i2) {
    }

    private void setShowCoverPic(int i2) {
    }

    private void setSourceReprintStatus(int i2) {
    }

    private void setSourceUrl(String str) {
    }

    private void setSourceUrlBytes(k.d.c.i iVar) {
    }

    private void setTitle(String str) {
    }

    private void setTitleBytes(k.d.c.i iVar) {
    }

    private void setTopics(int i2, v6 v6Var) {
    }

    private void setVideoId(int i2, String str) {
    }

    @Override // k.d.c.z
    public final Object dynamicMethod(z.g gVar, Object obj, Object obj2) {
    }

    public b3 getAdInfo() {
    }

    public int getAppCoverAuto() {
    }

    public String getAuthor() {
    }

    public k.d.c.i getAuthorBytes() {
    }

    public String getAuthorOpenid() {
    }

    public k.d.c.i getAuthorOpenidBytes() {
    }

    public int getAutoGenDigest() {
    }

    public String getBanEditWording() {
    }

    public k.d.c.i getBanEditWordingBytes() {
    }

    public int getCanReward() {
    }

    public int getCategoryId(int i2) {
    }

    public int getCategoryIdCount() {
    }

    public List<Integer> getCategoryIdList() {
    }

    public String getContent() {
    }

    public k.d.c.i getContentBytes() {
    }

    public String getContentUrl() {
    }

    public k.d.c.i getContentUrlBytes() {
    }

    public q3 getCoordinate11() {
    }

    public q3 getCoordinate169() {
    }

    public q3 getCoordinate2351() {
    }

    public q3 getCoordinate34() {
    }

    public int getCopyrightType() {
    }

    public String getCover() {
    }

    public k.d.c.i getCoverBytes() {
    }

    public String getDigest() {
    }

    public k.d.c.i getDigestBytes() {
    }

    public String getExtraJsonStr() {
    }

    public k.d.c.i getExtraJsonStrBytes() {
    }

    public b getFinderInfo() {
    }

    public String getFreeContent() {
    }

    public k.d.c.i getFreeContentBytes() {
    }

    public int getFuncFlag() {
    }

    public int getInsertAdMode() {
    }

    public int getIsBanEdit() {
    }

    public int getIsCartoonCopyright() {
    }

    public int getIsPaySubscribe() {
    }

    public int getItemShowType() {
    }

    public int getNeedOpenComment() {
    }

    public int getOnlyCanComment() {
    }

    public int getOpenFansmsg() {
    }

    public int getOpenTopic() {
    }

    public String getOriginalArticleType() {
    }

    public k.d.c.i getOriginalArticleTypeBytes() {
    }

    public v6 getPayAlbumInfo() {
    }

    public c getPaySubscribeInfo() {
    }

    public String getPicCdnUrl11() {
    }

    public k.d.c.i getPicCdnUrl11Bytes() {
    }

    public String getPicCdnUrl169() {
    }

    public k.d.c.i getPicCdnUrl169Bytes() {
    }

    public String getPicCdnUrl2351() {
    }

    public k.d.c.i getPicCdnUrl2351Bytes() {
    }

    public String getPicCdnUrl34() {
    }

    public k.d.c.i getPicCdnUrl34Bytes() {
    }

    public String getPicCdnUrlBack() {
    }

    public k.d.c.i getPicCdnUrlBackBytes() {
    }

    public String getPlatform() {
    }

    public k.d.c.i getPlatformBytes() {
    }

    public int getPlayLength() {
    }

    public int getReleaseFirst() {
    }

    public int getReleaseTime() {
    }

    public int getReplyFlag() {
    }

    public int getReprintAllowEdit() {
    }

    public int getReprintPermitType() {
    }

    public int getReprintStyle() {
    }

    public int getReprintType() {
    }

    public String getRewardWording() {
    }

    public k.d.c.i getRewardWordingBytes() {
    }

    public String getSaveResultMsg() {
    }

    public k.d.c.i getSaveResultMsgBytes() {
    }

    public z4 getShareImageinfo(int i2) {
    }

    public int getShareImageinfoCount() {
    }

    public List<z4> getShareImageinfoList() {
    }

    public a5 getShareImageinfoOrBuilder(int i2) {
    }

    public List<? extends a5> getShareImageinfoOrBuilderList() {
    }

    public int getSharePageType() {
    }

    public int getShowCoverPic() {
    }

    public int getSourceReprintStatus() {
    }

    public String getSourceUrl() {
    }

    public k.d.c.i getSourceUrlBytes() {
    }

    public String getTitle() {
    }

    public k.d.c.i getTitleBytes() {
    }

    public v6 getTopics(int i2) {
    }

    public int getTopicsCount() {
    }

    public List<v6> getTopicsList() {
    }

    public w6 getTopicsOrBuilder(int i2) {
    }

    public List<? extends w6> getTopicsOrBuilderList() {
    }

    public String getVideoId(int i2) {
    }

    public k.d.c.i getVideoIdBytes(int i2) {
    }

    public int getVideoIdCount() {
    }

    public List<String> getVideoIdList() {
    }

    public boolean hasAdInfo() {
    }

    public boolean hasAppCoverAuto() {
    }

    public boolean hasAuthor() {
    }

    public boolean hasAuthorOpenid() {
    }

    public boolean hasAutoGenDigest() {
    }

    public boolean hasBanEditWording() {
    }

    public boolean hasCanReward() {
    }

    public boolean hasContent() {
    }

    public boolean hasContentUrl() {
    }

    public boolean hasCoordinate11() {
    }

    public boolean hasCoordinate169() {
    }

    public boolean hasCoordinate2351() {
    }

    public boolean hasCoordinate34() {
    }

    public boolean hasCopyrightType() {
    }

    public boolean hasCover() {
    }

    public boolean hasDigest() {
    }

    public boolean hasExtraJsonStr() {
    }

    public boolean hasFinderInfo() {
    }

    public boolean hasFreeContent() {
    }

    public boolean hasFuncFlag() {
    }

    public boolean hasInsertAdMode() {
    }

    public boolean hasIsBanEdit() {
    }

    public boolean hasIsCartoonCopyright() {
    }

    public boolean hasIsPaySubscribe() {
    }

    public boolean hasItemShowType() {
    }

    public boolean hasNeedOpenComment() {
    }

    public boolean hasOnlyCanComment() {
    }

    public boolean hasOpenFansmsg() {
    }

    public boolean hasOpenTopic() {
    }

    public boolean hasOriginalArticleType() {
    }

    public boolean hasPayAlbumInfo() {
    }

    public boolean hasPaySubscribeInfo() {
    }

    public boolean hasPicCdnUrl11() {
    }

    public boolean hasPicCdnUrl169() {
    }

    public boolean hasPicCdnUrl2351() {
    }

    public boolean hasPicCdnUrl34() {
    }

    public boolean hasPicCdnUrlBack() {
    }

    public boolean hasPlatform() {
    }

    public boolean hasPlayLength() {
    }

    public boolean hasReleaseFirst() {
    }

    public boolean hasReleaseTime() {
    }

    public boolean hasReplyFlag() {
    }

    public boolean hasReprintAllowEdit() {
    }

    public boolean hasReprintPermitType() {
    }

    public boolean hasReprintStyle() {
    }

    public boolean hasReprintType() {
    }

    public boolean hasRewardWording() {
    }

    public boolean hasSaveResultMsg() {
    }

    public boolean hasSharePageType() {
    }

    public boolean hasShowCoverPic() {
    }

    public boolean hasSourceReprintStatus() {
    }

    public boolean hasSourceUrl() {
    }

    public boolean hasTitle() {
    }

    public static a newBuilder(w5 w5Var) {
    }

    public static w5 parseDelimitedFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
    }

    public static w5 parseFrom(ByteBuffer byteBuffer, k.d.c.q qVar) throws k.d.c.c0 {
    }

    public static w5 parseFrom(k.d.c.i iVar) throws k.d.c.c0 {
    }

    private void addShareImageinfo(int i2, z4 z4Var) {
    }

    private void addTopics(int i2, v6 v6Var) {
    }

    public static w5 parseFrom(k.d.c.i iVar, k.d.c.q qVar) throws k.d.c.c0 {
    }

    public static w5 parseFrom(byte[] bArr) throws k.d.c.c0 {
    }

    public static w5 parseFrom(byte[] bArr, k.d.c.q qVar) throws k.d.c.c0 {
    }

    public static w5 parseFrom(InputStream inputStream) throws IOException {
    }

    public static w5 parseFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
    }

    public static w5 parseFrom(k.d.c.j jVar) throws IOException {
    }

    public static w5 parseFrom(k.d.c.j jVar, k.d.c.q qVar) throws IOException {
    }
}
