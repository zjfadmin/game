/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IiIiIiiiiIIiI
 *  com.xy.q.IIIiIiiiiIiII
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a;

import com.xy.a.IiIiIiiiiIIiI;
import com.xy.q.IIIiIiiiiIiII;
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
static class IIiIiiiiIiiIi
implements MouseListener {
    private IIIiiiiiIiIiI IIiiIiiiIIiIi;
    final /* synthetic */ IiIiIiiiiIIiI iIiIiiiiIiIii;
    private int IiIIIiiiiIiiI;
    private IIIiIiiiiIiII iiIiiiiiiiIii;
    private int IiiiiiiiIIIII;
    private JLabel ALLATORIxDEMO;

    @Override
    public void mouseClicked(MouseEvent e) {
        this.IiiiiiiiIIIII = this.IiiiiiiiIIIII == 0 ? 1 : 0;
        this.IIiiIiiiIIiIi.iIiIiiiiIIiii(this.IiiiiiiiIIIII == 0 ? "sc/e/29.png" : "sc/e/30.png");
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    /*
     * WARNING - void declaration
     */
    public IIiIiiiiIiiIi(IiIiIiiiiIIiI iiIiIiiiiIIiI, int n, IiIiIiiiiIIiI iiIiIiiiiIIiI2) {
        void view;
        void index;
        this.iIiIiiiiIiIii = iiIiIiiiiIIiI;
        this.ALLATORIxDEMO = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)0, (int)0, (int)0, (int)(index < 2 ? 2 : (index % 2 == false ? 4 : 2)), (Color)Color.black, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
        view.add((Component)this.ALLATORIxDEMO);
        if (index == false) {
            this.iiIiiiiiiiIii = new IIIiIiiiiIiII();
            this.iiIiiiiiiiIii.iIiIiiiiIIiii(true);
            this.iiIiiiiiiiIii.ALLATORIxDEMO("800*600");
            this.iiIiiiiiiiIii.ALLATORIxDEMO("1024*768");
            this.iiIiiiiiiiIii.ALLATORIxDEMO("1280*960");
            this.iiIiiiiiiiIii.ALLATORIxDEMO("1366*768");
            view.add((Component)this.iiIiiiiiiiIii);
            return;
        }
        if (index == true) {
            IIiIiiiiIiiIi iIiIiiiiIiiIi = this;
            IIiIiiiiIiiIi iIiIiiiiIiiIi2 = this;
            iIiIiiiiIiiIi2.iiIiiiiiiiIii = new IIIiIiiiiIiII();
            iIiIiiiiIiiIi.iiIiiiiiiiIii.iIiIiiiiIIiii(true);
            iIiIiiiiIiiIi2.iiIiiiiiiiIii.ALLATORIxDEMO("30 FPS");
            iIiIiiiiIiiIi.iiIiiiiiiiIii.ALLATORIxDEMO("40 FPS");
            iIiIiiiiIiiIi2.iiIiiiiiiiIii.ALLATORIxDEMO("50 FPS");
            iIiIiiiiIiiIi.iiIiiiiiiiIii.ALLATORIxDEMO("60 FPS");
            view.add((Component)this.iiIiiiiiiiIii);
            return;
        }
        this.IIiiIiiiIIiIi = new IIIiiiiiIiIiI();
        this.IIiiIiiiIIiIi.addMouseListener((MouseListener)this);
        view.add((Component)this.IIiiIiiiIIiIi);
    }

    public void ALLATORIxDEMO(int index, int value) {
        if (index > 13) {
            index = -1;
        }
        this.IiIIIiiiiIiiI = index;
        this.IiiiiiiiIIIII = value;
        if (index == -1) {
            this.ALLATORIxDEMO.setVisible(false);
            this.IIiiIiiiIIiIi.setVisible(false);
            if (this.iiIiiiiiiiIii == null) return;
            this.iiIiiiiiiiIii.setVisible(false);
            return;
        }
        this.ALLATORIxDEMO.setText(index == 0 ? "\u663e\u793a\u8bbe\u7f6e" : (index == 1 ? "\u9891\u7387\u4e0a\u9650" : (index == 2 ? "\u97f3\u4e50" : (index == 3 ? "\u97f3\u6548" : (index == 4 ? "\u5207\u78cb\u5f00\u5173" : (index == 5 ? "\u62d2\u7edd\u964c\u751f\u4eba\u6d88\u606f" : (index == 6 ? "\u4fe1\u4ef6\u63a5\u6536" : (index == 7 ? "\u52a0\u5165\u597d\u53cb" : (index == 8 ? "\u63a5\u53d7\u7269\u54c1" : (index == 9 ? "\u63a5\u53d7\u7ec4\u961f" : (index == 10 ? "\u8001\u7248\u89d2\u8272" : (index == 11 ? "\u5173\u95ed\u98de\u884c\u7279\u6548" : (index == 12 ? "\u9ed8\u8ba4\u5c0f\u5730\u56fe\u53f3\u952e\u98de\u884c" : (index == 13 ? "\u9ed8\u8ba4\u5bfb\u8def\u4f7f\u7528\u4efb\u6211\u884c" : ""))))))))))))));
        if (index == 0) {
            this.ALLATORIxDEMO.setBounds(52, 40, 80, 20);
            this.iiIiiiiiiiIii.ALLATORIxDEMO(132, 40, 100, 20);
            this.iiIiiiiiiiIii.ALLATORIxDEMO(value);
            this.ALLATORIxDEMO.setVisible(true);
            this.iiIiiiiiiiIii.setVisible(true);
            return;
        }
        if (index == 1) {
            this.ALLATORIxDEMO.setBounds(306, 40, 80, 20);
            this.iiIiiiiiiiIii.ALLATORIxDEMO(386, 40, 100, 20);
            this.iiIiiiiiiiIii.ALLATORIxDEMO(value);
            this.ALLATORIxDEMO.setVisible(true);
            this.iiIiiiiiiiIii.setVisible(true);
            return;
        }
        this.ALLATORIxDEMO.setBounds(40 + index % 2 * 290, 41 + index / 2 * 35, 170, 20);
        this.IIiiIiiiIIiIi.setBounds(215 + index % 2 * 95, 43 + index / 2 * 35, 17, 17);
        this.ALLATORIxDEMO.setVisible(true);
        this.IIiiIiiiIIiIi.iIiIiiiiIIiii(value == 0 ? "sc/e/29.png" : "sc/e/30.png");
        this.IIiiIiiiIIiIi.setVisible(true);
        if (this.iiIiiiiiiiIii == null) return;
        this.iiIiiiiiiiIii.setVisible(false);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    static /* synthetic */ IIIiIiiiiIiII ALLATORIxDEMO(IIiIiiiiIiiIi arg0) {
        return arg0.iiIiiiiiiiIii;
    }

    static /* synthetic */ int ALLATORIxDEMO(IIiIiiiiIiiIi arg0) {
        return arg0.IiiiiiiiIIIII;
    }
}
