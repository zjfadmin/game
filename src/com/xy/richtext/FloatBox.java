/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.richtext.RichLabel
 *  com.xy.v.IIiIiiiiIiIII
 *  com.xy.v.IiiiIiiiiIiIi
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIiIiiiiIIiii
 */
package com.xy.richtext;

import com.xy.q.iiIIiiiiIiiII;
import com.xy.richtext.RichLabel;
import com.xy.v.IIiIiiiiIiIII;
import com.xy.v.IiiiIiiiiIiIi;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIiIiiiiIIiii;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

public class FloatBox {
    private long time;
    private RichLabel label;
    public FloatBox nextFloatBox;
    private IIiIiiiiIIiii imgCut;
    private String text;
    private int height;
    private int width;

    public FloatBox(String text) {
        this(text, null, null);
        this.text = text;
    }

    public RichLabel getLabel() {
        return this.label;
    }

    public int getHeight() {
        return this.height;
    }

    public FloatBox(String text, String skin, Font font) {
        this.text = text;
        this.label = IIiIiiiiIiIII.ALLATORIxDEMO((String)text, (Font)iiIIiiiiIiiII.iIiIIiiiiIIiI, (int)0);
        this.label.setLocation(4, 3);
        Dimension IiiiiiiiIIIII = this.label.computeSize(98);
        this.label.setSize(IiiiiiiiIIIII);
        this.width = 8 + IiiiiiiiIIIII.width;
        this.height = 6 + IiiiiiiiIIIII.height;
        this.time = iIiIIiiiIiiiI.ALLATORIxDEMO();
        if (skin == null) {
            // empty if block
        }
        this.imgCut = IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/e/75.png", (int)6, (int)6, (int)6, (int)6, (boolean)false);
    }

    /*
     * WARNING - void declaration
     */
    public void paint(Graphics graphics) {
        void g;
        this.imgCut.ALLATORIxDEMO((Graphics)g, this.width, this.height);
        if (this.label == null) {
            return;
        }
        g.translate(this.label.getX(), this.label.getY());
        this.label.paint((Graphics)g);
        g.translate(-this.label.getX(), -this.label.getY());
    }

    public boolean IsTime(long time) {
        if (time - this.time >= IiiiIiiiiIiIi.iiIiiiiiiiIii) return false;
        return true;
    }

    public String getText() {
        return this.text;
    }

    public int getWidth() {
        return this.width;
    }

    public void setText(String text) {
        this.text = text;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void removeLabel() {
        FloatBox floatBox = this;
        synchronized (floatBox) {
            if (this.label == null) {
                return;
            }
            IIiIiiiiIiIII.ALLATORIxDEMO((RichLabel)this.label);
            this.label = null;
            return;
        }
    }
}
