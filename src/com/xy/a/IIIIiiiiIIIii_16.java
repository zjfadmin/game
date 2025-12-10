/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IIIiIiiiIiIii
 *  com.xy.formula.QualityZW
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiII
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIiIiiiiIIiii
 */
package com.xy.a;

import com.xy.a.IIIiIiiiIiIii;
import com.xy.formula.QualityZW;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiII;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIiIiiiiIIiii;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis ignored.
 */
static class IIIIiiiiIIIii {
    private JLabel IiIIIiiiiIiiI = new JLabel();
    final /* synthetic */ IIIiIiiiIiIii iiIiiiiiiiIii;
    private IiiiIiiiiIiII IiiiiiiiIIIII;
    private IiiiIiiiiIiII ALLATORIxDEMO;

    public IIIIiiiiIIIii(IIIiIiiiIiIii iIIiIiiiIiIii) {
        this.iiIiiiiiiiIii = iIIiIiiiIiIii;
        this.IiIIIiiiiIiiI.setForeground(Color.black);
        this.IiIIIiiiiIiiI.setFont(iiIIiiiiIiiII.ALLATORIxDEMO);
        this.ALLATORIxDEMO = IiIIIiiiiIIiI.ALLATORIxDEMO((IIiIiiiiIIiii)IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false), (Font)iiIIiiiiIiiII.iIiIIiiiiIIiI, (Color)Color.white);
        this.IiiiiiiiIIIII = IiIIIiiiiIIiI.ALLATORIxDEMO((IIiIiiiiIIiii)IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false), (Font)iiIIiiiiIiiII.ALLATORIxDEMO, (Color)Color.white);
        iIIiIiiiIiIii.add((Component)this.IiIIIiiiiIiiI);
        iIIiIiiiIiIii.add((Component)this.ALLATORIxDEMO);
        iIIiIiiiIiIii.add((Component)this.IiiiiiiiIIIII);
    }

    static /* synthetic */ IiiiIiiiiIiII iIiIiiiiIIiii(IIIIiiiiIIIii arg0) {
        return arg0.IiiiiiiiIIIII;
    }

    public boolean ALLATORIxDEMO(String key) {
        String IiiiiiiiIIIII = this.ALLATORIxDEMO();
        if (key.length() > IiiiiiiiIIIII.length()) {
            return false;
        }
        if (IiiiiiiiIIIII.equals(key)) {
            return true;
        }
        if (IiiiiiiiIIIII.indexOf("|") == -1) {
            return false;
        }
        String[] IiiiiiiiIIIII2 = IiiiiiiiIIIII.split("\\|");
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < IiiiiiiiIIIII2.length) {
            if (IiiiiiiiIIIII2[IiiiiiiiIIIII3].equals(key)) {
                return true;
            }
            ++IiiiiiiiIIIII3;
        }
        return false;
    }

    public double ALLATORIxDEMO() {
        return QualityZW.getDouble((String)this.IiiiiiiiIIIII.getText());
    }

    static /* synthetic */ IiiiIiiiiIiII ALLATORIxDEMO(IIIIiiiiIIIii arg0) {
        return arg0.ALLATORIxDEMO;
    }

    public String ALLATORIxDEMO() {
        return this.ALLATORIxDEMO.getText();
    }

    public void ALLATORIxDEMO(String value, int w, int h, int type) {
        this.IiIIIiiiiIiiI.setVisible(w != 0);
        this.ALLATORIxDEMO.setVisible(w != 0);
        this.IiiiiiiiIIIII.setVisible(w != 0);
        if (w == 0) {
            return;
        }
        this.IiIIIiiiiIiiI.setText(value);
        this.ALLATORIxDEMO.setText("");
        this.IiiiiiiiIIIII.setText("");
        this.IiIIIiiiiIiiI.setBounds(w - 8, h, 68, 18);
        this.ALLATORIxDEMO.setBounds(w + 62, h - 1, 86, 20);
        this.IiiiiiiiIIIII.setBounds(w + 62 + 60 + 35, h - 1, 51, 20);
        this.ALLATORIxDEMO.setEditable(type == 0 || type == 2);
        this.IiiiiiiiIIIII.setEditable(type == 0 || type == 1);
        if (type == 1) {
            this.ALLATORIxDEMO.setText(value);
            return;
        }
        if (type != 2) return;
        this.IiiiiiiiIIIII.setVisible(true);
    }
}
