/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.IiIIIiiiiIiIi
 *  com.xy.a.a.iiiIIiiiIIIii
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.richtext.RichLabel
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.a;

import com.xy.a.a.IiIIIiiiiIiIi;
import com.xy.a.a.iiiIIiiiIIIii;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.richtext.RichLabel;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Component;
import javax.swing.JComponent;

/*
 * Exception performing whole class analysis ignored.
 */
static class IIiiIiiiIIiIi
extends JComponent {
    private IIIiiiiiIiIiI IiIIIiiiiIiiI;
    private RichLabel iiIiiiiiiiIii = new RichLabel("", iiIIiiiiIiiII.iiIiiiiiiIIiI);
    final /* synthetic */ iiiIIiiiIIIii IiiiiiiiIIIII;
    private IiIIIiiiiIiIi[] ALLATORIxDEMO;

    public IIiiIiiiIIiIi(iiiIIiiiIIIii iiiIIiiiIIIii2) {
        this.IiiiiiiiIIIII = iiiIIiiiIIIii2;
        this.iiIiiiiiiiIii.setTextSize("#c000000\u6e29\u99a8\u63d0\u793a\uff1a\u7075\u5b9d\u548c\u6cd5\u5b9d\u5c06\u4e0d\u518d\u6709\u7ec4\u5408\u6297\u6027\uff0c\u6bcf\u4e2a\u7075\u5b9d\u6216\u6cd5\u5b9d\u90fd\u5355\u72ec\u83b7\u5f97\u989d\u5916\u7684\u4eba\u7269\u6297\u6027\u3002", 370);
        this.iiIiiiiiiiIii.setBounds(39, 245, this.iiIiiiiiiiIii.getWidth(), this.iiIiiiiiiiIii.getHeight());
        this.add((Component)this.iiIiiiiiiiIii);
        this.ALLATORIxDEMO = new IiIIIiiiiIiIi[3];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII] = new IiIIIiiiiIiIi(iiiIIiiiIIIii2, IiiiiiiiIIIII, iiiIIiiiIIIii2.ALLATORIxDEMO());
            if (IiiiiiiiIIIII == 0) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(199, 84, 35, 35);
            } else if (IiiiiiiiIIIII == 1) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(146, 142, 35, 35);
            } else if (IiiiiiiiIIIII == 2) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(252, 142, 35, 35);
            }
            this.add((Component)this.ALLATORIxDEMO[IiiiiiiiIIIII++]);
        }
        this.IiIIIiiiiIiiI = new IIIiiiiiIiIiI("sc/d/42.png");
        this.IiIIIiiiiIiiI.setBounds(115, 27, 198, 206);
        this.add((Component)this.IiIIIiiiiIiiI);
    }
}
