/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.readbean.StallBuyData
 *  com.xy.readbean.StallBuyMenu
 */
package com.xy.a.i;

import com.xy.readbean.StallBuyData;
import com.xy.readbean.StallBuyMenu;
import javax.swing.tree.DefaultMutableTreeNode;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IiIIIiiiiIIiI
extends DefaultMutableTreeNode {
    private StallBuyMenu IiiiiiiiIIIII;
    private StallBuyData ALLATORIxDEMO;

    public IiIIIiiiiIIiI(StallBuyData buyData) {
        this.ALLATORIxDEMO = buyData;
        this.setUserObject(buyData.getName());
    }

    public StallBuyData ALLATORIxDEMO() {
        return this.ALLATORIxDEMO;
    }

    public void ALLATORIxDEMO(StallBuyMenu buyMenu) {
        this.IiiiiiiiIIIII = buyMenu;
    }

    public IiIIIiiiiIIiI(StallBuyMenu buyMenu) {
        this.IiiiiiiiIIIII = buyMenu;
        this.setUserObject(buyMenu.getKey());
    }

    public void ALLATORIxDEMO(StallBuyData buyData) {
        this.ALLATORIxDEMO = buyData;
    }

    public StallBuyMenu ALLATORIxDEMO() {
        return this.IiiiiiiiIIIII;
    }
}
