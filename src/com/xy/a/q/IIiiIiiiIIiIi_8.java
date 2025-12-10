/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.iIIIiiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.socket.Agreement
 */
package com.xy.a.q;

import com.xy.a.q.iIIIiiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.socket.Agreement;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;

/*
 * Exception performing whole class analysis ignored.
 */
static class IIiiIiiiIIiIi
extends JLabel
implements MouseListener {
    final /* synthetic */ iIIIiiiiiIiIi IiiiiiiiIIIII;
    private int ALLATORIxDEMO;

    @Override
    public void mouseClicked(MouseEvent e) {
        if (this.ALLATORIxDEMO >= iIIIiiiiiIiIi.ALLATORIxDEMO((iIIIiiiiiIiIi)this.IiiiiiiiIIIII)) {
            this.IiiiiiiiIIIII.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u7b2c" + (this.ALLATORIxDEMO + 1) + "\u5929\u8fd8\u672a\u5f00\u653e\u8865\u7b7e");
            return;
        }
        if ((this.IiiiiiiiIIIII.ALLATORIxDEMO().getTaskSystem().ALLATORIxDEMO(7, 2) >>> this.ALLATORIxDEMO & 1) != 0) return;
        String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"taskN", (String)("R7=B1" + this.ALLATORIxDEMO));
        this.IiiiiiiiIIIII.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    public IIiiIiiiIIiIi(iIIIiiiiiIiIi iIIIiiiiiIiIi2, int index) {
        this.IiiiiiiiIIIII = iIIIiiiiiIiIi2;
        super(String.valueOf(index + 1), 0);
        this.ALLATORIxDEMO = index;
        this.setForeground(Color.black);
        this.setFont(iiIIiiiiIiiII.iiIiIiiiIiiII);
        this.setOpaque(true);
        this.addMouseListener(this);
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }
}
