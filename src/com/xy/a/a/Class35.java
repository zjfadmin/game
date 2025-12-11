package com.xy.a.a;

import com.xy.formula.MsgUntil;
import com.xy.game.GameUtil;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JLabel;

public class Class35 extends com.xy.q.Class30 {
   private com.xy.w.Class0 ajk;
   private com.xy.w.Class18 xf;
   private Class54[] ajl;
   private com.xy.i.Class17[] ajm;
   private com.xy.i.Class17[] ajn;
   private com.xy.i.Class17[] ajo;
   private com.xy.i.Class3[] ga;
   private com.xy.i.Class17[] ajp;
   private com.xy.q.Class21 nz;
   private com.xy.i.Class17[] ajq;
   private com.xy.q.Class2[] ajr;
   private com.xy.w.Class18 dn;

   @Override
   public void l() {
      this.h();
      this.e();
      super.l();
   }

   public void e() {
      RoleData var1;
      RoleData var10000 = var1 = this.yx();
      long var2 = var10000.getLoginResult().getSpecies_id().longValue();
      Goodstable var4;
      long var5;
      if ((var4 = var10000.getGoodEquip(var10000.goodChoses[0])) != null && (var5 = GameUtil.a(Integer.parseInt(var4.getSkin()))) != 0L) {
         long var7;
         var2 |= (var7 = var5 + 18L) << 32;
      }

      Class35 var8;
      if (this.ajk == null) {
         var8 = this;
         this.ajk = com.xy.w.Class11.p(var2, 2, 1, null);
      } else {
         var8 = this;
         boolean var10006 = true;
         this.ajk = com.xy.w.Class11.ah(this.ajk, 1, String.valueOf(var2));
      }

      var8.g(var1.getPackRecord().getEquipType());
   }

   @Override
   protected void paintChildren(Graphics var1) {
      super.paintChildren(var1);
      if (this.ajk != null) {
         this.ajk.r(var1, 219, 160, 4, com.xy.v.Class22.l());
      }
   }

   public Class35(GameView var1) {
      super(2, 2, com.xy.q.Class30.afz, var1);
      this.yy(-1, 0, 412, 485, com.xy.q.Class30.agh);
      this.yu(com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false), "物品栏");
      this.ajl = new Class54[12];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.ajl.length; var10000 = var2) {
         this.ajl[var2] = new Class54(this, var2, this);
         Class54 var37 = this.ajl[var2];
         var10004 = "$TxSx\u0003yG9P";
         var37.dq("sc/d/4.png");
         this.ajl[var2].wp(com.xy.q.Class54.auc);
         this.add(this.ajl[var2++]);
      }

      this.dn = new com.xy.w.Class18();
      String var10006 = "id5c56,)ji}";
      this.dn.mt(com.xy.w.Class16.m("sc/d/16.png", 2, 2, 2, 2, false));
      this.dn.setBounds(163, 31, 108, 149);
      this.add(this.dn);
      this.ajq = new com.xy.i.Class17[4];

      for (int var12 = var2 = 0; var12 < this.ajq.length; var12 = var2) {
         com.xy.i.Class17[] var13 = this.ajq;
         if (var2 == 0) {
            var10004 = "$TxRx\u0006yG9P";
            var10004 = "sc/e/1.png";
         } else if (var2 == 1) {
            var10004 = "ty(\u007f(()ji}";
            var10004 = "sc/e/2.png";
         } else if (var2 == 2) {
            var10004 = "$TxRx\u0004yG9P";
            var10004 = "sc/e/3.png";
         } else if (var2 == 3) {
            var10004 = "ty(\u007f(.)ji}";
            var10004 = "sc/e/4.png";
         } else {
            var10004 = "";
         }

         com.xy.i.Class17 var10001 = new com.xy.i.Class17(var10004, 1, 1 + var2, this);
         var13[var2] = var10001;
         this.ajq[var2].setBounds(179 + 20 * var2, 183, 18, 18);
         this.add(this.ajq[var2++]);
      }

      this.ajn = new com.xy.i.Class17[5];

      for (int var14 = var2 = 0; var14 < this.ajn.length; var14 = var2) {
         com.xy.i.Class17[] var15 = this.ajn;
         int var48 = var2 == 4 ? 24 : 5 + var2;
         String var50;
         if (var2 == 0) {
            var50 = "存款";
         } else if (var2 == 1) {
            var50 = "摆摇";
         } else if (var2 == 2) {
            var50 = "装扮";
         } else if (var2 == 3) {
            var50 = "检查";
         } else if (var2 == 4) {
            var50 = "清包";
         } else {
            var50 = "";
         }

         com.xy.i.Class17 var31 = new com.xy.i.Class17("sc/e/6.png", 1, var48, com.xy.q.Class49.bz, null, var50, this);
         var15[var2] = var31;
         this.ajn[var2].setOffsetTexts(com.xy.q.Class49.ag);
         if (var2 == 0) {
            this.ajn[var2].setBounds(189, 210, 34, 18);
         } else {
            this.ajn[var2].setBounds(190 + 50 * var2, 206, 34, 18);
         }

         this.add(this.ajn[var2++]);
      }

      if (this.za().i()) {
         for (int var17 = var2 = 1; var17 < this.ajn.length; var17 = var2) {
            com.xy.i.Class17 var18 = this.ajn[var2];
            int var25 = 190 + 40 * var2;
            var2++;
            var18.setBounds(var25, 206, 34, 18);
         }
      } else {
         this.ajn[4].setVisible(false);
      }

      if (this.za().gamePawn) {
         this.ajn[3].setText("包裹");
      }

      this.ajm = new com.xy.i.Class17[3];

      for (int var21 = var2 = 0; var21 < this.ajm.length; var21 = var2) {
         this.ajm[var2] = new com.xy.i.Class17("sc/e/28.png", 1, 11 + var2, com.xy.q.Class49.bz, null, "装备" + MsgUntil.h(var2 + 1), this);
         this.ajm[var2].setBounds(310, 255 + var2 * 17, 68, 17);
         this.ajm[var2].setVisible(false);
         this.add(this.ajm[var2++]);
      }

      this.ajr = new com.xy.q.Class2[2];

      for (int var22 = var2 = 0; var22 < this.ajr.length; var22 = var2) {
         JLabel var3 = com.xy.q.Class1.f(43, 209 + var2 * 24, 36, 19, 0, Color.black, com.xy.q.Class49.ch);
         com.xy.q.Class52 var4 = com.xy.q.Class1.m(79, 209 + var2 * 24, 144, 19, 10, Color.white, com.xy.q.Class49.ac, null, var1);
         var4.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
         this.add(var3);
         this.add(var4);
         this.ajr[var2] = new com.xy.q.Class2(var3, var4);
         MoneyType var5 = new MoneyType();
         var5.setId(var2 == 0 ? 1 : (var2 == 1 ? 2 : 0));
         String var28;
         if (var2 == 0) {
            var28 = "现金";
         } else if (var2 == 1) {
            var28 = "师贡";
         } else {
            var28 = "";
         }

         var5.setKey(var28);
         var3.setText(var5.getKey());
         var2++;
         var4.alj(var5);
         var4.n(3);
      }

      this.ajp = new com.xy.i.Class17[2];

      for (int var23 = var2 = 0; var23 < this.ajp.length; var23 = var2) {
         com.xy.i.Class17[] var24 = this.ajp;
         int var49 = 9 + var2;
         String var56;
         if (var2 == 0) {
            var56 = "整理";
         } else if (var2 == 1) {
            var56 = "换装";
         } else {
            var56 = "";
         }

         com.xy.i.Class17 var34 = new com.xy.i.Class17("sc/e/7.png", 1, var49, com.xy.q.Class49.ch, com.xy.q.Class49.bv, var56, this);
         var24[var2] = var34;
         this.ajp[var2].setBounds(240 + 75 * var2, 230, 59, 25);
         this.add(this.ajp[var2++]);
      }

      this.xf = new com.xy.w.Class18();
      var10004 = "id5c56#)ji}";
      this.xf.mt(com.xy.w.Class16.m("sc/d/19.png", 5, 5, 5, 5, false));
      this.xf.setBounds(45, 260, 309, 207);
      this.add(this.xf);
      this.nz = new com.xy.q.Class21(this, 6, 4, 51, 51, 0, 0, 46, 262);
      String var10005 = "D4\u00183\u0018f\u000fyG9P";
      this.nz.gt(com.xy.w.Class16.c("sc/d/18.png"));
      this.nz.rm(true);
      this.add(this.nz);
   }

   public void f() {
      boolean var1 = !this.ajm[0].isVisible();

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.ajm.length; var10000 = var2) {
         this.ajm[var2++].setVisible(var1);
      }
   }

   public void h() {
      int var1 = 1 + this.yx().goodPacks.length / 24;
      if (this.ga == null || this.ga.length != var1) {
         this.ga = this.zd(this.ga, var1, this.nz.ah());
         short var2 = 354;
         short var3 = 260;

         int var4;
         for (int var10000 = var4 = 0; var10000 < this.ga.length; var10000 = var4) {
            com.xy.i.Class3 var5 = this.ga[var4];
            int var10002 = var3 + var4 * 35;
            var4++;
            var5.setBounds(var2, var10002, 36, 33);
         }

         this.nz.vr(this.ga, 0);
      }
   }

   @Override
   public boolean ah() {
      this.yx().ac();
      return super.ah();
   }

   public void g(int var1) {
      int var2;
      for (int var10000 = var2 = 0; var10000 < this.ajm.length; var10000 = ++var2) {
         this.ajm[var2].setForeground(var2 == var1 ? Color.red : Color.white);
      }
   }

   public com.xy.q.Class21 acf() {
      return this.nz;
   }
}
