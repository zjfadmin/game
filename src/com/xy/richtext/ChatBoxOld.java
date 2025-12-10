/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.richtext.InputBean
 *  com.xy.richtext.RichLabel
 */
package com.xy.richtext;

import com.xy.q.iiIIiiiiIiiII;
import com.xy.richtext.InputBean;
import com.xy.richtext.RichLabel;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Component;
import java.awt.Composite;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

public class ChatBoxOld
extends JPanel {
    private int h = 0;
    private boolean display = false;
    private boolean Gag = true;
    private int w = 0;
    private int deviation = 0;
    private List<RichLabel> labels = new ArrayList<RichLabel>();
    private static final long serialVersionUID = 1L;
    private float Alpha = 0.0f;

    public void removemsg() {
        this.removeAll();
        this.labels.clear();
    }

    public void setLabels(List<RichLabel> labels) {
        this.labels = labels;
    }

    public int getDeviation() {
        return this.deviation;
    }

    public void setAlpha(float alpha) {
        this.Alpha = alpha;
    }

    public RichLabel removeAddText(String chatText, int size, Font font) {
        this.removeAll();
        RichLabel IiiiiiiiIIIII = this.labels.size() != 0 ? this.labels.get(0) : null;
        this.labels.clear();
        if (IiiiiiiiIIIII == null) {
            IiiiiiiiIIIII = new RichLabel(chatText, font);
            IiiiiiiiIIIII.setSize(IiiiiiiiIIIII.computeSize(size));
        } else {
            IiiiiiiiIIIII.setFont(font);
            IiiiiiiiIIIII.setTextSize(chatText, size);
        }
        this.labels.add(IiiiiiiiIIIII);
        this.Formsize(size);
        return IiiiiiiiIIIII;
    }

    public RichLabel removeAddTextFont(String chatText, int size, Font font) {
        chatText = "#Z" + chatText;
        this.removeAll();
        RichLabel IiiiiiiiIIIII = this.labels.size() != 0 ? this.labels.get(0) : null;
        this.labels.clear();
        if (IiiiiiiiIIIII == null) {
            IiiiiiiiIIIII = new RichLabel(chatText, font);
            IiiiiiiiIIIII.setSize(IiiiiiiiIIIII.computeSize(size));
        } else {
            IiiiiiiiIIIII.setFont(font);
            IiiiiiiiIIIII.setTextSize(chatText, size);
        }
        this.labels.add(IiiiiiiiIIIII);
        this.Formsize(size);
        return IiiiiiiiIIIII;
    }

    public void addText(String chatText, int size) {
        RichLabel IiiiiiiiIIIII = new RichLabel(chatText, null);
        IiiiiiiiIIIII.setSize(IiiiiiiiIIIII.computeSize(size));
        if (IiiiiiiiIIIII != null) {
            this.labels.add(IiiiiiiiIIIII);
        }
        this.add((Component)IiiiiiiiIIIII);
        this.Formsize(size);
    }

    /*
     * WARNING - void declaration
     */
    public void addtext(String string, int n, Font font) {
        void font2;
        void size;
        void text;
        this.labels.size();
        this.addText((String)text, (int)size, (Font)font2);
        if (this.ScreenFull() == 0) return;
        while (this.deviation < this.ScreenFull()) {
            ++this.deviation;
        }
    }

    public void setW(int w) {
        this.w = w;
    }

    public int ScreenFull() {
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.labels.size()) {
            double d = this.labels.get(IiiiiiiiIIIII2).getSize().getHeight();
            ++IiiiiiiiIIIII2;
            IiiiiiiiIIIII = (int)((double)IiiiiiiiIIIII + d);
        }
        if (IiiiiiiiIIIII - 22 < this.h) return 0;
        return (IiiiiiiiIIIII - this.h) / 22 + 2;
    }

    public List<RichLabel> getLabels() {
        return this.labels;
    }

    public void addtext(RichLabel label, int size) {
        this.labels.size();
        if (label != null) {
            this.labels.add(label);
        }
        this.Formsize(size);
        if (this.ScreenFull() == 0) return;
        while (this.deviation < this.ScreenFull()) {
            ++this.deviation;
        }
    }

    public InputBean isMonitor(int x, int y) {
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = -this.deviation * 22;
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.labels.size()) {
            RichLabel IiiiiiiiIIIII4 = this.labels.get(IiiiiiiiIIIII3);
            IiiiiiiiIIIII = IiiiiiiiIIIII4.getHeight();
            if ((IiiiiiiiIIIII2 += IiiiiiiiIIIII) >= 0 && IiiiiiiiIIIII2 >= y) {
                return IiiiiiiiIIIII4.isMonitor(x, y - (IiiiiiiiIIIII2 - IiiiiiiiIIIII));
            }
            ++IiiiiiiiIIIII3;
        }
        return null;
    }

    public int getW() {
        return this.w;
    }

    public void setDeviation(int deviation) {
        this.deviation = deviation;
    }

    public void setH(int h) {
        this.h = h;
    }

    @Override
    public void paint(Graphics g) {
        if (this.labels.size() == 0) return;
        if (this.Alpha != 0.0f) {
            Graphics2D IiiiiiiiIIIII;
            Graphics2D graphics2D = IiiiiiiiIIIII = (Graphics2D)g;
            Graphics2D graphics2D2 = IiiiiiiiIIIII;
            Composite IiiiiiiiIIIII2 = graphics2D2.getComposite();
            graphics2D.setComposite(AlphaComposite.getInstance(3, this.Alpha));
            graphics2D2.setColor(Color.BLACK);
            graphics2D.fillRoundRect(0, 0, this.getWidth(), this.h == 0 ? this.getHeight() : this.h, 10, 10);
            IiiiiiiiIIIII.setComposite(IiiiiiiiIIIII2);
        }
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII3 = -this.deviation * 22;
        g.translate(0, IiiiiiiiIIIII3);
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < this.labels.size()) {
            Component IiiiiiiiIIIII5 = (Component)this.labels.get(IiiiiiiiIIIII4);
            g.translate(IiiiiiiiIIIII5.getX(), IiiiiiiiIIIII);
            IiiiiiiiIIIII = IiiiiiiiIIIII5.getHeight();
            if ((IiiiiiiiIIIII3 += IiiiiiiiIIIII) >= 0) {
                IiiiiiiiIIIII5.paint(g);
            }
            ++IiiiiiiiIIIII4;
        }
    }

    public boolean isDisplay() {
        return this.display;
    }

    public int getH() {
        return this.h;
    }

    public void setGag(boolean gag) {
        this.Gag = gag;
    }

    public void setDisplay(boolean display) {
        this.display = display;
    }

    public float getAlpha() {
        return this.Alpha;
    }

    public void Formsize(int size) {
        int IiiiiiiiIIIII = 6;
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.labels.size()) {
            double d = this.labels.get(IiiiiiiiIIIII2).getSize().getHeight();
            ++IiiiiiiiIIIII2;
            IiiiiiiiIIIII = (int)((double)IiiiiiiiIIIII + d);
        }
        this.setSize(size, IiiiiiiiIIIII);
    }

    public RichLabel addText(String chatText, int size, Font font) {
        RichLabel IiiiiiiiIIIII = new RichLabel(chatText, font);
        IiiiiiiiIIIII.setSize(IiiiiiiiIIIII.computeSize(size));
        if (IiiiiiiiIIIII != null) {
            this.labels.add(IiiiiiiiIIIII);
        }
        this.Formsize(size);
        return IiiiiiiiIIIII;
    }

    public boolean isGag() {
        return this.Gag;
    }

    public ChatBoxOld() {
        this.setBackground(iiIIiiiiIiiII.IIiIiiiiIIiII);
    }
}
