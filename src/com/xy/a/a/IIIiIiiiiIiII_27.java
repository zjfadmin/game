/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.iIIIiiiiIiiII
 *  com.xy.a.a.iiIiIiiiIiIiI
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.a;

import com.xy.a.a.iIIIiiiiIiiII;
import com.xy.a.a.iiIiIiiiIiIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JComponent;
import javax.swing.JLabel;

/*
 * Exception performing whole class analysis ignored.
 */
static class IIIiIiiiiIiII
extends JComponent {
    final /* synthetic */ iIIIiiiiIiiII IiIIIiiiiIiiI;
    private iiIiIiiiIiIiI[] iiIiiiiiiiIii;
    private IIIiiiiiIiIiI[] IiiiiiiiIIIII;
    private JLabel ALLATORIxDEMO = IiIIIiiiiIIiI.ALLATORIxDEMO((int)15, (int)7, (int)70, (int)18, (int)0, (Color)Color.black, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);

    public IIIiIiiiiIiII(iIIIiiiiIiiII iIIIiiiiIiiII2) {
        this.IiIIIiiiiIiiI = iIIIiiiiIiiII2;
        this.ALLATORIxDEMO.setText("\u5b9d\u5b9d\u5929\u8d44");
        this.add(this.ALLATORIxDEMO);
        this.iiIiiiiiiiIii = new iiIiIiiiIiIiI[6];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            if (IiiiiiiiIIIII < 3) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII] = new iiIiIiiiIiIiI(iIIIiiiiIiiII2, 2, IiiiiiiiIIIII);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(16 + IiiiiiiiIIIII * 72, 25, 59, 57);
            } else {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII] = new iiIiIiiiIiIiI(iIIIiiiiIiiII2, 3, IiiiiiiiIIIII - 3);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(16 + (IiiiiiiiIIIII - 3) * 73, 133, 60, 60);
            }
            this.add((Component)this.iiIiiiiiiiIii[IiiiiiiiIIIII++]);
        }
        this.IiiiiiiiIIIII = new IIIiiiiiIiIiI[6];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII < 3) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/38.png");
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(28 + IiiiiiiiIIIII * 73, 79, 35, 79);
            } else {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/30.png");
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(17 + (IiiiiiiiIIIII - 3) * 72, 82, 58, 1);
            }
            this.add((Component)this.IiiiiiiiIIIII[IiiiiiiiIIIII++]);
        }
    }

    static /* synthetic */ iiIiIiiiIiIiI[] ALLATORIxDEMO(IIIiIiiiiIiII arg0) {
        return arg0.iiIiiiiiiiIii;
    }

    public void ALLATORIxDEMO() {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            com.xy.q.IIIiiiiiIiIiI iIIiiiiiIiIiI = iiIiIiiiIiIiI.ALLATORIxDEMO((iiIiIiiiIiIiI)this.iiIiiiiiiiIii[IiiiiiiiIIIII]);
            ++IiiiiiiiIIIII;
            iIIiiiiiIiIiI.ALLATORIxDEMO(0, null);
        }
    }
}
