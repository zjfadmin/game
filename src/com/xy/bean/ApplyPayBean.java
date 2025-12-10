/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.UseCardBean
 */
package com.xy.bean;

import com.xy.bean.UseCardBean;
import java.math.BigDecimal;

public class ApplyPayBean {
    private String msg;
    private BigDecimal Dayandpayorno;
    private BigDecimal addM;
    private BigDecimal addX;
    private BigDecimal addC;
    private UseCardBean useCardBean;
    private UseCardBean VIPBean;
    private String activity;
    private BigDecimal LowOrHihtpack;

    public UseCardBean getVIPBean() {
        return this.VIPBean;
    }

    public void setAddC(BigDecimal addC) {
        this.addC = addC;
    }

    public BigDecimal getDayandpayorno() {
        return this.Dayandpayorno;
    }

    public BigDecimal getAddM() {
        return this.addM;
    }

    public void setAddM(BigDecimal addM) {
        this.addM = addM;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public void setLowOrHihtpack(BigDecimal lowOrHihtpack) {
        this.LowOrHihtpack = lowOrHihtpack;
    }

    public void setDayandpayorno(BigDecimal dayandpayorno) {
        this.Dayandpayorno = dayandpayorno;
    }

    public BigDecimal getAddX() {
        return this.addX;
    }

    public void setVIPBean(UseCardBean vIPBean) {
        this.VIPBean = vIPBean;
    }

    public BigDecimal getLowOrHihtpack() {
        return this.LowOrHihtpack;
    }

    public void setUseCardBean(UseCardBean useCardBean) {
        this.useCardBean = useCardBean;
    }

    public String getMsg() {
        return this.msg;
    }

    public UseCardBean getUseCardBean() {
        return this.useCardBean;
    }

    public String getActivity() {
        return this.activity;
    }

    public void setAddX(BigDecimal addX) {
        this.addX = addX;
    }

    public BigDecimal getAddC() {
        return this.addC;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
