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
 */
package com.xy.richtext;

import com.xy.q.iiIIiiiiIiiII;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import com.xy.v.IIiIiiiiIiIII;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.w.IIIIIiiiIiIii;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.LinkedList;

public class SystemBoxNew1 {
    private String text;
    private String skin;
    private LinkedList<String> list;
    private GameView gameView;
    private RichLabel label;
    private long time;
    private int width;
    private int height;
    private boolean draw;

    public RichLabel getLabel() {
        return this.label;
    }

    public void setLabel(RichLabel label) {
        this.label = label;
    }

    public int getWidth() {
        return this.width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void isTime(long time) {
        SystemBoxNew1 systemBoxNew1 = this;
        synchronized (systemBoxNew1) {
            if (!this.draw) return;
            if ((time - this.time) / 7L <= (long)this.width) return;
            this.loadText(null);
            return;
        }
    }

    public int getHeight() {
        return this.height;
    }

    public void paint(Graphics g) {
        if (!this.draw) return;
        g = g.create(this.gameView.getX(), 172, this.gameView.screenData.Screen_x, 26);
        long IiiiiiiiIIIII = iIiIIiiiIiiiI.ALLATORIxDEMO();
        Graphics2D graphics2D = (Graphics2D)g;
        Composite IiiiiiiiIIIII2 = graphics2D.getComposite();
        graphics2D.setComposite(IIIIIiiiIiIii.iIiiIiiiiiiII);
        graphics2D.setColor(Color.BLACK);
        graphics2D.fillRect(0, 0, this.gameView.screenData.Screen_x, 26);
        graphics2D.setComposite(IiiiiiiiIIIII2);
        g.translate(this.gameView.screenData.Screen_x - (int)((IiiiiiiiIIIII - this.time) / 7L), this.height);
        this.label.paint(g);
        g.dispose();
    }

    public void clear() {
        IIiIiiiiIiIII.ALLATORIxDEMO((RichLabel)this.label);
    }

    public SystemBoxNew1(String text, String skin, GameView gameView) {
        this.gameView = gameView;
        this.skin = skin;
        this.loadText(text);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled unnecessary exception pruning
     */
    public void loadText(String text) {
        SystemBoxNew1 systemBoxNew1 = this;
        synchronized (systemBoxNew1) {
            if (text == null && this.list != null && this.list.size() > 0) {
                text = this.list.removeFirst();
            }
            if (text == null) {
                this.text = null;
                this.draw = false;
                return;
            }
            this.text = text = "#Z" + text;
            if (this.label == null) {
                this.label = IIiIiiiiIiIII.ALLATORIxDEMO((String)text, (Font)iiIIiiiiIiiII.iiiIiiiiIiiii, (int)4096);
            } else {
                this.label.setTextSize(text, 4096);
            }
            this.width = this.gameView.screenData.Screen_x + this.label.getWidth();
            this.height = 25 - this.label.getHeight();
            this.time = iIiIIiiiIiiiI.ALLATORIxDEMO();
            this.draw = true;
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void addText(String text) {
        SystemBoxNew1 systemBoxNew1 = this;
        synchronized (systemBoxNew1) {
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
}
