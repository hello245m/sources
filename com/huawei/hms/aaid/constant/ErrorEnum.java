package com.huawei.hms.aaid.constant;

import android.util.SparseArray;
import com.huawei.hms.common.ApiException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unexpected branching in enum static init block */
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class ErrorEnum {
    private static final /* synthetic */ ErrorEnum[] $VALUES = null;
    private static final SparseArray<ErrorEnum> ENUM_MAPPER = null;
    public static final ErrorEnum ERROR_3RD_PARTY_INTERNAL_ERROR = null;
    public static final ErrorEnum ERROR_API_NOT_SPECIFIED = null;
    public static final ErrorEnum ERROR_APP_SERVER_NOT_ONLINE = null;
    public static final ErrorEnum ERROR_ARGUMENTS_INVALID = null;
    public static final ErrorEnum ERROR_AUTH_INFO_NOT_EXIST = null;
    public static final ErrorEnum ERROR_AUTO_INITIALIZING = null;
    public static final ErrorEnum ERROR_BIND_SERVICE_SELF_MAPPING = null;
    public static final ErrorEnum ERROR_BUILD_CONTENT_ERROR = null;
    public static final ErrorEnum ERROR_CACHE_SIZE_EXCEED = null;
    public static final ErrorEnum ERROR_CERT_FINGERPRINT_EMPTY = null;
    public static final ErrorEnum ERROR_CERT_FINGERPRINT_ERROR = null;
    public static final ErrorEnum ERROR_CLIENT_API_INVALID = null;
    public static final ErrorEnum ERROR_DELETE_3RD_PARTY_TOKEN_FAILED = null;
    public static final ErrorEnum ERROR_EXECUTE_TIMEOUT = null;
    public static final ErrorEnum ERROR_FETCH_DOMAIN_FAILED = null;
    public static final ErrorEnum ERROR_GET_3RD_PARTY_TOKEN_FAILED = null;
    public static final ErrorEnum ERROR_GET_SCOPE_ERROR = null;
    public static final ErrorEnum ERROR_HMS_CLIENT_API = null;
    public static final ErrorEnum ERROR_HMS_DEVICE_AUTH_FAILED_SELF_MAPPING = null;
    public static final ErrorEnum ERROR_HWID_NOT_LOGIN = null;
    public static final ErrorEnum ERROR_INTERNAL_ERROR = null;
    public static final ErrorEnum ERROR_INVALID_PARAMETERS = null;
    public static final ErrorEnum ERROR_LENGTH = null;
    public static final ErrorEnum ERROR_LENGTH_OLD = null;
    public static final ErrorEnum ERROR_MAIN_THREAD = null;
    public static final ErrorEnum ERROR_MISSING_PROJECT_ID = null;
    public static final ErrorEnum ERROR_MSG_CACHE = null;
    public static final ErrorEnum ERROR_MULTISENDER_NO_RIGHT = null;
    public static final ErrorEnum ERROR_NAMING_INVALID = null;
    public static final ErrorEnum ERROR_NOT_ALLOW_CROSS_APPLY = null;
    public static final ErrorEnum ERROR_NOT_IN_SERVICE = null;
    public static final ErrorEnum ERROR_NOT_SUPPORT_SUB_USER = null;
    public static final ErrorEnum ERROR_NO_CONNECTION_ID = null;
    public static final ErrorEnum ERROR_NO_CONNECTION_ID_OLD = null;
    public static final ErrorEnum ERROR_NO_DEVICE_ID_TYPE = null;
    public static final ErrorEnum ERROR_NO_DEVICE_ID_TYPE_OLD = null;
    public static final ErrorEnum ERROR_NO_NETWORK = null;
    public static final ErrorEnum ERROR_NO_NETWORK_OLD = null;
    public static final ErrorEnum ERROR_NO_RIGHT = null;
    public static final ErrorEnum ERROR_NO_RIGHT_SELF_MAPPING = null;
    public static final ErrorEnum ERROR_NO_TOKEN = null;
    public static final ErrorEnum ERROR_NO_TOKENSIGN = null;
    public static final ErrorEnum ERROR_NO_TOKEN_OLD = null;
    public static final ErrorEnum ERROR_OPERATION_NOT_SUPPORTED = null;
    public static final ErrorEnum ERROR_OPER_IN_CHILD_PROCESS = null;
    public static final ErrorEnum ERROR_OVER_FLOW_CONTROL_SIZE = null;
    public static final ErrorEnum ERROR_PARAM_INVALID = null;
    public static final ErrorEnum ERROR_PERMISSION_EXPIRED = null;
    public static final ErrorEnum ERROR_PERMISSION_LIST_EMPTY = null;
    public static final ErrorEnum ERROR_PERMISSION_NOT_AUTHORIZED = null;
    public static final ErrorEnum ERROR_PERMISSION_NOT_EXIST = null;
    public static final ErrorEnum ERROR_PROFILE_EXCEED = null;
    public static final ErrorEnum ERROR_PUSH_ARGUMENTS_INVALID = null;
    public static final ErrorEnum ERROR_PUSH_CLIENT_API_INVALID = null;
    public static final ErrorEnum ERROR_PUSH_EXECUTE_TIMEOUT = null;
    public static final ErrorEnum ERROR_PUSH_INTERNAL_ERROR = null;
    public static final ErrorEnum ERROR_PUSH_NAMING_INVALID = null;
    public static final ErrorEnum ERROR_PUSH_NOT_IN_SERVICE = null;
    public static final ErrorEnum ERROR_PUSH_SERVER = null;
    public static final ErrorEnum ERROR_PUSH_SERVER_OLD = null;
    public static final ErrorEnum ERROR_RESTRICT_GET_TOKEN = null;
    public static final ErrorEnum ERROR_RETRY_LATER_SELF_MAPPING = null;
    public static final ErrorEnum ERROR_SCOPE_LIST_EMPTY = null;
    public static final ErrorEnum ERROR_SEND_SELF_MAPPING = null;
    public static final ErrorEnum ERROR_SERVICE_NOT_AVAILABLE = null;
    public static final ErrorEnum ERROR_SESSION_INVALID = null;
    public static final ErrorEnum ERROR_SIZE = null;
    public static final ErrorEnum ERROR_SPUSH_ESSION_INVALID = null;
    public static final ErrorEnum ERROR_STORAGE_LOCATION_EMPTY = null;
    public static final ErrorEnum ERROR_TOKENSIGN_VALID = null;
    public static final ErrorEnum ERROR_TOKEN_DECRYPT = null;
    public static final ErrorEnum ERROR_TOKEN_URL_EMPTY = null;
    public static final ErrorEnum ERROR_TOO_MANY_MESSAGES = null;
    public static final ErrorEnum ERROR_TOPIC_EXCEED = null;
    public static final ErrorEnum ERROR_TOPIC_SEND = null;
    public static final ErrorEnum ERROR_TTL_EXCEEDED = null;
    public static final ErrorEnum ERROR_UNKNOWN = null;
    public static final ErrorEnum ERROR_UPSTREAM_DEVICE_NOT_IN_GROUP = null;
    public static final ErrorEnum ERROR_UPSTREAM_STORAGE_LOCATION_EMPTY = null;
    public static final ErrorEnum ERROR_UPSTREAM_TOKENSIGN_VALID = null;
    public static final ErrorEnum ERROR_UPSTREAM_TOKEN_DECRYPT = null;
    public static final ErrorEnum SUCCESS = null;
    private int externalCode;
    private int internalCode;
    private String message;

    private ErrorEnum(String str, int i2, int i3, int i4, String str2) {
    }

    public static ErrorEnum fromCode(int i2) {
    }

    public static ErrorEnum valueOf(String str) {
    }

    public static ErrorEnum[] values() {
    }

    public int getExternalCode() {
    }

    public int getInternalCode() {
    }

    public String getMessage() {
    }

    public ApiException toApiException() {
    }
}
