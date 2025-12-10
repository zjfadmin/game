/*
 * Decompiled with CFR 0.152.
 */
package com.xy.text;

import java.awt.Graphics;
import javax.swing.JComponent;

class GameFrame.2
extends JComponent {
    @Override
    protected void paintComponent(Graphics g) {
        if (GameFrame.this.gameView == null) {
            return;
        }
        GameFrame.this.gameView.ALLATORIxDEMO(g);
    }

    GameFrame.2() {
    }
}
