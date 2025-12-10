/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.v.iiiiiiiiIIIII
 *  com.xy.w.IIIIIiiiIiiII
 */
package com.xy.q;

import com.xy.q.IIIiiiiiIiIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.v.iiiiiiiiIIIII;
import com.xy.w.IIIIIiiiIiiII;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class iIiIIiiiIIIiI
extends JComponent {
    private boolean iIiiIiiiiiiII;
    private static Image IIiiIiiiIIiIi;
    private static Image iIiIiiiiIiIii;
    private JLabel IiIIIiiiiIiiI;
    private static iiiiiiiiIIIII iiIiiiiiiiIii;
    private static iiiiiiiiIIIII IiiiiiiiIIIII;
    private IIIiiiiiIiIiI ALLATORIxDEMO;

    public iIiIIiiiIIIiI(IiiiIiiiiIiIi form) {
        this(form, true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (this.iIiiIiiiiiiII) {
            g.drawImage(iIiIiiiiIiIii, iIiIIiiiIIIiI.IiiiiiiiIIIII.ALLATORIxDEMO, iIiIIiiiIIIiI.IiiiiiiiIIIII.IiIIIiiiiIiiI, iIiIIiiiIIIiI.IiiiiiiiIIIII.iiIiiiiiiiIii, iIiIIiiiIIIiI.IiiiiiiiIIIII.IiiiiiiiIIIII, null);
        }
        g.drawImage(IIiiIiiiIIiIi, iIiIIiiiIIIiI.iiIiiiiiiiIii.ALLATORIxDEMO, iIiIIiiiIIIiI.iiIiiiiiiiIii.IiIIIiiiiIiiI, iIiIIiiiIIIiI.iiIiiiiiiiIii.iiIiiiiiiiIii, iIiIIiiiIIIiI.iiIiiiiiiiIii.IiiiiiiiIIIII, null);
    }

    static {
        iiIiiiiiiiIii = new iiiiiiiiIIIII(0, 0, 59, 57);
        IiiiiiiiIIIII = new iiiiiiiiIIIII(1, 57, 58, 1);
    }

    public void ALLATORIxDEMO(int type, Object data) {
        this.ALLATORIxDEMO.ALLATORIxDEMO(type, data);
        if (this.IiIIIiiiiIiiI == null) return;
        this.IiIIIiiiiIiiI.setVisible(this.ALLATORIxDEMO.ALLATORIxDEMO() == 0);
    }

    public iIiIIiiiIIIiI(IiiiIiiiiIiIi form, boolean shadow) {
        this.ALLATORIxDEMO = new IIIiiiiiIiIiI(form);
        this.ALLATORIxDEMO.setBounds(4, 4, 50, 50);
        this.add((Component)this.ALLATORIxDEMO);
        if (IIiiIiiiIIiIi == null) {
            IIiiIiiiIIiIi = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/4.png");
        }
        if (!shadow) return;
        if (iIiIiiiiIiIii != null) return;
        iIiIiiiiIiIii = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/30.png");
    }

    public IIIiiiiiIiIiI ALLATORIxDEMO() {
        return this.ALLATORIxDEMO;
    }

    public void ALLATORIxDEMO(String key) {
        if (key == null && this.IiIIIiiiiIiiI == null) {
            return;
        }
        if (this.IiIIIiiiiIiiI == null) {
            this.IiIIIiiiiIiiI = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)21, (int)58, (int)16, (int)0, (Color)Color.gray, (Font)iiIIiiiiIiiII.iiIiiiiiiIIiI);
            this.IiIIIiiiiIiiI.setVisible(false);
            this.add(this.IiIIIiiiiIiiI);
        }
        this.IiIIIiiiiIiiI.setText(key);
        this.IiIIIiiiiIiiI.setVisible(this.ALLATORIxDEMO.ALLATORIxDEMO() == 0);
        this.setVisible(true);
    }
}
