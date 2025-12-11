/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.v.iIiIIiiiIIIiI
 *  com.xy.a.v.iIiIIiiiIIiIi
 *  com.xy.formula.ActivityMenuSet2
 *  com.xy.formula.FormulaNum
 *  com.xy.formula.GoodType
 *  com.xy.i.iiIiIiiiIIIiI
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIiIIiiiIiiiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Activity
 *  com.xy.readbean.ActivityFC
 *  com.xy.readbean.ActivityFCBase
 *  com.xy.readbean.ActivityFCTarget
 *  com.xy.readbean.ActivityRole
 *  com.xy.richtext.RichLabel
 *  com.xy.socket.Agreement
 *  com.xy.v.IiiiiiiiiIIII
 *  com.xy.v.iiIiIiiiiIiii
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIiiIi
 */
package com.xy.a.v;

import com.xy.a.v.iIiIIiiiIIIiI;
import com.xy.a.v.iIiIIiiiIIiIi;
import com.xy.formula.ActivityMenuSet2;
import com.xy.formula.FormulaNum;
import com.xy.formula.GoodType;
import com.xy.i.iiIiIiiiIIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIiIIiiiIiiiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Activity;
import com.xy.readbean.ActivityFC;
import com.xy.readbean.ActivityFCBase;
import com.xy.readbean.ActivityFCTarget;
import com.xy.readbean.ActivityRole;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.v.IiiiiiiiiIIII;
import com.xy.v.iiIiIiiiiIiii;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.IIiIiiiiIiiIi;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.math.BigDecimal;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IIIiIiiiiIIiI
extends iIiIIiiiIiiiI {
    private RichLabel IIIIiiiiiiiII;
    private IiiiIiiiiIiIi iiIIIiiiiiiiI;
    private iiIiIiiiIIIiI[] IiIiiiiiIIIII;
    private com.xy.q.IIIiiiiiIiIiI[] iiIiIiiiiIIIi;
    private JScrollPane iiiiIiiiIiiII;
    private JComponent iiiIiiiiiiiIi;
    private JLabel[] iIiiIiiiiiiII;
    private ActivityMenuSet2 IIiiIiiiIIiIi;
    private Activity iIiIiiiiIiIii;
    private int IiIIIiiiiIiiI;
    private IIIiiiiiIiIiI[] iiIiiiiiiiIii;
    private ActivityFC IiiiiiiiIIIII;
    private int ALLATORIxDEMO;

    public void iiiIiiiiiiIIi(int page) {
        ActivityRole IiiiiiiiIIIII = this.iiIIIiiiiiiiI.ALLATORIxDEMO().getActivity(this.iIiIiiiiIiIii.getId());
        IiiiiiiiiIIII IiiiiiiiIIIII2 = this.iiIIIiiiiiiiI.ALLATORIxDEMO();
        this.ALLATORIxDEMO = Math.max(0, Math.min(page, this.IiIIIiiiiIiiI));
        int IiiiiiiiIIIII3 = -page;
        FormulaNum[] formulaNumArray = this.IIiiIiiiIIiIi.getBases();
        int n = formulaNumArray.length;
        int n2 = 0;
        while (n2 < n) {
            FormulaNum IiiiiiiiIIIII4 = formulaNumArray[n2];
            int IiiiiiiiIIIII5 = IiiiiiiiIIIII4.getSize();
            if (IiiiiiiiIIIII3 + IiiiiiiiIIIII5 < 0) {
                IiiiiiiiIIIII3 += IiiiiiiiIIIII5;
            } else {
                int IiiiiiiiIIIII6 = 0;
                while (IiiiiiiiIIIII6 < IiiiiiiiIIIII5 && IiiiiiiiIIIII3 < this.iiIiIiiiiIIIi.length) {
                    if (IiiiiiiiIIIII3 >= 0) {
                        int IiiiiiiiIIIII7 = (int)IiiiiiiiIIIII4.getZhi(IiiiiiiiIIIII6);
                        ActivityFCTarget IiiiiiiiIIIII8 = (ActivityFCTarget)IiiiiiiiIIIII2.ALLATORIxDEMO(IiiiiiiiIIIII7).getData();
                        long IiiiiiiiIIIII9 = IiiiiiiiIIIII != null ? IiiiiiiiIIIII.getValueByKey(IiiiiiiiIIIII7) : 0L;
                        this.iiIiIiiiiIIIi[IiiiiiiiIIIII3].ALLATORIxDEMO(22, (Object)IiiiiiiiIIIII2.ALLATORIxDEMO(IiiiiiiiIIIII8.getT2()));
                        this.iiIiIiiiiIIIi[IiiiiiiiIIIII3].ALLATORIxDEMO((long)IiiiiiiiIIIII7);
                        this.iiIiIiiiiIIIi[IiiiiiiiIIIII3].iIiIiiiiIIiii(IiiiiiiiIIIII9 > 0L ? "sc/d/117.png" : "sc/d/116.png");
                        String IiiiiiiiIIIII10 = IiiiiiiiIIIII2.ALLATORIxDEMO(IiiiiiiiIIIII8.getT1());
                        int IiiiiiiiIIIII11 = IiiiiiiiIIIII10.indexOf("|");
                        if (IiiiiiiiIIIII11 == -1) {
                            this.iIiiIiiiiiiII[IiiiiiiiIIIII3].setText(IiiiiiiiIIIII10);
                            this.iIiiIiiiiiiII[IiiiiiiiIIIII3 + 6].setText("");
                        } else {
                            this.iIiiIiiiiiiII[IiiiiiiiIIIII3].setText(IiiiiiiiIIIII10.substring(0, IiiiiiiiIIIII11));
                            this.iIiiIiiiiiiII[IiiiiiiiIIIII3 + 6].setText(IiiiiiiiIIIII10.substring(IiiiiiiiIIIII11 + 1));
                        }
                    }
                    ++IiiiiiiiIIIII6;
                    ++IiiiiiiiIIIII3;
                }
            }
            ++n2;
        }
        int IiiiiiiiIIIII12 = Math.max(0, IiiiiiiiIIIII3);
        while (IiiiiiiiIIIII12 < this.iiIiIiiiiIIIi.length) {
            this.iiIiIiiiiIIIi[IiiiiiiiIIIII12].iiiIiiiiiiIIi();
            this.iIiiIiiiiiiII[IiiiiiiiIIIII12].setText("");
            int n3 = IiiiiiiiIIIII12 + 6;
            ++IiiiiiiiIIIII12;
            this.iIiiIiiiiiiII[n3].setText("");
        }
        this.IiIiiiiiIIIII[1].setVisible(this.IiIIIiiiiIiiI > 0);
        this.IiIiiiiiIIIII[2].setVisible(this.IiIIIiiiiIiiI > 0);
    }

    public IIIiIiiiiIIiI(IiiiIiiiiIiIi form) {
        this.setLayout(null);
        this.setBackground(iiIIiiiiIiiII.IIiIiiiiIIiII);
        this.setBounds(0, 0, 483, 526);
        this.iiIIIiiiiiiiI = form;
        this.IiIiiiiiIIIII = new iiIiIiiiIIIiI[3];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIiiiiiIIIII.length) {
            if (IiiiiiiiIIIII == 0) {
                this.IiIiiiiiIIIII[IiiiiiiiIIIII] = new iiIiIiiiIIIiI("sc/e/31.png", 1, 121, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "领取", form, (JComponent)((Object)this));
                this.IiIiiiiiIIIII[IiiiiiiiIIIII].setBounds(357, 260, 79, 25);
            } else if (IiiiiiiiIIIII == 1) {
                this.IiIiiiiiIIIII[IiiiiiiiIIIII] = new iiIiIiiiIIIiI("sc/e/156.png", 1, 122, form, (JComponent)((Object)this));
                this.IiIiiiiiIIIII[IiiiiiiiIIIII].setBounds(58, 172, 18, 25);
            } else if (IiiiiiiiIIIII == 2) {
                this.IiIiiiiiIIIII[IiiiiiiiIIIII] = new iiIiIiiiIIIiI("sc/e/155.png", 1, 123, form, (JComponent)((Object)this));
                this.IiIiiiiiIIIII[IiiiiiiiIIIII].setBounds(434, 172, 18, 25);
            }
            this.add((Component)this.IiIiiiiiIIIII[IiiiiiiiIIIII++]);
        }
        this.iiIiIiiiiIIIi = new com.xy.q.IIIiiiiiIiIiI[6];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiIiiiiIIIi.length) {
            this.iiIiIiiiiIIIi[IiiiiiiiIIIII] = new com.xy.q.IIIiiiiiIiIiI(form);
            this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setBounds(70 + IiiiiiiiIIIII * 62, 135, 55, 53);
            this.add((Component)this.iiIiIiiiiIIIi[IiiiiiiiIIIII++]);
        }
        this.IIIIiiiiiiiII = new RichLabel("", iiIIiiiiIiiII.iIIiiiiiiIIII);
        this.add((Component)this.IIIIiiiiiiiII);
        this.iIiiIiiiiiiII = new JLabel[18];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiiIiiiiiiII.length) {
            if (IiiiiiiiIIIII >= 0 && IiiiiiiiIIIII <= 5) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)(70 + 62 * IiiiiiiiIIIII), (int)185, (int)58, (int)14, (Color)Color.black, (Font)iiIIiiiiIiiII.iIIiiiiiiIIII);
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setHorizontalAlignment(0);
            } else if (IiiiiiiiIIIII >= 6 && IiiiiiiiIIIII <= 11) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)(70 + 62 * (IiiiiiiiIIIII - 6)), (int)199, (int)58, (int)14, (Color)Color.black, (Font)iiIIiiiiIiiII.iIIiiiiiiIIII);
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setHorizontalAlignment(0);
            } else if (IiiiiiiiIIIII == 12) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)71, (int)229, (int)70, (int)19, (Color)Color.black, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setText("目标进度");
            } else if (IiiiiiiiIIIII >= 13 && IiiiiiiiIIIII <= 14) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)(71 + (IiiiiiiiIIIII - 13) * 140), (int)261, (int)70, (int)19, (Color)Color.black, (Font)iiIIiiiiIiiII.iIIiiiiiiIIII);
            } else if (IiiiiiiiIIIII >= 15 && IiiiiiiiIIIII <= 16) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)(133 + (IiiiiiiiIIIII - 15) * 140), (int)261, (int)70, (int)19, (Color)Color.black, (Font)iiIIiiiiIiiII.IiiiiiiiIIIII);
            } else if (IiiiiiiiIIIII == 17) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)68, (int)300, (int)373, (int)21, (Color)Color.white, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setHorizontalAlignment(0);
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setText("目标达成奖励");
            }
            this.add(this.iIiiIiiiiiiII[IiiiiiiiIIIII++]);
        }
        this.iIiiIiiiiiiII[13].setText("当前进度");
        this.iIiiIiiiiiiII[14].setText("目标进度");
        this.iiiIiiiiiiiIi = new iIiIIiiiIIiIi(this);
        this.iiiiIiiiIiiII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)68, (int)320, (int)373, (int)161, (Component)this.iiiIiiiiiiiIi, (int)20);
        this.add(this.iiiiIiiiIiiII);
        this.iiIiiiiiiiIii = new IIIiiiiiIiIiI[16];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII == 0) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/60.png", (int)80, (int)1, (int)80, (int)1, (boolean)false));
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(67, 126, 377, 7);
            } else if (IiiiiiiiIIIII >= 1 && IiiiiiiiIIIII <= 5) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/120.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(131 + (IiiiiiiiIIIII - 1) * 62, 139, 1, 47);
            } else if (IiiiiiiiIIIII >= 6 && IiiiiiiiIIIII <= 10) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/119.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(126 + (IiiiiiiiIIIII - 6) * 62, 192, 12, 14);
            } else if (IiiiiiiiIIIII == 11) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/121.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(145, 233, 290, 11);
            } else if (IiiiiiiiIIIII == 12) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(144, 232, 292, 13);
            } else if (IiiiiiiiIIIII == 13) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(68, 300, 373, 21);
            } else if (IiiiiiiiIIIII == 14) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(68, 300, 373, 183);
            } else if (IiiiiiiiIIIII == 15) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/36.png", (int)20, (int)20, (int)20, (int)20, (boolean)false));
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(55, 66, 400, 434);
            }
            this.add((Component)this.iiIiiiiiiiIii[IiiiiiiiIIIII++]);
        }
    }

    public void ALLATORIxDEMO(Activity activity, ActivityMenuSet2 menuSet2) {
        this.iIiIiiiiIiIii = activity;
        this.IIiiIiiiIIiIi = menuSet2;
        ActivityRole IiiiiiiiIIIII = this.iiIIIiiiiiiiI.ALLATORIxDEMO().getActivity(activity.getId());
        String IiiiiiiiIIIII2 = this.iiIIIiiiiiiiI.ALLATORIxDEMO().ALLATORIxDEMO(menuSet2.getT1());
        this.IIIIiiiiiiiII.setTextSize(IiiiiiiiIIIII2, 380);
        this.IIIIiiiiiiiII.setBounds(68, 71, this.IIIIiiiiiiiII.getWidth(), this.IIIIiiiiiiiII.getHeight());
        int IiiiiiiiIIIII3 = 0;
        int IiiiiiiiIIIII4 = 0;
        int IiiiiiiiIIIII5 = 0;
        FormulaNum[] formulaNumArray = menuSet2.getBases();
        int n = formulaNumArray.length;
        int n2 = 0;
        while (n2 < n) {
            FormulaNum IiiiiiiiIIIII6 = formulaNumArray[n2];
            int IiiiiiiiIIIII7 = IiiiiiiiIIIII6.getSize();
            int IiiiiiiiIIIII8 = 0;
            while (IiiiiiiiIIIII8 < IiiiiiiiIIIII7) {
                long IiiiiiiiIIIII9;
                int IiiiiiiiIIIII10 = (int)IiiiiiiiIIIII6.getZhi(IiiiiiiiIIIII8);
                long l = IiiiiiiiIIIII9 = IiiiiiiiIIIII != null ? IiiiiiiiIIIII.getValueByKey(IiiiiiiiIIIII10) : 0L;
                if (IiiiiiiiIIIII3 == 0 || IiiiiiiiIIIII9 == 0L && IiiiiiiiIIIII3 == 0) {
                    IiiiiiiiIIIII4 = IiiiiiiiIIIII5 + IiiiiiiiIIIII8;
                    IiiiiiiiIIIII3 = IiiiiiiiIIIII10;
                }
                ++IiiiiiiiIIIII8;
            }
            ++n2;
            IiiiiiiiIIIII5 += IiiiiiiiIIIII7;
        }
        this.IiIIIiiiiIiiI = IiiiiiiiIIIII5 > this.iiIiIiiiiIIIi.length ? IiiiiiiiIIIII5 - this.iiIiIiiiiIIIi.length : 0;
        this.iiiIiiiiiiIIi(Math.min(this.IiIIIiiiiIiiI, IiiiiiiiIIIII4));
        this.ALLATORIxDEMO(IiiiiiiiIIIII3);
    }

    /*
     * Unable to fully structure code
     */
    public void iIiIiiiiIIiii(int id) {
        block11: {
            if (id != 121) break block11;
            if (this.IiiiiiiiIIIII == null) {
                return;
            }
            IiiiiiiiIIIII = this.iiIIIiiiiiiiI.ALLATORIxDEMO();
            IiiiiiiiIIIII = 0;
            IiiiiiiiIIIII = this.iiIIIiiiiiiiI.ALLATORIxDEMO();
            IiiiiiiiIIIII = ((ActivityFCTarget)this.IiiiiiiiIIIII.getData()).getGains();
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl33
        }
        if (id == 122) {
            if (this.ALLATORIxDEMO <= 0) {
                return;
            }
            this.iiiIiiiiiiIIi(this.ALLATORIxDEMO - 1);
            return;
        }
        if (id != 123) return;
        if (this.ALLATORIxDEMO >= this.IiIIIiiiiIiiI) {
            return;
        }
        this.iiiIiiiiiiIIi(this.ALLATORIxDEMO + 1);
        return;
        do {
            if ((IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII]).getType() != 1) {
                if (IiiiiiiiIIIII.getType() == 2) {
                    IiiiiiiiIIIII = IiiiiiiiIIIII.ALLATORIxDEMO(new BigDecimal(IiiiiiiiIIIII.getId()));
                    IiiiiiiiIIIII = (int)((long)IiiiiiiiIIIII + (IiiiiiiiIIIII == null || GoodType.ALLATORIxDEMO((Long)IiiiiiiiIIIII.getType()) == false ? IiiiiiiiIIIII.getNum() : 1L));
                } else if (IiiiiiiiIIIII.getType() == 3) {
                    ++IiiiiiiiIIIII;
                } else {
                    IiiiiiiiIIIII.getType();
                }
            }
            ++IiiiiiiiIIIII;
lbl33:
            // 2 sources

        } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
        if (IiiiiiiiIIIII.getGoodPackSum(-1L, new BigDecimal(-1), IiiiiiiiIIIII) < IiiiiiiiIIIII) {
            this.iiIIIiiiiiiiI.iiIIiiiiIiIIi.iiiIiiiiiiIIi("你的背包不够");
            return;
        }
        IiiiiiiiIIIII = Agreement.getSendTextAES((String)"activity", (String)(String.valueOf(this.iIiIiiiiIiIii.getId()) + "|" + this.IiiiiiiiIIIII.getId()));
        this.iiIIIiiiiiiiI.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(int id) {
        double d;
        long IiiiiiiiIIIII;
        void IiiiiiiiIIIII2;
        if (id == 0) {
            return;
        }
        IiiiiiiiiIIII iiiiiiiiiIIII = this.iiIIIiiiiiiiI.ALLATORIxDEMO();
        ActivityRole IiiiiiiiIIIII3 = this.iiIIIiiiiiiiI.ALLATORIxDEMO().getActivity(this.iIiIiiiiIiIii.getId());
        this.IiiiiiiiIIIII = IiiiiiiiIIIII2.ALLATORIxDEMO(id);
        ActivityFCTarget IiiiiiiiIIIII4 = (ActivityFCTarget)this.IiiiiiiiIIIII.getData();
        long IiiiiiiiIIIII5 = 0L;
        IiiiiiiiIIIII5 = IiiiiiiiIIIII4.getTarget().getType() == 1 ? (IiiiiiiiIIIII3 != null ? IiiiiiiiIIIII3.getValueByKey(IiiiiiiiIIIII4.getTarget().getId()) : 0L) : (IiiiiiiiIIIII4.getTarget().getType() == 2 ? (long)this.iiIIIiiiiiiiI.ALLATORIxDEMO().getTaskSystem().ALLATORIxDEMO(IiiiiiiiIIIII4.getTarget().getId(), 2) : 0L);
        this.iIiiIiiiiiiII[15].setText(String.valueOf(IiiiiiiiIIIII5));
        this.iIiiIiiiiiiII[16].setText(String.valueOf(IiiiiiiiIIIII4.getTarget().getNum()));
        double IiiiiiiiIIIII6 = (double)IiiiiiiiIIIII5 / (double)IiiiiiiiIIIII4.getTarget().getNum();
        long l = IiiiiiiiIIIII = IiiiiiiiIIIII3 != null ? IiiiiiiiIIIII3.getValueByKey(id) : 0L;
        if (IiiiiiiiIIIII > 0L) {
            d = IiiiiiiiIIIII6;
            this.IiIiiiiiIIIII[0].setBtn(0);
            this.IiIiiiiiIIIII[0].setText("已领取");
        } else if (IiiiiiiiIIIII5 >= IiiiiiiiIIIII4.getTarget().getNum()) {
            this.IiIiiiiiIIIII[0].setBtn(1);
            d = IiiiiiiiIIIII6;
            this.IiIiiiiiIIIII[0].setText("领取");
        } else {
            this.IiIiiiiiIIIII[0].setBtn(0);
            d = IiiiiiiiIIIII6;
            this.IiIiiiiiIIIII[0].setText("未达成");
        }
        IiiiiiiiIIIII6 = d * 290.0;
        IiiiiiiiIIIII6 = Math.min(290.0, IiiiiiiiIIIII6);
        IiiiiiiiIIIII6 = Math.max(0.0, IiiiiiiiIIIII6);
        this.iiIiiiiiiiIii[11].setBounds(145, 233, (int)IiiiiiiiIIIII6, 11);
        int IiiiiiiiIIIII7 = 0;
        int IiiiiiiiIIIII8 = 360;
        int IiiiiiiiIIIII9 = 0;
        ActivityFCBase[] IiiiiiiiIIIII10 = IiiiiiiiIIIII4.getGains();
        int IiiiiiiiIIIII11 = 0;
        while (IiiiiiiiIIIII11 < IiiiiiiiIIIII10.length) {
            block13: {
                iIiIIiiiIIIiI IiiiiiiiIIIII12;
                block11: {
                    ActivityFCBase IiiiiiiiIIIII13;
                    block14: {
                        block12: {
                            iiIiIiiiiIiii IiiiiiiiIIIII14;
                            block10: {
                                IiiiiiiiIIIII12 = this.ALLATORIxDEMO(IiiiiiiiIIIII7);
                                IiiiiiiiIIIII13 = IiiiiiiiIIIII10[IiiiiiiiIIIII11];
                                if (IiiiiiiiIIIII13.getType() != 1) break block10;
                                IiiiiiiiIIIII14 = this.iIiIiiiiIiIii.getPointKey(IiiiiiiiIIIII13.getId());
                                IiiiiiiiIIIII12.ALLATORIxDEMO(22, (Object)(String.valueOf(IiiiiiiiIIIII13.getNum()) + (IiiiiiiiIIIII14 != null ? IiiiiiiiIIIII14.IiiiiiiiIIIII : "未知积分")));
                                IiiiiiiiIIIII12.ALLATORIxDEMO(IIiIiiiiIiiIi.iiiiiiiiIIiii((String)"903"));
                                IiiiiiiiIIIII12.iiiIiiiiiiIIi("");
                                break block11;
                            }
                            if (IiiiiiiiIIIII13.getType() != 2) break block12;
                            IiiiiiiiIIIII14 = IiiiiiiiIIIII2.ALLATORIxDEMO(new BigDecimal(IiiiiiiiIIIII13.getId()));
                            if (IiiiiiiiIIIII14 == null) break block13;
                            IiiiiiiiIIIII12.ALLATORIxDEMO(1, (Object)IiiiiiiiIIIII14);
                            IiiiiiiiIIIII12.iiiIiiiiiiIIi(String.valueOf(IiiiiiiiIIIII13.getNum()));
                            break block11;
                        }
                        if (IiiiiiiiIIIII13.getType() != 3) break block14;
                        IiiiiiiiIIIII12.ALLATORIxDEMO(22, (Object)"随机奖励");
                        IiiiiiiiIIIII12.ALLATORIxDEMO(IIiIiiiiIiiIi.iiiiiiiiIIiii((String)"903"));
                        IiiiiiiiIIIII12.iiiIiiiiiiIIi("");
                        break block11;
                    }
                    if (IiiiiiiiIIIII13.getType() != 4) break block13;
                    IiiiiiiiIIIII12.ALLATORIxDEMO(22, (Object)(String.valueOf(IiiiiiiiIIIII13.getNum()) + IiiiiiiiIIIII13.getKey()));
                    IiiiiiiiIIIII12.ALLATORIxDEMO(IIiIiiiiIiiIi.iiiiiiiiIIiii((String)"903"));
                    IiiiiiiiIIIII12.iiiIiiiiiiIIi("");
                }
                IiiiiiiiIIIII12.setBounds(15 + IiiiiiiiIIIII7 % 6 * 56, 20 + IiiiiiiiIIIII7 / 6 * 56, 50, 50);
                int n = IiiiiiiiIIIII7 / 6;
                ++IiiiiiiiIIIII7;
                IiiiiiiiIIIII9 = 90 + n * 56;
            }
            ++IiiiiiiiIIIII11;
        }
        IiiiiiiiIIIII11 = IiiiiiiiIIIII7;
        while (IiiiiiiiIIIII11 < this.iiiIiiiiiiiIi.getComponentCount()) {
            this.iiiIiiiiiiiIi.getComponent(IiiiiiiiIIIII11++).setVisible(false);
        }
        this.iiiIiiiiiiiIi.setPreferredSize(new Dimension(IiiiiiiiIIIII8, IiiiiiiiIIIII9));
        this.ALLATORIxDEMO();
    }

    /*
     * WARNING - void declaration
     */
    public iIiIIiiiIIIiI ALLATORIxDEMO(int index) {
        void IiiiiiiiIIIII;
        if (index < this.iiiIiiiiiiiIi.getComponentCount()) {
            return (iIiIIiiiIIIiI)this.iiiIiiiiiiiIi.getComponent(index);
        }
        iIiIIiiiIIIiI iIiIIiiiIIIiI2 = new iIiIIiiiIIIiI(this, this.iiIIIiiiiiiiI);
        iIiIIiiiIIIiI2.ALLATORIxDEMO(com.xy.q.IIIiiiiiIiIiI.iIiiIiiiiiiII);
        iIiIIiiiIIIiI2.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/4.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.iiiIiiiiiiiIi.add((Component)IiiiiiiiIIIII);
        return IiiiiiiiIIIII;
    }

    public void ALLATORIxDEMO() {
        JScrollBar IiiiiiiiIIIII = this.iiiiIiiiIiiII.getVerticalScrollBar();
        IiiiiiiiIIIII.setMaximum(this.iiiIiiiiiiiIi.getHeight());
        IiiiiiiiIIIII.setValue(0);
    }
}
