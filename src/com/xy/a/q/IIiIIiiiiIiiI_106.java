/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.IIIiIiiiiiiiI
 *  com.xy.a.q.IIiIiiiiiiIiI
 *  com.xy.a.q.IiiiiiiiiIiII
 *  com.xy.a.q.iiiIIiiiiiIII
 *  com.xy.a.q.iiiiIiiiIiIii
 *  com.xy.bean.LoginResult
 *  com.xy.formula.BaseValue
 *  com.xy.game.RoleData
 *  com.xy.i.IiiiiiiiiIIII
 *  com.xy.q.IIIIIiiiIiiII
 *  com.xy.q.IIiIIiiiIIIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiII
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.petExchange
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.IIiIIiiiIIIiI
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIIiii
 */
package com.xy.a.q;

import com.xy.a.q.IIIiIiiiiiiiI;
import com.xy.a.q.IIiIiiiiiiIiI;
import com.xy.a.q.IiiiiiiiiIiII;
import com.xy.a.q.iiiIIiiiiiIII;
import com.xy.a.q.iiiiIiiiIiIii;
import com.xy.bean.LoginResult;
import com.xy.formula.BaseValue;
import com.xy.game.RoleData;
import com.xy.i.IiiiiiiiiIIII;
import com.xy.q.IIiIIiiiIIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiII;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.petExchange;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.IIiIiiiiIIiii;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionListener;
import javax.swing.plaf.basic.BasicTreeUI;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeCellRenderer;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IIiIIiiiiIiiI
extends IiiiIiiiiIiIi {
    private long IIiiiiiiIiiII;
    private List<IiiiiiiiiIiII> IiiiIiiiIiIII;
    private JScrollPane IIiiiiiiiIIIi;
    private long IIIiiiiiIIiII;
    private petExchange iiIiiiiiiIIiI;
    private IiiiiiiiiIIII iIiiIiiiIiIIi;
    private IIIiiiiiIiIiI[] iiiiIiiiIIiii;
    private iIIiIiiiIiiIi[] iIIiIiiiiiiIi;
    private int IIIIiiiiiiiII = -1;
    private DefaultMutableTreeNode iiIIIiiiiiiiI;
    private IiiiiiiiiIIII IiIiiiiiIIIII;
    private IiiiIiiiiIiII iiIiIiiiiIIIi;
    private JTree iiiiIiiiIiiII;
    private long iiiIiiiiiiiIi = 0L;
    private long iIiiIiiiiiiII = 0L;
    private IIiIIiiiIIIiI IIiiIiiiIIiIi;
    private long iIiIiiiiIiIii = -1L;
    private JLabel[] IiIIIiiiiIiiI;
    private IIIiiiiiIiIiI iiIiiiiiiiIii;
    private JComponent IiiiiiiiIIIII;
    private IiiiiiiiiIIII ALLATORIxDEMO;

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (!this.iiIIiiiiIiIIi.iIiIiiiiIIiii()) return;
        this.iIiIiiiiIIiIi();
    }

    public void IiiIiiiiiiIiI(int id) {
        if (this.iiIiiiiiiIIiI == null) return;
        if (this.iiIiiiiiiIIiI.geteId() != id) {
            return;
        }
        long IiiiiiiiIIIII = this.IIiiIiiiIIiIi.ALLATORIxDEMO() - 1L;
        if (IiiiiiiiIIIII <= 0L) {
            return;
        }
        this.iiIiIiiiiIIIi.setText(String.valueOf(IiiiiiiiIIIII));
        this.iiiIiiiiiiIIi();
    }

    public void iIiIiiiiIIiii(petExchange exchange) {
        String[] IiiiiiiiIIIII;
        int IiiiiiiiIIIII2;
        Object IiiiiiiiIIIII3;
        String IiiiiiiiIIIII4;
        int IiiiiiiiIIIII5;
        int IiiiiiiiIIIII6;
        this.iiIiiiiiiIIiI = exchange;
        this.ALLATORIxDEMO(exchange);
        if (exchange == null) {
            return;
        }
        this.IIiiiiiiIiiII = exchange.getHp();
        int IiiiiiiiIIIII7 = 0;
        int IiiiiiiiIIIII8 = 0;
        int IiiiiiiiIIIII9 = 0;
        String IiiiiiiiIIIII10 = exchange.getConsume();
        if (!IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII10)) {
            IiiiiiiiIIIII6 = 0;
            IiiiiiiiIIIII5 = 0;
            while (IiiiiiiiIIIII5 != -1) {
                IiiiiiiiIIIII6 = IiiiiiiiIIIII10.indexOf("|", IiiiiiiiIIIII5);
                IiiiiiiiIIIII4 = IiiiiiiiIIIII10.substring(IiiiiiiiIIIII5, IiiiiiiiIIIII6 != -1 ? IiiiiiiiIIIII6 : IiiiiiiiIIIII10.length());
                int n = IiiiiiiiIIIII5 = IiiiiiiiIIIII6 == -1 ? -1 : IiiiiiiiIIIII6 + 1;
                if (IiiiiiiiIIIII4.startsWith("G=")) {
                    IiiiiiiiIIIII6 = IiiiiiiiIIIII4.indexOf("=", 2);
                    IiiiiiiiIIIII3 = new BigDecimal(IiiiiiiiIIIII4.substring(2, IiiiiiiiIIIII6));
                    IiiiiiiiIIIII2 = Integer.parseInt(IiiiiiiiIIIII4.substring(IiiiiiiiIIIII6 + 1));
                    IiiiiiiiIIIII = this.ALLATORIxDEMO(IiiiiiiiIIIII9);
                    IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII7++, IiiiiiiiIIIII2, IiiiiiiiIIIII2, this.ALLATORIxDEMO().ALLATORIxDEMO((BigDecimal)IiiiiiiiIIIII3));
                    ++IiiiiiiiIIIII9;
                    continue;
                }
                if (!IiiiiiiiIIIII4.startsWith("\u6d3b\u529b=")) continue;
                this.IIIiiiiiIIiII = Long.parseLong(IiiiiiiiIIIII4.substring(3));
            }
        }
        if ((IiiiiiiiIIIII10 = exchange.getSkin()) != null && !IiiiiiiiIIIII10.equals("")) {
            IiiiiiiiIIIII6 = 0;
            IiiiiiiiIIIII5 = 0;
            block1: while (IiiiiiiiIIIII5 != -1) {
                IiiiiiiiIIIII6 = IiiiiiiiIIIII10.indexOf("|", IiiiiiiiIIIII5);
                IiiiiiiiIIIII4 = IiiiiiiiIIIII10.substring(IiiiiiiiIIIII5, IiiiiiiiIIIII6 != -1 ? IiiiiiiiIIIII6 : IiiiiiiiIIIII10.length());
                int n = IiiiiiiiIIIII5 = IiiiiiiiIIIII6 == -1 ? -1 : IiiiiiiiIIIII6 + 1;
                if (!IiiiiiiiIIIII4.startsWith("\u7269\u54c1=")) continue;
                IiiiiiiiIIIII3 = IiiiiiiiIIIII4.split("&");
                IiiiiiiiIIIII2 = ((String[])IiiiiiiiIIIII3).length - 1;
                while (IiiiiiiiIIIII2 >= 1) {
                    IiiiiiiiIIIII = IiiiiiiiIIIII3[IiiiiiiiIIIII2].split("\\$");
                    double IiiiiiiiIIIII11 = Double.parseDouble(IiiiiiiiIIIII[2]);
                    int IiiiiiiiIIIII12 = Integer.parseInt(IiiiiiiiIIIII[1]);
                    String[] IiiiiiiiIIIII13 = IiiiiiiiIIIII[0].split("-");
                    int IiiiiiiiIIIII14 = 0;
                    while (IiiiiiiiIIIII14 < IiiiiiiiIIIII13.length) {
                        IiiiiiiiiIiII IiiiiiiiIIIII15 = this.ALLATORIxDEMO(IiiiiiiiIIIII9);
                        if (((String[])IiiiiiiiIIIII3).length == 2 && IiiiiiiiIIIII13.length == 1 && IiiiiiiiIIIII11 >= 100.0) {
                            IiiiiiiiIIIII15.ALLATORIxDEMO(100 + IiiiiiiiIIIII8, IiiiiiiiIIIII12, IiiiiiiiIIIII12, this.ALLATORIxDEMO().ALLATORIxDEMO(new BigDecimal(IiiiiiiiIIIII13[IiiiiiiiIIIII14])));
                        } else {
                            IiiiiiiiIIIII15.ALLATORIxDEMO(100 + IiiiiiiiIIIII8, 0, IiiiiiiiIIIII12, this.ALLATORIxDEMO().ALLATORIxDEMO(new BigDecimal(IiiiiiiiIIIII13[IiiiiiiiIIIII14])));
                        }
                        ++IiiiiiiiIIIII9;
                        if (++IiiiiiiiIIIII8 >= 5) break block1;
                        ++IiiiiiiiIIIII14;
                    }
                    --IiiiiiiiIIIII2;
                }
            }
        }
        IiiiiiiiIIIII6 = 0;
        IiiiiiiiIIIII5 = 0;
        IiiiiiiiIIIII6 = IiiiiiiiIIIII7 == 3 ? 313 : (IiiiiiiiIIIII7 == 5 ? 249 : (IiiiiiiiIIIII7 == 4 ? 286 : (IiiiiiiiIIIII7 == 2 ? 340 : 377)));
        IiiiiiiiIIIII5 = IiiiiiiiIIIII8 == 3 ? 313 : (IiiiiiiiIIIII8 == 5 ? 249 : (IiiiiiiiIIIII8 == 4 ? 286 : (IiiiiiiiIIIII8 == 2 ? 340 : 377)));
        int IiiiiiiiIIIII16 = 0;
        while (IiiiiiiiIIIII16 < this.IiiiIiiiIiIII.size()) {
            IiiiiiiiIIIII3 = this.IiiiIiiiIiIII.get(IiiiiiiiIIIII16);
            if (IiiiiiiiiIiII.ALLATORIxDEMO((IiiiiiiiiIiII)IiiiiiiiIIIII3) < 100) {
                IiiiiiiiIIIII3.setBounds(IiiiiiiiIIIII6 + 64 * IiiiiiiiiIiII.ALLATORIxDEMO((IiiiiiiiiIiII)IiiiiiiiIIIII3), 263, 54, 54);
            } else {
                IiiiiiiiIIIII3.setBounds(IiiiiiiiIIIII5 + 64 * (IiiiiiiiiIiII.ALLATORIxDEMO((IiiiiiiiiIiII)IiiiiiiiIIIII3) - 100), 166, 54, 54);
            }
            ++IiiiiiiiIIIII16;
        }
        this.iiIiIiiiiIIIi.setText("999");
    }

    public IiiiiiiiiIiII ALLATORIxDEMO(int index) {
        if (index < this.IiiiIiiiIiIII.size()) {
            return this.IiiiIiiiIiIII.get(index);
        }
        IiiiiiiiiIiII IiiiiiiiIIIII = new IiiiiiiiiIiII(this);
        this.add((Component)IiiiiiiiIIIII, 5);
        this.IiiiIiiiIiIII.add(IiiiiiiiIIIII);
        return IiiiiiiiIIIII;
    }

    private /* synthetic */ void iIiIiiiiIIiIi() {
        LoginResult IiiiiiiiIIIII = this.ALLATORIxDEMO().getLoginResult();
        long IiiiiiiiIIIII2 = IiiiiiiiIIIII.getScoretype("\u804c\u4e1a\u719f\u7ec3\u5ea6").longValue();
        long IiiiiiiiIIIII3 = BaseValue.getFZLvl((long)IiiiiiiiIIIII2);
        if (IiiiiiiiIIIII3 != this.iiiIiiiiiiiIi) {
            this.iiiIiiiiiiiIi = IiiiiiiiIIIII3;
            this.iIIiIiiiiiiIi[0].setText(String.valueOf(this.iiiIiiiiiiiIi));
            this.iIIiIiiiiiiIi[1].setText(String.valueOf(this.iIiIiiiiIiIii) + "/" + BaseValue.getFZExp((long)(this.iiiIiiiiiiiIi + 1L)));
        }
        if ((IiiiiiiiIIIII3 = IiiiiiiiIIIII2 - BaseValue.getFZTotalExp((long)this.iiiIiiiiiiiIi)) != this.iIiIiiiiIiIii) {
            this.iIiIiiiiIiIii = IiiiiiiiIIIII3;
            this.iIIiIiiiiiiIi[1].setText(String.valueOf(this.iIiIiiiiIiIii) + "/" + BaseValue.getFZExp((long)(this.iiiIiiiiiiiIi + 1L)));
        }
        IiiiiiiiIIIII3 = IiiiiiiiIIIII.getScoretype("\u6d3b\u529b").longValue();
        if (IiiiiiiiIIIII2 == this.iIiiIiiiiiiII) return;
        this.iIiiIiiiiiiII = IiiiiiiiIIIII3;
        this.iIIiIiiiiiiIi[3].setText(String.valueOf(this.iIiiIiiiiiiII));
    }

    public IIiIIiiiiIiiI(GameView gameView) {
        super(-1, -1, IiiiIiiiiIiIi.iIIiIiiiiiiIi, gameView);
        this.ALLATORIxDEMO(0, 0, 622, 462, IiiiIiiiiIiIi.iIIiIiiiiiiIi);
        this.IiiiIiiiIiIII = new ArrayList<IiiiiiiiiIiII>();
        this.IiIiiiiiIIIII = new IiiiiiiiiIIII("sc/e/31.png", 1, 291, iiIIiiiiIiiII.iiiiIiiiIiiII, null, "\u751f \u4ea7", (IiiiIiiiiIiIi)this);
        this.IiIiiiiiIIIII.setForeground(Color.black);
        this.IiIiiiiiIIIII.setBounds(449, 392, 79, 25);
        this.add((Component)this.IiIiiiiiIIIII);
        this.IiiiiiiiIIIII = new iiiiIiiiIiIii(this);
        this.IiiiiiiiIIIII.setBounds(0, 0, 622, 462);
        this.IiiiiiiiIIIII.addMouseListener(IiIIIiiiiIIiI.IiiiiiiiIIIII);
        this.IiiiiiiiIIIII.setVisible(false);
        this.add(this.IiiiiiiiIIIII);
        this.iIiiIiiiIiIIi = new IiiiiiiiiIIII("sc/b/B175.png", 1, 292, (IiiiIiiiiIiIi)this);
        this.ALLATORIxDEMO = new IiiiiiiiiIIII("sc/b/B176.png", 1, 292, (IiiiIiiiiIiIi)this);
        this.iIiiIiiiIiIIi.setBounds(62, 63, 16, 82);
        this.ALLATORIxDEMO.setBounds(202, 63, 16, 82);
        this.iiIiiiiiiiIii = new IIIiiiiiIiIiI();
        this.iiIiiiiiiiIii.setBounds(78, 64, 124, 80);
        this.add((Component)this.iIiiIiiiIiIIi);
        this.add((Component)this.ALLATORIxDEMO);
        this.add((Component)this.iiIiiiiiiiIii);
        this.IiIIIiiiiIiiI = new JLabel[8];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)283, (int)(72 + 23 * IiiiiiiiIIIII), (int)58, (int)19, (Color)Color.black, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u7b49  \u7ea7" : (IiiiiiiiIIIII == 1 ? "\u719f\u7ec3\u5ea6" : (IiiiiiiiIIIII == 2 ? "\u6d3b\u529b\u503c" : (IiiiiiiiIIIII == 3 ? "\u6d88\u8017\u6d3b\u529b" : (IiiiiiiiIIIII == 4 ? "\u6d88\u8017\u65f6\u957f" : (IiiiiiiiIIIII == 5 ? "\u5236\u4f5c\u6570\u91cf" : (IiiiiiiiIIIII == 6 ? "\u62e5\u6709" : (IiiiiiiiIIIII == 7 ? "\u6570\u91cf" : ""))))))));
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setHorizontalAlignment(0);
            this.add(this.IiIIIiiiiIiiI[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII >= 3 && IiiiiiiiIIIII <= 5) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setForeground(Color.white);
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(276, 337 + 29 * (IiiiiiiiIIIII - 3), 72, 19);
            }
            if (IiiiiiiiIIIII >= 6 && IiiiiiiiIIIII <= 7) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setForeground(Color.white);
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(69 + 101 * (IiiiiiiiIIIII - 6), 167, 36, 19);
            }
            ++IiiiiiiiIIIII;
        }
        this.iIIiIiiiiiiIi = new iIIiIiiiIiiIi[6];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIIiIiiiiiiIi.length) {
            this.iIIiIiiiiiiIi[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)344, (int)(72 + 23 * IiiiiiiiIIIII), (int)119, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
            this.iIIiIiiiiiiIi[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
            if (IiiiiiiiIIIII >= 3 && IiiiiiiiIIIII <= 4) {
                this.iIIiIiiiiiiIi[IiiiiiiiIIIII].setBounds(359, 337 + 29 * (IiiiiiiiIIIII - 3), 165, 19);
            } else if (IiiiiiiiIIIII == 5) {
                this.iIIiIiiiiiiIi[IiiiiiiiIIIII].setBounds(58, 146, 165, 19);
            }
            this.add((Component)this.iIIiIiiiiiiIi[IiiiiiiiIIIII++]);
        }
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < 5) {
            this.iIIiIiiiiiiIi[IiiiiiiiIIIII++].setText("0");
        }
        this.iiIiIiiiiIIIi = IiIIIiiiiIIiI.ALLATORIxDEMO((IIiIiiiiIIiii)IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false), (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (Color)Color.white);
        this.iiIiIiiiiIIIi.setBounds(357, 395, 77, 19);
        this.add((Component)this.iiIiIiiiiIIIi);
        this.IIiiIiiiIIiIi = new IIiIIiiiIIIiI(15, (JTextField)this.iiIiIiiiiIIIi, (IiiiIiiiiIiIi)this);
        this.iiIIIiiiiiiiI = new DefaultMutableTreeNode("");
        this.iiIIIiiiiiiiI.add(new DefaultMutableTreeNode(""));
        this.iiiiIiiiIiiII = new JTree(this.iiIIIiiiiiiiI);
        this.iiiiIiiiIiiII.setOpaque(false);
        this.iiiiIiiiIiiII.putClientProperty("JTree.lineStyle", "None");
        ((BasicTreeUI)this.iiiiIiiiIiiII.getUI()).setLeftChildIndent(0);
        IIIiIiiiiiiiI IiiiiiiiIIIII2 = new IIIiIiiiiiiiI(this);
        IiiiiiiiIIIII2.setLeafIcon(null);
        IiiiiiiiIIIII2.setOpenIcon(com.xy.q.IIIIIiiiIiiII.iiiiIiiiIiiII);
        IiiiiiiiIIIII2.setClosedIcon(com.xy.q.IIIIIiiiIiiII.ALLATORIxDEMO);
        IiiiiiiiIIIII2.setFont(iiIIiiiiIiiII.iIiIIiiiiIIiI);
        IiiiiiiiIIIII2.setBackgroundNonSelectionColor(iiIIiiiiIiiII.IIiIiiiiIIiII);
        IiiiiiiiIIIII2.setBackgroundSelectionColor(new Color(99, 93, 90));
        IiiiiiiiIIIII2.setBorderSelectionColor(iiIIiiiiIiiII.IIiIiiiiIIiII);
        IiiiiiiiIIIII2.setTextNonSelectionColor(Color.white);
        IiiiiiiiIIIII2.setTextSelectionColor(Color.white);
        this.iiiiIiiiIiiII.setCellRenderer((TreeCellRenderer)IiiiiiiiIIIII2);
        this.iiiiIiiiIiiII.setRootVisible(false);
        this.iiiiIiiiIiiII.setRowHeight(20);
        this.iiiiIiiiIiiII.addMouseListener((MouseListener)new IIiIiiiiiiIiI(this));
        this.iiiiIiiiIiiII.addTreeSelectionListener((TreeSelectionListener)new iiiIIiiiiiIII(this));
        this.IIiiiiiiiIIIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)61, (int)187, (int)162, (int)238, (Component)this.iiiiIiiiIiiII, (int)-1);
        this.add(this.IIiiiiiiiIIIi);
        this.iiiiIiiiIIiii = new IIIiiiiiIiIiI[7];
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.iiiiIiiiIIiii.length) {
            this.iiiiIiiiIIiii[IiiiiiiiIIIII3] = new IIIiiiiiIiIiI();
            this.add((Component)this.iiiiIiiiIIiii[IiiiiiiiIIIII3]);
            if (IiiiiiiiIIIII3 == 0) {
                this.iiiiIiiiIIiii[IiiiiiiiIIIII3].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iiiiIiiiIIiii[IiiiiiiiIIIII3].setBounds(58, 166, 165, 21);
            } else if (IiiiiiiiIIIII3 == 1) {
                this.iiiiIiiiIIiii[IiiiiiiiIIIII3].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iiiiIiiiIIiii[IiiiiiiiIIIII3].setBounds(58, 166, 165, 261);
            } else if (IiiiiiiiIIIII3 == 2) {
                this.iiiiIiiiIIiii[IiiiiiiiIIIII3].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/36.png", (int)16, (int)16, (int)16, (int)16, (boolean)false));
                this.iiiiIiiiIIiii[IiiiiiiiIIIII3].setBounds(228, 63, 351, 81);
            } else if (IiiiiiiiIIIII3 == 3) {
                this.iiiiIiiiIIiii[IiiiiiiiIIIII3].iIiIiiiiIIiii("sc/d/92.png");
                this.iiiiIiiiIIiii[IiiiiiiiIIIII3].setBounds(376, 223, 56, 30);
            } else if (IiiiiiiiIIIII3 == 4) {
                this.iiiiIiiiIIiii[IiiiiiiiIIIII3].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/36.png", (int)16, (int)16, (int)16, (int)16, (boolean)false));
                this.iiiiIiiiIIiii[IiiiiiiiIIIII3].setBounds(302, 255, 203, 69);
            } else if (IiiiiiiiIIIII3 == 5) {
                this.iiiiIiiiIIiii[IiiiiiiiIIIII3].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/49.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
                this.iiiiIiiiIIiii[IiiiiiiiIIIII3].setBounds(228, 147, 351, 280);
            } else if (IiiiiiiiIIIII3 == 6) {
                this.iiiiIiiiIIiii[IiiiiiiiIIIII3].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/36.png", (int)16, (int)16, (int)16, (int)16, (boolean)false));
                this.iiiiIiiiIIiii[IiiiiiiiIIIII3].setBounds(45, 54, 549, 383);
            }
            ++IiiiiiiiIIIII3;
        }
    }

    static /* synthetic */ JTree ALLATORIxDEMO(IIiIIiiiiIiiI arg0) {
        return arg0.iiiiIiiiIiiII;
    }

    static /* synthetic */ JScrollPane ALLATORIxDEMO(IIiIIiiiiIiiI arg0) {
        return arg0.IIiiiiiiiIIIi;
    }

    public long ALLATORIxDEMO() {
        if (this.iiIiiiiiiIIiI == null) {
            return 0L;
        }
        long IiiiiiiiIIIII = this.ALLATORIxDEMO().getLoginResult().getScoretype("\u6d3b\u529b").longValue() / (this.IIIiiiiiIIiII != 0L ? this.IIIiiiiiIIiII : 999L);
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.IiiiIiiiIiIII.size()) {
            int IiiiiiiiIIIII3;
            IiiiiiiiiIiII IiiiiiiiIIIII4 = this.IiiiIiiiIiIII.get(IiiiiiiiIIIII2);
            if (IiiiiiiiiIiII.ALLATORIxDEMO((IiiiiiiiiIiII)IiiiiiiiIIIII4) < 100 && IiiiiiiiIIIII > 0L && IiiiiiiiIIIII > (long)(IiiiiiiiIIIII3 = IiiiiiiiIIIII4.iIiIiiiiIIiii())) {
                IiiiiiiiIIIII = IiiiiiiiIIIII3;
            }
            ++IiiiiiiiIIIII2;
        }
        return IiiiiiiiIIIII;
    }

    public void iIiIiiiiIIiIi(int type) {
        if (type == -1) {
            type = this.IIIIiiiiiiiII + 1;
            if (type > 6) {
                type = 1;
            }
        } else if (type == -2 && (type = this.IIIIiiiiiiiII - 1) < 1) {
            type = 6;
        }
        if (this.IIIIiiiiiiiII == type) {
            return;
        }
        this.IIIIiiiiiiiII = type;
        this.iiIiiiiiiiIii.ALLATORIxDEMO("sc/b/S" + (315 + type) + ".png");
        type = 5000 + this.IIIIiiiiiiiII;
        this.iIiIiiiiIIiii(null);
        this.iiIIIiiiiiiiI.removeAllChildren();
        ArrayList<petExchange> IiiiiiiiIIIII = new ArrayList<petExchange>();
        block0: for (Map.Entry IiiiiiiiIIIII2 : this.ALLATORIxDEMO().ALLATORIxDEMO().getAllPetExchange().entrySet()) {
            petExchange IiiiiiiiIIIII3 = (petExchange)IiiiiiiiIIIII2.getValue();
            if (IiiiiiiiIIIII3.geteType() != type) continue;
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
            block11: {
                petExchange IiiiiiiiIIIII6 = (petExchange)IiiiiiiiIIIII.get(IiiiiiiiIIIII5);
                int IiiiiiiiIIIII7 = this.iiIIIiiiiiiiI.getChildCount();
                int IiiiiiiiIIIII22 = 0;
                while (IiiiiiiiIIIII22 < IiiiiiiiIIIII7) {
                    DefaultMutableTreeNode IiiiiiiiIIIII8 = (DefaultMutableTreeNode)this.iiIIIiiiiiiiI.getChildAt(IiiiiiiiIIIII22);
                    if (IiiiiiiiIIIII6.getType().equals(IiiiiiiiIIIII8.toString())) {
                        DefaultMutableTreeNode IiiiiiiiIIIII9 = new DefaultMutableTreeNode(new com.xy.v.IIiIIiiiIIIiI(IiiiiiiiIIIII6.getName(), String.valueOf(IiiiiiiiIIIII6.geteId())));
                        IiiiiiiiIIIII8.add(IiiiiiiiIIIII9);
                        break block11;
                    }
                    ++IiiiiiiiIIIII22;
                }
                DefaultMutableTreeNode IiiiiiiiIIIII22 = new DefaultMutableTreeNode(IiiiiiiiIIIII6.getType());
                IiiiiiiiIIIII22.add(new DefaultMutableTreeNode(new com.xy.v.IIiIIiiiIIIiI(IiiiiiiiIIIII6.getName(), String.valueOf(IiiiiiiiIIIII6.geteId()))));
                this.iiIIIiiiiiiiI.add(IiiiiiiiIIIII22);
            }
            ++IiiiiiiiIIIII5;
        }
        if (this.iiiiIiiiIiiII == null) return;
        this.iiiiIiiiIiiII.updateUI();
    }

    public void iiiIiiiiiiIIi(int type) {
        if (this.iiIIiiiiIiIIi.getGameReadBar().readBarType == 2 || this.iiIIiiiiIiIIi.getGameReadBar().readBarType == 3) {
            this.iiIIiiiiIiIIi.getGameReadBar().setReadBar(0, 0, null, 0.0, 0L, null);
        }
        this.iIiIiiiiIIiIi();
        this.iiiIiiiiiiIIi(false);
        this.iIiIiiiiIIiIi(this.ALLATORIxDEMO().getPackRecord().getFZType());
    }

    public void iiiIiiiiiiIIi(boolean aFlag) {
        this.IiiiiiiiIIIII.setVisible(aFlag);
        this.IiIiiiiiIIIII.setText(aFlag ? "\u505c\u6b62" : "\u751f\u4ea7");
    }

    private /* synthetic */ void ALLATORIxDEMO(petExchange exchange) {
        if (exchange == null) {
            this.IiIiiiiiIIIII.setVisible(false);
        } else if (exchange.geteType() != 5000 + this.ALLATORIxDEMO().getPackRecord().getFZType()) {
            this.IiIiiiiiIIIII.setBtn(-1, "sc/e/58.png");
            this.IiIiiiiiIIIII.setVisible(true);
        } else {
            this.IiIiiiiiIIIII.setBtn(1, "sc/e/31.png");
            this.IiIiiiiiIIIII.setVisible(true);
        }
        this.IIIiiiiiIIiII = 0L;
        this.IIiiiiiiIiiII = 0L;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiIiiiIiIII.size()) {
            this.IiiiIiiiIiIII.get(++IiiiiiiiIIIII).ALLATORIxDEMO(-1, 0, 0, null);
        }
        if (exchange != null) return;
        this.iIIiIiiiiiiIi[3].setText("0");
        this.iIIiIiiiiiiIi[4].setText("0");
        this.iiIiIiiiiIIIi.setText("0");
    }

    public void iiiIiiiiiiIIi() {
        long IiiiiiiiIIIII;
        if (this.iiIiiiiiiIIiI == null) {
            return;
        }
        RoleData IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
        if (IiiiiiiiIIIII2.getPackRecord().getFZType() != this.iiIiiiiiiIIiI.geteType() - 5000) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4f60\u7684\u526f\u804c\u4e1a\u4e0d\u662f" + (this.iiIiiiiiiIIiI.geteType() == 5001 ? "\u755c\u7267" : (this.iiIiiiiiiIIiI.geteType() == 5002 ? "\u79cd\u690d" : (this.iiIiiiiiiIIiI.geteType() == 5003 ? "\u91c7\u77ff" : (this.iiIiiiiiiIIiI.geteType() == 5004 ? "\u5bb6\u5177" : (this.iiIiiiiiiIIiI.geteType() == 5005 ? "\u5236\u836f" : "\u7b26\u6587"))))));
            return;
        }
        if (this.iiIiiiiiiIIiI.getPid() != null) {
            IiiiiiiiIIIII = BaseValue.getFZLvl((long)IiiiiiiiIIIII2.getLoginResult().getScoretype("\u804c\u4e1a\u719f\u7ec3\u5ea6").longValue());
            if (this.iiIiiiiiiIIiI.getPid().longValue() > IiiiiiiiIIIII) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi(this.iiIiiiiiiIIiI.getPid() + "\u7ea7\u89e3\u9501\u914d\u65b9");
                return;
            }
        }
        if ((IiiiiiiiIIIII = this.IIiiIiiiIIiIi.ALLATORIxDEMO()) <= 0L) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8bf7\u8f93\u5165\u751f\u4ea7\u6570\u91cf");
            return;
        }
        if (this.ALLATORIxDEMO() <= 0L) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u7f3a\u4e4f\u8db3\u591f\u7684\u6750\u6599");
            return;
        }
        String IiiiiiiiIIIII3 = Agreement.getSendTextAES((String)"clickmonsters", (String)("FZA" + this.iiIiiiiiiIIiI.geteId()));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII3);
    }

    public boolean ALLATORIxDEMO(long number, JTextField textField) {
        return true;
    }

    public Long ALLATORIxDEMO(long number, JTextField textField) {
        if (number <= 1L) {
            return 1L;
        }
        if (number > 999L) {
            return 999L;
        }
        long IiiiiiiiIIIII = this.ALLATORIxDEMO();
        if (IiiiiiiiIIIII <= 0L) {
            IiiiiiiiIIIII = 1L;
        }
        if (number <= IiiiiiiiIIIII) return null;
        return IiiiiiiiIIIII;
    }

    public boolean iiiIiiiiiiIIi() {
        if (!this.IiiiiiiiIIIII.isVisible()) return true;
        return false;
    }

    public void ALLATORIxDEMO(long number, JTextField textField) {
        if (this.iiIiiiiiiIIiI == null) {
            return;
        }
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiIiiiIiIII.size()) {
            this.IiiiIiiiIiIII.get(++IiiiiiiiIIIII).ALLATORIxDEMO((int)number);
        }
        this.iIIiIiiiiiiIi[3].setText(String.valueOf(this.IIIiiiiiIIiII * number));
        if (this.iiIiiiiiiIIiI.getPid() != null) {
            long IiiiiiiiIIIII2 = BaseValue.getFZLvl((long)this.ALLATORIxDEMO().getLoginResult().getScoretype("\u804c\u4e1a\u719f\u7ec3\u5ea6").longValue());
            if (this.iiIiiiiiiIIiI.getPid().longValue() > IiiiiiiiIIIII2) {
                this.iIIiIiiiiiiIi[4].setText(this.iiIiiiiiiIIiI.getPid() + "\u7ea7\u89e3\u9501\u914d\u65b9");
                return;
            }
        }
        StringBuffer IiiiiiiiIIIII3 = new StringBuffer();
        this.IIiiiiiiIiiII = 60L;
        long IiiiiiiiIIIII4 = this.IIiiiiiiIiiII * number;
        long IiiiiiiiIIIII5 = IiiiiiiiIIIII4 / 3600L;
        if (IiiiiiiiIIIII5 > 0L) {
            IiiiiiiiIIIII3.append(IiiiiiiiIIIII5);
            IiiiiiiiIIIII3.append("\u65f6");
        }
        if ((IiiiiiiiIIIII5 = IiiiiiiiIIIII4 / 60L % 60L) > 0L) {
            IiiiiiiiIIIII3.append(IiiiiiiiIIIII5);
            IiiiiiiiIIIII3.append("\u5206");
        }
        if ((IiiiiiiiIIIII5 = IiiiiiiiIIIII4 % 60L) > 0L) {
            IiiiiiiiIIIII3.append(IiiiiiiiIIIII5);
            IiiiiiiiIIIII3.append("\u79d2");
        }
        this.iIIiIiiiiiiIi[4].setText(IiiiiiiiIIIII3.toString());
    }

    public void iIiIiiiiIIiii(int id) {
        if (id == 291) {
            if (this.iiIIiiiiIiIIi.getGameReadBar().readBarType != 2 && this.iiIIiiiiIiIIi.getGameReadBar().readBarType != 3) {
                this.iiiIiiiiiiIIi();
                return;
            }
            this.iiIIiiiiIiIIi.getGameReadBar().setReadBar(0, 0, null, 0.0, 0L, null);
            return;
        }
        if (id == 292) {
            this.iIiIiiiiIIiIi(-2);
            return;
        }
        if (id != 293) return;
        this.iIiIiiiiIIiIi(-1);
    }

    public boolean iIiIiiiiIIiii() {
        return this.IiiiiiiiIIIII.isVisible();
    }
}
