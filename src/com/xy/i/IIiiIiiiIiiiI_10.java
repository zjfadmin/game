/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.i.IIIiIiiiIiIII
 *  com.xy.i.IIiiIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 */
package com.xy.i;

import com.xy.i.IIIiIiiiIiIII;
import com.xy.i.IIiiIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import java.awt.Color;
import java.awt.event.MouseEvent;

public class IIiiIiiiIiiiI
extends IIiiIiiiiIIiI {
    private int IiiiiiiiIIIII;
    private IIIiIiiiIiIII ALLATORIxDEMO;

    public void iiiIiiiiiiIIi() {
    }

    public void ALLATORIxDEMO(MouseEvent e) {
        if (this.ALLATORIxDEMO == null) return;
        this.ALLATORIxDEMO.ALLATORIxDEMO(this.IiiiiiiiIIIII);
    }

    public void ALLATORIxDEMO(IIIiIiiiIiIII btnGroup) {
        this.ALLATORIxDEMO = btnGroup;
    }

    public IIiiIiiiIiiiI(String iconpath, int type, int path) {
        super(iconpath, type, null);
        this.IiiiiiiiIIIII = path;
    }

    public IIiiIiiiIiiiI(String iconpath, int type, int path, IiiiIiiiiIiIi form) {
        super(iconpath, type, form);
        this.IiiiiiiiIIIII = path;
    }

    public IIiiIiiiIiiiI(String iconpath, int type, String text, int path, IiiiIiiiiIiIi form) {
        super(iconpath, type, form);
        this.IiiiiiiiIIIII = path;
        this.setFont(iiIIiiiiIiiII.iiIiiiiiiIIiI);
        this.setForeground(Color.white);
        this.setHorizontalAlignment(0);
        this.setText(text);
    }

    public void ALLATORIxDEMO(MouseEvent e, boolean isChoice) {
        if (!isChoice) {
            return;
        }
        if (this.ALLATORIxDEMO != null) {
            this.ALLATORIxDEMO.ALLATORIxDEMO(this.IiiiiiiiIIIII);
            return;
        }
        if (this.form == null) return;
        this.iiiIiiiiiiIIi();
    }
}
