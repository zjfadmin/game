/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.game.TaskProgress
 *  com.xy.n.IIiiIiiiiIIiI
 *  com.xy.script.ScriptIndex
 *  com.xy.v.IiiiIiiiiIiIi
 *  com.xy.v.iIiIIiiiIiiiI
 */
package com.xy.script;

import com.xy.game.TaskProgress;
import com.xy.n.IIiiIiiiiIIiI;
import com.xy.script.ScriptIndex;
import com.xy.v.IiiiIiiiiIiIi;
import com.xy.v.iIiIIiiiIiiiI;
import java.util.ArrayList;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ScriptTask {
    private int taskSetID;
    private boolean first = true;
    private int npcID;
    private IIiiIiiiiIIiI mapPoint;
    private int sum;
    private ScriptIndex nowIndex;
    private int timeInterval;
    private int taskID;
    private long nowRecord;
    private long timeAssist;
    private List<Long> list;
    private int nowNum;
    private List<ScriptIndex> indexList;

    public void setNpcID(int npcID) {
        this.npcID = npcID;
    }

    public int ALLATORIxDEMO() {
        return --this.sum;
    }

    public void setTaskSetID(int taskSetID) {
        this.taskSetID = taskSetID;
    }

    public void iIiIiiiiIIiii() {
        ScriptIndex IiiiiiiiIIIII;
        if (this.nowIndex == null) {
            return;
        }
        ScriptIndex IiiiiiiiIIIII2 = this.nowIndex;
        int IiiiiiiiIIIII3 = IiiiiiiiIIIII2.getType();
        int IiiiiiiiIIIII4 = IiiiiiiiIIIII2.getKey();
        ScriptIndex IiiiiiiiIIIII5 = null;
        int IiiiiiiiIIIII6 = 1;
        int IiiiiiiiIIIII7 = 0;
        while (IiiiiiiiIIIII7 < this.indexList.size()) {
            IiiiiiiiIIIII = this.indexList.get(IiiiiiiiIIIII7);
            if (IiiiiiiiIIIII == IiiiiiiiIIIII2) {
                this.nowRecord |= 1L << IiiiiiiiIIIII7;
                break;
            }
            ++IiiiiiiiIIIII7;
        }
        IiiiiiiiIIIII7 = 0;
        while (IiiiiiiiIIIII7 < this.indexList.size()) {
            IiiiiiiiIIIII = this.indexList.get(IiiiiiiiIIIII7);
            if (!(IiiiiiiiIIIII.getType() != IiiiiiiiIIIII3 || IiiiiiiiIIIII4 != 0 && IiiiiiiiIIIII.getKey() != IiiiiiiiIIIII4 || (this.nowRecord >> IiiiiiiiIIIII7 & 1L) != 0L || IiiiiiiiIIIII5 != null && IiiiIiiiiIiIi.iIiIiiiiIiIii.nextInt(++IiiiiiiiIIIII6) != 0)) {
                IiiiiiiiIIIII5 = IiiiiiiiIIIII;
            }
            ++IiiiiiiiIIIII7;
        }
        if (IiiiiiiiIIIII5 != null) {
            this.nowIndex = IiiiiiiiIIIII5;
            return;
        }
        if (!this.iIiIiiiiIIiii()) return;
        this.nowNum = 0;
        this.nowRecord = 0L;
        this.nowIndex = null;
    }

    public void ALLATORIxDEMO(int index, String[] vs) {
        int IiiiiiiiIIIII = index;
        while (IiiiiiiiIIIII < vs.length) {
            ScriptIndex IiiiiiiiIIIII2;
            String[] IiiiiiiiIIIII3;
            if (vs[IiiiiiiiIIIII].startsWith("\u7cfb\u7edf\u91ce\u602a\u8bbe\u7f6e=")) {
                IiiiiiiiIIIII3 = vs[IiiiiiiiIIIII].split("=");
                ScriptIndex scriptIndex = new ScriptIndex(0);
                IiiiiiiiIIIII2.setKey(Integer.parseInt(IiiiiiiiIIIII3[1]));
                IiiiiiiiIIIII2.setMapPoint(new IIiiIiiiiIIiI(Integer.parseInt(IiiiiiiiIIIII3[2]), Integer.parseInt(IiiiiiiiIIIII3[3]), Integer.parseInt(IiiiiiiiIIIII3[4])));
                this.ALLATORIxDEMO(IiiiiiiiIIIII2);
            } else if (vs[IiiiiiiiIIIII].startsWith("\u5de1\u903b\u8bbe\u7f6e=")) {
                IiiiiiiiIIIII3 = vs[IiiiiiiiIIIII].split("=");
                IiiiiiiiIIIII2 = new ScriptIndex(1);
                IiiiiiiiIIIII2.setMapPoint(new IIiiIiiiiIIiI(Integer.parseInt(IiiiiiiiIIIII3[1]), Integer.parseInt(IiiiiiiiIIIII3[2]), Integer.parseInt(IiiiiiiiIIIII3[3])));
                this.ALLATORIxDEMO(IiiiiiiiIIIII2);
            } else if (vs[IiiiiiiiIIIII].startsWith("\u65f6\u95f4\u95f4\u9694=")) {
                this.timeInterval = Integer.parseInt(vs[IiiiiiiiIIIII].substring(5)) * 1000;
            } else if (vs[IiiiiiiiIIIII].startsWith("\u4efb\u52a1ID=")) {
                this.taskID = Integer.parseInt(vs[IiiiiiiiIIIII].substring(5));
            }
            ++IiiiiiiiIIIII;
        }
    }

    public int getTimeInterval() {
        return this.timeInterval;
    }

    /*
     * WARNING - void declaration
     */
    public ScriptTask(String[] stringArray, int n) {
        void vs;
        void taskSetID;
        this.taskSetID = taskSetID;
        this.mapPoint = new IIiiIiiiiIIiI(Integer.parseInt((String)vs[0]), Integer.parseInt((String)vs[1]), Integer.parseInt((String)vs[2]));
        this.npcID = Integer.parseInt((String)vs[3]);
        this.sum = Integer.parseInt((String)vs[4]);
        this.ALLATORIxDEMO(5, (String[])vs);
    }

    public int getY() {
        return this.mapPoint.iiiIiiiiiiIIi();
    }

    public int getX() {
        return this.mapPoint.ALLATORIxDEMO();
    }

    public int getTaskSetID() {
        return this.taskSetID;
    }

    public boolean iiiIiiiiiiIIi() {
        return this.first;
    }

    public int getMap() {
        return this.mapPoint.iIiIiiiiIIiii();
    }

    public void ALLATORIxDEMO(long id) {
        if (this.list == null) {
            this.list = new ArrayList<Long>();
        } else if (this.list.contains(id)) {
            return;
        }
        this.list.add(id);
    }

    public ScriptIndex getScriptIndex(int type, TaskProgress progress) {
        int IiiiiiiiIIIII;
        if (this.indexList == null) {
            return null;
        }
        int n = IiiiiiiiIIIII = type == 0 && progress != null ? progress.getDId() : 0;
        if (this.nowIndex != null && this.nowIndex.getType() != type || IiiiiiiiIIIII != 0 && this.nowIndex != null && this.nowIndex.getKey() != IiiiiiiiIIIII) {
            this.nowIndex = null;
        }
        if (this.nowIndex != null) return this.nowIndex;
        this.nowNum = 0;
        this.nowRecord = 0L;
        int IiiiiiiiIIIII2 = 1;
        for (ScriptIndex IiiiiiiiIIIII3 : this.indexList) {
            if (IiiiiiiiIIIII3.getType() != type || IiiiiiiiIIIII != 0 && IiiiiiiiIIIII3.getKey() != IiiiiiiiIIIII || this.nowIndex != null && IiiiIiiiiIiIi.iIiIiiiiIiIii.nextInt(++IiiiiiiiIIIII2) != 0) continue;
            this.nowIndex = IiiiiiiiIIIII3;
        }
        return this.nowIndex;
    }

    public void setTimeInterval(int timeInterval) {
        this.timeInterval = timeInterval;
    }

    public void ALLATORIxDEMO(ScriptIndex scriptIndex) {
        if (this.indexList == null) {
            this.indexList = new ArrayList<ScriptIndex>();
        }
        this.indexList.add(scriptIndex);
    }

    public boolean ALLATORIxDEMO(long id) {
        if (this.list == null) return false;
        if (!this.list.contains(id)) return false;
        return true;
    }

    private /* synthetic */ boolean iIiIiiiiIIiii() {
        if (++this.nowNum <= 5) return false;
        return true;
    }

    public void setNowIndex(ScriptIndex nowIndex) {
        this.nowIndex = nowIndex;
    }

    public void ALLATORIxDEMO() {
        if (!this.first) return;
        this.first = false;
    }

    /*
     * WARNING - void declaration
     */
    public ScriptTask(String[] stringArray, int n, int n2) {
        void sum;
        void vs;
        void taskSetID;
        this.taskSetID = taskSetID;
        this.mapPoint = new IIiiIiiiiIIiI(Integer.parseInt((String)vs[0]), Integer.parseInt((String)vs[1]), Integer.parseInt((String)vs[2]));
        this.npcID = Integer.parseInt((String)vs[3]);
        this.sum = sum;
        this.ALLATORIxDEMO(4, (String[])vs);
        if (this.timeInterval >= 1000) return;
        this.timeInterval = 1000;
    }

    public boolean ALLATORIxDEMO() {
        if (iIiIIiiiIiiiI.ALLATORIxDEMO() <= this.timeAssist) return false;
        this.timeAssist = iIiIIiiiIiiiI.ALLATORIxDEMO() + 500L;
        return true;
    }

    public int getTaskID() {
        return this.taskID;
    }

    public ScriptIndex getNowIndex() {
        return this.nowIndex;
    }

    public int getNpcID() {
        return this.npcID;
    }

    public void setTimeAssist() {
        this.timeAssist = iIiIIiiiIiiiI.ALLATORIxDEMO() + (long)(this.first ? 500 : this.timeInterval);
    }

    public void setTaskID(int taskID) {
        this.taskID = taskID;
    }

    public boolean ALLATORIxDEMO(int type, int key) {
        if (this.indexList == null) {
            return false;
        }
        for (ScriptIndex IiiiiiiiIIIII : this.indexList) {
            if (IiiiiiiiIIIII.getType() != type || IiiiiiiiIIIII.getKey() != key) continue;
            return true;
        }
        return false;
    }
}
