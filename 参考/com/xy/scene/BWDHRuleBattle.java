package com.xy.scene;

import com.xy.hd;
import com.xy.bean.RoleShow;
import java.awt.Point;
import java.math.BigDecimal;
import java.util.List;

public class BWDHRuleBattle {
   private int type;
   private Point point;
   private int win;
   private BWDHTeam bwdhTeam1;
   private BWDHTeam bwdhTeam2;

   public int getType() {
      return this.type;
   }

   public BWDHTeam a(String var1, int var2, int var3) {
      BWDHTeam var4 = new BWDHTeam();
      int var5 = 2 & 5;

      int var6;
      for(int var10000 = var6 = 3 >> 2; var10000 < var3; var10000 = var6) {
         if ((var6 = var1.indexOf("&", var2 + (2 ^ 3))) == -4 >> 2 || var6 > var3) {
            var6 = var3;
         }

         if (var5 == 0) {
            var10000 = var6;
            var4.setId(hd.b(var1, var2, var6));
         } else if (var5 == (3 & 5)) {
            var10000 = var6;
            var4.setName(var1.substring(var2, var6));
         } else {
            label61: {
               if (var5 == (1 ^ 3) || var5 == --3) {
                  if (var4.getRoleShows() == null) {
                     RoleShow[] var10001 = new RoleShow[3 & 5];
                     boolean var10003 = true;
                     var4.setRoleShows(var10001);
                     var4.getRoleShows()[5 >> 3] = new RoleShow();
                  }

                  if (var5 == (1 ^ 3)) {
                     var10000 = var6;
                     var4.getRoleShows()[5 >> 3].setSpecies_id(new BigDecimal(var1.substring(var2, var6)));
                     break label61;
                  }

                  if (var5 == --3) {
                     var4.getRoleShows()[2 & 5].setRolename(var1.substring(var2, var6));
                  }
               }

               var10000 = var6;
            }
         }

         ++var5;
         var2 = var10000 + 1;
      }

      if (var4.getId() == 0) {
         var4.setName("&轮空&");
      }

      return var4;
   }

   public BWDHRuleBattle(String var1, int var2, int var3) {
      int var10000 = 2 & 5;
      super();
      this.point = new Point();
      int var4 = var10000;

      int var5;
      for(var10000 = var5 = 3 >> 2; var10000 < var3; var10000 = var5) {
         if ((var5 = var1.indexOf("#", var2 + (3 >> 1))) == -4 >> 2 || var5 > var3) {
            var5 = var3;
         }

         if (var4 == 0) {
            var10000 = var5;
            this.win = hd.b(var1, var2, var5);
         } else if (var4 == (3 & 5)) {
            var10000 = var5;
            this.bwdhTeam1 = this.c(var4, var1, var2, var5);
         } else {
            if (var4 == (1 ^ 3)) {
               this.bwdhTeam2 = this.c(var4, var1, var2, var5);
            }

            var10000 = var5;
         }

         ++var4;
         var2 = var10000 + 1;
      }

   }

   public BWDHTeam getBwdhTeam2() {
      return this.bwdhTeam2;
   }

   public BWDHTeam getBwdhTeam1() {
      return this.bwdhTeam1;
   }

   public void b(String var1, int var2, int var3) {
      int var10000 = 2 & 5;
      this.point = new Point();
      int var4 = var10000;

      int var5;
      for(var10000 = var5 = 3 & 4; var10000 < var3; var10000 = var5) {
         if ((var5 = var1.indexOf("#", var2 + --1)) == -4 >> 2 || var5 > var3) {
            var5 = var3;
         }

         if (var4 == 0) {
            var10000 = var5;
            this.type = hd.b(var1, var2, var5);
         } else if (var4 == 5 >> 2) {
            var10000 = var5;
            this.win = hd.b(var1, var2, var5);
         } else if (var4 == (1 ^ 3)) {
            var10000 = var5;
            this.bwdhTeam1 = this.a(var1, var2, var5);
         } else {
            if (var4 == --3) {
               this.bwdhTeam2 = this.a(var1, var2, var5);
            }

            var10000 = var5;
         }

         ++var4;
         var2 = var10000 + 1;
      }

   }

   public void setBwdhTeam1(BWDHTeam var1) {
      this.bwdhTeam1 = var1;
   }

   public BWDHRuleBattle() {
   }

   public BWDHTeam c(int var1, String var2, int var3, int var4) {
      BWDHTeam var5 = new BWDHTeam();
      int var6 = 5 >> 3;

      int var7;
      for(int var10000 = var7 = 3 >> 2; var10000 < var4; var10000 = var7) {
         if ((var7 = var2.indexOf("&", var3 + --1)) == -4 >> 2 || var7 > var4) {
            var7 = var4;
         }

         if (var6 == 0) {
            var10000 = var7;
            var5.setId(hd.b(var2, var3, var7));
         } else if (var6 == 5 >> 2) {
            var10000 = var7;
            var5.setName(var2.substring(var3, var7));
         } else {
            label46: {
               if (var6 == 5 >> 1) {
                  if (var1 == --1) {
                     var10000 = var7;
                     this.point.x = hd.b(var2, var3, var7);
                     break label46;
                  }

                  this.point.y = hd.b(var2, var3, var7);
               }

               var10000 = var7;
            }
         }

         ++var6;
         var3 = var10000 + 1;
      }

      if (var5.getId() == 0) {
         var5.setName("&轮空&");
      }

      return var5;
   }

   public void d(String var1, int var2, int var3, List<BWDHRuleBattleRecord> var4) {
      int var10000 = 3 >> 2;
      this.point = new Point();
      int var5 = var10000;

      int var6;
      for(var10000 = var6 = 3 ^ 3; var10000 < var3; var10000 = var6) {
         if ((var6 = var1.indexOf("#", var2 + (5 >> 2))) == -4 >> 2 || var6 > var3) {
            var6 = var3;
         }

         if (var5 == 0) {
            var10000 = var6;
            this.type = hd.b(var1, var2, var6);
         } else if (var5 == --1) {
            var10000 = var6;
            this.win = hd.b(var1, var2, var6);
         } else if (var5 == (1 ^ 3)) {
            var10000 = var6;
            this.bwdhTeam1 = this.c(5 >> 3, var1, var2, var6);
         } else if (var5 == --3) {
            var10000 = var6;
            this.bwdhTeam2 = this.c(2 & 5, var1, var2, var6);
         } else {
            var4.add(new BWDHRuleBattleRecord(var5 - --3, var1, var2, var6, this));
            var10000 = var6;
         }

         ++var5;
         var2 = var10000 + 1;
      }

   }

   public Point getPoint() {
      return this.point;
   }

   public int getWin() {
      return this.win;
   }

   public void setBwdhTeam2(BWDHTeam var1) {
      this.bwdhTeam2 = var1;
   }
}
