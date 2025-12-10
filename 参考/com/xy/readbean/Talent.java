package com.xy.readbean;

public class Talent {
   private String text;
   private double fail;
   private String demand;
   private String value;
   private int camp;
   private double touch;
   private String TalentName;
   private int id;

   public void setFail(double var1) {
      this.fail = var1;
   }

   public double getTouch() {
      return this.touch;
   }

   public void setTouch(double var1) {
      this.touch = var1;
   }

   public void setText(String var1) {
      this.text = var1;
   }

   public void setTalentName(String var1) {
      this.TalentName = var1;
   }

   public int getCamp() {
      return this.camp;
   }

   public String getTalentName() {
      return this.TalentName;
   }

   public String getValue() {
      return this.value;
   }

   public String getDemand() {
      return this.demand;
   }

   public double getFail() {
      return this.fail;
   }

   public void setDemand(String var1) {
      this.demand = var1;
   }

   public void setCamp(int var1) {
      this.camp = var1;
   }

   public int getId() {
      return this.id;
   }

   public String getText() {
      return this.text;
   }

   public void setId(int var1) {
      this.id = var1;
   }

   public void setValue(String var1) {
      this.value = var1;
   }
}
