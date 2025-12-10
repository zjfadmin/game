/*
 * Decompiled with CFR 0.152.
 */
package com.xy.bean;

public class BeauBean {
    private int lvl;
    private int beau;
    private int skin;

    public int getLvl() {
        return this.lvl;
    }

    public BeauBean(String data, int index, int indexFlag) {
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < indexFlag) {
            IiiiiiiiIIIII2 = data.indexOf(",", index + 1);
            if (IiiiiiiiIIIII2 == -1 || IiiiiiiiIIIII2 > indexFlag) {
                IiiiiiiiIIIII2 = indexFlag;
            }
            if (IiiiiiiiIIIII == 0) {
                this.lvl = Integer.parseInt(data.substring(index, IiiiiiiiIIIII2));
            } else if (IiiiiiiiIIIII == 1) {
                this.beau = Integer.parseInt(data.substring(index, IiiiiiiiIIIII2));
            } else if (IiiiiiiiIIIII == 2) {
                this.skin = Integer.parseInt(data.substring(index, IiiiiiiiIIIII2));
            }
            ++IiiiiiiiIIIII;
            index = IiiiiiiiIIIII2 + 1;
        }
    }

    public String toString() {
        return String.valueOf(this.lvl) + "," + this.beau + "," + this.skin;
    }

    public void setBeau(int beau) {
        this.beau = beau;
    }

    public BeauBean() {
    }

    public boolean ALLATORIxDEMO() {
        if (this.lvl != 1) return true;
        if (this.skin != 0) return true;
        return false;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public BeauBean(String data) {
        this(data, 0, data.length());
    }

    public int getBeau() {
        return this.beau;
    }

    public void setSkin(int skin) {
        this.skin = skin;
    }

    public int getSkin() {
        return this.skin;
    }
}
