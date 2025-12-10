package com.xy;

import com.xy.game.RoleData;
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

public class Class67 extends Class345 {
   private LaborShop amk;
   private JLabel lg;
   private JLabel aml;
   private JLabel li;
   private Class489 akm;
   private Class319 amm;
   private JLabel bs;
   private JLabel ik;
   private Class436 ec;
   private ActivityFC amn;
   private JLabel bd;
   private JTextField amo;
   private JLabel ir;
   private MoneyType ahm;
   private Activity hq;

   public void aek(Activity var1, ActivityFC var2) {
      this.hq = var1;
      this.amn = var2;
      this.ahm = null;
      this.amk = null;
      String var4 = null;
      ActivityFCBuy var10000 = (ActivityFCBuy)var2.getData();
      ActivityFCBase var6 = var10000.getGains()[3 >> 2];
      ActivityFCBase var3 = var10000.getUses()[5 >> 3];
      Class223 var5;
      ActivityFCBase var8;
      if (var6.getType() == --1) {
         var5 = var1.getPointKey(var6.getId());
         this.bs.setText(var6.getNum() + (var5 != null ? var5.a : "未知积分"));
         var8 = var3;
         this.ec.hf(Class222.i("903"));
      } else if (var6.getType() == --2) {
         Goodstable var7 = this.vc().n(new BigDecimal(var6.getId()));
         this.bs.setText(var7 != null ? var7.getGoodsname() : "");
         var8 = var3;
         this.ec.hf(Class222.i(var7.getSkin()));
      } else if (var6.getType() == --3) {
         var8 = var3;
         this.bs.setText("随机奖励");
         this.ec.hf(Class222.i("903"));
      } else if (var6.getType() == --4) {
         var8 = var3;
         this.bs.setText(var6.getNum() + var6.getKey());
         this.ec.hf(Class222.i("903"));
      } else {
         this.ik.setText("");
         this.ec.q();
         var8 = var3;
      }

      Class67 var9;
      if (var8.getType() == (3 & 5)) {
         var4 = (var5 = var1.getPointKey(var3.getId())) != null ? var5.a : "未知积分";
         var9 = this;
         this.ahm = new MoneyType(-1 & -2, (long)var1.getId() << (45 & 114) | (long)var3.getId());
      } else {
         if (var3.getType() == --4) {
            var4 = var3.getKey();
            this.ahm = new MoneyType(ActivityFC.getActivityMoneyKey(var4), 0L);
            if (this.ahm.getId() == 0) {
               this.ahm.setKey(var4);
            }
         }

         var9 = this;
      }

      var9.li.setText("消耗" + var4);
      this.aml.setText("拥有" + var4);
      this.lg.setText(String.valueOf(var3.getNum()));
      this.d();
      this.amo.setText("1");
      this.ve().a(this.ae());
   }

   public LaborShop ael() {
      return this.amk;
   }

   public long gl() {
      return this.amm.gl();
   }

   public void z(long var1, JTextField var3) {
      if (this.amk != null) {
         Class681.j(this.ir, this.amk.getMoney() * var1);
      } else {
         if (this.amn != null) {
            Class681.j(this.ir, ((ActivityFCBuy)this.amn.getData()).getUses()[3 & 4].getNum() * var1);
         }

      }
   }

   public Class67(GameView var1) {
      int var10004 = 1770 & 31167;
      int var10006 = 28350 & 4587;
      int var10008 = 28350 & 4587;
      int var10012 = -4 >> 2;
      super(247 & 32664, 5 >> 1, Class345.aef, var1);
      this.va(var10012, 5 >> 3, 11199 & 21994, 4078 & 29151, Class345.aei);
      this.fx("sc/b/S335.png");
      this.ik = Class133.c(var10008, 8127 & 24959, 107 & 95, 125 & 18, 47 & 90, Class681.c("#c62584C"), Class681.bu);
      this.li = Class133.c(var10006, 30047 & 3069, 107 & 95, 127 & 16, 27 & 110, Class681.c("#c62584C"), Class681.bu);
      this.aml = Class133.c(var10004, 14207 & 18939, 123 & 79, 58 & 85, 10, Class681.c("#c62584C"), Class681.bu);
      this.ik.setText("购买数量");
      this.add(this.ik);
      this.add(this.li);
      this.add(this.aml);
      this.amo = Class133.l(Class681.ad, Color.white);
      this.amo.setBounds(250, 317, 144, 20);
      this.amm = new Class319(15, this.amo, this);
      this.ir = Class133.c(250, 347, 144, 20, 10, Color.white, Class681.ad);
      this.bd = Class133.c(250, 377, 144, 20, 10, Color.white, Class681.ad);
      this.add(this.amo);
      this.add(this.ir);
      this.add(this.bd);
      this.bs = Class133.c(73, 20, 277, 28, 3 >> 2, Color.white, Class681.bu);
      this.ec = new Class436();
      this.ec.setBounds(150, 77, 120, 120);
      this.lg = Class133.c(210, 223, 144, 20, 10, Color.green, Class681.y);
      this.akm = new Class489("sc/b/B457.png", 3 >> 1, 55, this);
      this.akm.setBounds(346, 420, 68, 36);
      this.add(this.bs);
      this.add(this.ec);
      this.add(this.lg);
      this.add(this.akm);
   }

   public Activity kd() {
      return this.hq;
   }

   public void d() {
      if (this.amk != null) {
         Class681.j(this.bd, Class489.bn(this.amk, this.vd()).longValue());
      } else {
         if (this.amn != null) {
            Class681.j(this.bd, this.vd().getMoney(this.ahm));
         }

      }
   }

   public void aem(LaborShop var1) {
      this.amn = this.hq = null;
      this.ahm = null;
      this.amk = var1;
      String var2 = var1.getMoneyType().substring(var1.getMoneyType().length() - --2, var1.getMoneyType().length());
      this.li.setText("消耗" + var2);
      this.aml.setText("拥有" + var2);
      this.bs.setText(var1.getName());
      this.ec.hf(Class222.i(var1.getSkin()));
      this.lg.setText(String.valueOf(var1.getMoney()));
      this.d();
      this.amo.setText("1");
      this.ve().a(this.ae());
   }

   public Long x(long var1, JTextField var3) {
      if (var1 == 0L) {
         return null;
      } else if (var1 < 0L) {
         return 0L;
      } else {
         RoleData var10 = this.vd();
         long var4;
         if (this.amk != null) {
            if ((var4 = Class489.bn(this.amk, var10).longValue() / this.amk.getMoney()) > 999L) {
               var4 = 999L;
            }

            return var1 > var4 ? var4 : null;
         } else if (this.amn != null) {
            var4 = var1;
            ActivityFCBuy var6 = (ActivityFCBuy)this.amn.getData();

            int var7;
            for(int var10000 = var7 = 3 ^ 3; var10000 < var6.getUses().length; var10000 = var7) {
               ActivityFCBase var8;
               if ((var8 = var6.getUses()[var7]).getType() == (3 & 5)) {
                  var4 = Math.min(var4, var10.getActivityMoney(this.hq.getId(), var8.getId()) / var8.getNum());
               } else if (var8.getType() == --4) {
                  MoneyType var9;
                  if ((var9 = new MoneyType(ActivityFC.getActivityMoneyKey(var8.getKey()), 0L)).getId() == 0) {
                     var9.setKey(var8.getKey());
                  }

                  var4 = Math.min(var4, var10.getMoney(var9) / var8.getNum());
               }

               ++var7;
            }

            if (var4 > 999L) {
               var4 = 999L;
            }

            if (var1 > var4) {
               return var4;
            } else {
               return null;
            }
         } else {
            return 0L;
         }
      }
   }

   public ActivityFC aen() {
      return this.amn;
   }

   public boolean aa(long var1, JTextField var3) {
      return (boolean)(3 & 5);
   }

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.aej.bl()) {
         this.d();
      }

   }
}
