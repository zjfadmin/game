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

public class NoticeBox {
    private GameView gameView;
    private int height;
    private boolean load;
    private IIiIiiiiIIiii imgCut;
    private long time;
    private String text;
    private int px;
    private RichLabel label;
    private int width;

    public void setPx(int px) {
        this.px = px;
    }

    public void clear() {
        IIiIiiiiIiIII.ALLATORIxDEMO((RichLabel)this.label);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     */
    public void loadText() {
        NoticeBox noticeBox = this;
        synchronized (noticeBox) {
            if (!this.load) {
                return;
            }
            NoticeBox noticeBox2 = this;
            this.label = IIiIiiiiIiIII.ALLATORIxDEMO((String)this.text, (Font)iiIIiiiiIiiII.iiIiIiiiIiiII, (int)0);
            this.label.setLocation(6, 6);
            Dimension IiiiiiiiIIIII = this.label.computeSize(640);
            IiiiiiiiIIIII.setSize(642, 75);
            this.label.setSize(IiiiiiiiIIIII);
            this.width = IiiiiiiiIIIII.width + 12;
            this.height = IiiiiiiiIIIII.height + 12;
            int n = this.gameView != null ? this.gameView.screenData.Screen_x / 2 - IiiiiiiiIIIII.width / 2 : 0;
            {
                noticeBox2.px = n;
                this.imgCut = IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/c/68", (int)6, (int)6, (int)6, (int)6, (boolean)false);
                this.text = null;
                this.load = false;
                return;
            }
        }
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public NoticeBox(String text, GameView gameView) {
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

    public int getPx() {
        return this.px;
    }

    public boolean IsTime(long time) {
        if (time - this.time <= IiiiIiiiiIiIi.iiIiiiiiiiIii) return false;
        return true;
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

    public int getHeight() {
        return this.height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLabel(RichLabel label) {
        this.label = label;
    }

    public RichLabel getLabel() {
        return this.label;
    }

    public void setText(String text) {
        this.time = iIiIIiiiIiiiI.ALLATORIxDEMO();
        this.text = text;
        this.load = true;
    }

    public int getWidth() {
        return this.width;
    }
}
