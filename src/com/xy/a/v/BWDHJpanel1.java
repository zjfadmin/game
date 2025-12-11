/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iiiIiiiiIiiiI
 *  com.xy.a.v.IiiIiiiiIIIii
 *  com.xy.a.v.iIiIiiiiIiIII
 *  com.xy.a.v.BWDHJpanel2
 *  com.xy.a.v.BWDHJpanel6
 *  com.xy.i.IIIIIiiiIiIii
 *  com.xy.i.IIiIiiiiIiiIi
 *  com.xy.i.iiIiIiiiIIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Activity
 *  com.xy.readbean.ActivityFC
 *  com.xy.readbean.BWDHRule
 *  com.xy.text.GameView
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.v.iiiiiiiiIIIII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.v;

import com.xy.a.iiiIiiiiIiiiI;
import com.xy.a.v.IiiIiiiiIIIii;
import com.xy.a.v.iIiIiiiiIiIII;
import com.xy.a.v.BWDHJpanel2;
import com.xy.a.v.BWDHJpanel6;
import com.xy.i.IIIIIiiiIiIii;
import com.xy.i.IIiIiiiiIiiIi;
import com.xy.i.iiIiIiiiIIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Activity;
import com.xy.readbean.ActivityFC;
import com.xy.readbean.BWDHRule;
import com.xy.text.GameView;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.v.iiiiiiiiIIIII;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Component;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class BWDHJpanel1
extends IiiiIiiiiIiIi {
    private iiIiIiiiIIIiI IIiiIiiiIIiIi;
    private IiiiIiiiiIiIi[] iIiIiiiiIiIii;
    private int IiIIIiiiiIiiI;
    private Activity iiIiiiiiiiIii;
    private IIiIiiiiIiiIi[] IiiiiiiiIIIII;
    private IIIiiiiiIiIiI ALLATORIxDEMO;

    public void iiiIiiiiiiIIi() {
        Object IiiiiiiiIIIII;
        int IiiiiiiiIIIII2 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)this.iiIiiiiiiiIii.getActivitySet(), (String)"规则说明=", (String)"|");
        ActivityFC IiiiiiiiIIIII3 = IiiiiiiiIIIII2 > 0 ? this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII2) : null;
        String IiiiiiiiIIIII4 = IiiiiiiiIIIII3 != null ? IiiiiiiiIIIII3.getValue() : "还未设置说明文本";
        StringBuffer IiiiiiiiIIIII5 = new StringBuffer(IiiiiiiiIIIII4.length());
        int IiiiiiiiIIIII6 = 0;
        int IiiiiiiiIIIII7 = 0;
        while ((IiiiiiiiIIIII6 = IiiiiiiiIIIII4.indexOf("{", IiiiiiiiIIIII7)) != -1 && (IiiiiiiiIIIII7 = IiiiiiiiIIIII4.indexOf("}", IiiiiiiiIIIII6 + 1)) != -1) {
            IiiiiiiiIIIII = IiiiiiiiIIIII4.substring(IiiiiiiiIIIII6 + 1, IiiiiiiiIIIII7);
            if (((String)IiiiiiiiIIIII).indexOf("{") != -1) {
                ++IiiiiiiiIIIII6;
                continue;
            }
            int IiiiiiiiIIIII8 = IiiiiiiiIIIII4.length();
            IiiiiiiiIIIII4 = iiIiIiiiiIiii.ALLATORIxDEMO((String)IiiiiiiiIIIII, IiiiiiiiIIIII4, this.iiIiiiiiiiIii.getTimeOpen());
            IiiiiiiiIIIII7 += IiiiiiiiIIIII4.length() - IiiiiiiiIIIII8;
        }
        IiiiiiiiIIIII = (iiiIiiiiIiiiI)this.ALLATORIxDEMO().iiiIiiiiiiIIi(180);
        IiiiiiiiIIIII.ALLATORIxDEMO("比武大会规则", IiiiiiiiIIIII4);
    }

    public iiIiIiiiiIiii(GameView gameView) {
        super(176, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 718, 526, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/128.png", (int)0, (int)0, (int)0, (int)0, (boolean)false), null);
        this.ALLATORIxDEMO(new iiiiiiiiIIIII(0, 0, 25, 0));
        this.IiIiiiiiIIIII.setImage("sc/e/162.png");
        this.IiIiiiiiIIIII.setBounds(641, 30, 27, 27);
        this.IIiiIiiiIIiIi = new iiIiIiiiIIIiI("sc/e/181.png", 1, 140, (IiiiIiiiiIiIi)this);
        this.IIiiIiiiIIiIi.setBounds(610, 28, 31, 31);
        this.add((Component)this.IIiiIiiiIIiIi);
        this.IiiiiiiiIIIII = new IIiIiiiiIiiIi[4];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            String[] stringArray;
            if (IiiiiiiiIIIII == 0) {
                String[] stringArray2 = new String[4];
                stringArray2[0] = "队";
                stringArray2[1] = "伍";
                stringArray2[2] = "介";
                stringArray = stringArray2;
                stringArray2[3] = "绍";
            } else if (IiiiiiiiIIIII == 1) {
                String[] stringArray3 = new String[4];
                stringArray3[0] = "精";
                stringArray3[1] = "彩";
                stringArray3[2] = "比";
                stringArray = stringArray3;
                stringArray3[3] = "赛";
            } else if (IiiiiiiiIIIII == 2) {
                String[] stringArray4 = new String[4];
                stringArray4[0] = "赛";
                stringArray4[1] = "季";
                stringArray4[2] = "名";
                stringArray = stringArray4;
                stringArray4[3] = "次";
            } else {
                String[] stringArray5 = new String[4];
                stringArray5[0] = "奖";
                stringArray5[1] = "品";
                stringArray5[2] = "展";
                stringArray = stringArray5;
                stringArray5[3] = "示";
            }
            String[] IiiiiiiiIIIII2 = stringArray;
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = new IIiIiiiiIiiIi("sc/e/164.png", 2, 7 + IiiiiiiiIIIII, iiIIiiiiIiiII.iiiIIiiiIiiII, null, IiiiiiiiIIIII2, (IiiiIiiiiIiIi)this);
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(673, 48 + IiiiiiiiIIIII * 106, 45, 106);
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].ALLATORIxDEMO(iiIIiiiiIiiII.iiIIIiiiiIIii);
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].ALLATORIxDEMO(new iiiiiiiiIIIII(12, 26, 0, 0));
            this.add((Component)this.IiiiiiiiIIIII[IiiiiiiiIIIII++]);
        }
        this.ALLATORIxDEMO = new IIIiiiiiIiIiI("sc/d/129.png");
        this.ALLATORIxDEMO.setBounds(113, 2, 160, 57);
        this.add((Component)this.ALLATORIxDEMO);
        this.iIiIiiiiIiIii = new IiiiIiiiiIiIi[this.IiiiiiiiIIIII.length];
    }

    public int iiiIiiiiiiIIi() {
        return this.IiIIIiiiiIiiI;
    }

    public IiiiIiiiiIiIi[] ALLATORIxDEMO() {
        return this.iIiIiiiiIiIii;
    }

    public void iIiIiiiiIIiii(int type) {
        this.IiIIIiiiiIiiI = type;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].ALLATORIxDEMO(IiiiiiiiIIIII == this.IiIIIiiiiIiiI);
            IIiIiiiiIiiIi iIiIiiiiIiiIi = this.IiiiiiiiIIIII[IiiiiiiiIIIII];
            String string = IiiiiiiiIIIII == this.IiIIIiiiiIiiI ? "#c7D6120" : "#cE5D0A9";
            ++IiiiiiiiIIIII;
            iIiIiiiiIiiIi.setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)string));
        }
        if (type == 0) {
            if (this.iIiIiiiiIiIii[0] == null) {
                this.iIiIiiiiIiIii[0] = new iiIiIiiiiiIIi(this);
                this.add((Component)this.iIiIiiiiIiIii[0], 0);
            }
            ((iiIiIiiiiiIIi)this.iIiIiiiiIiIii[0]).iIiIiiiiIIiIi();
        } else if (type == 1) {
            if (this.iIiIiiiiIiIii[1] == null) {
                this.iIiIiiiiIiIii[1] = new iiIiIiiiiIiIi(this);
                this.add((Component)this.iIiIiiiiIiIii[1], 0);
            }
            ((iiIiIiiiiIiIi)this.iIiIiiiiIiIii[1]).iiiIiiiiiiIIi();
        } else if (type == 2) {
            if (this.iIiIiiiiIiIii[2] == null) {
                this.iIiIiiiiIiIii[2] = new iIiIiiiiIiIII(this);
                this.add((Component)this.iIiIiiiiIiIii[2], 0);
            }
            ((iIiIiiiiIiIII)this.iIiIiiiiIiIii[2]).iiiIiiiiiiIIi();
        } else if (type == 3) {
            if (this.iIiIiiiiIiIii[3] == null) {
                this.iIiIiiiiIiIii[3] = new IiiIiiiiIIIii(this);
                this.add((Component)this.iIiIiiiiIiIii[3], 0);
            }
            ((IiiIiiiiIIIii)this.iIiIiiiiIiIii[3]).iiiIiiiiiiIIi();
        }
        if (this.iIiIiiiiIiIii[type] != null) {
            this.iIiIiiiiIiIii[type].setVisible(true);
        }
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length) {
            if (this.iIiIiiiiIiIii[IiiiiiiiIIIII] != null && type != IiiiiiiiIIIII) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setVisible(false);
            }
            ++IiiiiiiiIIIII;
        }
    }

    public Activity ALLATORIxDEMO() {
        return this.iiIiiiiiiiIii;
    }

    public static String ALLATORIxDEMO(String key, String text, long timeStart) {
        String IiiiiiiiIIIII = null;
        if (key.startsWith("时间:")) {
            IiiiiiiiIIIII = iIiIIiiiIiiiI.iIiIiiiiIIiii((long)(timeStart + (long)BWDHRule.ALLATORIxDEMO((String)key, (int)3, (int)key.length()) * 1000L));
        } else if (key.startsWith("日期:")) {
            IiiiiiiiIIIII = iIiIIiiiIiiiI.ALLATORIxDEMO((long)(timeStart + (long)BWDHRule.ALLATORIxDEMO((String)key, (int)3, (int)key.length()) * 1000L), (String)"yyyy-MM-dd");
        }
        if (IiiiiiiiIIIII != null) return text.replace("{" + key + "}", IiiiiiiiIIIII);
        return text;
    }

    public void iIiIiiiiIIiii() {
        this.iiIiiiiiiiIii = null;
        List IiiiiiiiIIIII = this.iiIIiiiiIiIIi.baseView.ALLATORIxDEMO();
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < IiiiiiiiIIIII.size()) {
            Activity IiiiiiiiIIIII3;
            IIIIIiiiIiIii IiiiiiiiIIIII4 = (IIIIIiiiIiIii)IiiiiiiiIIIII.get(IiiiiiiiIIIII2);
            Activity activity = IiiiiiiiIIIII3 = IiiiiiiiIIIII4.ALLATORIxDEMO() > 100 && IiiiiiiiIIIII4.ALLATORIxDEMO() < 200 ? this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII4.ALLATORIxDEMO()) : null;
            if (IiiiiiiiIIIII3 != null && IiiiiiiiIIIII3.getModelId() == 3) {
                this.iiIiiiiiiiIii = IiiiiiiiIIIII3;
                break;
            }
            ++IiiiiiiiIIIII2;
        }
        if (this.iiIiiiiiiiIii == null) {
            return;
        }
        this.iIiIiiiiIIiii(0);
        super.iIiIiiiiIIiii();
    }

    public boolean ALLATORIxDEMO() {
        if (this.iIiIiiiiIiIii[0] == null) return super.ALLATORIxDEMO();
        ((iiIiIiiiiiIIi)this.iIiIiiiiIiIii[0]).iiiIiiiiiiIIi();
        return super.ALLATORIxDEMO();
    }
}
