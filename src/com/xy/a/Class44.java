package com.xy.a;

import com.xy.bean.FMBean;
import com.xy.bean.LoginResult;
import com.xy.readbean.Shop;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.JTextField;

public class Class44 extends com.xy.q.Class30 {
   private Class118 uq;
   private Class11 ur;
   private com.xy.i.Class18[] ts;
   private Class42 us;
   private int eg;
   private com.xy.w.Class18[] cl;

   public void lm(int var1) {
      if (this.uq != null) {
         Class118.aiq(this.uq, var1);

         int var2;
         for (int var10000 = var2 = 0; var10000 < Class118.ais(this.uq).length; var10000 = ++var2) {
            Class118.ais(this.uq)[var2].setKeep(var2 == Class118.ajc(this.uq));
         }

         if (var1 == 0) {
            this.bi(1);
            Class118.ajb(this.uq).l();
            Class118.ajd(this.uq).setVisible(true);
            Class118.aiy(this.uq).setVisible(false);
         } else {
            if (var1 == 1) {
               Class118.ain(this.uq)[0].l();
               Class118.ain(this.uq)[1].l();
               Class118.aiz(this.uq)[0].setText("0");
               Class118.aiz(this.uq)[1].setText("0");
               Class118.aiy(this.uq).setVisible(true);
               Class118.ajd(this.uq).setVisible(false);
            }
         }
      }
   }

   public void bi(int var1) {
      Map var10000 = this.yt().bg().getNpcShopMap();
      String var10001 = "U#V\"";
      List var2;
      if ((var2 = (List)var10000.get("3001")) == null) {
         var2 = new ArrayList();
      }

      Class118.ait(this.uq, 1 + (var2.size() - 1) / 8);
      if (Class118.aiw(this.uq) <= 0) {
         Class118.ait(this.uq, 1);
      }

      if (var1 > Class118.aiw(this.uq)) {
         var1 = Class118.aiw(this.uq);
      }

      if (var1 <= 0) {
         var1 = 1;
      }

      Class118.aiv(this.uq, var1);

      int var3;
      for (int var6 = var3 = (Class118.aja(this.uq) - 1) * 8; var6 < Class118.aja(this.uq) * 8; var6 = var3) {
         Shop var4 = var3 < var2.size() ? (Shop)var2.get(var3) : null;
         var1 = var3 % 8;
         com.xy.a.q.Class102[] var7 = Class118.air(this.uq);
         var3++;
         var7[var1].ov(var4);
      }

      com.xy.q.Class14 var8 = Class118.aix(this.uq);
      StringBuilder var9 = new StringBuilder(String.valueOf(Class118.aja(this.uq)));
      String var10002 = "\u0005";
      var8.setText(var9.append("/").append(Class118.aiw(this.uq)).toString());
   }

   public boolean du(long var1, JTextField var3) {
      return true;
   }

   @Override
   public boolean ah() {
      if (this.us != null) {
         Class42.ny(this.us, null);
      }

      return super.ah();
   }

   public void y(int var1) {
      if (var1 == 164) {
         String var9 = "A";
         String var6 = Agreement.getSendTextAES("fm", "R");
         this.za().k(var6);
      } else if (var1 == 167) {
         this.bi(1);
      } else if (var1 == 168) {
         this.bi(Class118.aiw(this.uq));
      } else if (var1 == 169) {
         this.bi(Class118.aja(this.uq) - 1);
      } else if (var1 == 170) {
         this.bi(Class118.aja(this.uq) + 1);
      } else if (var1 == 171) {
         long var5;
         if ((var5 = Class118.aiu(this.uq)[0].ee()) <= 0L) {
            String var8 = "边儎佊觪养按皮攛釥";
            this.afx._do("输入你要兑换的数量");
         } else {
            String var10 = "\"\"";
            String var7 = Agreement.getSendTextAES("fm", "D1" + var5);
            this.za().k(var7);
         }
      } else if (var1 == 172) {
         long var2;
         if ((var2 = Class118.aiu(this.uq)[1].ee()) <= 0L) {
            String var10001 = "边儎佊觪养按皮攛釥";
            this.afx._do("输入你要兑换的数量");
         } else {
            String var10003 = "\"!";
            String var4 = Agreement.getSendTextAES("fm", "D2" + var2);
            this.za().k(var4);
         }
      } else if (var1 == 311) {
         this.us.n(Class42.nw(this.us) - 1);
      } else {
         if (var1 == 312) {
            this.us.n(Class42.nw(this.us) + 1);
         }
      }
   }

   public void g(int var1) {
      if (var1 == 1) {
         String var2 = Agreement.getSendTextAES("fm", "");
         this.za().k(var2);
      } else {
         this.ot(var1, null);
      }
   }

   public Class44(GameView var1) {
      super(114, 2, com.xy.q.Class30.afz, var1);
      String var10003 = "\u0018IDND\u001bEZ\u0005M";
      this.yy(-1, 0, 620, 479, com.xy.q.Class30.agh);
      com.xy.w.Class9 var9 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10004 = "阫妅佩魇";
      this.yu(var9, "降妖伏魔");
      this.ts = new com.xy.i.Class18[3];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.ts.length; var10000 = var2) {
         com.xy.i.Class18[] var4 = this.ts;
         var10004 = "Y\b\u0005\u000e\u0005X\u0012EZ\u0005M";
         int var10006 = 161 + var2;
         String var11;
         Class44 var10010;
         if (var2 == 0) {
            var11 = "族妅阂魇";
            var11 = "斩妖除魔";
            var10010 = this;
         } else if (var2 == 1) {
            var11 = "禄刬揹吧";
            var11 = "积分排名";
            var10010 = this;
         } else if (var2 == 2) {
            var11 = "禉刕唠埝";
            var11 = "积分商城";
            var10010 = this;
         } else {
            var11 = "";
            var10010 = this;
         }

         com.xy.i.Class18 var10002 = new com.xy.i.Class18("sc/e/38.png", 2, var10006, com.xy.q.Class49.bx, com.xy.q.Class49.bv, var11, var10010);
         var4[var2] = var10002;
         this.ts[var2].setOffsetTexts(com.xy.q.Class49.d);
         this.ts[var2].setBounds(50 + 102 * var2, 18, 95, 33);
         this.add(this.ts[var2++]);
      }

      this.cl = new com.xy.w.Class18[1];

      for (int var5 = var2 = 0; var5 < this.cl.length; var5 = var2) {
         this.cl[var2] = new com.xy.w.Class18();
         if (var2 == 0) {
            com.xy.w.Class18 var10001 = this.cl[var2];
            String var7 = "Y\b\u0005\u000f\u0005X\u001fEZ\u0005M";
            var10001.mt(com.xy.w.Class16.m("sc/d/35.png", 80, 10, 80, 10, false));
            this.cl[var2].setBounds(30, 32, 560, 20);
         }

         this.add(this.cl[var2++]);
      }

      if (this.us == null) {
         this.add(this.us = new Class42(this), 1);
      }

      if (this.ur == null) {
         this.add(this.ur = new Class11(this), 1);
      }

      if (this.uq == null) {
         this.add(this.uq = new Class118(this), 1);
      }
   }

   public void ds(long var1, JTextField var3) {
      if (var3 == Class118.aiz(this.uq)[0]) {
         LoginResult var10000 = this.yx().getLoginResult();
         int var5 = var10000.getTurnAround();
         int var6 = com.xy.v.Class4.s(var10000.getGrade());
         long var7 = var5 <= 3 ? this.yt().ag(var5, var6) : 6000000000L;
         var7 = (long)(var7 * 0.002);
         com.xy.q.Class49.b(Class118.aio(this.uq)[0], var7 * var1);
      } else {
         if (var3 == Class118.aiz(this.uq)[1]) {
            com.xy.q.Class49.b(Class118.aio(this.uq)[1], 20L * var1);
         }
      }
   }

   public void ot(int var1, FMBean var2) {
      int var10000 = 0;
      this.eg = var1;

      for (int var3 = 0; var10000 < this.ts.length; var10000 = ++var3) {
         this.ts[var3].setKeep(var3 == this.eg);
      }

      if (var1 == 0) {
         if (this.us == null) {
            this.add(this.us = new Class42(this), 1);
         }

         if (Class42.nz(this.us) == null && Class42.nx(this.us) != null) {
            this.us.nv(Class42.nx(this.us));
         }

         this.us.n(0);
         this.us.setVisible(true);
         if (this.ur != null) {
            this.ur.setVisible(false);
         }

         if (this.uq != null) {
            this.uq.setVisible(false);
            return;
         }
      } else if (var1 == 1) {
         if (this.ur == null) {
            this.add(this.ur = new Class11(this), 1);
         }

         this.ur.el(var2);
         this.ur.setVisible(true);
         if (this.us != null) {
            this.us.setVisible(false);
         }

         if (this.uq != null) {
            this.uq.setVisible(false);
            return;
         }
      } else if (var1 == 2) {
         if (this.uq == null) {
            this.add(this.uq = new Class118(this), 1);
         }

         this.uq.t();
         this.lm(0);
         this.uq.setVisible(true);
         if (this.us != null) {
            this.us.setVisible(false);
         }

         if (this.ur != null) {
            this.ur.setVisible(false);
         }
      }
   }

   public Long dt(long var1, JTextField var3) {
      if (var1 < 0L) {
         return 0L;
      } else {
         long var4 = this.yx().getMoney(Class118.aip(this.uq));
         return var1 > var4 ? var4 : null;
      }
   }

   @Override
   public void l() {
      this.g(0);
      super.l();
   }
}
