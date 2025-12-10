package com.xy.bean;

public class RoleSystem {
   private Integer isFriend;
   private Integer isPk;
   private Integer isMail;
   private Integer isSound;
   private Integer isSound2;
   private Integer isTeam;
   private Integer isNews;
   private Integer show;
   private Integer isGood;

   public void setIsGood(Integer var1) {
      this.isGood = var1;
   }

   public Integer getIsPk() {
      return this.isPk;
   }

   public Integer getIsGood() {
      return this.isGood;
   }

   public void setIsPk(Integer var1) {
      this.isPk = var1;
   }

   public void setIsFriend(Integer var1) {
      this.isFriend = var1;
   }

   public RoleSystem() {
      int var10001 = 4 ^ 5;
      int var10003 = 2 ^ 3;
      int var10005 = 2 ^ 3;
      int var10007 = 4 ^ 5;
      int var10009 = 4 ^ 5;
      int var10011 = 3 & 5;
      int var10013 = 3 & 5;
      int var10015 = 4 ^ 5;
      int var10017 = 4 ^ 5;
      super();
      this.show = var10017;
      this.isSound = var10015;
      this.isSound2 = var10013;
      this.isPk = var10011;
      this.isNews = var10009;
      this.isMail = var10007;
      this.isFriend = var10005;
      this.isGood = var10003;
      this.isTeam = var10001;
   }

   public Integer getIsNews() {
      return this.isNews;
   }

   public void setIsTeam(Integer var1) {
      this.isTeam = var1;
   }

   public Integer getIsMail() {
      return this.isMail;
   }

   public void setIsSound2(Integer var1) {
      this.isSound2 = var1;
   }

   public Integer getIsSound() {
      return this.isSound;
   }

   public void setIsNews(Integer var1) {
      this.isNews = var1;
   }

   public Integer getIsFriend() {
      return this.isFriend;
   }

   public Integer getShow() {
      return this.show;
   }

   public void setShow(Integer var1) {
      this.show = var1;
   }

   public Integer getIsSound2() {
      return this.isSound2;
   }

   public void setIsMail(Integer var1) {
      this.isMail = var1;
   }

   public void setIsSound(Integer var1) {
      this.isSound = var1;
   }

   public Integer getIsTeam() {
      return this.isTeam;
   }
}
