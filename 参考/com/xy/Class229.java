package com.xy;

import com.xy.bean.QualityClBean;
import com.xy.formula.ExpUtil;
import com.xy.formula.GoodType;
import com.xy.readbean.Goodstable;
import com.xy.readbean.Skill;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class Class229 extends Class345 {
   private Class529[] ah;
   private JScrollPane o;
   private RichLabel aj;
   private Class436[] pv;
   private RichLabel bv;
   private JLabel[] ad;
   private QualityClBean aqq;
   private JScrollPane af;

   public void ua(String var1, int var2) {
      String[] var11 = var1.split("&");
      double var3;
      int var5 = (int)(var3 = Double.parseDouble(var11[1 ^ 3]));
      double var6 = var3 - (double)var5;
      long var8 = ExpUtil.d(Long.parseLong(var11[--3]));
      Skill var10 = this.vc().bf(var11[2 ^ 3]);
      int var10000;
      if (var2 == 0) {
         var10000 = 2 & 5;
         this.ad[--2].setText(var10.getSkillname() + "(" + var3 + ")");
         this.bv.setTextSize(Class270.ry("#G" + var10.getRemark(), var10, var11[1 ^ 3], String.valueOf(var8)), 27295 & 5617);

         for(var2 = var10000; var10000 < 5; var10000 = var2) {
            if (var2 + (3 & 5) <= var5) {
               this.pv[(5 >> 1) + var2].fw("sc/c/83");
            } else {
               this.pv[--2 + var2].fw("sc/c/84");
            }

            ++var2;
         }

         if (var5 != --5) {
            if (var6 < 0.2D) {
               this.pv[(1 ^ 3) + var5].fw("sc/c/84");
            } else if (var6 > 0.8D) {
               this.pv[(5 >> 1) + var5].fw("sc/c/83");
            } else {
               this.pv[(1 ^ 3) + var5].fw("sc/c/82");
            }
         }
      } else {
         this.ad[--3].setText(var10.getSkillname() + "(" + var3 + ")");
         this.aj.setTextSize(Class270.ry("#G" + var10.getRemark(), var10, var11[1 ^ 3], String.valueOf(var8)), 28345 & 4567);

         for(var10000 = var2 = 3 >> 2; var10000 < 5; var10000 = var2) {
            if (var2 + (3 & 5) <= var5) {
               this.pv[(103 & 31) + var2].fw("sc/c/83");
            } else {
               this.pv[(111 & 23) + var2].fw("sc/c/84");
            }

            ++var2;
         }

         if (var5 != --5) {
            if (var6 < 0.2D) {
               this.pv[(71 & 63) + var5].fw("sc/c/84");
            } else if (var6 > 0.8D) {
               this.pv[(79 & 55) + var5].fw("sc/c/83");
            } else {
               this.pv[(23 & 111) + var5].fw("sc/c/82");
            }
         }
      }
   }

   public void y(int var1) {
      if (var1 == (29884 & 3071)) {
         this.aqq = null;
         this.ve().n(this.ae());
      } else {
         if (var1 == (20413 & 12543)) {
            if (this.aqq == null) {
               return;
            }

            Goodstable var2;
            if ((var2 = this.vd().getGood(this.aqq.getRgid())) == null) {
               return;
            }

            var2.setValue(GoodType.o(var2.getValue().split("\\|"), --5, this.aqq.getNewAttr()));
            String var3 = Agreement.getSendTextAES("extrattroper", Class695.b().toJson(this.aqq));
            this.uw().d(var3);
            this.aqq = null;
            this.ve().n(this.ae());
         }

      }
   }

   public void ay(QualityClBean var1) {
      this.aqq = var1;
   }

   public Class229(GameView var1) {
      int var10001 = 5 >> 1;
      int var10004 = 5 >> 3;
      int var10008 = -4 >> 2;
      super(126 & 95, 1 ^ 3, Class345.aef, var1);
      this.va(var10008, 3 & 4, 9726 & 23519, 31041 & 2046, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 126 & 69, 126 & 69, 126 & 69, 126 & 69, (boolean)(3 >> 2)), "技能觉醒");
      this.ak((boolean)var10004);
      this.ad(new Class116(30 & 111, 2 & 5, 2 & 5, 53 & 111));
      Class529[] var4 = new Class529[var10001];
      boolean var10003 = true;
      this.ah = var4;

      int var2;
      int var10000;
      for(var10000 = var2 = 3 ^ 3; var10000 < this.ah.length; var10000 = var2) {
         Class529[] var3 = this.ah;
         Class529 var10002 = new Class529;
         int var10005 = 3 & 5;
         int var10006 = (31487 & 1468) + var2;
         Font var10007 = Class681.ak;
         Color[] var8 = Class681.c;
         String var10009;
         Class229 var10010;
         if (var2 == 0) {
            var10009 = "保留原技能";
            var10010 = this;
         } else if (var2 == 3 >> 1) {
            var10009 = "替换新技能";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var10002.<init>("sc/e/26.png", var10005, var10006, var10007, var8, var10009, var10010);
         var3[var2] = var10002;
         this.ah[var2].setBounds((123 & 103) + (15599 & 17370) * var2, 10751 & 22254, 111 & 115, 89 & 63);
         this.add(this.ah[var2++]);
      }

      JLabel[] var5 = new JLabel[94 & 43];
      var10003 = true;
      this.ad = var5;

      for(var10000 = var2 = 5 >> 3; var10000 < this.ad.length; var10000 = var2) {
         this.ad[var2] = Class133.c((63 & 127) + (var2 - (1 ^ 3)) % (1 ^ 3) * (4811 & 28158), (126 & 63) + (var2 - (5 >> 1)) / (5 >> 1) * 27, 170, 28, 10, Class681.c("#cFFFFFF"), Class681.q);
         this.ad[var2].setText(var2 == 0 ? "原觉醒技" : (var2 == 5 >> 2 ? "新觉醒技" : (var2 == 5 >> 1 ? "技能名(4.9)" : (var2 == --3 ? "技能名(5.0)" : (var2 != --4 && var2 != --5 ? "" : "觉醒度")))));
         this.add(this.ad[var2]);
         if (var2 == 0) {
            this.ad[var2].setForeground(Color.white);
            this.ad[var2].setFont(Class681.cw);
            this.ad[var2].setBounds(72, 32, 110, 23);
         }

         if (var2 == --1) {
            this.ad[var2].setForeground(Color.green);
            this.ad[var2].setFont(Class681.bd);
            this.ad[var2].setBounds(274, 32, 110, 23);
         }

         ++var2;
      }

      this.bv = new RichLabel("", Class681.ce);
      this.aj = new RichLabel("", Class681.ce);
      this.o = Class133.f(59, 118, 181, 100, this.bv, 30);
      this.add(this.o);
      this.af = Class133.f(261, 118, 181, 100, this.aj, 30);
      this.add(this.af);
      Class436[] var6 = new Class436[20];
      var10003 = true;
      this.pv = var6;

      for(var10000 = var2 = 5 >> 3; var10000 < this.pv.length; var10000 = var2) {
         this.pv[var2] = new Class436();
         this.add(this.pv[var2]);
         if (var2 >= 0 && var2 <= --1) {
            this.pv[var2].fw("sc/d/34.png");
            this.pv[var2].setBounds(57 + 202 * var2, 32, 180, 23);
         } else if (var2 >= (1 ^ 3) && var2 <= 11) {
            if (var2 >= --2 && var2 <= 6) {
               this.pv[var2].setBounds(115 + 22 * (var2 - (1 ^ 3)), 94, 15, 16);
            } else if (var2 >= 7 && var2 <= 11) {
               this.pv[var2].setBounds(317 + 22 * (var2 - 7), 94, 15, 16);
            }
         } else if (var2 >= 12 && var2 <= 17) {
            this.pv[var2].eq(Class511.q("sc/d/24.png", 1 ^ 3, 1 ^ 3, 1 ^ 3, 1 ^ 3, (boolean)(5 >> 3)));
            if (var2 >= 12 && var2 <= 15) {
               this.pv[var2].setBounds(57 + (var2 - 12) % (5 >> 1) * 202, 62 + (var2 - 12) / 2 * 27, 180, 28);
            } else if (var2 >= 16 && var2 <= 17) {
               this.pv[var2].setBounds(57 + (var2 - 16) * 202, 116, 180, 104);
            }
         } else if (var2 >= 18 && var2 <= 19) {
            this.pv[var2].eq(Class511.q("sc/d/33.png", 20, 20, 30, 30, (boolean)(3 ^ 3)));
            this.pv[var2].setBounds(47 + 202 * (var2 - 18), 24, 203, 209);
         }

         ++var2;
      }

   }
}
