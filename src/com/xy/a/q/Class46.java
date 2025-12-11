package com.xy.a.q;

import com.xy.readbean.AlchemySet;
import com.xy.readbean.AlchemyUnit;
import com.xy.readbean.Goodstable;
import com.xy.readbean.Skill;
import java.util.LinkedList;

class Class46 extends com.xy.q.Class50 {
   private int cb;
   // $VF: synthetic field
   final Class13 aao;
   private Class58[] aap;
   private com.xy.w.Class18 dm;
   private int ah;

   public void us(Goodstable var1, AlchemySet var2) {
      if (var1 == null) {
         this.cc(0, 0);
      } else {
         int var3 = 0;
         int var4 = 0;
         int var5 = 0;
         String var6 = var1.getValue();
         int var7 = 0;
         int var8;
         int var10000 = var8 = 0;

         while (var10000 < var6.length()) {
            String var10001 = "~";
            if ((var8 = var6.indexOf("|", var7 + 1)) == -1) {
               var8 = var6.length();
            }

            label63: {
               var10001 = ":";
               int var9;
               if ((var9 = var6.indexOf("=", var7 + 1)) != -1) {
                  if (var9 > var8) {
                     var10000 = var8;
                     break label63;
                  }

                  String var10;
                  String var17 = var10 = var6.substring(var7, var9);
                  var10001 = "筛纥";
                  if (var17.equals("等级")) {
                     var3 = com.xy.v.Class12.ad(var6, var9 + 1, var8);
                     var10000 = var8;
                     break label63;
                  }

                  var10001 = "聖乂";
                  if (var10.equals("耐久")) {
                     var10000 = var8;
                     break label63;
                  }

                  var10001 = "抒胿";
                  if (var10.equals("技能")) {
                     if (var5 < 2) {
                        var7 = var9 + 1;
                        String var10004 = "$";
                        var9 = var6.indexOf("#", var7 + 1);
                        int var16 = com.xy.v.Class12.ad(var6, var7, var9);
                        int var12 = com.xy.v.Class12.ad(var6, var9 + 1, var8);
                        this.aap[5 + var5].xy(var16, var12, this.aao.yt().ac(String.valueOf(var16)));
                     }

                     var5++;
                     var10000 = var8;
                     break label63;
                  }

                  if (var4 < 5) {
                     double var11 = Double.parseDouble(var6.substring(var9 + 1, var8));
                     this.aap[var4].xw(var10, var11, var2.getAlchemyUnit(var10));
                  }

                  var4++;
               }

               var10000 = var8;
            }

            var7 = var10000 + 1;
            var10000 = var8;
         }

         this.cc(var4, var5);
         this.cb = var3;
         Class46 var19;
         if (this.ah == 0) {
            Class13.ht(this.aao)[2].setText(String.valueOf(var3));
            var19 = this;
         } else {
            Class13.ht(this.aao)[3].setText(String.valueOf(var3));
            var19 = this;
         }

         Class13.ht(var19.aao)[4]
            .setText(
               Class13.ic(this.aao).cb > 0 && Class13.hu(this.aao).cb > 0
                  ? String.valueOf(Math.max(0, Class13.hu(this.aao).cb - Class13.ic(this.aao).cb + 2))
                  : ""
            );
      }
   }

   public void n(int var1) {
      int var2;
      for (int var10000 = var2 = 0; var10000 < this.aap.length; var10000 = ++var2) {
         Class58.ya(this.aap[var2], (var1 >> var2 & 1) == 1);
      }
   }

   public int ut(int var1, String var2, int var3) {
      int var4 = var1 < 5 ? 0 : 5;
      int var5 = var1 < 5 ? 5 : this.aap.length;

      int var6;
      for (int var10000 = var6 = var4; var10000 < var5; var10000 = ++var6) {
         if (var1 < 5 && com.xy.v.Class12.am(Class58.xx(this.aap[var6]), var2)) {
            return var6;
         }

         if (var1 >= 5 && Class58.yb(this.aap[var6]) == var3) {
            return var6;
         }
      }

      return -1;
   }

   // $VF: synthetic method
   static Class58[] uu(Class46 var0) {
      return var0.aap;
   }

   // $VF: synthetic method
   static int uv(Class46 var0) {
      return var0.cb;
   }

   public void l() {
      AlchemySet var1;
      if ((var1 = this.aao.yt().bi()) != null) {
         int var2 = Class13.hx();
         int var3 = Class13.id();
         int var4;
         if ((var4 = var2 + var3 * 2) <= 4) {
            boolean var10000 = true;
         } else {
            int var16 = var4 <= 8 ? 2 : 3;
         }

         int var6 = 0;
         int var7 = 0;
         LinkedList var8 = new LinkedList();
         int var9 = 0;

         for (int var17 = var2; var17 > 0 && var9 < 2999; var17 = var2) {
            AlchemyUnit var10 = var1.a();
            if (!var8.contains(var10.getKey())) {
               this.aap[var6].xw(var10.getKey(), var10.getDoubleByMax(5, 20), var10);
               var2--;
               var8.add(var10.getKey());
               var6++;
            }

            var9++;
         }

         var8.clear();
         var9 = 0;

         for (int var18 = var3; var18 > 0 && var9 < 2999; var18 = var3) {
            int var15;
            String var11 = String.valueOf(var15 = 2101 + com.xy.v.Class0.a.nextInt(46));
            Skill var12;
            if ((var12 = this.aao.yt().ac(var11)) != null && !var8.contains(var11)) {
               int var13 = Class13.dx();
               Class58 var19 = this.aap[5 + var7];
               var3--;
               var19.xy(var15, var13, var12);
               var7++;
            }

            var9++;
         }

         this.cc(var6, var7);
      }
   }

   public void t() {
      int var1 = Math.max(0, Class13.hu(this.aao).cb - Class13.ic(this.aao).cb + 2);
      int var2 = 0;

      int var3;
      for (int var10000 = var3 = 0; var10000 < 2999 && var1 > 0; var10000 = ++var3) {
         int var4 = com.xy.v.Class0.a.nextInt(7);
         if ((var2 >> var4 & 1) != 1) {
            var1--;
            var2 |= 1 << var4;
         }
      }

      this.n(var2);
   }

   public void uw(String var1, AlchemySet var2) {
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      int var6;
      int var10000 = var6 = 0;

      while (var10000 < var1.length()) {
         String var10001 = "~";
         if ((var6 = var1.indexOf("|", var5 + 1)) == -1) {
            var6 = var1.length();
         }

         label43: {
            var10001 = ":";
            int var7;
            if ((var7 = var1.indexOf("=", var5 + 1)) != -1) {
               if (var7 > var6) {
                  var10000 = var6;
                  break label43;
               }

               String var8;
               String var15 = var8 = var1.substring(var5, var7);
               var10001 = "筛纥";
               if (!var15.equals("等级")) {
                  var10001 = "聖乂";
                  if (var8.equals("耐久")) {
                     var10000 = var6;
                     break label43;
                  }

                  var10001 = "抒胿";
                  if (var8.equals("技能")) {
                     if (var4 < 2) {
                        var5 = var7 + 1;
                        String var10004 = "$";
                        var7 = var1.indexOf("#", var5 + 1);
                        int var14 = com.xy.v.Class12.ad(var1, var5, var7);
                        int var10 = com.xy.v.Class12.ad(var1, var7 + 1, var6);
                        this.aap[5 + var4].xy(var14, var10, this.aao.yt().ac(String.valueOf(var14)));
                     }

                     var4++;
                     var10000 = var6;
                     break label43;
                  }

                  if (var3 < 5) {
                     double var9 = Double.parseDouble(var1.substring(var7 + 1, var6));
                     this.aap[var3].xw(var8, var9, var2.getAlchemyUnit(var8));
                  }

                  var3++;
               }
            }

            var10000 = var6;
         }

         var5 = var10000 + 1;
         var10000 = var6;
      }

      this.cc(var3, var4);
   }

   public Class46(Class13 var1, int var2) {
      this.aao = var1;
      this.ah = var2;
      this.aap = new Class58[7];

      int var3;
      for (int var10000 = var3 = 0; var10000 < this.aap.length; var10000 = var3) {
         this.aap[var3] = new Class58(var1, var3);
         Class46 var4;
         if (var3 < 5) {
            var4 = this;
            this.aap[var3].setBounds(0, 15 + 27 * var3, 257, 35);
         } else {
            var4 = this;
            this.aap[var3].setBounds(0, 163 + 27 * (var3 - 5), 257, 35);
         }

         var4.add(this.aap[var3++]);
      }

      String var10006 = "5dici6q>hw(`";
      this.dm = new com.xy.w.Class18("sc/d/179.png");
      this.dm.setBounds(0, 0, 257, 248);
      this.add(this.dm);
   }

   public void cc(int var1, int var2) {
      int var10000 = var1;
      this.cb = 0;

      for (int var3 = var1; var10000 < 5; var10000 = var3) {
         this.aap[var3++].t();
      }

      int var4;
      for (int var5 = var4 = var2; var5 < 2; var5 = var4) {
         int var6 = 5 + var4;
         var4++;
         this.aap[var6].t();
      }
   }
}
