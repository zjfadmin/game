package com.xy;

import com.xy.bean.SuitOperBean;
import com.xy.entity.PartJade;
import com.xy.formula.GoodType;
import com.xy.formula.MsgUntil;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.JLabel;

public class Class401 extends Class345 {
   private BigDecimal cd;
   private Class44[] nt;
   private Class350 pt;
   private Class436[] cs;
   private Class614 ava;
   private Class489 ahl;
   private Class245 yl;
   private JLabel[] ly;
   private Class436 ih;

   public Class614 xi() {
      return this.ava;
   }

   public Class401(GameView var1) {
      int var10001 = --5;
      int var10007 = 47 & 126;
      super(-4 >> 2, -4 >> 2, Class345.aei, var1);
      this.cd = new BigDecimal(100000);
      this.va(var10007, 79 & 122, 23547 & 9710, 15854 & 17341, Class345.aei);
      this.ih = new Class436();
      this.ih.setBounds(107 & 30, 8183 & 24813, 123 & 21, 123 & 21);
      this.add(this.ih);
      this.ahl = new Class489("sc/e/31.png", 4 ^ 5, 4 ^ 5, Class681.ak, Class681.c, "合 成", this);
      this.ahl.setBounds(54 & 121, 8189 & 24963, 95 & 111, 121 & 31);
      this.add(this.ahl);
      this.ava = new Class614(this, this.ih);
      this.ava.ce().setBounds(110 & 29, 127 & 30, 26843 & 6076, 6143 & 26819);
      this.add(this.ava.ce());
      this.ava.by().setBounds(3839 & 29102, 30, 305, 198);
      this.add(this.ava.by());
      JLabel[] var6 = new JLabel[var10001];
      boolean var10003 = true;
      this.ly = var6;

      int var4;
      Class401 var5;
      int var10000;
      for(var10000 = var4 = 2 & 5; var10000 < this.ly.length; var10000 = var4) {
         this.ly[var4] = Class133.c(55, 83, 155, 21, 3 >> 2, Class681.c("#cFFFFFF"), Class681.ak);
         this.ly[var4].setText(var4 == 0 ? "套装列表" : (var4 == --1 ? "选择玉符" : (var4 == --2 ? "选择装备" : (var4 == --3 ? "只显示已有玉符" : (var4 == --4 ? "消耗金钱" : "")))));
         if (var4 == 5 >> 2) {
            var5 = this;
            this.ly[var4].setBounds(218, 83, 307, 21);
         } else if (var4 == --2) {
            var5 = this;
            this.ly[var4].setBounds(218, 306, 307, 21);
         } else if (var4 == --3) {
            var5 = this;
            this.ly[var4].setFont(Class681.bu);
            this.ly[var4].setForeground(Class681.c("#c000000"));
            this.ly[var4].setHorizontalAlignment(10);
            this.ly[var4].setBounds(74, 303, 136, 17);
         } else {
            if (var4 == --4) {
               this.ly[var4].setForeground(Class681.c("#c000000"));
               this.ly[var4].setBounds(51, 404, 79, 19);
            }

            var5 = this;
         }

         var5.ly[var4].setBounds(this.ly[var4].getX() - 46, this.ly[var4].getY() - 74, this.ly[var4].getWidth(), this.ly[var4].getHeight());
         this.add(this.ly[var4++]);
      }

      var10001 = 5 >> 1;
      this.yl = Class133.a(83, 330, 79, 19, 2 & 5, Color.white, Class681.q);
      this.yl.eq(Class511.q("sc/d/17.png", --3, --3, --3, --3, (boolean)(2 & 5)));
      this.add(this.yl);
      Class44[] var7 = new Class44[var10001];
      var10003 = true;
      this.nt = var7;

      for(var10000 = var4 = 2 & 5; var10000 < this.nt.length; var10000 = var4) {
         this.nt[var4] = new Class44(this);
         this.nt[var4].setBounds(68 + var4 * 79 - 46, 263, 50, 50);
         this.add(this.nt[var4++]);
      }

      Class436[] var8 = new Class436[10];
      var10003 = true;
      this.cs = var8;

      for(var10000 = var4 = 2 & 5; var10000 < this.cs.length; var10000 = var4) {
         this.cs[var4] = new Class436();
         this.add(this.cs[var4]);
         if (var4 == 0) {
            var5 = this;
            this.cs[var4].eq(Class511.q("sc/d/25.png", 1 ^ 3, 1 ^ 3, 1 ^ 3, 1 ^ 3, (boolean)(3 & 4)));
            this.cs[var4].setBounds(55, 83, 155, 21);
         } else if (var4 == (3 & 5)) {
            var5 = this;
            this.cs[var4].eq(Class511.q("sc/d/24.png", 5 >> 1, 5 >> 1, 5 >> 1, 5 >> 1, (boolean)(2 & 5)));
            this.cs[var4].setBounds(55, 83, 155, 218);
         } else if (var4 >= --2 && var4 <= --3) {
            var5 = this;
            this.cs[var4].fw("sc/d/4.png");
            this.cs[var4].setBounds(64 + (var4 - (5 >> 1)) * 79, 333, 59, 57);
         } else if (var4 >= --4 && var4 <= 5) {
            var5 = this;
            this.cs[var4].fw("sc/d/30.png");
            this.cs[var4].setBounds(65 + (var4 - 4) * 79, 390, 58, --1);
         } else if (var4 == 6) {
            var5 = this;
            this.cs[var4].eq(Class511.q("sc/d/25.png", 2, 2, 2, 2, (boolean)(3 ^ 3)));
            this.cs[var4].setBounds(218, 83, 307, 21);
         } else if (var4 == 7) {
            var5 = this;
            this.cs[var4].eq(Class511.q("sc/d/24.png", 2, 2, 2, 2, (boolean)(3 & 4)));
            this.cs[var4].setBounds(218, 83, 307, 219);
         } else if (var4 != 8) {
            if (var4 == 9) {
               this.cs[var4].eq(Class511.q("sc/d/25.png", 2, 2, 2, 2, false));
               this.cs[var4].setBounds(218, 306, 307, 21);
            }

            var5 = this;
         } else {
            this.cs[var4].eq(Class511.q("sc/d/19.png", 2, 2, 2, 2, (boolean)(3 ^ 3)));
            this.cs[var4].setBounds(217, 326, 309, 156);
            Class216[] var10 = new Class216[2];
            boolean var9 = true;
            Class216[] var2 = var10;

            int var3;
            for(var10000 = var3 = 3 ^ 3; var10000 < var2.length; var10000 = var3) {
               if (var3 == 0) {
                  var2[var3] = new Class216("sc/e/42.png", --1, 3 & 4, this);
                  var10000 = var3;
               } else {
                  var2[var3] = new Class216("sc/e/43.png", 3 >> 1, 3 >> 1, this);
                  var10000 = var3;
               }

               if (var10000 == 0) {
                  var5 = this;
                  var2[var3].setBounds(422, 408, 18, 18);
               } else {
                  var2[var3].setBounds(452, 408, 18, 18);
                  var5 = this;
               }

               var5.add(var2[var3++]);
            }

            var5 = this;
            this.pt = new Class350(1, this, 6, 3, 51, 51, 0, 0, 172, 254);
            this.pt.hf(Class511.a("sc/d/18.png"));
            this.pt.aix(var2, 1);
            this.add(this.pt);
         }

         var5.cs[var4].setBounds(this.cs[var4].getX() - 46, this.cs[var4].getY() - 74, this.cs[var4].getWidth(), this.cs[var4++].getHeight());
      }

      Class681.j(this.yl, this.cd.longValue());
   }

   public Class44[] iu() {
      return this.nt;
   }

   public void s() {
      RoleData var1 = this.vd();
      Goodstable var2;
      if ((var2 = (Goodstable)this.nt[2 & 5].hr()) != null) {
         var2 = var1.getGood(var2.getRgid());
      }

      PartJade var3 = (PartJade)this.nt[4 ^ 5].hr();
      if (var2 != null && var3 != null) {
         int var4 = (int)this.nt[5 >> 2].gl();
         if (this.cd.compareTo(var1.getLoginResult().getGold()) > 0) {
            this.aej.fw("金币不足..");
         } else if (var2.getGoodlock() == (4 ^ 5)) {
            this.aej.fw("该物品已被加锁");
         } else {
            int var5 = GoodType.ai(var2.getType());
            if (var3.getPartId() == (31 & 107)) {
               if (var5 != (26 & 111)) {
                  this.aej.fw("装备类型和玉符不一致..");
                  return;
               }
            } else if (var5 != var3.getPartId()) {
               this.aej.fw("装备类型和玉符不一致..");
               return;
            }

            SuitOperBean var10 = new SuitOperBean();
            ArrayList var6;
            (var6 = new ArrayList()).add(var2.getRgid());
            PartJade var8 = new PartJade(var3.getSuitid(), var3.getPartId());
            var8.setJade(var4, 5 >> 2);
            var10.setType(3 ^ 3);
            var10.setGoods(var6);
            var10.setJade(var8);
            String var9 = Agreement.getSendTextAES("suitoperate", Class695.b().toJson(var10));
            int var10001 = 5 >> 3;
            this.uw().d(var9);
            var3.b(var4, 3 & 5);
            var1.getLoginResult().setGold(var1.getLoginResult().getGold().subtract(this.cd));
            int var7 = var10001;

            for(int var10000 = var7; var10000 < this.nt.length; var10000 = var7) {
               Class44 var11 = this.nt[var7];
               ++var7;
               var11.c(5 >> 3, (Object)null);
            }

            this.aej.fw("消耗了一个" + MsgUntil.s(var4) + "玉符..");
            this.aej.fw("消耗了10W金币..");
         }
      } else {
         this.aej.fw("请准备要合成的装备和玉符。");
      }
   }

   public void d() {
      int var1;
      for(int var10000 = var1 = 5 >> 3; var10000 < this.nt.length; var10000 = var1) {
         Class44 var2 = this.nt[var1];
         ++var1;
         var2.c(3 & 4, (Object)null);
      }

      this.pt.aiz().i(5 >> 3);
      this.ava.d();
   }
}
