/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.v.IIiIiiiiiiiII
 *  com.xy.a.v.IiIiIiiiiIiii
 *  com.xy.formula.ActivityMenuSet2
 *  com.xy.formula.FormulaNum
 *  com.xy.formula.GoodType
 *  com.xy.game.RoleData
 *  com.xy.i.iiIiIiiiIIIiI
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIiIIiiiIiiiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Activity
 *  com.xy.readbean.ActivityFC
 *  com.xy.readbean.ActivityFCTarget
 *  com.xy.readbean.ActivityRole
 *  com.xy.richtext.RichLabel
 *  com.xy.socket.Agreement
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.IiiiiiiiiIIII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.v;

import com.xy.a.v.IIiIiiiiiiiII;
import com.xy.a.v.IiIiIiiiiIiii;
import com.xy.formula.ActivityMenuSet2;
import com.xy.formula.FormulaNum;
import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.i.iiIiIiiiIIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIiIIiiiIiiiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Activity;
import com.xy.readbean.ActivityFC;
import com.xy.readbean.ActivityFCTarget;
import com.xy.readbean.ActivityRole;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.IiiiiiiiiIIII;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class iiIIiiiiIiIiI
extends iIiIIiiiIiiiI {
    private RichLabel iiIiIiiiiIIIi;
    private IIIiiiiiIiIiI[] iiiiIiiiIiiII;
    private JScrollPane iiiIiiiiiiiIi;
    private JLabel[] iIiiIiiiiiiII;
    private ActivityMenuSet2 IIiiIiiiIIiIi;
    private com.xy.q.IIIiiiiiIiIiI[] iIiIiiiiIiIii;
    private IiiiIiiiiIiIi IiIIIiiiiIiiI;
    private iiIiIiiiIIIiI iiIiiiiiiiIii;
    private JComponent IiiiiiiiIIIII;
    private Activity ALLATORIxDEMO;

    public iiIIiiiiIiIiI(IiiiIiiiiIiIi form) {
        this.setLayout(null);
        this.setBackground(iiIIiiiiIiiII.IIiIiiiiIIiII);
        this.setBounds(0, 0, 483, 526);
        this.IiIIIiiiiIiiI = form;
        this.iiIiIiiiiIIIi = new RichLabel("", iiIIiiiiIiiII.iIIiiiiiiIIII);
        this.add((Component)this.iiIiIiiiiIIIi);
        this.iiIiiiiiiiIii = new iiIiIiiiIIIiI("sc/e/26.png", 1, 111, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "一键领取", form, (JComponent)((Object)this));
        this.iiIiiiiiiiIii.setFont(iiIIiiiiIiiII.iiiiIiiiIiiII);
        this.iiIiiiiiiiIii.setBounds(338, 146, 99, 25);
        this.add((Component)this.iiIiiiiiiiIii);
        this.iIiIiiiiIiIii = new com.xy.q.IIIiiiiiIiIiI[5];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length) {
            this.iIiIiiiiIiIii[IiiiiiiiIIIII] = new com.xy.q.IIIiiiiiIiIiI(form);
            this.iIiIiiiiIiIii[IiiiiiiiIIIII].ALLATORIxDEMO(com.xy.q.IIIiiiiiIiIiI.iiiiIiiiIIiii);
            this.iIiIiiiiIiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/4.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
            this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(68 + IiiiiiiiIIIII * 52, 134, 50, 50);
            this.add((Component)this.iIiIiiiiIiIii[IiiiiiiiIIIII++]);
        }
        this.iIiiIiiiiiiII = new JLabel[3];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiiIiiiiiiII.length) {
            this.iIiiIiiiiiiII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)231, (int)140, (int)124, (int)19, (Color)Color.white, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.iIiiIiiiiiiII[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "今日任务" : (IiiiiiiiIIIII == 1 ? "今日进度" : (IiiiiiiiIIIII == 2 ? "完成状态" : "")));
            this.iIiiIiiiiiiII[IiiiiiiiIIIII].setHorizontalAlignment(0);
            if (IiiiiiiiIIIII == 0) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(106, 192, 106, 21);
            } else if (IiiiiiiiIIIII == 1) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(251, 192, 106, 21);
            } else if (IiiiiiiiIIIII == 2) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(333, 192, 106, 21);
            }
            this.add(this.iIiiIiiiiiiII[IiiiiiiiIIIII++]);
        }
        this.IiiiiiiiIIIII = new IIiIiiiiiiiII(this);
        this.iiiIiiiiiiiIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)68, (int)212, (int)373, (int)275, (Component)this.IiiiiiiiIIIII, (int)20);
        this.add(this.iiiIiiiiiiiIi);
        this.iiiiIiiiIiiII = new IIIiiiiiIiIiI[4];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiiIiiiIiiII.length) {
            this.iiiiIiiiIiiII[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII == 0) {
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/66.png", (int)80, (int)1, (int)80, (int)1, (boolean)false));
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].setBounds(76, 126, 350, 2);
            } else if (IiiiiiiiIIIII == 1) {
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].setBounds(68, 192, 373, 21);
            } else if (IiiiiiiiIIIII == 2) {
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].setBounds(68, 192, 373, 297);
            } else if (IiiiiiiiIIIII == 3) {
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/36.png", (int)20, (int)20, (int)20, (int)20, (boolean)false));
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].setBounds(55, 66, 400, 434);
            }
            this.add((Component)this.iiiiIiiiIiiII[IiiiiiiiIIIII++]);
        }
    }

    public void ALLATORIxDEMO() {
        JScrollBar IiiiiiiiIIIII = this.iiiIiiiiiiiIi.getVerticalScrollBar();
        IiiiiiiiIIIII.setMaximum(this.IiiiiiiiIIIII.getHeight());
        IiiiiiiiIIIII.setValue(0);
    }

    public IiIiIiiiiIiii ALLATORIxDEMO(int index) {
        if (index < this.IiiiiiiiIIIII.getComponentCount()) {
            return (IiIiIiiiiIiii)this.IiiiiiiiIIIII.getComponent(index);
        }
        IiIiIiiiiIiii IiiiiiiiIIIII = new IiIiIiiiiIiii(this, this.IiIIIiiiiIiiI, this);
        this.IiiiiiiiIIIII.add((Component)IiiiiiiiIIIII);
        return IiiiiiiiIIIII;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void ALLATORIxDEMO(int id, int key) {
        block25: {
            IiiiiiiiIIIII = this.IiIIIiiiiIiiI.ALLATORIxDEMO();
            IiiiiiiiIIIII = this.IiIIIiiiiIiiI.ALLATORIxDEMO();
            if (id != 111) break block25;
            IiiiiiiiIIIII = null;
            IiiiiiiiIIIII = IiiiiiiiIIIII.getGoodPackSum(-1L, new BigDecimal(-1), 999);
            IiiiiiiiIIIII = IiiiiiiiIIIII.getActivity(this.ALLATORIxDEMO.getId());
            IiiiiiiiIIIII = null;
            var12_14 = this.IIiiIiiiIIiIi.getBases();
            var11_15 = var12_14.length;
            var10_16 = 0;
            if (true) ** GOTO lbl70
        }
        if (id != 112) return;
        IiiiiiiiIIIII = IiiiiiiiIIIII.ALLATORIxDEMO(key);
        IiiiiiiiIIIII = 0;
        IiiiiiiiIIIII = ((ActivityFCTarget)IiiiiiiiIIIII.getData()).getGains();
        IiiiiiiiIIIII = 0;
        if (true) ** GOTO lbl89
        do {
            IiiiiiiiIIIII /* !! */  = var12_14[var10_16];
            IiiiiiiiIIIII = 0;
            IiiiiiiiIIIII = IiiiiiiiIIIII /* !! */ .getSize();
            while (IiiiiiiiIIIII < IiiiiiiiIIIII) {
                IiiiiiiiIIIII = (int)IiiiiiiiIIIII /* !! */ .getZhi(IiiiiiiiIIIII);
                IiiiiiiiIIIII = IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII);
                if (IiiiiiiiIIIII != null && IiiiiiiiIIIII.getType() == 2) {
                    v0 = IiiiiiiiIIIII = IiiiiiiiIIIII != null ? IiiiiiiiIIIII.getValueByKey(IiiiiiiiIIIII) : 0L;
                    if (IiiiiiiiIIIII <= 0L && (IiiiiiiiIIIII = (IiiiiiiiIIIII = (ActivityFCTarget)IiiiiiiiIIIII.getData()).getTarget().getType() == 1 ? (IiiiiiiiIIIII != null ? IiiiiiiiIIIII.getValueByKey(IiiiiiiiIIIII.getTarget().getId()) : 0L) : (IiiiiiiiIIIII.getTarget().getType() == 2 ? (long)IiiiiiiiIIIII.getTaskSystem().ALLATORIxDEMO(IiiiiiiiIIIII.getTarget().getId(), 2) : 0L)) >= IiiiiiiiIIIII.getTarget().getNum()) {
                        var24_29 = ((ActivityFCTarget)IiiiiiiiIIIII.getData()).getGains();
                        var23_28 = var24_29.length;
                        var22_27 = 0;
                        while (var22_27 < var23_28) {
                            IiiiiiiiIIIII = var24_29[var22_27];
                            if (IiiiiiiiIIIII.getType() != 1) {
                                if (IiiiiiiiIIIII.getType() == 2) {
                                    IiiiiiiiIIIII = IiiiiiiiIIIII.ALLATORIxDEMO(new BigDecimal(IiiiiiiiIIIII.getId()));
                                    if (IiiiiiiiIIIII == null || !GoodType.ALLATORIxDEMO((Long)IiiiiiiiIIIII.getType())) {
                                        IiiiiiiiIIIII = (int)((long)IiiiiiiiIIIII - IiiiiiiiIIIII.getNum());
                                    } else if (IiiiiiiiIIIII == null || !IiiiiiiiIIIII.contains(IiiiiiiiIIIII.getId())) {
                                        if (IiiiiiiiIIIII.getGoodNum(new BigDecimal(IiiiiiiiIIIII.getId())) == 0) {
                                            --IiiiiiiiIIIII;
                                        }
                                        if (IiiiiiiiIIIII == null) {
                                            IiiiiiiiIIIII = new ArrayList<Integer>();
                                        }
                                        IiiiiiiiIIIII.add(IiiiiiiiIIIII.getId());
                                    }
                                } else if (IiiiiiiiIIIII.getType() == 3) {
                                    --IiiiiiiiIIIII;
                                } else {
                                    IiiiiiiiIIIII.getType();
                                }
                            }
                            ++var22_27;
                        }
                        if (IiiiiiiiIIIII < 0) {
                            if (IiiiiiiiIIIII != null) break;
                            this.IiIIIiiiiIiiI.iiIIiiiiIiIIi.iiiIiiiiiiIIi("你的背包不够");
                            return;
                        }
                        if (IiiiiiiiIIIII == null) {
                            IiiiiiiiIIIII = new StringBuffer();
                            IiiiiiiiIIIII.append(this.ALLATORIxDEMO.getId());
                        }
                        IiiiiiiiIIIII.append("|");
                        IiiiiiiiIIIII.append(IiiiiiiiIIIII.getId());
                    }
                }
                ++IiiiiiiiIIIII;
            }
            ++var10_16;
lbl70:
            // 2 sources

        } while (var10_16 < var11_15);
        if (IiiiiiiiIIIII == null) {
            this.IiIIIiiiiIiiI.iiIIiiiiIiIIi.iiiIiiiiiiIIi("没有可领取的奖励");
            return;
        }
        IiiiiiiiIIIII /* !! */  = Agreement.getSendTextAES((String)"activity", (String)IiiiiiiiIIIII.toString());
        this.IiIIIiiiiIiiI.ALLATORIxDEMO().ALLATORIxDEMO((String)IiiiiiiiIIIII /* !! */ );
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
lbl89:
            // 2 sources

        } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
        if (IiiiiiiiIIIII.getGoodPackSum(-1L, new BigDecimal(-1), IiiiiiiiIIIII) < IiiiiiiiIIIII) {
            this.IiIIIiiiiIiiI.iiIIiiiiIiIIi.iiiIiiiiiiIIi("你的背包不够");
            return;
        }
        IiiiiiiiIIIII = Agreement.getSendTextAES((String)"activity", (String)(String.valueOf(this.ALLATORIxDEMO.getId()) + "|" + IiiiiiiiIIIII.getId()));
        this.IiIIIiiiiIiiI.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
    }

    static /* synthetic */ IiiiIiiiiIiIi ALLATORIxDEMO(iiIIiiiiIiIiI arg0) {
        return arg0.IiIIIiiiiIiiI;
    }

    static /* synthetic */ Activity ALLATORIxDEMO(iiIIiiiiIiIiI arg0) {
        return arg0.ALLATORIxDEMO;
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(Activity activity, ActivityMenuSet2 menuSet2) {
        Object IiiiiiiiIIIII;
        this.ALLATORIxDEMO = activity;
        this.IIiiIiiiIIiIi = menuSet2;
        RoleData IiiiiiiiIIIII2 = this.IiIIIiiiiIiiI.ALLATORIxDEMO();
        IiiiiiiiiIIII IiiiiiiiIIIII3 = this.IiIIIiiiiIiiI.ALLATORIxDEMO();
        String IiiiiiiiIIIII4 = IiiiiiiiIIIII3.ALLATORIxDEMO(menuSet2.getT1());
        this.iiIiIiiiiIIIi.setTextSize(IiiiiiiiIIIII4, 380);
        this.iiIiIiiiiIIIi.setBounds(68, 71, this.iiIiIiiiiIIIi.getWidth(), this.iiIiIiiiiIIIi.getHeight());
        int IiiiiiiiIIIII5 = 0;
        IiiiiiiiIIIII4 = this.IiIIIiiiiIiiI.ALLATORIxDEMO().ALLATORIxDEMO(menuSet2.getT2());
        int IiiiiiiiIIIII6 = 0;
        int IiiiiiiiIIIII7 = 0;
        int IiiiiiiiIIIII8 = IiiiiiiiIIIII4 != null ? IiiiiiiiIIIII4.length() : 0;
        while (IiiiiiiiIIIII7 < IiiiiiiiIIIII8) {
            IiiiiiiiIIIII7 = IiiiiiiiIIIII4.indexOf("|", IiiiiiiiIIIII6 + 1);
            if (IiiiiiiiIIIII7 == -1) {
                IiiiiiiiIIIII7 = IiiiiiiiIIIII8;
            }
            if ((IiiiiiiiIIIII = IiiiiiiiIIIII3.ALLATORIxDEMO(new BigDecimal(IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII4, (int)IiiiiiiiIIIII6, (int)IiiiiiiiIIIII7)))) != null) {
                com.xy.q.IIIiiiiiIiIiI iIIiiiiiIiIiI = this.iIiIiiiiIiIii[IiiiiiiiIIIII5];
                ++IiiiiiiiIIIII5;
                iIIiiiiiIiIiI.ALLATORIxDEMO(1, IiiiiiiiIIIII);
            }
            IiiiiiiiIIIII6 = IiiiiiiiIIIII7 + 1;
        }
        while (IiiiiiiiIIIII5 < this.iIiIiiiiIiIii.length) {
            com.xy.q.IIIiiiiiIiIiI iIIiiiiiIiIiI = this.iIiIiiiiIiIii[IiiiiiiiIIIII5];
            ++IiiiiiiiIIIII5;
            iIIiiiiiIiIiI.ALLATORIxDEMO(0, null);
        }
        IiiiiiiiIIIII6 = 0;
        IiiiiiiiIIIII7 = 0;
        IiiiiiiiIIIII8 = 0;
        IiiiiiiiIIIII = null;
        ActivityRole IiiiiiiiIIIII9 = IiiiiiiiIIIII2.getActivity(activity.getId());
        FormulaNum[] formulaNumArray = menuSet2.getBases();
        int n = formulaNumArray.length;
        int n2 = 0;
        while (n2 < n) {
            FormulaNum IiiiiiiiIIIII10 = formulaNumArray[n2];
            int IiiiiiiiIIIII11 = 0;
            int IiiiiiiiIIIII12 = IiiiiiiiIIIII10.getSize();
            while (IiiiiiiiIIIII11 < IiiiiiiiIIIII12) {
                int IiiiiiiiIIIII13 = (int)IiiiiiiiIIIII10.getZhi(IiiiiiiiIIIII11);
                ActivityFC IiiiiiiiIIIII14 = IiiiiiiiIIIII3.ALLATORIxDEMO(IiiiiiiiIIIII13);
                if (IiiiiiiiIIIII14 != null && IiiiiiiiIIIII14.getType() == 2) {
                    long IiiiiiiiIIIII15;
                    long l = IiiiiiiiIIIII15 = IiiiiiiiIIIII9 != null ? IiiiiiiiIIIII9.getValueByKey(IiiiiiiiIIIII13) : 0L;
                    if (IiiiiiiiIIIII15 > 0L) {
                        if (IiiiiiiiIIIII == null) {
                            IiiiiiiiIIIII = new ArrayList();
                        }
                        IiiiiiiiIIIII.add(IiiiiiiiIIIII14);
                    } else {
                        void IiiiiiiiIIIII16;
                        ActivityFCTarget IiiiiiiiIIIII17 = (ActivityFCTarget)IiiiiiiiIIIII14.getData();
                        IiiiiiiiIIIII15 = IiiiiiiiIIIII17.getTarget().getType() == 1 ? (IiiiiiiiIIIII9 != null ? IiiiiiiiIIIII9.getValueByKey(IiiiiiiiIIIII17.getTarget().getId()) : 0L) : (IiiiiiiiIIIII17.getTarget().getType() == 2 ? (long)IiiiiiiiIIIII2.getTaskSystem().ALLATORIxDEMO(IiiiiiiiIIIII17.getTarget().getId(), 2) : 0L);
                        IiiiiiiiIIIII15 = Math.min(IiiiiiiiIIIII17.getTarget().getNum(), IiiiiiiiIIIII15);
                        IiIiIiiiiIiii iiIiIiiiiIiii = this.ALLATORIxDEMO(IiiiiiiiIIIII6);
                        IiiiiiiiIIIII16.ALLATORIxDEMO(IiiiiiiiIIIII14, false, IiiiiiiiIIIII15);
                        int n3 = IiiiiiiiIIIII6 * 55;
                        ++IiiiiiiiIIIII6;
                        IiiiiiiiIIIII16.setBounds(0, n3, 360, 55);
                        IiiiiiiiIIIII16.setVisible(true);
                        IiiiiiiiIIIII8 = IiiiiiiiIIIII16.getY() + IiiiiiiiIIIII16.getHeight();
                    }
                }
                ++IiiiiiiiIIIII11;
            }
            ++n2;
        }
        int IiiiiiiiIIIII18 = 0;
        int IiiiiiiiIIIII19 = IiiiiiiiIIIII != null ? IiiiiiiiIIIII.size() : 0;
        while (IiiiiiiiIIIII18 < IiiiiiiiIIIII19) {
            ActivityFC IiiiiiiiIIIII20 = (ActivityFC)IiiiiiiiIIIII.get(IiiiiiiiIIIII18);
            ActivityFCTarget IiiiiiiiIIIII21 = (ActivityFCTarget)IiiiiiiiIIIII20.getData();
            IiIiIiiiiIiii IiiiiiiiIIIII11 = this.ALLATORIxDEMO(IiiiiiiiIIIII6);
            IiiiiiiiIIIII11.ALLATORIxDEMO(IiiiiiiiIIIII20, true, IiiiiiiiIIIII21.getTarget().getNum());
            int n4 = IiiiiiiiIIIII6 * 55;
            ++IiiiiiiiIIIII6;
            IiiiiiiiIIIII11.setBounds(0, n4, 360, 55);
            IiiiiiiiIIIII11.setVisible(true);
            ++IiiiiiiiIIIII18;
            IiiiiiiiIIIII8 = IiiiiiiiIIIII11.getY() + IiiiiiiiIIIII11.getHeight();
        }
        IiiiiiiiIIIII18 = IiiiiiiiIIIII6;
        while (IiiiiiiiIIIII18 < this.IiiiiiiiIIIII.getComponentCount()) {
            IiIiIiiiiIiii iiIiIiiiiIiii = (IiIiIiiiiIiii)this.IiiiiiiiIIIII.getComponent(IiiiiiiiIIIII18);
            ++IiiiiiiiIIIII18;
            IiIiIiiiiIiii IiiiiiiiIIIII22 = iiIiIiiiiIiii;
            IiiiiiiiIIIII22.ALLATORIxDEMO();
        }
        this.IiiiiiiiIIIII.setPreferredSize(new Dimension(IiiiiiiiIIIII7, IiiiiiiiIIIII8));
        this.ALLATORIxDEMO();
    }
}
