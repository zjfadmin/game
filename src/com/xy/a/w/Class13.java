package com.xy.a.w;

import com.xy.bean.BeauBean;
import com.xy.bean.UseCardBean;
import com.xy.game.RoleData;
import com.xy.i.Class18;
import com.xy.i.Class20;
import com.xy.q.Class49;
import com.xy.q.Class52;
import com.xy.readbean.MoneyType;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import javax.swing.JLabel;

public class Class13 extends com.xy.q.Class30 {
   private com.xy.i.Class20 qo;
   private Class52 qp;
   private RichLabel ed;
   private RichLabel in;
   private com.xy.w.Class18[] fd;
   private com.xy.i.Class20[] pe;
   private com.xy.q.Class14 oo;
   private JLabel[] o;
   private int ah;

   public void y(int var1) {
      int var10000 = 0;
      this.ah = var1;

      for (int var2 = 0; var10000 < this.pe.length; var10000 = ++var2) {
         this.pe[var2].setKeep(var2 == var1);
         this.pe[var2].setForeground(var2 == var1 ? Color.green : Color.white);
      }

      UseCardBean var4;
      BeauBean var3 = (var4 = this.yx().getLimit("靓号")) != null ? var4.a() : null;
      Class13 var5;
      if (var3 == null) {
         this.in.setTextSize("", 260);
         var5 = this;
      } else {
         RichLabel var6 = this.in;
         String var10003 = "(NI]JM";
         StringBuilder var10001 = new StringBuilder("#VBEAU").append(var3.getLvl()).append(",").append(var3.getBeau()).append(",").append(var1 + 1);
         String var10002 = "\u000fZ";
         var6.setTextSize(var10001.append("#L").toString(), 260);
         var5 = this;
      }

      var5.in.setBounds(50 + (260 - this.in.getWidth()) / 2, 82, this.in.getWidth(), this.in.getHeight());
   }

   public Class13(GameView var1) {
      super(184, 2, com.xy.q.Class30.afz, var1);
      String var10003 = "x{$|$)%he\u007f";
      this.yy(-1, 0, 342, 355, com.xy.q.Class30.agh);
      com.xy.w.Class9 var23 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10004 = "靿叡柿艤";
      this.yu(var23, "靓号染色");
      this.pe = new com.xy.i.Class20[4];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.pe.length; var10000 = var2) {
         com.xy.i.Class20[] var6 = this.pe;
         var10004 = "x{$}$)3-%he\u007f";
         int var10006 = 391 + var2;
         String var30;
         Class13 var10010;
         if (var2 == 0) {
            var30 = "氘泴蓱玟";
            var30 = "水波蓝玉";
            var10010 = this;
         } else if (var2 == 1) {
            var30 = "静玑纩沙";
            var30 = "青玉红沁";
            var10010 = this;
         } else if (var2 == 2) {
            var30 = "梩枋癑玟";
            var30 = "梅枝白玉";
            var10010 = this;
         } else if (var2 == 3) {
            var30 = "溩影浊兑";
            var30 = "溢彩流光";
            var10010 = this;
         } else {
            var30 = "";
            var10010 = this;
         }

         Class20 var10002 = new Class20("sc/e/185.png", 2, var10006, Class49.bz, null, var30, var10010);
         var6[var2] = var10002;
         this.pe[var2].setBounds(47 + 66 * var2, 201, 60, 22);
         this.add(this.pe[var2++]);
      }

      String var34 = "eO9I9\u001e \u0002fBq";
      String var10014 = "硥宂柘艪";
      this.qo = new com.xy.i.Class20("sc/e/26.png", 1, 390, Class49.ch, null, "确定染色", this);
      this.qo.setBounds(129, 311, 99, 25);
      this.qo.setForeground(Color.black);
      this.add(this.qo);
      this.o = new JLabel[4];

      for (int var7 = var2 = 0; var7 < this.o.length; var7 = var2) {
         this.o[var2] = com.xy.q.Class1.k(50, 32, 260, 21, var2 == 0 ? Color.white : Color.black, Class49.ch);
         JLabel var8 = this.o[var2];
         String var12;
         if (var2 == 0) {
            var12 = "柿艤敤枊";
            var12 = "染色效果";
         } else if (var2 == 1) {
            var12 = "柘艪斲桐";
            var12 = "染色方案";
         } else if (var2 == 2) {
            var12 = "涤老秃刐";
            var12 = "消耗积分";
         } else if (var2 == 3) {
            var12 = "拮朑秤刞";
            var12 = "拥有积分";
         } else {
            var12 = "";
         }

         var8.setText(var12);
         this.o[var2].setHorizontalAlignment(var2 == 0 ? 0 : 10);
         Class13 var9;
         if (var2 == 1) {
            var9 = this;
            this.o[var2].setBounds(48, 157, 72, 19);
         } else if (var2 == 2) {
            var9 = this;
            this.o[var2].setBounds(70, 243, 72, 19);
         } else {
            if (var2 == 3) {
               this.o[var2].setBounds(70, 271, 72, 19);
            }

            var9 = this;
         }

         var9.add(this.o[var2++]);
      }

      this.ed = new RichLabel("", Class49.n);
      String var10005 = "5O&\u001c&\u001c&\u001c柅艞吘\u000fujP\u001c&\u001c&弬逌颽遅昒礬\u000fu\u001c&\u001c&\u001c&參籭伐圉豆采昒礬";
      this.ed.setTextSize("#c000000染色后#cFF0000开通频道显示#c000000可类似土豪金显示", 260);
      this.ed.setBounds(50, 177, this.ed.getWidth(), this.ed.getHeight());
      this.add(this.ed);
      this.oo = com.xy.q.Class1.i(154, 243, 134, 19, 10, Color.white, Class49.w);
      var10005 = "kh7o7:/%he\u007f";
      this.oo.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      this.add(this.oo);
      MoneyType var5 = new MoneyType();
      String var28 = "秃刐";
      var5.setIdAndKey(4, "积分");
      this.qp = com.xy.q.Class1.m(154, 271, 134, 19, 10, Color.white, Class49.w, var5, var1);
      var28 = "kh7o7:/%he\u007f";
      this.qp.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      this.add(this.qp);
      this.in = new RichLabel("", Class49.w);
      this.add(this.in);
      this.fd = new com.xy.w.Class18[3];

      int var3;
      for (int var10 = var3 = 0; var10 < this.fd.length; var10 = var3) {
         this.fd[var3] = new com.xy.w.Class18();
         Class13 var11;
         if (var3 == 0) {
            var11 = this;
            com.xy.w.Class18 var19 = this.fd[var3];
            var10003 = "eO9H9\u001a \u0002fBq";
            var19.mt(com.xy.w.Class16.m("sc/d/66.png", 100, 1, 100, 1, false));
            this.fd[var3].setBounds(50, 232, 260, 2);
         } else if (var3 == 1) {
            var11 = this;
            com.xy.w.Class18 var20 = this.fd[var3];
            var10003 = "kh7o79-%he\u007f";
            var20.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            this.fd[var3].setBounds(50, 32, 260, 21);
         } else {
            if (var3 == 2) {
               com.xy.w.Class18 var16 = this.fd[var3];
               String var21 = "eO9H9\u001e\"\u0002fBq";
               var16.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
               this.fd[var3].setBounds(50, 32, 260, 120);
            }

            var11 = this;
         }

         var11.add(this.fd[var3++]);
      }
   }

   public boolean dh() {
      RoleData var1;
      if ((var1 = this.yx()) == null) {
         return false;
      } else {
         UseCardBean var2;
         BeauBean var3 = (var2 = var1.getLimit("靓号")) != null ? var2.a() : null;
         if (var3 == null) {
            return false;
         } else {
            Class49.b(this.oo, 30L);
            this.y(Math.max(0, var3.getSkin() - 1));
            return true;
         }
      }
   }

   public void g(int var1) {
      if (var1 == 390) {
         String var10003 = "[";
         String var2 = Agreement.getSendTextAES("BEAU", "C" + (this.ah + 1));
         this.za().k(var2);
      }
   }

   @Override
   public void l() {
      if (this.dh()) {
         super.l();
      }
   }
}
