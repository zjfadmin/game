package com.xy;

import com.xy.bean.LoginResult;
import com.xy.formula.BaseMeridians;
import com.xy.formula.BaseValue;
import com.xy.formula.SkillUtil;
import com.xy.readbean.MoneyType;
import com.xy.readbean.Skill;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.math.BigDecimal;
import javax.swing.JLabel;

public class Class473 extends Class345 {
   private JLabel[] azo;
   private BigDecimal cd;
   private Class436 tu;
   private Class556 abn;
   private int fk;
   private Class70[] xl;
   private Class556 ks;
   private BigDecimal ne;
   private int cy;
   private Class245[] ail;

   public Class473(GameView var1) {
      int var10001 = 1 ^ 3;
      int var10005 = -4 >> 2;
      super(123 & 127, --2, Class345.aef, var1);
      this.va(var10005, 2 & 5, 28159 & 4979, 8685 & 24439, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 111 & 84, 111 & 84, 111 & 84, 111 & 84, (boolean)(3 ^ 3)), "法术修炼");
      Class70[] var5 = new Class70[var10001];
      boolean var10003 = true;
      this.xl = var5;

      int var2;
      Class473 var4;
      int var10000;
      for(var10000 = var2 = 3 ^ 3; var10000 < this.xl.length; var10000 = var2) {
         Class70[] var3 = this.xl;
         Class70 var6 = new Class70;
         String var10004 = var2 == 0 ? "sc/e/31.png" : "sc/e/26.png";
         int var10006 = (21373 & 11727) + var2;
         Font var10007 = Class681.ak;
         Color[] var10008 = Class681.c;
         String var10009;
         Class473 var10010;
         if (var2 == 0) {
            var10009 = "修 炼";
            var10010 = this;
         } else if (var2 == 5 >> 2) {
            var10009 = "一键修炼";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var6.<init>(var10004, 1, var10006, var10007, var10008, var10009, var10010);
         var3[var2] = var6;
         if (var2 == 0) {
            var4 = this;
            this.xl[var2].setBounds(123 & 95, 16766 & 16307, 111 & 95, 25 & 127);
         } else {
            if (var2 == --1) {
               this.xl[var2].setBounds(6089 & 26878, 823 & 32250, 99 & 127, 61 & 91);
            }

            var4 = this;
         }

         var4.add(this.xl[var2++]);
      }

      Class245[] var7 = new Class245[--5];
      var10003 = true;
      this.ail = var7;

      for(var10000 = var2 = 5 >> 3; var10000 < this.ail.length; var10000 = var2) {
         this.ail[var2] = Class133.a(2 & 5, 2 & 5, 2 & 5, 2 & 5, 2 & 5, Color.white, Class681.q);
         this.ail[var2].eq(Class511.q("sc/d/17.png", --3, --3, --3, --3, (boolean)(5 >> 3)));
         if (var2 >= 0 && var2 <= 5 >> 1) {
            var4 = this;
            this.ail[var2].setBounds(5310 & 27641, (63 & 113) + (95 & 62) * var2, 154, 19);
         } else if (var2 == --3) {
            var4 = this;
            this.ail[var2].setBounds(184, 179, 154, 19);
         } else {
            if (var2 == --4) {
               this.ail[var2].setBounds(184, 241, 154, 19);
            }

            var4 = this;
         }

         var4.add(this.ail[var2++]);
      }

      int var10011 = 2 & 5;
      this.ks = Class133.i(3 >> 2, Color.white, Class681.q, (MoneyType)null, var1);
      this.abn = Class133.i(var10011, Color.white, Class681.q, (MoneyType)null, var1);
      this.ks.eq(Class511.q("sc/d/17.png", --3, --3, --3, --3, (boolean)(3 & 4)));
      this.abn.eq(Class511.q("sc/d/17.png", --3, --3, --3, --3, (boolean)(3 ^ 3)));
      this.ks.setBounds(184, 210, 154, 19);
      this.abn.setBounds(184, 272, 154, 19);
      this.ks.setText("0");
      this.abn.setText("0");
      this.add(this.ks);
      this.add(this.abn);
      JLabel[] var8 = new JLabel[8];
      var10003 = true;
      this.azo = var8;

      for(var10000 = var2 = 2 & 5; var10000 < this.azo.length; var10000 = var2) {
         this.azo[var2] = Class133.c(55, 49 + var2 * 30, 120, 19, 10, Class681.c("#c000000"), Class681.ak);
         this.azo[var2].setText(var2 == 0 ? "当前法术" : (var2 == 5 >> 2 ? "当前熟练" : (var2 == 5 >> 1 ? "本周修炼次数" : (var2 == --3 ? "提升熟练度所需" : (var2 == --4 ? "所需经验" : (var2 == --5 ? "拥有经验" : (var2 == 6 ? "所需金钱" : (var2 == 7 ? "拥有金钱" : ""))))))));
         this.add(this.azo[var2]);
         if (var2 == --3) {
            this.azo[var2].setBounds(55, 143, 120, 19);
         } else if (var2 >= --4 && var2 <= 7) {
            this.azo[var2].setBounds(55, 179 + (var2 - 4) * 31, 72, 19);
         }

         ++var2;
      }

      this.tu = new Class436("sc/d/30.png");
      this.tu.setBounds(56, 164, 280, 5 >> 2);
      this.add(this.tu);
   }

   public void d() {
      LoginResult var1 = this.vd().getLoginResult();
      this.ks.gh(var1.getExperience().longValue());
      if (this.fk == 0) {
         this.abn.gh(var1.getGold().longValue());
      } else if (this.fk == --1) {
         this.abn.gh(var1.getCodecard().longValue());
      } else if (this.fk == (1 ^ 3)) {
         this.abn.gh(var1.getScoretype("法门积分").longValue());
      } else {
         if (this.fk == --3) {
            this.abn.gh(var1.getScoretype("师门贡献").longValue());
         }

      }
   }

   public void apx(BaseMeridians var1, int var2) {
      this.apy(var1, var2);
      if (this.ve().m(this.ae()) == null) {
         this.ve().a(this.ae());
      }

   }

   public synchronized void apy(BaseMeridians var1, int var2) {
      if (var1 != null) {
         if (var2 != -4 >> 2) {
            this.cy = var2;
         }

         LoginResult var6 = this.vd().getLoginResult();
         int var3 = var1 != null && var1.getKey() != null ? Integer.parseInt(var1.getKey()) - (4 ^ 5) : -1;
         LoginResult var10000 = var6;
         var2 = SkillUtil.getSepciesIndex(var6.getSpecies_id());
         int var4 = SkillUtil.getFMMax(var10000.getGrade(), this.uw());
         var3 = SkillUtil.getFMIndex(var2, var3);
         int var10001;
         int var8;
         if (this.cy == 0) {
            var8 = 32761 & 12006;
            var10001 = var3;
         } else {
            var8 = 12500;
            var10001 = var3;
         }

         var2 = var8 + var10001;
         Skill var7;
         if ((var7 = this.vc().bf(String.valueOf(var2))) != null) {
            int var5 = this.cy == 0 ? var1.getExp() : var1.getXs();
            this.ail[5 >> 3].setText(var7.getSkillname());
            this.ail[2 ^ 3].setText(var5 + "/" + var4);
            this.ne = BaseValue.getFMXHExp(var5, this.uw());
            this.cd = BaseValue.getFMXHMoney(var5, this.uw());
            Class681.j(this.ail[--3], this.ne.longValue());
            Class681.j(this.ail[--4], this.cd.longValue());
            Class473 var9;
            if (this.uw().n(--2, --5)) {
               this.fk = --3;
               var9 = this;
            } else if (this.uw().gameType == --2) {
               var9 = this;
               this.fk = 2 & 5;
            } else if (this.uw().gameType == --4) {
               var9 = this;
               this.fk = 3 ^ 3;
            } else if (this.uw().gameType == --3) {
               this.fk = var5 < (30713 & 8054) ? 3 >> 2 : 2;
               var9 = this;
            } else if (this.uw().gameType == (2 ^ 3)) {
               this.fk = var5 < (23452 & 14315) ? 3 ^ 3 : 2;
               var9 = this;
            } else {
               this.fk = var5 < (2035 & 32732) ? 3 ^ 3 : 1;
               var9 = this;
            }

            var9.azo[86 & 47].setText(this.fk == (4 ^ 5) ? "所需仙玉" : (this.fk == --2 ? "所需法门" : (this.fk == --3 ? "所需师贡" : "所需金钱")));
            this.azo[127 & 7].setText(this.fk == (2 ^ 3) ? "拥有仙玉" : (this.fk == (1 ^ 3) ? "拥有法门" : (this.fk == --3 ? "拥有师贡" : "拥有金钱")));
            this.d();
         }
      }
   }

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.aej.bl()) {
         this.d();
      }

   }

   public int e() {
      return this.cy;
   }
}
