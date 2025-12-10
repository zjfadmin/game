package com.xy;

import com.xy.bean.LoginResult;
import com.xy.entity.RoleSummoning;
import com.xy.formula.BaseValue;
import com.xy.game.RoleData;
import com.xy.readbean.MoneyType;
import com.xy.socket.Agreement;
import com.xy.socket.GameClient;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.math.BigDecimal;
import javax.swing.JLabel;

public class Class54 extends Class345 {
   private Class245[] zh;
   private Class556[] zi;
   private Class643[] zj;
   private JLabel[] ad;
   private Class436 bl;
   private BigDecimal py;

   public Class54(GameView var1) {
      int var10001 = 1 ^ 3;
      int var10005 = -4 >> 2;
      super(124 & 119, 5 >> 1, Class345.aef, var1);
      this.va(var10005, 5 >> 3, 28670 & 4503, 10183 & 22975, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 101 & 94, 101 & 94, 101 & 94, 101 & 94, (boolean)(2 & 5)), "灵犀修炼");
      Class643[] var5 = new Class643[var10001];
      boolean var10003 = true;
      this.zj = var5;

      int var2;
      Class54 var4;
      int var10000;
      int var10006;
      for(var10000 = var2 = 3 & 4; var10000 < this.zj.length; var10000 = var2) {
         Class643[] var3 = this.zj;
         Class643 var6 = new Class643;
         String var10004 = var2 == 0 ? "sc/e/26.png" : "sc/e/46.png";
         var10006 = (101 & 127) + var2;
         Font var10007 = Class681.ak;
         Color[] var10008 = Class681.c;
         String var10009;
         Class54 var10010;
         if (var2 == 0) {
            var10009 = "一键兑换";
            var10010 = this;
         } else if (var2 == (2 ^ 3)) {
            var10009 = "提升灵犀点";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var6.<init>(var10004, 1, var10006, var10007, var10008, var10009, var10010);
         var3[var2] = var6;
         if (var2 == 0) {
            this.zj[var2].setBounds(127 & 91, 25950 & 7157, 107 & 119, 121 & 31);
            var4 = this;
         } else {
            this.zj[var2].setBounds(22233 & 10734, 28663 & 4444, 127 & 119, 127 & 25);
            var4 = this;
         }

         var4.add(this.zj[var2++]);
      }

      Class245[] var7 = new Class245[95 & 38];
      var10003 = true;
      this.zh = var7;
      Class556[] var8 = new Class556[--3];
      var10003 = true;
      this.zi = var8;

      for(var10000 = var2 = 3 >> 2; var10000 < this.zh.length; var10000 = var2) {
         Class245[] var9 = this.zh;
         int var10002 = 3 ^ 3;
         int var11 = 3 ^ 3;
         int var12;
         if (var2 == (1 ^ 3)) {
            var10006 = 5 >> 3;
            var12 = var2;
         } else {
            var10006 = 10;
            var12 = var2;
         }

         var9[var2] = Class133.a(var11, var11, var10002, var11, var10006, var12 == 0 ? Color.red : Color.white, Class681.q);
         this.zh[var2].eq(Class511.q("sc/d/17.png", --3, --3, --3, --3, (boolean)(2 & 5)));
         if (var2 == 0) {
            var4 = this;
            this.zh[var2].setBounds(126 & 125, 119 & 57, 100, 19);
         } else if (var2 == 5 >> 2) {
            var4 = this;
            this.zh[var2].setBounds(330, 49, 39, 19);
         } else if (var2 == 5 >> 1) {
            var4 = this;
            this.zh[var2].setBounds(204, 79, 165, 19);
         } else if (var2 == --3) {
            var4 = this;
            this.zh[var2].setBounds(184, 153, 154, 19);
         } else if (var2 == --4) {
            var4 = this;
            this.zh[var2].setBounds(184, 213, 154, 19);
         } else {
            if (var2 == --5) {
               this.zh[var2].setBounds(184, 273, 154, 19);
            }

            var4 = this;
         }

         var4.add(this.zh[var2++]);
      }

      for(var10000 = var2 = 3 >> 2; var10000 < this.zi.length; var10000 = var2) {
         this.zi[var2] = Class133.i(10, Color.white, Class681.q, (MoneyType)null, var1);
         this.zi[var2].eq(Class511.q("sc/d/17.png", --3, --3, --3, --3, (boolean)(2 & 5)));
         if (var2 == 0) {
            var4 = this;
            this.zi[var2].setBounds(184, 183, 154, 19);
         } else if (var2 == (3 & 5)) {
            var4 = this;
            this.zi[var2].setBounds(184, 243, 154, 19);
         } else {
            if (var2 == --2) {
               this.zi[var2].setBounds(184, 303, 154, 19);
            }

            var4 = this;
         }

         var4.add(this.zi[var2++]);
      }

      JLabel[] var10 = new JLabel[10];
      var10003 = true;
      this.ad = var10;

      for(var10000 = var2 = 5 >> 3; var10000 < this.ad.length; var10000 = var2) {
         this.ad[var2] = Class133.c(55, 49, 88, 19, 10, Class681.c("#c000000"), Class681.ak);
         this.ad[var2].setText(var2 == 0 ? "召唤兽：" : (var2 == (3 & 5) ? "灵犀等级" : (var2 == --2 ? "当前灵犀修炼进度" : (var2 == --3 ? "兑换灵犀所需" : (var2 == --4 ? "所需经验" : (var2 == --5 ? "当前经验" : (var2 == 6 ? "所需金钱" : (var2 == 7 ? "当前金钱" : (var2 == 8 ? "所需亲密" : (var2 == 9 ? "当前亲密" : ""))))))))));
         this.add(this.ad[var2]);
         if (var2 == 0) {
            this.ad[var2].setBounds(55, 49, 88, 19);
         } else if (var2 == 5 >> 2) {
            this.ad[var2].setBounds(250, 49, 72, 19);
         } else if (var2 == 2) {
            this.ad[var2].setBounds(55, 79, 138, 19);
         } else if (var2 == 3) {
            this.ad[var2].setBounds(55, 113, 138, 19);
         } else if (var2 >= 4 && var2 <= 9) {
            this.ad[var2].setBounds(55, 153 + (var2 - 4) * 30, 120, 19);
         }

         ++var2;
      }

      this.bl = new Class436("sc/d/30.png");
      this.bl.setBounds(56, 134, 280, 5 >> 2);
      this.add(this.bl);
   }

   public void s() {
      RoleData var10000 = this.vd();
      LoginResult var5 = var10000.getLoginResult();
      RoleSummoning var2;
      if ((var2 = var10000.getPet(this.py)) == null) {
         this.d();
         this.ve().n(this.ae());
      } else {
         GameClient var3 = this.uw();
         int var4;
         int var1 = BaseValue.getLxLvl(var4 = var2.getLxValue());
         this.zh[2 & 5].setText(var2.getSummoningname());
         this.zh[4 ^ 5].setText(String.valueOf(var1));
         this.zh[1 ^ 3].setText(var4 - BaseValue.getLxTotalExp(var1) + "/" + BaseValue.getLxExp(var1 + --1));
         Class681.j(this.zh[--3], BaseValue.getLxXHExp(var1, var3).longValue());
         Class681.j(this.zh[--4], BaseValue.getLxXHMoney(var1, var3).longValue());
         Class681.j(this.zh[--5], BaseValue.getLxXHQm(var1, var3).longValue());
         this.zi[3 ^ 3].gh(var2.getExp().longValue());
         Class54 var6;
         if (var3.gameType != 5 >> 1 && var1 > (127 & 49)) {
            var6 = this;
            this.zi[5 >> 2].gh(var5.getCodecard().longValue());
            this.ad[38 & 95].setText("所需仙玉");
            this.ad[7 & 127].setText("当前仙玉");
         } else {
            var6 = this;
            this.zi[--1].gh(var5.getGold().longValue());
            this.ad[95 & 38].setText("所需金钱");
            this.ad[55 & 79].setText("当前金钱");
         }

         var6.zi[1 ^ 3].gh(var2.getFriendliness());
      }
   }

   public void d() {
      int var10000;
      int var1;
      for(var10000 = var1 = 2 & 5; var10000 < this.zh.length; var10000 = var1) {
         this.zh[var1++].setText((String)null);
      }

      for(var10000 = var1 = 3 & 4; var10000 < this.zi.length; var10000 = var1) {
         this.zi[var1++].setText((String)null);
      }

   }

   public void y(int var1) {
      RoleSummoning var2;
      if ((var2 = this.vd().getPet(this.py)) == null) {
         this.aej.fw("请选择一只召唤兽");
      } else {
         String var3 = Agreement.getSendTextAES("userpet", "LXXL|" + var2.getSid() + (var1 == (103 & 126) ? "" : "|MAX"));
         this.uw().d(var3);
      }
   }

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.aej.bl()) {
         this.s();
      }

   }

   public void bk(BigDecimal var1) {
      this.py = var1;
      this.s();
      this.ve().a(this.ae());
   }
}
