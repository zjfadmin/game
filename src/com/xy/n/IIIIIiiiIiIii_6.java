/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.readbean.Door
 *  com.xy.readbean.GoodFight
 *  com.xy.v.IIiiIiiiiIIiI
 */
package com.xy.n;

import com.xy.readbean.Door;
import com.xy.readbean.GoodFight;
import com.xy.v.IIiiIiiiiIIiI;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IIIIIiiiIiIii {
    private int IiIiiiiiIIIII;
    private int iiIiIiiiiIIIi;
    public int iiiiIiiiIiiII;
    private int iiiIiiiiiiiIi;
    public int iIiiIiiiiiiII;
    public int IIiiIiiiIIiIi;
    private int iIiIiiiiIiIii;
    private int IiIIIiiiiIiiI;
    private long iiIiiiiiiiIii;
    public int IiiiiiiiIIIII;
    private int ALLATORIxDEMO;

    public int IIiIIiiiIiIIi() {
        return this.IiiiiiiiIIIII;
    }

    public IIIIIiiiIiIii(int type, long id, Door door) {
        this.ALLATORIxDEMO = type;
        this.iiIiiiiiiiIii = id;
        this.IiIiiiiiIIIII = Integer.parseInt(door.getDoorid());
        int IiiiiiiiIIIII = door.getDoorpoint().indexOf("|");
        this.IiIIIiiiiIiiI = Integer.parseInt(door.getDoormap());
        this.iiIiIiiiiIIIi = IIiiIiiiiIIiI.ALLATORIxDEMO((String)door.getDoorpoint(), (int)0, (int)IiiiiiiiIIIII);
        this.iIiIiiiiIiIii = IIiiIiiiiIIiI.ALLATORIxDEMO((String)door.getDoorpoint(), (int)(IiiiiiiiIIIII + 1), (int)door.getDoorpoint().length());
    }

    public void IIiIIiiiIiIIi(int z) {
        this.iiiIiiiiiiiIi = z;
    }

    public void IIiiIiiiiIiII(int doorId) {
        this.IiIiiiiiIIIII = doorId;
    }

    public int IIiiIiiiiIiII() {
        return this.iIiIiiiiIiIii;
    }

    public void IIIiiiiiiIIiI(int dx) {
        this.IiiiiiiiIIIII = dx;
    }

    public void IIIIIiiiiIIii(int dz) {
        this.iIiiIiiiiiiII = dz;
    }

    public void iiiiiiiiIIiii(int dmap) {
        this.IIiiIiiiIIiIi = dmap;
    }

    public long ALLATORIxDEMO() {
        return this.iiIiiiiiiiIii;
    }

    public int IIIiiiiiiIIiI() {
        return this.IiIIIiiiiIiiI;
    }

    public void IiiIiiiiiiIiI(int y) {
        this.iIiIiiiiIiIii = y;
    }

    public int IIIIIiiiiIIii() {
        return this.iiiiIiiiIiiII;
    }

    public IIIIIiiiIiIii(long id, GoodFight nextFight) {
        this.ALLATORIxDEMO = 2;
        this.iiIiiiiiiiIii = id;
        this.IiIIIiiiiIiiI = nextFight.getMap();
        this.iiIiIiiiiIIIi = nextFight.getX();
        this.iIiIiiiiIiIii = nextFight.getY();
        this.iiiIiiiiiiiIi = 0;
    }

    public void iIiIiiiiIIiIi(int mapId) {
        this.IiIIIiiiiIiiI = mapId;
    }

    public void ALLATORIxDEMO(long id) {
        this.iiIiiiiiiiIii = id;
    }

    public void iiiIiiiiiiIIi(int type) {
        this.ALLATORIxDEMO = type;
    }

    public void iIiIiiiiIIiii(int x) {
        this.iiIiIiiiiIIIi = x;
    }

    public void ALLATORIxDEMO(int dy) {
        this.iiiiIiiiIiiII = dy;
    }

    public int iiiiiiiiIIiii() {
        return this.ALLATORIxDEMO;
    }

    public int IiiIiiiiiiIiI() {
        return this.IiIiiiiiIIIII;
    }

    public int iIiIiiiiIIiIi() {
        return this.IIiiIiiiIIiIi;
    }

    public int iiiIiiiiiiIIi() {
        return this.iiiIiiiiiiiIi;
    }

    public int iIiIiiiiIIiii() {
        return this.iIiiIiiiiiiII;
    }

    public int ALLATORIxDEMO() {
        return this.iiIiIiiiiIIIi;
    }
}
