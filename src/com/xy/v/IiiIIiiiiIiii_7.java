/*
 * Decompiled with CFR 0.152.
 */
package com.xy.v;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IiiIIiiiiIiii {
    /*
     * WARNING - void declaration
     */
    public static byte[] iIiIiiiiIIiii(byte[] data) {
        byte[] IiiiiiiiIIIII = null;
        try {
            void IiiiiiiiIIIII2;
            ByteArrayOutputStream IiiiiiiiIIIII3 = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(IiiiiiiiIIIII3);
            IiiiiiiiIIIII2.write(data);
            IiiiiiiiIIIII2.finish();
            IiiiiiiiIIIII2.close();
            IiiiiiiiIIIII = IiiiiiiiIIIII3.toByteArray();
            IiiiiiiiIIIII3.close();
            return IiiiiiiiIIIII;
        }
        catch (Exception IiiiiiiiIIIII4) {
            IiiiiiiiIIIII4.printStackTrace();
            return IiiiiiiiIIIII;
        }
    }

    /*
     * Unable to fully structure code
     */
    public static byte[] ALLATORIxDEMO(byte[] data) {
        IiiiiiiiIIIII = null;
        try {
            IiiiiiiiIIIII = new ByteArrayInputStream(data);
            IiiiiiiiIIIII = new GZIPInputStream(IiiiiiiiIIIII);
            IiiiiiiiIIIII = new byte[1024];
            IiiiiiiiIIIII = -1;
            IiiiiiiiIIIII = new ByteArrayOutputStream();
            if (true) ** GOTO lbl14
        }
        catch (Exception IiiiiiiiIIIII) {
            IiiiiiiiIIIII.printStackTrace();
            return IiiiiiiiIIIII;
        }
        do {
            IiiiiiiiIIIII.write(IiiiiiiiIIIII, 0, IiiiiiiiIIIII);
lbl14:
            // 2 sources

        } while ((IiiiiiiiIIIII = IiiiiiiiIIIII.read(IiiiiiiiIIIII, 0, IiiiiiiiIIIII.length)) != -1);
        IiiiiiiiIIIII = IiiiiiiiIIIII.toByteArray();
        IiiiiiiiIIIII.flush();
        IiiiiiiiIIIII.close();
        IiiiiiiiIIIII.close();
        IiiiiiiiIIIII.close();
        return IiiiiiiiIIIII;
    }

    public static String ALLATORIxDEMO(byte[] bArray) {
        StringBuffer IiiiiiiiIIIII = new StringBuffer(bArray.length);
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < bArray.length) {
            String IiiiiiiiIIIII3 = Integer.toHexString(0xFF & bArray[IiiiiiiiIIIII2]);
            if (IiiiiiiiIIIII3.length() < 2) {
                IiiiiiiiIIIII.append(0);
            }
            ++IiiiiiiiIIIII2;
            IiiiiiiiIIIII.append(IiiiiiiiIIIII3.toUpperCase());
        }
        return IiiiiiiiIIIII.toString();
    }
}
