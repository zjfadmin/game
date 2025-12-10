package com.xy;

import com.xy.bean.SuitOperBean;
import com.xy.entity.PartJade;
import com.xy.formula.MsgUntil;
import com.xy.game.RoleData;
import com.xy.readbean.MoneyType;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.math.BigDecimal;
import javax.swing.JLabel;

public class Class37 extends Class345 {
   private BigDecimal ahf = new BigDecimal(this.uw().n(1 ^ 3, 93 & 46) ? 500000 : 5000000);
   private Class614 ahk;
   private Class245 acf;
   private Class556 hw;
   private JLabel[] ai;
   private Class44 qm;
   private Class245[] jc;
   private Class489 ahl;
   private Class436[] e;
   private MoneyType ahm;
   private Class436 ih;

   public Class37(GameView var1) {
      super(-4 >> 2, -4 >> 2, Class345.aei, var1);
      int var10001 = 61 & 75;
      this.va(46 & 127, 111 & 90, 14314 & 18943, 14845 & 18350, Class345.aei);
      this.ih = new Class436();
      this.ih.setBounds(15 & 122, 487 & 32509, 25 & 119, 25 & 119);
      this.add(this.ih);
      this.ahl = new Class489("sc/e/31.png", --1, --4, Class681.ak, Class681.c, "升 级", this);
      this.ahl.setBounds(14655 & 18427, 1014 & 32111, 79 & 127, 89 & 63);
      this.add(this.ahl);
      this.ahk = new Class614(this, this.ih);
      this.ahk.ce().setBounds(15 & 124, 126 & 31, 18107 & 14812, 195);
      this.add(this.ahk.ce());
      this.ahk.by().setBounds(174, 30, 305, 198);
      this.add(this.ahk.by());
      JLabel[] var4 = new JLabel[var10001];
      boolean var10003 = true;
      this.ai = var4;

      int var10000;
      int var2;
      Class37 var3;
      for(var10000 = var2 = 3 >> 2; var10000 < this.ai.length; var10000 = var2) {
         this.ai[var2] = Class133.c(55, 83, 155, 21, 3 & 4, Class681.c("#cFFFFFF"), Class681.ak);
         this.ai[var2].setText(var2 == 0 ? "套装列表" : (var2 == (2 ^ 3) ? "选择玉符" : (var2 == (1 ^ 3) ? "只显示已有玉符" : (var2 == --3 ? "品质" : (var2 == --4 ? "个数" : (var2 == --5 ? "消耗金钱" : (var2 == 6 ? "拥有金钱" : (var2 == 7 ? "还需要  个玉符" : (var2 == 8 ? "66" : "")))))))));
         if (var2 == (4 ^ 5)) {
            var3 = this;
            this.ai[var2].setBounds(218, 83, 307, 21);
         } else if (var2 == 5 >> 1) {
            var3 = this;
            this.ai[var2].setFont(Class681.bu);
            this.ai[var2].setForeground(Class681.c("#c000000"));
            this.ai[var2].setHorizontalAlignment(10);
            this.ai[var2].setBounds(74, 303, 136, 17);
         } else if (var2 >= --3 && var2 <= --4) {
            var3 = this;
            this.ai[var2].setForeground(Class681.c("#c000000"));
            this.ai[var2].setBounds(239, 352 + (var2 - --3) * 26, 37, 19);
         } else if (var2 >= --5 && var2 <= 6) {
            var3 = this;
            this.ai[var2].setForeground(Class681.c("#c000000"));
            this.ai[var2].setBounds(160, 422 + (var2 - --5) * 26, 72, 19);
         } else {
            if (var2 >= 7 && var2 <= 8) {
               this.ai[var2].setFont(Class681.ab);
               this.ai[var2].setForeground(Class681.c("#c000000"));
               this.ai[var2].setBounds(349, 380, 99, 15);
               if (var2 == 8) {
                  this.ai[var2].setForeground(Class681.c("#cFF0000"));
               }
            }

            var3 = this;
         }

         var3.ai[var2].setBounds(this.ai[var2].getX() - 46, this.ai[var2].getY() - 74, this.ai[var2].getWidth(), this.ai[var2].getHeight());
         this.add(this.ai[var2++]);
      }

      Class245[] var5 = new Class245[1 ^ 3];
      var10003 = true;
      this.jc = var5;

      for(var10000 = var2 = 5 >> 3; var10000 < this.jc.length; var10000 = var2) {
         this.jc[var2] = Class133.a(233, 352 + 26 * var2 - 74, 64, 19, 10, Color.white, Class681.q);
         this.jc[var2].eq(Class511.q("sc/d/17.png", --3, --3, --3, --3, (boolean)(3 >> 2)));
         this.add(this.jc[var2++]);
      }

      this.ahm = new MoneyType();
      this.ahm.setIdAndKey(4 ^ 5, "现 金");
      this.hw = Class133.m(189, 374, 108, 19, 10, Color.white, Class681.q, this.ahm, var1);
      this.hw.eq(Class511.q("sc/d/17.png", --3, --3, --3, --3, (boolean)(5 >> 3)));
      this.hw.ab(2);
      this.acf = Class133.a(189, 348, 108, 19, 10, Color.white, Class681.q);
      this.acf.eq(Class511.q("sc/d/17.png", 3, 3, 3, 3, (boolean)(3 ^ 3)));
      this.add(this.acf);
      this.add(this.hw);
      this.qm = new Class44(this);
      this.qm.setBounds(125, 276, 50, 50);
      this.add(this.qm);
      Class436[] var6 = new Class436[6];
      var10003 = true;
      this.e = var6;

      for(var10000 = var2 = 3 >> 2; var10000 < this.e.length; var10000 = var2) {
         this.e[var2] = new Class436();
         if (var2 == 0) {
            var3 = this;
            this.e[var2].eq(Class511.q("sc/d/25.png", 2, 2, 2, 2, (boolean)(5 >> 3)));
            this.e[var2].setBounds(55, 83, 155, 21);
         } else if (var2 == (3 & 5)) {
            var3 = this;
            this.e[var2].eq(Class511.q("sc/d/24.png", 2, 2, 2, 2, (boolean)(3 & 4)));
            this.e[var2].setBounds(55, 83, 155, 218);
         } else if (var2 == 2) {
            var3 = this;
            this.e[var2].eq(Class511.q("sc/d/25.png", 2, 2, 2, 2, (boolean)(3 & 4)));
            this.e[var2].setBounds(218, 83, 307, 21);
         } else if (var2 == 3) {
            var3 = this;
            this.e[var2].eq(Class511.q("sc/d/24.png", 2, 2, 2, 2, (boolean)(3 & 4)));
            this.e[var2].setBounds(218, 83, 307, 219);
         } else if (var2 == 4) {
            var3 = this;
            this.e[var2].fw("sc/d/4.png");
            this.e[var2].setBounds(167, 346, 59, 57);
         } else {
            if (var2 == 5) {
               this.e[var2].eq(Class511.q("sc/d/33.png", 30, 30, 30, 30, (boolean)(2 & 5)));
               this.e[var2].setBounds(57, 327, 467, 158);
            }

            var3 = this;
         }

         var3.e[var2].setBounds(this.e[var2].getX() - 46, this.e[var2].getY() - 74, this.e[var2].getWidth(), this.e[var2].getHeight());
         this.add(this.e[var2++]);
      }

      Class681.j(this.acf, this.ahf.longValue());
   }

   public void p() {
      this.qm.c(3 & 4, (Object)null);
      this.d();
      this.hw.cc();
      this.ahk.d();
   }

   public Class614 xi() {
      return this.ahk;
   }

   public void s() {
      PartJade var1;
      if ((var1 = (PartJade)this.qm.hr()) == null) {
         this.aej.fw("请选择你要升级的玉符..");
      } else {
         RoleData var5 = this.vd();
         int var3 = (int)this.qm.gl();
         if (this.ahf.compareTo(var5.getLoginResult().getGold()) > 0) {
            this.aej.fw("金币不足..");
         } else {
            int var4;
            if ((var4 = MsgUntil.o(var3)) > var1.getJade(var3)) {
               this.aej.fw("你所需的玉符数量不足..");
            } else {
               SuitOperBean var2 = new SuitOperBean();
               PartJade var6 = new PartJade(var1.getSuitid(), var1.getPartId());
               var6.setJade(var3, var4);
               var2.setType(--4);
               var2.setJade(var6);
               String var7 = Agreement.getSendTextAES("suitoperate", Class695.b().toJson(var2));
               this.uw().d(var7);
               var1.b(var3, 4 ^ 5);
               var5.getLoginResult().setGold(var5.getLoginResult().getGold().subtract(this.ahf));
               this.qm.c(3 & 4, (Object)null);
               this.d();
               this.aej.fw("消耗了" + var4 + "个" + MsgUntil.s(var3) + "玉符..");
               this.aej.fw("消耗了" + this.ahf.longValue() / 10000L + "W金币..");
            }
         }
      }
   }

   public void d() {
      PartJade var1;
      int var2;
      if ((var1 = (PartJade)this.qm.hr()) != null) {
         int var4;
         int var3 = MsgUntil.o(var4 = var1.getJade(var2 = (int)this.qm.gl()));
         this.jc[3 ^ 3].setText(MsgUntil.s(var2));
         this.jc[2 ^ 3].setText(String.valueOf(var4));
         this.ai[10 & 125].setText(var4 >= var3 ? "0" : String.valueOf(var3 - var4));
      } else {
         for(int var10000 = var2 = 3 & 4; var10000 < this.jc.length; var10000 = var2) {
            this.jc[var2++].setText((String)null);
         }

         this.ai[57 & 78].setText("");
      }
   }

   public Class44 u() {
      return this.qm;
   }
}
