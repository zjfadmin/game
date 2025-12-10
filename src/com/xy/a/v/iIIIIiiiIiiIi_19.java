/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.v.iIiIiiiiIiIII
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iIiIIiiiIiiiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.v;

import com.xy.a.v.iIiIiiiiIiIII;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.iIiIIiiiIiiiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;

/*
 * Exception performing whole class analysis ignored.
 */
static class iIIIIiiiIiiIi
extends iIiIIiiiIiiiI {
    private JLabel iiIiiiiiiiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((int)55, (int)0, (int)179, (int)30, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c7D6120"), (Font)iiIIiiiiIiiII.iiiIIiiiIiiII);
    private IIIiiiiiIiIiI IiiiiiiiIIIII;
    final /* synthetic */ iIiIiiiiIiIII ALLATORIxDEMO;

    public void ALLATORIxDEMO(int place, int height) {
        this.iiIiiiiiiiIii.setText(place == 8 ? "\u51a0\u519b" : (place == 7 ? "\u4e9a\u519b" : (place == 6 ? "\u5b63\u519b" : (place == 5 ? "\u6bbf\u519b" : (place == 4 ? "\u56db\u5f3a\u664b\u7ea7\u540d\u5355" : (place == 3 ? "\u516b\u5f3a\u664b\u7ea7\u540d\u5355" : (place == 2 ? "\u5341\u516d\u5f3a\u664b\u7ea7\u540d\u5355" : "\u4e09\u5341\u4e8c\u5f3a\u664b\u7ea7\u540d\u5355")))))));
        this.setBounds(123, height, 289, 30);
    }

    public iIIIIiiiIiiIi(iIiIiiiiIiIII iIiIiiiiIiIII2) {
        this.ALLATORIxDEMO = iIiIiiiiIiIII2;
        this.iiIiiiiiiiIii.setHorizontalAlignment(0);
        this.IiiiiiiiIIIII = new IIIiiiiiIiIiI("sc/d/103.png");
        this.IiiiiiiiIIIII.setBounds(0, 10, 289, 11);
        this.add(this.iiIiiiiiiiIii);
        this.add((Component)this.IiiiiiiiIIIII);
    }
}
