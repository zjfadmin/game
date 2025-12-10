/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.IIiIiiiiIiiiI
 *  com.xy.a.q.IIiiiiiiiiIii
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.richtext.RichLabel
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIIiii
 */
package com.xy.a.q;

import com.xy.a.q.IIiIiiiiIiiiI;
import com.xy.a.q.IIiiiiiiiiIii;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.richtext.RichLabel;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.IIiIiiiiIIiii;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;
import javax.swing.JLabel;

/*
 * Exception performing whole class analysis ignored.
 */
static class iIiIiiiiIIIIi
extends JComponent
implements MouseListener {
    private IIiIiiiiIiiiI[] iIiiIiiiiiiII;
    final /* synthetic */ IIiiiiiiiiIii IIiiIiiiIIiIi;
    private int iIiIiiiiIiIii;
    private JLabel[] IiIIIiiiiIiiI;
    private IIIiiiiiIiIiI iiIiiiiiiiIii;
    private long IiiiiiiiIIIII;
    private RichLabel ALLATORIxDEMO;

    static /* synthetic */ void ALLATORIxDEMO(iIiIiiiiIIIIi arg0, int arg1) {
        arg0.iIiIiiiiIiIii = arg1;
    }

    static /* synthetic */ JLabel[] ALLATORIxDEMO(iIiIiiiiIIIIi arg0) {
        return arg0.IiIIIiiiiIiiI;
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    static /* synthetic */ long ALLATORIxDEMO(iIiIiiiiIIIIi arg0) {
        return arg0.IiiiiiiiIIIII;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (!e.isMetaDown()) return;
        IIiiiiiiiiIii.ALLATORIxDEMO((IIiiiiiiiiIii)this.IIiiIiiiIIiIi).setVisible(false);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    static /* synthetic */ void ALLATORIxDEMO(iIiIiiiiIIIIi arg0, long arg1) {
        arg0.IiiiiiiiIIIII = arg1;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    static /* synthetic */ IIiIiiiiIiiiI[] ALLATORIxDEMO(iIiIiiiiIIIIi arg0) {
        return arg0.iIiiIiiiiiiII;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (IIiiiiiiiiIii.ALLATORIxDEMO() == null) {
            IIiiiiiiiiIii.ALLATORIxDEMO((IIiIiiiiIIiii)IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/36.png", (int)20, (int)20, (int)20, (int)20, (boolean)false));
        }
        IIiiiiiiiiIii.ALLATORIxDEMO().ALLATORIxDEMO(g, this.getWidth(), this.getHeight());
    }

    static /* synthetic */ int ALLATORIxDEMO(iIiIiiiiIIIIi arg0) {
        return arg0.iIiIiiiiIiIii;
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    public iIiIiiiiIIIIi(IIiiiiiiiiIii iIiiiiiiiiIii) {
        this.IIiiIiiiIIiIi = iIiiiiiiiiIii;
        this.setBounds(217, 32, 340, 356);
        this.setVisible(false);
        this.IiIIIiiiiIiiI = new JLabel[2];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)40, (int)20, (int)258, (int)17, (Color)Color.black, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u7b2c \u51fa\u573a\u53ec\u5524\u517d\u7684\u9526\u56ca" : (IiiiiiiiIIIII == 1 ? "1" : ""));
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setHorizontalAlignment(0);
            this.add(this.IiIIIiiiiIiiI[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII == 1) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setForeground(Color.red);
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(98, 20, 22, 17);
            }
            ++IiiiiiiiIIIII;
        }
        this.ALLATORIxDEMO = new RichLabel("", iiIIiiiiIiiII.iIIIiiiiIIIii);
        this.ALLATORIxDEMO.setTextSize("#c000000\u6e29\u99a8\u63d0\u793a\uff1a\u53ec\u5524\u517d\u7684\u4e24\u4e2a\u9526\u56ca\u4f1a\u540c\u65f6\u751f\u6548", 280);
        this.ALLATORIxDEMO.setBounds(36, 313, this.ALLATORIxDEMO.getWidth(), this.ALLATORIxDEMO.getHeight());
        this.add((Component)this.ALLATORIxDEMO);
        this.iiIiiiiiiiIii = new IIIiiiiiIiIiI();
        this.iiIiiiiiiiIii.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/19.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
        this.iiIiiiiiiiIii.setBounds(40, 45, 258, 258);
        this.add((Component)this.iiIiiiiiiiIii);
        this.iIiiIiiiiiiII = new IIiIiiiiIiiiI[25];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiiIiiiiiiII.length) {
            this.iIiiIiiiiiiII[IiiiiiiiIIIII] = new IIiIiiiiIiiiI(iIiiiiiiiiIii);
            this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(41 + IiiiiiiiIIIII % 5 * 51, 47 + IiiiiiiiIIIII / 5 * 51, 49, 49);
            this.add((Component)this.iIiiIiiiiiiII[IiiiiiiiIIIII++]);
        }
        this.addMouseListener(this);
    }
}
