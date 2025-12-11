package com.xy.a.a;

import com.xy.entity.Pal;
import com.xy.readbean.PalData;
import java.awt.Graphics;
import java.math.BigDecimal;
import javax.swing.JComponent;

public class Class8 extends JComponent {
   private com.xy.w.Class18[] ar;
   // $VF: synthetic field
   final Class38 ho;
   private com.xy.q.Class51 hp;
   private com.xy.i.Class4 hq;

   public Class8(Class38 var1) {
      this.ho = var1;
      String var10008 = "z5&3&d?xy8n";
      String var10013 = "爒咶桴";
      this.hq = new com.xy.i.Class4("sc/e/26.png", 1, 130, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "物品栏", var1.eg());
      this.hq.setBounds(227, 325, 99, 25);
      this.add(this.hq);
      this.hp = new com.xy.q.Class51(var1.eg(), 3, 4, 49, 49, 9, 7, 370, 74);
      this.add(this.hp);
      this.ar = new com.xy.w.Class18[28];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.ar.length; var10000 = ++var2) {
         if (var2 != 0 && var2 != 1 && var2 != 2) {
            this.ar[var2] = new com.xy.w.Class18();
            this.add(this.ar[var2]);
            if (var2 == 0) {
               com.xy.w.Class18 var10001 = this.ar[var2];
               String var10002 = "z5&2&e<xy8n";
               var10001.mt(com.xy.w.Class16.m("sc/d/35.png", 80, 10, 80, 10, false));
               this.ar[var2].setBounds(188, 39, 359, 20);
            } else if (var2 == 1) {
               com.xy.w.Class18 var5 = this.ar[var2];
               String var21 = "\b\u0014T\u0013TENY\u000b\u0019\u001c";
               var5.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
               this.ar[var2].setBounds(46, 31, 152, 21);
            } else if (var2 == 2) {
               com.xy.w.Class18 var6 = this.ar[var2];
               String var22 = "z5&2&d=xy8n";
               var6.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
               this.ar[var2].setBounds(46, 31, 152, 330);
            } else if (var2 == 3) {
               com.xy.w.Class18 var7 = this.ar[var2];
               String var23 = "\b\u0014T\u0013TFMY\u000b\u0019\u001c";
               var7.mt(com.xy.w.Class16.m("sc/d/16.png", 2, 2, 2, 2, false));
               this.ar[var2].setBounds(205, 70, 143, 244);
            } else if (var2 >= 4 && var2 <= 15) {
               Class8 var3;
               if (var2 == 4) {
                  var3 = this;
                  com.xy.w.Class18 var9 = this.ar[var2];
                  String var25 = "%jymy>xy8n";
                  var9.dp("sc/d/7.png");
               } else if (var2 == 5) {
                  var3 = this;
                  com.xy.w.Class18 var10 = this.ar[var2];
                  String var26 = "\u0004\u0018X\u001fXCY\u000b\u0019\u001c";
                  var10.dp("sc/d/8.png");
               } else if (var2 == 6) {
                  var3 = this;
                  com.xy.w.Class18 var11 = this.ar[var2];
                  String var27 = "%jymy?xy8n";
                  var11.dp("sc/d/6.png");
               } else if (var2 == 7) {
                  var3 = this;
                  com.xy.w.Class18 var12 = this.ar[var2];
                  String var28 = "\b\u0014T\u0013TFIY\u000b\u0019\u001c";
                  var12.dp("sc/d/12.png");
               } else if (var2 == 8) {
                  var3 = this;
                  com.xy.w.Class18 var13 = this.ar[var2];
                  String var29 = "z5&2&g9xy8n";
                  var13.dp("sc/d/10.png");
               } else if (var2 == 9) {
                  var3 = this;
                  com.xy.w.Class18 var14 = this.ar[var2];
                  String var30 = "\u0004\u0018X\u001fXNY\u000b\u0019\u001c";
                  var14.dp("sc/d/5.png");
               } else if (var2 == 10) {
                  var3 = this;
                  com.xy.w.Class18 var15 = this.ar[var2];
                  String var31 = "z5&2&g8xy8n";
                  var15.dp("sc/d/11.png");
               } else if (var2 == 11) {
                  var3 = this;
                  com.xy.w.Class18 var16 = this.ar[var2];
                  String var32 = "\u0004\u0018X\u001fXBY\u000b\u0019\u001c";
                  var16.dp("sc/d/9.png");
               } else if (var2 == 12) {
                  var3 = this;
                  com.xy.w.Class18 var17 = this.ar[var2];
                  String var33 = "z5&2&g=xy8n";
                  var17.dp("sc/d/14.png");
               } else if (var2 == 13) {
                  var3 = this;
                  com.xy.w.Class18 var18 = this.ar[var2];
                  String var34 = "\b\u0014T\u0013TFNY\u000b\u0019\u001c";
                  var18.dp("sc/d/15.png");
               } else if (var2 == 14) {
                  var3 = this;
                  com.xy.w.Class18 var19 = this.ar[var2];
                  String var35 = "z5&2&g:xy8n";
                  var19.dp("sc/d/13.png");
               } else {
                  if (var2 == 15) {
                     com.xy.w.Class18 var4 = this.ar[var2];
                     String var20 = "\b\u0014T\u0013TFHY\u000b\u0019\u001c";
                     var4.dp("sc/d/13.png");
                  }

                  var3 = this;
               }

               var3.ar[var2].setBounds(369 + (var2 - 4) % 3 * 58, 73 + (var2 - 4) / 3 * 56, 50, 50);
            } else if (var2 >= 16 && var2 <= 27) {
               com.xy.w.Class18 var8 = this.ar[var2];
               String var24 = "%jymy=xy8n";
               var8.dp("sc/d/4.png");
               this.ar[var2].setBounds(365 + (var2 - 16) % 3 * 58, 70 + (var2 - 16) / 3 * 56, 59, 57);
            }
         }
      }
   }

   @Override
   protected void paintChildren(Graphics var1) {
      super.paintChildren(var1);
      if (this.ho.akd.mw != null) {
         this.ho.akd.mw.r(var1, 275, 270, 0, com.xy.v.Class22.l());
      }
   }

   public void t() {
      int var1;
      for (int var10000 = var1 = 0; var10000 < this.hp.vq().length; var10000 = ++var1) {
         if (this.hp.vq()[var1] != null) {
            this.hp.vq()[var1].e();
         }
      }
   }

   public void fn(Pal var1, PalData var2) {
      this.t();
      if (var1 != null && var1.getParts() != null && !var1.getParts().equals("")) {
         if (this.ho.yx() != null) {
            String var10000 = var1.getParts();
            String var10001 = "+\u0007";
            String[] var4 = var10000.split("\\|");

            int var5;
            for (int var9 = var5 = 0; var9 < var4.length; var9 = ++var5) {
               var10000 = var4[var5];
               var10001 = "4";
               int var6;
               if ((var6 = var10000.indexOf("=")) != -1) {
                  int var7 = Integer.parseInt(var4[var5].substring(0, var6));
                  BigDecimal var8 = new BigDecimal(var4[var5].substring(var6 + 1));
                  this.bj(var8, var7);
               }
            }
         }
      }
   }

   public void bj(BigDecimal var1, int var2) {
      com.xy.w.Class14 var3;
      if ((var3 = this.hp.vq()[var2]) == null) {
         this.hp.vq()[var2] = var3 = new com.xy.w.Class14();
      }

      var3.g(this.ho.yx().getGood(var1));
   }
}
