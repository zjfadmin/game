package com.xy.a.i;

import com.xy.game.RoleData;
import com.xy.q.Class49;
import com.xy.readbean.Activity;
import com.xy.readbean.ActivityFC;
import com.xy.readbean.ActivityFCBase;
import com.xy.readbean.ActivityFCBuy;
import com.xy.readbean.Goodstable;
import com.xy.readbean.LaborShop;
import com.xy.readbean.MoneyType;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.math.BigDecimal;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Class47 extends com.xy.q.Class30 {
   private JLabel cy;
   private JLabel cz;
   private com.xy.i.Class11 axo;
   private MoneyType br;
   private JLabel dc;
   private LaborShop axp;
   private ActivityFC axq;
   private com.xy.q.Class27 axr;
   private com.xy.w.Class18 gf;
   private Activity axs;
   private JTextField axt;
   private JLabel dh;
   private JLabel fs;
   private JLabel di;
   private JLabel im;

   public Activity wg() {
      return this.axs;
   }

   public void ds(long var1, JTextField var3) {
      if (this.axp != null) {
         Class49.b(this.fs, this.axp.getMoney() * var1);
      } else {
         if (this.axq != null) {
            Class49.b(this.fs, ((ActivityFCBuy)this.axq.getData()).getUses()[0].getNum() * var1);
         }
      }
   }

   public boolean du(long var1, JTextField var3) {
      return true;
   }

   public void hg(LaborShop var1) {
      this.axq =null; this.axs = null;
      this.br = null;
      this.axp = var1;
      String var2 = var1.getMoneyType().substring(var1.getMoneyType().length() - 2, var1.getMoneyType().length());
      String var10010 = "涏聿";
      this.dh.setText("消耗" + var2);
      String var10009 = "拕朊";
      this.im.setText("拥有" + var2);
      this.cz.setText(var1.getName());
      this.gf.gt(com.xy.w.Class15.d(var1.getSkin()));
      this.di.setText(String.valueOf(var1.getMoney()));
      this.h();
      this.axt.setText("1");
      this.zc().b(this.lj());
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.afx.dh()) {
         this.h();
      }
   }

   public ActivityFC anj() {
      return this.axq;
   }

   public Class47(GameView var1) {
      super(144, 2, com.xy.q.Class30.afz, var1);
      String var10010 = "\u001bdGeGT[4])\u0018i\u000f";
      this.yy(-1, 0, 426, 462, com.xy.q.Class30.agf);
      this._do("sc/b/S335.png");
      String var10013 = "\u0013`\u00061\u0005;\u0004@";
      this.dc = com.xy.q.Class1.f(170, 319, 75, 16, 10, Class49.c("#c62584C"), Class49.k);
      String var10011 = "$\u000b1Z2P3+";
      this.dh = com.xy.q.Class1.f(170, 349, 75, 16, 10, Class49.c("#c62584C"), Class49.k);
      String var10009 = "\u0013`\u00061\u0005;\u0004@";
      this.im = com.xy.q.Class1.f(170, 379, 75, 16, 10, Class49.c("#c62584C"), Class49.k);
      String var10003 = "贪丘敷醧";
      this.dc.setText("购买数量");
      this.add(this.dc);
      this.add(this.dh);
      this.add(this.im);
      this.axt = com.xy.q.Class1.n(Class49.bm, Color.white);
      this.axt.setBounds(250, 317, 144, 20);
      this.axr = new com.xy.q.Class27(15, this.axt, this);
      this.fs = com.xy.q.Class1.f(250, 347, 144, 20, 10, Color.white, Class49.bm);
      this.cy = com.xy.q.Class1.f(250, 377, 144, 20, 10, Color.white, Class49.bm);
      this.add(this.axt);
      this.add(this.fs);
      this.add(this.cy);
      this.cz = com.xy.q.Class1.f(73, 20, 277, 28, 0, Color.white, Class49.k);
      this.gf = new com.xy.w.Class18();
      this.gf.setBounds(150, 77, 120, 120);
      this.di = com.xy.q.Class1.f(210, 223, 144, 20, 10, Color.green, Class49.aw);
      String var10012 = "pS,R,r7\u00054\u001es^d";
      this.axo = new com.xy.i.Class11("sc/b/B457.png", 1, 55, this);
      this.axo.setBounds(346, 420, 68, 36);
      this.add(this.cz);
      this.add(this.gf);
      this.add(this.di);
      this.add(this.axo);
   }

   public void ank(Activity var1, ActivityFC var2) {
      this.axs = var1;
      this.axq = var2;
      this.br = null;
      this.axp = null;
      String var3 = null;
      ActivityFCBuy var10000 = (ActivityFCBuy)var2.getData();
      ActivityFCBase var5 = var10000.getGains()[0];
      ActivityFCBase var6 = var10000.getUses()[0];
      ActivityFCBase var11;
      if (var5.getType() == 1) {
         com.xy.v.Class26 var7 = var1.getPointKey(var5.getId());
         JLabel var10 = this.cz;
         StringBuilder var10001 = new StringBuilder(String.valueOf(var5.getNum()));
         String var10002;
         if (var7 != null) {
            var10002 = var7.a;
         } else {
            var10002 = "札瞍秨剮";
            var10002 = "未知积分";
         }

         var10.setText(var10001.append(var10002).toString());
         var11 = var6;
         var10002 = ":\u00000";
         this.gf.gt(com.xy.w.Class15.d("903"));
      } else if (var5.getType() == 2) {
         Goodstable var8 = this.yt().ay(new BigDecimal(var5.getId()));
         this.cz.setText(var8 != null ? var8.getGoodsname() : "");
         var11 = var6;
         this.gf.gt(com.xy.w.Class15.d(var8.getSkin()));
      } else if (var5.getType() == 3) {
         var11 = var6;
         String var10003 = "隈杒契務";
         this.cz.setText("随机奖励");
         String var18 = ":\u00000";
         this.gf.gt(com.xy.w.Class15.d("903"));
      } else if (var5.getType() == 4) {
         var11 = var6;
         this.cz.setText(var5.getNum() + var5.getKey());
         String var19 = "Q7[";
         this.gf.gt(com.xy.w.Class15.d("903"));
      } else {
         this.dc.setText("");
         this.gf.l();
         var11 = var6;
      }

      Class47 var14;
      if (var11.getType() == 1) {
         com.xy.v.Class26 var9;
         String var12;
         if ((var9 = var1.getPointKey(var6.getId())) != null) {
            var12 = var9.a;
         } else {
            String var13 = "朚矦租刅";
            var12 = "未知积分";
         }

         var3 = var12;
         var14 = this;
         this.br = new MoneyType(-2, (long)var1.getId() << 32 | var6.getId());
      } else {
         if (var6.getType() == 4) {
            var3 = var6.getKey();
            this.br = new MoneyType(ActivityFC.getActivityMoneyKey(var3), 0L);
            if (this.br.getId() == 0) {
               this.br.setKey(var3);
            }
         }

         var14 = this;
      }

      String var20 = "涏聿";
      var14.dh.setText("消耗" + var3);
      String var10007 = "拕朊";
      this.im.setText("拥有" + var3);
      this.di.setText(String.valueOf(var6.getNum()));
      this.h();
      this.axt.setText("1");
      this.zc().b(this.lj());
   }

   public long ee() {
      return this.axr.ee();
   }

   public void h() {
      if (this.axp != null) {
         Class49.b(this.cy, com.xy.i.Class11.aes(this.axp, this.yx()).longValue());
      } else {
         if (this.axq != null) {
            Class49.b(this.cy, this.yx().getMoney(this.br));
         }
      }
   }

   public Long dt(long var1, JTextField var3) {
      if (var1 == 0L) {
         return null;
      } else if (var1 < 0L) {
         return 0L;
      } else {
         RoleData var4 = this.yx();
         if (this.axp != null) {
            long var11;
            if ((var11 = com.xy.i.Class11.aes(this.axp, var4).longValue() / this.axp.getMoney()) > 999L) {
               var11 = 999L;
            }

            return var1 > var11 ? var11 : null;
         } else if (this.axq != null) {
            long var5 = var1;
            ActivityFCBuy var7 = (ActivityFCBuy)this.axq.getData();

            int var8;
            for (int var10000 = var8 = 0; var10000 < var7.getUses().length; var10000 = ++var8) {
               ActivityFCBase var9;
               if ((var9 = var7.getUses()[var8]).getType() == 1) {
                  var5 = Math.min(var5, var4.getActivityMoney(this.axs.getId(), var9.getId()) / var9.getNum());
               } else if (var9.getType() == 4) {
                  MoneyType var10;
                  if ((var10 = new MoneyType(ActivityFC.getActivityMoneyKey(var9.getKey()), 0L)).getId() == 0) {
                     var10.setKey(var9.getKey());
                  }

                  var5 = Math.min(var5, var4.getMoney(var10) / var9.getNum());
               }
            }

            if (var5 > 999L) {
               var5 = 999L;
            }

            return var1 > var5 ? var5 : null;
         } else {
            return 0L;
         }
      }
   }

   public LaborShop he() {
      return this.axp;
   }
}
