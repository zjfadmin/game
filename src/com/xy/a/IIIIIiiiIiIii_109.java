/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IIIIIiiiIiiII
 *  com.xy.game.GameUtil
 *  com.xy.richtext.InputBean
 *  com.xy.text.GameView
 */
package com.xy.a;

import com.xy.a.IIIIIiiiIiiII;
import com.xy.game.GameUtil;
import com.xy.richtext.InputBean;
import com.xy.text.GameView;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/*
 * Exception performing whole class analysis ignored.
 */
static class IIIIIiiiIiIii
implements MouseListener {
    final /* synthetic */ IIIIIiiiIiiII ALLATORIxDEMO;

    /*
     * WARNING - void declaration
     */
    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        void e;
        IIIIIiiiIiiII.ALLATORIxDEMO((IIIIIiiiIiiII)this.ALLATORIxDEMO, (InputBean)IIIIIiiiIiiII.ALLATORIxDEMO((IIIIIiiiIiiII)this.ALLATORIxDEMO).isMonitor(e.getX(), e.getY()));
        if (IIIIIiiiIiiII.ALLATORIxDEMO((IIIIIiiiIiiII)this.ALLATORIxDEMO) == null) return;
        IIIIIiiiIiiII.ALLATORIxDEMO((IIIIIiiiIiiII)this.ALLATORIxDEMO).setM(true);
    }

    IIIIIiiiIiIii(IIIIIiiiIiiII iIIIIiiiIiiII) {
        this.ALLATORIxDEMO = iIIIIiiiIiiII;
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (IIIIIiiiIiiII.ALLATORIxDEMO((IIIIIiiiIiiII)this.ALLATORIxDEMO) == null) return;
        GameUtil.ALLATORIxDEMO((InputBean)IIIIIiiiIiiII.ALLATORIxDEMO((IIIIIiiiIiiII)this.ALLATORIxDEMO), (GameView)this.ALLATORIxDEMO.ALLATORIxDEMO().iiIIiiiiIiIIi);
        IIIIIiiiIiiII.ALLATORIxDEMO((IIIIIiiiIiiII)this.ALLATORIxDEMO, null);
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }
}
