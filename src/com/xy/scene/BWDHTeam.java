/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.RoleShow
 *  com.xy.v.IIiiIiiiiIIiI
 */
package com.xy.scene;

import com.xy.bean.RoleShow;
import com.xy.v.IIiiIiiiiIIiI;
import java.math.BigDecimal;

public class BWDHTeam {
    private String name;
    private int id;
    private int[] data2;
    private int flag;
    private RoleShow[] roleShows;

    public int ALLATORIxDEMO(BigDecimal roleId) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.roleShows.length) {
            if (IIiiIiiiiIIiI.ALLATORIxDEMO((BigDecimal)this.roleShows[IiiiiiiiIIIII].getRole_id(), (BigDecimal)roleId)) {
                return IiiiiiiiIIIII;
            }
            ++IiiiiiiiIIIII;
        }
        return -1;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFlag() {
        return this.flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int[] getData2() {
        return this.data2;
    }

    public void ALLATORIxDEMO(String data, int index, int indexFlag) {
        int[] IiiiiiiiIIIII = new int[6];
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < indexFlag) {
            IiiiiiiiIIIII3 = data.indexOf("#", index + 1);
            if (IiiiiiiiIIIII3 == -1 || IiiiiiiiIIIII3 > indexFlag) {
                IiiiiiiiIIIII3 = indexFlag;
            }
            if (IiiiiiiiIIIII2 == 0) {
                this.id = IIiiIiiiiIIiI.ALLATORIxDEMO((String)data, (int)index, (int)IiiiiiiiIIIII3);
            } else if (IiiiiiiiIIIII2 == 1) {
                this.name = data.substring(index, IiiiiiiiIIIII3);
            } else if (IiiiiiiiIIIII2 - 2 < IiiiiiiiIIIII.length) {
                IiiiiiiiIIIII[IiiiiiiiIIIII2 - 2] = IIiiIiiiiIIiI.ALLATORIxDEMO((String)data, (int)index, (int)IiiiiiiiIIIII3);
            }
            ++IiiiiiiiIIIII2;
            index = IiiiiiiiIIIII3 + 1;
        }
        this.data2 = IiiiiiiiIIIII;
    }

    public void setRoleShows(RoleShow[] roleShows) {
        this.roleShows = roleShows;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public void setData2(int[] data2) {
        this.data2 = data2;
    }

    public RoleShow[] getRoleShows() {
        return this.roleShows;
    }
}
