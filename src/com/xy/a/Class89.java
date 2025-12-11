package com.xy.a;

import com.xy.text.GameView;

public class Class89 extends com.xy.q.Class30 {
   private com.xy.i.Class2[] jm;
   private com.xy.i.Class2[] ajv;
   private com.xy.i.Class2[] ajw;
   private com.xy.i.Class2[] ajx;
   private com.xy.i.Class2[] ajy;

   public Class89(GameView var1) {
      super(150, 2, com.xy.q.Class30.afz, var1);
      String var10003 = "\b\u0014T\u0015T$OFBY\u000b\u0019\u001c";
      this.yy(-1, 0, 798, 386, com.xy.q.Class30.agf);
      this.dp("sc/b/S419.png");
      this.ajx = new com.xy.i.Class2[this.za().l(2, 12) ? 7 : 6];
      this.jm = new com.xy.i.Class2[6];
      this.ajy = new com.xy.i.Class2[7];
      this.ajv = new com.xy.i.Class2[7];
      this.ajw = new com.xy.i.Class2[this.za().l(2, 12) ? 7 : 6];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.ajx.length; var10000 = ++var2) {
         String var10007 = "B\u000e\u001e\u000f\u001e/\u0005[\u0002CA\u0003V";
         this.ajx[var2] = new com.xy.i.Class2("sc/b/B463.png", 1, 0, com.xy.q.Class49.ch, com.xy.q.Class49.ap, "", this);
         this.ajx[var2].setBounds(140, 58 + var2 * 35, 100, 30);
         this.add(this.ajx[var2]);
         if (var2 == 0) {
            com.xy.i.Class2 var8 = this.ajx[var2];
            String var10002 = "跲络嶜區";
            var8.cp(16, "超级巫医");
         } else if (var2 == 1) {
            com.xy.i.Class2 var9 = this.ajx[var2];
            String var48 = "汮渻癏显甮";
            var9.cp(40, "江湖百晓生");
         } else if (var2 == 2) {
            com.xy.i.Class2 var10 = this.ajx[var2];
            String var49 = "厗啓儆";
            var10.cp(-44, "召唤兽");
         } else if (var2 == 3) {
            com.xy.i.Class2 var11 = this.ajx[var2];
            String var50 = "浖跲";
            var11.cp(59988, "活跃");
         } else if (var2 == 4) {
            com.xy.i.Class2 var12 = this.ajx[var2];
            String var51 = "佮住";
            var12.cp(59992, "伙伴");
         } else if (var2 == 5) {
            com.xy.i.Class2 var13 = this.ajx[var2];
            String var52 = "刂朝";
            var13.cp(59991, "副本");
         } else if (var2 == 6) {
            com.xy.i.Class2 var14 = this.ajx[var2];
            String var53 = "敎呶";
            var14.cp(59987, "改名");
         }
      }

      for (int var15 = var2 = 0; var15 < this.jm.length; var15 = ++var2) {
         String var83 = "B\u000e\u001e\u000f\u001e/\u0005[\u0002CA\u0003V";
         this.jm[var2] = new com.xy.i.Class2("sc/b/B463.png", 1, 0, com.xy.q.Class49.ch, com.xy.q.Class49.ap, "", this);
         this.jm[var2].setBounds(255, 58 + var2 * 35, 100, 30);
         this.add(this.jm[var2]);
         if (var2 == 0) {
            com.xy.i.Class2 var16 = this.jm[var2];
            String var54 = "醦幺嚩敍";
            var16.cp(-71, "金币回收");
         } else if (var2 == 1) {
            com.xy.i.Class2 var17 = this.jm[var2];
            String var55 = "亴玸宩唟";
            var17.cp(59989, "仙玉寄售");
         } else if (var2 == 2) {
            com.xy.i.Class2 var18 = this.jm[var2];
            String var56 = "儦挙";
            var18.cp(59996, "兑换");
         } else if (var2 == 3) {
            com.xy.i.Class2 var19 = this.jm[var2];
            String var57 = "铜庵";
            var19.cp(33, "钱庄");
         } else if (var2 == 4) {
            com.xy.i.Class2 var20 = this.jm[var2];
            String var58 = "弤钁";
            var20.cp(31, "当铺");
         } else if (var2 == 5) {
            com.xy.i.Class2 var21 = this.jm[var2];
            String var59 = "輁甮";
            var21.cp(-47, "转生");
         }
      }

      for (int var22 = var2 = 0; var22 < this.ajy.length; var22 = ++var2) {
         String var84 = "\b\u0014T\u0015T5OAHY\u000b\u0019\u001c";
         this.ajy[var2] = new com.xy.i.Class2("sc/b/B463.png", 1, 0, com.xy.q.Class49.ch, com.xy.q.Class49.ap, "", this);
         this.ajy[var2].setBounds(370, 58 + var2 * 35, 100, 30);
         this.add(this.ajy[var2]);
         if (var2 == 0) {
            com.xy.i.Class2 var23 = this.ajy[var2];
            String var60 = "袨夶戾逑";
            var23.cp(54, "装备打造");
         } else if (var2 == 1) {
            com.xy.i.Class2 var24 = this.ajy[var2];
            String var61 = "亮嘓";
            var24.cp(66, "仙器");
         } else if (var2 == 2) {
            com.xy.i.Class2 var25 = this.ajy[var2];
            String var62 = "礳兄";
            var25.cp(59990, "神兵");
         } else if (var2 == 3) {
            com.xy.i.Class2 var26 = this.ajy[var2];
            String var63 = "寪瞈";
            var26.cp(59995, "宝石");
         } else if (var2 == 4) {
            com.xy.i.Class2 var27 = this.ajy[var2];
            String var64 = "筋矂";
            var27.cp(59994, "符石");
         } else if (var2 == 5) {
            com.xy.i.Class2 var28 = this.ajy[var2];
            String var65 = "烇姡瞈";
            var28.cp(59993, "炼妖石");
         } else if (var2 == 6) {
            com.xy.i.Class2 var29 = this.ajy[var2];
            String var66 = "烑匧迨劘";
            var29.cp(59999, "炼化辅助");
         }
      }

      for (int var30 = var2 = 0; var30 < this.ajv.length; var30 = ++var2) {
         String var85 = "\b\u0014T\u0015T5OAHY\u000b\u0019\u001c";
         this.ajv[var2] = new com.xy.i.Class2("sc/b/B463.png", 1, 0, com.xy.q.Class49.ch, com.xy.q.Class49.ap, "", this);
         this.ajv[var2].setBounds(505, 58 + var2 * 35, 100, 30);
         this.add(this.ajv[var2]);
         if (var2 == 0) {
            com.xy.i.Class2 var31 = this.ajv[var2];
            String var67 = "杳赊度";
            var31.cp(5, "杂货店");
         } else if (var2 == 1) {
            com.xy.i.Class2 var32 = this.ajv[var2];
            String var68 = "茘廬";
            var32.cp(9, "药店");
         } else if (var2 == 2) {
            com.xy.i.Class2 var33 = this.ajv[var2];
            String var69 = "拭背唫度";
            var33.cp(14, "技能商店");
         } else if (var2 == 3) {
            com.xy.i.Class2 var34 = this.ajv[var2];
            String var70 = "凲乂唱廬";
            var34.cp(15, "内丹商店");
         } else if (var2 == 4) {
            com.xy.i.Class2 var35 = this.ajv[var2];
            String var71 = "筋斶唫度";
            var35.cp(37, "符文商店");
         } else if (var2 == 5) {
            com.xy.i.Class2 var36 = this.ajv[var2];
            String var72 = "瞈瞈唱廬";
            var36.cp(13, "矿石商店");
         } else if (var2 == 6) {
            com.xy.i.Class2 var37 = this.ajv[var2];
            String var73 = "伱坻唫度";
            var37.cp(7, "作坊商店");
         }
      }

      for (int var38 = var2 = 0; var38 < this.ajw.length; var38 = ++var2) {
         String var86 = "\b\u0014T\u0015T5OAHY\u000b\u0019\u001c";
         this.ajw[var2] = new com.xy.i.Class2("sc/b/B463.png", 1, 0, com.xy.q.Class49.ch, com.xy.q.Class49.ap, "", this);
         this.ajw[var2].setBounds(620, 58 + var2 * 35, 100, 30);
         this.add(this.ajw[var2]);
         if (var2 == 0) {
            com.xy.i.Class2 var39 = this.ajw[var2];
            String var74 = "奊闈禂刷";
            var39.cp(605, "大闹积分");
         } else if (var2 == 1) {
            com.xy.i.Class2 var40 = this.ajw[var2];
            String var75 = "汃趔禘剽";
            var40.cp(126, "水路积分");
         } else if (var2 == 2) {
            com.xy.i.Class2 var41 = this.ajw[var2];
            String var76 = "坝定禂刷";
            var41.cp(121, "地宫积分");
         } else if (var2 == 3) {
            com.xy.i.Class2 var42 = this.ajw[var2];
            String var77 = "奜隶堯禘剽";
            var42.cp(120, "大雁塔积分");
         } else if (var2 == 4) {
            com.xy.i.Class2 var43 = this.ajw[var2];
            String var78 = "幃戩禂刷";
            var43.cp(61, "帮战积分");
         } else if (var2 == 5) {
            com.xy.i.Class2 var44 = this.ajw[var2];
            String var79 = "完评禘剽";
            var44.cp(123, "寻访积分");
         } else if (var2 == 6) {
            com.xy.i.Class2 var45 = this.ajw[var2];
            String var80 = "刂朝禂刷";
            var45.cp(127, "副本积分");
         }
      }

      if (this.za().l(2, 11)) {
         int var46 = 2;
         this.ajy[6].setVisible(false);

         for (int var7 = 2; var46 < this.jm.length; var46 = var7) {
            com.xy.i.Class2 var47 = this.jm[var7];
            int var81 = 58 + (var7 - 1) * 35;
            var7++;
            var47.setBounds(255, var81, 100, 30);
         }

         com.xy.i.Class2 var10001 = this.jm[1];
         var10003 = "去偶";
         var10001.cp(39, "双倍");
         this.jm[1].setBounds(255, 58 + (this.jm.length - 1) * 35, 100, 30);
      }
   }
}
