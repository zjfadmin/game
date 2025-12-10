/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IiIIiiiiiIIII
 */
package com.xy.a;

import com.xy.a.IiIIiiiiiIIII;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

/*
 * Exception performing whole class analysis ignored.
 */
static class iiIiiiiiiIIii
implements MouseWheelListener {
    final /* synthetic */ IiIIiiiiiIIII ALLATORIxDEMO;

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        this.ALLATORIxDEMO.ALLATORIxDEMO(-e.getWheelRotation() * 40, IiIIiiiiiIIII.ALLATORIxDEMO((IiIIiiiiiIIII)this.ALLATORIxDEMO).getHeight());
    }

    iiIiiiiiiIIii(IiIIiiiiiIIII iiIIiiiiiIIII) {
        this.ALLATORIxDEMO = iiIIiiiiiIIII;
    }
}
