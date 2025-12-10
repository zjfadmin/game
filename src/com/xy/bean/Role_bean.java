/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.BeauBean
 */
package com.xy.bean;

import com.xy.bean.BeauBean;
import java.math.BigDecimal;

public class Role_bean {
    private String race_name;
    private BeauBean beauBean;
    private String title;
    private String rolename;
    private String skin;
    private String gangname;
    private Integer grade;
    private BigDecimal role_id;

    public String getRace_name() {
        return this.race_name;
    }

    public String getGangname() {
        return this.gangname;
    }

    public BigDecimal getRole_id() {
        return this.role_id;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public void setRace_name(String race_name) {
        this.race_name = race_name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BeauBean getBeauBean() {
        return this.beauBean;
    }

    public void setRole_id(BigDecimal role_id) {
        this.role_id = role_id;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getGrade() {
        return this.grade;
    }

    public void setBeauBean(BeauBean beauBean) {
        this.beauBean = beauBean;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public String getTitle() {
        return this.title;
    }

    public String getRolename() {
        return this.rolename;
    }

    public void setGangname(String gangname) {
        this.gangname = gangname;
    }

    public String getSkin() {
        return this.skin;
    }
}
