/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.i.IIIiIiiiIiIII
 *  com.xy.a.i.IiiIiiiiIIIii
 *  com.xy.a.i.iIIIIiiiIiiIi
 *  com.xy.a.i.iIiIiiiiIiIII
 *  com.xy.entity.PartJade
 *  com.xy.game.RoleData
 *  com.xy.q.IIIIIiiiIiiII
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.RoleSuitBean
 *  com.xy.richtext.RichLabel
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.i;

import com.xy.a.i.IIIiIiiiIiIII;
import com.xy.a.i.IiiIiiiiIIIii;
import com.xy.a.i.iIIIIiiiIiiIi;
import com.xy.a.i.iIiIiiiiIiIII;
import com.xy.entity.PartJade;
import com.xy.game.RoleData;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.RoleSuitBean;
import com.xy.richtext.RichLabel;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Iterator;
import java.util.Map;
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
public class IiIIIiiiIIiII
implements TreeSelectionListener,
MouseListener {
    private RichLabel iiiiIiiiIiiII;
    private DefaultMutableTreeNode iiiIiiiiiiiIi;
    private JTree iIiiIiiiiiiII;
    private IIIiiiiiIiIiI IIiiIiiiIIiIi;
    private JScrollPane iIiIiiiiIiIii;
    private JScrollPane IiIIIiiiiIiiI;
    private IiiIiiiiIIIii iiIiiiiiiiIii;
    private IiiiIiiiiIiIi IiiiiiiiIIIII;
    private boolean ALLATORIxDEMO;

    static /* synthetic */ boolean ALLATORIxDEMO(IiIIIiiiIIiII arg0) {
        return arg0.ALLATORIxDEMO;
    }

    /*
     * Unable to fully structure code
     */
    public void ALLATORIxDEMO(PartJade partJade) {
        IiiiiiiiIIIII = this.IiiiiiiiIIIII.ALLATORIxDEMO().ALLATORIxDEMO((int)partJade.getSuitid());
        if (IiiiiiiiIIIII == null) {
            return;
        }
        IiiiiiiiIIIII = this.iiiIiiiiiiiIi.children();
        while (IiiiiiiiIIIII.hasMoreElements()) {
            IiiiiiiiIIIII = (DefaultMutableTreeNode)IiiiiiiiIIIII.nextElement();
            if (!IiiiiiiiIIIII.getSname().equals(IiiiiiiiIIIII.getUserObject())) continue;
            IiiiiiiiIIIII = IiiiiiiiIIIII.children();
            if (true) ** GOTO lbl15
        }
        return;
        do {
            if ((IiiiiiiiIIIII = (iIIIIiiiIiiIi)IiiiiiiiIIIII.nextElement()).ALLATORIxDEMO().getSuitid() != partJade.getSuitid() || IiiiiiiiIIIII.ALLATORIxDEMO().getPartId() != partJade.getPartId()) continue;
            IiiiiiiiIIIII.ALLATORIxDEMO().ALLATORIxDEMO(partJade);
            return;
lbl15:
            // 2 sources

        } while (IiiiiiiiIIIII.hasMoreElements());
    }

    public void iiiIiiiiiiIIi() {
        if (this.IiIIIiiiiIiiI != null) {
            this.IiIIIiiiiIiiI.setViewportView(null);
        }
        this.iIiIiiiiIIiii();
    }

    @Override
    public void valueChanged(TreeSelectionEvent e) {
        if (this.IiIIIiiiiIiiI == null) {
            return;
        }
        Object IiiiiiiiIIIII = ((JTree)e.getSource()).getLastSelectedPathComponent();
        if (IiiiiiiiIIIII == null) {
            this.IiIIIiiiiIiiI.setViewportView(null);
            return;
        }
        if (IiiiiiiiIIIII instanceof iIIIIiiiIiiIi) {
            iIIIIiiiIiiIi IiiiiiiiIIIII2 = (iIIIIiiiIiiIi)IiiiiiiiIIIII;
            if (this.iiIiiiiiiiIii == null) {
                this.iiIiiiiiiiIii = new IiiIiiiiIIIii(this.IiiiiiiiIIIII, IiiiiiiiIIIII2.ALLATORIxDEMO());
            } else {
                this.iiIiiiiiiiIii.ALLATORIxDEMO(IiiiiiiiIIIII2.ALLATORIxDEMO());
            }
            this.IiIIIiiiiIiiI.setViewportView((Component)this.iiIiiiiiiiIii);
            return;
        }
        if (!(IiiiiiiiIIIII instanceof DefaultMutableTreeNode)) return;
        DefaultMutableTreeNode IiiiiiiiIIIII3 = (DefaultMutableTreeNode)IiiiiiiiIIIII;
        String IiiiiiiiIIIII4 = IiiiiiiiIIIII3.toString();
        RoleSuitBean IiiiiiiiIIIII5 = this.IiiiiiiiIIIII.ALLATORIxDEMO().ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII4);
        if (IiiiiiiiIIIII5 == null) {
            return;
        }
        if (this.iiiiIiiiIiiII == null) {
            this.iiiiIiiiIiiII = new RichLabel(IiiiiiiiIIIII5.getIntroduce(), iiIIiiiiIiiII.iiIiiiiiiIIiI);
        } else {
            this.iiiiIiiiIiiII.setText(IiiiiiiiIIIII5.getIntroduce());
        }
        Dimension IiiiiiiiIIIII6 = this.iiiiIiiiIiiII.computeSize(275);
        this.iiiiIiiiIiiII.setSize(IiiiiiiiIIIII6);
        this.iiiiIiiiIiiII.setPreferredSize(IiiiiiiiIIIII6);
        this.IiIIIiiiiIiiI.setViewportView((Component)this.iiiiIiiiIiiII);
    }

    public JScrollPane iIiIiiiiIIiii() {
        return this.iIiIiiiiIiIii;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    static /* synthetic */ IIIiiiiiIiIiI ALLATORIxDEMO(IiIIIiiiIIiII arg0) {
        return arg0.IIiiIiiiIIiIi;
    }

    /*
     * WARNING - void declaration
     */
    public void iIiIiiiiIIiii() {
        RoleData IiiiiiiiIIIII = this.IiiiiiiiIIIII.ALLATORIxDEMO();
        if (IiiiiiiiIIIII == null) {
            return;
        }
        boolean IiiiiiiiIIIII2 = this.ALLATORIxDEMO;
        this.iiiIiiiiiiiIi.removeAllChildren();
        Map IiiiiiiiIIIII3 = this.IiiiiiiiIIIII.ALLATORIxDEMO().ALLATORIxDEMO().getRolesuit();
        if (IiiiiiiiIIIII3 != null) {
            Iterator IiiiiiiiIIIII4 = IiiiiiiiIIIII3.entrySet().iterator();
            while (IiiiiiiiIIIII4.hasNext()) {
                RoleSuitBean IiiiiiiiIIIII5 = (RoleSuitBean)IiiiiiiiIIIII4.next().getValue();
                DefaultMutableTreeNode IiiiiiiiIIIII6 = new DefaultMutableTreeNode(IiiiiiiiIIIII5.getSname());
                boolean IiiiiiiiIIIII7 = true;
                int[] IiiiiiiiIIIII8 = IiiiiiiiIIIII5.getParts();
                int IiiiiiiiIIIII9 = 0;
                while (IiiiiiiiIIIII9 < IiiiiiiiIIIII8.length) {
                    void IiiiiiiiIIIII10;
                    PartJade IiiiiiiiIIIII11 = IiiiiiiiIIIII.getPackRecord().getPartJade(IiiiiiiiIIIII5.getSuitID(), IiiiiiiiIIIII8[IiiiiiiiIIIII9]);
                    iIIIIiiiIiiIi iIIIIiiiIiiIi2 = new iIIIIiiiIiiIi(IiiiiiiiIIIII11);
                    IiiiiiiiIIIII6.add((MutableTreeNode)IiiiiiiiIIIII10);
                    if (IiiiiiiiIIIII7) {
                        IiiiiiiiIIIII7 = IiiiiiiiIIIII11.ALLATORIxDEMO();
                    }
                    ++IiiiiiiiIIIII9;
                }
                if (IiiiiiiiIIIII2 && IiiiiiiiIIIII7) continue;
                this.iiiIiiiiiiiIi.add(IiiiiiiiIIIII6);
            }
        }
        this.iIiiIiiiiiiII.updateUI();
    }

    public void ALLATORIxDEMO() {
        TreePath IiiiiiiiIIIII = this.iIiiIiiiiiiII.getSelectionPath();
        if (IiiiiiiiIIIII == null) return;
        if (this.iIiiIiiiiiiII.isExpanded(IiiiiiiiIIIII)) {
            this.iIiiIiiiiiiII.collapsePath(IiiiiiiiIIIII);
            return;
        }
        this.iIiiIiiiiiiII.expandPath(IiiiiiiiIIIII);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    public IiIIIiiiIIiII(IiiiIiiiiIiIi form, IIIiiiiiIiIiI imgJComponent) {
        this.IiiiiiiiIIIII = form;
        this.IIiiIiiiIIiIi = imgJComponent;
        this.ALLATORIxDEMO = true;
        this.IIiiIiiiIIiIi.ALLATORIxDEMO(IIIIIiiiIiiII.iiiIiiiiiiIIi((String)(this.ALLATORIxDEMO ? "sc/e/30.png" : "sc/e/29.png")));
        this.IIiiIiiiIIiIi.addMouseListener((MouseListener)new iIiIiiiiIiIII(this));
        this.iiiIiiiiiiiIi = new DefaultMutableTreeNode("");
        this.iiiIiiiiiiiIi.add(new DefaultMutableTreeNode(""));
        this.iIiiIiiiiiiII = new JTree(this.iiiIiiiiiiiIi);
        this.iIiiIiiiiiiII.setOpaque(false);
        this.iIiiIiiiiiiII.putClientProperty("JTree.lineStyle", "None");
        ((BasicTreeUI)this.iIiiIiiiiiiII.getUI()).setLeftChildIndent(0);
        IIIiIiiiIiIII IiiiiiiiIIIII = new IIIiIiiiIiIII(this);
        IiiiiiiiIIIII.setLeafIcon(null);
        IiiiiiiiIIIII.setOpenIcon(com.xy.q.IIIIIiiiIiiII.iiiiIiiiIiiII);
        IiiiiiiiIIIII.setClosedIcon(com.xy.q.IIIIIiiiIiiII.ALLATORIxDEMO);
        IiiiiiiiIIIII.setFont(iiIIiiiiIiiII.iIiIIiiiiIIiI);
        IiiiiiiiIIIII.setBackgroundNonSelectionColor(iiIIiiiiIiiII.IIiIiiiiIIiII);
        IiiiiiiiIIIII.setBackgroundSelectionColor(new Color(99, 93, 90));
        IiiiiiiiIIIII.setBorderSelectionColor(iiIIiiiiIiiII.IIiIiiiiIIiII);
        IiiiiiiiIIIII.setTextNonSelectionColor(Color.white);
        IiiiiiiiIIIII.setTextSelectionColor(Color.white);
        this.iIiiIiiiiiiII.setCellRenderer((TreeCellRenderer)IiiiiiiiIIIII);
        this.iIiiIiiiiiiII.setRootVisible(false);
        this.iIiiIiiiiiiII.setRowHeight(20);
        this.iIiiIiiiiiiII.addMouseListener(this);
        this.iIiiIiiiiiiII.addTreeSelectionListener(this);
        this.iIiIiiiiIiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)0, (int)0, (int)0, (Component)this.iIiiIiiiiiiII, (int)-1);
        this.IiIIIiiiiIiiI = IiIIIiiiiIIiI.ALLATORIxDEMO((int)185, (int)55, (int)297, (int)173, null, (int)-1);
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    public JScrollPane ALLATORIxDEMO() {
        return this.IiIIIiiiiIiiI;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (!SwingUtilities.isLeftMouseButton(e)) return;
        this.ALLATORIxDEMO();
    }

    static /* synthetic */ void ALLATORIxDEMO(IiIIIiiiIIiII arg0, boolean arg1) {
        arg0.ALLATORIxDEMO = arg1;
    }
}
