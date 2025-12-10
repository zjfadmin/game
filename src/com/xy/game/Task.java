/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.Coordinates
 *  com.xy.game.TaskProgress
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.TaskData
 *  com.xy.richtext.InputBean
 *  com.xy.richtext.RichLabel
 *  com.xy.script.ScriptTask
 *  com.xy.v.IiiiiiiiiIIII
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.v.iiIiiiiiIIiii
 */
package com.xy.game;

import com.xy.bean.Coordinates;
import com.xy.game.TaskProgress;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.TaskData;
import com.xy.richtext.InputBean;
import com.xy.richtext.RichLabel;
import com.xy.script.ScriptTask;
import com.xy.v.IiiiiiiiiIIII;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.v.iiIiiiiiIIiii;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Task {
    private long time;
    private List<TaskProgress> progress;
    private transient RichLabel richLabel;
    private int taskState;
    private int taskId;
    private transient TaskData taskData;

    public int getTaskState() {
        return this.taskState;
    }

    public void setTaskData(TaskData taskData) {
        this.taskData = taskData;
    }

    public void setTaskState(int taskState) {
        this.taskState = taskState;
    }

    public RichLabel getRichLabel() {
        return this.richLabel;
    }

    public TaskProgress getTaskProgress(ScriptTask scriptTask) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.progress.size()) {
            TaskProgress IiiiiiiiIIIII2 = this.progress.get(IiiiiiiiIIIII);
            if (IiiiiiiiIIIII2.getSum() < IiiiiiiiIIIII2.getMax()) {
                if (IiiiiiiiIIIII2.getType() == 1) return IiiiiiiiIIIII2;
                if (IiiiiiiiIIIII2.getType() == 2) return IiiiiiiiIIIII2;
                if (IiiiiiiiIIIII2.getType() == 3) {
                    return IiiiiiiiIIIII2;
                }
                if (IiiiiiiiIIIII2.getType() == 0 ? scriptTask.ALLATORIxDEMO(0, IiiiiiiiIIIII2.getDId()) : (IiiiiiiiIIIII2.getType() == 6 ? scriptTask.ALLATORIxDEMO(1, 0) : IiiiiiiiIIIII2.getType() == 4)) {
                    return IiiiiiiiIIIII2;
                }
            }
            ++IiiiiiiiIIIII;
        }
        return null;
    }

    public void setProgress(List<TaskProgress> progress) {
        this.progress = progress;
    }

    public TaskProgress getProgressFinish(String type, String name) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.progress.size()) {
            TaskProgress IiiiiiiiIIIII2 = this.progress.get(IiiiiiiiIIIII);
            if (IiiiiiiiIIIII2.getSum() < IiiiiiiiIIIII2.getMax() && name.equals(IiiiiiiiIIIII2.getType() != 5 && IiiiiiiiIIIII2.getType() != 7 ? IiiiiiiiIIIII2.getDName() : IiiiiiiiIIIII2.getGName())) {
                if ((IiiiiiiiIIIII2.getType() == 0 || IiiiiiiiIIIII2.getType() == 1 || IiiiiiiiIIIII2.getType() == 2) && type.equals("\u51fb\u6740")) {
                    return IiiiiiiiIIIII2;
                }
                if ((IiiiiiiiIIIII2.getType() == 3 || IiiiiiiiIIIII2.getType() == 5) && type.equals("\u95ee\u5019")) {
                    return IiiiiiiiIIIII2;
                }
                if (IiiiiiiiIIIII2.getType() == 4 && type.equals("\u7ed9\u4e88\u7269\u54c1")) {
                    return IiiiiiiiIIIII2;
                }
                if (IiiiiiiiIIIII2.getType() == 7 && type.equals("\u7b54\u9898")) {
                    return IiiiiiiiIIIII2;
                }
            }
            ++IiiiiiiiIIIII;
        }
        return null;
    }

    public Task(int taskId, int taskState, TaskData taskData) {
        this.taskId = taskId;
        this.taskState = taskState;
        this.taskData = taskData;
    }

    public TaskData getTaskData() {
        return this.taskData;
    }

    public List<TaskProgress> getProgress() {
        return this.progress;
    }

    public boolean iIiIiiiiIIiii() {
        if (this.taskState != 2) return false;
        if (this.progress == null) {
            this.taskState = 3;
            return true;
        }
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.progress.size()) {
            if (this.progress.get(IiiiiiiiIIIII).getSum() < this.progress.get(IiiiiiiiIIIII).getMax()) {
                return false;
            }
            ++IiiiiiiiIIIII;
        }
        this.taskState = 3;
        return true;
    }

    public int ALLATORIxDEMO(String type, String name) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.progress.size()) {
            TaskProgress IiiiiiiiIIIII2 = this.progress.get(IiiiiiiiIIIII);
            if (IiiiiiiiIIIII2.getSum() < IiiiiiiiIIIII2.getMax() && name.equals(IiiiiiiiIIIII2.getType() != 5 && IiiiiiiiIIIII2.getType() != 7 ? IiiiiiiiIIIII2.getDName() : IiiiiiiiIIIII2.getGName())) {
                if ((IiiiiiiiIIIII2.getType() == 0 || IiiiiiiiIIIII2.getType() == 1 || IiiiiiiiIIIII2.getType() == 2) && type.equals("\u51fb\u6740")) {
                    return 3;
                }
                if ((IiiiiiiiIIIII2.getType() == 3 || IiiiiiiiIIIII2.getType() == 5) && type.equals("\u95ee\u5019")) {
                    return 1;
                }
                if (IiiiiiiiIIIII2.getType() == 4 && type.equals("\u7ed9\u4e88\u7269\u54c1")) {
                    return 2;
                }
                if (IiiiiiiiIIIII2.getType() == 7 && type.equals("\u7b54\u9898")) {
                    return 4;
                }
            }
            ++IiiiiiiiIIIII;
        }
        return 0;
    }

    public long getTime() {
        return this.time;
    }

    public boolean ALLATORIxDEMO() {
        if (this.time == 0L) {
            return false;
        }
        if (this.time > iIiIIiiiIiiiI.iIiIiiiiIIiii()) return false;
        return true;
    }

    public int getTaskId() {
        return this.taskId;
    }

    /*
     * Unable to fully structure code
     */
    public void ALLATORIxDEMO(String[] values, IiiiiiiiiIIII objectArea) {
        block30: {
            if (this.progress != null) {
                this.progress.clear();
            } else {
                this.progress = new ArrayList<TaskProgress>();
            }
            if (values == null) break block30;
            IiiiiiiiIIIII = 2;
            while (IiiiiiiiIIIII < values.length) {
                block32: {
                    block31: {
                        if (!values[IiiiiiiiIIIII].startsWith("P")) break block31;
                        IiiiiiiiIIIII = values[IiiiiiiiIIIII].split("_");
                        var5_7 = new TaskProgress(this);
                        IiiiiiiiIIIII.setType(Integer.parseInt(IiiiiiiiIIIII[0].substring(1)));
                        IiiiiiiiIIIII.setSum(0);
                        IiiiiiiiIIIII.setMax(1);
                        IiiiiiiiIIIII = 1;
                        if (true) ** GOTO lbl42
                    }
                    if (values[IiiiiiiiIIIII].startsWith("T")) {
                        this.time = Long.parseLong(values[IiiiiiiiIIIII].substring(1)) * 1000L;
                    }
                    break block32;
                    do {
                        if (IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith("S")) {
                            var7_12 = IiiiiiiiIIIII[IiiiiiiiIIIII].split("-");
                            IiiiiiiiIIIII.setSum(Integer.parseInt(IiiiiiiiIIIII[0].substring(1)));
                            IiiiiiiiIIIII.setMax(Integer.parseInt((String)IiiiiiiiIIIII[1]));
                        } else if (IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith("M")) {
                            IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("-");
                            IiiiiiiiIIIII.setMap(Integer.parseInt(IiiiiiiiIIIII[0].substring(1)));
                            IiiiiiiiIIIII.setX(Integer.parseInt(IiiiiiiiIIIII[1]));
                            IiiiiiiiIIIII.setY(Integer.parseInt(IiiiiiiiIIIII[2]));
                        } else if (IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith("D")) {
                            IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("-");
                            IiiiiiiiIIIII.setDId(Integer.parseInt(IiiiiiiiIIIII[0].substring(1)));
                            IiiiiiiiIIIII.setDName(IiiiiiiiIIIII[1]);
                        } else if (IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith("G")) {
                            IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("-");
                            IiiiiiiiIIIII.setGId(Integer.parseInt(IiiiiiiiIIIII[0].substring(1)));
                            IiiiiiiiIIIII.setGName(IiiiiiiiIIIII[1]);
                        }
                        ++IiiiiiiiIIIII;
lbl42:
                        // 2 sources

                    } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
                    this.progress.add(IiiiiiiiIIIII);
                }
                ++IiiiiiiiIIIII;
            }
        }
        if (this.progress.size() == 0) {
            this.richLabel = null;
            return;
        }
        IiiiiiiiIIIII = new StringBuffer();
        IiiiiiiiIIIII.append("#Y");
        IiiiiiiiIIIII.append(this.getTaskData().getTaskName());
        IiiiiiiiIIIII.append("#W[");
        IiiiiiiiIIIII.append(this.taskData.getTaskSet().getTaskType());
        IiiiiiiiIIIII.append("]");
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.progress.size()) {
            IiiiiiiiIIIII = this.progress.get(IiiiiiiiIIIII);
            IiiiiiiiIIIII.append("#r");
            if (IiiiiiiiIIIII.getType() == 0 || IiiiiiiiIIIII.getType() == 1 || IiiiiiiiIIIII.getType() == 2) {
                IiiiiiiiIIIII.append("\u51fb\u6740");
            } else if (IiiiiiiiIIIII.getType() == 3) {
                IiiiiiiiIIIII.append("\u95ee\u5019");
            } else if (IiiiiiiiIIIII.getType() == 4) {
                IiiiiiiiIIIII.append("\u5c06");
                IiiiiiiiIIIII.append(IiiiiiiiIIIII.getDName());
                IiiiiiiiIIIII.append("\u9001\u7ed9");
            } else if (IiiiiiiiIIIII.getType() == 5) {
                IiiiiiiiIIIII.append("\u62a4\u9001");
                IiiiiiiiIIIII.append(IiiiiiiiIIIII.getDName());
                IiiiiiiiIIIII.append("\u5230");
            } else if (IiiiiiiiIIIII.getType() == 6) {
                IiiiiiiiIIIII.append("\u5230");
                IiiiiiiiIIIII = new Coordinates(IiiiiiiiIIIII.getMap(), IiiiiiiiIIIII.getX(), IiiiiiiiIIIII.getY());
                IiiiiiiiIIIII = new InputBean(null, IiiiiiiiIIIII.getType() + 20, new BigDecimal(IiiiiiiiIIIII.getGId()), objectArea.iiiIiiiiiiIIi(String.valueOf(IiiiiiiiIIIII.getMap())), "G", IiiiiiiiIIIII);
                IiiiiiiiIIIII.append("#V");
                IiiiiiiiIIIII.append(iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII));
                IiiiiiiiIIIII.append("#L");
                IiiiiiiiIIIII.append("\u5de1\u903b");
            } else if (IiiiiiiiIIIII.getType() == 7) {
                IiiiiiiiIIIII.append("\u7b54\u9898");
            }
            if (IiiiiiiiIIIII.getType() != 6) {
                if (IiiiiiiiIIIII.getMap() == 0) {
                    IiiiiiiiIIIII.append(IiiiiiiiIIIII.getType() == 4 || IiiiiiiiIIIII.getType() == 5 || IiiiiiiiIIIII.getType() == 7 ? IiiiiiiiIIIII.getGName() : IiiiiiiiIIIII.getDName());
                } else {
                    IiiiiiiiIIIII = new Coordinates(IiiiiiiiIIIII.getMap(), IiiiiiiiIIIII.getX(), IiiiiiiiIIIII.getY());
                    IiiiiiiiIIIII = new InputBean(null, IiiiiiiiIIIII.getType() + 20, new BigDecimal(IiiiiiiiIIIII.getType() == 4 || IiiiiiiiIIIII.getType() == 5 || IiiiiiiiIIIII.getType() == 7 ? IiiiiiiiIIIII.getGId() : IiiiiiiiIIIII.getDId()), IiiiiiiiIIIII.getType() == 4 || IiiiiiiiIIIII.getType() == 5 || IiiiiiiiIIIII.getType() == 7 ? IiiiiiiiIIIII.getGName() : IiiiiiiiIIIII.getDName(), "G", IiiiiiiiIIIII);
                    IiiiiiiiIIIII.append("#V");
                    IiiiiiiiIIIII.append(iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII));
                    IiiiiiiiIIIII.append("#L");
                }
            }
            if (IiiiiiiiIIIII.getType() == 0 || IiiiiiiiIIIII.getType() == 1 || IiiiiiiiIIIII.getType() == 2 || IiiiiiiiIIIII.getType() == 4 || IiiiiiiiIIIII.getType() == 6 || IiiiiiiiIIIII.getType() == 7) {
                IiiiiiiiIIIII.append(" ");
                IiiiiiiiIIIII.append(IiiiiiiiIIIII.getSum());
                IiiiiiiiIIIII.append("/");
                IiiiiiiiIIIII.append(IiiiiiiiIIIII.getMax());
            }
            ++IiiiiiiiIIIII;
        }
        if (this.richLabel == null) {
            this.richLabel = new RichLabel(IiiiiiiiIIIII.toString(), iiIIiiiiIiiII.iiIiiiiiiIIiI, 165);
            return;
        }
        this.richLabel.setTextSize(IiiiiiiiIIIII.toString(), 165);
    }

    public void setTime(long time) {
        this.time = time;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }
}
