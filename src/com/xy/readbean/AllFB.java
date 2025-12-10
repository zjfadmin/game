/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.readbean.FB
 */
package com.xy.readbean;

import com.xy.readbean.FB;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AllFB {
    private Map<String, FB> allFB;

    public FB getFB(String fbName) {
        for (FB IiiiiiiiIIIII : this.allFB.values()) {
            if (IiiiiiiiIIIII.getFbName().equals(fbName)) return IiiiiiiiIIIII;
        }
        return null;
    }

    public Map<String, FB> getAllFB() {
        return this.allFB;
    }

    public void setAllFB(Map<String, FB> allFB) {
        this.allFB = allFB;
    }

    public List<FB> getList() {
        ArrayList<FB> IiiiiiiiIIIII = new ArrayList<FB>();
        block0: for (FB IiiiiiiiIIIII2 : this.allFB.values()) {
            int IiiiiiiiIIIII3 = 0;
            while (IiiiiiiiIIIII3 < IiiiiiiiIIIII.size()) {
                if (((FB)IiiiiiiiIIIII.get(IiiiiiiiIIIII3)).getFbId() < IiiiiiiiIIIII2.getFbId()) {
                    ++IiiiiiiiIIIII3;
                    continue;
                }
                IiiiiiiiIIIII.add(IiiiiiiiIIIII3, IiiiiiiiIIIII2);
                continue block0;
            }
            IiiiiiiiIIIII.add(IiiiiiiiIIIII2);
        }
        return IiiiiiiiIIIII;
    }
}
