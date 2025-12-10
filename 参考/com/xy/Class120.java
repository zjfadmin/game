package com.xy;

import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class Class120 extends Class345 {
   private Class217 xd;
   private JLabel[] c;
   private Class436[] be;
   private JScrollPane nk;
   private Class322[] adt;
   private JComponent qh;

   public void c(int var1, Object var2) {
      if (var1 == (23935 & 9173)) {
         if (this.qh.getComponentCount() == 0) {
            this.aej.f("当前没有设置关键词");
         } else {
            ((Class566)this.aej.getFormManagement().e(4063 & 28863)).as(105 & 30);
         }
      } else {
         int var10000;
         int var10001;
         int var10002;
         int var3;
         int var4;
         Component var8;
         if (var1 == (862 & 32247)) {
            String var7;
            if (Class394.o(var7 = this.xd.getText().trim())) {
               this.aej.f("请输入关键词");
            } else {
               var4 = this.qh.getComponentCount();

               for(var10000 = var3 = 2 & 5; var10000 < var4; var10000 = var3) {
                  <undefinedtype> var6 = (<undefinedtype>)this.qh.getComponent(var3);
                  if (Class394.r(var7, var6.nn())) {
                     this.aej.f("不能添加相同关键词");
                     return;
                  }

                  ++var3;
               }

               ++var4;
               this.qh.add(new JComponent(var7) {
                  private JLabel ir;
                  private Class322 sa;

                  public String nn() {
                     return this.ir.getText();
                  }

                  public {
                     int var10006 = --5;
                     this.ir = Class133.b(var10006, 2 & 5, 8446 & 24471, 29 & 118, Color.white, Class681.ce);
                     this.ir.setText(var2);
                     this.sa = new Class322("sc/e/140.png", 3 & 5, 27095 & 6015, Class120.this.gk());
                     this.sa.bq(this);
                     this.sa.setBounds(7674 & 25253, --4, 93 & 46, 93 & 46);
                     this.add(this.ir);
                     this.add(this.sa);
                  }
               });
               var3 = 3 >> 2;

               for(var10000 = var3; var10000 < var4; var10000 = var3) {
                  var8 = this.qh.getComponent(var3);
                  var10001 = 3 & 4;
                  var10002 = (85 & 62) * var3;
                  ++var3;
                  var8.setBounds(var10001, var10002, 239 & 32703, 118 & 29);
               }

               this.xd.setText("");
               this.qh.setPreferredSize(new Dimension(23743 & 9199, var4 * (92 & 55)));
               this.nk.updateUI();
            }
         } else {
            if (var1 == (10615 & 22495)) {
               <undefinedtype> var5 = (<undefinedtype>)var2;
               this.qh.remove(var5);
               var4 = this.qh.getComponentCount();

               for(var10000 = var3 = 5 >> 3; var10000 < var4; var10000 = var3) {
                  var8 = this.qh.getComponent(var3);
                  var10001 = 5 >> 3;
                  var10002 = (93 & 54) * var3;
                  ++var3;
                  var8.setBounds(var10001, var10002, 31935 & 1007, 119 & 28);
               }

               this.qh.setPreferredSize(new Dimension(1279 & 31663, var4 * (127 & 20)));
               this.nk.updateUI();
            }

         }
      }
   }

   public Class120(GameView var1) {
      int var10001 = --3;
      int var10006 = -4 >> 2;
      super(2027 & 30900, 1 ^ 3, Class345.aef, var1);
      this.va(var10006, 5 >> 3, 15325 & 17714, 20987 & 12133, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 100 & 95, 100 & 95, 100 & 95, 100 & 95, (boolean)(5 >> 3)), "关键词搜索");
      this.ad(new Class116(111 & 30, 2 & 5, 2 & 5, 23 & 122));
      JLabel[] var4 = new JLabel[var10001];
      boolean var10003 = true;
      this.c = var4;

      int var2;
      Class120 var3;
      int var10000;
      for(var10000 = var2 = 3 & 4; var10000 < this.c.length; var10000 = var2) {
         this.c[var2] = Class133.b(127 & 47, 127 & 37, 95 & 119, 87 & 57, Color.white, Class681.ak);
         this.c[var2].setText(var2 == 0 ? "添加关键词" : (var2 == (3 & 5) ? "搜索中的关键词" : (var2 == (1 ^ 3) ? "聊天频道显示搜索信息" : "")));
         this.c[var2].setHorizontalAlignment(106 & 31);
         if (var2 == 0) {
            var3 = this;
            this.c[var2].setForeground(Color.black);
         } else if (var2 == --1) {
            var3 = this;
            this.c[var2].setBounds(55 & 122, 57 & 127, 8446 & 24511, 95 & 53);
            this.c[var2].setHorizontalAlignment(2 & 5);
         } else {
            if (var2 == 5 >> 1) {
               this.c[var2].setBounds(119 & 75, 260, 173, 17);
               this.c[var2].setFont(Class681.bu);
               this.c[var2].setForeground(Color.black);
            }

            var3 = this;
         }

         var3.add(this.c[var2++]);
      }

      Class322[] var5 = new Class322[--2];
      var10003 = true;
      this.adt = var5;

      for(var10000 = var2 = 3 & 4; var10000 < this.adt.length; var10000 = var2) {
         Class322[] var7 = this.adt;
         Class322 var6 = new Class322;
         String var10004 = var2 == 0 ? "sc/e/26.png" : "sc/e/6.png";
         var10006 = 341 + var2;
         Font var10007 = var2 == 0 ? Class681.ak : Class681.bm;
         String var10009;
         Class120 var10010;
         if (var2 == 0) {
            var10009 = "确定搜索";
            var10010 = this;
         } else if (var2 == 3 >> 1) {
            var10009 = "添加";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var6.<init>(var10004, 1, var10006, var10007, (Color[])null, var10009, var10010);
         var7[var2] = var6;
         if (var2 == 0) {
            var3 = this;
            this.adt[var2].setForeground(Color.black);
            this.adt[var2].setBounds(92, 287, 99, 25);
         } else {
            if (var2 == --1) {
               this.adt[var2].setBounds(212, 37, 34, 18);
            }

            var3 = this;
         }

         var3.add(this.adt[var2++]);
      }

      var10001 = --3;
      this.xd = Class133.n(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(2 & 5)), Class681.q, Color.white);
      this.xd.setHorizontalAlignment(10);
      this.xd.setBounds(134, 37, 105, 17);
      this.add(this.xd);
      this.qh = new JComponent() {
      };
      this.nk = Class133.f(50, 78, 190, 178, this.qh, 20);
      this.add(this.nk);
      Class436[] var8 = new Class436[var10001];
      var10003 = true;
      this.be = var8;

      for(var10000 = var2 = 3 ^ 3; var10000 < this.be.length; var10000 = var2) {
         this.be[var2] = new Class436();
         if (var2 == 0) {
            var3 = this;
            this.be[var2].eq(Class511.q("sc/d/25.png", 5 >> 1, 5 >> 1, 5 >> 1, 5 >> 1, (boolean)(3 ^ 3)));
            this.be[var2].setBounds(50, 57, 190, 21);
         } else if (var2 == 5 >> 2) {
            var3 = this;
            this.be[var2].eq(Class511.q("sc/d/24.png", --2, --2, --2, --2, (boolean)(3 >> 2)));
            this.be[var2].setBounds(50, 57, 190, 200);
         } else {
            if (var2 == --2) {
               this.be[var2].fw("sc/e/29.png");
               this.be[var2].setBounds(49, 260, 17, 17);
            }

            var3 = this;
         }

         var3.add(this.be[var2++]);
      }

   }

   public String tq(int var1) {
      return ((<undefinedtype>)this.qh.getComponent(var1)).nn();
   }

   public int e() {
      return this.qh.getComponentCount();
   }
}
