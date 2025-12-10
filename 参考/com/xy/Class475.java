package com.xy;

import com.xy.game.RoleData;
import com.xy.readbean.Activity;
import com.xy.readbean.Activity2Role;
import com.xy.readbean.ActivityFC;
import com.xy.readbean.ActivityFCBeau;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JLabel;

public class Class475 extends Class345 {
   private int ei;
   private Class436[] ej;
   private int ek;
   private <undefinedtype>[] el;
   private int em;
   private int dm;
   private RichLabel en;
   private int[] eo;
   private List<Integer> ep;
   private int br;
   private Class436 eq;
   private JLabel[] er;
   private Class456 es;
   private Class436 et;
   private Class245 eu;
   private Class379[] ev;
   private <undefinedtype>[] ew;
   private Activity ex;
   private Class456 ey;

   public void d() {
      if (this.em == (2 ^ 3)) {
         int var10001 = 19199 & 13759;
         this.em = 2 & 5;
         this.cf(var10001, 5 >> 3);
      }
   }

   public void cf(int var1, int var2) {
      if (var1 == (191 & 32767)) {
         this.em = this.em == 0 ? 3 & 5 : 0;
         this.ev[3 ^ 3].setText(this.em == 0 ? "我的竞拍" : "返回竞拍");
         if (this.em == 0) {
            this.ey.setVisible((boolean)(3 ^ 3));
            int var10002 = 4 ^ 5;
            int var10 = 4 ^ 5;
            this.es.setVisible((boolean)var10002);
            this.dm = var10 + ((this.eo.length - (5 >> 1)) / (5 >> 1) - --1) / this.ew.length;
            this.y(3 >> 1);
         } else {
            this.es.setVisible((boolean)(3 ^ 3));
            this.ey.setVisible((boolean)(4 ^ 5));
            Class475 var10000;
            if (this.ep == null) {
               this.ep = new ArrayList();
               var10000 = this;
            } else {
               this.ep.clear();
               var10000 = this;
            }

            RoleData var8 = var10000.vd();
            Activity2Role var4 = this.ex != null ? (Activity2Role)var8.getActivity(this.ex.getId()) : null;
            if (var4 != null) {
               Iterator var6;
               Iterator var9 = var6 = var4.getDataMap().keySet().iterator();

               while(var9.hasNext()) {
                  Integer var5;
                  if (var5 = (Integer)var6.next() == 0) {
                     var9 = var6;
                  } else {
                     this.ep.add(var5);
                     var9 = var6;
                  }
               }
            }

            this.dm = --1 + (this.ep.size() - --1) / this.el.length;
            this.y(3 >> 1);
         }
      } else if (var1 == (3030 & 29929)) {
         if (this.ei <= --1) {
            this.aej.f("这是首页");
         } else {
            this.y(this.ei - (5 >> 2));
         }
      } else if (var1 == (4057 & 28903)) {
         if (this.ei >= this.dm) {
            this.aej.f("这是尾页");
         } else {
            this.y(this.ei + (4 ^ 5));
         }
      } else if (var1 == (21498 & 11463)) {
         if (var2 != 0) {
            StringBuffer var7;
            (var7 = new StringBuffer()).append("[");
            var7.append(this.vd().getLoginResult().getRolename());
            var7.append("#VBEAU2,");
            var7.append(var2);
            var7.append("#L]");
            ((Class270)this.ve().e(62 & 111)).px(var7.toString());
         }
      } else {
         String var3;
         if (var1 == (19435 & 13527)) {
            if (var2 != 0) {
               var3 = Agreement.getSendTextAES("BEAU", "B1" + var2);
               this.uw().d(var3);
            }
         } else if (var1 == (13775 & 19188)) {
            if (var2 != 0) {
               var3 = Agreement.getSendTextAES("BEAU", "Ba" + var2);
               this.uw().d(var3);
            }
         } else if (var1 == (11725 & 21239)) {
            if (var2 != 0) {
               var3 = Agreement.getSendTextAES("BEAU", "Bb" + var2);
               this.uw().d(var3);
            }
         } else {
            if (var1 == (13030 & 19935)) {
               if (var2 == 0) {
                  return;
               }

               var3 = Agreement.getSendTextAES("BEAU", "Bc" + var2);
               this.uw().d(var3);
            }

         }
      }
   }

   public void ch(int[] var1) {
      int var10005 = 3 >> 1;
      this.br = var1[5 >> 3];
      this.ek = var1[var10005];
      this.ex = this.vc().cq();
      int var2 = this.ex != null ? Class394.an(this.ex.getActivitySet(), "抢靓号设置=", "|") : 0;
      ActivityFC var3 = var2 > 0 ? this.vc().m(var2) : null;
      ActivityFCBeau var8 = var3 != null ? (ActivityFCBeau)var3.getData() : null;
      Class475 var10000;
      if (var8 != null) {
         long var4 = this.ex.getTimeOpen() + (long)(this.br - (2 ^ 3)) * var8.getCycleTime() * 1000L + (long)var8.getPointTime().x * 1000L;
         var10000 = this;
         long var6 = this.ex.getTimeOpen() + (long)(this.br - (4 ^ 5)) * var8.getCycleTime() * 1000L + (long)var8.getPointTime().y * 1000L;
         this.en.setTextSize("#c484333竞拍时间为#cFF0000  " + Class280.i(var4) + " ~ " + Class280.i(var6), 1023 & 32244);
      } else {
         this.en.setTextSize("", 3575 & 29692);
         var10000 = this;
      }

      var10000.en.setBounds(95 & 122, 111 & 91, this.en.getWidth(), this.en.getHeight());
      int var10001 = 14015 & 18943;
      int var10003 = --1;
      this.eo = var1;
      this.em = var10003;
      this.cf(var10001, 3 & 4);
   }

   public Class475(GameView var1) {
      int var10001 = --3;
      int var10003 = 3 ^ 3;
      int var10005 = --1;
      int var10007 = 3 >> 1;
      super(-4 >> 2, -4 >> 2, Class345.aei, var1);
      this.ei = var10007;
      this.dm = var10005;
      this.va(var10003, 3 & 4, 31743 & 1727, 17407 & 15902, Class345.aei);
      Class379[] var3 = new Class379[var10001];
      boolean var8 = true;
      this.ev = var3;

      int var2;
      Class475 var4;
      int var10000;
      for(var10000 = var2 = 5 >> 3; var10000 < this.ev.length; var10000 = var2) {
         if (var2 == 0) {
            this.ev[var2] = new Class379("sc/e/186.png", 3 >> 1, (22719 & 10239) + var2, Class681.cf, (Color[])null, "我的竞拍", this);
            var10000 = var2;
         } else {
            this.ev[var2] = new Class379(var2 == (3 & 5) ? "sc/e/156.png" : "sc/e/155.png", 1, (3839 & 29119) + var2, this);
            var10000 = var2;
         }

         if (var10000 == 0) {
            var4 = this;
            this.ev[var2].setBounds(15327 & 17983, 127 & 71, 113 & 126, 107 & 63);
         } else {
            var4 = this;
            this.ev[var2].setBounds((17853 & 15219) + (var2 - --1) * (95 & 126), 16895 & 16370, 27 & 118, 127 & 25);
         }

         var4.add(this.ev[var2++]);
      }

      var10001 = 5 >> 1;
      this.eu = Class133.a(1359 & 31735, 30718 & 2549, 71 & 124, 19, 3 ^ 3, Color.white, Class681.q);
      this.eu.eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(5 >> 3)));
      this.add(this.eu);
      this.en = new RichLabel("", Class681.q);
      this.add(this.en);
      Class436[] var5 = new Class436[var10001];
      var8 = true;
      this.ej = var5;

      for(var10000 = var2 = 5 >> 3; var10000 < this.ej.length; var10000 = var2) {
         this.ej[var2] = new Class436();
         if (var2 == 0) {
            var4 = this;
            this.ej[var2].eq(Class511.q("sc/d/66.png", 100, --1, 100, 3 >> 1, (boolean)(3 & 4)));
            this.ej[var2].setBounds(47, 131, 629, 1 ^ 3);
         } else {
            if (var2 == (4 ^ 5)) {
               this.ej[var2].eq(Class511.q("sc/d/36.png", 20, 20, 20, 20, (boolean)(5 >> 3)));
               this.ej[var2].setBounds(46, 58, 634, 65);
            }

            var4 = this;
         }

         var4.add(this.ej[var2++]);
      }

      this.es = new Class456();
      <undefinedtype>[] var6 = new <undefinedtype>[6];
      var8 = true;
      this.ew = var6;

      for(var10000 = var2 = 3 >> 2; var10000 < this.ew.length; var10000 = var2) {
         this.ew[var2] = new Class456(var2, this) {
            private Class379 bak;
            private Class436 uc;
            private Class379 if;
            private Class436 bl;
            private JLabel[] u;

            public {
               int var10001 = --5;
               this.bak = new Class379("sc/e/190.png", 3 >> 1, 18642 & 14319, Class681.cf, (Color[])null, "预览", var3);
               this.if = new Class379("sc/e/187.png", 3 & 5, 7367 & 25595, Class681.cf, (Color[])null, "竞拍", var3);
               this.bak.setForeground(Class681.c("#cB58754"));
               this.bak.setBounds(28587 & 4350, 123 & 47, 115 & 61, 123 & 28);
               this.if.setBounds(239 & 32756, 38 & 127, 115 & 79, 127 & 35);
               this.bak.y(var2);
               this.if.y(var2);
               this.add(this.bak);
               this.add(this.if);
               JLabel[] var6 = new JLabel[var10001];
               boolean var10003 = true;
               this.u = var6;

               int var4;
               for(int var10000 = var4 = 5 >> 3; var10000 < this.u.length; var10000 = var4) {
                  <undefinedtype> var5;
                  if (var4 == 0) {
                     var5 = this;
                     this.u[var4] = Class133.b(54 & 95, 59 & 86, 2296 & 30671, 57 & 94, Class681.c("#c484333"), Class681.ar);
                  } else if (var4 == 5 >> 2) {
                     var5 = this;
                     this.u[var4] = Class133.b(23 & 127, 63 & 120, 70, 16, Color.black, Class681.q);
                  } else if (var4 == 5 >> 1) {
                     var5 = this;
                     this.u[var4] = Class133.b(23, 79, 70, 16, Color.black, Class681.q);
                  } else if (var4 == --3) {
                     var5 = this;
                     this.u[var4] = Class133.b(86, 56, 80, 16, Color.red, Class681.ce);
                  } else {
                     if (var4 == --4) {
                        this.u[var4] = Class133.b(86, 79, 80, 16, Color.red, Class681.ce);
                     }

                     var5 = this;
                  }

                  var5.u[var4].setText(var4 == (2 ^ 3) ? "预购数:" : (var4 == (1 ^ 3) ? "竞拍价:" : ""));
                  this.add(this.u[var4++]);
               }

               this.uc = new Class436("sc/d/199.png");
               this.bl = new Class436(Class511.q("sc/d/197.png", 10, 10, 10, 10, (boolean)(3 >> 2)));
               this.uc.setBounds(288, 20, 24, 70);
               this.bl.setBounds(3 >> 2, 3 >> 2, 312, 110);
               this.add(this.uc);
               this.add(this.bl);
            }

            public void bm(int var1, int var2, int var3) {
               this.bak.y(var1);
               this.if.y(var1);
               this.u[2 & 5].setText(String.valueOf(var1));
               this.u[--3].setText(String.valueOf(var2));
               this.u[--4].setText(String.valueOf(var3));
               this.setVisible((boolean)(var1 != 0 ? 3 >> 1 : 0));
            }
         };
         this.ew[var2].setBounds(var2 % (1 ^ 3) * 322, var2 / (5 >> 1) * 120, 312, 110);
         this.es.add(this.ew[var2++]);
      }

      var10001 = --4;
      this.es.setBounds(45, 141, 634, 350);
      this.add(this.es);
      this.ey = new Class456();
      JLabel[] var7 = new JLabel[var10001];
      var8 = true;
      this.er = var7;

      for(var10000 = var2 = 5 >> 3; var10000 < this.er.length; var10000 = var2) {
         this.er[var2] = Class133.b(7, 3 & 4, 150, 24, Class681.c("#c86745C"), Class681.ak);
         this.er[var2].setText(var2 == 0 ? "极品ID靓号" : (var2 == 5 >> 2 ? "竞拍价" : (var2 == (1 ^ 3) ? "状态" : (var2 == --3 ? "操作" : ""))));
         this.er[var2].setHorizontalAlignment(0);
         if (var2 == 1) {
            var4 = this;
            this.er[var2].setBounds(170, 0, 150, 24);
         } else if (var2 == --2) {
            var4 = this;
            this.er[var2].setBounds(326, 0, 150, 24);
         } else {
            if (var2 == --3) {
               this.er[var2].setBounds(476, 0, 150, 24);
            }

            var4 = this;
         }

         var4.ey.add(this.er[var2++]);
      }

      <undefinedtype>[] var9 = new <undefinedtype>[7];
      var8 = true;
      this.el = var9;

      for(var10000 = var2 = 0; var10000 < this.el.length; var10000 = var2) {
         this.el[var2] = new Class456(var2, this) {
            private Class379 sl;
            private JLabel[] u;

            public void bm(int var1, int var2, int var3) {
               this.u[3 ^ 3].setText(String.valueOf(Math.abs(var1)));
               this.u[2 ^ 3].setText(String.valueOf(var3));
               <undefinedtype> var10000;
               if (var2 == (1 ^ 3)) {
                  var10000 = this;
                  this.sl.ab(7623 & 25342);
                  this.sl.y(var1);
                  this.sl.setText("领取");
                  this.u[1 ^ 3].setText(String.valueOf("中标"));
               } else if (var2 != 5 >> 2 || var1 >= 0 && Class475.this.ek != --2) {
                  var10000 = this;
                  this.sl.ab(32756 & 207);
                  this.sl.y(var1);
                  this.sl.setText("悔拍");
                  this.u[1 ^ 3].setText(String.valueOf("竞拍中"));
               } else {
                  var10000 = this;
                  this.sl.ab(21495 & 11469);
                  this.sl.y(var1);
                  this.sl.setText("退款");
                  this.u[5 >> 1].setText(String.valueOf("未中标"));
               }

               var10000.setVisible((boolean)(var1 != 0 ? 2 ^ 3 : 0));
            }

            public {
               int var10001 = --3;
               this.sl = new Class379("sc/e/191.png", 3 >> 1, 22015 & 10948, Class681.cf, (Color[])null, "悔拍", var3);
               this.sl.setForeground(Class681.c("#cB58754"));
               this.sl.setBounds(11129 & 22150, 3 & 4, 111 & 95, 61 & 90);
               this.add(this.sl);
               JLabel[] var6 = new JLabel[var10001];
               boolean var10003 = true;
               this.u = var6;

               int var4;
               for(int var10000 = var4 = 3 >> 2; var10000 < this.u.length; var10000 = var4) {
                  <undefinedtype> var5;
                  if (var4 == 0) {
                     var5 = this;
                     this.u[var4] = Class133.b(127 & 7, 3 ^ 3, 2463 & 30454, 61 & 90, Class681.c("#c86745C"), Class681.ar);
                  } else if (var4 == (3 & 5)) {
                     var5 = this;
                     this.u[var4] = Class133.b(6574 & 26363, 3 >> 2, 5111 & 27806, 61 & 90, Color.red, Class681.q);
                  } else {
                     if (var4 == 5 >> 1) {
                        this.u[var4] = Class133.b(27087 & 6006, 3 & 4, 28127 & 4790, 126 & 25, Color.red, Class681.q);
                     }

                     var5 = this;
                  }

                  var5.u[var4].setHorizontalAlignment(3 ^ 3);
                  this.add(this.u[var4++]);
               }

            }
         };
         this.el[var2].setBounds(0, 41 + var2 * 40, 635, 24);
         this.ey.add(this.el[var2++]);
      }

      this.eq = new Class436("sc/d/203.png");
      this.et = new Class436(Class511.q("sc/d/101.png", 10, 50, 10, 50, false));
      this.eq.setBounds(0, 0, 635, 28);
      this.et.setBounds(1, 23, 633, 336);
      this.ey.add(this.eq);
      this.ey.add(this.et);
      this.ey.setBounds(44, 141, 635, 359);
      this.add(this.ey);
   }

   public void y(int var1) {
      this.ei = var1;
      this.eu.setText(this.ei + "/" + this.dm);
      int var6;
      int var10000;
      if (this.em == 0) {
         var1 = 103 & 122;
         var6 = (1 ^ 3) + (this.ei - (3 & 5)) * (1 ^ 3) * this.ew.length;

         int var7;
         for(var10000 = var7 = 5 >> 3; var10000 < this.ew.length; var6 += 2) {
            if (var6 < this.eo.length) {
               this.ew[var7].bm(this.eo[var6], this.eo[var6 + (3 >> 1)], var1);
            } else {
               this.ew[var7].bm(3 & 4, 3 & 4, var1);
            }

            ++var7;
            var10000 = var7;
         }

      } else {
         byte var5 = 98;
         RoleData var2 = this.vd();
         Activity2Role var3 = this.ex != null ? (Activity2Role)var2.getActivity(this.ex.getId()) : null;
         var6 = (this.ei - --1) * this.el.length;

         int var4;
         for(var10000 = var4 = 2 & 5; var10000 < this.el.length; ++var6) {
            if (var6 < this.ep.size()) {
               <undefinedtype> var8 = this.el[var4];
               int var10001 = (Integer)this.ep.get(var4);
               int var10002;
               byte var10003;
               if (var3 != null) {
                  var10002 = (int)var3.getValueByKey((Integer)this.ep.get(var4));
                  var10003 = var5;
               } else {
                  var10002 = 0;
                  var10003 = var5;
               }

               var8.bm(var10001, var10002, var10003);
            } else {
               this.el[var4].bm(3 >> 2, 3 >> 2, var5);
            }

            ++var4;
            var10000 = var4;
         }

      }
   }
}
