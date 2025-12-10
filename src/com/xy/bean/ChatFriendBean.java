/*
 * Decompiled with CFR 0.152.
 */
package com.xy.bean;

import java.math.BigDecimal;

public class ChatFriendBean {
    private String message;
    private long time;
    private BigDecimal troop_id;
    private Integer grade;
    private Long mapid;
    private String friendName;
    private BigDecimal gangid;
    private BigDecimal SendRoleId;
    private String race_name;
    private String rolename;

    public void setMessage(String message) {
        this.message = message;
    }

    public void setFriendName(String friendName) {
        this.friendName = friendName;
    }

    public Long getMapid() {
        return this.mapid;
    }

    public void setSendRoleId(BigDecimal sendRoleId) {
        this.SendRoleId = sendRoleId;
    }

    public Integer getGrade() {
        return this.grade;
    }

    public void setRace_name(String race_name) {
        this.race_name = race_name;
    }

    public void setGangid(BigDecimal gangid) {
        this.gangid = gangid;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public BigDecimal getGangid() {
        return this.gangid;
    }

    public long getTime() {
        return this.time;
    }

    public String getRace_name() {
        return this.race_name;
    }

    public String getMessage() {
        return this.message;
    }

    public String getFriendName() {
        return this.friendName;
    }

    public void setTroop_id(BigDecimal troop_id) {
        this.troop_id = troop_id;
    }

    public String getRolename() {
        return this.rolename;
    }

    public BigDecimal getSendRoleId() {
        return this.SendRoleId;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public BigDecimal getTroop_id() {
        return this.troop_id;
    }

    public void setMapid(Long mapid) {
        this.mapid = mapid;
    }
}
