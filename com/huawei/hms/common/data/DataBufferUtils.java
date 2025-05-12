package com.huawei.hms.common.data;

import android.os.Bundle;
import java.util.ArrayList;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class DataBufferUtils {
    public static final int ARGS_BUNDLE = 4;
    public static final int ARGS_COLUMN = 1;
    public static final int ARGS_CURSOR = 2;
    public static final int ARGS_STATUS = 3;
    public static final int ARGS_VERSION = 1000;
    public static final String NEXT_PAGE = "next_page";
    public static final String PREV_PAGE = "prev_page";

    private DataBufferUtils() {
    }

    private static boolean a(Bundle bundle, String str) {
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freezeAndClose(DataBuffer<E> dataBuffer) {
    }

    public static boolean hasData(DataBuffer<?> dataBuffer) {
    }

    public static boolean hasNextPage(DataBuffer<?> dataBuffer) {
    }

    public static boolean hasPrevPage(DataBuffer<?> dataBuffer) {
    }
}
