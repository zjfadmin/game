/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IIIIIiiiIiiII
 *  com.xy.a.IiIIIiiiIIIiI
 *  com.xy.a.iIIiiiiiIIIIi
 *  com.xy.a.iiIiIiiiiIIII
 *  com.xy.a.q.iIIIiiiiiIiIi
 *  com.xy.bean.LoginResult
 *  com.xy.bean.RoleShow
 *  com.xy.d.IIIIIiiiIiIii
 *  com.xy.game.GameUtil
 *  com.xy.game.RoleData
 *  com.xy.game.Task
 *  com.xy.game.TaskProgress
 *  com.xy.game.TaskRecord
 *  com.xy.q.IIiiIiiiIIiIi
 *  com.xy.readbean.TaskData
 *  com.xy.readbean.TaskSet
 *  com.xy.readbean.TaskTQ
 *  com.xy.socket.Agreement
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.IiiiIiiiiIIII
 */
package com.xy.game;

import com.xy.a.IIIIIiiiIiiII;
import com.xy.a.IiIIIiiiIIIiI;
import com.xy.a.iIIiiiiiIIIIi;
import com.xy.a.iiIiIiiiiIIII;
import com.xy.a.q.iIIIiiiiiIiIi;
import com.xy.bean.LoginResult;
import com.xy.bean.RoleShow;
import com.xy.d.IIIIIiiiIiIii;
import com.xy.game.GameUtil;
import com.xy.game.RoleData;
import com.xy.game.Task;
import com.xy.game.TaskProgress;
import com.xy.game.TaskRecord;
import com.xy.q.IIiiIiiiIIiIi;
import com.xy.readbean.TaskData;
import com.xy.readbean.TaskSet;
import com.xy.readbean.TaskTQ;
import com.xy.socket.Agreement;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.IiiiIiiiiIIII;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class RoleTaskData {
    public static final int canAccept = 1;
    private Map<Integer, TaskRecord> taskRecordMap;
    private List<IIIIIiiiIiIii> units;
    private List<Task> taskList;
    public static final int cannotAccept = 0;
    public static final int quxiao = 8;
    public static final int completeTask = 3;
    public static final int finishTask = 4;
    public static final int quxiaoTime = 9;
    private static List<IIIIIiiiIiIii> npcUnits;
    private boolean limitFlyFlag = false;
    public static final int doTasking = 2;
    public long time;
    private static Object LOCK;
    public RoleData roleData;

    public boolean ALLATORIxDEMO(int TeamSum, String lvl) {
        String[] IiiiiiiiIIIII;
        String[] IiiiiiiiIIIII2;
        int IiiiiiiiIIIII3 = 0;
        int IiiiiiiiIIIII4 = 200;
        int IiiiiiiiIIIII5 = 0;
        int IiiiiiiiIIIII6 = 4;
        int IiiiiiiiIIIII7 = 200;
        if (lvl != null && !lvl.equals("")) {
            IiiiiiiiIIIII2 = lvl.split("\\|");
            IiiiiiiiIIIII = IiiiiiiiIIIII2[0].split("\\-");
            IiiiiiiiIIIII3 = Integer.parseInt(IiiiiiiiIIIII[0]);
            IiiiiiiiIIIII4 = Integer.parseInt(IiiiiiiiIIIII[1]);
            if (IiiiiiiiIIIII2.length >= 2) {
                IiiiiiiiIIIII5 = Integer.parseInt(IiiiiiiiIIIII2[1]);
            }
            if (IiiiiiiiIIIII2.length == 3) {
                IiiiiiiiIIIII = IiiiiiiiIIIII2[2].split("\\-");
                IiiiiiiiIIIII6 = Integer.parseInt(IiiiiiiiIIIII[0]);
                IiiiiiiiIIIII7 = Integer.parseInt(IiiiiiiiIIIII[1]);
            }
        }
        IiiiiiiiIIIII2 = this.roleData.getGameView();
        if (!IiiiiiiiIIIII2.roleUnit.iIiIiiiiIIiIi()) {
            return false;
        }
        IiiiiiiiIIIII = IiiiiiiiIIIII2.roleUnit.ALLATORIxDEMO();
        if (TeamSum == 0) {
            if (IiiiiiiiIIIII != null && IiiiiiiiIIIII.length > 1) {
                IiiiiiiiIIIII2.iiiIiiiiiiIIi("\u8be5\u4efb\u52a1\u53ea\u80fd\u4e00\u4e2a\u4eba\u5b8c\u6210");
                return false;
            }
            int IiiiiiiiIIIII8 = IiiiIiiiiIIII.ALLATORIxDEMO((int)IiiiiiiiIIIII2.roleUnit.iIiIiiiiIiIii.getGrade());
            if (IiiiiiiiIIIII8 < IiiiiiiiIIIII3 || IiiiiiiiIIIII8 > IiiiiiiiIIIII4) {
                IiiiiiiiIIIII2.iiiIiiiiiiIIi("\u7b49\u7ea7\u4e0d\u6ee1\u8db3\u5728" + IiiiiiiiIIIII3 + "-" + IiiiiiiiIIIII4 + "\u8303\u56f4");
                return false;
            }
            int IiiiiiiiIIIII9 = IiiiiiiiIIIII2.roleUnit.iIiIiiiiIiIii.getTurnAround();
            if (IiiiiiiiIIIII9 < IiiiiiiiIIIII5) {
                IiiiiiiiIIIII2.iiiIiiiiiiIIi("\u8f6c\u751f\u6b21\u6570\u6700\u5c11" + IiiiiiiiIIIII5 + "\u6b21");
                return false;
            }
            if (IiiiiiiiIIIII9 <= IiiiiiiiIIIII6) {
                if (IiiiiiiiIIIII9 != IiiiiiiiIIIII6) return true;
                if (IiiiiiiiIIIII8 <= IiiiiiiiIIIII7) return true;
            }
            IiiiiiiiIIIII2.iiiIiiiiiiIIi("\u6700\u5927\u5230" + IiiiiiiiIIIII6 + "\u8f6c" + IiiiiiiiIIIII7 + "\u7ea7");
            return false;
        }
        if (TeamSum == 1) {
            int IiiiiiiiIIIII10 = IiiiIiiiiIIII.ALLATORIxDEMO((int)IiiiiiiiIIIII2.roleUnit.iIiIiiiiIiIii.getGrade());
            if (IiiiiiiiIIIII10 < IiiiiiiiIIIII3 || IiiiiiiiIIIII10 > IiiiiiiiIIIII4) {
                IiiiiiiiIIIII2.iiiIiiiiiiIIi("\u7b49\u7ea7\u4e0d\u6ee1\u8db3\u5728" + IiiiiiiiIIIII3 + "-" + IiiiiiiiIIIII4 + "\u8303\u56f4");
                return false;
            }
            int IiiiiiiiIIIII11 = IiiiiiiiIIIII2.roleUnit.iIiIiiiiIiIii.getTurnAround();
            if (IiiiiiiiIIIII11 < IiiiiiiiIIIII5) {
                IiiiiiiiIIIII2.iiiIiiiiiiIIi("\u8f6c\u751f\u6b21\u6570\u6700\u5c11" + IiiiiiiiIIIII5 + "\u6b21");
                return false;
            }
            if (IiiiiiiiIIIII11 <= IiiiiiiiIIIII6) {
                if (IiiiiiiiIIIII11 != IiiiiiiiIIIII6) return true;
                if (IiiiiiiiIIIII10 <= IiiiiiiiIIIII7) return true;
            }
            IiiiiiiiIIIII2.iiiIiiiiiiIIi("\u6700\u5927\u5230" + IiiiiiiiIIIII6 + "\u8f6c" + IiiiiiiiIIIII7 + "\u7ea7");
            return false;
        }
        if (IiiiiiiiIIIII == null) return true;
        int IiiiiiiiIIIII12 = 0;
        LoginResult IiiiiiiiIIIII13 = this.roleData.getLoginResult();
        if (IiiiiiiiIIIII13.getPals() != null && !IiiiiiiiIIIII13.getPals().equals("")) {
            IiiiiiiiIIIII12 = IiiiiiiiIIIII13.getPals().split("\\|").length;
        }
        if (IiiiiiiiIIIII.length + IiiiiiiiIIIII12 < TeamSum) {
            IiiiiiiiIIIII2.iiiIiiiiiiIIi("\u961f\u4f0d\u4eba\u6570\u4e0d\u591f" + TeamSum + "\u4e2a\u4eba,\u5148\u51d1\u9f50\u4eba\u6570\u5728\u6765\u5427");
            return false;
        }
        int IiiiiiiiIIIII14 = 0;
        while (IiiiiiiiIIIII14 < IiiiiiiiIIIII.length) {
            RoleShow IiiiiiiiIIIII15 = IiiiiiiiIIIII2.mapScene.ALLATORIxDEMO((String)IiiiiiiiIIIII[IiiiiiiiIIIII14]).iIiIiiiiIiIii;
            int IiiiiiiiIIIII16 = IiiiIiiiiIIII.ALLATORIxDEMO((int)IiiiiiiiIIIII15.getGrade());
            if (IiiiiiiiIIIII16 < IiiiiiiiIIIII3 || IiiiiiiiIIIII16 > IiiiiiiiIIIII4) {
                IiiiiiiiIIIII2.iiiIiiiiiiIIi("\u961f\u4f0d\u7b49\u7ea7\u4e0d\u6ee1\u8db3\u5728" + IiiiiiiiIIIII3 + "-" + IiiiiiiiIIIII4 + "\u8303\u56f4");
                return false;
            }
            int IiiiiiiiIIIII17 = IiiiiiiiIIIII15.getTurnAround();
            if (IiiiiiiiIIIII17 < IiiiiiiiIIIII5) {
                IiiiiiiiIIIII2.iiiIiiiiiiIIi("\u8f6c\u751f\u6b21\u6570\u6700\u5c11" + IiiiiiiiIIIII5 + "\u6b21");
                return false;
            }
            if (IiiiiiiiIIIII17 > IiiiiiiiIIIII6 || IiiiiiiiIIIII17 == IiiiiiiiIIIII6 && IiiiiiiiIIIII16 > IiiiiiiiIIIII7) {
                IiiiiiiiIIIII2.iiiIiiiiiiIIi("\u6700\u5927\u5230" + IiiiiiiiIIIII6 + "\u8f6c" + IiiiiiiiIIIII7 + "\u7ea7");
                return false;
            }
            ++IiiiiiiiIIIII14;
        }
        return true;
    }

    public boolean ALLATORIxDEMO(Task task) {
        TaskData taskData = task.getTaskData();
        String IiiiiiiiIIIII = taskData.getLvl();
        int IiiiiiiiIIIII2 = taskData.getTeamSum();
        return this.ALLATORIxDEMO(IiiiiiiiIIIII2, IiiiiiiiIIIII);
    }

    public TaskProgress ALLATORIxDEMO(int npcid) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.taskList.size()) {
            Task IiiiiiiiIIIII2 = this.taskList.get(IiiiiiiiIIIII);
            int IiiiiiiiIIIII3 = 0;
            while (IiiiiiiiIIIII3 < IiiiiiiiIIIII2.getProgress().size()) {
                TaskProgress IiiiiiiiIIIII4 = (TaskProgress)IiiiiiiiIIIII2.getProgress().get(IiiiiiiiIIIII3);
                if (IiiiiiiiIIIII4.getType() == 2 && IiiiiiiiIIIII4.getSum() < IiiiiiiiIIIII4.getMax() && IiiiiiiiIIIII4.getDId() == npcid) {
                    return IiiiiiiiIIIII4;
                }
                ++IiiiiiiiIIIII3;
            }
            ++IiiiiiiiIIIII;
        }
        return null;
    }

    public void ALLATORIxDEMO(String mes) {
        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)mes)) {
            return;
        }
        boolean IiiiiiiiIIIII = false;
        IIIIIiiiIiiII IiiiiiiiIIIII2 = (IIIIIiiiIiiII)this.roleData.getGameView().getFormManagement().iIiIiiiiIIiii(3);
        int IiiiiiiiIIIII3 = 0;
        int IiiiiiiiIIIII4 = 0;
        int IiiiiiiiIIIII5 = 0;
        while (IiiiiiiiIIIII5 < mes.length()) {
            String[] IiiiiiiiIIIII6;
            IiiiiiiiIIIII5 = mes.indexOf("|", IiiiiiiiIIIII4 + 1);
            if (IiiiiiiiIIIII5 == -1) {
                IiiiiiiiIIIII5 = mes.length();
            }
            if (mes.charAt(IiiiiiiiIIIII4) == 'C') {
                IiiiiiiiIIIII6 = mes.substring(IiiiiiiiIIIII4 + 1, IiiiiiiiIIIII5).split("=");
                this.ALLATORIxDEMO(IiiiiiiiIIIII6);
            } else {
                IiiiiiiiIIIII6 = mes.substring(IiiiiiiiIIIII4, IiiiiiiiIIIII5).split("=");
                int IiiiiiiiIIIII7 = Integer.parseInt(IiiiiiiiIIIII6[0]);
                int IiiiiiiiIIIII8 = Integer.parseInt(IiiiiiiiIIIII6[1]);
                Task IiiiiiiiIIIII9 = this.ALLATORIxDEMO(IiiiiiiiIIIII7, IiiiiiiiIIIII8, IiiiiiiiIIIII6);
                if (IiiiiiiiIIIII2 != null && IiiiiiiiIIIII2.iiiIiiiiiiIIi() == IiiiiiiiIIIII7) {
                    IiiiiiiiIIIII = true;
                }
                if (IiiiiiiiIIIII9 != null) {
                    this.roleData.getGameView().automation.ALLATORIxDEMO(IiiiiiiiIIIII9, IiiiiiiiIIIII8);
                }
            }
            ++IiiiiiiiIIIII3;
            IiiiiiiiIIIII4 = IiiiiiiiIIIII5 + 1;
        }
        this.iIiIiiiiIIiii();
        if (IiiiiiiiIIIII2 == null) return;
        IiiiiiiiIIIII2.iiiIiiiiiiIIi();
        if (!IiiiiiiiIIIII) return;
        IiiiiiiiIIIII2.ALLATORIxDEMO(null, null);
    }

    public Task ALLATORIxDEMO(String type, String name) {
        int IiiiiiiiIIIII = this.taskList.size() - 1;
        while (IiiiiiiiIIIII >= 0) {
            Task IiiiiiiiIIIII2 = this.taskList.get(IiiiiiiiIIIII);
            if (IiiiiiiiIIIII2.ALLATORIxDEMO(type, name) != 0) {
                return IiiiiiiiIIIII2;
            }
            --IiiiiiiiIIIII;
        }
        return null;
    }

    public int ALLATORIxDEMO(int taskSetID, int type) {
        TaskRecord IiiiiiiiIIIII = this.getTaskRecord(taskSetID);
        if (IiiiiiiiIIIII == null) {
            if (type != 4) return 0;
            return 10;
        }
        if (type == 1) {
            return IiiiiiiiIIIII.getrSum();
        }
        if (type == 2) {
            return IiiiiiiiIIIII.getcSum();
        }
        if (type == 3) {
            return IiiiiiiiIIIII.getNewID();
        }
        if (type == 4) {
            return 10 - IiiiiiiiIIIII.getcSum() + IiiiiiiiIIIII.getrSum();
        }
        if (type != 5) return 0;
        return IiiiiiiiIIIII.getbSum();
    }

    public void iIiIiiiiIIiIi() {
        this.taskList = GameUtil.ALLATORIxDEMO((RoleData)this.roleData);
        this.taskRecordMap = GameUtil.ALLATORIxDEMO((RoleData)this.roleData);
        this.iIiIiiiiIIiii();
    }

    public synchronized Task iIiIiiiiIIiii(int id, int state) {
        TaskData IiiiiiiiIIIII = this.roleData.getObjectArea().ALLATORIxDEMO(id);
        Task IiiiiiiiIIIII2 = new Task(id, state, IiiiiiiiIIIII);
        IiiiiiiiIIIII2.setTaskId(id);
        IiiiiiiiIIIII2.setTaskState(state);
        return IiiiiiiiIIIII2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public TaskRecord getTaskRecord(int sid) {
        TaskRecord IiiiiiiiIIIII = this.taskRecordMap.get(sid);
        if (IiiiiiiiIIIII != null) {
            return IiiiiiiiIIIII;
        }
        Map<Integer, TaskRecord> map = this.taskRecordMap;
        synchronized (map) {
            IiiiiiiiIIIII = this.taskRecordMap.get(sid);
            if (IiiiiiiiIIIII != null) {
                return IiiiiiiiIIIII;
            }
            IiiiiiiiIIIII = new TaskRecord(sid);
            this.taskRecordMap.put(sid, IiiiiiiiIIIII);
            return IiiiiiiiIIIII;
        }
    }

    public boolean getTaskGive(int npcId) {
        int IiiiiiiiIIIII = this.taskList.size() - 1;
        while (IiiiiiiiIIIII >= 0) {
            Task IiiiiiiiIIIII2 = this.taskList.get(IiiiiiiiIIIII);
            int IiiiiiiiIIIII3 = 0;
            while (IiiiiiiiIIIII3 < IiiiiiiiIIIII2.getProgress().size()) {
                TaskProgress IiiiiiiiIIIII4 = (TaskProgress)IiiiiiiiIIIII2.getProgress().get(IiiiiiiiIIIII3);
                if (IiiiiiiiIIIII4.getType() == 4 && IiiiiiiiIIIII4.getGId() == npcId) {
                    return true;
                }
                ++IiiiiiiiIIIII3;
            }
            --IiiiiiiiIIIII;
        }
        return false;
    }

    public int getTaskSetNum(TaskSet taskSet, int type) {
        int IiiiiiiiIIIII;
        int n = IiiiiiiiIIIII = type == 1 ? taskSet.getSumreceive() : taskSet.getSumlimit();
        if (IiiiiiiiIIIII == 0) {
            return IiiiiiiiIIIII;
        }
        TaskTQ IiiiiiiiIIIII2 = taskSet.getTq();
        if (IiiiiiiiIIIII2 == null) return IiiiiiiiIIIII;
        if (IiiiiiiiIIIII2.ALLATORIxDEMO() && this.roleData.getLimit("\u5b63\u5361") != null) {
            IiiiiiiiIIIII += type == 1 ? IiiiiiiiIIIII2.getReceiveNum() : IiiiiiiiIIIII2.getLimitNum();
        }
        if (IiiiiiiiIIIII2.getBuyNum() <= 0) return IiiiiiiiIIIII;
        IiiiiiiiIIIII += (type == 1 ? IiiiiiiiIIIII2.getReceiveNum() : IiiiiiiiIIIII2.getLimitNum()) * this.ALLATORIxDEMO(taskSet.getTaskSetID(), 5);
        return IiiiiiiiIIIII;
    }

    public List<IIIIIiiiIiIii> getUnits() {
        return this.units;
    }

    public static String getMinLvl(String lvl) {
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = 200;
        int IiiiiiiiIIIII4 = 4;
        int IiiiiiiiIIIII5 = 200;
        if (lvl != null && !lvl.equals("")) {
            String[] IiiiiiiiIIIII6 = lvl.split("\\|");
            String[] IiiiiiiiIIIII7 = IiiiiiiiIIIII6[0].split("\\-");
            IiiiiiiiIIIII2 = Integer.parseInt(IiiiiiiiIIIII7[0]);
            IiiiiiiiIIIII3 = Integer.parseInt(IiiiiiiiIIIII7[1]);
            if (IiiiiiiiIIIII6.length >= 2) {
                IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII6[1]);
            }
            if (IiiiiiiiIIIII6.length == 3) {
                IiiiiiiiIIIII7 = IiiiiiiiIIIII6[2].split("\\-");
                IiiiiiiiIIIII4 = Integer.parseInt(IiiiiiiiIIIII7[0]);
                IiiiiiiiIIIII5 = Integer.parseInt(IiiiiiiiIIIII7[1]);
            }
        }
        if (IiiiiiiiIIIII == 0) {
            return String.valueOf(IiiiiiiiIIIII2) + "\u7ea7";
        }
        if (IiiiiiiiIIIII < 4) return String.valueOf(IiiiiiiiIIIII) + "\u8f6c" + IiiiiiiiIIIII2 + "\u7ea7";
        return "\u98de\u5347" + IiiiiiiiIIIII2 + "\u7ea7";
    }

    public void iiiIiiiiiiIIi() {
        this.taskRecordMap = GameUtil.ALLATORIxDEMO((RoleData)this.roleData);
    }

    public IIIIIiiiIiIii ALLATORIxDEMO(Task task, TaskProgress progress, List<IIIIIiiiIiIii> units) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < units.size()) {
            IIIIIiiiIiIii IiiiiiiiIIIII2 = units.get(IiiiiiiiIIIII);
            if (IiiiiiiiIIIII2.IiiiiiiiIIIII == task && IiiiiiiiIIIII2.ALLATORIxDEMO == progress) {
                units.remove(IiiiiiiiIIIII);
                return IiiiiiiiIIIII2;
            }
            ++IiiiiiiiIIIII;
        }
        return new IIIIIiiiIiIii(task, progress, this.roleData.getObjectArea());
    }

    public Task ALLATORIxDEMO(int id, int type) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.taskList.size()) {
            Task IiiiiiiiIIIII2 = this.taskList.get(IiiiiiiiIIIII);
            if (IiiiiiiiIIIII2.getTaskId() == id) {
                this.taskList.remove(IiiiiiiiIIIII);
                if (type == 9) {
                    this.roleData.getGameView().iiiIiiiiiiIIi("\u4f60\u7684" + IiiiiiiiIIIII2.getTaskData().getTaskName() + "\u4efb\u52a1\u56e0\u4e3a\u8d85\u65f6\u5bfc\u81f4\u5931\u8d25");
                } else if (type == 8) {
                    this.roleData.getGameView().iiiIiiiiiiIIi("\u53d6\u6d88\u4e86" + IiiiiiiiIIIII2.getTaskData().getTaskName());
                } else if (type == 4) {
                    if (!this.roleData.getGameView().getClient().ALLATORIxDEMO(2, 12)) {
                        this.roleData.getGameView().iiiIiiiiiiIIi("\u5b8c\u6210\u4e86" + IiiiiiiiIIIII2.getTaskData().getTaskName());
                    }
                    if (!IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII2.getTaskData().getTaskEnd())) {
                        ((iIIiiiiiIIIIi)this.roleData.getGameView().getFormManagement().iiiIiiiiiiIIi(27)).iiiiiiiiIIiii(IiiiiiiiIIIII2.getTaskData().getTaskEnd());
                    }
                }
                this.roleData.getGameView().getGameReadBar().ALLATORIxDEMO(IiiiiiiiIIIII2.getTaskData());
                return IiiiiiiiIIIII2;
            }
            ++IiiiiiiiIIIII;
        }
        return null;
    }

    public RoleTaskData(RoleData roleData) {
        this.roleData = roleData;
        this.units = new ArrayList<IIIIIiiiIiIii>();
    }

    public void getSetId(List<Integer> list) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.taskList.size()) {
            block4: {
                int IiiiiiiiIIIII2 = this.taskList.get(IiiiiiiiIIIII).getTaskData().getTaskSetID();
                if (!list.contains(IiiiiiiiIIIII2)) {
                    int IiiiiiiiIIIII3 = 0;
                    while (IiiiiiiiIIIII3 < list.size()) {
                        if (list.get(IiiiiiiiIIIII3) < IiiiiiiiIIIII2) {
                            list.add(IiiiiiiiIIIII3, IiiiiiiiIIIII2);
                            break block4;
                        }
                        ++IiiiiiiiIIIII3;
                    }
                    list.add(IiiiiiiiIIIII2);
                }
            }
            ++IiiiiiiiIIIII;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled unnecessary exception pruning
     */
    public void iIiIiiiiIIiii() {
        Object object = LOCK;
        synchronized (object) {
            boolean IiiiiiiiIIIII = false;
            npcUnits.clear();
            int IiiiiiiiIIIII2 = this.taskList.size() - 1;
            while (IiiiiiiiIIIII2 >= 0) {
                Task IiiiiiiiIIIII3 = this.taskList.get(IiiiiiiiIIIII2);
                TaskData IiiiiiiiIIIII4 = IiiiiiiiIIIII3.getTaskData();
                IiiiiiiiIIIII = IiiiiiiiIIIII | IiiiiiiiIIIII4.getIsTP() == 1;
                int IiiiiiiiIIIII5 = 0;
                while (IiiiiiiiIIIII5 < IiiiiiiiIIIII3.getProgress().size()) {
                    TaskProgress IiiiiiiiIIIII6 = (TaskProgress)IiiiiiiiIIIII3.getProgress().get(IiiiiiiiIIIII5);
                    if (IiiiiiiiIIIII6.getSum() < IiiiiiiiIIIII6.getMax() && (IiiiiiiiIIIII6.getType() == 1 || IiiiiiiiIIIII6.getType() == 5)) {
                        npcUnits.add(this.ALLATORIxDEMO(IiiiiiiiIIIII3, IiiiiiiiIIIII6, npcUnits));
                    }
                    ++IiiiiiiiIIIII5;
                }
                --IiiiiiiiIIIII2;
            }
            this.limitFlyFlag = IiiiiiiiIIIII;
            this.units.clear();
            IiiiiiiiIIIII2 = 0;
            while (IiiiiiiiIIIII2 < npcUnits.size()) {
                this.units.add(npcUnits.get(IiiiiiiiIIIII2++));
            }
            npcUnits.clear();
            return;
        }
    }

    public Task getTaskId(int id) {
        int IiiiiiiiIIIII = this.taskList.size() - 1;
        while (IiiiiiiiIIIII >= 0) {
            if (this.taskList.get(IiiiiiiiIIIII).getTaskId() == id) return this.taskList.get(IiiiiiiiIIIII);
            --IiiiiiiiIIIII;
        }
        return null;
    }

    public IIIIIiiiIiIii getTaskUnit(long id, long mapId) {
        int IiiiiiiiIIIII = this.units.size() - 1;
        while (IiiiiiiiIIIII >= 0) {
            IIIIIiiiIiIii IiiiiiiiIIIII2 = this.units.get(IiiiiiiiIIIII);
            if ((long)IiiiiiiiIIIII2.ALLATORIxDEMO.getDId() == id) {
                if (IiiiiiiiIIIII2.ALLATORIxDEMO.getType() == 5) return IiiiiiiiIIIII2;
                if ((long)IiiiiiiiIIIII2.ALLATORIxDEMO.getMap() == mapId) {
                    return IiiiiiiiIIIII2;
                }
            }
            --IiiiiiiiIIIII;
        }
        return null;
    }

    public Task getTaskSet(int setID) {
        int IiiiiiiiIIIII = this.taskList.size() - 1;
        while (IiiiiiiiIIIII >= 0) {
            if (this.taskList.get(IiiiiiiiIIIII).getTaskData().getTaskSetID() == setID) {
                return this.taskList.get(IiiiiiiiIIIII);
            }
            --IiiiiiiiIIIII;
        }
        return null;
    }

    public String ALLATORIxDEMO(int id) {
        TaskData IiiiiiiiIIIII = this.roleData.getObjectArea().ALLATORIxDEMO(id);
        if (IiiiiiiiIIIII == null) {
            return null;
        }
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.taskList.size()) {
            Task IiiiiiiiIIIII3 = this.taskList.get(IiiiiiiiIIIII2);
            if (IiiiiiiiIIIII3.getTaskData().getTaskName().equals(IiiiiiiiIIIII.getTaskName())) {
                if (IiiiiiiiIIIII3.getTaskState() == 2) {
                    return "\u6211\u8981\u53d6\u6d88" + IiiiiiiiIIIII.getTaskName();
                }
                if (IiiiiiiiIIIII3.getTaskState() == 3) {
                    return "\u6211\u8981\u9886\u53d6" + IiiiiiiiIIIII.getTaskName() + "\u5956\u52b1";
                }
            }
            ++IiiiiiiiIIIII2;
        }
        if (IiiiiiiiIIIII.getTaskID() < 3157) return IiiiiiiiIIIII.getTaskOpen();
        if (IiiiiiiiIIIII.getTaskID() > 3500) return IiiiiiiiIIIII.getTaskOpen();
        IiiiiiiiIIIII2 = this.ALLATORIxDEMO(IiiiiiiiIIIII.getTaskSetID(), 3);
        if (IiiiiiiiIIIII.getTaskID() == IiiiiiiiIIIII2 + 1) return IiiiiiiiIIIII.getTaskOpen();
        return null;
    }

    public Task ALLATORIxDEMO(int taskid, int state, String[] values) {
        if (state == 8) return this.ALLATORIxDEMO(taskid, state);
        if (state == 9) return this.ALLATORIxDEMO(taskid, state);
        if (state == 4) {
            return this.ALLATORIxDEMO(taskid, state);
        }
        Task IiiiiiiiIIIII = this.getTaskId(taskid);
        if (IiiiiiiiIIIII != null) {
            IiiiiiiiIIIII.ALLATORIxDEMO(values, this.roleData.getObjectArea());
            return IiiiiiiiIIIII;
        }
        IiiiiiiiIIIII = this.iIiIiiiiIIiii(taskid, state);
        IiiiiiiiIIIII.ALLATORIxDEMO(values, this.roleData.getObjectArea());
        this.taskList.add(IiiiiiiiIIIII);
        if (!this.roleData.getGameView().getClient().ALLATORIxDEMO(2, 12)) {
            this.roleData.getGameView().iiiIiiiiiiIIi("\u9886\u53d6\u4e86" + IiiiiiiiIIIII.getTaskData().getTaskName());
        }
        this.roleData.getGameView().getGameReadBar().setCountDown(IiiiiiiiIIIII);
        return IiiiiiiiIIIII;
    }

    public boolean ALLATORIxDEMO() {
        return this.limitFlyFlag;
    }

    public Task getSetTask(int taskSetID) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.taskList.size()) {
            if (this.taskList.get(IiiiiiiiIIIII).getTaskData().getTaskSetID() == taskSetID) {
                return this.taskList.get(IiiiiiiiIIIII);
            }
            ++IiiiiiiiIIIII;
        }
        return null;
    }

    public List<Task> getTaskList() {
        return this.taskList;
    }

    public Task ALLATORIxDEMO(TaskProgress taskProgress) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.taskList.size()) {
            Task IiiiiiiiIIIII2 = this.taskList.get(IiiiiiiiIIIII);
            int IiiiiiiiIIIII3 = 0;
            while (IiiiiiiiIIIII3 < IiiiiiiiIIIII2.getProgress().size()) {
                TaskProgress IiiiiiiiIIIII4 = (TaskProgress)IiiiiiiiIIIII2.getProgress().get(IiiiiiiiIIIII3);
                if ((IiiiiiiiIIIII4.getType() == 0 || IiiiiiiiIIIII4.getType() == 1) && taskProgress.getDId() == IiiiiiiiIIIII4.getDId()) {
                    return IiiiiiiiIIIII2;
                }
                ++IiiiiiiiIIIII3;
            }
            ++IiiiiiiiIIIII;
        }
        return null;
    }

    public void ALLATORIxDEMO(String[] values) {
        iIIIiiiiiIiIi IiiiiiiiIIIII;
        IIiiIiiiIIiIi IiiiiiiiIIIII2;
        IiIIIiiiIIIiI IiiiiiiiIIIII3;
        int IiiiiiiiIIIII4 = Integer.parseInt(values[0]);
        int IiiiiiiiIIIII5 = 0;
        int IiiiiiiiIIIII6 = 0;
        int IiiiiiiiIIIII7 = 0;
        int IiiiiiiiIIIII8 = 0;
        int IiiiiiiiIIIII9 = 0;
        int IiiiiiiiIIIII10 = 0;
        int IiiiiiiiIIIII11 = 0;
        int IiiiiiiiIIIII12 = 1;
        while (IiiiiiiiIIIII12 < values.length) {
            if (values[IiiiiiiiIIIII12].startsWith("L")) {
                if (values[IiiiiiiiIIIII12].length() == 1) {
                    IiiiiiiiIIIII6 = 1;
                } else {
                    IiiiiiiiIIIII11 = Integer.parseInt(values[IiiiiiiiIIIII12].substring(1));
                }
            } else if (values[IiiiiiiiIIIII12].startsWith("R")) {
                if (values[IiiiiiiiIIIII12].length() == 1) {
                    IiiiiiiiIIIII5 = 1;
                } else {
                    IiiiiiiiIIIII10 = Integer.parseInt(values[IiiiiiiiIIIII12].substring(1));
                }
            } else if (values[IiiiiiiiIIIII12].startsWith("N")) {
                IiiiiiiiIIIII7 = Integer.parseInt(values[IiiiiiiiIIIII12].substring(1));
            } else if (values[IiiiiiiiIIIII12].startsWith("M")) {
                IiiiiiiiIIIII8 = Integer.parseInt(values[IiiiiiiiIIIII12].substring(1));
            } else if (values[IiiiiiiiIIIII12].startsWith("B")) {
                IiiiiiiiIIIII9 = Integer.parseInt(values[IiiiiiiiIIIII12].substring(1));
            }
            ++IiiiiiiiIIIII12;
        }
        if (IiiiiiiiIIIII5 == 0 && IiiiiiiiIIIII6 == 0 && IiiiiiiiIIIII7 == 0 && IiiiiiiiIIIII10 == 0 && IiiiiiiiIIIII11 == 0 && IiiiiiiiIIIII8 == 0 && IiiiiiiiIIIII9 == 0) {
            return;
        }
        TaskRecord IiiiiiiiIIIII22 = this.getTaskRecord(IiiiiiiiIIIII4);
        if (IiiiiiiiIIIII10 != 0) {
            IiiiiiiiIIIII22.setrSum(IiiiiiiiIIIII10);
        } else if (IiiiiiiiIIIII5 != 0) {
            IiiiiiiiIIIII22.setrSum(IiiiiiiiIIIII22.getrSum() + IiiiiiiiIIIII5);
        }
        if (IiiiiiiiIIIII11 != 0) {
            IiiiiiiiIIIII22.setcSum(IiiiiiiiIIIII11);
        } else if (IiiiiiiiIIIII6 != 0) {
            IiiiiiiiIIIII22.setcSum(IiiiiiiiIIIII22.getcSum() + IiiiiiiiIIIII6);
        }
        if (IiiiiiiiIIIII8 != 0) {
            IiiiiiiiIIIII22.setNewID(IiiiiiiiIIIII22.getNewID() + IiiiiiiiIIIII8);
        } else if (IiiiiiiiIIIII7 != 0) {
            IiiiiiiiIIIII22.setNewID(IiiiiiiiIIIII7);
        }
        if (IiiiiiiiIIIII9 != 0) {
            IiiiiiiiIIIII22.setbSum(IiiiiiiiIIIII9);
        }
        if ((IiiiiiiiIIIII3 = (IiIIIiiiIIIiI)(IiiiiiiiIIIII2 = this.roleData.getGameView().getFormManagement()).iIiIiiiiIIiii(40)) != null) {
            IiiiiiiiIIIII3.iIiIiiiiIIiii(IiiiiiiiIIIII4);
        }
        if (IiiiiiiiIIIII4 == 7 && (IiiiiiiiIIIII = (iIIIiiiiiIiIi)IiiiiiiiIIIII2.iIiIiiiiIIiii(125)) != null) {
            IiiiiiiiIIIII.iIiIiiiiIIiIi(null);
        }
        if ((IiiiiiiiIIIII = (iiIiIiiiiIIII)IiiiiiiiIIIII2.iIiIiiiiIIiii(145)) == null) return;
        IiiiiiiiIIIII.iIiIiiiiIIiii(IiiiiiiiIIIII4);
    }

    static {
        LOCK = new Object();
        npcUnits = new ArrayList<IIIIIiiiIiIii>();
    }

    public boolean getTaskXL(long mapId) {
        int IiiiiiiiIIIII = this.taskList.size() - 1;
        while (IiiiiiiiIIIII >= 0) {
            Task IiiiiiiiIIIII2 = this.taskList.get(IiiiiiiiIIIII);
            int IiiiiiiiIIIII3 = 0;
            while (IiiiiiiiIIIII3 < IiiiiiiiIIIII2.getProgress().size()) {
                TaskProgress IiiiiiiiIIIII4 = (TaskProgress)IiiiiiiiIIIII2.getProgress().get(IiiiiiiiIIIII3);
                if (IiiiiiiiIIIII4.getType() == 6 && (long)IiiiiiiiIIIII4.getMap() == mapId) {
                    return true;
                }
                ++IiiiiiiiIIIII3;
            }
            --IiiiiiiiIIIII;
        }
        return false;
    }

    public void ALLATORIxDEMO() {
        StringBuffer IiiiiiiiIIIII = null;
        int IiiiiiiiIIIII2 = this.taskList.size() - 1;
        while (IiiiiiiiIIIII2 >= 0) {
            Task IiiiiiiiIIIII3 = this.taskList.get(IiiiiiiiIIIII2);
            if (IiiiiiiiIIIII3.ALLATORIxDEMO()) {
                if (IiiiiiiiIIIII == null) {
                    IiiiiiiiIIIII = new StringBuffer("T");
                } else {
                    IiiiiiiiIIIII.append("|");
                }
                IiiiiiiiIIIII.append(IiiiiiiiIIIII3.getTaskId());
            }
            --IiiiiiiiIIIII2;
        }
        if (IiiiiiiiIIIII == null) return;
        String IiiiiiiiIIIII22 = Agreement.getSendTextAES((String)"taskN", (String)IiiiiiiiIIIII.toString());
        this.roleData.getGameView().getClient().ALLATORIxDEMO(IiiiiiiiIIIII22);
    }

    public Task ALLATORIxDEMO(int npcid) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.taskList.size()) {
            Task IiiiiiiiIIIII2 = this.taskList.get(IiiiiiiiIIIII);
            int IiiiiiiiIIIII3 = 0;
            while (IiiiiiiiIIIII3 < IiiiiiiiIIIII2.getProgress().size()) {
                TaskProgress IiiiiiiiIIIII4 = (TaskProgress)IiiiiiiiIIIII2.getProgress().get(IiiiiiiiIIIII3);
                if (IiiiiiiiIIIII4.getType() == 2 && IiiiiiiiIIIII4.getDId() == npcid) {
                    return IiiiiiiiIIIII2;
                }
                ++IiiiiiiiIIIII3;
            }
            ++IiiiiiiiIIIII;
        }
        return null;
    }
}
