/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.iIiIIiiiiiiii
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Goodstable
 *  com.xy.socket.Agreement
 *  com.xy.w.IIIIIiiiIiIii
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIiIiiiiIiiIi
 *  com.xy.w.iiiiiiiiiiIiI
 */
package com.xy.a.q;

import com.xy.a.q.iIiIIiiiiiiii;
import com.xy.q.IIIiiiiiIiIiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.w.IIIIIiiiIiIii;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIiIiiiiIiiIi;
import com.xy.w.iiiiiiiiiiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JLabel;

/*
 * Exception performing whole class analysis ignored.
 */
static class IIIiiiiiIiIIi
extends JComponent
implements MouseListener {
    private JLabel iiiiIiiiIiiII;
    private JLabel iiiIiiiiiiiIi;
    private IIIiiiiiIiIiI iIiiIiiiiiiII;
    private int IIiiIiiiIIiIi;
    private int iIiIiiiiIiIii;
    private int IiIIIiiiiIiiI;
    private int iiIiiiiiiiIii;
    private BigDecimal IiiiiiiiIIIII;
    final /* synthetic */ iIiIIiiiiiiii ALLATORIxDEMO;

    public void ALLATORIxDEMO(Goodstable good, int sum) {
        this.IiiiiiiiIIIII = good != null ? good.getGoodsid() : null;
        this.IiIIIiiiiIiiI = sum;
        this.iIiiIiiiiiiII.ALLATORIxDEMO(good != null ? 1 : 0, (Object)good);
        if (this.IiiiiiiiIIIII == null) {
            this.iiiiIiiiIiiII.setText(null);
            this.iiiIiiiiiiiIi.setText(null);
            return;
        }
        this.iiiiIiiiIiiII.setText(sum > 1 ? String.valueOf(sum) : null);
        this.iiiIiiiiiiiIi.setText(good.getGoodsname());
        this.iiiIiiiiiiiIi.setForeground(Color.WHITE);
    }

    public void ALLATORIxDEMO(int showType) {
        this.iIiIiiiiIiIii = showType;
        this.iiiiIiiiIiiII.setVisible(showType == 2);
        this.iiiIiiiiiiiIi.setVisible(showType == 2);
        this.iIiiIiiiiiiII.setVisible(showType == 2);
    }

    public IIIiiiiiIiIIi(iIiIIiiiiiiii iIiIIiiiiiiii2, int index) {
        this.ALLATORIxDEMO = iIiIIiiiiiiii2;
        this.setLayout(null);
        this.setOpaque(false);
        this.iiIiiiiiiiIii = index;
        this.iIiiIiiiiiiII = new IIIiiiiiIiIiI(iIiIIiiiiiiii2.ALLATORIxDEMO());
        this.iIiiIiiiiiiII.setBounds(20, 54, 80, 80);
        this.iiiiIiiiIiiII = new JLabel("", 4);
        this.iiiIiiiiiiiIi = new JLabel("", 0);
        this.iiiiIiiiIiiII.setForeground(Color.red);
        this.iiiiIiiiIiiII.setFont(iiIIiiiiIiiII.ALLATORIxDEMO);
        this.iiiIiiiiiiiIi.setFont(iiIIiiiiIiiII.iIiIIiiiiIIiI);
        this.iiiiIiiiIiiII.setBounds(78, 58, 30, 18);
        this.iiiIiiiiiiiIi.setBounds(0, 150, 120, 16);
        this.add(this.iiiiIiiiIiiII);
        this.add(this.iiiIiiiiiiiIi);
        this.add((Component)this.iIiiIiiiiiiII);
        this.addMouseListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (this.iIiIiiiiIiIii == 2) {
            if (iIiIIiiiiiiii.ALLATORIxDEMO() == null) {
                iIiIIiiiiiiii.ALLATORIxDEMO((Image)IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/b/S301.png"));
            }
            g.drawImage(iIiIIiiiiiiii.ALLATORIxDEMO(), 2, 2, null);
            return;
        }
        if (iIiIIiiiiiiii.ALLATORIxDEMO((iIiIIiiiiiiii)this.ALLATORIxDEMO) == null) {
            iIiIIiiiiiiii.ALLATORIxDEMO((iIiIIiiiiiiii)this.ALLATORIxDEMO, (IIIIIiiiIiIii)iiiiiiiiiiIiI.iIiIiiiiIIiii((String)IIiIiiiiIiiIi.iIiIiiiiIIiii((String)"drawfp")));
            return;
        }
        if (this.iIiIiiiiIiIii == 1) {
            this.IIiiIiiiIIiIi += 17;
            if (this.IIiiIiiiIIiIi >= iIiIIiiiiiiii.ALLATORIxDEMO((iIiIIiiiiiiii)this.ALLATORIxDEMO).IIIiiiiiiIIiI()) {
                this.IIiiIiiiIIiIi = iIiIIiiiiiiii.ALLATORIxDEMO((iIiIIiiiiiiii)this.ALLATORIxDEMO).IIIiiiiiiIIiI();
                this.ALLATORIxDEMO(2);
                this.ALLATORIxDEMO.ALLATORIxDEMO(null);
            }
        }
        iIiIIiiiiiiii.ALLATORIxDEMO((iIiIIiiiiiiii)this.ALLATORIxDEMO).ALLATORIxDEMO((long)this.IIiiIiiiIIiIi, 0);
        iIiIIiiiiiiii.ALLATORIxDEMO((iIiIIiiiiiiii)this.ALLATORIxDEMO).ALLATORIxDEMO(g, 2, 2);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.setBorder(null);
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (this.iIiIiiiiIiIii != 0) return;
        this.setBorder(BorderFactory.createLineBorder(Color.red, 2));
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (this.iIiIiiiiIiIii != 0) {
            return;
        }
        if (iIiIIiiiiiiii.ALLATORIxDEMO((iIiIIiiiiiiii)this.ALLATORIxDEMO) == -1) {
            return;
        }
        Goodstable IiiiiiiiIIIII = this.ALLATORIxDEMO.ALLATORIxDEMO().ALLATORIxDEMO(iIiIIiiiiiiii.ALLATORIxDEMO((iIiIIiiiiiiii)this.ALLATORIxDEMO));
        StringBuffer IiiiiiiiIIIII2 = new StringBuffer();
        IiiiiiiiIIIII2.append("P");
        IiiiiiiiIIIII2.append(iIiIIiiiiiiii.iIiIiiiiIIiii((iIiIIiiiiiiii)this.ALLATORIxDEMO));
        IiiiiiiiIIIII2.append("|");
        IiiiiiiiIIIII2.append(this.iiIiiiiiiiIii);
        IiiiiiiiIIIII2.append("|");
        IiiiiiiiIIIII2.append(1);
        if (IiiiiiiiIIIII != null) {
            IiiiiiiiIIIII2.append("|");
            IiiiiiiiIIIII2.append(IiiiiiiiIIIII.getRgid());
        }
        String IiiiiiiiIIIII3 = Agreement.getSendTextAES((String)"getfivemsg", (String)IiiiiiiiIIIII2.toString());
        this.ALLATORIxDEMO.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII3);
    }
}
