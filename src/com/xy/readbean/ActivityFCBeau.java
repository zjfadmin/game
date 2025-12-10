/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.readbean.BWDHRule
 *  com.xy.v.iiIiiiiiIIiii
 */
package com.xy.readbean;

import com.xy.readbean.BWDHRule;
import com.xy.v.iiIiiiiiIIiii;
import java.awt.Point;

public class ActivityFCBeau {
    private long cycleTime;
    private Point pointTime;

    public ActivityFCBeau iIiIiiiiIIiii(String value) {
        int IiiiiiiiIIIII = value.indexOf("#");
        this.pointTime = new Point();
        this.pointTime.x = BWDHRule.ALLATORIxDEMO((String)value, (int)0, (int)IiiiiiiiIIIII);
        this.pointTime.y = BWDHRule.ALLATORIxDEMO((String)value, (int)(IiiiiiiiIIIII + 1), (int)value.length());
        return this;
    }

    public ActivityFCBeau ALLATORIxDEMO(String value) {
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII2 < value.length()) {
            String IiiiiiiiIIIII4;
            IiiiiiiiIIIII2 = value.indexOf("|", IiiiiiiiIIIII + 1);
            if (IiiiiiiiIIIII2 == -1) {
                IiiiiiiiIIIII2 = value.length();
            }
            if ((IiiiiiiiIIIII3 = value.indexOf("=", IiiiiiiiIIIII + 1)) == -1 || IiiiiiiiIIIII3 > IiiiiiiiIIIII2) {
                IiiiiiiiIIIII3 = IiiiiiiiIIIII2;
            }
            if ((IiiiiiiiIIIII4 = value.substring(IiiiiiiiIIIII, IiiiiiiiIIIII3)).equals("\u65f6\u95f4\u5468\u671f")) {
                this.cycleTime = BWDHRule.ALLATORIxDEMO((String)value, (int)(IiiiiiiiIIIII3 + 1), (int)IiiiiiiiIIIII2);
            } else if (IiiiiiiiIIIII4.equals("\u62a2\u9753\u53f7\u65f6\u95f4")) {
                IiiiiiiiIIIII = IiiiiiiiIIIII3 + 1;
                if ((IiiiiiiiIIIII3 = value.indexOf("#", IiiiiiiiIIIII + 1)) == -1 || IiiiiiiiIIIII3 > IiiiiiiiIIIII2) {
                    IiiiiiiiIIIII3 = IiiiiiiiIIIII2;
                }
                this.pointTime = new Point();
                this.pointTime.x = BWDHRule.ALLATORIxDEMO((String)value, (int)IiiiiiiiIIIII, (int)IiiiiiiiIIIII3);
                this.pointTime.y = BWDHRule.ALLATORIxDEMO((String)value, (int)(IiiiiiiiIIIII3 + 1), (int)IiiiiiiiIIIII2);
            }
            IiiiiiiiIIIII = IiiiiiiiIIIII2 + 1;
        }
        return this;
    }

    public long getCycleTime() {
        return this.cycleTime;
    }

    public static void main(String[] stringArray) {
        System.out.println("\n################################################\n#                                              #\n#        ## #   #    ## ### ### ##  ###        #\n#       # # #   #   # #  #  # # # #  #         #\n#       ### #   #   ###  #  # # ##   #         #\n#       # # ### ### # #  #  ### # # ###        #\n#                                              #\n# Obfuscation by Allatori Obfuscator v7.7 DEMO #\n#                                              #\n#           http://www.allatori.com            #\n#                                              #\n################################################\n");
        System.out.println(iiIiiiiiIIiii.ALLATORIxDEMO().toJson(new ActivityFCBeau().ALLATORIxDEMO("\u65f6\u95f4\u5468\u671f=7\u5929|\u62a2\u9753\u53f7\u65f6\u95f4=5\u592920\u65f6#5\u592922\u65f6")));
        System.out.println(iiIiiiiiIIiii.ALLATORIxDEMO().toJson(new ActivityFCBeau().iIiIiiiiIIiii("1315\u592920\u65f6#1315\u592922\u65f6")));
    }

    public Point getPointTime() {
        return this.pointTime;
    }
}
