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
                    if (IiiiiiiiIIIII4 != 0.0 && (IiiiiiiiIIIII = IIIiiiiiiiiIi.ALLATORIxDEMO(IiiiiiiiIIIII3.getName(), IiiiiiiiIIIII)).getKey() != null && (!this.ALLATORIxDEMO().ALLATORIxDEMO(2, 3) || IiiiiiiiIIIII.getKey().indexOf("三尸虫") == -1 && IiiiiiiiIIIII.getKey().indexOf("鬼火") == -1 && IiiiiiiiIIIII.getKey().indexOf("遗忘") == -1 && IiiiiiiiIIIII.getKey().indexOf("魅惑") == -1)) {
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
                    if (IiiiiiiiIIIII7 != 0.0 && (IiiiiiiiIIIII = IIIiiiiiiiiIi.ALLATORIxDEMO(IiiiiiiiIIIII6.getName(), IiiiiiiiIIIII)).getKey() != null && (!this.ALLATORIxDEMO().ALLATORIxDEMO(2, 3) || IiiiiiiiIIIII.getKey().indexOf("三尸虫") == -1 && IiiiiiiiIIIII.getKey().indexOf("鬼火") == -1 && IiiiiiiiIIIII.getKey().indexOf("遗忘") == -1 && IiiiiiiiIIIII.getKey().indexOf("魅惑") == -1)) {
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
            case "加强三尸虫": {
                ql.setKey("强三尸虫");
                return;
            }
            case "加强防御法术效果": {
                ql.setKey("加强加防法术效果");
                return;
            }
            case "加强攻击法术效果": {
                ql.setKey("加强加攻法术效果");
                return;
            }
            case "加强速度法术效果": {
                ql.setKey("加强加速法术效果");
                return;
            }
            case "致命率": {
                ql.setKey("致命几率");
                return;
            }
            case "狂暴率": {
                ql.setKey("狂暴几率");
                return;
            }
            case "抗雷法狂暴": {
                ql.setKey("抗雷法狂暴几率");
                return;
            }
            case "抗水法狂暴": {
                ql.setKey("抗水法狂暴几率");
                return;
            }
            case "抗火法狂暴": {
                ql.setKey("抗火法狂暴几率");
                return;
            }
            case "抗风法狂暴": {
                ql.setKey("抗风法狂暴几率");
                return;
            }
            case "抗鬼火狂暴": {
                ql.setKey("抗鬼火狂暴几率");
                return;
            }
            case "法术躲闪": {
                ql.setKey("法术躲闪率");
                return;
            }
            case "雷法狂暴": {
                ql.setKey("雷法狂暴几率");
                return;
            }
            case "水法狂暴": {
                ql.setKey("水法狂暴几率");
                return;
            }
            case "火法狂暴": {
                ql.setKey("火法狂暴几率");
                return;
            }
            case "风法狂暴": {
                ql.setKey("风法狂暴几率");
                return;
            }
            case "鬼火狂暴": {
                ql.setKey("鬼火狂暴几率");
                return;
            }
            case "三尸虫狂暴": {
                ql.setKey("三尸虫狂暴几率");
                return;
            }
            case "抗浩然正气": {
                ql.setKey("上善若水");
                return;
            }
            case "抗隔山大牛": {
                ql.setKey("尘埃落定");
                return;
            }
            case "抗分光化影": {
                ql.setKey("灵犀一点");
                return;
            }
            case "抗天魔解体": {
                ql.setKey("化血成碧");
                return;
            }
            case "抗青面獠牙": {
                ql.setKey("美人迟暮");
                return;
            }
            case "抗小楼夜哭": {
                ql.setKey("明珠有泪");
                return;
            }
            case "物理吸收": {
                ql.setKey("物理吸收率");
                return;
            }
        }
        if (!ql.getKey().startsWith("强")) return;
        if (ql.getKey().startsWith("强力")) {
            return;
        }
        ql.setKey("加" + ql.getKey());
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
                ql.setKey("强中毒伤害");
                ql.setValue(2.0);
                break;
            }
            case "qzd": {
                ql.setKey("强中毒");
                ql.setValue(2.0);
                break;
            }
            case "qhl": {
                ql.setKey("强混乱");
                ql.setValue(2.0);
                break;
            }
            case "qfy": {
                ql.setKey("强封印");
                ql.setValue(2.0);
                break;
            }
            case "qhs": {
                ql.setKey("强昏睡");
                ql.setValue(2.0);
                break;
            }
            case "qlf": {
                ql.setKey("强雷法");
                ql.setValue(2.0);
                break;
            }
            case "qsf": {
                ql.setKey("强水法");
                ql.setValue(2.0);
                break;
            }
            case "qhf": {
                ql.setKey("强火法");
                ql.setValue(2.0);
                break;
            }
            case "qzs": {
                ql.setKey("强震慑");
                ql.setValue(2.0);
                break;
            }
            case "hfy": {
                ql.setKey("忽视封印");
                ql.setValue(2.0);
                break;
            }
            case "hzd": {
                ql.setKey("忽视中毒");
                ql.setValue(2.0);
                break;
            }
            case "qff": {
                ql.setKey("强风法");
                ql.setValue(2.0);
                break;
            }
            case "hhf": {
                ql.setKey("忽视火法");
                ql.setValue(2.0);
                break;
            }
            case "hhl": {
                ql.setKey("忽视混乱");
                ql.setValue(2.0);
                break;
            }
            case "hhs": {
                ql.setKey("忽视昏睡");
                ql.setValue(2.0);
                break;
            }
            case "hff": {
                ql.setKey("忽视风法");
                ql.setValue(2.0);
                break;
            }
            case "hlf": {
                ql.setKey("忽视雷法");
                ql.setValue(2.0);
                break;
            }
            case "hsf": {
                ql.setKey("忽视水法");
                ql.setValue(2.0);
                break;
            }
            case "hyw": {
                ql.setKey("忽视遗忘");
                ql.setValue(2.0);
                break;
            }
            case "hgh": {
                ql.setKey("忽视鬼火");
                ql.setValue(2.0);
                break;
            }
            case "hzs": {
                ql.setKey("忽视抗震慑");
                ql.setValue(2.0);
                break;
            }
            case "ksc": {
                ql.setKey("抗三尸");
                ql.setValue(1.0);
                break;
            }
            case "hfyv": {
                ql.setKey("忽视防御程度");
                ql.setValue(3.0);
                break;
            }
            case "hfyl": {
                ql.setKey("忽视防御几率");
                ql.setValue(3.0);
                break;
            }
            case "kzd": {
                ql.setKey("抗中毒");
                ql.setValue(1.0);
                break;
            }
            case "kzds": {
                ql.setKey("抗毒伤");
                ql.setValue(1.0);
                break;
            }
            case "kyw": {
                ql.setKey("抗遗忘");
                ql.setValue(1.0);
                break;
            }
            case "kgh": {
                ql.setKey("抗鬼火");
                ql.setValue(1.0);
                break;
            }
            case "khl": {
                ql.setKey("抗混乱");
                ql.setValue(1.0);
                break;
            }
            case "khs": {
                ql.setKey("抗昏睡");
                ql.setValue(1.0);
                break;
            }
            case "kfy": {
                ql.setKey("抗封印");
                ql.setValue(1.0);
                break;
            }
            case "klf": {
                ql.setKey("抗雷");
                ql.setValue(1.0);
                break;
            }
            case "ksf": {
                ql.setKey("抗水");
                ql.setValue(1.0);
                break;
            }
            case "khf": {
                ql.setKey("抗火");
                ql.setValue(1.0);
                break;
            }
            case "kwl": {
                ql.setKey("抗物理");
                ql.setValue(3.0);
                break;
            }
            case "kzs": {
                ql.setKey("抗震慑");
                ql.setValue(1.0);
                break;
            }
            case "kff": {
                ql.setKey("抗风");
                ql.setValue(1.0);
                break;
            }
            case "eds": {
                ql.setKey("躲闪率");
                ql.setValue(3.0);
                break;
            }
            case "efjl": {
                ql.setKey("反击率");
                ql.setValue(3.0);
                break;
            }
            case "efjv": {
                ql.setKey("反击次数");
                ql.setValue(3.0);
                break;
            }
            case "kwlgj": {
                ql.setKey("防御值");
                ql.setValue(3.0);
                break;
            }
            case "efjff": {
                ql.setKey("风法反击");
                ql.setValue(3.0);
                break;
            }
            case "efjhf": {
                ql.setKey("火法反击");
                ql.setValue(3.0);
                break;
            }
            case "efjlf": {
                ql.setKey("雷法反击");
                ql.setValue(3.0);
                break;
            }
            case "efjsf": {
                ql.setKey("水法反击");
                ql.setValue(3.0);
                break;
            }
            case "efjkx": {
                ql.setKey("被攻击时释放含情脉脉");
                ql.setValue(3.0);
                break;
            }
            case "efjjs": {
                ql.setKey("被攻击时释放乾坤借速");
                ql.setValue(3.0);
                break;
            }
            case "efjll": {
                ql.setKey("被攻击时释放魔神附身");
                ql.setValue(3.0);
                break;
            }
            case "eljl": {
                ql.setKey("连击率");
                ql.setValue(3.0);
                break;
            }
            case "eljv": {
                ql.setKey("连击次数");
                ql.setValue(3.0);
                break;
            }
            case "emzl": {
                ql.setKey("命中率");
                ql.setValue(3.0);
                break;
            }
            case "ekbl": {
                ql.setKey("狂暴率");
                ql.setValue(3.0);
                break;
            }
            case "efzl": {
                ql.setKey("反震率");
                ql.setValue(5.0);
                break;
            }
            case "efzcd": {
                ql.setKey("反震程度");
                ql.setValue(5.0);
                break;
            }
            case "wxj": {
                ql.setKey("金");
                ql.setValue(4.0);
                break;
            }
            case "wxm": {
                ql.setKey("木");
                ql.setValue(4.0);
                break;
            }
            case "wxt": {
                ql.setKey("土");
                ql.setValue(4.0);
                break;
            }
            case "wxs": {
                ql.setKey("水");
                ql.setValue(4.0);
                break;
            }
            case "wxh": {
                ql.setKey("火");
                ql.setValue(4.0);
                break;
            }
            case "wxqj": {
                ql.setKey("强力克金");
                ql.setValue(4.0);
                break;
            }
            case "wxqm": {
                ql.setKey("强力克木");
                ql.setValue(4.0);
                break;
            }
            case "wxqt": {
                ql.setKey("强力克土");
                ql.setValue(4.0);
                break;
            }
            case "wxqs": {
                ql.setKey("强力克水");
                ql.setValue(4.0);
                break;
            }
            case "wxqh": {
                ql.setKey("强力克火");
                ql.setValue(4.0);
                break;
            }
            case "swsx": {
                ql.setKey("无属性伤害");
                ql.setValue(5.0);
                break;
            }
            case "sff": {
                ql.setKey("风法伤害");
                ql.setValue(2.0);
                break;
            }
            case "slf": {
                ql.setKey("雷法伤害");
                ql.setValue(2.0);
                break;
            }
            case "ssf": {
                ql.setKey("水法伤害");
                ql.setValue(2.0);
                break;
            }
            case "shf": {
                ql.setKey("火法伤害");
                ql.setValue(2.0);
                break;
            }
            case "szd": {
                ql.setKey("毒伤害");
                ql.setValue(2.0);
                break;
            }
            case "sgh": {
                ql.setKey("鬼火伤害");
                ql.setValue(2.0);
                break;
            }
            case "ssc": {
                ql.setKey("三尸伤害");
                ql.setValue(2.0);
                break;
            }
            case "sbls": {
                ql.setKey("冰刃术伤害");
                ql.setValue(2.0);
                break;
            }
            case "blf": {
                ql.setKey("雷法狂暴");
                ql.setValue(2.0);
                break;
            }
            case "bff": {
                ql.setKey("风法狂暴");
                ql.setValue(2.0);
                break;
            }
            case "bsf": {
                ql.setKey("水法狂暴");
                ql.setValue(2.0);
                break;
            }
            case "bhf": {
                ql.setKey("火法狂暴");
                ql.setValue(2.0);
                break;
            }
            case "qgh": {
                ql.setKey("强鬼火");
                ql.setValue(2.0);
                break;
            }
            case "qsc": {
                ql.setKey("加强三尸虫");
                ql.setValue(2.0);
                break;
            }
            case "qschx": {
                ql.setKey("强三尸回血");
                ql.setValue(2.0);
                break;
            }
            case "ezml": {
                ql.setKey("致命率");
                ql.setValue(3.0);
                break;
            }
            case "kzml": {
                ql.setKey("抗致命率");
                ql.setValue(3.0);
                break;
            }
            case "bgh": {
                ql.setKey("鬼火狂暴");
                ql.setValue(2.0);
                break;
            }
            case "bsc": {
                ql.setKey("三尸虫狂暴");
                ql.setValue(2.0);
                break;
            }
            case "hds": {
                ql.setKey("忽视躲闪");
                ql.setValue(3.0);
                break;
            }
            case "hfj": {
                ql.setKey("忽视反击");
                ql.setValue(3.0);
                break;
            }
            case "exfljl": {
                ql.setKey("仙法连击率");
                ql.setValue(2.0);
                break;
            }
            case "exfljs": {
                ql.setKey("仙法连击次数");
                ql.setValue(2.0);
                break;
            }
            case "hxfkl": {
                ql.setKey("忽视仙法抗性率");
                ql.setValue(2.0);
                break;
            }
            case "hxfcd": {
                ql.setKey("忽视仙法抗性程度");
                ql.setValue(2.0);
                break;
            }
            case "qyw": {
                ql.setKey("加强遗忘");
                ql.setValue(2.0);
                break;
            }
            case "qgjf": {
                ql.setKey("加强攻击法术");
                ql.setValue(2.0);
                break;
            }
            case "qfyf": {
                ql.setKey("加强防御法术");
                ql.setValue(2.0);
                break;
            }
            case "qsdf": {
                ql.setKey("加强速度法术");
                ql.setValue(2.0);
                break;
            }
            case "qqk": {
                ql.setKey("增加强克效果");
                ql.setValue(4.0);
                break;
            }
            case "kqk": {
                ql.setKey("抵御强克效果");
                ql.setValue(4.0);
                break;
            }
            case "klb": {
                ql.setKey("随机抗灵宝伤害");
                ql.setValue(5.0);
                break;
            }
            case "kwsx": {
                ql.setKey("抗无属性伤害");
                ql.setValue(5.0);
                break;
            }
            case "kzshp": {
                ql.setKey("抗震慑气血");
                ql.setValue(1.0);
                break;
            }
            case "kzsmp": {
                ql.setKey("抗震慑魔法");
                ql.setValue(1.0);
                break;
            }
            case "qzhs": {
                ql.setKey("对召唤兽伤害");
                ql.setValue(5.0);
                break;
            }
            case "kjge": {
                ql.setKey("抗金箍");
                ql.setValue(5.0);
                break;
            }
            case "kqw": {
                ql.setKey("抗情网");
                ql.setValue(5.0);
                break;
            }
            case "khr": {
                ql.setKey("抗浩然正气");
                ql.setValue(5.0);
                break;
            }
            case "kgs": {
                ql.setKey("抗隔山打牛");
                ql.setValue(5.0);
                break;
            }
            case "kqm": {
                ql.setKey("抗青面獠牙");
                ql.setValue(5.0);
                break;
            }
            case "ktm": {
                ql.setKey("抗天魔解体");
                ql.setValue(5.0);
                break;
            }
            case "kxl": {
                ql.setKey("抗小楼夜哭");
                ql.setValue(5.0);
                break;
            }
            case "kfg": {
                ql.setKey("抗分光化影");
                ql.setValue(5.0);
                break;
            }
            case "f_f": {
                ql.setKey("附封攻击");
                ql.setValue(5.0);
                break;
            }
            case "f_h": {
                ql.setKey("附混攻击");
                ql.setValue(5.0);
                break;
            }
            case "f_d": {
                ql.setKey("附毒攻击");
                ql.setValue(5.0);
                break;
            }
            case "f_zs": {
                ql.setKey("附震慑攻击");
                ql.setValue(5.0);
                break;
            }
            case "f_sc": {
                ql.setKey("附三尸攻击");
                ql.setValue(5.0);
                break;
            }
            case "f_xf": {
                ql.setKey("附风攻击");
                ql.setValue(5.0);
                break;
            }
            case "f_xh": {
                ql.setKey("附火攻击");
                ql.setValue(5.0);
                break;
            }
            case "f_xs": {
                ql.setKey("附水攻击");
                ql.setValue(5.0);
                break;
            }
            case "f_xl": {
                ql.setKey("附雷攻击");
                ql.setValue(5.0);
                break;
            }
            case "kbf": {
                ql.setKey("抗风法狂暴");
                ql.setValue(1.0);
                break;
            }
            case "kbh": {
                ql.setKey("抗火法狂暴");
                ql.setValue(1.0);
                break;
            }
            case "kbs": {
                ql.setKey("抗水法狂暴");
                ql.setValue(1.0);
                break;
            }
            case "kbl": {
                ql.setKey("抗雷法狂暴");
                ql.setValue(1.0);
                break;
            }
            case "kbg": {
                ql.setKey("抗鬼火狂暴");
                ql.setValue(1.0);
                break;
            }
            case "qmh": {
                ql.setKey("加强魅惑");
                ql.setValue(2.0);
                break;
            }
            case "qjg": {
                ql.setKey("强金箍");
                ql.setValue(5.0);
                break;
            }
            case "qqw": {
                ql.setKey("强情网");
                ql.setValue(5.0);
                break;
            }
            case "bjff": {
                ql.setKey("风法暴击几率");
                ql.setValue(2.0);
                break;
            }
            case "bjlf": {
                ql.setKey("雷法暴击几率");
                ql.setValue(2.0);
                break;
            }
            case "bjsf": {
                ql.setKey("水法暴击几率");
                ql.setValue(2.0);
                break;
            }
            case "bjhf": {
                ql.setKey("火法暴击几率");
                ql.setValue(2.0);
                break;
            }
            case "bjhl": {
                ql.setKey("混乱暴击几率");
                ql.setValue(2.0);
                break;
            }
            case "bjfy": {
                ql.setKey("封印暴击几率");
                ql.setValue(2.0);
                break;
            }
            case "bjhs": {
                ql.setKey("昏睡暴击几率");
                ql.setValue(2.0);
                break;
            }
            case "bjzd": {
                ql.setKey("中毒暴击几率");
                ql.setValue(2.0);
                break;
            }
            case "bjzs": {
                ql.setKey("震慑暴击几率");
                ql.setValue(2.0);
                break;
            }
            case "bjjs": {
                ql.setKey("加速暴击几率");
                ql.setValue(2.0);
                break;
            }
            case "bjjg": {
                ql.setKey("加攻暴击几率");
                ql.setValue(2.0);
                break;
            }
            case "bjjf": {
                ql.setKey("加防暴击几率");
                ql.setValue(2.0);
                break;
            }
            case "bjsc": {
                ql.setKey("三尸暴击几率");
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
