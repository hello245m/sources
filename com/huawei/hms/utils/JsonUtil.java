package com.huawei.hms.utils;

import com.huawei.hms.core.aidl.IMessageEntity;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.security.PrivilegedAction;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class JsonUtil {
    public static final int VAL_BYTE = 2;
    public static final int VAL_ENTITY = 0;
    public static final int VAL_LIST = 1;
    public static final int VAL_MAP = 3;
    public static final int VAL_NULL = -1;
    public static final String VAL_TYPE = "_val_type_";

    /* renamed from: com.huawei.hms.utils.JsonUtil$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class AnonymousClass1 implements PrivilegedAction {
        public final /* synthetic */ Field a;
        public final /* synthetic */ boolean b;

        public AnonymousClass1(Field field, boolean z) {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
        }
    }

    private static String a(IMessageEntity iMessageEntity) throws IllegalAccessException, JSONException {
    }

    private static Object b(IMessageEntity iMessageEntity, Field field, JSONObject jSONObject) throws JSONException, IllegalAccessException {
    }

    public static String createJsonString(IMessageEntity iMessageEntity) {
    }

    public static Object getInfoFromJsonobject(String str, String str2) {
    }

    public static int getIntValue(JSONObject jSONObject, String str) throws JSONException {
    }

    public static String getStringValue(JSONObject jSONObject, String str) throws JSONException {
    }

    public static IMessageEntity jsonToEntity(String str, IMessageEntity iMessageEntity) {
    }

    private static void a(Field field, boolean z) {
    }

    private static Map b(Type type, JSONObject jSONObject) throws JSONException, IllegalAccessException, InstantiationException {
    }

    private static boolean a(String str, Object obj, JSONObject jSONObject) throws JSONException, IllegalAccessException {
    }

    private static void a(String str, Map map, JSONObject jSONObject) throws JSONException, IllegalAccessException {
    }

    private static void a(String str, byte[] bArr, JSONObject jSONObject) throws JSONException {
    }

    private static void a(String str, List<?> list, JSONObject jSONObject) throws JSONException, IllegalAccessException {
    }

    private static void a(IMessageEntity iMessageEntity, Field field, JSONObject jSONObject) throws JSONException, IllegalAccessException {
    }

    private static Object a(String str, JSONObject jSONObject) throws JSONException {
    }

    private static List<Object> a(Type type, JSONObject jSONObject) throws JSONException, IllegalAccessException, InstantiationException {
    }

    private static byte[] a(JSONObject jSONObject) throws JSONException {
    }
}
