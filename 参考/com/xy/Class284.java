package com.xy;

import com.xy.bean.ChongjipackBean;
import com.xy.bean.XXGDBean;
import com.xy.formula.GoodType;
import com.xy.formula.MsgUntil;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class Class284 extends Class345 {
   private JLabel at;
   private JLabel bd;
   private Class436 r;
   private JComponent ko;
   private JLabel rk;
   private JScrollPane af;

   public Class284(GameView var1) {
      int var10005 = 31551 & 1534;
      int var10007 = 95 & 110;
      int var10011 = -4 >> 2;
      super(21383 & 11518, 1 ^ 3, Class345.aef, var1);
      this.va(var10011, 5 >> 3, 10762 & 22525, 24033 & 9182, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 111 & 84, 111 & 84, 111 & 84, 111 & 84, (boolean)(2 & 5)), "新区冲级礼");
      this.rk = Class133.c(var10007, 119 & 31, 8159 & 24808, 30 & 121, --4, Color.black, Class681.h);
      this.at = Class133.c(var10005, 23 & 127, 14044 & 18923, 124 & 27, 10 & 127, Color.black, Class681.h);
      this.rk.setText("新区冲级倒计时");
      this.at.setText("天,加油！");
      this.add(this.rk);
      this.add(this.at);
      this.bd = Class133.c(5503 & 27542, 55 & 95, 58 & 117, 24, 3 ^ 3, Color.RED, Class681.h);
      this.add(this.bd);
      this.ko = new JComponent() {
      };
      this.af = Class133.f(52, 60, 446, 360, this.ko, 20);
      this.add(this.af);
      this.r = new Class436();
      this.r.eq(Class511.q("sc/d/24.png", 1 ^ 3, 1 ^ 3, 1 ^ 3, 1 ^ 3, (boolean)(3 ^ 3)));
      this.r.setBounds(48, 57, 448, 367);
      this.add(this.r);
   }

   public void tr(int var1, List<ChongjipackBean> var2) {
      this.bd.setText(MsgUntil.b(var1));
      if (var2 == null) {
         var2 = new ArrayList();
      }

      String var5 = this.vd().getLoginResult().getVipget();
      String[] var4 = null;
      if (var5 != null) {
         var4 = var5.split("&&");
      }

      int var10000;
      for(var10000 = var1 = 0; var10000 < ((List)var2).size(); var10000 = var1) {
         Object var3;
         if ((var3 = (<undefinedtype>)(var1 < this.ko.getComponentCount() ? this.ko.getComponent(var1) : null)) == null) {
            this.ko.add((Component)(var3 = new Class436() {
               private Class529 ui;
               private int fk;
               private List<Class44> zy;
               private ChongjipackBean awk;
               private JLabel rk;
               private List<JLabel> ez;

               public {
                  int var10003 = 110 & 27;
                  this.rk = Class133.b(var10003, 78 & 63, 118 & 109, 93 & 58, Class681.f[3 ^ 3], Class681.cf);
                  this.add(this.rk);
                  this.ui = new Class529("sc/e/31.png", 4 ^ 5, 19390 & 13567, Class681.ak, Class681.c, "领 取", Class284.this.gk());
                  this.ui.bq(this);
                  this.ui.setBounds(10235 & 22862, 45 & 94, 127 & 79, 59 & 93);
                  this.add(this.ui);
                  this.zy = new ArrayList();
                  this.ez = new ArrayList();
               }

               public void alu(ChongjipackBean var1) {
                  Object var9;
                  int var10000;
                  if ((this.awk = var1) == null) {
                     int var7;
                     for(var10000 = var7 = 3 >> 2; var10000 < this.zy.size(); var10000 = var7) {
                        ((Class44)this.zy.get(var7)).c(3 & 4, (Object)null);
                        var9 = this.ez.get(var7);
                        ++var7;
                        ((JLabel)var9).setVisible((boolean)(2 & 5));
                     }

                     this.setVisible((boolean)(5 >> 3));
                  } else {
                     this.rk.setText(var1.getPackgrade());
                     List var2 = ChongjipackBean.getGoodsImpactGrade(var1.getPackgoods());
                     this.fk = 3 & 4;

                     int var6;
                     for(var10000 = var6 = 3 & 4; var10000 < var2.size(); var10000 = var6) {
                        Class44 var3 = var6 < this.zy.size() ? (Class44)this.zy.get(var6) : null;
                        if (var3 == null) {
                           JLabel var4 = Class133.c(3 >> 2, 3 >> 2, 3 >> 2, 3 >> 2, 3 >> 2, Color.white, Class681.bm);
                           var3 = new Class44(Class284.this.gk());
                           var3.fw("sc/d/46.png");
                           var3.ad(Class44.arm);
                           this.ez.add(var4);
                           this.zy.add(var3);
                           this.add(var4);
                           this.add(var3);
                        }

                        XXGDBean var8;
                        Goodstable var5 = (var8 = (XXGDBean)var2.get(var6)) != null ? Class284.this.vc().n(var8.getId()) : null;
                        if (var5 != null) {
                           this.fk += GoodType.ag(var5.getType()) ? --1 : var8.getSum();
                        }

                        int var10001;
                        Goodstable var10002;
                        if (var5 != null) {
                           var10001 = 5 >> 2;
                           var10002 = var5;
                        } else {
                           var10001 = 0;
                           var10002 = var5;
                        }

                        var3.c(var10001, var10002);
                        var3.setBounds((127 & 110) + (63 & 109) * var6, 124 & 11, 63 & 99, 63 & 99);
                        ((JLabel)this.ez.get(var6)).setText(String.valueOf(var8.getSum()));
                        ((JLabel)this.ez.get(var6)).setBounds((125 & 115) + (109 & 63) * var6, 127 & 8, 14 & 127, 14 & 127);
                        ((JLabel)this.ez.get(var6)).setVisible((boolean)(var5 != null ? 3 & 5 : 0));
                        ++var6;
                     }

                     for(var10000 = var6 = var2.size(); var10000 < this.zy.size(); var10000 = var6) {
                        ((Class44)this.zy.get(var6)).c(3 & 4, (Object)null);
                        var9 = this.ez.get(var6);
                        ++var6;
                        ((JLabel)var9).setVisible((boolean)(3 & 4));
                     }

                     this.setVisible((boolean)(--1));
                  }
               }

               public void d() {
                  if (this.awk != null) {
                     if (Class284.this.vd().getGoodPackSum(-1L, new BigDecimal(-4 >> 2), this.fk) < this.fk) {
                        Class284.this.aej.f("你的背包不够");
                     } else {
                        String var1 = Agreement.getSendTextAES("Chongjipacksure", this.awk.getPacktype() + "|" + this.awk.getPackgradetype());
                        Class284.this.uw().d(var1);
                     }
                  }
               }

               public void df(String[] var1) {
                  if (this.awk != null) {
                     if (Class74.ib(var1, 106 & 31, this.awk.getPackgradetype())) {
                        this.ui.setBtn(-4 >> 2, "sc/e/58.png");
                     } else {
                        this.ui.setBtn(5 >> 2, "sc/e/31.png");
                     }
                  }
               }
            }));
         }

         ((<undefinedtype>)var3).alu((ChongjipackBean)((List)var2).get(var1));
         int var10001 = 5 >> 2;
         int var10003 = 3 >> 2;
         ((<undefinedtype>)var3).df(var4);
         int var10004 = (119 & 58) * var1;
         int var10005 = 29173 & 4014;
         ++var1;
         ((<undefinedtype>)var3).setBounds(var10003, var10004, var10005, 62 & 115);
         ((<undefinedtype>)var3).setVisible((boolean)var10001);
      }

      var1 = ((List)var2).size();
      int var6 = this.ko.getComponentCount();

      for(var10000 = var1; var10000 < var6; var10000 = var1) {
         Component var7 = this.ko.getComponent(var1);
         ++var1;
         ((<undefinedtype>)var7).alu((ChongjipackBean)null);
      }

      this.ko.setPreferredSize(new Dimension(3519 & 29694, (50 & 127) * ((List)var2).size()));
      this.af.getVerticalScrollBar().setValue(3 >> 2);
      if (this.ve().m(this.ae()) == null) {
         this.ve().a(this.ae());
      }

   }

   public void d() {
      String var1 = this.vd().getLoginResult().getVipget();
      String[] var2 = null;
      if (var1 != null) {
         var2 = var1.split("&&");
      }

      int var5 = 0;
      int var3 = this.ko.getComponentCount();

      for(int var10000 = var5; var10000 < var3; var10000 = var5) {
         <undefinedtype> var4;
         if ((var4 = (<undefinedtype>)this.ko.getComponent(var5)).isVisible()) {
            var4.df(var2);
         }

         ++var5;
      }

   }

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.aeg) {
         this.aeg = (boolean)(3 & 4);
         this.af.updateUI();
      }

   }

   public void bq(Object var1) {
      ((<undefinedtype>)var1).d();
   }
}
