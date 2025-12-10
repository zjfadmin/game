/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.iiiIIiiiIIIii
 *  com.xy.entity.Lingbao
 *  com.xy.game.RoleData
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiiIiiiiIIIii
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.v.iiIiIiiiIIIiI
 */
package com.xy.a.a;

import com.xy.a.a.iiiIIiiiIIIii;
import com.xy.entity.Lingbao;
import com.xy.game.RoleData;
import com.xy.q.IIIiiiiiIiIiI;
import com.xy.q.IiiIiiiiIIIii;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.v.iiIiIiiiIIIiI;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;

/*
 * Exception performing whole class analysis ignored.
 */
static class IiIIIiiiiIiIi
extends IIIiiiiiIiIiI {
    private BigDecimal iiIiiiiiiiIii;
    final /* synthetic */ iiiIIiiiIIIii IiiiiiiiIIIII;
    private int ALLATORIxDEMO;

    private /* synthetic */ void iIiIiiiiIIiIi() {
        this.iiIiiiiiiiIii = null;
        this.ALLATORIxDEMO(0, null);
        this.setVisible(true);
        this.iIIIIiiiiiIIi.ALLATORIxDEMO().iiiIiiiiiiIIi(45);
    }

    protected void paintComponent(Graphics g) {
        RoleData roleData = this.IiiiiiiiIIIII.ALLATORIxDEMO();
        Lingbao IiiiiiiiIIIII = roleData.getLingbao(roleData.lingbaoChoses[this.ALLATORIxDEMO]);
        if (IiiiiiiiIIIII != null) {
            if (this.iiIiiiiiiiIii != IiiiiiiiIIIII.getBaoid()) {
                this.iiIiiiiiiiIii = IiiiiiiiIIIII.getBaoid();
                this.ALLATORIxDEMO(5, IiiiiiiiIIIII);
            }
        } else if (this.iiIiiiiiiiIii != null) {
            this.iIiIiiiiIIiIi();
        }
        super.paintComponent(g);
    }

    public IiIIIiiiiIiIi(iiiIIiiiIIIii iiiIIiiiIIIii2, int index, IiiiIiiiiIiIi form) {
        this.IiiiiiiiIIIII = iiiIIiiiIIIii2;
        super(form);
        this.ALLATORIxDEMO = index;
    }

    public void mouseReleased(MouseEvent e) {
        super.mouseReleased(e);
        if (this.IiiiiiiiIIIII.iiIIiiiiIiIIi.getBattleScene() != null) {
            return;
        }
        RoleData IiiiiiiiIIIII = this.IiiiiiiiIIIII.ALLATORIxDEMO();
        if (IiiiiiiiIIIII.getLingbao(IiiiiiiiIIIII.lingbaoChoses[this.ALLATORIxDEMO]) == null) {
            return;
        }
        if (this.IiiiiiiiIIIII.ALLATORIxDEMO().ALLATORIxDEMO()) {
            return;
        }
        if (this.IiiiiiiiIIIII.iiIIiiiiIiIIi.getMouseIndex() != iiIiIiiiIIIiI.IiIIIiiiiIiiI) return;
        IiiiiiiiIIIII.iIiIiiiiIIiii(null, this.ALLATORIxDEMO);
    }

    public void mousePressed(MouseEvent e) {
        super.mousePressed(e);
        if (e.getButton() != 1) return;
        RoleData roleData = this.IiiiiiiiIIIII.ALLATORIxDEMO();
        Lingbao IiiiiiiiIIIII = roleData.getLingbao(roleData.lingbaoChoses[this.ALLATORIxDEMO]);
        if (IiiiiiiiIIIII == null) {
            return;
        }
        if (!e.isShiftDown()) return;
        try {
            JTextField IiiiiiiiIIIII2 = this.IiiiiiiiIIIII.ALLATORIxDEMO().getBaseView().ALLATORIxDEMO();
            ((IiiIiiiiIIIii)IiiiiiiiIIIII2.getDocument()).ALLATORIxDEMO(IiiiiiiiIIIII2.getCaretPosition(), 4, IiiiiiiiIIIII.getBaoid(), "[" + IiiiiiiiIIIII.getBaoname() + "]", "G", null);
            return;
        }
        catch (BadLocationException IiiiiiiiIIIII3) {
            IiiiiiiiIIIII3.printStackTrace();
            return;
        }
    }
}
