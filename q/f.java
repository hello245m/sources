package q;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import k.d.c.b0;
import k.d.c.z;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
public final class f extends k.d.c.z<f, a> implements Object {
    public static final int ACCT_CLOSE_STATUS_FIELD_NUMBER = 13;
    public static final int ADMIN_ALIAS_FIELD_NUMBER = 11;
    public static final int ADMIN_HEADIMGURL_FIELD_NUMBER = 7;
    public static final int ADMIN_NICKNAME_FIELD_NUMBER = 6;
    public static final int ADMIN_OPENID_FIELD_NUMBER = 4;
    public static final int ADMIN_USERNAME_FIELD_NUMBER = 5;
    public static final int APP_DATA_TICKET_FIELD_NUMBER = 3;
    public static final int BASE_RESP_FIELD_NUMBER = 1;
    private static final f DEFAULT_INSTANCE = null;
    public static final int FUNC_FLAG_FIELD_NUMBER = 10;
    public static final int LONGLINK_BACKUP_IP_LIST_FIELD_NUMBER = 9;
    private static volatile k.d.c.b1<f> PARSER = null;
    public static final int SESSION_TICKET_FIELD_NUMBER = 2;
    public static final int SHORTLINK_BACKUP_IP_LIST_FIELD_NUMBER = 8;
    public static final int TOKEN_FIELD_NUMBER = 12;
    private d acctCloseStatus_;
    private String adminAlias_;
    private String adminHeadimgurl_;
    private String adminNickname_;
    private String adminOpenid_;
    private String adminUsername_;
    private k.d.c.i appDataTicket_;
    private k0 baseResp_;
    private int bitField0_;
    private long funcFlag_;
    private b0.i<String> longlinkBackupIpList_;
    private byte memoizedIsInitialized;
    private k.d.c.i sessionTicket_;
    private b0.i<String> shortlinkBackupIpList_;
    private String token_;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static final class a extends z.b<f, a> implements Object {
        public /* synthetic */ a(q.a aVar) {
        }

        public a() {
        }
    }

    private f() {
    }

    public static /* synthetic */ void access$10000(f fVar, d dVar) {
    }

    public static /* synthetic */ void access$10100(f fVar) {
    }

    public static /* synthetic */ f access$6100() {
    }

    public static /* synthetic */ void access$6200(f fVar, k0 k0Var) {
    }

    public static /* synthetic */ void access$6300(f fVar, k0 k0Var) {
    }

    public static /* synthetic */ void access$6400(f fVar) {
    }

    public static /* synthetic */ void access$6500(f fVar, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$6600(f fVar) {
    }

    public static /* synthetic */ void access$6700(f fVar, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$6800(f fVar) {
    }

    public static /* synthetic */ void access$6900(f fVar, String str) {
    }

    public static /* synthetic */ void access$7000(f fVar) {
    }

    public static /* synthetic */ void access$7100(f fVar, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$7200(f fVar, String str) {
    }

    public static /* synthetic */ void access$7300(f fVar) {
    }

    public static /* synthetic */ void access$7400(f fVar, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$7500(f fVar, String str) {
    }

    public static /* synthetic */ void access$7600(f fVar) {
    }

    public static /* synthetic */ void access$7700(f fVar, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$7800(f fVar, String str) {
    }

    public static /* synthetic */ void access$7900(f fVar) {
    }

    public static /* synthetic */ void access$8000(f fVar, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$8100(f fVar, int i2, String str) {
    }

    public static /* synthetic */ void access$8200(f fVar, String str) {
    }

    public static /* synthetic */ void access$8300(f fVar, Iterable iterable) {
    }

    public static /* synthetic */ void access$8400(f fVar) {
    }

    public static /* synthetic */ void access$8500(f fVar, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$8600(f fVar, int i2, String str) {
    }

    public static /* synthetic */ void access$8700(f fVar, String str) {
    }

    public static /* synthetic */ void access$8800(f fVar, Iterable iterable) {
    }

    public static /* synthetic */ void access$8900(f fVar) {
    }

    public static /* synthetic */ void access$9000(f fVar, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$9100(f fVar, long j2) {
    }

    public static /* synthetic */ void access$9200(f fVar) {
    }

    public static /* synthetic */ void access$9300(f fVar, String str) {
    }

    public static /* synthetic */ void access$9400(f fVar) {
    }

    public static /* synthetic */ void access$9500(f fVar, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$9600(f fVar, String str) {
    }

    public static /* synthetic */ void access$9700(f fVar) {
    }

    public static /* synthetic */ void access$9800(f fVar, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$9900(f fVar, d dVar) {
    }

    private void addAllLonglinkBackupIpList(Iterable<String> iterable) {
    }

    private void addAllShortlinkBackupIpList(Iterable<String> iterable) {
    }

    private void addLonglinkBackupIpList(String str) {
    }

    private void addLonglinkBackupIpListBytes(k.d.c.i iVar) {
    }

    private void addShortlinkBackupIpList(String str) {
    }

    private void addShortlinkBackupIpListBytes(k.d.c.i iVar) {
    }

    private void clearAcctCloseStatus() {
    }

    private void clearAdminAlias() {
    }

    private void clearAdminHeadimgurl() {
    }

    private void clearAdminNickname() {
    }

    private void clearAdminOpenid() {
    }

    private void clearAdminUsername() {
    }

    private void clearAppDataTicket() {
    }

    private void clearBaseResp() {
    }

    private void clearFuncFlag() {
    }

    private void clearLonglinkBackupIpList() {
    }

    private void clearSessionTicket() {
    }

    private void clearShortlinkBackupIpList() {
    }

    private void clearToken() {
    }

    private void ensureLonglinkBackupIpListIsMutable() {
    }

    private void ensureShortlinkBackupIpListIsMutable() {
    }

    public static f getDefaultInstance() {
    }

    private void mergeAcctCloseStatus(d dVar) {
    }

    private void mergeBaseResp(k0 k0Var) {
    }

    public static a newBuilder() {
    }

    public static f parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static f parseFrom(ByteBuffer byteBuffer) throws k.d.c.c0 {
    }

    public static k.d.c.b1<f> parser() {
    }

    private void setAcctCloseStatus(d dVar) {
    }

    private void setAdminAlias(String str) {
    }

    private void setAdminAliasBytes(k.d.c.i iVar) {
    }

    private void setAdminHeadimgurl(String str) {
    }

    private void setAdminHeadimgurlBytes(k.d.c.i iVar) {
    }

    private void setAdminNickname(String str) {
    }

    private void setAdminNicknameBytes(k.d.c.i iVar) {
    }

    private void setAdminOpenid(String str) {
    }

    private void setAdminOpenidBytes(k.d.c.i iVar) {
    }

    private void setAdminUsername(String str) {
    }

    private void setAdminUsernameBytes(k.d.c.i iVar) {
    }

    private void setAppDataTicket(k.d.c.i iVar) {
    }

    private void setBaseResp(k0 k0Var) {
    }

    private void setFuncFlag(long j2) {
    }

    private void setLonglinkBackupIpList(int i2, String str) {
    }

    private void setSessionTicket(k.d.c.i iVar) {
    }

    private void setShortlinkBackupIpList(int i2, String str) {
    }

    private void setToken(String str) {
    }

    private void setTokenBytes(k.d.c.i iVar) {
    }

    @Override // k.d.c.z
    public final Object dynamicMethod(z.g gVar, Object obj, Object obj2) {
    }

    public d getAcctCloseStatus() {
    }

    public String getAdminAlias() {
    }

    public k.d.c.i getAdminAliasBytes() {
    }

    public String getAdminHeadimgurl() {
    }

    public k.d.c.i getAdminHeadimgurlBytes() {
    }

    public String getAdminNickname() {
    }

    public k.d.c.i getAdminNicknameBytes() {
    }

    public String getAdminOpenid() {
    }

    public k.d.c.i getAdminOpenidBytes() {
    }

    public String getAdminUsername() {
    }

    public k.d.c.i getAdminUsernameBytes() {
    }

    public k.d.c.i getAppDataTicket() {
    }

    public k0 getBaseResp() {
    }

    public long getFuncFlag() {
    }

    public String getLonglinkBackupIpList(int i2) {
    }

    public k.d.c.i getLonglinkBackupIpListBytes(int i2) {
    }

    public int getLonglinkBackupIpListCount() {
    }

    public List<String> getLonglinkBackupIpListList() {
    }

    public k.d.c.i getSessionTicket() {
    }

    public String getShortlinkBackupIpList(int i2) {
    }

    public k.d.c.i getShortlinkBackupIpListBytes(int i2) {
    }

    public int getShortlinkBackupIpListCount() {
    }

    public List<String> getShortlinkBackupIpListList() {
    }

    public String getToken() {
    }

    public k.d.c.i getTokenBytes() {
    }

    public boolean hasAcctCloseStatus() {
    }

    public boolean hasAdminAlias() {
    }

    public boolean hasAdminHeadimgurl() {
    }

    public boolean hasAdminNickname() {
    }

    public boolean hasAdminOpenid() {
    }

    public boolean hasAdminUsername() {
    }

    public boolean hasAppDataTicket() {
    }

    public boolean hasBaseResp() {
    }

    public boolean hasFuncFlag() {
    }

    public boolean hasSessionTicket() {
    }

    public boolean hasToken() {
    }

    public static a newBuilder(f fVar) {
    }

    public static f parseDelimitedFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
    }

    public static f parseFrom(ByteBuffer byteBuffer, k.d.c.q qVar) throws k.d.c.c0 {
    }

    public static f parseFrom(k.d.c.i iVar) throws k.d.c.c0 {
    }

    public static f parseFrom(k.d.c.i iVar, k.d.c.q qVar) throws k.d.c.c0 {
    }

    public static f parseFrom(byte[] bArr) throws k.d.c.c0 {
    }

    public static f parseFrom(byte[] bArr, k.d.c.q qVar) throws k.d.c.c0 {
    }

    public static f parseFrom(InputStream inputStream) throws IOException {
    }

    public static f parseFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
    }

    public static f parseFrom(k.d.c.j jVar) throws IOException {
    }

    public static f parseFrom(k.d.c.j jVar, k.d.c.q qVar) throws IOException {
    }
}
