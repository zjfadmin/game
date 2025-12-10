package com.xy;

import com.xy.bean.SuitOperBean;
import com.xy.entity.PartJade;
import com.xy.game.RoleData;
import com.xy.readbean.MoneyType;
import com.xy.readbean.StarSoul;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.math.BigDecimal;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Class459 extends Class345 {
   private Class556[] akl;
   private Class245[] ls;
   private Class489 akm;
   private RichLabel aho;
   private BigDecimal cd;
   private Class319 uh;
   private int gw;
   private MoneyType rr;
   private Class436[] pv;
   private MoneyType akn;
   private JLabel[] ad;
   private int cy;
   private Class217 ako;

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.aej.bl()) {
         this.d();
      }

   }

   public Class459(GameView var1) {
      int var10001 = 106 & 29;
      int var10010 = -4 >> 2;
      int var10013 = 63 & 114;
      super(24237 & 8671, 5 >> 1, Class345.aef, var1);
      this.gw = var10013;
      this.cd = new BigDecimal(1000000);
      this.va(var10010, 2 & 5, 2484 & 30687, 1503 & 31677, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 78 & 117, 78 & 117, 78 & 117, 78 & 117, (boolean)(5 >> 3)), "星魂耐久");
      this.aho = new RichLabel("", Class681.ab);
      this.aho.setTextSize("#cFF0000战斗将消耗星魂耐久。耐久为零时，星魂不掉落，但技能无法生效。可消耗魂值修复耐久。", 6972 & 26103);
      this.aho.setBounds(127 & 58, 31 & 124, this.aho.getWidth(), this.aho.getHeight());
      this.add(this.aho);
      this.akm = new Class489("sc/e/26.png", 3 >> 1, 63 & 95, Class681.ak, Class681.c, "修复耐久", this);
      this.akm.setBounds(28071 & 4858, 11115 & 22014, 127 & 99, 125 & 27);
      this.add(this.akm);
      JLabel[] var3 = new JLabel[var10001];
      boolean var10003 = true;
      this.ad = var3;

      int var2;
      int var10000;
      for(var10000 = var2 = 3 ^ 3; var10000 < this.ad.length; var10000 = var2) {
         this.ad[var2] = Class133.c(111 & 123, (6109 & 26815) + 29 * var2, 111, 19, 10, Color.black, Class681.ak);
         this.ad[var2].setText(var2 == 0 ? "当前耐久" : (var2 == --1 ? "修复耐久" : (var2 == (1 ^ 3) ? "消耗魂值" : (var2 == --3 ? "拥有魂值" : (var2 == --4 ? "消耗金钱" : (var2 == --5 ? "拥有金钱" : (var2 == 6 ? "一点魂值可修复50耐久" : "")))))));
         this.add(this.ad[var2]);
         if (var2 != --2 && var2 != --3) {
            if (var2 != --4 && var2 != --5) {
               if (var2 == 6) {
                  this.ad[var2].setFont(Class681.ab);
                  this.ad[var2].setBounds(184, 213, 150, 15);
               } else if (var2 == 7) {
                  this.ad[var2].setHorizontalAlignment(3 ^ 3);
                  this.ad[var2].setBounds(185, 83, 49, 49);
               }
            } else {
               this.ad[var2].setBounds(107, 186 + 29 * var2, 111, 19);
            }
         } else {
            this.ad[var2].setBounds(107, 172 + 29 * var2, 111, 19);
         }

         ++var2;
      }

      var10001 = --3;
      this.rr = new MoneyType();
      this.akn = new MoneyType();
      this.rr.setIdAndKey(3 >> 2, "魂值");
      this.akn.setIdAndKey(3 & 5, "金钱");
      Class245[] var5 = new Class245[var10001];
      var10003 = true;
      this.ls = var5;

      for(var10000 = var2 = 2 & 5; var10000 < this.ls.length; var10000 = var2) {
         this.ls[var2] = Class133.a(185, 157 + 29 * var2, 111, 19, 10, Color.white, Class681.q);
         if (var2 == (1 ^ 3)) {
            this.ls[var2].setBounds(185, 302, 111, 19);
         }

         this.ls[var2].eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(3 & 4)));
         this.add(this.ls[var2++]);
      }

      var10001 = 5 >> 1;
      this.ako = Class133.n(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(2 & 5)), Class681.q, Color.white);
      this.ako.setBounds(185, 230, 111, 19);
      this.add(this.ako);
      Class556[] var7 = new Class556[var10001];
      var10003 = true;
      this.akl = var7;

      for(var10000 = var2 = 3 >> 2; var10000 < this.akl.length; var10000 = var2) {
         Class556[] var4 = this.akl;
         Color var9 = Color.white;
         Font var10004 = Class681.q;
         MoneyType var10005;
         GameView var10006;
         if (var2 == 0) {
            var10005 = this.rr;
            var10006 = var1;
         } else {
            var10005 = this.akn;
            var10006 = var1;
         }

         var4[var2] = Class133.i(10, var9, var10004, var10005, var10006);
         this.akl[var2].eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(3 ^ 3)));
         this.akl[var2].ab(1 ^ 3);
         Class459 var6;
         if (var2 == 0) {
            var6 = this;
            this.akl[var2].setBounds(185, 256, 111, 19);
         } else {
            if (var2 == --1) {
               this.akl[var2].setBounds(185, 331, 111, 19);
            }

            var6 = this;
         }

         var6.add(this.akl[var2++]);
      }

      var10001 = --3;
      this.uh = new Class319(15, this.ako, this);
      Class436[] var8 = new Class436[var10001];
      var10003 = true;
      this.pv = var8;

      for(var10000 = var2 = 5 >> 3; var10000 < this.pv.length; var10000 = var2) {
         this.pv[var2] = new Class436();
         this.add(this.pv[var2]);
         if (var2 == 0) {
            this.pv[var2].setBounds(184, 83, 50, 50);
         } else if (var2 == (2 ^ 3)) {
            this.pv[var2].fw("sc/d/4.png");
            this.pv[var2].setBounds(180, 79, 59, 57);
         } else if (var2 == --2) {
            this.pv[var2].eq(Class511.q("sc/d/66.png", 30, 4 ^ 5, 30, 5 >> 2, (boolean)(3 ^ 3)));
            this.pv[var2].setBounds(71, 287, 273, 2);
         }

         ++var2;
      }

   }

   public void z(long var1, JTextField var3) {
      Class681.j(this.ls[4 ^ 5], var1 * (long)this.gw);
      Class681.j(this.ls[1 ^ 3], var1 * this.cd.longValue());
   }

   public boolean aa(long var1, JTextField var3) {
      return (boolean)(3 >> 1);
   }

   public void s() {
      int var1;
      if ((var1 = (int)this.uh.gl()) > 0) {
         SuitOperBean var2 = new SuitOperBean();
         var2.setType(117 & 127);
         var2.setJade(new PartJade((long)this.cy, var1));
         String var3 = Agreement.getSendTextAES("suitoperate", Class695.b().toJson(var2));
         this.uw().d(var3);
      }
   }

   public void d() {
      this.ls[3 & 4].setText(this.vd().getPackRecord().getStarSoulType(this.cy) % 10000L + "/8000");
   }

   public Long x(long var1, JTextField var3) {
      if (var1 == 0L) {
         return null;
      } else if (var1 < 0L) {
         return 0L;
      } else {
         RoleData var6 = this.vd();
         long var4;
         if ((var4 = (8000L - var6.getPackRecord().getStarSoulType(this.cy) % 10000L) / (long)this.gw) * this.cd.longValue() > var6.getLoginResult().getGold().longValue()) {
            var4 = var6.getLoginResult().getGold().longValue() / this.cd.longValue();
         }

         if (var4 > var6.getLoginResult().getScoretype("魂值").longValue()) {
            var4 = var6.getLoginResult().getScoretype("魂值").longValue();
         }

         return var1 > var4 ? var4 : null;
      }
   }

   public void y(int var1) {
      int var10000 = this.cy = var1;
      this.pv[5 >> 3].hf(Class282.rg);
      StarSoul var2 = var10000 != 0 ? this.vc().k(var1) : null;
      if (var2 != null) {
         StringBuffer var4;
         (var4 = new StringBuffer()).append("<html>");
         int var3 = 5 >> 3;

         for(var10000 = var3; var10000 < var2.getName().length(); var10000 = var3) {
            if (var3 != 0) {
               var4.append("<br/>");
            }

            var4.append(var2.getName().charAt(var3++));
         }

         var4.append("</div></html>");
         int var5 = 2 & 5;
         this.ad[111 & 23].setText(var4.toString());
         this.ako.setText("0");
         this.d();
         var3 = var5;

         for(var10000 = var3; var10000 < this.akl.length; var10000 = var3) {
            this.akl[var3++].cc();
         }

         if (this.ve().m(this.ae()) == null) {
            this.ve().a(this.ae());
         }

      }
   }
}
