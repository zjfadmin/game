package com.xy;

import com.xy.bean.LoginResult;
import com.xy.readbean.MoneyType;
import com.xy.readbean.Shop;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.LayoutManager;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Class423 extends Class345 {
   private Class556 abn;
   private JScrollPane mv;
   private JLabel bd;
   private Class436 r;
   private JPanel bap;
   private Class436 bl;
   private Class436 ih;

   public void d() {
      LoginResult var1 = this.vd().getLoginResult();
      this.abn.gh(var1.getScoretype(this.bd.getText()).longValue());
   }

   public void arm(List<Shop> var1, String var2) {
      int var10000;
      int var3;
      Component[] var4;
      Class423 var9;
      if ((var4 = this.bap.getComponents()).length >= var1.size()) {
         for(var10000 = var3 = 3 ^ 3; var10000 < var1.size(); var10000 = var3) {
            ((Class293)this.bap.getComponent(var3)).rz((Shop)var1.get(var3++));
         }

         for(var10000 = var3 = var1.size(); var10000 < var4.length; var10000 = var3) {
            Class293 var8 = (Class293)this.bap.getComponent(var3);
            ++var3;
            var8.q();
         }

         this.bap.setPreferredSize(new Dimension(18065 & 15358, (125 & 67) * (var1.size() % (1 ^ 3) == 0 ? var1.size() / --2 : var1.size() / (1 ^ 3) + (3 & 5))));
         var9 = this;
      } else {
         if (var4.length < var1.size()) {
            for(var10000 = var3 = 2 & 5; var10000 < var4.length; var10000 = var3) {
               ((Class293)this.bap.getComponent(var3)).rz((Shop)var1.get(var3++));
            }

            for(var10000 = var3 = var4.length; var10000 < var1.size(); var10000 = var3) {
               int var5 = var3 / (5 >> 1);
               int var7 = var3 % --2;
               Class293 var6 = new Class293(this, (Shop)var1.get(var3));
               var6.setBounds(var7 * (6059 & 26967) + (3 & 4), var5 * (99 & 93) + (3 ^ 3), 28159 & 4858, 71 & 121);
               ++var3;
               this.bap.add(var6);
            }

            this.bap.setPreferredSize(new Dimension(1779 & 31644, (93 & 99) * (var1.size() % (5 >> 1) == 0 ? var1.size() / (5 >> 1) : var1.size() / --2 + --1)));
         }

         var9 = this;
      }

      var9.mv.updateUI();
      this.mv.invalidate();
      this.mv.validate();
      this.mv.repaint();
      this.bd.setText(var2);
      this.d();
   }

   public Class423(GameView var1) {
      int var10003 = 59 & 118;
      int var10009 = -4 >> 2;
      super(94 & 121, 1 ^ 3, Class345.aef, var1);
      this.va(var10009, 3 & 4, 638 & 32717, 20478 & 12767, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 76 & 119, 76 & 119, 76 & 119, 76 & 119, (boolean)(3 & 4)), "积分兑换");
      this.bap = new JPanel();
      this.bap.setOpaque((boolean)(3 >> 2));
      this.bap.setLayout((LayoutManager)null);
      this.mv = Class133.f(var10003, 107 & 119, 16192 & 17087, 29031 & 4090, this.bap, 30 & 127);
      this.add(this.mv);
      int var10005 = 8575 & 24574;
      this.mv.updateUI();
      this.mv.invalidate();
      this.mv.validate();
      this.mv.repaint();
      this.bd = Class133.c(var10005, 117 & 63, 91 & 116, 116 & 31, 111 & 26, Class681.c("#c000000"), Class681.ak);
      this.bd.setText("积分类型");
      this.add(this.bd);
      this.abn = Class133.i(126 & 11, Color.white, Class681.q, (MoneyType)null, var1);
      this.abn.eq(Class511.q("sc/d/17.png", --3, --3, --3, --3, (boolean)(3 ^ 3)));
      this.abn.setBounds(32719 & 510, 53, 100, 20);
      this.abn.ab(1 ^ 3);
      this.abn.setText("0");
      this.add(this.abn);
      this.ih = new Class436(Class511.q("sc/d/35.png", 80, 10, 80, 10, (boolean)(2 & 5)));
      this.ih.setBounds(38, 30, 517, 20);
      this.add(this.ih);
      this.r = new Class436(Class511.q("sc/d/25.png", --2, --2, --2, --2, (boolean)(2 & 5)));
      this.bl = new Class436(Class511.q("sc/d/24.png", 5 >> 1, 5 >> 1, 5 >> 1, 5 >> 1, (boolean)(3 & 4)));
      this.r.setBounds(49, 78, 514, 21);
      this.bl.setBounds(49, 78, 514, 377);
      this.add(this.r);
      this.add(this.bl);
   }

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.aej.bl()) {
         this.d();
      }

   }
}
