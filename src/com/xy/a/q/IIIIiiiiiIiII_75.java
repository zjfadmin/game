/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IiiiIiiiiIiII
 *  com.xy.a.q.IIiiiiiiiiIii
 *  com.xy.a.q.iIIIiiiiIiiII
 *  com.xy.entity.RoleSummoning
 *  com.xy.game.RolePet
 *  com.xy.i.IIiiIiiiiIIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIiiIi
 */
package com.xy.a.q;

import com.xy.a.IiiiIiiiiIiII;
import com.xy.a.q.IIiiiiiiiiIii;
import com.xy.a.q.iIIIiiiiIiiII;
import com.xy.entity.RoleSummoning;
import com.xy.game.RolePet;
import com.xy.i.IIiiIiiiiIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.IIiIiiiiIiiIi;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

/*
 * Exception performing whole class analysis ignored.
 */
static class IIIIiiiiiIiII
extends IIiiIiiiiIIiI {
    private int IiIIIiiiiIiiI;
    private IIIiiiiiIiIiI iiIiiiiiiiIii;
    final /* synthetic */ iIIIiiiiIiiII IiiiiiiiIIIII;
    private JLabel ALLATORIxDEMO;

    public void mousePressed(MouseEvent e) {
        super.mousePressed(e);
        this.iiIiiiiiiiIii.setBounds(2, 2, 39, 39);
    }

    public IIIIiiiiiIiII(iIIIiiiiIiiII iIIIiiiiIiiII2, String iconpath, int type, int index) {
        this.IiiiiiiiIIIII = iIIIiiiiIiiII2;
        super(iconpath, type, iIIIiiiiIiiII2.ALLATORIxDEMO());
        this.IiIIIiiiiIiiI = index;
        this.iiIiiiiiiiIii = new IIIiiiiiIiIiI();
        this.iiIiiiiiiiIii.setBounds(1, 1, 39, 39);
        this.add((Component)this.iiIiiiiiiiIii);
        this.ALLATORIxDEMO = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)38, (int)42, (int)14, (int)0, (Color)Color.white, (Font)iiIIiiiiIiiII.iiIiiiiiiiiiI);
        this.ALLATORIxDEMO.setText(index == 4 ? "\u652f\u63f4" : String.valueOf(index));
        this.add(this.ALLATORIxDEMO);
    }

    public void ALLATORIxDEMO(MouseEvent e, boolean isChoice) {
    }

    public void mouseExited(MouseEvent e) {
        super.mouseExited(e);
        this.IiiiiiiiIIIII.ALLATORIxDEMO().iiiIiiiiiiIIi(42);
    }

    public void mouseReleased(MouseEvent e) {
        super.mouseReleased(e);
        this.iiIiiiiiiiIii.setBounds(1, 1, 39, 39);
    }

    public void mouseEntered(MouseEvent e) {
        super.mouseEntered(e);
        RolePet IiiiiiiiIIIII = this.IiiiiiiiIIIII.ALLATORIxDEMO().getBBRolePet(this.IiIIIiiiiIiiI);
        if (IiiiiiiiIIIII == null) {
            return;
        }
        ((IiiiIiiiiIiII)this.IiiiiiiiIIIII.ALLATORIxDEMO().iiiIiiiiiiIIi(42)).ALLATORIxDEMO(IiiiiiiiIIIII.getPet(), null, false);
    }

    public void ALLATORIxDEMO(MouseEvent e) {
        ((IIiiiiiiiiIii)this.IiiiiiiiIIIII.ALLATORIxDEMO().iiiIiiiiiiIIi(136)).iIiIiiiiIIiii(iIIIiiiiIiiII.ALLATORIxDEMO((iIIIiiiiIiiII)this.IiiiiiiiIIIII));
    }

    public void ALLATORIxDEMO(RolePet rolePet) {
        RoleSummoning IiiiiiiiIIIII = rolePet != null ? rolePet.getPet() : null;
        this.iiIiiiiiiiIii.ALLATORIxDEMO(IiiiiiiiIIIII != null ? IIiIiiiiIiiIi.IiiIiiiiiiIiI((String)("p" + IiiiiiiiIIIII.getSummoningskin())) : null);
    }
}
