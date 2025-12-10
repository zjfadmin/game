/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.iiiIIiiiIIIii
 *  com.xy.entity.Lingbao
 *  com.xy.entity.RoleSummoning
 *  com.xy.i.IIiiIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.w.IIiIiiiiIiiIi
 */
package com.xy.i;

import com.xy.a.q.iiiIIiiiIIIii;
import com.xy.entity.Lingbao;
import com.xy.entity.RoleSummoning;
import com.xy.i.IIiiIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.w.IIiIiiiiIiiIi;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;

public class iIiIiiiiIiIII
extends IIiiIiiiiIIiI {
    private Image image;
    private int ALLATORIxDEMO;

    public void ALLATORIxDEMO(MouseEvent e) {
        iiiIIiiiIIIii IiiiiiiiIIIII = (iiiIIiiiIIIii)this.form.ALLATORIxDEMO().iIiIiiiiIIiii(62);
        if (IiiiiiiiIIIII != null && IiiiiiiiIIIII.isVisible()) {
            this.form.ALLATORIxDEMO().iiiIiiiiiiIIi(62);
            return;
        }
        IiiiiiiiIIIII = (iiiIIiiiIIIii)this.form.ALLATORIxDEMO().iiiIiiiiiiIIi(62);
        IiiiiiiiIIIII.iIiIiiiiIIiIi(this.ALLATORIxDEMO == 11 ? 0 : 1);
        this.form.ALLATORIxDEMO().iIiIiiiiIIiIi(62);
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(Object data) {
        if (data == null) {
            this.image = null;
            return;
        }
        if (data instanceof RoleSummoning) {
            void IiiiiiiiIIIII;
            RoleSummoning roleSummoning = (RoleSummoning)data;
            this.image = IIiIiiiiIiiIi.IiiIiiiiiiIiI((String)("p" + IiiiiiiiIIIII.getSummoningskin()));
            return;
        }
        if (data instanceof Lingbao) {
            Lingbao IiiiiiiiIIIII = (Lingbao)data;
            this.image = IIiIiiiiIiiIi.IIIIIiiiiIIii((String)IiiiiiiiIIIII.getSkin());
            return;
        }
        this.image = null;
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (this.image == null) return;
        g.drawImage(this.image, 2, 2, 40, 40, null);
    }

    public iIiIiiiiIiIII(String path, int type, int id, IiiiIiiiiIiIi form) {
        super(path, type, form);
        this.ALLATORIxDEMO = id;
    }

    public int ALLATORIxDEMO() {
        return this.ALLATORIxDEMO;
    }

    public void ALLATORIxDEMO(MouseEvent e, boolean isChoice) {
    }
}
