package com.xy.a.a;

import com.xy.formula.BaseMountSH;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Class22 extends com.xy.q.Class30 {
   private com.xy.q.Class14[] bx;
   private com.xy.w.Class18 nn;
   private Class58 tl;
   private int ds;
   private Class11 tm;
   private JLabel[] au;

   public boolean du(long var1, JTextField var3) {
      return true;
   }

   public Long dt(long var1, JTextField var3) {
      if (var1 < 0L) {
         return 0L;
      } else {
         RoleData var4 = this.yx();
         long var5 = var4.getMoney(Class11.ii(this.tm)) / Class11.ik(this.tm);
         BaseMountSH var7;
         var5 = Math.min((long)(var7 = var4.getMountSHByindex(this.ds)).getExpTotal() - var7.getExp(), var5);
         return var1 > var5 ? var5 : null;
      }
   }

   public void y(int var1) {
      RoleData var2;
      BaseMountSH var3 = (var2 = this.yx()).getMountSHByindex(this.ds);
      if (var1 != 211 && var1 != 212) {
         if (var1 == 213) {
            Goodstable var9;
            if ((var9 = var2.au(107L)) == null || Class58.all(this.tl) > var9.getUsetime().intValue()) {
               this.afx._do("没有足够的灵元晶");
               return;
            }

            StringBuilder var12 = new StringBuilder("SHTP").append(var3.getId());
            String var5 = Agreement.getSendTextAES("usermount", var12.append("|").append(var9.getRgid()).toString());
            this.afx.getClient().k(var5);
         }
      } else {
         long var4 = var3.getExpTotal();
         long var6 = var1 == 211 ? Class11.ih(this.tm).ee() : var4 - var3.getExp();
         if (var6 <= 0L) {
            this.afx._do("提升修为点数不能为0");
         } else if (var2.getMoney(Class11.ii(this.tm)) < var6 * Class11.ik(this.tm)) {
            this.afx._do("金钱不足");
         } else {
            StringBuilder var10001 = new StringBuilder("SHXL").append(var3.getId());
            String var8 = Agreement.getSendTextAES("usermount", var10001.append("|").append(var6).toString());
            this.afx.getClient().k(var8);
         }
      }
   }

   public void h() {
      BaseMountSH var2;
      long var3 = (var2 = this.yx().getMountSHByindex(this.ds)).getExpTotal();
      this.bx[0].setText(BaseMountSH.SH_HEAD_NAME[this.ds]);
      this.bx[1].setText(String.valueOf(var2.getLvl()));
      com.xy.q.Class14 var10000 = this.bx[2];
      StringBuilder var10001 = new StringBuilder(String.valueOf(var2.getExp()));
      var10000.setText(String.valueOf(var10001.append("/").append(var3).toString()));
      if (var2.getExp() < var3) {
         this.tm.ig(var2);
         this.tm.setVisible(true);
         this.tl.setVisible(false);
      } else {
         this.tl.ig(var2);
         this.tl.setVisible(true);
         this.tm.setVisible(false);
      }
   }

   public void ds(long var1, JTextField var3) {
      com.xy.q.Class49.b(Class11.ij(this.tm), Class11.ik(this.tm) * var1);
   }

   public Class22(GameView var1) {
      super(174, 2, com.xy.q.Class30.afz, var1);
      this.yy(-1, 0, 342, 386, com.xy.q.Class30.agh);
      this.yu(com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false), "提升守护之力");
      this.wp(new com.xy.v.Class32(14, 0, 0, 44));
      this.au = new JLabel[4];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.au.length; var10000 = var2) {
         this.au[var2] = com.xy.q.Class1.k(65, 44 + 26 * var2, 72, 19, Color.black, com.xy.q.Class49.ch);
         JLabel var4 = this.au[var2];
         String var6;
         if (var2 == 0) {
            var6 = "守护之力";
         } else if (var2 == 1) {
            var6 = "等级";
         } else if (var2 == 2) {
            var6 = "修为点";
         } else {
            var6 = "";
         }

         var4.setText(var6);
         this.au[var2].setHorizontalAlignment(10);
         if (var2 == 3) {
            this.au[var2].setBounds(65, 140, 130, 19);
         }

         this.add(this.au[var2++]);
      }

      this.bx = new com.xy.q.Class14[3];

      for (int var5 = var2 = 0; var5 < this.bx.length; var5 = var2) {
         this.bx[var2] = com.xy.q.Class1.i(138, 44 + var2 * 26, 134, 19, 0, Color.white, com.xy.q.Class49.w);
         com.xy.q.Class14 var9 = this.bx[var2];
         String var10003 = "\u0011+M,MyUf\u0012&\u0005";
         var9.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
         this.add(this.bx[var2++]);
      }

      this.tm = new Class11(this);
      this.tl = new Class58(this);
      this.tm.setBounds(65, 175, 250, 135);
      this.tl.setBounds(65, 175, 250, 135);
      this.add(this.tm);
      this.add(this.tl);
      this.nn = new com.xy.w.Class18();
      String var10006 = "YL\u0005K\u0005\u0019\u001c\u0001ZAM";
      this.nn.mt(com.xy.w.Class16.m("sc/d/66.png", 100, 1, 100, 1, false));
      this.nn.setBounds(65, 163, 241, 2);
      this.add(this.nn);
   }

   public void g(int var1) {
      this.ds = var1;
      this.h();
      this.zc().b(this.lj());
   }
}
