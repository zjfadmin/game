/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.entity.RoleSummoning
 */
package com.xy.game;

import com.xy.entity.RoleSummoning;
import java.math.BigDecimal;

public class RolePet {
    private int bb1;
    private RoleSummoning pet;
    private int bb2;
    private int help;
    private int bb;
    private BigDecimal id;

    public int getHelp() {
        return this.help;
    }

    public RoleSummoning getPet() {
        return this.pet;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public void ALLATORIxDEMO(StringBuffer buffer) {
        if (buffer.length() != 0) {
            buffer.append("|");
        }
        buffer.append(this.id);
        if (this.help > 0) {
            buffer.append("=H");
            buffer.append(this.help);
        }
        if (this.bb > 0) {
            buffer.append("=B");
            buffer.append(this.bb);
        }
        if (this.bb1 > 0) {
            buffer.append("=BA");
            buffer.append(this.bb1);
        }
        if (this.bb2 <= 0) return;
        buffer.append("=BB");
        buffer.append(this.bb2);
    }

    public void setHelp(int help) {
        this.help = help;
    }

    public int getBb() {
        return this.bb;
    }

    public RolePet(BigDecimal id) {
        this.id = id;
    }

    public void setBb1(int bb1) {
        this.bb1 = bb1;
    }

    public int getBb1() {
        return this.bb1;
    }

    public void setBb(int bb) {
        this.bb = bb;
    }

    public BigDecimal getId() {
        return this.id;
    }

    public void setBb2(int bb2) {
        this.bb2 = bb2;
    }

    public int getBb2() {
        return this.bb2;
    }

    public void setPet(RoleSummoning pet) {
        this.pet = pet;
    }

    /*
     * WARNING - void declaration
     */
    public RolePet(String string) {
        void v;
        int IiiiiiiiIIIII = v.indexOf("=");
        this.id = new BigDecimal((String)(IiiiiiiiIIIII != -1 ? v.substring(0, IiiiiiiiIIIII) : v));
        if (IiiiiiiiIIIII == -1) {
            return;
        }
        while (true) {
            int IiiiiiiiIIIII2;
            String IiiiiiiiIIIII3;
            String string2 = IiiiiiiiIIIII3 = (IiiiiiiiIIIII2 = v.indexOf("=", IiiiiiiiIIIII + 1)) == -1 ? v.substring(IiiiiiiiIIIII + 1) : v.substring(IiiiiiiiIIIII + 1, IiiiiiiiIIIII2);
            if (IiiiiiiiIIIII3.startsWith("H")) {
                this.help = Integer.parseInt(IiiiiiiiIIIII3.substring(1));
            } else if (IiiiiiiiIIIII3.startsWith("B")) {
                if (IiiiiiiiIIIII3.startsWith("BA")) {
                    this.bb1 = Integer.parseInt(IiiiiiiiIIIII3.substring(2));
                } else if (IiiiiiiiIIIII3.startsWith("BB")) {
                    this.bb2 = Integer.parseInt(IiiiiiiiIIIII3.substring(2));
                } else {
                    this.bb = Integer.parseInt(IiiiiiiiIIIII3.substring(1));
                }
            }
            if (IiiiiiiiIIIII2 == -1) {
                return;
            }
            IiiiiiiiIIIII = IiiiiiiiIIIII2;
        }
    }

    public void ALLATORIxDEMO(int bb) {
        this.bb = bb;
        if (bb != 0) return;
        this.bb1 = 0;
        this.bb2 = 0;
    }
}
