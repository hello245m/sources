package q;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import k.d.c.z;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
public final class d1 extends k.d.c.z<d1, a> implements Object {
    public static final int ANNOUNCEMENT_CONTENT_FIELD_NUMBER = 12;
    public static final int ANNOUNCEMENT_ONLINE_TIME_FIELD_NUMBER = 13;
    public static final int ANNOUNCEMENT_TITLE_FIELD_NUMBER = 6;
    public static final int ANNOUNCEMENT_URL_FIELD_NUMBER = 7;
    public static final int APPID_FIELD_NUMBER = 11;
    public static final int BASE_RESP_FIELD_NUMBER = 1;
    public static final int CLOSE_RELATED_VIDEO_FIELD_NUMBER = 10;
    private static final d1 DEFAULT_INSTANCE = null;
    public static final int INSERT_AD_MODE_FIELD_NUMBER = 9;
    public static final int MASS_SEND_LIMIT_FIELD_NUMBER = 2;
    public static final int MATERIAL_ENTRY_FIELD_NUMBER = 3;
    public static final int MODIFY_INFO_FIELD_NUMBER = 4;
    public static final int MPAPP_EDITOR_URL_FIELD_NUMBER = 8;
    public static final int NICKNAME_INFO_FIELD_NUMBER = 5;
    private static volatile k.d.c.b1<d1> PARSER;
    private String announcementContent_;
    private int announcementOnlineTime_;
    private String announcementTitle_;
    private String announcementUrl_;
    private String appid_;
    private k0 baseResp_;
    private int bitField0_;
    private int closeRelatedVideo_;
    private int insertAdMode_;
    private int massSendLimit_;
    private int materialEntry_;
    private byte memoizedIsInitialized;
    private ah modifyInfo_;
    private String mpappEditorUrl_;
    private ch nicknameInfo_;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static final class a extends z.b<d1, a> implements Object {
        public /* synthetic */ a(q0 q0Var) {
        }

        public a() {
        }
    }

    private d1() {
    }

    public static /* synthetic */ d1 access$20600() {
    }

    public static /* synthetic */ void access$20700(d1 d1Var, k0 k0Var) {
    }

    public static /* synthetic */ void access$20800(d1 d1Var, k0 k0Var) {
    }

    public static /* synthetic */ void access$20900(d1 d1Var) {
    }

    public static /* synthetic */ void access$21000(d1 d1Var, int i2) {
    }

    public static /* synthetic */ void access$21100(d1 d1Var) {
    }

    public static /* synthetic */ void access$21200(d1 d1Var, int i2) {
    }

    public static /* synthetic */ void access$21300(d1 d1Var) {
    }

    public static /* synthetic */ void access$21400(d1 d1Var, ah ahVar) {
    }

    public static /* synthetic */ void access$21500(d1 d1Var, ah ahVar) {
    }

    public static /* synthetic */ void access$21600(d1 d1Var) {
    }

    public static /* synthetic */ void access$21700(d1 d1Var, ch chVar) {
    }

    public static /* synthetic */ void access$21800(d1 d1Var, ch chVar) {
    }

    public static /* synthetic */ void access$21900(d1 d1Var) {
    }

    public static /* synthetic */ void access$22000(d1 d1Var, String str) {
    }

    public static /* synthetic */ void access$22100(d1 d1Var) {
    }

    public static /* synthetic */ void access$22200(d1 d1Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$22300(d1 d1Var, String str) {
    }

    public static /* synthetic */ void access$22400(d1 d1Var) {
    }

    public static /* synthetic */ void access$22500(d1 d1Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$22600(d1 d1Var, String str) {
    }

    public static /* synthetic */ void access$22700(d1 d1Var) {
    }

    public static /* synthetic */ void access$22800(d1 d1Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$22900(d1 d1Var, int i2) {
    }

    public static /* synthetic */ void access$23000(d1 d1Var) {
    }

    public static /* synthetic */ void access$23100(d1 d1Var, int i2) {
    }

    public static /* synthetic */ void access$23200(d1 d1Var) {
    }

    public static /* synthetic */ void access$23300(d1 d1Var, String str) {
    }

    public static /* synthetic */ void access$23400(d1 d1Var) {
    }

    public static /* synthetic */ void access$23500(d1 d1Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$23600(d1 d1Var, String str) {
    }

    public static /* synthetic */ void access$23700(d1 d1Var) {
    }

    public static /* synthetic */ void access$23800(d1 d1Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$23900(d1 d1Var, int i2) {
    }

    public static /* synthetic */ void access$24000(d1 d1Var) {
    }

    private void clearAnnouncementContent() {
    }

    private void clearAnnouncementOnlineTime() {
    }

    private void clearAnnouncementTitle() {
    }

    private void clearAnnouncementUrl() {
    }

    private void clearAppid() {
    }

    private void clearBaseResp() {
    }

    private void clearCloseRelatedVideo() {
    }

    private void clearInsertAdMode() {
    }

    private void clearMassSendLimit() {
    }

    private void clearMaterialEntry() {
    }

    private void clearModifyInfo() {
    }

    private void clearMpappEditorUrl() {
    }

    private void clearNicknameInfo() {
    }

    public static d1 getDefaultInstance() {
    }

    private void mergeBaseResp(k0 k0Var) {
    }

    private void mergeModifyInfo(ah ahVar) {
    }

    private void mergeNicknameInfo(ch chVar) {
    }

    public static a newBuilder() {
    }

    public static d1 parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static d1 parseFrom(ByteBuffer byteBuffer) throws k.d.c.c0 {
    }

    public static k.d.c.b1<d1> parser() {
    }

    private void setAnnouncementContent(String str) {
    }

    private void setAnnouncementContentBytes(k.d.c.i iVar) {
    }

    private void setAnnouncementOnlineTime(int i2) {
    }

    private void setAnnouncementTitle(String str) {
    }

    private void setAnnouncementTitleBytes(k.d.c.i iVar) {
    }

    private void setAnnouncementUrl(String str) {
    }

    private void setAnnouncementUrlBytes(k.d.c.i iVar) {
    }

    private void setAppid(String str) {
    }

    private void setAppidBytes(k.d.c.i iVar) {
    }

    private void setBaseResp(k0 k0Var) {
    }

    private void setCloseRelatedVideo(int i2) {
    }

    private void setInsertAdMode(int i2) {
    }

    private void setMassSendLimit(int i2) {
    }

    private void setMaterialEntry(int i2) {
    }

    private void setModifyInfo(ah ahVar) {
    }

    private void setMpappEditorUrl(String str) {
    }

    private void setMpappEditorUrlBytes(k.d.c.i iVar) {
    }

    private void setNicknameInfo(ch chVar) {
    }

    @Override // k.d.c.z
    public final Object dynamicMethod(z.g gVar, Object obj, Object obj2) {
    }

    public String getAnnouncementContent() {
    }

    public k.d.c.i getAnnouncementContentBytes() {
    }

    public int getAnnouncementOnlineTime() {
    }

    public String getAnnouncementTitle() {
    }

    public k.d.c.i getAnnouncementTitleBytes() {
    }

    public String getAnnouncementUrl() {
    }

    public k.d.c.i getAnnouncementUrlBytes() {
    }

    public String getAppid() {
    }

    public k.d.c.i getAppidBytes() {
    }

    public k0 getBaseResp() {
    }

    public int getCloseRelatedVideo() {
    }

    public int getInsertAdMode() {
    }

    public int getMassSendLimit() {
    }

    public int getMaterialEntry() {
    }

    public ah getModifyInfo() {
    }

    public String getMpappEditorUrl() {
    }

    public k.d.c.i getMpappEditorUrlBytes() {
    }

    public ch getNicknameInfo() {
    }

    public boolean hasAnnouncementContent() {
    }

    public boolean hasAnnouncementOnlineTime() {
    }

    public boolean hasAnnouncementTitle() {
    }

    public boolean hasAnnouncementUrl() {
    }

    public boolean hasAppid() {
    }

    public boolean hasBaseResp() {
    }

    public boolean hasCloseRelatedVideo() {
    }

    public boolean hasInsertAdMode() {
    }

    public boolean hasMassSendLimit() {
    }

    public boolean hasMaterialEntry() {
    }

    public boolean hasModifyInfo() {
    }

    public boolean hasMpappEditorUrl() {
    }

    public boolean hasNicknameInfo() {
    }

    public static a newBuilder(d1 d1Var) {
    }

    public static d1 parseDelimitedFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
    }

    public static d1 parseFrom(ByteBuffer byteBuffer, k.d.c.q qVar) throws k.d.c.c0 {
    }

    public static d1 parseFrom(k.d.c.i iVar) throws k.d.c.c0 {
    }

    public static d1 parseFrom(k.d.c.i iVar, k.d.c.q qVar) throws k.d.c.c0 {
    }

    public static d1 parseFrom(byte[] bArr) throws k.d.c.c0 {
    }

    public static d1 parseFrom(byte[] bArr, k.d.c.q qVar) throws k.d.c.c0 {
    }

    public static d1 parseFrom(InputStream inputStream) throws IOException {
    }

    public static d1 parseFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
    }

    public static d1 parseFrom(k.d.c.j jVar) throws IOException {
    }

    public static d1 parseFrom(k.d.c.j jVar, k.d.c.q qVar) throws IOException {
    }
}
