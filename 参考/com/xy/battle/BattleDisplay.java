package com.xy.battle;

import com.xy.cY;
import com.xy.dx;
import com.xy.lz;
import com.xy.z;
import java.awt.Color;
import java.awt.Graphics;

public class BattleDisplay {
   private Color tsc;
   private String mpsmall;
   private String hpbig;
   private Color hpc;
   private String ts;
   private long time;
   public String ZM;
   private boolean is;
   public static int TILIU = 32599 & 1468;
   private String mpbig;
   private z sprite;
   private String hpsmall;
   private Color mpc;
   private String tcp;

   public void setTs(String var1) {
      this.ts = var1;
   }

   public void a(int var1) {
      this.time += (long)var1;
   }

   public boolean b(Graphics var1, int var2, int var3, boolean var4) {
      if (this.time > (long)TILIU) {
         return (boolean)(4 ^ 5);
      } else {
         int var5 = (int)(this.time / 15L);
         var3 -= var5;
         if (this.tsc != null) {
            var5 = var2 - this.ts.length() * (26 & 117) - --5;
            var1.setFont(lz.cd);
            var1.setColor(lz.aa);
            var1.drawString(this.ts, var5 - --1, var3);
            var1.drawString(this.ts, var5 + (3 & 5), var3);
            var1.drawString(this.ts, var5, var3 - (3 >> 1));
            var1.drawString(this.ts, var5, var3 + --1);
            var1.setColor(this.tsc);
            var1.drawString(this.ts, var5, var3);
         }

         if (this.tcp != null) {
            if (this.sprite == null) {
               this.sprite = dx.q(this.tcp);
            }

            if (this.sprite != null) {
               this.sprite.d(0L, 2 & 5);
               this.sprite.aa(var1, var2 - (107 & 60), var3 - (95 & 47));
            }
         }

         if (this.hpc != null) {
            var5 = var2;
            if (this.hpbig != null) {
               var1.setFont(lz.y);
               var1.setColor(Color.BLACK);
               var1.drawString(this.hpbig, var2 - (3 & 5), var3);
               var1.drawString(this.hpbig, var2 + (5 >> 2), var3);
               var1.drawString(this.hpbig, var2, var3 - (3 & 5));
               var1.drawString(this.hpbig, var2, var3 + (4 ^ 5));
               var1.setColor(this.hpc);
               var1.drawString(this.hpbig, var2, var3);
               var5 = var2 + this.hpbig.length() * (42 & 95);
            }

            var1.setFont(lz.ca);
            var1.setColor(Color.BLACK);
            var1.drawString(this.hpsmall, var5 - (3 & 5), var3);
            var1.drawString(this.hpsmall, var5 + (3 >> 1), var3);
            var1.drawString(this.hpsmall, var5, var3 - (4 ^ 5));
            var1.drawString(this.hpsmall, var5, var3 + (3 & 5));
            var1.setColor(this.hpc);
            var1.drawString(this.hpsmall, var5, var3);
         }

         var3 -= 15;
         if (this.mpc != null && var4) {
            var5 = var2;
            if (this.mpbig != null) {
               var1.setFont(lz.y);
               var1.setColor(Color.BLACK);
               var1.drawString(this.mpbig, var2 - (4 ^ 5), var3);
               var1.drawString(this.mpbig, var2 + (3 & 5), var3);
               var1.drawString(this.mpbig, var2, var3 - (4 ^ 5));
               var1.drawString(this.mpbig, var2, var3 + (5 >> 2));
               var1.setColor(this.mpc);
               var1.drawString(this.mpbig, var2, var3);
               var5 = var2 + this.mpbig.length() * (126 & 11);
            }

            var1.setFont(lz.ca);
            var1.setColor(Color.BLACK);
            var1.drawString(this.mpsmall, var5 - (3 >> 1), var3);
            var1.drawString(this.mpsmall, var5 + --1, var3);
            var1.drawString(this.mpsmall, var5, var3 - 1);
            var1.drawString(this.mpsmall, var5, var3 + 1);
            var1.setColor(this.mpc);
            var1.drawString(this.mpsmall, var5, var3);
         }

         return false;
      }
   }

   public String getTs() {
      return this.ts;
   }

   public boolean c(boolean var1) {
      if (this.time < 0L) {
         return (boolean)(3 ^ 3);
      } else {
         return this.is ? var1 : true;
      }
   }

   public BattleDisplay(boolean var1, String var2, int var3, int var4) {
      int var10000;
      label74: {
         super();
         this.ZM = "致命";
         this.is = var1;
         if (var2 != null) {
            if (var2.equals("致命")) {
               var10000 = var3;
               this.tcp = cY.m("ztzm");
               break label74;
            }

            if (var2.equals("至圣")) {
               var10000 = var3;
               this.tcp = cY.m("ztzs");
               break label74;
            }

            if (var2.equals("怨气")) {
               var10000 = var3;
               this.tcp = cY.m("ztyq");
               break label74;
            }

            if (var2.equals("吸收")) {
               var10000 = var3;
               this.tcp = cY.m("ztxs");
               break label74;
            }

            if (var2.equals("怒气")) {
               var10000 = var3;
               this.tcp = cY.m("ztnq");
               break label74;
            }

            if (var2.equals("狂暴")) {
               var10000 = var3;
               this.tcp = cY.m("ztkb");
               break label74;
            }

            if (var2.equals("4倍")) {
               var10000 = var3;
               this.tcp = cY.m("zt4b");
               break label74;
            }

            if (var2.equals("3倍")) {
               this.tcp = cY.m("zt3b");
               var10000 = var3;
               break label74;
            }

            this.ts = var2;
            this.tsc = Color.YELLOW;
         }

         var10000 = var3;
      }

      StringBuilder var10002;
      String var6;
      label54: {
         if (var10000 != 0) {
            var6 = null;
            var10002 = new StringBuilder;
            String var7;
            if (var3 > 0) {
               var10002.<init>("+");
               var7 = var6 = var10002.append(var3).toString();
               this.hpc = Color.GREEN;
            } else {
               var10002.<init>(String.valueOf(var3));
               var7 = var6 = var10002.toString();
               this.hpc = lz.bw;
            }

            if (var7.length() >= (7 & 126)) {
               var10000 = var4;
               this.hpbig = var6.substring(3 ^ 3, var6.length() - --4);
               this.hpsmall = var6.substring(var6.length() - --4, var6.length());
               break label54;
            }

            this.hpsmall = var6;
         }

         var10000 = var4;
      }

      BattleDisplay var5;
      label47: {
         if (var10000 != 0) {
            var6 = null;
            var10002 = new StringBuilder;
            if (var3 > 0) {
               var10002.<init>("+");
               var6 = var10002.append(var4).toString();
               var5 = this;
            } else {
               var10002.<init>(String.valueOf(var4));
               var6 = var10002.toString();
               var5 = this;
            }

            var5.mpc = Color.BLUE;
            if (var6.length() >= (39 & 94)) {
               var5 = this;
               this.mpbig = var6.substring(3 & 4, var6.length() - --4);
               this.mpsmall = var6.substring(var6.length() - --4, var6.length());
               break label47;
            }

            this.mpsmall = var6;
         }

         var5 = this;
      }

      var5.time = 0L;
   }

   public long getTime() {
      return this.time;
   }

   public void setTime(long var1) {
      this.time = var1;
   }
}
