/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iiiiiiiiIIIII
 *  com.xy.socket.Agreement
 *  com.xy.w.IIIIIiiiIiiII
 */
package com.xy.a;

import com.xy.a.iiiiiiiiIIIII;
import com.xy.socket.Agreement;
import com.xy.w.IIIIIiiiIiiII;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;

/*
 * Exception performing whole class analysis ignored.
 */
static class IIIIiiiiIIIIi
extends JComponent
implements MouseListener {
    private Image IIiiIiiiIIiIi;
    private boolean iIiIiiiiIiIii;
    private Image IiIIIiiiiIiiI;
    private int iiIiiiiiiiIii;
    private boolean IiiiiiiiIIIII;
    final /* synthetic */ iiiiiiiiIIIII ALLATORIxDEMO;

    @Override
    protected void paintComponent(Graphics g) {
        if (this.IiiiiiiiIIIII) {
            g.drawImage(this.ALLATORIxDEMO(1), 1, 1, this.getWidth(), this.getHeight(), null);
            return;
        }
        if (this.iIiIiiiiIiIii) {
            g.drawImage(this.ALLATORIxDEMO(1), 0, 0, this.getWidth(), this.getHeight(), null);
            return;
        }
        g.drawImage(this.ALLATORIxDEMO(0), 0, 0, this.getWidth(), this.getHeight(), null);
    }

    public IIIIiiiiIIIIi(iiiiiiiiIIIII iiiiiiiiIIIII2, int index) {
        this.ALLATORIxDEMO = iiiiiiiiIIIII2;
        this.iiIiiiiiiiIii = index;
        this.addMouseListener(this);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.IiiiiiiiIIIII = Boolean.FALSE;
        this.iIiIiiiiIiIii = Boolean.FALSE;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        this.IiiiiiiiIIIII = Boolean.FALSE;
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.iIiIiiiiIiIii = Boolean.TRUE;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        this.IiiiiiiiIIIII = Boolean.TRUE;
        if (!this.iIiIiiiiIiIii) {
            return;
        }
        if (this.iiIiiiiiiiIii == 0) {
            String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"teamArena", (String)"X");
            this.ALLATORIxDEMO.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (this.iiIiiiiiiiIii == 1 && this.ALLATORIxDEMO.ALLATORIxDEMO().VALUE.indexOf(74) != -1) {
            this.ALLATORIxDEMO.ALLATORIxDEMO().iIiIiiiiIIiIi(135);
            return;
        }
        this.ALLATORIxDEMO.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u6682\u672a\u5f00\u653e");
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    public Image ALLATORIxDEMO(int type) {
        if (type == 0 && this.IIiiIiiiIIiIi == null || type != 0 && this.IiIIIiiiiIiiI == null) {
            if (type == 0) {
                this.IIiiIiiiIIiIi = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)("sc/b/S" + (this.iiIiiiiiiiIii * 2 + 278) + ".png"));
            } else {
                this.IiIIIiiiiIiiI = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)("sc/b/S" + (this.iiIiiiiiiiIii * 2 + 279) + ".png"));
            }
        }
        if (type != 0) return this.IiIIIiiiiIiiI;
        return this.IIiiIiiiIIiIi;
    }
}
