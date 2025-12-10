/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.w.iiIiIiiiiIiIi
 *  com.xy.a.w.iiIiiiiiIIiii
 *  com.xy.bean.LoginResult
 *  com.xy.entity.RoleSummoning
 *  com.xy.formula.BaseQl
 *  com.xy.formula.BaseValue
 *  com.xy.formula.Ql
 *  com.xy.formula.RoleProperty
 *  com.xy.game.RoleData
 *  com.xy.i.IiiIiiiiIIIii
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.text.GameView
 *  com.xy.w.IIIIIiiiIiiII
 */
package com.xy.a.w;

import com.xy.a.w.iiIiIiiiiIiIi;
import com.xy.a.w.iiIiiiiiIIiii;
import com.xy.bean.LoginResult;
import com.xy.entity.RoleSummoning;
import com.xy.formula.BaseQl;
import com.xy.formula.BaseValue;
import com.xy.formula.Ql;
import com.xy.formula.RoleProperty;
import com.xy.game.RoleData;
import com.xy.i.IiiIiiiiIIIii;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.text.GameView;
import com.xy.w.IIIIIiiiIiiII;
import java.awt.Component;
import java.awt.Image;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IIIiiiiiiiiIi
extends IiiiIiiiiIiIi {
    private BigDecimal iIiiIiiiiiiII;
    private Image IIiiIiiiIIiIi;
    private static Map<String, Integer> IiIIIiiiiIiiI;
    private int iiIiiiiiiiIii;
    private iiIiIiiiiIiIi[] IiiiiiiiIIIII;
    private static List<String> ALLATORIxDEMO;

    static /* synthetic */ void ALLATORIxDEMO(IIIiiiiiiiiIi arg0, Image arg1) {
        arg0.IIiiIiiiIIiIi = arg1;
    }

    public void ALLATORIxDEMO(int type, double value, String text, String name) {
        if (value == 0.0) {
            return;
        }
        if (type == 1) {
            this.IiiiiiiiIIIII[0].ALLATORIxDEMO(value, text, name);
            return;
        }
        if (type == 2) {
            this.IiiiiiiiIIIII[3].ALLATORIxDEMO(value, text, name);
            return;
        }
        if (type == 3) {
            this.IiiiiiiiIIIII[1].ALLATORIxDEMO(value, text, name);
            return;
        }
        if (type == 4) {
            this.IiiiiiiiIIIII[2].ALLATORIxDEMO(value, text, name);
            return;
        }
        if (type != 5) return;
        this.IiiiiiiiIIIII[4].ALLATORIxDEMO(value, text, name);
    }

    /*
     * Enabled unnecessary exception pruning
     */
    public void ALLATORIxDEMO(Ql ql) {
        try {
            BaseQl IiiiiiiiIIIII = null;
            int IiiiiiiiIIIII2 = 0;
            while (IiiiiiiiIIIII2 < ALLATORIxDEMO.size()) {
                Field IiiiiiiiIIIII3 = ql.getClass().getDeclaredField(ALLATORIxDEMO.get(IiiiiiiiIIIII2));
                if (IiiiiiiiIIIII3 != null) {
                    IiiiiiiiIIIII3.setAccessible(true);
                    double IiiiiiiiIIIII4 = IiiiiiiiIIIII3.getDouble(ql);
                    if (IiiiiiiiIIIII4 != 0.0 && (IiiiiiiiIIIII = IIIiiiiiiiiIi.ALLATORIxDEMO(IiiiiiiiIIIII3.getName(), IiiiiiiiIIIII)).getKey() != null && (!this.ALLATORIxDEMO().ALLATORIxDEMO(2, 3) || IiiiiiiiIIIII.getKey().indexOf("\u4e09\u5c38\u866b") == -1 && IiiiiiiiIIIII.getKey().indexOf("\u9b3c\u706b") == -1 && IiiiiiiiIIIII.getKey().indexOf("\u9057\u5fd8") == -1 && IiiiiiiiIIIII.getKey().indexOf("\u9b45\u60d1") == -1)) {
                        this.ALLATORIxDEMO((int)IiiiiiiiIIIII.getValue(), IiiiiiiiIIIII4, IiiiiiiiIIIII.getKey(), IiiiiiiiIIIII3.getName());
                    }
                }
                ++IiiiiiiiIIIII2;
            }
            Field[] IiiiiiiiIIIII22 = ql.getClass().getDeclaredFields();
            int IiiiiiiiIIIII5 = 0;
            while (IiiiiiiiIIIII5 < IiiiiiiiIIIII22.length) {
                Field IiiiiiiiIIIII6 = IiiiiiiiIIIII22[IiiiiiiiIIIII5];
                if (!ALLATORIxDEMO.contains(IiiiiiiiIIIII6.getName())) {
                    IiiiiiiiIIIII6.setAccessible(true);
                    double IiiiiiiiIIIII7 = IiiiiiiiIIIII6.getDouble(ql);
                    if (IiiiiiiiIIIII7 != 0.0 && (IiiiiiiiIIIII = IIIiiiiiiiiIi.ALLATORIxDEMO(IiiiiiiiIIIII6.getName(), IiiiiiiiIIIII)).getKey() != null && (!this.ALLATORIxDEMO().ALLATORIxDEMO(2, 3) || IiiiiiiiIIIII.getKey().indexOf("\u4e09\u5c38\u866b") == -1 && IiiiiiiiIIIII.getKey().indexOf("\u9b3c\u706b") == -1 && IiiiiiiiIIIII.getKey().indexOf("\u9057\u5fd8") == -1 && IiiiiiiiIIIII.getKey().indexOf("\u9b45\u60d1") == -1)) {
                        this.ALLATORIxDEMO((int)IiiiiiiiIIIII.getValue(), IiiiiiiiIIIII7, IiiiiiiiIIIII.getKey(), IiiiiiiiIIIII6.getName());
                    }
                }
                ++IiiiiiiiIIIII5;
            }
            return;
        }
        catch (Exception IiiiiiiiIIIII) {
            IiiiiiiiIIIII.printStackTrace();
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    static {
        Integer IiiiiiiiIIIII = 3;
        IiIIIiiiiIiiI = new HashMap<String, Integer>();
        IiIIIiiiiIiiI.put("kwl", IiiiiiiiIIIII);
        IiIIIiiiiIiiI.put("kff", IiiiiiiiIIIII);
        IiIIIiiiiIiiI.put("klf", IiiiiiiiIIIII);
        IiIIIiiiiIiiI.put("ksf", IiiiiiiiIIIII);
        IiIIIiiiiIiiI.put("khf", IiiiiiiiIIIII);
        IiIIIiiiiIiiI.put("khl", IiiiiiiiIIIII);
        IiIIIiiiiIiiI.put("khs", IiiiiiiiIIIII);
        IiIIIiiiiIiiI.put("kfy", IiiiiiiiIIIII);
        IiIIIiiiiIiiI.put("kzd", IiiiiiiiIIIII);
        IiIIIiiiiIiiI.put("kyw", IiiiiiiiIIIII);
        IiIIIiiiiIiiI.put("kgh", IiiiiiiiIIIII);
        IiIIIiiiiIiiI.put("eds", 1);
        ALLATORIxDEMO = new ArrayList<String>(40);
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < 40) {
            void IiiiiiiiIIIII3;
            String string = IiiiiiiiIIIII2 == 0 ? "kff" : (IiiiiiiiIIIII2 == 1 ? "khf" : (IiiiiiiiIIIII2 == 2 ? "ksf" : (IiiiiiiiIIIII2 == 3 ? "klf" : (IiiiiiiiIIIII2 == 4 ? "kfy" : (IiiiiiiiIIIII2 == 5 ? "khl" : (IiiiiiiiIIIII2 == 6 ? "khs" : (IiiiiiiiIIIII2 == 7 ? "kyw" : (IiiiiiiiIIIII2 == 8 ? "kzd" : (IiiiiiiiIIIII2 == 9 ? "kzds" : (IiiiiiiiIIIII2 == 10 ? "kzs" : (IiiiiiiiIIIII2 == 11 ? "kzshp" : (IiiiiiiiIIIII2 == 12 ? "kzsmp" : (IiiiiiiiIIIII2 == 13 ? "kgh" : (IiiiiiiiIIIII2 == 14 ? "ksc" : (IiiiiiiiIIIII2 == 15 ? "qff" : (IiiiiiiiIIIII2 == 16 ? "qhf" : (IiiiiiiiIIIII2 == 17 ? "qsf" : (IiiiiiiiIIIII2 == 18 ? "qlf" : (IiiiiiiiIIIII2 == 19 ? "qfy" : (IiiiiiiiIIIII2 == 20 ? "qhl" : (IiiiiiiiIIIII2 == 21 ? "qhs" : (IiiiiiiiIIIII2 == 22 ? "qyw" : (IiiiiiiiIIIII2 == 23 ? "qzd" : (IiiiiiiiIIIII2 == 24 ? "qzds" : (IiiiiiiiIIIII2 == 25 ? "qzs" : (IiiiiiiiIIIII2 == 26 ? "qgh" : (IiiiiiiiIIIII2 == 27 ? "qsc" : (IiiiiiiiIIIII2 == 28 ? "qschx" : (IiiiiiiiIIIII2 == 29 ? "hff" : (IiiiiiiiIIIII2 == 30 ? "hhf" : (IiiiiiiiIIIII2 == 31 ? "hsf" : (IiiiiiiiIIIII2 == 32 ? "hlf" : (IiiiiiiiIIIII2 == 33 ? "hfy" : (IiiiiiiiIIIII2 == 34 ? "hhl" : (IiiiiiiiIIIII2 == 35 ? "hhs" : (IiiiiiiiIIIII2 == 36 ? "hyw" : (IiiiiiiiIIIII2 == 37 ? "hzd" : (IiiiiiiiIIIII2 == 38 ? "hzs" : (IiiiiiiiIIIII2 == 39 ? "hgh" : "")))))))))))))))))))))))))))))))))))))));
            ++IiiiiiiiIIIII2;
            ALLATORIxDEMO.add((String)IiiiiiiiIIIII3);
        }
    }

    static /* synthetic */ int ALLATORIxDEMO(IIIiiiiiiiiIi arg0) {
        return arg0.iiIiiiiiiiIii;
    }

    public void iIiIiiiiIIiIi() {
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.IiiiiiiiIIIII.length) {
            int IiiiiiiiIIIII3 = iiIiIiiiiIiIi.ALLATORIxDEMO((iiIiIiiiiIiIi)this.IiiiiiiiIIIII[IiiiiiiiIIIII2]) ? iiIiIiiiiIiIi.ALLATORIxDEMO((iiIiIiiiiIiIi)this.IiiiiiiiIIIII[IiiiiiiiIIIII2]) : 20;
            this.IiiiiiiiIIIII[IiiiiiiiIIIII2].setBounds(0, IiiiiiiiIIIII, 299, IiiiiiiiIIIII3);
            ++IiiiiiiiIIIII2;
            IiiiiiiiIIIII += IiiiiiiiIIIII3;
        }
        this.iIiIiiiiIIiii(this.getX(), this.getY(), 300, IiiiiiiiIIIII);
    }

    static /* synthetic */ Map ALLATORIxDEMO() {
        return IiIIIiiiiIiiI;
    }

    static /* synthetic */ Image ALLATORIxDEMO(IIIiiiiiiiiIi arg0) {
        return arg0.IIiiIiiiIIiIi;
    }

    private static /* synthetic */ void ALLATORIxDEMO(BaseQl ql) {
        if (ql.getKey() == null) {
            return;
        }
        switch (ql.getKey()) {
            case "\u52a0\u5f3a\u4e09\u5c38\u866b": {
                ql.setKey("\u5f3a\u4e09\u5c38\u866b");
                return;
            }
            case "\u52a0\u5f3a\u9632\u5fa1\u6cd5\u672f\u6548\u679c": {
                ql.setKey("\u52a0\u5f3a\u52a0\u9632\u6cd5\u672f\u6548\u679c");
                return;
            }
            case "\u52a0\u5f3a\u653b\u51fb\u6cd5\u672f\u6548\u679c": {
                ql.setKey("\u52a0\u5f3a\u52a0\u653b\u6cd5\u672f\u6548\u679c");
                return;
            }
            case "\u52a0\u5f3a\u901f\u5ea6\u6cd5\u672f\u6548\u679c": {
                ql.setKey("\u52a0\u5f3a\u52a0\u901f\u6cd5\u672f\u6548\u679c");
                return;
            }
            case "\u81f4\u547d\u7387": {
                ql.setKey("\u81f4\u547d\u51e0\u7387");
                return;
            }
            case "\u72c2\u66b4\u7387": {
                ql.setKey("\u72c2\u66b4\u51e0\u7387");
                return;
            }
            case "\u6297\u96f7\u6cd5\u72c2\u66b4": {
                ql.setKey("\u6297\u96f7\u6cd5\u72c2\u66b4\u51e0\u7387");
                return;
            }
            case "\u6297\u6c34\u6cd5\u72c2\u66b4": {
                ql.setKey("\u6297\u6c34\u6cd5\u72c2\u66b4\u51e0\u7387");
                return;
            }
            case "\u6297\u706b\u6cd5\u72c2\u66b4": {
                ql.setKey("\u6297\u706b\u6cd5\u72c2\u66b4\u51e0\u7387");
                return;
            }
            case "\u6297\u98ce\u6cd5\u72c2\u66b4": {
                ql.setKey("\u6297\u98ce\u6cd5\u72c2\u66b4\u51e0\u7387");
                return;
            }
            case "\u6297\u9b3c\u706b\u72c2\u66b4": {
                ql.setKey("\u6297\u9b3c\u706b\u72c2\u66b4\u51e0\u7387");
                return;
            }
            case "\u6cd5\u672f\u8eb2\u95ea": {
                ql.setKey("\u6cd5\u672f\u8eb2\u95ea\u7387");
                return;
            }
            case "\u96f7\u6cd5\u72c2\u66b4": {
                ql.setKey("\u96f7\u6cd5\u72c2\u66b4\u51e0\u7387");
                return;
            }
            case "\u6c34\u6cd5\u72c2\u66b4": {
                ql.setKey("\u6c34\u6cd5\u72c2\u66b4\u51e0\u7387");
                return;
            }
            case "\u706b\u6cd5\u72c2\u66b4": {
                ql.setKey("\u706b\u6cd5\u72c2\u66b4\u51e0\u7387");
                return;
            }
            case "\u98ce\u6cd5\u72c2\u66b4": {
                ql.setKey("\u98ce\u6cd5\u72c2\u66b4\u51e0\u7387");
                return;
            }
            case "\u9b3c\u706b\u72c2\u66b4": {
                ql.setKey("\u9b3c\u706b\u72c2\u66b4\u51e0\u7387");
                return;
            }
            case "\u4e09\u5c38\u866b\u72c2\u66b4": {
                ql.setKey("\u4e09\u5c38\u866b\u72c2\u66b4\u51e0\u7387");
                return;
            }
            case "\u6297\u6d69\u7136\u6b63\u6c14": {
                ql.setKey("\u4e0a\u5584\u82e5\u6c34");
                return;
            }
            case "\u6297\u9694\u5c71\u5927\u725b": {
                ql.setKey("\u5c18\u57c3\u843d\u5b9a");
                return;
            }
            case "\u6297\u5206\u5149\u5316\u5f71": {
                ql.setKey("\u7075\u7280\u4e00\u70b9");
                return;
            }
            case "\u6297\u5929\u9b54\u89e3\u4f53": {
                ql.setKey("\u5316\u8840\u6210\u78a7");
                return;
            }
            case "\u6297\u9752\u9762\u7360\u7259": {
                ql.setKey("\u7f8e\u4eba\u8fdf\u66ae");
                return;
            }
            case "\u6297\u5c0f\u697c\u591c\u54ed": {
                ql.setKey("\u660e\u73e0\u6709\u6cea");
                return;
            }
            case "\u7269\u7406\u5438\u6536": {
                ql.setKey("\u7269\u7406\u5438\u6536\u7387");
                return;
            }
        }
        if (!ql.getKey().startsWith("\u5f3a")) return;
        if (ql.getKey().startsWith("\u5f3a\u529b")) {
            return;
        }
        ql.setKey("\u52a0" + ql.getKey());
    }

    public IIIiiiiiiiiIi(GameView gameView) {
        super(8, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-2, 0, 300, 114, IiiiIiiiiIiIi.iIIiIiiiiiiIi);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/31.png", (int)10, (int)10, (int)10, (int)10, (boolean)false), null);
        this.IiIiiiiiIIIII = new IiiIiiiiIIIii("sc/e/36.png", 1, this.iIiIiiiiIIiii(), (IiiiIiiiiIiIi)this);
        this.IiIiiiiiIIIII.setBounds(276, 3, 17, 17);
        this.add((Component)this.IiIiiiiiIIIII);
        this.IiiiiiiiIIIII = new iiIiIiiiiIiIi[5];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = new iiIiIiiiiIiIi(this, IiiiiiiiIIIII);
            this.add((Component)this.IiiiiiiiIIIII[IiiiiiiiIIIII++]);
        }
    }

    public static BaseQl ALLATORIxDEMO(String mes, BaseQl ql) {
        if (ql == null) {
            ql = new BaseQl(null, 0.0);
        } else {
            ql.setKey(null);
            ql.setValue(0.0);
        }
        switch (mes) {
            case "qzds": {
                ql.setKey("\u5f3a\u4e2d\u6bd2\u4f24\u5bb3");
                ql.setValue(2.0);
                break;
            }
            case "qzd": {
                ql.setKey("\u5f3a\u4e2d\u6bd2");
                ql.setValue(2.0);
                break;
            }
            case "qhl": {
                ql.setKey("\u5f3a\u6df7\u4e71");
                ql.setValue(2.0);
                break;
            }
            case "qfy": {
                ql.setKey("\u5f3a\u5c01\u5370");
                ql.setValue(2.0);
                break;
            }
            case "qhs": {
                ql.setKey("\u5f3a\u660f\u7761");
                ql.setValue(2.0);
                break;
            }
            case "qlf": {
                ql.setKey("\u5f3a\u96f7\u6cd5");
                ql.setValue(2.0);
                break;
            }
            case "qsf": {
                ql.setKey("\u5f3a\u6c34\u6cd5");
                ql.setValue(2.0);
                break;
            }
            case "qhf": {
                ql.setKey("\u5f3a\u706b\u6cd5");
                ql.setValue(2.0);
                break;
            }
            case "qzs": {
                ql.setKey("\u5f3a\u9707\u6151");
                ql.setValue(2.0);
                break;
            }
            case "hfy": {
                ql.setKey("\u5ffd\u89c6\u5c01\u5370");
                ql.setValue(2.0);
                break;
            }
            case "hzd": {
                ql.setKey("\u5ffd\u89c6\u4e2d\u6bd2");
                ql.setValue(2.0);
                break;
            }
            case "qff": {
                ql.setKey("\u5f3a\u98ce\u6cd5");
                ql.setValue(2.0);
                break;
            }
            case "hhf": {
                ql.setKey("\u5ffd\u89c6\u706b\u6cd5");
                ql.setValue(2.0);
                break;
            }
            case "hhl": {
                ql.setKey("\u5ffd\u89c6\u6df7\u4e71");
                ql.setValue(2.0);
                break;
            }
            case "hhs": {
                ql.setKey("\u5ffd\u89c6\u660f\u7761");
                ql.setValue(2.0);
                break;
            }
            case "hff": {
                ql.setKey("\u5ffd\u89c6\u98ce\u6cd5");
                ql.setValue(2.0);
                break;
            }
            case "hlf": {
                ql.setKey("\u5ffd\u89c6\u96f7\u6cd5");
                ql.setValue(2.0);
                break;
            }
            case "hsf": {
                ql.setKey("\u5ffd\u89c6\u6c34\u6cd5");
                ql.setValue(2.0);
                break;
            }
            case "hyw": {
                ql.setKey("\u5ffd\u89c6\u9057\u5fd8");
                ql.setValue(2.0);
                break;
            }
            case "hgh": {
                ql.setKey("\u5ffd\u89c6\u9b3c\u706b");
                ql.setValue(2.0);
                break;
            }
            case "hzs": {
                ql.setKey("\u5ffd\u89c6\u6297\u9707\u6151");
                ql.setValue(2.0);
                break;
            }
            case "ksc": {
                ql.setKey("\u6297\u4e09\u5c38");
                ql.setValue(1.0);
                break;
            }
            case "hfyv": {
                ql.setKey("\u5ffd\u89c6\u9632\u5fa1\u7a0b\u5ea6");
                ql.setValue(3.0);
                break;
            }
            case "hfyl": {
                ql.setKey("\u5ffd\u89c6\u9632\u5fa1\u51e0\u7387");
                ql.setValue(3.0);
                break;
            }
            case "kzd": {
                ql.setKey("\u6297\u4e2d\u6bd2");
                ql.setValue(1.0);
                break;
            }
            case "kzds": {
                ql.setKey("\u6297\u6bd2\u4f24");
                ql.setValue(1.0);
                break;
            }
            case "kyw": {
                ql.setKey("\u6297\u9057\u5fd8");
                ql.setValue(1.0);
                break;
            }
            case "kgh": {
                ql.setKey("\u6297\u9b3c\u706b");
                ql.setValue(1.0);
                break;
            }
            case "khl": {
                ql.setKey("\u6297\u6df7\u4e71");
                ql.setValue(1.0);
                break;
            }
            case "khs": {
                ql.setKey("\u6297\u660f\u7761");
                ql.setValue(1.0);
                break;
            }
            case "kfy": {
                ql.setKey("\u6297\u5c01\u5370");
                ql.setValue(1.0);
                break;
            }
            case "klf": {
                ql.setKey("\u6297\u96f7");
                ql.setValue(1.0);
                break;
            }
            case "ksf": {
                ql.setKey("\u6297\u6c34");
                ql.setValue(1.0);
                break;
            }
            case "khf": {
                ql.setKey("\u6297\u706b");
                ql.setValue(1.0);
                break;
            }
            case "kwl": {
                ql.setKey("\u6297\u7269\u7406");
                ql.setValue(3.0);
                break;
            }
            case "kzs": {
                ql.setKey("\u6297\u9707\u6151");
                ql.setValue(1.0);
                break;
            }
            case "kff": {
                ql.setKey("\u6297\u98ce");
                ql.setValue(1.0);
                break;
            }
            case "eds": {
                ql.setKey("\u8eb2\u95ea\u7387");
                ql.setValue(3.0);
                break;
            }
            case "efjl": {
                ql.setKey("\u53cd\u51fb\u7387");
                ql.setValue(3.0);
                break;
            }
            case "efjv": {
                ql.setKey("\u53cd\u51fb\u6b21\u6570");
                ql.setValue(3.0);
                break;
            }
            case "kwlgj": {
                ql.setKey("\u9632\u5fa1\u503c");
                ql.setValue(3.0);
                break;
            }
            case "efjff": {
                ql.setKey("\u98ce\u6cd5\u53cd\u51fb");
                ql.setValue(3.0);
                break;
            }
            case "efjhf": {
                ql.setKey("\u706b\u6cd5\u53cd\u51fb");
                ql.setValue(3.0);
                break;
            }
            case "efjlf": {
                ql.setKey("\u96f7\u6cd5\u53cd\u51fb");
                ql.setValue(3.0);
                break;
            }
            case "efjsf": {
                ql.setKey("\u6c34\u6cd5\u53cd\u51fb");
                ql.setValue(3.0);
                break;
            }
            case "efjkx": {
                ql.setKey("\u88ab\u653b\u51fb\u65f6\u91ca\u653e\u542b\u60c5\u8109\u8109");
                ql.setValue(3.0);
                break;
            }
            case "efjjs": {
                ql.setKey("\u88ab\u653b\u51fb\u65f6\u91ca\u653e\u4e7e\u5764\u501f\u901f");
                ql.setValue(3.0);
                break;
            }
            case "efjll": {
                ql.setKey("\u88ab\u653b\u51fb\u65f6\u91ca\u653e\u9b54\u795e\u9644\u8eab");
                ql.setValue(3.0);
                break;
            }
            case "eljl": {
                ql.setKey("\u8fde\u51fb\u7387");
                ql.setValue(3.0);
                break;
            }
            case "eljv": {
                ql.setKey("\u8fde\u51fb\u6b21\u6570");
                ql.setValue(3.0);
                break;
            }
            case "emzl": {
                ql.setKey("\u547d\u4e2d\u7387");
                ql.setValue(3.0);
                break;
            }
            case "ekbl": {
                ql.setKey("\u72c2\u66b4\u7387");
                ql.setValue(3.0);
                break;
            }
            case "efzl": {
                ql.setKey("\u53cd\u9707\u7387");
                ql.setValue(5.0);
                break;
            }
            case "efzcd": {
                ql.setKey("\u53cd\u9707\u7a0b\u5ea6");
                ql.setValue(5.0);
                break;
            }
            case "wxj": {
                ql.setKey("\u91d1");
                ql.setValue(4.0);
                break;
            }
            case "wxm": {
                ql.setKey("\u6728");
                ql.setValue(4.0);
                break;
            }
            case "wxt": {
                ql.setKey("\u571f");
                ql.setValue(4.0);
                break;
            }
            case "wxs": {
                ql.setKey("\u6c34");
                ql.setValue(4.0);
                break;
            }
            case "wxh": {
                ql.setKey("\u706b");
                ql.setValue(4.0);
                break;
            }
            case "wxqj": {
                ql.setKey("\u5f3a\u529b\u514b\u91d1");
                ql.setValue(4.0);
                break;
            }
            case "wxqm": {
                ql.setKey("\u5f3a\u529b\u514b\u6728");
                ql.setValue(4.0);
                break;
            }
            case "wxqt": {
                ql.setKey("\u5f3a\u529b\u514b\u571f");
                ql.setValue(4.0);
                break;
            }
            case "wxqs": {
                ql.setKey("\u5f3a\u529b\u514b\u6c34");
                ql.setValue(4.0);
                break;
            }
            case "wxqh": {
                ql.setKey("\u5f3a\u529b\u514b\u706b");
                ql.setValue(4.0);
                break;
            }
            case "swsx": {
                ql.setKey("\u65e0\u5c5e\u6027\u4f24\u5bb3");
                ql.setValue(5.0);
                break;
            }
            case "sff": {
                ql.setKey("\u98ce\u6cd5\u4f24\u5bb3");
                ql.setValue(2.0);
                break;
            }
            case "slf": {
                ql.setKey("\u96f7\u6cd5\u4f24\u5bb3");
                ql.setValue(2.0);
                break;
            }
            case "ssf": {
                ql.setKey("\u6c34\u6cd5\u4f24\u5bb3");
                ql.setValue(2.0);
                break;
            }
            case "shf": {
                ql.setKey("\u706b\u6cd5\u4f24\u5bb3");
                ql.setValue(2.0);
                break;
            }
            case "szd": {
                ql.setKey("\u6bd2\u4f24\u5bb3");
                ql.setValue(2.0);
                break;
            }
            case "sgh": {
                ql.setKey("\u9b3c\u706b\u4f24\u5bb3");
                ql.setValue(2.0);
                break;
            }
            case "ssc": {
                ql.setKey("\u4e09\u5c38\u4f24\u5bb3");
                ql.setValue(2.0);
                break;
            }
            case "sbls": {
                ql.setKey("\u51b0\u5203\u672f\u4f24\u5bb3");
                ql.setValue(2.0);
                break;
            }
            case "blf": {
                ql.setKey("\u96f7\u6cd5\u72c2\u66b4");
                ql.setValue(2.0);
                break;
            }
            case "bff": {
                ql.setKey("\u98ce\u6cd5\u72c2\u66b4");
                ql.setValue(2.0);
                break;
            }
            case "bsf": {
                ql.setKey("\u6c34\u6cd5\u72c2\u66b4");
                ql.setValue(2.0);
                break;
            }
            case "bhf": {
                ql.setKey("\u706b\u6cd5\u72c2\u66b4");
                ql.setValue(2.0);
                break;
            }
            case "qgh": {
                ql.setKey("\u5f3a\u9b3c\u706b");
                ql.setValue(2.0);
                break;
            }
            case "qsc": {
                ql.setKey("\u52a0\u5f3a\u4e09\u5c38\u866b");
                ql.setValue(2.0);
                break;
            }
            case "qschx": {
                ql.setKey("\u5f3a\u4e09\u5c38\u56de\u8840");
                ql.setValue(2.0);
                break;
            }
            case "ezml": {
                ql.setKey("\u81f4\u547d\u7387");
                ql.setValue(3.0);
                break;
            }
            case "kzml": {
                ql.setKey("\u6297\u81f4\u547d\u7387");
                ql.setValue(3.0);
                break;
            }
            case "bgh": {
                ql.setKey("\u9b3c\u706b\u72c2\u66b4");
                ql.setValue(2.0);
                break;
            }
            case "bsc": {
                ql.setKey("\u4e09\u5c38\u866b\u72c2\u66b4");
                ql.setValue(2.0);
                break;
            }
            case "hds": {
                ql.setKey("\u5ffd\u89c6\u8eb2\u95ea");
                ql.setValue(3.0);
                break;
            }
            case "hfj": {
                ql.setKey("\u5ffd\u89c6\u53cd\u51fb");
                ql.setValue(3.0);
                break;
            }
            case "exfljl": {
                ql.setKey("\u4ed9\u6cd5\u8fde\u51fb\u7387");
                ql.setValue(2.0);
                break;
            }
            case "exfljs": {
                ql.setKey("\u4ed9\u6cd5\u8fde\u51fb\u6b21\u6570");
                ql.setValue(2.0);
                break;
            }
            case "hxfkl": {
                ql.setKey("\u5ffd\u89c6\u4ed9\u6cd5\u6297\u6027\u7387");
                ql.setValue(2.0);
                break;
            }
            case "hxfcd": {
                ql.setKey("\u5ffd\u89c6\u4ed9\u6cd5\u6297\u6027\u7a0b\u5ea6");
                ql.setValue(2.0);
                break;
            }
            case "qyw": {
                ql.setKey("\u52a0\u5f3a\u9057\u5fd8");
                ql.setValue(2.0);
                break;
            }
            case "qgjf": {
                ql.setKey("\u52a0\u5f3a\u653b\u51fb\u6cd5\u672f");
                ql.setValue(2.0);
                break;
            }
            case "qfyf": {
                ql.setKey("\u52a0\u5f3a\u9632\u5fa1\u6cd5\u672f");
                ql.setValue(2.0);
                break;
            }
            case "qsdf": {
                ql.setKey("\u52a0\u5f3a\u901f\u5ea6\u6cd5\u672f");
                ql.setValue(2.0);
                break;
            }
            case "qqk": {
                ql.setKey("\u589e\u52a0\u5f3a\u514b\u6548\u679c");
                ql.setValue(4.0);
                break;
            }
            case "kqk": {
                ql.setKey("\u62b5\u5fa1\u5f3a\u514b\u6548\u679c");
                ql.setValue(4.0);
                break;
            }
            case "klb": {
                ql.setKey("\u968f\u673a\u6297\u7075\u5b9d\u4f24\u5bb3");
                ql.setValue(5.0);
                break;
            }
            case "kwsx": {
                ql.setKey("\u6297\u65e0\u5c5e\u6027\u4f24\u5bb3");
                ql.setValue(5.0);
                break;
            }
            case "kzshp": {
                ql.setKey("\u6297\u9707\u6151\u6c14\u8840");
                ql.setValue(1.0);
                break;
            }
            case "kzsmp": {
                ql.setKey("\u6297\u9707\u6151\u9b54\u6cd5");
                ql.setValue(1.0);
                break;
            }
            case "qzhs": {
                ql.setKey("\u5bf9\u53ec\u5524\u517d\u4f24\u5bb3");
                ql.setValue(5.0);
                break;
            }
            case "kjge": {
                ql.setKey("\u6297\u91d1\u7b8d");
                ql.setValue(5.0);
                break;
            }
            case "kqw": {
                ql.setKey("\u6297\u60c5\u7f51");
                ql.setValue(5.0);
                break;
            }
            case "khr": {
                ql.setKey("\u6297\u6d69\u7136\u6b63\u6c14");
                ql.setValue(5.0);
                break;
            }
            case "kgs": {
                ql.setKey("\u6297\u9694\u5c71\u6253\u725b");
                ql.setValue(5.0);
                break;
            }
            case "kqm": {
                ql.setKey("\u6297\u9752\u9762\u7360\u7259");
                ql.setValue(5.0);
                break;
            }
            case "ktm": {
                ql.setKey("\u6297\u5929\u9b54\u89e3\u4f53");
                ql.setValue(5.0);
                break;
            }
            case "kxl": {
                ql.setKey("\u6297\u5c0f\u697c\u591c\u54ed");
                ql.setValue(5.0);
                break;
            }
            case "kfg": {
                ql.setKey("\u6297\u5206\u5149\u5316\u5f71");
                ql.setValue(5.0);
                break;
            }
            case "f_f": {
                ql.setKey("\u9644\u5c01\u653b\u51fb");
                ql.setValue(5.0);
                break;
            }
            case "f_h": {
                ql.setKey("\u9644\u6df7\u653b\u51fb");
                ql.setValue(5.0);
                break;
            }
            case "f_d": {
                ql.setKey("\u9644\u6bd2\u653b\u51fb");
                ql.setValue(5.0);
                break;
            }
            case "f_zs": {
                ql.setKey("\u9644\u9707\u6151\u653b\u51fb");
                ql.setValue(5.0);
                break;
            }
            case "f_sc": {
                ql.setKey("\u9644\u4e09\u5c38\u653b\u51fb");
                ql.setValue(5.0);
                break;
            }
            case "f_xf": {
                ql.setKey("\u9644\u98ce\u653b\u51fb");
                ql.setValue(5.0);
                break;
            }
            case "f_xh": {
                ql.setKey("\u9644\u706b\u653b\u51fb");
                ql.setValue(5.0);
                break;
            }
            case "f_xs": {
                ql.setKey("\u9644\u6c34\u653b\u51fb");
                ql.setValue(5.0);
                break;
            }
            case "f_xl": {
                ql.setKey("\u9644\u96f7\u653b\u51fb");
                ql.setValue(5.0);
                break;
            }
            case "kbf": {
                ql.setKey("\u6297\u98ce\u6cd5\u72c2\u66b4");
                ql.setValue(1.0);
                break;
            }
            case "kbh": {
                ql.setKey("\u6297\u706b\u6cd5\u72c2\u66b4");
                ql.setValue(1.0);
                break;
            }
            case "kbs": {
                ql.setKey("\u6297\u6c34\u6cd5\u72c2\u66b4");
                ql.setValue(1.0);
                break;
            }
            case "kbl": {
                ql.setKey("\u6297\u96f7\u6cd5\u72c2\u66b4");
                ql.setValue(1.0);
                break;
            }
            case "kbg": {
                ql.setKey("\u6297\u9b3c\u706b\u72c2\u66b4");
                ql.setValue(1.0);
                break;
            }
            case "qmh": {
                ql.setKey("\u52a0\u5f3a\u9b45\u60d1");
                ql.setValue(2.0);
                break;
            }
            case "qjg": {
                ql.setKey("\u5f3a\u91d1\u7b8d");
                ql.setValue(5.0);
                break;
            }
            case "qqw": {
                ql.setKey("\u5f3a\u60c5\u7f51");
                ql.setValue(5.0);
                break;
            }
            case "bjff": {
                ql.setKey("\u98ce\u6cd5\u66b4\u51fb\u51e0\u7387");
                ql.setValue(2.0);
                break;
            }
            case "bjlf": {
                ql.setKey("\u96f7\u6cd5\u66b4\u51fb\u51e0\u7387");
                ql.setValue(2.0);
                break;
            }
            case "bjsf": {
                ql.setKey("\u6c34\u6cd5\u66b4\u51fb\u51e0\u7387");
                ql.setValue(2.0);
                break;
            }
            case "bjhf": {
                ql.setKey("\u706b\u6cd5\u66b4\u51fb\u51e0\u7387");
                ql.setValue(2.0);
                break;
            }
            case "bjhl": {
                ql.setKey("\u6df7\u4e71\u66b4\u51fb\u51e0\u7387");
                ql.setValue(2.0);
                break;
            }
            case "bjfy": {
                ql.setKey("\u5c01\u5370\u66b4\u51fb\u51e0\u7387");
                ql.setValue(2.0);
                break;
            }
            case "bjhs": {
                ql.setKey("\u660f\u7761\u66b4\u51fb\u51e0\u7387");
                ql.setValue(2.0);
                break;
            }
            case "bjzd": {
                ql.setKey("\u4e2d\u6bd2\u66b4\u51fb\u51e0\u7387");
                ql.setValue(2.0);
                break;
            }
            case "bjzs": {
                ql.setKey("\u9707\u6151\u66b4\u51fb\u51e0\u7387");
                ql.setValue(2.0);
                break;
            }
            case "bjjs": {
                ql.setKey("\u52a0\u901f\u66b4\u51fb\u51e0\u7387");
                ql.setValue(2.0);
                break;
            }
            case "bjjg": {
                ql.setKey("\u52a0\u653b\u66b4\u51fb\u51e0\u7387");
                ql.setValue(2.0);
                break;
            }
            case "bjjf": {
                ql.setKey("\u52a0\u9632\u66b4\u51fb\u51e0\u7387");
                ql.setValue(2.0);
                break;
            }
            case "bjsc": {
                ql.setKey("\u4e09\u5c38\u66b4\u51fb\u51e0\u7387");
                ql.setValue(2.0);
                break;
            }
            case "bjmh": {
                ql.setKey("\u9b45\u60d1\u66b4\u51fb\u51e0\u7387");
                ql.setValue(2.0);
                break;
            }
            case "bjgh": {
                ql.setKey("\u9b3c\u706b\u66b4\u51fb\u51e0\u7387");
                ql.setValue(2.0);
                break;
            }
            case "bjyw": {
                ql.setKey("\u9057\u5fd8\u66b4\u51fb\u51e0\u7387");
                ql.setValue(2.0);
                break;
            }
            case "bjlpl": {
                ql.setKey("\u9739\u96f3\u66b4\u51fb\u51e0\u7387");
                ql.setValue(2.0);
                break;
            }
            case "bjlfy": {
                ql.setKey("\u6276\u6447\u66b4\u51fb\u51e0\u7387");
                ql.setValue(2.0);
                break;
            }
            case "bjlcb": {
                ql.setKey("\u6ca7\u6ce2\u66b4\u51fb\u51e0\u7387");
                ql.setValue(2.0);
                break;
            }
            case "bjlgl": {
                ql.setKey("\u7518\u9716\u66b4\u51fb\u51e0\u7387");
                ql.setValue(2.0);
                break;
            }
            case "efsds": {
                ql.setKey("\u6cd5\u672f\u8eb2\u95ea");
                ql.setValue(5.0);
                break;
            }
            case "ejs": {
                ql.setKey("\u4f24\u5bb3\u51cf\u514d");
                ql.setValue(5.0);
                break;
            }
            case "qlpl": {
                ql.setKey("\u52a0\u5f3a\u9739\u96f3\u6548\u679c");
                ql.setValue(2.0);
                break;
            }
            case "qlfy": {
                ql.setKey("\u52a0\u5f3a\u6276\u6447\u6548\u679c");
                ql.setValue(2.0);
                break;
            }
            case "qlcb": {
                ql.setKey("\u52a0\u5f3a\u6ca7\u6ce2\u6548\u679c");
                ql.setValue(2.0);
                break;
            }
            case "qlglv": {
                ql.setKey("\u7518\u9716\u56de\u8840\u503c");
                ql.setValue(2.0);
                break;
            }
            case "qlglc": {
                ql.setKey("\u7518\u9716\u56de\u8840\u7a0b\u5ea6");
                ql.setValue(2.0);
                break;
            }
            case "blfcd": {
                ql.setKey("\u96f7\u6cd5\u72c2\u66b4\u7a0b\u5ea6");
                ql.setValue(2.0);
                break;
            }
            case "bffcd": {
                ql.setKey("\u98ce\u6cd5\u72c2\u66b4\u7a0b\u5ea6");
                ql.setValue(2.0);
                break;
            }
            case "bsfcd": {
                ql.setKey("\u6c34\u6cd5\u72c2\u66b4\u7a0b\u5ea6");
                ql.setValue(2.0);
                break;
            }
            case "bhfcd": {
                ql.setKey("\u706b\u6cd5\u72c2\u66b4\u7a0b\u5ea6");
                ql.setValue(2.0);
                break;
            }
            case "bghcd": {
                ql.setKey("\u9b3c\u706b\u72c2\u66b4\u7a0b\u5ea6");
                ql.setValue(2.0);
                break;
            }
            case "bsccd": {
                ql.setKey("\u4e09\u5c38\u866b\u72c2\u66b4\u7a0b\u5ea6");
                ql.setValue(2.0);
                break;
            }
            case "dzs": {
                ql.setKey("\u9707\u6151\u8eb2\u95ea");
                ql.setValue(5.0);
                break;
            }
            case "dhf": {
                ql.setKey("\u706b\u6cd5\u8eb2\u95ea");
                ql.setValue(5.0);
                break;
            }
            case "dlf": {
                ql.setKey("\u96f7\u6cd5\u8eb2\u95ea");
                ql.setValue(5.0);
                break;
            }
            case "dff": {
                ql.setKey("\u98ce\u6cd5\u8eb2\u95ea");
                ql.setValue(5.0);
                break;
            }
            case "dsf": {
                ql.setKey("\u6c34\u6cd5\u8eb2\u95ea");
                ql.setValue(5.0);
                break;
            }
            case "ddf": {
                ql.setKey("\u6bd2\u6cd5\u8eb2\u95ea");
                ql.setValue(5.0);
                break;
            }
            case "dfy": {
                ql.setKey("\u5c01\u5370\u8eb2\u95ea");
                ql.setValue(5.0);
                break;
            }
            case "dhl": {
                ql.setKey("\u6df7\u4e71\u8eb2\u95ea");
                ql.setValue(5.0);
                break;
            }
            case "dhs": {
                ql.setKey("\u660f\u7761\u8eb2\u95ea");
                ql.setValue(5.0);
                break;
            }
            case "dyw": {
                ql.setKey("\u9057\u5fd8\u8eb2\u95ea");
                ql.setValue(5.0);
                break;
            }
            case "dgh": {
                ql.setKey("\u9b3c\u706b\u8eb2\u95ea");
                ql.setValue(5.0);
                break;
            }
            case "dsc": {
                ql.setKey("\u4e09\u5c38\u866b\u8eb2\u95ea");
                ql.setValue(5.0);
                break;
            }
            case "jsf": {
                ql.setKey("\u6c34\u6cd5\u4f24\u5bb3\u51cf\u514d");
                ql.setValue(5.0);
                break;
            }
            case "jff": {
                ql.setKey("\u98ce\u6cd5\u4f24\u5bb3\u51cf\u514d");
                ql.setValue(5.0);
                break;
            }
            case "jlf": {
                ql.setKey("\u96f7\u6cd5\u4f24\u5bb3\u51cf\u514d");
                ql.setValue(5.0);
                break;
            }
            case "jhf": {
                ql.setKey("\u706b\u6cd5\u4f24\u5bb3\u51cf\u514d");
                ql.setValue(5.0);
                break;
            }
            case "jgh": {
                ql.setKey("\u9b3c\u706b\u4f24\u5bb3\u51cf\u514d");
                ql.setValue(5.0);
                break;
            }
            case "ehsfzl": {
                ql.setKey("\u5ffd\u89c6\u53cd\u9707\u51e0\u7387");
                ql.setValue(5.0);
                break;
            }
            case "mzs": {
                ql.setKey("\u9707\u6151\u547d\u4e2d");
                ql.setValue(5.0);
                break;
            }
            case "mhf": {
                ql.setKey("\u706b\u6cd5\u547d\u4e2d");
                ql.setValue(5.0);
                break;
            }
            case "mlf": {
                ql.setKey("\u96f7\u6cd5\u547d\u4e2d");
                ql.setValue(5.0);
                break;
            }
            case "mff": {
                ql.setKey("\u98ce\u6cd5\u547d\u4e2d");
                ql.setValue(5.0);
                break;
            }
            case "msf": {
                ql.setKey("\u6c34\u6cd5\u547d\u4e2d");
                ql.setValue(5.0);
                break;
            }
            case "mdf": {
                ql.setKey("\u6bd2\u6cd5\u547d\u4e2d");
                ql.setValue(5.0);
                break;
            }
            case "mfy": {
                ql.setKey("\u5c01\u5370\u547d\u4e2d");
                ql.setValue(5.0);
                break;
            }
            case "mhl": {
                ql.setKey("\u6df7\u4e71\u547d\u4e2d");
                ql.setValue(5.0);
                break;
            }
            case "mhs": {
                ql.setKey("\u660f\u7761\u547d\u4e2d");
                ql.setValue(5.0);
                break;
            }
            case "myw": {
                ql.setKey("\u9057\u5fd8\u547d\u4e2d");
                ql.setValue(5.0);
                break;
            }
            case "mgh": {
                ql.setKey("\u9b3c\u706b\u547d\u4e2d");
                ql.setValue(5.0);
                break;
            }
            case "msc": {
                ql.setKey("\u4e09\u5c38\u866b\u547d\u4e2d");
                ql.setValue(5.0);
                break;
            }
            case "jlb": {
                ql.setKey("\u6297\u7075\u5b9d\u4f24\u5bb3");
                ql.setValue(5.0);
                break;
            }
            case "zsf": {
                ql.setKey("\u6c34\u6cd5\u4f24\u5bb3\u52a0\u6df1");
                ql.setValue(5.0);
                break;
            }
            case "zff": {
                ql.setKey("\u98ce\u6cd5\u4f24\u5bb3\u52a0\u6df1");
                ql.setValue(5.0);
                break;
            }
            case "zlf": {
                ql.setKey("\u96f7\u6cd5\u4f24\u5bb3\u52a0\u6df1");
                ql.setValue(5.0);
                break;
            }
            case "zhf": {
                ql.setKey("\u706b\u6cd5\u4f24\u5bb3\u52a0\u6df1");
                ql.setValue(5.0);
                break;
            }
            case "zgh": {
                ql.setKey("\u9b3c\u706b\u4f24\u5bb3\u52a0\u6df1");
                ql.setValue(5.0);
                break;
            }
            case "zdf": {
                ql.setKey("\u6bd2\u6cd5\u4f24\u5bb3\u52a0\u6df1");
                ql.setValue(5.0);
                break;
            }
            case "zzsmp": {
                ql.setKey("\u9707\u6151\u9b54\u6cd5\u4f24\u5bb3\u52a0\u6df1");
                ql.setValue(5.0);
                break;
            }
        }
        IIIiiiiiiiiIi.ALLATORIxDEMO(ql);
        return ql;
    }

    public Double ALLATORIxDEMO(iiIiiiiiIIiii label) {
        double d;
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        if (this.iiIiiiiiiiIii == 1) {
            RoleSummoning IiiiiiiiIIIII2 = IiiiiiiiIIIII.getPet(this.iIiiIiiiiiiII);
            if (IiiiiiiiIIIII2 == null) {
                return null;
            }
            double IiiiiiiiIIIII3 = IiiiiiiiIIIII.getMount(IiiiiiiiIIIII2.getSid()) != null ? 95 : 75;
            return IiiiiiiiIIIII3 - iiIiiiiiIIiii.ALLATORIxDEMO((iiIiiiiiIIiii)label);
        }
        if (this.iiIiiiiiiiIii != 0) return null;
        RoleProperty IiiiiiiiIIIII4 = IiiiiiiiIIIII.getRoleProperty();
        double IiiiiiiiIIIII5 = 0.0;
        double IiiiiiiiIIIII6 = iiIiiiiiIIiii.ALLATORIxDEMO((iiIiiiiiIIiii)label);
        if (iiIiiiiiIIiii.ALLATORIxDEMO((iiIiiiiiIIiii)label).equals("kwl")) {
            IiiiiiiiIIIII5 = 75.0 + (double)IiiiiiiiIIIII4.qhv * 1.5;
            IiiiiiiiIIIII6 = IiiiiiiiIIIII4.getEquip("\u7269\u7406\u5438\u6536");
            d = IiiiiiiiIIIII5;
        } else if (iiIiiiiiIIiii.ALLATORIxDEMO((iiIiiiiiIIiii)label).equals("kff")) {
            IiiiiiiiIIIII5 = 75.0 + (double)IiiiiiiiIIIII4.qhv * 1.5;
            IiiiiiiiIIIII6 = IiiiiiiiIIIII4.getEquip("\u6297\u98ce");
            d = IiiiiiiiIIIII5;
        } else if (iiIiiiiiIIiii.ALLATORIxDEMO((iiIiiiiiIIiii)label).equals("klf")) {
            IiiiiiiiIIIII5 = 75.0 + (double)IiiiiiiiIIIII4.qhv * 1.5;
            IiiiiiiiIIIII6 = IiiiiiiiIIIII4.getEquip("\u6297\u96f7");
            d = IiiiiiiiIIIII5;
        } else if (iiIiiiiiIIiii.ALLATORIxDEMO((iiIiiiiiIIiii)label).equals("ksf")) {
            IiiiiiiiIIIII5 = 75.0 + (double)IiiiiiiiIIIII4.qhv * 1.5;
            IiiiiiiiIIIII6 = IiiiiiiiIIIII4.getEquip("\u6297\u6c34");
            d = IiiiiiiiIIIII5;
        } else if (iiIiiiiiIIiii.ALLATORIxDEMO((iiIiiiiiIIiii)label).equals("khf")) {
            IiiiiiiiIIIII5 = 75.0 + (double)IiiiiiiiIIIII4.qhv * 1.5;
            IiiiiiiiIIIII6 = IiiiiiiiIIIII4.getEquip("\u6297\u706b");
            d = IiiiiiiiIIIII5;
        } else if (iiIiiiiiIIiii.ALLATORIxDEMO((iiIiiiiiIIiii)label).equals("kgh")) {
            IiiiiiiiIIIII5 = 75.0 + (double)IiiiiiiiIIIII4.qhv * 1.5;
            IiiiiiiiIIIII6 = IiiiiiiiIIIII4.getEquip("\u6297\u9b3c\u706b");
            d = IiiiiiiiIIIII5;
        } else if (iiIiiiiiIIiii.ALLATORIxDEMO((iiIiiiiiIIiii)label).equals("khl") || iiIiiiiiIIiii.ALLATORIxDEMO((iiIiiiiiIIiii)label).equals("khs") || iiIiiiiiIIiii.ALLATORIxDEMO((iiIiiiiiIIiii)label).equals("kfy") || iiIiiiiiIIiii.ALLATORIxDEMO((iiIiiiiiIIiii)label).equals("kyw") || iiIiiiiiIIiii.ALLATORIxDEMO((iiIiiiiiIIiii)label).equals("kzd")) {
            String IiiiiiiiIIIII7 = iiIiiiiiIIiii.ALLATORIxDEMO((iiIiiiiiIIiii)label).equals("khl") ? "\u6297\u6df7\u4e71" : (iiIiiiiiIIiii.ALLATORIxDEMO((iiIiiiiiIIiii)label).equals("khs") ? "\u6297\u660f\u7761" : (iiIiiiiiIIiii.ALLATORIxDEMO((iiIiiiiiIIiii)label).equals("kfy") ? "\u6297\u5c01\u5370" : (iiIiiiiiIIiii.ALLATORIxDEMO((iiIiiiiiIIiii)label).equals("kyw") ? "\u6297\u9057\u5fd8" : "\u6297\u4e2d\u6bd2")));
            LoginResult IiiiiiiiIIIII8 = IiiiiiiiIIIII.getLoginResult();
            IiiiiiiiIIIII5 = BaseValue.ALLATORIxDEMO((String)IiiiiiiiIIIII7, (BigDecimal)IiiiiiiiIIIII8.getRace_id()) + (double)IiiiiiiiIIIII4.qhv * 0.4;
            IiiiiiiiIIIII6 = IiiiiiiiIIIII4.getGrade(IiiiiiiiIIIII7) + IiiiiiiiIIIII4.getEquip(IiiiiiiiIIIII7) + IiiiiiiiIIIII4.getBorn(IiiiiiiiIIIII7);
            d = IiiiiiiiIIIII5 *= 1.0 + IiiiiiiiIIIII4.getValue(String.valueOf(IiiiiiiiIIIII7) + "\u4e0a\u9650") / 100.0;
        } else {
            if (iiIiiiiiIIiii.ALLATORIxDEMO((iiIiiiiiIIiii)label).equals("eds")) {
                IiiiiiiiIIIII5 = 75.0 + (double)IiiiiiiiIIIII4.qhv * 1.5;
                IiiiiiiiIIIII6 = IiiiiiiiIIIII4.getEquip("\u8eb2\u95ea\u7387") + IiiiiiiiIIIII4.getEquip("\u8eb2\u95ea") + IiiiiiiiIIIII4.getEquip("\u7269\u7406\u8eb2\u95ea");
            }
            d = IiiiiiiiIIIII5;
        }
        return d - IiiiiiiiIIIII6;
    }

    public void iiiIiiiiiiIIi() {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII++].ALLATORIxDEMO();
        }
    }

    public void ALLATORIxDEMO(Ql ql, int type, BigDecimal id) {
        this.iiIiiiiiiiIii = type;
        this.iIiiIiiiiiiII = id;
        this.iiiIiiiiiiIIi();
        this.ALLATORIxDEMO(ql);
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            iiIiIiiiiIiIi.ALLATORIxDEMO((iiIiIiiiiIiIi)this.IiiiiiiiIIIII[IiiiiiiiIIIII], (boolean)true);
            iiIiIiiiiIiIi iiIiIiiiiIiIi2 = this.IiiiiiiiIIIII[IiiiiiiiIIIII];
            int n = iiIiIiiiiIiIi.iiiIiiiiiiIIi((iiIiIiiiiIiIi)this.IiiiiiiiIIIII[IiiiiiiiIIIII]) * 22;
            int n2 = iiIiIiiiiIiIi.iIiIiiiiIIiii((iiIiIiiiiIiIi)this.IiiiiiiiIIIII[IiiiiiiiIIIII]) * 22;
            ++IiiiiiiiIIIII;
            iiIiIiiiiIiIi.ALLATORIxDEMO((iiIiIiiiiIiIi)iiIiIiiiiIiIi2, (int)(20 + Math.max(n, n2)));
        }
        this.iIiIiiiiIIiIi();
        this.iIiIiiiiIIiii(-1, 0, this.getWidth(), this.getHeight());
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    public void iIiIiiiiIIiii(int id) {
        this.IiiiiiiiIIIII[id - 120].iIiIiiiiIIiii();
    }

    public boolean ALLATORIxDEMO(int type, BigDecimal id) {
        if (this.iiIiiiiiiiIii != type) return false;
        if (this.iiIiiiiiiiIii == 0) {
            return true;
        }
        if (this.iiIiiiiiiiIii != 1) return false;
        if (this.iIiiIiiiiiiII.compareTo(id) != 0) return false;
        return true;
    }
}
