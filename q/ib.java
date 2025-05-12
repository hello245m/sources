package q;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import k.d.c.b0;
import k.d.c.z;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
public final class ib extends k.d.c.z<ib, a> implements kb {
    public static final int APP_MSG_TYPE_FIELD_NUMBER = 76;
    public static final int BAN_FORWARD_FIELD_NUMBER = 44;
    public static final int BAN_MOMENTS_FIELD_NUMBER = 45;
    public static final int BASE_INFO_TYPE_FIELD_NUMBER = 46;
    public static final int CAN_COMMENT_FIELD_NUMBER = 16;
    public static final int CAN_DELETE_STATUS_FIELD_NUMBER = 36;
    public static final int CAN_REWARD_FIELD_NUMBER = 7;
    public static final int COMMENT_COUNT_FIELD_NUMBER = 21;
    public static final int COMMENT_ID_FIELD_NUMBER = 10;
    public static final int COMMENT_NUM_FIELD_NUMBER = 11;
    public static final int COMMENT_READ_FIELD_NUMBER = 24;
    public static final int CONTENT_FIELD_NUMBER = 17;
    public static final int COPYRIGHT_STATUS_FIELD_NUMBER = 12;
    public static final int COVER_FIELD_NUMBER = 3;
    public static final int CREATE_DATE_FIELD_NUMBER = 79;
    public static final int CREATE_TIME_FIELD_NUMBER = 20;
    public static final int DANMU_NUM_FIELD_NUMBER = 68;
    private static final ib DEFAULT_INSTANCE = null;
    public static final int DELETED_FIELD_NUMBER = 13;
    public static final int DELETED_TYPE_FIELD_NUMBER = 87;
    public static final int DEL_FLAG_FIELD_NUMBER = 50;
    public static final int DIGEST_FIELD_NUMBER = 29;
    public static final int DRAFT_MID_FIELD_NUMBER = 86;
    public static final int EXTRA_JSON_STR_FIELD_NUMBER = 89;
    public static final int FANSMSGNUM_FIELD_NUMBER = 85;
    public static final int FAN_MSG_INFO_FIELD_NUMBER = 77;
    public static final int FEATURED_INFO_FIELD_NUMBER = 88;
    public static final int FINDER_STAT_INFO_FIELD_NUMBER = 90;
    public static final int HAS_AUTHOR_FIELD_NUMBER = 34;
    public static final int HIGHLIGHT_CONTENT_FIELD_NUMBER = 52;
    public static final int HIGHLIGHT_TITLE_FIELD_NUMBER = 51;
    public static final int IDX_FIELD_NUMBER = 2;
    public static final int INTERACTION_TIME_FIELD_NUMBER = 19;
    public static final int IS_FAKE_SEQUENCE_FIELD_NUMBER = 75;
    public static final int IS_OPEN_DANMU_FIELD_NUMBER = 69;
    public static final int IS_PAYREAD_FIELD_NUMBER = 61;
    public static final int ITEM_SHOW_TYPE_FIELD_NUMBER = 32;
    public static final int LAST_TYPE_FIELD_NUMBER = 28;
    public static final int LIKE_ICON_FIELD_NUMBER = 38;
    public static final int LIKE_NUM_FIELD_NUMBER = 6;
    public static final int LIKE_TYPE_FIELD_NUMBER = 39;
    public static final int MASSSEND_STATUS_FIELD_NUMBER = 40;
    public static final int MASSSEND_STATUS_TYPE_FIELD_NUMBER = 41;
    public static final int MID_FIELD_NUMBER = 1;
    public static final int MID_IDX_FIELD_NUMBER = 78;
    public static final int MODIFY_STATUS_FIELD_NUMBER = 30;
    public static final int MODIFY_TIME_FIELD_NUMBER = 31;
    public static final int NOT_OPERATOR_FIELD_NUMBER = 33;
    public static final int OLD_LIKE_NUM_FIELD_NUMBER = 60;
    public static final int ONLY_CAN_COMMENT_FIELD_NUMBER = 59;
    public static final int OPEN_COMMENT_FIELD_NUMBER = 73;
    public static final int OPEN_FANSMSG_FIELD_NUMBER = 84;
    public static final int OPEN_REWARD_FIELD_NUMBER = 35;
    public static final int OPEN_TOPIC_FIELD_NUMBER = 80;
    public static final int ORI_STATUS_FIELD_NUMBER = 48;
    private static volatile k.d.c.b1<ib> PARSER = null;
    public static final int PAYREAD_COUNT_FIELD_NUMBER = 62;
    public static final int PAYREAD_ID_FIELD_NUMBER = 66;
    public static final int PAYREAD_MONEY_FIELD_NUMBER = 65;
    public static final int PAYREAD_READ_TIME_FIELD_NUMBER = 64;
    public static final int PAYREAD_UNREAD_FIELD_NUMBER = 63;
    public static final int PAY_FINISH_TIME_READ_FIELD_NUMBER = 27;
    public static final int PAY_SUBSCRIBE_DESC_FIELD_NUMBER = 83;
    public static final int QNA_ANSWER_CNT_FIELD_NUMBER = 71;
    public static final int QNA_NEW_MSG_CNT_FIELD_NUMBER = 72;
    public static final int QNA_QUESTION_ID_FIELD_NUMBER = 70;
    public static final int READ_NUM_FIELD_NUMBER = 5;
    public static final int REJECT_MASSSEND_FIELD_NUMBER = 37;
    public static final int REPLY_FLAG_FIELD_NUMBER = 74;
    public static final int REWARD_COUNT_FIELD_NUMBER = 22;
    public static final int REWARD_ID_FIELD_NUMBER = 14;
    public static final int REWARD_MONEY_FIELD_NUMBER = 9;
    public static final int REWARD_NUM_FIELD_NUMBER = 8;
    public static final int REWARD_READ_FIELD_NUMBER = 25;
    public static final int SEND_TIME_FIELD_NUMBER = 82;
    public static final int SEQUENCE_FIELD_NUMBER = 18;
    public static final int STAT_DATA_FIELD_NUMBER = 43;
    public static final int TEXT_BLOCK_FIELD_NUMBER = 47;
    public static final int TITLE_DIGEST_TYPE_FIELD_NUMBER = 42;
    public static final int TITLE_FIELD_NUMBER = 4;
    public static final int TOPIC_ID_FIELD_NUMBER = 81;
    public static final int TOP_TITLE_FIELD_NUMBER = 49;
    public static final int UNREAD_COMMENT_NUM_FIELD_NUMBER = 54;
    public static final int UNREAD_DANMU_NUM_FIELD_NUMBER = 67;
    public static final int UPDATE_SEQUENCE_FIELD_NUMBER = 58;
    public static final int URL_FIELD_NUMBER = 15;
    public static final int USER_COMMENT_ID_READ_FIELD_NUMBER = 26;
    public static final int USER_COMMENT_READ_TIME_FIELD_NUMBER = 53;
    public static final int VIDEO_ID_FIELD_NUMBER = 23;
    public static final int WHISPER_COUNT_FIELD_NUMBER = 55;
    public static final int WHISPER_READ_TIME_FIELD_NUMBER = 57;
    public static final int WHISPER_UNREAD_FIELD_NUMBER = 56;
    private int appMsgType_;
    private int banForward_;
    private int banMoments_;
    private int baseInfoType_;
    private int bitField0_;
    private int bitField1_;
    private int bitField2_;
    private int canComment_;
    private int canDeleteStatus_;
    private int canReward_;
    private int commentCount_;
    private long commentId_;
    private int commentNum_;
    private int commentRead_;
    private String content_;
    private int copyrightStatus_;
    private String cover_;
    private String createDate_;
    private int createTime_;
    private int danmuNum_;
    private int delFlag_;
    private int deletedType_;
    private int deleted_;
    private String digest_;
    private int draftMid_;
    private String extraJsonStr_;
    private b fanMsgInfo_;
    private int fansmsgnum_;
    private v8 featuredInfo_;
    private c finderStatInfo_;
    private int hasAuthor_;
    private String highlightContent_;
    private String highlightTitle_;
    private int idx_;
    private int interactionTime_;
    private boolean isFakeSequence_;
    private boolean isOpenDanmu_;
    private boolean isPayread_;
    private int itemShowType_;
    private int lastType_;
    private String likeIcon_;
    private int likeNum_;
    private int likeType_;
    private int masssendStatusType_;
    private String masssendStatus_;
    private String midIdx_;
    private int mid_;
    private int modifyStatus_;
    private int modifyTime_;
    private int notOperator_;
    private int oldLikeNum_;
    private int onlyCanComment_;
    private int openComment_;
    private int openFansmsg_;
    private int openReward_;
    private int openTopic_;
    private int oriStatus_;
    private int payFinishTimeRead_;
    private String paySubscribeDesc_;
    private int payreadCount_;
    private long payreadId_;
    private int payreadMoney_;
    private int payreadReadTime_;
    private int payreadUnread_;
    private int qnaAnswerCnt_;
    private int qnaNewMsgCnt_;
    private k.d.c.i qnaQuestionId_;
    private int readNum_;
    private int rejectMasssend_;
    private int replyFlag_;
    private int rewardCount_;
    private long rewardId_;
    private int rewardMoney_;
    private int rewardNum_;
    private int rewardRead_;
    private int sendTime_;
    private long sequence_;
    private int statData_;
    private b0.i<xb> textBlock_;
    private int titleDigestType_;
    private String title_;
    private String topTitle_;
    private b0.h topicId_;
    private int unreadCommentNum_;
    private int unreadDanmuNum_;
    private long updateSequence_;
    private String url_;
    private int userCommentIdRead_;
    private int userCommentReadTime_;
    private b0.i<String> videoId_;
    private int whisperCount_;
    private int whisperReadTime_;
    private int whisperUnread_;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static final class a extends z.b<ib, a> implements kb {
        public /* synthetic */ a(k6 k6Var) {
        }

        public a A(String str) {
        }

        public a B(int i2) {
        }

        public a C(String str) {
        }

        public a D(b bVar) {
        }

        public a E(int i2) {
        }

        public a F(int i2) {
        }

        public a G(int i2) {
        }

        public a H(int i2) {
        }

        public a I(int i2) {
        }

        public a J(int i2) {
        }

        public a K(int i2) {
        }

        public a M(String str) {
        }

        public a N(String str) {
        }

        public a v(Iterable<? extends Long> iterable) {
        }

        public a w(int i2) {
        }

        public a x(int i2) {
        }

        public a y(String str) {
        }

        public a z(int i2) {
        }

        public a() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static final class b extends k.d.c.z<b, a> implements Object {
        private static final b DEFAULT_INSTANCE = null;
        private static volatile k.d.c.b1<b> PARSER = null;
        public static final int UNREAD_MSG_CNT_FIELD_NUMBER = 1;
        private int bitField0_;
        private int unreadMsgCnt_;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
        public static final class a extends z.b<b, a> implements Object {
            public /* synthetic */ a(k6 k6Var) {
            }

            public a v(int i2) {
            }

            public a() {
            }
        }

        private b() {
        }

        public static /* synthetic */ b access$11700() {
        }

        public static /* synthetic */ void access$11800(b bVar, int i2) {
        }

        public static /* synthetic */ void access$11900(b bVar) {
        }

        private void clearUnreadMsgCnt() {
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

        private void setUnreadMsgCnt(int i2) {
        }

        @Override // k.d.c.z
        public final Object dynamicMethod(z.g gVar, Object obj, Object obj2) {
        }

        public int getUnreadMsgCnt() {
        }

        public boolean hasUnreadMsgCnt() {
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
        public static final int FAV_NUM_FIELD_NUMBER = 3;
        public static final int LIKE_NUM_FIELD_NUMBER = 2;
        private static volatile k.d.c.b1<c> PARSER = null;
        public static final int USE_FINDER_STAT_FIELD_NUMBER = 1;
        private int bitField0_;
        private int favNum_;
        private long likeNum_;
        private boolean useFinderStat_;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
        public static final class a extends z.b<c, a> implements Object {
            public /* synthetic */ a(k6 k6Var) {
            }

            public a() {
            }
        }

        private c() {
        }

        public static /* synthetic */ c access$12100() {
        }

        public static /* synthetic */ void access$12200(c cVar, boolean z) {
        }

        public static /* synthetic */ void access$12300(c cVar) {
        }

        public static /* synthetic */ void access$12400(c cVar, long j2) {
        }

        public static /* synthetic */ void access$12500(c cVar) {
        }

        public static /* synthetic */ void access$12600(c cVar, int i2) {
        }

        public static /* synthetic */ void access$12700(c cVar) {
        }

        private void clearFavNum() {
        }

        private void clearLikeNum() {
        }

        private void clearUseFinderStat() {
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

        private void setFavNum(int i2) {
        }

        private void setLikeNum(long j2) {
        }

        private void setUseFinderStat(boolean z) {
        }

        @Override // k.d.c.z
        public final Object dynamicMethod(z.g gVar, Object obj, Object obj2) {
        }

        public int getFavNum() {
        }

        public long getLikeNum() {
        }

        public boolean getUseFinderStat() {
        }

        public boolean hasFavNum() {
        }

        public boolean hasLikeNum() {
        }

        public boolean hasUseFinderStat() {
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

    private ib() {
    }

    public static /* synthetic */ ib access$12900() {
    }

    public static /* synthetic */ void access$13000(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$13100(ib ibVar) {
    }

    public static /* synthetic */ void access$13200(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$13300(ib ibVar) {
    }

    public static /* synthetic */ void access$13400(ib ibVar, String str) {
    }

    public static /* synthetic */ void access$13500(ib ibVar) {
    }

    public static /* synthetic */ void access$13600(ib ibVar, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$13700(ib ibVar, String str) {
    }

    public static /* synthetic */ void access$13800(ib ibVar) {
    }

    public static /* synthetic */ void access$13900(ib ibVar, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$14000(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$14100(ib ibVar) {
    }

    public static /* synthetic */ void access$14200(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$14300(ib ibVar) {
    }

    public static /* synthetic */ void access$14400(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$14500(ib ibVar) {
    }

    public static /* synthetic */ void access$14600(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$14700(ib ibVar) {
    }

    public static /* synthetic */ void access$14800(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$14900(ib ibVar) {
    }

    public static /* synthetic */ void access$15000(ib ibVar, long j2) {
    }

    public static /* synthetic */ void access$15100(ib ibVar) {
    }

    public static /* synthetic */ void access$15200(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$15300(ib ibVar) {
    }

    public static /* synthetic */ void access$15400(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$15500(ib ibVar) {
    }

    public static /* synthetic */ void access$15600(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$15700(ib ibVar) {
    }

    public static /* synthetic */ void access$15800(ib ibVar, long j2) {
    }

    public static /* synthetic */ void access$15900(ib ibVar) {
    }

    public static /* synthetic */ void access$16000(ib ibVar, String str) {
    }

    public static /* synthetic */ void access$16100(ib ibVar) {
    }

    public static /* synthetic */ void access$16200(ib ibVar, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$16300(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$16400(ib ibVar) {
    }

    public static /* synthetic */ void access$16500(ib ibVar, String str) {
    }

    public static /* synthetic */ void access$16600(ib ibVar) {
    }

    public static /* synthetic */ void access$16700(ib ibVar, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$16800(ib ibVar, long j2) {
    }

    public static /* synthetic */ void access$16900(ib ibVar) {
    }

    public static /* synthetic */ void access$17000(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$17100(ib ibVar) {
    }

    public static /* synthetic */ void access$17200(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$17300(ib ibVar) {
    }

    public static /* synthetic */ void access$17400(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$17500(ib ibVar) {
    }

    public static /* synthetic */ void access$17600(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$17700(ib ibVar) {
    }

    public static /* synthetic */ void access$17800(ib ibVar, int i2, String str) {
    }

    public static /* synthetic */ void access$17900(ib ibVar, String str) {
    }

    public static /* synthetic */ void access$18000(ib ibVar, Iterable iterable) {
    }

    public static /* synthetic */ void access$18100(ib ibVar) {
    }

    public static /* synthetic */ void access$18200(ib ibVar, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$18300(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$18400(ib ibVar) {
    }

    public static /* synthetic */ void access$18500(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$18600(ib ibVar) {
    }

    public static /* synthetic */ void access$18700(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$18800(ib ibVar) {
    }

    public static /* synthetic */ void access$18900(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$19000(ib ibVar) {
    }

    public static /* synthetic */ void access$19100(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$19200(ib ibVar) {
    }

    public static /* synthetic */ void access$19300(ib ibVar, String str) {
    }

    public static /* synthetic */ void access$19400(ib ibVar) {
    }

    public static /* synthetic */ void access$19500(ib ibVar, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$19600(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$19700(ib ibVar) {
    }

    public static /* synthetic */ void access$19800(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$19900(ib ibVar) {
    }

    public static /* synthetic */ void access$20000(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$20100(ib ibVar) {
    }

    public static /* synthetic */ void access$20200(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$20300(ib ibVar) {
    }

    public static /* synthetic */ void access$20400(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$20500(ib ibVar) {
    }

    public static /* synthetic */ void access$20600(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$20700(ib ibVar) {
    }

    public static /* synthetic */ void access$20800(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$20900(ib ibVar) {
    }

    public static /* synthetic */ void access$21000(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$21100(ib ibVar) {
    }

    public static /* synthetic */ void access$21200(ib ibVar, String str) {
    }

    public static /* synthetic */ void access$21300(ib ibVar) {
    }

    public static /* synthetic */ void access$21400(ib ibVar, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$21500(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$21600(ib ibVar) {
    }

    public static /* synthetic */ void access$21700(ib ibVar, String str) {
    }

    public static /* synthetic */ void access$21800(ib ibVar) {
    }

    public static /* synthetic */ void access$21900(ib ibVar, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$22000(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$22100(ib ibVar) {
    }

    public static /* synthetic */ void access$22200(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$22300(ib ibVar) {
    }

    public static /* synthetic */ void access$22400(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$22500(ib ibVar) {
    }

    public static /* synthetic */ void access$22600(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$22700(ib ibVar) {
    }

    public static /* synthetic */ void access$22800(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$22900(ib ibVar) {
    }

    public static /* synthetic */ void access$23000(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$23100(ib ibVar) {
    }

    public static /* synthetic */ void access$23200(ib ibVar, int i2, xb xbVar) {
    }

    public static /* synthetic */ void access$23300(ib ibVar, xb xbVar) {
    }

    public static /* synthetic */ void access$23400(ib ibVar, int i2, xb xbVar) {
    }

    public static /* synthetic */ void access$23500(ib ibVar, Iterable iterable) {
    }

    public static /* synthetic */ void access$23600(ib ibVar) {
    }

    public static /* synthetic */ void access$23700(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$23800(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$23900(ib ibVar) {
    }

    public static /* synthetic */ void access$24000(ib ibVar, String str) {
    }

    public static /* synthetic */ void access$24100(ib ibVar) {
    }

    public static /* synthetic */ void access$24200(ib ibVar, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$24300(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$24400(ib ibVar) {
    }

    public static /* synthetic */ void access$24500(ib ibVar, String str) {
    }

    public static /* synthetic */ void access$24600(ib ibVar) {
    }

    public static /* synthetic */ void access$24700(ib ibVar, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$24800(ib ibVar, String str) {
    }

    public static /* synthetic */ void access$24900(ib ibVar) {
    }

    public static /* synthetic */ void access$25000(ib ibVar, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$25100(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$25200(ib ibVar) {
    }

    public static /* synthetic */ void access$25300(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$25400(ib ibVar) {
    }

    public static /* synthetic */ void access$25500(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$25600(ib ibVar) {
    }

    public static /* synthetic */ void access$25700(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$25800(ib ibVar) {
    }

    public static /* synthetic */ void access$25900(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$26000(ib ibVar) {
    }

    public static /* synthetic */ void access$26100(ib ibVar, long j2) {
    }

    public static /* synthetic */ void access$26200(ib ibVar) {
    }

    public static /* synthetic */ void access$26300(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$26400(ib ibVar) {
    }

    public static /* synthetic */ void access$26500(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$26600(ib ibVar) {
    }

    public static /* synthetic */ void access$26700(ib ibVar, boolean z) {
    }

    public static /* synthetic */ void access$26800(ib ibVar) {
    }

    public static /* synthetic */ void access$26900(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$27000(ib ibVar) {
    }

    public static /* synthetic */ void access$27100(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$27200(ib ibVar) {
    }

    public static /* synthetic */ void access$27300(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$27400(ib ibVar) {
    }

    public static /* synthetic */ void access$27500(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$27600(ib ibVar) {
    }

    public static /* synthetic */ void access$27700(ib ibVar, long j2) {
    }

    public static /* synthetic */ void access$27800(ib ibVar) {
    }

    public static /* synthetic */ void access$27900(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$28000(ib ibVar) {
    }

    public static /* synthetic */ void access$28100(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$28200(ib ibVar) {
    }

    public static /* synthetic */ void access$28300(ib ibVar, boolean z) {
    }

    public static /* synthetic */ void access$28400(ib ibVar) {
    }

    public static /* synthetic */ void access$28500(ib ibVar, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$28600(ib ibVar) {
    }

    public static /* synthetic */ void access$28700(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$28800(ib ibVar) {
    }

    public static /* synthetic */ void access$28900(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$29000(ib ibVar) {
    }

    public static /* synthetic */ void access$29100(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$29200(ib ibVar) {
    }

    public static /* synthetic */ void access$29300(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$29400(ib ibVar) {
    }

    public static /* synthetic */ void access$29500(ib ibVar, boolean z) {
    }

    public static /* synthetic */ void access$29600(ib ibVar) {
    }

    public static /* synthetic */ void access$29700(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$29800(ib ibVar) {
    }

    public static /* synthetic */ void access$29900(ib ibVar, b bVar) {
    }

    public static /* synthetic */ void access$30000(ib ibVar, b bVar) {
    }

    public static /* synthetic */ void access$30100(ib ibVar) {
    }

    public static /* synthetic */ void access$30200(ib ibVar, String str) {
    }

    public static /* synthetic */ void access$30300(ib ibVar) {
    }

    public static /* synthetic */ void access$30400(ib ibVar, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$30500(ib ibVar, String str) {
    }

    public static /* synthetic */ void access$30600(ib ibVar) {
    }

    public static /* synthetic */ void access$30700(ib ibVar, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$30800(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$30900(ib ibVar) {
    }

    public static /* synthetic */ void access$31000(ib ibVar, int i2, long j2) {
    }

    public static /* synthetic */ void access$31100(ib ibVar, long j2) {
    }

    public static /* synthetic */ void access$31200(ib ibVar, Iterable iterable) {
    }

    public static /* synthetic */ void access$31300(ib ibVar) {
    }

    public static /* synthetic */ void access$31400(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$31500(ib ibVar) {
    }

    public static /* synthetic */ void access$31600(ib ibVar, String str) {
    }

    public static /* synthetic */ void access$31700(ib ibVar) {
    }

    public static /* synthetic */ void access$31800(ib ibVar, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$31900(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$32000(ib ibVar) {
    }

    public static /* synthetic */ void access$32100(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$32200(ib ibVar) {
    }

    public static /* synthetic */ void access$32300(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$32400(ib ibVar) {
    }

    public static /* synthetic */ void access$32500(ib ibVar, int i2) {
    }

    public static /* synthetic */ void access$32600(ib ibVar) {
    }

    public static /* synthetic */ void access$32700(ib ibVar, v8 v8Var) {
    }

    public static /* synthetic */ void access$32800(ib ibVar, v8 v8Var) {
    }

    public static /* synthetic */ void access$32900(ib ibVar) {
    }

    public static /* synthetic */ void access$33000(ib ibVar, String str) {
    }

    public static /* synthetic */ void access$33100(ib ibVar) {
    }

    public static /* synthetic */ void access$33200(ib ibVar, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$33300(ib ibVar, c cVar) {
    }

    public static /* synthetic */ void access$33400(ib ibVar, c cVar) {
    }

    public static /* synthetic */ void access$33500(ib ibVar) {
    }

    private void addAllTextBlock(Iterable<? extends xb> iterable) {
    }

    private void addAllTopicId(Iterable<? extends Long> iterable) {
    }

    private void addAllVideoId(Iterable<String> iterable) {
    }

    private void addTextBlock(xb xbVar) {
    }

    private void addTopicId(long j2) {
    }

    private void addVideoId(String str) {
    }

    private void addVideoIdBytes(k.d.c.i iVar) {
    }

    private void clearAppMsgType() {
    }

    private void clearBanForward() {
    }

    private void clearBanMoments() {
    }

    private void clearBaseInfoType() {
    }

    private void clearCanComment() {
    }

    private void clearCanDeleteStatus() {
    }

    private void clearCanReward() {
    }

    private void clearCommentCount() {
    }

    private void clearCommentId() {
    }

    private void clearCommentNum() {
    }

    private void clearCommentRead() {
    }

    private void clearContent() {
    }

    private void clearCopyrightStatus() {
    }

    private void clearCover() {
    }

    private void clearCreateDate() {
    }

    private void clearCreateTime() {
    }

    private void clearDanmuNum() {
    }

    private void clearDelFlag() {
    }

    private void clearDeleted() {
    }

    private void clearDeletedType() {
    }

    private void clearDigest() {
    }

    private void clearDraftMid() {
    }

    private void clearExtraJsonStr() {
    }

    private void clearFanMsgInfo() {
    }

    private void clearFansmsgnum() {
    }

    private void clearFeaturedInfo() {
    }

    private void clearFinderStatInfo() {
    }

    private void clearHasAuthor() {
    }

    private void clearHighlightContent() {
    }

    private void clearHighlightTitle() {
    }

    private void clearIdx() {
    }

    private void clearInteractionTime() {
    }

    private void clearIsFakeSequence() {
    }

    private void clearIsOpenDanmu() {
    }

    private void clearIsPayread() {
    }

    private void clearItemShowType() {
    }

    private void clearLastType() {
    }

    private void clearLikeIcon() {
    }

    private void clearLikeNum() {
    }

    private void clearLikeType() {
    }

    private void clearMasssendStatus() {
    }

    private void clearMasssendStatusType() {
    }

    private void clearMid() {
    }

    private void clearMidIdx() {
    }

    private void clearModifyStatus() {
    }

    private void clearModifyTime() {
    }

    private void clearNotOperator() {
    }

    private void clearOldLikeNum() {
    }

    private void clearOnlyCanComment() {
    }

    private void clearOpenComment() {
    }

    private void clearOpenFansmsg() {
    }

    private void clearOpenReward() {
    }

    private void clearOpenTopic() {
    }

    private void clearOriStatus() {
    }

    private void clearPayFinishTimeRead() {
    }

    private void clearPaySubscribeDesc() {
    }

    private void clearPayreadCount() {
    }

    private void clearPayreadId() {
    }

    private void clearPayreadMoney() {
    }

    private void clearPayreadReadTime() {
    }

    private void clearPayreadUnread() {
    }

    private void clearQnaAnswerCnt() {
    }

    private void clearQnaNewMsgCnt() {
    }

    private void clearQnaQuestionId() {
    }

    private void clearReadNum() {
    }

    private void clearRejectMasssend() {
    }

    private void clearReplyFlag() {
    }

    private void clearRewardCount() {
    }

    private void clearRewardId() {
    }

    private void clearRewardMoney() {
    }

    private void clearRewardNum() {
    }

    private void clearRewardRead() {
    }

    private void clearSendTime() {
    }

    private void clearSequence() {
    }

    private void clearStatData() {
    }

    private void clearTextBlock() {
    }

    private void clearTitle() {
    }

    private void clearTitleDigestType() {
    }

    private void clearTopTitle() {
    }

    private void clearTopicId() {
    }

    private void clearUnreadCommentNum() {
    }

    private void clearUnreadDanmuNum() {
    }

    private void clearUpdateSequence() {
    }

    private void clearUrl() {
    }

    private void clearUserCommentIdRead() {
    }

    private void clearUserCommentReadTime() {
    }

    private void clearVideoId() {
    }

    private void clearWhisperCount() {
    }

    private void clearWhisperReadTime() {
    }

    private void clearWhisperUnread() {
    }

    private void ensureTextBlockIsMutable() {
    }

    private void ensureTopicIdIsMutable() {
    }

    private void ensureVideoIdIsMutable() {
    }

    public static ib getDefaultInstance() {
    }

    private void mergeFanMsgInfo(b bVar) {
    }

    private void mergeFeaturedInfo(v8 v8Var) {
    }

    private void mergeFinderStatInfo(c cVar) {
    }

    public static a newBuilder() {
    }

    public static ib parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static ib parseFrom(ByteBuffer byteBuffer) throws k.d.c.c0 {
    }

    public static k.d.c.b1<ib> parser() {
    }

    private void removeTextBlock(int i2) {
    }

    private void setAppMsgType(int i2) {
    }

    private void setBanForward(int i2) {
    }

    private void setBanMoments(int i2) {
    }

    private void setBaseInfoType(int i2) {
    }

    private void setCanComment(int i2) {
    }

    private void setCanDeleteStatus(int i2) {
    }

    private void setCanReward(int i2) {
    }

    private void setCommentCount(int i2) {
    }

    private void setCommentId(long j2) {
    }

    private void setCommentNum(int i2) {
    }

    private void setCommentRead(int i2) {
    }

    private void setContent(String str) {
    }

    private void setContentBytes(k.d.c.i iVar) {
    }

    private void setCopyrightStatus(int i2) {
    }

    private void setCover(String str) {
    }

    private void setCoverBytes(k.d.c.i iVar) {
    }

    private void setCreateDate(String str) {
    }

    private void setCreateDateBytes(k.d.c.i iVar) {
    }

    private void setCreateTime(int i2) {
    }

    private void setDanmuNum(int i2) {
    }

    private void setDelFlag(int i2) {
    }

    private void setDeleted(int i2) {
    }

    private void setDeletedType(int i2) {
    }

    private void setDigest(String str) {
    }

    private void setDigestBytes(k.d.c.i iVar) {
    }

    private void setDraftMid(int i2) {
    }

    private void setExtraJsonStr(String str) {
    }

    private void setExtraJsonStrBytes(k.d.c.i iVar) {
    }

    private void setFanMsgInfo(b bVar) {
    }

    private void setFansmsgnum(int i2) {
    }

    private void setFeaturedInfo(v8 v8Var) {
    }

    private void setFinderStatInfo(c cVar) {
    }

    private void setHasAuthor(int i2) {
    }

    private void setHighlightContent(String str) {
    }

    private void setHighlightContentBytes(k.d.c.i iVar) {
    }

    private void setHighlightTitle(String str) {
    }

    private void setHighlightTitleBytes(k.d.c.i iVar) {
    }

    private void setIdx(int i2) {
    }

    private void setInteractionTime(int i2) {
    }

    private void setIsFakeSequence(boolean z) {
    }

    private void setIsOpenDanmu(boolean z) {
    }

    private void setIsPayread(boolean z) {
    }

    private void setItemShowType(int i2) {
    }

    private void setLastType(int i2) {
    }

    private void setLikeIcon(String str) {
    }

    private void setLikeIconBytes(k.d.c.i iVar) {
    }

    private void setLikeNum(int i2) {
    }

    private void setLikeType(int i2) {
    }

    private void setMasssendStatus(String str) {
    }

    private void setMasssendStatusBytes(k.d.c.i iVar) {
    }

    private void setMasssendStatusType(int i2) {
    }

    private void setMid(int i2) {
    }

    private void setMidIdx(String str) {
    }

    private void setMidIdxBytes(k.d.c.i iVar) {
    }

    private void setModifyStatus(int i2) {
    }

    private void setModifyTime(int i2) {
    }

    private void setNotOperator(int i2) {
    }

    private void setOldLikeNum(int i2) {
    }

    private void setOnlyCanComment(int i2) {
    }

    private void setOpenComment(int i2) {
    }

    private void setOpenFansmsg(int i2) {
    }

    private void setOpenReward(int i2) {
    }

    private void setOpenTopic(int i2) {
    }

    private void setOriStatus(int i2) {
    }

    private void setPayFinishTimeRead(int i2) {
    }

    private void setPaySubscribeDesc(String str) {
    }

    private void setPaySubscribeDescBytes(k.d.c.i iVar) {
    }

    private void setPayreadCount(int i2) {
    }

    private void setPayreadId(long j2) {
    }

    private void setPayreadMoney(int i2) {
    }

    private void setPayreadReadTime(int i2) {
    }

    private void setPayreadUnread(int i2) {
    }

    private void setQnaAnswerCnt(int i2) {
    }

    private void setQnaNewMsgCnt(int i2) {
    }

    private void setQnaQuestionId(k.d.c.i iVar) {
    }

    private void setReadNum(int i2) {
    }

    private void setRejectMasssend(int i2) {
    }

    private void setReplyFlag(int i2) {
    }

    private void setRewardCount(int i2) {
    }

    private void setRewardId(long j2) {
    }

    private void setRewardMoney(int i2) {
    }

    private void setRewardNum(int i2) {
    }

    private void setRewardRead(int i2) {
    }

    private void setSendTime(int i2) {
    }

    private void setSequence(long j2) {
    }

    private void setStatData(int i2) {
    }

    private void setTextBlock(int i2, xb xbVar) {
    }

    private void setTitle(String str) {
    }

    private void setTitleBytes(k.d.c.i iVar) {
    }

    private void setTitleDigestType(int i2) {
    }

    private void setTopTitle(String str) {
    }

    private void setTopTitleBytes(k.d.c.i iVar) {
    }

    private void setTopicId(int i2, long j2) {
    }

    private void setUnreadCommentNum(int i2) {
    }

    private void setUnreadDanmuNum(int i2) {
    }

    private void setUpdateSequence(long j2) {
    }

    private void setUrl(String str) {
    }

    private void setUrlBytes(k.d.c.i iVar) {
    }

    private void setUserCommentIdRead(int i2) {
    }

    private void setUserCommentReadTime(int i2) {
    }

    private void setVideoId(int i2, String str) {
    }

    private void setWhisperCount(int i2) {
    }

    private void setWhisperReadTime(int i2) {
    }

    private void setWhisperUnread(int i2) {
    }

    @Override // k.d.c.z
    public final Object dynamicMethod(z.g gVar, Object obj, Object obj2) {
    }

    public int getAppMsgType() {
    }

    public int getBanForward() {
    }

    public int getBanMoments() {
    }

    public int getBaseInfoType() {
    }

    public int getCanComment() {
    }

    public int getCanDeleteStatus() {
    }

    public int getCanReward() {
    }

    public int getCommentCount() {
    }

    public long getCommentId() {
    }

    public int getCommentNum() {
    }

    public int getCommentRead() {
    }

    public String getContent() {
    }

    public k.d.c.i getContentBytes() {
    }

    public int getCopyrightStatus() {
    }

    public String getCover() {
    }

    public k.d.c.i getCoverBytes() {
    }

    public String getCreateDate() {
    }

    public k.d.c.i getCreateDateBytes() {
    }

    public int getCreateTime() {
    }

    public int getDanmuNum() {
    }

    public int getDelFlag() {
    }

    public int getDeleted() {
    }

    public int getDeletedType() {
    }

    public String getDigest() {
    }

    public k.d.c.i getDigestBytes() {
    }

    public int getDraftMid() {
    }

    public String getExtraJsonStr() {
    }

    public k.d.c.i getExtraJsonStrBytes() {
    }

    public b getFanMsgInfo() {
    }

    public int getFansmsgnum() {
    }

    public v8 getFeaturedInfo() {
    }

    public c getFinderStatInfo() {
    }

    public int getHasAuthor() {
    }

    public String getHighlightContent() {
    }

    public k.d.c.i getHighlightContentBytes() {
    }

    public String getHighlightTitle() {
    }

    public k.d.c.i getHighlightTitleBytes() {
    }

    public int getIdx() {
    }

    public int getInteractionTime() {
    }

    public boolean getIsFakeSequence() {
    }

    public boolean getIsOpenDanmu() {
    }

    public boolean getIsPayread() {
    }

    public int getItemShowType() {
    }

    public int getLastType() {
    }

    public String getLikeIcon() {
    }

    public k.d.c.i getLikeIconBytes() {
    }

    public int getLikeNum() {
    }

    public int getLikeType() {
    }

    public String getMasssendStatus() {
    }

    public k.d.c.i getMasssendStatusBytes() {
    }

    public int getMasssendStatusType() {
    }

    public int getMid() {
    }

    public String getMidIdx() {
    }

    public k.d.c.i getMidIdxBytes() {
    }

    public int getModifyStatus() {
    }

    public int getModifyTime() {
    }

    public int getNotOperator() {
    }

    public int getOldLikeNum() {
    }

    public int getOnlyCanComment() {
    }

    public int getOpenComment() {
    }

    public int getOpenFansmsg() {
    }

    public int getOpenReward() {
    }

    public int getOpenTopic() {
    }

    public int getOriStatus() {
    }

    public int getPayFinishTimeRead() {
    }

    public String getPaySubscribeDesc() {
    }

    public k.d.c.i getPaySubscribeDescBytes() {
    }

    public int getPayreadCount() {
    }

    public long getPayreadId() {
    }

    public int getPayreadMoney() {
    }

    public int getPayreadReadTime() {
    }

    public int getPayreadUnread() {
    }

    public int getQnaAnswerCnt() {
    }

    public int getQnaNewMsgCnt() {
    }

    public k.d.c.i getQnaQuestionId() {
    }

    public int getReadNum() {
    }

    public int getRejectMasssend() {
    }

    public int getReplyFlag() {
    }

    public int getRewardCount() {
    }

    public long getRewardId() {
    }

    public int getRewardMoney() {
    }

    public int getRewardNum() {
    }

    public int getRewardRead() {
    }

    public int getSendTime() {
    }

    public long getSequence() {
    }

    public int getStatData() {
    }

    public xb getTextBlock(int i2) {
    }

    public int getTextBlockCount() {
    }

    public List<xb> getTextBlockList() {
    }

    public yb getTextBlockOrBuilder(int i2) {
    }

    public List<? extends yb> getTextBlockOrBuilderList() {
    }

    public String getTitle() {
    }

    public k.d.c.i getTitleBytes() {
    }

    public int getTitleDigestType() {
    }

    public String getTopTitle() {
    }

    public k.d.c.i getTopTitleBytes() {
    }

    public long getTopicId(int i2) {
    }

    public int getTopicIdCount() {
    }

    public List<Long> getTopicIdList() {
    }

    public int getUnreadCommentNum() {
    }

    public int getUnreadDanmuNum() {
    }

    public long getUpdateSequence() {
    }

    public String getUrl() {
    }

    public k.d.c.i getUrlBytes() {
    }

    public int getUserCommentIdRead() {
    }

    public int getUserCommentReadTime() {
    }

    public String getVideoId(int i2) {
    }

    public k.d.c.i getVideoIdBytes(int i2) {
    }

    public int getVideoIdCount() {
    }

    public List<String> getVideoIdList() {
    }

    public int getWhisperCount() {
    }

    public int getWhisperReadTime() {
    }

    public int getWhisperUnread() {
    }

    public boolean hasAppMsgType() {
    }

    public boolean hasBanForward() {
    }

    public boolean hasBanMoments() {
    }

    public boolean hasBaseInfoType() {
    }

    public boolean hasCanComment() {
    }

    public boolean hasCanDeleteStatus() {
    }

    public boolean hasCanReward() {
    }

    public boolean hasCommentCount() {
    }

    public boolean hasCommentId() {
    }

    public boolean hasCommentNum() {
    }

    public boolean hasCommentRead() {
    }

    public boolean hasContent() {
    }

    public boolean hasCopyrightStatus() {
    }

    public boolean hasCover() {
    }

    public boolean hasCreateDate() {
    }

    public boolean hasCreateTime() {
    }

    public boolean hasDanmuNum() {
    }

    public boolean hasDelFlag() {
    }

    public boolean hasDeleted() {
    }

    public boolean hasDeletedType() {
    }

    public boolean hasDigest() {
    }

    public boolean hasDraftMid() {
    }

    public boolean hasExtraJsonStr() {
    }

    public boolean hasFanMsgInfo() {
    }

    public boolean hasFansmsgnum() {
    }

    public boolean hasFeaturedInfo() {
    }

    public boolean hasFinderStatInfo() {
    }

    public boolean hasHasAuthor() {
    }

    public boolean hasHighlightContent() {
    }

    public boolean hasHighlightTitle() {
    }

    public boolean hasIdx() {
    }

    public boolean hasInteractionTime() {
    }

    public boolean hasIsFakeSequence() {
    }

    public boolean hasIsOpenDanmu() {
    }

    public boolean hasIsPayread() {
    }

    public boolean hasItemShowType() {
    }

    public boolean hasLastType() {
    }

    public boolean hasLikeIcon() {
    }

    public boolean hasLikeNum() {
    }

    public boolean hasLikeType() {
    }

    public boolean hasMasssendStatus() {
    }

    public boolean hasMasssendStatusType() {
    }

    public boolean hasMid() {
    }

    public boolean hasMidIdx() {
    }

    public boolean hasModifyStatus() {
    }

    public boolean hasModifyTime() {
    }

    public boolean hasNotOperator() {
    }

    public boolean hasOldLikeNum() {
    }

    public boolean hasOnlyCanComment() {
    }

    public boolean hasOpenComment() {
    }

    public boolean hasOpenFansmsg() {
    }

    public boolean hasOpenReward() {
    }

    public boolean hasOpenTopic() {
    }

    public boolean hasOriStatus() {
    }

    public boolean hasPayFinishTimeRead() {
    }

    public boolean hasPaySubscribeDesc() {
    }

    public boolean hasPayreadCount() {
    }

    public boolean hasPayreadId() {
    }

    public boolean hasPayreadMoney() {
    }

    public boolean hasPayreadReadTime() {
    }

    public boolean hasPayreadUnread() {
    }

    public boolean hasQnaAnswerCnt() {
    }

    public boolean hasQnaNewMsgCnt() {
    }

    public boolean hasQnaQuestionId() {
    }

    public boolean hasReadNum() {
    }

    public boolean hasRejectMasssend() {
    }

    public boolean hasReplyFlag() {
    }

    public boolean hasRewardCount() {
    }

    public boolean hasRewardId() {
    }

    public boolean hasRewardMoney() {
    }

    public boolean hasRewardNum() {
    }

    public boolean hasRewardRead() {
    }

    public boolean hasSendTime() {
    }

    public boolean hasSequence() {
    }

    public boolean hasStatData() {
    }

    public boolean hasTitle() {
    }

    public boolean hasTitleDigestType() {
    }

    public boolean hasTopTitle() {
    }

    public boolean hasUnreadCommentNum() {
    }

    public boolean hasUnreadDanmuNum() {
    }

    public boolean hasUpdateSequence() {
    }

    public boolean hasUrl() {
    }

    public boolean hasUserCommentIdRead() {
    }

    public boolean hasUserCommentReadTime() {
    }

    public boolean hasWhisperCount() {
    }

    public boolean hasWhisperReadTime() {
    }

    public boolean hasWhisperUnread() {
    }

    public static a newBuilder(ib ibVar) {
    }

    public static ib parseDelimitedFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
    }

    public static ib parseFrom(ByteBuffer byteBuffer, k.d.c.q qVar) throws k.d.c.c0 {
    }

    public static ib parseFrom(k.d.c.i iVar) throws k.d.c.c0 {
    }

    private void addTextBlock(int i2, xb xbVar) {
    }

    public static ib parseFrom(k.d.c.i iVar, k.d.c.q qVar) throws k.d.c.c0 {
    }

    public static ib parseFrom(byte[] bArr) throws k.d.c.c0 {
    }

    public static ib parseFrom(byte[] bArr, k.d.c.q qVar) throws k.d.c.c0 {
    }

    public static ib parseFrom(InputStream inputStream) throws IOException {
    }

    public static ib parseFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
    }

    public static ib parseFrom(k.d.c.j jVar) throws IOException {
    }

    public static ib parseFrom(k.d.c.j jVar, k.d.c.q qVar) throws IOException {
    }
}
