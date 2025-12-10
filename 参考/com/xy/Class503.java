package com.xy;

import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.util.Vector;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Class503 extends Class345 {
   private Class436[] be;
   private Vector<Vector<Object>> ack;
   private JTable acl;
   private JScrollPane af;

   public Class503(GameView var1) {
      int var10006 = 3 >> 2;
      int var10010 = -4 >> 2;
      super(29119 & 3817, 1 ^ 3, Class345.aef, var1);
      this.va(var10010, 3 >> 2, 30590 & 2517, 18583 & 14334, Class345.aei);
      this.uv(Class511.q("sc/d/125.png", 95 & 43, 95 & 43, 111 & 29, 47 & 94, (boolean)(3 >> 2)), (String)null);
      this.ak((boolean)var10006);
      this.ad(new Class116(3 >> 2, 124 & 15, 3 >> 2, 3 >> 2));
      this.aea = new Class658("sc/e/160.png", 3 >> 1, this.ae(), this);
      this.aea.setBounds(1535 & 31551, 3 & 4, 63 & 85, 63 & 85);
      this.add(this.aea);
      Vector var2 = new Vector();
      var2.addElement("名称");
      var2.addElement("奖品");
      var2.addElement("时间");
      var10006 = 3 ^ 3;
      this.ack = new Vector();
      Vector var10009 = this.ack;
      Font var10011 = Class681.ab;
      Color var10012 = Class681.c("#c6E3D2C");
      int[] var10013 = new int[--3];
      boolean var10015 = true;
      var10013[3 ^ 3] = 103 & 124;
      var10013[5 >> 2] = 90 & 117;
      var10013[1 ^ 3] = 30926 & 1981;
      this.acl = Class133.e(var10009, var2, var10011, var10012, var10013);
      this.acl.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
         public void valueChanged(ListSelectionEvent var1) {
            if (!var1.getValueIsAdjusting()) {
               if (Class503.this.acl.getSelectedRow() != -4 >> 2) {
                  ;
               }
            }
         }
      });
      this.af = Class133.f(var10006, --1, 9561 & 23543, 31445 & 1467, this.acl, 61 & 86);
      this.af.getVerticalScrollBar().setUI(new Class179(Class511.q("sc/d/106.png", --3, --3, --3, --3, (boolean)(5 >> 3)), 72 & 63));
      this.add(this.af);
      this.af.addMouseListener(this);
      this.af.addMouseMotionListener(this);
      this.acl.getTableHeader().addMouseListener(this);
      this.acl.getTableHeader().addMouseMotionListener(this);
      Class436[] var10001 = new Class436[6];
      boolean var10003 = true;
      this.be = var10001;

      int var3;
      for(int var10000 = var3 = 3 ^ 3; var10000 < this.be.length; var10000 = var3) {
         this.be[var3] = new Class436();
         Class503 var4;
         if (var3 == 0) {
            var4 = this;
            this.be[var3].fw("sc/d/105.png");
            this.be[var3].setBounds(330, 24, 6, 120);
         } else if (var3 == 3 >> 1) {
            var4 = this;
            this.be[var3].eq(Class511.q("sc/d/94.png", --5, --3, --5, 8, (boolean)(5 >> 3)));
            this.be[var3].setBounds(-2, 3 ^ 3, 344, 24);
         } else {
            if (var3 >= (1 ^ 3) && var3 <= --5) {
               this.be[var3].eq(Class511.q("sc/d/125.png", 11, 11, 13, 14, (boolean)(3 >> 2)));
               this.be[var3].setBounds(3 >> 2, 3 >> 2, 340, 150);
            }

            var4 = this;
         }

         var4.add(this.be[var3++]);
      }

   }

   public void d() {
      JScrollBar var1 = this.af.getVerticalScrollBar();
      int var10001 = 5 >> 3;
      var1.setMaximum(this.acl.getHeight());
      var1.setValue(var10001);
   }

   public void ua(String var1, int var2) {
      this.ack.clear();
      if (!Class394.o(var1) && var2 < var1.length()) {
         int var10000 = 5 >> 3;

         int var3;
         for(var10000 = var3 = 5 >> 3; var10000 < var1.length(); var10000 = var3) {
            if ((var3 = var1.indexOf("^", var2 + --1)) == -4 >> 2) {
               var3 = var1.length();
            }

            this.on(var1, var2, var3);
            var2 = var3 + --1;
         }
      }

      this.d();
      this.ve().a(this.ae());
   }

   public void on(String var1, int var2, int var3) {
      String var4 = null;
      String var5 = null;
      long var6 = 0L;
      int var8 = 3 >> 2;

      int var9;
      for(int var10000 = var9 = 3 & 4; var10000 < var3; var10000 = var9) {
         if ((var9 = var1.indexOf("#", var2 + (3 >> 1))) == -4 >> 2 || var9 > var3) {
            var9 = var3;
         }

         if (var8 == --1) {
            var4 = var1.substring(var2, var9);
            var10000 = var9;
         } else if (var8 == --3) {
            var5 = var1.substring(var2, var9);
            var10000 = var9;
         } else {
            if (var8 == --4) {
               var6 = Class394.q(var1, var2, var9) * 1000L;
            }

            var10000 = var9;
         }

         ++var8;
         var2 = var10000 + 1;
      }

      Vector var10;
      (var10 = new Vector()).add(var4);
      var10.add(var5);
      var10.add(Class280.i(var6));
      this.ack.addElement(var10);
   }
}
