/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.readbean.Goodstable
 *  com.xy.scene.BWDHRuleBattleRecord
 *  com.xy.scene.BWDHTeam
 */
package com.xy.v;

import com.xy.readbean.Goodstable;
import com.xy.scene.BWDHRuleBattleRecord;
import com.xy.scene.BWDHTeam;
import java.util.Comparator;

public class IIIiiiiiiiiIi
implements Comparator<Goodstable> {
    public static IIIiiiiiiiiIi ALLATORIxDEMO = new IIIiiiiiiiiIi();

    public int ALLATORIxDEMO(Goodstable o1, Goodstable o2) {
        int IiiiiiiiIIIII = o1.getType().compareTo(o2.getType());
        if (IiiiiiiiIIIII > 0) {
            return 1;
        }
        if (IiiiiiiiIIIII < 0) {
            return -1;
        }
        IiiiiiiiIIIII = o1.getGoodsid().compareTo(o2.getGoodsid());
        if (IiiiiiiiIIIII > 0) {
            return 1;
        }
        if (IiiiiiiiIIIII >= 0) return 0;
        return -1;
    }

    public static void ALLATORIxDEMO(BWDHRuleBattleRecord[] records) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < records.length) {
            BWDHRuleBattleRecord IiiiiiiiIIIII2 = records[IiiiiiiiIIIII];
            int IiiiiiiiIIIII3 = records.length - 1;
            while (IiiiiiiiIIIII3 > IiiiiiiiIIIII) {
                BWDHRuleBattleRecord IiiiiiiiIIIII4 = records[IiiiiiiiIIIII3];
                if (IiiiiiiiIIIII2.getId() <= IiiiiiiiIIIII4.getId()) {
                    records[IiiiiiiiIIIII3] = IiiiiiiiIIIII2;
                    records[IiiiiiiiIIIII] = IiiiiiiiIIIII4;
                    IiiiiiiiIIIII2 = IiiiiiiiIIIII4;
                }
                --IiiiiiiiIIIII3;
            }
            ++IiiiiiiiIIIII;
        }
    }

    public static void ALLATORIxDEMO(BWDHTeam[] teams) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < teams.length) {
            BWDHTeam IiiiiiiiIIIII2 = teams[IiiiiiiiIIIII];
            int IiiiiiiiIIIII3 = teams.length - 1;
            while (IiiiiiiiIIIII3 > IiiiiiiiIIIII) {
                block4: {
                    BWDHTeam IiiiiiiiIIIII4;
                    block5: {
                        IiiiiiiiIIIII4 = teams[IiiiiiiiIIIII3];
                        if (IiiiiiiiIIIII2.getData2()[0] > IiiiiiiiIIIII4.getData2()[0]) break block4;
                        if (IiiiiiiiIIIII2.getData2()[0] != IiiiiiiiIIIII4.getData2()[0]) break block5;
                        double IiiiiiiiIIIII5 = IiiiiiiiIIIII2.getData2()[4] + IiiiiiiiIIIII2.getData2()[5];
                        double IiiiiiiiIIIII6 = IiiiiiiiIIIII4.getData2()[4] + IiiiiiiiIIIII4.getData2()[5];
                        if ((IiiiiiiiIIIII5 /= (double)Math.max(1, IiiiiiiiIIIII2.getData2()[1] + IiiiiiiiIIIII2.getData2()[2])) > (IiiiiiiiIIIII6 /= (double)Math.max(1, IiiiiiiiIIIII4.getData2()[1] + IiiiiiiiIIIII4.getData2()[2])) || IiiiiiiiIIIII5 == IiiiiiiiIIIII6 && IiiiiiiiIIIII2.getId() < IiiiiiiiIIIII4.getId()) break block4;
                    }
                    teams[IiiiiiiiIIIII3] = IiiiiiiiIIIII2;
                    teams[IiiiiiiiIIIII] = IiiiiiiiIIIII4;
                    IiiiiiiiIIIII2 = IiiiiiiiIIIII4;
                }
                --IiiiiiiiIIIII3;
            }
            ++IiiiiiiiIIIII;
        }
    }
}
