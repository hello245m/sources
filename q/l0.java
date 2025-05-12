package q;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import k.d.c.z;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
public final class l0 extends k.d.c.z<l0, a> implements Object {
    public static final int ADVERTISING_ID_FIELD_NUMBER = 19;
    public static final int BSSID_FIELD_NUMBER = 13;
    public static final int BUNDLE_DISPLAYNAME_FIELD_NUMBER = 6;
    public static final int BUNDLE_ID_FIELD_NUMBER = 5;
    public static final int CARRIER_NAME_FIELD_NUMBER = 10;
    private static final l0 DEFAULT_INSTANCE = null;
    public static final int DEVICE_BRAND_FIELD_NUMBER = 1;
    public static final int DEVICE_NAME_FIELD_NUMBER = 2;
    public static final int DEVICE_TYPE_FIELD_NUMBER = 3;
    public static final int IMEI_FIELD_NUMBER = 15;
    public static final int IS_JAIL_BREAK_FIELD_NUMBER = 4;
    public static final int LANGUAGE_FIELD_NUMBER = 7;
    public static final int MODEL_FIELD_NUMBER = 16;
    public static final int NETWORK_TYPE_FIELD_NUMBER = 11;
    public static final int OS_VERSION_FIELD_NUMBER = 14;
    private static volatile k.d.c.b1<l0> PARSER = null;
    public static final int SSID_FIELD_NUMBER = 12;
    public static final int TIMESTAMP_FIELD_NUMBER = 9;
    public static final int TIMEZONE_FIELD_NUMBER = 8;
    public static final int UUID_FIELD_NUMBER = 17;
    public static final int VENDOR_ID_FIELD_NUMBER = 18;
    private String advertisingId_;
    private int bitField0_;
    private String bssid_;
    private String bundleDisplayname_;
    private String bundleId_;
    private String carrierName_;
    private String deviceBrand_;
    private String deviceName_;
    private String deviceType_;
    private String imei_;
    private int isJailBreak_;
    private String language_;
    private String model_;
    private int networkType_;
    private String osVersion_;
    private String ssid_;
    private int timestamp_;
    private String timezone_;
    private String uuid_;
    private String vendorId_;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static final class a extends z.b<l0, a> implements Object {
        public /* synthetic */ a(f0 f0Var) {
        }

        public a A(String str) {
        }

        public a B(String str) {
        }

        public a C(String str) {
        }

        public a D(int i2) {
        }

        public a E(String str) {
        }

        public a F(String str) {
        }

        public a G(int i2) {
        }

        public a H(String str) {
        }

        public a I(String str) {
        }

        public String v() {
        }

        public a w(String str) {
        }

        public a x(String str) {
        }

        public a y(String str) {
        }

        public a z(String str) {
        }

        public a() {
        }
    }

    private l0() {
    }

    public static /* synthetic */ l0 access$000() {
    }

    public static /* synthetic */ void access$100(l0 l0Var, String str) {
    }

    public static /* synthetic */ void access$1000(l0 l0Var, int i2) {
    }

    public static /* synthetic */ void access$1100(l0 l0Var) {
    }

    public static /* synthetic */ void access$1200(l0 l0Var, String str) {
    }

    public static /* synthetic */ void access$1300(l0 l0Var) {
    }

    public static /* synthetic */ void access$1400(l0 l0Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$1500(l0 l0Var, String str) {
    }

    public static /* synthetic */ void access$1600(l0 l0Var) {
    }

    public static /* synthetic */ void access$1700(l0 l0Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$1800(l0 l0Var, String str) {
    }

    public static /* synthetic */ void access$1900(l0 l0Var) {
    }

    public static /* synthetic */ void access$200(l0 l0Var) {
    }

    public static /* synthetic */ void access$2000(l0 l0Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$2100(l0 l0Var, String str) {
    }

    public static /* synthetic */ void access$2200(l0 l0Var) {
    }

    public static /* synthetic */ void access$2300(l0 l0Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$2400(l0 l0Var, int i2) {
    }

    public static /* synthetic */ void access$2500(l0 l0Var) {
    }

    public static /* synthetic */ void access$2600(l0 l0Var, String str) {
    }

    public static /* synthetic */ void access$2700(l0 l0Var) {
    }

    public static /* synthetic */ void access$2800(l0 l0Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$2900(l0 l0Var, int i2) {
    }

    public static /* synthetic */ void access$300(l0 l0Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$3000(l0 l0Var) {
    }

    public static /* synthetic */ void access$3100(l0 l0Var, String str) {
    }

    public static /* synthetic */ void access$3200(l0 l0Var) {
    }

    public static /* synthetic */ void access$3300(l0 l0Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$3400(l0 l0Var, String str) {
    }

    public static /* synthetic */ void access$3500(l0 l0Var) {
    }

    public static /* synthetic */ void access$3600(l0 l0Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$3700(l0 l0Var, String str) {
    }

    public static /* synthetic */ void access$3800(l0 l0Var) {
    }

    public static /* synthetic */ void access$3900(l0 l0Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$400(l0 l0Var, String str) {
    }

    public static /* synthetic */ void access$4000(l0 l0Var, String str) {
    }

    public static /* synthetic */ void access$4100(l0 l0Var) {
    }

    public static /* synthetic */ void access$4200(l0 l0Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$4300(l0 l0Var, String str) {
    }

    public static /* synthetic */ void access$4400(l0 l0Var) {
    }

    public static /* synthetic */ void access$4500(l0 l0Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$4600(l0 l0Var, String str) {
    }

    public static /* synthetic */ void access$4700(l0 l0Var) {
    }

    public static /* synthetic */ void access$4800(l0 l0Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$4900(l0 l0Var, String str) {
    }

    public static /* synthetic */ void access$500(l0 l0Var) {
    }

    public static /* synthetic */ void access$5000(l0 l0Var) {
    }

    public static /* synthetic */ void access$5100(l0 l0Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$5200(l0 l0Var, String str) {
    }

    public static /* synthetic */ void access$5300(l0 l0Var) {
    }

    public static /* synthetic */ void access$5400(l0 l0Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$600(l0 l0Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$700(l0 l0Var, String str) {
    }

    public static /* synthetic */ void access$800(l0 l0Var) {
    }

    public static /* synthetic */ void access$900(l0 l0Var, k.d.c.i iVar) {
    }

    private void clearAdvertisingId() {
    }

    private void clearBssid() {
    }

    private void clearBundleDisplayname() {
    }

    private void clearBundleId() {
    }

    private void clearCarrierName() {
    }

    private void clearDeviceBrand() {
    }

    private void clearDeviceName() {
    }

    private void clearDeviceType() {
    }

    private void clearImei() {
    }

    private void clearIsJailBreak() {
    }

    private void clearLanguage() {
    }

    private void clearModel() {
    }

    private void clearNetworkType() {
    }

    private void clearOsVersion() {
    }

    private void clearSsid() {
    }

    private void clearTimestamp() {
    }

    private void clearTimezone() {
    }

    private void clearUuid() {
    }

    private void clearVendorId() {
    }

    public static l0 getDefaultInstance() {
    }

    public static a newBuilder() {
    }

    public static l0 parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static l0 parseFrom(ByteBuffer byteBuffer) throws k.d.c.c0 {
    }

    public static k.d.c.b1<l0> parser() {
    }

    private void setAdvertisingId(String str) {
    }

    private void setAdvertisingIdBytes(k.d.c.i iVar) {
    }

    private void setBssid(String str) {
    }

    private void setBssidBytes(k.d.c.i iVar) {
    }

    private void setBundleDisplayname(String str) {
    }

    private void setBundleDisplaynameBytes(k.d.c.i iVar) {
    }

    private void setBundleId(String str) {
    }

    private void setBundleIdBytes(k.d.c.i iVar) {
    }

    private void setCarrierName(String str) {
    }

    private void setCarrierNameBytes(k.d.c.i iVar) {
    }

    private void setDeviceBrand(String str) {
    }

    private void setDeviceBrandBytes(k.d.c.i iVar) {
    }

    private void setDeviceName(String str) {
    }

    private void setDeviceNameBytes(k.d.c.i iVar) {
    }

    private void setDeviceType(String str) {
    }

    private void setDeviceTypeBytes(k.d.c.i iVar) {
    }

    private void setImei(String str) {
    }

    private void setImeiBytes(k.d.c.i iVar) {
    }

    private void setIsJailBreak(int i2) {
    }

    private void setLanguage(String str) {
    }

    private void setLanguageBytes(k.d.c.i iVar) {
    }

    private void setModel(String str) {
    }

    private void setModelBytes(k.d.c.i iVar) {
    }

    private void setNetworkType(int i2) {
    }

    private void setOsVersion(String str) {
    }

    private void setOsVersionBytes(k.d.c.i iVar) {
    }

    private void setSsid(String str) {
    }

    private void setSsidBytes(k.d.c.i iVar) {
    }

    private void setTimestamp(int i2) {
    }

    private void setTimezone(String str) {
    }

    private void setTimezoneBytes(k.d.c.i iVar) {
    }

    private void setUuid(String str) {
    }

    private void setUuidBytes(k.d.c.i iVar) {
    }

    private void setVendorId(String str) {
    }

    private void setVendorIdBytes(k.d.c.i iVar) {
    }

    @Override // k.d.c.z
    public final Object dynamicMethod(z.g gVar, Object obj, Object obj2) {
    }

    public String getAdvertisingId() {
    }

    public k.d.c.i getAdvertisingIdBytes() {
    }

    public String getBssid() {
    }

    public k.d.c.i getBssidBytes() {
    }

    public String getBundleDisplayname() {
    }

    public k.d.c.i getBundleDisplaynameBytes() {
    }

    public String getBundleId() {
    }

    public k.d.c.i getBundleIdBytes() {
    }

    public String getCarrierName() {
    }

    public k.d.c.i getCarrierNameBytes() {
    }

    public String getDeviceBrand() {
    }

    public k.d.c.i getDeviceBrandBytes() {
    }

    public String getDeviceName() {
    }

    public k.d.c.i getDeviceNameBytes() {
    }

    public String getDeviceType() {
    }

    public k.d.c.i getDeviceTypeBytes() {
    }

    public String getImei() {
    }

    public k.d.c.i getImeiBytes() {
    }

    public int getIsJailBreak() {
    }

    public String getLanguage() {
    }

    public k.d.c.i getLanguageBytes() {
    }

    public String getModel() {
    }

    public k.d.c.i getModelBytes() {
    }

    public int getNetworkType() {
    }

    public String getOsVersion() {
    }

    public k.d.c.i getOsVersionBytes() {
    }

    public String getSsid() {
    }

    public k.d.c.i getSsidBytes() {
    }

    public int getTimestamp() {
    }

    public String getTimezone() {
    }

    public k.d.c.i getTimezoneBytes() {
    }

    public String getUuid() {
    }

    public k.d.c.i getUuidBytes() {
    }

    public String getVendorId() {
    }

    public k.d.c.i getVendorIdBytes() {
    }

    public boolean hasAdvertisingId() {
    }

    public boolean hasBssid() {
    }

    public boolean hasBundleDisplayname() {
    }

    public boolean hasBundleId() {
    }

    public boolean hasCarrierName() {
    }

    public boolean hasDeviceBrand() {
    }

    public boolean hasDeviceName() {
    }

    public boolean hasDeviceType() {
    }

    public boolean hasImei() {
    }

    public boolean hasIsJailBreak() {
    }

    public boolean hasLanguage() {
    }

    public boolean hasModel() {
    }

    public boolean hasNetworkType() {
    }

    public boolean hasOsVersion() {
    }

    public boolean hasSsid() {
    }

    public boolean hasTimestamp() {
    }

    public boolean hasTimezone() {
    }

    public boolean hasUuid() {
    }

    public boolean hasVendorId() {
    }

    public static a newBuilder(l0 l0Var) {
    }

    public static l0 parseDelimitedFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
    }

    public static l0 parseFrom(ByteBuffer byteBuffer, k.d.c.q qVar) throws k.d.c.c0 {
    }

    public static l0 parseFrom(k.d.c.i iVar) throws k.d.c.c0 {
    }

    public static l0 parseFrom(k.d.c.i iVar, k.d.c.q qVar) throws k.d.c.c0 {
    }

    public static l0 parseFrom(byte[] bArr) throws k.d.c.c0 {
    }

    public static l0 parseFrom(byte[] bArr, k.d.c.q qVar) throws k.d.c.c0 {
    }

    public static l0 parseFrom(InputStream inputStream) throws IOException {
    }

    public static l0 parseFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
    }

    public static l0 parseFrom(k.d.c.j jVar) throws IOException {
    }

    public static l0 parseFrom(k.d.c.j jVar, k.d.c.q qVar) throws IOException {
    }
}
