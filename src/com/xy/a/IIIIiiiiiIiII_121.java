/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IIIiIiiiiIiII
 *  com.xy.a.IIiiiiiiIiIii
 *  com.xy.a.iiIiIiiiIiIiI
 *  com.xy.q.IIIIIiiiIiiII
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.text.GameView
 *  com.xy.v.IiiiiiiiiIIII
 *  com.xy.v.iiIiIiiiiIiIi
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a;

import com.xy.a.IIIiIiiiiIiII;
import com.xy.a.IIiiiiiiIiIii;
import com.xy.a.iiIiIiiiIiIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.text.GameView;
import com.xy.v.IiiiiiiiiIIII;
import com.xy.v.iiIiIiiiiIiIi;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.MouseListener;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionListener;
import javax.swing.plaf.basic.BasicTreeUI;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeCellRenderer;

public class IIIIiiiiiIiII
extends IiiiIiiiiIiIi {
    private IIIiiiiiIiIiI[] IIiiIiiiIIiIi;
    private JTree iIiIiiiiIiIii;
    private JLabel[] IiIIIiiiiIiiI;
    private JScrollPane iiIiiiiiiiIii;
    private DefaultMutableTreeNode IiiiiiiiIIIII;
    private JScrollPane ALLATORIxDEMO;

    static /* synthetic */ JScrollPane ALLATORIxDEMO(IIIIiiiiiIiII arg0) {
        return arg0.ALLATORIxDEMO;
    }

    public IIIIiiiiiIiII(GameView gameView) {
        super(68, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-2, 0, 579, 397, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u65b0\u624b\u5f15\u5bfc");
        this.IiIIIiiiiIiiI = new JLabel[2];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)0, (int)0, (int)0, (int)(IiiiiiiiIIIII == 0 ? 10 : 0), (Color)Color.white, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u73a9\u6cd5\u4ecb\u7ecd" : (IiiiiiiiIIIII == 1 ? "\u8bf4\u660e" : ""));
            if (IiiiiiiiIIIII == 0) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(42, 24, 220, 21);
            } else if (IiiiiiiiIIIII == 1) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(264, 24, 290, 21);
            }
            this.add(this.IiIIIiiiiIiiI[IiiiiiiiIIIII++]);
        }
        this.IiiiiiiiIIIII = new DefaultMutableTreeNode("");
        iiIiIiiiiIiIi.ALLATORIxDEMO((DefaultMutableTreeNode)this.IiiiiiiiIIIII, (IiiiiiiiiIIII)this.ALLATORIxDEMO());
        this.iIiIiiiiIiIii = new JTree(this.IiiiiiiiIIIII);
        this.iIiIiiiiIiIii.setOpaque(false);
        this.iIiIiiiiIiIii.putClientProperty("JTree.lineStyle", "None");
        ((BasicTreeUI)this.iIiIiiiiIiIii.getUI()).setLeftChildIndent(0);
        iiIiIiiiIiIiI IiiiiiiiIIIII2 = new iiIiIiiiIiIiI(this);
        IiiiiiiiIIIII2.setLeafIcon(null);
        IiiiiiiiIIIII2.setOpenIcon(com.xy.q.IIIIIiiiIiiII.iiiiIiiiIiiII);
        IiiiiiiiIIIII2.setClosedIcon(com.xy.q.IIIIIiiiIiiII.ALLATORIxDEMO);
        IiiiiiiiIIIII2.setBackgroundNonSelectionColor(iiIIiiiiIiiII.IIiIiiiiIIiII);
        IiiiiiiiIIIII2.setBackgroundSelectionColor(new Color(99, 93, 90));
        IiiiiiiiIIIII2.setBorderSelectionColor(iiIIiiiiIiiII.IIiIiiiiIIiII);
        IiiiiiiiIIIII2.setTextNonSelectionColor(Color.white);
        IiiiiiiiIIIII2.setTextSelectionColor(Color.white);
        this.iIiIiiiiIiIii.setCellRenderer((TreeCellRenderer)IiiiiiiiIIIII2);
        this.iIiIiiiiIiIii.setRootVisible(false);
        this.iIiIiiiiIiIii.setRowHeight(25);
        this.iIiIiiiiIiIii.addMouseListener((MouseListener)new IIIiIiiiiIiII(this));
        this.iIiIiiiiIiIii.addTreeSelectionListener((TreeSelectionListener)new IIiiiiiiIiIii(this));
        this.iiIiiiiiiiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((int)43, (int)45, (int)220, (int)328, (Component)this.iIiIiiiiIiIii, (int)-1);
        this.add(this.iiIiiiiiiiIii);
        this.ALLATORIxDEMO = IiIIIiiiiIIiI.ALLATORIxDEMO((int)266, (int)45, (int)290, (int)328, null, (int)50);
        this.add(this.ALLATORIxDEMO);
        this.IIiiIiiiIIiIi = new IIIiiiiiIiIiI[4];
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.IIiiIiiiIIiIi.length) {
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII3] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII3 == 0) {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII3].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII3].setBounds(42, 24, 220, 21);
            } else if (IiiiiiiiIIIII3 == 1) {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII3].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII3].setBounds(264, 24, 290, 21);
            } else if (IiiiiiiiIIIII3 == 2) {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII3].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII3].setBounds(42, 24, 220, 350);
            } else if (IiiiiiiiIIIII3 == 3) {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII3].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII3].setBounds(264, 24, 290, 350);
            }
            this.add((Component)this.IIiiIiiiIIiIi[IiiiiiiiIIIII3++]);
        }
    }

    static /* synthetic */ JTree ALLATORIxDEMO(IIIIiiiiiIiII arg0) {
        return arg0.iIiIiiiiIiIii;
    }
}
