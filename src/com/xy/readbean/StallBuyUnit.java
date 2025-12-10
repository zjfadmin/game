/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.v.IIiiIiiiiIIiI
 */
package com.xy.readbean;

import com.xy.v.IIiiIiiiiIIiI;
import java.awt.Point;

public class StallBuyUnit {
    private String key;
    private int type;
    private Point[] points;

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getType() {
        return this.type;
    }

    public Point[] getPoints() {
        return this.points;
    }

    public void setPoints(Point[] points) {
        this.points = points;
    }

    public boolean ALLATORIxDEMO(int id) {
        if (this.points == null) {
            return false;
        }
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.points.length) {
            if (id >= this.points[IiiiiiiiIIIII].x && id <= this.points[IiiiiiiiIIIII].y) {
                return true;
            }
            ++IiiiiiiiIIIII;
        }
        return false;
    }

    public void setType(int type) {
        this.type = type;
    }

    /*
     * WARNING - void declaration
     */
    public StallBuyUnit(String string, int n, int n2) {
        void data;
        void indexFlag;
        int index;
        int IiiiiiiiIIIII = string.indexOf("=", (int)(index + true));
        if (IiiiiiiiIIIII == -1 || IiiiiiiiIIIII > indexFlag) {
            IiiiiiiiIIIII = indexFlag;
        }
        this.key = data.substring(index, IiiiiiiiIIIII);
        if (this.key.equals("\u7269\u54c1ID")) {
            this.key = null;
            this.type = 1;
        } else if (this.key.equals("\u7269\u54c1\u7c7b\u578b")) {
            this.key = null;
            this.type = 2;
        } else {
            this.key = String.valueOf(this.key) + "=";
        }
        index = IiiiiiiiIIIII + 1;
        this.points = new Point[1 + IIiiIiiiiIIiI.ALLATORIxDEMO((char)'#', (String)data, (int)index, (int)indexFlag)];
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII < indexFlag) {
            IiiiiiiiIIIII = data.indexOf("#", index + 1);
            if (IiiiiiiiIIIII == -1 || IiiiiiiiIIIII > indexFlag) {
                IiiiiiiiIIIII = indexFlag;
            }
            if ((IiiiiiiiIIIII3 = data.indexOf("-", index + 1)) == -1 || IiiiiiiiIIIII3 > IiiiiiiiIIIII) {
                IiiiiiiiIIIII3 = IiiiiiiiIIIII;
            }
            this.points[IiiiiiiiIIIII2] = new Point();
            this.points[IiiiiiiiIIIII2].x = IIiiIiiiiIIiI.ALLATORIxDEMO((String)data, (int)index, (int)IiiiiiiiIIIII3);
            this.points[IiiiiiiiIIIII2].y = IiiiiiiiIIIII3 < IiiiiiiiIIIII ? IIiiIiiiiIIiI.ALLATORIxDEMO((String)data, (int)(IiiiiiiiIIIII3 + 1), (int)IiiiiiiiIIIII) : this.points[IiiiiiiiIIIII2].x;
            ++IiiiiiiiIIIII2;
            index = IiiiiiiiIIIII + 1;
        }
    }
}
