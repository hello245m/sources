package com.tencent.mobileqq.qfix.redirect;

import androidx.annotation.Keep;

@Keep
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public interface IPatchRedirector {
    boolean hasPatch(short s2);

    Object redirect(short s2);

    Object redirect(short s2, Object obj);

    Object redirect(short s2, Object obj, int i2);

    Object redirect(short s2, Object obj, int i2, Object obj2);

    Object redirect(short s2, Object obj, long j2);

    Object redirect(short s2, Object obj, Object obj2);

    Object redirect(short s2, Object obj, Object obj2, int i2);

    Object redirect(short s2, Object obj, Object obj2, Object obj3);

    Object redirect(short s2, Object obj, Object obj2, Object obj3, Object obj4);

    Object redirect(short s2, Object obj, boolean z);

    Object redirect(short s2, Object... objArr);
}
