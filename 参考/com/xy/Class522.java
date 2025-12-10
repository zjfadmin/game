package com.xy;

import com.xy.entity.RoleSummoning;
import com.xy.formula.ActivityPetManual;
import com.xy.formula.ActivityPetManualSet;
import com.xy.formula.FormulaNum;
import com.xy.game.RoleData;
import com.xy.game.RolePet;
import com.xy.readbean.Activity;
import com.xy.readbean.ActivityFC;
import com.xy.readbean.ActivityPetManualRole;
import com.xy.readbean.ActivitySeries;
import com.xy.readbean.Skill;
import com.xy.richtext.RichLabel;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.ImageObserver;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class Class522 extends Class345 {
   private JScrollPane hd;
   private Class44 zq;
   private int gv;
   private List<null> vz;
   private static Image gd = Class511.a("sc/music/223.a");
   private JComponent zr;
   private RichLabel[] zs;
   public Comparator<null> zt;
   private Class436[] e;
   private static Image fq = Class511.a("sc/music/227.a");
   private JLabel[] u;

   public void pz(Object var1) {
      this.gv = var1 != null ? var1.m : 0;
      Class603 var11 = this.vc();
      RoleData var9 = this.vd();
      Skill var4 = this.gv > 0 ? var11.bf(String.valueOf(this.gv)) : null;
      int var31;
      if (var4 == null) {
         var31 = 3 & 4;
         this.e[5 >> 3].q();
         this.u[3 & 4].setText("");
         this.u[--2].setText("未解锁");
         this.u[29 & 106].setText("未选择");
         this.zq.c(3 & 4, (Object)null);

         for(int var21 = var31; var31 < this.zs.length; var31 = var21) {
            RichLabel var35 = this.zs[var21];
            ++var21;
            var35.setTextSize("", 21430 & 11487);
         }

      } else {
         ActivitySeries var5;
         Activity var6;
         Activity var10000 = var6 = (var5 = var11.br()).getActivityPetManual();
         ActivityPetManualSet var7 = var10000.getPetManualSet();
         ActivityPetManualRole var8 = var10000 != null ? (ActivityPetManualRole)var9.getActivity(var6.getId()) : null;
         Image var3;
         if ((var3 = Class222.g(String.valueOf(this.gv))) == Class511.p()) {
            var3 = Class511.a("sc/d/77.png");
         }

         this.e[2 & 5].hf(var3);
         int var15 = var1.ay;
         RolePet var24 = var9.getRolePetQY(this.gv);
         this.u[5 >> 3].setText(var4.getSkillname());
         this.u[5 >> 1].setText(var15 > 0 ? Class509.l(var15) + "级" : "未解锁");
         this.u[25 & 110].setText(var24 != null ? var24.getPet().getSummoningname() : "未选择");
         Class44 var30 = this.zq;
         int var10001;
         RolePet var10002;
         if (var24 != null) {
            var10001 = 125 & 23;
            var10002 = var24;
         } else {
            var10001 = 0;
            var10002 = var24;
         }

         var30.c(var10001, var10002 != null ? var24.getPet() : null);
         int var10003 = 3 >> 2;
         var10001 = 3 >> 2;
         this.zs[var10003].setTextSize("#K" + Class683.apf(this.gv, var4, (double)var15, 3 >> 2, 3 >> 2), 5334 & 27583);
         this.zs[3 ^ 3].setBounds(30311 & 3071, 124 & 95, this.zs[3 ^ 3].getWidth(), this.zs[5 >> 3].getHeight());
         var15 = var10001;
         int var25 = var8 != null ? var8.a(var6, var5)[2 & 5] : 0;
         ArrayList var19 = new ArrayList();
         FormulaNum[] var2;
         int var10 = (var2 = var7.getPets()).length;

         int var18;
         for(var31 = var18 = 5 >> 3; var31 < var10; var31 = var18) {
            FormulaNum var22 = var2[var18];

            int var12;
            for(var31 = var12 = 5 >> 3; var31 < var22.getSize(); var31 = var12) {
               int var13 = (int)var22.getZhi(var12);
               ActivityFC var28;
               ActivityPetManual var14 = (var28 = (ActivityFC)var5.getActivityFCMap().get(var13)) != null ? (ActivityPetManual)var28.getData() : null;
               RoleSummoning var29 = var14 != null && var14.getPetId() > 0 ? var11.x(new BigDecimal(var14.getPetId())) : null;
               if (var29 != null && var14.getSkillId() == this.gv) {
                  var19.add(var29);
                  var15 = (int)((long)var15 + var8.getValueByKey(var14.getId()) % 100L);
               }

               ++var12;
            }

            ++var18;
         }

         StringBuffer var23 = new StringBuffer();
         StringBuffer var20 = new StringBuffer();
         StringBuffer var26 = new StringBuffer();

         Iterator var27;
         for(Iterator var32 = var27 = var19.iterator(); var32.hasNext(); var32 = var27) {
            RoleSummoning var16 = (RoleSummoning)var27.next();
            if (var23.length() != 0) {
               var23.append("#K和");
            }

            if (var20.length() != 0) {
               var20.append("#K和");
            }

            if (var26.length() != 0) {
               var26.append("#K和");
            }

            var23.append("#c38733C");
            var20.append("#c38733C");
            var26.append("#c38733C");
            var23.append(var16.getSummoningname());
            var20.append(var16.getSummoningname());
            var26.append(var16.getSummoningname());
         }

         if (var19.size() > 0) {
            var23.append("#K总和缘念等级");
            var20.append("#K总和缘念等级");
            var26.append("#K总和缘念等级");
            var23.append(var7.getSkillPetLvls()[5 >> 3]);
            var20.append(var7.getSkillPetLvls()[3 >> 1]);
            var26.append(var7.getSkillPetLvls()[1 ^ 3]);
         }

         var23.append("#R(当前" + var15 + ")");
         var20.append("#R(当前" + var15 + ")");
         var26.append("#R(当前" + var15 + ")");
         if (var7.getSkillTotalLvls()[3 ^ 3] > 0) {
            var23.append("#r#K总缘念等级" + var7.getSkillTotalLvls()[3 >> 2] + "#R(当前" + var25 + ")");
         }

         if (var7.getSkillTotalLvls()[2 ^ 3] > 0) {
            var20.append("#r#K总缘念等级" + var7.getSkillTotalLvls()[4 ^ 5] + "#R(当前" + var25 + ")");
         }

         if (var7.getSkillTotalLvls()[5 >> 1] > 0) {
            var26.append("#r#K总缘念等级" + var7.getSkillTotalLvls()[1 ^ 3] + "#R(当前" + var25 + ")");
         }

         int var17;
         for(var31 = var17 = 1; var31 < this.zs.length; var31 = var17) {
            Class522 var33;
            if (var17 == 1) {
               var33 = this;
               this.zs[var17].setTextSize(var23.toString(), 11130 & 21917);
            } else if (var17 == --2) {
               var33 = this;
               this.zs[var17].setTextSize(var20.toString(), 23352 & 9695);
            } else {
               if (var17 == --3) {
                  this.zs[var17].setTextSize(var26.toString(), 29528 & 3519);
               }

               var33 = this;
            }

            var33.zs[var17].setBounds(8890 & 24415, (9647 & 23419) + (116 & 63) * var17, this.zs[var17].getWidth(), this.zs[var17++].getHeight());
         }

      }
   }

   public void o() {
      this.s();
      <undefinedtype> var1 = null;
      int var2;
      int var10000 = var2 = 3 & 4;

      Class522 var3;
      while(true) {
         if (var10000 >= this.vz.size()) {
            var3 = this;
            break;
         }

         if (((<undefinedtype>)this.vz.get(var2)).m == this.gv) {
            var1 = (<undefinedtype>)this.vz.get(var2);
            var3 = this;
            break;
         }

         ++var2;
         var10000 = var2;
      }

      var3.pz(var1);
   }

   public void p() {
      int var1;
      for(int var10000 = var1 = 3 & 4; var10000 < this.vz.size(); var10000 = var1) {
         <undefinedtype> var2 = (<undefinedtype>)this.vz.get(var1);
         int var10001 = 2 & 5;
         int var10002 = var1 * (122 & 71);
         ++var1;
         var2.setBounds(var10001, var10002, 6527 & 26527, 108 & 87);
      }

      this.zr.setPreferredSize(new Dimension(8063 & 24991, (5 >> 1) + (98 & 95) * this.vz.size()));
      this.zr.updateUI();
      this.hd.updateUI();
   }

   public void fr(Class44 var1) {
      if (this.zq == var1) {
         Class658.cy(51 & 94, this.aej);
      }
   }

   public <undefinedtype> qb(int var1) {
      if (var1 < this.vz.size()) {
         return (<undefinedtype>)this.vz.get(var1);
      } else {
         MouseListener var2 = new MouseListener() {
            private Class44 akj;
            private int ay;
            private Image bx;
            private JLabel ir;
            private JLabel rk;
            private int m;

            public void mousePressed(MouseEvent var1) {
            }

            public void mouseClicked(MouseEvent var1) {
               Class522.this.pz(this);
            }

            public void abw(int var1, int var2, Skill var3, RoleSummoning var4) {
               this.m = var1;
               this.ay = var2;
               if (var3 == null) {
                  this.setVisible((boolean)(3 ^ 3));
               } else {
                  this.rk.setText(var3.getSkillname());
                  this.ir.setText(var2 > 0 ? Class509.l(var2) + "级" : "未解锁");
                  Class44 var10000 = this.akj;
                  int var10001;
                  RoleSummoning var10002;
                  if (var4 != null) {
                     var10001 = 117 & 31;
                     var10002 = var4;
                  } else {
                     var10001 = 0;
                     var10002 = var4;
                  }

                  var10000.c(var10001, var10002);
                  this.bx = Class222.g(String.valueOf(var1));
                  if (this.bx == Class511.p()) {
                     this.bx = Class511.a("sc/d/77.png");
                  }

                  this.setVisible((boolean)(--1));
               }
            }

            protected void paintComponent(Graphics var1) {
               super.paintComponent(var1);
               var1.drawImage(Class522.gd, --4, --4, 23451 & 9597, 63 & 127, (ImageObserver)null);
               if (this.bx != null) {
                  var1.drawImage(this.bx, 31 & 111, 31 & 111, 119 & 43, 119 & 43, (ImageObserver)null);
               }

               if (Class522.this.gv != 0 && Class522.this.gv == this.m) {
                  var1.drawImage(Class522.fq, 3 & 4, 3 & 4, 16159 & 16895, 125 & 70, (ImageObserver)null);
               }

            }

            public {
               int var10004 = 2775 & 30143;
               int var10006 = 123 & 71;
               int var10009 = 3 ^ 3;
               int var10011 = 3 & 4;
               this.m = var10011;
               this.ay = var10009;
               this.akj = new Class44(Class522.this.gk());
               this.akj.setBounds(71 & 123, 127 & 31, 22 & 127, 22 & 127);
               this.rk = Class133.b(var10006, 125 & 11, 121 & 126, 116 & 31, Class681.c("#c4F6066"), Class681.q);
               this.ir = Class133.b(var10004, 29 & 107, 123 & 124, 86 & 61, Class681.c("#c4F6066"), Class681.q);
               this.ir.setHorizontalAlignment(--4);
               this.add(this.akj);
               this.add(this.rk);
               this.add(this.ir);
               this.addMouseListener(this);
            }

            public void mouseReleased(MouseEvent var1) {
            }

            public void mouseExited(MouseEvent var1) {
            }

            public void mouseEntered(MouseEvent var1) {
            }
         };
         this.vz.add(var2);
         this.zr.add(var2);
         return var2;
      }
   }

   public void s() {
      Class603 var4 = this.vc();
      RoleData var5 = this.vd();
      Activity var3;
      ActivitySeries var18;
      if ((var3 = (var18 = var4.br()).getActivityPetManual()) != null) {
         ActivityPetManualSet var1 = var3.getPetManualSet();
         ActivityPetManualRole var2 = var3 != null ? (ActivityPetManualRole)var5.getActivity(var3.getId()) : null;
         int[] var6 = var2 != null ? var2.a(var3, var18) : null;
         int var19 = 5 >> 3;
         int var17 = --1;
         FormulaNum[] var8;
         int var7 = (var8 = var1.getSkills()).length;

         int var16;
         int var10000;
         for(var10000 = var16 = 3 ^ 3; var10000 < var7; var10000 = var16) {
            FormulaNum var14 = var8[var16];

            int var9;
            for(var10000 = var9 = 3 >> 2; var10000 < var14.getSize(); var10000 = var9) {
               int var10 = (int)var14.getZhi(var9);
               int var11 = var6 != null && var17 < var6.length ? var6[var17] : 0;
               Class603 var20 = this.vc();
               ++var17;
               Skill var12;
               if ((var12 = var20.bf(String.valueOf(var10))) != null) {
                  RolePet var13 = var5.getRolePetQY(var10);
                  this.qb(var19).abw(var10, var11, var12, var13 != null ? var13.getPet() : null);
                  ++var19;
               }

               ++var9;
            }

            ++var16;
         }

         int var15;
         for(var10000 = var15 = this.vz.size() - (5 >> 2); var10000 >= var19; var10000 = var15) {
            this.zr.remove((Component)this.vz.remove(var15--));
         }

         Collections.sort(this.vz, this.zt);
         this.p();
      }
   }

   public Class522(Class395 var1) {
      int var10001 = --4;
      int var10003 = 5 >> 3;
      super(-4 >> 2, -4 >> 2, Class345.aei, var1.aej);
      this.zt = new Comparator<null>() {
         public int b(Object var1, Object var2) {
            if (var1.ay > var2.ay) {
               return 3 & 5;
            } else if (var1.ay < var2.ay) {
               return -4 >> 2;
            } else if (var1.m < var2.m) {
               return 3 >> 1;
            } else {
               return var1.m > var2.m ? -4 >> 2 : 0;
            }
         }
      };
      this.va(var10003, 2 & 5, 12287 & 21335, 30528 & 2815, Class345.aei);
      RichLabel[] var4 = new RichLabel[var10001];
      boolean var7 = true;
      this.zs = var4;

      int var10000;
      int var2;
      for(var10000 = var2 = 5 >> 3; var10000 < this.zs.length; var10000 = var2) {
         this.zs[var2] = new RichLabel("", var2 == 0 ? Class681.ce : Class681.ab);
         this.add(this.zs[var2++]);
      }

      int var10002 = 126 & 111;
      this.vz = new ArrayList();
      this.zr = new JComponent() {
      };
      this.zr.setOpaque((boolean)(--1));
      this.hd = Class133.f(var10002, 116 & 91, 16366 & 16701, 13278 & 19887, this.zr, -4 >> 2);
      ((Class179)this.hd.getVerticalScrollBar().getUI()).ald(Class511.q("sc/music/210.a", 1 ^ 3, 120 & 15, 1 ^ 3, 127 & 8, (boolean)(5 >> 3)), 42 & 95);
      var10001 = 25 & 111;
      this.add(this.hd);
      JLabel[] var5 = new JLabel[var10001];
      var7 = true;
      this.u = var5;

      Class522 var3;
      for(var10000 = var2 = 3 >> 2; var10000 < this.u.length; var10000 = var2) {
         this.u[var2] = Class133.b(25051 & 8175, 15807 & 17110, 126 & 121, 126 & 25, Class681.c("#c57442d"), Class681.cg);
         this.u[var2].setText(var2 == 0 ? "技能名称" : (var2 == --1 ? "技能效果" : (var2 == --2 ? "未解锁" : (var2 == --3 ? "契印升级条件" : (var2 == --4 ? "一级" : (var2 == --5 ? "二级" : (var2 == (47 & 86) ? "三级" : (var2 == (31 & 103) ? "结契对象" : (var2 == 8 ? "未选择" : "")))))))));
         this.u[var2].setHorizontalAlignment(3 >> 2);
         if (var2 == 5 >> 2) {
            var3 = this;
            this.u[var2].setBounds(628, 73, 120, 20);
         } else if (var2 == --2) {
            var3 = this;
            this.u[var2].setBounds(459, 174, 120, 20);
            this.u[var2].setFont(Class681.q);
            this.u[var2].setForeground(Class681.c("#c6B5423"));
         } else if (var2 == --3) {
            var3 = this;
            this.u[var2].setBounds(440, 319, 339, 25);
            this.u[var2].setForeground(Class681.c("#cFFFFFF"));
         } else if (var2 >= --4 && var2 <= 6) {
            var3 = this;
            this.u[var2].setBounds(441, 362 + (var2 - --4) * 52, 50, 20);
            this.u[var2].setFont(Class681.q);
            this.u[var2].setForeground(Class681.c("#c6B5323"));
         } else if (var2 == 7) {
            var3 = this;
            this.u[var2].setBounds(462, 238, 100, 24);
            this.u[var2].setFont(Class681.cg);
         } else {
            if (var2 == 8) {
               this.u[var2].setBounds(584, 270, 200, 16);
               this.u[var2].setFont(Class681.ab);
               this.u[var2].setForeground(Class681.c("#c6B5423"));
            }

            var3 = this;
         }

         var3.add(this.u[var2++]);
      }

      this.zq = new Class44(this.gk());
      this.zq.gt((boolean)(3 & 4));
      this.zq.ad(Class44.aqu);
      this.zq.fw("sc/music/222.a");
      this.zq.setBounds(662, 225, 45, 44);
      this.add(this.zq);
      Class436[] var6 = new Class436[10];
      var7 = true;
      this.e = var6;

      for(var10000 = var2 = 2 & 5; var10000 < this.e.length; var10000 = var2) {
         this.e[var2] = new Class436();
         if (var2 == 0) {
            var3 = this;
            this.e[var2].fw("sc/d/77.png");
            this.e[var2].setBounds(490, 79, 56, 56);
         } else if (var2 == (4 ^ 5)) {
            var3 = this;
            this.e[var2].fw("sc/music/225.a");
            this.e[var2].setBounds(483, 71, 71, 71);
         } else if (var2 == (1 ^ 3)) {
            var3 = this;
            this.e[var2].fw("sc/d/167.png");
            this.e[var2].setBounds(587, 81, 195, --5);
         } else if (var2 == --3) {
            var3 = this;
            this.e[var2].fw("sc/music/224.a");
            this.e[var2].setBounds(446, 200, 326, 100);
         } else if (var2 == --4) {
            var3 = this;
            this.e[var2].eq(Class511.q("sc/d/132.png", 50, 50, 50, 50, (boolean)(5 >> 3)));
            this.e[var2].setBounds(435, 34, 352, 280);
         } else if (var2 == 5) {
            var3 = this;
            this.e[var2].fw("sc/music/226.a");
            this.e[var2].setBounds(440, 319, 341, 196);
         } else if (var2 >= 6 && var2 <= 7) {
            var3 = this;
            this.e[var2].eq(Class511.q("sc/d/66.png", 50, 3 & 5, 50, --1, (boolean)(3 ^ 3)));
            this.e[var2].setBounds(449, 398 + (var2 - 6) * 53, 292, 2);
         } else if (var2 == 8) {
            var3 = this;
            this.e[var2].eq(Class511.q("sc/music/211.a", 2, 10, 2, 10, (boolean)(3 ^ 3)));
            this.e[var2].setBounds(400, 84, 7, 413);
         } else {
            if (var2 == 9) {
               this.e[var2].fw("sc/music/228.a");
               this.e[var2].setBounds(58, 5 >> 3, 395, 576);
            }

            var3 = this;
         }

         var3.add(this.e[var2++]);
      }

   }

   public void d() {
      this.s();
      this.pz(this.vz.size() > 0 ? (<undefinedtype>)this.vz.get(3 >> 2) : null);
   }
}
