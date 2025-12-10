/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.readbean.TaskBuy
 */
package com.xy.readbean;

import com.xy.readbean.TaskBuy;
import java.util.LinkedList;
import java.util.List;

public class TaskTQ {
    private boolean jk;
    private int buyNum;
    private int receiveNum;
    private List<TaskBuy> buyList;
    private int limitNum;

    public void setReceiveNum(int receiveNum) {
        this.receiveNum = receiveNum;
    }

    public int getBuyNum() {
        return this.buyNum;
    }

    public List<TaskBuy> getBuyList() {
        return this.buyList;
    }

    public void setBuyNum(int buyNum) {
        this.buyNum = buyNum;
    }

    public TaskBuy getTaskBuy(int index) {
        if (this.buyList == null) return null;
        if (index < 0) return null;
        if (index >= this.buyNum) {
            return null;
        }
        for (TaskBuy IiiiiiiiIIIII : this.buyList) {
            if ((index -= IiiiiiiiIIIII.getNum()) >= 0) continue;
            return IiiiiiiiIIIII;
        }
        return null;
    }

    public boolean ALLATORIxDEMO() {
        return this.jk;
    }

    public int getReceiveNum() {
        return this.receiveNum;
    }

    public int getLimitNum() {
        return this.limitNum;
    }

    public void setBuyList(List<TaskBuy> buyList) {
        this.buyList = buyList;
    }

    /*
     * WARNING - void declaration
     */
    public TaskTQ(String value) {
        String[] IiiiiiiiIIIII = value.split("\\|");
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < IiiiiiiiIIIII.length) {
            int IiiiiiiiIIIII3 = IiiiiiiiIIIII[IiiiiiiiIIIII2].indexOf("=");
            String IiiiiiiiIIIII4 = IiiiiiiiIIIII[IiiiiiiiIIIII2].substring(0, IiiiiiiiIIIII3 != -1 ? IiiiiiiiIIIII3 : IiiiiiiiIIIII[IiiiiiiiIIIII2].length());
            if (IiiiiiiiIIIII4.equals("\u589e\u52a0\u6b21\u6570\u8bbe\u7f6e")) {
                IiiiiiiiIIIII3 = IiiiiiiiIIIII[IiiiiiiiIIIII2].indexOf("#", IiiiiiiiIIIII4.length() + 1);
                this.limitNum = Integer.parseInt(IiiiiiiiIIIII[IiiiiiiiIIIII2].substring(IiiiiiiiIIIII4.length() + 1, IiiiiiiiIIIII3));
                this.receiveNum = Integer.parseInt(IiiiiiiiIIIII[IiiiiiiiIIIII2].substring(IiiiiiiiIIIII3 + 1));
            } else if (IiiiiiiiIIIII4.equals("\u5b63\u5361\u7279\u6743")) {
                this.jk = true;
            } else if (IiiiiiiiIIIII4.endsWith("\u8d2d\u4e70")) {
                void IiiiiiiiIIIII5;
                TaskBuy taskBuy = new TaskBuy();
                IiiiiiiiIIIII5.setType(IiiiiiiiIIIII4.substring(0, IiiiiiiiIIIII4.length() - 2));
                IiiiiiiiIIIII3 = IiiiiiiiIIIII[IiiiiiiiIIIII2].indexOf("#", IiiiiiiiIIIII4.length() + 1);
                taskBuy.setMoney(Long.parseLong(IiiiiiiiIIIII[IiiiiiiiIIIII2].substring(IiiiiiiiIIIII4.length() + 1, IiiiiiiiIIIII3 != -1 ? IiiiiiiiIIIII3 : IiiiiiiiIIIII[IiiiiiiiIIIII2].length())));
                IiiiiiiiIIIII5.setNum(IiiiiiiiIIIII3 != -1 ? Integer.parseInt(IiiiiiiiIIIII[IiiiiiiiIIIII2].substring(IiiiiiiiIIIII3 + 1)) : 1);
                if (IiiiiiiiIIIII5.getNum() <= 0) {
                    IiiiiiiiIIIII5.setNum(1);
                }
                this.buyNum += IiiiiiiiIIIII5.getNum();
                if (this.buyList == null) {
                    this.buyList = new LinkedList<TaskBuy>();
                }
                this.buyList.add((TaskBuy)IiiiiiiiIIIII5);
            }
            ++IiiiiiiiIIIII2;
        }
        if (this.limitNum < 0) {
            this.limitNum = 0;
        }
        if (this.receiveNum < 0) {
            this.receiveNum = 0;
        }
        if (this.limitNum != 0) return;
        if (this.receiveNum != 0) return;
        this.jk = false;
        this.buyNum = 0;
        this.buyList = null;
    }

    public void setLimitNum(int limitNum) {
        this.limitNum = limitNum;
    }

    public void setJk(boolean jk) {
        this.jk = jk;
    }
}
