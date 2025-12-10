/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IiiIiiiiIIIIi
 *  com.xy.bean.Coordinates
 *  com.xy.bean.PathPoint
 *  com.xy.bean.PrivateData
 *  com.xy.bean.RoleMoveBean
 *  com.xy.bean.RoleShow
 *  com.xy.d.iiIiIiiiiIiii
 *  com.xy.formula.FormulaNum
 *  com.xy.formula.GoodType
 *  com.xy.game.RoleData
 *  com.xy.game.Task
 *  com.xy.game.TaskRecord
 *  com.xy.n.IIIIIiiiIiiII
 *  com.xy.n.iIiIIiiiIiiiI
 *  com.xy.n.iiIiIiiiiIiii
 *  com.xy.readbean.Door
 *  com.xy.readbean.Goodstable
 *  com.xy.readbean.NpcInfoBean
 *  com.xy.readbean.RoleTxBean
 *  com.xy.readbean.TaskData
 *  com.xy.richtext.InputBean
 *  com.xy.scene.BangFightScene
 *  com.xy.script.ScriptOpen
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.IiiiiiiiiIIII
 *  com.xy.v.iiIiiiiiIIiii
 */
package com.xy.game;

import com.xy.a.IiiIiiiiIIIIi;
import com.xy.bean.Coordinates;
import com.xy.bean.PathPoint;
import com.xy.bean.PrivateData;
import com.xy.bean.RoleMoveBean;
import com.xy.bean.RoleShow;
import com.xy.formula.FormulaNum;
import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.game.Task;
import com.xy.game.TaskRecord;
import com.xy.n.IIIIIiiiIiiII;
import com.xy.n.iIiIIiiiIiiiI;
import com.xy.n.iiIiIiiiiIiii;
import com.xy.readbean.Door;
import com.xy.readbean.Goodstable;
import com.xy.readbean.NpcInfoBean;
import com.xy.readbean.RoleTxBean;
import com.xy.readbean.TaskData;
import com.xy.richtext.InputBean;
import com.xy.scene.BangFightScene;
import com.xy.script.ScriptOpen;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.IiiiiiiiiIIII;
import com.xy.v.iiIiiiiiIIiii;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameUtil {
    public static final int CONFIRM_GEM_JD = 18;
    public static final int CONFIRM_GAME_BABY_FLHT = 30;
    public static final int CONFIRM_ROLE_RACECHANGE = 89;
    public static final int CONFIRM_BWDH_ENROLL = 33;
    public static final int EXCHANGE_0_CARD_GN = 81;
    public static final int CONFIRM_TASK_BUY = 17;
    public static final int CONFIRM_PET_DELETE = 11;
    public static final int CONFIRM_TRANS = 21;
    public static final int CONFIRM_BAO_DELETE = 8;
    public static final int CONFIRM_GEM_CX = 19;
    public static final int CONFIRM_BABY_ADD = 3;
    public static final int CONFIRM_GAME_LB_BUY = 87;
    public static final int CONFIRM_PET_JPDTL = 31;
    public static final int CONFIRM_GAME_EXIT = 27;
    public static final int CONFIRM_GAME_XY_BUY = 29;
    public static final int CONFIRM_BEAU = 34;
    public static final int CONFIRM_BABY_DELETE = 4;
    public static final int EXCHANGE_3_CARD_JJ = 84;
    public static final String ACTIVITY_CHONGJIPACK_TIME = "\u9650\u65f6\u793c\u5305";
    public static final int CONFIRM_GAME_ACTIVITY = 88;
    public static final int CONFIRM_PET_SKILL_DELETE = 12;
    public static final int CONFIRM_STARCARD_XZ = 20;
    public static final int CONFIRM_GANG_TW = 25;
    public static final int CONFIRM_BAO_Grid_SKILL = 6;
    public static final int CONFIRM_PET_LX_WASHPOINT = 13;
    public static final int CONFIRM_MOUNT_DELETE = 14;
    public static final int CONFIRM_GANG_TC = 24;
    public static final int CONFIRM_BAO_SKILL_DELETE = 7;
    public static final int EXCHANGE_5_ZM = 86;
    public static final int CONFIRM_BAO_TUPO = 9;
    public static final int EXCHANGE_1_CARD_XZ = 82;
    public static final int CONFIRM_BAO_KX = 10;
    public static final int CONFIRM_MOUNT_SH_GZ = 32;
    public static final int CONFIRM_GOOD_DELETE = 1;
    public static final int EXCHANGE_2 = 83;
    public static final int CONFIRM_GANG_TR = 26;
    public static final int CONFIRM_GAME_RWX = 28;
    public static final int CONFIRM_STARCARD_DEPOSIT = 2;
    public static final int CONFIRM_BAO_Grid_FUSHI = 5;
    public static final int CONFIRM_ROLE_GANG_WASHPOINT = 16;
    public static final int CONFIRM_BEAU_BUY = 35;
    public static final int CONFIRM_PAL_JH = 23;
    public static final int EXCHANGE_4_CARD_JF = 85;
    public static final String BEAU_TIME = "\u9753\u53f7";
    public static final int CONFIRM_XQ_FJ = 22;
    public static final int CONFIRM_ROLE_TYC_WASHPOINT = 15;

    public static int ALLATORIxDEMO(int id) {
        if (id >= 1600) {
            if (id <= 1615) return 1;
        }
        if (id == 6100) return 1;
        if (id == 7006) {
            return 1;
        }
        if (id >= 1400) {
            if (id <= 1415) return 2;
        }
        if (id == 6106) return 2;
        if (id == 7012) {
            return 2;
        }
        if (id >= 1100) {
            if (id <= 1115) return 3;
        }
        if (id == 6124) return 3;
        if (id == 7021) {
            return 3;
        }
        if (id >= 1200) {
            if (id <= 1215) return 4;
        }
        if (id == 6122) return 4;
        if (id == 7022) {
            return 4;
        }
        if (id >= 2200) {
            if (id <= 2215) return 5;
        }
        if (id == 6109) return 5;
        if (id == 7016) {
            return 5;
        }
        if (id >= 2400) {
            if (id <= 2415) return 6;
        }
        if (id == 6119) return 6;
        if (id == 7020) {
            return 6;
        }
        if (id >= 1300) {
            if (id <= 1315) return 7;
        }
        if (id == 6103) return 7;
        if (id == 7009) {
            return 7;
        }
        if (id >= 1700) {
            if (id <= 1715) return 8;
        }
        if (id == 6102) return 8;
        if (id == 7008) {
            return 8;
        }
        if (id >= 2100) {
            if (id <= 2115) return 9;
        }
        if (id == 7013) return 9;
        if (id == 6105) {
            return 9;
        }
        if (id >= 1000) {
            if (id <= 1015) return 10;
        }
        if (id == 6118) return 10;
        if (id == 7007) {
            return 10;
        }
        if (id == 7019) return 11;
        if (id == 6120) {
            return 11;
        }
        if (id >= 1800) {
            if (id <= 1815) return 12;
        }
        if (id == 6104) return 12;
        if (id == 7011) {
            return 12;
        }
        if (id >= 1900) {
            if (id <= 1915) return 13;
        }
        if (id == 6108) return 13;
        if (id == 7017) {
            return 13;
        }
        if (id >= 2200) {
            if (id <= 2215) return 14;
        }
        if (id == 6109) return 14;
        if (id == 7010) {
            return 14;
        }
        if (id >= 1500) {
            if (id <= 1515) return 15;
        }
        if (id == 7014) return 15;
        if (id == 6117) {
            return 15;
        }
        if (id >= 2000) {
            if (id <= 2015) return 16;
        }
        if (id == 6107) return 16;
        if (id == 7015) {
            return 16;
        }
        if (id == 7018) return 17;
        if (id == 6121) {
            return 17;
        }
        if (id >= 2617) {
            if (id <= 2632) return 18;
        }
        if (id == 6125) return 18;
        if (id != 7023) return 0;
        return 18;
    }

    public static void ALLATORIxDEMO(InputBean inputBean, GameView gameView) {
        inputBean.setM(false);
        if (inputBean.getType() == 1) {
            IiiIiiiiIIIIi IiiiiiiiIIIII = (IiiIiiiiIIIIi)gameView.getFormManagement().iiiIiiiiiiIIi(77);
            String IiiiiiiiIIIII2 = inputBean.getName().substring(1, inputBean.getName().length() - 1);
            IiiiiiiiIIIII.ALLATORIxDEMO(inputBean.getId(), IiiiiiiiIIIII2);
            return;
        }
        if (inputBean.getType() == 2 || inputBean.getType() == 3 || inputBean.getType() == 4) {
            String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"richm", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(inputBean));
            gameView.getClient().ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (inputBean.getType() == 15) {
            String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"stallget", (String)inputBean.getId().toString());
            gameView.getClient().ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (inputBean.getType() != 10 && inputBean.getType() != 20 && inputBean.getType() != 21 && inputBean.getType() != 22 && inputBean.getType() != 23 && inputBean.getType() != 24 && inputBean.getType() != 25 && inputBean.getType() != 26) {
            if (inputBean.getType() != 27) return;
        }
        if (gameView.getBattleScene() != null) {
            return;
        }
        Coordinates IiiiiiiiIIIII = inputBean.getZb();
        if (IiiiiiiiIIIII == null) return;
        RoleShow IiiiiiiiIIIII3 = gameView.roleUnit.iIiIiiiiIiIii;
        List IiiiiiiiIIIII4 = gameView.getObjectArea().ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII3.getMapid().intValue(), IiiiiiiiIIIII3.getX(), IiiiiiiiIIIII3.getY(), 0, IiiiiiiiIIIII.getMapID(), IiiiiiiiIIIII.getX(), IiiiiiiiIIIII.getY(), 0, 0, gameView.roleData);
        if (IiiiiiiiIIIII4 == null) {
            gameView.iiiIiiiiiiIIi("\u4f60\u6240\u5728\u4f4d\u7f6e\u65e0\u6cd5\u8fbe\u5230\u76ee\u7684\u5730");
            return;
        }
        if (inputBean.getType() == 21 || inputBean.getType() == 22 || inputBean.getType() == 23 || inputBean.getType() == 25 || inputBean.getType() == 27) {
            int IiiiiiiiIIIII5 = inputBean.getType() - 20;
            ScriptOpen IiiiiiiiIIIII6 = new ScriptOpen(IiiiiiiiIIIII5 == 1 ? 14 : 11, inputBean.getId().longValue());
            IiiiiiiiIIIII4.add(0, IiiiiiiiIIIII6);
        }
        gameView.automation.ALLATORIxDEMO(IiiiiiiiIIIII4);
    }

    /*
     * WARNING - void declaration
     */
    public static void ALLATORIxDEMO(int x, int y, int z, boolean isMove, GameView gameView) {
        int IiiiiiiiIIIII;
        RoleShow IiiiiiiiIIIII2;
        gameView.flyEquip = null;
        if (!gameView.getClient().iiiIiiiiiiIIi()) {
            gameView.iiiIiiiiiiIIi("\u91cd\u8fde\u4e2d,\u65f6\u95f4\u82e5\u592a\u957f\u91cd\u4e0a");
            return;
        }
        if (gameView.scene != null && gameView.scene instanceof BangFightScene && !((BangFightScene)gameView.scene).ALLATORIxDEMO()) {
            gameView.iIiIiiiiIIiii("\u4f60\u5f53\u524d\u72b6\u6001\u88ab\u9650\u5236");
            return;
        }
        if (x > 2 && x < gameView.mapScene.ALLATORIxDEMO() / 20 - 2 && y > 2 && y < gameView.mapScene.iIiIiiiiIIiii() / 20 - 2) {
            gameView.mapScene.ALLATORIxDEMO("\u70b9\u51fb", x * 20, y * 20);
        }
        if ((IiiiiiiiIIIII2 = gameView.roleUnit.iIiIiiiiIiIii).getFighting() != 0) return;
        if (IiiiiiiiIIIII2.getBooth_id() != null) return;
        if (!gameView.roleUnit.iIiIiiiiIIiIi()) {
            return;
        }
        int IiiiiiiiIIIII3 = gameView.mapScene.ALLATORIxDEMO().getMapMove();
        int n = IiiiiiiiIIIII = gameView.roleUnit.iIiIiiiiIIiii(gameView) ? 1 : 0;
        if (IiiiiiiiIIIII3 >= IiiiiiiiIIIII) {
            IiiiiiiiIIIII = 0;
        }
        if (isMove && gameView.mapScene.ALLATORIxDEMO(x, y, 0)) {
            IiiiiiiiIIIII = 1;
        }
        int IiiiiiiiIIIII4 = IiiiiiiiIIIII2.getX() / 20;
        int IiiiiiiiIIIII5 = IiiiiiiiIIIII2.getY() / 20;
        if (IiiiiiiiIIIII4 == x && IiiiiiiiIIIII5 == y) {
            return;
        }
        if (IiiiiiiiIIIII != 0) {
            ArrayList<PathPoint> IiiiiiiiIIIII6 = new ArrayList<PathPoint>();
            IiiiiiiiIIIII6.add(new PathPoint(IiiiiiiiIIIII2.getX(), IiiiiiiiIIIII2.getY()));
            IiiiiiiiIIIII6.add(new PathPoint(x * 20 + 10, y * 20 + 10));
            GameUtil.ALLATORIxDEMO(IiiiiiiiIIIII6, gameView);
            return;
        }
        if (gameView.mapScene.ALLATORIxDEMO(IiiiiiiiIIIII4, IiiiiiiiIIIII5, 0)) {
            void IiiiiiiiIIIII7;
            ArrayList<PathPoint> arrayList = new ArrayList<PathPoint>();
            arrayList.add(new PathPoint(IiiiiiiiIIIII2.getX(), IiiiiiiiIIIII2.getY()));
            IiiiiiiiIIIII7.add(new PathPoint(x * 20 + 10, y * 20 + 10));
            GameUtil.ALLATORIxDEMO((List<PathPoint>)IiiiiiiiIIIII7, gameView);
            return;
        }
        List IiiiiiiiIIIII8 = iiIiIiiiiIiii.ALLATORIxDEMO((int)IiiiiiiiIIIII4, (int)IiiiiiiiIIIII5, (int)0, (int)x, (int)y, (int)0, (com.xy.d.iiIiIiiiiIiii)gameView.roleUnit, (IIIIIiiiIiiII)gameView.mapCamera.iIiIiiiiIiIii.iIiiIiiiiiiII);
        GameUtil.ALLATORIxDEMO(IiiiiiiiIIIII8, gameView);
    }

    public static void ALLATORIxDEMO(FormulaNum[] npcs, iIiIIiiiIiiiI mapScene, IiiiiiiiiIIII objectArea) {
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = npcs != null ? npcs.length : 0;
        while (IiiiiiiiIIIII < IiiiiiiiIIIII2) {
            FormulaNum IiiiiiiiIIIII3 = npcs[IiiiiiiiIIIII];
            int IiiiiiiiIIIII4 = 0;
            int IiiiiiiiIIIII5 = IiiiiiiiIIIII3.getSize();
            while (IiiiiiiiIIIII4 < IiiiiiiiIIIII5) {
                long IiiiiiiiIIIII6 = IiiiiiiiIIIII3.getZhi(IiiiiiiiIIIII4);
                NpcInfoBean IiiiiiiiIIIII7 = objectArea.ALLATORIxDEMO(String.valueOf(IiiiiiiiIIIII6));
                if (IiiiiiiiIIIII7 != null) {
                    if (IiiiiiiiIIIII7.getNpctable().getNpctype().equals("2") && IiiiiiiiIIIII7.getDoors() == null) {
                        ArrayList<Door> IiiiiiiiIIIII8 = new ArrayList<Door>();
                        if (IiiiiiiiIIIII7.getNpctable().getNpcway() != null) {
                            List IiiiiiiiIIIII9 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII7.getNpctable().getNpcway());
                            int IiiiiiiiIIIII10 = 0;
                            while (IiiiiiiiIIIII10 < IiiiiiiiIIIII9.size()) {
                                Door IiiiiiiiIIIII11 = objectArea.ALLATORIxDEMO((String)IiiiiiiiIIIII9.get(IiiiiiiiIIIII10));
                                if (IiiiiiiiIIIII11 != null) {
                                    IiiiiiiiIIIII8.add(IiiiiiiiIIIII11);
                                }
                                ++IiiiiiiiIIIII10;
                            }
                        }
                        IiiiiiiiIIIII7.setDoors(IiiiiiiiIIIII8);
                    }
                    mapScene.ALLATORIxDEMO(IiiiiiiiIIIII7);
                }
                ++IiiiiiiiIIIII4;
            }
            ++IiiiiiiiIIIII;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static Map<Integer, TaskRecord> ALLATORIxDEMO(RoleData roleData) {
        HashMap<Integer, TaskRecord> IiiiiiiiIIIII = new HashMap<Integer, TaskRecord>();
        PrivateData IiiiiiiiIIIII2 = roleData.getPrivateData();
        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII2.getTaskComplete())) {
            return IiiiiiiiIIIII;
        }
        String IiiiiiiiIIIII3 = IiiiiiiiIIIII2.getTaskComplete();
        int IiiiiiiiIIIII4 = 0;
        int IiiiiiiiIIIII5 = 0;
        while (IiiiiiiiIIIII5 != IiiiiiiiIIIII3.length()) {
            IiiiiiiiIIIII5 = IiiiiiiiIIIII3.indexOf("|", IiiiiiiiIIIII4 + 1);
            if (IiiiiiiiIIIII5 == -1) {
                IiiiiiiiIIIII5 = IiiiiiiiIIIII3.length();
            }
            try {
                void IiiiiiiiIIIII6;
                String[] IiiiiiiiIIIII7 = IiiiiiiiIIIII3.substring(IiiiiiiiIIIII4, IiiiiiiiIIIII5).split("-");
                TaskRecord taskRecord = new TaskRecord(Integer.parseInt(IiiiiiiiIIIII7[0]));
                IiiiiiiiIIIII6.iIiIiiiiIIiii(Integer.parseInt(IiiiiiiiIIIII7[1]));
                taskRecord.ALLATORIxDEMO(Integer.parseInt(IiiiiiiiIIIII7[2]));
                int IiiiiiiiIIIII8 = 3;
                while (IiiiiiiiIIIII8 < IiiiiiiiIIIII7.length) {
                    if (IiiiiiiiIIIII7[IiiiiiiiIIIII8].startsWith("B")) {
                        IiiiiiiiIIIII6.setbSum(Integer.parseInt(IiiiiiiiIIIII7[IiiiiiiiIIIII8].substring(1)));
                    } else {
                        IiiiiiiiIIIII6.setNewID(Integer.parseInt(IiiiiiiiIIIII7[IiiiiiiiIIIII8]));
                    }
                    ++IiiiiiiiIIIII8;
                }
                IiiiiiiiIIIII.put(IiiiiiiiIIIII6.getTaskId(), (TaskRecord)IiiiiiiiIIIII6);
            }
            catch (Exception IiiiiiiiIIIII9) {
                IiiiiiiiIIIII9.printStackTrace();
            }
            IiiiiiiiIIIII4 = IiiiiiiiIIIII5 + 1;
        }
        return IiiiiiiiIIIII;
    }

    public static String getRoleSkin(String skin, List<String> txs, RoleShow roleShow, RoleData roleData) {
        Object IiiiiiiiIIIII;
        Goodstable IiiiiiiiIIIII2;
        StringBuffer IiiiiiiiIIIII3 = new StringBuffer();
        if (skin != null && !skin.equals("")) {
            IiiiiiiiIIIII3.append("S");
            IiiiiiiiIIIII3.append(skin);
        } else if (roleData.goodChoses[0] != null) {
            IiiiiiiiIIIII2 = roleData.getGoodEquip(roleData.goodChoses[0]);
            long IiiiiiiiIIIII4 = roleShow.getSpecies_id().longValue();
            long IiiiiiiiIIIII5 = GameUtil.ALLATORIxDEMO(Integer.parseInt(IiiiiiiiIIIII2.getSkin()));
            if (IiiiiiiiIIIII5 != 0L) {
                IiiiiiiiIIIII3.append("S");
                IiiiiiiiIIIII3.append((IiiiiiiiIIIII5 += 18L) << 32 | IiiiiiiiIIIII4);
            }
        }
        if (roleData.getGameView().getClient().gameType == 2) {
            int IiiiiiiiIIIII6 = 0;
            while (IiiiiiiiIIIII6 <= 5) {
                Goodstable IiiiiiiiIIIII7;
                if (IiiiiiiiIIIII6 != 4 && roleData.goodChoses[IiiiiiiiIIIII6] != null && GoodType.iiiIIiiiiIIii((long)(IiiiiiiiIIIII7 = roleData.getGoodEquip(roleData.goodChoses[IiiiiiiiIIIII6])).getType()) && (IiiiiiiiIIIII = IIiiIiiiiIIiI.iIiIiiiiIIiii((String)IiiiiiiiIIIII7.getValue(), (String)"\u9636\u6570=", (String)"|")) != null && Integer.parseInt((String)IiiiiiiiIIIII) >= 6) {
                    RoleTxBean IiiiiiiiIIIII8 = roleData.getObjectArea().ALLATORIxDEMO(1205);
                    if (IiiiiiiiIIIII3.length() != 0) {
                        IiiiiiiiIIIII3.append("|");
                    }
                    if (IiiiiiiiIIIII8.getRdType() == 1) {
                        IiiiiiiiIIIII3.append("X");
                    } else if (IiiiiiiiIIIII8.getRdType() == 2) {
                        IiiiiiiiIIIII3.append("P");
                    } else {
                        IiiiiiiiIIIII3.append("J");
                    }
                    IiiiiiiiIIIII3.append(IiiiiiiiIIIII8.getRdId());
                    if (IiiiiiiiIIIII8.getRdType() != 1 && IiiiiiiiIIIII8.getRdType() != 2) break;
                    IiiiiiiiIIIII3.append("_");
                    IiiiiiiiIIIII3.append(IiiiiiiiIIIII8.getRdStatues() - IiiiiiiiIIIII8.getRdType());
                    break;
                }
                ++IiiiiiiiIIIII6;
            }
        }
        if (txs != null) {
            int IiiiiiiiIIIII9 = 0;
            while (IiiiiiiiIIIII9 < txs.size()) {
                int IiiiiiiiIIIII10 = Integer.parseInt(txs.get(IiiiiiiiIIIII9));
                IiiiiiiiIIIII = roleData.getObjectArea().ALLATORIxDEMO(IiiiiiiiIIIII10);
                if (IiiiiiiiIIIII != null) {
                    if (IiiiiiiiIIIII3.length() != 0) {
                        IiiiiiiiIIIII3.append("|");
                    }
                    if (IiiiiiiiIIIII.getRdType() == 1) {
                        IiiiiiiiIIIII3.append("X");
                    } else if (IiiiiiiiIIIII.getRdType() == 2) {
                        IiiiiiiiIIIII3.append("P");
                    } else {
                        IiiiiiiiIIIII3.append("J");
                    }
                    IiiiiiiiIIIII3.append(IiiiiiiiIIIII.getRdId());
                    if (IiiiiiiiIIIII.getRdType() == 1 || IiiiiiiiIIIII.getRdType() == 2) {
                        IiiiiiiiIIIII3.append("_");
                        IiiiiiiiIIIII3.append(IiiiiiiiIIIII.getRdStatues() - IiiiiiiiIIIII.getRdType());
                    }
                }
                ++IiiiiiiiIIIII9;
            }
        }
        if (roleShow.getTitle() != null && (IiiiiiiiIIIII2 = roleData.getObjectArea().ALLATORIxDEMO(roleShow.getTitle())) != null && IiiiiiiiIIIII2.getSkin() != null) {
            if (IiiiiiiiIIIII3.length() != 0) {
                IiiiiiiiIIIII3.append("|");
            }
            IiiiiiiiIIIII3.append("C");
            IiiiiiiiIIIII3.append(IiiiiiiiIIIII2.getSkin());
        }
        if (roleData.goodChoses[12] == null) return IiiiiiiiIIIII3.toString();
        if (IiiiiiiiIIIII3.length() != 0) {
            IiiiiiiiIIIII3.append("|");
        }
        IiiiiiiiIIIII3.append("B");
        IiiiiiiiIIIII3.append(roleData.getGoodEquip(roleData.goodChoses[12]).getSkin());
        return IiiiiiiiIIIII3.toString();
    }

    /*
     * WARNING - void declaration
     */
    public static List<Task> ALLATORIxDEMO(RoleData roleData) {
        ArrayList<Task> IiiiiiiiIIIII = new ArrayList<Task>();
        IiiiiiiiiIIII IiiiiiiiIIIII2 = roleData.getObjectArea();
        PrivateData IiiiiiiiIIIII3 = roleData.getPrivateData();
        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII3.getTaskData())) {
            return IiiiiiiiIIIII;
        }
        String IiiiiiiiIIIII4 = IiiiiiiiIIIII3.getTaskData();
        int IiiiiiiiIIIII5 = 0;
        int IiiiiiiiIIIII6 = 0;
        while (IiiiiiiiIIIII6 != IiiiiiiiIIIII4.length()) {
            void IiiiiiiiIIIII7;
            IiiiiiiiIIIII6 = IiiiiiiiIIIII4.indexOf("|", IiiiiiiiIIIII5 + 1);
            if (IiiiiiiiIIIII6 == -1) {
                IiiiiiiiIIIII6 = IiiiiiiiIIIII4.length();
            }
            String[] stringArray = IiiiiiiiIIIII4.substring(IiiiiiiiIIIII5, IiiiiiiiIIIII6).split("=");
            int IiiiiiiiIIIII8 = Integer.parseInt((String)IiiiiiiiIIIII7[0]);
            int IiiiiiiiIIIII9 = Integer.parseInt((String)IiiiiiiiIIIII7[1]);
            TaskData IiiiiiiiIIIII10 = IiiiiiiiIIIII2.ALLATORIxDEMO(IiiiiiiiIIIII8);
            if (IiiiiiiiIIIII10 != null) {
                void IiiiiiiiIIIII11;
                Task task = new Task(IiiiiiiiIIIII8, IiiiiiiiIIIII9, IiiiiiiiIIIII10);
                IiiiiiiiIIIII11.ALLATORIxDEMO((String[])IiiiiiiiIIIII7, IiiiiiiiIIIII2);
                IiiiiiiiIIIII.add((Task)IiiiiiiiIIIII11);
            }
            IiiiiiiiIIIII5 = IiiiiiiiIIIII6 + 1;
        }
        return IiiiiiiiIIIII;
    }

    /*
     * WARNING - void declaration
     */
    public static void ALLATORIxDEMO(List<PathPoint> points, GameView gameView) {
        void IiiiiiiiIIIII;
        if (points == null) {
            return;
        }
        RoleMoveBean roleMoveBean = new RoleMoveBean();
        IiiiiiiiIIIII.setPaths(points);
        String IiiiiiiiIIIII2 = Agreement.getSendText((String)"move", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII));
        gameView.getClient().ALLATORIxDEMO(IiiiiiiiIIIII2);
        gameView.roleUnit.ALLATORIxDEMO(points, gameView.roleUnit.iIiIiiiiIiIii.getSp());
    }

    /*
     * WARNING - void declaration
     */
    public static void ALLATORIxDEMO(int n, int n2, int n3, GameView gameView) {
        void z;
        void y;
        void gameView2;
        gameView2.automation.ALLATORIxDEMO(false, 0);
        GameUtil.ALLATORIxDEMO(n, (int)y, (int)z, false, (GameView)gameView2);
    }
}
