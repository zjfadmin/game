/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.formula.BaseMountSkill
 *  com.xy.formula.BaseValue
 *  com.xy.v.IIiiIiiiiIIiI
 */
package com.xy.formula;

import com.xy.formula.BaseMountSkill;
import com.xy.formula.BaseValue;
import com.xy.v.IIiiIiiiiIIiI;
import java.awt.Point;

public class BaseMountSH {
    private int exp;
    private int lvl;
    private int id;
    public static String[] SH_HEAD_NAME = new String[]{"\u4e2d\u5929", "\u9752\u9f99", "\u767d\u864e", "\u6731\u96c0", "\u7384\u6b66"};
    private int unlock;
    public static String[] SH_HEAD_DATA = new String[]{"MZ", "MA", "MB", "MC", "MD"};
    private BaseMountSkill[] mounts;
    public static String[] SH_HEAD_SHS = new String[]{"ma", "mb", "mc", "md", "me", "mf", "mg"};
    private Point point;

    public void setUnlock(int unlock) {
        this.unlock = unlock;
    }

    public int getGZ(int index) {
        if (this.id == 0) {
            return this.mounts[index].getB1();
        }
        if (index != 0) return this.point.y;
        return this.point.x;
    }

    public Point getPoint() {
        return this.point;
    }

    /*
     * Unable to fully structure code
     */
    public int ALLATORIxDEMO(int mountId) {
        block3: {
            if (this.id != 0) break block3;
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl13
        }
        if (this.point.x == mountId) {
            return 1;
        }
        if (this.point.y != mountId) return 0;
        return 2;
        do {
            if (this.mounts[IiiiiiiiIIIII].getB1() == mountId) {
                return IiiiiiiiIIIII + 1;
            }
            ++IiiiiiiiIIIII;
lbl13:
            // 2 sources

        } while (IiiiiiiiIIIII < this.mounts.length);
        return 0;
    }

    public int getId() {
        return this.id;
    }

    public String toString() {
        return String.valueOf(this.lvl) + "#" + this.exp + "#" + this.unlock;
    }

    public int getUnlock() {
        return this.unlock;
    }

    public int getLYJTotal() {
        if (this.id != 0) return BaseValue.getSHLYJBySX((int)this.lvl);
        return BaseValue.getSHLYJByZT((int)this.lvl);
    }

    public void ALLATORIxDEMO(String data, int index, int indexFlag) {
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < indexFlag) {
            IiiiiiiiIIIII2 = data.indexOf(",", index + 1);
            if (IiiiiiiiIIIII2 == -1 || IiiiiiiiIIIII2 > indexFlag) {
                IiiiiiiiIIIII2 = indexFlag;
            }
            if (this.id == 0) {
                this.mounts[IiiiiiiiIIIII].setB1(IIiiIiiiiIIiI.ALLATORIxDEMO((String)data, (int)index, (int)IiiiiiiiIIIII2));
            } else {
                BaseMountSH baseMountSH = this;
                if (IiiiiiiiIIIII == 0) {
                    baseMountSH.point.x = IIiiIiiiiIIiI.ALLATORIxDEMO((String)data, (int)index, (int)IiiiiiiiIIIII2);
                } else {
                    baseMountSH.point.y = IIiiIiiiiIIiI.ALLATORIxDEMO((String)data, (int)index, (int)IiiiiiiiIIIII2);
                }
            }
            ++IiiiiiiiIIIII;
            index = IiiiiiiiIIIII2 + 1;
        }
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public int getExp() {
        return this.exp;
    }

    public void setGZ(int index, int id) {
        if (this.id == 0) {
            this.mounts[index].setB1(id);
            return;
        }
        if (index == 0) {
            this.point.x = id;
            return;
        }
        this.point.y = id;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getLvl() {
        return this.lvl;
    }

    public BaseMountSkill[] getMounts() {
        return this.mounts;
    }

    /*
     * Unable to fully structure code
     */
    public BaseMountSH(int id, String data) {
        block12: {
            block11: {
                super();
                this.id = id;
                if (id != 0) break block11;
                this.mounts = new BaseMountSkill[7];
                IiiiiiiiIIIII = 0;
                if (true) ** GOTO lbl12
            }
            this.point = new Point();
            break block12;
            do {
                this.mounts[IiiiiiiiIIIII++] = new BaseMountSkill();
lbl12:
                // 2 sources

            } while (IiiiiiiiIIIII < this.mounts.length);
        }
        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)data)) {
            this.unlock = id == 0 ? 0 : 1;
            return;
        }
        IiiiiiiiIIIII = 0;
        IiiiiiiiIIIII = 0;
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < data.length()) {
            IiiiiiiiIIIII = data.indexOf("#", IiiiiiiiIIIII + 1);
            if (IiiiiiiiIIIII == -1) {
                IiiiiiiiIIIII = data.length();
            }
            if (IiiiiiiiIIIII == 0) {
                this.lvl = IIiiIiiiiIIiI.ALLATORIxDEMO((String)data, (int)IiiiiiiiIIIII, (int)IiiiiiiiIIIII);
            } else if (IiiiiiiiIIIII == 1) {
                this.exp = IIiiIiiiiIIiI.ALLATORIxDEMO((String)data, (int)IiiiiiiiIIIII, (int)IiiiiiiiIIIII);
            } else if (IiiiiiiiIIIII == 2) {
                this.unlock = IIiiIiiiiIIiI.ALLATORIxDEMO((String)data, (int)IiiiiiiiIIIII, (int)IiiiiiiiIIIII);
            } else if (IiiiiiiiIIIII == 3) {
                this.ALLATORIxDEMO(data, IiiiiiiiIIIII, IiiiiiiiIIIII);
            }
            ++IiiiiiiiIIIII;
            IiiiiiiiIIIII = IiiiiiiiIIIII + 1;
        }
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMounts(BaseMountSkill[] mounts) {
        this.mounts = mounts;
    }

    public void ALLATORIxDEMO(int index, String data) {
        this.mounts[index].ALLATORIxDEMO(data);
    }

    public int getExpTotal() {
        if (this.id != 0) return BaseValue.getSHExpBySX((int)this.lvl);
        return BaseValue.getSHExpByZT((int)this.lvl);
    }
}
