/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.i.IiIIIiiiiIIiI
 *  com.xy.a.i.iiIIIiiiiiIII
 *  com.xy.a.iiIiIiiiiiIIi
 *  com.xy.q.IIIIIiiiIiiII
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.AllStallBuy
 *  com.xy.readbean.StallBuyData
 *  com.xy.readbean.StallBuyMenu
 */
package com.xy.a.i;

import com.xy.a.i.IiIIIiiiiIIiI;
import com.xy.a.i.iiIIIiiiiiIII;
import com.xy.a.iiIiIiiiiiIIi;
import com.xy.q.IIIIIiiiIiiII;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.AllStallBuy;
import com.xy.readbean.StallBuyData;
import com.xy.readbean.StallBuyMenu;
import java.awt.Color;
import java.awt.Component;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.plaf.basic.BasicTreeUI;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeCellRenderer;
import javax.swing.tree.TreePath;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IiiIiiiiIIIIi
implements TreeSelectionListener,
MouseListener {
    private IiiiIiiiiIiIi IiIIIiiiiIiiI;
    private JTree iiIiiiiiiiIii;
    private JScrollPane IiiiiiiiIIIII;
    private DefaultMutableTreeNode ALLATORIxDEMO;

    public IiiIiiiiIIIIi(IiiiIiiiiIiIi form) {
        this.IiIIIiiiiIiiI = form;
        this.ALLATORIxDEMO = new DefaultMutableTreeNode("");
        this.ALLATORIxDEMO.add(new DefaultMutableTreeNode(""));
        this.iiIiiiiiiiIii = new JTree(this.ALLATORIxDEMO);
        this.iiIiiiiiiiIii.setOpaque(false);
        this.iiIiiiiiiiIii.putClientProperty("JTree.lineStyle", "None");
        ((BasicTreeUI)this.iiIiiiiiiiIii.getUI()).setLeftChildIndent(0);
        iiIIIiiiiiIII IiiiiiiiIIIII = new iiIIIiiiiiIII(this);
        IiiiiiiiIIIII.setLeafIcon(null);
        IiiiiiiiIIIII.setOpenIcon(IIIIIiiiIiiII.iiiiIiiiIiiII);
        IiiiiiiiIIIII.setClosedIcon(IIIIIiiiIiiII.ALLATORIxDEMO);
        IiiiiiiiIIIII.setFont(iiIIiiiiIiiII.iIiIIiiiiIIiI);
        IiiiiiiiIIIII.setBackgroundNonSelectionColor(iiIIiiiiIiiII.IIiIiiiiIIiII);
        IiiiiiiiIIIII.setBackgroundSelectionColor(new Color(99, 93, 90));
        IiiiiiiiIIIII.setBorderSelectionColor(iiIIiiiiIiiII.IIiIiiiiIIiII);
        IiiiiiiiIIIII.setTextNonSelectionColor(Color.white);
        IiiiiiiiIIIII.setTextSelectionColor(Color.white);
        this.iiIiiiiiiiIii.setCellRenderer((TreeCellRenderer)IiiiiiiiIIIII);
        this.iiIiiiiiiiIii.setRootVisible(false);
        this.iiIiiiiiiiIii.setRowHeight(20);
        this.iiIiiiiiiiIii.addMouseListener(this);
        this.iiIiiiiiiiIii.addTreeSelectionListener(this);
        this.IiiiiiiiIIIII = com.xy.q.IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)0, (int)0, (int)0, (Component)this.iiIiiiiiiiIii, (int)-1);
    }

    public void ALLATORIxDEMO(StallBuyMenu buyMenu) {
        this.ALLATORIxDEMO.removeAllChildren();
        AllStallBuy IiiiiiiiIIIII = this.IiIIIiiiiIiiI.ALLATORIxDEMO().ALLATORIxDEMO();
        if (IiiiiiiiIIIII == null || buyMenu == null || buyMenu.getPointList() == null) {
            this.iiIiiiiiiiIii.updateUI();
            return;
        }
        for (Point IiiiiiiiIIIII2 : buyMenu.getPointList()) {
            int IiiiiiiiIIIII3 = IiiiiiiiIIIII2.x;
            while (IiiiiiiiIIIII3 <= IiiiiiiiIIIII2.y) {
                StallBuyData IiiiiiiiIIIII4 = (StallBuyData)IiiiiiiiIIIII.getBuyDataMap().get(IiiiiiiiIIIII3);
                IiIIIiiiiIIiI IiiiiiiiIIIII5 = new IiIIIiiiiIIiI(IiiiiiiiIIIII4);
                ++IiiiiiiiIIIII3;
                this.ALLATORIxDEMO.add((MutableTreeNode)IiiiiiiiIIIII5);
            }
        }
        this.iiIiiiiiiiIii.updateUI();
    }

    public void iIiIiiiiIIiii() {
        this.ALLATORIxDEMO.removeAllChildren();
        AllStallBuy IiiiiiiiIIIII = this.IiIIIiiiiIiiI.ALLATORIxDEMO().ALLATORIxDEMO();
        if (IiiiiiiiIIIII == null) {
            this.iiIiiiiiiiIii.updateUI();
            return;
        }
        for (StallBuyMenu IiiiiiiiIIIII2 : IiiiiiiiIIIII.getBuyMenuList()) {
            IiIIIiiiiIIiI IiiiiiiiIIIII3 = new IiIIIiiiiIIiI(IiiiiiiiIIIII2);
            this.ALLATORIxDEMO(IiiiiiiiIIIII2, IiiiiiiiIIIII3, IiiiiiiiIIIII);
            this.ALLATORIxDEMO.add((MutableTreeNode)IiiiiiiiIIIII3);
        }
        this.iiIiiiiiiiIii.updateUI();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (!SwingUtilities.isLeftMouseButton(e)) return;
        this.ALLATORIxDEMO();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    public void ALLATORIxDEMO() {
        TreePath IiiiiiiiIIIII = this.iiIiiiiiiiIii.getSelectionPath();
        if (IiiiiiiiIIIII == null) return;
        if (this.iiIiiiiiiiIii.isExpanded(IiiiiiiiIIIII)) {
            this.iiIiiiiiiiIii.collapsePath(IiiiiiiiIIIII);
            return;
        }
        this.iiIiiiiiiiIii.expandPath(IiiiiiiiIIIII);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(StallBuyMenu buyMenu, IiIIIiiiiIIiI node, AllStallBuy allStallBuy) {
        if (buyMenu.getMenuList() != null) {
            for (Object IiiiiiiiIIIII : buyMenu.getMenuList()) {
                void IiiiiiiiIIIII2;
                IiIIIiiiiIIiI iiIIIiiiiIIiI = new IiIIIiiiiIIiI(IiiiiiiiIIIII);
                this.ALLATORIxDEMO((StallBuyMenu)IiiiiiiiIIIII, (IiIIIiiiiIIiI)IiiiiiiiIIIII2, allStallBuy);
                node.add((MutableTreeNode)IiiiiiiiIIIII2);
            }
        }
        if (buyMenu.getMenuList() == null) return;
        if (buyMenu.getPointList() == null) return;
        for (Object IiiiiiiiIIIII : buyMenu.getPointList()) {
            int IiiiiiiiIIIII3 = IiiiiiiiIIIII.x;
            while (IiiiiiiiIIIII3 <= IiiiiiiiIIIII.y) {
                void IiiiiiiiIIIII4;
                StallBuyData IiiiiiiiIIIII5 = (StallBuyData)allStallBuy.getBuyDataMap().get(IiiiiiiiIIIII3);
                IiIIIiiiiIIiI iiIIIiiiiIIiI = new IiIIIiiiiIIiI(IiiiiiiiIIIII5);
                ++IiiiiiiiIIIII3;
                node.add((MutableTreeNode)IiiiiiiiIIIII4);
            }
        }
    }

    public void ALLATORIxDEMO(String text) {
        this.ALLATORIxDEMO.removeAllChildren();
        AllStallBuy IiiiiiiiIIIII = this.IiIIIiiiiIiiI.ALLATORIxDEMO().ALLATORIxDEMO();
        if (IiiiiiiiIIIII == null) {
            this.iiIiiiiiiiIii.updateUI();
            return;
        }
        ArrayList<StallBuyData> IiiiiiiiIIIII2 = null;
        block0: for (StallBuyData IiiiiiiiIIIII3 : IiiiiiiiIIIII.getBuyDataMap().values()) {
            if (IiiiiiiiIIIII3.getName().indexOf(text) == -1) continue;
            if (IiiiiiiiIIIII2 == null) {
                IiiiiiiiIIIII2 = new ArrayList<StallBuyData>();
            }
            int IiiiiiiiIIIII4 = 0;
            while (IiiiiiiiIIIII4 < IiiiiiiiIIIII2.size()) {
                if (((StallBuyData)IiiiiiiiIIIII2.get(IiiiiiiiIIIII4)).getId() < IiiiiiiiIIIII3.getId()) {
                    ++IiiiiiiiIIIII4;
                    continue;
                }
                IiiiiiiiIIIII2.add(IiiiiiiiIIIII4, IiiiiiiiIIIII3);
                continue block0;
            }
            IiiiiiiiIIIII2.add(IiiiiiiiIIIII3);
        }
        int IiiiiiiiIIIII5 = 0;
        int IiiiiiiiIIIII6 = IiiiiiiiIIIII2 != null ? IiiiiiiiIIIII2.size() : 0;
        while (IiiiiiiiIIIII5 < IiiiiiiiIIIII6) {
            StallBuyData IiiiiiiiIIIII7 = (StallBuyData)IiiiiiiiIIIII2.get(IiiiiiiiIIIII5);
            IiIIIiiiiIIiI IiiiiiiiIIIII8 = new IiIIIiiiiIIiI(IiiiiiiiIIIII7);
            ++IiiiiiiiIIIII5;
            this.ALLATORIxDEMO.add((MutableTreeNode)IiiiiiiiIIIII8);
        }
        this.iiIiiiiiiiIii.updateUI();
    }

    @Override
    public void valueChanged(TreeSelectionEvent e) {
        IiIIIiiiiIIiI IiiiiiiiIIIII = (IiIIIiiiiIIiI)((JTree)e.getSource()).getLastSelectedPathComponent();
        if (IiiiiiiiIIIII == null) {
            return;
        }
        if (!(this.IiIIIiiiiIiiI instanceof iiIiIiiiiiIIi)) return;
        iiIiIiiiiiIIi IiiiiiiiIIIII2 = (iiIiIiiiiiIIi)this.IiIIIiiiiIiiI;
        if (IiiiiiiiIIIII.ALLATORIxDEMO() != null) {
            if (IiiiiiiiIIIII.ALLATORIxDEMO().getMenuList() != null) return;
            if (IiiiiiiiIIIII.ALLATORIxDEMO().getPointList() == null) return;
            IiiiiiiiIIIII2.iIiIiiiiIIiii().ALLATORIxDEMO(IiiiiiiiIIIII.ALLATORIxDEMO());
            return;
        }
        if (IiiiiiiiIIIII.ALLATORIxDEMO() == null) return;
        IiiiiiiiIIIII2.ALLATORIxDEMO(IiiiiiiiIIIII.ALLATORIxDEMO(), null);
    }

    public JScrollPane ALLATORIxDEMO() {
        return this.IiiiiiiiIIIII;
    }
}
