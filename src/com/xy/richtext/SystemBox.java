/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.richtext.RichLabel
 *  com.xy.text.GameView
 *  com.xy.v.IIiIiiiiIiIII
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.w.IIIIIiiiIiIii
 *  com.xy.w.IIiIiiiiIiiIi
 *  com.xy.w.iiIiIiiiiiIIi
 */
package com.xy.richtext;

import com.xy.q.iiIIiiiiIiiII;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import com.xy.v.IIiIiiiiIiIII;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.w.IIIIIiiiIiIii;
import com.xy.w.IIiIiiiiIiiIi;
import com.xy.w.iiIiIiiiiiIIi;
import java.awt.Font;
import java.awt.Graphics;
import java.util.LinkedList;

public class SystemBox {
    private int width;
    private IIIIIiiiIiIii tcp;
    private String skin;
    private boolean draw;
    private int height;
    private String text;
    private GameView gameView;
    private RichLabel label;
    private LinkedList<String> list;
    private long time;

    public RichLabel getLabel() {
        return this.label;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void addText(String text) {
        SystemBox systemBox = this;
        synchronized (systemBox) {
            if (this.text == null) {
                this.loadText(text);
                return;
            }
            if (this.list == null) {
                this.list = new LinkedList();
            }
            this.list.addLast(text);
            if (this.list.size() <= 10) return;
            this.list.removeFirst();
            return;
        }
    }

    public void clear() {
        IIiIiiiiIiIII.ALLATORIxDEMO((RichLabel)this.label);
    }

    public void setHeight(int height) {
        this.height = height;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled unnecessary exception pruning
     */
    public void loadText(String text) {
        SystemBox systemBox = this;
        synchronized (systemBox) {
            if (text == null && this.list != null && this.list.size() > 0) {
                text = this.list.removeFirst();
            }
            if (text == null) {
                this.text = null;
                this.tcp = null;
                this.draw = false;
                return;
            }
            this.text = text;
            if (this.label == null) {
                this.label = IIiIiiiiIiIII.ALLATORIxDEMO((String)text, (Font)iiIIiiiiIiiII.iiIiIiiiIiiII, (int)4096);
            } else {
                this.label.setTextSize(text, 4096);
            }
            this.width = this.gameView.screenData.Screen_x + this.label.getWidth();
            this.height = 38 - this.label.getHeight();
            this.time = iIiIIiiiIiiiI.ALLATORIxDEMO();
            this.draw = true;
            return;
        }
    }

    public int getWidth() {
        return this.width;
    }

    public void setLabel(RichLabel label) {
        this.label = label;
    }

    public SystemBox(String text, String skin, GameView gameView) {
        this.gameView = gameView;
        this.skin = skin;
        this.loadText(text);
    }

    public void paint(Graphics g) {
        if (!this.draw) return;
        if (this.tcp == null) {
            this.tcp = IIiIiiiiIiiIi.ALLATORIxDEMO((String)IIiIiiiiIiiIi.iIiIiiiiIIiii((String)this.skin));
            return;
        }
        g = g.create(this.gameView.getX(), this.gameView.getY() + this.gameView.screenData.Screen_y - 90, this.gameView.screenData.Screen_x, 60);
        long IiiiiiiiIIIII = iIiIIiiiIiiiI.ALLATORIxDEMO();
        this.tcp.ALLATORIxDEMO(IiiiiiiiIIIII, 0);
        iiIiIiiiiiIIi IiiiiiiiIIIII2 = this.tcp.ALLATORIxDEMO();
        if (IiiiiiiiIIIII2 != null && IiiiiiiiIIIII2.ALLATORIxDEMO() != null) {
            g.drawImage(IiiiiiiiIIIII2.ALLATORIxDEMO(), 2 - IiiiiiiiIIIII2.iiiIiiiiiiIIi(), 2 - IiiiiiiiIIIII2.iIiIiiiiIIiii(), this.gameView.screenData.Screen_x, IiiiiiiiIIIII2.IiiIiiiiiiIiI(), null);
        }
        g.translate(this.gameView.screenData.Screen_x - (int)((IiiiiiiiIIIII - this.time) / 10L), this.height);
        this.label.paint(g);
        g.dispose();
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return this.height;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void isTime(long time) {
        SystemBox systemBox = this;
        synchronized (systemBox) {
            if (!this.draw) return;
            if ((time - this.time) / 10L <= (long)this.width) return;
            this.loadText(null);
            return;
        }
    }
}
