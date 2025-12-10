package com.xy.readbean;

import com.xy.mi;
import java.awt.Point;

public class ActivityFCBeau {
   private long cycleTime;
   private Point pointTime;

   public ActivityFCBeau a(String var1) {
      int var4 = 5 >> 3;
      int var3 = 3 >> 2;
      int var2 = 3 & 4;

      for(int var10000 = var3; var10000 < var1.length(); var10000 = var3) {
         if ((var3 = var1.indexOf("|", var4 + (2 ^ 3))) == -4 >> 2) {
            var3 = var1.length();
         }

         if ((var2 = var1.indexOf("=", var4 + --1)) == -4 >> 2 || var2 > var3) {
            var2 = var3;
         }

         String var5;
         if ((var5 = var1.substring(var4, var2)).equals("时间周期")) {
            var10000 = var3;
            this.cycleTime = (long)BWDHRule.a(var1, var2 + (3 & 5), var3);
         } else {
            if (var5.equals("抢靓号时间")) {
               var4 = var2 + (3 & 5);
               if ((var2 = var1.indexOf("#", var4 + --1)) == -4 >> 2 || var2 > var3) {
                  var2 = var3;
               }

               this.pointTime = new Point();
               this.pointTime.x = BWDHRule.a(var1, var4, var2);
               this.pointTime.y = BWDHRule.a(var1, var2 + (2 ^ 3), var3);
            }

            var10000 = var3;
         }

         var4 = var10000 + 1;
      }

      return this;
   }

   public long getCycleTime() {
      return this.cycleTime;
   }

   public static void main(String[] var0) {
      System.out.println("\n###########################################\n#                                         #\n#      ## #   #    ## ### ### ##  ###     #\n#     # # #   #   # #  #  # # # #  #      #\n#     ### #   #   ###  #  # # ##   #      #\n#     # # ### ### # #  #  ### # # ###     #\n#                                         #\n# Protecting Java applications since 2006 #\n#                                         #\n#      Allatori Obfuscator v9.4 DEMO      #\n#                                         #\n#              DEMO VERSION!              #\n#                                         #\n#         NOT FOR COMMERCIAL USE!         #\n#                                         #\n#          https://allatori.com           #\n#                                         #\n###########################################\n");
      System.out.println(mi.b().toJson((new ActivityFCBeau()).a("时间周期=7天|抢靓号时间=5天20时#5天22时")));
      System.out.println(mi.b().toJson((new ActivityFCBeau()).b("1315天20时#1315天22时")));
   }

   public ActivityFCBeau b(String var1) {
      int var2 = var1.indexOf("#");
      this.pointTime = new Point();
      this.pointTime.x = BWDHRule.a(var1, 2 & 5, var2);
      this.pointTime.y = BWDHRule.a(var1, var2 + (2 ^ 3), var1.length());
      return this;
   }

   public Point getPointTime() {
      return this.pointTime;
   }
}
