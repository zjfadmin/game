/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.readbean.Goodstable
 *  com.xy.readbean.StallBuyUnit
 *  com.xy.v.IIiiIiiiiIIiI
 */
package com.xy.readbean;

import com.xy.readbean.Goodstable;
import com.xy.readbean.StallBuyUnit;
import com.xy.v.IIiiIiiiiIIiI;

public class StallBuyData {
    private String name;
    private int id;
    private String text;
    private String skin;
    private String value;
    private transient StallBuyUnit[] units;

    public void setUnits(StallBuyUnit[] units) {
        this.units = units;
    }

    public int getId() {
        return this.id;
    }

    public String getSkin() {
        return this.skin;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return this.name;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getValue() {
        return this.value;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean ALLATORIxDEMO(Goodstable good) {
        if (this.units == null) {
            return false;
        }
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.units.length) {
            StallBuyUnit IiiiiiiiIIIII2 = this.units[IiiiiiiiIIIII];
            int IiiiiiiiIIIII3 = 0;
            if (IiiiiiiiIIIII2.getType() == 1) {
                IiiiiiiiIIIII3 = good.getGoodsid().intValue();
            } else if (IiiiiiiiIIIII2.getType() == 2) {
                IiiiiiiiIIIII3 = good.getType().intValue();
            } else if (IiiiiiiiIIIII2.getKey() != null) {
                IiiiiiiiIIIII3 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)good.getValue(), (String)IiiiiiiiIIIII2.getKey(), (String)"|");
            }
            if (!IiiiiiiiIIIII2.ALLATORIxDEMO(IiiiiiiiIIIII3)) {
                return false;
            }
            ++IiiiiiiiIIIII;
        }
        return true;
    }

    public StallBuyUnit[] getUnits() {
        return this.units;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return this.text;
    }

    public void ALLATORIxDEMO() {
        this.units = new StallBuyUnit[1 + IIiiIiiiiIIiI.ALLATORIxDEMO((char)'|', (String)this.value)];
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.value.length()) {
            IiiiiiiiIIIII3 = this.value.indexOf("|", IiiiiiiiIIIII2 + 1);
            if (IiiiiiiiIIIII3 == -1) {
                IiiiiiiiIIIII3 = this.value.length();
            }
            this.units[IiiiiiiiIIIII] = new StallBuyUnit(this.value, IiiiiiiiIIIII2, IiiiiiiiIIIII3);
            ++IiiiiiiiIIIII;
            IiiiiiiiIIIII2 = IiiiiiiiIIIII3 + 1;
        }
        this.value = null;
    }
}
