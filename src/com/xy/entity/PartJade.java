/*
 * Decompiled with CFR 0.152.
 */
package com.xy.entity;

public class PartJade {
    private int jade3;
    private long suitid;
    private int jade4;
    private int jade1;
    private int partId;
    private int jade5;
    private int jade2;

    public void setJade(int pz, int sum) {
        switch (pz) {
            case 1: {
                this.jade1 += sum;
                return;
            }
            case 2: {
                this.jade2 += sum;
                return;
            }
            case 3: {
                this.jade3 += sum;
                return;
            }
            case 4: {
                this.jade4 += sum;
                return;
            }
            case 5: {
                this.jade5 += sum;
                break;
            }
        }
    }

    public void setJade3(int jade3) {
        this.jade3 = jade3;
    }

    public void setJade4(int jade4) {
        this.jade4 = jade4;
    }

    public long getSuitid() {
        return this.suitid;
    }

    public int getJade(int pz) {
        int IiiiiiiiIIIII = 0;
        switch (pz) {
            case 1: {
                IiiiiiiiIIIII = this.jade1;
                return IiiiiiiiIIIII;
            }
            case 2: {
                IiiiiiiiIIIII = this.jade2;
                return IiiiiiiiIIIII;
            }
            case 3: {
                IiiiiiiiIIIII = this.jade3;
                return IiiiiiiiIIIII;
            }
            case 4: {
                IiiiiiiiIIIII = this.jade4;
                return IiiiiiiiIIIII;
            }
            case 5: {
                IiiiiiiiIIIII = this.jade5;
                break;
            }
        }
        return IiiiiiiiIIIII;
    }

    public boolean ALLATORIxDEMO() {
        if (this.jade1 > 0) return false;
        if (this.jade2 > 0) return false;
        if (this.jade3 > 0) return false;
        if (this.jade4 > 0) return false;
        if (this.jade5 <= 0) return true;
        return false;
    }

    public void ALLATORIxDEMO(int pz, int sum) {
        switch (pz) {
            case 1: {
                this.jade1 -= sum;
                if (this.jade1 >= 0) return;
                this.jade1 = 0;
                return;
            }
            case 2: {
                this.jade2 -= sum;
                if (this.jade2 >= 0) return;
                this.jade2 = 0;
                return;
            }
            case 3: {
                this.jade3 -= sum;
                if (this.jade3 >= 0) return;
                this.jade3 = 0;
                return;
            }
            case 4: {
                this.jade4 -= sum;
                if (this.jade4 >= 0) return;
                this.jade4 = 0;
                return;
            }
            case 5: {
                this.jade5 -= sum;
                if (this.jade5 >= 0) return;
                this.jade5 = 0;
                break;
            }
        }
    }

    public int getJade5() {
        return this.jade5;
    }

    public void setJade2(int jade2) {
        this.jade2 = jade2;
    }

    public PartJade(long suitid, int partId) {
        this.suitid = suitid;
        this.partId = partId;
    }

    public int getJade1() {
        return this.jade1;
    }

    public void setJade1(int jade1) {
        this.jade1 = jade1;
    }

    public int getJade2() {
        return this.jade2;
    }

    public int getPartId() {
        return this.partId;
    }

    public void ALLATORIxDEMO(PartJade partJade) {
        this.suitid = partJade.suitid;
        this.partId = partJade.partId;
        this.jade1 = partJade.jade1;
        this.jade2 = partJade.jade2;
        this.jade3 = partJade.jade3;
        this.jade4 = partJade.jade4;
        this.jade5 = partJade.jade5;
    }

    public int getJade3() {
        return this.jade3;
    }

    public void setPartId(int partId) {
        this.partId = partId;
    }

    public int getJade4() {
        return this.jade4;
    }

    /*
     * WARNING - void declaration
     */
    public String toString() {
        void IiiiiiiiIIIII;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.partId);
        stringBuffer.append("_");
        IiiiiiiiIIIII.append(this.jade1);
        IiiiiiiiIIIII.append("_");
        IiiiiiiiIIIII.append(this.jade2);
        IiiiiiiiIIIII.append("_");
        IiiiiiiiIIIII.append(this.jade3);
        IiiiiiiiIIIII.append("_");
        IiiiiiiiIIIII.append(this.jade4);
        IiiiiiiiIIIII.append("_");
        IiiiiiiiIIIII.append(this.jade5);
        return IiiiiiiiIIIII.toString();
    }

    public void setJade5(int jade5) {
        this.jade5 = jade5;
    }

    public void setSuitid(long suitid) {
        this.suitid = suitid;
    }

    public void ALLATORIxDEMO(String[] jades) {
        this.jade1 = Integer.parseInt(jades[1]);
        this.jade2 = Integer.parseInt(jades[2]);
        this.jade3 = Integer.parseInt(jades[3]);
        this.jade4 = Integer.parseInt(jades[4]);
        this.jade5 = Integer.parseInt(jades[5]);
    }
}
