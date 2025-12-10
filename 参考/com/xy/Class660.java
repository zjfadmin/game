package com.xy;

import com.xy.bean.SuitOperBean;
import com.xy.entity.Baby;
import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

public class Class660 extends Class345 {
   private Class489[] aii;
   private MoneyType ca;
   private Class390 aij;
   private int br;
   private int gv;
   private Class44[] nt;
   private Class556 abn;
   private BigDecimal ge;
   private JLabel[] c;
   private Class436[] be;
   private Class357 aik;
   private Class489[] rt;
   private Class245[] ail;

   public void bk(BigDecimal var1) {
      if (this.aij != null) {
         RoleData var5 = this.vd();
         Object var3 = new ArrayList();

         int var4;
         for(int var10000 = var4 = 3 >> 2; var10000 < var5.babys.size(); var10000 = var4) {
            Baby var2 = (Baby)var5.babys.get(var4);
            if (var1 == null || var2.getBabyid().compareTo(var1) == 0) {
               BigDecimal[] var6 = var2.getpartAll();
               var3 = this.bj((List)var3, var6);
            }

            ++var4;
         }

         this.aij.qb.aiz().i(3 & 4);
         this.aij.qb.ck((List)var3);
      }
   }

   public int e() {
      return this.br;
   }

   public List<BigDecimal> bj(List<BigDecimal> var1, BigDecimal[] var2) {
      int var3;
      for(int var10000 = var3 = 3 ^ 3; var10000 < var2.length; var10000 = var3) {
         Goodstable var4;
         if ((var4 = this.vd().getGoodEquip(var2[var3])) != null) {
            if (var1 == null) {
               var1 = new ArrayList();
            }

            ((List)var1).add(var4.getRgid());
         }

         ++var3;
      }

      return (List)var1;
   }

   public void q() {
      this.abn.cc();
      this.dp(this.br);
      super.q();
   }

   public void dp(int var1) {
      int var10000 = 5 >> 3;
      this.br = var1;

      for(var1 = var10000; var10000 < this.aii.length; var10000 = var1) {
         this.aii[var1].setKeep((boolean)(var1 == this.br ? --1 : 0));
         ++var1;
      }

      Class44 var3;
      for(var10000 = var1 = 3 ^ 3; var10000 < this.nt.length; var10000 = var1) {
         var3 = this.nt[var1];
         ++var1;
         var3.c(3 >> 2, (Object)null);
      }

      int var10001;
      Goodstable var2;
      Goodstable var10002;
      Class660 var4;
      if (this.br == 0) {
         var2 = this.vc().n(new BigDecimal(26621 & 6814));
         var3 = this.nt[4 ^ 5];
         if (var2 != null) {
            var10001 = --1;
            var10002 = var2;
         } else {
            var10001 = 0;
            var10002 = var2;
         }

         var3.c(var10001, var10002);
         var4 = this;
         this.ge = new BigDecimal(100000);
         Class681.j(this.ail[5 >> 1], this.ge.longValue());
         this.rt[2 ^ 3].setText("雕琢");
      } else {
         if (this.br == --1) {
            var2 = this.vc().n(new BigDecimal(16093 & 17343));
            var3 = this.nt[--1];
            if (var2 != null) {
               var10001 = --1;
               var10002 = var2;
            } else {
               var10001 = 0;
               var10002 = var2;
            }

            var3.c(var10001, var10002);
            this.ge = new BigDecimal(100000);
            Class681.j(this.ail[1 ^ 3], this.ge.longValue());
            this.rt[3 & 5].setText("重铸");
         }

         var4 = this;
      }

      var4.s();
      this.r((boolean)(3 >> 2));
   }

   public void r(boolean var1) {
      if (this.aij != null || var1) {
         if (var1) {
            if (this.aij == null) {
               this.add(this.aij = new Class390(this), 3 & 4);
            }

            int var10004 = 3 & 4;
            this.aij.qc.ak((boolean)(3 & 4));
            this.aij.qc.oy().removeAllElements();
            int var4 = var10004;
            RoleData var6 = this.vd();
            List var2 = null;

            int var5;
            for(int var10000 = var5 = 3 >> 2; var10000 < var6.babys.size(); var10000 = var5) {
               Baby var3;
               BigDecimal[] var7 = (var3 = (Baby)var6.babys.get(var5)).getpartAll();
               if (var2 != null) {
                  var2.clear();
               }

               if ((var2 = this.bj(var2, var7)) != null && var2.size() != 0) {
                  var4 += var2.size();
                  Class367 var8 = new Class367(var3.getBabyname() + "(" + var2.size() + ")", var3.getBabyid());
                  this.aij.qc.amy(var8);
               }

               ++var5;
            }

            Class367 var9 = new Class367("全部(" + var4 + ")", (Object)null);
            this.aij.qc.amy(var9);
            this.aij.qc.y(this.aij.qc.oy().size() - (4 ^ 5));
            this.aij.setBounds(62 & 95, 125 & 110, 13787 & 19310, 2967 & 29950);
         }

         this.aij.setVisible(var1);
      }
   }

   public void s() {
      RoleData var1;
      long var2 = (var1 = this.vd()).getGoodTypeNum(1709 & 31195);
      if ((long)this.gv != var2) {
         this.gv = (int)var2;
         this.ail[--3].setText("1/" + this.gv);
      }

      if (this.nt[3 ^ 3].tp() != 0) {
         Goodstable var4;
         if ((var4 = (Goodstable)this.nt[5 >> 3].hr()) != null) {
            var4 = var1.getGood(var4.getRgid());
         }

         if (var4 == null) {
            this.ax((Goodstable)null);
            return;
         }
      }

   }

   public void ax(Goodstable var1) {
      Class44 var10000 = this.nt[2 & 5];
      int var10001;
      Goodstable var10002;
      if (var1 != null) {
         var10001 = --1;
         var10002 = var1;
      } else {
         var10001 = 0;
         var10002 = var1;
      }

      var10000.c(var10001, var10002);
   }

   public boolean bl() {
      Goodstable var4;
      RoleData var6;
      if ((var4 = (var6 = this.vd()).az((long)(this.br == 0 ? 30139 & 2766 : 136))) == null) {
         this.aej.f(this.br == 0 ? "缺少毓秀石" : "缺少换骨丹");
         return (boolean)(3 >> 2);
      } else {
         Goodstable var3;
         if ((var3 = (Goodstable)this.nt[3 & 4].hr()) != null) {
            var3 = var6.getGood(var3.getRgid());
         }

         int var10000;
         if (var3 == null) {
            var10000 = 5 >> 3;
            this.aej.f("请选择对应物品");
            return (boolean)var10000;
         } else if (this.ge != null && var6.getLoginResult().getGold().compareTo(this.ge) < 0) {
            var10000 = 3 ^ 3;
            this.aej.f("大话币不足" + this.ge.longValue() / 10000L + "万");
            return (boolean)var10000;
         } else {
            Class53 var13;
            if ((var13 = (Class53)this.ve().m(43 & 95)) != null) {
               int var10001;
               Goodstable var10002;
               if (this.br == 0) {
                  var10001 = 106 & 29;
                  var10002 = var3;
               } else {
                  var10001 = 7;
                  var10002 = var3;
               }

               if (var13.zg(var10001, var10002.getRgid())) {
                  SuitOperBean var11 = new SuitOperBean();
                  ArrayList var12 = new ArrayList();
                  var12.add(var3.getRgid());
                  var12.add(var4.getRgid());
                  var11.setType(this.br == 0 ? 3583 & 29319 : 133);
                  var11.setGoods(var12);
                  String var10 = Agreement.getSendTextAES("suitoperate", Class695.b().toJson(var11));
                  var10000 = 2 ^ 3;
                  this.uw().d(var10);
                  return (boolean)var10000;
               }
            }

            if (var13 == null) {
               var13 = (Class53)this.ve().e(59 & 79);
            }

            if (this.br == 0) {
               String var2;
               if ((var2 = GoodType.getExtra(var3.getValue(), "炼器属性")) == null) {
                  var10000 = 3 & 4;
                  this.aej.f("点金后才能雕琢");
                  return (boolean)var10000;
               }

               var13.zi(var3.getRgid(), var2, 123 & 12, (boolean)(5 >> 2));
            } else {
               StringBuffer var9 = new StringBuffer();
               int var5 = 3 & 4;

               int var1;
               for(var10000 = var1 = 3 & 4; var10000 < var3.getValue().length(); var10000 = var1) {
                  if ((var1 = var3.getValue().indexOf("|", var5 + --1)) == -4 >> 2) {
                     var1 = var3.getValue().length();
                  }

                  String var8;
                  if ((var8 = var3.getValue().substring(var5, var1)).startsWith(GoodType.Extras[2 ^ 3])) {
                     var10000 = var1;
                  } else {
                     int var7;
                     if ((var7 = var8.indexOf("=")) == -4 >> 2) {
                        var10000 = var1;
                     } else {
                        label110: {
                           String var14;
                           if (!(var14 = var8.substring(5 >> 3, var7)).equals("等级") && !var14.equals("装备类型")) {
                              if (var14.equals("性别要求")) {
                                 var10000 = var1;
                                 break label110;
                              }

                              if (var9.length() != 0) {
                                 var9.append("|");
                              }

                              var9.append(var8);
                           }

                           var10000 = var1;
                        }
                     }
                  }

                  var5 = var10000 + 1;
               }

               var13.zi(var3.getRgid(), var9.toString(), 39 & 95, (boolean)(2 ^ 3));
            }

            return false;
         }
      }
   }

   public void as(int var1) {
      this.br = var1;
      this.ve().a(this.ae());
   }

   public void y(int var1) {
      if (var1 == (127 & 83)) {
         this.d();
      } else {
         if (var1 == (124 & 87)) {
            this.bl();
         }

      }
   }

   public void d() {
      if (this.aij == null) {
         this.r((boolean)(--1));
      } else {
         this.r((boolean)(this.aij.isVisible() ? 2 & 5 : 1));
      }
   }

   protected void paintComponent(Graphics var1) {
      if (this.aej.bl()) {
         this.s();
      }

      super.paintComponent(var1);
   }

   public Class660(GameView var1) {
      int var10001 = 5 >> 1;
      int var10005 = -4 >> 2;
      int var10007 = -4 >> 2;
      super(12471 & 20462, 5 >> 1, Class345.aef, var1);
      this.gv = var10007;
      this.va(var10005, 3 & 4, 4606 & 28543, 24039 & 9178, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 111 & 84, 111 & 84, 111 & 84, 111 & 84, (boolean)(5 >> 3)), "雕琢");
      Class489[] var6 = new Class489[var10001];
      boolean var10003 = true;
      this.aii = var6;

      int var2;
      Class489[] var5;
      int var10000;
      Font var18;
      int var10006;
      String var10009;
      Class660 var10010;
      for(var10000 = var2 = 2 & 5; var10000 < this.aii.length; var10000 = var2) {
         var5 = this.aii;
         Class489 var10002 = new Class489;
         var10005 = --2;
         var10006 = (93 & 115) + var2;
         var18 = Class681.cw;
         if (var2 == 0) {
            var10009 = "雕琢";
            var10010 = this;
         } else if (var2 == 5 >> 2) {
            var10009 = "重铸";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var10002.<init>("sc/e/39.png", var10005, var10006, var18, (Color[])null, var10009, var10010);
         var5[var2] = var10002;
         this.aii[var2].setOffsetTexts(Class681.cl);
         this.aii[var2].setBounds((119 & 60) + (123 & 69) * var2, 55 & 94, 127 & 63, 24 & 127);
         this.add(this.aii[var2++]);
      }

      var6 = new Class489[--3];
      var10003 = true;
      this.rt = var6;

      Class660 var7;
      for(var10000 = var2 = 2 & 5; var10000 < this.rt.length; var10000 = var2) {
         var5 = this.rt;
         Class489 var8 = new Class489;
         String var10004 = var2 == 0 ? "sc/e/28.png" : (var2 == --1 ? "sc/e/7.png" : "sc/e/40.png");
         var10006 = (115 & 95) + var2;
         var18 = var2 == (2 ^ 3) ? Class681.ak : Class681.bm;
         if (var2 == 0) {
            var10009 = "已穿装备";
            var10010 = this;
         } else if (var2 == (3 & 5)) {
            var10009 = "雕琢";
            var10010 = this;
         } else if (var2 == --2) {
            var10009 = "？";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var8.<init>(var10004, 1, var10006, var18, (Color[])null, var10009, var10010);
         var5[var2] = var8;
         if (var2 == 0) {
            var7 = this;
            this.rt[var2].setBounds(127 & 115, 17871 & 15026, 63 & 124, 114 & 31);
         } else if (var2 == --1) {
            var7 = this;
            this.rt[var2].setBounds(29359 & 3580, 267, 59, 25);
            this.rt[var2].setForeground(Color.black);
         } else {
            if (var2 == 5 >> 1) {
               this.rt[var2].setBounds(335, 49, 18, 18);
            }

            var7 = this;
         }

         var7.add(this.rt[var2++]);
      }

      JLabel[] var9 = new JLabel[--4];
      var10003 = true;
      this.c = var9;

      for(var10000 = var2 = 5 >> 3; var10000 < this.c.length; var10000 = var2) {
         this.c[var2] = Class133.c(109, 167 + 23 * var2, 60, 19, 10, Class681.c("#cFFFFFF"), Class681.ab);
         this.c[var2].setText(var2 == 0 ? "消耗体力" : (var2 == (2 ^ 3) ? "拥有体力" : (var2 == 5 >> 1 ? "消耗金钱" : (var2 == --3 ? "拥有金钱" : ""))));
         this.add(this.c[var2++]);
      }

      Class245[] var11 = new Class245[--4];
      var10003 = true;
      this.ail = var11;

      for(var10000 = var2 = 2 & 5; var10000 < this.ail.length; var10000 = var2) {
         this.ail[var2] = Class133.a(170, 167 + 23 * var2, 124, 19, 10, Color.white, Class681.q);
         this.ail[var2].eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(2 & 5)));
         if (var2 == --3) {
            this.ail[var2].setBounds(229, 129, 64, 19);
            this.ail[var2].setHorizontalAlignment(3 ^ 3);
         }

         this.add(this.ail[var2++]);
      }

      var10001 = 1 ^ 3;
      this.ca = new MoneyType();
      this.ca.setIdAndKey(3 >> 1, "金 钱");
      this.abn = Class133.m(170, 236, 124, 19, 10, Color.white, Class681.q, this.ca, var1);
      this.abn.eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(3 & 4)));
      this.add(this.abn);
      Class44[] var12 = new Class44[var10001];
      var10003 = true;
      this.nt = var12;

      for(var10000 = var2 = 3 >> 2; var10000 < this.nt.length; var10000 = var2) {
         this.nt[var2] = new Class44(this);
         this.nt[var2].fw("sc/d/4.png");
         this.nt[var2].ad(Class44.arh);
         this.nt[var2].setBounds(115 + var2 * 116, 71, 59, 57);
         this.add(this.nt[var2++]);
      }

      Class436[] var13 = new Class436[1 ^ 3];
      var10003 = true;
      this.be = var13;

      for(var10000 = var2 = 3 >> 2; var10000 < this.be.length; var10000 = var2) {
         this.be[var2] = new Class436();
         if (var2 == 0) {
            var7 = this;
            this.be[var2].eq(Class511.q("sc/d/19.png", --5, --5, --5, --5, (boolean)(3 ^ 3)));
            this.be[var2].setBounds(47, 305, 309, 105);
         } else {
            if (var2 == 5 >> 2) {
               this.be[var2].eq(Class511.q("sc/d/49.png", 5, 5, 5, 5, false));
               this.be[var2].setBounds(46, 46, 310, 260);
            }

            var7 = this;
         }

         var7.add(this.be[var2++]);
      }

      Class216[] var17 = new Class216[2];
      boolean var14 = true;
      Class216[] var4 = var17;

      int var3;
      for(var10000 = var3 = 0; var10000 < var4.length; var10000 = var3) {
         var4[var3] = new Class216(var3 == 0 ? "sc/e/42.png" : "sc/e/43.png", 1, var3, this);
         if (var3 == 0) {
            var4[var3].setBounds(316, 412, 18, 18);
            var7 = this;
         } else {
            var4[var3].setBounds(338, 412, 18, 18);
            var7 = this;
         }

         var7.add(var4[var3++]);
      }

      this.aik = new Class357(this, 6, 2, 51, 51, 0, 0, 48, 307);
      this.aik.hf(Class511.a("sc/d/18.png"));
      this.aik.aiw(var4, 1);
      long[] var15 = new long[1];
      boolean var16 = true;
      var15[0] = 139L;
      this.aik.ud(var15);
      this.add(this.aik);
   }
}
