/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.text.GameView
 *  com.xy.w.IIIIIiiiIiIii
 */
package com.xy.q;

import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.text.GameView;
import com.xy.w.IIIIIiiiIiIii;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class iiIiIiiiiiiiI
extends IiiiIiiiiIiIi {
    Rectangle ALLATORIxDEMO;

    /*
     * WARNING - void declaration
     */
    public iiIiIiiiiiiiI(GameView gameView) {
        super(-1, -1, IiiiIiiiiIiIi.iIIiIiiiiiiIi, (GameView)gameView2);
        void gameView2;
        this.ALLATORIxDEMO(0, 0, gameView2.screenData.getScreen_x(), gameView2.screenData.getScreen_y(), IiiiIiiiiIiIi.iIIiIiiiiiiIi);
        this.addMouseListener(IiIIIiiiiIIiI.IiiiiiiiIIIII);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D IiiiiiiiIIIII = (Graphics2D)g;
        Composite IiiiiiiiIIIII2 = IiiiiiiiIIIII.getComposite();
        IiiiiiiiIIIII.setComposite(IIIIIiiiIiIii.iiiIiiiiiiiIi);
        IiiiiiiiIIIII.setColor(Color.BLACK);
        if (this.ALLATORIxDEMO == null) {
            this.ALLATORIxDEMO = this.getBounds();
        }
        IiiiiiiiIIIII.fill(this.ALLATORIxDEMO);
        IiiiiiiiIIIII.setComposite(IiiiiiiiIIIII2);
    }

    public void ALLATORIxDEMO(int w, int h) {
        this.setSize(w, h);
        this.ALLATORIxDEMO = null;
    }
}
