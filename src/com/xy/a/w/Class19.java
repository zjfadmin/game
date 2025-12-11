package com.xy.a.w;

import com.xy.bean.ConfirmBean;
import com.xy.formula.UtilSkin;
import com.xy.game.RoleData;
import com.xy.i.Class18;
import com.xy.i.Class20;
import com.xy.q.Class49;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Graphics;
import java.math.BigDecimal;
import javax.swing.JLabel;

public class Class19 extends com.xy.q.Class30 {
   private JLabel[] yg;
   private int gw;
   private com.xy.i.Class20[] zu;
   private com.xy.w.Class18[] zv;
   private int gz;
   private Class1[] zw;
   private int aa;
   private RichLabel ed;
   private com.xy.w.Class0 or;
   private com.xy.w.Class0 zx;
   private com.xy.w.Class18 gh;
   private BigDecimal bn;
   private com.xy.i.Class20 zy;
   private boolean cf;

   public void e() {
      if (this.afx.getBattleScene() == null) {
         RoleData var1 = this.yx();

         int var2;
         for (int var10000 = var2 = 0; var10000 < var1.goodChoses.length; var10000 = ++var2) {
            if (var1.getEquipGood(var2) != null) {
               String var10001 = "诠匕东戭朞袨夐ぬ昈匌〖颳衛嘅６";
               this.afx._do("请卸下所有装备、星卡、飞行器！");
               return;
            }
         }

         if (this.gw == 0 && this.za().l(2, 12)) {
            StringBuffer var4;
            StringBuffer var5 = var4 = new StringBuffer();
            String var7 = "伔昕呒液聣\u000fD\n#夝让帻屲觨舆曎挖一N";
            var5.append("你是否消耗500W大话币将角色更换为:");
            var4.append(UtilSkin.getLocalName(this.bn.intValue()));
            GameView var8 = this.afx;
            StringBuilder var10006 = new StringBuilder(String.valueOf(this.gw));
            String var10007 = "k";
            var8.dm(new ConfirmBean(89, var10006.append("|").append(this.bn).toString(), var4.toString()));
         } else {
            StringBuilder var6 = new StringBuilder(String.valueOf(this.gw));
            String var10002 = "\b";
            String var3 = Agreement.getSendTextAES("racialtransformation", var6.append("|").append(this.bn).toString());
            this.za().k(var3);
         }
      }
   }

   public void g(int var1) {
      int var10000 = 0;
      this.gz = var1;

      for (int var2 = 0; var10000 < this.zu.length; var10000 = ++var2) {
         this.zu[var2].setKeep(var1 == var2);
      }

      JLabel var3 = this.yg[1];
      String var10003 = "甠";
      StringBuilder var10001 = new StringBuilder("男");
      String var6;
      if (this.gz == 0) {
         var6 = "从";
         var6 = "人";
      } else if (this.gz == 1) {
         var6 = "魃";
         var6 = "魔";
      } else if (this.gz == 2) {
         var6 = "亭";
         var6 = "仙";
      } else if (this.gz == 3) {
         var6 = "鬫";
         var6 = "鬼";
      } else {
         var6 = "鿭";
         var6 = "龙";
      }

      var3.setText(var10001.append(var6).toString());
      JLabel var4 = this.yg[2];
      var10003 = "奤";
      var10001 = new StringBuilder("女");
      if (this.gz == 0) {
         var6 = "从";
         var6 = "人";
      } else if (this.gz == 1) {
         var6 = "魃";
         var6 = "魔";
      } else if (this.gz == 2) {
         var6 = "亭";
         var6 = "仙";
      } else if (this.gz == 3) {
         var6 = "鬫";
         var6 = "鬼";
      } else {
         var6 = "鿭";
         var6 = "龙";
      }

      var4.setText(var10001.append(var6).toString());
      this.f();
   }

   public void f() {
      this.h();
      int var1 = 20000 + this.gz * 1000;
      int var2 = this.aa / 2;
      if ((this.za().gameType == 2 || this.za().gameType == 3 || this.za().gameType == 1) && !this.za().l(2, 4) && !this.za().l(2, 11) && !this.za().l(2, 12)) {
         if (this.gz == 4) {
            if (var2 > 3) {
               var2 = 3;
            }
         } else if (this.gz == 3) {
            if (var2 > 3 && var2 != 6) {
               var2 = 3;
            }

            if (var2 > 4) {
               var2 = 4;
            }
         } else if (var2 > 6) {
            var2 = 6;
         }
      } else if (this.gz == 4) {
         if (var2 > 3) {
            var2 = 3;
         }
      } else if (this.gz == 3) {
         if (var2 > 3 && var2 != 6) {
            var2 = 3;
         }

         if (var2 > 3) {
            var2 = 3;
         }
      } else if (var2 > 5) {
         var2 = 5;
      }

      int var3;
      for (int var10000 = var3 = 0; var10000 < var2; var10000 = var3) {
         int var4 = 0;
         Class19 var6;
         if (var3 < 3) {
            var4 = var1 + var3 + (this.cf ? 4 : 1);
            var6 = this;
         } else {
            var4 = var1 + (this.cf ? var3 * 2 + 2 : var3 * 2 + 1);
            var6 = this;
         }

         Class1.ar(var6.zw[var3], new BigDecimal(var4));
         Class1.aq(this.zw[var3], com.xy.w.Class16.c(com.xy.w.Class15.l(String.valueOf(var4))));
         this.zw[var3++].setVisible(true);
      }

      this.ue(this.zw[0]);
   }

   public Class19(GameView var1) {
      super(41, 2, com.xy.q.Class30.afz, var1);
      String var10003 = "\u001etBsB&Cg\u0003p";
      this.gw = 0;
      this.yy(-1, 0, 500, 420, com.xy.q.Class30.agh);
      this.yu(com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false), null);
      this.zu = new com.xy.i.Class20[5];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.zu.length; var10000 = var2) {
         com.xy.i.Class20[] var6 = this.zu;
         String var10004 = "\u0007Y[_[\f@\u0014\u0004T\u0013";
         int var10006 = 351 + var2;
         String var38;
         Class19 var10010;
         if (var2 == 0) {
            var38 = "仗旘";
            var38 = "人族";
            var10010 = this;
         } else if (var2 == 1) {
            var38 = "魮斻";
            var38 = "魔族";
            var10010 = this;
         } else if (var2 == 2) {
            var38 = "亴旘";
            var38 = "仙族";
            var10010 = this;
         } else if (var2 == 3) {
            var38 = "鬆斻";
            var38 = "鬼族";
            var10010 = this;
         } else if (var2 == 4) {
            var38 = "鿴旘";
            var38 = "龙族";
            var10010 = this;
         } else {
            var38 = "";
            var10010 = this;
         }

         Class20 var10002 = new Class20("sc/e/64.png", 2, var10006, Class49.bx, Class49.bv, var38, var10010);
         var6[var2] = var10002;
         this.zu[var2].setOffsetTexts(Class49.d);
         this.zu[var2].setBounds(38 + 86 * var2, 25, 79, 33);
         this.add(this.zu[var2++]);
      }

      String var10008 = "\u0007Y[_[\tE\u0014\u0004T\u0013";
      String var10013 = "轻禠旘";
      this.zy = new com.xy.i.Class20("sc/e/31.png", 1, 361, Class49.ch, Class49.bv, "转种族", this);
      this.zy.setBounds(304, 355, 79, 25);
      this.add(this.zy);
      this.yg = new JLabel[7];

      for (int var7 = var2 = 0; var7 < this.yg.length; var7 = var2) {
         var10008 = "\u0019\u0017\nD\nD\nD";
         this.yg[var2] = com.xy.q.Class1.f(215, 67, 200, 17, 10, Class49.c("#c000000"), Class49.ch);
         JLabel var8 = this.yg[var2];
         String var15;
         if (var2 == 0) {
            var15 = "嬋乷纮乷仉浖";
            var15 = "学习练习交流";
         } else if (var2 == 1) {
            var15 = "甍从";
            var15 = "男人";
         } else if (var2 == 2) {
            var15 = "夞亭";
            var15 = "女人";
         } else if (var2 == 3) {
            var15 = "欒";
            var15 = "武";
         } else if (var2 == 4) {
            var15 = "噿";
            var15 = "器";
         } else if (var2 == 5) {
            var15 = "飰";
            var15 = "预";
         } else if (var2 == 6) {
            var15 = "觟";
            var15 = "览";
         } else {
            var15 = "";
         }

         var8.setText(var15);
         Class19 var9;
         if (var2 >= 1 && var2 <= 2) {
            var9 = this;
            this.yg[var2].setFont(Class49.k);
            this.yg[var2].setBounds(61 + (var2 - 1) * 79, 369, 36, 18);
         } else {
            if (var2 >= 3 && var2 <= 6) {
               this.yg[var2].setFont(Class49.w);
               this.yg[var2].setBounds(211, 234 + 17 * (var2 - 3), 15, 16);
            }

            var9 = this;
         }

         var9.add(this.yg[var2++]);
      }

      this.ed = new RichLabel("", Class49.n);
      this.ed.setBounds(215, 82, this.ed.getWidth(), this.ed.getHeight());
      this.add(this.ed);
      String var43 = "\u0007Y[^[\tC\u0014\u0004T\u0013";
      this.gh = new com.xy.w.Class18(com.xy.w.Class16.m("sc/d/37.png", 2, 2, 2, 2, false));
      this.gh.setBounds(41, 66, 68, 88);
      this.gh.setVisible(false);
      this.add(this.gh);
      this.zw = new Class1[6];

      for (int var10 = var2 = 0; var10 < this.zw.length; var10 = var2) {
         this.zw[var2] = new Class1(this, var2);
         this.zw[var2].setBounds(40 + var2 % 2 * 78, 65 + var2 / 2 * 100, 70, 90);
         this.add(this.zw[var2++]);
      }

      this.zv = new com.xy.w.Class18[7];

      for (int var11 = var2 = 0; var11 < this.zv.length; var11 = var2) {
         this.zv[var2] = new com.xy.w.Class18();
         Class19 var12;
         if (var2 == 0) {
            var12 = this;
            com.xy.w.Class18 var28 = this.zv[var2];
            var10003 = "d\u000e8\t8^\"Cg\u0003p";
            var28.mt(com.xy.w.Class16.m("sc/d/35.png", 80, 10, 80, 10, false));
            this.zv[var2].setBounds(30, 39, 445, 20);
         } else if (var2 >= 1 && var2 <= 2) {
            Class19 var13;
            if (var2 == 1) {
               var13 = this;
               com.xy.w.Class18 var23 = this.zv[var2];
               String var32 = "\u0007Y[_[\fF\u0014\u0004T\u0013";
               var23.dp("sc/e/62.png");
            } else {
               if (var2 == 2) {
                  com.xy.w.Class18 var14 = this.zv[var2];
                  String var24 = "d\u000e8\b8[$Cg\u0003p";
                  var14.dp("sc/e/63.png");
               }

               var13 = this;
            }

            var13.zv[var2].addMouseListener(new Class7(this, 1, var2 - 1));
            var12 = this;
            this.zv[var2].setBounds(41 + (var2 - 1) * 79, 369, 18, 18);
         } else if (var2 == 3) {
            var12 = this;
            com.xy.w.Class18 var29 = this.zv[var2];
            var10003 = "\u0007Y[^[\rF\u0014\u0004T\u0013";
            var29.dp("sc/d/72.png");
            this.zv[var2].setBounds(184, 64, 34, 326);
         } else if (var2 >= 4 && var2 <= 5) {
            var12 = this;
            com.xy.w.Class18 var31 = this.zv[var2];
            var10003 = "d\u000e8\t8\\!Cg\u0003p";
            var31.mt(com.xy.w.Class16.m("sc/d/16.png", 2, 2, 2, 2, false));
            this.zv[var2].setBounds(235 + (var2 - 4) * 112, 205, 98, 132);
         } else {
            if (var2 == 6) {
               com.xy.w.Class18 var22 = this.zv[var2];
               String var30 = "\u0007Y[^[\tB\u0014\u0004T\u0013";
               var22.mt(com.xy.w.Class16.m("sc/d/36.png", 30, 30, 30, 30, false));
               this.zv[var2].setBounds(30, 58, 445, 340);
            }

            var12 = this;
         }

         var12.add(this.zv[var2++]);
      }
   }

   public void h() {
      int var1;
      for (int var10000 = var1 = 0; var10000 < this.zw.length; var10000 = var1) {
         this.zw[var1++].setVisible(false);
      }
   }

   // $VF: synthetic method
   static boolean ud(Class19 var0) {
      return var0.cf;
   }

   public void ue(Class1 var1) {
      this.bn = Class1.as(var1);
      this.gh.setBounds(var1.getX() + 1, var1.getY() + 1, 68, 88);
      this.or = com.xy.w.Class11.t(Class1.as(var1).toString(), 9, 1, null);
      this.zx = com.xy.w.Class11.t(Class1.as(var1).toString(), 5, 1, null);
      this.ed.setTextSize(UtilSkin.getRaceMsg(Class1.as(var1)), 250);
      this.ed.setBounds(215, 82, this.ed.getWidth(), this.ed.getHeight());
   }

   @Override
   public boolean ah() {
      this.or = null;
      this.zx = null;
      return super.ah();
   }

   // $VF: synthetic method
   static void uf(Class19 var0, boolean var1) {
      var0.cf = var1;
   }

   public void cc(int var1, int var2) {
      this.gw = var1;
      this.aa = var2;
      this.g(0);
      this.zc().b(this.lj());
   }

   // $VF: synthetic method
   static com.xy.w.Class18[] ug(Class19 var0) {
      return var0.zv;
   }

   @Override
   protected void paintChildren(Graphics var1) {
      super.paintChildren(var1);
      if (this.or != null) {
         this.or.r(var1, 280, 325, 4, com.xy.v.Class22.l());
      }

      if (this.zx != null) {
         this.zx.r(var1, 400, 325, 4, com.xy.v.Class22.l());
      }
   }
}
