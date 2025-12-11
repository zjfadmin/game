package com.xy.a.i;

import com.xy.bean.LoginResult;
import com.xy.bean.SuitOperBean;
import com.xy.entity.PartJade;
import com.xy.game.RoleData;
import com.xy.i.Class11;
import com.xy.i.Class18;
import com.xy.q.Class49;
import com.xy.q.Class52;
import com.xy.q.Class54;
import com.xy.readbean.MoneyType;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.math.BigDecimal;
import javax.swing.JLabel;

public class Class14 extends com.xy.q.Class30 {
   private com.xy.q.Class14[] nt;
   private JLabel[] ew;
   private Class2 nu;
   private Class54 fv;
   private com.xy.i.Class11[] nv;
   private com.xy.q.Class21 fx;
   private BigDecimal ej;
   private com.xy.q.Class36 nw;
   private com.xy.w.Class18 co;
   private BigDecimal dt;
   private Class52 em;
   private com.xy.i.Class3[] nx;
   private com.xy.w.Class18[] fp;
   private MoneyType ca;

   public Class54 ep() {
      return this.fv;
   }

   @Override
   public void l() {
      this.h();
      this.nu.h();
      this.fv.gs(0, null);
      this.f();
      this.em.l();
      super.l();
   }

   public void e() {
      PartJade var1;
      if ((var1 = (PartJade)this.fv.jx()) == null) {
         String var10 = "诒選拌休覤敇彰盵玬筗\u000b_";
         this.afx.dp("请选择你要收录的玉符..");
      } else {
         int var2 = (int)this.fv.ee();
         RoleData var3;
         LoginResult var4 = (var3 = this.yx()).getLoginResult();
         String var10002 = "瀫侲偢";
         if (this.dt.compareTo(var4.getScoretype("灵修值")) > 0) {
            String var9 = "灐侟候烈敕乼趖ｽ忎及莒厧灐侟候呖\u000b_";
            this.afx.dp("灵修值点数不足，快去获取灵修值吧..");
         } else if (this.ej.compareTo(var4.getGold()) > 0) {
            String var8 = "醍幟乑跭rp";
            this.afx.dp("金币不足..");
         } else if (var3.getPackRecord().e((int)var1.getSuitid(), var1.getPartId()) != null) {
            String var10001 = "嶃刕迏攓弤丯阡\u000b_";
            this.afx.dp("已到达收录上限..");
         } else {
            SuitOperBean var5 = new SuitOperBean();
            PartJade var6 = new PartJade(var1.getSuitid(), var1.getPartId());
            var6.setJade(var2, 1);
            var5.setJade(var6);
            var5.setType(8);
            String var7 = Agreement.getSendTextAES("suitoperate", com.xy.v.Class31.a().toJson(var5));
            this.za().k(var7);
            String var10006 = var4.getScore();
            String var10009 = "瀩侰偠c";
            var4.setScore(com.xy.v.Class5.a(var10006, "灵修值=" + this.dt, 3));
            var4.setGold(var4.getGold().subtract(this.ej));
            GameView var11 = this.afx;
            String var10005 = "淹耲价";
            StringBuilder var10004 = new StringBuilder("消耗了").append(this.dt);
            var10005 = "烥瀫侲偢|~|~|~|戽阸付";
            var10004 = var10004.append("点灵修值       扣除了").append(this.ej);
            var10005 = "釴幰\u000b_";
            var11.dp(var10004.append("金币..").toString());
            this.fv.gs(0, null);
            this.f();
            this.em.l();
         }
      }
   }

   public Class2 eq() {
      return this.nu;
   }

   public Class14(GameView var1) {
      super(64, 2, com.xy.q.Class30.afz, var1);
      String var10006 = "/=s:sor.29";
      this.ej = null;
      this.dt = null;
      this.yy(-2, 0, 559, 495, com.xy.q.Class30.agh);
      com.xy.w.Class9 var45 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10007 = "攓弤玬筗";
      this.yu(var45, "收录玉符");
      this.rm(false);
      this.wp(new com.xy.v.Class32(14, 0, 7, 0));
      this.nv = new com.xy.i.Class11[4];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.nv.length; var10000 = var2) {
         com.xy.i.Class11[] var6 = this.nv;
         String var10004 = "-?q9qnfr.29";
         int var46 = 10 + var2;
         String var49;
         Class14 var10010;
         if (var2 == 0) {
            var49 = "髽绖柀讓";
            var49 = "高级查询";
            var10010 = this;
         } else if (var2 == 2) {
            var49 = "敪弋";
            var49 = "收录";
            var10010 = this;
         } else if (var2 == 3) {
            var49 = "莒忦";
            var49 = "获得";
            var10010 = this;
         } else {
            var49 = "";
            var10010 = this;
         }

         Class11 var10002 = new Class11("sc/e/28.png", 1, var46, Class49.ch, null, var49, var10010);

         var6[var2] = var10002;
         this.nv[var2].setBounds(323, 24, 68, 18);
         Class14 var7;
         if (var2 == 0) {
            var7 = this;
            this.nv[var2].setFont(Class49.bz);
         } else if (var2 == 1) {
            var7 = this;
            var10002 = this.nv[var2];
            String var10003 = "-?q9qjkr.29";
            var10002.setImage("sc/e/65.png");
            this.nv[var2].setBounds(487, 24, 18, 18);
         } else if (var2 == 2) {
            var7 = this;
            this.nv[var2].setForeground(Color.black);
            var10002 = this.nv[var2];
            String var35 = "V\u0012\n\u0014\nF\u000b\u0001K\u0016";
            var10002.setImage("sc/e/7.png");
            this.nv[var2].setBounds(97, 445, 59, 25);
         } else {
            if (var2 == 3) {
               var10002 = this.nv[var2];
               String var36 = "/=s;shr.29";
               var10002.setImage("sc/e/6.png");
               this.nv[var2].setFont(Class49.bz);
               this.nv[var2].setBounds(163, 423, 34, 18);
            }

            var7 = this;
         }

         var7.add(this.nv[var2++]);
      }

      this.co = new com.xy.w.Class18();
      this.co.setBounds(45, 255, 17, 17);
      this.add(this.co);
      this.nu = new Class2(this, this.co);
      this.nu.cl().setBounds(46, 64, 165, 187);
      this.add(this.nu.cl());
      this.nu.cn().setBounds(216, 44, 306, 210);
      this.add(this.nu.cn());
      this.ew = new JLabel[5];

      for (int var8 = var2 = 0; var8 < this.ew.length; var8 = var2) {
         String var10008 = "\u0006\u0012\u0015A\u0015A\u0015A";
         this.ew[var2] = com.xy.q.Class1.f(46, 43, 165, 21, 10, Class49.c("#c000000"), Class49.ch);
         JLabel var9 = this.ew[var2];
         String var14;
         if (var2 == 0) {
            var14 = "夋袛剋蠶";
            var14 = "套装列表";
         } else if (var2 == 1) {
            var14 = "厛昛祋巗杸玬筗";
            var14 = "只显示已有玉符";
         } else if (var2 == 2) {
            var14 = "戞靜醏铭ｄ";
            var14 = "所需金钱：";
         } else if (var2 == 3) {
            var14 = "扥靱灐侟候ｫ";
            var14 = "所需灵修值：";
         } else if (var2 == 4) {
            var14 = "嶮杗瀩侰偠ｄ";
            var14 = "已有灵修值：";
         } else {
            var14 = "";
         }

         var9.setText(var14);
         Class14 var10;
         if (var2 == 0) {
            var10 = this;
            JLabel var24 = this.ew[var2];
            String var37 = "\u0006\u0012c7c7c7";
            var24.setForeground(Class49.c("#cFFFFFF"));
            this.ew[var2].setHorizontalAlignment(0);
         } else if (var2 == 1) {
            var10 = this;
            this.ew[var2].setFont(Class49.n);
            this.ew[var2].setBounds(63, 256, 100, 14);
         } else {
            if (var2 >= 2 && var2 <= 4) {
               this.ew[var2].setBounds(58, 371 + 35 * (var2 - 3), 120, 17);
            }

            var10 = this;
         }

         var10.add(this.ew[var2++]);
      }

      var10006 = "-?q8qmir.29";
      this.nw = com.xy.q.Class1.j(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false), Class49.w, Color.white);
      this.nw.setBounds(396, 23, 110, 20);
      this.add(this.nw);
      this.nt = new com.xy.q.Class14[2];

      for (int var11 = var2 = 0; var11 < this.nt.length; var11 = var2) {
         this.nt[var2] = com.xy.q.Class1.i(55, 387 + (var2 - 1) * 35, 144, 19, 10, Color.white, Class49.w);
         com.xy.q.Class14 var26 = this.nt[var2];
         String var38 = "\u0002F^A^\u0014F\u000b\u0001K\u0016";
         var26.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
         this.add(this.nt[var2++]);
      }

      this.ca = new MoneyType();
      String var10011 = "瀫侲偢";
      this.ca.setIdAndKey(0, "灵修值");
      this.em = com.xy.q.Class1.a(10, Color.white, Class49.w, this.ca, var1);
      var10007 = "\u0002F^A^\u0014F\u000b\u0001K\u0016";
      this.em.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      this.em.n(2);
      this.em.setBounds(55, 422, 144, 19);
      this.add(this.em);
      this.fv = new Class54(this);
      this.fv.setBounds(100, 278, 50, 50);
      this.add(this.fv);
      this.fp = new com.xy.w.Class18[6];

      for (int var12 = var2 = 0; var12 < this.fp.length; var12 = var2) {
         this.fp[var2] = new com.xy.w.Class18();
         Class14 var13;
         if (var2 == 0) {
            var13 = this;
            com.xy.w.Class18 var28 = this.fp[var2];
            String var39 = "-?q8qnkr.29";
            var28.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            this.fp[var2].setBounds(46, 43, 165, 21);
         } else if (var2 == 1) {
            var13 = this;
            com.xy.w.Class18 var29 = this.fp[var2];
            String var40 = "\u0002F^A^\u0017E\u000b\u0001K\u0016";
            var29.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
            this.fp[var2].setBounds(46, 43, 165, 210);
         } else if (var2 == 2) {
            var13 = this;
            com.xy.w.Class18 var30 = this.fp[var2];
            String var41 = "-?q8qnjr.29";
            var30.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
            this.fp[var2].setBounds(214, 44, 308, 210);
         } else if (var2 == 3) {
            var13 = this;
            com.xy.w.Class18 var31 = this.fp[var2];
            String var42 = "V\u0012\n\u0015\nE\u000b\u0001K\u0016";
            var31.dp("sc/d/4.png");
            this.fp[var2].setBounds(96, 274, 59, 57);
         } else if (var2 == 4) {
            var13 = this;
            com.xy.w.Class18 var32 = this.fp[var2];
            String var43 = "-?q8qonr.29";
            var32.dp("sc/d/30.png");
            this.fp[var2].setBounds(97, 331, 58, 1);
         } else {
            if (var2 == 5) {
               com.xy.w.Class18 var19 = this.fp[var2];
               String var33 = "\u0002F^A^\u0014H\u000b\u0001K\u0016";
               var19.mt(com.xy.w.Class16.m("sc/d/19.png", 5, 5, 5, 5, false));
               this.fp[var2].setBounds(214, 259, 309, 207);
            }

            var13 = this;
         }

         var13.add(this.fp[var2++]);
      }

      this.fx = new com.xy.q.Class21(this, 6, 4, 51, 51, 0, 0, 215, 261);
      String var44 = "-?q8qmfr.29";
      this.fx.gt(com.xy.w.Class16.c("sc/d/18.png"));
      this.fx.rm(true);
      this.add(this.fx);
   }

   public void f() {
      PartJade var1;
      if ((var1 = (PartJade)this.fv.jx()) == null) {
         this.ej = null;
         this.nt[0].setText(null);
         this.dt = null;
         this.nt[1].setText(null);
      } else {
         RoleData var2 = this.yx();
         this.ej = new BigDecimal((var2.getPackRecord().getCollectionNum(var1, this.yt()) + 1) * 1000000);
         this.dt = new BigDecimal(50);
         Class49.b(this.nt[0], this.ej.longValue());
         Class49.b(this.nt[1], this.dt.longValue());
      }
   }

   public void h() {
      int var1 = 1 + this.yx().goodPacks.length / 24;
      if (this.nx == null || this.nx.length != var1) {
         this.nx = this.zd(this.nx, var1, this.fx.ah());
         short var2 = 523;
         short var3 = 259;

         int var4;
         for (int var10000 = var4 = 0; var10000 < this.nx.length; var10000 = var4) {
            com.xy.i.Class3 var5 = this.nx[var4];
            int var10002 = var3 + var4 * 35;
            var4++;
            var5.setBounds(var2, var10002, 36, 33);
         }

         this.fx.vr(this.nx, 0);
      }
   }
}
