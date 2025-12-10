package com.xy;

import com.xy.bean.PawnGoodsMessBean;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.math.BigDecimal;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Class242 extends Class345 {
   private BigDecimal ge;
   private Class319[] ak;
   private Class436 r;
   private Class529 k;
   private Class585 aym;
   private JLabel[] u;

   public void p() {
      RoleData var4 = this.vd();
      Goodstable var2 = this.ge != null ? var4.getGood(this.ge) : null;
      int var3 = Math.min((int)this.ak[3 ^ 3].gl(), var2 != null ? var2.getUsetime() : 0);
      if (var2 == null) {
         this.aej.f("没有选中的物品");
      } else if (var2.getGoodlock() == (4 ^ 5)) {
         this.aej.f("物品被加锁");
      } else {
         PawnGoodsMessBean var1 = new PawnGoodsMessBean();
         var1.setRgid(var2.getRgid());
         var1.setNumber(var3);
         String var5 = Agreement.getSendTextAES("pawn", Class695.b().toJson(var1));
         this.uw().d(var5);
         var2.ab(var3);
         if (var2.getUsetime() <= 0) {
            var4.h(var2.getRgid());
         }

         this.s();
      }
   }

   public Class242(GameView var1) {
      int var10001 = 1 ^ 3;
      int var10007 = 2 & 5;
      int var10011 = -4 >> 2;
      super(93 & 63, 5 >> 1, Class345.aef, var1);
      this.va(var10011, 2 & 5, 11769 & 21391, 8575 & 24575, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 86 & 109, 86 & 109, 86 & 109, 86 & 109, (boolean)(5 >> 3)), "典当");
      this.ak((boolean)var10007);
      this.ad(new Class116(2 & 5, 2 & 5, 11 & 127, 2 & 5));
      this.k = new Class529("sc/e/26.png", 2 ^ 3, 107 & 94, Class681.ak, Class681.c, "确认典当", this);
      this.k.setBounds(9689 & 23231, 7003 & 26092, 123 & 103, 91 & 61);
      this.add(this.k);
      Class319[] var4 = new Class319[var10001];
      boolean var10003 = true;
      this.ak = var4;

      int var3;
      int var10000;
      for(var10000 = var3 = 3 ^ 3; var10000 < this.ak.length; var10000 = var3) {
         Class217 var2 = Class133.n(Class511.q("sc/d/17.png", --3, --3, --3, --3, (boolean)(3 & 4)), Class681.q, Color.white);
         int var6 = 127 & 10;
         var2.setBounds(20383 & 12527, (18926 & 14105) + var3 * (95 & 58), 17914 & 15007, 59 & 87);
         var2.setHorizontalAlignment(var6);
         this.add(var2);
         var4 = this.ak;
         int var10002 = var3;
         Class319 var7 = new Class319(15, var2, this);
         ++var3;
         var4[var10002] = var7;
      }

      JLabel[] var5 = new JLabel[1 ^ 3];
      var10003 = true;
      this.u = var5;

      for(var10000 = var3 = 2 & 5; var10000 < this.u.length; var10000 = var3) {
         this.u[var3] = Class133.c(87, 264 + 26 * var3, 56, 19, 3 ^ 3, Class681.c("#c000000"), Class681.ak);
         this.u[var3].setText(var3 == 0 ? "数量" : (var3 == 5 >> 2 ? "总额" : ""));
         this.add(this.u[var3++]);
      }

      this.r = new Class436();
      this.r.eq(Class511.q("sc/d/19.png", 30, 30, 30, 30, (boolean)(5 >> 3)));
      this.r.setBounds(48, 32, 309, 207);
      this.add(this.r);
      this.aym = new Class585(this, 6, --4, 51, 51, 3 & 4, 3 & 4, 49, 34);
      this.aym.hf(Class511.a("sc/d/18.png"));
      this.aym.ak((boolean)(--1));
      this.add(this.aym);
   }

   public boolean aa(long var1, JTextField var3) {
      return (boolean)(3 & 5);
   }

   public void z(long var1, JTextField var3) {
   }

   public void s() {
      this.ak[5 >> 3].jj().setText("0");
      this.ak[3 >> 1].jj().setText("0");
      this.ge = null;
      this.aym.y(-4 >> 2);
   }

   public void d() {
      Class216[] var10001;
      Class242 var10002;
      if (this.aym.aiz() != null) {
         var10001 = this.aym.aiz().f();
         var10002 = this;
      } else {
         var10001 = null;
         var10002 = this;
      }

      Class216[] var1 = this.vg(var10001, var10002.vd().goodPacks.length / (94 & 57), this.aym.t(), 3 & 4, 19965 & 13159, 106 & 53);
      this.aym.aiw(var1, 2 & 5);
   }

   public void oj(Goodstable var1, boolean var2) {
      if (!Class394.v(this.ge, var1.getRgid())) {
         this.ge = var1.getRgid();
         this.ak[5 >> 3].jj().setText(String.valueOf(3 >> 2));
      }

      long var3 = var2 ? (long)var1.getUsetime() : this.ak[3 & 4].gl() + 1L;
      this.ak[3 & 4].jj().setText(String.valueOf(var3));
   }

   public Long x(long var1, JTextField var3) {
      if (var1 == 0L) {
         return null;
      } else if (var1 < 0L) {
         return 0L;
      } else if (var3 == this.ak[3 ^ 3].jj()) {
         RoleData var5 = this.vd();
         Goodstable var4 = this.ge != null ? var5.getGood(this.ge) : null;
         if (var4 == null) {
            return 0L;
         } else {
            return var1 > (long)var4.getUsetime() ? var4.getUsetime().longValue() : null;
         }
      } else {
         return 0L;
      }
   }

   public void q() {
      this.d();
      this.s();
      super.q();
   }
}
