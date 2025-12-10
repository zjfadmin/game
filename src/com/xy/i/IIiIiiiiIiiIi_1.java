/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.iIiIIiiiIiiiI
 *  com.xy.a.a.iiiIIiiiIIIii
 *  com.xy.a.v.iiIiIiiiiIiii
 *  com.xy.i.IIIIIiiiIiiII
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 */
package com.xy.i;

import com.xy.a.a.iIiIIiiiIiiiI;
import com.xy.a.a.iiiIIiiiIIIii;
import com.xy.a.v.iiIiIiiiiIiii;
import com.xy.i.IIIIIiiiIiiII;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;

public class IIiIiiiiIiiIi
extends IIIIIiiiIiiII {
    private IiiiIiiiiIiIi IiiiiiiiIIIII;
    private int ALLATORIxDEMO;

    public IIiIiiiiIiiIi(String path, int type, int id, Font font, Color[] colors, String[] texts, IiiiIiiiiIiIi form) {
        super(path, type, colors);
        this.ALLATORIxDEMO = id;
        this.IiiiiiiiIIIII = form;
        if (font != null) {
            this.setFont(font);
        } else {
            this.setFont(iiIIiiiiIiiII.iiIiiiiiiIIiI);
        }
        this.ALLATORIxDEMO(texts);
    }

    public IIiIiiiiIiiIi(String path, int type, int id, String[] texts, IiiiIiiiiIiIi form) {
        this(path, type, id, null, null, texts, form);
    }

    public void ALLATORIxDEMO(MouseEvent e) {
    }

    public IIiIiiiiIiiIi(String path, int type, int id, IiiiIiiiiIiIi form) {
        super(path, type);
        this.ALLATORIxDEMO = id;
        this.IiiiiiiiIIIII = form;
    }

    public void ALLATORIxDEMO(MouseEvent e, boolean isChoice) {
        if (this.ALLATORIxDEMO >= 1 && this.ALLATORIxDEMO <= 2) {
            if (!isChoice) return;
            ((iiiIIiiiIIIii)this.IiiiiiiiIIIII).iIiIiiiiIIiii(this.ALLATORIxDEMO);
            return;
        }
        if (this.ALLATORIxDEMO >= 3 && this.ALLATORIxDEMO <= 6) {
            if (!isChoice) return;
            ((iIiIIiiiIiiiI)this.IiiiiiiiIIIII).IiiIiiiiiiIiI(this.ALLATORIxDEMO - 3);
            return;
        }
        if (this.ALLATORIxDEMO < 7) return;
        if (this.ALLATORIxDEMO > 10) return;
        if (!isChoice) return;
        ((iiIiIiiiiIiii)this.IiiiiiiiIIIII).iIiIiiiiIIiii(this.ALLATORIxDEMO - 7);
    }
}
