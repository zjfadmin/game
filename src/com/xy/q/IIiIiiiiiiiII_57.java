/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.IiiiiiiiiIIII
 *  com.xy.game.RoleData
 *  com.xy.q.IiiIiiiiIIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.readbean.Goodstable
 */
package com.xy.q;

import com.xy.a.a.IiiiiiiiiIIII;
import com.xy.game.RoleData;
import com.xy.q.IiiIiiiiIIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.readbean.Goodstable;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IIiIiiiiiiiII
extends JComponent {
    private long iiIiiiiiiiIii;
    private int IiiiiiiiIIIII;
    private IiiiIiiiiIiIi ALLATORIxDEMO;

    public IiiIiiiiIIIiI ALLATORIxDEMO() {
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = this.getComponentCount();
        while (IiiiiiiiIIIII < IiiiiiiiIIIII2) {
            IiiIiiiiIIIiI IiiiiiiiIIIII3 = (IiiIiiiiIIIiI)this.getComponent(IiiiiiiiIIIII);
            if (IiiiiiiiIIIII3.ALLATORIxDEMO() == this.iiIiiiiiiiIii) return IiiiiiiiIIIII3;
            ++IiiiiiiiIIIII;
        }
        return null;
    }

    public void ALLATORIxDEMO(IiiIiiiiIIIiI goodGrid) {
        this.iiIiiiiiiiIii = goodGrid != null ? goodGrid.ALLATORIxDEMO() : 0L;
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = this.getComponentCount();
        while (IiiiiiiiIIIII < IiiiiiiiIIIII2) {
            IiiIiiiiIIIiI iiiIiiiiIIIiI = (IiiIiiiiIIIiI)this.getComponent(IiiiiiiiIIIII);
            iiiIiiiiIIIiI.ALLATORIxDEMO(iiiIiiiiIIIiI == goodGrid);
            ++IiiiiiiiIIIII;
        }
        Goodstable IiiiiiiiIIIII22 = goodGrid != null ? this.ALLATORIxDEMO.ALLATORIxDEMO().getGood(goodGrid.ALLATORIxDEMO()) : null;
        if (!(this.ALLATORIxDEMO instanceof IiiiiiiiiIIII)) return;
        ((IiiiiiiiiIIII)this.ALLATORIxDEMO).ALLATORIxDEMO(IiiiiiiiIIIII22);
    }

    public long ALLATORIxDEMO() {
        return this.iiIiiiiiiiIii;
    }

    public void ALLATORIxDEMO(long selectId) {
        this.iiIiiiiiiiIii = selectId;
    }

    public void ALLATORIxDEMO() {
        if (this.ALLATORIxDEMO()) {
            return;
        }
        this.ALLATORIxDEMO(this.ALLATORIxDEMO());
    }

    public boolean ALLATORIxDEMO() {
        Object IiiiiiiiIIIII;
        RoleData IiiiiiiiIIIII2 = this.ALLATORIxDEMO.ALLATORIxDEMO();
        if (IiiiiiiiIIIII2 == null) {
            return false;
        }
        long IiiiiiiiIIIII3 = 0L;
        int IiiiiiiiIIIII4 = 0;
        int IiiiiiiiIIIII5 = this.getComponentCount();
        int IiiiiiiiIIIII6 = 0;
        while (IiiiiiiiIIIII6 < IiiiiiiiIIIII2.goodPacks.length) {
            IiiiiiiiIIIII = IiiiiiiiIIIII2.getGood(IiiiiiiiIIIII2.goodPacks[IiiiiiiiIIIII6]);
            if (IiiiiiiiIIIII != null && IiiiiiiiIIIII.getType() == 2326L) {
                IiiIiiiiIIIiI IiiiiiiiIIIII7 = (IiiIiiiiIIIiI)(IiiiiiiiIIIII4 < IiiiiiiiIIIII5 ? this.getComponent(IiiiiiiiIIIII4) : null);
                if (IiiiiiiiIIIII7 == null) {
                    IiiiiiiiIIIII7 = new IiiIiiiiIIIiI(this);
                    IiiiiiiiIIIII7.setBounds(0, 20 * IiiiiiiiIIIII4, this.getWidth(), 20);
                    this.add((Component)IiiiiiiiIIIII7);
                }
                if (IiiiiiiiIIIII7.ALLATORIxDEMO(++IiiiiiiiIIIII4, this.iiIiiiiiiiIii, IiiiiiiiIIIII, IiiiiiiiIIIII2)) {
                    IiiiiiiiIIIII3 = IiiiiiiiIIIII7.ALLATORIxDEMO();
                }
                IiiiiiiiIIIII7.setVisible(true);
            }
            ++IiiiiiiiIIIII6;
        }
        IiiiiiiiIIIII6 = IiiiiiiiIIIII4;
        while (IiiiiiiiIIIII6 < this.getComponentCount()) {
            Component component = this.getComponent(IiiiiiiiIIIII6);
            ++IiiiiiiiIIIII6;
            IiiiiiiiIIIII = component;
            component.setVisible(false);
        }
        if (IiiiiiiiIIIII4 != this.IiiiiiiiIIIII) {
            this.IiiiiiiiIIIII = IiiiiiiiIIIII4;
            this.setPreferredSize(new Dimension(this.getWidth(), IiiiiiiiIIIII4 * 20));
        }
        if (IiiiiiiiIIIII3 != 0L) return false;
        Component IiiiiiiiIIIII22 = this.getComponentCount() != 0 ? this.getComponent(0) : null;
        this.ALLATORIxDEMO(IiiiiiiiIIIII22 != null ? (IiiIiiiiIIIiI)IiiiiiiiIIIII22 : null);
        if (IiiiiiiiIIIII22 == null) return false;
        return true;
    }

    public IiiiIiiiiIiIi ALLATORIxDEMO() {
        return this.ALLATORIxDEMO;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (!this.ALLATORIxDEMO.ALLATORIxDEMO().iIiIiiiiIIiii()) return;
        this.ALLATORIxDEMO();
    }

    public IIiIiiiiiiiII(IiiiIiiiiIiIi form) {
        this.ALLATORIxDEMO = form;
    }
}
