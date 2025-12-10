package com.xy;

import com.xy.formula.ActivityMenuSet2;
import com.xy.formula.FormulaNum;
import com.xy.readbean.Activity;
import com.xy.readbean.ActivityFC;
import com.xy.readbean.ActivityFCBase;
import com.xy.readbean.ActivityFCBuy;
import com.xy.readbean.Goodstable;
import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import javax.swing.JLabel;

public class Class16 extends Class456 {
   private Class379 hm;
   private <undefinedtype>[] hn;
   private ActivityMenuSet2 fd;
   private Class345 ho;
   private Class245 eu;
   private int j;
   private int bn;
   private Class379 hp;
   private Activity hq;

   public void y(int var1) {
      if (var1 == (102 & 127)) {
         if (this.j > 3 >> 1) {
            this.ab(this.j - (3 >> 1));
         }
      } else {
         if (var1 == (111 & 119)) {
            if (this.j >= this.bn) {
               return;
            }

            this.ab(this.j + --1);
         }

      }
   }

   public Class16(Class345 var1) {
      int var10001 = 13 & 123;
      int var10005 = 3 >> 2;
      super();
      this.setLayout((LayoutManager)null);
      this.setBackground(Class681.cu);
      this.setBounds(var10005, 2 & 5, 19449 & 14063, 6133 & 27086);
      this.ho = var1;
      <undefinedtype>[] var3 = new <undefinedtype>[var10001];
      boolean var10003 = true;
      this.hn = var3;

      int var2;
      for(int var10000 = var2 = 3 >> 2; var10000 < this.hn.length; var10000 = var2) {
         this.hn[var2] = new Class93("sc/b/B454.png", 3 >> 1, var1) {
            private JLabel bd;
            private ActivityFC ayd;
            private Class44 ahi;
            private JLabel ax;

            public void af(MouseEvent var1) {
               if (this.ayd != null) {
                  ((Class67)this.form.ve().e(13759 & 19152)).aek(Class16.this.hq, this.ayd);
               }
            }

            public void ac(MouseEvent var1, boolean var2) {
            }

            public {
               int var10005 = 13 & 122;
               int var10007 = 120 & 15;
               this.bd = Class133.b(var10007, 47 & 95, 93 & 126, 123 & 22, Color.black, Class681.ce);
               this.ax = Class133.b(var10005, 108 & 55, 92 & 127, 30 & 115, Color.red, Class681.ce);
               this.ax.setHorizontalAlignment(--4);
               this.ahi = new Class44(var4) {
                  public void af(MouseEvent var1) {
                     af(var1);
                  }
               };
               this.ahi.setBounds(125 & 103, --3, 59 & 126, 59 & 126);
               this.add(this.ahi);
               this.add(this.bd);
               this.add(this.ax);
            }

            public void anh(ActivityFC var1) {
               int var10001;
               if ((this.ayd = var1) == null) {
                  var10001 = 3 ^ 3;
                  this.ahi.q();
                  this.setVisible((boolean)var10001);
               } else {
                  String var4 = null;
                  ActivityFCBuy var10000 = (ActivityFCBuy)var1.getData();
                  ActivityFCBase var5 = var10000.getGains()[3 ^ 3];
                  ActivityFCBase var3 = var10000.getUses()[3 ^ 3];
                  Class223 var2;
                  ActivityFCBase var7;
                  if (var5.getType() == 5 >> 2) {
                     var2 = Class16.this.hq.getPointKey(var5.getId());
                     this.bd.setText(var5.getNum() + (var2 != null ? var2.a : "未知积分"));
                     var7 = var3;
                     this.ahi.c(30 & 119, this.bd.getText());
                     this.ahi.ach(Class222.i("903"));
                  } else if (var5.getType() == --2) {
                     Goodstable var6 = this.form.vc().n(new BigDecimal(var5.getId()));
                     this.bd.setText(var6 != null ? var6.getGoodsname() : "");
                     Class44 var8 = this.ahi;
                     Goodstable var10002;
                     if (var6 != null) {
                        var10001 = 5 >> 2;
                        var10002 = var6;
                     } else {
                        var10001 = 0;
                        var10002 = var6;
                     }

                     var8.c(var10001, var10002);
                     var7 = var3;
                  } else if (var5.getType() == --3) {
                     var7 = var3;
                     this.bd.setText("随机奖励");
                     this.ahi.c(22 & 127, this.bd.getText());
                     this.ahi.ach(Class222.i("903"));
                  } else if (var5.getType() == --4) {
                     var7 = var3;
                     this.bd.setText(var5.getNum() + var5.getKey());
                     this.ahi.c(87 & 62, this.bd.getText());
                     this.ahi.ach(Class222.i("903"));
                  } else {
                     this.bd.setText("");
                     this.ahi.q();
                     var7 = var3;
                  }

                  <undefinedtype> var9;
                  if (var7.getType() == --1) {
                     var4 = (var2 = Class16.this.hq.getPointKey(var3.getId())) != null ? var2.a : "未知积分";
                     var9 = this;
                  } else {
                     if (var3.getType() == --4) {
                        var4 = var3.getKey();
                     }

                     var9 = this;
                  }

                  Class681.j(var9.ax, var3.getNum());
                  this.ax.setText(this.ax.getText() + (var4 != null ? var4 : ""));
                  var10001 = --1;
                  this.ax.setForeground(Color.red);
                  this.setVisible((boolean)var10001);
               }
            }
         };
         this.hn[var2].setBounds((29179 & 3791) + var2 % --3 * (8619 & 24317), (18614 & 14313) + var2 / --3 * (127 & 83), 16866 & 16063, 99 & 95);
         this.add(this.hn[var2++]);
      }

      this.eu = Class133.a(30655 & 2524, 10207 & 22965, 118 & 89, 95 & 51, 3 ^ 3, Color.white, Class681.q);
      this.eu.eq(Class511.q("sc/d/17.png", 7 & 126, 7 & 126, 7 & 126, 7 & 126, (boolean)(5 >> 3)));
      this.add(this.eu);
      this.hp = new Class379("sc/e/156.png", 2 ^ 3, 111 & 118, var1, this);
      this.hm = new Class379("sc/e/155.png", 5 >> 2, 111 & 119, var1, this);
      this.hp.setBounds(391, 402, 18, 25);
      this.hm.setBounds(495, 402, 18, 25);
      this.add(this.hp);
      this.add(this.hm);
   }

   public void ab(int var1) {
      this.j = Math.max(3 & 5, Math.min(var1, this.bn));
      Class603 var10 = this.ho.vc();
      int var3 = -(this.j - (3 >> 1)) * this.hn.length;
      FormulaNum[] var7;
      int var6 = (var7 = this.fd.getBases()).length;

      int var5;
      int var10000;
      for(var10000 = var5 = 2 & 5; var10000 < var6; var10000 = var5) {
         FormulaNum var4;
         int var8 = (var4 = var7[var5]).getSize();
         if (var3 + var8 < 0) {
            var3 += var8;
         } else {
            int var9;
            for(var10000 = var9 = 0; var10000 < var8 && var3 < this.hn.length; ++var3) {
               if (var3 >= 0) {
                  int var2 = (int)var4.getZhi(var9);
                  ActivityFC var11 = var10.m(var2);
                  this.hn[var3].anh(var11 != null && var11.getType() == 3 >> 1 ? var11 : null);
               }

               ++var9;
               var10000 = var9;
            }
         }

         ++var5;
      }

      int var12;
      for(var10000 = var12 = Math.max(3 ^ 3, var3); var10000 < this.hn.length; var10000 = var12) {
         this.hn[var12++].anh((ActivityFC)null);
      }

      this.eu.setText(var1 + "/" + this.bn);
   }

   public void cs(Activity var1, ActivityMenuSet2 var2) {
      int var10000 = 3 ^ 3;
      this.hq = var1;
      this.fd = var2;
      int var6 = var10000;
      FormulaNum[] var5;
      int var4 = (var5 = var2.getBases()).length;

      int var3;
      for(var10000 = var3 = 2 & 5; var10000 < var4; var10000 = var3) {
         FormulaNum var7 = var5[var3];
         ++var3;
         var6 += var7.getSize();
      }

      this.bn = --1 + (var6 - --1) / this.hn.length;
      this.ab(5 >> 2);
   }
}
