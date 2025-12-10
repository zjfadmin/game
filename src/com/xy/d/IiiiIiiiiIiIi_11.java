/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.d.IiIiIiiiiIIiI
 *  com.xy.d.iiIiIiiiiIiii
 *  com.xy.d.iiiiiiiiiiIiI
 */
package com.xy.d;

import com.xy.d.IiIiIiiiiIIiI;
import com.xy.d.iiIiIiiiiIiii;
import com.xy.d.iiiiiiiiiiIiI;
import java.util.ArrayList;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IiiiIiiiiIiIi {
    /*
     * WARNING - void declaration
     */
    public static int iIiIiiiiIIiii(ArrayList<iiiiiiiiiiIiI> list, int low, int high) {
        iiiiiiiiiiIiI IiiiiiiiIIIII = list.get(high);
        int IiiiiiiiIIIII2 = low;
        int IiiiiiiiIIIII3 = low;
        while (IiiiiiiiIIIII3 < high) {
            if (IiiiIiiiiIiIi.ALLATORIxDEMO(IiiiiiiiIIIII, list.get(IiiiiiiiIIIII3)) != -1) {
                void IiiiiiiiIIIII4;
                iiiiiiiiiiIiI iiiiiiiiiiIiI2 = list.get(IiiiiiiiIIIII3);
                list.set(IiiiiiiiIIIII3, list.get(IiiiiiiiIIIII2));
                list.set(IiiiiiiiIIIII2++, (iiiiiiiiiiIiI)IiiiiiiiIIIII4);
            }
            ++IiiiiiiiIIIII3;
        }
        list.set(high, list.get(IiiiiiiiIIIII2));
        list.set(IiiiiiiiIIIII2, IiiiiiiiIIIII);
        return IiiiiiiiIIIII2;
    }

    /*
     * WARNING - void declaration
     */
    public static int ALLATORIxDEMO(ArrayList<IiIiIiiiiIIiI> list, int low, int high) {
        IiIiIiiiiIIiI IiiiiiiiIIIII = list.get(high);
        int IiiiiiiiIIIII2 = low;
        int IiiiiiiiIIIII3 = low;
        while (IiiiiiiiIIIII3 < high) {
            if (IiiiIiiiiIiIi.ALLATORIxDEMO(IiiiiiiiIIIII, list.get(IiiiiiiiIIIII3)) != -1) {
                void IiiiiiiiIIIII4;
                IiIiIiiiiIIiI iiIiIiiiiIIiI = list.get(IiiiiiiiIIIII3);
                list.set(IiiiiiiiIIIII3, list.get(IiiiiiiiIIIII2));
                list.set(IiiiiiiiIIIII2++, (IiIiIiiiiIIiI)IiiiiiiiIIIII4);
            }
            ++IiiiiiiiIIIII3;
        }
        list.set(high, list.get(IiiiiiiiIIIII2));
        list.set(IiiiiiiiIIIII2, IiiiiiiiIIIII);
        return IiiiiiiiIIIII2;
    }

    public static void iIiIiiiiIIiii(ArrayList<iiiiiiiiiiIiI> list, int low, int high) {
        if (low >= high) return;
        int IiiiiiiiIIIII = IiiiIiiiiIiIi.iIiIiiiiIIiii(list, low, high);
        IiiiIiiiiIiIi.iIiIiiiiIIiii(list, low, IiiiiiiiIIIII - 1);
        IiiiIiiiiIiIi.iIiIiiiiIIiii(list, IiiiiiiiIIIII + 1, high);
    }

    public static int ALLATORIxDEMO(IiIiIiiiiIIiI o1, IiIiIiiiiIIiI o2) {
        if (o2.iIiiIiiiIiIIi == o1.iIiiIiiiIiIIi) {
            return o1.ALLATORIxDEMO((iiiiiiiiiiIiI)o2);
        }
        if (o1.iIiiIiiiIiIIi <= o2.iIiiIiiiIiIIi) return -1;
        return 1;
    }

    public static int ALLATORIxDEMO(iiiiiiiiiiIiI o1, iiiiiiiiiiIiI o2) {
        if (o2.IIiiiiiiiIIIi != o1.IIiiiiiiiIIIi) {
            if (o1.IIiiiiiiiIIIi <= o2.IIiiiiiiiIIIi) return -1;
            return 1;
        }
        if (o1 instanceof iiIiIiiiiIiii) {
            if (!(o2 instanceof iiIiIiiiiIiii)) return -1;
            return o1.ALLATORIxDEMO(o2);
        }
        if (!(o2 instanceof iiIiIiiiiIiii)) return o1.ALLATORIxDEMO(o2);
        return 1;
    }

    public static void ALLATORIxDEMO(ArrayList<IiIiIiiiiIIiI> list, int low, int high) {
        if (low >= high) return;
        int IiiiiiiiIIIII = IiiiIiiiiIiIi.ALLATORIxDEMO(list, low, high);
        IiiiIiiiiIiIi.ALLATORIxDEMO(list, low, IiiiiiiiIIIII - 1);
        IiiiIiiiiIiIi.ALLATORIxDEMO(list, IiiiiiiiIIIII + 1, high);
    }
}
