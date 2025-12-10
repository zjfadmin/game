/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.richtext.RichLabel
 *  com.xy.text.GameView
 *  com.xy.v.IIiIiiiiIiIII
 *  com.xy.v.IiiiIiiiiIiIi
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIiIiiiiIIiii
 */
package com.xy.richtext;

import com.xy.q.iiIIiiiiIiiII;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import com.xy.v.IIiIiiiiIiIII;
import com.xy.v.IiiiIiiiiIiIi;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIiIiiiiIIiii;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

public class TipBox {
    private int height;
    private GameView gameView;
    private String text;
    private long time;
    private int px;
    private int width;
    private RichLabel label;
    private IIiIiiiiIIiii imgCut;
    private boolean load;

    public int getHeight() {
        return this.height;
    }

    public void setLabel(RichLabel label) {
        this.label = label;
    }

    public int getPx() {
        return this.px;
    }

    /*
     * WARNING - void declaration
     */
    public void setText(String string) {
        void text;
        this.text = text;
        this.load = true;
        this.time = iIiIIiiiIiiiI.ALLATORIxDEMO();
    }

    public void paint(Graphics g) {
        if (this.load) {
            this.loadText();
        }
        g.translate(this.px, 0);
        this.imgCut.ALLATORIxDEMO(g, this.width, this.height);
        g.translate(this.label.getX(), this.label.getY());
        this.label.paint(g);
        g.translate(-this.px - this.label.getX(), -this.label.getY());
    }

    public TipBox(String text, GameView gameView) {
        this.gameView = gameView;
        this.setText(text);
    }

    public void paint(int px, int py, Graphics g) {
        if (this.load) {
            this.loadText();
        }
        g.translate(px, py);
        this.imgCut.ALLATORIxDEMO(g, this.width, this.height);
        g.translate(this.label.getX(), this.label.getY());
        this.label.paint(g);
        g.translate(-px - this.label.getX(), -py - this.label.getY());
    }

    public RichLabel getLabel() {
        return this.label;
    }

    public void setPx(int px) {
        this.px = px;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean IsTime(long time) {
        if (time - this.time <= IiiiIiiiiIiIi.iiIiiiiiiiIii) return false;
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     */
    public void loadText() {
        TipBox tipBox = this;
        synchronized (tipBox) {
            if (!this.load) {
                return;
            }
            this.label = IIiIiiiiIiIII.ALLATORIxDEMO((String)this.text, (Font)iiIIiiiiIiiII.iIiIIiiiiIIiI, (int)0);
            this.label.setLocation(10, 10);
            Dimension IiiiiiiiIIIII = this.label.computeSize(640);
            this.label.setSize(IiiiiiiiIIIII);
            this.width = IiiiiiiiIIIII.width + 20;
            this.height = IiiiiiiiIIIII.height + 20;
            if (this.gameView != null && this.gameView.getClient().ALLATORIxDEMO(2, 12)) {
                this.width = Math.max(320, this.width);
                this.height = IiiiiiiiIIIII.height + 30;
                this.label.setLocation(10, 15);
            }
            TipBox tipBox2 = this;
            int n = this.gameView != null ? this.gameView.screenData.Screen_x / 2 - this.width / 2 : 0;
            {
                tipBox2.px = n;
                this.imgCut = IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/c/0", (int)6, (int)6, (int)6, (int)6, (boolean)false);
                this.text = null;
                this.load = false;
                return;
            }
        }
    }

    public int getWidth() {
        return this.width;
    }

    public void clear() {
        IIiIiiiiIiIII.ALLATORIxDEMO((RichLabel)this.label);
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
