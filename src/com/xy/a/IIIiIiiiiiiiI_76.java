/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IIiIiiiiiiIiI
 *  com.xy.a.IiIIiiiiiiiII
 *  com.xy.a.IiiiiiiiiIiII
 *  com.xy.a.iiIIiiiiiIIII
 *  com.xy.a.iiiIIiiiiiIII
 *  com.xy.i.IIIIIiiiIIIiI
 *  com.xy.q.IIIIIiiiIiiII
 *  com.xy.q.IIIiIiiiiIIiI
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiIiIiiiiIiIi
 *  com.xy.readbean.Goodstable
 *  com.xy.readbean.MoneyType
 *  com.xy.readbean.petExchange
 *  com.xy.text.GameView
 *  com.xy.v.IIiIIiiiIIIiI
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a;

import com.xy.a.IIiIiiiiiiIiI;
import com.xy.a.IiIIiiiiiiiII;
import com.xy.a.IiiiiiiiiIiII;
import com.xy.a.iiIIiiiiiIIII;
import com.xy.a.iiiIIiiiiiIII;
import com.xy.i.IIIIIiiiIIIiI;
import com.xy.q.IIIiIiiiiIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.q.iiIiIiiiiIiIi;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.readbean.petExchange;
import com.xy.text.GameView;
import com.xy.v.IIiIIiiiIIIiI;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionListener;
import javax.swing.plaf.basic.BasicTreeUI;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeCellRenderer;

/*
 * Exception performing whole class analysis ignored.
 */
static class IIIiIiiiiiiiI
extends JComponent {
    private com.xy.q.IIIiiiiiIiIiI iIIiIiiiiiiIi;
    private IiIIiiiiiiiII[] IIIIiiiiiiiII;
    private iiIiIiiiiIiIi iiIIIiiiiiiiI;
    private JLabel[] IiIiiiiiIIIII;
    private IIIiiiiiIiIiI[] iiIiIiiiiIIIi;
    private long iiiiIiiiIiiII;
    private JTree iiiIiiiiiiiIi;
    private IIIiIiiiiIIiI iIiiIiiiiiiII;
    private petExchange IIiiIiiiIIiIi;
    private JScrollPane iIiIiiiiIiIii;
    private DefaultMutableTreeNode IiIIIiiiiIiiI;
    final /* synthetic */ iiIIiiiiiIIII iiIiiiiiiiIii;
    private IIIIIiiiIIIiI[] IiiiiiiiIIIII = new IIIIIiiiIIIiI[2];
    private iIIiIiiiIiiIi ALLATORIxDEMO;

    static /* synthetic */ petExchange ALLATORIxDEMO(IIIiIiiiiiiiI arg0) {
        return arg0.IIiiIiiiIIiIi;
    }

    public void ALLATORIxDEMO(petExchange exchange) {
        this.IIiiIiiiIIiIi = exchange;
        this.iIIiIiiiiiiIi.ALLATORIxDEMO(0, null);
        this.iIIiIiiiiiiIi.setVisible(true);
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIIIiiiiiiiII.length) {
            IiIIiiiiiiiII iiIIiiiiiiiII = this.IIIIiiiiiiiII[IiiiiiiiIIIII];
            ++IiiiiiiiIIIII;
            iiIIiiiiiiiII.ALLATORIxDEMO(null, 0);
        }
        this.iiiiIiiiIiiII = 0L;
        this.ALLATORIxDEMO.setText(null);
        if (exchange == null) {
            return;
        }
        Goodstable IiiiiiiiIIIII2 = this.iiIiiiiiiiIii.ALLATORIxDEMO().ALLATORIxDEMO(exchange.getPid());
        this.iIIiIiiiiiiIi.ALLATORIxDEMO(IiiiiiiiIIIII2 != null ? 1 : 0, (Object)IiiiiiiiIIIII2);
        this.iIIiIiiiiiiIi.setVisible(true);
        String IiiiiiiiIIIII3 = exchange.getConsume();
        if (IiiiiiiiIIIII3 == null) return;
        if (IiiiiiiiIIIII3.equals("")) {
            return;
        }
        String[] IiiiiiiiIIIII4 = IiiiiiiiIIIII3.split("\\|");
        int IiiiiiiiIIIII5 = 0;
        int IiiiiiiiIIIII6 = 0;
        while (IiiiiiiiIIIII6 < IiiiiiiiIIIII4.length) {
            String[] IiiiiiiiIIIII7;
            if (IiiiiiiiIIIII4[IiiiiiiiIIIII6].startsWith("D")) {
                IiiiiiiiIIIII7 = IiiiiiiiIIIII4[IiiiiiiiIIIII6].split("=");
                this.iiiiIiiiIiiII = Long.parseLong(IiiiiiiiIIIII7[1]);
                iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.ALLATORIxDEMO, (long)this.iiiiIiiiIiiII);
            } else if (IiiiiiiiIIIII4[IiiiiiiiIIIII6].startsWith("G")) {
                IiiiiiiiIIIII7 = IiiiiiiiIIIII4[IiiiiiiiIIIII6].split("=");
                BigDecimal IiiiiiiiIIIII8 = new BigDecimal(IiiiiiiiIIIII7[1]);
                Goodstable IiiiiiiiIIIII9 = this.iiIiiiiiiiIii.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII8);
                int IiiiiiiiIIIII10 = Integer.parseInt(IiiiiiiiIIIII7[2]);
                if (IiiiiiiiIIIII5 < this.IIIIiiiiiiiII.length) {
                    this.IIIIiiiiiiiII[IiiiiiiiIIIII5].ALLATORIxDEMO(IiiiiiiiIIIII9, IiiiiiiiIIIII10);
                }
                ++IiiiiiiiIIIII5;
            }
            ++IiiiiiiiIIIII6;
        }
    }

    static /* synthetic */ long ALLATORIxDEMO(IIIiIiiiiiiiI arg0) {
        return arg0.iiiiIiiiIiiII;
    }

    static /* synthetic */ iiIiIiiiiIiIi ALLATORIxDEMO(IIIiIiiiiiiiI arg0) {
        return arg0.iiIIIiiiiiiiI;
    }

    static /* synthetic */ iiIIiiiiiIIII ALLATORIxDEMO(IIIiIiiiiiiiI arg0) {
        return arg0.iiIiiiiiiiIii;
    }

    public void ALLATORIxDEMO(Map<Integer, petExchange> map) {
        this.IiIIIiiiiIiiI.removeAllChildren();
        ArrayList<petExchange> IiiiiiiiIIIII = new ArrayList<petExchange>();
        block0: for (Map.Entry<Integer, petExchange> IiiiiiiiIIIII2 : map.entrySet()) {
            petExchange IiiiiiiiIIIII3 = IiiiiiiiIIIII2.getValue();
            if (IiiiiiiiIIIII3.geteType() != 3) continue;
            int IiiiiiiiIIIII4 = 0;
            while (IiiiiiiiIIIII4 < IiiiiiiiIIIII.size()) {
                if (((petExchange)IiiiiiiiIIIII.get(IiiiiiiiIIIII4)).geteId() > IiiiiiiiIIIII3.geteId()) {
                    IiiiiiiiIIIII.add(IiiiiiiiIIIII4, IiiiiiiiIIIII3);
                    continue block0;
                }
                ++IiiiiiiiIIIII4;
            }
            IiiiiiiiIIIII.add(IiiiiiiiIIIII3);
        }
        int IiiiiiiiIIIII5 = 0;
        while (IiiiiiiiIIIII5 < IiiiiiiiIIIII.size()) {
            block6: {
                petExchange IiiiiiiiIIIII6 = (petExchange)IiiiiiiiIIIII.get(IiiiiiiiIIIII5);
                int IiiiiiiiIIIII7 = this.IiIIIiiiiIiiI.getChildCount();
                int IiiiiiiiIIIII22 = 0;
                while (IiiiiiiiIIIII22 < IiiiiiiiIIIII7) {
                    DefaultMutableTreeNode IiiiiiiiIIIII8 = (DefaultMutableTreeNode)this.IiIIIiiiiIiiI.getChildAt(IiiiiiiiIIIII22);
                    if (IiiiiiiiIIIII6.getType().equals(IiiiiiiiIIIII8.toString())) {
                        DefaultMutableTreeNode IiiiiiiiIIIII9 = new DefaultMutableTreeNode(new IIiIIiiiIIIiI(IiiiiiiiIIIII6.getName(), String.valueOf(IiiiiiiiIIIII6.geteId())));
                        IiiiiiiiIIIII8.add(IiiiiiiiIIIII9);
                        break block6;
                    }
                    ++IiiiiiiiIIIII22;
                }
                DefaultMutableTreeNode IiiiiiiiIIIII22 = new DefaultMutableTreeNode(IiiiiiiiIIIII6.getType());
                IiiiiiiiIIIII22.add(new DefaultMutableTreeNode(new IIiIIiiiIIIiI(IiiiiiiiIIIII6.getName(), String.valueOf(IiiiiiiiIIIII6.geteId()))));
                this.IiIIIiiiiIiiI.add(IiiiiiiiIIIII22);
            }
            ++IiiiiiiiIIIII5;
        }
    }

    public boolean ALLATORIxDEMO() {
        if (this.IIiiIiiiIIiIi == null) {
            return false;
        }
        boolean IiiiiiiiIIIII = false;
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.IIIIiiiiiiiII.length) {
            if (this.IIIIiiiiiiiII[IiiiiiiiIIIII2].ALLATORIxDEMO() != null) {
                if (this.IIIIiiiiiiiII[IiiiiiiiIIIII2].ALLATORIxDEMO().getForeground() != Color.green) {
                    return false;
                }
                IiiiiiiiIIIII = true;
            }
            ++IiiiiiiiIIIII2;
        }
        return IiiiiiiiIIIII;
    }

    static /* synthetic */ JTree ALLATORIxDEMO(IIIiIiiiiiiiI arg0) {
        return arg0.iiiIiiiiiiiIi;
    }

    public IIIiIiiiiiiiI(iiIIiiiiiIIII iiIIiiiiiIIII2) {
        this.iiIiiiiiiiIii = iiIIiiiiiIIII2;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = new IIIIIiiiIIIiI(IiiiiiiiIIIII == 1 ? "sc/e/26.png" : "sc/e/7.png", 1, 193 + IiiiiiiiIIIII, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, IiiiiiiiIIIII == 0 ? "\u5408\u6210" : (IiiiiiiiIIIII == 1 ? "\u4e00\u952e\u5408\u6210" : ""), iiIIiiiiiIIII2.ALLATORIxDEMO());
            if (IiiiiiiiIIIII == 0) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(271, 299, 59, 25);
            } else if (IiiiiiiiIIIII == 1) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(335, 299, 99, 25);
            }
            this.add((Component)this.IiiiiiiiIIIII[IiiiiiiiIIIII++]);
        }
        this.IiIiiiiiIIIII = new JLabel[4];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIiiiiiIIIII.length) {
            this.IiIiiiiiIIIII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)47, (int)57, (int)150, (int)19, (Color)Color.black, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.IiIiiiiiIIIII[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u6211\u6b63\u5728\u5408\u6210\u7269\u54c1" : (IiiiiiiiIIIII == 1 ? "\u5408\u6210" : (IiiiiiiiIIIII == 2 ? "\u6d88\u8017" : (IiiiiiiiIIIII == 3 ? "\u73b0\u91d1" : ""))));
            this.IiIiiiiiIIIII[IiiiiiiiIIIII].setHorizontalAlignment(10);
            this.add(this.IiIiiiiiIIIII[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII == 1) {
                this.IiIiiiiiIIIII[IiiiiiiiIIIII].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cEEEEEE"));
                this.IiIiiiiiIIIII[IiiiiiiiIIIII].setBounds(306, 220, 27, 14);
                this.IiIiiiiiIIIII[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iiIiiiiiiIIiI);
            } else if (IiiiiiiiIIIII >= 2 && IiiiiiiiIIIII <= 3) {
                this.IiIiiiiiIIIII[IiiiiiiiIIIII].setForeground(Color.white);
                this.IiIiiiiiIIIII[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iIIiiiiiiIIII);
                this.IiIiiiiiIIIII[IiiiiiiiIIIII].setBounds(278, 247 + (IiiiiiiiIIIII - 2) * 25, 36, 19);
            }
            ++IiiiiiiiIIIII;
        }
        MoneyType IiiiiiiiIIIII2 = new MoneyType();
        IiiiiiiiIIIII2.setIdAndKey(1, "\u91d1\u94b1");
        this.iiIIIiiiiiiiI = IiIIIiiiiIIiI.ALLATORIxDEMO((int)310, (int)272, (int)124, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (MoneyType)IiiiiiiiIIIII2, (GameView)iiIIiiiiiIIII2.iiIIiiiiIiIIi);
        this.ALLATORIxDEMO = IiIIIiiiiIIiI.ALLATORIxDEMO((int)310, (int)247, (int)124, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
        this.iiIIIiiiiiiiI.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.ALLATORIxDEMO.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.iiIIIiiiiiiiI.ALLATORIxDEMO(2);
        this.add((Component)this.iiIIIiiiiiiiI);
        this.add((Component)this.ALLATORIxDEMO);
        this.IIIIiiiiiiiII = new IiIIiiiiiiiII[5];
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.IIIIiiiiiiiII.length) {
            this.IIIIiiiiiiiII[IiiiiiiiIIIII3] = new IiIIiiiiiiiII(iiIIiiiiiIIII2, 0);
            if (IiiiiiiiIIIII3 < 3) {
                this.IIIIiiiiiiiII[IiiiiiiiIIIII3].setBounds(210 + 80 * IiiiiiiiIIIII3, 100, 55, 70);
            } else {
                this.IIIIiiiiiiiII[IiiiiiiiIIIII3].setBounds(210 + (IiiiiiiiIIIII3 == 4 ? 160 : 0), 170, 55, 70);
            }
            this.add((Component)this.IIIIiiiiiiiII[IiiiiiiiIIIII3++]);
        }
        this.iIIiIiiiiiiIi = new com.xy.q.IIIiiiiiIiIiI(iiIIiiiiiIIII2.ALLATORIxDEMO());
        this.iIIiIiiiiiiIi.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/4.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
        this.iIIiIiiiiiiIi.ALLATORIxDEMO(com.xy.q.IIIiiiiiIiIiI.IIIiiiiiIIiII);
        this.iIIiIiiiiiiIi.setBounds(210, 240, 55, 55);
        this.add((Component)this.iIIiIiiiiiiIi);
        this.IiIIIiiiiIiiI = new DefaultMutableTreeNode("");
        this.ALLATORIxDEMO(iiIIiiiiiIIII2.ALLATORIxDEMO().ALLATORIxDEMO().getAllPetExchange());
        this.iiiIiiiiiiiIi = new JTree(this.IiIIIiiiiIiiI);
        this.iiiIiiiiiiiIi.setOpaque(false);
        this.iiiIiiiiiiiIi.putClientProperty("JTree.lineStyle", "None");
        ((BasicTreeUI)this.iiiIiiiiiiiIi.getUI()).setLeftChildIndent(0);
        IIiIiiiiiiIiI IiiiiiiiIIIII32 = new IIiIiiiiiiIiI(this);
        IiiiiiiiIIIII32.setLeafIcon(null);
        IiiiiiiiIIIII32.setOpenIcon(com.xy.q.IIIIIiiiIiiII.iiiiIiiiIiiII);
        IiiiiiiiIIIII32.setClosedIcon(com.xy.q.IIIIIiiiIiiII.ALLATORIxDEMO);
        IiiiiiiiIIIII32.setFont(iiIIiiiiIiiII.iIiIIiiiiIIiI);
        IiiiiiiiIIIII32.setBackgroundNonSelectionColor(iiIIiiiiIiiII.IIiIiiiiIIiII);
        IiiiiiiiIIIII32.setBackgroundSelectionColor(new Color(99, 93, 90));
        IiiiiiiiIIIII32.setBorderSelectionColor(iiIIiiiiIiiII.IIiIiiiiIIiII);
        IiiiiiiiIIIII32.setTextNonSelectionColor(Color.white);
        IiiiiiiiIIIII32.setTextSelectionColor(Color.white);
        this.iiiIiiiiiiiIi.setCellRenderer((TreeCellRenderer)IiiiiiiiIIIII32);
        this.iiiIiiiiiiiIi.setRootVisible(false);
        this.iiiIiiiiiiiIi.setRowHeight(20);
        this.iiiIiiiiiiiIi.addMouseListener((MouseListener)new iiiIIiiiiiIII(this));
        this.iiiIiiiiiiiIi.addTreeSelectionListener((TreeSelectionListener)new IiiiiiiiiIiII(this));
        this.iIiIiiiiIiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((int)50, (int)98, (int)145, (int)230, (Component)this.iiiIiiiiiiiIi, (int)20);
        this.add(this.iIiIiiiiIiIii);
        this.iiIiIiiiiIIIi = new IIIiiiiiIiIiI[6];
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < this.iiIiIiiiiIIIi.length) {
            this.iiIiIiiiiIIIi[IiiiiiiiIIIII4] = new IIIiiiiiIiIiI();
            this.add((Component)this.iiIiIiiiiIIIi[IiiiiiiiIIIII4]);
            if (IiiiiiiiIIIII4 == 0) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII4].iIiIiiiiIIiii("sc/d/71.png");
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII4].setBounds(279, 213, 78, 30);
            } else if (IiiiiiiiIIIII4 == 1) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII4].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII4].setBounds(47, 78, 144, 21);
            } else if (IiiiiiiiIIIII4 == 2) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII4].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII4].setBounds(190, 78, 265, 21);
            } else if (IiiiiiiiIIIII4 == 3) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII4].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII4].setBounds(47, 78, 144, 250);
            } else if (IiiiiiiiIIIII4 == 4) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII4].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII4].setBounds(190, 78, 265, 250);
            } else if (IiiiiiiiIIIII4 == 5) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII4].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/19.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII4].setBounds(45, 328, 412, 156);
            }
            ++IiiiiiiiIIIII4;
        }
        this.iIiiIiiiiiiII = new IIIiIiiiiIIiI(iiIIiiiiiIIII2.ALLATORIxDEMO(), 8, 3, 51, 51, 0, 0, 46, 330);
        this.iIiiIiiiiiiII.ALLATORIxDEMO(IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/18.png"));
        this.iIiiIiiiiiiII.ALLATORIxDEMO(new long[]{-1L});
        this.add((Component)this.iIiiIiiiiiiII);
    }
}
