package com.xy.bean;

public class PayvipBean {
   private Integer grade;
   private Integer paynum;
   private String datetime;
   private String increationtext;
   private Integer id;
   private String instructiontext;
   private static final long serialVersionUID = 6418302556494912817L;
   private Integer getnumber;
   private String givegoods;

   public String getGivegoods() {
      return this.givegoods;
   }

   public String getDatetime() {
      return this.datetime;
   }

   public Integer getPaynum() {
      return this.paynum;
   }

   public void setPaynum(Integer var1) {
      this.paynum = var1;
   }

   public String getInstructiontext() {
      return this.instructiontext;
   }

   public void setGrade(Integer var1) {
      this.grade = var1;
   }

   public void setIncreationtext(String var1) {
      this.increationtext = var1;
   }

   public void setGetnumber(Integer var1) {
      this.getnumber = var1;
   }

   public void setInstructiontext(String var1) {
      this.instructiontext = var1;
   }

   public void setDatetime(String var1) {
      this.datetime = var1;
   }

   public void setId(Integer var1) {
      this.id = var1;
   }

   public void setGivegoods(String var1) {
      this.givegoods = var1;
   }

   public Integer getGetnumber() {
      return this.getnumber;
   }

   public Integer getId() {
      return this.id;
   }

   public Integer getGrade() {
      return this.grade;
   }

   public String getIncreationtext() {
      return this.increationtext;
   }
}
