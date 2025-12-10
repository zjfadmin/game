/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IIIiIiiiiIIii
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.richtext.RichLabel
 *  com.xy.text.GameView
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a;

import com.xy.a.IIIiIiiiiIIii;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseListener;

public class IiiIiiiiIiIIi
extends IiiiIiiiiIiIi {
    private RichLabel[] iiIiiiiiiiIii;
    private int IiiiiiiiIIIII = 1;
    private IIIiiiiiIiIiI[] ALLATORIxDEMO;

    public RichLabel[] ALLATORIxDEMO() {
        if (this.iiIiiiiiiiIii == null) {
            this.iiIiiiiiiiIii = new RichLabel[40];
        }
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < 40) {
            int IiiiiiiiIIIII2 = (this.IiiiiiiiIIIII - 1) * 40 + IiiiiiiiIIIII;
            if (IiiiiiiiIIIII2 < 168) {
                if (this.iiIiiiiiiiIii[IiiiiiiiIIIII] != null) {
                    this.iiIiiiiiiiIii[IiiiiiiiIIIII].setText("#" + IiiiiiiiIIIII2);
                } else {
                    this.iiIiiiiiiiIii[IiiiiiiiIIIII] = new RichLabel("#" + IiiiiiiiIIIII2, iiIIiiiiIiiII.iiIiiiiiiIIiI);
                }
            } else if (this.iiIiiiiiiiIii[IiiiiiiiIIIII] != null) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setText("");
            }
            ++IiiiiiiiIIIII;
        }
        return this.iiIiiiiiiiIii;
    }

    static /* synthetic */ void ALLATORIxDEMO(IiiIiiiiIiIIi arg0, int arg1) {
        arg0.IiiiiiiiIIIII = arg1;
    }

    static /* synthetic */ int ALLATORIxDEMO(IiiIiiiiIiIIi arg0) {
        return arg0.IiiiiiiiIIIII;
    }

    public IiiIiiiiIiIIi(GameView gameView) {
        super(52, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 504, 348, IiiiIiiiiIiIi.iIIiIiiiiiiIi);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/49.png", (int)6, (int)6, (int)6, (int)6, (boolean)false), null);
        this.ALLATORIxDEMO = new IIIiiiiiIiIiI[40];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < 40) {
            int IiiiiiiiIIIII2 = IiiiiiiiIIIII % 8;
            int IiiiiiiiIIIII3 = IiiiiiiiIIIII / 8;
            this.ALLATORIxDEMO[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(5 + 60 * IiiiiiiiIIIII2 + IiiiiiiiIIIII2 * 2, 5 + 60 * IiiiiiiiIIIII3 + IiiiiiiiIIIII3 * 2, 60, 60);
            this.ALLATORIxDEMO[IiiiiiiiIIIII].setBackground(iiIIiiiiIiiII.IIiIiiiiIIiII);
            this.ALLATORIxDEMO[IiiiiiiiIIIII].addMouseListener((MouseListener)new IIIiIiiiiIIii(this, IiiiiiiiIIIII));
            this.add((Component)this.ALLATORIxDEMO[IiiiiiiiIIIII++]);
        }
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < 5) {
            iIIiIiiiIiiIi IiiiiiiiIIIII2 = IiIIIiiiiIIiI.ALLATORIxDEMO((int)(10 + IiiiiiiiIIIII * 48), (int)318, (int)41, (int)25, (int)0, (Color)Color.WHITE, (Font)iiIIiiiiIiiII.iIiIIiiiiIIiI);
            IiiiiiiiIIIII2.setText(String.valueOf(IiiiiiiiIIIII + 1));
            IiiiiiiiIIIII2.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/b/B162.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
            int n = IiiiiiiiIIIII + 1 + 100;
            ++IiiiiiiiIIIII;
            IiiiiiiiIIIII2.addMouseListener((MouseListener)new IIIiIiiiiIIii(this, n));
            this.add((Component)IiiiiiiiIIIII2);
        }
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (this.iiIiiiiiiiIii == null) {
            this.ALLATORIxDEMO();
        }
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            if (this.iiIiiiiiiiIii[IiiiiiiiIIIII] != null && !this.iiIiiiiiiiIii[IiiiiiiiIIIII].getText().equals("")) {
                int IiiiiiiiIIIII2 = IiiiiiiiIIIII % 8;
                int IiiiiiiiIIIII3 = IiiiiiiiIIIII / 8;
                Graphics IiiiiiiiIIIII4 = g.create(8 + 62 * IiiiiiiiIIIII2, 8 + 62 * IiiiiiiiIIIII3, 50, 50);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].paint(IiiiiiiiIIIII4);
                IiiiiiiiIIIII4.dispose();
            }
            ++IiiiiiiiIIIII;
        }
    }
}
