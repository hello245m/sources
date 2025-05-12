package k.d.c;

import java.io.IOException;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public interface s0 extends t0 {

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface a extends t0, Cloneable {
        s0 L();

        s0 build();

        a f(i iVar, q qVar) throws c0;

        a m(s0 s0Var);

        a s(j jVar, q qVar) throws IOException;
    }

    b1<? extends s0> getParserForType();

    int getSerializedSize();

    a newBuilderForType();

    a toBuilder();

    i toByteString();

    void writeTo(l lVar) throws IOException;
}
