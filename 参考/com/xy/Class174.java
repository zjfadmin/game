package com.xy;

import com.xy.bean.PayvipBean;
import com.xy.readbean.MoneyType;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.util.List;
import javax.swing.JLabel;

public class Class174 extends Class345 {
   private Class529[] ma;
   private Class607 apv;
   private Class436 ec;
   private Class368 apw;
   private JLabel bd;
   private int j;
   private Class417 apx;
   private Class139 apy;
   private Class556 aci;

   public void as(int var1) {
      int var10000 = 3 >> 2;
      this.j = var1;

      for(int var2 = var10000; var10000 < this.ma.length; var10000 = var2) {
         this.ma[var2].setKeep((boolean)(var2 == this.j ? --1 : 0));
         ++var2;
      }

      this.y(var1);
      this.apx.setVisible((boolean)(var1 == 0 ? 3 >> 1 : 0));
      this.apy.setVisible((boolean)(var1 == --1 ? 4 ^ 5 : 0));
      this.apw.setVisible((boolean)(var1 == 5 >> 1 ? --1 : 0));
      this.apv.setVisible((boolean)(var1 == --3 ? 2 ^ 3 : 0));
   }

   public boolean t() {
      this.apy.d();
      return super.t();
   }

   public Class174(GameView var1) {
      int var10001 = --4;
      int var10005 = -4 >> 2;
      super(39 & 127, 5 >> 1, Class345.aef, var1);
      this.va(var10005, 5 >> 3, 30382 & 3067, 475 & 32767, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 86 & 109, 86 & 109, 86 & 109, 86 & 109, (boolean)(3 & 4)), "多宝阁");
      Class529[] var5 = new Class529[var10001];
      boolean var10003 = true;
      this.ma = var5;

      int var2;
      for(int var10000 = var2 = 5 >> 3; var10000 < this.ma.length; var10000 = var2) {
         Class529[] var4 = this.ma;
         Class529 var10002 = new Class529;
         var10005 = --2;
         int var10006 = (23805 & 9203) + var2;
         Font var10007 = Class681.cf;
         Color[] var10008 = Class681.c;
         String var10009;
         Class174 var10010;
         if (var2 == 0) {
            var10009 = "商城";
            var10010 = this;
         } else if (var2 == (4 ^ 5)) {
            var10009 = "锦绣";
            var10010 = this;
         } else if (var2 == 5 >> 1) {
            var10009 = "月卡";
            var10010 = this;
         } else if (var2 == --3) {
            var10009 = "VIP";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var10002.<init>("sc/e/64.png", var10005, var10006, var10007, var10008, var10009, var10010);
         var4[var2] = var10002;
         this.ma[var2].setOffsetTexts(Class681.bv);
         this.ma[var2].setBounds((127 & 61) + (87 & 126) * var2, 95 & 53, 127 & 79, 51 & 109);
         this.add(this.ma[var2++]);
      }

      this.bd = Class133.b(8185 & 25062, 43 & 118, 79 & 120, 86 & 59, Color.black, Class681.ak);
      this.bd.setText("当前仙玉");
      this.add(this.bd);
      MoneyType var3 = new MoneyType();
      var3.setIdAndKey(--3, "仙玉");
      this.aci = Class133.m(16380 & 16939, 118 & 43, 110, 18, 10, Color.white, Class681.q, var3, var1);
      this.aci.eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(3 >> 2)));
      this.aci.ab(5 >> 1);
      this.add(this.aci);
      this.ec = new Class436(Class511.q("sc/d/35.png", 80, 10, 80, 10, (boolean)(2 & 5)));
      this.ec.setBounds(31, 35, 625, 20);
      this.add(this.ec);
      this.add(this.apx = new Class417(var1));
      this.add(this.apy = new Class139(var1));
      this.add(this.apw = new Class368(var1));
      this.add(this.apv = new Class607(var1));
      if (this.uw().VALUE.indexOf(71) == -4 >> 2) {
         this.ma[4 ^ 5].setVisible((boolean)(2 & 5));
         this.ma[5 >> 1].setBounds(147, 21, 79, 33);
         this.ma[--3].setBounds(233, 21, 79, 33);
      }

      if (this.uw().VALUE.indexOf(72) == -4 >> 2) {
         this.ma[--3].setVisible((boolean)(2 & 5));
      }

      if (!this.uw().y() && this.uw().n(1 ^ 3, 12) && this.uw().VALUE.indexOf(76) != -4 >> 2) {
         this.ma[3 & 4].setVisible((boolean)(5 >> 3));
         this.ma[4 ^ 5].setVisible((boolean)(2 & 5));
         this.ma[--3].setVisible((boolean)(2 & 5));
         this.ma[2].setBounds(61, 21, 79, 33);
      }

   }

   public void ck(List<PayvipBean> var1) {
      this.apv.ck(var1);
   }

   public void q() {
      this.as(3 >> 2);
      this.aci.cc();
      super.q();
   }

   public void y(int var1) {
      if (var1 == this.j) {
         if (this.j != 0) {
            if (this.j == (2 ^ 3)) {
               this.apy.s();
            } else if (this.j == (1 ^ 3)) {
               this.apw.d();
            } else {
               if (this.j == --3) {
                  this.apv.d();
               }

            }
         } else {
            int var10002 = 3 & 4;
            int var10000 = 3 & 4;
            this.apx.y(var10002);

            for(var1 = var10002; var10000 < this.apx.uk().length; var10000 = var1) {
               this.apx.uk()[var1++].cc();
            }

         }
      }
   }
}
