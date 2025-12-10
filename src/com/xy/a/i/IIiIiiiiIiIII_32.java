/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.i.IiiiIiiiiIiII
 *  com.xy.a.q.iiIiIiiiiIiii
 *  com.xy.bean.SuitOperBean
 *  com.xy.entity.Baby
 *  com.xy.formula.GoodType
 *  com.xy.game.RoleData
 *  com.xy.i.IIiiIiiiIiiiI
 *  com.xy.i.iiIiIiiiiIiii
 *  com.xy.q.IIIiIiiiiIIiI
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiIiIiiiiIiIi
 *  com.xy.q.iiiIIiiiIIIii
 *  com.xy.readbean.Goodstable
 *  com.xy.readbean.MoneyType
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.iiIiiiiiIIiii
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.i;

import com.xy.a.i.IiiiIiiiiIiII;
import com.xy.bean.SuitOperBean;
import com.xy.entity.Baby;
import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.i.IIiiIiiiIiiiI;
import com.xy.i.iiIiIiiiiIiii;
import com.xy.q.IIIiIiiiiIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.q.iiIiIiiiiIiIi;
import com.xy.q.iiiIIiiiIIIii;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.iiIiiiiiIIiii;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IIiIiiiiIiIII
extends IiiiIiiiiIiIi {
    private BigDecimal IIIIiiiiiiiII;
    private MoneyType iiIIIiiiiiiiI;
    private iiIiIiiiiIiii[] IiIiiiiiIIIII;
    private IIIiiiiiIiIiI[] iiIiIiiiiIIIi;
    private int iiiiIiiiIiiII;
    private com.xy.q.IIIiiiiiIiIiI[] iiiIiiiiiiiIi;
    private iiIiIiiiiIiIi iIiiIiiiiiiII;
    private iiIiIiiiiIiii[] IIiiIiiiIIiIi;
    private IIIiIiiiiIIiI iIiIiiiiIiIii;
    private JLabel[] IiIIIiiiiIiiI;
    private int iiIiiiiiiiIii = -1;
    private iIIiIiiiIiiIi[] IiiiiiiiIIIII;
    private IiiiIiiiiIiII ALLATORIxDEMO;

    protected void paintComponent(Graphics g) {
        if (this.iiIIiiiiIiIIi.iIiIiiiiIIiii()) {
            this.iIiIiiiiIIiIi();
        }
        super.paintComponent(g);
    }

    public void iIiIiiiiIIiIi(int type) {
        this.iiiiIiiiIiiII = type;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIiiiiiIIIII.length) {
            this.IiIiiiiiIIIII[IiiiiiiiIIIII].setKeep(IiiiiiiiIIIII == this.iiiiIiiiIiiII);
            ++IiiiiiiiIIIII;
        }
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiIiiiiiiiIi.length) {
            com.xy.q.IIIiiiiiIiIiI iIIiiiiiIiIiI = this.iiiIiiiiiiiIi[IiiiiiiiIIIII];
            ++IiiiiiiiIIIII;
            iIIiiiiiIiIiI.ALLATORIxDEMO(0, null);
        }
        if (this.iiiiIiiiIiiII == 0) {
            Goodstable IiiiiiiiIIIII2 = this.ALLATORIxDEMO().ALLATORIxDEMO(new BigDecimal(668));
            this.iiiIiiiiiiiIi[1].ALLATORIxDEMO(IiiiiiiiIIIII2 != null ? 1 : 0, (Object)IiiiiiiiIIIII2);
            this.IIIIiiiiiiiII = new BigDecimal(100000);
            iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.IiiiiiiiIIIII[2], (long)this.IIIIiiiiiiiII.longValue());
            this.IIiiIiiiIIiIi[1].setText("\u96d5\u7422");
        } else if (this.iiiiIiiiIiiII == 1) {
            Goodstable IiiiiiiiIIIII3 = this.ALLATORIxDEMO().ALLATORIxDEMO(new BigDecimal(669));
            this.iiiIiiiiiiiIi[1].ALLATORIxDEMO(IiiiiiiiIIIII3 != null ? 1 : 0, (Object)IiiiiiiiIIIII3);
            this.IIIIiiiiiiiII = new BigDecimal(100000);
            iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.IiiiiiiiIIIII[2], (long)this.IIIIiiiiiiiII.longValue());
            this.IIiiIiiiIIiIi[1].setText("\u91cd\u94f8");
        }
        this.iIiIiiiiIIiIi();
        this.iiiIiiiiiiIIi(false);
    }

    public void iIiIiiiiIIiIi() {
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        long IiiiiiiiIIIII2 = IiiiiiiiIIIII.getGoodTypeNum(137);
        if ((long)this.iiIiiiiiiiIii != IiiiiiiiIIIII2) {
            this.iiIiiiiiiiIii = (int)IiiiiiiiIIIII2;
            this.IiiiiiiiIIIII[3].setText("1/" + this.iiIiiiiiiiIii);
        }
        if (this.iiiIiiiiiiiIi[0].ALLATORIxDEMO() == 0) return;
        Goodstable IiiiiiiiIIIII3 = (Goodstable)this.iiiIiiiiiiiIi[0].ALLATORIxDEMO();
        if (IiiiiiiiIIIII3 != null) {
            IiiiiiiiIIIII3 = IiiiiiiiIIIII.getGood(IiiiiiiiIIIII3.getRgid());
        }
        if (IiiiiiiiIIIII3 != null) return;
        this.ALLATORIxDEMO((Goodstable)null);
    }

    public List<BigDecimal> ALLATORIxDEMO(List<BigDecimal> list, BigDecimal[] bigs) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < bigs.length) {
            Goodstable IiiiiiiiIIIII2 = this.ALLATORIxDEMO().getGoodEquip(bigs[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII2 != null) {
                if (list == null) {
                    list = new ArrayList<BigDecimal>();
                }
                list.add(IiiiiiiiIIIII2.getRgid());
            }
            ++IiiiiiiiIIIII;
        }
        return list;
    }

    public void iiiIiiiiiiIIi(int type) {
        this.iiiiIiiiIiiII = type;
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    public void iiiIiiiiiiIIi() {
        if (this.ALLATORIxDEMO == null) {
            this.iiiIiiiiiiIIi(true);
            return;
        }
        this.iiiIiiiiiiIIi(!this.ALLATORIxDEMO.isVisible());
    }

    public int iiiIiiiiiiIIi() {
        return this.iiiiIiiiIiiII;
    }

    public void ALLATORIxDEMO(Goodstable good) {
        this.iiiIiiiiiiiIi[0].ALLATORIxDEMO(good != null ? 1 : 0, (Object)good);
    }

    public void ALLATORIxDEMO(BigDecimal babyId) {
        if (this.ALLATORIxDEMO == null) {
            return;
        }
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        List<BigDecimal> IiiiiiiiIIIII2 = new ArrayList<BigDecimal>();
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < IiiiiiiiIIIII.babys.size()) {
            Baby IiiiiiiiIIIII4 = (Baby)IiiiiiiiIIIII.babys.get(IiiiiiiiIIIII3);
            if (babyId == null || IiiiiiiiIIIII4.getBabyid().compareTo(babyId) == 0) {
                BigDecimal[] IiiiiiiiIIIII5 = IiiiiiiiIIIII4.getpartAll();
                IiiiiiiiIIIII2 = this.ALLATORIxDEMO(IiiiiiiiIIIII2, IiiiiiiiIIIII5);
            }
            ++IiiiiiiiIIIII3;
        }
        this.ALLATORIxDEMO.IiIIIiiiiIiiI.ALLATORIxDEMO().iIiIiiiiIIiIi(0);
        this.ALLATORIxDEMO.IiIIIiiiiIiiI.ALLATORIxDEMO(IiiiiiiiIIIII2);
    }

    public void iiiIiiiiiiIIi(boolean is) {
        if (this.ALLATORIxDEMO == null && !is) {
            return;
        }
        if (is) {
            if (this.ALLATORIxDEMO == null) {
                this.ALLATORIxDEMO = new IiiiIiiiiIiII((IiiiIiiiiIiIi)this);
                this.add((Component)this.ALLATORIxDEMO, 0);
            }
            this.ALLATORIxDEMO.iIiIiiiiIiIii.ALLATORIxDEMO(false);
            this.ALLATORIxDEMO.iIiIiiiiIiIii.ALLATORIxDEMO().removeAllElements();
            int IiiiiiiiIIIII = 0;
            RoleData IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
            List<BigDecimal> IiiiiiiiIIIII3 = null;
            int IiiiiiiiIIIII222 = 0;
            while (IiiiiiiiIIIII222 < IiiiiiiiIIIII2.babys.size()) {
                Baby IiiiiiiiIIIII4 = (Baby)IiiiiiiiIIIII2.babys.get(IiiiiiiiIIIII222);
                BigDecimal[] IiiiiiiiIIIII5 = IiiiiiiiIIIII4.getpartAll();
                if (IiiiiiiiIIIII3 != null) {
                    IiiiiiiiIIIII3.clear();
                }
                if ((IiiiiiiiIIIII3 = this.ALLATORIxDEMO(IiiiiiiiIIIII3, IiiiiiiiIIIII5)) != null && IiiiiiiiIIIII3.size() != 0) {
                    IiiiiiiiIIIII += IiiiiiiiIIIII3.size();
                    iiiIIiiiIIIii IiiiiiiiIIIII6 = new iiiIIiiiIIIii(String.valueOf(IiiiiiiiIIIII4.getBabyname()) + "(" + IiiiiiiiIIIII3.size() + ")", (Object)IiiiiiiiIIIII4.getBabyid());
                    this.ALLATORIxDEMO.iIiIiiiiIiIii.iiiIiiiiiiIIi(IiiiiiiiIIIII6);
                }
                ++IiiiiiiiIIIII222;
            }
            iiiIIiiiIIIii IiiiiiiiIIIII222 = new iiiIIiiiIIIii("\u5168\u90e8(" + IiiiiiiiIIIII + ")", null);
            this.ALLATORIxDEMO.iIiIiiiiIiIii.iiiIiiiiiiIIi(IiiiiiiiIIIII222);
            this.ALLATORIxDEMO.iIiIiiiiIiIii.ALLATORIxDEMO(this.ALLATORIxDEMO.iIiIiiiiIiIii.ALLATORIxDEMO().size() - 1);
            this.ALLATORIxDEMO.setBounds(30, 108, 330, 150);
        }
        this.ALLATORIxDEMO.setVisible(is);
    }

    /*
     * Unable to fully structure code
     */
    public boolean iIiIiiiiIIiii() {
        block12: {
            block10: {
                block11: {
                    IiiiiiiiIIIII = this.ALLATORIxDEMO();
                    IiiiiiiiIIIII = IiiiiiiiIIIII.ALLATORIxDEMO((long)(this.iiiiIiiiIiiII == 0 ? 138 : 136));
                    if (IiiiiiiiIIIII == null) {
                        this.iiIIiiiiIiIIi.iiiIiiiiiiIIi(this.iiiiIiiiIiiII == 0 ? "\u7f3a\u5c11\u6bd3\u79c0\u77f3" : "\u7f3a\u5c11\u6362\u9aa8\u4e39");
                        return false;
                    }
                    IiiiiiiiIIIII = (Goodstable)this.iiiIiiiiiiiIi[0].ALLATORIxDEMO();
                    if (IiiiiiiiIIIII != null) {
                        IiiiiiiiIIIII = IiiiiiiiIIIII.getGood(IiiiiiiiIIIII.getRgid());
                    }
                    if (IiiiiiiiIIIII == null) {
                        this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8bf7\u9009\u62e9\u5bf9\u5e94\u7269\u54c1");
                        return false;
                    }
                    if (this.IIIIiiiiiiiII != null && IiiiiiiiIIIII.getLoginResult().getGold().compareTo(this.IIIIiiiiiiiII) < 0) {
                        this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u5927\u8bdd\u5e01\u4e0d\u8db3" + this.IIIIiiiiiiiII.longValue() / 10000L + "\u4e07");
                        return false;
                    }
                    IiiiiiiiIIIII = (com.xy.a.q.iiIiIiiiiIiii)this.ALLATORIxDEMO().iIiIiiiiIIiii(11);
                    if (IiiiiiiiIIIII != null && IiiiiiiiIIIII.ALLATORIxDEMO(this.iiiiIiiiIiiII == 0 ? 8 : 7, IiiiiiiiIIIII.getRgid())) break block10;
                    if (IiiiiiiiIIIII == null) {
                        IiiiiiiiIIIII = (com.xy.a.q.iiIiIiiiiIiii)this.ALLATORIxDEMO().iiiIiiiiiiIIi(11);
                    }
                    if (this.iiiiIiiiIiiII != 0) break block11;
                    IiiiiiiiIIIII = GoodType.getExtra((String)IiiiiiiiIIIII.getValue(), (String)"\u70bc\u5668\u5c5e\u6027");
                    if (IiiiiiiiIIIII == null) {
                        this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u70b9\u91d1\u540e\u624d\u80fd\u96d5\u7422");
                        return false;
                    }
                    IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII.getRgid(), IiiiiiiiIIIII, 8, true);
                    break block12;
                }
                IiiiiiiiIIIII = new StringBuffer();
                IiiiiiiiIIIII = 0;
                IiiiiiiiIIIII = 0;
                if (true) ** GOTO lbl53
            }
            IiiiiiiiIIIII = new SuitOperBean();
            IiiiiiiiIIIII = new ArrayList<BigDecimal>();
            IiiiiiiiIIIII.add(IiiiiiiiIIIII.getRgid());
            IiiiiiiiIIIII.add(IiiiiiiiIIIII.getRgid());
            IiiiiiiiIIIII.setType(this.iiiiIiiiIiiII == 0 ? 135 : 133);
            IiiiiiiiIIIII.setGoods(IiiiiiiiIIIII);
            IiiiiiiiIIIII = Agreement.getSendTextAES((String)"suitoperate", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII));
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
            return true;
            do {
                if ((IiiiiiiiIIIII = IiiiiiiiIIIII.getValue().indexOf("|", IiiiiiiiIIIII + 1)) == -1) {
                    IiiiiiiiIIIII = IiiiiiiiIIIII.getValue().length();
                }
                if (!((IiiiiiiiIIIII = IiiiiiiiIIIII.getValue().substring(IiiiiiiiIIIII, IiiiiiiiIIIII)).startsWith(GoodType.Extras[1]) || (IiiiiiiiIIIII = IiiiiiiiIIIII.indexOf("=")) == -1 || (IiiiiiiiIIIII = IiiiiiiiIIIII.substring(0, IiiiiiiiIIIII)).equals("\u7b49\u7ea7") || IiiiiiiiIIIII.equals("\u88c5\u5907\u7c7b\u578b") || IiiiiiiiIIIII.equals("\u6027\u522b\u8981\u6c42"))) {
                    if (IiiiiiiiIIIII.length() != 0) {
                        IiiiiiiiIIIII.append("|");
                    }
                    IiiiiiiiIIIII.append(IiiiiiiiIIIII);
                }
                IiiiiiiiIIIII = IiiiiiiiIIIII + 1;
lbl53:
                // 2 sources

            } while (IiiiiiiiIIIII < IiiiiiiiIIIII.getValue().length());
            IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII.getRgid(), IiiiiiiiIIIII.toString(), 7, true);
        }
        return false;
    }

    public void iIiIiiiiIIiii(int id) {
        if (id == 83) {
            this.iiiIiiiiiiIIi();
            return;
        }
        if (id != 84) return;
        this.iIiIiiiiIIiii();
    }

    public IIiIiiiiIiIII(GameView gameView) {
        super(166, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 382, 450, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u96d5\u7422");
        this.IiIiiiiiIIIII = new iiIiIiiiiIiii[2];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIiiiiiIIIII.length) {
            this.IiIiiiiiIIIII[IiiiiiiiIIIII] = new iiIiIiiiiIiii("sc/e/39.png", 2, 81 + IiiiiiiiIIIII, iiIIiiiiIiiII.IIiiIiiiIIiIi, null, IiiiiiiiIIIII == 0 ? "\u96d5\u7422" : (IiiiiiiiIIIII == 1 ? "\u91cd\u94f8" : ""), (IiiiIiiiiIiIi)this);
            this.IiIiiiiiIIIII[IiiiiiiiIIIII].setOffsetTexts(iiIIiiiiIiiII.IiIIIiiiiiiiI);
            this.IiIiiiiiIIIII[IiiiiiiiIIIII].setBounds(52 + 65 * IiiiiiiiIIIII, 22, 63, 24);
            this.add((Component)this.IiIiiiiiIIIII[IiiiiiiiIIIII++]);
        }
        this.IIiiIiiiIIiIi = new iiIiIiiiiIiii[3];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIiiIiiiIIiIi.length) {
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII] = new iiIiIiiiiIiii(IiiiiiiiIIIII == 0 ? "sc/e/28.png" : (IiiiiiiiIIIII == 1 ? "sc/e/7.png" : "sc/e/40.png"), 1, 83 + IiiiiiiiIIIII, IiiiiiiiIIIII == 1 ? iiIIiiiiIiiII.iiiiIiiiIiiII : iiIIiiiiIiiII.iiIiiiiiiIIiI, null, IiiiiiiiIIIII == 0 ? "\u5df2\u7a7f\u88c5\u5907" : (IiiiiiiiIIIII == 1 ? "\u96d5\u7422" : (IiiiiiiiIIIII == 2 ? "\uff1f" : "")), (IiiiIiiiiIiIi)this);
            if (IiiiiiiiIIIII == 0) {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setBounds(115, 130, 60, 18);
            } else if (IiiiiiiiIIIII == 1) {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setBounds(172, 267, 59, 25);
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setForeground(Color.black);
            } else if (IiiiiiiiIIIII == 2) {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setBounds(335, 49, 18, 18);
            }
            this.add((Component)this.IIiiIiiiIIiIi[IiiiiiiiIIIII++]);
        }
        this.IiIIIiiiiIiiI = new JLabel[4];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)109, (int)(167 + 23 * IiiiiiiiIIIII), (int)60, (int)19, (int)10, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFFFFFF"), (Font)iiIIiiiiIiiII.iIIiiiiiiIIII);
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u6d88\u8017\u4f53\u529b" : (IiiiiiiiIIIII == 1 ? "\u62e5\u6709\u4f53\u529b" : (IiiiiiiiIIIII == 2 ? "\u6d88\u8017\u91d1\u94b1" : (IiiiiiiiIIIII == 3 ? "\u62e5\u6709\u91d1\u94b1" : ""))));
            this.add(this.IiIIIiiiiIiiI[IiiiiiiiIIIII++]);
        }
        this.IiiiiiiiIIIII = new iIIiIiiiIiiIi[4];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)170, (int)(167 + 23 * IiiiiiiiIIIII), (int)124, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
            if (IiiiiiiiIIIII == 3) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(229, 129, 64, 19);
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setHorizontalAlignment(0);
            }
            this.add((Component)this.IiiiiiiiIIIII[IiiiiiiiIIIII++]);
        }
        this.iiIIIiiiiiiiI = new MoneyType();
        this.iiIIIiiiiiiiI.setIdAndKey(1, "\u91d1 \u94b1");
        this.iIiiIiiiiiiII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)170, (int)236, (int)124, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (MoneyType)this.iiIIIiiiiiiiI, (GameView)gameView);
        this.iIiiIiiiiiiII.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.add((Component)this.iIiiIiiiiiiII);
        this.iiiIiiiiiiiIi = new com.xy.q.IIIiiiiiIiIiI[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiIiiiiiiiIi.length) {
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII] = new com.xy.q.IIIiiiiiIiIiI((IiiiIiiiiIiIi)this);
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII].ALLATORIxDEMO("sc/d/4.png");
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII].ALLATORIxDEMO(com.xy.q.IIIiiiiiIiIiI.iiIiIiiiiIIII);
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(115 + IiiiiiiiIIIII * 116, 71, 59, 57);
            this.add((Component)this.iiiIiiiiiiiIi[IiiiiiiiIIIII++]);
        }
        this.iiIiIiiiiIIIi = new IIIiiiiiIiIiI[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiIiiiiIIIi.length) {
            this.iiIiIiiiiIIIi[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII == 0) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/19.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setBounds(47, 305, 309, 105);
            } else if (IiiiiiiiIIIII == 1) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/49.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setBounds(46, 46, 310, 260);
            }
            this.add((Component)this.iiIiIiiiiIIIi[IiiiiiiiIIIII++]);
        }
        IIiiIiiiIiiiI[] IiiiiiiiIIIII2 = new IIiiIiiiIiiiI[2];
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < IiiiiiiiIIIII2.length) {
            IiiiiiiiIIIII2[IiiiiiiiIIIII3] = new IIiiIiiiIiiiI(IiiiiiiiIIIII3 == 0 ? "sc/e/42.png" : "sc/e/43.png", 1, IiiiiiiiIIIII3, (IiiiIiiiiIiIi)this);
            if (IiiiiiiiIIIII3 == 0) {
                IiiiiiiiIIIII2[IiiiiiiiIIIII3].setBounds(316, 412, 18, 18);
            } else {
                IiiiiiiiIIIII2[IiiiiiiiIIIII3].setBounds(338, 412, 18, 18);
            }
            this.add((Component)IiiiiiiiIIIII2[IiiiiiiiIIIII3++]);
        }
        this.iIiIiiiiIiIii = new IIIiIiiiiIIiI((IiiiIiiiiIiIi)this, 6, 2, 51, 51, 0, 0, 48, 307);
        this.iIiIiiiiIiIii.ALLATORIxDEMO(IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/18.png"));
        this.iIiIiiiiIiIii.ALLATORIxDEMO(IiiiiiiiIIIII2, 1);
        this.iIiIiiiiIiIii.ALLATORIxDEMO(new long[]{139L});
        this.add((Component)this.iIiIiiiiIiIii);
    }

    public void iIiIiiiiIIiii() {
        this.iIiiIiiiiiiII.iIiIiiiiIIiii();
        this.iIiIiiiiIIiIi(this.iiiiIiiiIiiII);
        super.iIiIiiiiIIiii();
    }
}
