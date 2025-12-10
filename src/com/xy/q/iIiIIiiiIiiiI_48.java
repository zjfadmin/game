/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.q.IiiiIiiiiIiIi
 */
package com.xy.q;

import com.xy.q.IiiiIiiiiIiIi;
import javax.swing.JComponent;

public class iIiIIiiiIiiiI
extends JComponent {
    @Override
    public void repaint(long tm, int x, int y, int width, int height) {
    }

    @Override
    public void setVisible(boolean aFlag) {
        if (aFlag == this.isVisible()) return;
        this.show(aFlag);
    }

    @Override
    public void setBounds(int x, int y, int width, int height) {
        try {
            if (this.getX() != x) {
                IiiiIiiiiIiIi.iIiiIiiiIiIIi.set(this, x);
            }
            if (this.getY() != y) {
                IiiiIiiiiIiIi.IiiIIiiiiiiiI.set(this, y);
            }
            if (this.getWidth() != width) {
                IiiiIiiiiIiIi.iIiiIiiiiiiII.set(this, width);
            }
            if (this.getHeight() == height) return;
            IiiiIiiiiIiIi.IiIIiiiiIIIII.set(this, height);
            return;
        }
        catch (Exception IiiiiiiiIIIII) {
            IiiiiiiiIIIII.printStackTrace();
        }
    }
}
