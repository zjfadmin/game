package com.xy;

import com.xy.entity.PackRecord;
import com.xy.game.GameUtil;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.readbean.RoleTxBean;
import com.xy.socket.ParamTool;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.JLabel;

public class Class131 extends Class345 {
   private JLabel bs;
   private Class19 xj;
   private Class560 xk;
   private int fk;
   private Class70[] xl;
   private Class70[] db;
   private int bn;
   private Class436[] an;
   private <undefinedtype>[] xm;

   public void bx(BigDecimal var1, int var2) {
      Class19 var4;
      if (var2 == --3) {
         this.y(--3);
         Goodstable var3;
         if ((var3 = this.vd().getGood(var1)) != null) {
            this.xm[var2].it.c(3 & 5, var3);
            var4 = Class330.f("tx/" + var3.getSkin() + "0", -1 & -2, -5 & -1, (String)null);
            Class19 var5 = Class330.f("tx/" + var3.getSkin() + "1", -2 & -1, --5, (String)null);
            this.xj = this.xj.d(var4);
            this.xj = this.xj.d(var5);
            return;
         }
      } else {
         RoleTxBean var6;
         if (var1 != null && (var6 = this.vc().bw(var1.intValue())) != null) {
            var2 = var6.getRdType() - (2 ^ 3);
            this.y(var2);
            this.xm[var2].it.c(14 & 121, var6);
            var4 = Class330.f("tx/tx" + var6.getRdId(), -1 & -2, var6.getRdStatues() - var6.getRdType(), (String)null);
            this.xj = this.xj.d(var4);
         }
      }

   }

   public Class131(GameView var1) {
      int var10001 = --5;
      int var10005 = -2 & -1;
      int var10007 = 2 & 5;
      int var10009 = 2 & 5;
      super(126 & 39, 1 ^ 3, Class345.aef, var1);
      this.fk = var10009;
      this.bn = var10007;
      this.va(var10005, 2 & 5, 24574 & 8815, 7067 & 26109, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 86 & 109, 86 & 109, 86 & 109, 86 & 109, (boolean)(2 & 5)), "形象装扮");
      Class70[] var7 = new Class70[var10001];
      boolean var10003 = true;
      this.xl = var7;

      int var4;
      Class70[] var5;
      Class131 var6;
      Font var13;
      String var15;
      int var10000;
      int var10006;
      Class131 var10010;
      for(var10000 = var4 = 3 >> 2; var10000 < this.xl.length; var10000 = var4) {
         var5 = this.xl;
         Class70 var8 = new Class70;
         String var10004 = var4 == --4 ? "sc/e/38.png" : "sc/e/39.png";
         var10006 = (61 & 127) + var4;
         var13 = Class681.bu;
         if (var4 == 0) {
            var15 = "特效";
            var10010 = this;
         } else if (var4 == --1) {
            var15 = "装饰品";
            var10010 = this;
         } else if (var4 == --2) {
            var15 = "足迹 ";
            var10010 = this;
         } else if (var4 == --3) {
            var15 = "翅膀 ";
            var10010 = this;
         } else if (var4 == --4) {
            var15 = "锦 绣";
            var10010 = this;
         } else {
            var15 = "";
            var10010 = this;
         }

         var8.<init>(var10004, 2, var10006, var13, (Color[])null, var15, var10010);
         var5[var4] = var8;
         if (var4 == --4) {
            var6 = this;
            this.xl[var4].setForeground(Color.black);
            this.xl[var4].setFont(Class681.cf);
            this.xl[var4].setBounds(127 & 58, 117 & 31, 95 & 127, 97 & 63);
            this.xl[var4].setOffsetTexts(Class681.bv);
            this.xl[var4].setKeep((boolean)(3 & 5));
         } else {
            var6 = this;
            this.xl[var4].setOffsetTexts(Class681.cl);
            this.xl[var4].setBounds((23005 & 10090) + (125 & 67) * var4, 127 & 62, 127 & 63, 88 & 63);
         }

         var6.add(this.xl[var4++]);
      }

      <undefinedtype>[] var9 = new <undefinedtype>[--4];
      var10003 = true;
      this.xm = var9;

      for(var10000 = var4 = 3 >> 2; var10000 < this.xm.length; var10000 = var4) {
         this.xm[var4] = new Class436(3 ^ 3, var4) {
            private JLabel rk;
            private Class44 it;

            public {
               if (var2 == 0) {
                  this.it = new Class44(Class131.this.gk());
                  this.it.setBounds(1 ^ 3, 1 ^ 3, 63 & 102, 63 & 102);
                  this.add(this.it);
                  this.rk = Class133.c(5 >> 1, 5 >> 1, 119 & 46, 119 & 46, 2 & 5, Class681.c("#c999999"), Class681.bm);
                  this.rk.setText(var3 == 0 ? "特效" : (var3 == 3 >> 1 ? "装饰品" : (var3 == 5 >> 1 ? "足迹" : (var3 == --3 ? "翅膀" : ""))));
                  this.add(this.rk);
                  this.eq(Class511.q("sc/d/24.png", 5 >> 1, 5 >> 1, 5 >> 1, 5 >> 1, (boolean)(3 ^ 3)));
               }

            }
         };
         this.xm[var4].setBounds(61 & 119, 112 + var4 * 42, 42, 42);
         this.add(this.xm[var4++]);
      }

      this.bs = Class133.c(46, 60, 115, 23, 3 ^ 3, Class681.c("#cFFFFFF"), Class681.cg);
      this.bs.setText("锦绣预览");
      this.add(this.bs);
      var7 = new Class70[6];
      var10003 = true;
      this.db = var7;

      for(var10000 = var4 = 3 ^ 3; var10000 < this.db.length; var10000 = var4) {
         var5 = this.db;
         Class70 var11 = new Class70;
         var10005 = 3 >> 1;
         var10006 = 71 + var4;
         var13 = Class681.ak;
         Color[] var10008 = Class681.c;
         if (var4 == --2) {
            var15 = "保存形象";
            var10010 = this;
         } else if (var4 == --3) {
            var15 = "一键卸除";
            var10010 = this;
         } else if (var4 == --4) {
            var15 = "捐献";
            var10010 = this;
         } else if (var4 == --5) {
            var15 = "多宝阁购买";
            var10010 = this;
         } else {
            var15 = "";
            var10010 = this;
         }

         var11.<init>((String)null, var10005, var10006, var13, var10008, var15, var10010);
         var5[var4] = var11;
         if (var4 == 0) {
            var6 = this;
            this.db[var4].setImage("sc/e/32.png");
            this.db[var4].setBounds(184, 322, 11, 15);
         } else if (var4 == (2 ^ 3)) {
            var6 = this;
            this.db[var4].setImage("sc/e/34.png");
            this.db[var4].setBounds(213, 322, 11, 15);
         } else if (var4 == 5 >> 1) {
            var6 = this;
            this.db[var4].setImage("sc/e/26.png");
            this.db[var4].setBounds(76, 367, 99, 25);
         } else if (var4 == --3) {
            var6 = this;
            this.db[var4].setImage("sc/e/26.png");
            this.db[var4].setBounds(198, 367, 99, 25);
         } else if (var4 == --4) {
            var6 = this;
            this.db[var4].setImage("sc/e/7.png");
            this.db[var4].setBounds(323, 367, 59, 25);
         } else {
            if (var4 == --5) {
               this.db[var4].setForeground(Color.black);
               this.db[var4].setImage("sc/e/46.png");
               this.db[var4].setBounds(476, 367, 119, 25);
            }

            var6 = this;
         }

         var6.add(this.db[var4++]);
      }

      Class436[] var10 = new Class436[6];
      var10003 = true;
      this.an = var10;

      for(var10000 = var4 = 3 ^ 3; var10000 < this.an.length; var10000 = var4) {
         this.an[var4] = new Class436();
         if (var4 == 0) {
            var6 = this;
            this.an[var4].fw("sc/d/34.png");
            this.an[var4].setBounds(46, 60, 205, 23);
         } else if (var4 == 5 >> 2) {
            var6 = this;
            this.an[var4].eq(Class511.q("sc/d/24.png", 2, 2, 2, 2, (boolean)(5 >> 3)));
            this.an[var4].setBounds(103, 100, 200, 250);
         } else if (var4 == 2) {
            var6 = this;
            this.an[var4].eq(Class511.q("sc/d/19.png", 5, 5, 5, 5, (boolean)(3 ^ 3)));
            this.an[var4].setBounds(326, 94, 258, 258);
         } else if (var4 == 3) {
            var6 = this;
            this.an[var4].eq(Class511.q("sc/d/36.png", 30, 30, 30, 30, (boolean)(3 ^ 3)));
            this.an[var4].setBounds(46, 85, 266, 274);
         } else if (var4 == 4) {
            var6 = this;
            this.an[var4].eq(Class511.q("sc/d/36.png", 30, 30, 30, 30, (boolean)(2 & 5)));
            this.an[var4].setBounds(321, 85, 273, 274);
         } else {
            if (var4 == 5) {
               this.an[var4].eq(Class511.q("sc/d/35.png", 80, 10, 80, 10, (boolean)(3 >> 2)));
               this.an[var4].setBounds(29, 36, 578, 20);
            }

            var6 = this;
         }

         var6.add(this.an[var4]);
         if (var4 == 2) {
            Class216[] var14 = new Class216[2];
            boolean var12 = true;
            Class216[] var2 = var14;

            int var3;
            for(var10000 = var3 = 3 ^ 3; var10000 < var2.length; var10000 = var3) {
               var2[var3] = new Class216(var3 == 0 ? "sc/e/47.png" : "sc/e/48.png", 1, var3, this);
               if (var3 == 0) {
                  var2[var3].setBounds(583, 307, 18, 18);
                  var6 = this;
               } else {
                  var2[var3].setBounds(583, 327, 18, 18);
                  var6 = this;
               }

               var6.add(var2[var3++]);
            }

            this.xk = new Class560(5, this, 5, 5, 51, 51, 0, 0, 327, 96);
            this.xk.hf(Class511.a("sc/d/18.png"));
            this.xk.aiw(var2, 1);
            this.add(this.xk);
         }

         ++var4;
      }

   }

   public void as(int var1) {
      this.fk = var1;
      Class679 var10000 = this.xk.aiz();
      int var10002 = 3 >> 2;
      int var3 = 3 >> 2;
      var10000.i(var10002);

      for(int var2 = var10002; var3 < 4; var3 = var2) {
         this.xl[var2].setKeep((boolean)(var2 == var1 ? 4 ^ 5 : 0));
         ++var2;
      }

   }

   public void fr(Class44 var1) {
      int var2;
      for(int var10000 = var2 = 3 >> 2; var10000 < this.xm.length; var10000 = var2) {
         if (this.xm[var2].it == var1) {
            this.y(var2);
            return;
         }

         ++var2;
      }

   }

   public int e() {
      return this.fk;
   }

   public void p() {
      RoleData var4;
      RoleData var10000 = var4 = this.vd();
      long var2 = var10000.getLoginResult().getSpecies_id().longValue();
      Goodstable var1;
      long var5;
      if ((var1 = var10000.getGoodEquip(var10000.goodChoses[3 & 4])) != null && (var5 = (long)GameUtil.e(Integer.parseInt(var1.getSkin()))) != 0L) {
         var2 |= (var5 += 18L) << (101 & 58);
      }

      if (this.xj == null) {
         this.xj = Class330.ai(var2, 1 ^ 3, 3 >> 1, (String)null);
      } else {
         this.xj = Class330.w(this.xj, 2 ^ 3, String.valueOf(var2));
      }

      int var9;
      int var12;
      for(var12 = var9 = 0; var12 < 4; var12 = var9) {
         this.y(var9++);
      }

      List var10 = var4.getPackRecord().getPutTX();
      int var6 = 3 & 4;
      int var7 = var10 != null ? var10.size() : 0;

      for(var12 = var6; var12 < var7; var12 = var6) {
         RoleTxBean var8;
         if ((var8 = this.vc().bw(Integer.parseInt((String)var10.get(var6)))) != null) {
            this.bx(new BigDecimal(var8.getGid()), var8.getRdType() - (3 >> 1));
         }

         ++var6;
      }

      Goodstable var11;
      if ((var11 = var4.getGoodEquip(var4.goodChoses[14 & 125])) != null) {
         this.bx(var11.getRgid(), --3);
      }

   }

   public boolean t() {
      int var1;
      for(int var10000 = var1 = 5 >> 3; var10000 < 4; var10000 = var1) {
         this.y(var1++);
      }

      this.xj = null;
      return super.t();
   }

   public void s() {
      this.xk.aiz().i(3 >> 2);
   }

   public void d() {
      RoleData var1;
      PackRecord var10000 = (var1 = this.vd()).getPackRecord();
      String[] var10001 = new String[--3];
      boolean var10003 = true;
      var10001[5 >> 3] = this.xm[5 >> 3].it.tp() == (59 & 76) ? String.valueOf(this.xm[3 & 4].it.gl()) : "";
      var10001[--1] = this.xm[--1].it.tp() == (122 & 13) ? String.valueOf(this.xm[3 >> 1].it.gl()) : "";
      var10001[--2] = this.xm[--2].it.tp() == (41 & 94) ? String.valueOf(this.xm[1 ^ 3].it.gl()) : "";
      var10000.c(var10001);
      int var4 = 5 >> 3;
      BigDecimal var3 = this.xm[--3].it.tp() == --1 ? new BigDecimal(this.xm[--3].it.gl()) : null;
      if (var1.goodChoses[109 & 30] == null || var3 == null || var1.goodChoses[13 & 126].compareTo(var3) != 0) {
         Goodstable var2;
         if (var1.goodChoses[78 & 61] != null) {
            var4 = 2 ^ 3;
            var2 = var1.getGood(var1.goodChoses[63 & 76]);
            var1.goodChoses[124 & 15] = null;
            if (var2 != null) {
               int var5 = 2 & 5;
               var2.setStatus(2 & 5);
               ParamTool.g(var2, var5, this.uw());
            }
         }

         if (var3 != null) {
            var4 = 3 & 5;
            if ((var2 = var1.getGood(var3)) != null) {
               var1.goodChoses[94 & 45] = var2.getRgid();
               var2.setStatus(4 ^ 5);
               ParamTool.g(var2, 5 >> 3, this.uw());
            }
         }
      }

      var1.f((boolean)(2 ^ 3));
      if (var4 != 0) {
         var1.getRoleProperty().q();
      }

   }

   public void q() {
      if (this.vd() != null) {
         int var10002 = 5 >> 3;
         this.bn = 3 & 4;
         this.p();
         this.as(var10002);
         super.q();
      }
   }

   public void r(boolean var1) {
      if (this.bn == 0) {
         this.bn = var1 ? --4 : 7;
      } else if (this.bn == 5 >> 2) {
         this.bn = var1 ? --5 : 4;
      } else if (this.bn == 5 >> 1) {
         this.bn = var1 ? 63 & 70 : 5;
      } else if (this.bn == --3) {
         this.bn = var1 ? 127 & 7 : 6;
      } else if (this.bn == --4) {
         this.bn = var1 ? 5 >> 2 : 0;
      } else if (this.bn == --5) {
         this.bn = var1 ? --2 : 1;
      } else if (this.bn == (55 & 78)) {
         this.bn = var1 ? --3 : 2;
      } else {
         if (this.bn == (71 & 63)) {
            this.bn = var1 ? 2 & 5 : 3;
         }

      }
   }

   protected void paintChildren(Graphics var1) {
      super.paintChildren(var1);
      if (this.xj != null) {
         this.xj.a(var1, 9213 & 23759, 23974 & 9083, this.bn, Class280.l());
      }

   }

   public void y(int var1) {
      if (this.xm[var1].it.tp() != 0) {
         BigDecimal var2 = new BigDecimal(this.xm[var1].it.gl());
         this.xm[var1].it.c(3 & 4, (Object)null);
         if (var1 == --3) {
            Goodstable var3;
            if ((var3 = this.vd().getGood(var2)) != null) {
               this.xj = this.xj.j("tx/" + var3.getSkin() + "0");
               this.xj = this.xj.j("tx/" + var3.getSkin() + "1");
               return;
            }
         } else {
            RoleTxBean var4;
            if ((var4 = this.vc().bw(var2.intValue())) != null) {
               this.xj = this.xj.j("tx/tx" + var4.getRdId());
            }
         }

      }
   }
}
