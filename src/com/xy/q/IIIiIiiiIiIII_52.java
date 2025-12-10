/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.iiIiIiiiiIiii
 *  com.xy.game.RoleData
 *  com.xy.game.RolePet
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIIIIiiiIiiIi
 */
package com.xy.q;

import com.xy.a.a.iiIiIiiiiIiii;
import com.xy.game.RoleData;
import com.xy.game.RolePet;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIIIIiiiIiiIi;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IIIiIiiiIiIII
extends JComponent {
    private int iiIiiiiiiiIii;
    private long IiiiiiiiIIIII;
    private IiiiIiiiiIiIi ALLATORIxDEMO;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (!this.ALLATORIxDEMO.ALLATORIxDEMO().iIiIiiiiIIiii()) return;
        this.ALLATORIxDEMO();
    }

    public iIIIIiiiIiiIi ALLATORIxDEMO() {
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = this.getComponentCount();
        while (IiiiiiiiIIIII < IiiiiiiiIIIII2) {
            iIIIIiiiIiiIi IiiiiiiiIIIII3 = (iIIIIiiiIiiIi)this.getComponent(IiiiiiiiIIIII);
            if (IiiiiiiiIIIII3.ALLATORIxDEMO() == this.IiiiiiiiIIIII) return IiiiiiiiIIIII3;
            ++IiiiiiiiIIIII;
        }
        return null;
    }

    public boolean ALLATORIxDEMO() {
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO.ALLATORIxDEMO();
        if (IiiiiiiiIIIII == null) {
            return false;
        }
        long IiiiiiiiIIIII2 = 0L;
        int IiiiiiiiIIIII3 = 0;
        int IiiiiiiiIIIII4 = this.getComponentCount();
        for (RolePet IiiiiiiiIIIII5 : IiiiiiiiIIIII.pets) {
            iIIIIiiiIiiIi IiiiiiiiIIIII6;
            Component IiiiiiiiIIIII7 = IiiiiiiiIIIII3 < IiiiiiiiIIIII4 ? this.getComponent(IiiiiiiiIIIII3) : null;
            iIIIIiiiIiiIi iIIIIiiiIiiIi2 = IiiiiiiiIIIII6 = IiiiiiiiIIIII7 != null ? (iIIIIiiiIiiIi)IiiiiiiiIIIII7 : null;
            if (IiiiiiiiIIIII6 == null) {
                IiiiiiiiIIIII6 = new iIIIIiiiIiiIi(this);
                IiiiiiiiIIIII6.setBounds(0, 20 * IiiiiiiiIIIII3, this.getWidth(), 20);
                this.add((Component)IiiiiiiiIIIII6);
            }
            if (IiiiiiiiIIIII6.ALLATORIxDEMO(++IiiiiiiiIIIII3, this.IiiiiiiiIIIII, IiiiiiiiIIIII5.getPet(), IiiiiiiiIIIII)) {
                IiiiiiiiIIIII2 = IiiiiiiiIIIII6.ALLATORIxDEMO();
            }
            IiiiiiiiIIIII6.setVisible(true);
        }
        int IiiiiiiiIIIII8 = IiiiiiiiIIIII3;
        while (IiiiiiiiIIIII8 < this.getComponentCount()) {
            Component component = this.getComponent(IiiiiiiiIIIII8);
            ++IiiiiiiiIIIII8;
            Component IiiiiiiiIIIII9 = component;
            component.setVisible(false);
        }
        if (IiiiiiiiIIIII3 != this.iiIiiiiiiiIii) {
            this.iiIiiiiiiiIii = IiiiiiiiIIIII3;
            if (this.ALLATORIxDEMO instanceof iiIiIiiiiIiii) {
                ((iiIiIiiiiIiii)this.ALLATORIxDEMO).ALLATORIxDEMO()[0].setText("\u53ec\u5524\u517d(" + this.iiIiiiiiiiIii + "/21)");
            }
            this.setPreferredSize(new Dimension(this.getWidth(), IiiiiiiiIIIII3 * 20));
        }
        if (IiiiiiiiIIIII2 != 0L) return false;
        Component IiiiiiiiIIIII22 = this.getComponentCount() != 0 ? this.getComponent(0) : null;
        this.ALLATORIxDEMO(IiiiiiiiIIIII22 != null ? (iIIIIiiiIiiIi)IiiiiiiiIIIII22 : null);
        if (IiiiiiiiIIIII22 == null) return false;
        return true;
    }

    public void ALLATORIxDEMO(long selectId) {
        this.IiiiiiiiIIIII = selectId;
    }

    public void ALLATORIxDEMO(iIIIIiiiIiiIi petMountGrid) {
        this.IiiiiiiiIIIII = petMountGrid != null ? petMountGrid.ALLATORIxDEMO() : 0L;
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = this.getComponentCount();
        while (IiiiiiiiIIIII < IiiiiiiiIIIII2) {
            iIIIIiiiIiiIi iIIIIiiiIiiIi2 = (iIIIIiiiIiiIi)this.getComponent(IiiiiiiiIIIII);
            iIIIIiiiIiiIi2.ALLATORIxDEMO(iIIIIiiiIiiIi2 == petMountGrid);
            ++IiiiiiiiIIIII;
        }
    }

    public void ALLATORIxDEMO() {
        if (this.ALLATORIxDEMO()) {
            return;
        }
        this.ALLATORIxDEMO(this.ALLATORIxDEMO());
    }

    public IIIiIiiiIiIII(IiiiIiiiiIiIi form) {
        this.ALLATORIxDEMO = form;
    }

    public IiiiIiiiiIiIi ALLATORIxDEMO() {
        return this.ALLATORIxDEMO;
    }

    public long ALLATORIxDEMO() {
        return this.IiiiiiiiIIIII;
    }
}
