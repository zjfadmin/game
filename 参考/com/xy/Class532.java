package com.xy;

import com.xy.formula.ActivityMenuSet2;
import com.xy.formula.FormulaNum;
import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.readbean.Activity;
import com.xy.readbean.ActivityFC;
import com.xy.readbean.ActivityFCBase;
import com.xy.readbean.ActivityFCTarget;
import com.xy.readbean.ActivityRole;
import com.xy.readbean.Goodstable;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.math.BigDecimal;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class Class532 extends Class456 {
   private JScrollPane ahy;
   private Activity ahz;
   private RichLabel lt;
   private Class379[] aia;
   private JLabel[] fb;
   private Class436[] ce;
   private ActivityMenuSet2 fd;
   private Class345 ho;
   private int ay;
   private JComponent aib;
   private int bn;
   private Class44[] px;
   private ActivityFC zz;

   public <undefinedtype> xy(int var1) {
      if (var1 < this.aib.getComponentCount()) {
         return (<undefinedtype>)this.aib.getComponent(var1);
      } else {
         Class44 var2 = new Class44(this.ho) {
            private JLabel rk;

            public void im(String var1) {
               if (!Class394.r(this.rk.getText(), var1)) {
                  this.rk.setText(var1);
               }
            }

            public {
               int var10003 = --4;
               this.rk = Class133.b(var10003, --4, 63 & 106, 15 & 126, Color.white, Class681.ab);
               this.add(this.rk);
            }
         };
         var2.ad(Class44.arv);
         var2.eq(Class511.q("sc/d/4.png", 78 & 55, 78 & 55, 78 & 55, 78 & 55, (boolean)(3 >> 2)));
         this.aib.add(var2);
         return var2;
      }
   }

   public Class532(Class345 var1) {
      int var10001 = --3;
      int var10005 = 3 & 4;
      super();
      this.setLayout((LayoutManager)null);
      this.setBackground(Class681.cu);
      this.setBounds(var10005, 5 >> 3, 20459 & 12791, 7967 & 25326);
      this.ho = var1;
      Class379[] var4 = new Class379[var10001];
      boolean var10003 = true;
      this.aia = var4;

      int var10000;
      int var2;
      Class532 var3;
      for(var10000 = var2 = 5 >> 3; var10000 < this.aia.length; var10000 = var2) {
         if (var2 == 0) {
            var3 = this;
            this.aia[var2] = new Class379("sc/e/31.png", 3 & 5, 121 & 127, Class681.ak, Class681.c, "领取", var1, this);
            this.aia[var2].setBounds(13807 & 19317, 21453 & 11574, 79 & 127, 89 & 63);
         } else if (var2 == 5 >> 2) {
            var3 = this;
            this.aia[var2] = new Class379("sc/e/156.png", 5 >> 2, 127 & 122, var1, this);
            this.aia[var2].setBounds(63 & 122, 16879 & 16060, 54 & 91, 121 & 31);
         } else {
            if (var2 == (1 ^ 3)) {
               this.aia[var2] = new Class379("sc/e/155.png", --1, 127 & 123, var1, this);
               this.aia[var2].setBounds(19967 & 13234, 30205 & 2734, 63 & 82, 25);
            }

            var3 = this;
         }

         var3.add(this.aia[var2++]);
      }

      Class44[] var5 = new Class44[6];
      var10003 = true;
      this.px = var5;

      for(var10000 = var2 = 2 & 5; var10000 < this.px.length; var10000 = var2) {
         this.px[var2] = new Class44(var1);
         this.px[var2].setBounds(70 + var2 * 62, 135, 55, 53);
         this.add(this.px[var2++]);
      }

      this.lt = new RichLabel("", Class681.ab);
      this.add(this.lt);
      JLabel[] var6 = new JLabel[18];
      var10003 = true;
      this.fb = var6;

      for(var10000 = var2 = 3 >> 2; var10000 < this.fb.length; var10000 = var2) {
         if (var2 >= 0 && var2 <= --5) {
            var3 = this;
            this.fb[var2] = Class133.b(70 + 62 * var2, 185, 58, 14, Color.black, Class681.ab);
            this.fb[var2].setHorizontalAlignment(3 ^ 3);
         } else if (var2 >= 6 && var2 <= 11) {
            var3 = this;
            this.fb[var2] = Class133.b(70 + 62 * (var2 - 6), 199, 58, 14, Color.black, Class681.ab);
            this.fb[var2].setHorizontalAlignment(3 >> 2);
         } else if (var2 == 12) {
            var3 = this;
            this.fb[var2] = Class133.b(71, 229, 70, 19, Color.black, Class681.ak);
            this.fb[var2].setText("目标进度");
         } else if (var2 >= 13 && var2 <= 14) {
            var3 = this;
            this.fb[var2] = Class133.b(71 + (var2 - 13) * 140, 261, 70, 19, Color.black, Class681.ab);
         } else if (var2 >= 15 && var2 <= 16) {
            var3 = this;
            this.fb[var2] = Class133.b(133 + (var2 - 15) * 140, 261, 70, 19, Color.black, Class681.al);
         } else {
            if (var2 == 17) {
               this.fb[var2] = Class133.b(68, 300, 373, 21, Color.white, Class681.ak);
               this.fb[var2].setHorizontalAlignment(3 & 4);
               this.fb[var2].setText("目标达成奖励");
            }

            var3 = this;
         }

         var3.add(this.fb[var2++]);
      }

      this.fb[13].setText("当前进度");
      this.fb[14].setText("目标进度");
      this.aib = new JComponent() {
      };
      this.ahy = Class133.f(68, 320, 373, 161, this.aib, 20);
      this.add(this.ahy);
      Class436[] var7 = new Class436[16];
      var10003 = true;
      this.ce = var7;

      for(var10000 = var2 = 3 >> 2; var10000 < this.ce.length; var10000 = var2) {
         this.ce[var2] = new Class436();
         if (var2 == 0) {
            var3 = this;
            this.ce[var2].eq(Class511.q("sc/d/60.png", 80, 5 >> 2, 80, 5 >> 2, (boolean)(5 >> 3)));
            this.ce[var2].setBounds(67, 126, 377, 7);
         } else if (var2 >= (2 ^ 3) && var2 <= --5) {
            var3 = this;
            this.ce[var2].fw("sc/d/120.png");
            this.ce[var2].setBounds(131 + (var2 - (3 >> 1)) * 62, 139, 3 & 5, 47);
         } else if (var2 >= 6 && var2 <= 10) {
            var3 = this;
            this.ce[var2].fw("sc/d/119.png");
            this.ce[var2].setBounds(126 + (var2 - 6) * 62, 192, 12, 14);
         } else if (var2 == 11) {
            var3 = this;
            this.ce[var2].fw("sc/d/121.png");
            this.ce[var2].setBounds(145, 233, 290, 11);
         } else if (var2 == 12) {
            var3 = this;
            this.ce[var2].eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(3 >> 2)));
            this.ce[var2].setBounds(144, 232, 292, 13);
         } else if (var2 == 13) {
            var3 = this;
            this.ce[var2].eq(Class511.q("sc/d/25.png", 1 ^ 3, 1 ^ 3, 1 ^ 3, 1 ^ 3, false));
            this.ce[var2].setBounds(68, 300, 373, 21);
         } else if (var2 == 14) {
            var3 = this;
            this.ce[var2].eq(Class511.q("sc/d/24.png", 5 >> 1, 5 >> 1, 5 >> 1, 5 >> 1, false));
            this.ce[var2].setBounds(68, 300, 373, 183);
         } else {
            if (var2 == 15) {
               this.ce[var2].eq(Class511.q("sc/d/36.png", 20, 20, 20, 20, false));
               this.ce[var2].setBounds(55, 66, 400, 434);
            }

            var3 = this;
         }

         var3.add(this.ce[var2++]);
      }

   }

   public void as(int var1) {
      if (var1 != (121 & 127)) {
         if (var1 == (127 & 122)) {
            if (this.bn > 0) {
               this.y(this.bn - (4 ^ 5));
            }
         } else {
            if (var1 == (123 & 127)) {
               if (this.bn >= this.ay) {
                  return;
               }

               this.y(this.bn + --1);
            }

         }
      } else if (this.zz != null) {
         RoleData var7 = this.ho.vd();
         int var3 = 3 ^ 3;
         Class603 var4 = this.ho.vc();
         ActivityFCBase[] var5 = ((ActivityFCTarget)this.zz.getData()).getGains();

         int var6;
         for(int var10000 = var6 = 5 >> 3; var10000 < var5.length; var10000 = var6) {
            ActivityFCBase var2;
            if ((var2 = var5[var6]).getType() != --1) {
               if (var2.getType() != 5 >> 1) {
                  if (var2.getType() == --3) {
                     ++var3;
                  } else {
                     var2.getType();
                  }
               } else {
                  Goodstable var8 = var4.n(new BigDecimal(var2.getId()));
                  var3 = (int)((long)var3 + (var8 != null && GoodType.ag(var8.getType()) ? 1L : var2.getNum()));
               }
            }

            ++var6;
         }

         if (var7.getGoodPackSum(-1L, new BigDecimal(-4 >> 2), var3) < var3) {
            this.ho.aej.f("你的背包不够");
         } else {
            String var9 = Agreement.getSendTextAES("activity", this.ahz.getId() + "|" + this.zz.getId());
            this.ho.uw().d(var9);
         }
      }
   }

   public void y(int var1) {
      ActivityRole var10 = this.ho.vd().getActivity(this.ahz.getId());
      Class603 var4 = this.ho.vc();
      this.bn = Math.max(2 & 5, Math.min(var1, this.ay));
      var1 = -var1;
      FormulaNum[] var7;
      int var6 = (var7 = this.fd.getBases()).length;

      int var5;
      int var10000;
      for(var10000 = var5 = 3 & 4; var10000 < var6; var10000 = var5) {
         FormulaNum var3;
         int var8 = (var3 = var7[var5]).getSize();
         if (var1 + var8 < 0) {
            var1 += var8;
         } else {
            int var9;
            for(var10000 = var9 = 0; var10000 < var8 && var1 < this.px.length; ++var1) {
               if (var1 >= 0) {
                  int var2 = (int)var3.getZhi(var9);
                  ActivityFCTarget var11 = (ActivityFCTarget)var4.m(var2).getData();
                  long var12 = var10 != null ? var10.getValueByKey(var2) : 0L;
                  this.px[var1].c(31 & 118, var4.cj(var11.getT2()));
                  this.px[var1].gh((long)var2);
                  this.px[var1].fx(var12 > 0L ? "sc/d/117.png" : "sc/d/116.png");
                  String var14;
                  int var16;
                  if ((var16 = (var14 = var4.cj(var11.getT1())).indexOf("|")) == -4 >> 2) {
                     this.fb[var1].setText(var14);
                     this.fb[var1 + (63 & 70)].setText("");
                  } else {
                     this.fb[var1].setText(var14.substring(5 >> 3, var16));
                     this.fb[var1 + (126 & 7)].setText(var14.substring(var16 + (3 >> 1)));
                  }
               }

               ++var9;
               var10000 = var9;
            }
         }

         ++var5;
      }

      int var15;
      for(var10000 = var15 = Math.max(3 & 4, var1); var10000 < this.px.length; var10000 = var15) {
         this.px[var15].q();
         this.fb[var15].setText("");
         int var10001 = var15 + (95 & 38);
         ++var15;
         this.fb[var10001].setText("");
      }

      this.aia[--1].setVisible((boolean)(this.ay > 0 ? 4 ^ 5 : 0));
      this.aia[--2].setVisible((boolean)(this.ay > 0 ? 4 ^ 5 : 0));
   }

   public void q() {
      JScrollBar var1 = this.ahy.getVerticalScrollBar();
      int var10001 = 3 & 4;
      var1.setMaximum(this.aib.getHeight());
      var1.setValue(var10001);
   }

   public void ab(int var1) {
      if (var1 != 0) {
         Class603 var4 = this.ho.vc();
         ActivityRole var3 = this.ho.vd().getActivity(this.ahz.getId());
         this.zz = var4.m(var1);
         ActivityFCTarget var2 = (ActivityFCTarget)this.zz.getData();
         long var5 = 0L;
         Class532 var10000;
         if (var2.getTarget().getType() == (3 & 5)) {
            var5 = var3 != null ? var3.getValueByKey(var2.getTarget().getId()) : 0L;
            var10000 = this;
         } else if (var2.getTarget().getType() == (1 ^ 3)) {
            var10000 = this;
            var5 = (long)this.ho.vd().getTaskSystem().d(var2.getTarget().getId(), --2);
         } else {
            var5 = 0L;
            var10000 = this;
         }

         var10000.fb[63 & 79].setText(String.valueOf(var5));
         this.fb[25 & 118].setText(String.valueOf(var2.getTarget().getNum()));
         double var7 = (double)var5 / (double)var2.getTarget().getNum();
         long var9 = var3 != null ? var3.getValueByKey(var1) : 0L;
         double var17;
         if (var9 > 0L) {
            var17 = var7;
            this.aia[3 ^ 3].setBtn(5 >> 3);
            this.aia[3 ^ 3].setText("已领取");
         } else if (var5 >= var2.getTarget().getNum()) {
            this.aia[3 >> 2].setBtn(--1);
            var17 = var7;
            this.aia[3 ^ 3].setText("领取");
         } else {
            this.aia[5 >> 3].setBtn(3 >> 2);
            var17 = var7;
            this.aia[5 >> 3].setText("未达成");
         }

         var7 = var17 * 290.0D;
         var7 = Math.min(290.0D, var7);
         var7 = Math.max(0.0D, var7);
         int var10001 = 2 & 5;
         this.ce[59 & 79].setBounds(19163 & 13749, 17129 & 15871, (int)var7, 43 & 95);
         var1 = var10001;
         int var12 = 21501 & 11626;
         int var11 = 3 & 4;
         ActivityFCBase[] var13 = var2.getGains();

         int var6;
         int var19;
         for(var19 = var6 = 3 >> 2; var19 < var13.length; var19 = var6) {
            label72: {
               <undefinedtype> var14 = this.xy(var1);
               ActivityFCBase var8;
               <undefinedtype> var20;
               if ((var8 = var13[var6]).getType() == (4 ^ 5)) {
                  Class223 var15 = this.ahz.getPointKey(var8.getId());
                  var14.c(126 & 23, var8.getNum() + (var15 != null ? var15.a : "未知积分"));
                  var20 = var14;
                  var14.ach(Class222.i("903"));
                  var14.im("");
               } else if (var8.getType() == (1 ^ 3)) {
                  Goodstable var16;
                  if ((var16 = var4.n(new BigDecimal(var8.getId()))) == null) {
                     break label72;
                  }

                  var20 = var14;
                  var14.c(5 >> 2, var16);
                  var14.im(String.valueOf(var8.getNum()));
               } else if (var8.getType() == --3) {
                  var20 = var14;
                  var14.c(31 & 118, "随机奖励");
                  var14.ach(Class222.i("903"));
                  var14.im("");
               } else {
                  if (var8.getType() != --4) {
                     break label72;
                  }

                  var20 = var14;
                  var14.c(23 & 126, var8.getNum() + var8.getKey());
                  var14.ach(Class222.i("903"));
                  var14.im("");
               }

               var20.setBounds(15 + var1 % (23 & 110) * (122 & 61), (86 & 61) + var1 / (102 & 31) * (124 & 59), 115 & 62, 115 & 62);
               var10001 = var1 / 6;
               ++var1;
               var11 = 90 + var10001 * 56;
            }

            ++var6;
         }

         for(var19 = var6 = var1; var19 < this.aib.getComponentCount(); var19 = var6) {
            this.aib.getComponent(var6++).setVisible((boolean)(3 & 4));
         }

         this.aib.setPreferredSize(new Dimension(var12, var11));
         this.q();
      }
   }

   public void cs(Activity var1, ActivityMenuSet2 var2) {
      this.ahz = var1;
      this.fd = var2;
      ActivityRole var14 = this.ho.vd().getActivity(var1.getId());
      String var3 = this.ho.vc().cj(var2.getT1());
      this.lt.setTextSize(var3, 4606 & 28541);
      this.lt.setBounds(102 & 93, 119 & 79, this.lt.getWidth(), this.lt.getHeight());
      int var16 = 3 ^ 3;
      int var4 = 2 & 5;
      int var5 = 3 & 4;
      FormulaNum[] var8;
      int var7 = (var8 = var2.getBases()).length;

      int var6;
      for(int var10000 = var6 = 3 >> 2; var10000 < var7; var10000 = var6) {
         FormulaNum var15;
         int var9 = (var15 = var8[var6]).getSize();

         int var10;
         for(var10000 = var10 = 2 & 5; var10000 < var9; var10000 = var10) {
            int var11 = (int)var15.getZhi(var10);
            long var12 = var14 != null ? var14.getValueByKey(var11) : 0L;
            if (var16 == 0 || var12 == 0L && var16 == 0) {
               var4 = var5 + var10;
               var16 = var11;
            }

            ++var10;
         }

         ++var6;
         var5 += var9;
      }

      this.ay = var5 > this.px.length ? var5 - this.px.length : 0;
      this.y(Math.min(this.ay, var4));
      this.ab(var16);
   }
}
