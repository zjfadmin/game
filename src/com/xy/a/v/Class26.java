package com.xy.a.v;

import com.xy.q.Class60;
import com.xy.readbean.Activity;
import com.xy.scene.BWDHRuleBattle;
import com.xy.scene.BWDHTeam;
import com.xy.socket.Agreement;
import java.awt.Color;
import javax.swing.JLabel;

class Class26 extends com.xy.q.Class50 {
   private JLabel bd;
   // $VF: synthetic field
   final Class38 abt;
   private JLabel[] r;
   private com.xy.i.Class22[] abu;
   private com.xy.w.Class18[] j;
   private com.xy.w.Class18[] fp;
   private com.xy.q.Class44 abv;

   public Class26(Class38 var1) {
      this.abt = var1;
      this.setBounds(0, 0, 718, 526);
      this.abv = new com.xy.q.Class44(2, 100, var1.eg());
      this.abv.rm(true);
      this.abv.zb(563, 71, 87, 19);
      String var10011 = "t绞";
      this.abv.afo(new Class60("A组", 0));
      String var10010 = "P细";
      this.abv.afo(new Class60("B组", 1));
      String var10009 = "v绞";
      this.abv.afo(new Class60("C组", 2));
      String var10008 = "V细";
      this.abv.afo(new Class60("D组", 3));
      JLabel var10004 = this.abv.en();
      String var10005 = "t绞";
      var10004.setText("A组");
      this.add(this.abv);
      String var10012 = "1a%F$3 2";
      this.bd = com.xy.q.Class1.k(139, 112, 420, 24, com.xy.q.Class49.c("#c7D6120"), com.xy.q.Class49.ar);
      this.bd.setHorizontalAlignment(0);
      String var10006 = "児囮赮赁稾囤\u0015:t绞";
      this.bd.setText("入围赛赛程图  A组");
      this.add(this.bd);
      this.abu = new com.xy.i.Class22[15];
      this.r = new JLabel[14];
      this.j = new com.xy.w.Class18[7];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.abu.length; var10000 = ++var2) {
         String var16 = "aa=g=3$1<r|e";
         this.abu[var2] = new com.xy.i.Class22("sc/e/163.png", 2, 146, com.xy.q.Class49.k, com.xy.q.Class49.bv, "", var1.eg());
         if (var2 == 0) {
            this.abu[var2].setBounds(61, 379, 119, 27);
         } else if (var2 == 1) {
            this.abu[var2].setBounds(61, 412, 119, 27);
         } else if (var2 == 2) {
            this.abu[var2].setBounds(217, 379, 119, 27);
         } else if (var2 == 3) {
            this.abu[var2].setBounds(217, 412, 119, 27);
         } else if (var2 == 4) {
            this.abu[var2].setBounds(360, 379, 119, 27);
         } else if (var2 == 5) {
            this.abu[var2].setBounds(360, 412, 119, 27);
         } else if (var2 == 6) {
            this.abu[var2].setBounds(516, 379, 119, 27);
         } else if (var2 == 7) {
            this.abu[var2].setBounds(516, 412, 119, 27);
         } else if (var2 == 8) {
            this.abu[var2].setBounds(61, 315, 119, 27);
         } else if (var2 == 9) {
            this.abu[var2].setBounds(217, 315, 119, 27);
         } else if (var2 == 10) {
            this.abu[var2].setBounds(360, 315, 119, 27);
         } else if (var2 == 11) {
            this.abu[var2].setBounds(516, 315, 119, 27);
         } else if (var2 == 12) {
            this.abu[var2].setBounds(140, 242, 119, 27);
         } else if (var2 == 13) {
            this.abu[var2].setBounds(438, 242, 119, 27);
         } else if (var2 == 14) {
            this.abu[var2].setBounds(290, 169, 119, 27);
         }
      }

      for (int var6 = var2 = 0; var6 < this.j.length; var6 = var2) {
         var10006 = "Fy\u001a~\u001a+\u0001.\u001bj[}";
         this.j[var2] = new com.xy.w.Class18("sc/d/144.png");
         this.add(this.j[var2++]);
      }

      for (int var7 = var2 = 0; var7 < this.abu.length; var7 = var2) {
         if (var2 < this.r.length) {
            this.r[var2] = com.xy.q.Class1.f(this.abu[var2].getX() + 9, this.abu[var2].getY() + 4, 100, 16, 4, Color.black, com.xy.q.Class49.ac);
            this.add(this.r[var2]);
         }

         this.add(this.abu[var2++]);
      }

      this.fp = new com.xy.w.Class18[48];

      for (int var8 = var2 = 0; var8 < this.fp.length; var8 = var2) {
         this.fp[var2] = new com.xy.w.Class18();
         Class26 var9;
         if (var2 == 0) {
            var9 = this;
            com.xy.w.Class18 var12 = this.fp[var2];
            String var10003 = "aa=f=3\"1<r|e";
            var12.mt(com.xy.w.Class16.m("sc/d/103.png", 100, 5, 100, 5, false));
            this.fp[var2].setBounds(146, 119, 406, 11);
         } else {
            label301: {
               if (var2 >= 1 && var2 <= 40) {
                  com.xy.w.Class18 var10 = this.fp[var2];
                  String var14 = "Fy\u001a~\u001a+\r-\u001bj[}";
                  var10.dp("sc/d/187.png");
                  if (var2 == 1) {
                     var9 = this;
                     this.fp[var2].setBounds(179, 391, 9, 2);
                     break label301;
                  }

                  if (var2 == 2) {
                     var9 = this;
                     this.fp[var2].setBounds(186, 391, 2, 36);
                     break label301;
                  }

                  if (var2 == 3) {
                     var9 = this;
                     this.fp[var2].setBounds(179, 425, 9, 2);
                     break label301;
                  }

                  if (var2 == 4) {
                     var9 = this;
                     this.fp[var2].setBounds(187, 408, 8, 2);
                     break label301;
                  }

                  if (var2 == 5) {
                     var9 = this;
                     this.fp[var2].setBounds(195, 364, 2, 46);
                     break label301;
                  }

                  if (var2 == 6) {
                     var9 = this;
                     this.fp[var2].setBounds(200, 364, 2, 46);
                     break label301;
                  }

                  if (var2 == 7) {
                     var9 = this;
                     this.fp[var2].setBounds(202, 408, 8, 2);
                     break label301;
                  }

                  if (var2 == 8) {
                     var9 = this;
                     this.fp[var2].setBounds(209, 391, 9, 2);
                     break label301;
                  }

                  if (var2 == 9) {
                     var9 = this;
                     this.fp[var2].setBounds(209, 391, 2, 36);
                     break label301;
                  }

                  if (var2 == 10) {
                     var9 = this;
                     this.fp[var2].setBounds(209, 425, 9, 2);
                     break label301;
                  }

                  if (var2 == 11) {
                     var9 = this;
                     this.fp[var2].setBounds(478, 391, 9, 2);
                     break label301;
                  }

                  if (var2 == 12) {
                     var9 = this;
                     this.fp[var2].setBounds(478, 425, 9, 2);
                     break label301;
                  }

                  if (var2 == 13) {
                     var9 = this;
                     this.fp[var2].setBounds(485, 391, 2, 36);
                     break label301;
                  }

                  if (var2 == 14) {
                     var9 = this;
                     this.fp[var2].setBounds(486, 408, 8, 2);
                     break label301;
                  }

                  if (var2 == 15) {
                     var9 = this;
                     this.fp[var2].setBounds(494, 364, 2, 46);
                     break label301;
                  }

                  if (var2 == 16) {
                     var9 = this;
                     this.fp[var2].setBounds(499, 364, 2, 46);
                     break label301;
                  }

                  if (var2 == 17) {
                     var9 = this;
                     this.fp[var2].setBounds(501, 408, 8, 2);
                     break label301;
                  }

                  if (var2 == 18) {
                     var9 = this;
                     this.fp[var2].setBounds(508, 391, 9, 2);
                     break label301;
                  }

                  if (var2 == 19) {
                     var9 = this;
                     this.fp[var2].setBounds(508, 425, 9, 2);
                     break label301;
                  }

                  if (var2 == 20) {
                     var9 = this;
                     this.fp[var2].setBounds(508, 391, 2, 36);
                     break label301;
                  }

                  if (var2 == 21) {
                     var9 = this;
                     this.fp[var2].setBounds(121, 362, 76, 2);
                     break label301;
                  }

                  if (var2 == 22) {
                     var9 = this;
                     this.fp[var2].setBounds(200, 362, 76, 2);
                     break label301;
                  }

                  if (var2 == 23) {
                     var9 = this;
                     this.fp[var2].setBounds(420, 362, 76, 2);
                     break label301;
                  }

                  if (var2 == 24) {
                     var9 = this;
                     this.fp[var2].setBounds(499, 362, 76, 2);
                     break label301;
                  }

                  if (var2 == 25) {
                     var9 = this;
                     this.fp[var2].setBounds(120, 338, 2, 26);
                     break label301;
                  }

                  if (var2 == 26) {
                     var9 = this;
                     this.fp[var2].setBounds(275, 338, 2, 26);
                     break label301;
                  }

                  if (var2 == 27) {
                     var9 = this;
                     this.fp[var2].setBounds(419, 338, 2, 26);
                     break label301;
                  }

                  if (var2 == 28) {
                     var9 = this;
                     this.fp[var2].setBounds(574, 338, 2, 26);
                     break label301;
                  }

                  if (var2 == 29) {
                     var9 = this;
                     this.fp[var2].setBounds(120, 291, 2, 26);
                     break label301;
                  }

                  if (var2 == 30) {
                     var9 = this;
                     this.fp[var2].setBounds(275, 291, 2, 26);
                     break label301;
                  }

                  if (var2 == 31) {
                     var9 = this;
                     this.fp[var2].setBounds(419, 291, 2, 26);
                     break label301;
                  }

                  if (var2 == 32) {
                     var9 = this;
                     this.fp[var2].setBounds(574, 291, 2, 26);
                     break label301;
                  }

                  if (var2 == 33) {
                     var9 = this;
                     this.fp[var2].setBounds(121, 291, 155, 2);
                     break label301;
                  }

                  if (var2 == 34) {
                     var9 = this;
                     this.fp[var2].setBounds(420, 291, 155, 2);
                     break label301;
                  }

                  if (var2 == 35) {
                     var9 = this;
                     this.fp[var2].setBounds(198, 265, 2, 26);
                     break label301;
                  }

                  if (var2 == 36) {
                     var9 = this;
                     this.fp[var2].setBounds(497, 264, 2, 26);
                     break label301;
                  }

                  if (var2 == 37) {
                     var9 = this;
                     this.fp[var2].setBounds(198, 218, 2, 26);
                     break label301;
                  }

                  if (var2 == 38) {
                     var9 = this;
                     this.fp[var2].setBounds(497, 218, 2, 26);
                     break label301;
                  }

                  if (var2 == 39) {
                     var9 = this;
                     this.fp[var2].setBounds(199, 218, 298, 2);
                     break label301;
                  }

                  if (var2 == 40) {
                     var9 = this;
                     this.fp[var2].setBounds(347, 192, 2, 26);
                     break label301;
                  }
               } else if (var2 >= 41 && var2 <= 47) {
                  com.xy.w.Class18 var10001 = this.fp[var2];
                  String var13 = "aa=f=3*:<r|e";
                  var10001.dp("sc/d/188.png");
                  if (var2 == 41) {
                     var9 = this;
                     this.fp[var2].setBounds(52, 369, 136, 80);
                     break label301;
                  }

                  if (var2 == 42) {
                     var9 = this;
                     this.fp[var2].setBounds(209, 369, 136, 80);
                     break label301;
                  }

                  if (var2 == 43) {
                     var9 = this;
                     this.fp[var2].setBounds(351, 369, 136, 80);
                     break label301;
                  }

                  if (var2 == 44) {
                     var9 = this;
                     this.fp[var2].setBounds(508, 369, 136, 80);
                     break label301;
                  }

                  if (var2 == 45) {
                     var9 = this;
                     this.fp[var2].setBounds(54, 306, 590, 45);
                     break label301;
                  }

                  if (var2 == 46) {
                     var9 = this;
                     this.fp[var2].setBounds(54, 233, 590, 45);
                     break label301;
                  }

                  if (var2 == 47) {
                     this.fp[var2].setBounds(240, 160, 218, 45);
                  }
               }

               var9 = this;
            }
         }

         var9.add(this.fp[var2++]);
      }
   }

   public void gs(int var1, Object var2) {
      if (var1 == 146) {
         int var3;
         if ((var3 = (Integer)var2) <= 0) {
            return;
         }

         Activity var4 = Class38.abp(this.abt).wg();
         StringBuilder var10002 = new StringBuilder(String.valueOf(var4.getId()));
         String var10003 = "In";
         String var5 = Agreement.getSendTextAES("activity", var10002.append("|t").append(var3).toString());
         this.abt.za().k(var5);
      }
   }

   // $VF: synthetic method
   static com.xy.q.Class44 wd(Class26 var0) {
      return var0.abv;
   }

   public void we(BWDHRuleBattle[] var1) {
      int var2 = var1.length == 7 ? 3 : (var1.length == 6 ? 2 : (var1.length == 4 ? 1 : 0));
      int var3 = var2 == 3 ? 7 : (var2 == 2 ? 6 : (var2 == 1 ? 4 : 0));

      for (int var10000 = var3; var10000 < 8; var10000 = ++var3) {
         if (var3 == 7) {
            this.abu[14].setName(String.valueOf(0));
            this.abu[14].setText(null);
         } else {
            this.abu[2 * var3].setKeep(false);
            this.abu[2 * var3 + 1].setKeep(false);
            this.abu[2 * var3].setName(String.valueOf(0));
            this.abu[2 * var3 + 1].setName(String.valueOf(0));
            this.abu[2 * var3].setText(null);
            this.abu[2 * var3 + 1].setText(null);
            this.r[2 * var3].setText(null);
            this.r[2 * var3 + 1].setText(null);
            this.j[var3].setVisible(false);
         }
      }

      for (int var8 = var3 = 0; var8 < var1.length; var8 = ++var3) {
         BWDHRuleBattle var4 = var1[var3];
         this.abu[2 * var3].setName(String.valueOf(var4.getBwdhTeam1().getId()));
         this.abu[2 * var3].setText(var4.getBwdhTeam1().getName());
         this.abu[2 * var3 + 1].setName(String.valueOf(var4.getBwdhTeam2().getId()));
         this.abu[2 * var3 + 1].setText(var4.getBwdhTeam2().getName());
         if (var4.getWin() == 0 && var4.getPoint().x == 0 && var4.getPoint().x == 0) {
            this.r[2 * var3].setText(null);
            this.r[2 * var3 + 1].setText(null);
            this.j[var3].setVisible(false);
         } else {
            this.r[2 * var3].setText(String.valueOf(var4.getPoint().x));
            this.r[2 * var3 + 1].setText(String.valueOf(var4.getPoint().y));
            Class26 var9;
            if (var4.getWin() == 1 && var4.getBwdhTeam1().getId() != 0) {
               com.xy.w.Class18 var10 = this.j[var3];
               int var10002 = this.abu[2 * var3].getX() + 99;
               var9 = this;
               var10.setBounds(var10002, this.abu[2 * var3].getY() - 15, 27, 24);
            } else {
               if (var4.getWin() == 2 && var4.getBwdhTeam1().getId() != 0) {
                  this.j[var3].setBounds(this.abu[2 * var3 + 1].getX() + 99, this.abu[2 * var3 + 1].getY() - 15, 27, 24);
               }

               var9 = this;
            }

            var9.abu[2 * var3].setKeep(var4.getWin() == 1);
            this.abu[2 * var3 + 1].setKeep(var4.getWin() == 2);
            this.j[var3].setVisible(var4.getWin() != 0);
            if (var4.getWin() != 0) {
               byte var5 = 0;
               BWDHRuleBattle var11;
               if (var3 == 0) {
                  var5 = 8;
                  var11 = var4;
               } else if (var3 == 1) {
                  var5 = 9;
                  var11 = var4;
               } else if (var3 == 2) {
                  var5 = 10;
                  var11 = var4;
               } else if (var3 == 3) {
                  var5 = 11;
                  var11 = var4;
               } else if (var3 == 4) {
                  var5 = 12;
                  var11 = var4;
               } else if (var3 == 5) {
                  var5 = 13;
                  var11 = var4;
               } else {
                  if (var3 == 6) {
                     var5 = 14;
                  }

                  var11 = var4;
               }

               BWDHTeam var6 = var11.getWin() == 1 ? var4.getBwdhTeam1() : var4.getBwdhTeam2();
               if (var5 > 0) {
                  this.abu[var5].setName(String.valueOf(var6.getId()));
                  this.abu[var5].setText(var6.getName());
               }
            }
         }
      }
   }
}
