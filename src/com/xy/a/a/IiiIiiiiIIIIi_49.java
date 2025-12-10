/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.IiIIIiiiiIIiI
 *  com.xy.entity.RoleSummoning
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.w.IIiIiiiiIiiIi
 */
package com.xy.a.a;

import com.xy.a.a.IiIIIiiiiIIiI;
import com.xy.entity.RoleSummoning;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.w.IIiIiiiiIiiIi;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import javax.swing.JComponent;

/*
 * Exception performing whole class analysis ignored.
 */
static class IiiIiiiiIIIIi
extends JComponent
implements MouseListener {
    private Image iiIiiiiiiiIii;
    final /* synthetic */ IiIIIiiiiIIiI IiiiiiiiIIIII;
    private BigDecimal ALLATORIxDEMO;

    public void ALLATORIxDEMO(BigDecimal sid) {
        if (IIiiIiiiiIIiI.ALLATORIxDEMO((BigDecimal)sid, (BigDecimal)this.ALLATORIxDEMO)) {
            return;
        }
        this.ALLATORIxDEMO = sid;
        RoleSummoning IiiiiiiiIIIII = sid != null ? this.IiiiiiiiIIIII.ALLATORIxDEMO().getPet(sid) : null;
        this.iiIiiiiiiiIii = IiiiiiiiIIIII != null ? IIiIiiiiIiiIi.IiiIiiiiiiIiI((String)("p" + IiiiiiiiIIIII.getSummoningskin())) : null;
    }

    public IiiIiiiiIIIIi(IiIIIiiiiIIiI iiIIIiiiiIIiI) {
        this.IiiiiiiiIIIII = iiIIIiiiiIIiI;
        this.addMouseListener(this);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(IiIIIiiiiIIiI.ALLATORIxDEMO((IiIIIiiiiIIiI)this.IiiiiiiiIIIII), 0, 0, this.getWidth(), this.getHeight(), null);
        if (this.iiIiiiiiiiIii == null) return;
        g.drawImage(this.iiIiiiiiiiIii, 12, 11, 35, 35, null);
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (this.ALLATORIxDEMO == null) return;
        if (!e.isMetaDown()) return;
        this.IiiiiiiiIIIII.iIiIiiiiIIiii(this.ALLATORIxDEMO);
    }
}
