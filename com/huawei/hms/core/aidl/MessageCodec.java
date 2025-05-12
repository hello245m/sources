package com.huawei.hms.core.aidl;

import android.os.Bundle;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class MessageCodec {
    public static final int VAL_ENTITY = 0;
    public static final int VAL_LIST = 1;
    public static final int VAL_NULL = -1;
    public static final String VAL_TYPE = "_val_type_";

    private void a(IMessageEntity iMessageEntity, Field field, Bundle bundle) throws IllegalAccessException {
    }

    private void b(IMessageEntity iMessageEntity, Field field, Bundle bundle) throws IllegalAccessException {
    }

    public IMessageEntity decode(Bundle bundle, IMessageEntity iMessageEntity) {
    }

    public Bundle encode(IMessageEntity iMessageEntity, Bundle bundle) {
    }

    public List<Object> readList(Type type, Bundle bundle) throws InstantiationException, IllegalAccessException {
    }

    public void writeList(String str, List list, Bundle bundle) {
    }

    public void writeValue(String str, Object obj, Bundle bundle) {
    }

    private Object a(Field field, Bundle bundle) {
    }

    private Bundle a(String str, Bundle bundle, Object obj) {
    }

    private boolean a(String str, Object obj, Bundle bundle) {
    }
}
