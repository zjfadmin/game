package com.xy.a.q;

import com.xy.bean.QuackGameBean;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Image;
import java.math.BigDecimal;
import javax.swing.JLabel;

public class Class87 extends com.xy.q.Class30 {
   private int gy;
   private JLabel xg;
   private QuackGameBean amx;
   private com.xy.w.Class1 amy;
   private BigDecimal nh;
   private Class26[] amz;
   private BigDecimal dt;
   private String aaq;
   private static Image hf;
   private BigDecimal mz;
   private BigDecimal hh;

   public void tw(QuackGameBean var1) {
      this.hh = var1.getMoney();
      this.ci(var1.getPetmsg2());
      String[] var10000;
      if (var1.getPetmsg() != null && !var1.getPetmsg().equals("")) {
         String var6 = var1.getPetmsg();
         String var10001 = "\f?";
         var10000 = var6.split("\\|");
      } else {
         var10000 = null;
      }

      String[] var2 = var10000;

      int var3;
      for (int var7 = var3 = 0; var7 < this.amz.length; var7 = ++var3) {
         if (var2 != null && var3 < var2.length) {
            String var8 = var2[var3];
            String var9 = "@8B!";
            if (!var8.equals("null")) {
               String[] var4 = var2[var3].split("_");
               Goodstable var5 = this.yt().ay(new BigDecimal(var4[0]));
               this.amz[var3].cb(var5, Integer.parseInt(var4[1]));
               this.amz[var3].n(var1.getIndex() == var3 ? 1 : 2);
               continue;
            }
         }

         this.amz[var3].cb(null, 0);
      }

      if (this.zc().l(this.lj()) == null) {
         this.zc().b(this.lj());
      }
   }

   // $VF: synthetic method
   static com.xy.w.Class1 agf(Class87 var0) {
      return var0.amy;
   }

   // $VF: synthetic method
   static void agg(Class87 var0, com.xy.w.Class1 var1) {
      var0.amy = var1;
   }

   @Override
   public boolean ah() {
      if (this.amx == null && this.gy != 0) {
         if (this.gy > 0) {
            String var10003 = "\u0000\u0013";
            String var1 = Agreement.getSendTextAES("getfivemsg", "PP" + this.hh);
            this.za().k(var1);
         }

         return super.ah();
      } else {
         String var10001 = "拰奸辕沏杄绽朒旎沘兝閠靌朲";
         this.afx._do("抽奖还没有结束无法关闭面板");
         return false;
      }
   }

   public synchronized void tx(QuackGameBean var1) {
      this.tm(var1);
   }

   public synchronized void ci(String var1) {
      String var10001 = "~";
      String[] var2 = var1.split("=");
      var10001 = var2[0];
      String var10002 = "@8B!";
      this.nh = !var10001.equals("null") ? new BigDecimal(var2[0]) : null;
      var10001 = var2[1];
      var10002 = ">6</";
      this.aaq = !var10001.equals("null") ? var2[1] : null;
      var10001 = var2[2];
      var10002 = "@8B!";
      this.dt = !var10001.equals("null") ? new BigDecimal(var2[2]) : null;
      this.gy = Integer.parseInt(var2[3]);
      if (var2.length == 5) {
         var10001 = var2[4];
         var10002 = ">6</";
         this.mz = !var10001.equals("null") ? new BigDecimal(var2[4]) : null;
      }

      if (this.gy == -1) {
         var10001 = "羶牢歬敞嶿甆寁";
         this.xg.setText("翻牌次数已用完");
      } else if (this.gy != 0 && (this.nh != null || this.aaq != null)) {
         if (this.nh == null) {
            String var24 = "羫爏淘联";
            this.xg.setText("翻牌消耗" + this.dt.longValue() * this.gy + this.aaq);
         } else {
            Goodstable var3;
            if ((var3 = this.yt().ay(this.nh)) == null) {
               var10001 = "敞挣弬幵";
               this.xg.setText("数据异常");
            } else if (this.aaq == null) {
               JLabel var4 = this.xg;
               String var23 = "羫爏淘联";
               StringBuilder var13 = new StringBuilder("翻牌消耗").append(this.gy);
               var10002 = "乧";
               var4.setText(var13.append("个").append(var3.getGoodsname()).toString());
            } else {
               JLabel var10000 = this.xg;
               String var10003 = "羫爏淘联";
               StringBuilder var10 = new StringBuilder("翻牌消耗").append(this.gy);
               var10002 = "乧";
               StringBuilder var11 = var10.append("个").append(var3.getGoodsname());
               var10002 = "o爹咂九跰斦厬亵畫";
               StringBuilder var12 = var11.append(",物品不足时可以用").append(this.dt.longValue()).append(this.aaq);
               var10002 = "抛淅";
               var10000.setText(var12.append("抵消").toString());
            }
         }
      } else {
         var10001 = "儝赺羫乃彰爏";
         this.xg.setText("免费翻一张牌");
      }
   }

   // $VF: synthetic method
   static int agh(Class87 var0) {
      return var0.gy;
   }

   // $VF: synthetic method
   static Image gu() {
      return hf;
   }

   // $VF: synthetic method
   static void gt(Image var0) {
      hf = var0;
   }

   public synchronized void tm(QuackGameBean var1) {
      if (this.amx != null) {
         com.xy.c.Class9.u(this.amx.getAssetUpdate(), this.afx);
         this.ci(this.amx.getPetmsg2());
      }

      this.amx = var1;
      if (var1 != null) {
         this.tw(var1);
      }
   }

   // $VF: synthetic method
   static BigDecimal agi(Class87 var0) {
      return var0.hh;
   }

   // $VF: synthetic method
   static BigDecimal agj(Class87 var0) {
      return var0.nh;
   }

   public Class87(GameView var1) {
      super(127, 2, com.xy.q.Class30.afz, var1);
      String var10003 = "03l2l\u0003p`s~3>$";
      this.gy = 1;
      this.yy(-1, 0, 747, 340, com.xy.q.Class30.agf);
      this._do("sc/b/S300.png");
      this.amz = new Class26[4];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.amz.length; var10000 = var2) {
         this.amz[var2] = new Class26(this, var2);
         this.amz[var2].setBounds(140 + 120 * var2, 100, 120, 188);
         this.amz[var2].cb(this.yt().ay(new BigDecimal(100)), 12);
         this.add(this.amz[var2++]);
      }

      String var10008 = "兣赴翕乍弎爁";
      this.xg = new JLabel("免费翻一张牌", 0);
      this.xg.setBounds(230, 300, 300, 20);
      this.xg.setFont(com.xy.q.Class49.aw);
      this.xg.setForeground(Color.WHITE);
      this.add(this.xg);
   }
}
