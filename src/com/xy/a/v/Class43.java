package com.xy.a.v;

import com.xy.q.Class54;
import com.xy.readbean.ActivityFC;
import com.xy.readbean.ActivityFCBase;
import com.xy.readbean.ActivityFCBuy;
import com.xy.readbean.Goodstable;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import javax.swing.JLabel;

class Class43 extends com.xy.i.Class1 {
   private ActivityFC amd;
   private JLabel dh;
   private JLabel fs;
   // $VF: synthetic field
   final Class21 ame;
   private Class54 ft;

   public void afm(ActivityFC var1) {
      if ((this.amd = var1) == null) {
         this.ft.h();
         this.setVisible(false);
      } else {
         String var2 = null;
         ActivityFCBuy var10000 = (ActivityFCBuy)var1.getData();
         ActivityFCBase var4 = var10000.getGains()[0];
         ActivityFCBase var5 = var10000.getUses()[0];
         ActivityFCBase var10;
         if (var4.getType() == 1) {
            com.xy.v.Class26 var6 = Class21.rh(this.ame).getPointKey(var4.getId());
            JLabel var9 = this.fs;
            StringBuilder var10001 = new StringBuilder(String.valueOf(var4.getNum()));
            String var10002;
            if (var6 != null) {
               var10002 = var6.a;
            } else {
               var10002 = "杣矿禦刜";
               var10002 = "未知积分";
            }

            var9.setText(var10001.append(var10002).toString());
            var10 = var5;
            this.ft.gs(22, this.fs.getText());
            var10002 = "%&/";
            this.ft.gt(com.xy.w.Class15.d("903"));
         } else if (var4.getType() == 2) {
            Goodstable var7 = this.form.yt().ay(new BigDecimal(var4.getId()));
            this.fs.setText(var7 != null ? var7.getGoodsname() : "");
            byte var14;
            Goodstable var17;
            if (var7 != null) {
               var14 = 1;
               var17 = var7;
            } else {
               var14 = 0;
               var17 = var7;
            }

            this.ft.gs(var14, var17);
            var10 = var5;
         } else if (var4.getType() == 3) {
            var10 = var5;
            String var10003 = "集朠够劫";
            this.fs.setText("随机奖励");
            this.ft.gs(22, this.fs.getText());
            String var18 = "%&/";
            this.ft.gt(com.xy.w.Class15.d("903"));
         } else if (var4.getType() == 4) {
            var10 = var5;
            this.fs.setText(var4.getNum() + var4.getKey());
            this.ft.gs(22, this.fs.getText());
            String var19 = "#y)";
            this.ft.gt(com.xy.w.Class15.d("903"));
         } else {
            this.fs.setText("");
            this.ft.h();
            var10 = var5;
         }

         Class43 var13;
         if (var10.getType() == 1) {
            com.xy.v.Class26 var8;
            String var11;
            if ((var8 = Class21.rh(this.ame).getPointKey(var5.getId())) != null) {
               var11 = var8.a;
            } else {
               String var12 = "朼矹秹刚";
               var11 = "未知积分";
            }

            var2 = var11;
            var13 = this;
         } else {
            if (var5.getType() == 4) {
               var2 = var5.getKey();
            }

            var13 = this;
         }

         com.xy.q.Class49.b(var13.dh, var5.getNum());
         this.dh.setText(this.dh.getText() + (var2 != null ? var2 : ""));
         this.dh.setForeground(Color.red);
         this.setVisible(true);
      }
   }

   @Override
   public void fe(MouseEvent var1, boolean var2) {
   }

   @Override
   public void cw(MouseEvent var1) {
      if (this.amd != null) {
         ((com.xy.a.i.Class47)this.form.zc().j(144)).ank(Class21.rh(this.ame), this.amd);
      }
   }

   public Class43(Class21 var1, String var2, int var3, com.xy.q.Class30 var4) {
      super(var2, var3, null, var4);
      this.ame = var1;
      this.fs = com.xy.q.Class1.k(8, 15, 92, 18, Color.black, com.xy.q.Class49.ac);
      this.dh = com.xy.q.Class1.k(8, 36, 92, 18, Color.red, com.xy.q.Class49.ac);
      this.dh.setHorizontalAlignment(4);
      this.ft = new Class9(this, var4);
      this.ft.setBounds(101, 3, 58, 58);
      this.add(this.ft);
      this.add(this.fs);
      this.add(this.dh);
   }
}
