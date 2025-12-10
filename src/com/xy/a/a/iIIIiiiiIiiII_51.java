/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.IIIIiiiiiIiII
 *  com.xy.a.a.IIIiIiiiiIiII
 *  com.xy.a.a.iiIiIiiiIiIiI
 *  com.xy.a.iiIiiiiiIIiiI
 *  com.xy.entity.Baby
 *  com.xy.formula.BaseValue
 *  com.xy.formula.PropertyUtil
 *  com.xy.game.HandleEquip
 *  com.xy.game.RoleData
 *  com.xy.i.IiIiIiiiiIIiI
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Goodstable
 *  com.xy.readbean.Talent
 *  com.xy.richtext.RichLabel
 *  com.xy.socket.Agreement
 *  com.xy.socket.GameClient
 *  com.xy.socket.ParamTool
 *  com.xy.text.GameView
 *  com.xy.v.IIiIiiiiIiIII
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.IiiiIiiiiIiIi
 *  com.xy.v.IiiiiiiiiIIII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.a;

import com.xy.a.a.IIIIiiiiiIiII;
import com.xy.a.a.IIIiIiiiiIiII;
import com.xy.a.a.iiIiIiiiIiIiI;
import com.xy.a.iiIiiiiiIIiiI;
import com.xy.entity.Baby;
import com.xy.formula.BaseValue;
import com.xy.formula.PropertyUtil;
import com.xy.game.HandleEquip;
import com.xy.game.RoleData;
import com.xy.i.IiIiIiiiiIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Goodstable;
import com.xy.readbean.Talent;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.socket.GameClient;
import com.xy.socket.ParamTool;
import com.xy.text.GameView;
import com.xy.v.IIiIiiiiIiIII;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.IiiiIiiiiIiIi;
import com.xy.v.IiiiiiiiiIIII;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import javax.swing.JLabel;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iIIIiiiiIiiII
extends com.xy.q.IiiiIiiiiIiIi {
    private IIIiiiiiIiIiI[] iiiiIiiiIiiII;
    private iiIiIiiiIiIiI[] iiiIiiiiiiiIi;
    private JLabel iIiiIiiiiiiII;
    private iiIiIiiiIiIiI[] IIiiIiiiIIiIi;
    private IIIIiiiiiIiII iIiIiiiiIiIii;
    private IiIiIiiiiIIiI[] IiIIIiiiiIiiI;
    private IIIiIiiiiIiII iiIiiiiiiiIii;
    protected boolean IiiiiiiiIIIII;
    private RichLabel ALLATORIxDEMO;

    public void iiiIiiiiiiIIi(com.xy.q.IIIiiiiiIiIiI imgGrid) {
        String[] IiiiiiiiIIIII;
        RoleData IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
        if (IiiiiiiiIIIII2 == null) {
            return;
        }
        Baby IiiiiiiiIIIII3 = IiiiiiiiIIIII2.getChoseBaby();
        if (IiiiiiiiIIIII3 == null) {
            return;
        }
        int IiiiiiiiIIIII4 = -1;
        int IiiiiiiiIIIII5 = 0;
        while (IiiiiiiiIIIII5 < IIIiIiiiiIiII.ALLATORIxDEMO((IIIiIiiiiIiII)this.iiIiiiiiiiIii).length) {
            if (iiIiIiiiIiIiI.ALLATORIxDEMO((iiIiIiiiIiIiI)IIIiIiiiiIiII.ALLATORIxDEMO((IIIiIiiiiIiII)this.iiIiiiiiiiIii)[IiiiiiiiIIIII5]) == imgGrid) {
                IiiiiiiiIIIII4 = IiiiiiiiIIIII5;
                break;
            }
            ++IiiiiiiiIIIII5;
        }
        if (IiiiiiiiIIIII4 == -1) {
            return;
        }
        String IiiiiiiiIIIII22 = IiiiiiiiIIIII3.getTalents();
        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII22)) {
            return;
        }
        IiiiiiiiiIIII IiiiiiiiIIIII6 = this.ALLATORIxDEMO();
        Talent IiiiiiiiIIIII7 = IiiiiiiiIIIII6.ALLATORIxDEMO(Integer.parseInt((IiiiiiiiIIIII = IiiiiiiiIIIII22.split("\\|")[IiiiiiiiIIIII4 % 3].split("="))[0]));
        if (IiiiiiiiIIIII7 == null) {
            return;
        }
        ((iiIiiiiiIIiiI)this.ALLATORIxDEMO().iiiIiiiiiiIIi(46)).ALLATORIxDEMO(IiiiiiiiIIIII3, IiiiiiiiIIIII7, Integer.parseInt(IiiiiiiiIIIII[1]), IiiiiiiiIIIII4 < 3, IiiiiiiiIIIII3.getOutcome(), IiiiiiiiIIIII4 % 3);
    }

    public void ALLATORIxDEMO(int age, int sex, String outcome) {
        int IiiiiiiiIIIII = age / 30 % 12;
        int IiiiiiiiIIIII2 = age / 360;
        if (outcome == null || outcome.equals("")) {
            StringBuffer IiiiiiiiIIIII3 = new StringBuffer();
            if (IiiiiiiiIIIII2 > 0) {
                IiiiiiiiIIIII3.append(IiiiiiiiIIIII2);
                IiiiiiiiIIIII3.append("\u5c81");
            }
            IiiiiiiiIIIII3.append(IiiiiiiiIIIII);
            IiiiiiiiIIIII3.append("\u6708");
            this.iIiiIiiiiiiII.setText(IiiiiiiiIIIII3.toString());
        } else {
            this.iIiiIiiiiiiII.setText(outcome);
        }
        if ((IiiiiiiiIIIII2 /= 3) > 5) {
            IiiiiiiiIIIII2 = 5;
        }
        if (sex == 0) {
            this.iiiiIiiiIiiII[1].iIiIiiiiIIiii("sc/baby/c110" + IiiiiiiiIIIII2 + ".png");
            return;
        }
        this.iiiiIiiiIiiII[1].iIiIiiiiIIiii("sc/baby/c100" + IiiiiiiiIIIII2 + ".png");
    }

    public void IiiIiiiiiiIiI() {
        this.iiiiIiiiIiiII[0].setVisible(false);
        this.iiiiIiiiIiiII[1].iIiIiiiiIIiii();
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiIiiiiiiiIi.length) {
            com.xy.q.IIIiiiiiIiIiI iIIiiiiiIiIiI = iiIiIiiiIiIiI.ALLATORIxDEMO((iiIiIiiiIiIiI)this.iiiIiiiiiiiIi[IiiiiiiiIIIII]);
            ++IiiiiiiiIIIII;
            iIIiiiiiIiIiI.ALLATORIxDEMO(0, null);
        }
        this.iIiIiiiiIiIii.ALLATORIxDEMO();
        this.iiIiiiiiiiIii.ALLATORIxDEMO();
    }

    public void iiiIiiiiiiIIi(int id) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setKeep(id - 1 == IiiiiiiiIIIII);
            ++IiiiiiiiIIIII;
        }
        if (id == 1) {
            this.iIiIiiiiIiIii.setVisible(true);
            this.iiIiiiiiiiIii.setVisible(false);
            return;
        }
        if (id != 2) return;
        this.iIiIiiiiIiIii.setVisible(false);
        this.iiIiiiiiiiIii.setVisible(true);
    }

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ void iIiIiiiiIIiIi() {
        block18: {
            block17: {
                this.IiiIiiiiiiIiI();
                IiiiiiiiIIIII = this.ALLATORIxDEMO();
                v0 = IiiiiiiiIIIII = IiiiiiiiIIIII != null ? IiiiiiiiIIIII.getChoseBaby() : null;
                if (IiiiiiiiIIIII == null) {
                    return;
                }
                this.ALLATORIxDEMO(IiiiiiiiIIIII.getBabyage(), IiiiiiiiIIIII.getChildSex(), IiiiiiiiIIIII.getOutcome());
                IiiiiiiiIIIII = IiiiiiiiIIIII.getpartAll();
                IiiiiiiiIIIII = 0;
                while (IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
                    IiiiiiiiIIIII = IiiiiiiiIIIII.getGoodEquip(IiiiiiiiIIIII[IiiiiiiiIIIII]);
                    if (IiiiiiiiIIIII != null) {
                        iiIiIiiiIiIiI.ALLATORIxDEMO((iiIiIiiiIiIiI)this.iiiIiiiiiiiIi[IiiiiiiiIIIII]).ALLATORIxDEMO(1, IiiiiiiiIIIII);
                    }
                    ++IiiiiiiiIIIII;
                }
                IiiiiiiiIIIII = IiiiiiiiIIIII.getTalents();
                if (!IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII)) {
                    IiiiiiiiIIIII = this.ALLATORIxDEMO();
                    IiiiiiiiIIIII = IiiiiiiiIIIII.split("\\|");
                    IiiiiiiiIIIII = 0;
                    while (IiiiiiiiIIIII < ((String[])IiiiiiiiIIIII).length) {
                        IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].indexOf("=");
                        IiiiiiiiIIIII = IiiiiiiiIIIII.ALLATORIxDEMO(IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII[IiiiiiiiIIIII], (int)0, (int)IiiiiiiiIIIII));
                        if (IiiiiiiiIIIII != null) {
                            iiIiIiiiIiIiI.ALLATORIxDEMO((iiIiIiiiIiIiI)IIIiIiiiiIiII.ALLATORIxDEMO((IIIiIiiiiIiII)this.iiIiiiiiiiIii)[IiiiiiiiIIIII]).ALLATORIxDEMO(3, (Object)IiiiiiiiIIIII);
                            if (IiiiiiiiIIIII.getId() > 3) {
                                iiIiIiiiIiIiI.ALLATORIxDEMO((iiIiIiiiIiIiI)IIIiIiiiiIiII.ALLATORIxDEMO((IIIiIiiiiIiII)this.iiIiiiiiiiIii)[3 + IiiiiiiiIIIII]).ALLATORIxDEMO(4, (Object)IiiiiiiiIIIII);
                            }
                        }
                        ++IiiiiiiiIIIII;
                    }
                }
                if ((IiiiiiiiIIIII = IiiiiiiiIIIII.getLoginResult().getBabyId()) == null || IiiiiiiiIIIII.compareTo(IiiiiiiiIIIII.getBabyid()) != 0) {
                    IIIIiiiiiIiII.ALLATORIxDEMO((IIIIiiiiiIiII)this.iIiIiiiiIiIii)[2].setText("\u53c2\u6218");
                } else {
                    IIIIiiiiiIiII.ALLATORIxDEMO((IIIIiiiiiIiII)this.iIiIiiiiIiIii)[2].setText("\u5f85\u673a");
                }
                IIIIiiiiiIiII.ALLATORIxDEMO((IIIIiiiiiIiII)this.iIiIiiiiIiIii).setText(IiiiiiiiIIIII.getBabyname());
                if (!this.ALLATORIxDEMO().gameBaby) break block17;
                IiiiiiiiIIIII = 400;
                IiiiiiiiIIIII = this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII.getOutcome());
                if (IiiiiiiiIIIII != null) {
                    IiiiiiiiIIIII = IiiiiiiiIIIII.getQ1() == 11 && IiiiiiiiIIIII.getQ2() == 11 && IiiiiiiiIIIII.getQ3() == 11 ? 800 : 600;
                }
                IiiiiiiiIIIII = IiiiiiiiIIIII.getBabyMap(IiiiiiiiIIIII);
                IiiiiiiiIIIII = 1;
                if (true) ** GOTO lbl64
            }
            IiiiiiiiIIIII = BaseValue.getProperty((Baby)IiiiiiiiIIIII, (BigDecimal[])IiiiiiiiIIIII, (RoleData)IiiiiiiiIIIII);
            IIIIiiiiiIiII.ALLATORIxDEMO((IIIIiiiiiIiII)this.iIiIiiiiIiIii)[0].setText(((Integer)IiiiiiiiIIIII.get("\u6c14\u8d28")).toString());
            IIIIiiiiiIiII.ALLATORIxDEMO((IIIIiiiiiIiII)this.iIiIiiiiIiIii)[1].setText(((Integer)IiiiiiiiIIIII.get("\u5185\u529b")).toString());
            IIIIiiiiiIiII.ALLATORIxDEMO((IIIIiiiiiIiII)this.iIiIiiiiIiIii)[2].setText(((Integer)IiiiiiiiIIIII.get("\u667a\u529b")).toString());
            IIIIiiiiiIiII.ALLATORIxDEMO((IIIIiiiiiIiII)this.iIiIiiiiIiIii)[3].setText(((Integer)IiiiiiiiIIIII.get("\u8010\u529b")).toString());
            IIIIiiiiiIiII.ALLATORIxDEMO((IIIIiiiiiIiII)this.iIiIiiiiIiIii)[4].setText(((Integer)IiiiiiiiIIIII.get("\u540d\u6c14")).toString());
            IIIIiiiiiIiII.ALLATORIxDEMO((IIIIiiiiiIiII)this.iIiIiiiiIiIii)[5].setText(((Integer)IiiiiiiiIIIII.get("\u9053\u5fb7")).toString());
            IIIIiiiiiIiII.ALLATORIxDEMO((IIIIiiiiiIiII)this.iIiIiiiiIiIii)[6].setText(((Integer)IiiiiiiiIIIII.get("\u53db\u9006")).toString());
            IIIIiiiiiIiII.ALLATORIxDEMO((IIIIiiiiiIiII)this.iIiIiiiiIiIii)[7].setText(((Integer)IiiiiiiiIIIII.get("\u73a9\u6027")).toString());
            IIIIiiiiiIiII.ALLATORIxDEMO((IIIIiiiiiIiII)this.iIiIiiiiIiIii)[8].setText(IiiiiiiiIIIII.getQingmi().toString());
            IIIIiiiiiIiII.ALLATORIxDEMO((IIIIiiiiiIiII)this.iIiIiiiiIiIii)[9].setText(((Integer)IiiiiiiiIIIII.get("\u5b5d\u5fc3")).toString());
            IIIIiiiiiIiII.ALLATORIxDEMO((IIIIiiiiiIiII)this.iIiIiiiiIiIii)[10].setText(IiiiiiiiIIIII.getWenbao().toString());
            IIIIiiiiiIiII.ALLATORIxDEMO((IIIIiiiiiIiII)this.iIiIiiiiIiIii)[11].setText(IiiiiiiiIIIII.getPilao().toString());
            IIIIiiiiiIiII.ALLATORIxDEMO((IIIIiiiiiIiII)this.iIiIiiiiIiIii)[12].setText(IiiiiiiiIIIII.getYangyujin().toString());
            break block18;
            do {
                IiiiiiiiIIIII = PropertyUtil.getMapValue((Map)IiiiiiiiIIIII, (String)BaseValue.babyKeys[IiiiiiiiIIIII]);
                IIIIiiiiiIiII.ALLATORIxDEMO((IIIIiiiiiIiII)this.iIiIiiiiIiIii)[IiiiiiiiIIIII - 1].setForeground(IiiiiiiiIIIII >= 1200.0 ? Color.white : Color.white);
                v1 = IIIIiiiiiIiII.ALLATORIxDEMO((IIIIiiiiiIiII)this.iIiIiiiiIiIii)[IiiiiiiiIIIII - 1];
                ++IiiiiiiiIIIII;
                v1.setText(String.valueOf((int)IiiiiiiiIIIII));
lbl64:
                // 2 sources

            } while (IiiiiiiiIIIII <= 7);
            IIIIiiiiiIiII.ALLATORIxDEMO((IIIIiiiiiIiII)this.iIiIiiiiIiIii)[7].setText(String.valueOf((int)PropertyUtil.getMapValue((Map)IiiiiiiiIIIII, (String)BaseValue.babyKeys[8])));
            IiiiiiiiIIIII = 9;
            while (IiiiiiiiIIIII <= 10) {
                IiiiiiiiIIIII = PropertyUtil.getMapValue((Map)IiiiiiiiIIIII, (String)BaseValue.babyKeys[IiiiiiiiIIIII]);
                IIIIiiiiiIiII.ALLATORIxDEMO((IIIIiiiiiIiII)this.iIiIiiiiIiIii)[IiiiiiiiIIIII - 1].setForeground(IiiiiiiiIIIII >= (double)IiiiiiiiIIIII ? Color.white : Color.white);
                v2 = IIIIiiiiiIiII.ALLATORIxDEMO((IIIIiiiiiIiII)this.iIiIiiiiIiIii)[IiiiiiiiIIIII - 1];
                ++IiiiiiiiIIIII;
                v2.setText(String.valueOf(String.valueOf((int)IiiiiiiiIIIII)) + "/" + IiiiiiiiIIIII);
            }
            IIIIiiiiiIiII.ALLATORIxDEMO((IIIIiiiiiIiII)this.iIiIiiiiIiIii)[10].setText(IiiiiiiiIIIII.getWenbao().toString());
            IIIIiiiiiIiII.ALLATORIxDEMO((IIIIiiiiiIiII)this.iIiIiiiiIiIii)[11].setText(IiiiiiiiIIIII.getPilao().toString());
            IIIIiiiiiIiII.ALLATORIxDEMO((IIIIiiiiiIiII)this.iIiIiiiiIiIii)[12].setText(IiiiiiiiIIIII.getYangyujin().toString());
            IiiiiiiiIIIII = IiiiiiiiIIIII = ((Double)IiiiiiiiIIIII.get(BaseValue.babyTotal3)).doubleValue();
            IiiiiiiiIIIII = 9;
            while (IiiiiiiiIIIII <= 10) {
                IiiiiiiiIIIII = (Double)IiiiiiiiIIIII.get(BaseValue.babyKeys[IiiiiiiiIIIII]);
                if (IiiiiiiiIIIII != null) {
                    if (IiiiiiiiIIIII > 400.0) {
                        IiiiiiiiIIIII = 400.0 + (IiiiiiiiIIIII - 400.0) / 6.4;
                    }
                    IiiiiiiiIIIII += IiiiiiiiIIIII * IiiiiiiiIIIII * 0.002;
                }
                ++IiiiiiiiIIIII;
            }
            this.ALLATORIxDEMO.setTextSize("#Z#W\u8bc4\u5206:#G" + (int)IiiiiiiiIIIII + "#W(" + (int)IiiiiiiiIIIII + ")", 200);
            this.ALLATORIxDEMO.setBounds(110 + (200 - this.ALLATORIxDEMO.getWidth()) / 2, 55, this.ALLATORIxDEMO.getWidth(), this.ALLATORIxDEMO.getHeight());
            IIiIiiiiIiIII.ALLATORIxDEMO((Map)IiiiiiiiIIIII);
        }
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIiiIiiiIIiIi.length) {
            if (iiIiIiiiIiIiI.ALLATORIxDEMO((iiIiIiiiIiIiI)this.IIiiIiiiIIiIi[IiiiiiiiIIIII]).ALLATORIxDEMO() == 2 && iiIiIiiiIiIiI.ALLATORIxDEMO((iiIiIiiiIiIiI)this.IIiiIiiiIIiIi[IiiiiiiiIIIII]).ALLATORIxDEMO() == IiiiiiiiIIIII.getBabyid().longValue()) {
                this.iiiiIiiiIiiII[0].setBounds(this.IIiiIiiiIIiIi[IiiiiiiiIIIII].getX() - 3, this.IIiiIiiiIIiIi[IiiiiiiiIIIII].getY() - 3, 52, 52);
                this.iiiiIiiiIiiII[0].setVisible(true);
                return;
            }
            ++IiiiiiiiIIIII;
        }
    }

    public boolean ALLATORIxDEMO() {
        this.ALLATORIxDEMO((Baby)null);
        this.iIiIiiiiIIiIi();
        return super.ALLATORIxDEMO();
    }

    public void iIiIiiiiIIiii(com.xy.q.IIIiiiiiIiIiI imgGrid) {
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        if (IiiiiiiiIIIII == null) {
            return;
        }
        Baby IiiiiiiiIIIII2 = IiiiiiiiIIIII.getChoseBaby();
        if (IiiiiiiiIIIII2 == null) {
            return;
        }
        String IiiiiiiiIIIII3 = IiiiiiiiIIIII2.getOutcome();
        if (IiiiiiiiIIIII3 == null || IiiiiiiiIIIII3.equals("")) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u6210\u5e74\u540e\u624d\u80fd\u5f3a\u5316\u6280\u80fd");
            return;
        }
        Goodstable IiiiiiiiIIIII4 = IiiiiiiiIIIII.ALLATORIxDEMO(new BigDecimal(615));
        if (IiiiiiiiIIIII4 == null) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u4f60\u80cc\u5305\u6ca1\u6709\u743c\u6d46\u7389\u6db2");
            return;
        }
        int IiiiiiiiIIIII5 = -1;
        int IiiiiiiiIIIII6 = 3;
        while (IiiiiiiiIIIII6 < IIIiIiiiiIiII.ALLATORIxDEMO((IIIiIiiiiIiII)this.iiIiiiiiiiIii).length) {
            if (iiIiIiiiIiIiI.ALLATORIxDEMO((iiIiIiiiIiIiI)IIIiIiiiiIiII.ALLATORIxDEMO((IIIiIiiiiIiII)this.iiIiiiiiiiIii)[IiiiiiiiIIIII6]) == imgGrid) {
                IiiiiiiiIIIII5 = IiiiiiiiIIIII6 - 3;
                break;
            }
            ++IiiiiiiiIIIII6;
        }
        if (IiiiiiiiIIIII5 == -1) {
            return;
        }
        String IiiiiiiiIIIII22 = Agreement.getSendTextAES((String)"userbaby", (String)(IiiiiiiiIIIII4.getRgid() + "|" + IiiiiiiiIIIII2.getBabyid() + "|" + IiiiiiiiIIIII5));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII22);
    }

    public iIIIiiiiIiiII(GameView gameView) {
        super(1, 2, com.xy.q.IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-2, 0, 582, 375, com.xy.q.IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u517b\u80b2");
        this.IiIIIiiiiIiiI = new IiIiIiiiiIIiI[2];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII] = new IiIiIiiiiIIiI("sc/e/39.png", 2, 1 + IiiiiiiiIIIII, iiIIiiiiIiiII.IIiiIiiiIIiIi, null, IiiiiiiiIIIII == 0 ? "\u5c5e\u6027" : (IiiiiiiiIIIII == 1 ? "\u5929\u8d44" : ""), (com.xy.q.IiiiIiiiiIiIi)this);
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setOffsetTexts(iiIIiiiiIiiII.IiIIIiiiiiiiI);
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(323 + 65 * IiiiiiiiIIIII, 36, 63, 24);
            this.add((Component)this.IiIIIiiiiIiiI[IiiiiiiiIIIII++]);
        }
        this.IIiiIiiiIIiIi = new iiIiIiiiIiIiI[6];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIiiIiiiIIiIi.length) {
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII] = new iiIiIiiiIiIiI(this, 0, IiiiiiiiIIIII);
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setBounds(54, 34 + IiiiiiiiIIIII * 50, 46, 46);
            this.add((Component)this.IIiiIiiiIIiIi[IiiiiiiiIIIII++]);
        }
        this.iiiIiiiiiiiIi = new iiIiIiiiIiIiI[4];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiIiiiiiiiIi.length) {
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII] = new iiIiIiiiIiIiI(this, 1, IiiiiiiiIIIII);
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(320 + IiiiiiiiIIIII * 60, 278, 59, 57);
            this.add((Component)this.iiiIiiiiiiiIi[IiiiiiiiIIIII++]);
        }
        this.iIiiIiiiiiiII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)110, (int)35, (int)200, (int)20, (int)0, (Color)Color.YELLOW, (Font)iiIIiiiiIiiII.IIiiiiiiiIIIi);
        this.add(this.iIiiIiiiiiiII);
        this.ALLATORIxDEMO = new RichLabel("", iiIIiiiiIiiII.IIiiiiiiiIIIi, 200);
        this.add((Component)this.ALLATORIxDEMO);
        this.iIiIiiiiIiIii = new IIIIiiiiiIiII(this);
        this.iiIiiiiiiiIii = new IIIiIiiiiIiII(this);
        this.iIiIiiiiIiIii.setBounds(318, 60, 240, 215);
        this.iiIiiiiiiiIii.setBounds(318, 60, 240, 215);
        this.add((Component)this.iIiIiiiiIiIii);
        this.add((Component)this.iiIiiiiiiiIii);
        this.iiiiIiiiIiiII = new IIIiiiiiIiIiI[8];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiiIiiiIiiII.length) {
            this.iiiiIiiiIiiII[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII == 0) {
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/37.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
            } else if (IiiiiiiiIIIII == 1) {
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].setBounds(111, 35, 200, 300);
            } else if (IiiiiiiiIIIII == 2) {
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].setBounds(109, 33, 204, 304);
            } else if (IiiiiiiiIIIII >= 3 && IiiiiiiiIIIII <= 6) {
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/30.png");
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].setBounds(321 + (IiiiiiiiIIIII - 3) * 60, 335, 58, 1);
            } else if (IiiiiiiiIIIII == 7) {
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/36.png", (int)30, (int)30, (int)30, (int)30, (boolean)false));
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].setBounds(318, 60, 240, 215);
            }
            this.add((Component)this.iiiiIiiiIiiII[IiiiiiiiIIIII++]);
        }
        this.iiiIiiiiiiIIi(1);
    }

    public void ALLATORIxDEMO(Baby baby) {
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        if (IiiiiiiiIIIII != null) {
            IiiiiiiiIIIII.setChoseBabyId(baby != null ? baby.getBabyid() : null);
        }
        this.IiiiiiiiIIIII = true;
    }

    public void iIiIiiiiIIiii(int id) {
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        if (IiiiiiiiIIIII == null) {
            return;
        }
        Baby IiiiiiiiIIIII2 = IiiiiiiiIIIII.getChoseBaby();
        if (IiiiiiiiIIIII2 == null) {
            return;
        }
        if (id == 3) {
            String IiiiiiiiIIIII3 = IIIIiiiiiIiII.ALLATORIxDEMO((IIIIiiiiiIiII)this.iIiIiiiiIiIii).getText().trim();
            if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII3) || IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII2.getBabyname(), (String)IiiiiiiiIIIII3)) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8bf7\u8f93\u5165\u5b69\u5b50\u7684\u65b0\u540d\u79f0");
                return;
            }
            if (IiiiiiiiIIIII3.length() > 9) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u540d\u79f0\u592a\u957f");
                return;
            }
            if (!IiiiIiiiiIiIi.ALLATORIxDEMO((String)IiiiiiiiIIIII3)) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u4fee\u6539\u540e\u7684\u540d\u5b57\u4e0d\u80fd\u6709\u7279\u6b8a\u7b26\u53f7");
                return;
            }
            if (!IiiiIiiiiIiIi.iIiIiiiiIIiii((String)IiiiiiiiIIIII3)) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u540d\u79f0\u4e2d\u5305\u542b\u975e\u6cd5\u5b57\u7b26\uff01\uff01");
                return;
            }
            IiiiiiiiIIIII2.setBabyname(IiiiiiiiIIIII3);
            ParamTool.ALLATORIxDEMO((Baby)IiiiiiiiIIIII2, (GameClient)this.ALLATORIxDEMO());
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u5b69\u5b50\u540d\u79f0\u4fee\u6539\u6210\u529f");
            return;
        }
        if (id != 5) return;
        BigDecimal IiiiiiiiIIIII4 = IiiiiiiiIIIII.getLoginResult().getBabyId();
        if (IiiiiiiiIIIII4 != null && IiiiiiiiIIIII4.compareTo(IiiiiiiiIIIII2.getBabyid()) == 0) {
            IIIIiiiiiIiII.ALLATORIxDEMO((IIIIiiiiiIiII)this.iIiIiiiiIiIii)[2].setText("\u53c2\u6218");
            IiiiiiiiIIIII.getLoginResult().setBabyId(null);
            String IiiiiiiiIIIII5 = Agreement.getSendTextAES((String)"rolechange", (String)"B");
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII5);
            IiiiiiiiIIIII.getRoleProperty().iIiIiiiiIIiii(null);
            return;
        }
        IIIIiiiiiIiII.ALLATORIxDEMO((IIIIiiiiiIiII)this.iIiIiiiiIiIii)[2].setText("\u5f85\u673a");
        IiiiiiiiIIIII.getLoginResult().setBabyId(IiiiiiiiIIIII2.getBabyid());
        String IiiiiiiiIIIII6 = Agreement.getSendTextAES((String)"rolechange", (String)("B" + IiiiiiiiIIIII2.getBabyid()));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII6);
        IiiiiiiiIIIII.getRoleProperty().iIiIiiiiIIiii(IiiiiiiiIIIII2);
    }

    public void ALLATORIxDEMO(com.xy.q.IIIiiiiiIiIiI imgGrid) {
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        if (IiiiiiiiIIIII == null) {
            return;
        }
        Baby IiiiiiiiIIIII2 = IiiiiiiiIIIII.getChoseBaby();
        if (IiiiiiiiIIIII2 == null) {
            return;
        }
        int IiiiiiiiIIIII3 = -1;
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < this.iiiIiiiiiiiIi.length) {
            if (iiIiIiiiIiIiI.ALLATORIxDEMO((iiIiIiiiIiIiI)this.iiiIiiiiiiiIi[IiiiiiiiIIIII4]) == imgGrid) {
                IiiiiiiiIIIII3 = IiiiiiiiIIIII4;
                break;
            }
            ++IiiiiiiiIIIII4;
        }
        if (IiiiiiiiIIIII3 == -1) {
            return;
        }
        if (this.ALLATORIxDEMO().gameBaby) {
            Goodstable IiiiiiiiIIIII5 = (Goodstable)imgGrid.ALLATORIxDEMO();
            String IiiiiiiiIIIII6 = Agreement.getSendTextAES((String)"userbaby", (String)(IiiiiiiiIIIII5.getRgid() + "|" + IiiiiiiiIIIII2.getBabyid()));
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII6);
            return;
        }
        if (!HandleEquip.ALLATORIxDEMO((RoleData)IiiiiiiiIIIII, (Baby)IiiiiiiiIIIII2, null, (int)IiiiiiiiIIIII3)) return;
        this.ALLATORIxDEMO(IiiiiiiiIIIII2);
    }

    public Baby ALLATORIxDEMO() {
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        if (IiiiiiiiIIIII != null) return IiiiiiiiIIIII.getChoseBaby();
        return null;
    }

    protected void paintComponent(Graphics g) {
        if (this.IiiiiiiiIIIII) {
            this.iIiIiiiiIIiIi();
            this.IiiiiiiiIIIII = false;
        }
        super.paintComponent(g);
    }

    public void iiiIiiiiiiIIi() {
        this.iiiiIiiiIiiII[0].setVisible(false);
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIiiIiiiIIiIi.length) {
            com.xy.q.IIIiiiiiIiIiI iIIiiiiiIiIiI = iiIiIiiiIiIiI.ALLATORIxDEMO((iiIiIiiiIiIiI)this.IIiiIiiiIIiIi[IiiiiiiiIIIII]);
            ++IiiiiiiiIIIII;
            iIIiiiiiIiIiI.ALLATORIxDEMO(0, null);
        }
        RoleData IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
        if (IiiiiiiiIIIII2 == null) {
            return;
        }
        List IiiiiiiiIIIII3 = IiiiiiiiIIIII2.getBabys();
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < IiiiiiiiIIIII3.size() && IiiiiiiiIIIII4 < this.IIiiIiiiIIiIi.length) {
            Baby IiiiiiiiIIIII5 = (Baby)IiiiiiiiIIIII3.get(IiiiiiiiIIIII4);
            com.xy.q.IIIiiiiiIiIiI iIIiiiiiIiIiI = iiIiIiiiIiIiI.ALLATORIxDEMO((iiIiIiiiIiIiI)this.IIiiIiiiIIiIi[IiiiiiiiIIIII4]);
            ++IiiiiiiiIIIII4;
            iIIiiiiiIiIiI.ALLATORIxDEMO(2, (Object)IiiiiiiiIIIII5);
        }
        this.ALLATORIxDEMO(IiiiiiiiIIIII3.size() > 0 ? (Baby)IiiiiiiiIIIII3.get(0) : null);
    }

    public void iIiIiiiiIIiii() {
        this.iiiIiiiiiiIIi();
        super.iIiIiiiiIIiii();
    }
}
