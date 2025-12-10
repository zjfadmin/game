/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iiIIIiiiiIiIi
 *  com.xy.i.IIIIIiiiIIIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.text.GameView
 *  com.xy.v.iiiiiiiiIIIII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a;

import com.xy.a.iiIIIiiiiIiIi;
import com.xy.i.IIIIIiiiIIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.text.GameView;
import com.xy.v.iiiiiiiiIIIII;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.MouseListener;
import javax.swing.JLabel;

public class iiiIiiiiiiiiI
extends IiiiIiiiiIiIi {
    private int iIiIiiiiIiIii;
    private IIIIIiiiIIIiI IiIIIiiiiIiiI;
    private iiIIIiiiiIiIi[] iiIiiiiiiiIii;
    private IIIiiiiiIiIiI[] IiiiiiiiIIIII;
    private JLabel[] ALLATORIxDEMO;

    public iiiIiiiiiiiiI(GameView gameView) {
        super(158, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 302, 320, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u9891\u9053\u7b5b\u9009");
        this.ALLATORIxDEMO(new iiiiiiiiIIIII(14, 0, 0, 35));
        this.ALLATORIxDEMO = new JLabel[7];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)57, (int)23, (int)200, (int)19, (Color)Color.black, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.ALLATORIxDEMO[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u8bf7\u52fe\u9009\u8981\u663e\u793a\u7684\u9891\u9053\u4fe1\u606f" : (IiiiiiiiIIIII == 1 ? "\u5f53\u524d" : (IiiiiiiiIIIII == 2 ? "\u961f\u4f0d" : (IiiiiiiiIIIII == 3 ? "\u4e16\u754c" : (IiiiiiiiIIIII == 4 ? "\u5e2e\u6d3e" : (IiiiiiiiIIIII == 5 ? "\u6218\u6597" : (IiiiiiiiIIIII == 6 ? "\u4fe1\u606f" : "")))))));
            this.ALLATORIxDEMO[IiiiiiiiIIIII].setHorizontalAlignment(10);
            this.add(this.ALLATORIxDEMO[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII == 0) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setHorizontalAlignment(0);
            } else if (IiiiiiiiIIIII >= 1 && IiiiiiiiIIIII <= 10) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(103 + (IiiiiiiiIIIII - 1) % 2 * 99, 64 + (IiiiiiiiIIIII - 1) / 2 * 27, 36, 17);
            }
            ++IiiiiiiiIIIII;
        }
        this.IiIIIiiiiIiiI = new IIIIIiiiIIIiI("sc/e/26.png", 1, 313, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u4fdd\u5b58\u8bbe\u7f6e", (IiiiIiiiiIiIi)this);
        this.IiIIIiiiiIiiI.setBounds(111, 225, 99, 25);
        this.add((Component)this.IiIIIiiiiIiiI);
        this.IiiiiiiiIIIII = new IIIiiiiiIiIiI[8];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII == 0 || IiiiiiiiIIIII == 1) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/66.png", (int)50, (int)1, (int)50, (int)1, (boolean)false));
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(49, 45 + 163 * IiiiiiiiIIIII, 220, 2);
            } else if (IiiiiiiiIIIII >= 2 && IiiiiiiiIIIII <= 7) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/e/29.png");
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(85 + (IiiiiiiiIIIII - 2) % 2 * 99, 64 + (IiiiiiiiIIIII - 2) / 2 * 27, 17, 17);
            }
            this.add((Component)this.IiiiiiiiIIIII[IiiiiiiiIIIII++]);
        }
        this.iiIiiiiiiiIii = new iiIIIiiiiIiIi[6];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = new iiIIIiiiiIiIi(this, IiiiiiiiIIIII);
            this.IiiiiiiiIIIII[2 + IiiiiiiiIIIII].addMouseListener((MouseListener)this.iiIiiiiiiiIii[IiiiiiiiIIIII++]);
        }
    }

    public void iiiIiiiiiiIIi(int id) {
        if (id != 313) return;
        long IiiiiiiiIIIII = 0L;
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.iiIiiiiiiiIii.length) {
            if (iiIIIiiiiIiIi.ALLATORIxDEMO((iiIIIiiiiIiIi)this.iiIiiiiiiiIii[IiiiiiiiIIIII2])) {
                IiiiiiiiIIIII |= (long)(1 << IiiiiiiiIIIII2);
            }
            ++IiiiiiiiIIIII2;
        }
        if (this.iIiIiiiiIiIii == 1 && this.iiIIiiiiIiIIi.systemData.chatUp != IiiiiiiiIIIII) {
            this.iiIIiiiiIiIIi.systemData.chatUp = IiiiiiiiIIIII;
            this.iiIIiiiiIiIIi.systemData.iIiIiiiiIIiii();
        } else if (this.iIiIiiiiIiIii == 2 && this.iiIIiiiiIiIIi.systemData.chatDown != IiiiiiiiIIIII) {
            this.iiIIiiiiIiIIi.systemData.chatDown = IiiiiiiiIIIII;
            this.iiIIiiiiIiIIi.systemData.iIiIiiiiIIiii();
        }
        this.ALLATORIxDEMO().iiiIiiiiiiIIi(this.iIiIiiiiIIiii());
    }

    static /* synthetic */ IIIiiiiiIiIiI[] ALLATORIxDEMO(iiiIiiiiiiiiI arg0) {
        return arg0.IiiiiiiiIIIII;
    }

    public void iIiIiiiiIIiii(int type) {
        this.iIiIiiiiIiIii = type;
        long IiiiiiiiIIIII = type == 1 ? this.iiIIiiiiIiIIi.systemData.chatUp : (type == 2 ? this.iiIIiiiiIiIIi.systemData.chatDown : 0L);
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII2].ALLATORIxDEMO((IiiiiiiiIIIII >> IiiiiiiiIIIII2 & 1L) == 1L);
            ++IiiiiiiiIIIII2;
        }
        if (this.ALLATORIxDEMO().iIiIiiiiIIiii(this.iIiIiiiiIIiii()) != null) return;
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }
}
