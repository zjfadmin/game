/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.v.IiiIIiiiiIiii
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.v.iiIiiiiiIIiii
 */
package com.xy.v;

import com.xy.v.IiiIIiiiiIiii;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.v.iiIiiiiiIIiii;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class IiIIIiiiiiiIi {
    public static String iiiiIiiiIiiII;
    public static Cipher iiiIiiiiiiiIi;
    public static String iIiiIiiiiiiII;
    static BASE64Decoder IIiiIiiiIIiIi;
    public static String iIiIiiiiIiIii;
    static BASE64Encoder IiIIIiiiiIiiI;
    public static Cipher iiIiiiiiiiIii;
    static String IiiiiiiiIIIII;
    public static String ALLATORIxDEMO;

    public static synchronized String iiiIiiiiiiIIi(String content) {
        try {
            content = iiIiiiiiIIiii.ALLATORIxDEMO().fromJson(content, String.class);
            byte[] IiiiiiiiIIIII = IIiiIiiiIIiIi.decodeBuffer(content);
            byte[] IiiiiiiiIIIII2 = iiiIiiiiiiiIi.doFinal(IiiiiiiiIIIII);
            IiiiiiiiIIIII2 = IiiIIiiiiIiii.ALLATORIxDEMO((byte[])IiiiiiiiIIIII2);
            String IiiiiiiiIIIII3 = new String(IiiiiiiiIIIII2, ALLATORIxDEMO);
            return IiiiiiiiIIIII3;
        }
        catch (Exception IiiiiiiiIIIII) {
            return null;
        }
    }

    public static synchronized String iIiIiiiiIIiii(String content, String pwd) {
        try {
            if (pwd.length() > 16) {
                pwd = pwd.substring(pwd.length() - 16);
            }
            byte[] IiiiiiiiIIIII = pwd.getBytes(iIiiIiiiiiiII);
            SecretKeySpec IiiiiiiiIIIII2 = new SecretKeySpec(IiiiiiiiIIIII, "AES");
            Cipher IiiiiiiiIIIII3 = Cipher.getInstance(IiIIIiiiiiiIi.IiiiiiiiIIIII);
            IvParameterSpec IiiiiiiiIIIII4 = new IvParameterSpec("0102030405060708".getBytes(iIiiIiiiiiiII));
            IiiiiiiiIIIII3.init(1, (Key)IiiiiiiiIIIII2, IiiiiiiiIIIII4);
            BASE64Encoder IiiiiiiiIIIII5 = new BASE64Encoder();
            byte[] IiiiiiiiIIIII6 = IiiIIiiiiIiii.iIiIiiiiIIiii((byte[])content.getBytes(ALLATORIxDEMO));
            IiiiiiiiIIIII6 = IiiiiiiiIIIII3.doFinal(IiiiiiiiIIIII6);
            return iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII5.encode(IiiiiiiiIIIII6));
        }
        catch (Exception IiiiiiiiIIIII) {
            IiiiiiiiIIIII.printStackTrace();
            return null;
        }
    }

    public static synchronized String ALLATORIxDEMO(String content, String pwd) {
        try {
            if (pwd.length() > 16) {
                pwd = pwd.substring(pwd.length() - 16);
            }
            byte[] IiiiiiiiIIIII = pwd.getBytes("ASCII");
            SecretKeySpec IiiiiiiiIIIII2 = new SecretKeySpec(IiiiiiiiIIIII, iIiIiiiiIiIii);
            Cipher IiiiiiiiIIIII3 = Cipher.getInstance(IiIIIiiiiiiIi.IiiiiiiiIIIII);
            IvParameterSpec IiiiiiiiIIIII4 = new IvParameterSpec("0102030405060708".getBytes());
            IiiiiiiiIIIII3.init(2, (Key)IiiiiiiiIIIII2, IiiiiiiiIIIII4);
            BASE64Decoder IiiiiiiiIIIII5 = new BASE64Decoder();
            content = iiIiiiiiIIiii.ALLATORIxDEMO().fromJson(content, String.class);
            byte[] IiiiiiiiIIIII6 = IiiiiiiiIIIII5.decodeBuffer(content);
            byte[] IiiiiiiiIIIII7 = IiiiiiiiIIIII3.doFinal(IiiiiiiiIIIII6);
            IiiiiiiiIIIII7 = IiiIIiiiiIiii.ALLATORIxDEMO((byte[])IiiiiiiiIIIII7);
            String IiiiiiiiIIIII8 = new String(IiiiiiiiIIIII7, ALLATORIxDEMO);
            return IiiiiiiiIIIII8;
        }
        catch (Exception IiiiiiiiIIIII) {
            IiiiiiiiIIIII.printStackTrace();
            return null;
        }
    }

    public static synchronized String iIiIiiiiIIiii(String content) {
        try {
            content = String.valueOf(iIiIIiiiIiiiI.iiiIiiiiiiIIi()) + content;
            byte[] IiiiiiiiIIIII = IiiIIiiiiIiii.iIiIiiiiIIiii((byte[])content.getBytes(iIiiIiiiiiiII));
            IiiiiiiiIIIII = iiIiiiiiiiIii.doFinal(IiiiiiiiIIIII);
            return iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiIIIiiiiIiiI.encode(IiiiiiiiIIIII));
        }
        catch (Exception IiiiiiiiIIIII) {
            IiiiiiiiIIIII.printStackTrace();
            return null;
        }
    }

    public static synchronized String ALLATORIxDEMO(String content) {
        try {
            content = iiIiiiiiIIiii.ALLATORIxDEMO().fromJson(content, String.class);
            byte[] IiiiiiiiIIIII = IIiiIiiiIIiIi.decodeBuffer(content);
            byte[] IiiiiiiiIIIII2 = iiiIiiiiiiiIi.doFinal(IiiiiiiiIIIII);
            IiiiiiiiIIIII2 = IiiIIiiiiIiii.ALLATORIxDEMO((byte[])IiiiiiiiIIIII2);
            String IiiiiiiiIIIII3 = new String(IiiiiiiiIIIII2, iIiiIiiiiiiII);
            return IiiiiiiiIIIII3;
        }
        catch (Exception IiiiiiiiIIIII) {
            IiiiiiiiIIIII.printStackTrace();
            return null;
        }
    }

    static {
        IvParameterSpec IiiiiiiiIIIII;
        SecretKeySpec IiiiiiiiIIIII2;
        byte[] IiiiiiiiIIIII3;
        iiiiIiiiIiiII = "1234567890123456";
        iIiIiiiiIiIii = "AES";
        iIiiIiiiiiiII = "UTF-8";
        ALLATORIxDEMO = "GBK";
        IiIIIiiiiiiIi.IiiiiiiiIIIII = "AES/CBC/PKCS5Padding";
        try {
            IiiiiiiiIIIII3 = iiiiIiiiIiiII.getBytes(iIiiIiiiiiiII);
            IiiiiiiiIIIII2 = new SecretKeySpec(IiiiiiiiIIIII3, "AES");
            iiIiiiiiiiIii = Cipher.getInstance(IiIIIiiiiiiIi.IiiiiiiiIIIII);
            IiiiiiiiIIIII = new IvParameterSpec("0102030405060708".getBytes(iIiiIiiiiiiII));
            iiIiiiiiiiIii.init(1, (Key)IiiiiiiiIIIII2, IiiiiiiiIIIII);
            IiIIIiiiiIiiI = new BASE64Encoder();
        }
        catch (Exception IiiiiiiiIIIII4) {
            IiiiiiiiIIIII4.printStackTrace();
        }
        try {
            IiiiiiiiIIIII3 = iiiiIiiiIiiII.getBytes("ASCII");
            IiiiiiiiIIIII2 = new SecretKeySpec(IiiiiiiiIIIII3, iIiIiiiiIiIii);
            iiiIiiiiiiiIi = Cipher.getInstance("AES/CBC/PKCS5Padding");
            IiiiiiiiIIIII = new IvParameterSpec("0102030405060708".getBytes());
            iiiIiiiiiiiIi.init(2, (Key)IiiiiiiiIIIII2, IiiiiiiiIIIII);
            IIiiIiiiIIiIi = new BASE64Decoder();
        }
        catch (Exception IiiiiiiiIIIII5) {
            IiiiiiiiIIIII5.printStackTrace();
        }
    }
}
