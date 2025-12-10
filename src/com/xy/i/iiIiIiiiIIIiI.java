/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.v.IIIIiiiiIIIIi
 *  com.xy.a.v.IIIiIiiiiIIiI
 *  com.xy.a.v.IIIiiiiiIiIiI
 *  com.xy.a.v.IiIiiiiiIIIiI
 *  com.xy.a.v.IiiIiiiiIIIIi
 *  com.xy.a.v.IiiIiiiiIIIiI
 *  com.xy.a.v.IiiIiiiiIiIIi
 *  com.xy.a.v.IiiiIiiiiIiIi
 *  com.xy.a.v.iIIiIiiiIiiIi
 *  com.xy.a.v.iIiIiiiiIiIII
 *  com.xy.a.v.iiIIiiiiIiIiI
 *  com.xy.a.v.iiIIiiiiIiiII
 *  com.xy.a.v.iiIiIiiiiIiIi
 *  com.xy.a.v.iiIiIiiiiIiii
 *  com.xy.a.v.iiIiIiiiiiIIi
 *  com.xy.a.v.iiIiiiiiIIiiI
 *  com.xy.a.v.iiiiiiiiiiIiI
 *  com.xy.i.IIiiIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 */
package com.xy.i;

import com.xy.a.v.IIIIiiiiIIIIi;
import com.xy.a.v.IIIiIiiiiIIiI;
import com.xy.a.v.IIIiiiiiIiIiI;
import com.xy.a.v.IiIiiiiiIIIiI;
import com.xy.a.v.IiiIiiiiIIIIi;
import com.xy.a.v.IiiIiiiiIIIiI;
import com.xy.a.v.IiiIiiiiIiIIi;
import com.xy.a.v.iIIiIiiiIiiIi;
import com.xy.a.v.iIiIiiiiIiIII;
import com.xy.a.v.iiIIiiiiIiIiI;
import com.xy.a.v.iiIiIiiiiIiIi;
import com.xy.a.v.iiIiIiiiiIiii;
import com.xy.a.v.iiIiIiiiiiIIi;
import com.xy.a.v.iiIiiiiiIIiiI;
import com.xy.a.v.iiiiiiiiiiIiI;
import com.xy.i.IIiiIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;

public class iiIiIiiiIIIiI
extends IIiiIiiiiIIiI {
    private int iiIiiiiiiiIii;
    private JComponent IiiiiiiiIIIII;
    private int ALLATORIxDEMO;

    public void ALLATORIxDEMO(MouseEvent e) {
        if (this.IiiiiiiiIIIII != null) {
            if (this.IiiiiiiiIIIII instanceof IiIiiiiiIIIiI) {
                ((IiIiiiiiIIIiI)this.IiiiiiiiIIIII).iIiIiiiiIIiii(this.iiIiiiiiiiIii);
                return;
            }
            if (this.IiiiiiiiIIIII instanceof IiiIiiiiIiIIi) {
                ((IiiIiiiiIiIIi)this.IiiiiiiiIIIII).ALLATORIxDEMO(this.iiIiiiiiiiIii);
                return;
            }
            if (this.IiiiiiiiIIIII instanceof iiIIiiiiIiIiI) {
                ((iiIIiiiiIiIiI)this.IiiiiiiiIIIII).ALLATORIxDEMO(this.iiIiiiiiiiIii, this.ALLATORIxDEMO);
                return;
            }
            if (this.IiiiiiiiIIIII instanceof IIIiIiiiiIIiI) {
                ((IIIiIiiiiIIiI)this.IiiiiiiiIIIII).iIiIiiiiIIiii(this.iiIiiiiiiiIii);
                return;
            }
            if (!(this.IiiiiiiiIIIII instanceof IiiIiiiiIIIIi)) return;
            ((IiiIiiiiIIIIi)this.IiiiiiiiIIIII).ALLATORIxDEMO(this.iiIiiiiiiiIii);
            return;
        }
        if (this.iiIiiiiiiiIii == 140) {
            ((iiIiIiiiiIiii)this.form).iiiIiiiiiiIIi();
            return;
        }
        if (this.iiIiiiiiiiIii == 141 || this.iiIiiiiiiiIii == 142) {
            ((iiIiIiiiiiIIi)this.form).ALLATORIxDEMO(this.iiIiiiiiiiIii, null);
            return;
        }
        if (this.iiIiiiiiiiIii == 151) {
            ((iIiIiiiiIiIII)this.form).iIiIiiiiIIiii(Integer.parseInt(this.getName()));
            return;
        }
        if (this.iiIiiiiiiiIii == 161 || this.iiIiiiiiiiIii == 162) {
            ((iiIiIiiiiIiIi)this.form).ALLATORIxDEMO(this.iiIiiiiiiiIii, (Object)Integer.parseInt(this.getName()));
            return;
        }
        if (this.iiIiiiiiiiIii >= 180 && this.iiIiiiiiiiIii <= 183) {
            ((com.xy.a.v.iiIIiiiiIiiII)this.form).ALLATORIxDEMO(this.iiIiiiiiiiIii, this.ALLATORIxDEMO);
            return;
        }
        if (this.iiIiiiiiiiIii >= 191 && this.iiIiiiiiiiIii <= 198) {
            ((iiiiiiiiiiIiI)this.form).ALLATORIxDEMO(this.iiIiiiiiiiIii, this.ALLATORIxDEMO);
            return;
        }
        if (this.iiIiiiiiiiIii != 201) return;
        ((IIIiiiiiIiIiI)this.form).iIiIiiiiIIiii(this.iiIiiiiiiiIii);
    }

    public iiIiIiiiIIIiI(String path, int type, int id, Font font, Color[] colors, String text, IiiiIiiiiIiIi form) {
        super(path, type, colors, form);
        this.iiIiiiiiiiIii = id;
        if (font != null) {
            this.setFont(font);
        } else {
            this.setFont(iiIIiiiiIiiII.iiIiiiiiiIIiI);
        }
        this.setHorizontalAlignment(0);
        this.setVerticalTextPosition(0);
        this.setText(text);
    }

    public iiIiIiiiIIIiI(String path, int type, int id, Font font, Color[] colors, String text, IiiiIiiiiIiIi form, JComponent view) {
        super(path, type, colors, form);
        this.iiIiiiiiiiIii = id;
        this.IiiiiiiiIIIII = view;
        if (font != null) {
            this.setFont(font);
        } else {
            this.setFont(iiIIiiiiIiiII.iiIiiiiiiIIiI);
        }
        this.setHorizontalAlignment(0);
        this.setVerticalTextPosition(0);
        this.setText(text);
    }

    public int iIiIiiiiIIiii() {
        return this.iiIiiiiiiiIii;
    }

    public int ALLATORIxDEMO() {
        return this.ALLATORIxDEMO;
    }

    public void ALLATORIxDEMO(MouseEvent e, boolean isChoice) {
        if (this.iiIiiiiiiiIii >= 1 && this.iiIiiiiiiiIii <= 20) {
            if (!isChoice) return;
            ((IIIIiiiiIIIIi)this.form).iiiIiiiiiiIIi(this.iiIiiiiiiiIii, this.ALLATORIxDEMO);
            return;
        }
        if (this.iiIiiiiiiiIii >= 21 && this.iiIiiiiiiiIii <= 30) {
            if (!isChoice) return;
            ((IiiIiiiiIIIiI)this.form).iIiIiiiiIIiii(this.iiIiiiiiiiIii);
            return;
        }
        if (this.iiIiiiiiiiIii == 31) {
            if (!isChoice) return;
            ((iiIiiiiiIIiiI)this.form).iIiIiiiiIIiii(this.ALLATORIxDEMO);
            return;
        }
        if (this.iiIiiiiiiiIii == 32) {
            if (!isChoice) return;
            ((iIIiIiiiIiiIi)this.form).iIiIiiiiIIiii(this.ALLATORIxDEMO);
            return;
        }
        if (this.iiIiiiiiiiIii == 143) {
            if (!isChoice) return;
            ((iiIiIiiiiiIIi)this.form).ALLATORIxDEMO(this.iiIiiiiiiiIii, (Object)Integer.parseInt(this.getName()));
            return;
        }
        if (this.iiIiiiiiiiIii == 146) {
            ((iiIiIiiiiiIIi)this.form).ALLATORIxDEMO(this.iiIiiiiiiiIii, (Object)Integer.parseInt(this.getName()));
            return;
        }
        if (this.iiIiiiiiiiIii < 171) return;
        if (this.iiIiiiiiiiIii > 173) return;
        ((com.xy.a.v.IiiiIiiiiIiIi)this.form).iIiIiiiiIIiii(this.iiIiiiiiiiIii - 171);
    }

    public void iIiIiiiiIIiii(int key) {
        this.ALLATORIxDEMO = key;
    }

    public iiIiIiiiIIIiI(String path, int type, int id, IiiiIiiiiIiIi form) {
        super(path, type, form);
        this.iiIiiiiiiiIii = id;
        this.form = form;
    }

    public void ALLATORIxDEMO(int id) {
        this.iiIiiiiiiiIii = id;
    }

    public iiIiIiiiIIIiI(String path, int type, int id, IiiiIiiiiIiIi form, JComponent view) {
        super(path, type, form);
        this.iiIiiiiiiiIii = id;
        this.IiiiiiiiIIIII = view;
        this.setHorizontalAlignment(0);
        this.setVerticalTextPosition(0);
    }

    public iiIiIiiiIIIiI(String path, int type, int id, String text, IiiiIiiiiIiIi form) {
        this(path, type, id, null, null, text, form);
    }
}
