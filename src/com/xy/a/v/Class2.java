package com.xy.a.v;

import com.xy.readbean.Activity;
import com.xy.readbean.ActivityFC;
import com.xy.richtext.RichLabel;
import java.awt.Color;
import javax.swing.JLabel;

public class Class2 extends com.xy.q.Class30 {
   private JLabel[] ch;
   private Class27 ci;
   private RichLabel h;
   private RichLabel bk;
   private RichLabel cj;
   private RichLabel ck;
   private com.xy.w.Class18[] cl;

   public void h() {
      Activity var1 = this.ci.wg();

      int var2;
      for (int var10000 = var2 = 0; var10000 < 4; var10000 = ++var2) {
         RichLabel var3 = var2 == 0 ? this.cj : (var2 == 1 ? this.ck : (var2 == 2 ? this.h : this.bk));
         String var6 = var1.getActivitySet();
         String var7;
         if (var2 == 0) {
            var7 = "冺冮奌劄屏礏'";
            var7 = "冠军奖励展示=";
         } else if (var2 == 1) {
            var7 = "仹凴夵勞尶祕^";
            var7 = "亚军奖励展示=";
         } else if (var2 == 2) {
            var7 = "孹冮奌劄屏礏'";
            var7 = "季军奖励展示=";
         } else {
            var7 = "毜凴夵勞尶祕^";
            var7 = "殿军奖励展示=";
         }

         String var10002 = "f";
         int var4;
         ActivityFC var5 = (var4 = com.xy.v.Class12.f(var6, var7, "|")) > 0 ? this.yt().ba(var4) : null;
         var3.setTextSize(var5 != null ? var5.getValue() : "", 168);
         if (var2 == 0) {
            var3.setBounds(328, 337, var3.getWidth(), var3.getHeight());
         } else if (var2 == 1) {
            var3.setBounds(506, 358, var3.getWidth(), var3.getHeight());
         } else if (var2 == 2) {
            var3.setBounds(185, 358, var3.getWidth(), var3.getHeight());
         } else if (var2 == 3) {
            var3.setBounds(58, 373, var3.getWidth(), var3.getHeight());
         }
      }
   }

   public Class2(Class27 var1) {
      super(-1, -1, com.xy.q.Class30.agf, var1.afx);
      this.yy(0, 0, 718, 526, com.xy.q.Class30.agf);
      this.ci = var1;
      this.ch = new JLabel[4];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.ch.length; var10000 = var2) {
         this.ch[var2] = com.xy.q.Class1.k(318, 318, 178, 20, Color.YELLOW, com.xy.q.Class49.w);
         JLabel var4 = this.ch[var2];
         String var8;
         if (var2 == 0) {
            var8 = "冕冁奣劫牜哛";
            var8 = "冠军奖励物品";
         } else if (var2 == 1) {
            var8 = "仵凸夹勒爆咢";
            var8 = "亚军奖励物品";
         } else if (var2 == 2) {
            var8 = "孖冁奣劫牜哛";
            var8 = "季军奖励物品";
         } else if (var2 == 3) {
            var8 = "毐凸夹勒爆咢";
            var8 = "殿军奖励物品";
         } else {
            var8 = "";
         }

         var4.setText(var8);
         this.ch[var2].setHorizontalAlignment(0);
         Class2 var5;
         if (var2 == 1) {
            var5 = this;
            this.ch[var2].setBounds(496, 338, 141, 20);
         } else if (var2 == 2) {
            var5 = this;
            this.ch[var2].setBounds(185, 338, 133, 20);
         } else {
            if (var2 == 3) {
               this.ch[var2].setBounds(59, 353, 126, 20);
            }

            var5 = this;
         }

         var5.add(this.ch[var2++]);
      }

      this.cj = new RichLabel("", com.xy.q.Class49.bz);
      this.add(this.cj);
      this.ck = new RichLabel("", com.xy.q.Class49.bz);
      this.add(this.ck);
      this.h = new RichLabel("", com.xy.q.Class49.bz);
      this.add(this.h);
      this.bk = new RichLabel("", com.xy.q.Class49.bz);
      this.add(this.bk);
      this.cl = new com.xy.w.Class18[2];

      for (int var6 = var2 = 0; var6 < this.cl.length; var6 = var2) {
         this.cl[var2] = new com.xy.w.Class18();
         Class2 var7;
         if (var2 == 0) {
            var7 = this;
            com.xy.w.Class18 var13 = this.cl[var2];
            String var10003 = "Fy\u001a~\u001a+\u0007#\u001bj[}";
            var13.dp("sc/d/129.png");
            this.cl[var2].setBounds(113, 2, 160, 57);
         } else {
            if (var2 == 1) {
               com.xy.w.Class18 var12 = this.cl[var2];
               String var14 = "\u001c\u0000@\u0007@R[[A\u0013\u0001\u0004";
               var12.dp("sc/d/148.png");
               this.cl[var2].setBounds(11, 31, 692, 457);
            }

            var7 = this;
         }

         var7.add(this.cl[var2++]);
      }
   }
}
