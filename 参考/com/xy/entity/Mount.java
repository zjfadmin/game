package com.xy.entity;

import com.xy.hd;
import java.math.BigDecimal;
import java.util.List;

public class Mount {
   private BigDecimal mid;
   private Integer live;
   private Integer exp;
   private Integer mountid;
   private String data;
   private Integer useNumber;
   private Integer power;
   private Integer bone;
   private BigDecimal sid3;
   private BigDecimal othrersid;
   private Integer Proficiency;
   private Integer spri;
   private BigDecimal roleid;
   private String mountname;
   List<MountSkill> mountskill;
   private BigDecimal sid;
   private Integer exquisiteUseTime;
   private Integer mountlvl;

   public BigDecimal getRoleid() {
      return this.roleid;
   }

   public Integer getPower() {
      return this.power;
   }

   public BigDecimal getSid3() {
      return this.sid3;
   }

   public Integer getMountlvl() {
      return this.mountlvl;
   }

   public void setDataValue(String var1, String var2) {
      this.data = hd.af(this.data, var1, "|", var2);
   }

   public void setMid(BigDecimal var1) {
      this.mid = var1;
   }

   public Integer getMountid() {
      return this.mountid;
   }

   public void setPower(Integer var1) {
      this.power = var1;
   }

   public Integer getLive() {
      return this.live;
   }

   public void setRoleid(BigDecimal var1) {
      this.roleid = var1;
   }

   public void setExquisiteUseTime(Integer var1) {
      this.exquisiteUseTime = var1;
   }

   public void setMountname(String var1) {
      this.mountname = var1;
   }

   public void setSid(BigDecimal var1) {
      this.sid = var1;
   }

   public Integer getSpri() {
      return this.spri;
   }

   public BigDecimal getMid() {
      return this.mid;
   }

   public void setMountlvl(Integer var1) {
      this.mountlvl = var1;
   }

   public boolean a(BigDecimal var1) {
      if (var1 == null) {
         return (boolean)(3 >> 2);
      } else if (this.sid != null && this.sid.compareTo(var1) == 0) {
         return (boolean)(--1);
      } else if (this.othrersid != null && this.othrersid.compareTo(var1) == 0) {
         return (boolean)(2 ^ 3);
      } else {
         return (boolean)(this.sid3 != null && this.sid3.compareTo(var1) == 0 ? --1 : 0);
      }
   }

   public void setLive(Integer var1) {
      this.live = var1;
   }

   public String getMountlvlString() {
      return this.mountlvl <= (102 & 125) ? this.mountlvl + "级" : "点化" + (this.mountlvl - (109 & 118)) + "级";
   }

   public void setProficiency(Integer var1) {
      this.Proficiency = var1;
   }

   public Integer getExquisiteUseTime() {
      return this.exquisiteUseTime;
   }

   public BigDecimal getOthrersid() {
      return this.othrersid;
   }

   public Integer getExp() {
      return this.exp;
   }

   public void setMountskill(List<MountSkill> var1) {
      this.mountskill = var1;
   }

   public void setBone(Integer var1) {
      this.bone = var1;
   }

   public BigDecimal getSid() {
      return this.sid;
   }

   public Integer getProficiency() {
      return this.Proficiency;
   }

   public String getDataValue(String var1) {
      return hd.d(this.data, var1, "|");
   }

   public String getData() {
      return this.data;
   }

   public Integer getUseNumber() {
      return this.useNumber;
   }

   public int getMountCZ() {
      if (this.mountid >= 3 >> 1 && this.mountid <= --5) {
         String var1;
         return hd.o(var1 = this.getDataValue("CZ")) ? 5 >> 3 : hd.g(var1);
      } else {
         return 0;
      }
   }

   public void setSpri(Integer var1) {
      this.spri = var1;
   }

   public void setOthrersid(BigDecimal var1) {
      this.othrersid = var1;
   }

   public void setUseNumber(Integer var1) {
      this.useNumber = var1;
   }

   public void setMountid(Integer var1) {
      this.mountid = var1;
   }

   public Integer getBone() {
      return this.bone;
   }

   public void setData(String var1) {
      this.data = var1;
   }

   public List<MountSkill> getMountskill() {
      return this.mountskill;
   }

   public String getMountname() {
      return this.mountname;
   }

   public void setSid3(BigDecimal var1) {
      this.sid3 = var1;
   }

   public void setExp(Integer var1) {
      this.exp = var1;
   }
}
