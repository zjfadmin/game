package com.xy.a.q;

import com.xy.bean.LoginResult;
import com.xy.readbean.Shop;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Class82 extends com.xy.q.Class30 {
   private JScrollPane ab;
   private JPanel alf;
   private com.xy.w.Class18 nn;
   private JLabel dh;
   private com.xy.w.Class18 af;
   private com.xy.q.Class52 kt;
   private com.xy.w.Class18 dn;

   public void h() {
      LoginResult var2 = this.yx().getLoginResult();
      this.kt.ef(var2.getScoretype(this.dh.getText()).longValue());
   }

   public void adn(List<Shop> var1, String var2) {
      Component[] var3;
      Class82 var14;
      if ((var3 = this.alf.getComponents()).length >= var1.size()) {
         int var4;
         for (int var10000 = var4 = 0; var10000 < var1.size(); var10000 = var4) {
            ((Class29)this.alf.getComponent(var4)).ov(var1.get(var4++));
         }

         for (int var12 = var4 = var1.size(); var12 < var3.length; var12 = var4) {
            Class29 var13 = (Class29)this.alf.getComponent(var4);
            var4++;
            var13.t();
         }

         this.alf.setPreferredSize(new Dimension(656, 65 * (var1.size() % 2 == 0 ? var1.size() / 2 : var1.size() / 2 + 1)));
         var14 = this;
      } else {
         if (var3.length < var1.size()) {
            int var9;
            for (int var15 = var9 = 0; var15 < var3.length; var15 = var9) {
               ((Class29)this.alf.getComponent(var9)).ov(var1.get(var9++));
            }

            for (int var17 = var9 = var3.length; var17 < var1.size(); var17 = var9) {
               int var5 = var9 / 2;
               int var6 = var9 % 2;
               Class29 var7 = new Class29(this, var1.get(var9));
               var7.setBounds(var6 * 259 + 0, var5 * 65 + 0, 250, 65);
               var9++;
               this.alf.add(var7);
            }

            this.alf.setPreferredSize(new Dimension(656, 65 * (var1.size() % 2 == 0 ? var1.size() / 2 : var1.size() / 2 + 1)));
         }

         var14 = this;
      }

      var14.ab.updateUI();
      this.ab.invalidate();
      this.ab.validate();
      this.ab.repaint();
      this.dh.setText(var2);
      this.h();
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.afx.dh()) {
         this.h();
      }
   }

   public Class82(GameView var1) {
      super(88, 2, com.xy.q.Class30.afz, var1);
      String var10007 = "M\u001e\u0011\u0019\u0011L\u0010\rP\u001a";
      this.yy(-1, 0, 588, 478, com.xy.q.Class30.agh);
      com.xy.w.Class9 var2 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10008 = "禥剚儛挾";
      this.yu(var2, "积分兑换");
      this.alf = new JPanel();
      this.alf.setOpaque(false);
      this.alf.setLayout(null);
      this.ab = com.xy.q.Class1.g(50, 99, 512, 354, this.alf, 30);
      this.add(this.ab);
      this.ab.updateUI();
      this.ab.invalidate();
      this.ab.validate();
      this.ab.repaint();
      String var10010 = "\u001d\u001e\u000eM\u000eM\u000eM";
      this.dh = com.xy.q.Class1.f(382, 53, 80, 20, 10, com.xy.q.Class49.c("#c000000"), com.xy.q.Class49.ch);
      String var10004 = "禥剚簱埗";
      this.dh.setText("积分类型");
      this.add(this.dh);
      this.kt = com.xy.q.Class1.a(10, Color.white, com.xy.q.Class49.w, null, var1);
      var10008 = "\u000e]RZR\u000fJ\u0010\rP\u001a";
      this.kt.mt(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false));
      this.kt.setBounds(462, 53, 100, 20);
      this.kt.n(2);
      this.kt.setText("0");
      this.add(this.kt);
      String var10009 = "/)s.syid,$;";
      this.dn = new com.xy.w.Class18(com.xy.w.Class16.m("sc/d/35.png", 80, 10, 80, 10, false));
      this.dn.setBounds(38, 30, 517, 20);
      this.add(this.dn);
      String var10012 = "\u000e]RZR\fH\u0010\rP\u001a";
      this.nn = new com.xy.w.Class18(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
      String var10011 = "/)s.sxhd,$;";
      this.af = new com.xy.w.Class18(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
      this.nn.setBounds(49, 78, 514, 21);
      this.af.setBounds(49, 78, 514, 377);
      this.add(this.nn);
      this.add(this.af);
   }
}
