/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IiIIIiiiIIIiI
 *  com.xy.i.IIIIIiiiIIIiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.ActiveBase
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIiiIi
 */
package com.xy.a;

import com.xy.a.IiIIIiiiIIIiI;
import com.xy.i.IIIIIiiiIIIiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.ActiveBase;
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
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * Exception performing whole class analysis ignored.
 */
public static class IiiiIiiiIIIII
extends JPanel
implements MouseListener {
    public ActiveBase iiiIiiiiiiiIi;
    private JLabel iIiiIiiiiiiII;
    private IIIiiiiiIiIiI IIiiIiiiIIiIi;
    private IIIIIiiiIIIiI iIiIiiiiIiIii;
    private JLabel IiIIIiiiiIiiI;
    private JLabel iiIiiiiiiiIii;
    private JLabel IiiiiiiiIIIII;
    final /* synthetic */ IiIIIiiiIIIiI ALLATORIxDEMO;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (IiIIIiiiIIIiI.ALLATORIxDEMO() == null) {
            IiIIIiiiIIIiI.ALLATORIxDEMO((Image)IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/66.png"));
        }
        if (IiIIIiiiIIIiI.iIiIiiiiIIiii() == null) {
            IiIIIiiiIIIiI.iIiIiiiiIIiii((Image)IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/4.png"));
        }
        g.drawImage(IiIIIiiiIIIiI.ALLATORIxDEMO(), 13, 59, 345, 1, null);
        g.drawImage(IiIIIiiiIIIiI.iIiIiiiiIIiii(), 10, 10, 45, 44, null);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(ActiveBase activeBase, int sumReceive) {
        void IiiiiiiiIIIII;
        this.iiiIiiiiiiiIi = activeBase;
        int IiiiiiiiIIIII2 = activeBase.getNum();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\u65e5\u6b21\u6570 ");
        stringBuffer.append(sumReceive);
        IiiiiiiiIIIII.append("/");
        IiiiiiiiIIIII.append(IiiiiiiiIIIII2);
        this.iiIiiiiiiiIii.setText(IiiiiiiiIIIII.toString());
        IiiiiiiiIIIII.setLength(0);
        int IiiiiiiiIIIII3 = activeBase.getValue();
        IiiiiiiiIIIII.append("\u6d3b\u8dc3\u5ea6 ");
        stringBuffer.append((sumReceive > IiiiiiiiIIIII2 ? IiiiiiiiIIIII2 : sumReceive) * IiiiiiiiIIIII3);
        IiiiiiiiIIIII.append("/");
        IiiiiiiiIIIII.append(IiiiiiiiIIIII2 * IiiiiiiiIIIII3);
        this.IiiiiiiiIIIII.setText(IiiiiiiiIIIII.toString());
        this.IiIIIiiiiIiiI.setText(activeBase.getHead());
        this.iIiiIiiiiiiII.setText(activeBase.getaName());
        this.IIiiIiiiIIiIi.ALLATORIxDEMO(IIiIiiiiIiiIi.iiiiiiiiIIiii((String)activeBase.getSkin()));
        String IiiiiiiiIIIII4 = activeBase.getGuide();
        if (IiiiiiiiIIIII4 != null && !"".equals(IiiiiiiiIIIII4)) {
            this.iIiIiiiiIiIii.setText(this.ALLATORIxDEMO.ALLATORIxDEMO(IiiiiiiiIIIII4, "-") == 3 ? "\u524d\u5f80" : "\u81ea\u52a8");
            this.iIiIiiiiIiIii.setVisible(true);
            return;
        }
        this.iIiIiiiiIiIii.setVisible(false);
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (this.iiiIiiiiiiiIi == null) {
            return;
        }
        IiIIIiiiIIIiI.ALLATORIxDEMO((IiIIIiiiIIIiI)this.ALLATORIxDEMO).setTextSize(this.iiiIiiiiiiiIi.getText(), 160);
    }

    public IiiiIiiiIIIII(IiIIIiiiIIIiI iiIIIiiiIIIiI) {
        this.ALLATORIxDEMO = iiIIIiiiIIIiI;
        this.setPreferredSize(new Dimension(371, 61));
        this.setOpaque(false);
        this.setLayout(null);
        this.iIiIiiiiIiIii = new IIIIIiiiIIIiI("sc/e/7.png", 1, 154, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u524d\u5f80", iiIIIiiiIIIiI.ALLATORIxDEMO());
        this.iIiIiiiiIiIii.ALLATORIxDEMO((Object)this);
        this.iIiIiiiiIiIii.setBounds(295, 20, 59, 25);
        this.add((Component)this.iIiIiiiiIiIii);
        this.IIiiIiiiIIiIi = new IIIiiiiiIiIiI();
        this.IIiiIiiiIIiIi.setBounds(10, 10, 45, 44);
        this.add((Component)this.IIiiIiiiIIiIi);
        this.iIiiIiiiiiiII = new JLabel();
        this.iIiiIiiiiiiII.setBounds(57, 9, 100, 20);
        this.iIiiIiiiiiiII.setFont(iiIIiiiiIiiII.iiIiiiiiiIIiI);
        this.iIiiIiiiiiiII.setForeground(Color.white);
        this.add(this.iIiiIiiiiiiII);
        this.iiIiiiiiiiIii = new JLabel();
        this.iiIiiiiiiiIii.setBounds(57, 34, 100, 20);
        this.iiIiiiiiiiIii.setFont(iiIIiiiiIiiII.iiIiiiiiiIIiI);
        this.iiIiiiiiiiIii.setForeground(Color.white);
        this.add(this.iiIiiiiiiiIii);
        this.IiIIIiiiiIiiI = new JLabel();
        this.IiIIIiiiiIiiI.setBounds(152, 9, 150, 20);
        this.IiIIIiiiiIiiI.setFont(iiIIiiiiIiiII.iiIiiiiiiIIiI);
        this.IiIIIiiiiIiiI.setForeground(Color.white);
        this.add(this.IiIIIiiiiIiiI);
        this.IiiiiiiiIIIII = new JLabel();
        this.IiiiiiiiIIIII.setBounds(152, 34, 110, 20);
        this.IiiiiiiiIIIII.setFont(iiIIiiiiIiiII.iiIiiiiiiIIiI);
        this.IiiiiiiiIIIII.setForeground(Color.white);
        this.add(this.IiiiiiiiIIIII);
        this.addMouseListener(this);
    }
}
