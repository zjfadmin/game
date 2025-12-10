/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.n.IIIIIiiiIiIii
 *  com.xy.n.IIIiiiiiIiIiI
 */
package com.xy.n;

import com.xy.n.IIIIIiiiIiIii;
import com.xy.n.IIIiiiiiIiIiI;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis ignored.
 */
static class IiiiIiiiiIiIi {
    private int iIiiIiiiiiiII;
    private IIIIIiiiIiIii IIiiIiiiIIiIi;
    private int iIiIiiiiIiIii;
    private int IiIIIiiiiIiiI;
    private transient IiiiIiiiiIiIi iiIiiiiiiiIii;
    private int IiiiiiiiIIIII;
    private int ALLATORIxDEMO;

    static /* synthetic */ IiiiIiiiiIiIi ALLATORIxDEMO(IiiiIiiiiIiIi arg0) {
        return arg0.iiIiiiiiiiIii;
    }

    static /* synthetic */ IIIIIiiiIiIii ALLATORIxDEMO(IiiiIiiiiIiIi arg0) {
        return arg0.IIiiIiiiIIiIi;
    }

    static /* synthetic */ int IiiIiiiiiiIiI(IiiiIiiiiIiIi arg0) {
        return arg0.iIiIiiiiIiIii;
    }

    static /* synthetic */ int iIiIiiiiIIiIi(IiiiIiiiiIiIi arg0) {
        return arg0.IiIIIiiiiIiiI;
    }

    public IiiiIiiiiIiIi(int map, int x, int y, int z) {
        this.IiIIIiiiiIiiI = map;
        this.ALLATORIxDEMO = x;
        this.IiiiiiiiIIIII = y;
        this.iIiiIiiiiiiII = z;
    }

    static /* synthetic */ int iiiIiiiiiiIIi(IiiiIiiiiIiIi arg0) {
        return arg0.IiiiiiiiIIIII;
    }

    public boolean iIiIiiiiIIiii(int map) {
        if (this.IIiiIiiiIIiIi == null) {
            return false;
        }
        if (this.IIiiIiiiIIiIi.IIiiIiiiIIiIi == map) {
            return true;
        }
        if (this.iiIiiiiiiiIii == null) return false;
        return this.iiIiiiiiiiIii.iIiIiiiiIIiii(map);
    }

    public IiiiIiiiiIiIi(IIIIIiiiIiIii mapPathDoor, IiiiIiiiiIiIi pos) {
        this.IIiiIiiiIIiIi = mapPathDoor;
        this.IiIIIiiiiIiiI = mapPathDoor.IIIiiiiiiIIiI();
        this.ALLATORIxDEMO = mapPathDoor.ALLATORIxDEMO();
        this.IiiiiiiiIIIII = mapPathDoor.IIiiIiiiiIiII();
        this.iIiiIiiiiiiII = mapPathDoor.iiiIiiiiiiIIi();
        this.iiIiiiiiiiIii = pos;
        if (mapPathDoor.iiiiiiiiIIiii() == 2) {
            this.iIiIiiiiIiIii = pos.iIiIiiiiIiIii;
            return;
        }
        this.iIiIiiiiIiIii = pos.iIiIiiiiIiIii + IIIiiiiiIiIiI.iIiIiiiiIIiii((int)pos.ALLATORIxDEMO, (int)pos.IiiiiiiiIIIII, (int)mapPathDoor.IiiiiiiiIIIII, (int)mapPathDoor.iiiiIiiiIiiII) + 10000;
    }

    static /* synthetic */ int iIiIiiiiIIiii(IiiiIiiiiIiIi arg0) {
        return arg0.iIiiIiiiiiiII;
    }

    public IiiiIiiiiIiIi ALLATORIxDEMO() {
        if (this.IIiiIiiiIIiIi == null) return this;
        return new IiiiIiiiiIiIi(this.IIiiIiiiIIiIi.IIiiIiiiIIiIi, this.IIiiIiiiIIiIi.IiiiiiiiIIIII, this.IIiiIiiiIIiIi.iiiiIiiiIiiII, this.IIiiIiiiIIiIi.iIiiIiiiiiiII);
    }

    static /* synthetic */ int ALLATORIxDEMO(IiiiIiiiiIiIi arg0) {
        return arg0.ALLATORIxDEMO;
    }

    public boolean ALLATORIxDEMO(int doorId) {
        if (this.IIiiIiiiIIiIi == null) return false;
        if (doorId == 0) {
            return false;
        }
        if (this.IIiiIiiiIIiIi.IiiIiiiiiiIiI() == doorId) {
            return true;
        }
        if (this.iiIiiiiiiiIii == null) return false;
        return this.iiIiiiiiiiIii.ALLATORIxDEMO(doorId);
    }

    public IiiiIiiiiIiIi(int map, int x, int y, int z, IiiiIiiiiIiIi pos) {
        this.IiIIIiiiiIiiI = map;
        this.ALLATORIxDEMO = x;
        this.IiiiiiiiIIIII = y;
        this.iIiiIiiiiiiII = z;
        this.iiIiiiiiiiIii = pos;
        this.iIiIiiiiIiIii = pos.iIiIiiiiIiIii + IIIiiiiiIiIiI.iIiIiiiiIIiii((int)pos.ALLATORIxDEMO, (int)pos.IiiiiiiiIIIII, (int)x, (int)y);
    }

    public int ALLATORIxDEMO() {
        if (this.IIiiIiiiIIiIi == null) return this.IiIIIiiiiIiiI;
        return this.IIiiIiiiIIiIi.IIiiIiiiIIiIi;
    }

    static /* synthetic */ void ALLATORIxDEMO(IiiiIiiiiIiIi arg0, IiiiIiiiiIiIi arg1) {
        arg0.iiIiiiiiiiIii = arg1;
    }

    static /* synthetic */ void ALLATORIxDEMO(IiiiIiiiiIiIi arg0, int arg1) {
        arg0.iIiIiiiiIiIii = arg1;
    }
}
