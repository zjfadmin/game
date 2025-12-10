/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.CreepsMovePath
 *  com.xy.bean.PathPoint
 */
package com.xy.bean;

import com.xy.bean.CreepsMovePath;
import com.xy.bean.PathPoint;
import java.util.List;

public class MonsterBean {
    private Integer x;
    private transient CreepsMovePath movePath;
    private String robottitle;
    private Integer robotid;
    private transient List<Integer> taskList;
    private String follow;
    private String robotskin;
    private Integer y;
    private int type = 0;
    private Integer i;
    private transient PathPoint HP;
    private int robottype;
    private String robotname;

    public Integer getX() {
        return this.x;
    }

    public String getFollow() {
        return this.follow;
    }

    public void setFollow(String follow) {
        this.follow = follow;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public void setHP(PathPoint hP) {
        this.HP = hP;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public int getType() {
        return this.type;
    }

    public void setRobottitle(String robottitle) {
        this.robottitle = robottitle;
    }

    public void setTaskList(List<Integer> taskList) {
        this.taskList = taskList;
    }

    public String getRobottitle() {
        return this.robottitle;
    }

    public void setRobotid(Integer robotid) {
        this.robotid = robotid;
    }

    public String getRobotskin() {
        return this.robotskin;
    }

    public CreepsMovePath getMovePath() {
        return this.movePath;
    }

    public Integer getRobotid() {
        return this.robotid;
    }

    public Integer getY() {
        return this.y;
    }

    public PathPoint getHP() {
        return this.HP;
    }

    public void setRobottype(int robottype) {
        this.robottype = robottype;
    }

    public int getRobottype() {
        return this.robottype;
    }

    public void setType(int type) {
        this.type = type;
    }

    public List<Integer> getTaskList() {
        return this.taskList;
    }

    public String getRobotname() {
        return this.robotname;
    }

    public void setRobotname(String robotname) {
        this.robotname = robotname;
    }

    public void setMovePath(CreepsMovePath movePath) {
        this.movePath = movePath;
    }

    public void setRobotskin(String robotskin) {
        this.robotskin = robotskin;
    }

    public void setI(Integer i) {
        this.i = i;
    }

    public Integer getI() {
        return this.i;
    }
}
