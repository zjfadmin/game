/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.entity.Mount
 *  com.xy.entity.MountSkill
 *  com.xy.entity.RoleSummoning
 *  com.xy.game.RoleData
 *  com.xy.readbean.Goodstable
 *  com.xy.socket.Agreement
 *  com.xy.socket.GameClient
 *  com.xy.socket.ParamTool
 *  com.xy.v.iiIiiiiiIIiii
 */
package com.xy.game;

import com.xy.entity.Mount;
import com.xy.entity.MountSkill;
import com.xy.entity.RoleSummoning;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.socket.GameClient;
import com.xy.socket.ParamTool;
import com.xy.v.iiIiiiiiIIiii;

public class HandleMount {
    public static void iiiIiiiiiiIIi(Goodstable good, Mount mount, RoleData roleData) {
        long IiiiiiiiIIIII = good.getType();
        if (IiiiiiiiIIIII == 721L) {
            if (mount.getUseNumber() >= 3) {
                roleData.getGameView().iiiIiiiiiiIIi("\u53ea\u80fd\u4f7f\u75283\u6b21\u7b4b\u9aa8\u63d0\u6c14\u4e39");
                return;
            }
        } else if (IiiiiiiiIIIII == 724L) {
            if (mount.getExquisiteUseTime() >= 5) {
                roleData.getGameView().iiiIiiiiiiIIi("\u53ea\u80fd\u4f7f\u75285\u6b21\u73b2\u73d1\u4e39");
                return;
            }
        } else if (IiiiiiiiIIIII != 717L) {
            int IiiiiiiiIIIII2;
            if (IiiiiiiiIIIII == 801L) {
                IiiiiiiiIIIII2 = mount.getMountlvl();
                if (IiiiiiiiIIIII2 == 100 || IiiiiiiiIIIII2 >= 200) {
                    roleData.getGameView().iiiIiiiiiiIIi("\u5750\u9a91" + mount.getMountname() + "\u5df2\u8fbe\u6700\u9ad8\u7b49\u7ea7100\u7ea7\uff01\uff01");
                    return;
                }
            } else if (IiiiiiiiIIIII == 802L) {
                IiiiiiiiIIIII2 = 100000;
                if (mount.getMountlvl() > 100) {
                    IiiiiiiiIIIII2 = 150000;
                    if (roleData.getGameView().getClient().ALLATORIxDEMO(2, 8) || roleData.getGameView().getClient().ALLATORIxDEMO(2, 10) || roleData.getGameView().getClient().ALLATORIxDEMO(2, 12)) {
                        IiiiiiiiIIIII2 = 100000;
                    }
                }
                if (mount.getProficiency() >= IiiiiiiiIIIII2) {
                    roleData.getGameView().iiiIiiiiiiIIi("\u5750\u9a91" + mount.getMountname() + "\u7684\u6280\u80fd\u719f\u7ec3\u5ea6\u5df2\u8fbe\u5230\u5cf0\u503c\uff01\uff01");
                    return;
                }
            } else {
                if (IiiiiiiiIIIII != 103L) return;
                if (!roleData.getGameView().getClient().gameMount) {
                    return;
                }
            }
        }
        String IiiiiiiiIIIII3 = Agreement.getSendTextAES((String)"usermount", (String)(good.getRgid() + "|" + mount.getMid()));
        roleData.getGameView().getClient().ALLATORIxDEMO(IiiiiiiiIIIII3);
    }

    public static void iIiIiiiiIIiii(Goodstable good, Mount mount, RoleData roleData) {
        if (mount.getMountskill().size() >= 2) {
            roleData.getGameView().iIiIiiiiIIiii("\u8fd9\u4e2a\u5750\u9a91\u6280\u80fd\u5df2\u8d85\u8fc7\u4e24\u4e2a\uff01\uff01\uff01");
            return;
        }
        MountSkill IiiiiiiiIIIII = new MountSkill();
        IiiiiiiiIIIII.setMid(mount.getMid());
        IiiiiiiiIIIII.setSkillname(good.getGoodsname());
        boolean IiiiiiiiIIIII2 = false;
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < mount.getMountskill().size()) {
            if (((MountSkill)mount.getMountskill().get(IiiiiiiiIIIII3)).getSkillname().equals(IiiiiiiiIIIII.getSkillname())) {
                roleData.getGameView().iIiIiiiiIIiii("\u8be5\u5750\u9a91\u5df2\u6709\u8fd9\u4e2a\u6280\u80fd!");
                return;
            }
            ++IiiiiiiiIIIII3;
        }
        mount.getMountskill().add(IiiiiiiiIIIII);
        good.ALLATORIxDEMO(1);
        ParamTool.ALLATORIxDEMO((Goodstable)good, (int)1, (GameClient)roleData.getGameView().getClient());
        String IiiiiiiiIIIII22 = Agreement.getSendTextAES((String)"addmountskill", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII));
        roleData.getGameView().getClient().ALLATORIxDEMO(IiiiiiiiIIIII22);
        RoleSummoning IiiiiiiiIIIII4 = roleData.getChosePet();
        if (IiiiiiiiIIIII4 == null) return;
        roleData.getRoleProperty().ALLATORIxDEMO(IiiiiiiiIIIII4);
    }

    /*
     * WARNING - void declaration
     */
    public static void ALLATORIxDEMO(Goodstable goodstable, Mount mount, RoleData roleData) {
        void mount2;
        void roleData2;
        Goodstable good;
        good.ALLATORIxDEMO(1);
        ParamTool.ALLATORIxDEMO((Goodstable)goodstable, (int)1, (GameClient)roleData2.getGameView().getClient());
        if (mount2.getMountskill().size() == 0) return;
        mount2.getMountskill().clear();
        String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"missmountskill", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(mount2.getMid()));
        roleData2.getGameView().getClient().ALLATORIxDEMO(IiiiiiiiIIIII);
        RoleSummoning IiiiiiiiIIIII2 = roleData2.getChosePet();
        if (IiiiiiiiIIIII2 == null) return;
        roleData2.getRoleProperty().ALLATORIxDEMO(IiiiiiiiIIIII2);
    }

    public static void ALLATORIxDEMO(Goodstable good, RoleData roleData) {
        Mount IiiiiiiiIIIII = roleData.getChoseMount();
        if (IiiiiiiiIIIII == null) {
            roleData.getGameView().iIiIiiiiIIiii("\u4f60\u6ca1\u6709\u9009\u4e2d\u7684\u5750\u9a91");
            return;
        }
        long IiiiiiiiIIIII2 = good.getType();
        if (roleData.getGameView().getClient().gameMount && (IiiiiiiiIIIII2 == 718L || IiiiiiiiIIIII2 == 719L)) {
            String IiiiiiiiIIIII3 = Agreement.getSendTextAES((String)"usermount", (String)(good.getRgid() + "|" + IiiiiiiiIIIII.getMid()));
            roleData.getGameView().getClient().ALLATORIxDEMO(IiiiiiiiIIIII3);
            return;
        }
        if (IiiiiiiiIIIII2 == 718L) {
            HandleMount.iIiIiiiiIIiii(good, IiiiiiiiIIIII, roleData);
            return;
        }
        if (IiiiiiiiIIIII2 == 719L) {
            HandleMount.ALLATORIxDEMO(good, IiiiiiiiIIIII, roleData);
            return;
        }
        if (IiiiiiiiIIIII2 == 720L) return;
        HandleMount.iiiIiiiiiiIIi(good, IiiiiiiiIIIII, roleData);
    }
}
