package q;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import k.d.c.z;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
public final class l7 extends k.d.c.z<l7, a> implements m7 {
    public static final int AUTHOR_LIKE_STATUS_FIELD_NUMBER = 12;
    public static final int CONTENT_FIELD_NUMBER = 1;
    public static final int CREATE_TIME_FIELD_NUMBER = 2;
    private static final l7 DEFAULT_INSTANCE = null;
    public static final int IS_DELETED_BY_USER_FIELD_NUMBER = 7;
    public static final int IS_DELETED_FIELD_NUMBER = 4;
    public static final int IS_FROM_FIELD_NUMBER = 10;
    public static final int OPEN_ID_FIELD_NUMBER = 5;
    private static volatile k.d.c.b1<l7> PARSER = null;
    public static final int REPLY_ID_FIELD_NUMBER = 3;
    public static final int REPLY_IS_ELECTED_FIELD_NUMBER = 6;
    public static final int REPLY_LIKE_NUM_FIELD_NUMBER = 11;
    public static final int REPLY_SPAM_FLAG_FIELD_NUMBER = 15;
    public static final int REPLY_USER_FIELD_NUMBER = 8;
    public static final int SHIELD_STATUS_FIELD_NUMBER = 14;
    public static final int TO_REPLY_FIELD_NUMBER = 9;
    public static final int USER_COMMENT_ID_FIELD_NUMBER = 13;
    private int authorLikeStatus_;
    private int bitField0_;
    private k.d.c.i content_;
    private int createTime_;
    private int isDeletedByUser_;
    private int isDeleted_;
    private int isFrom_;
    private String openId_;
    private int replyId_;
    private int replyIsElected_;
    private int replyLikeNum_;
    private int replySpamFlag_;
    private qe replyUser_;
    private int shieldStatus_;
    private k.d.c.i toReply_;
    private int userCommentId_;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static final class a extends z.b<l7, a> implements m7 {
        public /* synthetic */ a(k6 k6Var) {
        }

        public a A(int i2) {
        }

        public a B(k.d.c.i iVar) {
        }

        public a v(k.d.c.i iVar) {
        }

        public a w(int i2) {
        }

        public a x(int i2) {
        }

        public a y(int i2) {
        }

        public a z(qe qeVar) {
        }

        public a() {
        }
    }

    private l7() {
    }

    public static /* synthetic */ l7 access$83000() {
    }

    public static /* synthetic */ void access$83100(l7 l7Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$83200(l7 l7Var) {
    }

    public static /* synthetic */ void access$83300(l7 l7Var, int i2) {
    }

    public static /* synthetic */ void access$83400(l7 l7Var) {
    }

    public static /* synthetic */ void access$83500(l7 l7Var, int i2) {
    }

    public static /* synthetic */ void access$83600(l7 l7Var) {
    }

    public static /* synthetic */ void access$83700(l7 l7Var, int i2) {
    }

    public static /* synthetic */ void access$83800(l7 l7Var) {
    }

    public static /* synthetic */ void access$83900(l7 l7Var, String str) {
    }

    public static /* synthetic */ void access$84000(l7 l7Var) {
    }

    public static /* synthetic */ void access$84100(l7 l7Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$84200(l7 l7Var, int i2) {
    }

    public static /* synthetic */ void access$84300(l7 l7Var) {
    }

    public static /* synthetic */ void access$84400(l7 l7Var, int i2) {
    }

    public static /* synthetic */ void access$84500(l7 l7Var) {
    }

    public static /* synthetic */ void access$84600(l7 l7Var, qe qeVar) {
    }

    public static /* synthetic */ void access$84700(l7 l7Var, qe qeVar) {
    }

    public static /* synthetic */ void access$84800(l7 l7Var) {
    }

    public static /* synthetic */ void access$84900(l7 l7Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$85000(l7 l7Var) {
    }

    public static /* synthetic */ void access$85100(l7 l7Var, int i2) {
    }

    public static /* synthetic */ void access$85200(l7 l7Var) {
    }

    public static /* synthetic */ void access$85300(l7 l7Var, int i2) {
    }

    public static /* synthetic */ void access$85400(l7 l7Var) {
    }

    public static /* synthetic */ void access$85500(l7 l7Var, int i2) {
    }

    public static /* synthetic */ void access$85600(l7 l7Var) {
    }

    public static /* synthetic */ void access$85700(l7 l7Var, int i2) {
    }

    public static /* synthetic */ void access$85800(l7 l7Var) {
    }

    public static /* synthetic */ void access$85900(l7 l7Var, int i2) {
    }

    public static /* synthetic */ void access$86000(l7 l7Var) {
    }

    public static /* synthetic */ void access$86100(l7 l7Var, int i2) {
    }

    public static /* synthetic */ void access$86200(l7 l7Var) {
    }

    private void clearAuthorLikeStatus() {
    }

    private void clearContent() {
    }

    private void clearCreateTime() {
    }

    private void clearIsDeleted() {
    }

    private void clearIsDeletedByUser() {
    }

    private void clearIsFrom() {
    }

    private void clearOpenId() {
    }

    private void clearReplyId() {
    }

    private void clearReplyIsElected() {
    }

    private void clearReplyLikeNum() {
    }

    private void clearReplySpamFlag() {
    }

    private void clearReplyUser() {
    }

    private void clearShieldStatus() {
    }

    private void clearToReply() {
    }

    private void clearUserCommentId() {
    }

    public static l7 getDefaultInstance() {
    }

    private void mergeReplyUser(qe qeVar) {
    }

    public static a newBuilder() {
    }

    public static l7 parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static l7 parseFrom(ByteBuffer byteBuffer) throws k.d.c.c0 {
    }

    public static k.d.c.b1<l7> parser() {
    }

    private void setAuthorLikeStatus(int i2) {
    }

    private void setContent(k.d.c.i iVar) {
    }

    private void setCreateTime(int i2) {
    }

    private void setIsDeleted(int i2) {
    }

    private void setIsDeletedByUser(int i2) {
    }

    private void setIsFrom(int i2) {
    }

    private void setOpenId(String str) {
    }

    private void setOpenIdBytes(k.d.c.i iVar) {
    }

    private void setReplyId(int i2) {
    }

    private void setReplyIsElected(int i2) {
    }

    private void setReplyLikeNum(int i2) {
    }

    private void setReplySpamFlag(int i2) {
    }

    private void setReplyUser(qe qeVar) {
    }

    private void setShieldStatus(int i2) {
    }

    private void setToReply(k.d.c.i iVar) {
    }

    private void setUserCommentId(int i2) {
    }

    @Override // k.d.c.z
    public final Object dynamicMethod(z.g gVar, Object obj, Object obj2) {
    }

    public int getAuthorLikeStatus() {
    }

    public k.d.c.i getContent() {
    }

    public int getCreateTime() {
    }

    public int getIsDeleted() {
    }

    public int getIsDeletedByUser() {
    }

    public int getIsFrom() {
    }

    public String getOpenId() {
    }

    public k.d.c.i getOpenIdBytes() {
    }

    public int getReplyId() {
    }

    public int getReplyIsElected() {
    }

    public int getReplyLikeNum() {
    }

    public int getReplySpamFlag() {
    }

    public qe getReplyUser() {
    }

    public int getShieldStatus() {
    }

    public k.d.c.i getToReply() {
    }

    public int getUserCommentId() {
    }

    public boolean hasAuthorLikeStatus() {
    }

    public boolean hasContent() {
    }

    public boolean hasCreateTime() {
    }

    public boolean hasIsDeleted() {
    }

    public boolean hasIsDeletedByUser() {
    }

    public boolean hasIsFrom() {
    }

    public boolean hasOpenId() {
    }

    public boolean hasReplyId() {
    }

    public boolean hasReplyIsElected() {
    }

    public boolean hasReplyLikeNum() {
    }

    public boolean hasReplySpamFlag() {
    }

    public boolean hasReplyUser() {
    }

    public boolean hasShieldStatus() {
    }

    public boolean hasToReply() {
    }

    public boolean hasUserCommentId() {
    }

    public static a newBuilder(l7 l7Var) {
    }

    public static l7 parseDelimitedFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
    }

    public static l7 parseFrom(ByteBuffer byteBuffer, k.d.c.q qVar) throws k.d.c.c0 {
    }

    public static l7 parseFrom(k.d.c.i iVar) throws k.d.c.c0 {
    }

    public static l7 parseFrom(k.d.c.i iVar, k.d.c.q qVar) throws k.d.c.c0 {
    }

    public static l7 parseFrom(byte[] bArr) throws k.d.c.c0 {
    }

    public static l7 parseFrom(byte[] bArr, k.d.c.q qVar) throws k.d.c.c0 {
    }

    public static l7 parseFrom(InputStream inputStream) throws IOException {
    }

    public static l7 parseFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
    }

    public static l7 parseFrom(k.d.c.j jVar) throws IOException {
    }

    public static l7 parseFrom(k.d.c.j jVar, k.d.c.q qVar) throws IOException {
    }
}
