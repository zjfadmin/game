/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iIiiiiiiiiiii
 *  com.xy.a.q.IIiiiiiiIiIii
 *  com.xy.bean.FriendBean
 *  com.xy.q.IIIIIiiiIiIii
 *  com.xy.q.IIiIiiiiIiIII
 *  com.xy.q.IIiIiiiiIiiIi
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIiIiiiiIiIII
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiIiIiiiiIiii
 *  com.xy.readbean.petExchange
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIiIiiiiIIiii
 */
package com.xy.q;

import com.xy.a.iIiiiiiiiiiii;
import com.xy.a.q.IIiiiiiiIiIii;
import com.xy.bean.FriendBean;
import com.xy.q.IIIIIiiiIiIii;
import com.xy.q.IIiIiiiiIiIII;
import com.xy.q.IIiIiiiiIiiIi;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIiIiiiiIiIII;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.q.iiIiIiiiiIiii;
import com.xy.readbean.petExchange;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.w.IIiIiiiiIIiii;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.MouseListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionListener;
import javax.swing.plaf.basic.BasicTreeUI;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeCellRenderer;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IIIIIiiiIiiII
extends JComponent {
    private IIIIIiiiIiIii iiIiIiiiiIIIi;
    public static Icon iiiiIiiiIiiII = new ImageIcon(com.xy.w.IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/b/expand.png"));
    private IiiiIiiiiIiIi iiiIiiiiiiiIi;
    private DefaultMutableTreeNode iIiiIiiiiiiII;
    private boolean IIiiIiiiIIiIi;
    private IIiIiiiiIIiii iIiIiiiiIiIii;
    DefaultMutableTreeNode IiIIIiiiiIiiI;
    private JScrollPane iiIiiiiiiiIii;
    private JTree IiiiiiiiIIIII;
    public static Icon ALLATORIxDEMO = new ImageIcon(com.xy.w.IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/b/not_expanded.png"));

    public IIIIIiiiIiiII(IiiiIiiiiIiIi view) {
        this(view, 20);
    }

    @Override
    public void setBounds(int x, int y, int width, int height) {
        super.setBounds(x, y, width, height);
        if (this.iIiIiiiiIiIii != null) {
            this.iiIiiiiiiiIii.setBounds(10, 5, width - 15, height - 9);
            return;
        }
        this.iiIiiiiiiiIii.setBounds(0, 0, width, height);
    }

    public IIIIIiiiIiiII(IiiiIiiiiIiIi view, int rowHeight) {
        this.iiiIiiiiiiiIi = view;
        this.iIiiIiiiiiiII = new DefaultMutableTreeNode("");
        this.iIiiIiiiiiiII.add(new DefaultMutableTreeNode(""));
        this.IiiiiiiiIIIII = new JTree(this.iIiiIiiiiiiII);
        this.IiiiiiiiIIIII.setOpaque(false);
        this.IiiiiiiiIIIII.putClientProperty("JTree.lineStyle", "None");
        ((BasicTreeUI)this.IiiiiiiiIIIII.getUI()).setLeftChildIndent(0);
        this.iiIiIiiiiIIIi = new IIIIIiiiIiIii();
        this.iiIiIiiiiIIIi.iIiIiiiiIIiii(null);
        this.iiIiIiiiiIIIi.ALLATORIxDEMO(iiiiIiiiIiiII);
        this.iiIiIiiiiIIIi.iiiIiiiiiiIIi(ALLATORIxDEMO);
        this.iiIiIiiiiIIIi.iIiIiiiiIIiIi(iiIIiiiiIiiII.iiIiIiiiiIIIi);
        this.iiIiIiiiiIIIi.iiiIiiiiiiIIi(iiIIiiiiIiiII.iIiiIiiiIIIIi);
        this.iiIiIiiiiIIIi.iIiIiiiiIIiii(iiIIiiiiIiiII.IIiIiiiiIIiII);
        this.iiIiIiiiiIIIi.IiiIiiiiiiIiI(Color.white);
        this.iiIiIiiiiIIIi.ALLATORIxDEMO(Color.white);
        this.IiiiiiiiIIIII.setCellRenderer((TreeCellRenderer)this.iiIiIiiiiIIIi);
        this.IiiiiiiiIIIII.setRootVisible(false);
        this.IiiiiiiiIIIII.setRowHeight(rowHeight);
        this.IiiiiiiiIIIII.setFont(iiIIiiiiIiiII.iIiIiiiiiiIIi);
        if (view instanceof iIiiiiiiiiiii) {
            this.iiIiIiiiiIIIi.iiiIiiiiiiIIi(iIiIiiiiIiIII.iIiiIiiiiiiII);
            this.iiIiIiiiiIIIi.iIiIiiiiIIiii(ALLATORIxDEMO);
            this.IiiiiiiiIIIII.setFont(iiIIiiiiIiiII.iIIIIiiiiiIiI);
        }
        this.IiiiiiiiIIIII.addMouseListener((MouseListener)new IIiIiiiiIiIII(this));
        this.IiiiiiiiIIIII.addTreeSelectionListener((TreeSelectionListener)new iiIiIiiiiIiii(this));
        this.iiIiiiiiiiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)0, (int)0, (int)0, (Component)this.IiiiiiiiIIIII, (int)-1);
        this.add(this.iiIiiiiiiiIii);
    }

    public boolean ALLATORIxDEMO() {
        return this.IIiiIiiiIIiIi;
    }

    public void ALLATORIxDEMO(String type, DefaultMutableTreeNode node) {
        if (type == null) {
            this.iIiiIiiiiiiII.add(node);
            return;
        }
        int IiiiiiiiIIIII = this.iIiiIiiiiiiII.getChildCount();
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < IiiiiiiiIIIII) {
            DefaultMutableTreeNode IiiiiiiiIIIII3 = (DefaultMutableTreeNode)this.iIiiIiiiiiiII.getChildAt(IiiiiiiiIIIII2);
            if (type.equals(IiiiiiiiIIIII3.toString())) {
                IiiiiiiiIIIII3.add(node);
                return;
            }
            ++IiiiiiiiIIIII2;
        }
        DefaultMutableTreeNode IiiiiiiiIIIII22 = new DefaultMutableTreeNode(type);
        IiiiiiiiIIIII22.add(node);
        this.iIiiIiiiiiiII.add(IiiiiiiiIIIII22);
    }

    public void ALLATORIxDEMO(boolean mouse) {
        this.IIiiIiiiIIiIi = mouse;
    }

    static /* synthetic */ boolean ALLATORIxDEMO(IIIIIiiiIiiII arg0) {
        return arg0.IIiiIiiiIIiIi;
    }

    static /* synthetic */ JTree ALLATORIxDEMO(IIIIIiiiIiiII arg0) {
        return arg0.IiiiiiiiIIIII;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (this.iIiIiiiiIiIii == null) return;
        this.iIiIiiiiIiIii.ALLATORIxDEMO(g, this.getWidth(), this.getHeight());
    }

    public void ALLATORIxDEMO(IIiIiiiiIIiii iIiIiiiiIIiii) {
        this.iIiIiiiiIiIii = iIiIiiiiIIiii;
        this.setBounds(this.getX(), this.getY(), this.getWidth(), this.getHeight());
    }

    public void ALLATORIxDEMO() {
        if (this.IiiiiiiiIIIII == null) return;
        this.IiiiiiiiIIIII.updateUI();
    }

    public synchronized void ALLATORIxDEMO(DefaultMutableTreeNode node, int button) {
        if (this.IiIIIiiiiIiiI == node && iIiIIiiiIiiiI.ALLATORIxDEMO()) {
            return;
        }
        this.IiIIIiiiiIiiI = node;
        if (!(node.getUserObject() instanceof IIiIiiiiIiiIi)) return;
        IIiIiiiiIiiIi IiiiiiiiIIIII = (IIiIiiiiIiiIi)node.getUserObject();
        if (this.iiiIiiiiiiiIi instanceof iIiiiiiiiiiii) {
            ((iIiiiiiiiiiii)this.iiiIiiiiiiiIi).ALLATORIxDEMO(IiiiiiiiIIIII != null ? (FriendBean)IiiiiiiiIIIII.ALLATORIxDEMO() : null, button);
            return;
        }
        if (!(this.iiiIiiiiiiiIi instanceof IIiiiiiiIiIii)) return;
        ((IIiiiiiiIiIii)this.iiiIiiiiiiiIi).ALLATORIxDEMO(IiiiiiiiIIIII != null ? (petExchange)IiiiiiiiIIIII.ALLATORIxDEMO() : null, button);
    }

    public DefaultMutableTreeNode ALLATORIxDEMO() {
        return this.iIiiIiiiiiiII;
    }

    public JTree ALLATORIxDEMO() {
        return this.IiiiiiiiIIIII;
    }
}
