/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.v.iiIiIiiiiiIIi
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iIiIIiiiIiiiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Activity
 *  com.xy.scene.BWDHTeam
 *  com.xy.socket.Agreement
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIiIiiiiIiiIi
 */
package com.xy.a.v;

import com.xy.a.v.iiIiIiiiiiIIi;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.iIiIIiiiIiiiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Activity;
import com.xy.scene.BWDHTeam;
import com.xy.socket.Agreement;
import com.xy.w.IIIIIiiiIiiII;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;

/*
 * Exception performing whole class analysis ignored.
 */
static class IIiIiiiiIiiIi
extends iIiIIiiiIiiiI
implements MouseListener {
    final /* synthetic */ iiIiIiiiiiIIi IIiiIiiiIIiIi;
    private Image iIiIiiiiIiIii;
    private JLabel IiIIIiiiiIiiI = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)50, (int)164, (int)21, (Color)Color.black, (Font)iiIIiiiiIiiII.iIiIiiiiiiIIi);
    private int iiIiiiiiiiIii;
    private Image IiiiiiiiIIIII;
    private JLabel ALLATORIxDEMO = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)70, (int)164, (int)21, (Color)Color.black, (Font)iiIIiiiiIiiII.iIiIiiiiiiIIi);

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (this.iIiIiiiiIiIii != null) {
            g.drawImage(this.iIiIiiiiIiIii, 16, 0, 132, 97, null);
        }
        if (this.IiiiiiiiIIIII == null) return;
        g.drawImage(this.IiiiiiiiIIIII, 0, 4, 165, 45, null);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (this.iiIiiiiiiiIii <= 0) {
            return;
        }
        Activity IiiiiiiiIIIII = iiIiIiiiiiIIi.ALLATORIxDEMO((iiIiIiiiiiIIi)this.IIiiIiiiIIiIi).ALLATORIxDEMO();
        String IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"activity", (String)(String.valueOf(IiiiiiiiIIIII.getId()) + "|t" + this.iiIiiiiiiiIii));
        this.IIiiIiiiIIiIi.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII2);
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    public IIiIiiiiIiiIi(iiIiIiiiiiIIi iiIiIiiiiiIIi2) {
        this.IIiiIiiiIIiIi = iiIiIiiiiiIIi2;
        this.IiIIIiiiiIiiI.setHorizontalAlignment(0);
        this.ALLATORIxDEMO.setHorizontalAlignment(0);
        this.add(this.IiIIIiiiiIiiI);
        this.add(this.ALLATORIxDEMO);
        this.addMouseListener(this);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    public void ALLATORIxDEMO(boolean win, BWDHTeam bwdhTeam) {
        this.iiIiiiiiiiIii = bwdhTeam != null ? bwdhTeam.getId() : 0;
        this.ALLATORIxDEMO.setText(bwdhTeam != null ? bwdhTeam.getName() : "");
        this.iIiIiiiiIiIii = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)(win ? "sc/d/147.png" : "sc/d/196.png"));
        if (bwdhTeam != null && bwdhTeam.getRoleShows() != null) {
            this.IiIIIiiiiIiiI.setText("队长:" + bwdhTeam.getRoleShows()[0].getRolename());
            this.IiiiiiiiIIIII = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)com.xy.w.IIiIiiiiIiiIi.iiiIiiiiiiIIi((String)("bwdh" + bwdhTeam.getRoleShows()[0].getSpecies_id().intValue())));
        } else {
            this.IiIIIiiiiIiiI.setText(null);
            this.IiiiiiiiIIIII = null;
        }
        this.setVisible(true);
    }
}
