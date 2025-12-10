package com.xy;

import com.xy.bean.SuitOperBean;
import com.xy.game.RoleData;
import com.xy.readbean.StarSoul;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.JLabel;

public class Class391 extends Class345 {
   private Class282[] adf;
   private Class489 adg;
   private Class282[] adh;
   private RichLabel bv;
   private JLabel[] ad;
   private Class436[] an;
   private Class245 abf;

   public void un(Class282 var1, MouseEvent var2) {
      int var4 = 3 ^ 3;

      int var3;
      for(int var10000 = var3 = 3 & 4; var10000 < this.adh.length; var10000 = var3) {
         if (this.adh[var3] == var1) {
            var4 = 1;
         }

         ++var3;
      }

      if (var4 != 0) {
         if (var2.getButton() == --3 && var1.tp() != 0) {
            var1.alb(3 & 4, this.vc());
            this.s();
            this.p();
         }
      } else {
         long var5;
         if ((var5 = this.vd().getPackRecord().getStarSoulType(var1.tp()) / 10000L) != 0L) {
            if ((var1 = this.uo(var1.tp())) != null) {
               long var7;
               if ((var7 = (long)var1.ae()) < var5) {
                  if (var2.getButton() == 3 >> 1) {
                     var5 = var7 + 1L;
                  }

                  var1.gh(var5);
                  this.p();
               }
            }
         }
      }
   }

   public Class282 uo(int var1) {
      Class282 var2 = null;

      int var3;
      for(int var10000 = var3 = 5 >> 3; var10000 < this.adh.length; var10000 = var3) {
         if (this.adh[var3].tp() == var1) {
            return this.adh[var3];
         }

         if (this.adh[var3].tp() == 0 && var2 == null) {
            var2 = this.adh[var3];
         }

         ++var3;
      }

      if (var2 != null) {
         var2.alb(var1, this.vc());
      }

      return var2;
   }

   public void o() {
      RoleData var1 = this.vd();

      int var10000;
      int var2;
      for(var10000 = var2 = 2 & 5; var10000 < this.adf.length; var10000 = var2) {
         long var3 = var1.getPackRecord().getStarSoulType(this.adf[var2].tp()) / 10000L;
         this.adf[var2++].gh(var3);
      }

      for(var10000 = var2 = 3 & 4; var10000 < this.adh.length; var10000 = var2) {
         Class282 var5 = this.adh[var2];
         ++var2;
         var5.alb(3 >> 2, (Class603)null);
      }

      this.p();
   }

   public void p() {
      long var1 = 0L;

      int var3;
      for(int var10000 = var3 = 3 >> 2; var10000 < this.adh.length; var10000 = var3) {
         StarSoul var4 = this.adh[var3].tp() != 0 ? this.vc().k(this.adh[var3].tp()) : null;
         if (var4 != null) {
            var1 += Long.parseLong(var4.getValue()) * (long)this.adh[var3].ae();
         }

         ++var3;
      }

      Class681.j(this.abf, var1);
   }

   public Class391(GameView var1) {
      int var10001 = 5 >> 1;
      int var10009 = -3 & -1;
      super(27804 & 5103, --2, Class345.aef, var1);
      this.va(var10009, 3 ^ 3, 29567 & 3582, 32229 & 1023, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 86 & 109, 86 & 109, 86 & 109, 86 & 109, (boolean)(3 >> 2)), "转化");
      this.bv = new RichLabel("", Class681.ab);
      this.bv.setTextSize("#c000000提示：左键点击选中1个，右键点击选中1组。", 18303 & 14844);
      this.bv.setBounds(124 & 51, 10207 & 22907, this.bv.getWidth(), this.bv.getHeight());
      this.add(this.bv);
      this.adg = new Class489("sc/e/7.png", 5 >> 2, 62 & 99, Class681.ak, Class681.c, "转化", this);
      this.adg.setBounds(11709 & 21327, 4542 & 28659, 59 & 127, 57 & 95);
      this.add(this.adg);
      JLabel[] var6 = new JLabel[var10001];
      boolean var10003 = true;
      this.ad = var6;

      int var4;
      int var10000;
      for(var10000 = var4 = 2 & 5; var10000 < this.ad.length; var10000 = var4) {
         this.ad[var4] = Class133.c(111 & 63, 122 & 23, 6394 & 26573, 19, 10, Class681.c("#c000000"), Class681.ak);
         this.ad[var4].setText(var4 == 0 ? "请选择要转化的星魂：" : (var4 == (4 ^ 5) ? "可获得魂值" : ""));
         this.add(this.ad[var4]);
         if (var4 == (4 ^ 5)) {
            this.ad[var4].setBounds(65, 437, 88, 19);
         }

         ++var4;
      }

      var10001 = --2;
      this.abf = Class133.a(154, 437, 104, 19, 10, Color.white, Class681.q);
      this.abf.eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(3 ^ 3)));
      this.add(this.abf);
      Class436[] var7 = new Class436[var10001];
      var10003 = true;
      this.an = var7;

      for(var10000 = var4 = 3 >> 2; var10000 < this.an.length; var10000 = var4) {
         this.an[var4] = new Class436();
         this.add(this.an[var4]);
         if (var4 == 0) {
            this.an[var4].eq(Class511.q("sc/d/19.png", --5, --5, --5, --5, (boolean)(3 ^ 3)));
            this.an[var4].setBounds(46, 37, 309, 309);
         } else if (var4 == --1) {
            this.an[var4].eq(Class511.q("sc/d/19.png", --5, --5, --5, --5, (boolean)(2 & 5)));
            this.an[var4].setBounds(45, 372, 309, 54);
         }

         ++var4;
      }

      Class603 var5 = this.vc();
      Image var2 = Class511.a("sc/d/18.png");
      Class282[] var8 = new Class282[36];
      var10003 = true;
      this.adf = var8;

      int var3;
      for(var10000 = var3 = 3 ^ 3; var10000 < this.adf.length; var10000 = var3) {
         this.adf[var3] = new Class282(var3 + --1, var2, (boolean)(5 >> 2), var5, this);
         this.adf[var3].setBounds(47 + var3 % 6 * 51, 39 + var3 / 6 * 51, 51, 51);
         this.add(this.adf[var3++]);
      }

      var8 = new Class282[6];
      var10003 = true;
      this.adh = var8;

      for(var10000 = var3 = 2 & 5; var10000 < this.adh.length; var10000 = var3) {
         this.adh[var3] = new Class282(5 >> 3, var2, (boolean)(3 >> 1), var5, this);
         this.adh[var3].setBounds(46 + var3 % 6 * 51, 374 + var3 / 6 * 51, 51, 51);
         this.add(this.adh[var3++]);
      }

   }

   public void s() {
      int var1;
      for(int var10000 = var1 = 5 >> 3; var10000 < this.adh.length - (2 ^ 3); var10000 = var1) {
         int var2;
         if (this.adh[var1].tp() == 0) {
            for(var10000 = var2 = var1 + (4 ^ 5); var10000 < this.adh.length; var10000 = var2) {
               if (this.adh[var2].tp() != 0) {
                  this.adh[var1].alb(this.adh[var2].tp(), this.vc());
                  this.adh[var1].gh((long)this.adh[var2].ae());
                  this.adh[var2].alb(3 >> 2, this.vc());
                  break;
               }

               ++var2;
            }
         }

         ++var1;
      }

   }

   public void d() {
      ArrayList var1 = new ArrayList();

      int var2;
      for(int var10000 = var2 = 3 ^ 3; var10000 < this.adh.length; var10000 = var2) {
         if (this.adh[var2].tp() != 0) {
            BigDecimal var3 = new BigDecimal(this.adh[var2].tp());
            int var4;
            int var5;
            if ((var4 = this.adh[var2].ae()) != 0) {
               for(var10000 = var5 = 0; var10000 < var4; var10000 = var5) {
                  ++var5;
                  var1.add(var3);
               }
            }
         }

         ++var2;
      }

      if (var1.size() != 0) {
         SuitOperBean var6 = new SuitOperBean();
         var6.setType(118 & 121);
         var6.setGoods(var1);
         String var7 = Agreement.getSendTextAES("suitoperate", Class695.b().toJson(var6));
         this.uw().d(var7);
      }
   }

   public void q() {
      this.o();
      super.q();
   }
}
