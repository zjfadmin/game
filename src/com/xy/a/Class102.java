package com.xy.a;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;

class Class102 extends JComponent {
   int ae;
   int ds;
   List<com.xy.i.Class18> iv;
   // $VF: synthetic field
   final Class74 q;

   public void n(int var1) {
      if (this.ae != var1 || var1 == 13) {
         this.ae = var1;
         com.xy.i.Class18 var2 = null;
         Class102 var10000;
         if (var1 == 13) {
            if (this.q.yx().teamBean == null) {
               var10000 = this;
               var2 = this.aev(0);
               String var10007 = "绒阃擛佀";
               var2.setText("组队操作");
               var2.n(22);
               var2 = this.aev(1);
               String var10006 = "剪廁陮伶";
               var2.setText("创建队伍");
               var2.n(23);
               this.ds = 2;
            } else {
               var10000 = this;
               var2 = this.aev(0);
               String var33 = "绒阃俷恳";
               var2.setText("组队信息");
               var2.n(22);
               this.ds = 1;
            }
         } else if (var1 == 15) {
            var10000 = this;
            var2 = this.aev(0);
            String var37 = "仕昨";
            var2.setText("交易");
            var2.n(24);
            var2 = this.aev(1);
            String var34 = "经五";
            var2.setText("给予");
            var2.n(25);
            this.ds = 2;
         } else if (var1 == 17) {
            var10000 = this;
            var2 = this.aev(0);
            String var38 = "圡骪";
            var2.setText("坐骑");
            var2.n(26);
            var2 = this.aev(1);
            String var35 = "飂衚噴";
            var2.setText("飞行器");
            var2.n(27);
            this.ds = 2;
         } else {
            if (var1 == 21) {
               if (this.q.za().l(2, 12)) {
                  var2 = this.aev(0);
                  var10000 = this;
                  String var10005 = "旁扰捶弮";
                  var2.setText("新手指引");
                  var2.n(61);
                  var2 = this.aev(1);
                  String var10004 = "忷捡擑佊4%5";
                  var2.setText("快捷操作(3)");
                  var2.n(62);
               } else {
                  var2 = this.aev(0);
                  var10000 = this;
                  String var30 = "却诟叱雡秺";
                  var2.setText("协议及隐私");
                  var2.n(70);
                  var2 = this.aev(1);
                  String var29 = "粨彵刐亷";
                  var2.setText("精彩分享");
                  var2.n(70);
               }

               var2 = var10000.aev(2);
               String var31 = "阼妭佾魯";
               var2.setText("降妖伏魔");
               var2.n(60);
               var2.setForeground(Color.red);
               var2 = this.aev(3);
               String var10015 = "朞卽兇捾";
               var2.setText("月卡兑换");
               var2.n(57);
               var2.setForeground(Color.red);
               var2 = this.aev(4);
               String var10014 = "絞讚飷叭";
               var2.setText("累计领取");
               var2.n(56);
               var2.setForeground(Color.red);
               var2 = this.aev(5);
               String var10013 = "兇捾吞戌";
               var2.setText("兑换合成");
               var2.n(55);
               var2.setForeground(Color.red);
               var2 = this.aev(6);
               String var10011 = "湉戴審罪";
               var2.setText("游戏官网");
               var2.n(58);
               var2 = this.aev(7);
               var10011 = "仏玕寒唲";
               var2.setText("仙玉寄售");
               var2.n(59);
               var2.setForeground(Color.red);
               var2 = this.aev(8);
               String var10010 = "畮戫則佧";
               var2.setText("生成制作");
               var2.n(54);
               var2.setForeground(Color.red);
               var2 = this.aev(9);
               String var10009 = "渮戓势扗";
               var2.setText("游戏助手");
               var2.n(53);
               var2.setForeground(Color.red);
               var2 = this.aev(10);
               String var10008 = "迴劒烍匭";
               var2.setText("辅助炼化");
               var2.n(52);
               var2.setForeground(Color.red);
               var2 = this.aev(11);
               String var36 = "渮戓讨署";
               var2.setText("游戏设置");
               var2.n(51);
               var2 = this.aev(12);
               var31 = "遱凁湉戴";
               var2.setText("退出游戏");
               var2.n(51);
               this.ds = 13;
            }

            var10000 = this;
         }

         int var3;
         for (int var27 = var3 = var10000.ds; var27 < this.iv.size(); var27 = var3) {
            com.xy.i.Class18 class18 = this.iv.get(var3);
            var3++;
            class18.setVisible(false);
         }

         this.t();
      }
   }

   public void t() {
      Class3 var1 = Class74.xm(this.q)[this.ae - 10];
      byte var2 = 118;
      int var3 = 24 * this.ds;
      int var4 = var1.getX();
      int var5 = var1.getY();
      int var6;
      this.setBounds(Math.min(var6 = var4 - (var2 - var1.getWidth()) / 2, this.q.afx.screenData.getScreen_x() - var2), var5 - var3, var2, var3);
   }

   public com.xy.i.Class18 aev(int var1) {
      com.xy.i.Class18 var2 = var1 < this.iv.size() ? this.iv.get(var1) : null;
      if (var2 == null) {
         String var10002 = "ou3s3$)8lx{";
         var2 = new com.xy.i.Class18("sc/e/25.png", 1, 0, com.xy.q.Class49.ac, null, "", this.q.eg());
         var2.setBounds(0, 24 * var1, 118, 24);
         this.add(var2);
         this.iv.add(var2);
      }

      var2.setForeground(Color.white);
      var2.setVisible(true);
      return var2;
   }

   public Class102(Class74 var1) {
      this.q = var1;
      this.iv = new ArrayList<>();
   }
}
