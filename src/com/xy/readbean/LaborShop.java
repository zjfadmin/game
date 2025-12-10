/*
 * Decompiled with CFR 0.152.
 */
package com.xy.readbean;

public class LaborShop {
    private int type;
    private Integer vip;
    private int id;
    private String text;
    private Integer choice;
    private String skin;
    private Integer XGTime;
    private Integer XGNum;
    private String moneyType;
    private int[] goods;
    private long money;
    private String name;
    private Integer zk;

    public String getMoneyType() {
        return this.moneyType;
    }

    public String getSkin() {
        return this.skin;
    }

    public void setXGNum(Integer xGNum) {
        this.XGNum = xGNum;
    }

    public String getZKMoneyString(int type, double xs) {
        StringBuffer IiiiiiiiIIIII = new StringBuffer();
        IiiiiiiiIIIII.append(type == 0 ? "\u539f\u4ef7:" : "\u73b0\u4ef7:");
        IiiiiiiiIIIII.append(xs == 1.0 ? this.money : (long)((double)this.money * xs));
        IiiiiiiiIIIII.append(this.moneyType);
        return IiiiiiiiIIIII.toString();
    }

    public void setChoice(Integer choice) {
        this.choice = choice;
    }

    public Integer getXGTime() {
        return this.XGTime;
    }

    public String getName() {
        return this.name;
    }

    public void setVip(Integer vip) {
        this.vip = vip;
    }

    public void setZk(Integer zk) {
        this.zk = zk;
    }

    public String getMoneyString(double xs) {
        StringBuffer IiiiiiiiIIIII = new StringBuffer();
        IiiiiiiiIIIII.append(this.moneyType);
        IiiiiiiiIIIII.append(":");
        IiiiiiiiIIIII.append(xs == 1.0 ? this.money : (long)((double)this.money * xs));
        return IiiiiiiiIIIII.toString();
    }

    public void setMoneyType(String moneyType) {
        this.moneyType = moneyType;
    }

    public int[] getGoods() {
        return this.goods;
    }

    public void setGoods(int[] goods) {
        this.goods = goods;
    }

    /*
     * WARNING - void declaration
     */
    public String getXGString(int num) {
        void IiiiiiiiIIIII;
        if (this.XGNum == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\u9650\u8d2d:");
        stringBuffer.append(num);
        IiiiiiiiIIIII.append("/");
        IiiiiiiiIIIII.append(this.XGNum);
        return IiiiiiiiIIIII.toString();
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getChoice() {
        return this.choice;
    }

    public int getId() {
        return this.id;
    }

    public Integer getVip() {
        return this.vip;
    }

    public Integer getZk() {
        return this.zk;
    }

    public void setXGTime(Integer xGTime) {
        this.XGTime = xGTime;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    public int getType() {
        return this.type;
    }

    public String getText() {
        return this.text;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getXGNum() {
        return this.XGNum;
    }

    public void setType(int type) {
        this.type = type;
    }

    public long getMoney() {
        return this.money;
    }

    public void setId(int id) {
        this.id = id;
    }
}
