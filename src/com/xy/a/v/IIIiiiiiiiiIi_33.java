/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.v.IiiIIiiiiIiii
 *  com.xy.bean.RoleShow
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iIiIIiiiIiiiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.v.IiiiIiiiiIIII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIiIiiiiIiiIi
 */
package com.xy.a.v;

import com.xy.a.v.IiiIIiiiiIiii;
import com.xy.bean.RoleShow;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.iIiIIiiiIiiiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.v.IiiiIiiiiIIII;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIiIiiiiIiiIi;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JLabel;

/*
 * Exception performing whole class analysis ignored.
 */
static class IIIiiiiiiiiIi
extends iIiIIiiiIiiiI {
    private JLabel IiIIIiiiiIiiI = IiIIIiiiiIIiI.ALLATORIxDEMO((int)20, (int)50, (int)124, (int)19, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFF6600"), (Font)iiIIiiiiIiiII.iIIiiiiiiIIII);
    private Image iiIiiiiiiiIii;
    private JLabel IiiiiiiiIIIII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)70, (int)164, (int)21, (Color)Color.black, (Font)iiIIiiiiIiiII.iIiIiiiiiiIIi);
    final /* synthetic */ IiiIIiiiiIiii ALLATORIxDEMO;

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (IiiIIiiiiIiii.ALLATORIxDEMO((IiiIIiiiiIiii)this.ALLATORIxDEMO) == null) {
            IiiIIiiiiIiii.ALLATORIxDEMO((IiiIIiiiiIiii)this.ALLATORIxDEMO, (Image)IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/147.png"));
        }
        g.drawImage(IiiIIiiiiIiii.ALLATORIxDEMO((IiiIIiiiiIiii)this.ALLATORIxDEMO), 16, 0, 132, 97, null);
        if (this.iiIiiiiiiiIii == null) return;
        g.drawImage(this.iiIiiiiiiiIii, 0, 4, 165, 45, null);
    }

    public void ALLATORIxDEMO(boolean captain, RoleShow roleShow) {
        if (roleShow == null) {
            this.iiIiiiiiiiIii = null;
            this.setVisible(false);
            return;
        }
        this.IiIIIiiiiIiiI.setText(String.valueOf(IiiiIiiiiIIII.iIiIiiiiIIiii((int)roleShow.getGrade())) + "级");
        if (captain) {
            this.IiiiiiiiIIIII.setText("队长:" + roleShow.getRolename());
        } else {
            this.IiiiiiiiIIIII.setText(roleShow.getRolename());
        }
        this.iiIiiiiiiiIii = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)IIiIiiiiIiiIi.iiiIiiiiiiIIi((String)("bwdh" + roleShow.getSpecies_id().intValue())));
        this.setVisible(true);
    }

    public IIIiiiiiiiiIi(IiiIIiiiiIiii iiiIIiiiiIiii) {
        this.ALLATORIxDEMO = iiiIIiiiiIiii;
        this.IiIIIiiiiIiiI.setHorizontalAlignment(0);
        this.IiiiiiiiIIIII.setHorizontalAlignment(0);
        this.add(this.IiIIIiiiiIiiI);
        this.add(this.IiiiiiiiIIIII);
    }
}
