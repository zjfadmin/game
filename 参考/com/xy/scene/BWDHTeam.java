package com.xy.scene;

import com.xy.hd;
import com.xy.bean.RoleShow;
import java.math.BigDecimal;

public class BWDHTeam {
   private int flag;
   private int[] data2;
   private String name;
   private RoleShow[] roleShows;
   private int id;

   public void setData2(int[] var1) {
      this.data2 = var1;
   }

   public int getFlag() {
      return this.flag;
   }

   public String getName() {
      return this.name;
   }

   public void setFlag(int var1) {
      this.flag = var1;
   }

   public void setRoleShows(RoleShow[] var1) {
      this.roleShows = var1;
   }

   public int a(BigDecimal var1) {
      int var2;
      for(int var10000 = var2 = 2 & 5; var10000 < this.roleShows.length; var10000 = var2) {
         if (hd.v(this.roleShows[var2].getRole_id(), var1)) {
            return var2;
         }

         ++var2;
      }

      return -4 >> 2;
   }

   public void setId(int var1) {
      this.id = var1;
   }

   public void b(String var1, int var2, int var3) {
      int[] var10000 = new int[22 & 111];
      boolean var10002 = true;
      int[] var4 = var10000;
      int var5 = 3 ^ 3;

      int var6;
      for(int var7 = var6 = 5 >> 3; var7 < var3; var7 = var6) {
         if ((var6 = var1.indexOf("#", var2 + --1)) == -4 >> 2 || var6 > var3) {
            var6 = var3;
         }

         if (var5 == 0) {
            var7 = var6;
            this.id = hd.b(var1, var2, var6);
         } else if (var5 == 5 >> 2) {
            var7 = var6;
            this.name = var1.substring(var2, var6);
         } else {
            if (var5 - (1 ^ 3) < var4.length) {
               var4[var5 - (1 ^ 3)] = hd.b(var1, var2, var6);
            }

            var7 = var6;
         }

         ++var5;
         var2 = var7 + 1;
      }

      this.data2 = var4;
   }

   public void setName(String var1) {
      this.name = var1;
   }

   public int getId() {
      return this.id;
   }

   public RoleShow[] getRoleShows() {
      return this.roleShows;
   }

   public int[] getData2() {
      return this.data2;
   }
}
