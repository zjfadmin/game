/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.iiIiIiiiiIiIi
 *  com.xy.entity.Pal
 *  com.xy.formula.BaseValue
 *  com.xy.i.IiIiIiiiiIIiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.PalData
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIiiIi
 */
package com.xy.a.a;

import com.xy.a.a.iiIiIiiiiIiIi;
import com.xy.entity.Pal;
import com.xy.formula.BaseValue;
import com.xy.i.IiIiIiiiiIIiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.PalData;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.IIiIiiiiIiiIi;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;
import javax.swing.JLabel;

/*
 * Exception performing whole class analysis ignored.
 */
static class iiiIiiiiIiiiI
extends JComponent
implements MouseListener {
    private JLabel iiiIiiiiiiiIi;
    final /* synthetic */ iiIiIiiiiIiIi iIiiIiiiiiiII;
    private JLabel IIiiIiiiIIiIi;
    private IiIiIiiiiIIiI iIiIiiiiIiIii;
    private int IiIIIiiiiIiiI = -1;
    private Image iiIiiiiiiiIii;
    private int IiiiiiiiIIIII;
    private IIIiiiiiIiIiI ALLATORIxDEMO;

    @Override
    protected void paintChildren(Graphics g) {
        super.paintChildren(g);
        if (this.iiIiiiiiiiIii == null) return;
        g.drawImage(this.iiIiiiiiiiIii, 0, 0, 147, 49, this);
    }

    public void ALLATORIxDEMO(PalData palData, Pal pal, String[] vs, String lvl) {
        this.IiiiiiiiIIIII = palData.getPalId();
        this.ALLATORIxDEMO.ALLATORIxDEMO(IIiIiiiiIiiIi.IiiIiiiiiiIiI((String)("p" + palData.getSkin())));
        this.IIiiIiiiIIiIi.setText(palData.getName());
        if (lvl != null) {
            this.iiiIiiiiiiiIi.setText(String.valueOf(lvl) + "\u7ea7");
        }
        this.ALLATORIxDEMO(pal, vs, lvl);
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    static /* synthetic */ int iIiIiiiiIIiii(iiiIiiiiIiiiI arg0) {
        return arg0.IiIIIiiiiIiiI;
    }

    public iiiIiiiiIiiiI(iiIiIiiiiIiIi iiIiIiiiiIiIi2) {
        this.iIiiIiiiiiiII = iiIiIiiiiIiIi2;
        this.setPreferredSize(new Dimension(147, 49));
        this.ALLATORIxDEMO = new IIIiiiiiIiIiI();
        this.ALLATORIxDEMO.setBounds(5, 4, 37, 37);
        this.add((Component)this.ALLATORIxDEMO);
        this.IIiiIiiiIIiIi = new JLabel();
        this.IIiiIiiiIIiIi.setForeground(Color.white);
        this.IIiiIiiiIIiIi.setFont(iiIIiiiiIiiII.iIiIIiiiiIIiI);
        this.IIiiIiiiIIiIi.setBounds(45, 5, 70, 16);
        this.add(this.IIiiIiiiIIiIi);
        this.iiiIiiiiiiiIi = new JLabel();
        this.iiiIiiiiiiiIi.setForeground(Color.white);
        this.iiiIiiiiiiiIi.setFont(iiIIiiiiIiiII.iIiIIiiiiIIiI);
        this.iiiIiiiiiiiIi.setBounds(45, 25, 70, 16);
        this.add(this.iiiIiiiiiiiIi);
        this.iIiIiiiiIiIii = new IiIiIiiiiIIiI("sc/e/5.png", 1, 0, iiIIiiiiIiiII.iiIiiiiiiIIiI, null, "", iiIiIiiiiIiIi2.ALLATORIxDEMO());
        this.iIiIiiiiIiIii.setBounds(100, 8, 34, 17);
        this.iIiIiiiiIiIii.setForeground(Color.white);
        this.iIiIiiiiIiIii.removeMouseListener((MouseListener)this.iIiIiiiiIiIii);
        this.add((Component)this.iIiIiiiiIiIii);
        this.addMouseListener(this);
    }

    static /* synthetic */ JLabel ALLATORIxDEMO(iiiIiiiiIiiiI arg0) {
        return arg0.iiiIiiiiiiiIi;
    }

    public void ALLATORIxDEMO(Pal pal, String[] vs, String lvl) {
        this.IiIIIiiiiIiiI = this.iIiiIiiiiiiII.ALLATORIxDEMO(pal != null ? pal.getId() : null, vs);
        if (this.IiIIIiiiiIiiI == -1) {
            this.iIiIiiiiIiIii.setBtn(0, null);
            this.iIiIiiiiIiIii.setText(null);
            this.iiIiiiiiiiIii = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/b/B235.png");
            return;
        }
        this.iiIiiiiiiiIii = null;
        this.iiiIiiiiiiiIi.setText(String.valueOf(lvl) + "\u7ea7");
        if (this.IiIIIiiiiIiiI == 0) {
            this.iIiIiiiiIiIii.setBtn(0, null);
            this.iIiIiiiiIiIii.setText(null);
            return;
        }
        this.iIiIiiiiIiIii.setBtn(1, "sc/e/5.png");
        this.iIiIiiiiIiIii.setText(BaseValue.getPalBtnArrStr((int)(this.IiIIIiiiiIiiI - 1)));
    }

    public void ALLATORIxDEMO(int pid) {
        this.IiiiiiiiIIIII = pid;
        PalData IiiiiiiiIIIII = this.iIiiIiiiiiiII.ALLATORIxDEMO().ALLATORIxDEMO(pid);
        this.ALLATORIxDEMO.ALLATORIxDEMO(IIiIiiiiIiiIi.IiiIiiiiiiIiI((String)("p" + IiiiiiiiIIIII.getSkin())));
        this.IIiiIiiiIIiIi.setText(IiiiiiiiIIIII.getName());
        this.iiiIiiiiiiiIi.setText(null);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        this.iIiiIiiiiiiII.iIiIiiiiIIiii(this.IiiiiiiiIIIII);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    static /* synthetic */ int ALLATORIxDEMO(iiiIiiiiIiiiI arg0) {
        return arg0.IiiiiiiiIIIII;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (iiIiIiiiiIiIi.ALLATORIxDEMO() == null) {
            iiIiIiiiiIiIi.ALLATORIxDEMO((Image)IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/b/S153.png"));
        }
        g.drawImage(iiIiIiiiiIiIi.ALLATORIxDEMO(), 0, 0, 147, 49, this);
    }
}
