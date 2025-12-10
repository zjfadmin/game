/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IiIIiiiiiIIII
 *  com.xy.game.GameUtil
 *  com.xy.richtext.InputBean
 *  com.xy.text.GameView
 */
package com.xy.a;

import com.xy.a.IiIIiiiiiIIII;
import com.xy.game.GameUtil;
import com.xy.richtext.InputBean;
import com.xy.text.GameView;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/*
 * Exception performing whole class analysis ignored.
 */
static class iiiIIiiiIiIII
implements MouseListener {
    final /* synthetic */ IiIIiiiiiIIII ALLATORIxDEMO;

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (IiIIiiiiiIIII.ALLATORIxDEMO((IiIIiiiiiIIII)this.ALLATORIxDEMO) == null) return;
        GameUtil.ALLATORIxDEMO((InputBean)IiIIiiiiiIIII.ALLATORIxDEMO((IiIIiiiiiIIII)this.ALLATORIxDEMO), (GameView)this.ALLATORIxDEMO.ALLATORIxDEMO());
    }

    iiiIIiiiIiIII(IiIIiiiiiIIII iiIIiiiiiIIII) {
        this.ALLATORIxDEMO = iiIIiiiiiIIII;
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        void e;
        IiIIiiiiiIIII.ALLATORIxDEMO((IiIIiiiiiIIII)this.ALLATORIxDEMO, (InputBean)IiIIiiiiiIIII.ALLATORIxDEMO((IiIIiiiiiIIII)this.ALLATORIxDEMO, (int)e.getX(), (int)e.getY()));
        if (IiIIiiiiiIIII.ALLATORIxDEMO((IiIIiiiiiIIII)this.ALLATORIxDEMO) == null) return;
        IiIIiiiiiIIII.ALLATORIxDEMO((IiIIiiiiiIIII)this.ALLATORIxDEMO).setM(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }
}
