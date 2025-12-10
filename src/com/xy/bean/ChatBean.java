/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.BeauBean
 */
package com.xy.bean;

import com.xy.bean.BeauBean;
import java.math.BigDecimal;

public class ChatBean {
    private String message;
    private String role;
    private BigDecimal roleId;
    private int id;
    private String skin;
    private BeauBean beauBean;

    public void setMessage(String message) {
        this.message = message;
    }

    public BigDecimal getRoleId() {
        return this.roleId;
    }

    public String getSkin() {
        return this.skin;
    }

    public void setBeauBean(BeauBean beauBean) {
        this.beauBean = beauBean;
    }

    public String getMessage() {
        return this.message;
    }

    public int getId() {
        return this.id;
    }

    public String getRole() {
        return this.role;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setRoleId(BigDecimal roleId) {
        this.roleId = roleId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BeauBean getBeauBean() {
        return this.beauBean;
    }
}
