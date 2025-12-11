package com.xy.a.i;

import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.q.Class49;
import com.xy.q.Class54;
import com.xy.readbean.Goodstable;
import com.xy.text.GameView;
import javax.swing.JLabel;

public class Class45 extends com.xy.q.Class30 {
   private com.xy.w.Class18[] fd;
   private com.xy.q.Class24 awh;
   private JLabel[] gj;
   private Class54 ada;
   private com.xy.i.Class11 aig;

   public Class54 ep() {
      return this.ada;
   }

   public void e() {
      int var1;
      for (int var10000 = var1 = 2; var10000 < 6; var10000 = var1) {
         this.gj[var1++].setText("");
      }

      RoleData var7 = this.yx();
      Goodstable var2;
      if ((var2 = (Goodstable)this.ada.jx()) != null) {
         var2 = var7.getGood(var2.getRgid());
      }

      if (var2 != null) {
         String var3;
         if ((var3 = GoodType.getExtra(var2.getValue(), GoodType.Extras[3])) != null) {
            String var10 = "R\u007f";
            String[] var4 = var3.split("\\&");

            int var5;
            for (int var8 = var5 = 4; var8 < var4.length; var8 = ++var5) {
               String var9 = var4[var5];
               var10 = "<h";
               String[] var6 = var9.split("\\=");
               this.gj[2 + 2 * (var5 - 4)].setText(var6[0]);
               this.gj[2 + 2 * (var5 - 4) + 1].setText(var6[1] + com.xy.a.Class48.qb(var6[0]));
               if (var5 == 1) {
                  return;
               }
            }
         }
      }
   }

   public Class45(GameView var1) {
      super(-1, -1, com.xy.q.Class30.agf, var1);
      this.yy(46, 74, 490, 428, com.xy.q.Class30.agf);
      String var10008 = "*mvkv=h )`>";
      String var10013 = "浂@纖";
      this.aig = new com.xy.i.Class11("sc/e/31.png", 1, 2, Class49.ch, Class49.bv, "洗 练", this);
      this.aig.setBounds(289, 292, 79, 25);
      this.add(this.aig);
      this.gj = new JLabel[6];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.gj.length; var10000 = var2) {
         var10008 = "-:>i>i>i";
         this.gj[var2] = com.xy.q.Class1.f(57, 88, 37, 17, 0, Class49.c("#c000000"), Class49.ch);
         JLabel var6 = this.gj[var2];
         String var14;
         if (var2 == 0) {
            var14 = "夷袐";
            var14 = "套装";
         } else if (var2 == 1) {
            var14 = "玾材奙袜屐恾";
            var14 = "现有套装属性";
         } else {
            var14 = "";
         }

         var6.setText(var14);
         if (var2 == 1) {
            JLabel var16 = this.gj[var2];
            String var10002 = "C6&\u0013&\u0013&\u0013";
            var16.setForeground(Class49.c("#cFFFFFF"));
            this.gj[var2].setBounds(276, 253, 191, 20);
         }

         Class45 var7;
         label111: {
            if (var2 >= 2 && var2 <= 5) {
               this.gj[var2].setFont(Class49.ac);
               JLabel var17 = this.gj[var2];
               String var21 = "-:H\u001fH\u001fH\u001f";
               var17.setForeground(Class49.c("#cFFFFFF"));
               if (var2 == 2) {
                  var7 = this;
                  this.gj[var2].setBounds(276, 273, 135, 27);
                  break label111;
               }

               if (var2 == 3) {
                  var7 = this;
                  this.gj[var2].setBounds(411, 273, 56, 27);
                  break label111;
               }

               if (var2 == 4) {
                  var7 = this;
                  this.gj[var2].setBounds(276, 300, 135, 27);
                  break label111;
               }

               if (var2 == 5) {
                  this.gj[var2].setBounds(411, 300, 56, 27);
               }
            }

            var7 = this;
         }

         var7.gj[var2].setBounds(this.gj[var2].getX() - 46, this.gj[var2].getY() - 74, this.gj[var2].getWidth(), this.gj[var2].getHeight());
         this.add(this.gj[var2++]);
      }

      this.ada = new Class54(this);
      this.ada.setBounds(302, 104, 50, 50);
      this.add(this.ada);
      this.fd = new com.xy.w.Class18[8];

      for (int var8 = var2 = 0; var8 < this.fd.length; var8 = var2) {
         this.fd[var2] = new com.xy.w.Class18();
         this.add(this.fd[var2]);
         Class45 var9;
         if (var2 == 0) {
            com.xy.w.Class18 var26 = this.fd[var2];
            String var29 = "&\u0003z\u0004zQlN%\u000e2";
            var26.mt(com.xy.w.Class16.m("sc/d/19.png", 5, 5, 5, 5, false));
            this.fd[var2].setBounds(59, 109, 156, 360);
            com.xy.i.Class3[] var3 = new com.xy.i.Class3[2];

            int var4;
            for (var8 = var4 = 0; var8 < var3.length; var8 = var4) {
               if (var4 == 0) {
                  String var10004 = "*mvkv:k )`>";
                  var3[var4] = new com.xy.i.Class3("sc/e/42.png", 1, 0, this);
                  var8 = var4;
               } else {
                  String var31 = "&\u0003z\u0005zTfN%\u000e2";
                  var3[var4] = new com.xy.i.Class3("sc/e/43.png", 1, 1, this);
                  var8 = var4;
               }

               Class45 var12;
               if (var8 == 0) {
                  var12 = this;
                  var3[var4].setBounds(111, 395, 18, 18);
               } else {
                  var3[var4].setBounds(140, 395, 18, 18);
                  var12 = this;
               }

               var12.add(var3[var4++]);
            }

            var9 = this;
            this.awh = new com.xy.q.Class24(2, this, 3, 7, 51, 51, 0, 0, 14, 37);
            String var10005 = "*mvjv?a )`>";
            this.awh.gt(com.xy.w.Class16.c("sc/d/18.png"));
            this.awh.vo(var3, 1);
            this.add(this.awh);
         } else if (var2 == 1) {
            var9 = this;
            com.xy.w.Class18 var25 = this.fd[var2];
            String var10003 = "\u00136O1OaN%\u000e2";
            var25.dp("sc/d/4.png");
            this.fd[var2].setBounds(344, 174, 59, 57);
         } else {
            label128: {
               if (var2 >= 2 && var2 <= 6) {
                  com.xy.w.Class18 var19 = this.fd[var2];
                  String var24 = "*mvjv<m )`>";
                  var19.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
                  if (var2 == 2) {
                     var9 = this;
                     this.fd[var2].setBounds(276, 253, 191, 20);
                     break label128;
                  }

                  if (var2 == 3) {
                     var9 = this;
                     this.fd[var2].setBounds(276, 273, 135, 27);
                     break label128;
                  }

                  if (var2 == 4) {
                     var9 = this;
                     this.fd[var2].setBounds(411, 273, 56, 27);
                     break label128;
                  }

                  if (var2 == 5) {
                     var9 = this;
                     this.fd[var2].setBounds(276, 300, 135, 27);
                     break label128;
                  }

                  if (var2 == 6) {
                     var9 = this;
                     this.fd[var2].setBounds(411, 300, 56, 27);
                     break label128;
                  }
               } else if (var2 == 9) {
                  com.xy.w.Class18 var18 = this.fd[var2];
                  String var23 = "&\u0003z\u0004zSfN%\u000e2";
                  var18.mt(com.xy.w.Class16.m("sc/d/33.png", 30, 30, 30, 30, false));
                  this.fd[var2].setBounds(229, 111, 289, 358);
               }

               var9 = this;
            }
         }

         var9.fd[var2].setBounds(this.fd[var2].getX() - 46, this.fd[var2].getY() - 74, this.fd[var2].getWidth(), this.fd[var2++].getHeight());
      }
   }

   public void f() {
      RoleData var1 = this.yx();
      Goodstable var2;
      if ((var2 = (Goodstable)this.ada.jx()) != null) {
         var2 = var1.getGood(var2.getRgid());
      }

      if (var2 == null) {
         String var3 = "诹遐拧伹規济炲盝奙袜 w";
         this.afx.dp("请选择你要洗炼的套装..");
      } else if (var2.getGoodlock() == 1) {
         String var10001 = "记爉咔嶒裾勀镔";
         this.afx.dp("该物品已被加锁");
      } else {
         ((Class1)this.zc().j(74)).ay(var2);
      }
   }

   public void h() {
      this.ada.gs(0, null);
      this.e();
      this.awh.vs().a(0);
   }
}
