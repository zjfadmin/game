/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.readbean.AlchemyUnit
 *  com.xy.v.IiiiIiiiiIiIi
 */
package com.xy.readbean;

import com.xy.readbean.AlchemyUnit;
import com.xy.v.IiiiIiiiiIiIi;
import java.util.ArrayList;
import java.util.List;

public class AlchemySet {
    private String type;
    private List<AlchemyUnit> unitList;

    public String toString() {
        StringBuffer IiiiiiiiIIIII = new StringBuffer();
        IiiiiiiiIIIII.append(this.type);
        for (AlchemyUnit IiiiiiiiIIIII2 : this.unitList) {
            IiiiiiiiIIIII.append("|");
            IiiiiiiiIIIII.append(IiiiiiiiIIIII2.getKey());
            IiiiiiiiIIIII.append("#");
            IiiiiiiiIIIII.append(IiiiiiiiIIIII2.getMin());
            IiiiiiiiIIIII.append("#");
            IiiiiiiiIIIII.append(IiiiiiiiIIIII2.getMax());
        }
        return IiiiiiiiIIIII.toString();
    }

    public AlchemyUnit getAlchemyUnit(String key) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.unitList.size()) {
            AlchemyUnit IiiiiiiiIIIII2 = this.unitList.get(IiiiiiiiIIIII);
            if (IiiiiiiiIIIII2.getKey().equals(key)) {
                return IiiiiiiiIIIII2;
            }
            ++IiiiiiiiIIIII;
        }
        return null;
    }

    public AlchemyUnit ALLATORIxDEMO() {
        return this.unitList.get(IiiiIiiiiIiIi.iIiIiiiiIiIii.nextInt(this.unitList.size()));
    }

    public String getType() {
        return this.type;
    }

    /*
     * WARNING - void declaration
     */
    public AlchemySet(String string) {
        void value;
        this.unitList = new ArrayList<AlchemyUnit>();
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < value.length()) {
            IiiiiiiiIIIII3 = value.indexOf("|", IiiiiiiiIIIII2 + 1);
            if (IiiiiiiiIIIII3 == -1) {
                IiiiiiiiIIIII3 = value.length();
            }
            if (IiiiiiiiIIIII == 0) {
                this.type = value.substring(IiiiiiiiIIIII2, IiiiiiiiIIIII3);
            } else {
                this.unitList.add(new AlchemyUnit((String)value, IiiiiiiiIIIII2, IiiiiiiiIIIII3));
            }
            ++IiiiiiiiIIIII;
            IiiiiiiiIIIII2 = IiiiiiiiIIIII3 + 1;
        }
    }

    public void setUnitList(List<AlchemyUnit> unitList) {
        this.unitList = unitList;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<AlchemyUnit> getUnitList() {
        return this.unitList;
    }

    public AlchemySet() {
    }
}
