/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IiIiiiiiIIIII
 *  com.xy.a.IiiiIiiiiiIIi
 *  com.xy.bean.FMBean
 *  com.xy.bean.FMRole
 *  com.xy.i.IIIIIiiiIIIiI
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Goodstable
 *  com.xy.v.IiiiIiiiiIIII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIiiIi
 */
package com.xy.a;

import com.xy.a.IiIiiiiiIIIII;
import com.xy.a.IiiiIiiiiiIIi;
import com.xy.bean.FMBean;
import com.xy.bean.FMRole;
import com.xy.i.IIIIIiiiIIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Goodstable;
import com.xy.v.IiiiIiiiiIIII;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.IIiIiiiiIiiIi;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Vector;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/*
 * Exception performing whole class analysis ignored.
 */
static class IiIIIiiiiIiii
extends JComponent {
    final /* synthetic */ IiIiiiiiIIIII iiiIiiiiiiiIi;
    private JScrollPane iIiiIiiiiiiII;
    private com.xy.q.IIIiiiiiIiIiI[] IIiiIiiiIIiIi;
    private JLabel[] iIiIiiiiIiIii;
    private IIIIIiiiIIIiI IiIIIiiiiIiiI;
    private Vector<Vector<Object>> iiIiiiiiiiIii;
    private IIIiiiiiIiIiI[] IiiiiiiiIIIII;
    private JTable ALLATORIxDEMO;

    public IiIIIiiiiIiii(IiIiiiiiIIIII iiIiiiiiIIIII) {
        this.iiiIiiiiiiiIi = iiIiiiiiIIIII;
        this.IiIIIiiiiIiiI = new IIIIIiiiIIIiI("sc/e/26.png", 1, 164, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u9886\u53d6\u5956\u52b1", iiIiiiiiIIIII.ALLATORIxDEMO());
        this.IiIIIiiiiIiiI.setBounds(459, 100, 99, 25);
        this.add((Component)this.IiIIIiiiiIiiI);
        this.iIiIiiiiIiIii = new JLabel[16];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length) {
            if (IiiiiiiiIIIII != 5 && IiiiiiiiIIIII != 6 && IiiiiiiiIIIII != 7 && IiiiiiiiIIIII != 8) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)(105 + IiiiiiiiIIIII % 2 * 177), (int)(79 + IiiiiiiiIIIII / 2 * 21), (int)100, (int)18, (Color)Color.white, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u672c\u671f\u6392\u540d\uff1a" : (IiiiiiiiIIIII == 1 ? "\u4e0a\u671f\u6392\u540d\uff1a" : (IiiiiiiiIIIII == 2 ? "\u672a\u4e0a\u699c" : (IiiiiiiiIIIII == 3 ? "\u672a\u4e0a\u699c" : (IiiiiiiiIIIII == 4 ? "\u672c\u671f\u79ef\u5206\uff1a" : (IiiiiiiiIIIII == 5 ? "\u540d\u6b21" : (IiiiiiiiIIIII == 6 ? "\u6635\u79f0" : (IiiiiiiiIIIII == 7 ? "\u7b49\u7ea7" : (IiiiiiiiIIIII == 8 ? "\u79ef\u5206" : (IiiiiiiiIIIII == 9 ? "\u4e0a\u4e00\u671f\u699c\u9996" : (IiiiiiiiIIIII == 10 ? "\u524d\u5341\u540d\u4e30\u539a\u5956\u52b1\u5c55\u793a" : (IiiiiiiiIIIII == 11 ? "\u540d\u79f0\uff1a" : (IiiiiiiiIIIII == 12 ? " I D\uff1a" : (IiiiiiiiIIIII == 13 ? "\u79ef\u5206\uff1a" : (IiiiiiiiIIIII == 14 ? "888888" : (IiiiiiiiIIIII == 15 ? "\u6d3b\u52a8\u65f6\u95f4:2020\u5e744\u670814\u65e5 00:00 \u81f3 2020\u5e744\u670828\u65e5 23:59" : ""))))))))))))))));
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setHorizontalAlignment(10);
                this.add(this.iIiIiiiiIiIii[IiiiiiiiIIIII]);
                if (IiiiiiiiIIIII >= 2 && IiiiiiiiIIIII <= 3) {
                    this.iIiIiiiiIiIii[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iIIiiiiiiIIII);
                    this.iIiIiiiiIiIii[IiiiiiiiIIIII].setForeground(Color.green);
                } else if (IiiiiiiiIIIII == 4) {
                    this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(459, 77, 200, 18);
                } else if (IiiiiiiiIIIII == 5) {
                    this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(64, 137, 36, 21);
                } else if (IiiiiiiiIIIII == 6) {
                    this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(146, 137, 36, 21);
                } else if (IiiiiiiiIIIII == 7) {
                    this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(232, 137, 36, 21);
                } else if (IiiiiiiiIIIII == 8) {
                    this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(310, 137, 36, 21);
                } else if (IiiiiiiiIIIII == 9) {
                    this.iIiIiiiiIiIii[IiiiiiiiIIIII].setHorizontalAlignment(0);
                    this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(379, 137, 214, 21);
                } else if (IiiiiiiiIIIII == 10) {
                    this.iIiIiiiiIiIii[IiiiiiiiIIIII].setHorizontalAlignment(0);
                    this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(379, 259, 214, 21);
                } else if (IiiiiiiiIIIII >= 11 && IiiiiiiiIIIII <= 13) {
                    this.iIiIiiiiIiIii[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iiIiiiiiiIIiI);
                    this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(468, 171 + (IiiiiiiiIIIII - 11) * 17, 122, 14);
                } else if (IiiiiiiiIIIII == 14) {
                    this.iIiIiiiiIiIii[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iIIIiiiiIIIii);
                    this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(540, 77, 120, 18);
                    this.iIiIiiiiIiIii[IiiiiiiiIIIII].setForeground(Color.green);
                } else if (IiiiiiiiIIIII == 15) {
                    this.iIiIiiiiIiIii[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iIIiiiiiiIIII);
                    this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(44, 448, 500, 15);
                    this.iIiIiiiiIiIii[IiiiiiiiIIIII].setForeground(Color.red);
                }
            }
            ++IiiiiiiiIIIII;
        }
        this.IIiiIiiiIIiIi = new com.xy.q.IIIiiiiiIiIiI[6];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIiiIiiiIIiIi.length) {
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII] = new com.xy.q.IIIiiiiiIiIiI(iiIiiiiiIIIII.ALLATORIxDEMO());
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII].ALLATORIxDEMO("sc/d/4.png");
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII].ALLATORIxDEMO(com.xy.q.IIIiiiiiIiIiI.ALLATORIxDEMO);
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setBounds(388 + IiiiiiiiIIIII % 3 * 69, 300 + IiiiiiiiIIIII / 3 * 67, 59, 57);
            this.add((Component)this.IIiiIiiiIIiIi[IiiiiiiiIIIII++]);
        }
        Vector<String> IiiiiiiiIIIII2 = new Vector<String>();
        IiiiiiiiIIIII2.addElement("\u540d\u6b21");
        IiiiiiiiIIIII2.addElement("\u6635\u79f0");
        IiiiiiiiIIIII2.addElement("\u7b49\u7ea7");
        IiiiiiiiIIIII2.addElement("\u79ef\u5206");
        this.iiIiiiiiiiIii = new Vector();
        this.ALLATORIxDEMO = IiIIIiiiiIIiI.ALLATORIxDEMO(this.iiIiiiiiiiIii, IiiiiiiiIIIII2, (Font)iiIIiiiiIiiII.ALLATORIxDEMO, (Color)Color.white, (int[])new int[]{60, 130, 125, 95});
        IiiiIiiiiiIIi IiiiiiiiIIIII3 = new IiiiIiiiiiIIi(this);
        IiiiiiiiIIIII3.setHorizontalAlignment(0);
        this.ALLATORIxDEMO.setDefaultRenderer(Object.class, (TableCellRenderer)IiiiiiiiIIIII3);
        this.iIiiIiiiiiiII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)43, (int)137, (int)332, (int)309, (Component)this.ALLATORIxDEMO, (int)20);
        this.add(this.iIiiIiiiiiiII);
        this.IiiiiiiiIIIII = new IIIiiiiiIiIiI[11];
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII4] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII4 == 0) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII4].setBounds(56, 79, 39, 39);
            } else if (IiiiiiiiIIIII4 == 1) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII4].iIiIiiiiIIiii("sc/d/51.png");
                this.IiiiiiiiIIIII[IiiiiiiiIIIII4].setBounds(53, 76, 45, 45);
            } else if (IiiiiiiiIIIII4 == 2) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII4].setBounds(411, 172, 42, 42);
            } else if (IiiiiiiiIIIII4 == 3) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII4].iIiIiiiiIIiii("sc/d/28.png");
                this.IiiiiiiiIIIII[IiiiiiiiIIIII4].setBounds(406, 167, 52, 52);
            } else if (IiiiiiiiIIIII4 == 4) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII4].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/49.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
                this.IiiiiiiiIIIII[IiiiiiiiIIIII4].setBounds(43, 65, 550, 66);
            } else if (IiiiiiiiIIIII4 >= 5 && IiiiiiiiIIIII4 <= 7) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII4].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                if (IiiiiiiiIIIII4 == 5) {
                    this.IiiiiiiiIIIII[IiiiiiiiIIIII4].setBounds(43, 137, 332, 21);
                } else if (IiiiiiiiIIIII4 == 6) {
                    this.IiiiiiiiIIIII[IiiiiiiiIIIII4].setBounds(379, 137, 214, 21);
                } else if (IiiiiiiiIIIII4 == 7) {
                    this.IiiiiiiiIIIII[IiiiiiiiIIIII4].setBounds(379, 259, 214, 21);
                }
            } else if (IiiiiiiiIIIII4 >= 8 && IiiiiiiiIIIII4 <= 10) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII4].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                if (IiiiiiiiIIIII4 == 8) {
                    this.IiiiiiiiIIIII[IiiiiiiiIIIII4].setBounds(43, 137, 332, 309);
                } else if (IiiiiiiiIIIII4 == 9) {
                    this.IiiiiiiiIIIII[IiiiiiiiIIIII4].setBounds(379, 137, 214, 118);
                } else if (IiiiiiiiIIIII4 == 10) {
                    this.IiiiiiiiIIIII[IiiiiiiiIIIII4].setBounds(379, 259, 214, 187);
                }
            }
            this.add((Component)this.IiiiiiiiIIIII[IiiiiiiiIIIII4++]);
        }
        this.setBounds(0, 0, 620, 479);
    }

    public void ALLATORIxDEMO(FMBean fmBean) {
        Serializable IiiiiiiiIIIII;
        FMRole IiiiiiiiIIIII2 = fmBean.getMyRole();
        this.IiiiiiiiIIIII[0].iIiIiiiiIIiii(IIiIiiiiIiiIi.iiiIiiiiiiIIi((String)IiiiiiiiIIIII2.getSpecies_id().toString()));
        this.iIiIiiiiIiIii[2].setText(IiiiiiiiIIIII2.getFmPlace() != 0 ? String.valueOf(IiiiiiiiIIIII2.getFmPlace()) : "\u672a\u4e0a\u699c");
        this.iIiIiiiiIiIii[3].setText(IiiiiiiiIIIII2.getFmPlacePast() != 0 ? String.valueOf(IiiiiiiiIIIII2.getFmPlacePast()) : "\u672a\u4e0a\u699c");
        this.iIiIiiiiIiIii[14].setText(String.valueOf(IiiiiiiiIIIII2.getFmjf()));
        FMRole IiiiiiiiIIIII3 = fmBean.getFmRole();
        this.IiiiiiiiIIIII[2].iIiIiiiiIIiii(IiiiiiiiIIIII3 != null ? IIiIiiiiIiiIi.iiiIiiiiiiIIi((String)IiiiiiiiIIIII3.getSpecies_id().toString()) : null);
        this.iIiIiiiiIiIii[11].setText("\u540d\u79f0\uff1a" + (IiiiiiiiIIIII3 != null ? IiiiiiiiIIIII3.getRolename() : ""));
        this.iIiIiiiiIiIii[12].setText(" I D\uff1a" + (IiiiiiiiIIIII3 != null ? IiiiiiiiIIIII3.getRole_id().toString() : ""));
        this.iIiIiiiiIiIii[13].setText("\u79ef\u5206\uff1a" + (IiiiiiiiIIIII3 != null ? Integer.valueOf(IiiiiiiiIIIII3.getFmjfPast()) : ""));
        this.iIiIiiiiIiIii[15].setText(fmBean.getFmTime());
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < this.IIiiIiiiIIiIi.length) {
            IiiiiiiiIIIII = fmBean.getGoodIds() != null && IiiiiiiiIIIII4 < fmBean.getGoodIds().length ? fmBean.getGoodIds()[IiiiiiiiIIIII4] : null;
            Goodstable IiiiiiiiIIIII5 = IiiiiiiiIIIII != null ? this.iiiIiiiiiiiIi.ALLATORIxDEMO().ALLATORIxDEMO((BigDecimal)IiiiiiiiIIIII) : null;
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII4].ALLATORIxDEMO(IiiiiiiiIIIII5 != null ? 1 : 0, (Object)IiiiiiiiIIIII5);
            ++IiiiiiiiIIIII4;
        }
        this.iiIiiiiiiiIii.clear();
        IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < fmBean.getFmRoleList().size()) {
            IiiiiiiiIIIII3 = (FMRole)fmBean.getFmRoleList().get(IiiiiiiiIIIII4);
            IiiiiiiiIIIII = new Vector();
            ((Vector)IiiiiiiiIIIII).add(String.valueOf(IiiiiiiiIIIII3.getFmPlace()));
            ((Vector)IiiiiiiiIIIII).add(IiiiiiiiIIIII3.getRolename());
            ((Vector)IiiiiiiiIIIII).add(String.valueOf(IiiiIiiiiIIII.iIiIiiiiIIiii((int)IiiiiiiiIIIII3.getGrade())) + "\u7ea7");
            ((Vector)IiiiiiiiIIIII).add(String.valueOf(IiiiiiiiIIIII3.getFmjf()));
            ++IiiiiiiiIIIII4;
            this.iiIiiiiiiiIii.addElement((Vector<Object>)IiiiiiiiIIIII);
        }
        if (this.ALLATORIxDEMO.getRowCount() > 0) {
            this.ALLATORIxDEMO.setRowSelectionInterval(0, 0);
        }
        this.ALLATORIxDEMO.updateUI();
        this.iIiiIiiiiiiII.getVerticalScrollBar().setValue(0);
    }
}
