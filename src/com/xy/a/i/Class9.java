package com.xy.a.i;

import com.xy.formula.MsgUntil;
import com.xy.q.Class49;
import com.xy.readbean.Goodstable;
import com.xy.readbean.LaborShop;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import java.awt.Graphics;
import java.awt.Image;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

public class Class9 extends com.xy.q.Class30 {
   private com.xy.w.Class18 kh;
   private LaborShop ki;
   private com.xy.i.Class11 ec;
   private List<Class46> kj;
   private Image g;
   private RichLabel h;
   private JLabel dh;
   private JLabel fs;
   private int eg;
   private RichLabel bj;

   // $VF: synthetic method
   static void hd(Class9 var0, int var1) {
      var0.eg = var1;
   }

   public LaborShop he() {
      return this.ki;
   }

   // $VF: synthetic method
   static LaborShop hf(Class9 var0) {
      return var0.ki;
   }

   public void hg(LaborShop var1) {
      this.ki = var1;
      RichLabel var10000 = this.h;
      String var10003 = "aK\u0006\u0010\u0001\u0018ui";
      StringBuilder var10001 = new StringBuilder("#cD8C07A");
      String var8;
      if (var1.getChoice() != null) {
         StringBuilder var10002 = new StringBuilder(String.valueOf(MsgUntil.h(var1.getGoods().length)));
         var10003 = "G\"遭s\u0016乐G\"祘s\u0016单";
         var8 = var10002.append("#r选#r一#r礼#r包").toString();
      } else {
         var8 = "祾\u000b0盺";
         var8 = "礼#r盒";
      }

      var10000.setTextSize(var10001.append(var8).toString(), 20);
      this.h.setBounds(8, 50, this.h.getWidth(), this.h.getHeight());
      this.dh.setText(var1.getName());
      this.kh.gt(com.xy.w.Class15.d(var1.getSkin()));
      this.bj.setTextSize(var1.getText(), 250);
      this.bj.setBounds(36, 220, this.bj.getWidth(), this.bj.getHeight());
      this.fs.setText(var1.getMoneyString(var1.getZk() != null ? com.xy.i.Class11.aeu(this.yx()) : 1.0));
      int var6 = 0;
      this.eg = -1;

      for (int var2 = 0; var6 < var1.getGoods().length; var6 = ++var2) {
         Class46 var3 = var2 < this.kj.size() ? this.kj.get(var2) : null;
         if (var3 == null) {
            var3 = new Class46(this, var2);
            var3.setBounds(317 + var2 % 3 * 52, 36 + var2 / 3 * 56, 52, 52);
            this.kj.add(var3);
            this.add(var3);
         }

         Goodstable var4;
         if ((var4 = this.yt().ay(new BigDecimal(var1.getGoods()[var2]))) != null) {
            var3.gs(1, var4);
         } else {
            var3.gs(0, null);
            var3.setVisible(true);
         }
      }

      int var5;
      for (int var7 = var5 = this.kj.size() - 1; var7 >= var1.getGoods().length; var7 = var5) {
         this.remove(this.kj.remove(var5--));
      }

      this.zc().b(this.lj());
   }

   @Override
   protected void paintChildren(Graphics var1) {
      super.paintChildren(var1);
      if (this.eg != -1) {
         Class46 var2 = this.eg < this.kj.size() ? this.kj.get(this.eg) : null;
         if (var2 != null) {
            if (this.g == null) {
               String var10001 = "#\u0007\u007f\u0006\u007f7cP`J \n7";
               this.g = com.xy.w.Class16.c("sc/b/S340.png");
            }

            var1.drawImage(this.g, var2.getX(), var2.getY(), null);
         }
      }
   }

   public Class9(GameView var1) {
      super(143, 2, com.xy.q.Class30.afz, var1);
      this.yy(-1, 0, 507, 372, com.xy.q.Class30.agh);
      this._do("sc/b/S334.png");
      this.h = new RichLabel("", Class49.aw);
      String var10015 = "G3\"g'aR\u0011";
      this.dh = com.xy.q.Class1.f(84, 58, 160, 20, 0, Class49.c("#cF7C16A"), Class49.ac);
      this.kh = new com.xy.w.Class18();
      this.kh.setBounds(114, 106, 88, 88);
      this.bj = new RichLabel();
      String var10010 = "aKt\u001bv\u001cp\u001c";
      this.fs = com.xy.q.Class1.f(212, 338, 160, 20, 10, Class49.c("#c634424"), Class49.aw);
      String var10006 = "#\u0007\u007f\u0006\u007f&dQgJ \n7";
      this.ec = new com.xy.i.Class11("sc/b/B457.png", 1, 54, this);
      this.ec.setBounds(428, 329, 68, 36);
      this.add(this.h);
      this.add(this.dh);
      this.add(this.kh);
      this.add(this.bj);
      this.add(this.fs);
      this.add(this.ec);
      this.kj = new ArrayList<>();
   }

   public int dx() {
      return this.eg;
   }
}
