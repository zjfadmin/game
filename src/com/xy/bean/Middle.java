/*
 * Decompiled with CFR 0.152.
 */
package com.xy.bean;

import java.math.BigDecimal;

public class Middle {
    private String taskDaily;
    private int Dayfirstinorno;
    private String taskComplete;
    private BigDecimal Daygetorno;
    private BigDecimal Dayandpayorno;
    private String activity;
    private BigDecimal Daypaysum;
    private String labor;
    private String rolename;
    private String Vipget;

    public String getLabor() {
        return this.labor;
    }

    public void setTaskComplete(String taskComplete) {
        this.taskComplete = taskComplete;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public BigDecimal getDayandpayorno() {
        return this.Dayandpayorno;
    }

    public String getTaskDaily() {
        return this.taskDaily;
    }

    public String getActivity() {
        return this.activity;
    }

    public String getRolename() {
        return this.rolename;
    }

    public void setVipget(String vipget) {
        this.Vipget = vipget;
    }

    public void setLabor(String labor) {
        this.labor = labor;
    }

    public String getVipget() {
        return this.Vipget;
    }

    public int getDayfirstinorno() {
        return this.Dayfirstinorno;
    }

    public void setTaskDaily(String taskDaily) {
        this.taskDaily = taskDaily;
    }

    public BigDecimal getDaypaysum() {
        return this.Daypaysum;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public void setDaypaysum(BigDecimal daypaysum) {
        this.Daypaysum = daypaysum;
    }

    public void setDayfirstinorno(int dayfirstinorno) {
        this.Dayfirstinorno = dayfirstinorno;
    }

    public String getTaskComplete() {
        return this.taskComplete;
    }

    public BigDecimal getDaygetorno() {
        return this.Daygetorno;
    }

    public void setDaygetorno(BigDecimal daygetorno) {
        this.Daygetorno = daygetorno;
    }

    public void setDayandpayorno(BigDecimal dayandpayorno) {
        this.Dayandpayorno = dayandpayorno;
    }
}
