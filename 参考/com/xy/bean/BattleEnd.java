package com.xy.bean;

public class BattleEnd {
   private String taskn;
   private OneArenaBean arenaBean;
   private String msg;
   private AssetUpdate assetUpdate;
   private int camp;
   private int FightingNumber;
   private String taskDaily;

   public String getTaskDaily() {
      return this.taskDaily;
   }

   public void setArenaBean(OneArenaBean var1) {
      this.arenaBean = var1;
   }

   public void setAssetUpdate(AssetUpdate var1) {
      this.assetUpdate = var1;
   }

   public OneArenaBean getArenaBean() {
      return this.arenaBean;
   }

   public void setFightingNumber(int var1) {
      this.FightingNumber = var1;
   }

   public int getFightingNumber() {
      return this.FightingNumber;
   }

   public void setTaskn(String var1) {
      this.taskn = var1;
   }

   public AssetUpdate getAssetUpdate() {
      return this.assetUpdate;
   }

   public void setMsg(String var1) {
      this.msg = var1;
   }

   public void setTaskDaily(String var1) {
      this.taskDaily = var1;
   }

   public void setCamp(int var1) {
      this.camp = var1;
   }

   public int getCamp() {
      return this.camp;
   }

   public String getTaskn() {
      return this.taskn;
   }

   public String getMsg() {
      return this.msg;
   }
}
