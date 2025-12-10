package com.xy.bean;

import java.util.List;

public class MonsterBean {
   private transient List<Integer> taskList;
   private transient PathPoint HP;
   private String robotskin;
   private Integer x;
   private Integer y;
   private String follow;
   private int robottype;
   private String robotname;
   private Integer i;
   private Integer robotid;
   private transient CreepsMovePath movePath;
   private int type;
   private String robottitle;

   public List<Integer> getTaskList() {
      return this.taskList;
   }

   public void setY(Integer var1) {
      this.y = var1;
   }

   public void setHP(PathPoint var1) {
      this.HP = var1;
   }

   public String getRobotname() {
      return this.robotname;
   }

   public Integer getY() {
      return this.y;
   }

   public String getFollow() {
      return this.follow;
   }

   public void setType(int var1) {
      this.type = var1;
   }

   public void setRobotname(String var1) {
      this.robotname = var1;
   }

   public void setFollow(String var1) {
      this.follow = var1;
   }

   public Integer getRobotid() {
      return this.robotid;
   }

   public String getRobottitle() {
      return this.robottitle;
   }

   public void setRobotskin(String var1) {
      this.robotskin = var1;
   }

   public int getType() {
      return this.type;
   }

   public void setI(Integer var1) {
      this.i = var1;
   }

   public void setX(Integer var1) {
      this.x = var1;
   }

   public void setRobottitle(String var1) {
      this.robottitle = var1;
   }

   public void setRobotid(Integer var1) {
      this.robotid = var1;
   }

   public void setMovePath(CreepsMovePath var1) {
      this.movePath = var1;
   }

   public Integer getI() {
      return this.i;
   }

   public MonsterBean() {
      int var10001 = 3 >> 2;
      super();
      this.type = var10001;
   }

   public Integer getX() {
      return this.x;
   }

   public PathPoint getHP() {
      return this.HP;
   }

   public void setRobottype(int var1) {
      this.robottype = var1;
   }

   public CreepsMovePath getMovePath() {
      return this.movePath;
   }

   public void setTaskList(List<Integer> var1) {
      this.taskList = var1;
   }

   public int getRobottype() {
      return this.robottype;
   }

   public String getRobotskin() {
      return this.robotskin;
   }
}
