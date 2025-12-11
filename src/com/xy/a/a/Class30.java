package com.xy.a.a;

import com.xy.bean.ConfirmBean;
import com.xy.formula.BaseFly;
import com.xy.formula.MsgUntil;
import com.xy.game.RoleData;
import com.xy.readbean.Fly;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.math.BigDecimal;
import javax.swing.JLabel;

public class Class30 extends com.xy.q.Class30 {
   BigDecimal ej;
   private com.xy.q.Class14[] jk;
   private com.xy.q.Class46 ahi;
   private com.xy.w.Class18[] fd;
   private com.xy.q.Class54 vo;
   private com.xy.w.Class0 as;
   private JLabel[] o;
   private com.xy.i.Class4[] v;

   public void c() {
      Goodstable var2;
      if ((var2 = this.yx().getGood(this.ej)) != null) {
         if (var2.getStatus() != 0) {
            String var10001 = "裰夝皱飄衹噲旕泏丗弙";
            this.afx.dp("装备的飞行器无法丢弃");
         } else {
            GameView var10000 = this.afx;
            String var10004 = var2.getRgid().toString();
            String var10007 = "Ip砄宽觫尡I`";
            StringBuilder var10005 = new StringBuilder("#W确定要将#G").append(var2.getGoodsname());
            String var10006 = "\u0016M牜哛丗弙吢%";
            var10000.dm(new ConfirmBean(1, var10004, var10005.append("#W物品丢弃吗?").toString()));
         }
      }
   }

   // $VF: synthetic method
   private synchronized void e() {
      RoleData var1;
      Goodstable var2;
      this.bb((var2 = (var1 = this.yx()).getGood(this.ej)) != null ? var2 : var1.getFlyGood(0));
      if (this.ej != null) {
         this.jk[2].setText(String.valueOf(var1.getGoodTypeNum(8903)));
      } else {
         this.jk[2].setText(null);
      }
   }

   public void f() {
      RoleData var1 = this.yx();
      com.xy.v.Class8 var2 = this.yt();
      Goodstable var3;
      if ((var3 = var1.getGood(this.ej)) != null) {
         BaseFly var10000 = var3.getBaseFly();
         Fly var5 = var10000.getFly(var2);
         Fly var6 = var2.ap(var5.getNext());
         if (var10000.getLvl() < var5.getLvlMax()) {
            Goodstable var9;
            if ((var9 = var1.au(8903L)) != null) {
               String var10 = "sV";
               StringBuilder var10001 = new StringBuilder("FL").append(var3.getRgid());
               String var10002 = "[";
               String var8 = Agreement.getSendTextAES("rolechange", var10001.append("|").append(var9.getRgid()).toString());
               this.za().k(var8);
            }
         } else {
            if (var6 != null) {
               String var10003 = "sP";
               String var7 = Agreement.getSendTextAES("rolechange", "FJ" + var3.getRgid());
               this.za().k(var7);
            }
         }
      }
   }

   public void bb(Goodstable var1) {
      if (var1 == null) {
         int var8 = 0;
         this.ej = null;
         this.v[0].setVisible(false);
         this.o[0].setText(null);
         this.o[4].setText(null);
         this.o[5].setText(null);

         for (int var7 = 0; var8 < this.jk.length; var8 = var7) {
            this.jk[var7++].setText(null);
         }
      } else {
         RoleData var2 = this.yx();
         com.xy.v.Class8 var3 = this.yt();
         this.ej = var1.getRgid();
         BaseFly var4;
         Fly var5 = (var4 = var1.getBaseFly()).getFly(var3);
         JLabel var10007 = this.o[0];
         StringBuilder var10008 = new StringBuilder(String.valueOf(var5.getName()));
         String var10009 = "\u000f";
         var10008 = var10008.append("(").append(MsgUntil.h(var5.getLvl()));
         var10009 = "3";
         var10007.setText(var10008.append(")").toString());
         com.xy.q.Class14 var10006 = this.jk[0];
         StringBuilder var14 = new StringBuilder(String.valueOf(var4.getLvl()));
         String var17 = "\b";
         var10006.setText(var14.append("/").append(var5.getLvlMax()).toString());
         com.xy.q.Class14 var10005 = this.jk[1];
         StringBuilder var13 = new StringBuilder(String.valueOf(var4.getExp()));
         String var15 = "5";
         var10005.setText(var13.append("/").append(var5.getTotalExp(var4.getLvl() + 1)).toString());
         this.jk[2].setText(String.valueOf(var2.getGoodTypeNum(8903)));
         com.xy.q.Class14 var10003 = this.jk[3];
         StringBuilder var10004 = new StringBuilder(String.valueOf(var4.getRl()));
         String var12 = "\b";
         var10003.setText(var10004.append("/").append(var5.getRlMax()).toString());
         this.jk[4].setText(String.valueOf(var5.getRlUse()));
         Fly var6 = var3.ap(var5.getNext());
         this.o[4].setText(String.valueOf(var5.getSp()));
         this.o[5].setText(var6 != null ? String.valueOf(var6.getSp()) : null);
         com.xy.i.Class4 var10000 = this.v[0];
         String var9;
         if (var4.getLvl() < var5.getLvlMax()) {
            var9 = "丵锴卲纽";
            var9 = "一键升级";
         } else {
            var9 = "匭阑";
            var9 = "升阶";
         }

         var10000.setText(var9);
         this.v[0].setVisible(var6 != null || var4.getLvl() < var5.getLvlMax());
         this.as = com.xy.w.Class11.t(var5.getSn2(), 2, 1, null);
      }
   }

   public void h() {
      RoleData var1 = this.yx();
      com.xy.v.Class8 var2 = this.yt();
      Goodstable var3;
      if ((var3 = var1.getGood(this.ej)) != null) {
         BaseFly var10000 = var3.getBaseFly();
         Fly var5 = var10000.getFly(var2);
         if (var10000.getRl() < var5.getRlMax()) {
            Goodstable var6;
            if ((var6 = var1.au(8902L)) == null) {
               String var8 = "胫卯沆杣盟廾皣逹児";
               this.afx.dp("背包没有相应的道具");
            } else {
               String var10003 = "sH";
               StringBuilder var10001 = new StringBuilder("FR").append(var3.getRgid());
               String var10002 = "[";
               String var7 = Agreement.getSendTextAES("rolechange", var10001.append("|").append(var6.getRgid()).toString());
               this.za().k(var7);
            }
         }
      }
   }

   public Class30(GameView var1) {
      super(147, 2, com.xy.q.Class30.afz, var1);
      String var10003 = "Fy\u001a~\u001a+\u001bj[}";
      this.yy(-1, 0, 517, 420, com.xy.q.Class30.agh);
      com.xy.w.Class9 var47 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10004 = "\u0007颴\u0007蠦\u0007";
      this.yu(var47, " 飞 行 ");
      this.o = new JLabel[9];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.o.length; var10000 = var2) {
         this.o[var2] = com.xy.q.Class1.f(291, 79 + (var2 - 1) * 24, 72, 19, 0, Color.black, com.xy.q.Class49.ch);
         JLabel var9 = this.o[var2];
         String var21;
         if (var2 == 0) {
            var21 = "孓乺\u001d亾浴3";
            var21 = "学习(交流)";
         } else if (var2 == 1) {
            var21 = "笣纀";
            var21 = "等级";
         } else if (var2 == 2) {
            var21 = "灯劝倦";
            var21 = "灵动值";
         } else if (var2 == 3) {
            var21 = "颴衫遵庁";
            var21 = "飞行速度";
         } else if (var2 == 4) {
            var21 = ")\u0003?";
            var21 = "36%";
         } else if (var2 == 5) {
            var21 = "\u0010X\u0002";
            var21 = "72%";
         } else if (var2 == 6) {
            var21 = "燙灀倦";
            var21 = "燃灵值";
         } else if (var2 == 7) {
            var21 = "毨剬涯聽燤瀟倛";
            var21 = "每分消耗燃灵值";
         } else if (var2 == 8) {
            var21 = "\u00045\u0004*";
            var21 = "1/10";
         } else {
            var21 = "";
         }

         var9.setText(var21);
         Class30 var10;
         if (var2 == 0) {
            var10 = this;
            this.o[var2].setBounds(283, 44, 200, 18);
         } else if (var2 == 1 || var2 == 2) {
            var10 = this;
            this.o[var2].setHorizontalAlignment(4);
         } else if (var2 == 3) {
            var10 = this;
            this.o[var2].setBounds(291, 233, 72, 19);
         } else if (var2 == 4) {
            var10 = this;
            this.o[var2].setBounds(363, 233, 38, 19);
            this.o[var2].setFont(com.xy.q.Class49.w);
         } else if (var2 == 5) {
            var10 = this;
            this.o[var2].setBounds(434, 233, 38, 19);
            this.o[var2].setFont(com.xy.q.Class49.w);
         } else if (var2 == 6) {
            var10 = this;
            this.o[var2].setBounds(69, 241, 52, 19);
         } else if (var2 == 7) {
            var10 = this;
            this.o[var2].setBounds(67, 265, 122, 19);
         } else {
            if (var2 == 8) {
               this.o[var2].setBounds(219, 374, 60, 19);
               this.o[var2].setFont(com.xy.q.Class49.ab);
            }

            var10 = this;
         }

         var10.add(this.o[var2++]);
      }

      this.v = new com.xy.i.Class4[3];

      for (int var11 = var2 = 0; var11 < this.v.length; var11 = var2) {
         com.xy.i.Class4[] var12 = this.v;
         if (var2 == 0) {
            var10004 = "T\t\b\u000f\bX\u0011DW\u0004@";
            var10004 = "sc/e/26.png";
         } else if (var2 == 1) {
            var10004 = "Fy\u001a\u007f\u001a,\u001bj[}";
            var10004 = "sc/e/6.png";
         } else {
            var10004 = "\u0019DEBE\u0010DW\u0004@";
            var10004 = "sc/e/7.png";
         }

         int var10006 = 71 + var2;
         Font var10007 = var2 == 1 ? com.xy.q.Class49.bz : com.xy.q.Class49.ch;
         String var60;
         Class30 var10010;
         if (var2 == 0) {
            var60 = "丵锴卲纽";
            var60 = "一键升级";
            var10010 = this;
         } else if (var2 == 1) {
            var60 = "蠏兢";
            var60 = "补充";
            var10010 = this;
         } else if (var2 == 2) {
            var60 = "丗弙";
            var60 = "丢弃";
            var10010 = this;
         } else {
            var60 = "";
            var10010 = this;
         }

         com.xy.i.Class4 var30 = new com.xy.i.Class4(var10004, 1, var10006, var10007, null, var60, var10010);
         var12[var2] = var30;
         Class30 var13;
         if (var2 == 0) {
            var13 = this;
            this.v[var2].setForeground(Color.black);
            this.v[var2].setBounds(334, 262, 99, 25);
         } else if (var2 == 1) {
            var13 = this;
            this.v[var2].setBounds(238, 242, 34, 18);
         } else {
            if (var2 == 2) {
               this.v[var2].setForeground(Color.black);
               this.v[var2].setBounds(405, 372, 59, 25);
            }

            var13 = this;
         }

         var13.add(this.v[var2++]);
      }

      this.jk = new com.xy.q.Class14[5];

      for (int var14 = var2 = 0; var14 < this.jk.length; var14 = var2) {
         this.jk[var2] = com.xy.q.Class1.i(0, 0, 0, 0, 10, var2 != 0 && var2 != 2 ? (var2 == 1 ? Color.red : Color.white) : Color.green, com.xy.q.Class49.w);
         com.xy.q.Class14 var31 = this.jk[var2];
         String var37 = "T\t\b\u000e\b[\u0010DW\u0004@";
         var31.mt(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false));
         Class30 var15;
         if (var2 == 0 || var2 == 1) {
            var15 = this;
            this.jk[var2].setBounds(366, 79 + var2 * 24, 104, 19);
         } else if (var2 == 2) {
            var15 = this;
            this.jk[var2].setHorizontalAlignment(0);
            this.jk[var2].setBounds(355, 197, 57, 19);
         } else if (var2 == 3) {
            var15 = this;
            this.jk[var2].setBounds(131, 241, 142, 19);
         } else {
            if (var2 == 4) {
               this.jk[var2].setBounds(199, 265, 74, 19);
            }

            var15 = this;
         }

         var15.add(this.jk[var2++]);
      }

      this.vo = new com.xy.q.Class54(this);
      String var10005 = "Fy\u001a~\u001a.\u001bj[}";
      this.vo.dq("sc/d/4.png");
      var10004 = "T\t\b\u0003S\u000fJE\u001eS\u0016Z\u0015DW\u0004@";
      this.vo.dp("sc/item/99102.png");
      this.vo.wp(new com.xy.v.Class32(4, 4, 50, 50));
      this.vo.setBounds(353, 132, 59, 57);
      Goodstable var7;
      Class30 var16;
      if ((var7 = this.yt().ay(new BigDecimal(66721))) != null && var7.getType() == 8903L) {
         var16 = this;
         this.vo.gs(1, var7);
      } else {
         var16 = this;
         this.vo.removeMouseListener(this.vo);
      }

      var16.add(this.vo);
      com.xy.i.Class3[] var3 = new com.xy.i.Class3[2];

      int var4;
      for (int var17 = var4 = 0; var17 < var3.length; var17 = var4) {
         if (var4 == 0) {
            var10004 = "iV5P5\u0001(\u001bj[}";
            var10004 = "sc/e/42.png";
         } else {
            var10004 = "T\t\b\u000f\b^\u0014DW\u0004@";
            var10004 = "sc/e/43.png";
         }

         com.xy.i.Class3 var32 = new com.xy.i.Class3(var10004, 1, var4, this);
         var3[var4] = var32;
         if (var4 == 0) {
            var3[var4].setBounds(49, 321, 18, 18);
            var16 = this;
         } else {
            var3[var4].setBounds(470, 321, 18, 18);
            var16 = this;
         }

         var16.add(var3[var4++]);
      }

      this.ahi = new com.xy.q.Class46(this, 6, 1, 59, 57, 7, 0, 74, 301);
      String var59 = "Fy\u001a~\u001a.\u001bj[}";
      this.ahi.gt(com.xy.w.Class16.c("sc/d/4.png"));
      this.ahi.vr(var3, 1);
      this.add(this.ahi);
      this.fd = new com.xy.w.Class18[13];

      for (int var19 = var4 = 0; var19 < this.fd.length; var19 = var4) {
         this.fd[var4] = new com.xy.w.Class18();
         if (var4 == 0) {
            var16 = this;
            com.xy.w.Class18 var40 = this.fd[var4];
            var10003 = "T\t\b\u000e\b[\u0011DW\u0004@";
            var40.mt(com.xy.w.Class16.m("sc/d/16.png", 2, 2, 2, 2, false));
            this.fd[var4].setBounds(63, 45, 210, 190);
         } else if (var4 == 1) {
            var16 = this;
            com.xy.w.Class18 var41 = this.fd[var4];
            var10003 = "iV5Q5\u0003)\u001bj[}";
            var41.dp("sc/d/63.png");
            this.fd[var4].setBounds(401, 232, 27, 20);
         } else if (var4 == 2) {
            var16 = this;
            this.fd[var4].setVisible(false);
            com.xy.w.Class18 var33 = this.fd[var4];
            String var42 = "T\t\b\u000e\b\\\u0013DW\u0004@";
            var33.mt(com.xy.w.Class16.m("sc/d/64.png", 2, 2, 2, 2, false));
         } else if (var4 == 3 || var4 == 4) {
            var16 = this;
            com.xy.w.Class18 var45 = this.fd[var4];
            var10003 = "iV5Q5\u0006*\u001bj[}";
            var45.dp("sc/d/30.png");
            this.fd[var4].setBounds(298, 68 + 157 * (var4 - 3), 170, 1);
         } else if (var4 >= 5 && var4 <= 11) {
            com.xy.w.Class18 var35 = this.fd[var4];
            String var44 = "T\t\b\u000e\bY\u0017DW\u0004@";
            var35.dp("sc/d/30.png");
            if (var4 == 11) {
               var16 = this;
               this.fd[var4].setBounds(354, 189, 58, 1);
            } else {
               var16 = this;
               this.fd[var4].setBounds(75 + 66 * (var4 - 5), 358, 58, 1);
            }
         } else {
            if (var4 == 12) {
               com.xy.w.Class18 var34 = this.fd[var4];
               String var43 = "iV5Q5\u0006,\u001bj[}";
               var34.mt(com.xy.w.Class16.m("sc/d/36.png", 30, 30, 30, 30, false));
               this.fd[var4].setBounds(46, 32, 440, 264);
            }

            var16 = this;
         }

         var16.add(this.fd[var4++]);
      }
   }

   @Override
   protected void paintChildren(Graphics var1) {
      super.paintChildren(var1);
      if (this.as != null) {
         this.as.r(var1, 168, 150, 4, com.xy.v.Class22.l());
      }
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.afx.dh()) {
         this.e();
      }
   }

   @Override
   public void l() {
      if (this.yx() != null) {
         this.e();
         super.l();
      }
   }
}
