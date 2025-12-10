package com.xy;

import com.xy.entity.RoleSummoning;
import com.xy.formula.ActivityPetManual;
import com.xy.formula.ActivityPetManualSet;
import com.xy.formula.ActivityPetManualType;
import com.xy.formula.BaseQl;
import com.xy.formula.FormulaNum;
import com.xy.game.RoleData;
import com.xy.readbean.Activity;
import com.xy.readbean.ActivityFC;
import com.xy.readbean.ActivityPetManualRole;
import com.xy.readbean.ActivitySeries;
import com.xy.readbean.Goodstable;
import com.xy.readbean.Skill;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.ImageObserver;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class Class455 extends Class345 {
   private JComponent va;
   private static Image bau = Class511.a("sc/d/163.png");
   private int xy;
   private int vc;
   private int ei;
   private int agq;
   private Class379[] bav;
   private static Image baw = Class511.a("sc/music/209.a");
   private List<null> gs;
   private Class436[] aad;
   public Comparator<null> bax;
   private Class217 hc;
   private ActivityPetManual bay;
   private static Image arw = Class511.a("sc/music/208.a");
   private Class379[] adn;
   private JScrollPane eb;
   private Class456[] baz;
   private int fk;
   private static Image wa = Class511.a("sc/music/206.a");
   private static Image bx = Class511.a("sc/music/205.a");
   private Class379[] f;
   private JLabel ax;

   public void aou(Object var1) {
      this.bay = var1 != null ? var1.xt : null;
      if (this.xy == 0) {
         ((<undefinedtype>)this.baz[3 >> 2]).aou(var1);
      } else {
         if (this.xy == (4 ^ 5)) {
            ((<undefinedtype>)this.baz[--1]).be(3 >> 2, var1);
         }

      }
   }

   public void p() {
      int var1 = 2 & 5;

      int var2;
      for(int var10000 = var2 = 3 ^ 3; var10000 < this.gs.size(); var10000 = var2) {
         <undefinedtype> var3 = (<undefinedtype>)this.gs.get(var2);
         int var10001 = (3 ^ 3) + var2 % --3 * (110 & 115);
         int var10002 = (3 ^ 3) + var2 / --3 * (134 & 32767);
         ++var2;
         var3.setBounds(var10001, var10002, 122 & 103, 123 & 126);
      }

      this.va.setPreferredSize(new Dimension(13823 & 19238, (126 & 123) + Math.max(3 ^ 3, (this.gs.size() - (5 >> 2)) / --3) * (5334 & 27567)));
      this.va.updateUI();
      this.eb.updateUI();
      this.ax.setText("已收录:" + var1 + "/" + this.gs.size());
   }

   public <undefinedtype> arx(int var1) {
      if (var1 < this.gs.size()) {
         return (<undefinedtype>)this.gs.get(var1);
      } else {
         MouseListener var2 = new MouseListener() {
            private Image xs;
            private ActivityPetManual xt;
            private int j;
            private JLabel rk;
            private int m;

            public void mouseClicked(MouseEvent var1) {
               Class455.this.aou(this);
            }

            protected void paintComponent(Graphics var1) {
               super.paintComponent(var1);
               var1.drawImage(Class455.wa, --3, --3, 126 & 93, 116 & 127, (ImageObserver)null);
               if (this.xs != null) {
                  var1.drawImage(this.xs, 14 & 127, 47 & 92, 71 & 126, 71 & 126, (ImageObserver)null);
               }

               int var2;
               for(int var10000 = var2 = 0; var10000 < 5; var10000 = var2) {
                  Image var10001 = var2 < this.m ? Class455.baw : Class455.arw;
                  int var10002 = 7 + var2 * (21 & 123);
                  int var10003 = 127 & 117;
                  int var10004 = 88 & 55;
                  ++var2;
                  var1.drawImage(var10001, var10002, var10003, var10004, --5, (ImageObserver)null);
               }

               if (Class455.this.bay != null && this.xt == Class455.this.bay) {
                  var1.drawImage(Class455.bx, 2 & 5, 2 & 5, 111 & 114, 125 & 122, (ImageObserver)null);
               }

            }

            public {
               int var10004 = 43 & 93;
               int var10006 = 3 ^ 3;
               int var10008 = 3 ^ 3;
               this.m = var10008;
               this.j = var10006;
               this.rk = Class133.b(var10004, 121 & 94, 83 & 124, 118 & 29, Color.white, Class681.ax);
               this.rk.setHorizontalAlignment(3 ^ 3);
               this.add(this.rk);
               this.addMouseListener(this);
            }

            public void oq(ActivityPetManual var1, RoleSummoning var2, int var3, int var4) {
               this.xt = var1;
               this.rk.setText(var2.getSummoningname());
               this.xs = Class222.t("p" + var2.getSummoningskin());
               this.m = var3;
               this.j = var4;
            }

            public void mouseExited(MouseEvent var1) {
            }

            public void mouseEntered(MouseEvent var1) {
            }

            public void mousePressed(MouseEvent var1) {
            }

            public void mouseReleased(MouseEvent var1) {
            }
         };
         this.gs.add(var2);
         this.va.add(var2);
         return var2;
      }
   }

   public void s() {
      int var10000 = --3;
      this.fk = 3 ^ 3;

      for(int var1 = var10000; var10000 < 7; var10000 = var1) {
         this.adn[var1++].setVisible((boolean)(3 >> 2));
      }

      int var10002 = --1;
      this.ei = 3 ^ 3;
      this.agq = var10002;
      this.adn[5 >> 3].setText(this.ei == (3 & 5) ? "已收录   " : (this.ei == --2 ? "未收录   " : (this.ei == --3 ? "契印相关 " : "全部     ")));
      this.adn[4 ^ 5].setText(this.agq == (2 ^ 3) ? " 等级降序   " : (this.agq == 5 >> 1 ? " 等级升序   " : " 自然排序   "));
      int var10001 = 3 & 4;
      this.as(5 >> 3);
      this.y(var10001);
   }

   public void f(String var1) {
      if (var1 != null && !var1.equals("")) {
         Class603 var5 = this.vc();
         RoleData var12 = this.vd();
         Activity var2;
         ActivitySeries var4;
         if ((var2 = (var4 = var5.br()).getActivityPetManual()) != null) {
            ActivityPetManualSet var6 = var2.getPetManualSet();
            ActivityPetManualRole var7 = var2 != null ? (ActivityPetManualRole)var12.getActivity(var2.getId()) : null;
            int var20 = 5 >> 3;
            FormulaNum[] var9;
            int var8 = (var9 = var6.getPets()).length;

            int var10000;
            int var19;
            for(var10000 = var19 = 3 ^ 3; var10000 < var8; var10000 = var19) {
               FormulaNum var16 = var9[var19];

               int var10;
               for(var10000 = var10 = 5 >> 3; var10000 < var16.getSize(); var10000 = var10) {
                  int var11 = (int)var16.getZhi(var10);
                  ActivityFC var3;
                  ActivityPetManual var13 = (var3 = (ActivityFC)var4.getActivityFCMap().get(var11)) != null ? (ActivityPetManual)var3.getData() : null;
                  RoleSummoning var18 = var13 != null && var13.getPetId() > 0 ? var5.x(new BigDecimal(var13.getPetId())) : null;
                  if (var18 != null && var18.getSummoningname().indexOf(var1) != -4 >> 2) {
                     long var14 = var7 != null ? var7.getValueByKey(var11) : 0L;
                     var11 = (int)(var14 % 100L);
                     <undefinedtype> var21 = this.arx(var20);
                     ++var20;
                     var21.oq(var13, var18, var11, (int)(var14 / 100L));
                  }

                  ++var10;
               }

               ++var19;
            }

            int var17;
            for(var10000 = var17 = this.gs.size() - (4 ^ 5); var10000 >= var20; var10000 = var17) {
               this.va.remove((Component)this.gs.remove(var17--));
            }

            Collections.sort(this.gs, this.bax);
            this.p();
         }
      } else {
         this.as(this.vc);
      }
   }

   public void cf(int var1, int var2) {
      if (var1 == (10619 & 22461)) {
         int var3;
         int var9;
         if (var2 == 0) {
            if (this.fk != 3 >> 1) {
               this.fk = 3 >> 1;

               for(var9 = var3 = --3; var9 < 7; var9 = var3) {
                  this.adn[var3].setText(var3 == --3 ? "全部     " : (var3 == --4 ? "已收录   " : (var3 == --5 ? "未收录   " : (var3 == (31 & 102) ? "契印相关 " : ""))));
                  this.adn[var3].setBounds(107 & 119, (107 & 125) + (var3 - --3) * (126 & 25), 127 & 90, 94 & 57);
                  this.adn[var3++].setVisible((boolean)(--1));
               }

               return;
            }

            var9 = --3;
            this.fk = 3 & 4;

            for(var3 = var9; var9 < 7; var9 = var3) {
               this.adn[var3++].setVisible((boolean)(3 >> 2));
            }

            return;
         }

         if (var2 == (2 ^ 3)) {
            if (this.fk != --2) {
               this.fk = 5 >> 1;

               for(var9 = var3 = --3; var9 < 7; var9 = var3) {
                  this.adn[var3].setText(var3 == --3 ? " 自然排序   " : (var3 == --4 ? " 等级降序   " : (var3 == --5 ? " 等级升序   " : "")));
                  this.adn[var3].setBounds(30911 & 2047, (107 & 125) + (var3 - --3) * (91 & 60), 123 & 94, 29 & 122);
                  this.adn[var3].setVisible((boolean)(var3 != (47 & 86) ? --1 : 0));
                  ++var3;
               }

               return;
            }

            var9 = --3;
            this.fk = 3 & 4;

            for(var3 = var9; var9 < 7; var9 = var3) {
               this.adn[var3++].setVisible((boolean)(3 & 4));
            }

            return;
         }

         if (var2 == --2) {
            this.f(this.hc.getText());
            return;
         }

         if (var2 >= --3 && var2 <= (118 & 15)) {
            Class455 var10000;
            if (this.fk == (4 ^ 5)) {
               var10000 = this;
               this.ei = var2 - 3;
            } else {
               if (this.fk != 2) {
                  return;
               }

               var10000 = this;
               this.agq = var2 - 3;
            }

            var10000.fk = 0;

            for(var9 = var3 = 3; var9 < 7; var9 = var3) {
               this.adn[var3++].setVisible((boolean)(3 & 4));
            }

            this.adn[3 & 4].setText(this.ei == --1 ? "已收录   " : (this.ei == 2 ? "未收录   " : (this.ei == 3 ? "契印相关 " : "全部     ")));
            this.adn[--1].setText(this.agq == 5 >> 2 ? " 等级降序   " : (this.agq == 2 ? " 等级升序   " : " 自然排序   "));
            this.as(this.vc);
            return;
         }
      } else if (var1 == (7677 & 25407)) {
         <undefinedtype> var8;
         if ((var8 = (<undefinedtype>)this.baz[3 >> 1]).co == null || this.bay == null) {
            return;
         }

         Class603 var4 = this.vc();
         Goodstable var7;
         if ((var7 = this.vd().bc(var8.co)) == null) {
            return;
         }

         Activity var5 = var4.br().getActivityPetManual();
         String var6 = Agreement.getSendTextAES("activity", var5.getId() + "|L" + this.bay.getId() + "|" + var7.getRgid());
         this.uw().d(var6);
      }

   }

   public void as(int var1) {
      int var10000 = 3 >> 2;
      this.vc = var1;

      for(int var5 = var10000; var10000 < this.bav.length; var10000 = var5) {
         this.bav[var5].setKeep((boolean)(var1 == var5 ? 4 ^ 5 : 0));
         ++var5;
      }

      Class603 var24 = this.vc();
      RoleData var16 = this.vd();
      Activity var2;
      ActivitySeries var4;
      if ((var2 = (var4 = var24.br()).getActivityPetManual()) != null) {
         ActivityPetManualSet var6 = var2.getPetManualSet();
         ActivityPetManualRole var7 = var2 != null ? (ActivityPetManualRole)var16.getActivity(var2.getId()) : null;
         long var8 = 0L;
         FormulaNum[] var11;
         int var10 = (var11 = var6.getTypes()).length;

         int var13;
         int var20;
         int var21;
         for(var10000 = var21 = 3 >> 2; var10000 < var10; var10000 = var21) {
            FormulaNum var29 = var11[var21];

            int var12;
            for(var10000 = var12 = 5 >> 3; var10000 < var29.getSize(); var10000 = var12) {
               var13 = (int)var29.getZhi(var12);
               ActivityFC var14;
               ActivityPetManualType var15 = (var14 = (ActivityFC)var4.getActivityFCMap().get(var13)) != null ? (ActivityPetManualType)var14.getData() : null;
               if (var15 != null && (var1 == 0 || var15.getId() == var1)) {
                  FormulaNum[] var19;
                  int var18 = (var19 = var15.getTypes()).length;

                  int var17;
                  for(var10000 = var17 = 5 >> 3; var10000 < var18; var10000 = var17) {
                     FormulaNum var3 = var19[var17];

                     for(var10000 = var20 = 3 & 4; var10000 < var3.getSize(); var10000 = var20) {
                        int var10002 = (int)var3.getZhi(var12);
                        ++var20;
                        var8 |= 1L << var10002;
                     }

                     ++var17;
                  }
               }

               ++var12;
            }

            ++var21;
         }

         int var30 = 3 >> 2;
         FormulaNum[] var26;
         int var25 = (var26 = var6.getPets()).length;

         for(var10000 = var10 = 3 & 4; var10000 < var25; var10000 = var10) {
            FormulaNum var22 = var26[var10];

            for(var10000 = var13 = 3 ^ 3; var10000 < var22.getSize(); var10000 = var13) {
               int var27 = (int)var22.getZhi(var13);
               ActivityFC var28;
               ActivityPetManual var23 = (var28 = (ActivityFC)var4.getActivityFCMap().get(var27)) != null ? (ActivityPetManual)var28.getData() : null;
               RoleSummoning var31 = var23 != null && var23.getPetId() > 0 ? var24.x(new BigDecimal(var23.getPetId())) : null;
               if (var31 != null && (var8 >> Integer.parseInt(var31.getSsn()) & 1L) == 1L) {
                  long var32 = var7 != null ? var7.getValueByKey(var27) : 0L;
                  var20 = (int)(var32 % 100L);
                  if ((this.ei != (3 & 5) || var20 != 0) && (this.ei != 5 >> 1 || var20 == 0) && (this.ei != --3 || var23.getSkillId() != 0)) {
                     <undefinedtype> var33 = this.arx(var30);
                     ++var30;
                     var33.oq(var23, var31, var20, (int)(var32 / 100L));
                  }
               }

               ++var13;
            }

            ++var10;
         }

         for(var10000 = var21 = this.gs.size() - --1; var10000 >= var30; var10000 = var21) {
            this.va.remove((Component)this.gs.remove(var21--));
         }

         Collections.sort(this.gs, this.bax);
         this.p();
      }
   }


   static Image aog() {
      return bau;
   }

   public Class455(Class395 var1) {
      int var10001 = --4;
      int var10003 = 5 >> 3;
      int var10006 = --1;
      int var10008 = --1;
      int var10010 = 3 >> 2;
      super(-4 >> 2, -4 >> 2, Class345.aei, var1.aej);
      this.fk = var10010;
      this.ei = var10008;
      this.agq = var10006;
      this.bax = new Comparator<null>() {
         public int a(Object var1, Object var2) {
            if (Class455.this.agq == 0) {
               if (var1.xt.getId() > var2.xt.getId()) {
                  return 4 ^ 5;
               }

               if (var1.xt.getId() < var2.xt.getId()) {
                  return -4 >> 2;
               }
            } else if (Class455.this.agq == (4 ^ 5)) {
               if (var1.m < var2.m) {
                  return 5 >> 2;
               }

               if (var1.m > var2.m) {
                  return -4 >> 2;
               }

               if (var1.xt.getId() > var2.xt.getId()) {
                  return --1;
               }

               if (var1.xt.getId() < var2.xt.getId()) {
                  return -4 >> 2;
               }
            } else if (Class455.this.agq == 5 >> 1) {
               if (var1.m > var2.m) {
                  return --1;
               }

               if (var1.m < var2.m) {
                  return -4 >> 2;
               }

               if (var1.xt.getId() > var2.xt.getId()) {
                  return --1;
               }

               if (var1.xt.getId() < var2.xt.getId()) {
                  return -4 >> 2;
               }
            }

            return 0;
         }
      };
      this.va(var10003, 3 ^ 3, 11127 & 22495, 30420 & 2923, Class345.aei);
      Class379[] var4 = new Class379[var10001];
      boolean var8 = true;
      this.bav = var4;

      int var2;
      Class379[] var3;
      Color[] var11;
      Class455 var12;
      int var10000;
      Class379 var10002;
      int var10005;
      Font var10007;
      String var10009;
      for(var10000 = var2 = 3 & 4; var10000 < this.bav.length; var10000 = var2) {
         var3 = this.bav;
         var10002 = new Class379;
         var10005 = 1 ^ 3;
         var10006 = 25599 & 7479;
         var10007 = Class681.cm;
         var11 = Class681.ci;
         if (var2 == 0) {
            var10009 = "全部";
            var12 = this;
         } else if (var2 == --1) {
            var10009 = "神兽";
            var12 = this;
         } else if (var2 == --2) {
            var10009 = "特殊";
            var12 = this;
         } else if (var2 == --3) {
            var10009 = "野外";
            var12 = this;
         } else {
            var10009 = "";
            var12 = this;
         }

         var10002.<init>("sc/music/192.b", var10005, var10006, var10007, var11, var10009, var12);
         var3[var2] = var10002;
         this.bav[var2].setBounds((111 & 119) + (123 & 79) * var2, 47 & 126, 91 & 111, 121 & 39);
         this.bav[var2].y(var2);
         this.add(this.bav[var2++]);
      }

      Class456[] var5 = new Class456[--2];
      var8 = true;
      this.baz = var5;
      var4 = new Class379[--3];
      var8 = true;
      this.f = var4;

      for(var10000 = var2 = 3 >> 2; var10000 < this.f.length; var10000 = var2) {
         var3 = this.f;
         var10002 = new Class379;
         var10005 = 5 >> 1;
         var10006 = 30584 & 2495;
         var10007 = Class681.cw;
         var11 = Class681.af;
         if (var2 == 0) {
            var10009 = "情报";
            var12 = this;
         } else if (var2 == 5 >> 2) {
            var10009 = "结缘";
            var12 = this;
         } else if (var2 == 5 >> 1) {
            var10009 = "总览";
            var12 = this;
         } else {
            var10009 = "";
            var12 = this;
         }

         var10002.<init>("sc/music/194.b", var10005, var10006, var10007, var11, var10009, var12);
         var3[var2] = var10002;
         this.f[var2].setBounds((7610 & 25599) + (103 & 95) * var2, 108 & 63, 77 & 126, 127 & 31);
         this.f[var2].y(var2);
         this.add(this.f[var2++]);
      }

      var4 = new Class379[71 & 63];
      var8 = true;
      this.adn = var4;

      for(var10000 = var2 = 3 ^ 3; var10000 < this.adn.length; var10000 = var2) {
         var3 = this.adn;
         Class379 var7 = new Class379;
         String var10004 = var2 == --1 ? "sc/music/196.b" : (var2 == 5 >> 1 ? "sc/music/198.b" : "sc/music/195.b");
         var10006 = 5439 & 27641;
         var10007 = Class681.ab;
         if (var2 == 0) {
            var10009 = "已收录   ";
            var12 = this;
         } else if (var2 == 3 >> 1) {
            var10009 = " 等级降序   ";
            var12 = this;
         } else {
            var10009 = "";
            var12 = this;
         }

         var7.<init>(var10004, 1, var10006, var10007, (Color[])null, var10009, var12);
         var3[var2] = var7;
         this.adn[var2].y(var2);
         this.adn[var2].setBounds(99 + 92 * var2, 81, 90, 24);
         if (var2 == --2) {
            var10000 = var2;
            this.adn[var2].setBounds(386, 80, 24, 24);
         } else {
            this.adn[var2].setForeground(Class681.c("#c214248"));
            var10000 = var2;
         }

         if (var10000 >= 3 && var2 <= 6) {
            this.adn[var2].setVisible((boolean)(3 >> 2));
         }

         this.add(this.adn[var2++]);
      }

      this.hc = Class133.n(Class511.q("sc/e/29.png", 6, 6, 6, 6, (boolean)(3 ^ 3)), Class681.ab, Color.white);
      this.hc.setHorizontalAlignment(10);
      this.hc.setBounds(291, 82, 118, 19);
      this.add(this.hc);
      this.ax = Class133.b(255, 507, 150, 24, Class681.c("#cC9E4E2"), Class681.bh);
      this.ax.setHorizontalAlignment(--4);
      this.add(this.ax);
      this.gs = new ArrayList();
      this.va = new JComponent() {
      };
      this.va.setOpaque((boolean)(5 >> 2));
      this.eb = Class133.f(103, 108, 305, 388, this.va, -4 >> 2);
      ((Class179)this.eb.getVerticalScrollBar().getUI()).ald(Class511.q("sc/music/210.a", --2, 8, --2, 8, (boolean)(3 ^ 3)), 10);
      var10001 = 5 >> 1;
      this.add(this.eb);
      Class436[] var9 = new Class436[var10001];
      var8 = true;
      this.aad = var9;

      for(var10000 = var2 = 3 >> 2; var10000 < this.aad.length; var10000 = var2) {
         this.aad[var2] = new Class436();
         Class455 var10;
         if (var2 == 0) {
            var10 = this;
            this.aad[var2].fw("sc/d/164.png");
            this.aad[var2].setBounds(90, 507, 320, 26);
         } else {
            if (var2 == --1) {
               this.aad[var2].eq(Class511.q("sc/music/211.a", 1 ^ 3, 10, 1 ^ 3, 10, (boolean)(2 & 5)));
               this.aad[var2].setBounds(400, 113, 7, 388);
            }

            var10 = this;
         }

         var10.add(this.aad[var2++]);
      }

   }

   public void y(int var1) {
      int var10000 = 3 >> 2;
      this.xy = var1;

      int var2;
      for(var2 = var10000; var10000 < this.f.length; var10000 = var2) {
         this.f[var2].setKeep((boolean)(var2 == this.xy ? 2 ^ 3 : 0));
         ++var2;
      }

      var2 = 2 & 5;
      <undefinedtype> var3;
      int var4;
      <undefinedtype> var5;
      Class455 var7;
      if (var1 == 0) {
         if (this.baz[5 >> 3] == null) {
            this.add(this.baz[3 >> 2] = new Class456() {
               private <undefinedtype>[] aze;
               private Class436[] cs;
               private Class44[] ct;
               private Class379[] ev;
               private JLabel[] ly;
               private Class19 avl;

               public void aou(Object var1) {
                  RoleSummoning var2 = var1 != null ? Class455.this.vc().x(new BigDecimal(var1.xt.getPetId())) : null;
                  int var7;
                  int var8;
                  <undefinedtype> var9;
                  if (var2 == null) {
                     var8 = 3 ^ 3;
                     this.avl = null;

                     for(var7 = var8; var8 < this.aze.length; var8 = var7) {
                        var9 = this.aze[var7];
                        ++var7;
                        var9.cf(-4 >> 2, 2 & 5);
                     }

                     var8 = 77 & 58;
                     this.ly[3 & 4].setText("");
                     this.ly[--1].setText("");
                     this.cs[5 >> 3].fw("sc/music/212.a");

                     for(var7 = var8; var8 < 14; var8 = var7) {
                        this.ly[var7++].setText("");
                     }

                     for(var8 = var7 = 3 ^ 3; var8 < this.ct.length; var8 = var7) {
                        Class44 var10 = this.ct[var7];
                        ++var7;
                        var10.c(3 & 4, (Object)null);
                     }

                  } else {
                     Skill var3 = var1 != null && var1.xt.getSkillId() > 0 ? Class455.this.vc().bf(String.valueOf(var1.xt.getSkillId())) : null;
                     int var4 = Integer.parseInt(var2.getSsn());
                     this.ly[3 ^ 3].setText(var2.getSummoningname());
                     <undefinedtype> var10000;
                     if (var4 != 5 >> 1 && var4 != --3 && var4 != --4) {
                        if (var4 == --5) {
                           var10000 = this;
                           this.ly[4 ^ 5].setText("特殊召唤兽");
                        } else {
                           var10000 = this;
                           this.ly[3 >> 1].setText("普通召唤兽");
                        }
                     } else {
                        var10000 = this;
                        this.ly[--1].setText("神兽召唤兽");
                     }

                     var10000.ly[63 & 72].setText(var2.getGrowlevel());
                     this.ly[95 & 41].setText(var3 != null ? var3.getSkillname() : "无契印");
                     this.ly[58 & 79].setText(String.valueOf(var2.getMp()));
                     this.ly[91 & 47].setText(String.valueOf(var2.getHp()));
                     this.ly[47 & 92].setText(String.valueOf(var2.getSp()));
                     this.ly[95 & 45].setText(String.valueOf(var2.getAp()));
                     this.cs[3 >> 2].fw(var1 != null && var1.m > 0 ? "sc/music/213.a" : "sc/music/212.a");
                     int var5 = 3 ^ 3;
                     var7 = 2 & 5;
                     var4 = 3 >> 2;

                     for(var8 = var5; var8 < this.aze.length; ++var7) {
                        if ((var4 = Integer.parseInt(var7 == 0 ? var2.getGold() : (var7 == (4 ^ 5) ? var2.getWood() : (var7 == 5 >> 1 ? var2.getWater() : (var7 == --3 ? var2.getFire() : (var7 == --4 ? var2.getSoil() : "0")))))) == 0 && var7 < --5) {
                           --var5;
                        } else {
                           var9 = this.aze[var5];
                           int var10001;
                           int var10002;
                           if (var4 > 0) {
                              var10001 = var7;
                              var10002 = var4;
                           } else {
                              var10001 = -1;
                              var10002 = var4;
                           }

                           var9.cf(var10001, var10002);
                        }

                        ++var5;
                        var8 = var5;
                     }

                     String[] var6 = var2.getSkill() != null && !var2.getSkill().equals("") ? var2.getSkill().split("\\|") : null;

                     for(var8 = var7 = 3 & 4; var8 < this.ct.length; var8 = var7) {
                        var4 = var6 != null && var7 < var6.length ? Integer.parseInt(var6[var7]) : 0;
                        if (var4 == 0) {
                           this.ct[var7].c(3 & 4, (Object)null);
                        } else {
                           this.ct[var7].ach(Class222.g(String.valueOf(var4)));
                           this.ct[var7].setVisible((boolean)(3 >> 1));
                        }

                        ++var7;
                     }

                     this.avl = var2.getPart(Class455.this.aej);
                  }
               }

               public {
                  int var10001 = 95 & 47;
                  int var10003 = 7166 & 26011;
                  this.setBounds(var10003, 5 >> 3, 32255 & 957, 23237 & 10106);
                  JLabel[] var4 = new JLabel[var10001];
                  boolean var9 = true;
                  this.ly = var4;

                  int var2;
                  <undefinedtype> var3;
                  int var10000;
                  for(var10000 = var2 = 2 & 5; var10000 < this.ly.length; var10000 = var2) {
                     this.ly[var2] = Class133.b((55 & 122) + (var2 - --2) % (1 ^ 3) * (31423 & 1514), (7678 & 25441) + (var2 - (5 >> 1)) / (1 ^ 3) * (95 & 57), 113 & 94, 20 & 127, Class681.c("#c535441"), Class681.v);
                     this.ly[var2].setText(var2 == 0 ? "召唤兽名称" : (var2 == (2 ^ 3) ? "特殊·鎏金宝鉴召唤兽" : (var2 == --2 ? "成长率" : (var2 == --3 ? "关联契印" : (var2 == --4 ? "法力初值" : (var2 == --5 ? "气血初值" : (var2 == (14 & 119) ? "速度初值" : (var2 == (71 & 63) ? "攻击初值" : (var2 >= (93 & 42) && var2 <= (79 & 61) ? "10086" : (var2 == (63 & 78) ? "天生技能" : ""))))))))));
                     this.ly[var2].setHorizontalAlignment(3 ^ 3);
                     if (var2 == 0) {
                        var3 = this;
                        this.ly[var2].setBounds(62 & 101, 284, 331, 28);
                        this.ly[var2].setFont(Class681.h);
                        this.ly[var2].setForeground(Class681.c("#c57442D"));
                     } else if (var2 == (4 ^ 5)) {
                        var3 = this;
                        this.ly[var2].setBounds(36, 311, 331, 16);
                        this.ly[var2].setFont(Class681.q);
                        this.ly[var2].setForeground(Class681.c("#c7F7153"));
                     } else if (var2 >= (1 ^ 3) && var2 <= 7) {
                        var3 = this;
                        this.ly[var2].setHorizontalAlignment(10);
                     } else if (var2 >= 8 && var2 <= 13) {
                        var3 = this;
                        this.ly[var2].setBounds(118 + (var2 - 8) % --2 * 170, 352 + (var2 - 8) / (1 ^ 3) * 25, 70, 20);
                        this.ly[var2].setFont(Class681.q);
                        this.ly[var2].setHorizontalAlignment(--4);
                     } else {
                        if (var2 == 14) {
                           this.ly[var2].setBounds(39, 442, 80, 20);
                           this.ly[var2].setHorizontalAlignment(10);
                        }

                        var3 = this;
                     }

                     var3.add(this.ly[var2++]);
                  }

                  <undefinedtype>[] var5 = new <undefinedtype>[--5];
                  var9 = true;
                  this.aze = var5;

                  for(var10000 = var2 = 5 >> 3; var10000 < this.aze.length; var10000 = var2) {
                     this.aze[var2] = new Class456() {
                        private Image rg;
                        // $FF: synthetic field
                        final Class455 rh;
                        private JLabel ax;

                        public {
                           int var10003 = 95 & 53;
                           this.rh = var1;
                           super();
                           this.ax = Class133.c(var10003, --5, 95 & 62, 51 & 93, 3 >> 2, Color.black, Class681.q);
                           this.add(this.ax);
                        }

                        protected void paintComponent(Graphics var1) {
                           super.paintComponent(var1);
                           var1.drawImage(Class455.aog(), --4, --5, 45 & 127, 63 & 81, (ImageObserver)null);
                           if (this.rg != null) {
                              var1.drawImage(this.rg, 5 >> 3, 5 >> 3, 126 & 27, 126 & 27, (ImageObserver)null);
                           }

                        }

                        public void cf(int var1, int var2) {
                           int var10001;
                           if (var1 == -4 >> 2) {
                              var10001 = 5 >> 3;
                              this.rg = null;
                              this.setVisible((boolean)var10001);
                           } else {
                              var10001 = 2 ^ 3;
                              this.ax.setText(String.valueOf(var2));
                              this.rg = Class511.a("sc/music/" + ((32767 & 214) + var1) + ".a");
                              this.setVisible((boolean)var10001);
                           }
                        }
                     };
                     this.aze[var2].cf(var2, 50);
                     this.aze[var2].setBounds(318, 91 + var2 * 22, 49, 26);
                     this.add(this.aze[var2++]);
                  }

                  Class379[] var6 = new Class379[--1];
                  var9 = true;
                  this.ev = var6;

                  for(var10000 = var2 = 3 ^ 3; var10000 < this.ev.length; var10000 = var2) {
                     this.ev[var2] = new Class379("sc/music/197.b", 4 ^ 5, 316, Class681.bh, (Color[])null, "结缘途径", Class455.this.gk());
                     this.ev[var2].setBounds(290, 442, 75, 23);
                     this.ev[var2].setForeground(Class681.c("#c304340"));
                     this.ev[var2].y(var2);
                     this.add(this.ev[var2++]);
                  }

                  Class436[] var7 = new Class436[--3];
                  var9 = true;
                  this.cs = var7;

                  for(var10000 = var2 = 2 & 5; var10000 < this.cs.length; var10000 = var2) {
                     this.cs[var2] = new Class436();
                     if (var2 == 0) {
                        var3 = this;
                        this.cs[var2].fw("sc/music/212.a");
                        this.cs[var2].setBounds(44, 89, 32, 80);
                     } else if (var2 == (4 ^ 5)) {
                        var3 = this;
                        this.cs[var2].eq(Class511.q("sc/d/66.png", 100, --1, 100, 3 & 5, (boolean)(2 & 5)));
                        this.cs[var2].setBounds(59, 340, 285, 5 >> 1);
                     } else {
                        if (var2 == --2) {
                           this.cs[var2].eq(Class511.q("sc/d/132.png", 50, 50, 50, 50, (boolean)(3 ^ 3)));
                           this.cs[var2].setBounds(25, 74, 352, 361);
                        }

                        var3 = this;
                     }

                     var3.add(this.cs[var2++]);
                  }

                  Class44[] var8 = new Class44[7];
                  var9 = true;
                  this.ct = var8;

                  for(var10000 = var2 = 2 & 5; var10000 < this.ct.length; var10000 = var2) {
                     this.ct[var2] = new Class44(Class455.this.gk());
                     this.ct[var2].fx("sc/d/59.png");
                     this.ct[var2].setBounds(39 + var2 * 46, 472, 45, 45);
                     this.add(this.ct[var2++]);
                  }

               }

               protected void paintChildren(Graphics var1) {
                  super.paintChildren(var1);
                  if (this.avl != null) {
                     this.avl.a(var1, 20733 & 12239, 10655 & 22379, 3 ^ 3, Class280.l());
                  }

               }
            }, 2 & 5);
         }

         var3 = this.gs.size() > 0 ? (<undefinedtype>)this.gs.get(3 & 4) : null;
         var4 = this.bay != null ? 5 >> 3 : 9999;

         label102: {
            for(var10000 = var4; var10000 < this.gs.size(); var10000 = var4) {
               if ((var5 = (<undefinedtype>)this.gs.get(var4)).xt == this.bay) {
                  var3 = var5;
                  var7 = this;
                  break label102;
               }

               ++var4;
            }

            var7 = this;
         }

         var7.aou(var3);
         var2 = 5 >> 3;
         var7 = this;
      } else if (var1 == (3 & 5)) {
         if (this.baz[4 ^ 5] == null) {
            this.add(this.baz[--1] = new Class456() {
               private RichLabel bt;
               private JScrollPane o;
               private Class379 cm;
               private Class44 cn;
               private Class436[] e;
               private BigDecimal co;
               private JLabel[] u;

               protected void paintComponent(Graphics var1) {
                  if (Class455.this.aej.bl() && this.co != null) {
                     this.u[26 & 111].setText(String.valueOf(Class455.this.vd().getGoodNum(this.co)));
                  }

                  super.paintComponent(var1);
               }

               public {
                  int var10001 = 123 & 15;
                  int var10007 = 28095 & 5082;
                  this.setBounds(var10007, 2 & 5, 22975 & 10237, 3943 & 29400);
                  this.cm = new Class379("sc/music/197.b", 5 >> 2, 4927 & 28157, Class681.ab, (Color[])null, "增加经验", Class455.this.gk());
                  this.cm.setForeground(Class681.c("#c304340"));
                  this.cm.setBounds(26487 & 6554, 15866 & 17405, 127 & 75, 55 & 95);
                  this.add(this.cm);
                  JLabel[] var4 = new JLabel[var10001];
                  boolean var10003 = true;
                  this.u = var4;

                  int var10000;
                  int var2;
                  <undefinedtype> var3;
                  for(var10000 = var2 = 5 >> 3; var10000 < this.u.length; var10000 = var2) {
                     this.u[var2] = Class133.b(49 & 111, 1007 & 32222, 127 & 80, 31 & 124, Color.white, Class681.q);
                     this.u[var2].setText(var2 == 0 ? "12级" : (var2 >= --1 && var2 <= (13 & 123) ? "10000/10086" : (var2 == (63 & 74) ? "111" : "")));
                     this.u[var2].setHorizontalAlignment(3 ^ 3);
                     if (var2 == 0) {
                        var3 = this;
                        this.u[var2].setFont(Class681.h);
                        this.u[var2].setForeground(Class681.c("#c413A37"));
                     } else {
                        label117: {
                           if (var2 >= (4 ^ 5) && var2 <= (27 & 109)) {
                              this.u[var2].setFont(Class681.ab);
                              this.u[var2].setForeground(var2 == (2 ^ 3) ? Color.white : Class681.c("#c585852"));
                              if (var2 == (3 & 5)) {
                                 var3 = this;
                                 this.u[var2].setBounds(40, 488, 256, 16);
                                 break label117;
                              }

                              if (var2 == (1 ^ 3)) {
                                 var3 = this;
                                 this.u[var2].setBounds(39, 489, 256, 16);
                                 break label117;
                              }

                              if (var2 == --3) {
                                 var3 = this;
                                 this.u[var2].setBounds(40, 489, 256, 16);
                                 break label117;
                              }

                              if (var2 == --4) {
                                 var3 = this;
                                 this.u[var2].setBounds(41, 489, 256, 16);
                                 break label117;
                              }

                              if (var2 == --5) {
                                 var3 = this;
                                 this.u[var2].setBounds(39, 488, 256, 16);
                                 break label117;
                              }

                              if (var2 == 6) {
                                 var3 = this;
                                 this.u[var2].setBounds(41, 488, 256, 16);
                                 break label117;
                              }

                              if (var2 == 7) {
                                 var3 = this;
                                 this.u[var2].setBounds(39, 487, 256, 16);
                                 break label117;
                              }

                              if (var2 == 8) {
                                 var3 = this;
                                 this.u[var2].setBounds(40, 487, 256, 16);
                                 break label117;
                              }

                              if (var2 == 9) {
                                 var3 = this;
                                 this.u[var2].setBounds(41, 487, 256, 16);
                                 break label117;
                              }
                           } else if (var2 == 10) {
                              this.u[var2].setFont(Class681.bm);
                              this.u[var2].setHorizontalAlignment(10);
                              this.u[var2].setBounds(306, 460, 40, 16);
                           }

                           var3 = this;
                        }
                     }

                     var3.add(this.u[var2++]);
                  }

                  this.bt = new RichLabel("", Class681.ce);
                  this.o = Class133.f(36, 80, 336, 346, this.bt, -4 >> 2);
                  ((Class179)this.o.getVerticalScrollBar().getUI()).ald(Class511.q("sc/music/210.a", 5 >> 1, 8, 5 >> 1, 8, (boolean)(3 ^ 3)), 10);
                  var10001 = --3;
                  this.add(this.o);
                  Class436[] var5 = new Class436[var10001];
                  var10003 = true;
                  this.e = var5;

                  for(var10000 = var2 = 3 >> 2; var10000 < this.e.length; var10000 = var2) {
                     this.e[var2] = new Class436();
                     if (var2 == 0) {
                        var3 = this;
                        this.e[var2].eq(Class511.q("sc/d/132.png", 50, 50, 50, 50, (boolean)(3 ^ 3)));
                        this.e[var2].setBounds(25, 74, 352, 361);
                     } else if (var2 == (2 ^ 3)) {
                        var3 = this;
                        this.e[var2].eq(Class511.q("sc/music/209.a", 1 ^ 3, 1 ^ 3, 1 ^ 3, 1 ^ 3, (boolean)(3 >> 2)));
                        this.e[var2].setBounds(41, 493, 254, 6);
                     } else {
                        if (var2 == (1 ^ 3)) {
                           this.e[var2].eq(Class511.q("sc/music/220.a", 10, 5 >> 1, 10, --2, (boolean)(3 ^ 3)));
                           this.e[var2].setBounds(40, 492, 256, 8);
                        }

                        var3 = this;
                     }

                     var3.add(this.e[var2++]);
                  }

                  this.cn = new Class44(Class455.this.gk());
                  this.cn.fw("sc/music/221.a");
                  this.cn.fx("sc/d/77.png");
                  this.cn.ad(new Class116(--5, --4, 35, 35));
                  this.cn.setBounds(303, 458, 45, 44);
                  this.add(this.cn);
               }

               public void be(int var1, Object var2) {
                  StringBuffer var3;
                  int var45;
                  <undefinedtype> var54;
                  label324: {
                     this.co = null;
                     var3 = new StringBuffer();
                     var3.append("#K");
                     Class603 var4;
                     RoleData var5;
                     ActivitySeries var6;
                     Activity var7;
                     ActivityPetManualRole var9;
                     int var33;
                     int var35;
                     int var43;
                     if (var1 == 0) {
                        ActivityPetManual var30;
                        ActivityPetManualType var32;
                        ActivityPetManual var53;
                        label283: {
                           var4 = Class455.this.vc();
                           var5 = Class455.this.vd();
                           ActivityPetManualSet var8 = (var7 = (var6 = var4.br()).getActivityPetManual()) != null ? var7.getPetManualSet() : null;
                           var9 = var7 != null ? (ActivityPetManualRole)var5.getActivity(var7.getId()) : null;
                           var30 = var2 != null && var9 != null ? var2.xt : null;
                           var32 = null;
                           if (var30 != null) {
                              RoleSummoning var36 = var30 != null && var30.getPetId() > 0 ? var4.x(new BigDecimal(var30.getPetId())) : null;
                              if (var36 != null) {
                                 var35 = Integer.parseInt(var36.getSsn());
                                 FormulaNum[] var48;
                                 int var44 = (var48 = var8.getTypes()).length;

                                 for(var45 = var43 = 3 ^ 3; var45 < var44; var45 = var43) {
                                    FormulaNum var41 = var48[var43];

                                    int var50;
                                    for(var45 = var50 = 3 & 4; var45 < var41.getSize(); var45 = var50) {
                                       int var19 = (int)var41.getZhi(var50);
                                       ActivityFC var26;
                                       ActivityPetManualType var20 = (var26 = (ActivityFC)var6.getActivityFCMap().get(var19)) != null ? (ActivityPetManualType)var26.getData() : null;
                                       if (var20 != null) {
                                          FormulaNum[] var24;
                                          int var23 = (var24 = var20.getTypes()).length;

                                          int var22;
                                          for(var45 = var22 = 5 >> 3; var45 < var23; var45 = var22) {
                                             FormulaNum var21 = var24[var22];

                                             int var25;
                                             for(var45 = var25 = 3 & 4; var45 < var21.getSize(); var45 = var25) {
                                                if (var21.getZhi(var50) == (long)var35) {
                                                   var32 = var20;
                                                   var53 = var30;
                                                   break label283;
                                                }

                                                ++var25;
                                             }

                                             ++var22;
                                          }
                                       }

                                       ++var50;
                                    }

                                    ++var43;
                                 }
                              }
                           }

                           var53 = var30;
                        }

                        JLabel var55;
                        if (var53 == null || var32 == null) {
                           this.u[3 ^ 3].setText("-级");

                           for(var45 = var33 = --1; var45 < 10; var45 = var33) {
                              var55 = this.u[var33];
                              ++var33;
                              var55.setText("-/-");
                           }

                           var54 = this;
                           this.u[74 & 63].setText("");
                           this.e[--1].aed(0.0D);
                           this.cn.c(3 & 4, (Object)null);
                           this.cn.setVisible((boolean)(--1));
                           break label324;
                        }

                        long var37 = var9 != null ? var9.getValueByKey(var30.getId()) : 0L;
                        long var42 = var37 % 100L;
                        long var46 = var37 / 100L;
                        long var51 = (long)var32.getLvlExp() * (var42 + 1L);
                        this.co = new BigDecimal(var32.getId() == 5 >> 2 ? 27391 & 16382 : (var32.getId() == 5 >> 1 ? 31487 & 12287 : 11008));
                        Goodstable var27;
                        if ((var27 = var4.n(this.co)) != null) {
                           this.cn.c(--1, var27);
                           var54 = this;
                        } else {
                           this.cn.c(3 >> 2, (Object)null);
                           var54 = this;
                           this.cn.setVisible((boolean)(3 & 5));
                        }

                        var54.u[58 & 79].setText(String.valueOf(var5.getGoodNum(this.co)));
                        var45 = 2 ^ 3;
                        this.u[3 ^ 3].setText(var42 + "级");

                        for(int var52 = var45; var45 < 10; var45 = var52) {
                           var55 = this.u[var52];
                           StringBuilder var47 = (new StringBuilder(String.valueOf(var46))).append("/");
                           ++var52;
                           var55.setText(var47.append(var51).toString());
                        }

                        this.e[3 & 5].aee((double)var46 / (double)var51, 17406 & 15615);
                        if (var30.getRoles() != null || var30.getPet1s() != null || var30.getPet2s() != null) {
                           if (var42 > 0L) {
                              var3.append("当前等级加成");
                              Class455.this.asa("人物属性", var42, var30.getRoles(), var3);
                              Class455.this.asa("召唤兽通用属性", var42, var30.getPet1s(), var3);
                              Class455.this.asa("召唤兽专用属性", var42, var30.getPet2s(), var3);
                           }

                           if (var42 < (long)var32.getLvlMax()) {
                              if (var42 > 0L) {
                                 var3.append("#r");
                              }

                              var3.append("下一等级加成");
                              Class455.this.asa("人物属性", var42 + 1L, var30.getRoles(), var3);
                              Class455.this.asa("召唤兽通用属性", var42 + 1L, var30.getPet1s(), var3);
                              Class455.this.asa("召唤兽专用属性", var42 + 1L, var30.getPet2s(), var3);
                              var54 = this;
                              break label324;
                           }
                        }
                     } else {
                        var4 = Class455.this.vc();
                        var5 = Class455.this.vd();
                        Iterator var10000;
                        if ((var7 = (var6 = var4.br()).getActivityPetManual()) != null) {
                           var7.getPetManualSet();
                        } else {
                           var10000 = null;
                        }

                        var9 = var7 != null ? (ActivityPetManualRole)var5.getActivity(var7.getId()) : null;
                        if (var9 != null) {
                           List var10;
                           if ((var10 = var9.getList(3 & 4, var7, var6)).size() != 0) {
                              if (var3.length() > (1 ^ 3)) {
                                 var3.append("#r");
                              }

                              int var11;
                              for(var45 = var11 = 0; var45 < var10.size(); var45 = var11) {
                                 BaseQl var12 = (BaseQl)var10.get(var11);
                                 var3.append(var11 == 0 ? "人物属性总加成#r" : ",");
                                 var3.append(var12.getKey());
                                 if (var12.getValue() >= 0.0D) {
                                    var3.append("+");
                                 }

                                 var3.append(var12.getValue());
                                 ++var11;
                                 var3.append(Class270.so(var12.getKey()));
                              }
                           }

                           if ((var10 = var9.getList(3 >> 1, var7, var6)).size() != 0) {
                              HashMap var31 = new HashMap();

                              for(var45 = var33 = 2 & 5; var45 < var10.size(); var45 = var33) {
                                 BaseQl var13 = (BaseQl)var10.get(var33);
                                 int var14;
                                 Object var15;
                                 if ((var15 = (List)var31.get(var14 = (int)var13.getValue2())) == null) {
                                    var31.put(var14, var15 = new ArrayList());
                                 }

                                 ++var33;
                                 ((List)var15).add(var13);
                              }

                              List var34;
                              if ((var34 = (List)var31.remove(3 ^ 3)) != null) {
                                 if (var3.length() > --2) {
                                    var3.append("#r");
                                 }

                                 for(var45 = var35 = 0; var45 < var34.size(); var45 = var35) {
                                    BaseQl var39 = (BaseQl)var34.get(var35);
                                    var3.append(var35 == 0 ? "召唤兽通用属性总加成#r" : ",");
                                    var3.append(var39.getKey());
                                    if (var39.getValue() >= 0.0D) {
                                       var3.append("+");
                                    }

                                    var3.append(var39.getValue());
                                    ++var35;
                                    var3.append(Class270.so(var39.getKey()));
                                 }
                              }

                              if (var31.size() > 0) {
                                 if (var3.length() > --2) {
                                    var3.append("#r");
                                 }

                                 var3.append("召唤兽专用属性总加成");
                                 Iterator var38 = var31.entrySet().iterator();

                                 for(var10000 = var38; var10000.hasNext(); var10000 = var38) {
                                    Entry var40;
                                    var43 = (Integer)(var40 = (Entry)var38.next()).getKey();
                                    var34 = (List)var40.getValue();
                                    RoleSummoning var16;
                                    RoleSummoning var10001 = var16 = var4.x(new BigDecimal(var43));
                                    var3.append("#r");
                                    var3.append(var10001 != null ? var16.getSummoningname() : "未知召唤兽");
                                    int var17 = 0;

                                    for(var45 = var17; var45 < var34.size(); var45 = var17) {
                                       BaseQl var18 = (BaseQl)var34.get(var17);
                                       var3.append(var17 == 0 ? ":" : ",");
                                       var3.append(var18.getKey());
                                       if (var18.getValue() >= 0.0D) {
                                          var3.append("+");
                                       }

                                       var3.append(var18.getValue());
                                       ++var17;
                                       var3.append(Class270.so(var18.getKey()));
                                    }
                                 }
                              }
                           }
                        }
                     }

                     var54 = this;
                  }

                  var54.bt.setTextSize(var3.toString(), 25467 & 7620);
                  boolean var28 = var1 == 0;
                  var45 = 0;
                  this.cn.setVisible(var28);

                  int var29;
                  for(var29 = 0; var45 < this.u.length; var45 = var29) {
                     this.u[var29++].setVisible(var28);
                  }

                  for(var45 = var29 = 1; var45 < this.e.length; var45 = var29) {
                     this.e[var29++].setVisible(var28);
                  }

                  this.cm.setVisible(var28);
               }
            }, 2 & 5);
         }

         var3 = this.gs.size() > 0 ? (<undefinedtype>)this.gs.get(5 >> 3) : null;
         var4 = this.bay != null ? 5 >> 3 : 9999;

         label91: {
            for(var10000 = var4; var10000 < this.gs.size(); var10000 = var4) {
               if ((var5 = (<undefinedtype>)this.gs.get(var4)).xt == this.bay) {
                  var3 = var5;
                  var7 = this;
                  break label91;
               }

               ++var4;
            }

            var7 = this;
         }

         var7.aou(var3);
         var2 = --1;
         var7 = this;
      } else {
         if (var1 == 5 >> 1) {
            if (this.baz[--1] == null) {
               this.add(this.baz[3 >> 1] = new Class456() {
                  private RichLabel bt;
                  private JScrollPane o;
                  private Class379 cm;
                  private Class44 cn;
                  private Class436[] e;
                  private BigDecimal co;
                  private JLabel[] u;

                  protected void paintComponent(Graphics var1) {
                     if (Class455.this.aej.bl() && this.co != null) {
                        this.u[26 & 111].setText(String.valueOf(Class455.this.vd().getGoodNum(this.co)));
                     }

                     super.paintComponent(var1);
                  }

                  public {
                     int var10001 = 123 & 15;
                     int var10007 = 28095 & 5082;
                     this.setBounds(var10007, 2 & 5, 22975 & 10237, 3943 & 29400);
                     this.cm = new Class379("sc/music/197.b", 5 >> 2, 4927 & 28157, Class681.ab, (Color[])null, "增加经验", Class455.this.gk());
                     this.cm.setForeground(Class681.c("#c304340"));
                     this.cm.setBounds(26487 & 6554, 15866 & 17405, 127 & 75, 55 & 95);
                     this.add(this.cm);
                     JLabel[] var4 = new JLabel[var10001];
                     boolean var10003 = true;
                     this.u = var4;

                     int var10000;
                     int var2;
                     <undefinedtype> var3;
                     for(var10000 = var2 = 5 >> 3; var10000 < this.u.length; var10000 = var2) {
                        this.u[var2] = Class133.b(49 & 111, 1007 & 32222, 127 & 80, 31 & 124, Color.white, Class681.q);
                        this.u[var2].setText(var2 == 0 ? "12级" : (var2 >= --1 && var2 <= (13 & 123) ? "10000/10086" : (var2 == (63 & 74) ? "111" : "")));
                        this.u[var2].setHorizontalAlignment(3 ^ 3);
                        if (var2 == 0) {
                           var3 = this;
                           this.u[var2].setFont(Class681.h);
                           this.u[var2].setForeground(Class681.c("#c413A37"));
                        } else {
                           label117: {
                              if (var2 >= (4 ^ 5) && var2 <= (27 & 109)) {
                                 this.u[var2].setFont(Class681.ab);
                                 this.u[var2].setForeground(var2 == (2 ^ 3) ? Color.white : Class681.c("#c585852"));
                                 if (var2 == (3 & 5)) {
                                    var3 = this;
                                    this.u[var2].setBounds(40, 488, 256, 16);
                                    break label117;
                                 }

                                 if (var2 == (1 ^ 3)) {
                                    var3 = this;
                                    this.u[var2].setBounds(39, 489, 256, 16);
                                    break label117;
                                 }

                                 if (var2 == --3) {
                                    var3 = this;
                                    this.u[var2].setBounds(40, 489, 256, 16);
                                    break label117;
                                 }

                                 if (var2 == --4) {
                                    var3 = this;
                                    this.u[var2].setBounds(41, 489, 256, 16);
                                    break label117;
                                 }

                                 if (var2 == --5) {
                                    var3 = this;
                                    this.u[var2].setBounds(39, 488, 256, 16);
                                    break label117;
                                 }

                                 if (var2 == 6) {
                                    var3 = this;
                                    this.u[var2].setBounds(41, 488, 256, 16);
                                    break label117;
                                 }

                                 if (var2 == 7) {
                                    var3 = this;
                                    this.u[var2].setBounds(39, 487, 256, 16);
                                    break label117;
                                 }

                                 if (var2 == 8) {
                                    var3 = this;
                                    this.u[var2].setBounds(40, 487, 256, 16);
                                    break label117;
                                 }

                                 if (var2 == 9) {
                                    var3 = this;
                                    this.u[var2].setBounds(41, 487, 256, 16);
                                    break label117;
                                 }
                              } else if (var2 == 10) {
                                 this.u[var2].setFont(Class681.bm);
                                 this.u[var2].setHorizontalAlignment(10);
                                 this.u[var2].setBounds(306, 460, 40, 16);
                              }

                              var3 = this;
                           }
                        }

                        var3.add(this.u[var2++]);
                     }

                     this.bt = new RichLabel("", Class681.ce);
                     this.o = Class133.f(36, 80, 336, 346, this.bt, -4 >> 2);
                     ((Class179)this.o.getVerticalScrollBar().getUI()).ald(Class511.q("sc/music/210.a", 5 >> 1, 8, 5 >> 1, 8, (boolean)(3 ^ 3)), 10);
                     var10001 = --3;
                     this.add(this.o);
                     Class436[] var5 = new Class436[var10001];
                     var10003 = true;
                     this.e = var5;

                     for(var10000 = var2 = 3 >> 2; var10000 < this.e.length; var10000 = var2) {
                        this.e[var2] = new Class436();
                        if (var2 == 0) {
                           var3 = this;
                           this.e[var2].eq(Class511.q("sc/d/132.png", 50, 50, 50, 50, (boolean)(3 ^ 3)));
                           this.e[var2].setBounds(25, 74, 352, 361);
                        } else if (var2 == (2 ^ 3)) {
                           var3 = this;
                           this.e[var2].eq(Class511.q("sc/music/209.a", 1 ^ 3, 1 ^ 3, 1 ^ 3, 1 ^ 3, (boolean)(3 >> 2)));
                           this.e[var2].setBounds(41, 493, 254, 6);
                        } else {
                           if (var2 == (1 ^ 3)) {
                              this.e[var2].eq(Class511.q("sc/music/220.a", 10, 5 >> 1, 10, --2, (boolean)(3 ^ 3)));
                              this.e[var2].setBounds(40, 492, 256, 8);
                           }

                           var3 = this;
                        }

                        var3.add(this.e[var2++]);
                     }

                     this.cn = new Class44(Class455.this.gk());
                     this.cn.fw("sc/music/221.a");
                     this.cn.fx("sc/d/77.png");
                     this.cn.ad(new Class116(--5, --4, 35, 35));
                     this.cn.setBounds(303, 458, 45, 44);
                     this.add(this.cn);
                  }

                  public void be(int var1, Object var2) {
                     StringBuffer var3;
                     int var45;
                     <undefinedtype> var54;
                     label324: {
                        this.co = null;
                        var3 = new StringBuffer();
                        var3.append("#K");
                        Class603 var4;
                        RoleData var5;
                        ActivitySeries var6;
                        Activity var7;
                        ActivityPetManualRole var9;
                        int var33;
                        int var35;
                        int var43;
                        if (var1 == 0) {
                           ActivityPetManual var30;
                           ActivityPetManualType var32;
                           ActivityPetManual var53;
                           label283: {
                              var4 = Class455.this.vc();
                              var5 = Class455.this.vd();
                              ActivityPetManualSet var8 = (var7 = (var6 = var4.br()).getActivityPetManual()) != null ? var7.getPetManualSet() : null;
                              var9 = var7 != null ? (ActivityPetManualRole)var5.getActivity(var7.getId()) : null;
                              var30 = var2 != null && var9 != null ? var2.xt : null;
                              var32 = null;
                              if (var30 != null) {
                                 RoleSummoning var36 = var30 != null && var30.getPetId() > 0 ? var4.x(new BigDecimal(var30.getPetId())) : null;
                                 if (var36 != null) {
                                    var35 = Integer.parseInt(var36.getSsn());
                                    FormulaNum[] var48;
                                    int var44 = (var48 = var8.getTypes()).length;

                                    for(var45 = var43 = 3 ^ 3; var45 < var44; var45 = var43) {
                                       FormulaNum var41 = var48[var43];

                                       int var50;
                                       for(var45 = var50 = 3 & 4; var45 < var41.getSize(); var45 = var50) {
                                          int var19 = (int)var41.getZhi(var50);
                                          ActivityFC var26;
                                          ActivityPetManualType var20 = (var26 = (ActivityFC)var6.getActivityFCMap().get(var19)) != null ? (ActivityPetManualType)var26.getData() : null;
                                          if (var20 != null) {
                                             FormulaNum[] var24;
                                             int var23 = (var24 = var20.getTypes()).length;

                                             int var22;
                                             for(var45 = var22 = 5 >> 3; var45 < var23; var45 = var22) {
                                                FormulaNum var21 = var24[var22];

                                                int var25;
                                                for(var45 = var25 = 3 & 4; var45 < var21.getSize(); var45 = var25) {
                                                   if (var21.getZhi(var50) == (long)var35) {
                                                      var32 = var20;
                                                      var53 = var30;
                                                      break label283;
                                                   }

                                                   ++var25;
                                                }

                                                ++var22;
                                             }
                                          }

                                          ++var50;
                                       }

                                       ++var43;
                                    }
                                 }
                              }

                              var53 = var30;
                           }

                           JLabel var55;
                           if (var53 == null || var32 == null) {
                              this.u[3 ^ 3].setText("-级");

                              for(var45 = var33 = --1; var45 < 10; var45 = var33) {
                                 var55 = this.u[var33];
                                 ++var33;
                                 var55.setText("-/-");
                              }

                              var54 = this;
                              this.u[74 & 63].setText("");
                              this.e[--1].aed(0.0D);
                              this.cn.c(3 & 4, (Object)null);
                              this.cn.setVisible((boolean)(--1));
                              break label324;
                           }

                           long var37 = var9 != null ? var9.getValueByKey(var30.getId()) : 0L;
                           long var42 = var37 % 100L;
                           long var46 = var37 / 100L;
                           long var51 = (long)var32.getLvlExp() * (var42 + 1L);
                           this.co = new BigDecimal(var32.getId() == 5 >> 2 ? 27391 & 16382 : (var32.getId() == 5 >> 1 ? 31487 & 12287 : 11008));
                           Goodstable var27;
                           if ((var27 = var4.n(this.co)) != null) {
                              this.cn.c(--1, var27);
                              var54 = this;
                           } else {
                              this.cn.c(3 >> 2, (Object)null);
                              var54 = this;
                              this.cn.setVisible((boolean)(3 & 5));
                           }

                           var54.u[58 & 79].setText(String.valueOf(var5.getGoodNum(this.co)));
                           var45 = 2 ^ 3;
                           this.u[3 ^ 3].setText(var42 + "级");

                           for(int var52 = var45; var45 < 10; var45 = var52) {
                              var55 = this.u[var52];
                              StringBuilder var47 = (new StringBuilder(String.valueOf(var46))).append("/");
                              ++var52;
                              var55.setText(var47.append(var51).toString());
                           }

                           this.e[3 & 5].aee((double)var46 / (double)var51, 17406 & 15615);
                           if (var30.getRoles() != null || var30.getPet1s() != null || var30.getPet2s() != null) {
                              if (var42 > 0L) {
                                 var3.append("当前等级加成");
                                 Class455.this.asa("人物属性", var42, var30.getRoles(), var3);
                                 Class455.this.asa("召唤兽通用属性", var42, var30.getPet1s(), var3);
                                 Class455.this.asa("召唤兽专用属性", var42, var30.getPet2s(), var3);
                              }

                              if (var42 < (long)var32.getLvlMax()) {
                                 if (var42 > 0L) {
                                    var3.append("#r");
                                 }

                                 var3.append("下一等级加成");
                                 Class455.this.asa("人物属性", var42 + 1L, var30.getRoles(), var3);
                                 Class455.this.asa("召唤兽通用属性", var42 + 1L, var30.getPet1s(), var3);
                                 Class455.this.asa("召唤兽专用属性", var42 + 1L, var30.getPet2s(), var3);
                                 var54 = this;
                                 break label324;
                              }
                           }
                        } else {
                           var4 = Class455.this.vc();
                           var5 = Class455.this.vd();
                           Iterator var10000;
                           if ((var7 = (var6 = var4.br()).getActivityPetManual()) != null) {
                              var7.getPetManualSet();
                           } else {
                              var10000 = null;
                           }

                           var9 = var7 != null ? (ActivityPetManualRole)var5.getActivity(var7.getId()) : null;
                           if (var9 != null) {
                              List var10;
                              if ((var10 = var9.getList(3 & 4, var7, var6)).size() != 0) {
                                 if (var3.length() > (1 ^ 3)) {
                                    var3.append("#r");
                                 }

                                 int var11;
                                 for(var45 = var11 = 0; var45 < var10.size(); var45 = var11) {
                                    BaseQl var12 = (BaseQl)var10.get(var11);
                                    var3.append(var11 == 0 ? "人物属性总加成#r" : ",");
                                    var3.append(var12.getKey());
                                    if (var12.getValue() >= 0.0D) {
                                       var3.append("+");
                                    }

                                    var3.append(var12.getValue());
                                    ++var11;
                                    var3.append(Class270.so(var12.getKey()));
                                 }
                              }

                              if ((var10 = var9.getList(3 >> 1, var7, var6)).size() != 0) {
                                 HashMap var31 = new HashMap();

                                 for(var45 = var33 = 2 & 5; var45 < var10.size(); var45 = var33) {
                                    BaseQl var13 = (BaseQl)var10.get(var33);
                                    int var14;
                                    Object var15;
                                    if ((var15 = (List)var31.get(var14 = (int)var13.getValue2())) == null) {
                                       var31.put(var14, var15 = new ArrayList());
                                    }

                                    ++var33;
                                    ((List)var15).add(var13);
                                 }

                                 List var34;
                                 if ((var34 = (List)var31.remove(3 ^ 3)) != null) {
                                    if (var3.length() > --2) {
                                       var3.append("#r");
                                    }

                                    for(var45 = var35 = 0; var45 < var34.size(); var45 = var35) {
                                       BaseQl var39 = (BaseQl)var34.get(var35);
                                       var3.append(var35 == 0 ? "召唤兽通用属性总加成#r" : ",");
                                       var3.append(var39.getKey());
                                       if (var39.getValue() >= 0.0D) {
                                          var3.append("+");
                                       }

                                       var3.append(var39.getValue());
                                       ++var35;
                                       var3.append(Class270.so(var39.getKey()));
                                    }
                                 }

                                 if (var31.size() > 0) {
                                    if (var3.length() > --2) {
                                       var3.append("#r");
                                    }

                                    var3.append("召唤兽专用属性总加成");
                                    Iterator var38 = var31.entrySet().iterator();

                                    for(var10000 = var38; var10000.hasNext(); var10000 = var38) {
                                       Entry var40;
                                       var43 = (Integer)(var40 = (Entry)var38.next()).getKey();
                                       var34 = (List)var40.getValue();
                                       RoleSummoning var16;
                                       RoleSummoning var10001 = var16 = var4.x(new BigDecimal(var43));
                                       var3.append("#r");
                                       var3.append(var10001 != null ? var16.getSummoningname() : "未知召唤兽");
                                       int var17 = 0;

                                       for(var45 = var17; var45 < var34.size(); var45 = var17) {
                                          BaseQl var18 = (BaseQl)var34.get(var17);
                                          var3.append(var17 == 0 ? ":" : ",");
                                          var3.append(var18.getKey());
                                          if (var18.getValue() >= 0.0D) {
                                             var3.append("+");
                                          }

                                          var3.append(var18.getValue());
                                          ++var17;
                                          var3.append(Class270.so(var18.getKey()));
                                       }
                                    }
                                 }
                              }
                           }
                        }

                        var54 = this;
                     }

                     var54.bt.setTextSize(var3.toString(), 25467 & 7620);
                     boolean var28 = var1 == 0;
                     var45 = 0;
                     this.cn.setVisible(var28);

                     int var29;
                     for(var29 = 0; var45 < this.u.length; var45 = var29) {
                        this.u[var29++].setVisible(var28);
                     }

                     for(var45 = var29 = 1; var45 < this.e.length; var45 = var29) {
                        this.e[var29++].setVisible(var28);
                     }

                     this.cm.setVisible(var28);
                  }
               }, 2 & 5);
            }

            ((<undefinedtype>)this.baz[--1]).be(1, null);
            var2 = 1;
         }

         var7 = this;
      }

      if (var7.baz[var2] != null) {
         this.baz[var2].setVisible(true);
      }

      int var6;
      for(var10000 = var6 = 0; var10000 < this.baz.length; var10000 = var6) {
         if (this.baz[var6] != null && var2 != var6) {
            this.baz[var6].setVisible(false);
         }

         ++var6;
      }

   }

   public void asa(String var1, long var2, BaseQl[] var4, StringBuffer var5) {
      if (var4 != null) {
         int var6;
         for(int var10000 = var6 = 0; var10000 < var4.length; var10000 = var6) {
            String var7 = var4[var6].getKey();
            double var8 = var4[var6].getValue() + (double)var2 * var4[var6].getValue2();
            StringBuffer var10;
            if (var6 == 0) {
               var5.append("#r");
               var5.append(var1);
               var5.append(":");
               var10 = var5;
            } else {
               var5.append(",");
               var10 = var5;
            }

            var10.append(var7);
            if (var8 >= 0.0D) {
               var5.append("+");
            }

            var5.append(var8);
            ++var6;
            var5.append(Class270.so(var7));
         }

      }
   }

   public void d() {
      Class603 var5 = this.vc();
      RoleData var2 = this.vd();
      Activity var3;
      if ((var3 = var5.br().getActivityPetManual()) != null) {
         var3.getPetManualSet();
         ActivityPetManualRole var4 = var3 != null ? (ActivityPetManualRole)var2.getActivity(var3.getId()) : null;

         int var10;
         for(int var10000 = var10 = 3 ^ 3; var10000 < this.gs.size(); var10000 = var10) {
            ActivityPetManual var1;
            <undefinedtype> var11;
            RoleSummoning var6 = (var1 = (var11 = (<undefinedtype>)this.gs.get(var10)).xt) != null && var11.xt.getPetId() > 0 ? var5.x(new BigDecimal(var1.getPetId())) : null;
            long var7 = var4 != null && var1 != null ? var4.getValueByKey(var1.getId()) : 0L;
            int var9 = (int)(var7 % 100L);
            ActivityPetManual var10001 = var11.xt;
            ++var10;
            var11.oq(var10001, var6, var9, (int)(var7 / 100L));
         }

         this.y(this.xy);
      }
   }
}
