package com.xy;

import com.xy.bean.LoginResult;
import com.xy.bean.SuitOperBean;
import com.xy.entity.PartJade;
import com.xy.game.RoleData;
import com.xy.readbean.MoneyType;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.math.BigDecimal;
import javax.swing.JLabel;

public class Class263 extends Class345 {
   private Class614 ahd;
   private Class436 ahe;
   private BigDecimal ahf;
   private Class217 ahg;
   private Class585 ahh;
   private Class245[] iu;
   private Class556 abn;
   private Class436[] cs;
   private MoneyType hz;
   private Class489[] ci;
   private Class44 ahi;
   private BigDecimal co;
   private JLabel[] u;

   public Class614 xi() {
      return this.ahd;
   }

   public Class263(GameView var1) {
      int var10001 = --4;
      int var10004 = 5 >> 3;
      int var10008 = -2 & -1;
      super(96 & 95, 1 ^ 3, Class345.aef, var1);
      this.co = null;
      this.ahf = null;
      this.va(var10008, 2 & 5, 6959 & 26367, 26111 & 7151, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 125 & 70, 125 & 70, 125 & 70, 125 & 70, (boolean)(2 & 5)), "收录玉符");
      this.ak((boolean)var10004);
      this.ad(new Class116(31 & 110, 3 ^ 3, 95 & 39, 3 ^ 3));
      Class489[] var5 = new Class489[var10001];
      boolean var10003 = true;
      this.ci = var5;

      int var2;
      Class263 var4;
      int var10000;
      for(var10000 = var2 = 3 ^ 3; var10000 < this.ci.length; var10000 = var2) {
         Class489[] var3 = this.ci;
         Class489 var10002 = new Class489;
         int var10005 = 3 >> 1;
         int var10006 = (91 & 46) + var2;
         Font var10007 = Class681.ak;
         String var10009;
         Class263 var10010;
         if (var2 == 0) {
            var10009 = "高级查询";
            var10010 = this;
         } else if (var2 == (1 ^ 3)) {
            var10009 = "收录";
            var10010 = this;
         } else if (var2 == --3) {
            var10009 = "获得";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var10002.<init>("sc/e/28.png", var10005, var10006, var10007, (Color[])null, var10009, var10010);
         var3[var2] = var10002;
         this.ci[var2].setBounds(19819 & 13271, 124 & 27, 85 & 110, 83 & 62);
         if (var2 == 0) {
            var4 = this;
            this.ci[var2].setFont(Class681.bm);
         } else if (var2 == 3 >> 1) {
            var4 = this;
            this.ci[var2].setImage("sc/e/65.png");
            this.ci[var2].setBounds(19455 & 13799, 92 & 59, 22 & 123, 22 & 123);
         } else if (var2 == (1 ^ 3)) {
            var4 = this;
            this.ci[var2].setForeground(Color.black);
            this.ci[var2].setImage("sc/e/7.png");
            this.ci[var2].setBounds(97 & 127, 445, 59, 25);
         } else {
            if (var2 == --3) {
               this.ci[var2].setImage("sc/e/6.png");
               this.ci[var2].setFont(Class681.bm);
               this.ci[var2].setBounds(163, 423, 34, 18);
            }

            var4 = this;
         }

         var4.add(this.ci[var2++]);
      }

      var10001 = --5;
      this.ahe = new Class436();
      this.ahe.setBounds(45, 255, 17, 17);
      this.add(this.ahe);
      this.ahd = new Class614(this, this.ahe);
      this.ahd.ce().setBounds(46, 64, 165, 187);
      this.add(this.ahd.ce());
      this.ahd.by().setBounds(216, 44, 306, 210);
      this.add(this.ahd.by());
      JLabel[] var6 = new JLabel[var10001];
      var10003 = true;
      this.u = var6;

      for(var10000 = var2 = 5 >> 3; var10000 < this.u.length; var10000 = var2) {
         this.u[var2] = Class133.c(46, 43, 165, 21, 10, Class681.c("#c000000"), Class681.ak);
         this.u[var2].setText(var2 == 0 ? "套装列表" : (var2 == (3 & 5) ? "只显示已有玉符" : (var2 == --2 ? "所需金钱：" : (var2 == --3 ? "所需灵修值：" : (var2 == --4 ? "已有灵修值：" : "")))));
         if (var2 == 0) {
            var4 = this;
            this.u[var2].setForeground(Class681.c("#cFFFFFF"));
            this.u[var2].setHorizontalAlignment(3 & 4);
         } else if (var2 == (2 ^ 3)) {
            var4 = this;
            this.u[var2].setFont(Class681.ab);
            this.u[var2].setBounds(63, 256, 100, 14);
         } else {
            if (var2 >= 5 >> 1 && var2 <= --4) {
               this.u[var2].setBounds(58, 371 + 35 * (var2 - --3), 120, 17);
            }

            var4 = this;
         }

         var4.add(this.u[var2++]);
      }

      var10001 = --2;
      this.ahg = Class133.n(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(3 >> 2)), Class681.q, Color.white);
      this.ahg.setBounds(396, 23, 110, 20);
      this.add(this.ahg);
      Class245[] var8 = new Class245[var10001];
      var10003 = true;
      this.iu = var8;

      for(var10000 = var2 = 5 >> 3; var10000 < this.iu.length; var10000 = var2) {
         this.iu[var2] = Class133.a(55, 387 + (var2 - (2 ^ 3)) * 35, 144, 19, 10, Color.white, Class681.q);
         this.iu[var2].eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(2 & 5)));
         this.add(this.iu[var2++]);
      }

      this.hz = new MoneyType();
      this.hz.setIdAndKey(3 >> 2, "灵修值");
      this.abn = Class133.i(10, Color.white, Class681.q, this.hz, var1);
      this.abn.eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(2 & 5)));
      this.abn.ab(1 ^ 3);
      this.abn.setBounds(55, 422, 144, 19);
      this.add(this.abn);
      this.ahi = new Class44(this);
      this.ahi.setBounds(100, 278, 50, 50);
      this.add(this.ahi);
      Class436[] var9 = new Class436[6];
      var10003 = true;
      this.cs = var9;

      for(var10000 = var2 = 3 ^ 3; var10000 < this.cs.length; var10000 = var2) {
         this.cs[var2] = new Class436();
         if (var2 == 0) {
            var4 = this;
            this.cs[var2].eq(Class511.q("sc/d/25.png", 1 ^ 3, 1 ^ 3, 1 ^ 3, 1 ^ 3, (boolean)(5 >> 3)));
            this.cs[var2].setBounds(46, 43, 165, 21);
         } else if (var2 == (4 ^ 5)) {
            var4 = this;
            this.cs[var2].eq(Class511.q("sc/d/24.png", 2, 2, 2, 2, false));
            this.cs[var2].setBounds(46, 43, 165, 210);
         } else if (var2 == 2) {
            var4 = this;
            this.cs[var2].eq(Class511.q("sc/d/24.png", 2, 2, 2, 2, false));
            this.cs[var2].setBounds(214, 44, 308, 210);
         } else if (var2 == 3) {
            var4 = this;
            this.cs[var2].fw("sc/d/4.png");
            this.cs[var2].setBounds(96, 274, 59, 57);
         } else if (var2 == 4) {
            var4 = this;
            this.cs[var2].fw("sc/d/30.png");
            this.cs[var2].setBounds(97, 331, 58, 1);
         } else {
            if (var2 == 5) {
               this.cs[var2].eq(Class511.q("sc/d/19.png", 5, 5, 5, 5, false));
               this.cs[var2].setBounds(214, 259, 309, 207);
            }

            var4 = this;
         }

         var4.add(this.cs[var2++]);
      }

      this.ahh = new Class585(this, 6, 4, 51, 51, 0, 0, 215, 261);
      this.ahh.hf(Class511.a("sc/d/18.png"));
      this.ahh.gb(true);
      this.add(this.ahh);
   }

   public void p() {
      PartJade var1;
      if ((var1 = (PartJade)this.ahi.hr()) == null) {
         this.co = null;
         this.iu[2 & 5].setText((String)null);
         this.ahf = null;
         this.iu[2 ^ 3].setText((String)null);
      } else {
         RoleData var2 = this.vd();
         this.co = new BigDecimal((var2.getPackRecord().getCollectionNum(var1, this.vc()) + (3 & 5)) * 1000000);
         this.ahf = new BigDecimal(62 & 115);
         Class681.j(this.iu[5 >> 3], this.co.longValue());
         Class681.j(this.iu[3 >> 1], this.ahf.longValue());
      }
   }

   public void s() {
      PartJade var1;
      if ((var1 = (PartJade)this.ahi.hr()) == null) {
         this.aej.fw("请选择你要收录的玉符..");
      } else {
         int var4 = (int)this.ahi.gl();
         RoleData var3;
         LoginResult var2 = (var3 = this.vd()).getLoginResult();
         if (this.ahf.compareTo(var2.getScoretype("灵修值")) > 0) {
            this.aej.fw("灵修值点数不足，快去获取灵修值吧..");
         } else if (this.co.compareTo(var2.getGold()) > 0) {
            this.aej.fw("金币不足..");
         } else if (var3.getPackRecord().d((int)var1.getSuitid(), var1.getPartId()) != null) {
            this.aej.fw("已到达收录上限..");
         } else {
            SuitOperBean var6 = new SuitOperBean();
            var1 = new PartJade(var1.getSuitid(), var1.getPartId());
            var1.setJade(var4, 5 >> 2);
            var6.setJade(var1);
            var6.setType(46 & 89);
            String var5 = Agreement.getSendTextAES("suitoperate", Class695.b().toJson(var6));
            this.uw().d(var5);
            var2.setScore(Class509.h(var2.getScore(), "灵修值=" + this.ahf, --3));
            var2.setGold(var2.getGold().subtract(this.co));
            this.aej.fw("消耗了" + this.ahf + "点灵修值       扣除了" + this.co + "金币..");
            this.ahi.c(3 & 4, (Object)null);
            this.p();
            this.abn.cc();
         }
      }
   }

   public Class44 u() {
      return this.ahi;
   }

   public void q() {
      this.d();
      this.ahd.d();
      this.ahi.c(3 & 4, (Object)null);
      this.p();
      this.abn.cc();
      super.q();
   }

   public void d() {
      Class216[] var10001;
      Class263 var10002;
      if (this.ahh.aiz() != null) {
         var10001 = this.ahh.aiz().f();
         var10002 = this;
      } else {
         var10001 = null;
         var10002 = this;
      }

      Class216[] var1 = this.vg(var10001, var10002.vd().goodPacks.length / (24 & 127), this.ahh.t(), 2 & 5, 2667 & 30623, 259 & 32767);
      this.ahh.aiw(var1, 3 >> 2);
   }
}
