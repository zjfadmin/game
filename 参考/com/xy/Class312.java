package com.xy;

import com.xy.bean.ConfirmBean;
import com.xy.bean.SuitOperBean;
import com.xy.formula.GoodType;
import com.xy.formula.MsgUntil;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.border.Border;

public class Class312 extends Class345 {
   private Class357 aep;
   private int dm;
   private static Border aeq;
   private JScrollPane za;
   private JLabel[] aer;
   private JComponent fa;
   private <undefinedtype>[] aes;
   private BigDecimal rc;
   private MoneyType np;
   private Class556 aet;
   private Class529[] mn;
   private Class245 ac;
   private Class529[] ib;
   private Class436[] an;
   private Class44 it;

   public Class312(GameView var1) {
      int var10001 = --2;
      int var10005 = -4 >> 2;
      super(118 & 93, 1 ^ 3, Class345.aef, var1);
      this.va(var10005, 2 & 5, 5865 & 27454, 24951 & 8191, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 85 & 110, 85 & 110, 85 & 110, 85 & 110, (boolean)(3 & 4)), "宝石打造");
      Class529[] var6 = new Class529[var10001];
      boolean var10003 = true;
      this.ib = var6;

      int var2;
      int var10000;
      for(var10000 = var2 = 3 >> 2; var10000 < this.ib.length; var10000 = var2) {
         Class529[] var5 = this.ib;
         Class529 var10002 = new Class529;
         var10005 = --2;
         int var10006 = (21935 & 11003) + var2;
         Font var10007 = Class681.cw;
         String var10009;
         Class312 var10010;
         if (var2 == 0) {
            var10009 = "已装备";
            var10010 = this;
         } else if (var2 == 3 >> 1) {
            var10009 = "其他";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var10002.<init>("sc/e/39.png", var10005, var10006, var10007, (Color[])null, var10009, var10010);
         var5[var2] = var10002;
         this.ib[var2].setOffsetTexts(Class681.cl);
         this.ib[var2].setBounds((127 & 49) + (97 & 95) * var2, 87 & 62, 127 & 63, 61 & 90);
         this.add(this.ib[var2++]);
      }

      var6 = new Class529[71 & 63];
      var10003 = true;
      this.mn = var6;

      for(var10000 = var2 = 3 ^ 3; var10000 < this.mn.length; var10000 = var2) {
         if (var2 == 0) {
            this.mn[var2] = new Class529("sc/e/7.png", --1, 4286 & 28661, Class681.ak, Class681.c, "打造", this);
            this.mn[var2].setBounds(24575 & 8541, 22773 & 10235, 59 & 127, 95 & 57);
            this.add(this.mn[var2]);
         } else {
            this.mn[var2] = new Class529("sc/e/28.png", 2 ^ 3, 180 + var2, Class681.bm, (Color[])null, "", this);
            this.mn[var2].setText(var2 == (3 & 5) ? "全部" : (var2 == (1 ^ 3) ? "武器" : (var2 == --3 ? "衣服" : (var2 == --4 ? "帽子" : (var2 == --5 ? "项链" : (var2 == 6 ? "鞋子" : ""))))));
            this.mn[var2].setBounds(156, 48 + (var2 - (2 ^ 3)) * 18, 68, 18);
            this.add(this.mn[var2]);
         }

         ++var2;
      }

      var10001 = --4;
      this.np = new MoneyType();
      this.np.setIdAndKey(5 >> 2, "金钱");
      this.ac = Class133.a(363, 188, 104, 19, 10, Color.white, Class681.q);
      this.aet = Class133.m(363, 211, 104, 19, 10, Color.white, Class681.q, this.np, var1);
      this.ac.eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(3 ^ 3)));
      this.aet.eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(2 & 5)));
      this.add(this.ac);
      this.add(this.aet);
      JLabel[] var8 = new JLabel[var10001];
      var10003 = true;
      this.aer = var8;

      for(var10000 = var2 = 5 >> 3; var10000 < this.aer.length; var10000 = var2) {
         this.aer[var2] = Class133.b(3 & 4, 3 & 4, 3 & 4, 3 & 4, Color.white, Class681.ab);
         this.aer[var2].setText(var2 == 0 ? "消耗精华" : (var2 == --1 ? "99/9999" : (var2 == --2 ? "消耗金钱" : (var2 == --3 ? "拥有金钱" : ""))));
         Class312 var7;
         if (var2 == 0) {
            var7 = this;
            this.aer[var2].setBounds(298, 159, 58, 19);
         } else if (var2 == --1) {
            var7 = this;
            this.aer[var2].setBounds(400, 159, 80, 19);
         } else if (var2 == (1 ^ 3)) {
            var7 = this;
            this.aer[var2].setBounds(298, 188, 58, 19);
         } else {
            if (var2 == --3) {
               this.aer[var2].setBounds(298, 211, 58, 19);
            }

            var7 = this;
         }

         var7.add(this.aer[var2++]);
      }

      this.fa = new JComponent() {
      };
      this.za = Class133.f(49, 68, 180, 277, this.fa, 20);
      this.add(this.za);
      this.it = new Class44(this);
      Class436 var4 = new Class436("sc/d/4.png");
      this.it.setBounds(260, 71, 50, 50);
      var4.setBounds(256, 67, 59, 57);
      this.add(this.it);
      this.add(var4);
      <undefinedtype>[] var10 = new <undefinedtype>[--3];
      var10003 = true;
      this.aes = var10;

      int var3;
      for(var10000 = var3 = 3 >> 2; var10000 < this.aes.length; var10000 = var3) {
         this.aes[var3] = new JComponent() {
            private int ay;
            private Class529 aaz;
            private JLabel ir;
            private Class44 it;

            public void agp(int var1, Goodstable var2) {
               this.ay = var1;
               if (var2 == null) {
                  this.ir.setVisible((boolean)(4 ^ 5));
                  this.it.c(2 & 5, (Object)null);
                  this.it.setVisible((boolean)(5 >> 2));
                  this.aaz.setForeground(Color.GRAY);
                  this.aaz.setText("可打造");
                  this.aaz.setBtn(5 >> 3, (String)null);
               } else {
                  this.ir.setVisible((boolean)(2 & 5));
                  this.it.c(--1, var2);
                  if (var1 == 3 >> 1) {
                     this.aaz.setForeground(Color.white);
                     this.aaz.setText("摘除");
                     this.aaz.setBtn(5 >> 2, "sc/e/27.png");
                  } else {
                     this.aaz.setForeground(Color.red);
                     this.aaz.setText("待打造");
                     this.aaz.setBtn(5 >> 3, (String)null);
                  }
               }
            }

            public {
               int var10009 = 3 & 4;
               this.ir = Class133.c(var10009, 3 & 4, 127 & 51, 127 & 51, 3 & 4, Color.white, Class681.ab);
               this.it = new Class44(Class312.this.gk());
               this.it.ad(Class44.arj);
               this.it.eq(Class511.q("sc/d/4.png", --5, --5, --5, --5, (boolean)(3 & 4)));
               this.it.setBounds(3 ^ 3, 3 ^ 3, 123 & 55, 123 & 55);
               this.aaz = new Class529("sc/e/27.png", 3 >> 1, 18175 & 14779, Class681.bm, (Color[])null, "", Class312.this.gk());
               this.aaz.bq(this);
               this.aaz.setBounds(3 ^ 3, 118 & 61, 59 & 119, 27 & 118);
               this.add(this.ir);
               this.add(this.it);
               this.add(this.aaz);
            }
         };
         this.aes[var3].setBounds(329 + 57 * var3, 67, 52, 70);
         this.add(this.aes[var3++]);
      }

      Class436[] var11 = new Class436[8];
      var10003 = true;
      this.an = var11;

      for(var10000 = var3 = 5 >> 3; var10000 < this.an.length; var10000 = var3) {
         this.an[var3] = new Class436();
         this.add(this.an[var3]);
         if (var3 == 0) {
            this.an[var3].eq(Class511.q("sc/d/25.png", --2, --2, --2, --2, (boolean)(3 ^ 3)));
            this.an[var3].setBounds(49, 46, 180, 21);
         } else if (var3 == (4 ^ 5)) {
            this.an[var3].eq(Class511.q("sc/d/24.png", --2, --2, --2, --2, false));
            this.an[var3].setBounds(49, 46, 180, 300);
         } else if (var3 == 2) {
            this.an[var3].eq(Class511.q("sc/d/17.png", 5, 5, 5, 5, false));
            this.an[var3].setBounds(246, 58, 260, 80);
         } else if (var3 == 3) {
            this.an[var3].hf(Class222.i("744"));
            this.an[var3].setBounds(366, 157, 23, 23);
         } else if (var3 == 4) {
            this.an[var3].eq(Class511.q("sc/d/4.png", 5, 5, 5, 5, false));
            this.an[var3].setBounds(362, 153, 31, 31);
         } else if (var3 == 5) {
            this.an[var3].eq(Class511.q("sc/d/19.png", 5, 5, 5, 5, false));
            this.an[var3].setBounds(245, 282, 258, 54);
            this.aep = new Class357(this, 5, 1, 51, 51, 0, 0, 246, 284);
            this.aep.hf(Class511.a("sc/d/18.png"));
            this.add(this.aep);
         } else if (var3 == 6) {
            this.an[var3].eq(Class511.q("sc/d/74.png", 16, 16, 16, 16, false));
            this.an[var3].setBounds(228, 46, 300, 300);
         } else if (var3 == 7) {
            this.an[var3].eq(Class511.q("sc/d/24.png", 290, 290, 2, 2, false));
            this.an[var3].setBounds(231, 49, 294, 294);
         }

         ++var3;
      }

   }

   public void bq(Object var1) {
      <undefinedtype> var4;
      if ((var4 = (<undefinedtype>)var1).ay == (3 & 5)) {
         RoleData var2 = this.vd();
         Goodstable var3 = (Goodstable)this.it.hr();
         Goodstable var5 = (Goodstable)var4.it.hr();
         if (var3 != null) {
            var3 = var2.getGood(var3.getRgid());
         }

         if (var5 != null) {
            var5 = var2.getGood(var5.getRgid());
         }

         if (var3 != null && var5 != null) {
            StringBuffer var6;
            (var6 = new StringBuffer()).append("#Y你确定花费#R ");
            var6.append(MsgUntil.getGoodLvl(var5.getValue()) * 3200000);
            var6.append(" #Y金钱拆卸该宝石吗?");
            this.aej.aal(new ConfirmBean(91 & 55, var3.getRgid() + "|" + var5.getRgid(), var6.toString()));
         }
      }
   }

   public Goodstable hp(int var1) {
      if (var1 == 0) {
         return (Goodstable)this.it.hr();
      } else {
         for(int var10000 = var1 = 0; var10000 < this.aes.length; var10000 = var1) {
            if (this.aes[var1].ay != 5 >> 2 && this.aes[var1].it.tp() == (3 & 5)) {
               return (Goodstable)this.aes[var1].it.hr();
            }

            ++var1;
         }

         return null;
      }
   }

   public void fr(Class44 var1) {
      int var2;
      for(int var10000 = var2 = 5 >> 3; var10000 < this.aes.length; var10000 = var2) {
         if (this.aes[var2].it == var1) {
            if (this.aes[var2].ay != 0) {
               return;
            }

            this.aes[var2].agp(5 >> 3, (Goodstable)null);
            this.rc = null;
            this.ac.setText((String)null);
            this.aer[2 ^ 3].setText((String)null);
            return;
         }

         ++var2;
      }

   }

   public void q() {
      this.dp(2 & 5);
      this.aet.cc();
      super.q();
   }

   public void vh(Object var1) {
      int var4 = 2 & 5;
      int var3 = this.fa.getComponentCount();

      int var10000;
      for(var10000 = var4; var10000 < var3; var10000 = var4) {
         <undefinedtype> var2;
         if ((var2 = (<undefinedtype>)this.fa.getComponent(var4)).isVisible()) {
            if (var2 == var1) {
               if (aeq == null) {
                  aeq = BorderFactory.createLineBorder(Color.YELLOW, 5 >> 1);
               }

               var2.setBorder(aeq);
            } else {
               var2.setBorder(BorderFactory.createEmptyBorder());
            }
         }

         ++var4;
      }

      this.rc = null;
      this.ac.setText((String)null);
      this.aer[--1].setText((String)null);
      int var10002 = 2 & 5;
      var10000 = 2 & 5;
      this.it.c(var10002, (Object)null);

      for(var4 = var10002; var10000 < this.aes.length; var10000 = var4) {
         <undefinedtype> var14 = this.aes[var4];
         ++var4;
         var14.agp(3 ^ 3, (Goodstable)null);
      }

      this.aes[5 >> 1].setVisible((boolean)(3 ^ 3));
      RoleData var12 = this.vd();
      Goodstable var10 = var1 != null ? (Goodstable)var1.dv[3 >> 2].hr() : null;
      if (var10 != null) {
         var10 = var12.getGood(var10.getRgid());
      }

      long[] var10001;
      boolean var10003;
      if (var10 == null) {
         var10001 = new long[5 >> 2];
         var10003 = true;
         var10001[3 ^ 3] = -1L;
         this.aep.ud(var10001);
      } else {
         this.it.c(--1, var10);
         int var9 = GoodType.ai(var10.getType());
         int var7 = 3 >> 2;
         int var5 = var9 == 0 ? --3 : 2;

         for(var10000 = var7; var10000 < var5; var10000 = var7) {
            if (var9 == 0) {
               this.aes[var7].ir.setText(var7 == 0 ? "赤炎石" : (var7 == 5 >> 2 ? "紫烟石" : "孔雀石"));
            } else if (var9 == (3 & 5)) {
               this.aes[var7].ir.setText(var7 == 0 ? "落星石" : "芙蓉石");
            } else if (var9 == 5 >> 1) {
               this.aes[var7].ir.setText(var7 == 0 ? "沐阳石" : "芙蓉石");
            } else if (var9 == --3) {
               this.aes[var7].ir.setText(var7 == 0 ? "落星石" : "沐阳石");
            } else if (var9 == --5) {
               this.aes[var7].ir.setText(var7 == 0 ? "琉璃石" : "寒山石");
            }

            ++var7;
         }

         if (var9 == 0) {
            this.aes[5 >> 1].setVisible((boolean)(--1));
         }

         Goodstable var15;
         long[] var16;
         boolean var10004;
         if (var9 == 0) {
            var15 = var10;
            var16 = new long[--3];
            var10004 = true;
            var16[2 & 5] = 746L;
            var16[3 & 5] = 755L;
            var16[1 ^ 3] = 767L;
            this.aep.ud(var16);
         } else if (var9 == (4 ^ 5)) {
            var15 = var10;
            var16 = new long[--2];
            var10004 = true;
            var16[3 ^ 3] = 749L;
            var16[--1] = 761L;
            this.aep.ud(var16);
         } else if (var9 == --2) {
            var15 = var10;
            var16 = new long[5 >> 1];
            var10004 = true;
            var16[2 & 5] = 749L;
            var16[--1] = 764L;
            this.aep.ud(var16);
         } else if (var9 == --3) {
            var15 = var10;
            var16 = new long[5 >> 1];
            var10004 = true;
            var16[0] = 761L;
            var16[1] = 764L;
            this.aep.ud(var16);
         } else {
            if (var9 == --5) {
               var10001 = new long[--2];
               var10003 = true;
               var10001[0] = 752L;
               var10001[1] = 758L;
               this.aep.ud(var10001);
            }

            var15 = var10;
         }

         String var8;
         if ((var8 = GoodType.getExtra(var15.getValue(), "宝石属性")) != null) {
            String[] var13 = var8.split("&");

            for(var10000 = var7 = 1; var10000 < var13.length; var10000 = var7) {
               BigDecimal var11 = new BigDecimal(var13[var7]);
               int var6;
               if ((var10 = var12.getGoodEquip(var11)) != null && (var6 = GoodType.y(var9, var10.getType())) != 0) {
                  this.aes[var6 - 1].agp(1, var10);
               }

               ++var7;
            }

         }
      }
   }

   public void dp(int var1) {
      int var10000 = 3 & 4;
      this.dm = var1;

      for(var1 = var10000; var10000 < this.ib.length; var10000 = var1) {
         this.ib[var1].setKeep((boolean)(var1 == this.dm ? 5 >> 2 : 0));
         ++var1;
      }

      this.y(this.dm == 0 ? -2 & -1 : -1);
   }

   public void as(int var1) {
      if (this.mn[--2].isVisible()) {
         this.y(var1 == (5302 & 27647) ? 3 & 4 : (var1 == (15287 & 17663) ? --3 : (var1 == (11256 & 21695) ? --1 : (var1 == (24251 & 8701) ? --2 : (var1 == (26367 & 6586) ? --5 : -1)))));
      } else {
         this.mn[3 & 5].setText("全部");

         for(int var10000 = var1 = --1; var10000 < this.mn.length; var10000 = var1) {
            this.mn[var1++].setVisible((boolean)(--1));
         }

      }
   }

   public void y(int var1) {
      int var2;
      Class312 var10;
      int var10000;
      if (var1 == (-2 & -1)) {
         for(var10000 = var2 = 3 & 5; var10000 < this.mn.length; var10000 = var2) {
            this.mn[var2++].setVisible((boolean)(3 & 4));
         }

         var10 = this;
      } else {
         this.mn[2 ^ 3].setText(var1 == -4 >> 2 ? "全部" : (var1 == 0 ? "武器" : (var1 == --3 ? "衣服" : (var1 == (2 ^ 3) ? "帽子" : (var1 == --2 ? "项链" : (var1 == --5 ? "鞋子" : ""))))));
         var10000 = --2;
         this.mn[4 ^ 5].setVisible((boolean)(--1));

         for(var2 = var10000; var10000 < this.mn.length; var10000 = var2) {
            this.mn[var2++].setVisible((boolean)(5 >> 3));
         }

         var10 = this;
      }

      RoleData var8 = var10.vd();
      int var5 = 3 & 4;
      BigDecimal[] var4 = var1 == (-2 & -1) ? var8.goodChoses : var8.goodPacks;

      int var3;
      for(var10000 = var3 = 3 >> 2; var10000 < var4.length; var10000 = var3) {
         Goodstable var6;
         if ((var6 = var8.getGood(var4[var3])) != null && (var1 < 0 && GoodType.d(var6.getType()) || var1 >= 0 && var1 == GoodType.ai(var6.getType()))) {
            Object var7;
            if ((var7 = (<undefinedtype>)(var5 < this.fa.getComponentCount() ? this.fa.getComponent(var5) : null)) == null) {
               var7 = new MouseListener() {
                  private Class44[] dv;
                  private JLabel ax;

                  public void mouseClicked(MouseEvent var1) {
                  }

                  public {
                     int var10001 = --4;
                     int var10005 = 74 & 125;
                     this.ax = Class133.c(var10005, 47 & 89, 89 & 118, 63 & 83, 94 & 43, Color.black, Class681.ak);
                     this.add(this.ax);
                     Class44[] var4 = new Class44[var10001];
                     boolean var10003 = true;
                     this.dv = var4;

                     int var2;
                     for(int var10000 = var2 = 3 >> 2; var10000 < this.dv.length; var10000 = var2) {
                        this.dv[var2] = new Class44(Class312.this.gk()) {
                           public void mousePressed(MouseEvent var1) {
                              super.mousePressed(var1);
                              d();
                           }
                        };
                        <undefinedtype> var3;
                        if (var2 == 0) {
                           this.dv[var2].ad(Class44.aqy);
                           var3 = this;
                           this.dv[var2].fw("sc/d/4.png");
                           this.dv[var2].setBounds(111 & 23, --5, 127 & 59, 63 & 121);
                        } else {
                           this.dv[var2].ad(Class44.arz);
                           var3 = this;
                           this.dv[var2].eq(Class511.q("sc/d/4.png", --5, --5, --5, --5, (boolean)(3 >> 2)));
                           this.dv[var2].setBounds((101 & 91) + (61 & 95) * (var2 - --1), 62 & 95, 127 & 31, 127 & 31);
                        }

                        var3.add(this.dv[var2++]);
                     }

                     this.addMouseListener(this);
                  }

                  public void mouseExited(MouseEvent var1) {
                  }

                  public void mousePressed(MouseEvent var1) {
                     this.d();
                  }

                  public void mouseReleased(MouseEvent var1) {
                  }

                  public void d() {
                     Class312.this.vh(this);
                  }

                  public void mouseEntered(MouseEvent var1) {
                  }

                  public void ax(Goodstable var1) {
                     int var2;
                     int var10000;
                     for(var10000 = var2 = 3 ^ 3; var10000 < this.dv.length; var10000 = var2) {
                        Class44 var12 = this.dv[var2];
                        ++var2;
                        var12.c(5 >> 3, (Object)null);
                     }

                     if (var1 == null) {
                        this.setVisible((boolean)(3 & 4));
                     } else {
                        var2 = GoodType.ai(var1.getType());
                        this.ax.setText(var2 == 0 ? "武器" : (var2 == --3 ? "衣服" : (var2 == 3 >> 1 ? "帽子" : (var2 == (1 ^ 3) ? "项链" : "鞋子"))));
                        this.dv[3 & 4].c(4 ^ 5, var1);
                        String var7;
                        if ((var7 = GoodType.getExtra(var1.getValue(), "宝石属性")) != null) {
                           RoleData var3 = Class312.this.vd();
                           String[] var4 = var7.split("&");

                           int var8;
                           for(var10000 = var8 = 4 ^ 5; var10000 < var4.length; var10000 = var8) {
                              BigDecimal var5 = new BigDecimal(var4[var8]);
                              int var6;
                              Goodstable var11;
                              if ((var11 = var3.getGoodEquip(var5)) != null && (var6 = GoodType.y(var2, var11.getType())) != 0) {
                                 this.dv[var6].c(3 & 5, var11);
                              }

                              ++var8;
                           }
                        }

                        int var9 = 1;
                        int var10 = var2 == 0 ? --4 : 3;

                        for(var10000 = var9; var10000 < var10; var10000 = var9) {
                           this.dv[var9++].setVisible((boolean)(3 & 5));
                        }

                        this.setVisible((boolean)(--1));
                     }
                  }
               };
               ((<undefinedtype>)var7).setBounds(3 >> 2, var5 * (101 & 95), 6655 & 26271, 118 & 77);
               this.fa.add((Component)var7);
            }

            ++var5;
            ((<undefinedtype>)var7).ax(var6);
         }

         ++var3;
      }

      var3 = var5;
      int var9 = this.fa.getComponentCount();

      for(var10000 = var5; var10000 < var9; var10000 = var3) {
         <undefinedtype> var11 = (<undefinedtype>)this.fa.getComponent(var3);
         ++var3;
         var11.ax((Goodstable)null);
      }

      this.fa.setPreferredSize(new Dimension(1711 & 31216, (93 & 103) * var5));
      this.vh(null);
   }

   public void d() {
      RoleData var4 = this.vd();
      Goodstable var2 = this.hp(3 >> 2);
      Goodstable var3 = this.hp(4 ^ 5);
      if (var2 != null) {
         var2 = var4.getGood(var2.getRgid());
      }

      if (var3 != null) {
         var3 = var4.getGood(var3.getRgid());
      }

      if (var2 != null && var3 != null && var2.getRgid().compareTo(var3.getRgid()) != 0) {
         if (var2.getGoodlock() == --1) {
            this.aej.fw("该物品已被加锁");
         } else if (var3.getGoodlock() == --1) {
            this.aej.fw("该物品已被加锁");
         } else if (var3.getStatus() != (3 & 5)) {
            int var1;
            if ((var1 = GoodType.ai(var2.getType())) == 0 && var3.getType() != 746L && var3.getType() != 755L && var3.getType() != 767L) {
               this.aej.fw("不符合镶嵌类型");
            } else if (var1 == 5 >> 2 && var3.getType() != 749L && var3.getType() != 761L) {
               this.aej.fw("不符合镶嵌类型");
            } else if (var1 == --2 && var3.getType() != 749L && var3.getType() != 764L) {
               this.aej.fw("不符合镶嵌类型");
            } else if (var1 == --3 && var3.getType() != 761L && var3.getType() != 764L) {
               this.aej.fw("不符合镶嵌类型");
            } else if (var1 == --5 && var3.getType() != 752L && var3.getType() != 758L) {
               this.aej.fw("不符合镶嵌类型");
            } else {
               var1 = MsgUntil.getGoodLvl(var3.getValue());
               BigDecimal var5 = new BigDecimal(5000000 + var1 * 1000000);
               if (var4.getLoginResult().getGold().longValue() < var5.longValue()) {
                  this.aej.fw("金钱不足");
               } else {
                  Class136[] var10001 = new Class136[3 >> 1];
                  boolean var10003 = true;
                  var10001[5 >> 3] = new Class136(81095L, (long)(var1 <= --4 ? 2 ^ 3 : var1 - --3));
                  List var6;
                  if ((var6 = var4.aa(var10001)) == null) {
                     this.aej.fw("不够" + (var1 <= --4 ? 4 ^ 5 : var1 - --3) + "个宝石精华");
                  } else {
                     ArrayList var10;
                     (var10 = new ArrayList()).add(var2.getRgid());
                     var10.add(var3.getRgid());
                     Iterator var7 = var6.iterator();

                     for(Iterator var10000 = var7; var10000.hasNext(); var10000 = var7) {
                        Class136 var11 = (Class136)var7.next();
                        BigDecimal var8 = new BigDecimal(var11.a);

                        int var9;
                        for(int var14 = var9 = 3 & 4; (long)var14 < var11.b; var14 = var9) {
                           ++var9;
                           var10.add(var8);
                        }
                     }

                     var4.br(var6);
                     var3.setStatus(--1);
                     var4.ac(var3.getRgid());
                     var4.getLoginResult().setGold(var4.getLoginResult().getGold().subtract(var5));
                     SuitOperBean var12 = new SuitOperBean();
                     var12.setType(85 & 62);
                     var12.setGoods(var10);
                     String var13 = Agreement.getSendTextAES("suitoperate", Class695.b().toJson(var12));
                     this.uw().d(var13);
                  }
               }
            }
         }
      }
   }

   public void av(Goodstable var1) {
      Goodstable var2;
      if ((var2 = (Goodstable)this.it.hr()) != null) {
         int var4;
         if ((var4 = GoodType.y(GoodType.ai(var2.getType()), var1.getType()) - (3 & 5)) != -4 >> 2) {
            if (this.aes[var4].ay == (3 & 5)) {
               this.aej.fw("已打造该类型宝石");
            } else {
               int var3;
               for(int var10000 = var3 = 0; var10000 < this.aes.length; var10000 = var3) {
                  if (this.aes[var3].ay != --1) {
                     this.aes[var3].agp(2 & 5, (Goodstable)null);
                  }

                  ++var3;
               }

               this.aes[var4].agp(3 >> 2, var1);
               var3 = MsgUntil.getGoodLvl(var1.getValue());
               this.aer[5 >> 2].setText((var3 <= --4 ? --1 : var3 - --3) + "/" + this.vd().getGoodNum(new BigDecimal(81095)));
               this.rc = new BigDecimal(5000000 + var3 * 1000000);
               Class681.j(this.ac, this.rc.longValue());
            }
         }
      }
   }

   public void ax(Goodstable var1) {
      Goodstable var5;
      BigDecimal var10000;
      Goodstable var10001;
      if ((var5 = (Goodstable)this.it.hr()) != null) {
         var10000 = var5.getRgid();
         var10001 = var1;
      } else {
         var10000 = null;
         var10001 = var1;
      }

      if (Class394.v(var10000, var10001.getRgid())) {
         RoleData var4 = this.vd();
         this.rc = null;
         this.ac.setText((String)null);
         this.aer[3 >> 1].setText((String)null);
         this.it.c(3 >> 2, (Object)null);

         int var3;
         int var13;
         for(var13 = var3 = 3 >> 2; var13 < this.aes.length; var13 = var3) {
            <undefinedtype> var14 = this.aes[var3];
            ++var3;
            var14.agp(2 & 5, (Goodstable)null);
         }

         this.aes[--2].setVisible((boolean)(3 ^ 3));
         this.it.c(2 ^ 3, var1);
         var3 = GoodType.ai(var1.getType());
         int var2 = 3 >> 2;
         int var6 = var3 == 0 ? --3 : 2;

         for(var13 = var2; var13 < var6; var13 = var2) {
            if (var3 == 0) {
               this.aes[var2].ir.setText(var2 == 0 ? "赤炎石" : (var2 == (4 ^ 5) ? "紫烟石" : "孔雀石"));
            } else if (var3 == --1) {
               this.aes[var2].ir.setText(var2 == 0 ? "落星石" : "芙蓉石");
            } else if (var3 == --2) {
               this.aes[var2].ir.setText(var2 == 0 ? "沐阳石" : "芙蓉石");
            } else if (var3 == --3) {
               this.aes[var2].ir.setText(var2 == 0 ? "落星石" : "沐阳石");
            } else if (var3 == --5) {
               this.aes[var2].ir.setText(var2 == 0 ? "琉璃石" : "寒山石");
            }

            ++var2;
         }

         if (var3 == 0) {
            this.aes[5 >> 1].setVisible((boolean)(3 >> 1));
         }

         Goodstable var16;
         long[] var10002;
         boolean var10004;
         if (var3 == 0) {
            var16 = var1;
            var10002 = new long[--3];
            var10004 = true;
            var10002[2 & 5] = 746L;
            var10002[5 >> 2] = 755L;
            var10002[1 ^ 3] = 767L;
            this.aep.ud(var10002);
         } else if (var3 == --1) {
            var16 = var1;
            var10002 = new long[--2];
            var10004 = true;
            var10002[3 >> 2] = 749L;
            var10002[3 & 5] = 761L;
            this.aep.ud(var10002);
         } else if (var3 == --2) {
            var16 = var1;
            var10002 = new long[--2];
            var10004 = true;
            var10002[3 >> 2] = 749L;
            var10002[3 & 5] = 764L;
            this.aep.ud(var10002);
         } else if (var3 == --3) {
            var16 = var1;
            var10002 = new long[--2];
            var10004 = true;
            var10002[2 & 5] = 761L;
            var10002[3 >> 1] = 764L;
            this.aep.ud(var10002);
         } else {
            if (var3 == --5) {
               long[] var15 = new long[5 >> 1];
               boolean var10003 = true;
               var15[3 & 4] = 752L;
               var15[1] = 758L;
               this.aep.ud(var15);
            }

            var16 = var1;
         }

         String var9;
         if ((var9 = GoodType.getExtra(var16.getValue(), "宝石属性")) != null) {
            String[] var10 = var9.split("&");

            for(var13 = var2 = 1; var13 < var10.length; var13 = var2) {
               BigDecimal var7 = new BigDecimal(var10[var2]);
               int var8;
               if ((var5 = var4.getGoodEquip(var7)) != null && (var8 = GoodType.y(var3, var5.getType())) != 0) {
                  this.aes[var8 - 1].agp(1, var5);
               }

               ++var2;
            }

            var2 = 0;
            int var11 = this.fa.getComponentCount();

            for(var13 = var2; var13 < var11; var13 = var2) {
               <undefinedtype> var12;
               if (!(var12 = (<undefinedtype>)this.fa.getComponent(var2)).isVisible()) {
                  return;
               }

               if (var12.dv[0].gl() == var1.getRgid().longValue()) {
                  var12.ax(var1);
                  return;
               }

               ++var2;
            }

         }
      }
   }
}
