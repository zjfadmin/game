package com.xy.a;

import com.xy.readbean.AllMapBean;
import com.xy.readbean.MapModel;
import com.xy.richtext.InputBean;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class Class29 extends com.xy.q.Class30 {
   private JScrollPane ip;
   private MapModel qw;
   private com.xy.w.Class18[] bb;
   private com.xy.q.Class44 qx;
   private MapModel qy;
   private com.xy.i.Class20[] el;
   private RichLabel h;
   private InputBean qz;
   private JLabel[] gj;
   private com.xy.q.Class44 ra;
   private com.xy.i.Class18 me;

   public Class29(GameView var1) {
      super(156, 2, com.xy.q.Class30.afz, var1);
      String var10010 = "\u0002X^_^\n_K\u001f\\";
      this.yy(-1, 0, 400, 250, com.xy.q.Class30.agh);
      this.yu(com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false), null);
      this.ra = new com.xy.q.Class44(2, 100, this);
      this.qx = new com.xy.q.Class44(2, 100, this);
      this.ra.rm(true);
      this.qx.rm(true);
      this.ra.zb(47, 35, 115, 20);
      this.qx.zb(188, 35, 115, 20);
      this.add(this.ra);
      this.add(this.qx);
      String var10011 = "\u0002X^^^\f_K\u001f\\";
      this.me = new com.xy.i.Class18("sc/e/7.png", 1, 291, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "", this);
      this.me.setBounds(311, 33, 59, 25);
      String var10007 = "摭紙";
      this.me.setText("搜索");
      this.add(this.me);
      this.gj = new JLabel[2];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.gj.length; var10000 = var2) {
         this.gj[var2] = com.xy.q.Class1.k(25 + 141 * var2, 35, 18, 20, Color.black, com.xy.q.Class49.ch);
         JLabel var10 = this.gj[var2];
         String var15;
         if (var2 == 0) {
            var15 = "仵";
            var15 = "从";
         } else if (var2 == 1) {
            var15 = "刋";
            var15 = "到";
         } else {
            var15 = "";
         }

         var10.setText(var15);
         this.gj[var2].setHorizontalAlignment(0);
         this.add(this.gj[var2++]);
      }

      this.h = new RichLabel("", com.xy.q.Class49.w);
      this.h.addMouseListener(new Class79(this));
      this.ip = com.xy.q.Class1.g(34, 85, 336, 138, this.h, 20);
      this.add(this.ip);
      ArrayList var6 = new ArrayList();
      AllMapBean var3;
      Iterator var5 = (var3 = this.yt().af()).getAllMap().values().iterator();
      Iterator var11 = var5;

      while (var11.hasNext()) {
         MapModel var4 = (MapModel)var5.next();
         var11 = var5;
         var6.add(var4.getMapId());
      }

      int var12 = 0;
      Collections.sort(var6);

      for (int var7 = 0; var12 < var6.size(); var12 = var7) {
         MapModel var9 = var3.getAllMap().get(((Long)var6.get(var7)).toString());
         this.ra.li(new com.xy.q.Class60(var9.getMapName(), var9.getMapId()));
         com.xy.q.Class44 var13 = this.qx;
         String var10003 = var9.getMapName();
         long var10004 = var9.getMapId();
         var7++;
         var13.li(new com.xy.q.Class60(var10003, var10004));
      }

      this.bb = new com.xy.w.Class18[2];

      int var8;
      for (int var14 = var8 = 0; var14 < this.bb.length; var14 = ++var8) {
         this.bb[var8] = new com.xy.w.Class18();
         this.add(this.bb[var8]);
         if (var8 == 0) {
            com.xy.w.Class18 var17 = this.bb[var8];
            String var19 = "H\u0012\u0014\u0015\u0014C\u000e_K\u001f\\";
            var17.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            this.bb[var8].setBounds(30, 65, 340, 21);
         } else if (var8 == 1) {
            com.xy.w.Class18 var18 = this.bb[var8];
            String var20 = "H\u0012\u0014\u0015\u0014C\u000f_K\u001f\\";
            var18.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
            this.bb[var8].setBounds(30, 65, 340, 160);
         }
      }
   }

   public void h() {
      if (this.qw != null && this.qy != null && this.qw != this.qy) {
         this.h.setTextSize(this.yt().y().c(this.qw, this.qy, this.yx()), 316);
      } else {
         this.h.setTextSize("", 316);
      }
   }

   // $VF: synthetic method
   static InputBean mb(Class29 var0) {
      return var0.qz;
   }

   public void mc(MapModel var1) {
      this.qz = null;
      this.ra.gw(var1.getMapId());
      this.qx.gw(var1.getMapId());
      this.zc().b(this.lj());
   }

   // $VF: synthetic method
   static void md(Class29 var0, InputBean var1) {
      var0.qz = var1;
   }

   public void me(long var1, com.xy.q.Class44 var3) {
      MapModel var4;
      if ((var4 = this.yt().g(String.valueOf(var1))) != null) {
         Class29 var10000;
         if (this.ra == var3) {
            var10000 = this;
            this.qw = var4;
         } else {
            if (this.qx == var3) {
               this.qy = var4;
            }

            var10000 = this;
         }

         var10000.h();
      }
   }

   public void g(int var1) {
   }

   // $VF: synthetic method
   static RichLabel mf(Class29 var0) {
      return var0.h;
   }
}
