package com.xy.a.w;

import com.xy.bean.LoginResult;
import com.xy.formula.BaseMeridians;
import com.xy.formula.BaseValue;
import com.xy.formula.SkillUtil;
import com.xy.q.Class49;
import com.xy.q.Class52;
import com.xy.readbean.Skill;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.math.BigDecimal;
import javax.swing.JLabel;

public class Class3 extends com.xy.q.Class30 {
   private BigDecimal bt;
   private com.xy.w.Class18 ei;
   private BigDecimal ej;
   private Class52 ek;
   private com.xy.i.Class20[] el;
   private int cb;
   private Class52 em;
   private int ds;
   private com.xy.q.Class14[] k;
   private JLabel[] au;

   public Class3(GameView var1) {
      super(123, 2, com.xy.q.Class30.afz, var1);
      String var10003 = "F4\u001a3\u001af\u001b'[0";
      this.yy(-1, 0, 371, 357, com.xy.q.Class30.agh);
      com.xy.w.Class9 var23 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10004 = "泻杢俀烱";
      this.yu(var23, "法术修炼");
      this.el = new com.xy.i.Class20[2];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.el.length; var10000 = var2) {
         com.xy.i.Class20[] var5 = this.el;
         if (var2 == 0) {
            var10004 = "$VxPx\u0006f\u001b'[0";
            var10004 = "sc/e/31.png";
         } else {
            var10004 = ">MbKb\u001c{\u0000=@*";
            var10004 = "sc/e/26.png";
         }

         int var10006 = 333 + var2;
         String var29;
         Class3 var10010;
         if (var2 == 0) {
            var29 = "侹\u0015烫";
            var29 = "修 炼";
            var10010 = this;
         } else if (var2 == 1) {
            var29 = "丮镣俀烱";
            var29 = "一键修炼";
            var10010 = this;
         } else {
            var29 = "";
            var10010 = this;
         }

         com.xy.i.Class20 var10001 = new com.xy.i.Class20(var10004, 1, var10006, Class49.ch, Class49.bv, var29, var10010);
         var5[var2] = var10001;
         Class3 var6;
         if (var2 == 0) {
            var6 = this;
            this.el[var2].setBounds(91, 306, 79, 25);
         } else {
            if (var2 == 1) {
               this.el[var2].setBounds(200, 306, 99, 25);
            }

            var6 = this;
         }

         var6.add(this.el[var2++]);
      }

      this.k = new com.xy.q.Class14[5];

      for (int var7 = var2 = 0; var7 < this.k.length; var7 = var2) {
         this.k[var2] = com.xy.q.Class1.i(0, 0, 0, 0, 0, Color.white, Class49.w);
         com.xy.q.Class14 var8 = this.k[var2];
         String var12 = "$VxQx\u0004`\u001b'[0";
         var8.mt(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false));
         Class3 var9;
         if (var2 >= 0 && var2 <= 2) {
            var9 = this;
            this.k[var2].setBounds(184, 49 + 30 * var2, 154, 19);
         } else if (var2 == 3) {
            var9 = this;
            this.k[var2].setBounds(184, 179, 154, 19);
         } else {
            if (var2 == 4) {
               this.k[var2].setBounds(184, 241, 154, 19);
            }

            var9 = this;
         }

         var9.add(this.k[var2++]);
      }

      this.em = com.xy.q.Class1.a(0, Color.white, Class49.w, null, var1);
      this.ek = com.xy.q.Class1.a(0, Color.white, Class49.w, null, var1);
      String var32 = ">MbJb\u001fz\u0000=@*";
      this.em.mt(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false));
      String var31 = "$VxQx\u0004`\u001b'[0";
      this.ek.mt(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false));
      this.em.setBounds(184, 210, 154, 19);
      this.ek.setBounds(184, 272, 154, 19);
      this.em.setText("0");
      this.ek.setText("0");
      this.add(this.em);
      this.add(this.ek);
      this.au = new JLabel[8];

      for (int var10 = var2 = 0; var10 < this.au.length; var10 = ++var2) {
         int var27 = 49 + var2 * 30;
         String var10008 = "\r.\u001e}\u001e}\u001e}";
         this.au[var2] = com.xy.q.Class1.f(55, var27, 120, 19, 10, Class49.c("#c000000"), Class49.ch);
         JLabel var11 = this.au[var2];
         String var14;
         if (var2 == 0) {
            var14 = "彦刚泠杸";
            var14 = "当前法术";
         } else if (var2 == 1) {
            var14 = "彽刀熱纎";
            var14 = "当前熟练";
         } else if (var2 == 2) {
            var14 = "朙吿俛烫欔攧";
            var14 = "本周修炼次数";
         } else if (var2 == 3) {
            var14 = "掝卩燒续廫扮靍";
            var14 = "提升熟练度所需";
         } else if (var2 == 4) {
            var14 = "扵靗绺髛";
            var14 = "所需经验";
         } else if (var2 == 5) {
            var14 = "拋杄绡髁";
            var14 = "拥有经验";
         } else if (var2 == 6) {
            var14 = "扵靗釤铦";
            var14 = "所需金钱";
         } else if (var2 == 7) {
            var14 = "拋杄釿铼";
            var14 = "拥有金钱";
         } else {
            var14 = "";
         }

         var11.setText(var14);
         this.add(this.au[var2]);
         if (var2 == 3) {
            this.au[var2].setBounds(55, 143, 120, 19);
         } else if (var2 >= 4 && var2 <= 7) {
            this.au[var2].setBounds(55, 179 + (var2 - 4) * 31, 72, 19);
         }
      }

      String var28 = "$VxQx\u0006g\u001b'[0";
      this.ei = new com.xy.w.Class18("sc/d/30.png");
      this.ei.setBounds(56, 164, 280, 1);
      this.add(this.ei);
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.afx.dh()) {
         this.h();
      }
   }

   public void h() {
      LoginResult var2 = this.yx().getLoginResult();
      this.em.ef(var2.getExperience().longValue());
      if (this.ds == 0) {
         this.ek.ef(var2.getGold().longValue());
      } else if (this.ds == 1) {
         this.ek.ef(var2.getCodecard().longValue());
      } else if (this.ds == 2) {
         String var3 = "泻閥私剋";
         this.ek.ef(var2.getScoretype("法门积分").longValue());
      } else {
         if (this.ds == 3) {
            String var10002 = "帽閿贔獹";
            this.ek.ef(var2.getScoretype("师门贡献").longValue());
         }
      }
   }

   public synchronized void dv(BaseMeridians var1, int var2) {
      if (var1 != null) {
         if (var2 != -1) {
            this.cb = var2;
         }

         LoginResult var4 = this.yx().getLoginResult();
         int var5 = var1 != null && var1.getKey() != null ? Integer.parseInt(var1.getKey()) - 1 : -1;
         int var6 = SkillUtil.getSepciesIndex(var4.getSpecies_id());
         int var7 = SkillUtil.getFMMax(var4.getGrade(), this.za());
         var5 = SkillUtil.getFMIndex(var6, var5);
         short var10000;
         int var10001;
         if (this.cb == 0) {
            var10000 = 12000;
            var10001 = var5;
         } else {
            var10000 = 12500;
            var10001 = var5;
         }

         int var8 = var10000 + var10001;
         Skill var9;
         if ((var9 = this.yt().ac(String.valueOf(var8))) != null) {
            int var10 = this.cb == 0 ? var1.getExp() : var1.getXs();
            this.k[0].setText(var9.getSkillname());
            com.xy.q.Class14 var10005 = this.k[1];
            StringBuilder var10006 = new StringBuilder(String.valueOf(var10));
            String var10007 = "b";
            var10005.setText(var10006.append("/").append(var7).toString());
            this.bt = BaseValue.getFMXHExp(var10, this.za());
            this.ej = BaseValue.getFMXHMoney(var10, this.za());
            Class49.b(this.k[3], this.bt.longValue());
            Class49.b(this.k[4], this.ej.longValue());
            Class3 var12;
            if (this.za().l(2, 5)) {
               this.ds = 3;
               var12 = this;
            } else if (this.za().gameType == 2) {
               var12 = this;
               this.ds = 0;
            } else if (this.za().gameType == 4) {
               var12 = this;
               this.ds = 0;
            } else if (this.za().gameType == 3) {
               this.ds = var10 < 6000 ? 0 : 2;
               var12 = this;
            } else if (this.za().gameType == 1) {
               this.ds = var10 < 5000 ? 0 : 2;
               var12 = this;
            } else {
               this.ds = var10 < 2000 ? 0 : 1;
               var12 = this;
            }

            JLabel var13 = var12.au[6];
            String var16;
            if (this.ds == 1) {
               String var15 = "扵靗们珞";
               var16 = "所需仙玉";
            } else if (this.ds == 2) {
               String var17 = "扮靍泻閥";
               var16 = "所需法门";
            } else if (this.ds == 3) {
               String var18 = "扵靗帽赶";
               var16 = "所需师贡";
            } else {
               String var19 = "扮靍釿铼";
               var16 = "所需金钱";
            }

            var13.setText(var16);
            JLabel var14 = this.au[7];
            String var21;
            if (this.ds == 1) {
               String var20 = "拐杞们珞";
               var21 = "拥有仙玉";
            } else if (this.ds == 2) {
               String var22 = "拋杄泻閥";
               var21 = "拥有法门";
            } else if (this.ds == 3) {
               String var23 = "拐杞帽赶";
               var21 = "拥有师贡";
            } else {
               String var24 = "拋杄釿铼";
               var21 = "拥有金钱";
            }

            var14.setText(var21);
            this.h();
         }
      }
   }

   public void dw(BaseMeridians var1, int var2) {
      this.dv(var1, var2);
      if (this.zc().l(this.lj()) == null) {
         this.zc().b(this.lj());
      }
   }

   public int dx() {
      return this.cb;
   }
}
