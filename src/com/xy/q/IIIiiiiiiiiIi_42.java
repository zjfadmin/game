/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.IiIIIiiiiIIiI
 *  com.xy.entity.Mount
 *  com.xy.game.RoleData
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIiiiiiIIiii
 */
package com.xy.q;

import com.xy.a.a.IiIIIiiiiIIiI;
import com.xy.entity.Mount;
import com.xy.game.RoleData;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIiiiiiIIiii;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.math.BigDecimal;
import javax.swing.JComponent;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IIIiiiiiiiiIi
extends JComponent {
    private IiiiIiiiiIiIi iiIiiiiiiiIii;
    private long IiiiiiiiIIIII;
    private int ALLATORIxDEMO;

    public void ALLATORIxDEMO(iiIiiiiiIIiii mountGrid) {
        this.IiiiiiiiIIIII = mountGrid != null ? mountGrid.ALLATORIxDEMO() : 0L;
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = this.getComponentCount();
        while (IiiiiiiiIIIII < IiiiiiiiIIIII2) {
            iiIiiiiiIIiii iiIiiiiiIIiii2 = (iiIiiiiiIIiii)this.getComponent(IiiiiiiiIIIII);
            iiIiiiiiIIiii2.ALLATORIxDEMO(iiIiiiiiIIiii2 == mountGrid);
            ++IiiiiiiiIIIII;
        }
        Mount IiiiiiiiIIIII22 = this.iiIiiiiiiiIii.ALLATORIxDEMO().getMount(new BigDecimal(this.IiiiiiiiIIIII));
        if (!(this.iiIiiiiiiiIii instanceof IiIIIiiiiIIiI)) return;
        ((IiIIIiiiiIIiI)this.iiIiiiiiiiIii).ALLATORIxDEMO(IiiiiiiiIIIII22);
    }

    public long ALLATORIxDEMO() {
        return this.IiiiiiiiIIIII;
    }

    public IIIiiiiiiiiIi(IiiiIiiiiIiIi form) {
        this.iiIiiiiiiiIii = form;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (!this.iiIiiiiiiiIii.ALLATORIxDEMO().iIiIiiiiIIiii()) return;
        this.ALLATORIxDEMO();
    }

    public boolean ALLATORIxDEMO() {
        RoleData IiiiiiiiIIIII = this.iiIiiiiiiiIii.ALLATORIxDEMO();
        if (IiiiiiiiIIIII == null) {
            return false;
        }
        long IiiiiiiiIIIII2 = 0L;
        int IiiiiiiiIIIII3 = 0;
        int IiiiiiiiIIIII4 = this.getComponentCount();
        for (Mount IiiiiiiiIIIII5 : IiiiiiiiIIIII.mounts) {
            iiIiiiiiIIiii IiiiiiiiIIIII6;
            Component IiiiiiiiIIIII7 = IiiiiiiiIIIII3 < IiiiiiiiIIIII4 ? this.getComponent(IiiiiiiiIIIII3) : null;
            iiIiiiiiIIiii iiIiiiiiIIiii2 = IiiiiiiiIIIII6 = IiiiiiiiIIIII7 != null ? (iiIiiiiiIIiii)IiiiiiiiIIIII7 : null;
            if (IiiiiiiiIIIII6 == null) {
                IiiiiiiiIIIII6 = new iiIiiiiiIIiii(this);
                IiiiiiiiIIIII6.setBounds(0, 20 * IiiiiiiiIIIII3, this.getWidth(), 20);
                this.add((Component)IiiiiiiiIIIII6);
            }
            if (IiiiiiiiIIIII6.ALLATORIxDEMO(++IiiiiiiiIIIII3, this.IiiiiiiiIIIII, IiiiiiiiIIIII5, IiiiiiiiIIIII)) {
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
        if (IiiiiiiiIIIII3 != this.ALLATORIxDEMO) {
            this.ALLATORIxDEMO = IiiiiiiiIIIII3;
            this.setPreferredSize(new Dimension(this.getWidth(), IiiiiiiiIIIII3 * 20));
        }
        if (IiiiiiiiIIIII2 != 0L) return false;
        Component IiiiiiiiIIIII22 = this.getComponentCount() != 0 ? this.getComponent(0) : null;
        this.ALLATORIxDEMO(IiiiiiiiIIIII22 != null ? (iiIiiiiiIIiii)IiiiiiiiIIIII22 : null);
        if (IiiiiiiiIIIII22 == null) return false;
        return true;
    }

    public void ALLATORIxDEMO() {
        if (this.ALLATORIxDEMO()) {
            return;
        }
        this.ALLATORIxDEMO(this.ALLATORIxDEMO());
    }

    public void ALLATORIxDEMO(long selectId) {
        this.IiiiiiiiIIIII = selectId;
    }

    public iiIiiiiiIIiii ALLATORIxDEMO() {
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = this.getComponentCount();
        while (IiiiiiiiIIIII < IiiiiiiiIIIII2) {
            iiIiiiiiIIiii IiiiiiiiIIIII3 = (iiIiiiiiIIiii)this.getComponent(IiiiiiiiIIIII);
            if (IiiiiiiiIIIII3.ALLATORIxDEMO() == this.IiiiiiiiIIIII) return IiiiiiiiIIIII3;
            ++IiiiiiiiIIIII;
        }
        return null;
    }

    public IiiiIiiiiIiIi ALLATORIxDEMO() {
        return this.iiIiiiiiiiIii;
    }
}
