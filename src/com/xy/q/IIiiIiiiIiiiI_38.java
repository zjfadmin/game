/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iiIIiiiiIiIiI
 *  com.xy.q.IiiiIiiiiIiIi
 */
package com.xy.q;

import com.xy.a.iiIIiiiiIiIiI;
import com.xy.q.IiiiIiiiiIiIi;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class IIiiIiiiIiiiI
extends PlainDocument {
    private boolean iIiIiiiiIiIii;
    public static final int IiIIIiiiiIiiI = 15;
    private static final long iiIiiiiiiiIii = 1L;
    private JTextField IiiiiiiiIIIII;
    private IiiiIiiiiIiIi ALLATORIxDEMO;

    @Override
    public void remove(int offs, int len) throws BadLocationException {
        super.remove(offs, len);
        String IiiiiiiiIIIII = null;
        if (!this.iIiIiiiiIiIii) return;
        if (IiiiiiiiIIIII == null) {
            IiiiiiiiIIIII = this.getText(0, this.getLength());
        }
        this.ALLATORIxDEMO(IiiiiiiiIIIII);
    }

    /*
     * WARNING - void declaration
     */
    public IIiiIiiiIiiiI(int n, JTextField jTextField, IiiiIiiiiIiIi iiiiIiiiiIiIi) {
        void index;
        void textField;
        void form;
        this.ALLATORIxDEMO = form;
        this.IiiiiiiiIIIII = textField;
        this.iIiIiiiiIiIii = (index >> 3 & 1) == 1;
        this.IiiiiiiiIIIII.setDocument(this);
    }

    @Override
    public void replace(int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
        if (text != null && text.length() > 1) {
            if (!this.iIiIiiiiIiIii) return;
            this.ALLATORIxDEMO(text);
            return;
        }
        super.replace(offset, length, text, attrs);
    }

    public JTextField ALLATORIxDEMO() {
        return this.IiiiiiiiIIIII;
    }

    public void ALLATORIxDEMO(String value) {
        if (this.ALLATORIxDEMO == null) {
            return;
        }
        if (!(this.ALLATORIxDEMO instanceof iiIIiiiiIiIiI)) return;
        ((iiIIiiiiIiIiI)this.ALLATORIxDEMO).ALLATORIxDEMO(value, this.IiiiiiiiIIIII);
    }

    @Override
    public void insertString(int offset, String str, AttributeSet attrSet) throws BadLocationException {
        super.insertString(offset, str, attrSet);
        String IiiiiiiiIIIII = null;
        if (!this.iIiIiiiiIiIii) return;
        if (IiiiiiiiIIIII == null) {
            IiiiiiiiIIIII = this.getText(0, this.getLength());
        }
        this.ALLATORIxDEMO(IiiiiiiiIIIII);
    }
}
