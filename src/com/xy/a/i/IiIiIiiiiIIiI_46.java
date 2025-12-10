/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.i.IiiiiiiiiIIII
 *  com.xy.w.IIiIiiiiIiiIi
 */
package com.xy.a.i;

import com.xy.a.i.IiiiiiiiiIIII;
import com.xy.w.IIiIiiiiIiiIi;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;

/*
 * Exception performing whole class analysis ignored.
 */
static class IiIiIiiiiIIiI
extends JComponent
implements MouseListener {
    final /* synthetic */ IiiiiiiiiIIII iiIiiiiiiiIii;
    private Image IiiiiiiiIIIII;
    private int ALLATORIxDEMO;

    @Override
    public void mouseClicked(MouseEvent e) {
        if (this.ALLATORIxDEMO == 0) {
            IiiiiiiiiIIII.ALLATORIxDEMO((IiiiiiiiiIIII)this.iiIiiiiiiiIii)[1].ALLATORIxDEMO(16, (Object)650);
        } else if (this.ALLATORIxDEMO == 1) {
            IiiiiiiiiIIII.ALLATORIxDEMO((IiiiiiiiiIIII)this.iiIiiiiiiiIii)[1].ALLATORIxDEMO(16, (Object)620);
        } else if (this.ALLATORIxDEMO == 2) {
            IiiiiiiiiIIII.ALLATORIxDEMO((IiiiiiiiiIIII)this.iiIiiiiiiiIii)[1].ALLATORIxDEMO(16, (Object)630);
        } else if (this.ALLATORIxDEMO == 3) {
            IiiiiiiiiIIII.ALLATORIxDEMO((IiiiiiiiiIIII)this.iiIiiiiiiiIii)[1].ALLATORIxDEMO(16, (Object)640);
        } else if (this.ALLATORIxDEMO == 4) {
            IiiiiiiiiIIII.ALLATORIxDEMO((IiiiiiiiiIIII)this.iiIiiiiiiiIii)[1].ALLATORIxDEMO(16, (Object)625);
        } else if (this.ALLATORIxDEMO == 5) {
            IiiiiiiiiIIII.ALLATORIxDEMO((IiiiiiiiiIIII)this.iiIiiiiiiiIii)[1].ALLATORIxDEMO(16, (Object)635);
        } else if (this.ALLATORIxDEMO == 6) {
            IiiiiiiiiIIII.ALLATORIxDEMO((IiiiiiiiiIIII)this.iiIiiiiiiiIii)[1].ALLATORIxDEMO(16, (Object)645);
        }
        IiiiiiiiiIIII.ALLATORIxDEMO((IiiiiiiiiIIII)this.iiIiiiiiiiIii, (boolean)false);
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    public IiIiIiiiiIIiI(IiiiiiiiiIIII iiiiiiiiiIIII, int index) {
        this.iiIiiiiiiiIii = iiiiiiiiiIIII;
        this.ALLATORIxDEMO = index;
        if (index == 0) {
            this.IiiiiiiiIIIII = IIiIiiiiIiiIi.iiiiiiiiIIiii((String)String.valueOf(650));
        } else if (index == 1) {
            this.IiiiiiiiIIIII = IIiIiiiiIiiIi.iiiiiiiiIIiii((String)String.valueOf(620));
        } else if (index == 2) {
            this.IiiiiiiiIIIII = IIiIiiiiIiiIi.iiiiiiiiIIiii((String)String.valueOf(630));
        } else if (index == 3) {
            this.IiiiiiiiIIIII = IIiIiiiiIiiIi.iiiiiiiiIIiii((String)String.valueOf(640));
        } else if (index == 4) {
            this.IiiiiiiiIIIII = IIiIiiiiIiiIi.iiiiiiiiIIiii((String)String.valueOf(625));
        } else if (index == 5) {
            this.IiiiiiiiIIIII = IIiIiiiiIiiIi.iiiiiiiiIIiii((String)String.valueOf(635));
        } else if (index == 6) {
            this.IiiiiiiiIIIII = IIiIiiiiIiiIi.iiiiiiiiIIiii((String)String.valueOf(645));
        }
        if (this.IiiiiiiiIIIII == null) return;
        this.addMouseListener(this);
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected void paintComponent(Graphics graphics) {
        void g;
        super.paintComponent((Graphics)g);
        graphics.drawImage(IiiiiiiiiIIII.ALLATORIxDEMO(), 0, 0, this.getWidth(), this.getHeight(), null);
        if (this.IiiiiiiiIIIII == null) return;
        g.drawImage(this.IiiiiiiiIIIII, 1, 1, this.getWidth() - 2, this.getHeight() - 2, null);
    }
}
