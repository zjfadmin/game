/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IIIiIiiiiIIiI
 *  com.xy.game.GameUtil
 *  com.xy.richtext.InputBean
 *  com.xy.text.GameView
 */
package com.xy.a;

import com.xy.a.IIIiIiiiiIIiI;
import com.xy.game.GameUtil;
import com.xy.richtext.InputBean;
import com.xy.text.GameView;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/*
 * Exception performing whole class analysis ignored.
 */
static class iIiIIiiiIIiIi
implements MouseListener {
    final /* synthetic */ IIIiIiiiiIIiI ALLATORIxDEMO;

    /*
     * WARNING - void declaration
     */
    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        void e;
        IIIiIiiiiIIiI.ALLATORIxDEMO((IIIiIiiiiIIiI)this.ALLATORIxDEMO, (InputBean)IIIiIiiiiIIiI.ALLATORIxDEMO((IIIiIiiiiIIiI)this.ALLATORIxDEMO).isMonitor(e.getX(), e.getY()));
        if (IIIiIiiiiIIiI.ALLATORIxDEMO((IIIiIiiiiIIiI)this.ALLATORIxDEMO) == null) return;
        IIIiIiiiiIIiI.ALLATORIxDEMO((IIIiIiiiiIIiI)this.ALLATORIxDEMO).setM(true);
    }

    iIiIIiiiIIiIi(IIIiIiiiiIIiI iIIiIiiiiIIiI) {
        this.ALLATORIxDEMO = iIIiIiiiiIIiI;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (IIIiIiiiiIIiI.ALLATORIxDEMO((IIIiIiiiiIIiI)this.ALLATORIxDEMO) == null) return;
        GameUtil.ALLATORIxDEMO((InputBean)IIIiIiiiiIIiI.ALLATORIxDEMO((IIIiIiiiiIIiI)this.ALLATORIxDEMO), (GameView)this.ALLATORIxDEMO.ALLATORIxDEMO());
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }
}
