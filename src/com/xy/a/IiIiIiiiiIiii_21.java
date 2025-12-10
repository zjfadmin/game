/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iIiIiiiiiiiIi
 *  com.xy.a.iiIIiiiiIiIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iIiIiiiiIiIII
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.MapModel
 *  com.xy.readbean.NpcInfoBean
 */
package com.xy.a;

import com.xy.a.iIiIiiiiiiiIi;
import com.xy.a.iiIIiiiiIiIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.iIiIiiiiIiIII;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.MapModel;
import com.xy.readbean.NpcInfoBean;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;
import javax.swing.JLabel;

/*
 * Exception performing whole class analysis ignored.
 */
static class IiIiIiiiiIiii
extends JComponent
implements MouseListener {
    private JLabel IIiiIiiiIIiIi;
    private boolean iIiIiiiiIiIii;
    private long IiIIIiiiiIiiI;
    private int iiIiiiiiiiIii;
    final /* synthetic */ iiIIiiiiIiIiI IiiiiiiiIIIII;
    private JLabel ALLATORIxDEMO;

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.iIiIiiiiIiIii = false;
    }

    public void ALLATORIxDEMO(int index, MapModel mapModel, NpcInfoBean npcInfoBean) {
        this.IiIIIiiiiIiiI = mapModel.getMapId();
        this.iiIiiiiiiiIii = Integer.parseInt(npcInfoBean.getNpctable().getNpcid());
        int IiiiiiiiIIIII = Integer.parseInt(npcInfoBean.getNpctable().getTx());
        int IiiiiiiiIIIII2 = Integer.parseInt(npcInfoBean.getNpctable().getTy());
        this.ALLATORIxDEMO.setText(String.valueOf(index + 1) + "." + npcInfoBean.getNpctable().getNpcname());
        this.IIiiIiiiIIiIi.setText(String.valueOf(mapModel.getMapName()) + "(" + IiiiiiiiIIIII / 20 + "," + IiiiiiiiIIIII2 / 20 + ")");
        this.setVisible(true);
    }

    public IiIiIiiiiIiii(iiIIiiiiIiIiI iiIIiiiiIiIiI2, int index) {
        this.IiiiiiiiIIIII = iiIIiiiiIiIiI2;
        this.setLayout(null);
        this.setBackground(iiIIiiiiIiiII.IIiIiiiiIIiII);
        this.ALLATORIxDEMO = IiIIIiiiiIIiI.ALLATORIxDEMO((int)3, (int)3, (int)160, (int)16, (Color)Color.white, (Font)iiIIiiiiIiiII.iIiIIiiiiIIiI);
        this.IIiiIiiiIIiIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)3, (int)19, (int)160, (int)16, (Color)Color.white, (Font)iiIIiiiiIiiII.iIiIIiiiiIIiI);
        this.add(this.ALLATORIxDEMO);
        this.add(this.IIiiIiiiIIiIi);
        this.addMouseListener(this);
        this.setBounds(0, 38 * index, 163, 38);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.iIiIiiiiIiIii = true;
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        MapModel IiiiiiiiIIIII = this.IiiiiiiiIIIII.ALLATORIxDEMO().ALLATORIxDEMO(String.valueOf(this.IiIIIiiiiIiiI));
        NpcInfoBean IiiiiiiiIIIII2 = this.IiiiiiiiIIIII.ALLATORIxDEMO().ALLATORIxDEMO(String.valueOf(this.iiIiiiiiiiIii));
        if (IiiiiiiiIIIII == null) return;
        if (IiiiiiiiIIIII2 == null) {
            return;
        }
        ((iIiIiiiiiiiIi)this.IiiiiiiiIIIII.ALLATORIxDEMO().iiiIiiiiiiIIi(22)).ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII2);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (!this.iIiIiiiiIiIii) return;
        g.setColor(iIiIiiiiIiIII.iiiIiiiiiiiIi);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }
}
