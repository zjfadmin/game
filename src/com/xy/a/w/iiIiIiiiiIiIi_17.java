/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iiIiiiiiIIiiI
 *  com.xy.a.w.IIIiiiiiiiiIi
 *  com.xy.a.w.iiIiiiiiIIiii
 *  com.xy.i.IIIIIiiiIIIiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.w.IIIIIiiiIiiII
 */
package com.xy.a.w;

import com.xy.a.iiIiiiiiIIiiI;
import com.xy.a.w.IIIiiiiiiiiIi;
import com.xy.a.w.iiIiiiiiIIiii;
import com.xy.i.IIIIIiiiIIIiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.w.IIIIIiiiIiiII;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JLabel;

/*
 * Exception performing whole class analysis ignored.
 */
static class iiIiIiiiiIiIi
extends JComponent {
    private int iiiIiiiiiiiIi;
    private boolean iIiiIiiiiiiII;
    private List<iiIiiiiiIIiii> IIiiIiiiIIiIi;
    private int iIiIiiiiIiIii;
    private int IiIIIiiiiIiiI;
    final /* synthetic */ IIIiiiiiiiiIi iiIiiiiiiiIii;
    private int IiiiiiiiIIIII;
    private IIIIIiiiIIIiI ALLATORIxDEMO;

    public void iIiIiiiiIIiii() {
        if (this.IiIIIiiiiIiiI == 0 && this.IiiiiiiiIIIII == 0) {
            return;
        }
        this.iIiiIiiiiiiII = !this.iIiiIiiiiiiII;
        this.iiIiiiiiiiIii.iIiIiiiiIIiIi();
    }

    public void ALLATORIxDEMO() {
        this.IiIIIiiiiIiiI = 0;
        this.IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIiiIiiiIIiIi.size()) {
            JLabel IiiiiiiiIIIII2 = (JLabel)this.IIiiIiiiIIiIi.get(IiiiiiiiIIIII);
            ++IiiiiiiiIIIII;
            IiiiiiiiIIIII2.setText(null);
            IiiiiiiiIIIII2.setVisible(false);
        }
    }

    static /* synthetic */ void ALLATORIxDEMO(iiIiIiiiiIiIi arg0, int arg1) {
        arg0.iIiIiiiiIiIii = arg1;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(JLabel jLabel, double d, String string) {
        void value;
        void text;
        jLabel.setText(String.valueOf(text) + ":" + String.format("%.1f", (double)value) + iiIiiiiiIIiiI.iIiIiiiiIIiii((String)text));
    }

    static /* synthetic */ void ALLATORIxDEMO(iiIiIiiiiIiIi arg0, boolean arg1) {
        arg0.iIiiIiiiiiiII = arg1;
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(double d, String string, String string2) {
        void text;
        void value;
        void name;
        iiIiiiiiIIiii IiiiiiiiIIIII = this.ALLATORIxDEMO(this.IiIIIiiiiIiiI + this.IiiiiiiiIIIII);
        iiIiiiiiIIiii.ALLATORIxDEMO((iiIiiiiiIIiii)IiiiiiiiIIIII, (String)name);
        iiIiiiiiIIiii.ALLATORIxDEMO((iiIiiiiiIIiii)IiiiiiiiIIIII, (double)value);
        Double IiiiiiiiIIIII2 = null;
        Integer IiiiiiiiIIIII3 = (Integer)IIIiiiiiiiiIi.ALLATORIxDEMO().get(iiIiiiiiIIiii.ALLATORIxDEMO((iiIiiiiiIIiii)IiiiiiiiIIIII));
        if (IiiiiiiiIIIII3 != null && (IiiiiiiiIIIII3 >> IIIiiiiiiiiIi.ALLATORIxDEMO((IIIiiiiiiiiIi)this.iiIiiiiiiiIii) & 1) == 1) {
            IiiiiiiiIIIII2 = this.iiIiiiiiiiIii.ALLATORIxDEMO(IiiiiiiiIIIII);
        }
        if (IiiiiiiiIIIII2 != null && IiiiiiiiIIIII2 <= 0.0) {
            IiiiiiiiIIIII.setForeground(Color.red);
        } else {
            IiiiiiiiIIIII.setForeground(Color.white);
        }
        this.ALLATORIxDEMO((JLabel)IiiiiiiiIIIII, (double)value, (String)text);
        if (text.length() > 8) {
            IiiiiiiiIIIII.setBounds(5, 20 + this.IiIIIiiiiIiiI * 22, 300, 22);
            if (this.IiIIIiiiiIiiI > this.IiiiiiiiIIIII) {
                ++this.IiiiiiiiIIIII;
            }
            ++this.IiIIIiiiiIiiI;
            ++this.IiiiiiiiIIIII;
            return;
        }
        if (this.IiIIIiiiiIiiI <= this.IiiiiiiiIIIII) {
            IiiiiiiiIIIII.setBounds(5, 20 + this.IiIIIiiiiIiiI * 22, 150, 22);
            ++this.IiIIIiiiiIiiI;
            return;
        }
        IiiiiiiiIIIII.setBounds(155, 20 + this.IiiiiiiiIIIII * 22, 150, 22);
        ++this.IiiiiiiiIIIII;
    }

    static /* synthetic */ boolean ALLATORIxDEMO(iiIiIiiiiIiIi arg0) {
        return arg0.iIiiIiiiiiiII;
    }

    @Override
    protected void paintChildren(Graphics g) {
        super.paintChildren(g);
        if (this.iIiiIiiiiiiII) {
            return;
        }
        if (IIIiiiiiiiiIi.ALLATORIxDEMO((IIIiiiiiiiiIi)this.iiIiiiiiiiIii) == null) {
            IIIiiiiiiiiIi.ALLATORIxDEMO((IIIiiiiiiiiIi)this.iiIiiiiiiiIii, (Image)IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/32.png"));
        }
        g.drawImage(IIIiiiiiiiiIi.ALLATORIxDEMO((IIIiiiiiiiiIi)this.iiIiiiiiiiIii), 89, 3, 16, 16, null);
        g.drawImage(IIIiiiiiiiiIi.ALLATORIxDEMO((IIIiiiiiiiiIi)this.iiIiiiiiiiIii), 190, 3, 16, 16, null);
    }

    /*
     * WARNING - void declaration
     */
    public iiIiIiiiiIiIi(IIIiiiiiiiiIi iIIiiiiiiiiIi, int n) {
        void index;
        this.iiIiiiiiiiIii = iIIiiiiiiiiIi;
        this.iiiIiiiiiiiIi = index;
        this.ALLATORIxDEMO = new IIIIIiiiIIIiI("sc/e/37.png", 1, 120 + index, iiIIiiiiIiiII.IiIiiiiiIiIiI, null, index == false ? "\u6cd5\u672f\u6297\u6027" : (index == true ? "\u7269\u7406\u5c5e\u6027" : (index == 2 ? "\u4e94\u884c\u5c5e\u6027" : (index == 3 ? "\u6cd5\u672f\u589e\u5f3a" : (index == 4 ? "\u5176\u4ed6" : "")))), iIIiiiiiiiiIi.ALLATORIxDEMO());
        this.ALLATORIxDEMO.setBounds(0, 0, 299, 20);
        this.add((Component)this.ALLATORIxDEMO);
        this.IIiiIiiiIIiIi = new ArrayList<iiIiiiiiIIiii>();
    }

    static /* synthetic */ int iiiIiiiiiiIIi(iiIiIiiiiIiIi arg0) {
        return arg0.IiIIIiiiiIiiI;
    }

    private /* synthetic */ iiIiiiiiIIiii ALLATORIxDEMO(int index) {
        iiIiiiiiIIiii IiiiiiiiIIIII;
        iiIiiiiiIIiii iiIiiiiiIIiii2 = IiiiiiiiIIIII = index < this.IIiiIiiiIIiIi.size() ? this.IIiiIiiiIIiIi.get(index) : null;
        if (IiiiiiiiIIIII == null) {
            IiiiiiiiIIIII = new iiIiiiiiIIiii(this.iiIiiiiiiiIii);
            IiiiiiiiIIIII.setForeground(Color.white);
            IiiiiiiiIIIII.setFont(iiIIiiiiIiiII.iIIiiiiiiIIII);
            IiiiiiiiIIIII.addMouseListener((MouseListener)IiiiiiiiIIIII);
            IiiiiiiiIIIII.addMouseMotionListener((MouseMotionListener)this.iiIiiiiiiiIii.ALLATORIxDEMO());
            IiiiiiiiIIIII.addMouseListener((MouseListener)this.iiIiiiiiiiIii.ALLATORIxDEMO());
            this.add((Component)IiiiiiiiIIIII);
            this.IIiiIiiiIIiIi.add(IiiiiiiiIIIII);
        }
        IiiiiiiiIIIII.setVisible(true);
        return IiiiiiiiIIIII;
    }

    static /* synthetic */ int iIiIiiiiIIiii(iiIiIiiiiIiIi arg0) {
        return arg0.IiiiiiiiIIIII;
    }

    static /* synthetic */ int ALLATORIxDEMO(iiIiIiiiiIiIi arg0) {
        return arg0.iIiIiiiiIiIii;
    }
}
