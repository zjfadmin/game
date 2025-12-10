/*
 * Decompiled with CFR 0.152.
 */
package com.xy.n;

/*
 * Exception performing whole class analysis ignored.
 */
static class iiIIiiiiIiiII {
    public int iIiiIiiiiiiII;
    public int IIiiIiiiIIiIi;
    public iiIIiiiiIiiII iIiIiiiiIiIii;
    public int IiIIIiiiiIiiI;
    public int iiIiiiiiiiIii;
    public boolean IiiiiiiiIIIII;
    public int ALLATORIxDEMO;

    public int hashCode() {
        int IiiiiiiiIIIII = 31;
        int IiiiiiiiIIIII2 = 1;
        IiiiiiiiIIIII2 = 31 * IiiiiiiiIIIII2 + this.ALLATORIxDEMO;
        IiiiiiiiIIIII2 = 31 * IiiiiiiiIIIII2 + this.IIiiIiiiIIiIi;
        return IiiiiiiiIIIII2;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof iiIIiiiiIiiII)) {
            return false;
        }
        iiIIiiiiIiiII IiiiiiiiIIIII = (iiIIiiiiIiiII)obj;
        if (this.ALLATORIxDEMO != IiiiiiiiIIIII.ALLATORIxDEMO) return false;
        if (this.IIiiIiiiIIiIi != IiiiiiiiIIIII.IIiiIiiiIIiIi) return false;
        return true;
    }

    public iiIIiiiiIiiII() {
    }

    public iiIIiiiiIiiII(int row, int col, boolean lvl, int H) {
        this(row, col, lvl, H, null);
    }

    public iiIIiiiiIiiII(int row, int col, boolean lvl, int H, iiIIiiiiIiiII pos) {
        this.iIiiIiiiiiiII = H;
        this.ALLATORIxDEMO = row;
        this.IIiiIiiiIIiIi = col;
        this.IiiiiiiiIIIII = lvl;
        this.iIiIiiiiIiIii = pos;
        this.IiIIIiiiiIiiI = this.ALLATORIxDEMO();
        this.iiIiiiiiiiIii = this.IiIIIiiiiIiiI + H;
    }

    public void ALLATORIxDEMO(iiIIiiiiIiiII pos) {
        this.iIiIiiiiIiIii = pos;
        this.IiIIIiiiiIiiI = this.ALLATORIxDEMO();
        this.iiIiiiiiiiIii = this.IiIIIiiiiIiiI + this.iIiiIiiiiiiII;
    }

    public iiIIiiiiIiiII(int row, int col, boolean lvl) {
        this.ALLATORIxDEMO = row;
        this.IIiiIiiiIIiIi = col;
        this.IiiiiiiiIIIII = lvl;
    }

    private /* synthetic */ int ALLATORIxDEMO() {
        if (this.iIiIiiiiIiIii == null) {
            return 0;
        }
        if (this.iIiIiiiiIiIii.ALLATORIxDEMO != this.ALLATORIxDEMO && this.iIiIiiiiIiIii.IIiiIiiiIIiIi != this.IIiiIiiiIIiIi) {
            return 14 + this.iIiIiiiiIiIii.IiIIIiiiiIiiI;
        }
        if (this.iIiIiiiiIiIii.ALLATORIxDEMO != this.ALLATORIxDEMO) return 10 + this.iIiIiiiiIiIii.IiIIIiiiiIiiI;
        if (this.iIiIiiiiIiIii.IIiiIiiiIIiIi == this.IIiiIiiiIIiIi) return 0 + this.iIiIiiiiIiIii.IiIIIiiiiIiiI;
        return 10 + this.iIiIiiiiIiIii.IiIIIiiiiIiiI;
    }
}
