package com.xy.game;

import com.xy.mi;
import com.xy.bean.LoginResult;
import com.xy.bean.Middle;
import com.xy.socket.Agreement;

public class PKSys {
   private int pk3;
   private int pk2;
   private RoleData roleData;
   public static long YW = 36000000L;
   private int pk4;
   private int pk1;
   private long JailTime;

   public int getPk3() {
      return this.pk3;
   }

   public void a(String var1) {
      try {
         this.roleData.getLoginResult().setTaskDaily(var1);
         String[] var3;
         this.pk1 = Integer.parseInt((var3 = this.roleData.getLoginResult().getTaskDaily().split("\\|"))[3 & 4]);
         this.pk2 = Integer.parseInt(var3[4 ^ 5]);
         this.pk3 = Integer.parseInt(var3[5 >> 1]);
         this.pk4 = Integer.parseInt(var3[--3]);
      } catch (Exception var2) {
      }
   }

   public void setPk3(int var1) {
      this.pk3 = var1;
   }

   public static long getJailTime(int var0) {
      long var1 = 7200000L;
      if (var0 <= --1) {
         return var1;
      } else {
         if (var0 > --3) {
            var0 = --3;
         }

         return var1 * (long)var0;
      }
   }

   public void setPk4(int var1) {
      this.pk4 = var1;
   }

   public void setPk2(int var1) {
      this.pk2 = var1;
   }

   public String b() {
      return this.pk1 + "|" + this.pk2 + "|" + this.pk3 + "|" + this.pk4;
   }

   public void setPk1(int var1) {
      this.pk1 = var1;
   }

   public void c() {
      int var10002 = 3 ^ 3;
      this.JailTime = 0L;
      this.pk1 = Math.max(var10002, this.pk1 - --1);
      this.roleData.getGameView().f("你减少了一点pk标识你还有#G " + this.pk1 + " #Y点PK标志");
      LoginResult var1;
      (var1 = this.roleData.getLoginResult()).setTaskDaily(this.b());
      Middle var2 = new Middle();
      var2.setRolename(var1.getRolename());
      var2.setTaskDaily(var1.getTaskDaily());
      String var3 = Agreement.getSendTextAES("middle", mi.b().toJson(var2));
      this.roleData.getGameView().getClient().d(var3);
   }

   public int getPk1() {
      return this.pk1;
   }

   public int getPk4() {
      return this.pk4;
   }

   public PKSys(RoleData var1) {
      int var10005 = 3 >> 2;
      int var10007 = 5 >> 3;
      int var10009 = 5 >> 3;
      int var10011 = 5 >> 3;
      super();
      this.pk1 = var10011;
      this.pk2 = var10009;
      this.pk3 = var10007;
      this.pk4 = var10005;
      this.roleData = var1;
      this.a(var1.getLoginResult().getTaskDaily());
   }

   public int getPk2() {
      return this.pk2;
   }

   public void d() {
      if (this.pk1 > 0) {
         this.JailTime += 60000L;
         if (this.pk2 != 0) {
            if (getJailTime(this.pk4) < this.JailTime) {
               this.c();
               return;
            }
         } else if (this.roleData.getGameView().mapScene.i && YW < this.JailTime) {
            this.c();
         }

      }
   }
}
