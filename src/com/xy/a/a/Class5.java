package com.xy.a.a;

import com.xy.bean.LoginResult;
import com.xy.entity.RoleSummoning;
import com.xy.formula.BaseValue;
import com.xy.game.RoleData;
import com.xy.socket.Agreement;
import com.xy.socket.GameClient;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.math.BigDecimal;
import javax.swing.JLabel;

public class Class5 extends com.xy.q.Class30 {
   private com.xy.w.Class18 co;
   private BigDecimal dt;
   private com.xy.q.Class52[] du;
   private com.xy.q.Class14[] dv;
   private JLabel[] o;
   private com.xy.i.Class4[] v;

   public Class5(GameView var1) {
      super(116, 2, com.xy.q.Class30.afz, var1);
      this.yy(-1, 0, 406, 391, com.xy.q.Class30.agh);
      this.yu(com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false), "灵犀修炼");
      this.v = new com.xy.i.Class4[2];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.v.length; var10000 = var2) {
         com.xy.i.Class4[] var6 = this.v;
         String var10004;
         if (var2 == 0) {
            var10004 = "sc/e/26.png";
         } else {
            var10004 = "sc/e/46.png";
         }

         int var10006 = 101 + var2;
         String var37;
         Class5 var10010;
         if (var2 == 0) {
            var37 = "一键兑换";
            var10010 = this;
         } else if (var2 == 1) {
            var37 = "提升灵犀点";
            var10010 = this;
         } else {
            var37 = "";
            var10010 = this;
         }

         com.xy.i.Class4 var10001 = new com.xy.i.Class4(var10004, 1, var10006, com.xy.q.Class49.ch, com.xy.q.Class49.bv, var37, var10010);
         var6[var2] = var10001;
         Class5 var7;
         if (var2 == 0) {
            this.v[var2].setBounds(91, 340, 99, 25);
            var7 = this;
         } else {
            this.v[var2].setBounds(200, 340, 119, 25);
            var7 = this;
         }

         var7.add(this.v[var2++]);
      }

      this.dv = new com.xy.q.Class14[6];
      this.du = new com.xy.q.Class52[3];

      for (int var8 = var2 = 0; var8 < this.dv.length; var8 = var2) {
         byte var35;
         int var10007;
         if (var2 == 2) {
            var35 = 0;
            var10007 = var2;
         } else {
            var35 = 10;
            var10007 = var2;
         }

         this.dv[var2] = com.xy.q.Class1.i(0, 0, 0, 0, var35, var10007 == 0 ? Color.red : Color.white, com.xy.q.Class49.w);
         this.dv[var2].mt(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false));
         Class5 var9;
         if (var2 == 0) {
            var9 = this;
            this.dv[var2].setBounds(124, 49, 100, 19);
         } else if (var2 == 1) {
            var9 = this;
            this.dv[var2].setBounds(330, 49, 39, 19);
         } else if (var2 == 2) {
            var9 = this;
            this.dv[var2].setBounds(204, 79, 165, 19);
         } else if (var2 == 3) {
            var9 = this;
            this.dv[var2].setBounds(184, 153, 154, 19);
         } else if (var2 == 4) {
            var9 = this;
            this.dv[var2].setBounds(184, 213, 154, 19);
         } else {
            if (var2 == 5) {
               this.dv[var2].setBounds(184, 273, 154, 19);
            }

            var9 = this;
         }

         var9.add(this.dv[var2++]);
      }

      for (int var10 = var2 = 0; var10 < this.du.length; var10 = var2) {
         this.du[var2] = com.xy.q.Class1.a(10, Color.white, com.xy.q.Class49.w, null, var1);
         this.du[var2].mt(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false));
         Class5 var12;
         if (var2 == 0) {
            var12 = this;
            this.du[var2].setBounds(184, 183, 154, 19);
         } else if (var2 == 1) {
            var12 = this;
            this.du[var2].setBounds(184, 243, 154, 19);
         } else {
            if (var2 == 2) {
               this.du[var2].setBounds(184, 303, 154, 19);
            }

            var12 = this;
         }

         var12.add(this.du[var2++]);
      }

      this.o = new JLabel[10];

      for (int var13 = var2 = 0; var13 < this.o.length; var13 = ++var2) {
         this.o[var2] = com.xy.q.Class1.f(55, 49, 88, 19, 10, com.xy.q.Class49.c("#c000000"), com.xy.q.Class49.ch);
         JLabel var14 = this.o[var2];
         String var18;
         if (var2 == 0) {
            var18 = "召唤兽：";
         } else if (var2 == 1) {
            var18 = "灵犀等级";
         } else if (var2 == 2) {
            var18 = "当前灵犀修炼进度";
         } else if (var2 == 3) {
            var18 = "兑换灵犀所需";
         } else if (var2 == 4) {
            var18 = "所需经验";
         } else if (var2 == 5) {
            var18 = "当前经验";
         } else if (var2 == 6) {
            var18 = "所需金钱";
         } else if (var2 == 7) {
            var18 = "当前金钱";
         } else if (var2 == 8) {
            var18 = "所需亲密";
         } else if (var2 == 9) {
            var18 = "当前亲密";
         } else {
            var18 = "";
         }

         var14.setText(var18);
         this.add(this.o[var2]);
         if (var2 == 0) {
            this.o[var2].setBounds(55, 49, 88, 19);
         } else if (var2 == 1) {
            this.o[var2].setBounds(250, 49, 72, 19);
         } else if (var2 == 2) {
            this.o[var2].setBounds(55, 79, 138, 19);
         } else if (var2 == 3) {
            this.o[var2].setBounds(55, 113, 138, 19);
         } else if (var2 >= 4 && var2 <= 9) {
            this.o[var2].setBounds(55, 153 + (var2 - 4) * 30, 120, 19);
         }
      }

      this.co = new com.xy.w.Class18("sc/d/30.png");
      this.co.setBounds(56, 134, 280, 1);
      this.add(this.co);
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.afx.dh()) {
         this.f();
      }
   }

   public void f() {
      RoleData var10000 = this.yx();
      LoginResult var2 = var10000.getLoginResult();
      RoleSummoning var3;
      if ((var3 = var10000.getPet(this.dt)) == null) {
         this.h();
         this.zc().f(this.lj());
      } else {
         GameClient var4 = this.za();
         int var5;
         int var6 = BaseValue.getLxLvl(var5 = var3.getLxValue());
         this.dv[0].setText(var3.getSummoningname());
         this.dv[1].setText(String.valueOf(var6));
         this.dv[2].setText(new StringBuilder(String.valueOf(var5 - BaseValue.getLxTotalExp(var6))).append("/").append(BaseValue.getLxExp(var6 + 1)).toString());
         com.xy.q.Class49.b(this.dv[3], BaseValue.getLxXHExp(var6, var4).longValue());
         com.xy.q.Class49.b(this.dv[4], BaseValue.getLxXHMoney(var6, var4).longValue());
         com.xy.q.Class49.b(this.dv[5], BaseValue.getLxXHQm(var6, var4).longValue());
         this.du[0].ef(var3.getExp().longValue());
         Class5 var7;
         if (var4.gameType != 2 && var6 > 49) {
            var7 = this;
            this.du[1].ef(var2.getCodecard().longValue());
            this.o[6].setText("所需仙玉");
            this.o[7].setText("当前仙玉");
         } else {
            var7 = this;
            this.du[1].ef(var2.getGold().longValue());
            this.o[6].setText("所需金钱");
            this.o[7].setText("当前金钱");
         }

         var7.du[2].ef(var3.getFriendliness());
      }
   }

   public void g(int var1) {
      RoleSummoning var3;
      if ((var3 = this.yx().getPet(this.dt)) == null) {
         this.afx.dp("请选择一只召唤兽");
      } else {
         StringBuilder var10001 = new StringBuilder("LXXL|").append(var3.getSid());
         String var10002;
         if (var1 == 102) {
            var10002 = "";
         } else {
            var10002 = "|MAX";
         }

         String var4 = Agreement.getSendTextAES("userpet", var10001.append(var10002).toString());
         this.za().k(var4);
      }
   }

   public void h() {
      int var1;
      for (int var10000 = var1 = 0; var10000 < this.dv.length; var10000 = var1) {
         this.dv[var1++].setText(null);
      }

      for (int var3 = var1 = 0; var3 < this.du.length; var3 = var1) {
         this.du[var1++].setText(null);
      }
   }

   public void i(BigDecimal var1) {
      this.dt = var1;
      this.f();
      this.zc().b(this.lj());
   }
}
