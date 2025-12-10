/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.iiiIIiiiIIIii
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.q;

import com.xy.a.q.iiiIIiiiIIIii;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;

/*
 * Exception performing whole class analysis ignored.
 */
static class IiIIIiiiiIiIi
implements MouseListener {
    private int iIiIiiiiIiIii;
    private JLabel IiIIIiiiiIiiI;
    final /* synthetic */ iiiIIiiiIIIii iiIiiiiiiiIii;
    private int IiiiiiiiIIIII;
    private IIIiiiiiIiIiI ALLATORIxDEMO;

    public void ALLATORIxDEMO(int value) {
        this.iIiIiiiiIiIii = value;
        this.ALLATORIxDEMO.iIiIiiiiIIiii(value == 0 ? "sc/e/29.png" : "sc/e/30.png");
    }

    static /* synthetic */ JLabel ALLATORIxDEMO(IiIIIiiiiIiIi arg0) {
        return arg0.IiIIIiiiiIiiI;
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    /*
     * WARNING - void declaration
     */
    public IiIIIiiiiIiIi(iiiIIiiiIIIii iiiIIiiiIIIii2, int n, iiiIIiiiIIIii iiiIIiiiIIIii3) {
        void view;
        void index;
        this.iiIiiiiiiiIii = iiiIIiiiIIIii2;
        this.IiiiiiiiIIIII = index;
        this.IiIIIiiiiIiiI = IiIIIiiiiIIiI.ALLATORIxDEMO((int)65, (int)(358 + index * 22), (int)150, (int)17, (int)10, (Color)Color.black, (Font)iiIIiiiiIiiII.iIiIiiiiiiIIi);
        this.IiIIIiiiiIiiI.setText(index == false ? "\u5f00\u542f\u652f\u63f4\u5217\u8868" : (index == true ? "\u9501\u5b9a\u9996\u53d1\u53ec\u5524\u517d" : (index == 2 ? "\u6218\u6597\u754c\u9762\u663e\u793a\u652f\u63f4" : "")));
        this.ALLATORIxDEMO = new IIIiiiiiIiIiI("sc/e/29.png");
        this.ALLATORIxDEMO.setBounds(47, 358 + index * 22, 17, 17);
        if (index == true) {
            this.ALLATORIxDEMO(1);
        } else {
            this.ALLATORIxDEMO.addMouseListener((MouseListener)this);
        }
        view.add((Component)this.IiIIIiiiiIiiI);
        view.add((Component)this.ALLATORIxDEMO);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (this.IiiiiiiiIIIII == 0) {
            this.iiIiiiiiiiIii.IiiIiiiiiiIiI();
            return;
        }
        if (this.IiiiiiiiIIIII != 2) return;
        this.iiIiiiiiiiIii.iiIIiiiiIiIIi.systemData.setB6(this.iIiIiiiiIiIii != 0);
        this.iiIiiiiiiiIii.iiIIiiiiIiIIi.systemData.setValue();
        this.ALLATORIxDEMO(this.iIiIiiiiIiIii == 0 ? 1 : 0);
        this.iiIiiiiiiiIii.iiIIiiiiIiIIi.getBattleControl().IiiIiiiiiiIiI();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }
}
