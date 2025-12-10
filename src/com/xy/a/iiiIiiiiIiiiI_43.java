/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.richtext.RichLabel
 *  com.xy.text.GameView
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a;

import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class iiiIiiiiIiiiI
extends IiiiIiiiiIiIi {
    private JScrollPane IiIIIiiiiIiiI;
    private IIIiiiiiIiIiI[] iiIiiiiiiiIii;
    private RichLabel IiiiiiiiIIIII;
    private JLabel ALLATORIxDEMO;

    public void ALLATORIxDEMO(String ruleTitle, String ruleText) {
        this.ALLATORIxDEMO.setText(ruleTitle);
        this.IiiiiiiiIIIII.setTextSize(ruleText, 218);
        JScrollBar IiiiiiiiIIIII = this.IiIIIiiiiIiiI.getVerticalScrollBar();
        IiiiiiiiIIIII.setMaximum(this.IiiiiiiiIIIII.getHeight());
        IiiiiiiiIIIII.setValue(0);
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    public iiiIiiiiIiiiI(GameView gameView) {
        super(180, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 314, 344, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u89c4\u5219\u8bf4\u660e");
        this.ALLATORIxDEMO = IiIIIiiiiIIiI.ALLATORIxDEMO((int)49, (int)29, (int)236, (int)21, (int)0, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFFFFFF"), (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
        this.add(this.ALLATORIxDEMO);
        this.IiiiiiiiIIIII = new RichLabel("", iiIIiiiiIiiII.iIiIIiiiiIIiI, 218);
        this.IiIIIiiiiIiiI = IiIIIiiiiIIiI.ALLATORIxDEMO((int)52, (int)49, (int)233, (int)265, (Component)this.IiiiiiiiIIIII, (int)-1);
        this.add(this.IiIIIiiiiIiiI);
        this.iiIiiiiiiiIii = new IIIiiiiiIiIiI[2];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII == 0) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(49, 29, 236, 21);
            } else if (IiiiiiiiIIIII == 1) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(49, 29, 236, 285);
            }
            this.add((Component)this.iiIiiiiiiiIii[IiiiiiiiIIIII++]);
        }
    }
}
