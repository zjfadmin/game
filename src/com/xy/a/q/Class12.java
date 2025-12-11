package com.xy.a.q;

import com.xy.bean.PawnGoodsMessBean;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.math.BigDecimal;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Class12 extends com.xy.q.Class30 {
   private com.xy.i.Class19 kv;
   private com.xy.w.Class18 co;
   private com.xy.q.Class27[] kw;
   private com.xy.i.Class3[] kx;
   private BigDecimal bn;
   private JLabel[] o;
   private com.xy.q.Class21 ky;

   public boolean du(long var1, JTextField var3) {
      return true;
   }

   public void e() {
      RoleData var1 = this.yx();
      Goodstable var2 = this.bn != null ? var1.getGood(this.bn) : null;
      int var3 = Math.min((int)this.kw[0].ee(), var2 != null ? var2.getUsetime() : 0);
      if (var2 == null) {
         String var6 = "沚杸進乜皿爘哺";
         this.afx._do("没有选中的物品");
      } else if (var2.getGoodlock() == 1) {
         String var10001 = "爐咶裒勗镸";
         this.afx._do("物品被加锁");
      } else {
         PawnGoodsMessBean var4 = new PawnGoodsMessBean();
         var4.setRgid(var2.getRgid());
         var4.setNumber(var3);
         String var5 = Agreement.getSendTextAES("pawn", com.xy.v.Class31.a().toJson(var4));
         this.za().k(var5);
         var2.n(var3);
         if (var2.getUsetime() <= 0) {
            var1.ag(var2.getRgid());
         }

         this.h();
      }
   }

   public void ds(long var1, JTextField var3) {
   }

   public void f() {
      int var1 = this.yx().goodPacks.length / 24;
      if (this.kx == null || this.kx.length != var1) {
         this.kx = this.zd(this.kx, var1, this.ky.ah());
         short var2 = 357;
         byte var3 = 32;

         int var4;
         for (int var10000 = var4 = 0; var10000 < this.kx.length; var10000 = var4) {
            com.xy.i.Class3 var5 = this.kx[var4];
            int var10002 = var3 + var4 * 35;
            var4++;
            var5.setBounds(var2, var10002, 36, 33);
         }

         this.ky.vr(this.kx, 0);
      }
   }

   public Class12(GameView var1) {
      super(29, 2, com.xy.q.Class30.afz, var1);
      String var10009 = "\u0002X^_^\n_K\u001f\\";
      this.yy(-1, 0, 393, 383, com.xy.q.Class30.agh);
      com.xy.w.Class9 var14 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10010 = "儏弪";
      this.yu(var14, "典当");
      this.rm(false);
      this.wp(new com.xy.v.Class32(0, 0, 11, 0));
      String var10008 = "H\u0012\u0014\u0014\u0014C\r_K\u001f\\";
      String var10013 = "砙话儏弪";
      this.kv = new com.xy.i.Class19("sc/e/26.png", 1, 74, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "确认典当", this);
      this.kv.setBounds(153, 328, 99, 25);
      this.add(this.kv);
      this.kw = new com.xy.q.Class27[2];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.kw.length; var10000 = var2) {
         String var5 = "H\u0012\u0014\u0015\u0014@\f_K\u001f\\";
         com.xy.q.Class36 var3 = com.xy.q.Class1.j(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false), com.xy.q.Class49.w, Color.white);
         var3.setBounds(143, 264 + var2 * 26, 154, 19);
         var3.setHorizontalAlignment(10);
         this.add(var3);
         com.xy.q.Class27[] var10001 = this.kw;
         int var10002 = var2;
         com.xy.q.Class27 var10003 = new com.xy.q.Class27(15, var3, this);
         var2++;
         var10001[var10002] = var10003;
      }

      this.o = new JLabel[2];

      for (int var6 = var2 = 0; var6 < this.o.length; var6 = var2) {
         int var10004 = 264 + 26 * var2;
         var10008 = "T\u001aGIGIGI";
         this.o[var2] = com.xy.q.Class1.f(87, var10004, 56, 19, 0, com.xy.q.Class49.c("#c000000"), com.xy.q.Class49.ch);
         JLabel var7 = this.o[var2];
         String var9;
         if (var2 == 0) {
            var9 = "攁釴";
            var9 = "数量";
         } else if (var2 == 1) {
            var9 = "恌飤";
            var9 = "总额";
         } else {
            var9 = "";
         }

         var7.setText(var9);
         this.add(this.o[var2++]);
      }

      this.co = new com.xy.w.Class18();
      String var12 = "H\u0012\u0014\u0015\u0014@\u0002_K\u001f\\";
      this.co.mt(com.xy.w.Class16.m("sc/d/19.png", 30, 30, 30, 30, false));
      this.co.setBounds(48, 32, 309, 207);
      this.add(this.co);
      this.ky = new com.xy.q.Class21(this, 6, 4, 51, 51, 0, 0, 49, 34);
      String var10005 = "\n\u0014V\u0013VFAY\t\u0019\u001e";
      this.ky.gt(com.xy.w.Class16.c("sc/d/18.png"));
      this.ky.be(true);
      this.add(this.ky);
   }

   public Long dt(long var1, JTextField var3) {
      if (var1 == 0L) {
         return null;
      } else if (var1 < 0L) {
         return 0L;
      } else if (var3 == this.kw[0].ty()) {
         RoleData var4 = this.yx();
         Goodstable var5 = this.bn != null ? var4.getGood(this.bn) : null;
         if (var5 == null) {
            return 0L;
         } else {
            return var1 > var5.getUsetime().intValue() ? var5.getUsetime().longValue() : null;
         }
      } else {
         return 0L;
      }
   }

   public void hr(Goodstable var1, boolean var2) {
      if (!com.xy.v.Class12.x(this.bn, var1.getRgid())) {
         this.bn = var1.getRgid();
         this.kw[0].ty().setText(String.valueOf(0));
      }

      long var3 = var2 ? var1.getUsetime().intValue() : this.kw[0].ee() + 1L;
      this.kw[0].ty().setText(String.valueOf(var3));
   }

   public void h() {
      this.kw[0].ty().setText("0");
      this.kw[1].ty().setText("0");
      this.bn = null;
      this.ky.n(-1);
   }

   @Override
   public void l() {
      this.f();
      this.h();
      super.l();
   }
}
