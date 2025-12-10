/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.i.iiiiiiiiiiIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.text.GameView
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.text;

import com.xy.i.iiiiiiiiiiIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.text.GameView;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class GameLabelView
extends JComponent
implements MouseMotionListener {
    private IIIiiiiiIiIiI headImg;
    private JLabel nameLabel;
    private int first_y;
    private GameView gameView;
    private int first;
    private iiiiiiiiiiIiI gameBtn;
    private int first_x;
    private iiiiiiiiiiIiI gameCloseBtn;

    public iiiiiiiiiiIiI getGameBtn() {
        return this.gameBtn;
    }

    public IIIiiiiiIiIiI getHeadImg() {
        return this.headImg;
    }

    public void setNameLabel(JLabel nameLabel) {
        this.nameLabel = nameLabel;
    }

    public GameLabelView(GameView gameView) {
        this.gameView = gameView;
        this.setLayout(null);
        this.setBackground(iiIIiiiiIiiII.IIiIiiiiIIiII);
        this.setBounds(0, 0, 172, 23);
        this.headImg = new IIIiiiiiIiIiI();
        this.headImg.setBounds(4, 6, 16, 16);
        this.nameLabel = IiIIIiiiiIIiI.ALLATORIxDEMO((int)22, (int)6, (int)100, (int)18, (Color)Color.black, (Font)iiIIiiiiIiiII.iIIiiiiiiIIII);
        this.gameBtn = new /* Unavailable Anonymous Inner Class!! */;
        this.gameBtn.addMouseMotionListener((MouseMotionListener)this);
        this.gameCloseBtn = new iiiiiiiiiiIiI("sc/b/94.png", 1, 2, (Object)gameView);
        this.gameBtn.setBounds(0, 0, 172, 23);
        this.gameCloseBtn.setBounds(155, 5, 13, 13);
        this.add((Component)this.headImg);
        this.add(this.nameLabel);
        this.add((Component)this.gameCloseBtn);
        this.add((Component)this.gameBtn);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

    public void setGameBtn(iiiiiiiiiiIiI gameBtn) {
        this.gameBtn = gameBtn;
    }

    public JLabel getNameLabel() {
        return this.nameLabel;
    }

    public iiiiiiiiiiIiI getGameCloseBtn() {
        return this.gameCloseBtn;
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (this.first == 0) {
            this.first = 1;
            this.gameView.gameFrame.add((Component)this, 2);
        }
        int IiiiiiiiIIIII = e.getX() - this.first_x;
        int IiiiiiiiIIIII2 = e.getY() - this.first_y;
        this.setBounds(IiiiiiiiIIIII + this.getX(), this.getY(), this.getWidth(), this.getHeight());
        this.gameView.gameFrame.iIiIiiiiIIiIi(this.gameView);
    }

    public void setHeadImg(IIIiiiiiIiIiI headImg) {
        this.headImg = headImg;
    }

    public void iIiIiiiiIIiii(MouseEvent e) {
        if (this.first == 0) return;
        this.gameView.gameFrame.iIiIiiiiIIiii();
    }

    public void setGameCloseBtn(iiiiiiiiiiIiI gameCloseBtn) {
        this.gameCloseBtn = gameCloseBtn;
    }

    public void ALLATORIxDEMO(MouseEvent e) {
        this.first = 0;
        this.first_x = e.getX();
        this.first_y = e.getY();
    }
}
