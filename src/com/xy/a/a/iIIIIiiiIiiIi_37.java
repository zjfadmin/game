/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.IIIiIiiiIiIII
 *  com.xy.a.iiIiiiiiIIiiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Skill
 *  com.xy.readbean.TYC
 *  com.xy.w.IIiIiiiiIiiIi
 */
package com.xy.a.a;

import com.xy.a.a.IIIiIiiiIiIII;
import com.xy.a.iiIiiiiiIIiiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Skill;
import com.xy.readbean.TYC;
import com.xy.w.IIiIiiiiIiiIi;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;

/*
 * Exception performing whole class analysis ignored.
 */
static class iIIIIiiiIiiIi
extends JComponent
implements MouseListener {
    private TYC IiIiiiiiIIIII;
    private int iiIiIiiiiIIIi;
    private int iiiiIiiiIiiII;
    private Image iiiIiiiiiiiIi;
    private int iIiiIiiiiiiII;
    private boolean IIiiIiiiIIiIi;
    private int iIiIiiiiIiIii;
    private boolean IiIIIiiiiIiiI;
    private int iiIiiiiiiiIii;
    final /* synthetic */ IIIiIiiiIiIII IiiiiiiiIIIII;
    private boolean ALLATORIxDEMO;

    static /* synthetic */ int IiiIiiiiiiIiI(iIIIIiiiIiiIi arg0) {
        return arg0.iiIiiiiiiiIii;
    }

    public void ALLATORIxDEMO(TYC tyc) {
        this.iIiiIiiiiiiII = tyc != null ? tyc.getV2() : 0;
        this.IiIiiiiiIIIII = tyc;
        this.iIiIiiiiIiIii = 0;
        this.iiiiIiiiIiiII = 0;
        this.iiIiiiiiiiIii = 0;
        if (this.iIiiIiiiiiiII == 0) {
            this.iiiIiiiiiiiIi = null;
            this.setVisible(false);
            return;
        }
        this.iiiIiiiiiiiIi = IIiIiiiiIiiIi.iiiIiiiiiiIIi((String)String.valueOf(this.iIiiIiiiiiiII));
        this.setVisible(true);
        Skill IiiiiiiiIIIII = this.IiiiiiiiIIIII.ALLATORIxDEMO().iIiIiiiiIIiii(String.valueOf(this.iIiiIiiiiiiII));
        if (IiiiiiiiIIIII == null) return;
        this.iiIiiiiiiiIii = Integer.parseInt(IiiiiiiiIIIII.getSkilllevel());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        this.IiIIIiiiiIiiI = Boolean.TRUE;
    }

    static /* synthetic */ void iIiIiiiiIIiii(iIIIIiiiIiiIi arg0, boolean arg1) {
        arg0.ALLATORIxDEMO = arg1;
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        Skill IiiiiiiiIIIII = this.IiiiiiiiIIIII.ALLATORIxDEMO().iIiIiiiiIIiii(String.valueOf(this.iIiiIiiiiiiII));
        if (IiiiiiiiIIIII == null) {
            return;
        }
        ((iiIiiiiiIIiiI)this.IiiiiiiiIIIII.ALLATORIxDEMO().iiiIiiiiiiIIi(46)).ALLATORIxDEMO(IiiiiiiiIIIII.getSkillname(), this.IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII, this));
    }

    static /* synthetic */ TYC ALLATORIxDEMO(iIIIIiiiIiiIi arg0) {
        return arg0.IiIiiiiiIIIII;
    }

    static /* synthetic */ void iiiIiiiiiiIIi(iIIIIiiiIiiIi arg0, int arg1) {
        arg0.iIiIiiiiIiIii = arg1;
    }

    static /* synthetic */ int iIiIiiiiIIiIi(iIIIIiiiIiiIi arg0) {
        return arg0.iIiIiiiiIiIii;
    }

    static /* synthetic */ int iiiIiiiiiiIIi(iIIIIiiiIiiIi arg0) {
        return arg0.iiIiIiiiiIIIi;
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.IiIIIiiiiIiiI = Boolean.FALSE;
        this.IiiiiiiiIIIII.ALLATORIxDEMO().iiiIiiiiiiIIi(46);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        this.IiIIIiiiiIiiI = Boolean.FALSE;
        if (!this.ALLATORIxDEMO) {
            return;
        }
        if (IIIiIiiiIiIII.ALLATORIxDEMO((IIIiIiiiIiIII)this.IiiiiiiiIIIII).getText().equals("0")) {
            return;
        }
        int IiiiiiiiIIIII = this.iiiiIiiiIiiII + (e.isMetaDown() ? -1 : 1);
        if (IiiiiiiiIIIII < this.iIiIiiiiIiIii) {
            return;
        }
        if (IiiiiiiiIIIII > this.iiIiiiiiiiIii) {
            return;
        }
        this.iiiiIiiiIiiII = IiiiiiiiIIIII;
        this.IiiiiiiiIIIII.iiiiiiiiIIiii();
    }

    static /* synthetic */ int iIiIiiiiIIiii(iIIIIiiiIiiIi arg0) {
        return arg0.iiiiIiiiIiiII;
    }

    static /* synthetic */ int ALLATORIxDEMO(iIIIIiiiIiiIi arg0) {
        return arg0.iIiiIiiiiiiII;
    }

    static /* synthetic */ void iIiIiiiiIIiii(iIIIIiiiIiiIi arg0, int arg1) {
        arg0.iiiiIiiiIiiII = arg1;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    /*
     * WARNING - void declaration
     */
    public iIIIIiiiIiiIi(IIIiIiiiIiIII iIIiIiiiIiIII, int n) {
        void wh;
        this.IiiiiiiiIIIII = iIIiIiiiIiIII;
        this.iiIiIiiiiIIIi = wh;
        this.setVisible(false);
        this.addMouseListener(this);
        this.setBounds(90 + (wh / 10 - true) * 78, 30 + (wh % 10 - true) * 55, 50, 50);
    }

    static /* synthetic */ void ALLATORIxDEMO(iIIIIiiiIiiIi arg0, int arg1) {
        arg0.iiIiiiiiiiIii = arg1;
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (this.iIiiIiiiiiiII == 0) return;
        if (this.iiiIiiiiiiiIi == null) {
            return;
        }
        g.drawImage(IIIiIiiiIiIII.iIiIiiiiIIiii((IIIiIiiiIiIII)this.IiiiiiiiIIIII), 0, 0, this.getWidth(), this.getHeight(), this);
        if (this.IiIIIiiiiIiiI) {
            g.drawImage(this.iiiIiiiiiiiIi, 5, 5, this.getWidth() - 8, this.getHeight() - 8, this);
        } else {
            g.drawImage(this.iiiIiiiiiiiIi, 4, 4, this.getWidth() - 8, this.getHeight() - 8, this);
        }
        if (this.ALLATORIxDEMO) {
            g.drawImage(IIIiIiiiIiIII.iiiIiiiiiiIIi((IIIiIiiiIiIII)this.IiiiiiiiIIIII), 25, 35, 25, 15, this);
            g.setColor(Color.white);
            g.setFont(iiIIiiiiIiiII.iiIiiiiiiIIiI);
            g.drawString(String.valueOf(this.iiiiIiiiIiiII) + "/" + this.iiIiiiiiiiIii, 27, 48);
        } else {
            g.drawImage(IIIiIiiiIiIII.ALLATORIxDEMO((IIIiIiiiIiIII)this.IiiiiiiiIIIII), 0, 0, this.getWidth(), this.getHeight(), this);
        }
        if (!this.IIiiIiiiIIiIi) return;
        g.drawImage(IIIiIiiiIiIII.iIiIiiiiIIiIi((IIIiIiiiIiIII)this.IiiiiiiiIIIII), 16, 14, 16, 18, this);
    }

    static /* synthetic */ void ALLATORIxDEMO(iIIIIiiiIiiIi arg0, boolean arg1) {
        arg0.IIiiIiiiIIiIi = arg1;
    }
}
