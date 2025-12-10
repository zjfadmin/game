/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.v.IiIiiiiiIIIiI
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 */
package com.xy.a.v;

import com.xy.a.v.IiIiiiiiIIIiI;
import com.xy.q.IIIiiiiiIiIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

/*
 * Exception performing whole class analysis ignored.
 */
static class iIIiiiiiIIIIi
extends IIIiiiiiIiIiI {
    private iIIiIiiiIiiIi IiiiiiiiIIIII;
    final /* synthetic */ IiIiiiiiIIIiI ALLATORIxDEMO;

    public void ALLATORIxDEMO(int type, Object object, int num) {
        super.ALLATORIxDEMO(type, object);
        this.IiiiiiiiIIIII.setText(type == 1 && num > 1 ? String.valueOf(num) : "");
    }

    public iIIiiiiiIIIIi(IiIiiiiiIIIiI iiIiiiiiIIIiI, IiiiIiiiiIiIi form) {
        this.ALLATORIxDEMO = iiIiiiiiIIIiI;
        super(form);
        this.IiiiiiiiIIIII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)2, (int)0, (int)38, (int)14, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iiIiiiiiiIIiI);
        this.add((Component)this.IiiiiiiiIIIII);
    }
}
