package com.xy;

import com.xy.bean.SuitOperBean;
import com.xy.game.RoleData;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.JLabel;

public class Class588 extends Class345 {
   private Class282[] azl;
   private RichLabel z;
   private Class436[] cs;
   private Class282[] adh;
   private Class489 ahl;
   private BigDecimal ne;
   private JLabel[] ly;
   private Class245 abf;

   public void s() {
      ArrayList var1 = new ArrayList();

      int var2;
      for(int var10000 = var2 = 5 >> 3; var10000 < this.azl.length; var10000 = var2) {
         if (this.azl[var2].tp() != 0) {
            var1.add(new BigDecimal(this.azl[var2].tp()));
         }

         ++var2;
      }

      if (var1.size() == --2) {
         SuitOperBean var4 = new SuitOperBean();
         var4.setType(127 & 111);
         var4.setGoods(var1);
         String var3 = Agreement.getSendTextAES("suitoperate", Class695.b().toJson(var4));
         this.uw().d(var3);
      }
   }

   public void q() {
      this.d();
      super.q();
   }

   public void un(Class282 var1, MouseEvent var2) {
      int var3 = 3 >> 2;

      int var4;
      for(int var10000 = var4 = 3 & 4; var10000 < this.azl.length; var10000 = var4) {
         if (this.azl[var4] == var1) {
            var3 = 1;
         }

         ++var4;
      }

      if (var3 != 0) {
         if (var2.getButton() == --3 && var1.tp() != 0) {
            var1.alb(3 ^ 3, (Class603)null);
         }
      } else {
         long var8 = this.apr(var1.tp());
         long var6 = this.vd().getPackRecord().getStarSoulType(var1.tp()) / 10000L;
         if (var8 < var6) {
            if ((var1 = this.uo(var1.tp())) != null) {
               var1.gh(1L);
            }
         }
      }
   }

   public Class282 uo(int var1) {
      Class282 var2 = null;

      int var3;
      for(int var10000 = var3 = 3 & 4; var10000 < this.azl.length; var10000 = var3) {
         if (this.azl[var3].tp() == 0 && var2 == null) {
            var2 = this.azl[var3];
         }

         ++var3;
      }

      if (var2 == null) {
         var2 = this.azl[--1];
      }

      if (var2 != null) {
         var2.alb(var1, this.vc());
      }

      return var2;
   }

   public void d() {
      RoleData var1 = this.vd();

      int var10000;
      int var2;
      for(var10000 = var2 = 3 >> 2; var10000 < this.adh.length; var10000 = var2) {
         long var3 = var1.getPackRecord().getStarSoulType(this.adh[var2].tp()) / 10000L;
         this.adh[var2++].gh(var3);
      }

      for(var10000 = var2 = 2 & 5; var10000 < this.azl.length; var10000 = var2) {
         Class282 var5 = this.azl[var2];
         ++var2;
         var5.alb(3 >> 2, (Class603)null);
      }

   }

   public long apr(int var1) {
      long var2 = 0L;

      int var4;
      for(int var10000 = var4 = 3 >> 2; var10000 < this.azl.length; var10000 = var4) {
         if (this.azl[var4].tp() == var1) {
            ++var2;
         }

         ++var4;
      }

      return var2;
   }

   public Class588(GameView var1) {
      int var10001 = 5 >> 1;
      int var10010 = -1 & -2;
      super(4091 & 28815, 5 >> 1, Class345.aef, var1);
      this.ne = new BigDecimal(1000000);
      this.va(var10010, 3 >> 2, 31230 & 1919, 23535 & 9727, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 102 & 93, 102 & 93, 102 & 93, 102 & 93, (boolean)(3 ^ 3)), "重炼");
      this.z = new RichLabel("", Class681.ab);
      this.z.setTextSize("#c000000重炼后，随机生成一颗更高级的星魂或同级星魂。", 15295 & 17772);
      this.z.setBounds(125 & 58, 9054 & 24063, this.z.getWidth(), this.z.getHeight());
      this.add(this.z);
      this.ahl = new Class489("sc/e/7.png", 3 >> 1, 39 & 123, Class681.ak, Class681.c, "重炼", this);
      this.ahl.setBounds(30510 & 2527, 16379 & 16831, 127 & 59, 27 & 125);
      this.add(this.ahl);
      JLabel[] var6 = new JLabel[var10001];
      boolean var10003 = true;
      this.ly = var6;

      int var4;
      int var10000;
      for(var10000 = var4 = 3 & 4; var10000 < this.ly.length; var10000 = var4) {
         this.ly[var4] = Class133.c(63 & 111, 63 & 82, 5564 & 27503, 19, 10, Class681.c("#c000000"), Class681.ak);
         this.ly[var4].setText(var4 == 0 ? "只能使用两颗同级星魂进行重炼。" : (var4 == --1 ? "消耗金钱" : ""));
         this.add(this.ly[var4]);
         if (var4 == --1) {
            this.ly[var4].setBounds(84, 446, 72, 19);
         }

         ++var4;
      }

      var10001 = 5 >> 1;
      this.abf = Class133.a(156, 446, 104, 19, 10, Color.white, Class681.q);
      this.abf.eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(3 & 4)));
      this.add(this.abf);
      Class681.j(this.abf, this.ne.longValue());
      Class282[] var7 = new Class282[var10001];
      var10003 = true;
      this.azl = var7;

      for(var10000 = var4 = 3 ^ 3; var10000 < this.azl.length; var10000 = var4) {
         this.azl[var4] = new Class282(2 & 5, (Image)null, (boolean)(2 ^ 3), (Class603)null, this);
         this.azl[var4].setBounds(86 + var4 * 67, 377, 51, 51);
         this.add(this.azl[var4++]);
      }

      Class436[] var8 = new Class436[9];
      var10003 = true;
      this.cs = var8;

      for(var10000 = var4 = 3 >> 2; var10000 < this.cs.length; var10000 = var4) {
         this.cs[var4] = new Class436();
         this.add(this.cs[var4]);
         if (var4 == 0) {
            this.cs[var4].eq(Class511.q("sc/d/19.png", --5, --5, --5, --5, (boolean)(3 >> 2)));
            this.cs[var4].setBounds(46, 37, 309, 309);
         } else if (var4 >= 3 >> 1 && var4 <= --3) {
            this.cs[var4].fw("sc/d/4.png");
            if (var4 != 5 >> 2 && var4 != (1 ^ 3)) {
               if (var4 == --3) {
                  this.cs[var4].setBounds(269, 373, 59, 57);
               }
            } else {
               this.cs[var4].setBounds(83 + (var4 - --1) * 67, 374, 59, 57);
            }
         } else if (var4 >= --4 && var4 <= 6) {
            this.cs[var4].fw("sc/d/30.png");
            if (var4 != --4 && var4 != --5) {
               if (var4 == 6) {
                  this.cs[var4].setBounds(270, 430, 58, 3 >> 1);
               }
            } else {
               this.cs[var4].setBounds(84 + (var4 - --4) * 67, 431, 58, 2 ^ 3);
            }
         } else if (var4 == 7) {
            this.cs[var4].fw("sc/d/73.png");
            this.cs[var4].setBounds(224, 383, 34, 38);
         } else if (var4 == 8) {
            this.cs[var4].eq(Class511.q("sc/d/36.png", 20, 20, 20, 20, (boolean)(3 & 4)));
            this.cs[var4].setBounds(46, 345, 310, 130);
         }

         ++var4;
      }

      Class603 var5 = this.vc();
      Image var2 = Class511.a("sc/d/18.png");
      var7 = new Class282[36];
      var10003 = true;
      this.adh = var7;

      int var3;
      for(var10000 = var3 = 3 >> 2; var10000 < this.adh.length; var10000 = var3) {
         this.adh[var3] = new Class282(var3 + --1, var2, true, var5, this);
         this.adh[var3].setBounds(47 + var3 % 6 * 51, 39 + var3 / 6 * 51, 51, 51);
         this.add(this.adh[var3++]);
      }

   }
}
