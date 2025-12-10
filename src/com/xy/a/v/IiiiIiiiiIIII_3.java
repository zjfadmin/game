/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.IiIIIiiiiiiII
 *  com.xy.a.v.IiIiiiiiIIIiI
 *  com.xy.a.v.IiiIiiiiIIIiI
 *  com.xy.a.v.iiiiiiiiIIIII
 *  com.xy.bean.ChongjipackBean
 *  com.xy.bean.UseCardBean
 *  com.xy.formula.ActivityMenuSet2
 *  com.xy.formula.FormulaNum
 *  com.xy.i.iiIiIiiiIIIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIiIIiiiIiiiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Activity
 *  com.xy.readbean.ActivityFC
 *  com.xy.readbean.ActivityFCBuy
 *  com.xy.readbean.ActivityFCTarget
 *  com.xy.richtext.RichLabel
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.IiiiIiiiiIIII
 *  com.xy.v.iiIiIiiiiIiii
 *  com.xy.v.iiiiiiiiiiIiI
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.v;

import com.xy.a.q.IiIIIiiiiiiII;
import com.xy.a.v.IiIiiiiiIIIiI;
import com.xy.a.v.IiiIiiiiIIIiI;
import com.xy.a.v.iiiiiiiiIIIII;
import com.xy.bean.ChongjipackBean;
import com.xy.bean.UseCardBean;
import com.xy.formula.ActivityMenuSet2;
import com.xy.formula.FormulaNum;
import com.xy.i.iiIiIiiiIIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIiIIiiiIiiiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Activity;
import com.xy.readbean.ActivityFC;
import com.xy.readbean.ActivityFCBuy;
import com.xy.readbean.ActivityFCTarget;
import com.xy.richtext.RichLabel;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.iiIiIiiiiIiii;
import com.xy.v.iiiiiiiiiiIiI;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.plaf.ScrollBarUI;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IiiiIiiiiIIII
extends iIiIIiiiIiiiI {
    private IiiiIiiiiIiIi iiiIiiiiiiiIi;
    private iiIiIiiiiIiii iIiiIiiiiiiII;
    private ActivityMenuSet2 IIiiIiiiIIiIi;
    private JScrollPane iIiIiiiiIiIii;
    private IIIiiiiiIiIiI[] IiIIIiiiiIiiI;
    private iiIiIiiiIIIiI[] iiIiiiiiiiIii;
    private JComponent IiiiiiiiIIIII;
    private JLabel[] ALLATORIxDEMO;

    public void iIiIiiiiIIiii() {
        JScrollBar IiiiiiiiIIIII = this.iIiIiiiiIiIii.getVerticalScrollBar();
        IiiiiiiiIIIII.setMaximum(this.IiiiiiiiIIIII.getHeight());
        IiiiiiiiIIIII.setValue(0);
    }

    public IiIiiiiiIIIiI ALLATORIxDEMO(int index) {
        if (index < this.IiiiiiiiIIIII.getComponentCount()) {
            return (IiIiiiiiIIIiI)this.IiiiiiiiIIIII.getComponent(index);
        }
        IiIiiiiiIIIiI IiiiiiiiIIIII = new IiIiiiiiIIIiI(this.iiiIiiiiiiiIi);
        this.IiiiiiiiIIIII.add((Component)IiiiiiiiIIIII);
        return IiiiiiiiIIIII;
    }

    /*
     * Unable to fully structure code
     */
    public void ALLATORIxDEMO(Activity activity, ActivityMenuSet2 menuSet2) {
        block16: {
            block15: {
                IiiiiiiiIIIII = 0;
                IiiiiiiiIIIII = 0;
                IiiiiiiiIIIII = 0;
                this.iIiiIiiiiiiII = null;
                this.IIiiIiiiIIiIi = menuSet2;
                IiiiiiiiIIIII = null;
                IiiiiiiiIIIII = this.iiiIiiiiiiiIi.ALLATORIxDEMO();
                IiiiiiiiIIIII = this.iiiIiiiiiiiIi.ALLATORIxDEMO();
                IiiiiiiiIIIII = IiiiiiiiIIIII.getActivity(activity.getId());
                if (menuSet2.getId() != 1) break block15;
                this.ALLATORIxDEMO[0].setText("\u793c\u5305");
                this.ALLATORIxDEMO[1].setText("\u9884\u89c8");
                this.ALLATORIxDEMO[2].setText("\u552e\u4ef7");
                var13_10 = menuSet2.getBases();
                var12_11 = var13_10.length;
                var11_15 = 0;
                if (true) ** GOTO lbl53
            }
            if (menuSet2.getId() != 3 && menuSet2.getId() != 4) break block16;
            this.ALLATORIxDEMO[0].setText("条件");
            this.ALLATORIxDEMO[1].setText("\u9884\u89c8");
            this.ALLATORIxDEMO[2].setText("\u5b8c\u6210\u72b6\u6001");
            IiiiiiiiIIIII = menuSet2.getBases();
            IiiiiiiiIIIII = ((FormulaNum[])IiiiiiiiIIIII).length;
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl97
            do {
                IiiiiiiiIIIII = var13_10[var11_15];
                IiiiiiiiIIIII = 0;
                IiiiiiiiIIIII = IiiiiiiiIIIII.getSize();
                while (IiiiiiiiIIIII < IiiiiiiiIIIII) {
                    IiiiiiiiIIIII = (int)IiiiiiiiIIIII.getZhi(IiiiiiiiIIIII);
                    IiiiiiiiIIIII = IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII);
                    if (IiiiiiiiIIIII != null && IiiiiiiiIIIII.getType() == 1) {
                        IiiiiiiiIIIII = (ActivityFCBuy)IiiiiiiiIIIII.getData();
                        v0 = IiiiiiiiIIIII = IiiiiiiiIIIII != null ? (int)IiiiiiiiIIIII.getValueByKey(IiiiiiiiIIIII) : 0;
                        if (IiiiiiiiIIIII.getBuyMax() > 0 && IiiiiiiiIIIII.getBuyMax() <= IiiiiiiiIIIII) {
                            if (IiiiiiiiIIIII == null) {
                                IiiiiiiiIIIII = new ArrayList<E>();
                            }
                            IiiiiiiiIIIII.add(IiiiiiiiIIIII);
                        } else {
                            var20_30 = this.ALLATORIxDEMO(IiiiiiiiIIIII);
                            IiiiiiiiIIIII.ALLATORIxDEMO(2, activity, IiiiiiiiIIIII, false, (long)IiiiiiiiIIIII);
                            v1 = IiiiiiiiIIIII * 74;
                            ++IiiiiiiiIIIII;
                            IiiiiiiiIIIII.setBounds(0, v1, 477, 70);
                            IiiiiiiiIIIII.setVisible(true);
                            IiiiiiiiIIIII = IiiiiiiiIIIII.getY() + IiiiiiiiIIIII.getHeight();
                        }
                    }
                    ++IiiiiiiiIIIII;
                }
                ++var11_15;
lbl53:
                // 2 sources

            } while (var11_15 < var12_11);
            IiiiiiiiIIIII = 0;
            IiiiiiiiIIIII = IiiiiiiiIIIII != null ? IiiiiiiiIIIII.size() : 0;
            while (IiiiiiiiIIIII < IiiiiiiiIIIII) {
                IiiiiiiiIIIII = (ActivityFC)IiiiiiiiIIIII.get(IiiiiiiiIIIII);
                IiiiiiiiIIIII = (ActivityFCBuy)IiiiiiiiIIIII.getData();
                IiiiiiiiIIIII = this.ALLATORIxDEMO(IiiiiiiiIIIII);
                IiiiiiiiIIIII.ALLATORIxDEMO(2, activity, IiiiiiiiIIIII, true, (long)IiiiiiiiIIIII.getBuyMax());
                v2 = IiiiiiiiIIIII * 74;
                ++IiiiiiiiIIIII;
                IiiiiiiiIIIII.setBounds(0, v2, 477, 70);
                IiiiiiiiIIIII.setVisible(true);
                ++IiiiiiiiIIIII;
                IiiiiiiiIIIII = IiiiiiiiIIIII.getY() + IiiiiiiiIIIII.getHeight();
            }
            break block16;
            do {
                IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII];
                IiiiiiiiIIIII = 0;
                IiiiiiiiIIIII = IiiiiiiiIIIII.getSize();
                while (IiiiiiiiIIIII < IiiiiiiiIIIII) {
                    IiiiiiiiIIIII = (int)IiiiiiiiIIIII.getZhi(IiiiiiiiIIIII);
                    IiiiiiiiIIIII = IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII);
                    if (IiiiiiiiIIIII != null && IiiiiiiiIIIII.getType() == 2) {
                        v3 = IiiiiiiiIIIII = IiiiiiiiIIIII != null ? IiiiiiiiIIIII.getValueByKey(IiiiiiiiIIIII) : 0L;
                        if (IiiiiiiiIIIII > 0L) {
                            if (IiiiiiiiIIIII == null) {
                                IiiiiiiiIIIII = new ArrayList<ActivityFC>();
                            }
                            IiiiiiiiIIIII.add(IiiiiiiiIIIII);
                        } else {
                            IiiiiiiiIIIII = (ActivityFCTarget)IiiiiiiiIIIII.getData();
                            IiiiiiiiIIIII = IiiiiiiiIIIII.getTarget().getType() == 1 ? (IiiiiiiiIIIII != null ? IiiiiiiiIIIII.getValueByKey(IiiiiiiiIIIII.getTarget().getId()) : 0L) : (IiiiiiiiIIIII.getTarget().getType() == 2 ? (long)IiiiiiiiIIIII.getTaskSystem().ALLATORIxDEMO(IiiiiiiiIIIII.getTarget().getId(), 2) : 0L);
                            IiiiiiiiIIIII = Math.min(IiiiiiiiIIIII.getTarget().getNum(), IiiiiiiiIIIII);
                            var21_31 = this.ALLATORIxDEMO(IiiiiiiiIIIII);
                            IiiiiiiiIIIII.ALLATORIxDEMO(3, activity, IiiiiiiiIIIII, false, IiiiiiiiIIIII);
                            v4 = IiiiiiiiIIIII * 74;
                            ++IiiiiiiiIIIII;
                            IiiiiiiiIIIII.setBounds(0, v4, 477, 70);
                            IiiiiiiiIIIII.setVisible(true);
                            IiiiiiiiIIIII = IiiiiiiiIIIII.getY() + IiiiiiiiIIIII.getHeight();
                        }
                    }
                    ++IiiiiiiiIIIII;
                }
                ++IiiiiiiiIIIII;
lbl97:
                // 2 sources

            } while (IiiiiiiiIIIII < IiiiiiiiIIIII);
            IiiiiiiiIIIII = 0;
            IiiiiiiiIIIII = IiiiiiiiIIIII != null ? IiiiiiiiIIIII.size() : 0;
            while (IiiiiiiiIIIII < IiiiiiiiIIIII) {
                IiiiiiiiIIIII = (ActivityFC)IiiiiiiiIIIII.get(IiiiiiiiIIIII);
                IiiiiiiiIIIII = (ActivityFCTarget)IiiiiiiiIIIII.getData();
                IiiiiiiiIIIII = this.ALLATORIxDEMO(IiiiiiiiIIIII);
                IiiiiiiiIIIII.ALLATORIxDEMO(3, activity, IiiiiiiiIIIII, true, IiiiiiiiIIIII.getTarget().getNum());
                v5 = IiiiiiiiIIIII * 74;
                ++IiiiiiiiIIIII;
                IiiiiiiiIIIII.setBounds(0, v5, 477, 70);
                IiiiiiiiIIIII.setVisible(true);
                ++IiiiiiiiIIIII;
                IiiiiiiiIIIII = IiiiiiiiIIIII.getY() + IiiiiiiiIIIII.getHeight();
            }
        }
        IiiiiiiiIIIII = IiiiiiiiIIIII;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.getComponentCount()) {
            this.IiiiiiiiIIIII.getComponent(IiiiiiiiIIIII++).setVisible(false);
        }
        this.IiiiiiiiIIIII.setPreferredSize(new Dimension(IiiiiiiiIIIII, IiiiiiiiIIIII));
        this.iIiIiiiiIIiii();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void ALLATORIxDEMO(int menuType) {
        block21: {
            block20: {
                block19: {
                    IiiiiiiiIIIII = 0;
                    IiiiiiiiIIIII = 0;
                    IiiiiiiiIIIII = 0;
                    this.iIiiIiiiiiiII = null;
                    this.IIiiIiiiIIiIi = null;
                    if (menuType != 21) break block19;
                    this.ALLATORIxDEMO[0].setText("\u76ee\u6807\u7b49\u7ea7");
                    this.ALLATORIxDEMO[1].setText("\u9884\u89c8");
                    this.ALLATORIxDEMO[2].setText("\u5b8c\u6210\u72b6\u6001");
                    if (this.iiiIiiiiiiiIi instanceof IiiIiiiiIIIiI) {
                        ((IiiIiiiiIIIiI)this.iiiIiiiiiiiIi).ALLATORIxDEMO().setTextSize("", 498);
                    }
                    IiiiiiiiIIIII = this.iiiIiiiiiiiIi.ALLATORIxDEMO().getLoginResult();
                    IiiiiiiiIIIII = null;
                    if (IiiiiiiiIIIII.getVipget() != null) {
                        IiiiiiiiIIIII = IiiiiiiiIIIII.getVipget().split("&&");
                    }
                    IiiiiiiiIIIII = null;
                    IiiiiiiiIIIII = this.iiiIiiiiiiiIi.ALLATORIxDEMO().ALLATORIxDEMO(1);
                    IiiiiiiiIIIII = 0;
                    IiiiiiiiIIIII = IiiiiiiiIIIII != null ? IiiiiiiiIIIII.size() : 0;
                    if (true) ** GOTO lbl52
                }
                this.ALLATORIxDEMO[0].setText("\u793c\u5305");
                this.ALLATORIxDEMO[1].setText("\u9884\u89c8");
                this.ALLATORIxDEMO[2].setText("\u552e\u4ef7");
                IiiiiiiiIIIII = this.iiiIiiiiiiiIi.ALLATORIxDEMO();
                IiiiiiiiIIIII = IiiiiiiiIIIII.ALLATORIxDEMO(menuType);
                IiiiiiiiIIIII = null;
                if (IiiiiiiiIIIII == null) break block20;
                IiiiiiiiIIIII = this.iiiIiiiiiiiIi.ALLATORIxDEMO().getLimit("\u9650\u65f6\u793c\u5305");
                IiiiiiiiIIIII = IiiiiiiiIIIII != null ? IiiiiiiiIIIII.getKeysByActivity() : null;
                IiiiiiiiIIIII = 0;
                IiiiiiiiIIIII = IiiiiiiiIIIII != null ? IiiiiiiiIIIII.size() : 0;
                if (true) ** GOTO lbl74
                do {
                    IiiiiiiiIIIII = (String[])IiiiiiiiIIIII.get(IiiiiiiiIIIII);
                    IiiiiiiiIIIII = com.xy.v.IiiiIiiiiIIII.iIiIiiiiIIiii((int)IiiiiiiiIIIII.getGrade(), (String)IiiiiiiiIIIII.getPackgrade());
                    v0 = IiiiiiiiIIIII = IiiiiiiiIIIII != false && IiIIIiiiiiiII.ALLATORIxDEMO((String[])IiiiiiiiIIIII, (int)4, (int)IiiiiiiiIIIII.getPackgradetype()) != false;
                    if (IiiiiiiiIIIII) {
                        if (IiiiiiiiIIIII == null) {
                            IiiiiiiiIIIII = new ArrayList<String[]>();
                        }
                        IiiiiiiiIIIII.add(IiiiiiiiIIIII);
                    } else {
                        var14_22 = this.ALLATORIxDEMO(IiiiiiiiIIIII);
                        IiiiiiiiIIIII.ALLATORIxDEMO(1, (ChongjipackBean)IiiiiiiiIIIII, IiiiiiiiIIIII, IiiiiiiiIIIII, 0);
                        v1 = IiiiiiiiIIIII * 61;
                        ++IiiiiiiiIIIII;
                        IiiiiiiiIIIII.setBounds(0, v1, 477, 57);
                        IiiiiiiiIIIII.setVisible(true);
                        IiiiiiiiIIIII = IiiiiiiiIIIII.getY() + IiiiiiiiIIIII.getHeight();
                    }
                    ++IiiiiiiiIIIII;
lbl52:
                    // 2 sources

                } while (IiiiiiiiIIIII < IiiiiiiiIIIII);
                IiiiiiiiIIIII = 0;
                IiiiiiiiIIIII = IiiiiiiiIIIII != null ? IiiiiiiiIIIII.size() : 0;
                while (IiiiiiiiIIIII < IiiiiiiiIIIII) {
                    IiiiiiiiIIIII = (ChongjipackBean)IiiiiiiiIIIII.get(IiiiiiiiIIIII);
                    IiiiiiiiIIIII = this.ALLATORIxDEMO(IiiiiiiiIIIII);
                    IiiiiiiiIIIII.ALLATORIxDEMO(1, (ChongjipackBean)IiiiiiiiIIIII, true, true, 0);
                    v2 = IiiiiiiiIIIII * 61;
                    ++IiiiiiiiIIIII;
                    IiiiiiiiIIIII.setBounds(0, v2, 477, 57);
                    IiiiiiiiIIIII.setVisible(true);
                    ++IiiiiiiiIIIII;
                    IiiiiiiiIIIII = IiiiiiiiIIIII.getY() + IiiiiiiiIIIII.getHeight();
                }
                break block21;
                do {
                    IiiiiiiiIIIII /* !! */  = (iiIiIiiiiIiii)IiiiiiiiIIIII.get(IiiiiiiiIIIII);
                    if (!IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII /* !! */ .IiiiiiiiIIIII, (String)IiiiiiiiIIIII.IiiiiiiiIIIII)) {
                        ++IiiiiiiiIIIII;
                        continue;
                    }
                    IiiiiiiiIIIII = IiiiiiiiIIIII /* !! */ ;
                    break;
lbl74:
                    // 2 sources

                } while (IiiiiiiiIIIII < IiiiiiiiIIIII);
                IiiiiiiiIIIII = this.iiiIiiiiiiiIi.ALLATORIxDEMO().getLoginResult();
                IiiiiiiiIIIII = null;
                if (IiiiiiiiIIIII.getVipget() != null) {
                    IiiiiiiiIIIII = IiiiiiiiIIIII.getVipget().split("&&");
                }
                IiiiiiiiIIIII /* !! */  = null;
                IiiiiiiiIIIII = this.iiiIiiiiiiiIi.ALLATORIxDEMO().ALLATORIxDEMO(11, IiiiiiiiIIIII.IiiiiiiiIIIII);
                IiiiiiiiIIIII = 0;
                IiiiiiiiIIIII = IiiiiiiiIIIII != null ? IiiiiiiiIIIII.size() : 0;
                while (IiiiiiiiIIIII < IiiiiiiiIIIII) {
                    IiiiiiiiIIIII = (ChongjipackBean)IiiiiiiiIIIII.get(IiiiiiiiIIIII);
                    IiiiiiiiIIIII = IiIIIiiiiiiII.ALLATORIxDEMO((String[])IiiiiiiiIIIII, (int)7, (int)IiiiiiiiIIIII.getPackgradetype());
                    if (IiiiiiiiIIIII >= IiiiiiiiIIIII.getPointLvl().y) {
                        if (IiiiiiiiIIIII /* !! */  == null) {
                            IiiiiiiiIIIII /* !! */  = new ArrayList<E>();
                        }
                        IiiiiiiiIIIII /* !! */ .add(IiiiiiiiIIIII);
                    } else {
                        var18_28 = this.ALLATORIxDEMO(IiiiiiiiIIIII);
                        IiiiiiiiIIIII.ALLATORIxDEMO(2, IiiiiiiiIIIII, true, true, IiiiiiiiIIIII);
                        v3 = IiiiiiiiIIIII * 74;
                        ++IiiiiiiiIIIII;
                        IiiiiiiiIIIII.setBounds(0, v3, 477, 70);
                        IiiiiiiiIIIII.setVisible(true);
                        IiiiiiiiIIIII = IiiiiiiiIIIII.getY() + IiiiiiiiIIIII.getHeight();
                    }
                    ++IiiiiiiiIIIII;
                }
                IiiiiiiiIIIII = 0;
                IiiiiiiiIIIII = IiiiiiiiIIIII /* !! */  != null ? IiiiiiiiIIIII /* !! */ .size() : 0;
                while (IiiiiiiiIIIII < IiiiiiiiIIIII) {
                    IiiiiiiiIIIII = (ChongjipackBean)IiiiiiiiIIIII /* !! */ .get(IiiiiiiiIIIII);
                    IiiiiiiiIIIII = this.ALLATORIxDEMO(IiiiiiiiIIIII);
                    IiiiiiiiIIIII.ALLATORIxDEMO(2, IiiiiiiiIIIII, true, true, IiiiiiiiIIIII.getPointLvl().y);
                    v4 = IiiiiiiiIIIII * 74;
                    ++IiiiiiiiIIIII;
                    IiiiiiiiIIIII.setBounds(0, v4, 477, 70);
                    IiiiiiiiIIIII.setVisible(true);
                    ++IiiiiiiiIIIII;
                    IiiiiiiiIIIII = IiiiiiiiIIIII.getY() + IiiiiiiiIIIII.getHeight();
                }
            }
            if (IiiiiiiiIIIII != null) {
                this.iIiiIiiiiiiII = IiiiiiiiIIIII;
                this.ALLATORIxDEMO();
            } else if (this.iiiIiiiiiiiIi instanceof IiiIiiiiIIIiI) {
                ((IiiIiiiiIIIiI)this.iiiIiiiiiiiIi).ALLATORIxDEMO().setTextSize("", 498);
            }
        }
        IiiiiiiiIIIII = IiiiiiiiIIIII;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.getComponentCount()) {
            this.IiiiiiiiIIIII.getComponent(IiiiiiiiIIIII++).setVisible(false);
        }
        this.IiiiiiiiIIIII.setPreferredSize(new Dimension(IiiiiiiiIIIII, IiiiiiiiIIIII));
        this.iIiIiiiiIIiii();
    }

    public void ALLATORIxDEMO() {
        if (this.iIiiIiiiiiiII == null) return;
        int IiiiiiiiIIIII = UseCardBean.getUseTime((long)this.iIiiIiiiiiiII.ALLATORIxDEMO);
        StringBuffer IiiiiiiiIIIII2 = new StringBuffer();
        IiiiiiiiIIIII2.append("#Z#W\u6d3b\u52a8\u65f6\u95f4\uff1a\u4ec5\u5269");
        if (IiiiiiiiIIIII > 1440) {
            IiiiiiiiIIIII2.append("#Y");
            IiiiiiiiIIIII2.append(IiiiiiiiIIIII / 1440);
            IiiiiiiiIIIII2.append("#W\u5929");
            IiiiiiiiIIIII %= 1440;
        }
        if (IiiiiiiiIIIII > 60) {
            IiiiiiiiIIIII2.append("#Y");
            IiiiiiiiIIIII2.append(IiiiiiiiIIIII / 60);
            IiiiiiiiIIIII2.append("#W\u5c0f\u65f6");
            IiiiiiiiIIIII %= 60;
        }
        IiiiiiiiIIIII2.append("#Y");
        IiiiiiiiIIIII2.append(IiiiiiiiIIIII);
        IiiiiiiiIIIII2.append("#W\u5206\u949f");
        if (!(this.iiiIiiiiiiiIi instanceof IiiIiiiiIIIiI)) return;
        if (!((IiiIiiiiIIIiI)this.iiiIiiiiiiiIi).ALLATORIxDEMO().isTextSize(IiiiiiiiIIIII2.toString(), 498)) return;
        RichLabel IiiiiiiiIIIII3 = ((IiiIiiiiIIIiI)this.iiiIiiiiiiiIi).ALLATORIxDEMO();
        IiiiiiiiIIIII3.setBounds(204 + (498 - IiiiiiiiIIIII3.getWidth()) / 2, 120, IiiiiiiiIIIII3.getWidth(), IiiiiiiiIIIII3.getHeight());
    }

    public IiiiIiiiiIIII(IiiiIiiiiIiIi view) {
        this.setLayout(null);
        this.setBackground(iiIIiiiiIiiII.IIiIiiiiIIiII);
        this.setBounds(0, 0, 745, 452);
        this.iiiIiiiiiiiIi = view;
        this.iiIiiiiiiiIii = new iiIiIiiiIIIiI[1];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = new iiIiIiiiIIIiI("sc/e/158.png", 1, 3, view);
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(670, 57, 25, 25);
            this.add((Component)this.iiIiiiiiiiIii[IiiiiiiiIIIII++]);
        }
        this.ALLATORIxDEMO = new JLabel[3];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)209, (int)156, (int)122, (int)22, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c523425"), (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.ALLATORIxDEMO[IiiiiiiiIIIII].setHorizontalAlignment(0);
            if (IiiiiiiiIIIII == 1) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(331, 156, 252, 22);
            } else if (IiiiiiiiIIIII == 2) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(583, 156, 99, 22);
            }
            this.add(this.ALLATORIxDEMO[IiiiiiiiIIIII++]);
        }
        this.IiiiiiiiIIIII = new iiiiiiiiIIIII(this);
        this.iIiIiiiiIiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((int)208, (int)186, (int)487, (int)240, (Component)this.IiiiiiiiIIIII, (int)20);
        this.iIiIiiiiIiIii.getVerticalScrollBar().setUI((ScrollBarUI)new iiiiiiiiiiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/106.png", (int)3, (int)3, (int)3, (int)3, (boolean)false), 8));
        this.add(this.iIiIiiiiIiIii);
        this.IiIIIiiiiIiiI = new IIIiiiiiIiIiI[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII == 0) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/94.png");
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(207, 155, 477, 28);
            } else if (IiiiiiiiIIIII == 1) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/105.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(688, 186, 6, 240);
            }
            this.add((Component)this.IiIIIiiiiIiiI[IiiiiiiiIIIII++]);
        }
    }

    protected void paintComponent(Graphics g) {
        if (this.iiiIiiiiiiiIi.iiIIiiiiIiIIi.iIiIiiiiIIiii()) {
            this.ALLATORIxDEMO();
        }
        super.paintComponent(g);
    }
}
