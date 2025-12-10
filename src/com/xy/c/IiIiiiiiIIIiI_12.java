/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iIIiiiiiIIIIi
 *  com.xy.a.v.IIIIIiiiIiiII
 *  com.xy.a.v.IIIIiiiiIIIIi
 *  com.xy.a.v.IiiIIiiiiIiii
 *  com.xy.a.v.IiiIiiiiIIIIi
 *  com.xy.a.v.IiiiIiiiiIiII
 *  com.xy.a.v.IiiiIiiiiIiIi
 *  com.xy.a.v.iIIiIiiiIiiIi
 *  com.xy.a.v.iIiIiiiiIiIII
 *  com.xy.a.v.iiIiIiiiiIiIi
 *  com.xy.a.v.iiIiIiiiiIiii
 *  com.xy.a.v.iiIiIiiiiiIIi
 *  com.xy.a.v.iiIiiiiiIIiiI
 *  com.xy.a.v.iiIiiiiiIIiii
 *  com.xy.bean.RoleShow
 *  com.xy.game.RoleData
 *  com.xy.readbean.Activity
 *  com.xy.readbean.Activity2Role
 *  com.xy.readbean.ActivityRole
 *  com.xy.scene.BWDHRuleBattle
 *  com.xy.scene.BWDHRuleBattleRecord
 *  com.xy.scene.BWDHTeam
 *  com.xy.socket.GameClient
 *  com.xy.socket.ServerAction
 *  com.xy.text.GameView
 *  com.xy.v.IIIiiiiiiiiIi
 *  com.xy.v.IIiiIiiiiIIiI
 */
package com.xy.c;

import com.xy.a.iIIiiiiiIIIIi;
import com.xy.a.v.IIIIIiiiIiiII;
import com.xy.a.v.IIIIiiiiIIIIi;
import com.xy.a.v.IiiIIiiiiIiii;
import com.xy.a.v.IiiIiiiiIIIIi;
import com.xy.a.v.IiiiIiiiiIiII;
import com.xy.a.v.IiiiIiiiiIiIi;
import com.xy.a.v.iIIiIiiiIiiIi;
import com.xy.a.v.iIiIiiiiIiIII;
import com.xy.a.v.iiIiIiiiiIiIi;
import com.xy.a.v.iiIiIiiiiIiii;
import com.xy.a.v.iiIiIiiiiiIIi;
import com.xy.a.v.iiIiiiiiIIiiI;
import com.xy.a.v.iiIiiiiiIIiii;
import com.xy.bean.RoleShow;
import com.xy.game.RoleData;
import com.xy.readbean.Activity;
import com.xy.readbean.Activity2Role;
import com.xy.readbean.ActivityRole;
import com.xy.scene.BWDHRuleBattle;
import com.xy.scene.BWDHRuleBattleRecord;
import com.xy.scene.BWDHTeam;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;
import com.xy.text.GameView;
import com.xy.v.IIIiiiiiiiiIi;
import com.xy.v.IIiiIiiiiIIiI;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class IiIiiiiiIIIiI
implements ServerAction {
    public void IIIIIiiiiIIii(int index, String mes, Activity activity, GameClient gameClient) {
        iiIiIiiiiIiii IiiiiiiiIIIII = (iiIiIiiiiIiii)gameClient.gameView.getFormManagement().iIiIiiiiIIiii(176);
        if (IiiiiiiiIIIII == null) return;
        if (IiiiiiiiIIIII.iiiIiiiiiiIIi() != 2) {
            return;
        }
        ArrayList<BWDHTeam> IiiiiiiiIIIII2 = new ArrayList<BWDHTeam>();
        int IiiiiiiiIIIII3 = 0;
        int IiiiiiiiIIIII4 = index;
        while (IiiiiiiiIIIII4 < mes.length()) {
            IiiiiiiiIIIII4 = mes.indexOf("|", index + 1);
            if (IiiiiiiiIIIII4 == -1) {
                IiiiiiiiIIIII4 = mes.length();
            }
            this.ALLATORIxDEMO(mes, index, IiiiiiiiIIIII4, IiiiiiiiIIIII2);
            ++IiiiiiiiIIIII3;
            index = IiiiiiiiIIIII4 + 1;
        }
        iIiIiiiiIiIII IiiiiiiiIIIII22 = (iIiIiiiiIiIII)IiiiiiiiIIIII.ALLATORIxDEMO()[2];
        IiiiiiiiIIIII22.ALLATORIxDEMO(IiiiiiiiIIIII2);
    }

    public void iIiIiiiiIIiii(int ruleIndex, int index, String mes, Activity activity, GameClient gameClient) {
        iiIiIiiiiIiii IiiiiiiiIIIII = (iiIiIiiiiIiii)gameClient.gameView.getFormManagement().iIiIiiiiIIiii(176);
        if (IiiiiiiiIIIII == null) return;
        if (IiiiiiiiIIIII.iiiIiiiiiiIIi() != 0) {
            return;
        }
        BWDHRuleBattle[] IiiiiiiiIIIII2 = new BWDHRuleBattle[index < mes.length() ? 1 + IIiiIiiiiIIiI.ALLATORIxDEMO((char)'|', (String)mes, (int)index, (int)mes.length()) : 0];
        int IiiiiiiiIIIII3 = 0;
        int IiiiiiiiIIIII4 = IiiiiiiiIIIII2.length > 0 ? 0 : mes.length();
        while (IiiiiiiiIIIII4 < mes.length()) {
            IiiiiiiiIIIII4 = mes.indexOf("|", index + 1);
            if (IiiiiiiiIIIII4 == -1) {
                IiiiiiiiIIIII4 = mes.length();
            }
            IiiiiiiiIIIII2[IiiiiiiiIIIII3] = new BWDHRuleBattle();
            IiiiiiiiIIIII2[IiiiiiiiIIIII3].ALLATORIxDEMO(mes, index, IiiiiiiiIIIII4);
            ++IiiiiiiiIIIII3;
            index = IiiiiiiiIIIII4 + 1;
        }
        iiIiIiiiiiIIi IiiiiiiiIIIII22 = (iiIiIiiiiiIIi)IiiiiiiiIIIII.ALLATORIxDEMO()[0];
        IiiiiiiiIIIII22.iIiIiiiiIIiii(ruleIndex - 2, (Object)IiiiiiiiIIIII2);
    }

    public void iiiiiiiiIIiii(int index, String mes, Activity activity, GameClient gameClient) {
        iiIiIiiiiIiii IiiiiiiiIIIII = (iiIiIiiiiIiii)gameClient.gameView.getFormManagement().iIiIiiiiIIiii(176);
        if (IiiiiiiiIIIII == null) return;
        if (IiiiiiiiIIIII.iiiIiiiiiiIIi() != 1) {
            return;
        }
        BWDHTeam[] IiiiiiiiIIIII2 = new BWDHTeam[index < mes.length() ? 1 + IIiiIiiiiIIiI.ALLATORIxDEMO((char)'|', (String)mes, (int)index, (int)mes.length()) : 0];
        int IiiiiiiiIIIII3 = 0;
        int IiiiiiiiIIIII4 = IiiiiiiiIIIII2.length > 0 ? 0 : mes.length();
        while (IiiiiiiiIIIII4 < mes.length()) {
            IiiiiiiiIIIII4 = mes.indexOf("|", index + 1);
            if (IiiiiiiiIIIII4 == -1) {
                IiiiiiiiIIIII4 = mes.length();
            }
            IiiiiiiiIIIII2[IiiiiiiiIIIII3] = new BWDHTeam();
            IiiiiiiiIIIII2[IiiiiiiiIIIII3].ALLATORIxDEMO(mes, index, IiiiiiiiIIIII4);
            ++IiiiiiiiIIIII3;
            index = IiiiiiiiIIIII4 + 1;
        }
        IIIiiiiiiiiIi.ALLATORIxDEMO((BWDHTeam[])IiiiiiiiIIIII2);
        iiIiIiiiiIiIi IiiiiiiiIIIII22 = (iiIiIiiiiIiIi)IiiiiiiiIIIII.ALLATORIxDEMO()[1];
        IiiiiiiiIIIII22.iIiIiiiiIIiii(0, (Object)IiiiiiiiIIIII2);
    }

    public void ALLATORIxDEMO(String mes, GameClient gameClient) {
        GameView IiiiiiiiIIIII = gameClient.gameView;
        int IiiiiiiiIIIII2 = mes.indexOf("|");
        if (IiiiiiiiIIIII2 == -1) {
            IiiiiiiiIIIII2 = mes.length();
        }
        int IiiiiiiiIIIII3 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)mes, (int)0, (int)IiiiiiiiIIIII2);
        Activity IiiiiiiiIIIII4 = IiiiiiiiIIIII.getObjectArea().ALLATORIxDEMO(IiiiiiiiIIIII3);
        if (IiiiiiiiIIIII4 == null) {
            return;
        }
        ++IiiiiiiiIIIII2;
        if (IiiiiiiiIIIII4.getModelId() == 2) {
            this.ALLATORIxDEMO(IiiiiiiiIIIII2, mes, IiiiiiiiIIIII4, gameClient);
            return;
        }
        if (IiiiiiiiIIIII4.getModelId() != 3) return;
        this.iIiIiiiiIIiii(IiiiiiiiIIIII2, mes, IiiiiiiiIIIII4, gameClient);
    }

    public void ALLATORIxDEMO(int ruleIndex, int ruleFlag, int index, String mes, Activity activity, GameClient gameClient) {
        iiIiIiiiiIiii IiiiiiiiIIIII = (iiIiIiiiiIiii)gameClient.gameView.getFormManagement().iIiIiiiiIIiii(176);
        if (IiiiiiiiIIIII == null) return;
        if (IiiiiiiiIIIII.iiiIiiiiiiIIi() != 1) {
            return;
        }
        ArrayList IiiiiiiiIIIII2 = new ArrayList();
        int IiiiiiiiIIIII3 = 0;
        int IiiiiiiiIIIII4 = index;
        while (IiiiiiiiIIIII4 < mes.length()) {
            IiiiiiiiIIIII4 = mes.indexOf("|", index + 1);
            if (IiiiiiiiIIIII4 == -1) {
                IiiiiiiiIIIII4 = mes.length();
            }
            new BWDHRuleBattle().ALLATORIxDEMO(mes, index, IiiiiiiiIIIII4, IiiiiiiiIIIII2);
            ++IiiiiiiiIIIII3;
            index = IiiiiiiiIIIII4 + 1;
        }
        BWDHRuleBattleRecord[] IiiiiiiiIIIII22 = new BWDHRuleBattleRecord[IiiiiiiiIIIII2.size()];
        IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < IiiiiiiiIIIII22.length) {
            int n = IiiiiiiiIIIII4;
            BWDHRuleBattleRecord bWDHRuleBattleRecord = (BWDHRuleBattleRecord)IiiiiiiiIIIII2.get(IiiiiiiiIIIII4);
            ++IiiiiiiiIIIII4;
            IiiiiiiiIIIII22[n] = bWDHRuleBattleRecord;
        }
        IIIiiiiiiiiIi.ALLATORIxDEMO((BWDHRuleBattleRecord[])IiiiiiiiIIIII22);
        iiIiIiiiiIiIi IiiiiiiiIIIII32 = (iiIiIiiiiIiIi)IiiiiiiiIIIII.ALLATORIxDEMO()[1];
        if (ruleIndex == 3) {
            IiiiiiiiIIIII32.ALLATORIxDEMO(ruleFlag, IiiiiiiiIIIII22);
            return;
        }
        IiiiiiiiIIIII32.iIiIiiiiIIiii(ruleIndex - 2, (Object)IiiiiiiiIIIII22);
    }

    public void ALLATORIxDEMO(int group, int index, String mes, Activity activity, GameClient gameClient) {
        iiIiIiiiiIiii IiiiiiiiIIIII = (iiIiIiiiiIiii)gameClient.gameView.getFormManagement().iIiIiiiiIIiii(176);
        if (IiiiiiiiIIIII == null) return;
        if (IiiiiiiiIIIII.iiiIiiiiiiIIi() != 0) {
            return;
        }
        BWDHRuleBattle[] IiiiiiiiIIIII2 = new BWDHRuleBattle[index < mes.length() ? 1 + IIiiIiiiiIIiI.ALLATORIxDEMO((char)'|', (String)mes, (int)index, (int)mes.length()) : 0];
        int IiiiiiiiIIIII3 = 0;
        int IiiiiiiiIIIII4 = IiiiiiiiIIIII2.length > 0 ? 0 : mes.length();
        while (IiiiiiiiIIIII4 < mes.length()) {
            IiiiiiiiIIIII4 = mes.indexOf("|", index + 1);
            if (IiiiiiiiIIIII4 == -1) {
                IiiiiiiiIIIII4 = mes.length();
            }
            IiiiiiiiIIIII2[IiiiiiiiIIIII3] = new BWDHRuleBattle(mes, index, IiiiiiiiIIIII4);
            ++IiiiiiiiIIIII3;
            index = IiiiiiiiIIIII4 + 1;
        }
        iiIiIiiiiiIIi IiiiiiiiIIIII22 = (iiIiIiiiiiIIi)IiiiiiiiIIIII.ALLATORIxDEMO()[0];
        IiiiiiiiIIIII22.ALLATORIxDEMO(group, IiiiiiiiIIIII2);
    }

    public static void ALLATORIxDEMO(String mes, GameView gameView) {
        boolean IiiiiiiiIIIII = gameView.getObjectArea().ALLATORIxDEMO();
        int IiiiiiiiIIIII2 = 0;
        RoleData IiiiiiiiIIIII3 = gameView.roleData;
        int IiiiiiiiIIIII4 = 0;
        int IiiiiiiiIIIII5 = 0;
        int IiiiiiiiIIIII6 = 0;
        while (IiiiiiiiIIIII5 < mes.length()) {
            block26: {
                Activity IiiiiiiiIIIII7;
                int IiiiiiiiIIIII8;
                ActivityRole IiiiiiiiIIIII9;
                block25: {
                    IiiiiiiiIIIII5 = mes.indexOf("|", IiiiiiiiIIIII4 + 1);
                    if (IiiiiiiiIIIII5 == -1) {
                        IiiiiiiiIIIII5 = mes.length();
                    }
                    if ((IiiiiiiiIIIII6 = mes.indexOf("#", IiiiiiiiIIIII4 + 1)) == -1 || IiiiiiiiIIIII6 > IiiiiiiiIIIII5) {
                        IiiiiiiiIIIII6 = IiiiiiiiIIIII5;
                    }
                    if ((IiiiiiiiIIIII9 = IiiiiiiiIIIII3.getActivity(IiiiiiiiIIIII8 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)mes, (int)IiiiiiiiIIIII4, (int)IiiiiiiiIIIII6))) != null) break block25;
                    IiiiiiiiIIIII7 = gameView.getObjectArea().ALLATORIxDEMO(IiiiiiiiIIIII8);
                    if (IiiiiiiiIIIII7 == null) break block26;
                    if (IiiiiiiiIIIII7.getModelId() == 1 || IiiiiiiiIIIII7.getModelId() == 2 || IiiiiiiiIIIII7.getModelId() == 3 || IiiiiiiiIIIII7.getModelId() == 5) {
                        IiiiiiiiIIIII9 = new Activity2Role(null, 0, 0);
                    }
                    IiiiiiiiIIIII3.ALLATORIxDEMO(IiiiiiiiIIIII8, IiiiiiiiIIIII9);
                }
                IiiiiiiiIIIII9.setValueByKey(mes, IiiiiiiiIIIII6 + 1, IiiiiiiiIIIII5);
                Activity activity = IiiiiiiiIIIII7 = IiiiiiiiIIIII ? gameView.getObjectArea().ALLATORIxDEMO(IiiiiiiiIIIII8) : null;
                if (IiiiiiiiIIIII7 != null) {
                    if (IiiiiiiiIIIII7.getModelId() == 1) {
                        IiiiiiiiIIIII2 |= 1;
                    } else if (IiiiiiiiIIIII7.getModelId() == 2) {
                        IiiiiiiiIIIII2 |= 2;
                    } else if (IiiiiiiiIIIII7.getModelId() == 3) {
                        IiiiiiiiIIIII2 |= 4;
                    } else if (IiiiiiiiIIIII7.getModelId() == 5) {
                        IiiiiiiiIIIII2 |= 8;
                    }
                }
            }
            IiiiiiiiIIIII4 = IiiiiiiiIIIII5 + 1;
        }
        IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < 4) {
            if ((IiiiiiiiIIIII2 >> IiiiiiiiIIIII4 & 1) == 1) {
                IiiiIiiiiIiIi IiiiiiiiIIIII10;
                if (IiiiiiiiIIIII4 == 0) {
                    iIIiIiiiIiiIi IiiiiiiiIIIII11 = (iIIiIiiiIiiIi)gameView.getFormManagement().iIiIiiiiIIiii(168);
                    if (IiiiiiiiIIIII11 != null) {
                        IiiiiiiiIIIII11.iIiIiiiiIIiIi();
                    }
                } else if (IiiiiiiiIIIII4 == 1) {
                    IIIIiiiiIIIIi IiiiiiiiIIIII12 = (IIIIiiiiIIIIi)gameView.getFormManagement().iIiIiiiiIIiii(167);
                    if (IiiiiiiiIIIII12 != null) {
                        IiiiiiiiIIIII12.iiiIiiiiiiIIi(2);
                    }
                } else if (IiiiiiiiIIIII4 == 3 && (IiiiiiiiIIIII10 = (IiiiIiiiiIiIi)gameView.getFormManagement().iIiIiiiiIIiii(186)) != null) {
                    IiiiiiiiIIIII10.iiiIiiiiiiIIi();
                }
            }
            ++IiiiiiiiIIIII4;
        }
    }

    public void ALLATORIxDEMO(String head, String mes, GameClient gameClient) {
        if (head.equals("activity")) {
            IiIiiiiiIIIiI.ALLATORIxDEMO(mes, gameClient.gameView);
            return;
        }
        if (!head.equals("activityS")) return;
        this.ALLATORIxDEMO(mes, gameClient);
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(String data, int index, int indexFlag, List<BWDHTeam> list) {
        int IiiiiiiiIIIII = data.indexOf("#", index + 1);
        if (IiiiiiiiIIIII == -1 || IiiiiiiiIIIII > indexFlag) {
            IiiiiiiiIIIII = indexFlag;
        }
        int IiiiiiiiIIIII2 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)data, (int)index, (int)IiiiiiiiIIIII);
        index = IiiiiiiiIIIII + 1;
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII < indexFlag) {
            void IiiiiiiiIIIII4;
            IiiiiiiiIIIII = data.indexOf("#", index + 1);
            if (IiiiiiiiIIIII == -1 || IiiiiiiiIIIII > indexFlag) {
                IiiiiiiiIIIII = indexFlag;
            }
            if ((IiiiiiiiIIIII3 = data.indexOf("&", index + 1)) == -1 || IiiiiiiiIIIII3 > IiiiiiiiIIIII) {
                IiiiiiiiIIIII3 = IiiiiiiiIIIII;
            }
            BWDHTeam bWDHTeam = new BWDHTeam();
            IiiiiiiiIIIII4.setId(IIiiIiiiiIIiI.ALLATORIxDEMO((String)data, (int)index, (int)IiiiiiiiIIIII3));
            IiiiiiiiIIIII4.setName(data.substring(IiiiiiiiIIIII3 + 1, IiiiiiiiIIIII));
            bWDHTeam.setFlag(IiiiiiiiIIIII2);
            list.add((BWDHTeam)IiiiiiiiIIIII4);
            index = IiiiiiiiIIIII + 1;
        }
    }

    public void IiiIiiiiiiIiI(int index, String mes, Activity activity, GameClient gameClient) {
        BWDHTeam IiiiiiiiIIIII = new BWDHTeam();
        BWDHTeam IiiiiiiiIIIII2 = new BWDHTeam();
        int IiiiiiiiIIIII3 = mes.indexOf("|", index + 1);
        if (IiiiiiiiIIIII3 == -1) {
            IiiiiiiiIIIII3 = mes.length();
        }
        IiiiiiiiIIIII.setRoleShows(new RoleShow[IIiiIiiiiIIiI.ALLATORIxDEMO((char)'&', (String)mes, (int)index, (int)IiiiiiiiIIIII3) - 1]);
        int IiiiiiiiIIIII4 = 0;
        int IiiiiiiiIIIII5 = 0;
        while (IiiiiiiiIIIII5 < IiiiiiiiIIIII3) {
            IiiiiiiiIIIII5 = mes.indexOf("&", index + 1);
            if (IiiiiiiiIIIII5 == -1 || IiiiiiiiIIIII5 > IiiiiiiiIIIII3) {
                IiiiiiiiIIIII5 = IiiiiiiiIIIII3;
            }
            if (IiiiiiiiIIIII4 == 0) {
                IiiiiiiiIIIII.setId(IIiiIiiiiIIiI.ALLATORIxDEMO((String)mes, (int)index, (int)IiiiiiiiIIIII5));
            } else if (IiiiiiiiIIIII4 == 1) {
                IiiiiiiiIIIII.setName(mes.substring(index, IiiiiiiiIIIII5));
            } else {
                IiiiiiiiIIIII.getRoleShows()[IiiiiiiiIIIII4 - 2] = new RoleShow();
                IiiiiiiiIIIII.getRoleShows()[IiiiiiiiIIIII4 - 2].ALLATORIxDEMO(mes, index, IiiiiiiiIIIII5);
            }
            ++IiiiiiiiIIIII4;
            index = IiiiiiiiIIIII5 + 1;
        }
        index = IiiiiiiiIIIII3 + 1;
        IiiiiiiiIIIII3 = mes.length();
        IiiiiiiiIIIII2.setRoleShows(new RoleShow[IIiiIiiiiIIiI.ALLATORIxDEMO((char)'&', (String)mes, (int)index, (int)IiiiiiiiIIIII3) - 1]);
        IiiiiiiiIIIII4 = 0;
        IiiiiiiiIIIII5 = 0;
        while (IiiiiiiiIIIII5 < IiiiiiiiIIIII3) {
            IiiiiiiiIIIII5 = mes.indexOf("&", index + 1);
            if (IiiiiiiiIIIII5 == -1 || IiiiiiiiIIIII5 > IiiiiiiiIIIII3) {
                IiiiiiiiIIIII5 = IiiiiiiiIIIII3;
            }
            if (IiiiiiiiIIIII4 == 0) {
                IiiiiiiiIIIII2.setId(IIiiIiiiiIIiI.ALLATORIxDEMO((String)mes, (int)index, (int)IiiiiiiiIIIII5));
            } else if (IiiiiiiiIIIII4 == 1) {
                IiiiiiiiIIIII2.setName(mes.substring(index, IiiiiiiiIIIII5));
            } else {
                IiiiiiiiIIIII2.getRoleShows()[IiiiiiiiIIIII4 - 2] = new RoleShow();
                IiiiiiiiIIIII2.getRoleShows()[IiiiiiiiIIIII4 - 2].ALLATORIxDEMO(mes, index, IiiiiiiiIIIII5);
            }
            ++IiiiiiiiIIIII4;
            index = IiiiiiiiIIIII5 + 1;
        }
        GameView IiiiiiiiIIIII22 = gameClient.gameView;
        if (IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII22.roleData.getLoginResult().getRole_id()) == -1) {
            BWDHTeam bWDHTeam = IiiiiiiiIIIII;
            IiiiiiiiIIIII = IiiiiiiiIIIII2;
            IiiiiiiiIIIII2 = bWDHTeam;
        }
        IiiIIiiiiIiii IiiiiiiiIIIII32 = (IiiIIiiiiIiii)IiiiiiiiIIIII22.getFormManagement().iiiIiiiiiiIIi(177);
        IiiiiiiiIIIII32.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII2);
    }

    public void iIiIiiiiIIiIi(int index, String mes, Activity activity, GameClient gameClient) {
        iiIiIiiiiIiii IiiiiiiiIIIII = (iiIiIiiiiIiii)gameClient.gameView.getFormManagement().iIiIiiiiIIiii(176);
        if (IiiiiiiiIIIII == null) return;
        if (IiiiiiiiIIIII.iiiIiiiiiiIIi() != 0) {
            return;
        }
        BWDHTeam[] IiiiiiiiIIIII2 = new BWDHTeam[index < mes.length() ? 1 + IIiiIiiiiIIiI.ALLATORIxDEMO((char)'|', (String)mes, (int)index, (int)mes.length()) : 0];
        int IiiiiiiiIIIII3 = 0;
        int IiiiiiiiIIIII4 = IiiiiiiiIIIII2.length > 0 ? 0 : mes.length();
        int IiiiiiiiIIIII5 = 0;
        while (IiiiiiiiIIIII4 < mes.length()) {
            IiiiiiiiIIIII4 = mes.indexOf("|", index + 1);
            if (IiiiiiiiIIIII4 == -1) {
                IiiiiiiiIIIII4 = mes.length();
            }
            if ((IiiiiiiiIIIII5 = mes.indexOf("#", index + 1)) == -1 || IiiiiiiiIIIII5 > IiiiiiiiIIIII4) {
                IiiiiiiiIIIII5 = IiiiiiiiIIIII4;
            }
            IiiiiiiiIIIII2[IiiiiiiiIIIII3] = new BWDHTeam();
            IiiiiiiiIIIII2[IiiiiiiiIIIII3].setId(IIiiIiiiiIIiI.ALLATORIxDEMO((String)mes, (int)index, (int)IiiiiiiiIIIII5));
            IiiiiiiiIIIII2[IiiiiiiiIIIII3].setName(mes.substring(IiiiiiiiIIIII5 + 1, IiiiiiiiIIIII4));
            ++IiiiiiiiIIIII3;
            index = IiiiiiiiIIIII4 + 1;
        }
        iiIiIiiiiiIIi IiiiiiiiIIIII22 = (iiIiIiiiiiIIi)IiiiiiiiIIIII.ALLATORIxDEMO()[0];
        IiiiiiiiIIIII22.iIiIiiiiIIiii(0, (Object)IiiiiiiiIIIII2);
    }

    public void iiiIiiiiiiIIi(int index, String mes, Activity activity, GameClient gameClient) {
        long IiiiiiiiIIIII;
        boolean IiiiiiiiIIIII2 = true;
        int IiiiiiiiIIIII3 = 0;
        int IiiiiiiiIIIII4 = 0;
        String IiiiiiiiIIIII5 = null;
        BWDHTeam IiiiiiiiIIIII6 = new BWDHTeam();
        IiiiiiiiIIIII6.setData2(new int[6]);
        BWDHTeam IiiiiiiiIIIII7 = new BWDHTeam();
        IiiiiiiiIIIII7.setData2(new int[6]);
        int IiiiiiiiIIIII8 = mes.indexOf("|", index + 1);
        IiiiiiiiIIIII3 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)mes, (int)index, (int)IiiiiiiiIIIII8);
        index = IiiiiiiiIIIII8 + 1;
        IiiiiiiiIIIII8 = mes.indexOf("|", index + 1);
        IiiiiiiiIIIII4 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)mes, (int)index, (int)IiiiiiiiIIIII8);
        index = IiiiiiiiIIIII8 + 1;
        IiiiiiiiIIIII8 = mes.indexOf("|", index + 1);
        int IiiiiiiiIIIII9 = 0;
        int IiiiiiiiIIIII10 = 0;
        while (IiiiiiiiIIIII10 < IiiiiiiiIIIII8) {
            IiiiiiiiIIIII10 = mes.indexOf("#", index + 1);
            if (IiiiiiiiIIIII10 == -1 || IiiiiiiiIIIII10 > IiiiiiiiIIIII8) {
                IiiiiiiiIIIII10 = IiiiiiiiIIIII8;
            }
            if (IiiiiiiiIIIII9 == 0) {
                IiiiiiiiIIIII6.setId(IIiiIiiiiIIiI.ALLATORIxDEMO((String)mes, (int)index, (int)IiiiiiiiIIIII10));
            } else if (IiiiiiiiIIIII9 == 1) {
                IiiiiiiiIIIII6.setName(mes.substring(index, IiiiiiiiIIIII10));
            } else {
                IiiiiiiiIIIII6.getData2()[IiiiiiiiIIIII9 - 2] = IIiiIiiiiIIiI.ALLATORIxDEMO((String)mes, (int)index, (int)IiiiiiiiIIIII10);
            }
            ++IiiiiiiiIIIII9;
            index = IiiiiiiiIIIII10 + 1;
        }
        index = IiiiiiiiIIIII8 + 1;
        if ((IiiiiiiiIIIII8 = mes.indexOf("|", index + 1)) == -1) {
            IiiiiiiiIIIII8 = mes.length();
        }
        IiiiiiiiIIIII9 = 0;
        IiiiiiiiIIIII10 = 0;
        while (IiiiiiiiIIIII10 < IiiiiiiiIIIII8) {
            IiiiiiiiIIIII10 = mes.indexOf("#", index + 1);
            if (IiiiiiiiIIIII10 == -1 || IiiiiiiiIIIII10 > IiiiiiiiIIIII8) {
                IiiiiiiiIIIII10 = IiiiiiiiIIIII8;
            }
            if (IiiiiiiiIIIII9 == 0) {
                IiiiiiiiIIIII7.setId(IIiiIiiiiIIiI.ALLATORIxDEMO((String)mes, (int)index, (int)IiiiiiiiIIIII10));
            } else if (IiiiiiiiIIIII9 == 1) {
                IiiiiiiiIIIII7.setName(mes.substring(index, IiiiiiiiIIIII10));
            } else {
                IiiiiiiiIIIII7.getData2()[IiiiiiiiIIIII9 - 2] = IIiiIiiiiIIiI.ALLATORIxDEMO((String)mes, (int)index, (int)IiiiiiiiIIIII10);
            }
            ++IiiiiiiiIIIII9;
            index = IiiiiiiiIIIII10 + 1;
        }
        index = IiiiiiiiIIIII8 + 1;
        if (index < mes.length()) {
            IiiiiiiiIIIII5 = mes.substring(index);
        }
        GameView IiiiiiiiIIIII22 = gameClient.gameView;
        ActivityRole IiiiiiiiIIIII32 = IiiiiiiiIIIII22.roleData.getActivity(activity.getId());
        long l = IiiiiiiiIIIII = IiiiiiiiIIIII32 != null ? IiiiiiiiIIIII32.getValueByKey(1) : 0L;
        if (IiiiiiiiIIIII != (long)IiiiiiiiIIIII6.getId()) {
            IiiiiiiiIIIII2 = false;
            BWDHTeam bWDHTeam = IiiiiiiiIIIII6;
            IiiiiiiiIIIII6 = IiiiiiiiIIIII7;
            IiiiiiiiIIIII7 = bWDHTeam;
        }
        ((iiIiiiiiIIiii)IiiiiiiiIIIII22.getFormManagement().iiiIiiiiiiIIi(178)).ALLATORIxDEMO(IiiiiiiiIIIII2, IiiiiiiiIIIII3, IiiiiiiiIIIII4, IiiiiiiiIIIII6, IiiiiiiiIIIII7, IiiiiiiiIIIII5);
    }

    /*
     * Unable to fully structure code
     */
    public void iIiIiiiiIIiii(int index, String mes, Activity activity, GameClient gameClient) {
        block24: {
            block25: {
                block23: {
                    IiiiiiiiIIIII = mes.charAt(index);
                    if (IiiiiiiiIIIII != 'R' && IiiiiiiiIIIII != 'M') break block23;
                    IiiiiiiiIIIII = mes.indexOf("|", index + 1);
                    if (IiiiiiiiIIIII == -1) {
                        IiiiiiiiIIIII = mes.length();
                    }
                    IiiiiiiiIIIII = 0;
                    IiiiiiiiIIIII = 0;
                    IiiiiiiiIIIII = 0;
                    IiiiiiiiIIIII = 0;
                    if (true) ** GOTO lbl58
                }
                if (IiiiiiiiIIIII == 'T' || IiiiiiiiIIIII == 't') {
                    IiiiiiiiIIIII = mes.indexOf("|", index + 1);
                    if (IiiiiiiiIIIII == -1) {
                        IiiiiiiiIIIII = mes.length();
                    }
                    IiiiiiiiIIIII = IIiiIiiiiIIiI.ALLATORIxDEMO((String)mes, (int)(index + 1), (int)IiiiiiiiIIIII);
                    IiiiiiiiIIIII = new BWDHTeam();
                    IiiiiiiiIIIII.setId(IiiiiiiiIIIII);
                    this.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII + 1, mes, IiiiiiiiIIIII, activity, gameClient);
                    return;
                }
                if (IiiiiiiiIIIII != 'N') break block24;
                IiiiiiiiIIIII = mes.indexOf("|", index + 1);
                if (IiiiiiiiIIIII == -1) {
                    IiiiiiiiIIIII = mes.length();
                }
                if ((IiiiiiiiIIIII = IIiiIiiiiIIiI.ALLATORIxDEMO((String)mes, (int)(index + 1), (int)IiiiiiiiIIIII)) != 2) break block25;
                index = IiiiiiiiIIIII + 1;
                IiiiiiiiIIIII = new int[3];
                IiiiiiiiIIIII = 0;
                IiiiiiiiIIIII = 0;
                if (true) ** GOTO lbl85
            }
            index = IiiiiiiiIIIII + 1;
            IiiiiiiiIIIII = new int[6];
            IiiiiiiiIIIII = null;
            IiiiiiiiIIIII = 0;
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl99
        }
        if (IiiiiiiiIIIII == 'B') {
            this.IiiIiiiiiiIiI(index + 1, mes, activity, gameClient);
            return;
        }
        if (IiiiiiiiIIIII == 'b') {
            this.iiiIiiiiiiIIi(index + 1, mes, activity, gameClient);
            return;
        }
        if (IiiiiiiiIIIII != 'P') return;
        this.IIIIIiiiiIIii(index + 2, mes, activity, gameClient);
        return;
        do {
            if ((IiiiiiiiIIIII = mes.indexOf("#", index + 1)) == -1 || IiiiiiiiIIIII > IiiiiiiiIIIII) {
                IiiiiiiiIIIII = IiiiiiiiIIIII;
            }
            if (IiiiiiiiIIIII == 0) {
                IiiiiiiiIIIII = IIiiIiiiiIIiI.ALLATORIxDEMO((String)mes, (int)(index + 1), (int)IiiiiiiiIIIII);
            } else if (IiiiiiiiIIIII == 1) {
                IiiiiiiiIIIII = IIiiIiiiiIIiI.ALLATORIxDEMO((String)mes, (int)index, (int)IiiiiiiiIIIII);
            }
            ++IiiiiiiiIIIII;
            index = IiiiiiiiIIIII + 1;
lbl58:
            // 2 sources

        } while (IiiiiiiiIIIII < IiiiiiiiIIIII);
        if (IiiiiiiiIIIII == 'R') {
            if (IiiiiiiiIIIII == 2) {
                this.iIiIiiiiIIiIi(IiiiiiiiIIIII + 1, mes, activity, gameClient);
                return;
            }
            if (IiiiiiiiIIIII == 3) {
                this.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII + 1, mes, activity, gameClient);
                return;
            }
            if (IiiiiiiiIIIII != 4) {
                if (IiiiiiiiIIIII != 5) return;
            }
            this.iIiIiiiiIIiii(IiiiiiiiIIIII, IiiiiiiiIIIII + 1, mes, activity, gameClient);
            return;
        }
        if (IiiiiiiiIIIII != 'M') return;
        if (IiiiiiiiIIIII == 2) {
            this.iiiiiiiiIIiii(IiiiiiiiIIIII + 1, mes, activity, gameClient);
            return;
        }
        if (IiiiiiiiIIIII != 3 && IiiiiiiiIIIII != 4) {
            if (IiiiiiiiIIIII != 5) return;
        }
        this.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII, IiiiiiiiIIIII + 1, mes, activity, gameClient);
        return;
        do {
            if ((IiiiiiiiIIIII = mes.indexOf("#", index + 1)) == -1) {
                IiiiiiiiIIIII = mes.length();
            }
            if (IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
                IiiiiiiiIIIII[IiiiiiiiIIIII] = IIiiIiiiiIIiI.ALLATORIxDEMO((String)mes, (int)index, (int)IiiiiiiiIIIII);
            }
            ++IiiiiiiiIIIII;
            index = IiiiiiiiIIIII + 1;
lbl85:
            // 2 sources

        } while (IiiiiiiiIIIII < mes.length());
        IiiiiiiiIIIII = (iIIiiiiiIIIIi)gameClient.gameView.getFormManagement().iiiIiiiiiiIIi(27);
        IiiiiiiiIIIII.ALLATORIxDEMO(activity.getId(), IiiiiiiiIIIII);
        return;
        do {
            if ((IiiiiiiiIIIII = mes.indexOf("#", index + 1)) == -1) {
                IiiiiiiiIIIII = mes.length();
            }
            if (IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
                IiiiiiiiIIIII[IiiiiiiiIIIII] = IIiiIiiiiIIiI.ALLATORIxDEMO((String)mes, (int)index, (int)IiiiiiiiIIIII);
                ++IiiiiiiiIIIII;
                index = IiiiiiiiIIIII + 1;
                continue;
            }
            IiiiiiiiIIIII = mes.substring(index);
            break;
lbl99:
            // 2 sources

        } while (IiiiiiiiIIIII < mes.length());
        IiiiiiiiIIIII = new Point(IiiiiiiiIIIII, IiiiiiiiIIIII[0]);
        IiiiiiiiIIIII = (iIIiiiiiIIIIi)gameClient.gameView.getFormManagement().iiiIiiiiiiIIi(27);
        IiiiiiiiIIIII.ALLATORIxDEMO(activity.getId(), IiiiiiiiIIIII, IiiiiiiiIIIII, IiiiiiiiIIIII);
    }

    public void ALLATORIxDEMO(char flag, int index, String mes, BWDHTeam bwdhTeam, Activity activity, GameClient gameClient) {
        GameView IiiiiiiiIIIII = gameClient.gameView;
        RoleShow[] IiiiiiiiIIIII2 = new RoleShow[index < mes.length() ? IIiiIiiiiIIiI.ALLATORIxDEMO((char)'|', (String)mes, (int)index, (int)mes.length()) : 0];
        int IiiiiiiiIIIII3 = 0;
        int IiiiiiiiIIIII4 = IiiiiiiiIIIII2.length > 0 ? 0 : mes.length();
        while (IiiiiiiiIIIII4 < mes.length()) {
            IiiiiiiiIIIII4 = mes.indexOf("|", index + 1);
            if (IiiiiiiiIIIII4 == -1) {
                IiiiiiiiIIIII4 = mes.length();
            }
            if (IiiiiiiiIIIII3 == 0) {
                bwdhTeam.setName(mes.substring(index, IiiiiiiiIIIII4));
            } else {
                IiiiiiiiIIIII2[IiiiiiiiIIIII3 - 1] = new RoleShow();
                IiiiiiiiIIIII2[IiiiiiiiIIIII3 - 1].ALLATORIxDEMO(mes, index, IiiiiiiiIIIII4);
            }
            ++IiiiiiiiIIIII3;
            index = IiiiiiiiIIIII4 + 1;
        }
        bwdhTeam.setRoleShows(IiiiiiiiIIIII2);
        if (flag != 'T') {
            if (flag != 't') return;
            IIIIIiiiIiiII IiiiiiiiIIIII5 = (IIIIIiiiIiiII)IiiiiiiiIIIII.getFormManagement().iiiIiiiiiiIIi(179);
            IiiiiiiiIIIII5.ALLATORIxDEMO(bwdhTeam);
            return;
        }
        iiIiIiiiiIiii IiiiiiiiIIIII6 = (iiIiIiiiiIiii)IiiiiiiiIIIII.getFormManagement().iIiIiiiiIIiii(176);
        if (IiiiiiiiIIIII6 == null) {
            return;
        }
        if (IiiiiiiiIIIII6.iiiIiiiiiiIIi() != 0) return;
        iiIiIiiiiiIIi IiiiiiiiIIIII22 = (iiIiIiiiiiIIi)IiiiiiiiIIIII6.ALLATORIxDEMO()[0];
        IiiiiiiiIIIII22.ALLATORIxDEMO(bwdhTeam);
    }

    public void ALLATORIxDEMO(int index, String mes, Activity activity, GameClient gameClient) {
        GameView IiiiiiiiIIIII = gameClient.gameView;
        char IiiiiiiiIIIII2 = mes.charAt(index);
        int IiiiiiiiIIIII3 = mes.indexOf("|", index + 1);
        if (IiiiiiiiIIIII3 == -1) {
            IiiiiiiiIIIII3 = mes.length();
        }
        int IiiiiiiiIIIII4 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)mes, (int)(index + 1), (int)IiiiiiiiIIIII3);
        index = IiiiiiiiIIIII3 + 1;
        IiiiiiiiIIIII3 = 0;
        if (IiiiiiiiIIIII2 == 'L') {
            IiiiIiiiiIiII IiiiiiiiIIIII5 = (IiiiIiiiiIiII)IiiiiiiiIIIII.getFormManagement().iiiIiiiiiiIIi(169);
            IiiiiiiiIIIII5.ALLATORIxDEMO(mes, index);
            return;
        }
        if (IiiiiiiiIIIII2 != 'S') return;
        IIIIiiiiIIIIi IiiiiiiiIIIII6 = (IIIIiiiiIIIIi)IiiiiiiiIIIII.getFormManagement().iIiIiiiiIIiii(167);
        if (IiiiiiiiIIIII6 == null) {
            return;
        }
        iiIiiiiiIIiiI IiiiiiiiIIIII7 = (iiIiiiiiIIiiI)IiiiiiiiIIIII6.ALLATORIxDEMO(2, activity.getId());
        IiiIiiiiIIIIi IiiiiiiiIIIII8 = IiiiiiiiIIIII7 != null ? IiiiiiiiIIIII7.ALLATORIxDEMO() : null;
        if (IiiiiiiiIIIII8 == null) return;
        if (!IiiiiiiiIIIII8.isVisible()) return;
        if (IiiiiiiiIIIII8.ALLATORIxDEMO() != IiiiiiiiIIIII4) {
            return;
        }
        int[] IiiiiiiiIIIII9 = index < mes.length() ? new int[1 + IIiiIiiiiIIiI.ALLATORIxDEMO((char)',', (String)mes, (int)index, (int)mes.length())] : null;
        int IiiiiiiiIIIII10 = 0;
        int IiiiiiiiIIIII11 = IiiiiiiiIIIII9 != null ? IiiiiiiiIIIII9.length : 0;
        while (IiiiiiiiIIIII10 < IiiiiiiiIIIII11) {
            IiiiiiiiIIIII3 = mes.indexOf(",", index + 1);
            if (IiiiiiiiIIIII3 == -1 || IiiiiiiiIIIII3 > mes.length()) {
                IiiiiiiiIIIII3 = mes.length();
            }
            IiiiiiiiIIIII9[IiiiiiiiIIIII10] = IIiiIiiiiIIiI.ALLATORIxDEMO((String)mes, (int)index, (int)IiiiiiiiIIIII3);
            ++IiiiiiiiIIIII10;
            index = IiiiiiiiIIIII3 + 1;
        }
        IiiiiiiiIIIII8.ALLATORIxDEMO(IiiiiiiiIIIII9);
    }
}
