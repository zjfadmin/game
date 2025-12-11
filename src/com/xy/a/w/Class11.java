package com.xy.a.w;

import com.xy.bean.LoginResult;
import com.xy.i.Class18;
import com.xy.i.Class20;
import com.xy.q.Class49;
import com.xy.text.GameView;
import java.awt.Color;
import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.JLabel;

public class Class11 extends com.xy.q.Class30 {
   private BigDecimal ee;
   private com.xy.i.Class20[] ph;
   private com.xy.w.Class18[] ar;
   private com.xy.q.Class14[] dv;
   private JLabel[] o;
   private com.xy.i.Class20 pi;

   public void h() {
      LoginResult var2;
      this.i((var2 = this.yx().getLoginResult()).getExperience());
      int var3 = com.xy.v.Class4.s(var2.getGrade());
      String var10002 = "Z";
      int var4 = var2.getExtraPointInt("F");
      com.xy.q.Class14 var10000 = this.dv[1];
      StringBuilder var10001 = new StringBuilder(String.valueOf(var3));
      var10002 = "绋";
      var10000.setText(var10001.append("级").toString());
      int var5 = 0;
      Class11 var8;
      if (var3 < 150) {
         var3 = 30;
         var5 = 6;
         var8 = this;
      } else {
         var5 = var3 - 144;
         var3 = (var3 - 144) * 5;
         var8 = this;
      }

      var8.dv[2].setText(String.valueOf(var5));
      com.xy.q.Class14 var11 = this.dv[0];
      StringBuilder var10003 = new StringBuilder().append(var2.getXiuwei());
      String var10004 = "3";
      var11.setText(var10003.append("/").append(var3).toString());
      com.xy.q.Class14 var9 = this.dv[3];
      StringBuilder var12 = new StringBuilder(String.valueOf(var4));
      String var13 = "Cl\\";
      var9.setText(var12.append("/40").toString());
      this.dv[4].setText(String.valueOf(var4 + 1));
   }

   @Override
   public void l() {
      this.h();
      super.l();
   }

   public void i(BigDecimal var1) {
      BigDecimal var2 = var1.divide(this.ee, 2, RoundingMode.HALF_DOWN);
      String var10004 = "-#.";
      BigDecimal var3 = var2.multiply(new BigDecimal("152"));
      Class11 var10000;
      if (var2.compareTo(new BigDecimal(0)) <= 0) {
         var10000 = this;
         this.ar[0].setSize(1, 15);
      } else if (var2.compareTo(new BigDecimal(1)) <= 0) {
         var10000 = this;
         this.ar[0].setSize(var3.intValue(), 15);
      } else {
         var10000 = this;
         this.ar[0].setSize(152, 15);
      }

      var10000.o[8].setText(var1.toString());
   }

   public Class11(GameView var1) {
      super(81, 2, com.xy.q.Class30.afz, var1);
      String var10008 = "e\u007f9x9-8lx{";
      String var10014 = "]h\\h\\h\\h\\h\\";
      this.ee = new BigDecimal("10000000000");
      this.yy(-1, 0, 332, 407, com.xy.q.Class30.agh);
      com.xy.w.Class9 var34 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10009 = "輴挎纗髠";
      this.yu(var34, "转换经验");
      var10009 = "ou3s3#/8lx{";
      var10014 = "尲恿烕";
      this.pi = new com.xy.i.Class20("sc/e/53.png", 2, 0, Class49.ck, null, "属性点", this);
      this.pi.setBounds(53, 249, 109, 24);
      this.pi.setKeep(true);
      this.add(this.pi);
      this.ph = new com.xy.i.Class20[3];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.ph.length; var10000 = var2) {
         com.xy.i.Class20[] var6 = this.ph;
         String var10004 = "e\u007f9y9+8lx{";
         int var10006 = 321 + var2;
         Class11 var10010;
         if (var2 == 0) {
            var10009 = "輴挎";
            var10009 = "转换";
            var10010 = this;
         } else if (var2 == 1) {
            var10009 = "卑纻";
            var10009 = "升级";
            var10010 = this;
         } else if (var2 == 2) {
            var10009 = "儉挎";
            var10009 = "兑换";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         Class20 var10002 = new Class20("sc/e/7.png", 1, var10006, Class49.ch, Class49.bv, var10009, var10010);
         var6[var2] = var10002;
         Class11 var7;
         if (var2 == 0) {
            var7 = this;
            this.ph[var2].setBounds(230, 62, 59, 25);
         } else {
            if (var2 == 1 || var2 == 2) {
               this.ph[var2].setBounds(147, 184 + (var2 - 1) * 158, 59, 25);
            }

            var7 = this;
         }

         var7.add(this.ph[var2++]);
      }

      this.dv = new com.xy.q.Class14[5];

      for (int var8 = var2 = 0; var8 < this.dv.length; var8 = var2) {
         this.dv[var2] = com.xy.q.Class1.i(0, 0, 0, 0, 10, Color.white, Class49.w);
         com.xy.q.Class14 var9 = this.dv[var2];
         String var10001 = "ou3r3'+8lx{";
         var9.mt(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false));
         Class11 var10;
         if (var2 == 0) {
            var10 = this;
            this.dv[var2].setBounds(148, 66, 74, 19);
         } else if (var2 == 1) {
            var10 = this;
            this.dv[var2].setBounds(194, 131, 84, 19);
         } else if (var2 == 2) {
            var10 = this;
            this.dv[var2].setBounds(194, 155, 84, 19);
         } else if (var2 == 3) {
            var10 = this;
            this.dv[var2].setBounds(201, 286, 68, 19);
         } else {
            if (var2 == 4) {
               this.dv[var2].setBounds(201, 311, 68, 19);
            }

            var10 = this;
         }

         var10.add(this.dv[var2++]);
      }

      this.o = new JLabel[9];

      for (int var11 = var2 = 0; var11 < this.o.length; var11 = ++var2) {
         var10008 = "{\u000fh\\h\\h\\";
         this.o[var2] = com.xy.q.Class1.f(56, 34, 72, 19, 0, Class49.c("#c000000"), Class49.ch);
         JLabel var12 = this.o[var2];
         String var16;
         if (var2 == 0) {
            var16 = "彅剑给骐";
            var16 = "当前经验";
         } else if (var2 == 1) {
            var16 = "抉村侂乢烕";
            var16 = "拥有修为点";
         } else if (var2 == 2) {
            var16 = "京牵卑纻";
            var16 = "人物升级";
         } else if (var2 == 3) {
            var16 = "弋刡仢爅笑绋";
            var16 = "当前人物等级";
         } else if (var2 == 4) {
            var16 = "卛纱扜霖俲丬炥";
            var16 = "升级所需修为点";
         } else if (var2 == 5) {
            var16 = "儽挺尲恿烕厒漰肥尲恿烕";
            var16 = "兑换属性点及潜能属性点";
         } else if (var2 == 6) {
            var16 = "巤免捴层怱炥";
            var16 = "已兑换属性点";
         } else if (var2 == 7) {
            var16 = "儽挺戬靘侂乢烕";
            var16 = "兑换所需修为点";
         } else {
            var16 = "";
         }

         var12.setText(var16);
         this.add(this.o[var2]);
         if (var2 == 0) {
            this.o[var2].setBounds(56, 34, 72, 19);
         } else if (var2 == 1) {
            this.o[var2].setBounds(56, 66, 87, 19);
         } else if (var2 == 2) {
            this.o[var2].setBounds(56, 94, 72, 19);
         } else if (var2 == 3) {
            this.o[var2].setBounds(88, 131, 103, 19);
         } else if (var2 == 4) {
            this.o[var2].setBounds(69, 155, 122, 19);
         } else if (var2 == 5) {
            this.o[var2].setBounds(56, 230, 190, 19);
         } else if (var2 == 6) {
            this.o[var2].setBounds(61, 286, 103, 19);
         } else if (var2 == 7) {
            this.o[var2].setBounds(59, 311, 120, 19);
         } else if (var2 == 8) {
            this.o[var2].setHorizontalAlignment(10);
            this.o[var2].setForeground(Color.white);
            this.o[var2].setFont(Class49.w);
            this.o[var2].setBounds(138, 34, 150, 19);
         }
      }

      this.ar = new com.xy.w.Class18[6];

      for (int var13 = var2 = 0; var13 < this.ar.length; var13 = var2) {
         this.ar[var2] = new com.xy.w.Class18();
         Class11 var14;
         if (var2 == 0) {
            var14 = this;
            com.xy.w.Class18 var28 = this.ar[var2];
            String var10003 = "ou3r3 +8lx{";
            var28.mt(com.xy.w.Class16.m("sc/d/67.png", 2, 2, 2, 2, false));
            this.ar[var2].setBounds(135, 36, 156, 15);
         } else if (var2 == 1) {
            var14 = this;
            com.xy.w.Class18 var29 = this.ar[var2];
            String var33 = "\u001f;C<Ci[v\u001c6\u000b";
            var29.mt(com.xy.w.Class16.m("sc/d/17.png", 2, 2, 2, 2, false));
            this.ar[var2].setBounds(133, 34, 160, 19);
         } else {
            label172: {
               if (var2 >= 2 && var2 <= 3) {
                  com.xy.w.Class18 var25 = this.ar[var2];
                  String var31 = "ou3r3 *8lx{";
                  var25.mt(com.xy.w.Class16.m("sc/d/66.png", 30, 1, 30, 1, false));
                  if (var2 == 2) {
                     var14 = this;
                     this.ar[var2].setBounds(132, 102, 169, 2);
                     break label172;
                  }

                  if (var2 == 3) {
                     var14 = this;
                     this.ar[var2].setBounds(246, 237, 65, 2);
                     break label172;
                  }
               } else if (var2 >= 4 && var2 <= 5) {
                  com.xy.w.Class18 var24 = this.ar[var2];
                  String var30 = "\u001f;C<CkZv\u001c6\u000b";
                  var24.mt(com.xy.w.Class16.m("sc/d/36.png", 20, 20, 20, 20, false));
                  this.ar[var2].setBounds(51, 115 + (var2 - 4) * 158, 250, 110);
               }

               var14 = this;
            }
         }

         var14.add(this.ar[var2++]);
      }
   }
}
