package com.xy;

import com.xy.text.GameView;

public class Class535 extends Class345 {
   private Class369[] qu;
   private Class369[] qv;
   private Class369[] qw;
   private Class369[] qx;
   private Class369[] qy;

   public Class535(GameView var1) {
      int var10005 = -4 >> 2;
      super(11926 & 20991, 5 >> 1, Class345.aef, var1);
      this.va(var10005, 3 ^ 3, 27646 & 5919, 28550 & 4603, Class345.aei);
      this.im("sc/b/S419.png");
      Class369[] var10001 = new Class369[this.uw().n(5 >> 1, 76 & 63) ? 119 & 15 : 6];
      boolean var10003 = true;
      this.qy = var10001;
      var10001 = new Class369[14 & 119];
      var10003 = true;
      this.qx = var10001;
      var10001 = new Class369[79 & 55];
      var10003 = true;
      this.qw = var10001;
      var10001 = new Class369[95 & 39];
      var10003 = true;
      this.qv = var10001;
      var10001 = new Class369[this.uw().n(--2, 13 & 126) ? 95 & 39 : 6];
      var10003 = true;
      this.qu = var10001;

      int var10000;
      int var2;
      for(var10000 = var2 = 3 >> 2; var10000 < this.qy.length; var10000 = var2) {
         this.qy[var2] = new Class369("sc/b/B463.png", 3 & 5, 3 >> 2, Class681.ak, Class681.f, "", this);
         this.qy[var2].setBounds(2783 & 30124, (62 & 123) + var2 * (59 & 103), 119 & 108, 127 & 30);
         this.add(this.qy[var2]);
         if (var2 == 0) {
            this.qy[var2].gd(49 & 94, "超级巫医");
         } else if (var2 == --1) {
            this.qy[var2].gd(40, "江湖百晓生");
         } else if (var2 == (1 ^ 3)) {
            this.qy[var2].gd(-44, "召唤兽");
         } else if (var2 == --3) {
            this.qy[var2].gd(59988, "活跃");
         } else if (var2 == --4) {
            this.qy[var2].gd(59992, "伙伴");
         } else if (var2 == --5) {
            this.qy[var2].gd(59991, "副本");
         } else if (var2 == 6) {
            this.qy[var2].gd(59987, "改名");
         }

         ++var2;
      }

      for(var10000 = var2 = 5 >> 3; var10000 < this.qx.length; var10000 = var2) {
         this.qx[var2] = new Class369("sc/b/B463.png", --1, 2 & 5, Class681.ak, Class681.f, "", this);
         this.qx[var2].setBounds(255, 58 + var2 * 35, 100, 30);
         this.add(this.qx[var2]);
         if (var2 == 0) {
            this.qx[var2].gd(-71, "金币回收");
         } else if (var2 == --1) {
            this.qx[var2].gd(59989, "仙玉寄售");
         } else if (var2 == --2) {
            this.qx[var2].gd(59996, "兑换");
         } else if (var2 == --3) {
            this.qx[var2].gd(33, "钱庄");
         } else if (var2 == --4) {
            this.qx[var2].gd(31, "当铺");
         } else if (var2 == --5) {
            this.qx[var2].gd(-47, "转生");
         }

         ++var2;
      }

      for(var10000 = var2 = 5 >> 3; var10000 < this.qw.length; var10000 = var2) {
         this.qw[var2] = new Class369("sc/b/B463.png", --1, 3 ^ 3, Class681.ak, Class681.f, "", this);
         this.qw[var2].setBounds(370, 58 + var2 * 35, 100, 30);
         this.add(this.qw[var2]);
         if (var2 == 0) {
            this.qw[var2].gd(54, "装备打造");
         } else if (var2 == 3 >> 1) {
            this.qw[var2].gd(66, "仙器");
         } else if (var2 == --2) {
            this.qw[var2].gd(59990, "神兵");
         } else if (var2 == --3) {
            this.qw[var2].gd(59995, "宝石");
         } else if (var2 == --4) {
            this.qw[var2].gd(59994, "符石");
         } else if (var2 == --5) {
            this.qw[var2].gd(59993, "炼妖石");
         } else if (var2 == 6) {
            this.qw[var2].gd(59999, "炼化辅助");
         }

         ++var2;
      }

      for(var10000 = var2 = 2 & 5; var10000 < this.qv.length; var10000 = var2) {
         this.qv[var2] = new Class369("sc/b/B463.png", --1, 3 ^ 3, Class681.ak, Class681.f, "", this);
         this.qv[var2].setBounds(505, 58 + var2 * 35, 100, 30);
         this.add(this.qv[var2]);
         if (var2 == 0) {
            this.qv[var2].gd(5, "杂货店");
         } else if (var2 == (4 ^ 5)) {
            this.qv[var2].gd(9, "药店");
         } else if (var2 == 2) {
            this.qv[var2].gd(14, "技能商店");
         } else if (var2 == 3) {
            this.qv[var2].gd(15, "内丹商店");
         } else if (var2 == 4) {
            this.qv[var2].gd(37, "符文商店");
         } else if (var2 == 5) {
            this.qv[var2].gd(13, "矿石商店");
         } else if (var2 == 6) {
            this.qv[var2].gd(7, "作坊商店");
         }

         ++var2;
      }

      for(var10000 = var2 = 3 & 4; var10000 < this.qu.length; var10000 = var2) {
         this.qu[var2] = new Class369("sc/b/B463.png", 4 ^ 5, 3 >> 2, Class681.ak, Class681.f, "", this);
         this.qu[var2].setBounds(620, 58 + var2 * 35, 100, 30);
         this.add(this.qu[var2]);
         if (var2 == 0) {
            this.qu[var2].gd(605, "大闹积分");
         } else if (var2 == 1) {
            this.qu[var2].gd(126, "水路积分");
         } else if (var2 == 2) {
            this.qu[var2].gd(121, "地宫积分");
         } else if (var2 == 3) {
            this.qu[var2].gd(120, "大雁塔积分");
         } else if (var2 == 4) {
            this.qu[var2].gd(61, "帮战积分");
         } else if (var2 == 5) {
            this.qu[var2].gd(123, "寻访积分");
         } else if (var2 == 6) {
            this.qu[var2].gd(127, "副本积分");
         }

         ++var2;
      }

      if (this.uw().n(2, 11)) {
         var10000 = 2;
         this.qw[6].setVisible(false);

         for(var2 = 2; var10000 < this.qx.length; var10000 = var2) {
            Class369 var3 = this.qx[var2];
            int var10002 = 58 + (var2 - 1) * 35;
            ++var2;
            var3.setBounds(255, var10002, 100, 30);
         }

         this.qx[1].gd(39, "双倍");
         this.qx[1].setBounds(255, 58 + (this.qx.length - 1) * 35, 100, 30);
      }

   }
}
