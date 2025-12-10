package com.xy;

import com.xy.bean.QualityClBean;
import com.xy.bean.SuitOperBean;
import com.xy.formula.SkillUtil;
import com.xy.game.RoleData;
import com.xy.readbean.AlchemySet;
import com.xy.readbean.AlchemyUnit;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.readbean.Skill;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.ImageObserver;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Class428 extends Class345 {
   private <undefinedtype> alr;
   private Image als;
   private Class44[] alt;
   private Class556[] alu;
   private JLabel[] alv;
   private long yu;
   private Class390 alw;
   private <undefinedtype> alx;
   private Class8 aly;
   private Class245[] vg;
   private List<Class698> gs;
   private Class8 alz;
   private Image ama;
   private QualityClBean amb;
   private List<Class223> ep;
   private Class436[] nn;
   private Object amc;
   private long zd;
   private boolean hg;
   private Image xs;
   private Class529[] mn;
   private long amd;
   private long lp;
   private Class529[] le;
   private int m;

   public static int uf() {
      int var0;
      if ((var0 = Class27.c.nextInt(102 & 125)) < --5) {
         return --4;
      } else if (var0 < (47 & 115)) {
         return --3;
      } else {
         return var0 < (123 & 79) ? --2 : 1;
      }
   }

   public void gt(boolean var1) {
      if (this.alw != null) {
         Class428 var10000;
         label27: {
            if (var1) {
               if (this.m == 0) {
                  this.alw.setBounds(110 & 27, 19165 & 13810, 19454 & 13643, 18326 & 14591);
                  var10000 = this;
                  break label27;
               }

               if (this.m == (4 ^ 5) && (Integer)this.alw.qd == 0) {
                  var10000 = this;
                  this.alw.setBounds(43 & 94, 126 & 123, 20814 & 12283, 16094 & 16823);
                  break label27;
               }

               if (this.m == 5 >> 2 && (Integer)this.alw.qd == --1) {
                  this.alw.setBounds(30565 & 2527, 123 & 126, 21470 & 11627, 23966 & 8951);
               }
            }

            var10000 = this;
         }

         var10000.alw.setVisible(var1);
      }
   }

   public static int ot() {
      int var0;
      if ((var0 = Class27.c.nextInt(103 & 124)) < --4) {
         return --2;
      } else {
         return var0 < (126 & 21) ? --1 : 0;
      }
   }

   public void q() {
      int var10002 = 3 & 4;
      this.alt[3 >> 2].c(3 >> 2, (Object)null);
      this.alx.cf(2 & 5, 2 & 5);
      this.alt[2 ^ 3].c(2 & 5, (Object)null);
      this.alr.cf(2 & 5, 2 & 5);
      this.dp(var10002);
      super.q();
   }

   public void tg(Class44 var1) {
      if (this.m == 3 >> 1) {
         if (this.alt[5 >> 3].tp() == 0) {
            this.aej.f("先选择主守护石");
         } else {
            this.as(4 ^ 5);
         }
      }
   }

   public void r(boolean var1) {
      this.hg = var1;
      this.zd = Class280.l();
      this.yu = 0L;
      this.amc = null;
      if (this.ep != null) {
         this.ep.clear();
      }

   }


   static void adu(Class428 var0, Image var1) {
      var0.xs = var1;
   }


   static Image adv(Class428 var0) {
      return var0.als;
   }

   public boolean pp(Goodstable var1) {
      Goodstable var4;
      if ((var4 = (Goodstable)this.alt[3 & 4].hr()) != null && !Class394.v(var4.getRgid(), var1.getRgid())) {
         if (this.alx.bn >= (5 >> 1) + Class394.an(var1.getValue(), "等级=", "|")) {
            return (boolean)(3 >> 2);
         } else {
            AlchemySet var7;
            if ((var7 = this.vc().q()) == null) {
               return (boolean)(5 >> 3);
            } else {
               int var3;
               for(int var10000 = var3 = 0; var10000 < this.alx.aab.length; var10000 = var3) {
                  label46: {
                     <undefinedtype> var2 = this.alx.aab[var3];
                     String var5 = null;
                     Goodstable var8;
                     if (var3 < --5) {
                        AlchemyUnit var6;
                        if (Class394.o(null.aql(var2)) || (var6 = var7.getAlchemyUnit(null.aql(var2))) == null || null.aqk(var2) >= var6.getMax()) {
                           break label46;
                        }

                        var5 = "|" + null.aql(var2) + "=";
                        var8 = var1;
                     } else {
                        if (null.aqi(var2) == 0 || null.aqk(var2) >= 15.0D) {
                           break label46;
                        }

                        var5 = "|技能=" + null.aqi(var2) + "#";
                        var8 = var1;
                     }

                     if (var8.getValue().indexOf(var5) != -4 >> 2) {
                        return (boolean)(2 ^ 3);
                     }
                  }

                  ++var3;
               }

               return (boolean)(3 & 4);
            }
         }
      } else {
         return false;
      }
   }

   public void d() {
      int var7 = Integer.parseInt(this.amb.getData());
      this.alr.ab(var7);
      if (!Class394.o(this.amb.getNewAttr())) {
         Goodstable var4 = this.alt[3 & 4].tp() == 3 >> 1 ? (Goodstable)this.alt[3 ^ 3].hr() : null;
         AlchemySet var5 = this.vc().q();
         if (var4 != null && var5 != null) {
            if (this.ep != null) {
               this.ep.clear();
            }

            if (this.gs == null) {
               this.gs = new ArrayList();
            }

            this.gs.clear();

            int var2;
            for(int var10000 = var2 = 3 >> 2; var10000 < 7; var10000 = var2) {
               if ((var7 >> var2 & 3 & 5) != 0) {
                  <undefinedtype> var3 = this.alr.aab[var2];
                  if ((var2 >= --5 || !Class394.o(null.aql(var3))) && (var2 < --5 || null.aqi(var3) != 0)) {
                     int var6;
                     <undefinedtype> var1 = (var6 = this.alx.qf(var2, null.aql(var3), null.aqi(var3))) >= 0 ? this.alx.aab[var6] : null;
                     if (var1 != null) {
                        label105: {
                           String var8;
                           Class428 var15;
                           if (var2 < --5) {
                              if (Class394.o(var8 = Class394.d(this.amb.getNewAttr(), null.aql(var1) + "=", "|"))) {
                                 break label105;
                              }

                              double var9 = Double.parseDouble(var8);
                              if (null.aqk(var1) >= var9) {
                                 break label105;
                              }

                              AlchemyUnit var11 = var5.getAlchemyUnit(null.aql(var1));
                              Class223 var12;
                              Class223 var14 = var12 = new Class223();
                              var14.b = (long)var6;
                              var14.a = "+" + Class394.ak(var9 - null.aqk(var1), var11 != null ? var11.getSize() : 1) + Class270.so(null.aql(var1));
                              if (this.ep == null) {
                                 this.ep = new ArrayList();
                              }

                              var15 = this;
                              this.ep.add(var12);
                           } else {
                              if (Class394.o(var8 = Class394.d(this.amb.getNewAttr(), "技能=" + null.aqi(var1) + "#", "|"))) {
                                 break label105;
                              }

                              int var13 = Integer.valueOf(var8);
                              if (null.aqk(var1) >= (double)var13) {
                                 break label105;
                              }

                              Class223 var10 = new Class223();
                              var10.b = (long)var6;
                              var10.a = "+" + Class394.ak((double)(var13 - (int)null.aqk(var1)), 3 >> 2) + "级";
                              if (this.ep == null) {
                                 this.ep = new ArrayList();
                              }

                              var15 = this;
                              this.ep.add(var10);
                           }

                           var15.gs.add(new Class698((long)(this.alr.getX() + var3.getX() + (126 & 31)), (long)(this.alr.getY() + var3.getY() + (127 & 18)), Class280.l(), 1L));
                           this.gs.add(new Class698((long)(this.alx.getX() + var1.getX() + (126 & 31)), (long)(this.alx.getY() + var1.getY() + (126 & 19)), Class280.l(), 0L));
                        }
                     }
                  }
               }

               ++var2;
            }

            this.alx.qg(var4, var5);
         }
      }
   }


   static Image adw(Class428 var0) {
      return var0.ama;
   }

   public void th(Class44 var1) {
      if (!this.bl()) {
         if (var1 == this.alt[5 >> 3]) {
            this.fr(var1);
         } else {
            if (var1 == this.alt[3 & 5]) {
               this.tg(var1);
            }

         }
      }
   }

   public void ly(Goodstable var1) {
      this.alt[--1].c(2 ^ 3, var1);
      this.alr.qg(var1, this.vc().q());
      if (this.m == (2 ^ 3) && this.ep != null) {
         this.ep.clear();
      }

   }

   public void dp(int var1) {
      int var10000 = 3 >> 2;
      this.m = var1;

      int var2;
      for(var2 = var10000; var10000 < this.le.length; var10000 = var2) {
         this.le[var2].setKeep(var2 == this.m || var2 == 0 && this.m == 5 >> 1);
         ++var2;
      }

      int var10002 = 3 & 4;
      int var10004 = 3 >> 2;
      this.amb = null;
      this.r((boolean)var10004);
      this.gt((boolean)var10002);
      Class44 var5;
      JLabel var6;
      Class556 var10;
      Class245 var11;
      Class428 var12;
      int var10001;
      if (var1 == 0) {
         Class681.j(this.vg[3 & 4], this.amd = 200000L);
         Class681.j(this.vg[3 >> 1], this.lp = 0L);
         this.alv[2 & 5].setText("守护石");
         this.alv[--1].setText("灵元晶");
         int var10003 = 3 & 4;
         var10000 = 3 & 4;
         this.alv[var10003].setBounds(127 & 95, 119 & 126, 111 & 116, 118 & 31);
         this.alv[2 ^ 3].setBounds(2815 & 30191, 118 & 127, 125 & 102, 63 & 86);

         for(var2 = var10000; var10000 < this.alt.length; var10000 = var2) {
            var5 = this.alt[var2];
            var10001 = (125 & 99) + var2 * (21936 & 10975);
            var10002 = 20415 & 12508;
            ++var2;
            var5.setBounds(var10001, var10002, 61 & 118, 61 & 118);
         }

         Goodstable var4 = this.vc().n(new BigDecimal(32503 & 25561));
         var5 = this.alt[5 >> 2];
         Goodstable var7;
         if (var4 != null && var4.getType() == 107L) {
            var10001 = 2 ^ 3;
            var7 = var4;
         } else {
            var10001 = 0;
            var7 = var4;
         }

         var5.c(var10001, var7);
         var10000 = --2;
         this.alr.cf(2 & 5, 2 & 5);
         this.alv[--4].setText("消耗体力");
         this.alv[--5].setText("拥有体力");

         int var3;
         for(var3 = var10000; var10000 < 6; var10000 = var3) {
            this.alv[var3].setForeground(Class681.c("#c2A1C03"));
            var6 = this.alv[var3];
            var10001 = 95 & 126;
            var10002 = (15359 & 17645) + (var3 - (1 ^ 3)) * (127 & 29);
            ++var3;
            var6.setBounds(var10001, var10002, 72, 20);
         }

         this.alv[8].setHorizontalAlignment(10);
         this.alv[8].setFont(Class681.bu);
         this.alv[8].setForeground(Color.black);
         this.alv[8].setText("保留原属性");
         this.alv[8].setBounds(360, 429, 90, 17);
         MoneyType var9 = this.alu[4 ^ 5].xb();
         var10002 = 3 >> 2;
         var10000 = 3 >> 2;
         var9.setIdAndKey(var10002, (String)null);

         for(var3 = var10002; var10000 < this.alu.length; var10000 = var3) {
            var10 = this.alu[var3];
            var10002 = 264 + var3 * 54;
            ++var3;
            var10.setBounds(170, var10002, 132, 20);
         }

         for(var10000 = var3 = 3 & 4; var10000 < 2; var10000 = var3) {
            var11 = this.vg[var3];
            var10002 = 237 + var3 * 54;
            ++var3;
            var11.setBounds(170, var10002, 132, 20);
         }

         var12 = this;
         this.nn[4 ^ 5].fw("sc/d/177.png");
         this.nn[3 & 5].setBounds(182, 161, 30, 42);
         this.nn[1 ^ 3].fw("sc/e/30.png");
         this.nn[1 ^ 3].setBounds(343, 429, 17, 17);
         this.mn[3 >> 2].setText("开始附灵");
         this.mn[2 & 5].setBounds(233, 426, 99, 25);
         this.alx.setBounds(353, 105, 257, 248);
      } else if (var1 == 3 >> 1) {
         Class681.j(this.vg[0], this.amd = 200000L);
         Class681.j(this.vg[1], this.lp = 100L);
         this.alv[0].setText("主守护石");
         this.alv[1].setText("副守护石");
         var10000 = 0;
         this.alv[0].setBounds(168, 75, 100, 22);
         this.alv[1].setBounds(483, 75, 100, 22);

         for(var2 = 0; var10000 < this.alt.length; var10000 = var2) {
            var5 = this.alt[var2];
            var10001 = 102 + var2 * 315;
            ++var2;
            var5.setBounds(var10001, 72, 52, 52);
         }

         var10000 = 5 >> 1;
         this.alt[1].c(0, (Object)null);
         this.alr.cf(0, 0);
         this.alv[--4].setText("消耗守护之尘");
         this.alv[--5].setText("拥有守护之尘");

         for(var2 = var10000; var10000 < 6; var10000 = var2) {
            this.alv[var2].setForeground(Color.black);
            var6 = this.alv[var2];
            var10001 = 57 + (var2 - (1 ^ 3)) % --2 * 227;
            var10002 = 415 + (var2 - --2) / --2 * 27;
            ++var2;
            var6.setBounds(var10001, var10002, 102, 19);
         }

         this.alv[8].setHorizontalAlignment(--4);
         this.alv[8].setFont(Class681.q);
         this.alv[8].setForeground(Class681.c("#cFFF7D0"));
         this.alv[8].setText("可吸收灵窍个数");
         this.alv[8].setBounds(254, 385, 120, 16);
         MoneyType var8 = this.alu[1].xb();
         var10000 = 0;
         var8.setIdAndKey(0, "守护之尘");

         for(var2 = 0; var10000 < this.alu.length; var10000 = var2) {
            var10 = this.alu[var2];
            var10002 = 415 + 29 * var2;
            ++var2;
            var10.setBounds(386, var10002, 114, 19);
         }

         for(var10000 = var2 = 0; var10000 < 2; var10000 = var2) {
            var11 = this.vg[var2];
            var10002 = 415 + 29 * var2;
            ++var2;
            var11.setBounds(159, var10002, 114, 19);
         }

         var12 = this;
         this.nn[1].fw("sc/d/176.png");
         this.nn[1].setBounds(322, 284, 38, 16);
         this.nn[1 ^ 3].fw("sc/d/184.png");
         this.nn[2].setBounds(85, 384, 510, 17);
         this.mn[0].setText("开始熔炼");
         this.mn[0].setBounds(515, 426, 99, 25);
         this.alx.setBounds(55, 132, 257, 248);
         this.alr.setBounds(370, 132, 257, 248);
      } else {
         if (var1 == 2) {
            this.amd = 200000L;
            this.lp = 0L;
            this.alr.cf(0, 0);
            this.alx.setBounds(55, 132, 257, 248);
            this.alr.setBounds(370, 132, 257, 248);
            this.mn[0].setText("继续附灵");
            this.mn[0].setBounds(520, 80, 99, 25);
            this.mn[1].setBounds(443, 426, 99, 25);
            this.mn[2].setBounds(128, 426, 99, 25);
         }

         var12 = this;
      }

      var12.y(var1);
   }

   public boolean bl() {
      return this.hg;
   }


   static void adx(Class428 var0, Image var1) {
      var0.ama = var1;
   }

   public void av(Goodstable var1) {
      if (this.alw != null) {
         this.gt((boolean)(3 >> 2));
         int var2 = (Integer)this.alw.qd;
         if (!this.bl()) {
            if (var2 == 0) {
               this.ax(var1);
            } else {
               if (var2 == (3 & 5)) {
                  this.ly(var1);
               }

            }
         }
      }
   }

   public void as(int var1) {
      if (this.m == 0 || this.m == (2 ^ 3)) {
         if (this.alw == null) {
            this.alw = new Class390(this);
            long[] var10003 = new long[--1];
            boolean var10005 = true;
            var10003[5 >> 3] = 108L;
            this.alw.cw.ud(var10003);
            this.alw.qd = var1;
            this.alw.cw.as(var1 == 0 ? 5 >> 3 : 1);
            this.add(this.alw, 3 >> 2);
            this.gt((boolean)(--1));
         } else {
            this.alw.qd = var1;
            this.alw.cw.as(var1 == 0 ? 3 ^ 3 : 1);
            this.gt((boolean)(this.alw.isVisible() ? 2 & 5 : 1));
         }
      }
   }

   public static int ov() {
      int var0;
      if ((var0 = Class27.c.nextInt(102 & 125)) < (29 & 110)) {
         return --5;
      } else if (var0 < (39 & 127)) {
         return --4;
      } else {
         return var0 < (127 & 73) ? --3 : 2;
      }
   }


   static void aea(Class428 var0, Image var1) {
      var0.als = var1;
   }

   public Class428(GameView var1) {
      int var10001 = --2;
      int var10005 = -4 >> 2;
      super(26799 & 6143, --2, Class345.aef, var1);
      this.xs = null;
      this.ama = null;
      this.als = null;
      this.va(var10005, 2 & 5, 13303 & 20126, 31207 & 2045, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 101 & 94, 101 & 94, 101 & 94, 101 & 94, (boolean)(3 ^ 3)), "守护石操作");
      Class529[] var7 = new Class529[var10001];
      boolean var10003 = true;
      this.le = var7;

      int var2;
      Class529[] var6;
      int var10000;
      Class529 var10002;
      int var10006;
      Font var10007;
      String var10009;
      Class428 var10010;
      for(var10000 = var2 = 3 ^ 3; var10000 < this.le.length; var10000 = var2) {
         var6 = this.le;
         var10002 = new Class529;
         var10005 = --2;
         var10006 = (27487 & 5601) + var2;
         var10007 = Class681.cf;
         Color[] var10008 = Class681.c;
         if (var2 == 0) {
            var10009 = "附灵";
            var10010 = this;
         } else if (var2 == --1) {
            var10009 = "融炼";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var10002.<init>("sc/e/38.png", var10005, var10006, var10007, var10008, var10009, var10010);
         var6[var2] = var10002;
         this.le[var2].setBounds((119 & 62) + (118 & 111) * var2, 31 & 119, 95 & 127, 107 & 53);
         this.add(this.le[var2++]);
      }

      Color var4 = Class681.c("#c2A1C03");
      JLabel[] var9 = new JLabel[27 & 109];
      var10003 = true;
      this.alv = var9;

      int var3;
      Class428 var8;
      for(var10000 = var3 = 2 & 5; var10000 < this.alv.length; var10000 = var3) {
         label150: {
            this.alv[var3] = Class133.b(3 ^ 3, 3 ^ 3, 3 ^ 3, 3 ^ 3, var4, Class681.m);
            if (var3 >= 5 >> 1 && var3 <= --5) {
               this.alv[var3].setFont(Class681.be);
               if (var3 == (1 ^ 3)) {
                  var8 = this;
                  this.alv[var3].setText("消耗金钱");
                  break label150;
               }

               if (var3 == --3) {
                  var8 = this;
                  this.alv[var3].setText("拥有金钱");
                  break label150;
               }
            } else if (var3 >= (94 & 39) && var3 <= (7 & 127)) {
               this.alv[var3].setText("锻炼等级");
               this.alv[var3].setFont(Class681.ab);
               this.alv[var3].setForeground(Class681.c("#c2E1A05"));
               this.alv[var3].setBounds((31422 & 1515) + (var3 - (15 & 118)) * (32767 & 315), 106, 60, 17);
            }

            var8 = this;
         }

         var8.add(this.alv[var3++]);
      }

      Class245[] var10 = new Class245[--5];
      var10003 = true;
      this.vg = var10;

      for(var10000 = var3 = 5 >> 3; var10000 < this.vg.length; var10000 = var3) {
         this.vg[var3] = Class133.a(2 & 5, 2 & 5, 2 & 5, 2 & 5, 10, Color.white, Class681.q);
         this.vg[var3].eq(Class511.q("sc/e/29.png", 6, 6, 6, 6, (boolean)(3 >> 2)));
         if (var3 >= 5 >> 1 && var3 <= --3) {
            var8 = this;
            this.vg[var3].setBounds(227 + (var3 - --2) * 315, 106, 44, 17);
         } else {
            if (var3 == --4) {
               this.vg[var3].setForeground(Color.green);
               this.vg[var3].setHorizontalAlignment(2 & 5);
               this.vg[var3].setBounds(386, 384, 44, 17);
            }

            var8 = this;
         }

         var8.add(this.vg[var3++]);
      }

      Class556[] var12 = new Class556[5 >> 1];
      var10003 = true;
      this.alu = var12;

      for(var10000 = var3 = 3 & 4; var10000 < this.alu.length; var10000 = var3) {
         MoneyType var5 = new MoneyType();
         if (var3 == 0) {
            var5.setIdAndKey(5 >> 2, "金钱");
         }

         this.alu[var3] = Class133.i(10, Color.white, Class681.q, var5, var1);
         this.alu[var3].eq(Class511.q("sc/e/29.png", 6, 6, 6, 6, (boolean)(2 & 5)));
         this.add(this.alu[var3++]);
      }

      var7 = new Class529[--3];
      var10003 = true;
      this.mn = var7;

      for(var10000 = var3 = 5 >> 3; var10000 < this.mn.length; var10000 = var3) {
         var6 = this.mn;
         var10002 = new Class529;
         var10005 = 4 ^ 5;
         var10006 = 323 + var3;
         var10007 = Class681.ak;
         if (var3 == 3 >> 1) {
            var10009 = "替换属性";
            var10010 = this;
         } else if (var3 == 5 >> 1) {
            var10009 = "返回";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var10002.<init>("sc/e/26.png", var10005, var10006, var10007, (Color[])null, var10009, var10010);
         var6[var3] = var10002;
         if (var3 == --1) {
            var8 = this;
            this.mn[var3].setBounds(233, 426, 99, 25);
         } else {
            if (var3 == 2) {
               this.mn[var3].setBounds(233, 426, 99, 25);
            }

            var8 = this;
         }

         var8.mn[var3].setForeground(Color.black);
         this.add(this.mn[var3++]);
      }

      Class44[] var13 = new Class44[2];
      var10003 = true;
      this.alt = var13;

      for(var10000 = var3 = 3 & 4; var10000 < this.alt.length; var10000 = var3) {
         this.alt[var3] = new Class44(this);
         this.alt[var3].fw("sc/d/180.png");
         this.alt[var3].ad(Class44.arq);
         this.add(this.alt[var3++]);
      }

      this.alx = new Class456(3 ^ 3) {
         private <undefinedtype>[] aab;
         private int bn;
         private Class436 bl;
         private int m;

         public int qf(int var1, String var2, int var3) {
            int var4 = var1 < --5 ? 3 & 4 : 5;
            int var5 = var1 < --5 ? --5 : this.aab.length;

            for(int var10000 = var4 = var4; var10000 < var5; var10000 = var4) {
               if (var1 < --5 && Class394.r(null.aql(this.aab[var4]), var2)) {
                  return var4;
               }

               if (var1 >= --5 && null.aqi(this.aab[var4]) == var3) {
                  return var4;
               }

               ++var4;
            }

            return -4 >> 2;
         }

         public void qg(Goodstable var1, AlchemySet var2) {
            if (var1 == null) {
               this.cf(3 ^ 3, 3 ^ 3);
            } else {
               int var7 = 0;
               int var4 = 5 >> 3;
               int var5 = 5 >> 3;
               String var12 = var1.getValue();
               int var6 = 5 >> 3;

               int var3;
               for(int var10000 = var3 = 5 >> 3; var10000 < var12.length(); var10000 = var3) {
                  if ((var3 = var12.indexOf("|", var6 + --1)) == -4 >> 2) {
                     var3 = var12.length();
                  }

                  label61: {
                     int var8;
                     if ((var8 = var12.indexOf("=", var6 + (2 ^ 3))) != -4 >> 2) {
                        if (var8 > var3) {
                           var10000 = var3;
                           break label61;
                        }

                        String var9;
                        if ((var9 = var12.substring(var6, var8)).equals("等级")) {
                           var7 = Class394.b(var12, var8 + (2 ^ 3), var3);
                           var10000 = var3;
                           break label61;
                        }

                        if (var9.equals("耐久")) {
                           var10000 = var3;
                           break label61;
                        }

                        if (var9.equals("技能")) {
                           if (var5 < --2) {
                              var6 = var8 + (3 & 5);
                              var8 = var12.indexOf("#", var6 + (3 & 5));
                              int var13 = Class394.b(var12, var6, var8);
                              int var11 = Class394.b(var12, var8 + --1, var3);
                              this.aab[--5 + var5].aqj(var13, var11, Class428.this.vc().bf(String.valueOf(var13)));
                           }

                           ++var5;
                           var10000 = var3;
                           break label61;
                        }

                        if (var4 < --5) {
                           double var10 = Double.parseDouble(var12.substring(var8 + --1, var3));
                           this.aab[var4].aqn(var9, var10, var2.getAlchemyUnit(var9));
                        }

                        ++var4;
                     }

                     var10000 = var3;
                  }

                  var6 = var10000 + 1;
               }

               this.cf(var4, var5);
               this.bn = var7;
               <undefinedtype> var14;
               if (this.m == 0) {
                  Class428.this.vg[5 >> 1].setText(String.valueOf(var7));
                  var14 = this;
               } else {
                  Class428.this.vg[--3].setText(String.valueOf(var7));
                  var14 = this;
               }

               Class428.this.vg[--4].setText(Class428.this.alx.bn > 0 && Class428.this.alr.bn > 0 ? String.valueOf(Math.max(3 ^ 3, Class428.this.alr.bn - Class428.this.alx.bn + (5 >> 1))) : "");
            }
         }

         public void cf(int var1, int var2) {
            int var10000 = var1;
            this.bn = 3 ^ 3;

            for(var1 = var1; var10000 < 5; var10000 = var1) {
               this.aab[var1++].q();
            }

            for(var10000 = var1 = var2; var10000 < 2; var10000 = var1) {
               int var10001 = --5 + var1;
               ++var1;
               this.aab[var10001].q();
            }

         }

         public {
            int var10001 = 7 & 127;
            this.m = var2;
            <undefinedtype>[] var4 = new <undefinedtype>[var10001];
            boolean var10003 = true;
            this.aab = var4;

            for(int var10000 = var2 = 5 >> 3; var10000 < this.aab.length; var10000 = var2) {
               this.aab[var2] = new JComponent(var2) {
                  private Class436 vk;
                  private boolean wk;
                  private boolean afz;
                  private JLabel as;
                  private String tw;
                  private JLabel bd;
                  private Class436 r;
                  // $FF: synthetic field
                  final Class428 bab;
                  private double aas;
                  private int m;

                  protected void paintComponent(Graphics var1) {
                     if (this.wk) {
                        if (Class428.adv(this.bab) == null) {
                           Class428.aea(this.bab, Class511.a("sc/e/184.png"));
                        }

                        var1.drawImage(Class428.adv(this.bab), 27 & 111, 3 >> 2, 51 & 111, 51 & 111, (ImageObserver)null);
                     }

                     if (this.afz) {
                        if (Class428.aec(this.bab) == null) {
                           Class428.adu(this.bab, Class511.a("sc/e/179.png"));
                        }

                        var1.drawImage(Class428.aec(this.bab), 111 & 31, 5 >> 1, 95 & 59, 109 & 50, (ImageObserver)null);
                     } else {
                        if (Class428.adw(this.bab) == null) {
                           Class428.adx(this.bab, Class511.a("sc/e/180.png"));
                        }

                        var1.drawImage(Class428.adw(this.bab), 31 & 111, 5 >> 1, 95 & 59, 102 & 57, (ImageObserver)null);
                     }
                  }

               
                  static int aqi(Object var0) {
                     return var0.m;
                  }

                  public void aqj(int var1, int var2, Skill var3) {
                     if (var3 == null) {
                        this.q();
                     } else {
                        int var10006 = 5 >> 3;
                        int var10008 = --1;
                        this.tw = null;
                        this.m = var1;
                        this.aas = (double)var2;
                        this.afz = (boolean)var10008;
                        this.wk = (boolean)var10006;
                        this.bd.setForeground(Class681.c("#cFFF7D0"));
                        this.bd.setText(var3.getSkillname());
                        this.as.setText("等级" + var2);
                        this.r.aee((double)var2 / 15.0D, 124 & 71);
                        this.vk.setVisible((boolean)(2 ^ 3));
                     }
                  }

               
                  static double aqk(Object var0) {
                     return var0.aas;
                  }

                  public void q() {
                     int var10006 = 3 >> 2;
                     int var10008 = 5 >> 3;
                     int var10012 = 3 & 4;
                     this.tw = null;
                     this.m = var10012;
                     this.aas = 0.0D;
                     this.afz = (boolean)var10008;
                     this.wk = (boolean)var10006;
                     this.bd.setForeground(Class681.c("#cB19D82"));
                     this.bd.setText("灵窍无灵气");
                     this.as.setText("");
                     this.r.aee(0.0D, 76 & 119);
                     this.vk.setVisible((boolean)(2 & 5));
                  }

               
                  static String aql(Object var0) {
                     return var0.tw;
                  }

               
                  static void aqm(Object var0, boolean var1) {
                     var0.wk = var1;
                  }

                  public {
                     int var10002 = 7087 & 25852;
                     int var10004 = 126 & 47;
                     this.bab = var1;
                     super();
                     this.bd = Class133.b(var10004, 31 & 106, 124 & 123, 121 & 22, Class681.c("#cB19D82"), Class681.q);
                     this.as = Class133.b(var10002, 31 & 106, 103 & 94, 60 & 83, Color.white, Class681.q);
                     if (var2 >= --5) {
                        this.bd.addMouseListener(new MouseListener(this) {
                           // $FF: synthetic field
                           final Class428 akh;
                           <undefinedtype> aki;

                           public {
                              this.akh = var1;
                              this.aki = var2;
                           }

                           public void mousePressed(MouseEvent var1) {
                           }

                           public void mouseClicked(MouseEvent var1) {
                           }

                           public void mouseReleased(MouseEvent var1) {
                           }

                           public void mouseExited(MouseEvent var1) {
                              this.akh.ve().n(127 & 46);
                           }

                           public void mouseEntered(MouseEvent var1) {
                              Skill var3 = null.aqi(this.aki) > 0 ? this.akh.vc().bf(String.valueOf(null.aqi(this.aki))) : null;
                              if (var3 != null) {
                                 Class270 var2 = (Class270)this.akh.ve().e(47 & 126);
                                 var2.rl(var3.getSkillname() + "(" + (int)null.aqk(this.aki) + "级)", SkillUtil.g(var3, (int)null.aqk(this.aki)));
                              }
                           }
                        });
                     }

                     this.as.setHorizontalAlignment(5 >> 3);
                     this.add(this.bd);
                     this.add(this.as);
                     this.r = new Class436(Class511.q("sc/d/182.png", 1 ^ 3, 1 ^ 3, 1 ^ 3, 1 ^ 3, (boolean)(2 & 5)));
                     this.vk = new Class436(Class511.q("sc/e/29.png", 23 & 110, 23 & 110, 23 & 110, 23 & 110, (boolean)(2 & 5)));
                     this.r.setBounds(21503 & 11437, 93 & 46, 87 & 108, 109 & 31);
                     this.vk.setBounds(15103 & 17836, 62 & 75, 79 & 118, 16);
                     this.add(this.r);
                     this.add(this.vk);
                  }

                  public void aqn(String var1, double var2, AlchemyUnit var4) {
                     if (Class394.o(var1)) {
                        this.q();
                     } else {
                        int var10004 = 5 >> 3;
                        int var10006 = --1;
                        int var10010 = 3 ^ 3;
                        this.tw = var1;
                        this.m = var10010;
                        this.aas = var2;
                        this.afz = (boolean)var10006;
                        this.wk = (boolean)var10004;
                        this.bd.setForeground(Class681.c("#cFFF7D0"));
                        this.bd.setText(var1);
                        this.as.setText(Class394.ak(var2, var4 != null ? var4.getSize() : 1) + Class270.so(var1));
                        this.r.aee(var4 != null ? var2 / var4.getMax() : 1.0D, 68);
                        this.vk.setVisible((boolean)(--1));
                     }
                  }
               };
               <undefinedtype> var3;
               if (var2 < --5) {
                  var3 = this;
                  this.aab[var2].setBounds(5 >> 3, (111 & 31) + (59 & 95) * var2, 10729 & 22295, 111 & 51);
               } else {
                  var3 = this;
                  this.aab[var2].setBounds(5 >> 3, (18155 & 14775) + (95 & 59) * (var2 - --5), 6627 & 26397, 43 & 119);
               }

               var3.add(this.aab[var2++]);
            }

            this.bl = new Class436("sc/d/179.png");
            this.bl.setBounds(2 & 5, 2 & 5, 22391 & 10633, 1535 & 31480);
            this.add(this.bl);
         }

         public void ab(int var1) {
            int var2;
            for(int var10000 = var2 = 3 ^ 3; var10000 < this.aab.length; var10000 = var2) {
               null.aqm(this.aab[var2], (boolean)((var1 >> var2 & 3 >> 1) == 3 >> 1 ? --1 : 0));
               ++var2;
            }

         }

         public void cc() {
            int var4 = Math.max(2 & 5, Class428.this.alr.bn - Class428.this.alx.bn + (1 ^ 3));
            int var2 = 3 ^ 3;

            int var3;
            for(int var10000 = var3 = 2 & 5; var10000 < 2999 && var4 > 0; var10000 = var3) {
               int var1 = Class27.c.nextInt(87 & 47);
               if ((var2 >> var1 & 5 >> 2) != (2 ^ 3)) {
                  int var10001 = 3 >> 1;
                  --var4;
                  var2 |= var10001 << var1;
               }

               ++var3;
            }

            this.ab(var2);
         }

         public void qi(String var1, AlchemySet var2) {
            int var6 = 3 ^ 3;
            int var4 = 3 >> 2;
            int var5 = 3 & 4;

            int var3;
            for(int var10000 = var3 = 3 >> 2; var10000 < var1.length(); var10000 = var3) {
               if ((var3 = var1.indexOf("|", var5 + --1)) == -4 >> 2) {
                  var3 = var1.length();
               }

               label40: {
                  int var7;
                  if ((var7 = var1.indexOf("=", var5 + --1)) != -4 >> 2) {
                     if (var7 > var3) {
                        var10000 = var3;
                        break label40;
                     }

                     String var8;
                     if (!(var8 = var1.substring(var5, var7)).equals("等级")) {
                        if (var8.equals("耐久")) {
                           var10000 = var3;
                           break label40;
                        }

                        if (var8.equals("技能")) {
                           if (var4 < --2) {
                              var5 = var7 + (3 & 5);
                              var7 = var1.indexOf("#", var5 + (3 >> 1));
                              int var11 = Class394.b(var1, var5, var7);
                              int var10 = Class394.b(var1, var7 + (3 & 5), var3);
                              this.aab[--5 + var4].aqj(var11, var10, Class428.this.vc().bf(String.valueOf(var11)));
                           }

                           ++var4;
                           var10000 = var3;
                           break label40;
                        }

                        if (var6 < --5) {
                           double var9 = Double.parseDouble(var1.substring(var7 + (3 & 5), var3));
                           this.aab[var6].aqn(var8, var9, var2.getAlchemyUnit(var8));
                        }

                        ++var6;
                     }
                  }

                  var10000 = var3;
               }

               var5 = var10000 + 1;
            }

            this.cf(var6, var4);
         }

         public void q() {
            AlchemySet var8;
            if ((var8 = Class428.this.vc().q()) != null) {
               int var2 = Class428.ov();
               int var6 = Class428.ot();
               int var4;
               int var10000;
               if ((var4 = var2 + var6 * (5 >> 1)) <= --4) {
                  var10000 = 2 ^ 3;
               } else if (var4 <= (91 & 44)) {
                  var10000 = 1 ^ 3;
               } else {
                  boolean var13 = true;
               }

               var4 = 5 >> 3;
               int var5 = 3 & 4;
               LinkedList var3 = new LinkedList();
               int var7 = 3 & 4;

               for(var10000 = var2; var10000 > 0 && var7 < (2999 & 32767); var10000 = var2) {
                  AlchemyUnit var1 = var8.a();
                  if (!var3.contains(var1.getKey())) {
                     this.aab[var4].aqn(var1.getKey(), var1.getDoubleByMax(--5, 125 & 22), var1);
                     --var2;
                     var3.add(var1.getKey());
                     ++var4;
                  }

                  ++var7;
               }

               var3.clear();
               var7 = 3 & 4;

               for(var10000 = var6; var10000 > 0 && var7 < (32695 & 3071); var10000 = var6) {
                  int var9;
                  String var11 = String.valueOf(var9 = 2101 + Class27.c.nextInt(111 & 62));
                  Skill var10;
                  if ((var10 = Class428.this.vc().bf(var11)) != null && !var3.contains(var11)) {
                     int var12 = Class428.uf();
                     <undefinedtype> var14 = this.aab[--5 + var5];
                     --var6;
                     var14.aqj(var9, var12, var10);
                     ++var5;
                  }

                  ++var7;
               }

               this.cf(var4, var5);
            }
         }
      };
      this.alr = new Class456(5 >> 2) {
         private <undefinedtype>[] aab;
         private int bn;
         private Class436 bl;
         private int m;

         public int qf(int var1, String var2, int var3) {
            int var4 = var1 < --5 ? 3 & 4 : 5;
            int var5 = var1 < --5 ? --5 : this.aab.length;

            for(int var10000 = var4 = var4; var10000 < var5; var10000 = var4) {
               if (var1 < --5 && Class394.r(null.aql(this.aab[var4]), var2)) {
                  return var4;
               }

               if (var1 >= --5 && null.aqi(this.aab[var4]) == var3) {
                  return var4;
               }

               ++var4;
            }

            return -4 >> 2;
         }

         public void qg(Goodstable var1, AlchemySet var2) {
            if (var1 == null) {
               this.cf(3 ^ 3, 3 ^ 3);
            } else {
               int var7 = 0;
               int var4 = 5 >> 3;
               int var5 = 5 >> 3;
               String var12 = var1.getValue();
               int var6 = 5 >> 3;

               int var3;
               for(int var10000 = var3 = 5 >> 3; var10000 < var12.length(); var10000 = var3) {
                  if ((var3 = var12.indexOf("|", var6 + --1)) == -4 >> 2) {
                     var3 = var12.length();
                  }

                  label61: {
                     int var8;
                     if ((var8 = var12.indexOf("=", var6 + (2 ^ 3))) != -4 >> 2) {
                        if (var8 > var3) {
                           var10000 = var3;
                           break label61;
                        }

                        String var9;
                        if ((var9 = var12.substring(var6, var8)).equals("等级")) {
                           var7 = Class394.b(var12, var8 + (2 ^ 3), var3);
                           var10000 = var3;
                           break label61;
                        }

                        if (var9.equals("耐久")) {
                           var10000 = var3;
                           break label61;
                        }

                        if (var9.equals("技能")) {
                           if (var5 < --2) {
                              var6 = var8 + (3 & 5);
                              var8 = var12.indexOf("#", var6 + (3 & 5));
                              int var13 = Class394.b(var12, var6, var8);
                              int var11 = Class394.b(var12, var8 + --1, var3);
                              this.aab[--5 + var5].aqj(var13, var11, Class428.this.vc().bf(String.valueOf(var13)));
                           }

                           ++var5;
                           var10000 = var3;
                           break label61;
                        }

                        if (var4 < --5) {
                           double var10 = Double.parseDouble(var12.substring(var8 + --1, var3));
                           this.aab[var4].aqn(var9, var10, var2.getAlchemyUnit(var9));
                        }

                        ++var4;
                     }

                     var10000 = var3;
                  }

                  var6 = var10000 + 1;
               }

               this.cf(var4, var5);
               this.bn = var7;
               <undefinedtype> var14;
               if (this.m == 0) {
                  Class428.this.vg[5 >> 1].setText(String.valueOf(var7));
                  var14 = this;
               } else {
                  Class428.this.vg[--3].setText(String.valueOf(var7));
                  var14 = this;
               }

               Class428.this.vg[--4].setText(Class428.this.alx.bn > 0 && Class428.this.alr.bn > 0 ? String.valueOf(Math.max(3 ^ 3, Class428.this.alr.bn - Class428.this.alx.bn + (5 >> 1))) : "");
            }
         }

         public void cf(int var1, int var2) {
            int var10000 = var1;
            this.bn = 3 ^ 3;

            for(var1 = var1; var10000 < 5; var10000 = var1) {
               this.aab[var1++].q();
            }

            for(var10000 = var1 = var2; var10000 < 2; var10000 = var1) {
               int var10001 = --5 + var1;
               ++var1;
               this.aab[var10001].q();
            }

         }

         public {
            int var10001 = 7 & 127;
            this.m = var2;
            <undefinedtype>[] var4 = new <undefinedtype>[var10001];
            boolean var10003 = true;
            this.aab = var4;

            for(int var10000 = var2 = 5 >> 3; var10000 < this.aab.length; var10000 = var2) {
               this.aab[var2] = new JComponent(var2) {
                  private Class436 vk;
                  private boolean wk;
                  private boolean afz;
                  private JLabel as;
                  private String tw;
                  private JLabel bd;
                  private Class436 r;
                  // $FF: synthetic field
                  final Class428 bab;
                  private double aas;
                  private int m;

                  protected void paintComponent(Graphics var1) {
                     if (this.wk) {
                        if (Class428.adv(this.bab) == null) {
                           Class428.aea(this.bab, Class511.a("sc/e/184.png"));
                        }

                        var1.drawImage(Class428.adv(this.bab), 27 & 111, 3 >> 2, 51 & 111, 51 & 111, (ImageObserver)null);
                     }

                     if (this.afz) {
                        if (Class428.aec(this.bab) == null) {
                           Class428.adu(this.bab, Class511.a("sc/e/179.png"));
                        }

                        var1.drawImage(Class428.aec(this.bab), 111 & 31, 5 >> 1, 95 & 59, 109 & 50, (ImageObserver)null);
                     } else {
                        if (Class428.adw(this.bab) == null) {
                           Class428.adx(this.bab, Class511.a("sc/e/180.png"));
                        }

                        var1.drawImage(Class428.adw(this.bab), 31 & 111, 5 >> 1, 95 & 59, 102 & 57, (ImageObserver)null);
                     }
                  }

               
                  static int aqi(Object var0) {
                     return var0.m;
                  }

                  public void aqj(int var1, int var2, Skill var3) {
                     if (var3 == null) {
                        this.q();
                     } else {
                        int var10006 = 5 >> 3;
                        int var10008 = --1;
                        this.tw = null;
                        this.m = var1;
                        this.aas = (double)var2;
                        this.afz = (boolean)var10008;
                        this.wk = (boolean)var10006;
                        this.bd.setForeground(Class681.c("#cFFF7D0"));
                        this.bd.setText(var3.getSkillname());
                        this.as.setText("等级" + var2);
                        this.r.aee((double)var2 / 15.0D, 124 & 71);
                        this.vk.setVisible((boolean)(2 ^ 3));
                     }
                  }

               
                  static double aqk(Object var0) {
                     return var0.aas;
                  }

                  public void q() {
                     int var10006 = 3 >> 2;
                     int var10008 = 5 >> 3;
                     int var10012 = 3 & 4;
                     this.tw = null;
                     this.m = var10012;
                     this.aas = 0.0D;
                     this.afz = (boolean)var10008;
                     this.wk = (boolean)var10006;
                     this.bd.setForeground(Class681.c("#cB19D82"));
                     this.bd.setText("灵窍无灵气");
                     this.as.setText("");
                     this.r.aee(0.0D, 76 & 119);
                     this.vk.setVisible((boolean)(2 & 5));
                  }

               
                  static String aql(Object var0) {
                     return var0.tw;
                  }

               
                  static void aqm(Object var0, boolean var1) {
                     var0.wk = var1;
                  }

                  public {
                     int var10002 = 7087 & 25852;
                     int var10004 = 126 & 47;
                     this.bab = var1;
                     super();
                     this.bd = Class133.b(var10004, 31 & 106, 124 & 123, 121 & 22, Class681.c("#cB19D82"), Class681.q);
                     this.as = Class133.b(var10002, 31 & 106, 103 & 94, 60 & 83, Color.white, Class681.q);
                     if (var2 >= --5) {
                        this.bd.addMouseListener(new MouseListener(this) {
                           // $FF: synthetic field
                           final Class428 akh;
                           <undefinedtype> aki;

                           public {
                              this.akh = var1;
                              this.aki = var2;
                           }

                           public void mousePressed(MouseEvent var1) {
                           }

                           public void mouseClicked(MouseEvent var1) {
                           }

                           public void mouseReleased(MouseEvent var1) {
                           }

                           public void mouseExited(MouseEvent var1) {
                              this.akh.ve().n(127 & 46);
                           }

                           public void mouseEntered(MouseEvent var1) {
                              Skill var3 = null.aqi(this.aki) > 0 ? this.akh.vc().bf(String.valueOf(null.aqi(this.aki))) : null;
                              if (var3 != null) {
                                 Class270 var2 = (Class270)this.akh.ve().e(47 & 126);
                                 var2.rl(var3.getSkillname() + "(" + (int)null.aqk(this.aki) + "级)", SkillUtil.g(var3, (int)null.aqk(this.aki)));
                              }
                           }
                        });
                     }

                     this.as.setHorizontalAlignment(5 >> 3);
                     this.add(this.bd);
                     this.add(this.as);
                     this.r = new Class436(Class511.q("sc/d/182.png", 1 ^ 3, 1 ^ 3, 1 ^ 3, 1 ^ 3, (boolean)(2 & 5)));
                     this.vk = new Class436(Class511.q("sc/e/29.png", 23 & 110, 23 & 110, 23 & 110, 23 & 110, (boolean)(2 & 5)));
                     this.r.setBounds(21503 & 11437, 93 & 46, 87 & 108, 109 & 31);
                     this.vk.setBounds(15103 & 17836, 62 & 75, 79 & 118, 16);
                     this.add(this.r);
                     this.add(this.vk);
                  }

                  public void aqn(String var1, double var2, AlchemyUnit var4) {
                     if (Class394.o(var1)) {
                        this.q();
                     } else {
                        int var10004 = 5 >> 3;
                        int var10006 = --1;
                        int var10010 = 3 ^ 3;
                        this.tw = var1;
                        this.m = var10010;
                        this.aas = var2;
                        this.afz = (boolean)var10006;
                        this.wk = (boolean)var10004;
                        this.bd.setForeground(Class681.c("#cFFF7D0"));
                        this.bd.setText(var1);
                        this.as.setText(Class394.ak(var2, var4 != null ? var4.getSize() : 1) + Class270.so(var1));
                        this.r.aee(var4 != null ? var2 / var4.getMax() : 1.0D, 68);
                        this.vk.setVisible((boolean)(--1));
                     }
                  }
               };
               <undefinedtype> var3;
               if (var2 < --5) {
                  var3 = this;
                  this.aab[var2].setBounds(5 >> 3, (111 & 31) + (59 & 95) * var2, 10729 & 22295, 111 & 51);
               } else {
                  var3 = this;
                  this.aab[var2].setBounds(5 >> 3, (18155 & 14775) + (95 & 59) * (var2 - --5), 6627 & 26397, 43 & 119);
               }

               var3.add(this.aab[var2++]);
            }

            this.bl = new Class436("sc/d/179.png");
            this.bl.setBounds(2 & 5, 2 & 5, 22391 & 10633, 1535 & 31480);
            this.add(this.bl);
         }

         public void ab(int var1) {
            int var2;
            for(int var10000 = var2 = 3 ^ 3; var10000 < this.aab.length; var10000 = var2) {
               null.aqm(this.aab[var2], (boolean)((var1 >> var2 & 3 >> 1) == 3 >> 1 ? --1 : 0));
               ++var2;
            }

         }

         public void cc() {
            int var4 = Math.max(2 & 5, Class428.this.alr.bn - Class428.this.alx.bn + (1 ^ 3));
            int var2 = 3 ^ 3;

            int var3;
            for(int var10000 = var3 = 2 & 5; var10000 < 2999 && var4 > 0; var10000 = var3) {
               int var1 = Class27.c.nextInt(87 & 47);
               if ((var2 >> var1 & 5 >> 2) != (2 ^ 3)) {
                  int var10001 = 3 >> 1;
                  --var4;
                  var2 |= var10001 << var1;
               }

               ++var3;
            }

            this.ab(var2);
         }

         public void qi(String var1, AlchemySet var2) {
            int var6 = 3 ^ 3;
            int var4 = 3 >> 2;
            int var5 = 3 & 4;

            int var3;
            for(int var10000 = var3 = 3 >> 2; var10000 < var1.length(); var10000 = var3) {
               if ((var3 = var1.indexOf("|", var5 + --1)) == -4 >> 2) {
                  var3 = var1.length();
               }

               label40: {
                  int var7;
                  if ((var7 = var1.indexOf("=", var5 + --1)) != -4 >> 2) {
                     if (var7 > var3) {
                        var10000 = var3;
                        break label40;
                     }

                     String var8;
                     if (!(var8 = var1.substring(var5, var7)).equals("等级")) {
                        if (var8.equals("耐久")) {
                           var10000 = var3;
                           break label40;
                        }

                        if (var8.equals("技能")) {
                           if (var4 < --2) {
                              var5 = var7 + (3 & 5);
                              var7 = var1.indexOf("#", var5 + (3 >> 1));
                              int var11 = Class394.b(var1, var5, var7);
                              int var10 = Class394.b(var1, var7 + (3 & 5), var3);
                              this.aab[--5 + var4].aqj(var11, var10, Class428.this.vc().bf(String.valueOf(var11)));
                           }

                           ++var4;
                           var10000 = var3;
                           break label40;
                        }

                        if (var6 < --5) {
                           double var9 = Double.parseDouble(var1.substring(var7 + (3 & 5), var3));
                           this.aab[var6].aqn(var8, var9, var2.getAlchemyUnit(var8));
                        }

                        ++var6;
                     }
                  }

                  var10000 = var3;
               }

               var5 = var10000 + 1;
            }

            this.cf(var6, var4);
         }

         public void q() {
            AlchemySet var8;
            if ((var8 = Class428.this.vc().q()) != null) {
               int var2 = Class428.ov();
               int var6 = Class428.ot();
               int var4;
               int var10000;
               if ((var4 = var2 + var6 * (5 >> 1)) <= --4) {
                  var10000 = 2 ^ 3;
               } else if (var4 <= (91 & 44)) {
                  var10000 = 1 ^ 3;
               } else {
                  boolean var13 = true;
               }

               var4 = 5 >> 3;
               int var5 = 3 & 4;
               LinkedList var3 = new LinkedList();
               int var7 = 3 & 4;

               for(var10000 = var2; var10000 > 0 && var7 < (2999 & 32767); var10000 = var2) {
                  AlchemyUnit var1 = var8.a();
                  if (!var3.contains(var1.getKey())) {
                     this.aab[var4].aqn(var1.getKey(), var1.getDoubleByMax(--5, 125 & 22), var1);
                     --var2;
                     var3.add(var1.getKey());
                     ++var4;
                  }

                  ++var7;
               }

               var3.clear();
               var7 = 3 & 4;

               for(var10000 = var6; var10000 > 0 && var7 < (32695 & 3071); var10000 = var6) {
                  int var9;
                  String var11 = String.valueOf(var9 = 2101 + Class27.c.nextInt(111 & 62));
                  Skill var10;
                  if ((var10 = Class428.this.vc().bf(var11)) != null && !var3.contains(var11)) {
                     int var12 = Class428.uf();
                     <undefinedtype> var14 = this.aab[--5 + var5];
                     --var6;
                     var14.aqj(var9, var12, var10);
                     ++var5;
                  }

                  ++var7;
               }

               this.cf(var4, var5);
            }
         }
      };
      this.add(this.alx);
      this.add(this.alr);
      Class436[] var14 = new Class436[4];
      var10003 = true;
      this.nn = var14;

      for(var10000 = var3 = 0; var10000 < this.nn.length; var10000 = var3) {
         this.nn[var3] = new Class436();
         if (var3 == 0) {
            var8 = this;
            this.nn[var3].eq(Class511.q("sc/d/35.png", 100, 2, 100, 2, false));
            this.nn[var3].setBounds(48, 37, 590, 20);
         } else {
            if (var3 != 1 && var3 != 2 && var3 == 3) {
               this.nn[var3].fw("sc/d/183.png");
               this.nn[var3].setBounds(46, 59, 592, 347);
            }

            var8 = this;
         }

         var8.add(this.nn[var3++]);
      }

   }

   public boolean t() {
      if (this.alz != null) {
         this.alz = null;
      }

      if (this.aly != null) {
         this.aly = null;
      }

      return super.t();
   }

   public void ax(Goodstable var1) {
      this.alt[5 >> 3].c(5 >> 2, var1);
      this.alx.qg(var1, this.vc().q());
      if (this.m == (2 ^ 3)) {
         this.alt[3 >> 1].c(2 & 5, (Object)null);
         this.alr.cf(3 ^ 3, 3 ^ 3);
      }

   }

   public long gl() {
      return this.zd;
   }

   public boolean aeb(int var1, boolean var2) {
      Goodstable var5;
      Goodstable var9;
      if (var1 == (6647 & 26443)) {
         int var10000;
         if (this.m == 0) {
            var9 = this.alt[5 >> 3].tp() == 5 >> 2 ? (Goodstable)this.alt[3 >> 2].hr() : null;
            if (var9 == null) {
               var10000 = 2 & 5;
               this.aej.f("请选择守护石");
               return (boolean)var10000;
            }

            this.dp(--2);
            return (boolean)(--1);
         }

         RoleData var3;
         Goodstable var4;
         ArrayList var7;
         String var8;
         SuitOperBean var11;
         if (this.m == (3 & 5)) {
            if (this.bl()) {
               return (boolean)(3 >> 2);
            }

            if ((var3 = this.vd()).getLoginResult().getGold().longValue() < this.amd) {
               var10000 = 5 >> 3;
               this.aej.f("金钱不足");
               return (boolean)var10000;
            }

            if (var3.getLoginResult().getScoretype("守护之尘").longValue() < this.lp) {
               var10000 = 2 & 5;
               this.aej.f("守护之尘不足");
               return (boolean)var10000;
            }

            var4 = this.alt[3 >> 2].tp() == --1 ? (Goodstable)this.alt[3 & 4].hr() : null;
            var5 = this.alt[5 >> 2].tp() == 3 >> 1 ? (Goodstable)this.alt[3 >> 1].hr() : null;
            if (var4 != null) {
               var4 = var3.getGood(var4.getRgid());
            }

            if (var5 != null) {
               var4 = var3.getGood(var4.getRgid());
            }

            if (var4 != null && var5 != null) {
               var3.getLoginResult().setGold(new BigDecimal(var3.getLoginResult().getGold().longValue() - this.amd));
               var3.getLoginResult().setScore(Class509.h(var3.getLoginResult().getScore(), "守护之尘=" + this.lp, --3));
               var5.ab(2 ^ 3);
               if (var5.getUsetime() <= 0) {
                  var3.h(var5.getRgid());
               }

               int var10003 = --1;
               int var10001 = --1;
               this.alt[var10003].c(3 & 4, (Object)null);
               this.r((boolean)var10001);
               var11 = new SuitOperBean();
               (var7 = new ArrayList()).add(var4.getRgid());
               var7.add(var5.getRgid());
               var11.setType(32697 & 214);
               var11.setGoods(var7);
               var8 = Agreement.getSendTextAES("suitoperate", Class695.b().toJson(var11));
               this.uw().d(var8);
               return (boolean)(2 ^ 3);
            }

            this.aej.f("请选择守护石或守护石不在背包");
            return (boolean)(3 >> 2);
         }

         if (this.m == (1 ^ 3)) {
            if (!var2 && this.bl()) {
               return false;
            }

            if ((var3 = this.vd()).getLoginResult().getGold().longValue() < this.amd) {
               this.aej.f("金钱不足");
               return false;
            }

            var4 = this.alt[0].tp() == 1 ? (Goodstable)this.alt[0].hr() : null;
            if (var4 != null) {
               var4 = var3.getGood(var4.getRgid());
            }

            if (var4 == null) {
               this.aej.f("请选择守护石或守护石不在背包");
               return false;
            }

            if ((var5 = var3.az(107L)) == null) {
               this.aej.f("缺少灵元晶");
               return false;
            }

            var3.getLoginResult().setGold(new BigDecimal(var3.getLoginResult().getGold().longValue() - this.amd));
            var5.ab(1);
            if (var5.getUsetime() <= 0) {
               var3.h(var5.getRgid());
            }

            this.r(true);

            int var6;
            for(var10000 = var6 = 0; var10000 < this.mn.length; var10000 = var6) {
               this.mn[var6++].setVisible(false);
            }

            var11 = new SuitOperBean();
            (var7 = new ArrayList()).add(var4.getRgid());
            var7.add(var5.getRgid());
            var11.setType(9471 & 23439);
            var11.setGoods(var7);
            var8 = Agreement.getSendTextAES("suitoperate", Class695.b().toJson(var11));
            this.uw().d(var8);
            return true;
         }
      } else {
         if (var1 == (21846 & 11245)) {
            if (this.amb == null) {
               return false;
            }

            if ((var9 = this.vd().getGood(this.amb.getRgid())) == null) {
               this.aej.f("守护石不在背包");
               return false;
            }

            var9.setValue(this.amb.getNewAttr());
            String var10 = Agreement.getSendTextAES("extrattroper", Class695.b().toJson(this.amb));
            this.uw().d(var10);
            this.amb = null;
            var5 = this.alt[0].tp() == 1 ? (Goodstable)this.alt[0].hr() : null;
            this.alx.qg(var5, this.vc().q());
            this.alr.cf(0, 0);
            return true;
         }

         if (var1 == (10567 & 22525)) {
            this.dp(0);
            return true;
         }
      }

      return false;
   }

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      long var2;
      if (this.hg && (var2 = (Class280.l() - this.zd) / 160L) > this.yu) {
         this.yu = var2;
         if (this.m == --1) {
            if (this.amc != null && var2 >= 6L) {
               this.amb = (QualityClBean)this.amc;
               this.r((boolean)(3 ^ 3));
               this.d();
               if (Class394.o(this.amb.getNewAttr())) {
                  this.aej.f("副守护石中提取出匹配属性/特技与主守护石不匹配，主守护石未发生变化");
                  return;
               }

               this.aej.f("成功从副守护石中提取出匹配属性/特技，主守护石获得增强");
               return;
            }

            this.alr.cc();
            return;
         }

         if (this.m == 5 >> 1) {
            if (this.amc != null && var2 >= 6L) {
               this.amb = (QualityClBean)this.amc;
               int var10003 = 5 >> 3;
               int var10000 = 5 >> 3;
               this.r((boolean)var10003);
               this.alr.qi(this.amb.getNewAttr(), this.vc().q());

               for(int var4 = var10000; var10000 < this.mn.length; var10000 = var4) {
                  this.mn[var4++].setVisible((boolean)(3 >> 1));
               }

               return;
            }

            this.alr.q();
         }
      }

   }

   public void y(int var1) {
      int var10000;
      int var2;
      if (var1 == 0) {
         for(var10000 = var2 = 3 ^ 3; var10000 < this.alv.length; var10000 = var2) {
            this.alv[var2].setVisible((boolean)(var2 >= (70 & 63) && var2 != (63 & 72) ? 5 >> 3 : 1));
            ++var2;
         }

         for(var10000 = var2 = 5 >> 3; var10000 < this.vg.length; var10000 = var2) {
            this.vg[var2].setVisible((boolean)(var2 < (1 ^ 3) ? --1 : 0));
            ++var2;
         }

         for(var10000 = var2 = 5 >> 3; var10000 < this.alu.length; var10000 = var2) {
            this.alu[var2++].setVisible((boolean)(--1));
         }

         for(var10000 = var2 = 3 & 4; var10000 < this.alt.length; var10000 = var2) {
            this.alt[var2++].setVisible((boolean)(4 ^ 5));
         }

         for(var10000 = var2 = 3 >> 2; var10000 < this.mn.length; var10000 = var2) {
            this.mn[var2].setVisible((boolean)(var2 < (3 & 5) ? 4 ^ 5 : 0));
            ++var2;
         }

         this.alx.setVisible((boolean)(2 ^ 3));
         this.alr.setVisible((boolean)(5 >> 3));
         this.nn[2 ^ 3].setVisible((boolean)(5 >> 2));
         this.nn[--2].setVisible((boolean)(5 >> 2));
      } else if (var1 == 3 >> 1) {
         for(var10000 = var2 = 2 & 5; var10000 < this.alv.length; var10000 = var2) {
            this.alv[var2++].setVisible((boolean)(5 >> 2));
         }

         for(var10000 = var2 = 3 & 4; var10000 < this.vg.length; var10000 = var2) {
            this.vg[var2++].setVisible(true);
         }

         for(var10000 = var2 = 0; var10000 < this.alu.length; var10000 = var2) {
            this.alu[var2++].setVisible(true);
         }

         for(var10000 = var2 = 0; var10000 < this.alt.length; var10000 = var2) {
            this.alt[var2++].setVisible(true);
         }

         for(var10000 = var2 = 0; var10000 < this.mn.length; var10000 = var2) {
            this.mn[var2].setVisible(var2 < 1);
            ++var2;
         }

         this.alx.setVisible(true);
         this.alr.setVisible(true);
         this.nn[1].setVisible(true);
         this.nn[--2].setVisible(true);
      } else {
         if (var1 == 5 >> 1) {
            for(var10000 = var2 = 0; var10000 < this.alv.length; var10000 = var2) {
               this.alv[var2++].setVisible(false);
            }

            for(var10000 = var2 = 0; var10000 < this.vg.length; var10000 = var2) {
               this.vg[var2++].setVisible(false);
            }

            for(var10000 = var2 = 0; var10000 < this.alu.length; var10000 = var2) {
               this.alu[var2++].setVisible(false);
            }

            for(var10000 = var2 = 0; var10000 < this.alt.length; var10000 = var2) {
               this.alt[var2++].setVisible(false);
            }

            for(var10000 = var2 = 0; var10000 < this.mn.length; var10000 = var2) {
               this.mn[var2++].setVisible(true);
            }

            this.alx.setVisible(true);
            this.alr.setVisible(true);
            this.nn[1].setVisible(false);
            this.nn[5 >> 1].setVisible(false);
         }

      }
   }


   static Image aec(Class428 var0) {
      return var0.xs;
   }

   protected void paintChildren(Graphics var1) {
      super.paintChildren(var1);
      int var10000;
      if (this.gs != null && this.gs.size() > 0) {
         long var2 = Class280.l();

         int var4;
         for(var10000 = var4 = this.gs.size() - (3 >> 1); var10000 >= 0; var10000 = var4) {
            Class698 var5;
            Class8 var6 = (var5 = (Class698)this.gs.get(var4)).c == 0L ? this.alz : this.aly;
            long var11;
            if (var6 == null && var5.c == 0L) {
               var6 = this.alz = Class330.q("sc/mouse/shrl1.tcp");
               var11 = var2;
            } else {
               if (var6 == null && var5.c != 0L) {
                  var6 = this.aly = Class330.q("sc/mouse/shrl2.tcp");
               }

               var11 = var2;
            }

            long var7;
            if ((var7 = var11 - var5.d - 100L) >= 0L) {
               if (var7 >= (long)(var6 != null ? var6.k() : 500)) {
                  this.gs.remove(var4);
               } else if (var6 != null) {
                  var6.d(var7, 2 & 5);
                  var6.aa(var1, (int)var5.b, (int)var5.a);
               }
            }

            --var4;
         }
      }

      if (this.ep != null && this.ep.size() > 0) {
         var1.setColor(Color.black);
         var1.setFont(Class681.q);

         int var9;
         for(var10000 = var9 = this.ep.size() - (4 ^ 5); var10000 >= 0; var10000 = var9) {
            Class223 var3 = (Class223)this.ep.get(var9);
            <undefinedtype> var10 = this.alx.aab[(int)var3.b];
            String var10001 = var3.d();
            int var10002 = this.alx.getX() + var10.getX() + (5099 & 27935);
            int var10003 = this.alx.getY() + var10.getY();
            --var9;
            var1.drawString(var10001, var10002, var10003 + (127 & 23));
         }
      }

      if (this.ep == null) {
         this.ep = new ArrayList();
      }

   }

   public void fr(Class44 var1) {
      if (this.m == 0 || this.m == --1) {
         this.as(3 ^ 3);
      }

   }

   public int e() {
      return this.m;
   }

   public void c(int var1, Object var2) {
      if (var1 == this.m) {
         this.amc = var2;
      }
   }
}
