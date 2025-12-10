/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.v.iiIIIiiiiiIII
 *  com.xy.formula.ActivityMenuSet2
 *  com.xy.formula.FormulaNum
 *  com.xy.formula.GoodType
 *  com.xy.game.RoleData
 *  com.xy.i.iiIiIiiiIIIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIiIIiiiIiiiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiIiIiiiiIiIi
 *  com.xy.readbean.Activity
 *  com.xy.readbean.ActivityFC
 *  com.xy.readbean.ActivityFCBase
 *  com.xy.readbean.ActivityFCLucky
 *  com.xy.readbean.Goodstable
 *  com.xy.readbean.MoneyType
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.IiiiiiiiiIIII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.v;

import com.xy.a.v.iiIIIiiiiiIII;
import com.xy.formula.ActivityMenuSet2;
import com.xy.formula.FormulaNum;
import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.i.iiIiIiiiIIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIiIIiiiIiiiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.q.iiIiIiiiiIiIi;
import com.xy.readbean.Activity;
import com.xy.readbean.ActivityFC;
import com.xy.readbean.ActivityFCBase;
import com.xy.readbean.ActivityFCLucky;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.IiiiiiiiiIIII;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JLabel;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IiiIiiiiIIIIi
extends iIiIIiiiIiiiI {
    private Activity iiiiIiiiIiiII;
    private JLabel[] iiiIiiiiiiiIi;
    private IIIiiiiiIiIiI[] iIiiIiiiiiiII;
    private int[] IIiiIiiiIIiIi;
    private IiiiIiiiiIiIi iIiIiiiiIiIii;
    private ActivityFC IiIIIiiiiIiiI;
    private List<iiIIIiiiiiIII> iiIiiiiiiiIii;
    private iiIiIiiiiIiIi[] IiiiiiiiIIIII;
    private iiIiIiiiIIIiI[] ALLATORIxDEMO;

    public iiIIIiiiiiIII ALLATORIxDEMO(int index, int style) {
        iiIIIiiiiiIII IiiiiiiiIIIII;
        iiIIIiiiiiIII iiIIIiiiiiIII2 = IiiiiiiiIIIII = index < this.iiIiiiiiiiIii.size() ? this.iiIiiiiiiiIii.get(index) : null;
        if (IiiiiiiiIIIII != null) {
            IiiiiiiiIIIII.ALLATORIxDEMO(style);
            return IiiiiiiiIIIII;
        }
        IiiiiiiiIIIII = new iiIIIiiiiiIII(this);
        IiiiiiiiIIIII.ALLATORIxDEMO(style);
        this.iiIiiiiiiiIii.add(IiiiiiiiIIIII);
        this.add((Component)IiiiiiiiIIIII, 0);
        return IiiiiiiiIIIII;
    }

    static /* synthetic */ IiiiIiiiiIiIi ALLATORIxDEMO(IiiIiiiiIIIIi arg0) {
        return arg0.iIiIiiiiIiIii;
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(Activity activity, ActivityMenuSet2 menuSet2) {
        iiIIIiiiiiIII IiiiiiiiIIIII;
        MoneyType IiiiiiiiIIIII2;
        int IiiiiiiiIIIII3;
        FormulaNum IiiiiiiiIIIII4;
        int IiiiiiiiIIIII5;
        IiiiiiiiiIIII IiiiiiiiIIIII6 = this.iIiIiiiiIiIii.ALLATORIxDEMO();
        ActivityFC IiiiiiiiIIIII7 = null;
        FormulaNum[] formulaNumArray = menuSet2.getBases();
        int n = formulaNumArray.length;
        int n2 = 0;
        while (n2 < n) {
            IiiiiiiiIIIII5 = 0;
            IiiiiiiiIIIII4 = formulaNumArray[n2];
            IiiiiiiiIIIII3 = IiiiiiiiIIIII4.getSize();
            if (IiiiiiiiIIIII5 < IiiiiiiiIIIII3) {
                IiiiiiiiIIIII7 = IiiiiiiiIIIII6.ALLATORIxDEMO((int)IiiiiiiiIIIII4.getZhi(IiiiiiiiIIIII5));
            }
            ++n2;
        }
        if (IiiiiiiiIIIII7 == null) return;
        if (IiiiiiiiIIIII7.getType() != 3) {
            return;
        }
        this.iiiiIiiiIiiII = activity;
        this.IiIIIiiiiIiiI = IiiiiiiiIIIII7;
        IiiiiiiiIIIII4 = (ActivityFCLucky)IiiiiiiiIIIII7.getData();
        ActivityFCBase[] IiiiiiiiIIIII8 = IiiiiiiiIIIII4.getUses();
        ActivityFCBase[] IiiiiiiiIIIII9 = IiiiiiiiIIIII4.getLuckys();
        int IiiiiiiiIIIII10 = 0;
        if (IiiiiiiiIIIII10 < IiiiiiiiIIIII8.length) {
            String IiiiiiiiIIIII11 = null;
            ActivityFCBase IiiiiiiiIIIII12 = IiiiiiiiIIIII8[IiiiiiiiIIIII10];
            if (IiiiiiiiIIIII12.getType() == 1) {
                IiiiiiiiIIIII11 = "\u79ef\u5206";
                IiiiiiiiIIIII2 = new MoneyType(-2, (long)activity.getId() << 32 | (long)IiiiiiiiIIIII12.getId());
                IiiiiiiiIIIII = new MoneyType(-3, (long)activity.getId() << 32 | (long)IiiiiiiiIIIII12.getId());
                this.IiiiiiiiIIIII[0].ALLATORIxDEMO(IiiiiiiiIIIII2);
                this.IiiiiiiiIIIII[1].ALLATORIxDEMO((MoneyType)IiiiiiiiIIIII);
                this.iiiIiiiiiiiIi[2].setText("\u7d2f\u8ba1\u79ef\u5206");
                this.iiiIiiiiiiiIi[3].setText("\u5f53\u524d\u79ef\u5206");
            } else if (IiiiiiiiIIIII12.getType() == 4) {
                IiiiiiiiIIIII11 = IiiiiiiiIIIII12.getKey();
                IiiiiiiiIIIII2 = new MoneyType();
                IiiiiiiiIIIII2.setId(IiiiiiiiIIIII12.getId());
                IiiiiiiiIIIII2.setKey(IiiiiiiiIIIII12.getKey());
                this.IiiiiiiiIIIII[0].ALLATORIxDEMO(null);
                this.IiiiiiiiIIIII[1].ALLATORIxDEMO(IiiiiiiiIIIII2);
                this.iiiIiiiiiiiIi[2].setText("\u7d2f\u8ba1" + IiiiiiiiIIIII11);
                this.iiiIiiiiiiiIi[3].setText("\u5f53\u524d" + IiiiiiiiIIIII11);
            }
            this.iiiIiiiiiiiIi[4].setText("\u6d88\u8017" + IiiiiiiiIIIII12.getNum() + IiiiiiiiIIIII11);
            this.iiiIiiiiiiiIi[5].setText("\u6d88\u8017" + IiiiiiiiIIIII12.getNum() * 10L + IiiiiiiiIIIII11);
        }
        this.IiiiiiiiIIIII[0].iIiIiiiiIIiii();
        this.IiiiiiiiIIIII[1].iIiIiiiiIIiii();
        IiiiiiiiIIIII10 = 459 - IiiiiiiiIIIII9.length * 55;
        IiiiiiiiIIIII5 = 0;
        IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < IiiiiiiiIIIII9.length) {
            IiiiiiiiIIIII2 = IiiiiiiiIIIII9[IiiiiiiiIIIII3];
            IiiiiiiiIIIII = this.ALLATORIxDEMO(IiiiiiiiIIIII5, 1);
            IiiiiiiiIIIII.ALLATORIxDEMO((int)Math.max(0L, IiiiiiiiIIIII2.getNum() - (long)this.ALLATORIxDEMO(IiiiiiiiIIIII3)), (ActivityFCBase)IiiiiiiiIIIII2);
            ++IiiiiiiiIIIII5;
            IiiiiiiiIIIII.setBounds(IiiiiiiiIIIII10 + 110 * IiiiiiiiIIIII3, 178, 102, 99);
            IiiiiiiiIIIII.setVisible(true);
            ++IiiiiiiiIIIII3;
        }
        String IiiiiiiiIIIII22 = this.iIiIiiiiIiIii.ALLATORIxDEMO().ALLATORIxDEMO(menuSet2.getT2());
        if (!IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII22)) {
            int IiiiiiiiIIIII13 = 1 + IIiiIiiiiIIiI.ALLATORIxDEMO((char)'|', (String)IiiiiiiiIIIII22);
            IiiiiiiiIIIII10 = 457 - IiiiiiiiIIIII13 * 35;
            int IiiiiiiiIIIII14 = 0;
            int IiiiiiiiIIIII15 = 0;
            int IiiiiiiiIIIII16 = 0;
            while (IiiiiiiiIIIII16 < IiiiiiiiIIIII22.length()) {
                void IiiiiiiiIIIII17;
                IiiiiiiiIIIII16 = IiiiiiiiIIIII22.indexOf("|", IiiiiiiiIIIII15 + 1);
                if (IiiiiiiiIIIII16 == -1) {
                    IiiiiiiiIIIII16 = IiiiiiiiIIIII22.length();
                }
                Goodstable IiiiiiiiIIIII18 = IiiiiiiiIIIII6.ALLATORIxDEMO(new BigDecimal(IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII22, (int)IiiiiiiiIIIII15, (int)IiiiiiiiIIIII16)));
                iiIIIiiiiiIII iiIIIiiiiiIII2 = this.ALLATORIxDEMO(IiiiiiiiIIIII5, 2);
                IiiiiiiiIIIII17.ALLATORIxDEMO(IiiiiiiiIIIII18);
                ++IiiiiiiiIIIII5;
                IiiiiiiiIIIII17.setBounds(IiiiiiiiIIIII10 + 70 * IiiiiiiiIIIII14, 298, 65, 64);
                IiiiiiiiIIIII17.setVisible(true);
                ++IiiiiiiiIIIII14;
                IiiiiiiiIIIII15 = IiiiiiiiIIIII16 + 1;
            }
        }
        int IiiiiiiiIIIII19 = IiiiiiiiIIIII5;
        while (IiiiiiiiIIIII19 < this.iiIiiiiiiiIii.size()) {
            iiIIIiiiiiIII iiIIIiiiiiIII3 = this.iiIiiiiiiiIii.get(IiiiiiiiIIIII19);
            ++IiiiiiiiIIIII19;
            iiIIIiiiiiIII3.setVisible(false);
        }
        String IiiiiiiiIIIII32 = Agreement.getSendTextAES((String)"activity", (String)(String.valueOf(activity.getId()) + "|S" + IiiiiiiiIIIII7.getId()));
        this.iIiIiiiiIiIii.iiIIiiiiIiIIi.getClient().ALLATORIxDEMO(IiiiiiiiIIIII32);
    }

    public void ALLATORIxDEMO(int[] luckyNums) {
        this.IIiiIiiiIIiIi = luckyNums;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.size()) {
            String IiiiiiiiIIIII2;
            int IiiiiiiiIIIII3;
            iiIIIiiiiiIII IiiiiiiiIIIII4 = this.iiIiiiiiiiIii.get(IiiiiiiiIIIII);
            if (iiIIIiiiiiIII.ALLATORIxDEMO((iiIIIiiiiiIII)IiiiiiiiIIIII4) == 1 && IiiiiiiiIIIII4.isVisible() && (IiiiiiiiIIIII3 = (IiiiiiiiIIIII2 = iiIIIiiiiiIII.ALLATORIxDEMO((iiIIIiiiiiIII)IiiiiiiiIIIII4).getText()).indexOf("/")) != -1) {
                int IiiiiiiiIIIII5 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII2, (int)(IiiiiiiiIIIII3 + 1), (int)IiiiiiiiIIIII2.length());
                iiIIIiiiiiIII.ALLATORIxDEMO((iiIIIiiiiiIII)IiiiiiiiIIIII4).setText(String.valueOf(Math.max(0, IiiiiiiiIIIII5 - this.ALLATORIxDEMO(IiiiiiiiIIIII))) + "/" + IiiiiiiiIIIII5);
            }
            ++IiiiiiiiIIIII;
        }
    }

    public void ALLATORIxDEMO(int id) {
        MoneyType IiiiiiiiIIIII;
        ActivityFCBase IiiiiiiiIIIII2;
        if (id == 131) return;
        if (id != 132 && id != 133) {
            if (id != 134) return;
            String IiiiiiiiIIIII3 = Agreement.getSendTextAES((String)"activity", (String)(String.valueOf(this.iiiiIiiiIiiII.getId()) + "|L" + this.IiIIIiiiiIiiI.getId()));
            this.iIiIiiiiIiIii.iiIIiiiiIiIIi.getClient().ALLATORIxDEMO(IiiiiiiiIIIII3);
            return;
        }
        long IiiiiiiiIIIII4 = id == 132 ? 1 : 10;
        RoleData IiiiiiiiIIIII5 = this.iIiIiiiiIiIii.ALLATORIxDEMO();
        ActivityFCLucky IiiiiiiiIIIII6 = (ActivityFCLucky)this.IiIIIiiiiIiiI.getData();
        ActivityFCBase[] IiiiiiiiIIIII7 = IiiiiiiiIIIII6.getUses();
        int IiiiiiiiIIIII8 = 0;
        while (IiiiiiiiIIIII8 < IiiiiiiiIIIII7.length) {
            IiiiiiiiIIIII2 = IiiiiiiiIIIII7[IiiiiiiiIIIII8];
            if (IiiiiiiiIIIII2.getType() == 1) {
                IiiiiiiiIIIII4 = Math.min(IiiiiiiiIIIII4, IiiiiiiiIIIII5.getActivityMoney(this.iiiiIiiiIiiII.getId(), IiiiiiiiIIIII2.getId()) / IiiiiiiiIIIII2.getNum());
            } else if (IiiiiiiiIIIII2.getType() == 4) {
                IiiiiiiiIIIII = new MoneyType(ActivityFC.getActivityMoneyKey((String)IiiiiiiiIIIII2.getKey()), 0L);
                if (IiiiiiiiIIIII.getId() == 0) {
                    IiiiiiiiIIIII.setKey(IiiiiiiiIIIII2.getKey());
                }
                IiiiiiiiIIIII4 = Math.min(IiiiiiiiIIIII4, IiiiiiiiIIIII5.getMoney(IiiiiiiiIIIII) / IiiiiiiiIIIII2.getNum());
            }
            ++IiiiiiiiIIIII8;
        }
        if (IiiiiiiiIIIII4 <= 0L) {
            this.iIiIiiiiIiIii.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u79ef\u5206\u4e0d\u8db3");
            return;
        }
        IiiiiiiiIIIII8 = 0;
        IiiiiiiiIIIII2 = this.iIiIiiiiIiIii.ALLATORIxDEMO();
        IiiiiiiiIIIII = IiiiiiiiIIIII6.getGains();
        int IiiiiiiiIIIII9 = 0;
        while (IiiiiiiiIIIII9 < ((ActivityFCBase[])IiiiiiiiIIIII).length) {
            MoneyType IiiiiiiiIIIII10 = IiiiiiiiIIIII[IiiiiiiiIIIII9];
            if (IiiiiiiiIIIII10.getType() != 1) {
                if (IiiiiiiiIIIII10.getType() == 2) {
                    Goodstable IiiiiiiiIIIII11 = IiiiiiiiIIIII2.ALLATORIxDEMO(new BigDecimal(IiiiiiiiIIIII10.getId()));
                    IiiiiiiiIIIII8 = (int)((long)IiiiiiiiIIIII8 + (IiiiiiiiIIIII11 == null || !GoodType.ALLATORIxDEMO((Long)IiiiiiiiIIIII11.getType()) ? IiiiiiiiIIIII10.getNum() : 1L));
                } else if (IiiiiiiiIIIII10.getType() == 3) {
                    ++IiiiiiiiIIIII8;
                } else {
                    IiiiiiiiIIIII10.getType();
                }
            }
            ++IiiiiiiiIIIII9;
        }
        if (IiiiiiiiIIIII5.getGoodPackSum(-1L, new BigDecimal(-1), IiiiiiiiIIIII8 = (int)((long)IiiiiiiiIIIII8 * IiiiiiiiIIIII4)) < IiiiiiiiIIIII8) {
            this.iIiIiiiiIiIii.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4f60\u7684\u80cc\u5305\u4e0d\u591f");
            return;
        }
        this.iIiIiiiiIiIii.iiIIiiiiIiIIi.gameTXMask.ALLATORIxDEMO("HDCJ", 2, String.valueOf(this.iiiiIiiiIiiII.getId()) + "|" + this.IiIIIiiiiIiiI.getId() + "|" + IiiiiiiiIIIII4);
    }

    public int ALLATORIxDEMO(int index) {
        if (this.IIiiIiiiIIiIi == null) return 0;
        if (index >= this.IIiiIiiiIIiIi.length) return 0;
        return this.IIiiIiiiIIiIi[index];
    }

    public IiiIiiiiIIIIi(IiiiIiiiiIiIi form) {
        this.setLayout(null);
        this.setBackground(iiIIiiiiIiiII.IIiIiiiiIIiII);
        this.setBounds(0, 0, 745, 452);
        this.iIiIiiiiIiIii = form;
        this.iiIiiiiiiiIii = new ArrayList<iiIIIiiiiiIII>();
        this.ALLATORIxDEMO = new iiIiIiiiIIIiI[4];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            if (IiiiiiiiIIIII == 0) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII] = new iiIiIiiiIIIiI("sc/e/158.png", 1, 131 + IiiiiiiiIIIII, form, (JComponent)((Object)this));
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(670, 57, 25, 25);
            } else if (IiiiiiiiIIIII >= 1 && IiiiiiiiIIIII <= 2) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII] = new iiIiIiiiIIIiI("sc/e/154.png", 1, 131 + IiiiiiiiIIIII, iiIIiiiiIiiII.iiiiIiiiIiiII, null, IiiiiiiiIIIII == 1 ? "\u5355\u62bd\u4e00\u6b21" : "\u8fde\u62bd\u5341\u6b21", form, (JComponent)((Object)this));
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c523425"));
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(423 + (IiiiiiiiIIIII - 1) * 116, 374, 91, 34);
            } else if (IiiiiiiiIIIII == 3) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII] = new iiIiIiiiIIIiI("sc/e/161.png", 1, 131 + IiiiiiiiIIIII, form, (JComponent)((Object)this));
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(640, 380, 60, 42);
            }
            this.add((Component)this.ALLATORIxDEMO[IiiiiiiiIIIII++]);
        }
        this.iiiIiiiiiiiIi = new JLabel[6];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiIiiiiiiiIi.length) {
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)365, (int)(155 + 120 * IiiiiiiiIIIII), (int)179, (int)28, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c6E3D2C"), (Font)iiIIiiiiIiiII.IiiIIiiiiiiiI);
            if (IiiiiiiiIIIII >= 2 && IiiiiiiiIIIII <= 3) {
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(220, 378 + (IiiiiiiiIIIII - 2) * 25, 72, 18);
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iiiiIiiiIiiII);
            } else if (IiiiiiiiIIIII >= 4 && IiiiiiiiIIIII <= 5) {
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(408 + (IiiiiiiiIIIII - 4) * 116, 406, 120, 16);
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iiIiiiiiiIIiI);
            }
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u5927\u5956\u5c55\u793a" : (IiiiiiiiIIIII == 1 ? "\u5956\u6c60\u5c55\u793a" : (IiiiiiiiIIIII == 2 ? "\u7d2f\u8ba1\u79ef\u5206" : (IiiiiiiiIIIII == 3 ? "\u5f53\u524d\u79ef\u5206" : (IiiiiiiiIIIII == 4 ? "\u6d88\u8017100\u79ef\u5206" : (IiiiiiiiIIIII == 5 ? "\u6d88\u80171000\u79ef\u5206" : ""))))));
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setHorizontalAlignment(0);
            this.add(this.iiiIiiiiiiiIi[IiiiiiiiIIIII++]);
        }
        this.IiiiiiiiIIIII = new iiIiIiiiiIiIi[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)291, (int)(371 + 25 * IiiiiiiiIIIII), (int)118, (int)30, (int)0, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, null, (GameView)form.iiIIiiiiIiIIi);
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/124.png", (int)20, (int)10, (int)20, (int)10, (boolean)false));
            this.add((Component)this.IiiiiiiiIIIII[IiiiiiiiIIIII++]);
        }
        this.iIiiIiiiiiiII = new IIIiiiiiIiIiI[3];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiiIiiiiiiII.length) {
            this.iIiiIiiiiiiII[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII == 0) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/125.png");
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(203, 151, 503, 284);
            } else if (IiiiiiiiIIIII >= 1 && IiiiiiiiIIIII <= 2) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/103.png");
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(320, 164 + (IiiiiiiiIIIII - 1) * 120, 278, 11);
            }
            this.add((Component)this.iIiiIiiiiiiII[IiiiiiiiIIIII++]);
        }
    }

    public int ALLATORIxDEMO() {
        if (this.IiIIIiiiiIiiI == null) return 0;
        return this.IiIIIiiiiIiiI.getId();
    }
}
