package com.xy.bean;

import java.util.List;

public class GetClientUserMesageBean {
   private List<StallBean> stallBeans;
   private int ismap;
   private String monster;
   private String sceneMsg;
   private List<RoleShow> roleShows;

   public String getMonster() {
      return this.monster;
   }

   public String getSceneMsg() {
      return this.sceneMsg;
   }

   public List<StallBean> getStallBeans() {
      return this.stallBeans;
   }

   public RoleShow a(long var1) {
      int var3 = 2 & 5;
      int var4 = this.roleShows.size();

      for(int var10000 = var3; var10000 < var4; var10000 = var3) {
         RoleShow var5;
         if ((var5 = (RoleShow)this.roleShows.get(var3)).getRole_id().longValue() == var1) {
            this.roleShows.remove(var3);
            return var5;
         }

         ++var3;
      }

      return null;
   }

   public void setIsmap(int var1) {
      this.ismap = var1;
   }

   public int getIsmap() {
      return this.ismap;
   }

   public void setSceneMsg(String var1) {
      this.sceneMsg = var1;
   }

   public void setStallBeans(List<StallBean> var1) {
      this.stallBeans = var1;
   }

   public void setMonster(String var1) {
      this.monster = var1;
   }

   public void setRoleShows(List<RoleShow> var1) {
      this.roleShows = var1;
   }

   public List<RoleShow> getRoleShows() {
      return this.roleShows;
   }
}
