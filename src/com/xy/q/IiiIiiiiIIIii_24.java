/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.richtext.InputBean
 *  com.xy.v.iiIiiiiiIIiii
 */
package com.xy.q;

import com.xy.richtext.InputBean;
import com.xy.v.iiIiiiiiIIiii;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class IiiIiiiiIIIii
extends PlainDocument {
    private List<InputBean> IiiiiiiiIIIII = new ArrayList<InputBean>();
    private static final long ALLATORIxDEMO = 1L;

    /*
     * WARNING - void declaration
     */
    @Override
    public void remove(int n, int n2) throws BadLocationException {
        void len;
        void offs;
        this.ALLATORIxDEMO((int)offs, (int)(-len));
        super.remove((int)offs, (int)len);
    }

    /*
     * Unable to fully structure code
     */
    public String ALLATORIxDEMO() {
        try {
            IiiiiiiiIIIII = super.getText(0, this.getLength());
            if (this.IiiiiiiiIIIII.size() == 0) {
                return IiiiiiiiIIIII;
            }
            IiiiiiiiIIIII = 0;
            IiiiiiiiIIIII = new StringBuffer();
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl26
        }
        catch (BadLocationException IiiiiiiiIIIII) {
            IiiiiiiiIIIII.printStackTrace();
            return null;
        }
        do {
            IiiiiiiiIIIII = this.IiiiiiiiIIIII.get(IiiiiiiiIIIII);
            IiiiiiiiIIIII = IiiiiiiiIIIII.substring(0, IiiiiiiiIIIII.getIndex() - IiiiiiiiIIIII);
            IiiiiiiiIIIII.append(IiiiiiiiIIIII);
            IiiiiiiiIIIII.append("#V");
            IiiiiiiiIIIII.append(iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII));
            IiiiiiiiIIIII.append("#L");
            IiiiiiiiIIIII = IiiiiiiiIIIII.substring(IiiiiiiiIIIII.getIndex() + IiiiiiiiIIIII.getName().length() - IiiiiiiiIIIII);
            ++IiiiiiiiIIIII;
            IiiiiiiiIIIII = IiiiiiiiIIIII.getIndex() + IiiiiiiiIIIII.getName().length();
lbl26:
            // 2 sources

        } while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.size());
        IiiiiiiiIIIII.append(IiiiiiiiIIIII);
        return IiiiiiiiIIIII.toString();
    }

    public void ALLATORIxDEMO(int offs, int offset) {
        int IiiiiiiiIIIII = this.IiiiiiiiIIIII.size() - 1;
        while (IiiiiiiiIIIII >= 0) {
            InputBean IiiiiiiiIIIII2 = this.IiiiiiiiIIIII.get(IiiiiiiiIIIII);
            if (IiiiiiiiIIIII2.getIndex() >= offs) {
                IiiiiiiiIIIII2.setIndex(IiiiiiiiIIIII2.getIndex() + offset);
                if (IiiiiiiiIIIII2.getIndex() < offs) {
                    this.IiiiiiiiIIIII.remove(IiiiiiiiIIIII);
                }
            }
            --IiiiiiiiIIIII;
        }
    }

    public void ALLATORIxDEMO(InputBean bean) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.size()) {
            if (this.IiiiiiiiIIIII.get(IiiiiiiiIIIII).getIndex() > bean.getIndex()) {
                this.IiiiiiiiIIIII.add(IiiiiiiiIIIII, bean);
                return;
            }
            ++IiiiiiiiIIIII;
        }
        this.IiiiiiiiIIIII.add(bean);
    }

    public void ALLATORIxDEMO(int offset, int type, BigDecimal id, String str, String color, AttributeSet attrSet) throws BadLocationException {
        if (str == null) return;
        if (this.IiiiiiiiIIIII.size() >= 3) {
            return;
        }
        str = str.replace("#", " ");
        int IiiiiiiiIIIII = this.IiiiiiiiIIIII.size() - 1;
        while (IiiiiiiiIIIII >= 0) {
            if (this.IiiiiiiiIIIII.get(IiiiiiiiIIIII).isIndex(offset)) {
                return;
            }
            --IiiiiiiiIIIII;
        }
        this.ALLATORIxDEMO(offset, str.length());
        InputBean IiiiiiiiIIIII2 = new InputBean(offset, type, id, str, color);
        this.ALLATORIxDEMO(IiiiiiiiIIIII2);
        super.insertString(offset, str, attrSet);
    }

    @Override
    public void insertString(int offset, String str, AttributeSet attrSet) throws BadLocationException {
        if (str == null) {
            return;
        }
        int IiiiiiiiIIIII = this.IiiiiiiiIIIII.size() - 1;
        while (IiiiiiiiIIIII >= 0) {
            if (this.IiiiiiiiIIIII.get(IiiiiiiiIIIII).isIndex(offset)) {
                return;
            }
            --IiiiiiiiIIIII;
        }
        this.ALLATORIxDEMO(offset, str.length());
        super.insertString(offset, str, attrSet);
    }
}
