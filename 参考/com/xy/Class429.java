package com.xy;

import com.xy.bean.SummonPetBean;
import com.xy.entity.RoleSummoning;
import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.game.RolePet;
import com.xy.readbean.Goodstable;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class Class429 extends Class345 {
   private Class436[] v;
   private JScrollPane w;
   private Class19 x;
   private Class643[] y;
   private RichLabel z;
   private Class248 aa;
   private Class585 ab;
   private Class245 ac;
   private JLabel[] ad;
   private Class44 ae;
   private JScrollPane af;

   public void o() {
      RolePet var1;
      this.v((var1 = this.vd().getRolePet(this.aa.gl())) != null ? var1.getPet() : null);
   }

   protected void paintChildren(Graphics var1) {
      super.paintChildren(var1);
      if (this.x != null) {
         this.x.a(var1, 122 & 127, 10751 & 22231, 3 & 4, Class280.l());
      }

   }

   public void p() {
      this.w(this.vd().getRolePet(this.aa.gl()));
   }

   public Class429(GameView var1) {
      int var10001 = --5;
      int var10005 = 43 & 126;
      int var10011 = -4 >> 2;
      super(49 & 95, --2, Class345.aef, var1);
      this.va(var10011, 3 & 4, 7868 & 25459, 31711 & 1531, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 78 & 117, 78 & 117, 78 & 117, 78 & 117, (boolean)(5 >> 3)), " 炼 妖 ");
      this.aa = new Class248(this);
      this.aa.setBounds(5 >> 3, 5 >> 3, 8092 & 24815, 119 & 28);
      this.w = Class133.f(var10005, 8591 & 24446, 1471 & 31466, 18365 & 14587, this.aa, 61 & 86);
      this.add(this.w);
      int var10006 = 25977 & 7166;
      this.z = new RichLabel("", Class681.ab, 4562 & 28335);
      this.af = Class133.f(var10006, 125 & 62, 4785 & 28127, 11707 & 21238, this.z, 20);
      this.add(this.af);
      Class643[] var5 = new Class643[var10001];
      boolean var10003 = true;
      this.y = var5;

      int var2;
      Class429 var4;
      int var10000;
      for(var10000 = var2 = 3 & 4; var10000 < this.y.length; var10000 = var2) {
         Class643[] var3 = this.y;
         Class643 var6 = new Class643;
         String var10004 = var2 == 0 ? "sc/e/38.png" : "sc/e/7.png";
         int var10007;
         if (var2 == 0) {
            var10006 = 3 & 4;
            var10007 = var2;
         } else {
            var10006 = 51;
            var10007 = var2;
         }

         Font var9 = var10007 == 0 ? Class681.cf : Class681.ak;
         Color[] var10008 = Class681.c;
         String var10009;
         Class429 var10010;
         if (var2 == 0) {
            var10009 = "炼 妖";
            var10010 = this;
         } else if (var2 == (2 ^ 3)) {
            var10009 = "炼妖";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var6.<init>(var10004, 1, var10006, var9, var10008, var10009, var10010);
         var3[var2] = var6;
         if (var2 == 0) {
            var4 = this;
            this.y[var2].setOffsetTexts(Class681.bv);
            this.y[var2].setBounds(60, 16, 95, 33);
            this.y[var2].setKeep((boolean)(--1));
         } else {
            if (var2 == --1) {
               this.y[var2].setBounds(258, 168, 59, 25);
            }

            var4 = this;
         }

         var4.add(this.y[var2++]);
      }

      JLabel[] var7 = new JLabel[--3];
      var10003 = true;
      this.ad = var7;

      for(var10000 = var2 = 2 & 5; var10000 < this.ad.length; var10000 = var2) {
         if (var2 != 0 && var2 != (2 ^ 3)) {
            this.ad[var2] = Class133.c(256, 101 + var2 * 17, 59, 16, 3 >> 2, Class681.c("#c999999"), Class681.bm);
            this.ad[var2].setText(var2 == 0 ? "炼妖" : (var2 == (4 ^ 5) ? "物品" : (var2 == 5 >> 1 ? "炼妖次数：" : "")));
            if (var2 == 5 >> 1) {
               this.ad[var2].setFont(Class681.ak);
               this.ad[var2].setForeground(Class681.c("#c000000"));
               this.ad[var2].setBounds(218, 203, 86, 19);
            }

            this.add(this.ad[var2]);
         }

         ++var2;
      }

      this.ac = Class133.a(300, 203, 44, 19, 3 >> 2, Color.white, Class681.ce);
      this.ac.eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(5 >> 3)));
      this.add(this.ac);
      this.ae = new Class44(this);
      this.ae.setBounds(260, 93, 50, 50);
      this.add(this.ae);
      Class436[] var8 = new Class436[9];
      var10003 = true;
      this.v = var8;

      for(var10000 = var2 = 3 & 4; var10000 < this.v.length; var10000 = var2) {
         this.v[var2] = new Class436();
         if (var2 == 0) {
            var4 = this;
            this.v[var2].eq(Class511.q("sc/d/24.png", 5 >> 1, 5 >> 1, 5 >> 1, 5 >> 1, (boolean)(3 >> 2)));
            this.v[var2].setBounds(46, 59, 150, 180);
         } else if (var2 == --1) {
            var4 = this;
            this.v[var2].fw("sc/d/4.png");
            this.v[var2].setBounds(256, 89, 59, 57);
         } else if (var2 == --2) {
            var4 = this;
            this.v[var2].fw("sc/d/30.png");
            this.v[var2].setBounds(257, 146, 58, 3 & 5);
         } else if (var2 == --3) {
            var4 = this;
            this.v[var2].eq(Class511.q("sc/d/49.png", 6, 6, 6, 6, (boolean)(2 & 5)));
            this.v[var2].setBounds(372, 59, 150, 180);
         } else if (var2 == --4) {
            var4 = this;
            this.v[var2].eq(Class511.q("sc/d/24.png", 1 ^ 3, 1 ^ 3, 1 ^ 3, 1 ^ 3, (boolean)(3 >> 2)));
            this.v[var2].setBounds(372, 59, 150, 180);
         } else if (var2 == --5) {
            var4 = this;
            this.v[var2].eq(Class511.q("sc/d/25.png", 1 ^ 3, 1 ^ 3, 1 ^ 3, 1 ^ 3, false));
            this.v[var2].setBounds(42, 249, 170, 21);
         } else if (var2 == 6) {
            var4 = this;
            this.v[var2].eq(Class511.q("sc/d/24.png", 1 ^ 3, 1 ^ 3, 1 ^ 3, 1 ^ 3, false));
            this.v[var2].setBounds(42, 249, 170, 206);
         } else if (var2 == 7) {
            var4 = this;
            this.v[var2].eq(Class511.q("sc/d/19.png", --5, --5, --5, --5, false));
            this.v[var2].setBounds(217, 249, 309, 207);
         } else {
            if (var2 == 8) {
               this.v[var2].eq(Class511.q("sc/d/35.png", 80, 10, 80, 10, false));
               this.v[var2].setBounds(31, 30, 515, 20);
            }

            var4 = this;
         }

         var4.add(this.v[var2++]);
      }

      this.ab = new Class585(this, 6, --4, 51, 51, 0, 0, 218, 251);
      this.ab.hf(Class511.a("sc/d/18.png"));
      this.ab.gb(true);
      this.add(this.ab);
   }

   public void q() {
      if (this.vd() != null) {
         this.s();
         this.ae.c(3 >> 2, (Object)null);
         this.aa.q();
         super.q();
      }
   }

   public void r(boolean var1) {
      RoleData var2;
      RolePet var3;
      RoleSummoning var4 = (var3 = (var2 = this.vd()).getRolePet(this.aa.gl())) != null ? var3.getPet() : null;
      if (var4 == null) {
         this.aej.f("请选择你要炼化的召唤兽！");
      } else {
         Goodstable var7 = this.ae.tp() == 5 >> 2 ? var2.getGood(new BigDecimal(this.ae.gl())) : null;
         if (var7 == null) {
            this.aej.f("你还没选中物品");
         } else if (var7.getGoodlock() == (4 ^ 5)) {
            this.aej.fw("该物品已被加锁");
         } else {
            SummonPetBean var6 = null;
            SummonPetBean var10000;
            if (var7.getType() == 701L) {
               if (var4.getSsn() != null && !var4.getSsn().equals("0")) {
                  this.aej.f("这只召唤兽无法使用金柳露");
                  return;
               }

               if (var4.getTurnRount() != 0) {
                  this.aej.f("未转的宝宝才可以使用金柳露");
                  return;
               }

               var10000 = var6 = new SummonPetBean(--1);
            } else if (var7.getType() == 713L) {
               var10000 = var6 = new SummonPetBean(119 & 109);
            } else if (var7.getType() == 714L) {
               var10000 = var6 = new SummonPetBean(119 & 110);
            } else {
               if (GoodType.ah(var7.getType())) {
                  int var5 = this.uw().n(1 ^ 3, --3) ? 121 & 15 : (this.uw().n(5 >> 1, 60 & 79) ? 27 & 111 : 12);
                  if (var4.getAlchemynum() >= var5) {
                     this.aej.f("召唤兽" + var4.getSummoningname() + "的炼妖次数已经超过" + var5 + "次！");
                     return;
                  }

                  if (!var1 && this.uw().n(5 >> 1, 46 & 93)) {
                     ((Class472)this.ve().e(63 & 91)).ma(var4, var7);
                     return;
                  }

                  var6 = new SummonPetBean(119 & 111);
               }

               var10000 = var6;
            }

            if (var10000 != null) {
               var6.setPetid(var4.getSid());
               var6.setGoodid(var7.getRgid());
               String var8 = Agreement.getSendTextAES("summonpet", Class695.b().toJson(var6));
               this.uw().d(var8);
               this.ae.c(2 & 5, (Object)null);
            }
         }
      }
   }

   public void s() {
      Class216[] var10001;
      Class429 var10002;
      if (this.ab.aiz() != null) {
         var10001 = this.ab.aiz().f();
         var10002 = this;
      } else {
         var10001 = null;
         var10002 = this;
      }

      Class216[] var1 = this.vg(var10001, var10002.vd().goodPacks.length / (62 & 89), this.ab.t(), 3 ^ 3, 15022 & 18271, 4863 & 28153);
      this.ab.aiw(var1, 5 >> 3);
   }

   public boolean t() {
      this.d();
      return super.t();
   }

   public Class44 u() {
      return this.ae;
   }

   public void d() {
      this.ac.setText((String)null);
      this.x = null;
      this.v((RoleSummoning)null);
   }

   public void v(RoleSummoning var1) {
      if (var1 == null) {
         this.z.isTextSize("", 12530 & 20367);
      } else {
         Goodstable var6;
         if ((var6 = (Goodstable)this.ae.hr()) != null && !GoodType.ah(var6.getType())) {
            var6 = null;
         }

         ArrayList var7 = null;
         StringBuffer var4 = new StringBuffer();
         int var2;
         int var3;
         int var5;
         String var8;
         long var9;
         Class223 var11;
         Iterator var12;
         int var10000;
         Iterator var16;
         if (!Class394.o(var1.getLyk())) {
            var5 = 5 >> 3;
            var2 = 2 & 5;
            var3 = 3 ^ 3;

            for(var10000 = var2; var10000 < var1.getLyk().length(); var10000 = var2) {
               if ((var2 = var1.getLyk().indexOf("|", var5 + --1)) == -4 >> 2) {
                  var2 = var1.getLyk().length();
               }

               if ((var3 = var1.getLyk().indexOf("=", var5 + (3 >> 1))) == -4 >> 2 || var3 > var2) {
                  var3 = var2;
               }

               if ((var8 = var1.getLyk().substring(var5, var3)).equals("物品亲密")) {
                  var10000 = var2;
               } else {
                  label197: {
                     var9 = (long)(Double.parseDouble(var1.getLyk().substring(var3 + --1, var2)) * 100.0D);
                     if (var7 == null) {
                        var7 = new ArrayList();
                     }

                     for(var16 = var12 = var7.iterator(); var16.hasNext(); var16 = var12) {
                        if ((var11 = (Class223)var12.next()).a.equals(var8)) {
                           var11.b += var9;
                           var10000 = var2;
                           break label197;
                        }
                     }

                     var10000 = var2;
                     var7.add(new Class223(var8, var9));
                  }
               }

               var5 = var10000 + 1;
            }
         }

         if (!Class394.o(var1.getResistance())) {
            var5 = 2 & 5;
            var2 = 3 ^ 3;
            var3 = 5 >> 3;

            for(var10000 = var2; var10000 < var1.getResistance().length(); var10000 = var2) {
               if ((var2 = var1.getResistance().indexOf("|", var5 + (2 ^ 3))) == -4 >> 2) {
                  var2 = var1.getResistance().length();
               }

               if ((var3 = var1.getResistance().indexOf("=", var5 + (3 >> 1))) == -4 >> 2 || var3 > var2) {
                  var3 = var2;
               }

               if ((var8 = var1.getResistance().substring(var5, var3)).equals("物品亲密")) {
                  var10000 = var2;
               } else {
                  label198: {
                     var9 = (long)(Double.parseDouble(var1.getResistance().substring(var3 + (3 & 5), var2)) * 100.0D);
                     if (var7 == null) {
                        var7 = new ArrayList();
                     }

                     for(var16 = var12 = var7.iterator(); var16.hasNext(); var16 = var12) {
                        if ((var11 = (Class223)var12.next()).a.equals(var8)) {
                           var11.b += var9;
                           var10000 = var2;
                           break label198;
                        }
                     }

                     var10000 = var2;
                     var7.add(new Class223(var8, var9));
                  }
               }

               var5 = var10000 + 1;
            }
         }

         if (var6 != null) {
            var5 = 3 >> 2;
            var2 = 2 & 5;
            var3 = 3 >> 2;

            for(var10000 = var2; var10000 < var6.getValue().length(); var10000 = var2) {
               if ((var2 = var6.getValue().indexOf("|", var5 + --1)) == -4 >> 2) {
                  var2 = var6.getValue().length();
               }

               if ((var3 = var6.getValue().indexOf("=", var5 + (3 & 5))) == -4 >> 2 || var3 > var2) {
                  var3 = var2;
               }

               if ((var8 = var6.getValue().substring(var5, var3)).equals("等级")) {
                  var10000 = var2;
               } else {
                  Class223 var14 = null;
                  int var10 = 3 ^ 3;
                  int var15 = var7 != null ? var7.size() : 0;
                  var10000 = var10;

                  StringBuffer var17;
                  while(true) {
                     if (var10000 >= var15) {
                        var17 = var4;
                        break;
                     }

                     if (var8.equals(((Class223)var7.get(var10)).a)) {
                        var14 = (Class223)var7.remove(var10);
                        var17 = var4;
                        break;
                     }

                     ++var10;
                     var10000 = var10;
                  }

                  var17.append(var4.length() == 0 ? "#W" : "#r");
                  var4.append(var8);
                  var4.append(": ");
                  var4.append(var14 != null ? Class394.ak((double)var14.b / 100.0D, 2 ^ 3) : 0);
                  var4.append(" #G+ ");
                  var4.append(Class394.ak(Double.parseDouble(var6.getValue().substring(var3 + --1, var2)), 1));
                  var4.append("#W");
                  var10000 = var2;
               }

               var5 = var10000 + 1;
            }
         }

         var5 = 0;
         var2 = var7 != null ? var7.size() : 0;

         for(var10000 = var5; var10000 < var2; var10000 = var5) {
            Class223 var13 = (Class223)var7.get(var5);
            var4.append(var4.length() == 0 ? "#W" : "#r");
            var4.append(var13.a);
            var4.append(": ");
            double var10004 = (double)var13.b / 100.0D;
            ++var5;
            var4.append(Class394.ak(var10004, 1));
         }

         this.z.isTextSize(var4.toString(), 26295 & 6602);
      }
   }

   public void w(RolePet var1) {
      if (var1 == null) {
         this.d();
      } else {
         this.ac.setText(String.valueOf(var1.getPet().getAlchemynum()));
         this.x = var1.getPet().getPart(this.aej);
         this.v(var1.getPet());
      }
   }
}
