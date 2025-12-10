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

public class NoticeBoxNew1 {
    private boolean load;
    private int width;
    private IIiIiiiiIIiii imgCut;
    private int height;
    private RichLabel label;
    private String text;
    private int px;
    private GameView gameView;
    private long time;
    private static RichLabel labelHead;

    public void paint(Graphics g) {
        if (this.load) {
            this.loadText();
        }
        g.translate(this.px, 0);
        this.imgCut.ALLATORIxDEMO(g, this.width, this.height);
        g.translate(labelHead.getX(), labelHead.getY());
        labelHead.paint(g);
        g.translate(-labelHead.getX(), -labelHead.getY());
        g.translate(36 + this.label.getX(), this.label.getY());
        this.label.paint(g);
        g.translate(-this.px - this.label.getX() - 36, -this.label.getY());
    }

    public RichLabel getLabel() {
        return this.label;
    }

    public int getHeight() {
        return this.height;
    }

    public void setText(String text) {
        this.time = iIiIIiiiIiiiI.ALLATORIxDEMO();
        this.text = text;
        this.load = true;
    }

    public void clear() {
        IIiIiiiiIiIII.ALLATORIxDEMO((RichLabel)this.label);
    }

    public void setLabel(RichLabel label) {
        this.label = label;
    }

    public boolean IsTime(long time) {
        if (time - this.time <= IiiiIiiiiIiIi.iiIiiiiiiiIii) return false;
        return true;
    }

    public int getPx() {
        return this.px;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return this.width;
    }

    public void setPx(int px) {
        this.px = px;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * WARNING - void declaration
     */
    public void loadText() {
        NoticeBoxNew1 noticeBoxNew1 = this;
        synchronized (noticeBoxNew1) {
            void IiiiiiiiIIIII;
            if (!this.load) {
                return;
            }
            NoticeBoxNew1 noticeBoxNew12 = this;
            this.label = IIiIiiiiIiIII.ALLATORIxDEMO((String)this.text, (Font)iiIIiiiiIiiII.ALLATORIxDEMO, (int)0);
            this.label.setLocation(6, 6);
            Dimension dimension = this.label.computeSize(600);
            dimension.setSize(606.0, IiiiiiiiIIIII.getHeight());
            this.label.setSize((Dimension)IiiiiiiiIIIII);
            this.width = IiiiiiiiIIIII.width + 12 + 36;
            this.height = IiiiiiiiIIIII.height + 12;
            int n = this.gameView != null ? this.gameView.screenData.Screen_x / 2 - IiiiiiiiIIIII.width / 2 : 0;
            {
                noticeBoxNew12.px = n;
                this.imgCut = IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/b/11_png.xy2uiimg.tips.png", (int)12, (int)12, (int)12, (int)12, (boolean)false);
                this.text = null;
                this.load = false;
                return;
            }
        }
    }

    public NoticeBoxNew1(String text, GameView gameView) {
        this.gameView = gameView;
        if (labelHead == null) {
            labelHead = IIiIiiiiIiIII.ALLATORIxDEMO((String)"#H", (Font)iiIIiiiiIiiII.ALLATORIxDEMO, (int)0);
            labelHead.setLocation(6, 6);
            Dimension IiiiiiiiIIIII = labelHead.computeSize(36);
            IiiiiiiiIIIII.setSize(36, 75);
            labelHead.setSize(IiiiiiiiIIIII);
        }
        this.setText(text);
    }
}
