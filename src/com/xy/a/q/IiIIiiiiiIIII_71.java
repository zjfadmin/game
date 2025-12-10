/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.iiIIIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Buff
 *  com.xy.richtext.RichLabel
 *  com.xy.w.IIIIIiiiIiiII
 */
package com.xy.a.q;

import com.xy.a.q.iiIIIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Buff;
import com.xy.richtext.RichLabel;
import com.xy.w.IIIIIiiiIiiII;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.JComponent;

/*
 * Exception performing whole class analysis ignored.
 */
static class IiIIiiiiiIIII
extends JComponent
implements MouseListener {
    final /* synthetic */ iiIIIiiiiIiIi IiIIIiiiiIiiI;
    private int iiIiiiiiiiIii;
    private Image IiiiiiiiIIIII;
    private RichLabel ALLATORIxDEMO = new RichLabel("", iiIIiiiiIiiII.iiIiiiiiiiiiI, 505);

    @Override
    public void mousePressed(MouseEvent e) {
    }

    public void ALLATORIxDEMO(int buffId) {
        this.iiIiiiiiiiIii = buffId;
        Buff IiiiiiiiIIIII = this.IiIIIiiiiIiiI.ALLATORIxDEMO().ALLATORIxDEMO(buffId);
        if (IiiiiiiiIIIII == null) {
            this.ALLATORIxDEMO.setText("");
            return;
        }
        this.ALLATORIxDEMO.setText(String.valueOf(IiiiiiiiIIIII.getColor()) + IiiiiiiiIIIII.getbName() + ":" + IiiiiiiiIIIII.getbText());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    public IiIIiiiiiIIII(iiIIIiiiiIiIi iiIIIiiiiIiIi2, int i) {
        this.IiIIIiiiiIiiI = iiIIIiiiiIiIi2;
        this.ALLATORIxDEMO.setBounds(52, 0, 515, 45);
        this.add((Component)this.ALLATORIxDEMO);
        this.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < iiIIIiiiiIiIi.ALLATORIxDEMO((iiIIIiiiiIiIi)this.IiIIIiiiiIiiI).length) {
            if (iiIIIiiiiIiIi.ALLATORIxDEMO((iiIIIiiiiIiIi)this.IiIIIiiiiIiiI)[IiiiiiiiIIIII] == this) {
                iiIIIiiiiIiIi.ALLATORIxDEMO((iiIIIiiiiIiIi)this.IiIIIiiiiIiiI)[IiiiiiiiIIIII].setBorder(BorderFactory.createLineBorder(Color.red, 2));
            } else {
                iiIIIiiiiIiIi.ALLATORIxDEMO((iiIIIiiiiIiIi)this.IiIIIiiiiIiiI)[IiiiiiiiIIIII].setBorder(null);
            }
            ++IiiiiiiiIIIII;
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (this.IiiiiiiiIIIII == null) {
            this.IiiiiiiiIIIII = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/b/S292.png");
        }
        g.drawImage(this.IiiiiiiiIIIII, 0, 0, this.getWidth(), this.getHeight(), null);
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    static /* synthetic */ int ALLATORIxDEMO(IiIIiiiiiIIII arg0) {
        return arg0.iiIiiiiiiiIii;
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }
}
