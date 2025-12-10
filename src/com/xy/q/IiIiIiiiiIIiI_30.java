/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.q.IIiIIiiiIIIiI
 */
package com.xy.q;

import com.xy.q.IIiIIiiiIIIiI;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IiIiIiiiiIIiI {
    private JLabel IiIIIiiiiIiiI;
    private IIiIIiiiIIIiI iiIiiiiiiiIii;
    private JLabel IiiiiiiiIIIII;
    private JTextField ALLATORIxDEMO;

    public void ALLATORIxDEMO(JTextField textField) {
        this.ALLATORIxDEMO = textField;
    }

    public IIiIIiiiIIIiI ALLATORIxDEMO() {
        return this.iiIiiiiiiiIii;
    }

    public JTextField ALLATORIxDEMO() {
        return this.ALLATORIxDEMO;
    }

    public IiIiIiiiiIIiI(JLabel nameLabel, IIiIIiiiIIIiI numberDocument) {
        this.IiiiiiiiIIIII = nameLabel;
        this.iiIiiiiiiiIii = numberDocument;
        this.ALLATORIxDEMO = numberDocument.ALLATORIxDEMO();
    }

    public JLabel iIiIiiiiIIiii() {
        return this.IiIIIiiiiIiiI;
    }

    public IiIiIiiiiIIiI(JLabel nameLabel, JLabel moneyLabel) {
        this.IiiiiiiiIIIII = nameLabel;
        this.IiIIIiiiiIiiI = moneyLabel;
    }

    public void iIiIiiiiIIiii(JLabel moneyLabel) {
        this.IiIIIiiiiIiiI = moneyLabel;
    }

    public JLabel ALLATORIxDEMO() {
        return this.IiiiiiiiIIIII;
    }

    public void ALLATORIxDEMO(boolean aFlag) {
        if (this.IiiiiiiiIIIII != null) {
            this.IiiiiiiiIIIII.setVisible(aFlag);
        }
        if (this.IiIIIiiiiIiiI != null) {
            this.IiIIIiiiiIiiI.setVisible(aFlag);
        }
        if (this.ALLATORIxDEMO == null) return;
        this.ALLATORIxDEMO.setVisible(aFlag);
    }

    public void ALLATORIxDEMO(JLabel nameLabel) {
        this.IiiiiiiiIIIII = nameLabel;
    }

    public void ALLATORIxDEMO(IIiIIiiiIIIiI numberDocument) {
        this.iiIiiiiiiiIii = numberDocument;
    }
}
