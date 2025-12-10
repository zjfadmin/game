/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.text.GamePanel
 */
package com.xy.text;

import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.text.GamePanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * Exception performing whole class analysis ignored.
 */
class GamePanel.TabComponent
extends JPanel
implements MouseListener {
    private JLabel label2;
    private int index;
    private JLabel label1;

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    static /* synthetic */ JLabel iIiIiiiiIIiii(GamePanel.TabComponent arg0) {
        return arg0.label1;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    public GamePanel.TabComponent(int index) {
        this.index = index;
        this.setLayout(null);
        this.setBackground(Color.white);
        this.setBorder(BorderFactory.createLineBorder(Color.black));
        this.label1 = IiIIIiiiiIIiI.ALLATORIxDEMO((int)3, (int)2, (int)30, (int)16, (int)10, (Color)Color.black, (Font)iiIIiiiiIiiII.iIIiiiiiIiiii);
        this.label2 = IiIIIiiiiIIiI.ALLATORIxDEMO((int)30, (int)1, (int)125, (int)18, (int)4, (Color)Color.black, (Font)iiIIiiiiIiiII.ALLATORIxDEMO);
        this.add(this.label1);
        this.add(this.label2);
        this.addMouseListener(this);
        this.setBounds(0, 19 * index, 160, 20);
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    static /* synthetic */ JLabel ALLATORIxDEMO(GamePanel.TabComponent arg0) {
        return arg0.label2;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        GamePanel.this.setShowTab();
        GamePanel.ALLATORIxDEMO((GamePanel)GamePanel.this).setGameView(this.index);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }
}
