/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IiIiiiiiIIIiI
 *  com.xy.a.a.IIiiIiiiIiiiI
 *  com.xy.bean.PayvipBean
 *  com.xy.bean.UseCardBean
 *  com.xy.entity.Baby
 *  com.xy.entity.Lingbao
 *  com.xy.formula.Arith
 *  com.xy.formula.BaseEquip
 *  com.xy.formula.BaseGemOld
 *  com.xy.formula.BaseValue
 *  com.xy.formula.ExpUtil
 *  com.xy.formula.GoodType
 *  com.xy.formula.MsgUntil
 *  com.xy.formula.PropertyUtil
 *  com.xy.formula.QualityZW
 *  com.xy.formula.SkillUtil
 *  com.xy.game.RoleData
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.BabyResult
 *  com.xy.readbean.Eshop
 *  com.xy.readbean.GemOld
 *  com.xy.readbean.Goodstable
 *  com.xy.readbean.RoleSuitBean
 *  com.xy.readbean.RoleTxBean
 *  com.xy.readbean.Shop
 *  com.xy.readbean.Skill
 *  com.xy.readbean.StallBuyData
 *  com.xy.readbean.StarSoul
 *  com.xy.readbean.Talent
 *  com.xy.richtext.RichLabel
 *  com.xy.text.GameView
 *  com.xy.v.IIiIiiiiIiIII
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.IiiiiiiiiIIII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIiiIi
 */
package com.xy.a;

import com.xy.a.IiIiiiiiIIIiI;
import com.xy.a.a.IIiiIiiiIiiiI;
import com.xy.bean.PayvipBean;
import com.xy.bean.UseCardBean;
import com.xy.entity.Baby;
import com.xy.entity.Lingbao;
import com.xy.formula.Arith;
import com.xy.formula.BaseEquip;
import com.xy.formula.BaseGemOld;
import com.xy.formula.BaseValue;
import com.xy.formula.ExpUtil;
import com.xy.formula.GoodType;
import com.xy.formula.MsgUntil;
import com.xy.formula.PropertyUtil;
import com.xy.formula.QualityZW;
import com.xy.formula.SkillUtil;
import com.xy.game.RoleData;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.BabyResult;
import com.xy.readbean.Eshop;
import com.xy.readbean.GemOld;
import com.xy.readbean.Goodstable;
import com.xy.readbean.RoleSuitBean;
import com.xy.readbean.RoleTxBean;
import com.xy.readbean.Shop;
import com.xy.readbean.Skill;
import com.xy.readbean.StallBuyData;
import com.xy.readbean.StarSoul;
import com.xy.readbean.Talent;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import com.xy.v.IIiIiiiiIiIII;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.IiiiiiiiiIIII;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.IIiIiiiiIiiIi;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.image.ImageObserver;
import java.math.BigDecimal;
import java.util.Map;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iiIiiiiiIIiiI
extends IiiiIiiiiIiIi {
    private boolean iIiiIiiiiiiII;
    private RichLabel IIiiIiiiIIiIi;
    private IIIiiiiiIiIiI iIiIiiiiIiIii;
    private int IiIIIiiiiIiiI;
    private RichLabel iiIiiiiiiiIii;
    private boolean IiiiiiiiIIIII;
    private RichLabel ALLATORIxDEMO;

    public void iIiIiiiiIIiIi(StringBuffer buffer, String color, Goodstable good) {
        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)good.getValue())) {
            return;
        }
        String IiiiiiiiIIIII = good.getValue();
        String IiiiiiiiIIIII2 = null;
        String IiiiiiiiIIIII3 = null;
        String IiiiiiiiIIIII4 = null;
        String IiiiiiiiIIIII5 = null;
        int IiiiiiiiIIIII6 = 0;
        int IiiiiiiiIIIII7 = 0;
        int IiiiiiiiIIIII8 = 0;
        while (IiiiiiiiIIIII8 < IiiiiiiiIIIII.length()) {
            IiiiiiiiIIIII8 = IiiiiiiiIIIII.indexOf("|", IiiiiiiiIIIII7 + 1);
            if (IiiiiiiiIIIII8 == -1) {
                IiiiiiiiIIIII8 = IiiiiiiiIIIII.length();
            }
            if (IiiiiiiiIIIII6 == 0) {
                IiiiiiiiIIIII2 = IiiiiiiiIIIII.substring(IiiiiiiiIIIII7 + 3, IiiiiiiiIIIII8);
            } else if (IiiiiiiiIIIII6 == 1) {
                IiiiiiiiIIIII3 = IiiiiiiiIIIII.substring(IiiiiiiiIIIII7 + 3, IiiiiiiiIIIII8);
            } else if (IiiiiiiiIIIII6 == 2) {
                IiiiiiiiIIIII4 = IiiiiiiiIIIII.substring(IiiiiiiiIIIII7 + 3, IiiiiiiiIIIII8);
                if (buffer.length() != 0) {
                    buffer.append("#r");
                }
                color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#cFFFFFF");
                buffer.append("\u3010\u7b49\u7ea7\u3011 ");
                buffer.append(IiiiiiiiIIIII2);
                if (buffer.length() != 0) {
                    buffer.append("#r");
                }
                color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#cFFFFFF");
                buffer.append("\u3010\u795e\u529b\u3011 ");
                color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#cFFFF00");
                buffer.append(IiiiiiiiIIIII3);
                buffer.append("/");
                buffer.append(Integer.parseInt(IiiiiiiiIIIII2.split("/")[0]) * 200);
                if (buffer.length() != 0) {
                    buffer.append("#r");
                }
                color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#cFFFFFF");
                buffer.append("\u3010\u6218\u529b\u3011 ");
                color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#cFFFF00");
                buffer.append(IiiiiiiiIIIII4);
            } else {
                String IiiiiiiiIIIII9 = IiiiiiiiIIIII.substring(IiiiiiiiIIIII7, IiiiiiiiIIIII8);
                if (IiiiiiiiIIIII9.startsWith(GoodType.Extras[0])) {
                    IiiiiiiiIIIII5 = this.ALLATORIxDEMO(buffer, IiiiiiiiIIIII9, 520L);
                } else if (IiiiiiiiIIIII9.startsWith(GoodType.Extras[6])) {
                    this.ALLATORIxDEMO(buffer, IiiiiiiiIIIII9, IiiiiiiiIIIII5);
                }
            }
            ++IiiiiiiiIIIII6;
            IiiiiiiiIIIII7 = IiiiiiiiIIIII8 + 1;
        }
    }

    public void iiiIiiiiiiIIi(StringBuffer buffer, String color, Goodstable good) {
        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)good.getValue())) {
            return;
        }
        String[] IiiiiiiiIIIII = good.getValue().split("\\|");
        if (buffer.length() != 0) {
            buffer.append("#r");
        }
        color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#cFFFFFF");
        buffer.append("\u3010\u7b49\u7ea7\u3011 ");
        buffer.append(IiiiiiiiIIIII[0].substring(3));
        if (buffer.length() != 0) {
            buffer.append("#r");
        }
        color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#cFFFFFF");
        buffer.append("\u3010\u88c5\u5907\u90e8\u4f4d\u3011 ");
        buffer.append(IiiiiiiiIIIII[1].substring(5));
        if (buffer.length() != 0) {
            buffer.append("#r");
        }
        color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#cFFFFFF");
        buffer.append("\u3010\u7b49\u7ea7\u9700\u6c42\u3011 ");
        buffer.append(IiiiiiiiIIIII[2].substring(5));
        int IiiiiiiiIIIII2 = 3;
        while (IiiiiiiiIIIII2 < IiiiiiiiIIIII.length) {
            if (IiiiiiiiIIIII[IiiiiiiiIIIII2].startsWith("\u54c1\u8d28")) break;
            if (buffer.length() != 0) {
                buffer.append("#r");
            }
            color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#cFFFFFF");
            String[] IiiiiiiiIIIII3 = IiiiiiiiIIIII[IiiiiiiiIIIII2].split("=");
            buffer.append("\u3010");
            buffer.append(IiiiiiiiIIIII3[0]);
            buffer.append("\u3011 ");
            ++IiiiiiiiIIIII2;
            buffer.append(IiiiiiiiIIIII3[1]);
        }
        if (buffer.length() != 0) {
            buffer.append("#r");
        }
        color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#cFFFFFF");
        buffer.append("\u3010\u54c1\u8d28\u3011 ");
        buffer.append(IiiiiiiiIIIII[IiiiiiiiIIIII2].substring(3));
        buffer.append("/100");
        if (buffer.length() != 0) {
            buffer.append("#r");
        }
        color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#cFFFFFF");
        buffer.append("\u3010\u901a\u7075\u3011 ");
        int IiiiiiiiIIIII4 = Integer.parseInt(IiiiiiiiIIIII[0].substring(3));
        buffer.append(IiiiiiiiIIIII[IiiiiiiiIIIII2 + 1].substring(3));
        buffer.append("/");
        buffer.append(IiiiiiiiIIIII4 * 1000);
        boolean IiiiiiiiIIIII5 = true;
        int IiiiiiiiIIIII6 = IiiiiiiiIIIII2 + 2;
        while (IiiiiiiiIIIII6 < IiiiiiiiIIIII.length) {
            if (IiiiiiiiIIIII[IiiiiiiiIIIII6].startsWith(GoodType.Extras[0])) {
                this.ALLATORIxDEMO(buffer, IiiiiiiiIIIII[IiiiiiiiIIIII6], good.getType());
            } else if (IiiiiiiiIIIII[IiiiiiiiIIIII6].startsWith(GoodType.Extras[5])) {
                IiiiiiiiIIIII5 = false;
                this.iiiiiiiiIIiii(buffer, IiiiiiiiIIIII[IiiiiiiiIIIII6]);
            }
            ++IiiiiiiiIIIII6;
        }
        if (!IiiiiiiiIIIII5) return;
        if (buffer.length() != 0) {
            buffer.append("#r");
        }
        color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#c00FDF1");
        buffer.append("\u672a\u5f00\u542f\u89c9\u9192(\u5f00\u542f\u94c3\u3001\u73af\u3001\u7532\u4e4b\u89c9\u9192\uff0c\u53ef\u9886\u609f\u89c9\u9192\u6280)");
    }

    public void ALLATORIxDEMO(StallBuyData buyData) {
        this.iIiIiiiiIIiIi();
        this.IiIIIiiiiIiiI = 1;
        this.iIiIiiiiIiIii.ALLATORIxDEMO(IIiIiiiiIiiIi.iiiiiiiiIIiii((String)buyData.getSkin()));
        this.IIiiIiiiIIiIi.setTextSize("#cFFFF75" + buyData.getName(), 215);
        String IiiiiiiiIIIII = "#W";
        StringBuffer IiiiiiiiIIIII2 = new StringBuffer();
        if (buyData.getText() != null && !buyData.getText().equals("")) {
            IiiiiiiiIIIII2.append(buyData.getText());
        }
        this.iiIiiiiiiiIii.setTextSize(IiiiiiiiIIIII2.toString(), 215);
        this.iiiIiiiiiiIIi(false);
    }

    public void iiiiiiiiIIiii(String text) {
        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)text)) {
            return;
        }
        this.iIiIiiiiIIiIi();
        this.iiIiiiiiiiIii.setFont(iiIIiiiiIiiII.iIIIiiiiIIIii);
        this.iiIiiiiiiiIii.setTextSize(text, 255);
        this.iiiiiiiiIIiii();
    }

    public void IiiIiiiiiiIiI(String text) {
        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)text)) {
            return;
        }
        this.iIiIiiiiIIiIi();
        this.iiIiiiiiiiIii.setTextSize(text, 255);
        this.iiiiiiiiIIiii();
    }

    public static String ALLATORIxDEMO(String remark, Skill skill, String sld, String lvl) {
        remark = remark.replace("{\u516c\u5f0f\u4e00}", "#R" + (int)Arith.iiiIiiiiiiIIi((double)Arith.ALLATORIxDEMO((double)Arith.iiiIiiiiiiIIi((double)Double.parseDouble(skill.getValue()), (double)Double.parseDouble(sld)), (double)5.0, (int)0), (double)Math.sqrt(Double.parseDouble(lvl))) + "#G");
        remark = remark.replace("{\u516c\u5f0f\u4e8c}", "#R" + (int)Arith.iiiIiiiiiiIIi((double)Arith.iiiIiiiiiiIIi((double)Arith.ALLATORIxDEMO((double)Arith.iiiIiiiiiiIIi((double)Double.parseDouble(skill.getValue()), (double)Double.parseDouble(sld)), (double)5.0, (int)0), (double)Math.sqrt(Double.parseDouble(lvl))), (double)Double.parseDouble("0.8")) + "#G");
        remark = remark.replace("{\u516c\u5f0f\u4e09}", "#R" + (int)Arith.iiiIiiiiiiIIi((double)Arith.iiiIiiiiiiIIi((double)Arith.ALLATORIxDEMO((double)Arith.iiiIiiiiiiIIi((double)Double.parseDouble(skill.getValue()), (double)Double.parseDouble(sld)), (double)5.0, (int)0), (double)Math.sqrt(Double.parseDouble(lvl))), (double)Double.parseDouble("0.7")) + "#G");
        remark = remark.replace("{\u516c\u5f0f\u56db}", "#R" + (int)Arith.iiiIiiiiiiIIi((double)Arith.iiiIiiiiiiIIi((double)Arith.ALLATORIxDEMO((double)Arith.iiiIiiiiiiIIi((double)Double.parseDouble(skill.getValue()), (double)Double.parseDouble(sld)), (double)5.0, (int)0), (double)Math.sqrt(Double.parseDouble(lvl))), (double)Double.parseDouble("0.3")) + "#G");
        remark = remark.replace("{\u516c\u5f0f\u4e94}", "#R" + (int)Arith.iIiIiiiiIIiii((double)Double.parseDouble("100"), (double)Arith.iiiIiiiiiiIIi((double)Arith.ALLATORIxDEMO((double)Arith.iiiIiiiiiiIIi((double)Double.parseDouble(skill.getValue()), (double)Double.parseDouble(sld)), (double)5.0, (int)0), (double)Math.sqrt(Double.parseDouble(lvl)))) + "#G");
        remark = remark.replace("{\u516c\u5f0f\u516d}", "#R" + (int)Arith.iiiIiiiiiiIIi((double)Arith.iiiIiiiiiiIIi((double)Arith.ALLATORIxDEMO((double)Arith.iiiIiiiiiiIIi((double)Double.parseDouble(skill.getValue()), (double)Double.parseDouble(sld)), (double)5.0, (int)0), (double)Math.sqrt(Double.parseDouble(lvl))), (double)Double.parseDouble("0.25")) + "#G");
        remark = remark.replace("{\u516c\u5f0f\u4e03}", "#R" + (int)Arith.ALLATORIxDEMO((double)Double.parseDouble("100"), (double)Arith.iiiIiiiiiiIIi((double)Arith.ALLATORIxDEMO((double)Arith.iiiIiiiiiiIIi((double)Double.parseDouble(skill.getValue()), (double)Double.parseDouble(sld)), (double)5.0, (int)0), (double)Math.sqrt(Double.parseDouble(lvl)))) + "#G");
        remark = remark.replace("{\u516c\u5f0f\u516b}", "#R" + (int)Arith.ALLATORIxDEMO((double)Double.parseDouble("1"), (double)Arith.iiiIiiiiiiIIi((double)Arith.iiiIiiiiiiIIi((double)Arith.ALLATORIxDEMO((double)Arith.iiiIiiiiiiIIi((double)Double.parseDouble(skill.getValue()), (double)Double.parseDouble(sld)), (double)5.0, (int)0), (double)Math.sqrt(Double.parseDouble(lvl))), (double)Double.parseDouble("0.07"))) + "#G");
        remark = remark.replace("{\u516c\u5f0f\u4e5d}", "#R" + (int)Arith.iiiIiiiiiiIIi((double)Arith.iiiIiiiiiiIIi((double)Arith.ALLATORIxDEMO((double)Arith.iiiIiiiiiiIIi((double)Double.parseDouble(skill.getValue()), (double)Double.parseDouble(sld)), (double)5.0, (int)0), (double)Math.sqrt(Double.parseDouble(lvl))), (double)Double.parseDouble("0.5")) + "#G");
        remark = remark.replace("{\u516c\u5f0f\u5341}", "#R" + (int)Arith.iiiIiiiiiiIIi((double)Arith.iiiIiiiiiiIIi((double)Arith.ALLATORIxDEMO((double)Arith.iiiIiiiiiiIIi((double)Double.parseDouble(skill.getValue()), (double)Double.parseDouble(sld)), (double)5.0, (int)0), (double)Math.sqrt(Double.parseDouble(lvl))), (double)Double.parseDouble("0.05")) + "#G");
        return remark;
    }

    public int iIiIiiiiIIiii(int id, int lvl) {
        if (id >= 3001) {
            if (id <= 3009) return this.iIiIiiiiIIiii(lvl);
        }
        if (id == 3023) return this.iIiIiiiiIIiii(lvl);
        if (id == 3027) {
            return this.iIiIiiiiIIiii(lvl);
        }
        if (id == 3013) return this.ALLATORIxDEMO(lvl);
        if (id == 3014) return this.ALLATORIxDEMO(lvl);
        if (id == 3015) {
            return this.ALLATORIxDEMO(lvl);
        }
        if (id >= 3016 && id <= 3020) {
            return this.iiiIiiiiiiIIi(lvl);
        }
        if (id == 3028) return lvl - 3;
        if (id == 3029) return lvl - 3;
        if (id != 3030) return lvl;
        return lvl - 3;
    }

    public void ALLATORIxDEMO(StringBuffer buffer, String value, String xz) {
        if (buffer.length() != 0) {
            buffer.append("#r");
        }
        String IiiiiiiiIIIII = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, null, "#cFFFFFF");
        buffer.append("\u3010\u4e94\u884c\u3011");
        String[] IiiiiiiiIIIII2 = value.split("&");
        String[] IiiiiiiiIIIII3 = xz != null ? xz.split("=") : null;
        double IiiiiiiiIIIII4 = 0.0;
        int IiiiiiiiIIIII5 = 1;
        while (IiiiiiiiIIIII5 < IiiiiiiiIIIII2.length) {
            String[] IiiiiiiiIIIII6 = IiiiiiiiIIIII2[IiiiiiiiIIIII5].split("=");
            if (buffer.length() != 0) {
                buffer.append("#r");
            }
            IiiiiiiiIIIII = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, IiiiiiiiIIIII, "#cFFFF00");
            buffer.append(IiiiiiiiIIIII6[0]);
            buffer.append(" ");
            buffer.append(IiiiiiiiIIIII6[1]);
            buffer.append("/100");
            if (IiiiiiiiIIIII3 != null) {
                IiiiiiiiIIIII4 += MsgUntil.ALLATORIxDEMO((String)IiiiiiiiIIIII3[2], (String)IiiiiiiiIIIII6[0], (String)IiiiiiiiIIIII6[1]);
            }
            ++IiiiiiiiIIIII5;
        }
        if (IiiiiiiiIIIII3 == null) {
            buffer.append("#r#c4ADEDD\u65e0\u661f\u9635\uff0c\u4e94\u884c\u6682\u4e0d\u751f\u6548");
            return;
        }
        if (buffer.length() != 0) {
            buffer.append("#r");
        }
        IiiiiiiiIIIII = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, IiiiiiiiIIIII, "#c4ADEDD");
        buffer.append("\u4e94\u884c\u52a0\u6210\u661f\u9635\u4e4b\u529b ");
        buffer.append(String.format("%.1f", IiiiiiiiIIIII4));
        buffer.append("%");
        if (buffer.length() != 0) {
            buffer.append("#r");
        }
        buffer.append("\u3010\u661f\u9635\u3011");
        if (buffer.length() != 0) {
            buffer.append("#r");
        }
        buffer.append(IiiiiiiiIIIII3[1]);
        buffer.append("(");
        buffer.append(IiiiiiiiIIIII3[2]);
        buffer.append(")");
        if (this.ALLATORIxDEMO(IiiiiiiiIIIII3[1])) {
            buffer.append("#r#cFFFFFF\u8d64\u5e1d\u5bab #c00FF00" + IiiiiiiiIIIII3[3]);
            buffer.append("#r#cFFFFFF\u9752\u5e1d\u5bab #c00FF00" + IiiiiiiiIIIII3[4]);
            buffer.append("#r#cFFFFFF\u9ec4\u5e1d\u5bab #c00FF00" + IiiiiiiiIIIII3[5]);
            buffer.append("#r#cFFFFFF\u767d\u5e1d\u5bab #c00FF00" + IiiiiiiiIIIII3[6]);
            buffer.append("#r#cFFFFFF\u9ed1\u5e1d\u5bab #c00FF00" + IiiiiiiiIIIII3[7]);
            IiiiiiiiIIIII = null;
        }
        buffer.append("#r#c00FF00" + this.ALLATORIxDEMO(IiiiiiiiIIIII3[1]));
    }

    /*
     * WARNING - void declaration
     */
    public void iiiiiiiiIIiii(StringBuffer buffer, String value) {
        void IiiiiiiiIIIII;
        String[] IiiiiiiiIIIII2 = value.split("&");
        Skill IiiiiiiiIIIII3 = this.ALLATORIxDEMO().iIiIiiiiIIiii(IiiiiiiiIIIII2[1]);
        if (buffer.length() != 0) {
            buffer.append("#r");
        }
        long l = ExpUtil.ALLATORIxDEMO((long)Long.parseLong(IiiiiiiiIIIII2[3]));
        String IiiiiiiiIIIII4 = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, null, "#cFFFF00");
        buffer.append("\u3010\u89c9\u9192\u6280\u3011 ");
        buffer.append(IiiiiiiiIIIII3.getSkillname());
        buffer.append("(");
        buffer.append(IiiiiiiiIIIII2[2]);
        buffer.append(")");
        if (buffer.length() != 0) {
            buffer.append("#r");
        }
        IiiiiiiiIIIII4 = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, IiiiiiiiIIIII4, "#cFFFFFF");
        buffer.append("\u3010\u89c9\u9192\u6280\u7b49\u7ea7\u3011 ");
        buffer.append((long)IiiiiiiiIIIII);
        if (buffer.length() != 0) {
            buffer.append("#r");
        }
        IiiiiiiiIIIII4 = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, IiiiiiiiIIIII4, "#cFFFFFF");
        buffer.append("\u3010\u7c7b\u578b\u3011 \u901a\u7528");
        if (buffer.length() != 0) {
            buffer.append("#r");
        }
        IiiiiiiiIIIII4 = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, IiiiiiiiIIIII4, "#c00FF00");
        buffer.append(iiIiiiiiIIiiI.ALLATORIxDEMO(IiiiiiiiIIIII3.getRemark(), IiiiiiiiIIIII3, IiiiiiiiIIIII2[2], String.valueOf((long)IiiiiiiiIIIII)));
        if (buffer.length() != 0) {
            buffer.append("#r");
        }
        IiiiiiiiIIIII4 = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, IiiiiiiiIIIII4, "#cC5C583");
        buffer.append("\u94c3\u3001\u73af\u3001\u7532\u89c9\u9192\u4e09\u5408\u4e00\uff0c\u89c9\u9192\u6280\u65b9\u53ef\u751f\u6548");
    }

    /*
     * Unable to fully structure code
     */
    public void ALLATORIxDEMO(UseCardBean cardBean) {
        block26: {
            block25: {
                block23: {
                    block24: {
                        block22: {
                            this.iIiIiiiiIIiIi();
                            IiiiiiiiIIIII = new StringBuffer();
                            IiiiiiiiIIIII.append("#Y ");
                            IiiiiiiiIIIII.append(cardBean.getName());
                            if (!cardBean.getType().equals("SVIP")) break block22;
                            IiiiiiiiIIIII.append("#r#Y\u4ee5\u4e0b\u52a0\u6210\u53ea\u5728PVE\u6709\u6548");
                            break block23;
                        }
                        if (!cardBean.getType().equals("TT")) break block24;
                        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)cardBean.getValue())) break block25;
                        IiiiiiiiIIIII = this.ALLATORIxDEMO();
                        IiiiiiiiIIIII = cardBean.getValue().split("\\|");
                        IiiiiiiiIIIII = 0;
                        if (true) ** GOTO lbl89
                    }
                    if (cardBean.getType().equals("\u6708\u5361")) {
                        if (this.ALLATORIxDEMO().ALLATORIxDEMO(2, 12)) {
                            IiiiiiiiIIIII.append("#r #W1.\u6bcf\u65e5\u5956\u52b1\u9886\u53d6");
                            IiiiiiiiIIIII.append("#r #W2.\u53ef\u8d2d\u4e70\u526f\u672c\u6b21\u6570");
                            IiiiiiiiIIIII.append("#r #W3.\u6fc0\u6d3b\u52a9\u624b\u529f\u80fd");
                            IiiiiiiiIIIII.append("#r #W4.\u6b7b\u4ea1\u540e\uff0c\u9ed8\u8ba4\u56de\u590d\u8840\u6cd5");
                            IiiiiiiiIIIII.append("#r #W5.PVE\u4e2d\u83b7\u5f97BUFF\u52a0\u6210(\u9510\u4e0d\u53ef\u6321:\u5168\u7cfb\u5f3a\u6cd55%(\u5f3a\u9707\u61512%))");
                        } else {
                            IiiiiiiiIIIII.append("#r #W1.\u6bcf\u65e5\u5956\u52b1\u9886\u53d6");
                            IiiiiiiiIIIII.append("#r #W2.\u53ef\u8d2d\u4e70\u526f\u672c\u6b21\u6570");
                            IiiiiiiiIIIII.append("#r #W3.\u6fc0\u6d3b\u52a9\u624b\u529f\u80fd");
                            IiiiiiiiIIIII.append("#r #W4.\u6b7b\u4ea1\u540e\uff0c\u9ed8\u8ba4\u56de\u590d\u8840\u6cd5");
                            IiiiiiiiIIIII.append("#r #W5.PVE\u4e2d\u83b7\u5f97BUFF\u52a0\u6210(\u9526\u4e0a\u6dfb\u82b1:\u4f7f\u7528\u591a\u4f53\u6cd5\u672f\u653b\u51fb\u65f6\uff0c\u670930%\u6982\u7387\u989d\u5916\u589e\u52a0\u4e00\u4e2a\u5355\u4f4d)");
                        }
                    } else if (cardBean.getType().equals("\u5b63\u5361")) {
                        if (this.ALLATORIxDEMO().ALLATORIxDEMO(2, 12)) {
                            IiiiiiiiIIIII.append("#r #W1.\u6bcf\u65e5\u5956\u52b1\u9886\u53d6");
                            IiiiiiiiIIIII.append("#r #W2.\u589e\u52a01\u6b21\u526f\u672c\u6b21\u6570");
                            IiiiiiiiIIIII.append("#r #W3.\u6fc0\u6d3b\u52a9\u624b\u529f\u80fd");
                            IiiiiiiiIIIII.append("#r #W4.\u589e\u52a0\u83b7\u5f97\u7269\u54c1\u6982\u73873%");
                            IiiiiiiiIIIII.append("#r #W5.\u660e\u96f7\u6218\u6597\u4e2d\u670920%\u6982\u7387\u989d\u5916\u83b7\u5f97\u4e00\u6b21\u7269\u54c1\u5956\u52b1\uff08\u4e0d\u5305\u542b\u7ecf\u9a8c\u3001\u91d1\u94b1\u3001\u526f\u672c\u79ef\u5206\u7b49\u5956\u52b1\uff09");
                        } else {
                            IiiiiiiiIIIII.append("#r #W1.\u6bcf\u65e5\u5956\u52b1\u9886\u53d6");
                            IiiiiiiiIIIII.append("#r #W2.\u589e\u52a01\u6b21\u526f\u672c\u6b21\u6570");
                            IiiiiiiiIIIII.append("#r #W3.\u6fc0\u6d3b\u52a9\u624b\u529f\u80fd");
                            IiiiiiiiIIIII.append("#r #W4.\u589e\u52a0\u83b7\u5f97\u7269\u54c1\u6982\u73873%");
                            IiiiiiiiIIIII.append("#r #W5.PVE\u4e2d\u83b7\u5f97BUFF\u52a0\u6210(\u9510\u4e0d\u53ef\u5f53:\u6bcf\u56de\u5408\u5f00\u59cb\u65f630%\u6982\u7387\u83b7\u5f9720\u70b9\u4f24\u5bb3\u7cfb\u5ffd\u89c6,10\u70b9\u63a7\u5236\u7cfb\u5ffd\u89c6,\u6301\u7eed\u4e00\u56de\u5408)");
                        }
                    } else {
                        IiiiiiiiIIIII = Math.max(cardBean.getUseTime(), 0);
                        if (IiiiiiiiIIIII > 0L) {
                            IiiiiiiiIIIII.append("  #G\u5269\u4f59\u65f6\u95f4#Y");
                            IiiiiiiiIIIII.append(IiiiiiiiIIIII);
                            IiiiiiiiIIIII.append("#G\u5206\u949f");
                        }
                    }
                }
                if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)cardBean.getValue())) break block26;
                IiiiiiiiIIIII = cardBean.getValue().split("\\|");
                IiiiiiiiIIIII = 0;
                if (true) ** GOTO lbl133
                do {
                    if ((IiiiiiiiIIIII = IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII[IiiiiiiiIIIII]))) != null) {
                        IiiiiiiiIIIII.append("#r");
                        IiiiiiiiIIIII.append(IiiiiiiiIIIII.getColor());
                        IiiiiiiiIIIII.append(IiiiiiiiIIIII.getbName());
                    }
                    ++IiiiiiiiIIIII;
lbl89:
                    // 2 sources

                } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
            }
            this.iiIiiiiiiiIii.setTextSize(IiiiiiiiIIIII.toString(), 255);
            this.iiiiiiiiIIiii();
            return;
            do {
                if ((IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("=")).length == 2) {
                    if (IiiiiiiiIIIII[0].equals("\u6280\u80fd")) {
                        IiiiiiiiIIIII = this.ALLATORIxDEMO().iIiIiiiiIIiii(IiiiiiiiIIIII[1]);
                        IiiiiiiiIIIII.append("#r#W  ");
                        IiiiiiiiIIIII.append(IiiiiiiiIIIII[0]);
                        IiiiiiiiIIIII.append(" ");
                        if (IiiiiiiiIIIII == null) {
                            IiiiiiiiIIIII.append("\u672a\u77e5\u6280\u80fd-" + IiiiiiiiIIIII[1]);
                        } else if (IiiiiiiiIIIII.getSkillid().equals("8052")) {
                            IiiiiiiiIIIII.append(IiiiiiiiIIIII.getRemark());
                        } else {
                            IiiiiiiiIIIII.append(IiiiiiiiIIIII.getSkillname());
                        }
                    } else if (!(IiiiiiiiIIIII[0].equals("\u6807\u7b7e") || IiiiiiiiIIIII[0].equals("\u503c") || IiiiiiiiIIIII[0].equals("\u76ae\u80a4") || IiiiiiiiIIIII[0].equals("\u65b9\u5411") || IiiiiiiiIIIII[0].equals("\u53d8\u8eab\u5361\u7c7b") || IiiiiiiiIIIII[0].equals("lvl") || IiiiiiiiIIIII[0].equals("\u522e\u5956") || IiiiiiiiIIIII[0].equals("\u5361\u7c7b"))) {
                        IiiiiiiiIIIII.append("#r#W  ");
                        IiiiiiiiIIIII.append(IiiiiiiiIIIII[0]);
                        IiiiiiiiIIIII.append(" ");
                        IiiiiiiiIIIII.append(iiIiiiiiIIiiI.iiiIiiiiiiIIi(IiiiiiiiIIIII[1]));
                        IiiiiiiiIIIII.append(iiIiiiiiIIiiI.iIiIiiiiIIiii(IiiiiiiiIIIII[0]));
                    }
                } else if (IiiiiiiiIIIII.length == 1) {
                    IiiiiiiiIIIII.append("#r#W  ");
                    IiiiiiiiIIIII.append(IiiiiiiiIIIII[0]);
                }
                ++IiiiiiiiIIIII;
lbl133:
                // 2 sources

            } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
        }
        this.iiIiiiiiiiIii.setTextSize(IiiiiiiiIIIII.toString(), 255);
        this.iiiiiiiiIIiii();
    }

    public static String iiiIiiiiiiIIi(String v) {
        StringBuffer IiiiiiiiIIIII = new StringBuffer();
        try {
            double IiiiiiiiIIIII2 = Double.parseDouble(v);
            if (IiiiiiiiIIIII2 > 0.0) {
                IiiiiiiiIIIII.append("+");
            }
            String[] IiiiiiiiIIIII3 = v.split("\\.");
            IiiiiiiiIIIII.append(IiiiiiiiIIIII3[0]);
            if (IiiiiiiiIIIII3.length < 2) return IiiiiiiiIIIII.toString();
            IiiiiiiiIIIII.append(".");
            IiiiiiiiIIIII.append(IiiiiiiiIIIII3[1].charAt(0));
            return IiiiiiiiIIIII.toString();
        }
        catch (Exception IiiiiiiiIIIII2) {
            return v;
        }
    }

    public int iiiIiiiiiiIIi(int sum) {
        if (sum < 5) return (sum << 1) - 1;
        return 10;
    }

    public void IiiIiiiiiiIiI(StringBuffer buffer, String value) {
        String[] IiiiiiiiIIIII = value.split("&");
        if (buffer.length() != 0) {
            buffer.append("#r");
        }
        String IiiiiiiiIIIII2 = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, null, "#W");
        buffer.append("\u3010\u70bc\u5668\u3011");
        IiiiiiiiIIIII2 = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, IiiiiiiiIIIII2, "#c00EAFF");
        buffer.append("\u5f00\u5149\u6b21\u6570 ");
        buffer.append(IiiiiiiiIIIII[1]);
        int IiiiiiiiIIIII3 = 2;
        while (IiiiiiiiIIIII3 < IiiiiiiiIIIII.length) {
            String[] IiiiiiiiIIIII4 = IiiiiiiiIIIII[IiiiiiiiIIIII3].split("=");
            if (buffer.length() != 0) {
                buffer.append("#r");
            }
            IiiiiiiiIIIII2 = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, IiiiiiiiIIIII2, "#c00CD00");
            buffer.append(IiiiiiiiIIIII4[0]);
            buffer.append(" ");
            buffer.append(iiIiiiiiIIiiI.iiiIiiiiiiIIi(IiiiiiiiIIIII4[1]));
            ++IiiiiiiiIIIII3;
            buffer.append(iiIiiiiiIIiiI.iIiIiiiiIIiii(IiiiiiiiIIIII4[0]));
        }
    }

    public void ALLATORIxDEMO(StringBuffer buffer, String color, String value, long type, Integer qhv) {
        String[] IiiiiiiiIIIII;
        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)value)) {
            return;
        }
        String[] IiiiiiiiIIIII2 = value.split("\\|");
        String IiiiiiiiIIIII3 = null;
        if (type != 779L) {
            String IiiiiiiiIIIII4 = null;
            IiiiiiiiIIIII = null;
            String IiiiiiiiIIIII5 = null;
            String IiiiiiiiIIIII6 = null;
            String IiiiiiiiIIIII7 = null;
            String IiiiiiiiIIIII8 = null;
            int IiiiiiiiIIIII9 = 0;
            while (IiiiiiiiIIIII9 < IiiiiiiiIIIII2.length) {
                if (IiiiiiiiIIIII2[IiiiiiiiIIIII9] != null) {
                    if (IiiiiiiiIIIII2[IiiiiiiiIIIII9].indexOf("&") != -1) break;
                    int IiiiiiiiIIIII10 = IiiiiiiiIIIII2[IiiiiiiiIIIII9].indexOf("=");
                    if (IiiiiiiiIIIII10 != -1) {
                        String IiiiiiiiIIIII11 = IiiiiiiiIIIII2[IiiiiiiiIIIII9].substring(0, IiiiiiiiIIIII10);
                        if (IiiiiiiiIIIII11.equals("\u7b49\u7ea7") | IiiiiiiiIIIII11.equals("\u9636\u6570")) {
                            IiiiiiiiIIIII6 = IiiiiiiiIIIII11;
                            IiiiiiiiIIIII7 = IiiiiiiiIIIII2[IiiiiiiiIIIII9].substring(IiiiiiiiIIIII10 + 1);
                            IiiiiiiiIIIII2[IiiiiiiiIIIII9] = null;
                        } else if (IiiiiiiiIIIII11.equals("\u5957\u88c5\u54c1\u8d28")) {
                            IiiiiiiiIIIII4 = IiiiiiiiIIIII2[IiiiiiiiIIIII9].substring(IiiiiiiiIIIII10 + 1);
                            IiiiiiiiIIIII2[IiiiiiiiIIIII9] = null;
                        } else if (IiiiiiiiIIIII11.equals("\u88c5\u5907\u90e8\u4f4d")) {
                            IiiiiiiiIIIII = IiiiiiiiIIIII2[IiiiiiiiIIIII9].substring(IiiiiiiiIIIII10 + 1);
                            IiiiiiiiIIIII2[IiiiiiiiIIIII9] = null;
                        } else if (IiiiiiiiIIIII11.equals("\u6027\u522b\u8981\u6c42") || IiiiiiiiIIIII11.equals("\u6027\u522b")) {
                            IiiiiiiiIIIII5 = IiiiiiiiIIIII2[IiiiiiiiIIIII9].substring(IiiiiiiiIIIII10 + 1);
                            IiiiiiiiIIIII2[IiiiiiiiIIIII9] = null;
                        } else if (IiiiiiiiIIIII11.equals("\u88c5\u5907\u89d2\u8272")) {
                            IiiiiiiiIIIII8 = IiiiiiiiIIIII2[IiiiiiiiIIIII9].substring(IiiiiiiiIIIII10 + 1);
                            IiiiiiiiIIIII2[IiiiiiiiIIIII9] = null;
                        }
                    }
                }
                ++IiiiiiiiIIIII9;
            }
            if (IiiiiiiiIIIII == null) {
                IiiiiiiiIIIII = String.valueOf(GoodType.ALLATORIxDEMO((long)type));
            }
            if (IiiiiiiiIIIII8 == null && IiiiiiiiIIIII5 == null) {
                IiiiiiiiIIIII5 = "2";
            }
            if (IiiiiiiiIIIII4 != null) {
                if (buffer.length() != 0) {
                    buffer.append("#r");
                }
                color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#cFFFFFF");
                buffer.append("\u3010\u5957\u88c5\u54c1\u8d28\u3011");
                buffer.append(IiiiiiiiIIIII4);
                IiiiiiiiIIIII4 = null;
                if (IiiiiiiiIIIII != null) {
                    String IiiiiiiiIIIII12 = MsgUntil.ALLATORIxDEMO((String)IiiiiiiiIIIII, (boolean)true);
                    if (IiiiiiiiIIIII12 != null) {
                        IiiiiiiiIIIII = IiiiiiiiIIIII12;
                    }
                    if (buffer.length() != 0) {
                        buffer.append("#r");
                    }
                    color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#cFFFFFF");
                    buffer.append("\u3010\u88c5\u5907\u90e8\u4f4d\u3011");
                    buffer.append((String)IiiiiiiiIIIII);
                    IiiiiiiiIIIII = null;
                }
                if (IiiiiiiiIIIII5 != null) {
                    if (buffer.length() != 0) {
                        buffer.append("#r");
                    }
                    color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#cFFFFFF");
                    buffer.append("\u3010\u88c5\u5907\u89d2\u8272\u3011");
                    buffer.append(IiiiiiiiIIIII5.equals("1") ? "\u7537\u6027\u89d2\u8272" : (IiiiiiiiIIIII5.equals("0") ? "\u5973\u6027\u89d2\u8272" : "\u6240\u6709"));
                    IiiiiiiiIIIII5 = null;
                }
                if (IiiiiiiiIIIII8 != null) {
                    if (buffer.length() != 0) {
                        buffer.append("#r");
                    }
                    color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#cFFFFFF");
                    buffer.append("\u3010\u88c5\u5907\u89d2\u8272\u3011");
                    buffer.append(IiiiiiiiIIIII8);
                    IiiiiiiiIIIII8 = null;
                }
                if (IiiiiiiiIIIII6 != null) {
                    if (buffer.length() != 0) {
                        buffer.append("#r");
                    }
                    color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#cFFFFFF");
                    buffer.append("\u3010");
                    buffer.append(IiiiiiiiIIIII6);
                    buffer.append("\u3011");
                    buffer.append(IiiiiiiiIIIII7);
                }
            } else {
                if (IiiiiiiiIIIII6 != null) {
                    if (buffer.length() != 0) {
                        buffer.append("#r");
                    }
                    color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#cFFFFFF");
                    buffer.append("\u3010");
                    buffer.append(IiiiiiiiIIIII6);
                    buffer.append("\u3011");
                    buffer.append(IiiiiiiiIIIII7);
                }
                if (IiiiiiiiIIIII != null) {
                    String IiiiiiiiIIIII13 = MsgUntil.ALLATORIxDEMO((String)IiiiiiiiIIIII, (boolean)false);
                    if (IiiiiiiiIIIII13 != null) {
                        IiiiiiiiIIIII = IiiiiiiiIIIII13;
                    }
                    if (buffer.length() != 0) {
                        buffer.append("#r");
                    }
                    color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#cFFFFFF");
                    buffer.append("\u3010\u88c5\u5907\u90e8\u4f4d\u3011");
                    buffer.append((String)IiiiiiiiIIIII);
                    IiiiiiiiIIIII = null;
                }
                if (IiiiiiiiIIIII5 != null) {
                    if (buffer.length() != 0) {
                        buffer.append("#r");
                    }
                    color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#cFFFFFF");
                    buffer.append("\u3010\u88c5\u5907\u89d2\u8272\u3011");
                    buffer.append(IiiiiiiiIIIII5.equals("1") ? "\u7537\u6027\u89d2\u8272" : (IiiiiiiiIIIII5.equals("0") ? "\u5973\u6027\u89d2\u8272" : "\u6240\u6709"));
                    IiiiiiiiIIIII5 = null;
                }
                if (IiiiiiiiIIIII8 != null) {
                    if (buffer.length() != 0) {
                        buffer.append("#r");
                    }
                    color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#cFFFFFF");
                    buffer.append("\u3010\u88c5\u5907\u89d2\u8272\u3011");
                    buffer.append(IiiiiiiiIIIII8);
                    IiiiiiiiIIIII8 = null;
                }
            }
        }
        int IiiiiiiiIIIII14 = 0;
        while (IiiiiiiiIIIII14 < IiiiiiiiIIIII2.length) {
            if (IiiiiiiiIIIII2[IiiiiiiiIIIII14] != null) {
                if (IiiiiiiiIIIII2[IiiiiiiiIIIII14].startsWith(GoodType.Extras[0])) {
                    IiiiiiiiIIIII3 = this.ALLATORIxDEMO(buffer, IiiiiiiiIIIII2[IiiiiiiiIIIII14], type);
                } else if (IiiiiiiiIIIII2[IiiiiiiiIIIII14].startsWith(GoodType.Extras[1])) {
                    this.IiiIiiiiiiIiI(buffer, IiiiiiiiIIIII2[IiiiiiiiIIIII14]);
                } else if (IiiiiiiiIIIII2[IiiiiiiiIIIII14].startsWith(GoodType.Extras[2])) {
                    this.ALLATORIxDEMO(buffer, IiiiiiiiIIIII2[IiiiiiiiIIIII14], type);
                } else if (IiiiiiiiIIIII2[IiiiiiiiIIIII14].startsWith(GoodType.Extras[3])) {
                    this.iiiIiiiiiiIIi(buffer, IiiiiiiiIIIII2[IiiiiiiiIIIII14]);
                } else if (IiiiiiiiIIIII2[IiiiiiiiIIIII14].startsWith(GoodType.Extras[4])) {
                    this.ALLATORIxDEMO(buffer, IiiiiiiiIIIII2[IiiiiiiiIIIII14]);
                } else if (IiiiiiiiIIIII2[IiiiiiiiIIIII14].startsWith(GoodType.Extras[5])) {
                    this.iiiiiiiiIIiii(buffer, IiiiiiiiIIIII2[IiiiiiiiIIIII14]);
                } else if (IiiiiiiiIIIII2[IiiiiiiiIIIII14].startsWith(GoodType.Extras[6])) {
                    this.ALLATORIxDEMO(buffer, IiiiiiiiIIIII2[IiiiiiiiIIIII14], IiiiiiiiIIIII3);
                } else if (IiiiiiiiIIIII2[IiiiiiiiIIIII14].startsWith(GoodType.Extras[8])) {
                    this.iIiIiiiiIIiii(buffer, IiiiiiiiIIIII2[IiiiiiiiIIIII14]);
                } else if (IiiiiiiiIIIII2[IiiiiiiiIIIII14].startsWith(GoodType.Extras[9])) {
                    this.iIiIiiiiIIiIi(buffer, IiiiiiiiIIIII2[IiiiiiiiIIIII14]);
                } else {
                    IiiiiiiiIIIII = IiiiiiiiIIIII2[IiiiiiiiIIIII14].split("=");
                    if (buffer.length() != 0) {
                        buffer.append("#r");
                    }
                    if (IiiiiiiiIIIII[0].equals("\u7b49\u7ea7") || IiiiiiiiIIIII[0].equals("\u9636\u6570")) {
                        color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#cFFFFFF");
                        buffer.append("\u3010");
                        buffer.append(IiiiiiiiIIIII[0]);
                        buffer.append("\u3011");
                        buffer.append(IiiiiiiiIIIII[1]);
                    } else if (IiiiiiiiIIIII[0].equals("\u88c5\u5907\u89d2\u8272") || IiiiiiiiIIIII[0].equals("\u88c5\u5907\u7b49\u7ea7") || IiiiiiiiIIIII[0].equals("\u5957\u88c5\u54c1\u8d28")) {
                        color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#cFFFFFF");
                        buffer.append("\u3010");
                        buffer.append(IiiiiiiiIIIII[0]);
                        buffer.append("\u3011");
                        buffer.append(IiiiiiiiIIIII[1]);
                    } else if (IiiiiiiiIIIII[0].equals("\u6700\u9ad8\u643a\u5e26\u7b49\u7ea7")) {
                        color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, this.ALLATORIxDEMO().gameType == 2 ? "#c00FFFF" : "#cFFFFFF");
                        buffer.append("\u3010");
                        buffer.append(IiiiiiiiIIIII[0]);
                        buffer.append("\u3011");
                        buffer.append(IiiiiiiiIIIII[1]);
                    } else if (IiiiiiiiIIIII[0].equals("\u529b\u91cf\u8981\u6c42") || IiiiiiiiIIIII[0].equals("\u7075\u6027\u8981\u6c42") || IiiiiiiiIIIII[0].equals("\u6839\u9aa8\u8981\u6c42") || IiiiiiiiIIIII[0].equals("\u654f\u6377\u8981\u6c42") || IiiiiiiiIIIII[0].equals("\u7b49\u7ea7\u8981\u6c42") || IiiiiiiiIIIII[0].equals("\u58f0\u671b\u8981\u6c42")) {
                        color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, this.ALLATORIxDEMO().gameType == 2 ? "#cFEFF72" : "#cFFFFFF");
                        buffer.append(IiiiiiiiIIIII[0]);
                        buffer.append(" ");
                        buffer.append(IiiiiiiiIIIII[1]);
                    } else if (IiiiiiiiIIIII[0].equals("\u88c5\u5907\u90e8\u4f4d")) {
                        String IiiiiiiiIIIII15 = MsgUntil.ALLATORIxDEMO((String)IiiiiiiiIIIII[1], (boolean)true);
                        if (IiiiiiiiIIIII15 != null) {
                            IiiiiiiiIIIII[1] = IiiiiiiiIIIII15;
                        }
                        color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#cFFFFFF");
                        buffer.append("\u3010\u88c5\u5907\u90e8\u4f4d\u3011");
                        buffer.append(IiiiiiiiIIIII[1]);
                    } else if (IiiiiiiiIIIII[0].equals("\u6027\u522b\u8981\u6c42") || IiiiiiiiIIIII[0].equals("\u6027\u522b")) {
                        color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#cFFFFFF");
                        buffer.append("\u3010\u6027\u522b\u8981\u6c42\u3011");
                        buffer.append(IiiiiiiiIIIII[1].equals("1") ? "\u7537" : (IiiiiiiiIIIII[1].equals("0") ? "\u5973" : "\u5168\u90e8\u6027\u522b"));
                    } else if (IiiiiiiiIIIII[0].equals("\u8010\u4e45")) {
                        if (this.ALLATORIxDEMO().gameType == 2) {
                            int IiiiiiiiIIIII16 = IiiiiiiiIIIII[1].indexOf(",");
                            IiiiiiiiIIIII[1] = IiiiiiiiIIIII[1].substring(0, IiiiiiiiIIIII16 != -1 ? IiiiiiiiIIIII16 : IiiiiiiiIIIII[1].length());
                            color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#cFEFF72");
                            buffer.append("\u8010\u4e45 ");
                            buffer.append(IiiiiiiiIIIII[1]);
                        } else {
                            color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#cFFFF33");
                            buffer.append("\u8010\u4e45:#G");
                            buffer.append(IiiiiiiiIIIII[1].split(",")[0]);
                        }
                    } else if (IiiiiiiiIIIII.length > 1) {
                        color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, this.ALLATORIxDEMO().gameType == 2 ? "#cFEFF72" : "#cFFFF75");
                        buffer.append(IiiiiiiiIIIII[0]);
                        buffer.append(" ");
                        buffer.append(iiIiiiiiIIiiI.iiiIiiiiiiIIi(IiiiiiiiIIIII[1]));
                        buffer.append(iiIiiiiiIIiiI.iIiIiiiiIIiii(IiiiiiiiIIIII[0]));
                        if (qhv != null && qhv > 0) {
                            color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#G");
                            buffer.append(" ");
                            buffer.append("(");
                            buffer.append("+");
                            buffer.append(String.format("%.1f", BaseEquip.getQHGemXS((int)qhv) / 100.0 * Double.parseDouble(IiiiiiiiIIIII[1])));
                            buffer.append(")");
                        }
                    } else if (type == 779L) {
                        buffer.append(IiiiiiiiIIIII[0]);
                    }
                }
            }
            ++IiiiiiiiIIIII14;
        }
    }

    public String ALLATORIxDEMO(String demand, int lvl) {
        if (lvl >= 9) {
            return "\u5929\u8d44\u5df2\u8fbe\u5230\u6700\u9ad8\u5883\u754c,\u4e0d\u53ef\u5f3a\u5316";
        }
        if (demand == null) return "";
        if (demand.equals("")) {
            return "";
        }
        String[] IiiiiiiiIIIII = demand.split("\\|");
        StringBuffer IiiiiiiiIIIII2 = new StringBuffer();
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < IiiiiiiiIIIII.length) {
            IiiiiiiiIIIII2.append(" ");
            String[] IiiiiiiiIIIII4 = IiiiiiiiIIIII[IiiiiiiiIIIII3].split("=");
            IiiiiiiiIIIII2.append(IiiiiiiiIIIII4[0]);
            IiiiiiiiIIIII2.append(" >= ");
            ++IiiiiiiiIIIII3;
            IiiiiiiiIIIII2.append(IiiiiiiiIIIII4[1]);
        }
        IiiiiiiiIIIII2.append(" ,\u8fbe\u5230\u8981\u6c42\u540e\u53ef\u4ee5\u7ee7\u7eed\u5f3a\u5316\u6709\u51e0\u7387\u6210\u529f");
        return IiiiiiiiIIIII2.toString();
    }

    public iiIiiiiiIIiiI(GameView gameView) {
        super(46, 4, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(0, 0, 0, 0, IiiiIiiiiIiIi.iIIiIiiiiiiIi);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/49.png", (int)6, (int)6, (int)6, (int)6, (boolean)false), null);
        this.iIiIiiiiIiIii = new IIIiiiiiIiIiI();
        this.add((Component)this.iIiIiiiiIiIii);
        this.IIiiIiiiIIiIi = new IiIiiiiiIIIiI(this, "", iiIIiiiiIiiII.iiIIiiiiIIiIi, 490);
        this.add((Component)this.IIiiIiiiIIiIi);
        this.iiIiiiiiiiIii = IIiIiiiiIiIII.ALLATORIxDEMO((String)"", (Font)iiIIiiiiIiiII.iIiIIiiiiIIiI, (int)490);
        this.add((Component)this.iiIiiiiiiiIii);
        this.ALLATORIxDEMO = IIiIiiiiIiIII.ALLATORIxDEMO((String)"", (Font)iiIIiiiiIiiII.ALLATORIxDEMO, (int)120);
        this.ALLATORIxDEMO.setBounds(5, 135, 120, 120);
        this.add((Component)this.ALLATORIxDEMO);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     */
    public static String ALLATORIxDEMO(String color, String value) {
        Object IiiiiiiiIIIII;
        StringBuffer IiiiiiiiIIIII2 = new StringBuffer();
        int IiiiiiiiIIIII3 = 0;
        String[] IiiiiiiiIIIII4 = value.split("\\|");
        Map IiiiiiiiIIIII5 = IIiIiiiiIiIII.ALLATORIxDEMO();
        int IiiiiiiiIIIII6 = 0;
        while (IiiiiiiiIIIII6 < IiiiiiiiIIIII4.length) {
            if (!IiiiiiiiIIIII4[IiiiiiiiIIIII6].startsWith(GoodType.Extras[1])) {
                ++IiiiiiiiIIIII6;
                continue;
            }
            String[] IiiiiiiiIIIII7 = IiiiiiiiIIIII4[IiiiiiiiIIIII6].split("&");
            IiiiiiiiIIIII3 = Integer.parseInt(IiiiiiiiIIIII7[1]);
            int IiiiiiiiIIIII8 = 2;
            boolean bl = true;
            do {
                if (bl && !(bl = false) && true) continue;
                int IiiiiiiiIIIII9 = IiiiiiiiIIIII7[IiiiiiiiIIIII8].indexOf("=");
                if (IiiiiiiiIIIII9 != -1) {
                    IiiiiiiiIIIII = IiiiiiiiIIIII7[IiiiiiiiIIIII8].substring(0, IiiiiiiiIIIII9);
                    double IiiiiiiiIIIII10 = Double.parseDouble(IiiiiiiiIIIII7[IiiiiiiiIIIII8].substring(IiiiiiiiIIIII9 + 1));
                    PropertyUtil.ALLATORIxDEMO((Map)IiiiiiiiIIIII5, (String)IiiiiiiiIIIII, (double)IiiiiiiiIIIII10);
                }
                ++IiiiiiiiIIIII8;
            } while (IiiiiiiiIIIII8 < IiiiiiiiIIIII7.length);
            IiiiiiiiIIIII4[IiiiiiiiIIIII6] = null;
            break;
        }
        IiiiiiiiIIIII6 = 0;
        while (IiiiiiiiIIIII6 < IiiiiiiiIIIII4.length) {
            int IiiiiiiiIIIII11;
            if (IiiiiiiiIIIII4[IiiiiiiiIIIII6] != null && (IiiiiiiiIIIII11 = IiiiiiiiIIIII4[IiiiiiiiIIIII6].indexOf("=")) != -1) {
                color = iiIiiiiiIIiiI.ALLATORIxDEMO(IiiiiiiiIIIII2, color, "#cFFFFFF");
                if (IiiiiiiiIIIII2.length() != 0) {
                    IiiiiiiiIIIII2.append("#r");
                }
                String IiiiiiiiIIIII12 = IiiiiiiiIIIII4[IiiiiiiiIIIII6].substring(0, IiiiiiiiIIIII11);
                String IiiiiiiiIIIII13 = IiiiiiiiIIIII4[IiiiiiiiIIIII6].substring(IiiiiiiiIIIII11 + 1);
                if (IiiiiiiiIIIII12.equals("\u7b49\u7ea7")) {
                    color = iiIiiiiiIIiiI.ALLATORIxDEMO(IiiiiiiiIIIII2, color, "#cFFFFFF");
                    IiiiiiiiIIIII2.append("\u3010");
                    IiiiiiiiIIIII2.append(IiiiiiiiIIIII12);
                    IiiiiiiiIIIII2.append("\u3011");
                    IiiiiiiiIIIII2.append(IiiiiiiiIIIII13);
                } else {
                    color = iiIiiiiiIIiiI.ALLATORIxDEMO(IiiiiiiiIIIII2, color, "#cDEDE9E");
                    IiiiiiiiIIIII2.append(IiiiiiiiIIIII12);
                    IiiiiiiiIIIII2.append(" ");
                    IiiiiiiiIIIII2.append(iiIiiiiiIIiiI.iiiIiiiiiiIIi(IiiiiiiiIIIII13));
                    IiiiiiiiIIIII2.append(iiIiiiiiIIiiI.iIiIiiiiIIiii(IiiiiiiiIIIII12));
                    IiiiiiiiIIIII = (Double)IiiiiiiiIIIII5.get(IiiiiiiiIIIII12.equals("\u8d1f\u654f") ? "\u52a0\u5f3a\u901f\u5ea6" : "\u52a0\u5f3a" + IiiiiiiiIIIII12);
                    if (IiiiiiiiIIIII != null) {
                        color = iiIiiiiiIIiiI.ALLATORIxDEMO(IiiiiiiiIIIII2, color, "#G");
                        IiiiiiiiIIIII2.append(" ");
                        IiiiiiiiIIIII2.append("(");
                        IiiiiiiiIIIII2.append("+");
                        IiiiiiiiIIIII2.append(String.format("%.1f", (Double)IiiiiiiiIIIII / 100.0 * Double.parseDouble(IiiiiiiiIIIII13)));
                        IiiiiiiiIIIII2.append(")");
                    }
                }
            }
            ++IiiiiiiiIIIII6;
        }
        if (IiiiiiiiIIIII3 > 0) {
            if (IiiiiiiiIIIII2.length() != 0) {
                IiiiiiiiIIIII2.append("#r");
            }
            color = iiIiiiiiIIiiI.ALLATORIxDEMO(IiiiiiiiIIIII2, color, "#c00EAFF");
            IiiiiiiiIIIII2.append("\u5f3a\u5316\u6b21\u6570 ");
            IiiiiiiiIIIII2.append(IiiiiiiiIIIII3);
            for (String IiiiiiiiIIIII14 : IiiiiiiiIIIII5.keySet()) {
                if (IiiiiiiiIIIII2.length() != 0) {
                    IiiiiiiiIIIII2.append("#r");
                }
                color = iiIiiiiiIIiiI.ALLATORIxDEMO(IiiiiiiiIIIII2, color, "#c00EAFF");
                IiiiiiiiIIIII2.append(IiiiiiiiIIIII14);
                IiiiiiiiIIIII2.append(" ");
                IiiiiiiiIIIII2.append(IiiiiiiiIIIII5.get(IiiiiiiiIIIII14));
                IiiiiiiiIIIII2.append("%");
            }
        }
        IIiIiiiiIiIII.ALLATORIxDEMO((Map)IiiiiiiiIIIII5);
        return IiiiiiiiIIIII2.toString();
    }

    public void ALLATORIxDEMO(StringBuffer buffer, String value, long type) {
        String IiiiiiiiIIIII = null;
        String[] IiiiiiiiIIIII2 = value.split("&");
        int IiiiiiiiIIIII3 = 1;
        while (IiiiiiiiIIIII3 < IiiiiiiiIIIII2.length) {
            String[] IiiiiiiiIIIII4 = IiiiiiiiIIIII2[IiiiiiiiIIIII3].split("=");
            if (buffer.length() != 0) {
                buffer.append("#r");
            }
            IiiiiiiiIIIII = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, IiiiiiiiIIIII, GoodType.iiiiIiiiIIIiI((long)type) ? "#c00EAFF" : "#cBE9786");
            buffer.append(IiiiiiiiIIIII4[0]);
            buffer.append(" ");
            buffer.append(iiIiiiiiIIiiI.iiiIiiiiiiIIi(IiiiiiiiIIIII4[1]));
            ++IiiiiiiiIIIII3;
            buffer.append(iiIiiiiiIIiiI.iIiIiiiiIIiii(IiiiiiiiIIIII4[0]));
        }
    }

    public void ALLATORIxDEMO(Shop shop) {
        this.iIiIiiiiIIiIi();
        this.IiIIIiiiiIiiI = 1;
        this.iIiIiiiiIiIii.ALLATORIxDEMO(IIiIiiiiIiiIi.iiiiiiiiIIiii((String)shop.getShopskin()));
        this.IIiiIiiiIIiIi.setTextSize("#cFFFF75" + shop.getShopname(), 215);
        String IiiiiiiiIIIII = "#W";
        StringBuffer IiiiiiiiIIIII2 = new StringBuffer();
        Goodstable IiiiiiiiIIIII3 = this.ALLATORIxDEMO().ALLATORIxDEMO(shop.getShopiid());
        if (shop.getShoptext() != null && !shop.getShoptext().equals("")) {
            IiiiiiiiIIIII2.append(shop.getShoptext());
        } else if (IiiiiiiiIIIII3 != null && IiiiiiiiIIIII3.getInstruction() != null && !IiiiiiiiIIIII3.getInstruction().equals("")) {
            IiiiiiiiIIIII2.append(IiiiiiiiIIIII3.getInstruction());
        }
        if (IiiiiiiiIIIII3 != null && IiiiiiiiIIIII3.getType() == 112L) {
            this.iIiIiiiiIIiii(IiiiiiiiIIIII2, IiiiiiiiIIIII, IiiiiiiiIIIII3.getValue(), IiiiiiiiIIIII3.getType());
        }
        if (shop.getShoptype() >= 5001 && shop.getShoptype() <= 5006) {
            if (IiiiiiiiIIIII2.length() != 0) {
                IiiiiiiiIIIII2.append("#r");
            }
            IiiiiiiiIIIII = iiIiiiiiIIiiI.ALLATORIxDEMO(IiiiiiiiIIIII2, IiiiiiiiIIIII, "#Y");
            IiiiiiiiIIIII2.append("\u53c2\u8003\u4ef7\u683c: ");
            IiiiiiiiIIIII2.append(shop.getShopprice());
        }
        this.iiIiiiiiiiIii.setTextSize(IiiiiiiiIIIII2.toString(), 215);
        this.iiiIiiiiiiIIi(false);
    }

    public void ALLATORIxDEMO(Skill skill, double sld, int lvl, int zs) {
        this.iIiIiiiiIIiIi();
        this.IiIIIiiiiIiiI = 2;
        int IiiiiiiiIIIII = Integer.parseInt(skill.getSkillid());
        if (IiiiiiiiIIIII > 12000 && IiiiiiiiIIIII <= 13000) {
            String IiiiiiiiIIIII2 = SkillUtil.ALLATORIxDEMO((Skill)skill, (double)sld);
            this.iIiIiiiiIiIii.ALLATORIxDEMO(IIiIiiiiIiiIi.iIiIiiiiIIiIi((int)IiiiiiiiIIIII));
            this.IIiiIiiiIIiIi.setTextSize("#cf8fc70" + skill.getSkillname(), 215);
            this.iiIiiiiiiiIii.setTextSize(IiiiiiiiIIIII2, 215);
        } else if (IiiiiiiiIIIII >= 10001 && IiiiiiiiIIIII <= 10008) {
            this.iIiIiiiiIiIii.ALLATORIxDEMO(IIiIiiiiIiiIi.iIiIiiiiIIiIi((String)skill.getSkillid()));
            this.IIiiIiiiIIiIi.setTextSize("#cf8fc70" + skill.getSkillname(), 215);
            this.iiIiiiiiiiIii.setTextSize(SkillUtil.ALLATORIxDEMO((String)skill.getRemark(), (Skill)skill, (double)sld), 215);
        } else {
            String IiiiiiiiIIIII3 = IIiiIiiiIiiiI.ALLATORIxDEMO((int)IiiiiiiiIIIII, (Skill)skill, (double)sld, (int)lvl, (int)zs);
            if (IiiiiiiiIIIII3 == null) {
                return;
            }
            int IiiiiiiiIIIII4 = IiiiiiiiIIIII3.indexOf(skill.getSkillname());
            if (IiiiiiiiIIIII4 != -1 && IiiiiiiiIIIII4 <= 8) {
                IiiiiiiiIIIII3 = String.valueOf(IiiiiiiiIIIII3.substring(0, IiiiiiiiIIIII4)) + IiiiiiiiIIIII3.substring(IiiiiiiiIIIII4 + skill.getSkillname().length());
            }
            this.iIiIiiiiIiIii.ALLATORIxDEMO(IIiIiiiiIiiIi.iiiIiiiiiiIIi((String)skill.getSkillid()));
            this.IIiiIiiiIIiIi.setTextSize("#cf8fc70" + skill.getSkillname(), 215);
            this.iiIiiiiiiiIii.setTextSize(IiiiiiiiIIIII3, 215);
        }
        this.IiiIiiiiiiIiI();
    }

    public void iIiIiiiiIIiIi(String text) {
        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)text)) {
            return;
        }
        this.iIiIiiiiIIiIi();
        this.iiIiiiiiiiIii.setFont(iiIIiiiiIiiII.iIIiiiiiiIIII);
        this.iiIiiiiiiiIii.setTextSize(text, 180);
        this.iiIiiiiiiiIii.setBounds(7, 7, this.iiIiiiiiiiIii.getWidth(), this.iiIiiiiiiiIii.getHeight());
        int IiiiiiiiIIIII = 15 + this.iiIiiiiiiiIii.getWidth();
        int IiiiiiiiIIIII2 = 14 + this.iiIiiiiiiiIii.getHeight();
        Point point = this.ALLATORIxDEMO().iIiIiiiiIIiii(IiiiiiiiIIIII, IiiiiiiiIIIII2);
        this.iIiIiiiiIIiii(point.x, point.y, IiiiiiiiIIIII, IiiiiiiiIIIII2);
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    public static String iIiIiiiiIIiii(String v) {
        if (v.indexOf("\u6297") != -1) {
            if (v.equals("\u6297\u4e09\u5c38\u866b")) return "";
            if (v.equals("\u6297\u4e09\u5c38")) return "";
            if (v.equals("\u6297\u6d69\u7136\u6b63\u6c14")) return "";
            if (v.equals("\u6297\u9694\u5c71\u6253\u725b")) return "";
            if (v.equals("\u6297\u9752\u9762\u7360\u7259")) return "";
            if (v.equals("\u6297\u5929\u9b54\u89e3\u4f53")) return "";
            if (v.equals("\u6297\u5c0f\u697c\u591c\u54ed")) return "";
            if (v.equals("\u6297\u5206\u5149\u5316\u5f71")) return "";
            if (v.startsWith("\u6297\u6bd2\u4f24")) return "";
            if (!v.equals("\u968f\u673a\u6297\u7075\u5b9d\u4f24\u5bb3")) return "%";
            return "";
        }
        if (v.endsWith("\u52a0\u6210")) {
            return "%";
        }
        if (v.equals("\u4e0a\u5584\u82e5\u6c34")) return "";
        if (v.equals("\u5c18\u57c3\u843d\u5b9a")) return "";
        if (v.equals("\u7075\u7280\u4e00\u70b9")) return "";
        if (v.equals("\u5316\u8840\u6210\u78a7")) return "";
        if (v.equals("\u7f8e\u4eba\u8fdf\u66ae")) return "";
        if (v.equals("\u660e\u73e0\u6709\u6cea")) {
            return "";
        }
        if (v.equals("\u5bf9\u65e0\u5c5e\u6027\u76ee\u6807\u4f24\u5bb3")) return "%";
        if (v.equals("\u52a0\u6210\u653b\u51fb")) {
            return "%";
        }
        if (v.indexOf("\u5f3a") == -1 && v.indexOf("\u7a0b\u5ea6") == -1 && v.indexOf("\u7387") == -1 && v.indexOf("\u72c2\u66b4") == -1 && v.indexOf("\u547d\u4e2d") == -1 && v.indexOf("\u81f4\u547d") == -1 && v.indexOf("\u5ffd\u89c6") == -1) {
            if (v.indexOf("\u5c5e\u6027\u9700\u6c42") == -1) return "";
        }
        if (v.indexOf("\u4e09\u5c38\u866b") != -1) {
            if (v.indexOf("\u7a0b\u5ea6") == -1) return "";
            return "%";
        }
        if (v.indexOf("\u6b21\u6570") != -1) return "";
        if (v.endsWith("\u503c")) return "";
        return "%";
    }

    public void iIiIiiiiIIiIi(StringBuffer buffer, String value) {
        String IiiiiiiiIIIII = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, null, "#cFEFF72");
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = 0;
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 != value.length()) {
            BaseGemOld IiiiiiiiIIIII5;
            GemOld IiiiiiiiIIIII6;
            IiiiiiiiIIIII4 = value.indexOf("&", IiiiiiiiIIIII3 + 1);
            if (IiiiiiiiIIIII4 == -1) {
                IiiiiiiiIIIII4 = value.length();
            }
            if (IiiiiiiiIIIII2 != 0 && (IiiiiiiiIIIII6 = (IiiiiiiiIIIII5 = new BaseGemOld(value.substring(IiiiiiiiIIIII3, IiiiiiiiIIIII4))).getGemOld(this.ALLATORIxDEMO())) != null) {
                if (buffer.length() != 0) {
                    buffer.append("#r");
                }
                buffer.append(IiiiiiiiIIIII6.getKey());
                buffer.append(" ");
                buffer.append(IIiiIiiiiIIiI.ALLATORIxDEMO((double)((double)(IiiiiiiiIIIII5.getLvl() * IiiiiiiiIIIII5.getValue()) / 100.0 * IiiiiiiiIIIII6.getValue()), (int)1));
                buffer.append(iiIiiiiiIIiiI.iIiIiiiiIIiii(IiiiiiiiIIIII6.getKey()));
            }
            ++IiiiiiiiIIIII2;
            IiiiiiiiIIIII3 = IiiiiiiiIIIII4 + 1;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void iiiIiiiiiiIIi(StringBuffer buffer, String value) {
        RoleSuitBean IiiiiiiiIIIII;
        if (buffer.length() != 0) {
            buffer.append("#r");
        }
        String IiiiiiiiIIIII2 = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, null, "#c00ffff");
        buffer.append("\u3010\u5957\u88c5\u5c5e\u6027\u3011");
        String[] IiiiiiiiIIIII3 = value.split("&");
        int IiiiiiiiIIIII4 = 4;
        while (IiiiiiiiIIIII4 < IiiiiiiiIIIII3.length) {
            IiiiiiiiIIIII = IiiiiiiiIIIII3[IiiiiiiiIIIII4].split("=");
            if (buffer.length() != 0) {
                buffer.append("#r");
            }
            IiiiiiiiIIIII2 = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, IiiiiiiiIIIII2, "#c00CD00");
            buffer.append(IiiiiiiiIIIII[0]);
            buffer.append(" ");
            buffer.append(iiIiiiiiIIiiI.iiiIiiiiiiIIi(IiiiiiiiIIIII[1]));
            ++IiiiiiiiIIIII4;
            buffer.append(iiIiiiiiIIiiI.iIiIiiiiIIiii((String)IiiiiiiiIIIII[0]));
        }
        if (buffer.length() != 0) {
            buffer.append("#r");
        }
        IiiiiiiiIIIII2 = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, null, "#c00ffff");
        buffer.append("\u3010\u5957\u88c5\u54c1\u8d28:");
        buffer.append(IiiiiiiiIIIII3[3]);
        buffer.append("\u3011");
        IiiiiiiiIIIII4 = Integer.parseInt(IiiiiiiiIIIII3[1]);
        IiiiiiiiIIIII = this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII4);
        if (IiiiiiiiIIIII == null) return;
        int IiiiiiiiIIIII5 = this.ALLATORIxDEMO().getRoleProperty().getSuitSum(IiiiiiiiIIIII3[1]);
        String[] IiiiiiiiIIIII6 = IiiiiiiiIIIII.getHaveSkill().split("\\|");
        int IiiiiiiiIIIII7 = 0;
        while (IiiiiiiiIIIII7 < IiiiiiiiIIIII6.length) {
            void IiiiiiiiIIIII8;
            String[] stringArray = IiiiiiiiIIIII6[IiiiiiiiIIIII7].split("-");
            int IiiiiiiiIIIII9 = Integer.parseInt((String)IiiiiiiiIIIII8[0]);
            Skill IiiiiiiiIIIII10 = this.ALLATORIxDEMO().iIiIiiiiIIiii((String)IiiiiiiiIIIII8[1]);
            if (IiiiiiiiIIIII10 != null) {
                if (buffer.length() != 0) {
                    buffer.append("#r");
                }
                if (IiiiiiiiIIIII5 >= IiiiiiiiIIIII9) {
                    IiiiiiiiIIIII2 = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, null, "#c00CD00");
                    buffer.append("[");
                    buffer.append(IiiiiiiiIIIII9);
                } else {
                    IiiiiiiiIIIII2 = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, null, "#c807876");
                    buffer.append("[");
                    buffer.append(IiiiiiiiIIIII5);
                }
                buffer.append("/");
                buffer.append(IiiiiiiiIIIII9);
                buffer.append("]");
                buffer.append(IiiiiiiiIIIII10.getSkillname());
            }
            ++IiiiiiiiIIIII7;
        }
    }

    /*
     * Unable to fully structure code
     */
    public String ALLATORIxDEMO(StringBuffer buffer, String value, long type) {
        IiiiiiiiIIIII = null;
        IiiiiiiiIIIII = null;
        IiiiiiiiIIIII = GoodType.IIIIIiiiiIIii((long)type) != false || GoodType.iiiIIiiiiIIii((long)type) != false;
        IiiiiiiiIIIII = value.split("&");
        IiiiiiiiIIIII = 1;
        while (IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
            block10: {
                block11: {
                    block9: {
                        if (!IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith("\u661f\u9635\u5c5e\u6027")) break block9;
                        IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII];
                        break block10;
                    }
                    IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("=");
                    if (buffer.length() != 0) {
                        buffer.append("#r");
                    }
                    if (!IiiiiiiiIIIII[0].equals("\u7279\u6280")) break block11;
                    IiiiiiiiIIIII = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, IiiiiiiiIIIII, "#c868090");
                    buffer.append("\u7279\u6280");
                    IiiiiiiiIIIII = 1;
                    if (true) ** GOTO lbl68
                }
                if (IiiiiiiiIIIII[0].endsWith("\u7b49\u7ea7")) {
                    IiiiiiiiIIIII = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, IiiiiiiiIIIII, "#c00CD00");
                    buffer.append(IiiiiiiiIIIII[0]);
                    buffer.append(" ");
                    buffer.append(IiiiiiiiIIIII[1]);
                    buffer.append("\u7ea7");
                } else if (IiiiiiiiIIIII[0].equals("\u8d44\u8d28")) {
                    IiiiiiiiIIIII = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, IiiiiiiiIIIII, "#cFFFFFF");
                    buffer.append("\u3010\u795e\u901a\u3011");
                    buffer.append(IiiiiiiiIIIII[0]);
                    buffer.append(" ");
                    buffer.append(IiiiiiiiIIIII[1]);
                    buffer.append("/100");
                } else {
                    IiiiiiiiIIIII = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, IiiiiiiiIIIII, IiiiiiiiIIIII != false ? "#c00EAFF" : "#c00CD00");
                    buffer.append(IiiiiiiiIIIII[0]);
                    buffer.append(" ");
                    buffer.append(iiIiiiiiIIiiI.iiiIiiiiiiIIi(IiiiiiiiIIIII[1]));
                    buffer.append(iiIiiiiiIIiiI.iIiIiiiiIIiii(IiiiiiiiIIIII[0]));
                }
                break block10;
                do {
                    if ((IiiiiiiiIIIII = this.ALLATORIxDEMO().iIiIiiiiIIiii(IiiiiiiiIIIII[IiiiiiiiIIIII])) != null) {
                        if (buffer.length() != 0) {
                            buffer.append("#r");
                        }
                        buffer.append(IiiiiiiiIIIII.getSkillname());
                        buffer.append(":");
                        buffer.append(IiiiiiiiIIIII.getRemark());
                    }
                    ++IiiiiiiiIIIII;
lbl68:
                    // 2 sources

                } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
            }
            ++IiiiiiiiIIIII;
        }
        return IiiiiiiiIIIII;
    }

    public void iiiiiiiiIIiii() {
        this.iiIiiiiiiiIii.setBounds(15, 13, this.iiIiiiiiiiIii.getWidth(), this.iiIiiiiiiiIii.getHeight());
        int IiiiiiiiIIIII = 30 + this.iiIiiiiiiiIii.getWidth();
        int IiiiiiiiIIIII2 = 26 + this.iiIiiiiiiiIii.getHeight();
        Point point = this.ALLATORIxDEMO().iIiIiiiiIIiii(IiiiiiiiIIIII, IiiiiiiiIIIII2);
        this.iIiIiiiiIIiii(point.x, point.y, IiiiiiiiIIIII, IiiiiiiiIIIII2);
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    public boolean ALLATORIxDEMO(String name) {
        if (name.equals("\u6731\u96c0")) return true;
        if (name.equals("\u9752\u9f99")) return true;
        if (name.equals("\u767d\u864e")) return true;
        if (!name.equals("\u7384\u6b66")) return false;
        return true;
    }

    public void IiiIiiiiiiIiI() {
        this.iIiIiiiiIiIii.setVisible(true);
        this.IIiiIiiiIIiIi.setBounds(90, 5, this.IIiiIiiiIIiIi.getWidth(), this.IIiiIiiiIIiIi.getHeight());
        this.iiIiiiiiiiIii.setBounds(90, 10 + this.IIiiIiiiIIiIi.getHeight(), this.iiIiiiiiiiIii.getWidth(), this.iiIiiiiiiiIii.getHeight());
        int IiiiiiiiIIIII = 320;
        int IiiiiiiiIIIII2 = Math.max(120, 20 + this.iiIiiiiiiiIii.getHeight() + this.IIiiIiiiIIiIi.getHeight());
        Point point = this.ALLATORIxDEMO().iIiIiiiiIIiii(IiiiiiiiIIIII, IiiiiiiiIIIII2);
        this.iIiIiiiiIIiii(point.x, point.y, IiiiiiiiIIIII, IiiiiiiiIIIII2);
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    /*
     * Unable to fully structure code
     */
    public void iIiIiiiiIIiii(Baby baby, Talent talent, int lvl, boolean type, String outcome, int weizhi) {
        block33: {
            block32: {
                this.iIiIiiiiIIiIi();
                IiiiiiiiIIIII = new StringBuffer();
                IiiiiiiiIIIII = talent.getText().indexOf("|");
                if (IiiiiiiiIIIII == -1) {
                    IiiiiiiiIIIII = talent.getText().length();
                }
                v0 = IiiiiiiiIIIII = type != false ? talent.getText().substring(0, IiiiiiiiIIIII) : talent.getText().substring(IiiiiiiiIIIII + 1);
                if (!type) break block32;
                IiiiiiiiIIIII = baby.getBabyMap(this.ALLATORIxDEMO());
                IiiiiiiiIIIII = IiiiiiiiIIIII = ((Double)IiiiiiiiIIIII.get(BaseValue.babyTotal3)).doubleValue();
                IiiiiiiiIIIII = 9;
                if (true) ** GOTO lbl108
            }
            IiiiiiiiIIIII = talent.getValue().split("\\|");
            if (IiiiiiiiIIIII.length == 2) {
                IiiiiiiiIIIII = IiiiiiiiIIIII[1].split("=");
                IiiiiiiiIIIII = IiiiiiiiIIIII[1].split("\\+");
                IiiiiiiiIIIII = IiiiiiiiIIIII.replace("{\u6570\u503c}", IIiiIiiiiIIiI.ALLATORIxDEMO((double)(Double.parseDouble(IiiiiiiiIIIII[0]) + (IiiiiiiiIIIII.length > 1 ? Double.parseDouble(IiiiiiiiIIIII[1]) : 0.0) * (double)lvl), (int)2));
            }
            IiiiiiiiIIIII.append("#W\u5f3a\u5316");
            IiiiiiiiIIIII.append(talent.getTalentName());
            IiiiiiiiIIIII.append(" ");
            IiiiiiiiIIIII.append(lvl);
            IiiiiiiiIIIII.append("\u7ea7#r");
            IiiiiiiiIIIII.append(IiiiiiiiIIIII);
            IiiiiiiiIIIII.append("#r");
            if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)outcome)) {
                IiiiiiiiIIIII.append("#r#G\u8fd8\u672a\u83b7\u53d6\u7ed3\u5c40,\u4e0d\u53ef\u5f3a\u5316\u6b64\u6280\u80fd\u683c\u5b50");
                return;
            }
            if (lvl >= 10) {
                IiiiiiiiIIIII.append("#G\u5df2\u7ecf\u8fbe\u5230\u6700\u9ad8\u7ea7\u522b\u4e86");
            } else {
                IiiiiiiiIIIII.append("#G\u53ef\u4ee5\u901a\u8fc7\u70b9\u51fb\u6280\u80fd\u683c\u5b50\u6d88\u8017\u743c\u6d46\u7389\u6db2\u6765\u5f3a\u5316\u6b64\u6280\u80fd,\u6709\u51e0\u7387\u6210\u529f");
            }
            IiiiiiiiIIIII = this.ALLATORIxDEMO().ALLATORIxDEMO(outcome);
            IiiiiiiiIIIII = 0;
            if (weizhi == 0) {
                IiiiiiiiIIIII = IiiiiiiiIIIII.getQ1();
            } else if (weizhi == 1) {
                IiiiiiiiIIIII = IiiiiiiiIIIII.getQ2();
            } else if (weizhi == 2) {
                IiiiiiiiIIIII = IiiiiiiiIIIII.getQ3();
            }
            switch (IiiiiiiiIIIII) {
                case 0: {
                    IiiiiiiiIIIII.append("#r#G\u6b64\u6280\u80fd\u683c\u53ef\u5f3a\u5316\u5929\u8d44:\u4e0d\u53ef\u5f3a\u5316");
                    break;
                }
                case 1: {
                    IiiiiiiiIIIII.append("#r#G\u6b64\u6280\u80fd\u683c\u53ef\u5f3a\u5316\u5929\u8d44:\u53ef\u5f3a\u5316\u4f4e\u7ea7\u4eba\u65cf\u5929\u8d44");
                    break;
                }
                case 2: {
                    IiiiiiiiIIIII.append("#r#G\u6b64\u6280\u80fd\u683c\u53ef\u5f3a\u5316\u5929\u8d44:\u53ef\u5f3a\u5316\u4f4e\u7ea7\u9b54\u65cf\u5929\u8d44");
                    break;
                }
                case 3: {
                    IiiiiiiiIIIII.append("#r#G\u6b64\u6280\u80fd\u683c\u53ef\u5f3a\u5316\u5929\u8d44:\u53ef\u5f3a\u5316\u4f4e\u7ea7\u4ed9\u65cf\u5929\u8d44");
                    break;
                }
                case 4: {
                    IiiiiiiiIIIII.append("#r#G\u6b64\u6280\u80fd\u683c\u53ef\u5f3a\u5316\u5929\u8d44:\u53ef\u5f3a\u5316\u4f4e\u7ea7\u9b3c\u65cf\u5929\u8d44");
                    break;
                }
                case 5: {
                    IiiiiiiiIIIII.append("#r#G\u6b64\u6280\u80fd\u683c\u53ef\u5f3a\u5316\u5929\u8d44:\u53ef\u5f3a\u5316\u5168\u90e8\u4f4e\u7ea7\u5929\u8d44");
                    break;
                }
                case 6: {
                    IiiiiiiiIIIII.append("#r#G\u6b64\u6280\u80fd\u683c\u53ef\u5f3a\u5316\u5929\u8d44:\u53ef\u5f3a\u5316\u9ad8\u7ea7\u4eba\u65cf\u5929\u8d44");
                    break;
                }
                case 7: {
                    IiiiiiiiIIIII.append("#r#G\u6b64\u6280\u80fd\u683c\u53ef\u5f3a\u5316\u5929\u8d44:\u53ef\u5f3a\u5316\u9ad8\u7ea7\u9b54\u65cf\u5929\u8d44");
                    break;
                }
                case 8: {
                    IiiiiiiiIIIII.append("#r#G\u6b64\u6280\u80fd\u683c\u53ef\u5f3a\u5316\u5929\u8d44:\u53ef\u5f3a\u5316\u9ad8\u7ea7\u4ed9\u65cf\u5929\u8d44");
                    break;
                }
                case 9: {
                    IiiiiiiiIIIII.append("#r#G\u6b64\u6280\u80fd\u683c\u53ef\u5f3a\u5316\u5929\u8d44:\u53ef\u5f3a\u5316\u9ad8\u7ea7\u9b3c\u65cf\u5929\u8d44");
                    break;
                }
                case 10: {
                    IiiiiiiiIIIII.append("#r#G\u6b64\u6280\u80fd\u683c\u53ef\u5f3a\u5316\u5929\u8d44:\u53ef\u5f3a\u5316\u5168\u90e8\u9ad8\u7ea7\u5929\u8d44");
                    break;
                }
                case 11: {
                    IiiiiiiiIIIII.append("#r#G\u6b64\u6280\u80fd\u683c\u53ef\u5f3a\u5316\u5929\u8d44:\u53ef\u5f3a\u5316\u5168\u90e8\u5929\u8d44");
                    break;
                }
            }
            break block33;
            do {
                if ((IiiiiiiiIIIII = (Double)IiiiiiiiIIIII.get(BaseValue.babyKeys[IiiiiiiiIIIII])) != null) {
                    if (IiiiiiiiIIIII > 400.0) {
                        IiiiiiiiIIIII = 400.0 + (IiiiiiiiIIIII - 400.0) / 6.4;
                    }
                    IiiiiiiiIIIII += IiiiiiiiIIIII * IiiiiiiiIIIII * 0.002;
                }
                ++IiiiiiiiIIIII;
lbl108:
                // 2 sources

            } while (IiiiiiiiIIIII <= 10);
            IiiiiiiiIIIII = (IiiiiiiiIIIII /= 100.0) * talent.getTouch();
            if (talent.getId() > 1000) {
                IiiiiiiiIIIII = (talent.getId() - 1001) / 2;
                if (IiiiiiiiIIIII >= 6 && IiiiiiiiIIIII <= 9 || IiiiiiiiIIIII == 23) {
                    IiiiiiiiIIIII = (Double)IiiiiiiiIIIII.get(String.valueOf(talent.getTalentName()) + "\u5438\u6536\u4f24\u5bb3\u589e\u52a0");
                    if (IiiiiiiiIIIII != null && IiiiiiiiIIIII != 0.0) {
                        IiiiiiiiIIIII += IiiiiiiiIIIII.doubleValue();
                    }
                } else {
                    IiiiiiiiIIIII = (Double)IiiiiiiiIIIII.get(String.valueOf(talent.getTalentName()) + "\u53d1\u52a8\u51e0\u7387\u589e\u52a0");
                    if (IiiiiiiiIIIII != null && IiiiiiiiIIIII != 0.0) {
                        IiiiiiiiIIIII += IiiiiiiiIIIII.doubleValue();
                    }
                }
            }
            IiiiiiiiIIIII = IiiiiiiiIIIII.replace("{\u6570\u503c}", IIiiIiiiiIIiI.ALLATORIxDEMO((double)IiiiiiiiIIIII, (int)2));
            IiiiiiiiIIIII.append("#W");
            IiiiiiiiIIIII.append(talent.getTalentName());
            IiiiiiiiIIIII.append("#r");
            IiiiiiiiIIIII.append(IiiiiiiiIIIII);
            IiiiiiiiIIIII.append("#r");
            IiiiiiiiIIIII.append(this.ALLATORIxDEMO(talent.getDemand(), lvl));
            IIiIiiiiIiIII.ALLATORIxDEMO((Map)IiiiiiiiIIIII);
        }
        this.iiIiiiiiiiIii.setTextSize(IiiiiiiiIIIII.toString(), 255);
        this.iiiiiiiiIIiii();
    }

    public void IIIIIiiiiIIii(StringBuffer buffer, String color, String value, long type) {
        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)value)) {
            return;
        }
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        boolean IiiiiiiiIIIII3 = false;
        boolean IiiiiiiiIIIII4 = false;
        color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#Y");
        int IiiiiiiiIIIII5 = 0;
        int IiiiiiiiIIIII6 = 0;
        while (IiiiiiiiIIIII6 < value.length()) {
            int IiiiiiiiIIIII7;
            IiiiiiiiIIIII6 = value.indexOf("|", IiiiiiiiIIIII5 + 1);
            if (IiiiiiiiIIIII6 == -1) {
                IiiiiiiiIIIII6 = value.length();
            }
            if ((IiiiiiiiIIIII7 = value.indexOf("=", IiiiiiiiIIIII5 + 1)) != -1 && IiiiiiiiIIIII7 <= IiiiiiiiIIIII6) {
                String IiiiiiiiIIIII8 = value.substring(IiiiiiiiIIIII5, IiiiiiiiIIIII7);
                if (IiiiiiiiIIIII8.equals("\u7b49\u7ea7")) {
                    IiiiiiiiIIIII = IIiiIiiiiIIiI.ALLATORIxDEMO((String)value, (int)(IiiiiiiiIIIII7 + 1), (int)IiiiiiiiIIIII6);
                } else if (IiiiiiiiIIIII8.equals("\u8010\u4e45")) {
                    IiiiiiiiIIIII2 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)value, (int)(IiiiiiiiIIIII7 + 1), (int)IiiiiiiiIIIII6);
                } else if (IiiiiiiiIIIII8.equals("\u6280\u80fd")) {
                    if (!IiiiiiiiIIIII3) {
                        this.ALLATORIxDEMO(buffer, IiiiiiiiIIIII, IiiiiiiiIIIII2);
                        IiiiiiiiIIIII3 = true;
                    }
                    if (!IiiiiiiiIIIII4) {
                        color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#c868090");
                        buffer.append("#r\u3010\u7279\u6280\u3011");
                        IiiiiiiiIIIII4 = true;
                    }
                    IiiiiiiiIIIII5 = IiiiiiiiIIIII7 + 1;
                    IiiiiiiiIIIII7 = value.indexOf("#", IiiiiiiiIIIII5 + 1);
                    int IiiiiiiiIIIII9 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)value, (int)IiiiiiiiIIIII5, (int)IiiiiiiiIIIII7);
                    int IiiiiiiiIIIII10 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)value, (int)(IiiiiiiiIIIII7 + 1), (int)IiiiiiiiIIIII6);
                    Skill IiiiiiiiIIIII11 = this.ALLATORIxDEMO().iIiIiiiiIIiii(String.valueOf(IiiiiiiiIIIII9));
                    if (IiiiiiiiIIIII11 != null) {
                        buffer.append("#r");
                        buffer.append(IiiiiiiiIIIII11.getSkillname());
                        buffer.append("(");
                        buffer.append(IiiiiiiiIIIII10);
                        buffer.append("\u7ea7)");
                        buffer.append(":");
                        buffer.append(SkillUtil.ALLATORIxDEMO((Skill)IiiiiiiiIIIII11, (int)IiiiiiiiIIIII10).replaceAll("#W", "#c868090"));
                    }
                } else {
                    String IiiiiiiiIIIII9 = value.substring(IiiiiiiiIIIII7 + 1, IiiiiiiiIIIII6);
                    buffer.append("#r");
                    buffer.append(IiiiiiiiIIIII8);
                    buffer.append(" ");
                    if (IiiiiiiiIIIII9.charAt(0) != '-') {
                        buffer.append("+");
                    }
                    buffer.append(IiiiiiiiIIIII9);
                    buffer.append(iiIiiiiiIIiiI.iIiIiiiiIIiii(IiiiiiiiIIIII8));
                }
            }
            IiiiiiiiIIIII5 = IiiiiiiiIIIII6 + 1;
        }
        if (IiiiiiiiIIIII3) return;
        this.ALLATORIxDEMO(buffer, IiiiiiiiIIIII, IiiiiiiiIIIII2);
    }

    public String ALLATORIxDEMO(String name) {
        if (name.equals("\u6731\u96c0")) {
            return "\u7455\u75b5:\u7565\u5fae\u51cf\u5c11\u5168\u961f\u51b0\u6df7\u7761\u5fd8\u6297\u6027";
        }
        if (name.equals("\u9752\u9f99")) {
            return "\u7455\u75b5:\u7565\u5fae\u51cf\u5c11\u5168\u961f\u4ed9\u6cd5\u6297\u6027";
        }
        if (name.equals("\u767d\u864e")) {
            return "\u7455\u75b5:\u7565\u5fae\u51cf\u5c11\u5168\u961f\u9b3c\u706b\u3001\u4e09\u5c38\u866b\u6297\u6027";
        }
        if (name.equals("\u7384\u6b66")) {
            return "\u7455\u75b5:\u7565\u5fae\u51cf\u5c11\u5168\u961f\u9707\u6151\u6297\u6027";
        }
        if (name.equals("\u91d1\u725b")) {
            return "\u672c\u65b9\u6240\u6709\u4eba\u7269\u3001\u53ec\u5524\u517d\u5bf9\u654c\u65b9\u9020\u6210\u7684\u7269\u7406\u4f24\u5bb3\u6709\u4e00\u5b9a\u7684\u52a0\u6210";
        }
        if (name.equals("\u706b\u733f")) {
            return "\u82e5\u5bf9\u65b9\u7075\u5b9d\u5bf9\u672c\u65b9\u4efb\u610f\u5355\u4f4d\u9020\u6210\u4f24\u5bb3\uff0c\u62b5\u6297\u4e00\u5b9a\u7a0b\u5ea6\u4f24\u5bb3\uff1b\u6bcf2\u56de\u5408\u53ef\u751f\u6548\u4e00\u6b21";
        }
        if (name.equals("\u8d64\u9a6c")) {
            return "\u672c\u65b9\u6240\u6709\u4eba\u7269\u3001\u53ec\u5524\u517d\u83b7\u5f97\u4e00\u5b9a\u7ecf\u9a8c\u52a0\u6210";
        }
        if (!name.equals("\u9ec4\u9e64")) return "\u672c\u65b9\u6240\u6709\u4eba\u7269\u3001\u53ec\u5524\u517d\u7684\u4ed9\u6cd5\u3001\u9b3c\u706b\u3001\u9707\u6151\u6709\u4e00\u5b9a\u52a0\u6210";
        return "\u672c\u65b9\u6240\u6709\u4eba\u7269\u589e\u52a0\u51b0\u6df7\u7761\u5fd8\u6297\u6027";
    }

    public void iiiiiiiiIIiii(StringBuffer buffer, String color, String value, long type) {
        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)value)) {
            return;
        }
        boolean IiiiiiiiIIIII = false;
        String[] IiiiiiiiIIIII2 = value.split("\\|");
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < IiiiiiiiIIIII2.length) {
            String IiiiiiiiIIIII4;
            int IiiiiiiiIIIII5 = IiiiiiiiIIIII2[IiiiiiiiIIIII3].indexOf("=");
            if (IiiiiiiiIIIII5 != -1 && !(IiiiiiiiIIIII4 = IiiiiiiiIIIII2[IiiiiiiiIIIII3].substring(0, IiiiiiiiIIIII5)).equals("\u4e8b\u4ef6") && !IiiiiiiiIIIII4.equals("\u7cd6\u679c")) {
                if (IiiiiiiiIIIII4.endsWith("\u8981\u6c42")) {
                    if (buffer.length() != 0) {
                        buffer.append("#r");
                    }
                    color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#W");
                    buffer.append("\u3010");
                    buffer.append(IiiiiiiiIIIII4);
                    buffer.append("\u3011");
                    buffer.append(IiiiiiiiIIIII2[IiiiiiiiIIIII3].substring(IiiiiiiiIIIII5 + 1));
                    if (IiiiiiiiIIIII4.equals("\u5e74\u9f84\u8981\u6c42")) {
                        buffer.append("\u5c81");
                    }
                } else {
                    if (buffer.length() != 0) {
                        buffer.append(IiiiiiiiIIIII ? "," : "#r");
                    }
                    IiiiiiiiIIIII = true;
                    color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#Y");
                    if (IiiiiiiiIIIII4.equals("\u5927\u8bdd\u5e01")) {
                        buffer.append("\u6d88\u8017\u5927\u8bdd\u5e01");
                        buffer.append(IiiiiiiiIIIII2[IiiiiiiiIIIII3].substring(IiiiiiiiIIIII5 + 1));
                    } else {
                        buffer.append(IiiiiiiiIIIII4);
                        if (IiiiiiiiIIIII2[IiiiiiiiIIIII3].charAt(IiiiiiiiIIIII5 + 1) != '-') {
                            buffer.append("+");
                        }
                        buffer.append(IiiiiiiiIIIII2[IiiiiiiiIIIII3].substring(IiiiiiiiIIIII5 + 1));
                    }
                }
            }
            ++IiiiiiiiIIIII3;
        }
    }

    public void ALLATORIxDEMO(Baby baby, Talent talent, int lvl, boolean type, String outcome, int path) {
        if (this.ALLATORIxDEMO().gameBaby) {
            this.iIiIiiiiIIiii(baby, talent, lvl, type, outcome, path);
            return;
        }
        this.iIiIiiiiIIiIi();
        StringBuffer IiiiiiiiIIIII = new StringBuffer();
        IiiiiiiiIIIII.append("#Y ");
        if (type || lvl == 0) {
            IiiiiiiiIIIII.append(talent.getTalentName());
        } else {
            IiiiiiiiIIIII.append("\u5f3a\u5316");
            IiiiiiiiIIIII.append(talent.getTalentName());
            IiiiiiiiIIIII.append(" ");
            IiiiiiiiIIIII.append(lvl);
            IiiiiiiiIIIII.append("\u7ea7");
        }
        if (type) {
            String IiiiiiiiIIIII2 = talent.getText();
            IiiiiiiiIIIII2 = IiiiiiiiIIIII2.replace("{\u89e6\u53d1\u51e0\u7387}", String.valueOf((double)lvl * talent.getTouch()) + "%");
            IiiiiiiiIIIII2 = IiiiiiiiIIIII2.replace("{\u8981\u6c42}", this.ALLATORIxDEMO(talent.getDemand(), lvl));
            IiiiiiiiIIIII.append("#r#W");
            IiiiiiiiIIIII.append(IiiiiiiiIIIII2);
        } else {
            this.ALLATORIxDEMO(IiiiiiiiIIIII, talent, lvl, outcome, path);
        }
        this.iiIiiiiiiiIii.setTextSize(IiiiiiiiIIIII.toString(), 255);
        this.iiiiiiiiIIiii();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (this.iIiIiiiiIiIii.ALLATORIxDEMO() != null) {
            Image IiiiiiiiIIIII = this.iIiIiiiiIiIii.ALLATORIxDEMO();
            if (this.IiIIIiiiiIiiI == 2) {
                int IiiiiiiiIIIII2 = Math.min(80, IiiiiiiiIIIII.getWidth(null));
                int IiiiiiiiIIIII3 = Math.min(80, IiiiiiiiIIIII.getHeight(null));
                if (this.iIiIiiiiIiIii.getWidth() != IiiiiiiiIIIII2 || this.iIiIiiiiIiIii.getHeight() != IiiiiiiiIIIII3) {
                    this.iIiIiiiiIiIii.setBounds(5 + (80 - IiiiiiiiIIIII2) / 2, 10 + (80 - IiiiiiiiIIIII3) / 2, IiiiiiiiIIIII2, IiiiiiiiIIIII3);
                }
            } else {
                int IiiiiiiiIIIII4 = Math.min(120, IiiiiiiiIIIII.getWidth(null));
                int IiiiiiiiIIIII5 = Math.min(120, IiiiiiiiIIIII.getHeight(null));
                if (this.iIiIiiiiIiIii.getWidth() != IiiiiiiiIIIII4 || this.iIiIiiiiIiIii.getHeight() != IiiiiiiiIIIII5) {
                    this.iIiIiiiiIiIii.setBounds(5 + (120 - IiiiiiiiIIIII4) / 2, 10 + (120 - IiiiiiiiIIIII5) / 2, IiiiiiiiIIIII4, IiiiiiiiIIIII5);
                }
            }
        }
        if (this.iIiiIiiiiiiII) {
            g.drawImage(IIiIiiiiIiiIi.IiiIIiiiiiiiI, this.getWidth() - 49, 0, (ImageObserver)((Object)this));
        }
        if (!this.IiiiiiiiIIIII) return;
        g.drawImage(IIiIiiiiIiiIi.IiIIIiiiiIiiI, 15, 8, (ImageObserver)((Object)this));
    }

    public void ALLATORIxDEMO(String name, String msg) {
        this.iIiIiiiiIIiIi();
        this.IIiiIiiiIIiIi.setTextSize("#cf8fc70" + name, 215);
        this.iiIiiiiiiiIii.setTextSize(msg, 215);
        this.iiiIiiiiiiIIi();
    }

    public int ALLATORIxDEMO(int id, int lvl) {
        if (id == 3009) {
            return 1;
        }
        if (id == 3010) return 2;
        if (id == 3026) return 2;
        if (id == 3021) return 2;
        if (id == 3022) {
            return 2;
        }
        if (id >= 3016 && id <= 3019) {
            if (lvl <= 4) return 2;
            return 3;
        }
        if (id == 3025) return 3;
        if (id == 3023) {
            return 3;
        }
        if (id != 3029) {
            if (id != 3028) return lvl;
        }
        if (lvl <= 3) return 1;
        return 2;
    }

    public void iiiIiiiiiiIIi(boolean center) {
        this.iIiIiiiiIiIii.setVisible(true);
        this.IIiiIiiiIIiIi.setBounds(130, 5, this.IIiiIiiiIIiIi.getWidth(), this.IIiiIiiiIIiIi.getHeight());
        this.iiIiiiiiiiIii.setBounds(130, 10 + this.IIiiIiiiIIiIi.getHeight(), this.iiIiiiiiiiIii.getWidth(), this.iiIiiiiiiiIii.getHeight());
        int IiiiiiiiIIIII = 360;
        int IiiiiiiiIIIII2 = Math.max(140, 20 + this.iiIiiiiiiiIii.getHeight() + this.IIiiIiiiIIiIi.getHeight());
        Point IiiiiiiiIIIII3 = center ? this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII2) : this.ALLATORIxDEMO().iIiIiiiiIIiii(IiiiiiiiIIIII, IiiiiiiiIIIII2);
        this.iIiIiiiiIIiii(IiiiiiiiIIIII3.x, IiiiiiiiIIIII3.y, IiiiiiiiIIIII, IiiiiiiiIIIII2);
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    public void IiiIiiiiiiIiI(StringBuffer buffer, String color, String value, long type) {
        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)value)) {
            return;
        }
        if (buffer.length() != 0) {
            buffer.append("#r");
        }
        buffer.append(iiIiiiiiIIiiI.ALLATORIxDEMO(color, value));
    }

    public void iIiIiiiiIIiii(StringBuffer buffer, String color, Goodstable good) {
        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)good.getValue())) {
            return;
        }
        String IiiiiiiiIIIII = good.getValue();
        String IiiiiiiiIIIII2 = null;
        int IiiiiiiiIIIII3 = 0;
        int IiiiiiiiIIIII4 = 0;
        int IiiiiiiiIIIII5 = 0;
        int IiiiiiiiIIIII6 = 0;
        while (IiiiiiiiIIIII6 < IiiiiiiiIIIII.length()) {
            IiiiiiiiIIIII6 = IiiiiiiiIIIII.indexOf("|", IiiiiiiiIIIII5 + 1);
            if (IiiiiiiiIIIII6 == -1) {
                IiiiiiiiIIIII6 = IiiiiiiiIIIII.length();
            }
            if (IiiiiiiiIIIII4 == 0) {
                IiiiiiiiIIIII2 = IiiiiiiiIIIII.substring(IiiiiiiiIIIII5 + 3, IiiiiiiiIIIII6);
                if (buffer.length() != 0) {
                    buffer.append("#r");
                }
                color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#cFFFFFF");
                buffer.append("\u3010\u54c1\u8d28\u3011");
                color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, GoodType.getQualityColorOx((String)IiiiiiiiIIIII2));
                buffer.append(IiiiiiiiIIIII2);
            } else if (IiiiiiiiIIIII4 == 1) {
                IiiiiiiiIIIII3 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII, (int)(IiiiiiiiIIIII5 + 3), (int)IiiiiiiiIIIII6);
                if (buffer.length() != 0) {
                    buffer.append("#r");
                }
                color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#cFFFFFF");
                buffer.append("\u3010\u661f\u7ea7\u3011");
                color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#cFFFF00");
                buffer.append(IiiiiiiiIIIII3);
                buffer.append("/15");
            } else if (IiiiiiiiIIIII4 == 2) {
                int IiiiiiiiIIIII7 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII, (int)(IiiiiiiiIIIII5 + 3), (int)IiiiiiiiIIIII6);
                if (buffer.length() != 0) {
                    buffer.append("#r");
                }
                color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#cFFFFFF");
                buffer.append("\u3010\u7b49\u7ea7\u3011");
                buffer.append(BaseValue.getWingLevel((int)IiiiiiiiIIIII7));
                if (buffer.length() != 0) {
                    buffer.append("#r");
                }
                color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#cFFFFFF");
                buffer.append("\u3010\u7ecf\u9a8c\u3011");
                buffer.append(IiiiiiiiIIIII7);
            } else if (IiiiiiiiIIIII4 == 3) {
                if (buffer.length() != 0) {
                    buffer.append("#r");
                }
                color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#cFFFFFF");
                buffer.append("\u3010\u989c\u8272\u3011");
                buffer.append(IiiiiiiiIIIII.substring(IiiiiiiiIIIII5 + 3, IiiiiiiiIIIII6));
            } else {
                String IiiiiiiiIIIII8 = IiiiiiiiIIIII.substring(IiiiiiiiIIIII5, IiiiiiiiIIIII6);
                if (IiiiiiiiIIIII8.startsWith("\u529b\u91cf") || IiiiiiiiIIIII8.startsWith("\u7075\u6027") || IiiiiiiiIIIII8.startsWith("\u6839\u9aa8") || IiiiiiiiIIIII8.startsWith("\u654f\u6377")) {
                    String[] IiiiiiiiIIIII9 = IiiiiiiiIIIII8.split("=");
                    if (buffer.length() != 0) {
                        buffer.append("#r");
                    }
                    color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#cCDCA6D");
                    buffer.append(IiiiiiiiIIIII9[0]);
                    buffer.append(" ");
                    buffer.append(BaseValue.getUpStarData((String)IiiiiiiiIIIII9[1], (int)IiiiiiiiIIIII3, (String)IiiiiiiiIIIII2));
                    color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#cFFFFFF");
                    buffer.append("(");
                    buffer.append(IiiiiiiiIIIII9[1]);
                    buffer.append(")");
                } else if (IiiiiiiiIIIII8.startsWith(GoodType.Extras[0])) {
                    this.ALLATORIxDEMO(buffer, IiiiiiiiIIIII8, 8888L);
                }
            }
            ++IiiiiiiiIIIII4;
            IiiiiiiiIIIII5 = IiiiiiiiIIIII6 + 1;
        }
    }

    public void iIiIiiiiIIiii(StringBuffer buffer, String value) {
        int IiiiiiiiIIIII;
        String[] IiiiiiiiIIIII2 = value.split("&");
        double IiiiiiiiIIIII3 = 1.0;
        int IiiiiiiiIIIII4 = Integer.parseInt(IiiiiiiiIIIII2[1]);
        int IiiiiiiiIIIII5 = IiiiiiiiIIIII4 >> 5 & 0x1F;
        int IiiiiiiiIIIII6 = IiiiiiiiIIIII4 & 0x1F;
        StringBuffer IiiiiiiiIIIII7 = null;
        int IiiiiiiiIIIII8 = 4;
        while (IiiiiiiiIIIII8 < IiiiiiiiIIIII2.length) {
            Skill IiiiiiiiIIIII9;
            if (IiiiiiiiIIIII2[IiiiiiiiIIIII8].startsWith("\u7279\u6280=") && (IiiiiiiiIIIII9 = this.ALLATORIxDEMO().iIiIiiiiIIiii(IiiiiiiiIIIII2[IiiiiiiiIIIII8].substring(3))) != null) {
                IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII9.getSkillid());
                if (IiiiiiiiIIIII == 8121) {
                    IiiiiiiiIIIII3 += 0.15;
                } else if (IiiiiiiiIIIII == 8122) {
                    IiiiiiiiIIIII3 += 0.25;
                }
                if (IiiiiiiiIIIII7 == null) {
                    IiiiiiiiIIIII7 = new StringBuffer("\u7279\u6280");
                }
                IiiiiiiiIIIII7.append("#r");
                IiiiiiiiIIIII7.append(IiiiiiiiIIIII9.getSkillname());
            }
            ++IiiiiiiiIIIII8;
        }
        String IiiiiiiiIIIII22 = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, null, "#cBD7F3F");
        int IiiiiiiiIIIII10 = 2;
        while (IiiiiiiiIIIII10 < 4 && IiiiiiiiIIIII10 < IiiiiiiiIIIII2.length) {
            if (!IiiiiiiiIIIII2[IiiiiiiiIIIII10].startsWith("\u7279\u6280=") && (IiiiiiiiIIIII = IiiiiiiiIIIII2[IiiiiiiiIIIII10].indexOf("=")) != -1) {
                String IiiiiiiiIIIII11 = IiiiiiiiIIIII2[IiiiiiiiIIIII10].substring(0, IiiiiiiiIIIII);
                IiiiiiiiIIIII = IiiiiiiiIIIII2[IiiiiiiiIIIII10].indexOf("#", IiiiiiiiIIIII11.length() + 1);
                double IiiiiiiiIIIII12 = QualityZW.getDouble((String)IiiiiiiiIIIII2[IiiiiiiiIIIII10].substring(IiiiiiiiIIIII11.length() + 1, IiiiiiiiIIIII));
                IiiiiiiiIIIII12 *= (double)(IiiiiiiiIIIII10 == 2 ? IiiiiiiiIIIII5 : IiiiiiiiIIIII6);
                IiiiiiiiIIIII12 += QualityZW.getDouble((String)IiiiiiiiIIIII2[IiiiiiiiIIIII10].substring(IiiiiiiiIIIII + 1));
                if (IiiiiiiiIIIII3 != 1.0) {
                    IiiiiiiiIIIII12 *= IiiiiiiiIIIII3;
                }
                if (buffer.length() != 0) {
                    buffer.append("#r");
                }
                buffer.append(IiiiiiiiIIIII11);
                buffer.append(" ");
                buffer.append(IIiiIiiiiIIiI.ALLATORIxDEMO((double)IiiiiiiiIIIII12, (int)1));
                buffer.append(iiIiiiiiIIiiI.iIiIiiiiIIiii(IiiiiiiiIIIII11));
            }
            ++IiiiiiiiIIIII10;
        }
        if (buffer.length() != 0) {
            buffer.append("#r");
        }
        buffer.append("\u603b\u70b9\u7cb9\u503c:");
        buffer.append(IiiiiiiiIIIII5 + IiiiiiiiIIIII6);
        if (IiiiiiiiIIIII7 == null) return;
        if (buffer.length() != 0) {
            buffer.append("#r");
        }
        IiiiiiiiIIIII22 = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, null, "#c868090");
        buffer.append(IiiiiiiiIIIII7);
    }

    public void ALLATORIxDEMO(StarSoul starSoul, long data) {
        this.iIiIiiiiIIiIi();
        this.IiIIIiiiiIiiI = 2;
        int IiiiiiiiIIIII = starSoul.getId() <= 10000 ? 120 : 280;
        StringBuffer IiiiiiiiIIIII2 = new StringBuffer();
        IiiiiiiiIIIII2.append("#cf8fc70");
        IiiiiiiiIIIII2.append(starSoul.getName());
        IiiiiiiiIIIII2.append("#r");
        if (starSoul.getId() <= 10000) {
            IiiiiiiiIIIII2.append("#W\u8010\u4e45:");
            IiiiiiiiIIIII2.append(data);
            IiiiiiiiIIIII2.append("/8000#r\u70b9\u51fb\u8865\u5145\u8010\u4e45");
        } else {
            IiiiiiiiiIIII IiiiiiiiIIIII3 = this.ALLATORIxDEMO();
            IiiiiiiiIIIII2.append("#W\u6fc0\u6d3b\u6240\u9700#cf8fc70");
            String[] IiiiiiiiIIIII4 = starSoul.getValue().split("\\|");
            int IiiiiiiiIIIII5 = 0;
            while (IiiiiiiiIIIII5 < IiiiiiiiIIIII4.length) {
                StarSoul IiiiiiiiIIIII6 = IiiiiiiiIIIII3.ALLATORIxDEMO(Integer.parseInt(IiiiiiiiIIIII4[IiiiiiiiIIIII5]));
                if (IiiiiiiiIIIII5 != 0) {
                    IiiiiiiiIIIII2.append(",");
                }
                ++IiiiiiiiIIIII5;
                IiiiiiiiIIIII2.append(IiiiiiiiIIIII6.getName());
            }
            Skill IiiiiiiiIIIII22 = IiiiiiiiIIIII3.iIiIiiiiIIiii(String.valueOf(starSoul.getLvl()));
            IiiiiiiiIIIII2.append("#r#W\u6fc0\u6d3b\u540e\u83b7\u5f97\u6280\u80fd-#cf8fc70");
            IiiiiiiiIIIII2.append(IiiiiiiiIIIII22.getSkillname());
        }
        this.iiIiiiiiiiIii.setTextSize(IiiiiiiiIIIII2.toString(), IiiiiiiiIIIII);
        this.iiiiiiiiIIiii();
    }

    public void ALLATORIxDEMO(RoleTxBean roleTxBean) {
        this.iIiIiiiiIIiIi();
        this.iIiIiiiiIiIii.ALLATORIxDEMO(IIiIiiiiIiiIi.iiiiiiiiIIiii((String)("tx" + roleTxBean.getRdId())));
        this.IIiiIiiiIIiIi.setTextSize("#cFFFF75" + roleTxBean.getRdName(), 215);
        this.iiIiiiiiiiIii.setTextSize(roleTxBean.getRdAsk(), 215);
        this.iiiIiiiiiiIIi(false);
    }

    public void ALLATORIxDEMO(String skillName, int lvl, Lingbao lingbao) {
        this.iIiIiiiiIIiIi();
        Skill IiiiiiiiIIIII = this.ALLATORIxDEMO().ALLATORIxDEMO(skillName);
        StringBuffer IiiiiiiiIIIII2 = new StringBuffer();
        IiiiiiiiIIIII2.append("#W");
        IiiiiiiiIIIII2.append(skillName);
        IiiiiiiiIIIII2.append("#r#Y\u3010\u7ec4\u5408\u6280\u80fd\u3011: ");
        IiiiiiiiIIIII2.append(lvl);
        IiiiiiiiIIIII2.append("\u4eba\u5408\u6280#r#Y\u3010\u7ec4\u5408\u7c7b\u578b\u3011: ");
        if (IiiiiiiiIIIII.getSkilltype().equals("0")) {
            IiiiiiiiIIIII2.append("\u653b\u51fb\u7c7b");
        } else if (IiiiiiiiIIIII.getSkilltype().equals("1")) {
            IiiiiiiiIIIII2.append("\u8f85\u52a9\u7c7b");
        } else {
            IiiiiiiiIIIII2.append("\u843d\u5b9d\u7c7b");
        }
        String[] IiiiiiiiIIIII3 = IiiiiiiiIIIII.getRemark().split("\\|");
        int IiiiiiiiIIIII4 = Integer.parseInt(IiiiiiiiIIIII.getSkillid());
        int IiiiiiiiIIIII5 = 0;
        while (IiiiiiiiIIIII5 < IiiiiiiiIIIII3.length) {
            if (IiiiiiiiIIIII3[IiiiiiiiIIIII5].equals("\u76ee\u6807\u6570")) {
                IiiiiiiiIIIII2.append("#r#Y\u3010\u76ee\u6807\u6570\u3011: ");
                IiiiiiiiIIIII2.append(this.iIiIiiiiIIiii(IiiiiiiiIIIII4, lvl));
            } else if (IiiiiiiiIIIII3[IiiiiiiiIIIII5].equals("\u6301\u7eed\u56de\u5408\u6570")) {
                IiiiiiiiIIIII2.append("#r#Y\u3010\u6301\u7eed\u56de\u5408\u6570\u3011: ");
                IiiiiiiiIIIII2.append(this.ALLATORIxDEMO(IiiiiiiiIIIII4, lvl));
            } else if (this.ALLATORIxDEMO().gameBattle && IiiiiiiiIIIII4 >= 3001 && IiiiiiiiIIIII4 <= 3023) {
                Object IiiiiiiiIIIII6;
                int IiiiiiiiIIIII7;
                int n = IiiiiiiiIIIII7 = lingbao != null ? lingbao.getLingbaolvl().intValue() : 0;
                if (lingbao != null) {
                    int IiiiiiiiIIIII8 = BaseValue.getQv((String)lingbao.getBaoquality());
                    if (IiiiiiiiIIIII8 == 50) {
                        IiiiiiiiIIIII7 = (int)((double)IiiiiiiiIIIII7 * 2.5);
                    } else if (IiiiiiiiIIIII8 == 40) {
                        IiiiiiiiIIIII7 = (int)((double)IiiiiiiiIIIII7 * 1.7);
                    } else if (IiiiiiiiIIIII8 == 30) {
                        IiiiiiiiIIIII7 = (int)((double)IiiiiiiiIIIII7 * 1.3);
                    } else if (IiiiiiiiIIIII8 == 20) {
                        IiiiiiiiIIIII7 = (int)((double)IiiiiiiiIIIII7 * 1.1);
                    }
                }
                double IiiiiiiiIIIII9 = Double.parseDouble(IiiiiiiiIIIII.getValue());
                double IiiiiiiiIIIII10 = Double.parseDouble(IiiiiiiiIIIII.getGrow());
                double IiiiiiiiIIIII11 = IiiiiiiiIIIII9 + IiiiiiiiIIIII10 * (double)IiiiiiiiIIIII7;
                if (IiiiiiiiIIIII4 == 3011 || IiiiiiiiIIIII4 == 3012) {
                    if (lvl == 5) {
                        IiiiiiiiIIIII11 *= 3.84;
                    } else if (lvl == 4) {
                        IiiiiiiiIIIII11 *= 2.74;
                    } else if (lvl == 3) {
                        IiiiiiiiIIIII11 *= 1.96;
                    } else if (lvl == 2) {
                        IiiiiiiiIIIII11 *= 1.4;
                    }
                }
                if (lingbao != null) {
                    IiiiiiiiIIIII6 = PropertyUtil.getBaoMap((Lingbao)lingbao, (RoleData)this.ALLATORIxDEMO());
                    double IiiiiiiiIIIII12 = lingbao.getBaotype().equals("\u653b\u51fb") ? (Double)IiiiiiiiIIIII6.get("\u4f24\u5bb3") : (lingbao.getBaotype().equals("\u8f85\u52a9") ? (Double)IiiiiiiiIIIII6.get("\u56de\u590d") : (Double)IiiiiiiiIIIII6.get("\u843d\u5b9d"));
                    IiiiiiiiIIIII11 *= 1.0 + IiiiiiiiIIIII12;
                    IIiIiiiiIiIII.ALLATORIxDEMO((Map)IiiiiiiiIIIII6);
                }
                IiiiiiiiIIIII6 = null;
                IiiiiiiiIIIII6 = IiiiiiiiIIIII4 == 3003 || IiiiiiiiIIIII4 == 3004 ? "1-" + IIiiIiiiiIIiI.ALLATORIxDEMO((double)IiiiiiiiIIIII11, (int)0) : (IiiiiiiiIIIII4 == 3002 ? String.valueOf(IIiiIiiiiIIiI.ALLATORIxDEMO((double)(IiiiiiiiIIIII11 / 1000.0), (int)0)) + "-" + IIiiIiiiiIIiI.ALLATORIxDEMO((double)IiiiiiiiIIIII11, (int)0) : IIiiIiiiiIIiI.ALLATORIxDEMO((double)IiiiiiiiIIIII11, (int)0));
                IiiiiiiiIIIII2.append("#r#W");
                IiiiiiiiIIIII2.append(IiiiiiiiIIIII3[IiiiiiiiIIIII5].replace("{\u6570\u503c}", (CharSequence)IiiiiiiiIIIII6));
            } else {
                IiiiiiiiIIIII2.append("#r#W");
                IiiiiiiiIIIII2.append(IiiiiiiiIIIII3[IiiiiiiiIIIII5]);
            }
            ++IiiiiiiiIIIII5;
        }
        this.iiIiiiiiiiIii.setTextSize(IiiiiiiiIIIII2.toString(), 215);
        this.iiiiiiiiIIiii();
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(int Stype, Skill skill, int size) {
        this.iIiIiiiiIIiIi();
        this.IiIIIiiiiIiiI = 2;
        if (Stype == 0) {
            void IiiiiiiiIIIII;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("#cf8fc70\u79d8\u6280" + (size == 0 ? "#R(\u672a\u6fc0\u6d3b)" : (size == 1 ? "(\u53ef\u6fc0\u6d3b)" : "#G(\u5df2\u6fc0\u6d3b)")));
            IiiiiiiiIIIII.append("#r#cf8fc70");
            IiiiiiiiIIIII.append(skill.getSkillname());
            IiiiiiiiIIIII.append(":#G");
            IiiiiiiiIIIII.append(skill.getRemark());
            this.iiIiiiiiiiIii.setTextSize(IiiiiiiiIIIII.toString(), 310);
        } else {
            StringBuffer IiiiiiiiIIIII = new StringBuffer();
            IiiiiiiiIIIII.append("#cf8fc70" + skill.getSkillname() + "(" + size + "/8)");
            IiiiiiiiIIIII.append("#r#G" + skill.getRemark());
            this.iiIiiiiiiiIii.setTextSize(IiiiiiiiIIIII.toString(), 310);
        }
        this.iiiiiiiiIIiii();
    }

    public void ALLATORIxDEMO(StringBuffer buffer, int lvl, int nj) {
        buffer.append("#r\u8010\u4e45 ");
        buffer.append(nj);
        buffer.append("/1000#r\u953b\u70bc\u7b49\u7ea7 ");
        buffer.append(lvl);
        buffer.append("\u7ea7");
    }

    public void ALLATORIxDEMO(StringBuffer buffer, Talent talent, int lvl, String outcome, int weizhi) {
        String[] IiiiiiiiIIIII = talent.getValue().split("\\|");
        if (IiiiiiiiIIIII.length == 2) {
            IiiiiiiiIIIII = IiiiiiiiIIIII[1].split("=");
            buffer.append("#r");
            buffer.append(" #W\u53d1\u52a8");
            buffer.append(talent.getTalentName());
            buffer.append("\u65f6\u589e\u52a0");
            buffer.append(IiiiiiiiIIIII[0]);
            IiiiiiiiIIIII = IiiiiiiiIIIII[1].split("\\+");
            buffer.append(Double.parseDouble(IiiiiiiiIIIII[0]) + Double.parseDouble(IiiiiiiiIIIII[1]) * (double)lvl);
        }
        buffer.append("#r");
        if (lvl >= 10) {
            buffer.append("#G\u5df2\u7ecf\u8fbe\u5230\u6700\u9ad8\u7ea7\u522b\u4e86");
        } else if (lvl >= 10) {
            buffer.append("#G\u53ef\u4ee5\u901a\u8fc7\u70b9\u51fb\u6280\u80fd\u683c\u5b50\u6d88\u8017\u743c\u6d46\u7389\u6db2\u6765\u5f3a\u5316\u6b64\u6280\u80fd,\u6709\u51e0\u7387\u6210\u529f");
        }
        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)outcome)) {
            buffer.append("#r#G\u8fd8\u672a\u83b7\u53d6\u7ed3\u5c40,\u4e0d\u53ef\u5f3a\u5316\u6b64\u6280\u80fd\u683c\u5b50");
            return;
        }
        BabyResult IiiiiiiiIIIII2 = this.ALLATORIxDEMO().ALLATORIxDEMO(outcome);
        int IiiiiiiiIIIII3 = 0;
        if (weizhi == 0) {
            IiiiiiiiIIIII3 = IiiiiiiiIIIII2.getQ1();
        } else if (weizhi == 1) {
            IiiiiiiiIIIII3 = IiiiiiiiIIIII2.getQ2();
        } else if (weizhi == 2) {
            IiiiiiiiIIIII3 = IiiiiiiiIIIII2.getQ3();
        }
        switch (IiiiiiiiIIIII3) {
            case 0: {
                buffer.append("#r#G\u6b64\u6280\u80fd\u683c\u53ef\u5f3a\u5316\u5929\u8d44:\u4e0d\u53ef\u5f3a\u5316");
                return;
            }
            case 1: {
                buffer.append("#r#G\u6b64\u6280\u80fd\u683c\u53ef\u5f3a\u5316\u5929\u8d44:\u53ef\u5f3a\u5316\u4f4e\u7ea7\u4eba\u65cf\u5929\u8d44");
                return;
            }
            case 2: {
                buffer.append("#r#G\u6b64\u6280\u80fd\u683c\u53ef\u5f3a\u5316\u5929\u8d44:\u53ef\u5f3a\u5316\u4f4e\u7ea7\u9b54\u65cf\u5929\u8d44");
                return;
            }
            case 3: {
                buffer.append("#r#G\u6b64\u6280\u80fd\u683c\u53ef\u5f3a\u5316\u5929\u8d44:\u53ef\u5f3a\u5316\u4f4e\u7ea7\u4ed9\u65cf\u5929\u8d44");
                return;
            }
            case 4: {
                buffer.append("#r#G\u6b64\u6280\u80fd\u683c\u53ef\u5f3a\u5316\u5929\u8d44:\u53ef\u5f3a\u5316\u4f4e\u7ea7\u9b3c\u65cf\u5929\u8d44");
                return;
            }
            case 5: {
                buffer.append("#r#G\u6b64\u6280\u80fd\u683c\u53ef\u5f3a\u5316\u5929\u8d44:\u53ef\u5f3a\u5316\u5168\u90e8\u4f4e\u7ea7\u5929\u8d44");
                return;
            }
            case 6: {
                buffer.append("#r#G\u6b64\u6280\u80fd\u683c\u53ef\u5f3a\u5316\u5929\u8d44:\u53ef\u5f3a\u5316\u9ad8\u7ea7\u4eba\u65cf\u5929\u8d44");
                return;
            }
            case 7: {
                buffer.append("#r#G\u6b64\u6280\u80fd\u683c\u53ef\u5f3a\u5316\u5929\u8d44:\u53ef\u5f3a\u5316\u9ad8\u7ea7\u9b54\u65cf\u5929\u8d44");
                return;
            }
            case 8: {
                buffer.append("#r#G\u6b64\u6280\u80fd\u683c\u53ef\u5f3a\u5316\u5929\u8d44:\u53ef\u5f3a\u5316\u9ad8\u7ea7\u4ed9\u65cf\u5929\u8d44");
                return;
            }
            case 9: {
                buffer.append("#r#G\u6b64\u6280\u80fd\u683c\u53ef\u5f3a\u5316\u5929\u8d44:\u53ef\u5f3a\u5316\u9ad8\u7ea7\u9b3c\u65cf\u5929\u8d44");
                return;
            }
            case 10: {
                buffer.append("#r#G\u6b64\u6280\u80fd\u683c\u53ef\u5f3a\u5316\u5929\u8d44:\u53ef\u5f3a\u5316\u5168\u90e8\u9ad8\u7ea7\u5929\u8d44");
                return;
            }
            case 11: {
                buffer.append("#r#G\u6b64\u6280\u80fd\u683c\u53ef\u5f3a\u5316\u5929\u8d44:\u53ef\u5f3a\u5316\u5168\u90e8\u5929\u8d44");
                break;
            }
        }
    }

    public int iIiIiiiiIIiii(int sum) {
        if (sum > 3) return (sum << 1) - 3;
        return sum;
    }

    public void iIiIiiiiIIiIi() {
        this.IiIIIiiiiIiiI = 0;
        this.IIiiIiiiIIiIi.clear();
        this.iiIiiiiiiiIii.clear();
        this.ALLATORIxDEMO.clear();
        this.iiIiiiiiiiIii.setFont(iiIIiiiiIiiII.iIiIIiiiiIIiI);
        this.iIiIiiiiIiIii.iIiIiiiiIIiii();
        this.iIiiIiiiiiiII = false;
        this.IiiiiiiiIIIII = false;
        this.iIiIiiiiIiIii.setVisible(false);
    }

    public void iIiIiiiiIIiIi(StringBuffer buffer, String color, String value, long type) {
        if (value == null) return;
        if (value.equals("")) {
            return;
        }
        BaseGemOld IiiiiiiiIIIII = new BaseGemOld(value);
        GemOld IiiiiiiiIIIII2 = IiiiiiiiIIIII.getGemOld(this.ALLATORIxDEMO());
        if (IiiiiiiiIIIII2 == null) {
            return;
        }
        color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#Y");
        buffer.append("\u7b49\u7ea7 " + IiiiiiiiIIIII.getLvl());
        if (buffer.length() != 0) {
            buffer.append("#r");
        }
        buffer.append(IiiiiiiiIIIII2.getKey());
        buffer.append(" ");
        buffer.append(IIiiIiiiiIIiI.ALLATORIxDEMO((double)((double)(IiiiiiiiIIIII.getLvl() * IiiiiiiiIIIII.getValue()) / 100.0 * IiiiiiiiIIIII2.getValue()), (int)1));
        buffer.append(iiIiiiiiIIiiI.iIiIiiiiIIiii(IiiiiiiiIIIII2.getKey()));
        if (buffer.length() != 0) {
            buffer.append("#r");
        }
        buffer.append("\u4ef7\u503c " + IiiiiiiiIIIII.getValue());
        if (buffer.length() != 0) {
            buffer.append("#r");
        }
        buffer.append("\u9576\u5d4c\u90e8\u4f4d:");
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < IiiiiiiiIIIII2.getParts().length) {
            if (IiiiiiiiIIIII3 != 0) {
                buffer.append("\u3001");
            }
            buffer.append(GoodType.ALLATORIxDEMO((int)IiiiiiiiIIIII2.getParts()[IiiiiiiiIIIII3++]));
        }
    }

    public void iiiIiiiiiiIIi() {
        this.IIiiIiiiIIiIi.setBounds(15, 5, this.IIiiIiiiIIiIi.getWidth(), this.IIiiIiiiIIiIi.getHeight());
        this.iiIiiiiiiiIii.setBounds(15, 36, this.iiIiiiiiiiIii.getWidth(), this.iiIiiiiiiiIii.getHeight());
        int IiiiiiiiIIIII = 30 + this.iiIiiiiiiiIii.getWidth();
        int IiiiiiiiIIIII2 = 26 + this.iiIiiiiiiiIii.getHeight() + this.IIiiIiiiIIiIi.getHeight();
        Point point = this.ALLATORIxDEMO().iIiIiiiiIIiii(IiiiiiiiIIIII, IiiiiiiiIIIII2);
        this.iIiIiiiiIIiii(point.x, point.y, IiiiiiiiIIIII, IiiiiiiiIIIII2);
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    public void ALLATORIxDEMO(StringBuffer buffer, String value) {
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        if (buffer.length() != 0) {
            buffer.append("#r");
        }
        String IiiiiiiiIIIII2 = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, null, "#c00ffff");
        buffer.append("\u3010\u5b9d\u77f3\u9576\u5d4c\u3011");
        String[] IiiiiiiiIIIII3 = value.split("&");
        int IiiiiiiiIIIII4 = 1;
        while (IiiiiiiiIIIII4 < IiiiiiiiIIIII3.length) {
            Goodstable IiiiiiiiIIIII5 = IiiiiiiiIIIII.getGoodEquip(new BigDecimal(IiiiiiiiIIIII3[IiiiiiiiIIIII4]));
            if (IiiiiiiiIIIII5 != null) {
                if (buffer.length() != 0) {
                    buffer.append("#r");
                }
                IiiiiiiiIIIII2 = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, null, "#cEA5700");
                buffer.append(IiiiiiiiIIIII5.getGoodsname());
                String[] IiiiiiiiIIIII6 = IiiiiiiiIIIII5.getValue().split("\\|");
                buffer.append(" ");
                buffer.append(IiiiiiiiIIIII6[0].split("=")[1]);
                buffer.append("\u7ea7 ");
                IiiiiiiiIIIII6 = IiiiiiiiIIIII6[1].split("=");
                buffer.append(IiiiiiiiIIIII6[0]);
                buffer.append(" ");
                buffer.append(String.valueOf(iiIiiiiiIIiiI.iiiIiiiiiiIIi(IiiiiiiiIIIII6[1])) + iiIiiiiiIIiiI.iIiIiiiiIIiii(IiiiiiiiIIIII6[1]));
            }
            ++IiiiiiiiIIIII4;
        }
    }

    public void ALLATORIxDEMO(Eshop shop) {
        this.iIiIiiiiIIiIi();
        this.IiIIIiiiiIiiI = 1;
        this.iIiIiiiiIiIii.ALLATORIxDEMO(IIiIiiiiIiiIi.iiiiiiiiIIiii((String)shop.getEshopskin()));
        this.IIiiIiiiIIiIi.setTextSize("#cFFFF75" + shop.getEshopname(), 215);
        String IiiiiiiiIIIII = "#W";
        StringBuffer IiiiiiiiIIIII2 = new StringBuffer();
        Goodstable IiiiiiiiIIIII3 = this.ALLATORIxDEMO().ALLATORIxDEMO(new BigDecimal(shop.getEshopiid()));
        if (shop.getEshoptext() != null && !shop.getEshoptext().equals("")) {
            IiiiiiiiIIIII2.append(shop.getEshoptext());
        } else if (IiiiiiiiIIIII3 != null && IiiiiiiiIIIII3.getInstruction() != null && !IiiiiiiiIIIII3.getInstruction().equals("")) {
            IiiiiiiiIIIII2.append(IiiiiiiiIIIII3.getInstruction());
        }
        if (IiiiiiiiIIIII3 != null && IiiiiiiiIIIII3.getType() == 112L) {
            this.iIiIiiiiIIiii(IiiiiiiiIIIII2, IiiiiiiiIIIII, IiiiiiiiIIIII3.getValue(), IiiiiiiiIIIII3.getType());
        }
        this.iiIiiiiiiiIii.setTextSize(IiiiiiiiIIIII2.toString(), 215);
        this.iiiIiiiiiiIIi(false);
    }

    public void ALLATORIxDEMO(PayvipBean payvipBean) {
        this.iIiIiiiiIIiIi();
        this.IiIIIiiiiIiiI = 1;
        this.iIiIiiiiIiIii.ALLATORIxDEMO(IIiIiiiiIiiIi.iiiiiiiiIIiii((String)("S" + payvipBean.getGrade())));
        this.IIiiIiiiIIiIi.setTextSize("#cFFFF75V" + payvipBean.getGrade() + "\u4f1a\u5458\u5956\u52b1", 215);
        this.iiIiiiiiiiIii.setTextSize(payvipBean.getInstructiontext() != null ? payvipBean.getInstructiontext() : "", 215);
        this.iiiIiiiiiiIIi(false);
    }

    public static String ALLATORIxDEMO(StringBuffer buffer, String color1, String color2) {
        if (IIiiIiiiiIIiI.ALLATORIxDEMO((String)color1, (String)color2)) {
            return color1;
        }
        buffer.append(color2);
        return color2;
    }

    /*
     * Unable to fully structure code
     */
    public void ALLATORIxDEMO(Goodstable var1_1, boolean var2_2) {
        block30: {
            block29: {
                this.iIiIiiiiIIiIi();
                this.IiIIIiiiiIiiI = 1;
                this.iIiIiiiiIiIii.ALLATORIxDEMO(IIiIiiiiIiiIi.iiiiiiiiIIiii((String)good.getSkin()));
                this.iIiiIiiiiiiII = GoodType.IiiIiiiiIiiiI((long)good.getQuality());
                this.IiiiiiiiIIIII = good.getGoodlock() == 1;
                this.ALLATORIxDEMO.setText(good.getAuthor() != null ? "#R\u5236\u4f5c\u4eba:" + good.getAuthor() : "");
                if (good.getQht() == null || good.getQht() <= 0) break block29;
                IiiiiiiiIIIII = new StringBuffer();
                IiiiiiiiIIIII.append("#cFFFF75");
                IiiiiiiiIIIII.append(good.getGoodsname());
                IiiiiiiiIIIII.append("#r");
                IiiiiiiiIIIII = 1;
                if (true) ** GOTO lbl28
            }
            this.IIiiIiiiIIiIi.setTextSize("#cFFFF75" + good.getGoodsname(), 215);
            break block30;
            do {
                if (good.getQhv() == null || IiiiiiiiIIIII > good.getQhv()) {
                    IiiiiiiiIIIII.append("#880");
                } else {
                    IiiiiiiiIIIII.append("#881");
                }
                ++IiiiiiiiIIIII;
lbl28:
                // 2 sources

            } while (IiiiiiiiIIIII < good.getQht());
            this.IIiiIiiiIIiIi.setTextSize(IiiiiiiiIIIII.toString(), 215);
        }
        IiiiiiiiIIIII = "#W";
        IiiiiiiiIIIII = new StringBuffer();
        IiiiiiiiIIIII = this.ALLATORIxDEMO().ALLATORIxDEMO(good.getGoodsid());
        if (IiiiiiiiIIIII == null && !IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)good.getInstruction())) {
            IiiiiiiiIIIII.append(good.getInstruction());
        } else if (IiiiiiiiIIIII != null && !IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII.getInstruction())) {
            IiiiiiiiIIIII.append(IiiiiiiiIIIII.getInstruction());
        }
        if (!GoodType.iIiIIiiiiIIiI((long)good.getType())) {
            if (good.getType() == 520L) {
                this.iIiIiiiiIIiIi(IiiiiiiiIIIII, (String)IiiiiiiiIIIII, (Goodstable)good);
            } else if (good.getType() == 8888L) {
                this.iIiIiiiiIIiii(IiiiiiiiIIIII, (String)IiiiiiiiIIIII, (Goodstable)good);
            } else if (GoodType.IIiIIiiiiiIiI((long)good.getType())) {
                this.iiiIiiiiiiIIi(IiiiiiiiIIIII, (String)IiiiiiiiIIIII, (Goodstable)good);
            } else if (GoodType.IiiIiiiiiIiII((long)good.getType())) {
                this.ALLATORIxDEMO(IiiiiiiiIIIII, (String)IiiiiiiiIIIII, (Goodstable)good);
            } else if (good.getType() == 779L || GoodType.ALLATORIxDEMO((long)good.getType()) != -1) {
                this.ALLATORIxDEMO(IiiiiiiiIIIII, (String)IiiiiiiiIIIII, good.getValue(), good.getType(), good.getQhv());
            } else if (good.getType() == 188L) {
                this.IiiIiiiiiiIiI(IiiiiiiiIIIII, (String)IiiiiiiiIIIII, good.getValue(), good.getType());
            } else if (good.getType() == 133L || good.getType() == 134L) {
                this.iiiiiiiiIIiii(IiiiiiiiIIIII, (String)IiiiiiiiIIIII, good.getValue(), good.getType());
            } else if (good.getType() == 114L) {
                this.iiiIiiiiiiIIi(IiiiiiiiIIIII, (String)IiiiiiiiIIIII, good.getValue(), good.getType());
            } else if (good.getType() == 700L) {
                this.iIiIiiiiIIiIi(IiiiiiiiIIIII, (String)IiiiiiiiIIIII, good.getValue(), good.getType());
            } else if (good.getType() == 139L) {
                this.ALLATORIxDEMO(IiiiiiiiIIIII, (String)IiiiiiiiIIIII, good.getValue(), good.getType());
            } else if (good.getType() == 108L) {
                this.IIIIIiiiiIIii(IiiiiiiiIIIII, (String)IiiiiiiiIIIII, good.getValue(), good.getType());
            } else {
                this.iIiIiiiiIIiii(IiiiiiiiIIIII, (String)IiiiiiiiIIIII, good.getValue(), good.getType());
            }
        }
        this.iiIiiiiiiiIii.setTextSize(IiiiiiiiIIIII.toString(), 215);
        this.iiiIiiiiiiIIi((boolean)center);
    }

    public void ALLATORIxDEMO(StringBuffer buffer, String color, Goodstable good) {
        String[] IiiiiiiiIIIII;
        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)good.getValue())) {
            return;
        }
        String[] IiiiiiiiIIIII2 = good.getValue().split("\\|");
        int IiiiiiiiIIIII3 = 0;
        if (buffer.length() != 0) {
            buffer.append("#r");
        }
        color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#cFFFFFF");
        buffer.append("\u3010\u7b49\u7ea7\u3011 ");
        String string = IiiiiiiiIIIII2[IiiiiiiiIIIII3];
        ++IiiiiiiiIIIII3;
        buffer.append(string.substring(3));
        if (buffer.length() != 0) {
            buffer.append("#r");
        }
        color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#cFFFFFF");
        buffer.append("\u3010\u7b49\u7ea7\u8981\u6c42\u3011 ");
        String string2 = IiiiiiiiIIIII2[IiiiiiiiIIIII3];
        buffer.append(string2.substring(5));
        if (IiiiiiiiIIIII2[++IiiiiiiiIIIII3].startsWith("\u6027\u522b")) {
            if (buffer.length() != 0) {
                buffer.append("#r");
            }
            color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#c1E90FF");
            buffer.append("\u3010\u6027\u522b\u8981\u6c42\u3011 ");
            IiiiiiiiIIIII = IiiiiiiiIIIII2[IiiiiiiiIIIII3].substring(5);
            buffer.append(IiiiiiiiIIIII.equals("1") ? "\u7537" : (IiiiiiiiIIIII.equals("0") ? "\u5973" : "\u5168\u90e8\u6027\u522b"));
            ++IiiiiiiiIIIII3;
        }
        if (buffer.length() != 0) {
            buffer.append("#r");
        }
        color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#c1E90FF");
        buffer.append("\u3010\u54c1\u8d28\u3011 ");
        buffer.append(IiiiiiiiIIIII2[IiiiiiiiIIIII3].substring(3));
        ++IiiiiiiiIIIII3;
        while (IiiiiiiiIIIII3 < IiiiiiiiIIIII2.length) {
            if (IiiiiiiiIIIII2[IiiiiiiiIIIII3].startsWith("\u5951\u5408\u5ea6")) break;
            if (buffer.length() != 0) {
                buffer.append("#r");
            }
            IiiiiiiiIIIII = IiiiiiiiIIIII2[IiiiiiiiIIIII3].split("=");
            color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#cDEDE9E");
            buffer.append(IiiiiiiiIIIII[0]);
            buffer.append(iiIiiiiiIIiiI.iiiIiiiiiiIIi(IiiiiiiiIIIII[1]));
            ++IiiiiiiiIIIII3;
            buffer.append(iiIiiiiiIIiiI.iIiIiiiiIIiii(IiiiiiiiIIIII[0]));
        }
        if (buffer.length() != 0) {
            buffer.append("#r");
        }
        color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#cDEDE9E");
        buffer.append("\u5951\u5408\u5ea6 ");
        buffer.append(IiiiiiiiIIIII2[IiiiiiiiIIIII3].substring(4));
        int IiiiiiiiIIIII4 = IiiiiiiiIIIII3 + 1;
        while (IiiiiiiiIIIII4 < IiiiiiiiIIIII2.length) {
            String string3 = IiiiiiiiIIIII2[IiiiiiiiIIIII4];
            ++IiiiiiiiIIIII4;
            this.ALLATORIxDEMO(buffer, string3, good.getType());
        }
    }

    public void iiiIiiiiiiIIi(StringBuffer buffer, String color, String value, long type) {
        if (value == null) return;
        if (value.equals("")) {
            return;
        }
        int IiiiiiiiIIIII = value.indexOf("|");
        if (IiiiiiiiIIIII == -1) {
            return;
        }
        int IiiiiiiiIIIII2 = Integer.parseInt(value.substring(3, IiiiiiiiIIIII));
        String IiiiiiiiIIIII3 = value.substring(IiiiiiiiIIIII + 4);
        Skill IiiiiiiiIIIII4 = this.ALLATORIxDEMO().iIiIiiiiIIiii(IiiiiiiiIIIII3);
        if (IiiiiiiiIIIII4 == null) {
            return;
        }
        color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#G");
        buffer.append(IiiiiiiiIIIII2 == 2 ? "\u5f53\u524d\u7075\u9636\u4e3a4~9\u7ea7\u65f6\u53ef\u7528" : "\u5f53\u524d\u7075\u9636\u4e3a0~4\u7ea7\u65f6\u53ef\u7528");
        color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#R");
        buffer.append("\u6280\u80fd:" + IiiiiiiiIIIII4.getSkillname());
    }

    public int ALLATORIxDEMO(int sum) {
        return (sum << 1) - 1;
    }

    public void iIiIiiiiIIiii(StringBuffer buffer, String color, String value, long type) {
        if (value == null) return;
        if (value.equals("")) {
            return;
        }
        String[] IiiiiiiiIIIII = value.split("\\|");
        String IiiiiiiiIIIII2 = null;
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < IiiiiiiiIIIII.length) {
            if (IiiiiiiiIIIII[IiiiiiiiIIIII3].startsWith(GoodType.Extras[0])) {
                IiiiiiiiIIIII2 = this.ALLATORIxDEMO(buffer, IiiiiiiiIIIII[IiiiiiiiIIIII3], type);
            } else if (IiiiiiiiIIIII[IiiiiiiiIIIII3].startsWith(GoodType.Extras[1])) {
                this.IiiIiiiiiiIiI(buffer, IiiiiiiiIIIII[IiiiiiiiIIIII3]);
            } else if (IiiiiiiiIIIII[IiiiiiiiIIIII3].startsWith(GoodType.Extras[2])) {
                this.ALLATORIxDEMO(buffer, IiiiiiiiIIIII[IiiiiiiiIIIII3], type);
            } else if (IiiiiiiiIIIII[IiiiiiiiIIIII3].startsWith(GoodType.Extras[3])) {
                this.iiiIiiiiiiIIi(buffer, IiiiiiiiIIIII[IiiiiiiiIIIII3]);
            } else if (IiiiiiiiIIIII[IiiiiiiiIIIII3].startsWith(GoodType.Extras[4])) {
                this.ALLATORIxDEMO(buffer, IiiiiiiiIIIII[IiiiiiiiIIIII3]);
            } else if (IiiiiiiiIIIII[IiiiiiiiIIIII3].startsWith(GoodType.Extras[5])) {
                this.iiiiiiiiIIiii(buffer, IiiiiiiiIIIII[IiiiiiiiIIIII3]);
            } else if (IiiiiiiiIIIII[IiiiiiiiIIIII3].startsWith(GoodType.Extras[6])) {
                this.ALLATORIxDEMO(buffer, IiiiiiiiIIIII[IiiiiiiiIIIII3], IiiiiiiiIIIII2);
            } else {
                String[] IiiiiiiiIIIII4 = IiiiiiiiIIIII[IiiiiiiiIIIII3].split("=");
                if (buffer.length() != 0) {
                    buffer.append("#r");
                }
                if (IiiiiiiiIIIII4[0].equals("\u88c5\u5907\u89d2\u8272") || IiiiiiiiIIIII4[0].equals("\u7b49\u7ea7") || IiiiiiiiIIIII4[0].equals("\u88c5\u5907\u7b49\u7ea7") || IiiiiiiiIIIII4[0].equals("\u9636\u6570") || IiiiiiiiIIIII4[0].equals("\u7b49\u7ea7\u8981\u6c42") || IiiiiiiiIIIII4[0].equals("\u529b\u91cf\u8981\u6c42") || IiiiiiiiIIIII4[0].equals("\u7075\u6027\u8981\u6c42") || IiiiiiiiIIIII4[0].equals("\u6839\u9aa8\u8981\u6c42") || IiiiiiiiIIIII4[0].equals("\u654f\u6377\u8981\u6c42") || IiiiiiiiIIIII4[0].equals("\u5957\u88c5\u54c1\u8d28") || IiiiiiiiIIIII4[0].equals("\u58f0\u671b\u8981\u6c42")) {
                    color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#cFFFFFF");
                    buffer.append("\u3010");
                    buffer.append(IiiiiiiiIIIII4[0]);
                    buffer.append("\u3011");
                    buffer.append(IiiiiiiiIIIII4[1]);
                } else if (IiiiiiiiIIIII4[0].equals("\u88c5\u5907\u90e8\u4f4d")) {
                    String IiiiiiiiIIIII5 = MsgUntil.ALLATORIxDEMO((String)IiiiiiiiIIIII4[1], (boolean)true);
                    if (IiiiiiiiIIIII5 != null) {
                        IiiiiiiiIIIII4[1] = IiiiiiiiIIIII5;
                    }
                    color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#cFFFFFF");
                    buffer.append("\u3010\u88c5\u5907\u90e8\u4f4d\u3011");
                    buffer.append(IiiiiiiiIIIII4[1]);
                } else if (IiiiiiiiIIIII4[0].equals("\u6027\u522b\u8981\u6c42") || IiiiiiiiIIIII4[0].equals("\u6027\u522b")) {
                    color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#cFFFFFF");
                    buffer.append("\u3010\u6027\u522b\u8981\u6c42\u3011");
                    buffer.append(IiiiiiiiIIIII4[1].equals("1") ? "\u7537" : (IiiiiiiiIIIII4[1].equals("0") ? "\u5973" : "\u5168\u90e8\u6027\u522b"));
                } else if (IiiiiiiiIIIII4[0].equals("HP") || IiiiiiiiIIIII4[0].equals("MP") || IiiiiiiiIIIII4[0].equals("HP%") || IiiiiiiiIIIII4[0].equals("MP%") || IiiiiiiiIIIII4[0].equals("\u7ecf\u9a8c") || IiiiiiiiIIIII4[0].equals("\u4eb2\u5bc6") || IiiiiiiiIIIII4[0].equals("\u94b1") || IiiiiiiiIIIII4[0].equals("\u70b9")) {
                    color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#cFFFFFF");
                    buffer.append(IiiiiiiiIIIII4[0]);
                    buffer.append(" ");
                    buffer.append(iiIiiiiiIIiiI.iiiIiiiiiiIIi(IiiiiiiiIIIII4[1]));
                } else if (IiiiiiiiIIIII4[0].equals("\u529b\u91cf") || IiiiiiiiIIIII4[0].equals("\u7075\u6027") || IiiiiiiiIIIII4[0].equals("\u6839\u9aa8") || IiiiiiiiIIIII4[0].equals("\u654f\u6377")) {
                    color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#cCCCC99");
                    buffer.append(IiiiiiiiIIIII4[0]);
                    buffer.append(" ");
                    buffer.append(iiIiiiiiIIiiI.iiiIiiiiiiIIi(IiiiiiiiIIIII4[1]));
                } else if (IiiiiiiiIIIII4[0].equals("\u57f9\u517b")) {
                    color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#c00ffff");
                    buffer.append(IiiiiiiiIIIII4[0]);
                    buffer.append(" ");
                    buffer.append(iiIiiiiiIIiiI.iiiIiiiiiiIIi(IiiiiiiiIIIII4[1]));
                } else if (IiiiiiiiIIIII4[0].equals("\u54c1\u8d28")) {
                    color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#c1E90FF");
                    buffer.append(IiiiiiiiIIIII4[0]);
                    buffer.append(" ");
                    buffer.append(iiIiiiiiIIiiI.iiiIiiiiiiIIi(IiiiiiiiIIIII4[1]));
                } else if (IiiiiiiiIIIII4[0].equals("\u5750\u6807") || IiiiiiiiIIIII4[0].equals("\u5185\u4e39\u7b49\u7ea7")) {
                    color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#cFFFF33");
                    buffer.append(IiiiiiiiIIIII4[0]);
                    buffer.append(":");
                    buffer.append(iiIiiiiiIIiiI.iiiIiiiiiiIIi(IiiiiiiiIIIII4[1]));
                } else if (IiiiiiiiIIIII4[0].equals("\u6b21\u6570")) {
                    color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#cFFFF33");
                    buffer.append(IiiiiiiiIIIII4[1]);
                } else if (IiiiiiiiIIIII4[0].equals("\u70bc\u5996\u6b21\u6570")) {
                    color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#c00BFFF");
                    buffer.append(IiiiiiiiIIIII4[0]);
                    buffer.append(" ");
                    buffer.append(iiIiiiiiIIiiI.iiiIiiiiiiIIi(IiiiiiiiIIIII4[1]));
                } else if (IiiiiiiiIIIII4[0].equals("\u63cf\u8ff0") || IiiiiiiiIIIII4[0].equals("\u540d\u79f0")) {
                    color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#c00BFFF");
                    buffer.append(IiiiiiiiIIIII4[1]);
                } else if (IiiiiiiiIIIII4[0].equals("\u4f20\u9001") || IiiiiiiiIIIII4[0].equals("\u5b9d\u56fe")) {
                    String[] IiiiiiiiIIIII5 = IiiiiiiiIIIII4[1].split(",");
                    int IiiiiiiiIIIII6 = Integer.parseInt(IiiiiiiiIIIII5[2]) / 20;
                    int IiiiiiiiIIIII7 = Integer.parseInt(IiiiiiiiIIIII5[3]) / 20;
                    color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#cFFFF33");
                    buffer.append("\u5750\u6807: ");
                    buffer.append(IiiiiiiiIIIII5[1]);
                    buffer.append("(");
                    buffer.append(IiiiiiiiIIIII6);
                    buffer.append(",");
                    buffer.append(IiiiiiiiIIIII7);
                    buffer.append(")");
                } else if (IiiiiiiiIIIII4[0].equals("\u53ef\u7528\u6b21\u6570")) {
                    color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#cFFFF33");
                    buffer.append("\u8fd8\u53ef\u4ee5\u4f7f\u7528");
                    buffer.append(IiiiiiiiIIIII4[1]);
                    buffer.append("\u6b21");
                } else if (IiiiiiiiIIIII4[0].equals("\u6280\u80fd")) {
                    if (type != 112L) {
                        color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#cFFFF33");
                        buffer.append("\u6280\u80fd:#G");
                        buffer.append(IiiiiiiiIIIII4[1]);
                    }
                } else if (IiiiiiiiIIIII4[0].equals("\u6280\u80fd\u7b49\u7ea7")) {
                    color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#cFFFF33");
                    buffer.append("\u6280\u80fd\u7b49\u7ea7:#G");
                    buffer.append(IiiiiiiiIIIII4[1]);
                } else if (IiiiiiiiIIIII4[0].equals("\u8010\u4e45")) {
                    if (this.ALLATORIxDEMO().gameType == 2) {
                        int IiiiiiiiIIIII8 = IiiiiiiiIIIII4[1].indexOf(",");
                        IiiiiiiiIIIII4[1] = IiiiiiiiIIIII4[1].substring(0, IiiiiiiiIIIII8 != -1 ? IiiiiiiiIIIII8 : IiiiiiiiIIIII4[1].length());
                        color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "cFEFF72");
                        buffer.append("\u8010\u4e45 ");
                        buffer.append(IiiiiiiiIIIII4[1]);
                    } else {
                        color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#cFFFF33");
                        buffer.append("\u8010\u4e45:#G");
                        buffer.append(IiiiiiiiIIIII4[1].split(",")[0]);
                    }
                } else if (IiiiiiiiIIIII4[0].equals("\u573a\u6570")) {
                    buffer.append("");
                } else if (!(IiiiiiiiIIIII4.length <= 1 || IiiiiiiiIIIII4[0].equals("\u53ec\u5524\u517d") || IiiiiiiiIIIII4[0].equals("\u7269\u54c1") || IiiiiiiiIIIII4[0].equals("\u6807\u7b7e") || IiiiiiiiIIIII4[0].equals("\u503c") || IiiiiiiiIIIII4[0].equals("\u76ae\u80a4") || IiiiiiiiIIIII4[0].equals("\u65b9\u5411") || IiiiiiiiIIIII4[0].equals("\u53d8\u8eab\u5361\u7c7b") || IiiiiiiiIIIII4[0].equals("lvl") || IiiiiiiiIIIII4[0].equals("\u522e\u5956") || IiiiiiiiIIIII4[0].equals("\u5361\u7c7b") || IiiiiiiiIIIII4[0].equals("\u6301\u7eed\u65f6\u95f4") || IiiiiiiiIIIII4[0].equals("\u8bfb\u6761"))) {
                    color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#cDEDE9E");
                    buffer.append(IiiiiiiiIIIII4[0]);
                    buffer.append(" ");
                    buffer.append(iiIiiiiiIIiiI.iiiIiiiiiiIIi(IiiiiiiiIIIII4[1]));
                    buffer.append(iiIiiiiiIIiiI.iIiIiiiiIIiii(IiiiiiiiIIIII4[0]));
                }
            }
            ++IiiiiiiiIIIII3;
        }
    }

    /*
     * Unable to fully structure code
     */
    public void ALLATORIxDEMO(StringBuffer buffer, String color, String value, long type) {
        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)value)) {
            return;
        }
        IiiiiiiiIIIII = false;
        IiiiiiiiIIIII = 0;
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < value.length()) {
            block14: {
                block12: {
                    block13: {
                        IiiiiiiiIIIII = value.indexOf("|", IiiiiiiiIIIII + 1);
                        if (IiiiiiiiIIIII == -1) {
                            IiiiiiiiIIIII = value.length();
                        }
                        if (!(IiiiiiiiIIIII = value.substring(IiiiiiiiIIIII, IiiiiiiiIIIII)).startsWith(GoodType.Extras[1])) break block12;
                        IiiiiiiiIIIII = IiiiiiiiIIIII.split("&");
                        if (((String[])IiiiiiiiIIIII).length > 2) break block13;
                        color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#G");
                        buffer.append("#r");
                        buffer.append("\u70b9\u91d1\u6210\u529f");
                        break block14;
                    }
                    IiiiiiiiIIIII = 2;
                    if (true) ** GOTO lbl91
                }
                IiiiiiiiIIIII = IiiiiiiiIIIII.indexOf("=");
                if (IiiiiiiiIIIII != -1) {
                    IiiiiiiiIIIII = IiiiiiiiIIIII.substring(0, IiiiiiiiIIIII);
                    if (IiiiiiiiIIIII.equals("\u7b49\u7ea7") || IiiiiiiiIIIII.equals("\u88c5\u5907\u7c7b\u578b") || IiiiiiiiIIIII.equals("\u6027\u522b\u8981\u6c42")) {
                        color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#W");
                        buffer.append("#r");
                        buffer.append((String)IiiiiiiiIIIII);
                        buffer.append(": ");
                        buffer.append(IiiiiiiiIIIII.substring(IiiiiiiiIIIII + 1));
                        if (IiiiiiiiIIIII.equals("\u7b49\u7ea7")) {
                            buffer.append("\u7ea7");
                        }
                    } else {
                        color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#Y");
                        buffer.append(IiiiiiiiIIIII != false ? " " : "#r");
                        buffer.append((String)IiiiiiiiIIIII);
                        if (IiiiiiiiIIIII.charAt(IiiiiiiiIIIII + 1) != '-') {
                            buffer.append("+");
                        }
                        buffer.append(IiiiiiiiIIIII.substring(IiiiiiiiIIIII + 1));
                        IiiiiiiiIIIII = true;
                    }
                }
                break block14;
                do {
                    block15: {
                        block16: {
                            if ((IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].indexOf("=")) == -1) break block15;
                            IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].substring(0, IiiiiiiiIIIII);
                            if (!IiiiiiiiIIIII.equals("\u7279\u6280")) break block16;
                            color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#c868090");
                            buffer.append("#r\u7279\u6280");
                            IiiiiiiiIIIII = this.ALLATORIxDEMO();
                            IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("=");
                            IiiiiiiiIIIII = 1;
                            if (true) ** GOTO lbl88
                        }
                        color = iiIiiiiiIIiiI.ALLATORIxDEMO(buffer, color, "#G");
                        buffer.append("#r");
                        buffer.append(IiiiiiiiIIIII);
                        buffer.append(" ");
                        if (IiiiiiiiIIIII[IiiiiiiiIIIII].charAt(IiiiiiiiIIIII + 1) != '-') {
                            buffer.append("+");
                        }
                        buffer.append(IiiiiiiiIIIII[IiiiiiiiIIIII].substring(IiiiiiiiIIIII + 1));
                        break block15;
                        do {
                            if ((IiiiiiiiIIIII = IiiiiiiiIIIII.iIiIiiiiIIiii(IiiiiiiiIIIII[IiiiiiiiIIIII])) != null) {
                                buffer.append("#r");
                                buffer.append(IiiiiiiiIIIII.getSkillname());
                                buffer.append(":");
                                buffer.append(IiiiiiiiIIIII.getRemark());
                            }
                            ++IiiiiiiiIIIII;
lbl88:
                            // 2 sources

                        } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
                    }
                    ++IiiiiiiiIIIII;
lbl91:
                    // 2 sources

                } while (IiiiiiiiIIIII < ((String[])IiiiiiiiIIIII).length);
            }
            IiiiiiiiIIIII = IiiiiiiiIIIII + 1;
        }
    }
}
