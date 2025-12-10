package com.xy;

import com.xy.readbean.Activity;
import com.xy.scene.BWDHTeam;
import com.xy.socket.Agreement;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class Class575 extends Class345 {
   private List<Class436> abd;
   private Class94 axj;
   private Class436 ec;
   private List<Class379> xh;
   private Class436 uc;
   private JComponent aib;
   private long lp;
   private List<null> lq;
   private JScrollPane af;

   public <undefinedtype> amr(int var1) {
      if (var1 < this.lq.size()) {
         return (<undefinedtype>)this.lq.get(var1);
      } else {
         Class456 var2 = new Class456() {
            private JLabel ir;
            private Class436 ih;

            public void cf(int var1, int var2) {
               this.ir.setText(var1 == (74 & 61) ? "冠军" : (var1 == (79 & 55) ? "亚军" : (var1 == (22 & 111) ? "季军" : (var1 == --5 ? "殿军" : (var1 == --4 ? "四强晋级名单" : (var1 == --3 ? "八强晋级名单" : (var1 == (1 ^ 3) ? "十六强晋级名单" : "三十二强晋级名单")))))));
               this.setBounds(127 & 123, var2, 14181 & 18875, 126 & 31);
            }

            public {
               int var10005 = 127 & 55;
               this.ir = Class133.b(var10005, 3 >> 2, 4343 & 28603, 127 & 30, Class681.c("#c7D6120"), Class681.ch);
               this.ir.setHorizontalAlignment(5 >> 3);
               this.ih = new Class436("sc/d/103.png");
               this.ih.setBounds(3 ^ 3, 26 & 111, 23859 & 9197, 15 & 123);
               this.add(this.ir);
               this.add(this.ih);
            }
         };
         this.lq.add(var2);
         this.aib.add(var2);
         return var2;
      }
   }

   public Class436 ams(int var1) {
      if (var1 < this.abd.size()) {
         return (Class436)this.abd.get(var1);
      } else {
         Class436 var2 = new Class436(Class511.q("sc/d/66.png", 62 & 115, 3 & 5, 62 & 115, --1, (boolean)(3 >> 2)));
         this.abd.add(var2);
         this.aib.add(var2);
         return var2;
      }
   }

   public void d() {
      if (Class280.f() - this.lp >= (long)(Class280.i * --5)) {
         this.lp = Class280.f();
         Activity var1 = this.axj.kd();
         String var2 = Agreement.getSendTextAES("activity", var1.getId() + "|P");
         this.uw().d(var2);
      }
   }

   public Class379 amt(int var1) {
      if (var1 < this.xh.size()) {
         return (Class379)this.xh.get(var1);
      } else {
         Class379 var2 = new Class379("sc/e/163.png", 4 ^ 5, 23711 & 9207, Class681.q, Class681.c, "", this);
         this.xh.add(var2);
         this.aib.add(var2);
         return var2;
      }
   }

   public void y(int var1) {
      Activity var2 = this.axj.kd();
      String var3 = Agreement.getSendTextAES("activity", var2.getId() + "|t" + var1);
      this.uw().d(var3);
   }

   public void ck(List<BWDHTeam> var1) {
      int var8 = 1 ^ 3;
      int var7 = 3 & 4;
      int var4 = 3 >> 2;
      int var5 = 3 & 4;
      int var6 = 2 & 5;
      int var3 = 5 >> 3;

      int var2;
      Class436 var12;
      int var10000;
      int var10001;
      int var10002;
      for(var10000 = var2 = 3 >> 2; var10000 < var1.size(); ++var4) {
         BWDHTeam var9;
         if ((var9 = (BWDHTeam)var1.get(var2)).getFlag() != var3) {
            var6 = 3 ^ 3;
            var3 = var9.getFlag();
            if (var8 != 5 >> 1) {
               var12 = this.ams(var5);
               var8 += 53;
               var10001 = 4 ^ 5;
               var10002 = var8;
               var8 += 18;
               var12.setBounds(var10001, var10002, 22207 & 11102, 1 ^ 3);
               ++var5;
            }

            <undefinedtype> var13 = this.amr(var7);
            var10002 = var8;
            var8 += 48;
            var13.cf(var3, var10002);
            ++var7;
         }

         Class379 var10 = this.amt(var4);
         var10.setName(String.valueOf(var9.getId()));
         var10.setText(var9.getName());
         if (var3 != (109 & 26) && var3 != (7 & 127) && var3 != (7 & 126) && var3 != --5) {
            if (var6 >= --4) {
               var6 = 5 >> 3;
               var10001 = 25017 & 7895;
               var8 += 46;
               var10.setBounds(var10001 * var6, var8, 127 & 107, 103 & 59);
            } else {
               var10.setBounds((8917 & 23995) * var6, var8, 107 & 127, 99 & 63);
            }
         } else {
            var10.setBounds(6391 & 26591, var8, 107 & 127, 111 & 51);
         }

         ++var6;
         ++var2;
         var10000 = var2;
      }

      if (var1.size() > 0) {
         var12 = this.ams(var5);
         var8 += 53;
         var10001 = 3 >> 1;
         var10002 = var8;
         var8 += 2;
         var12.setBounds(var10001, var10002, 24095 & 9214, 5 >> 1);
         ++var5;
      }

      Object var14;
      for(var10000 = var2 = var7; var10000 < this.lq.size(); var10000 = var2) {
         var14 = this.lq.get(var2);
         ++var2;
         ((<undefinedtype>)var14).setVisible((boolean)(3 >> 2));
      }

      for(var10000 = var2 = var4; var10000 < this.xh.size(); var10000 = var2) {
         var14 = this.xh.get(var2);
         ++var2;
         ((Class379)var14).setVisible((boolean)(2 & 5));
      }

      for(var10000 = var2 = var5; var10000 < this.abd.size(); var10000 = var2) {
         var14 = this.abd.get(var2);
         ++var2;
         ((Class436)var14).setVisible((boolean)(3 >> 2));
      }

      this.aib.setPreferredSize(new Dimension(28319 & 4991, var8));
      JScrollBar var11 = this.af.getVerticalScrollBar();
      var10001 = 3 & 4;
      var11.setMaximum(this.aib.getHeight());
      var11.setValue(var10001);
   }

   public Class575(Class94 var1) {
      int var10004 = 77 & 127;
      int var10011 = 2 & 5;
      super(-4 >> 2, -4 >> 2, Class345.aei, var1.aej);
      this.va(var10011, 3 & 4, 8142 & 25343, 13295 & 19998, Class345.aei);
      this.axj = var1;
      this.lq = new ArrayList();
      this.xh = new ArrayList();
      this.abd = new ArrayList();
      this.aib = new JComponent() {
      };
      this.af = Class133.f(var10004, 124 & 79, 19070 & 14263, 12286 & 20853, this.aib, 95 & 52);
      this.af.getVerticalScrollBar().setUI(new Class179(Class511.q("sc/d/106.png", --3, --3, --3, --3, (boolean)(3 & 4)), 121 & 14));
      this.add(this.af);
      this.uc = new Class436(Class511.q("sc/d/105.png", --3, --3, --3, --3, (boolean)(3 ^ 3)));
      this.uc.setBounds(8830 & 24573, 76 & 127, 14 & 119, 24563 & 8574);
      this.add(this.uc);
      this.ec = new Class436(Class511.q("sc/d/132.png", 59 & 118, 59 & 118, 59 & 118, 59 & 118, (boolean)(2 & 5)));
      this.ec.setBounds(47 & 121, 123 & 62, 23527 & 9855, 406);
      this.add(this.ec);
   }
}
