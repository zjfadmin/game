/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.LoginResult
 *  com.xy.bean.Middle
 *  com.xy.game.RoleData
 *  com.xy.socket.Agreement
 *  com.xy.v.iiIiiiiiIIiii
 */
package com.xy.game;

import com.xy.bean.LoginResult;
import com.xy.bean.Middle;
import com.xy.game.RoleData;
import com.xy.socket.Agreement;
import com.xy.v.iiIiiiiiIIiii;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class PKSys {
    public static long YW = 36000000L;
    private int pk3 = 0;
    private int pk4 = 0;
    private long JailTime;
    private RoleData roleData;
    private int pk1 = 0;
    private int pk2 = 0;

    public int getPk4() {
        return this.pk4;
    }

    public static long getJailTime(int c) {
        long IiiiiiiiIIIII = 0x6DDD00L;
        if (c <= 1) {
            return IiiiiiiiIIIII;
        }
        if (c <= 3) return IiiiiiiiIIIII *= (long)c;
        c = 3;
        return IiiiiiiiIIIII *= (long)c;
    }

    public String ALLATORIxDEMO() {
        return String.valueOf(this.pk1) + "|" + this.pk2 + "|" + this.pk3 + "|" + this.pk4;
    }

    public void setPk1(int pk1) {
        this.pk1 = pk1;
    }

    public int getPk2() {
        return this.pk2;
    }

    public void setPk4(int pk4) {
        this.pk4 = pk4;
    }

    public void iIiIiiiiIIiii() {
        if (this.pk1 <= 0) {
            return;
        }
        this.JailTime += 60000L;
        if (this.pk2 != 0) {
            if (PKSys.getJailTime(this.pk4) >= this.JailTime) return;
            this.ALLATORIxDEMO();
            return;
        }
        if (!this.roleData.getGameView().mapScene.iiiiIiiiIiiII) return;
        if (YW >= this.JailTime) return;
        this.ALLATORIxDEMO();
    }

    public int getPk1() {
        return this.pk1;
    }

    public void setPk2(int pk2) {
        this.pk2 = pk2;
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO() {
        void IiiiiiiiIIIII;
        this.JailTime = 0L;
        this.pk1 = Math.max(0, this.pk1 - 1);
        this.roleData.getGameView().iiiIiiiiiiIIi("\u4f60\u51cf\u5c11\u4e86\u4e00\u70b9pk\u6807\u8bc6\u4f60\u8fd8\u6709#G " + this.pk1 + " #Y\u70b9PK\u6807\u5fd7");
        LoginResult IiiiiiiiIIIII2 = this.roleData.getLoginResult();
        IiiiiiiiIIIII2.setTaskDaily(this.ALLATORIxDEMO());
        Middle middle = new Middle();
        IiiiiiiiIIIII.setRolename(IiiiiiiiIIIII2.getRolename());
        IiiiiiiiIIIII.setTaskDaily(IiiiiiiiIIIII2.getTaskDaily());
        String IiiiiiiiIIIII3 = Agreement.getSendTextAES((String)"middle", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII));
        this.roleData.getGameView().getClient().ALLATORIxDEMO(IiiiiiiiIIIII3);
    }

    public void ALLATORIxDEMO(String taskDaily) {
        try {
            this.roleData.getLoginResult().setTaskDaily(taskDaily);
            String[] IiiiiiiiIIIII = this.roleData.getLoginResult().getTaskDaily().split("\\|");
            this.pk1 = Integer.parseInt(IiiiiiiiIIIII[0]);
            this.pk2 = Integer.parseInt(IiiiiiiiIIIII[1]);
            this.pk3 = Integer.parseInt(IiiiiiiiIIIII[2]);
            this.pk4 = Integer.parseInt(IiiiiiiiIIIII[3]);
            return;
        }
        catch (Exception IiiiiiiiIIIII) {
            return;
        }
    }

    public PKSys(RoleData roleData) {
        this.roleData = roleData;
        this.ALLATORIxDEMO(roleData.getLoginResult().getTaskDaily());
    }

    public int getPk3() {
        return this.pk3;
    }

    public void setPk3(int pk3) {
        this.pk3 = pk3;
    }
}
