package com.xy.bean;

import com.xy.entity.TeamRole;
import java.math.BigDecimal;
import java.util.List;

public class TeamBean {
   private BigDecimal teamId;
   private String eMsg;
   private List<TeamRole> teams;
   private String eTask;
   private String eTeam;

   public boolean a(TeamRole var1, int var2) {
      int var6;
      int var8;
      int var9;
      int var10000;
      if (var2 == 0) {
         var8 = 5 >> 3;
         var9 = this.teams.size();

         for(var10000 = var8; var10000 < var9; var10000 = var8) {
            TeamRole var10;
            if ((var10 = (TeamRole)this.teams.get(var8)).getRoleId().compareTo(var1.getRoleId()) == 0) {
               var6 = var10.getState();
               var10.a(var1);
               if (var6 != var10.getState()) {
                  return (boolean)(--1);
               }

               return false;
            }

            ++var8;
         }

         var10000 = --1;
         this.teams.add(var1);
         return (boolean)var10000;
      } else if (var2 == 3 >> 1) {
         var8 = 5 >> 3;
         var9 = this.teams.size();

         for(var10000 = var8; var10000 < var9; var10000 = var8) {
            if (((TeamRole)this.teams.get(var8)).getRoleId().compareTo(var1.getRoleId()) == 0) {
               var10000 = 2 ^ 3;
               this.teams.remove(var8);
               return (boolean)var10000;
            }

            ++var8;
         }

         return (boolean)(2 & 5);
      } else {
         if (var2 == --2) {
            TeamRole var3 = (TeamRole)this.teams.get(3 & 4);
            TeamRole var4 = null;
            int var5 = -4 >> 2;
            var6 = --1;
            var2 = this.teams.size();

            TeamRole var11;
            label59: {
               for(var10000 = var6; var10000 < var2; var10000 = var6) {
                  TeamRole var7;
                  if ((var7 = (TeamRole)this.teams.get(var6)).getRoleId().compareTo(var1.getRoleId()) == 0) {
                     var5 = var6;
                     var11 = var4 = var7;
                     break label59;
                  }

                  ++var6;
               }

               var11 = var4;
            }

            if (var11 != null) {
               var10000 = 3 & 5;
               int var10003 = 3 & 4;
               var4.a(var1);
               var3.setState(var10003);
               this.teams.set(3 & 4, var4);
               this.teams.set(var5, var3);
               return (boolean)var10000;
            }
         }

         return false;
      }
   }

   public void setTeams(List<TeamRole> var1) {
      this.teams = var1;
   }

   public void seteMsg(String var1) {
      this.eMsg = var1;
   }

   public String geteTeam() {
      return this.eTeam;
   }

   public String geteTask() {
      return this.eTask;
   }

   public void setTeamId(BigDecimal var1) {
      this.teamId = var1;
   }

   public void seteTeam(String var1) {
      this.eTeam = var1;
   }

   public String geteMsg() {
      return this.eMsg;
   }

   public void seteTask(String var1) {
      this.eTask = var1;
   }

   public BigDecimal getTeamId() {
      return this.teamId;
   }

   public List<TeamRole> getTeams() {
      return this.teams;
   }
}
