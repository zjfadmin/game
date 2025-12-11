package com.xy.a.a;

import com.xy.entity.Pal;
import com.xy.game.RoleData;
import com.xy.readbean.PalData;
import com.xy.readbean.Skill;
import com.xy.richtext.RichLabel;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.DefaultListModel;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class Class15 extends JComponent {
   // $VF: synthetic field
   final Class38 ob;
   private com.xy.i.Class4[] oc;
   private com.xy.w.Class18[] aw;
   private DefaultListModel<String> od;
   private JList<String> oe;
   private JScrollPane jo;
   private JLabel[] o;
   private RichLabel bj;

   // $VF: synthetic method
   static Class38 kl(Class15 var0) {
      return var0.ob;
   }

   // $VF: synthetic method
   static JList km(Class15 var0) {
      return var0.oe;
   }

   public Class15(Class38 var1) {
      this.ob = var1;
      this.oc = new com.xy.i.Class4[2];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.oc.length; var10000 = var2) {
         com.xy.i.Class4[] var5 = this.oc;
         int var10006 = 129 + var2;
         String var24;
         Class38 var10010;
         if (var2 == 0) {
            var24 = "删除技能";
            var10010 = var1;
         } else if (var2 == 1) {
            var24 = "使用物品";
            var10010 = var1;
         } else {
            var24 = "";
            var10010 = var1;
         }

         com.xy.i.Class4 var10002 = new com.xy.i.Class4("sc/e/26.png", 1, var10006, com.xy.q.Class49.ch, com.xy.q.Class49.bv, var24, var10010.eg());
         var5[var2] = var10002;
         this.oc[var2].setBounds(205 + var2 * 105, 325, 99, 25);
         this.add(this.oc[var2++]);
      }

      this.o = new JLabel[2];

      for (int var6 = var2 = 0; var6 < this.o.length; var6 = var2) {
         this.o[var2] = com.xy.q.Class1.f(413, 70, 127, 21, 0, Color.white, com.xy.q.Class49.ch);
         JLabel var7 = this.o[var2];
         String var10;
         if (var2 == 0) {
            var10 = "技能名称";
         } else if (var2 == 1) {
            var10 = "技能介绍";
         } else {
            var10 = "";
         }

         var7.setText(var10);
         if (var2 == 1) {
            this.o[var2].setBounds(413, 171, 127, 21);
         }

         this.add(this.o[var2++]);
      }

      this.bj = new RichLabel();
      this.add(this.bj);
      this.od = new DefaultListModel<>();
      this.oe = new JList<>();
      this.oe.setOpaque(false);
      this.oe.setSelectionBackground(new Color(33, 42, 52));
      this.oe.setSelectionForeground(Color.YELLOW);
      this.oe.setForeground(Color.YELLOW);
      this.oe.setFont(com.xy.q.Class49.y);
      this.oe.setBackground(com.xy.q.Class49.bk);
      this.oe.setModel(this.od);
      this.oe.setSelectionMode(0);
      this.oe.addListSelectionListener(new Class48(this));
      this.oe.setBounds(415, 90, 113, 78);
      this.add(this.oe);
      this.jo = com.xy.q.Class1.g(416, 192, 128, 165, this.bj, 30);
      this.add(this.jo);
      this.aw = new com.xy.w.Class18[5];

      for (int var8 = var2 = 0; var8 < this.aw.length; var8 = var2) {
         this.aw[var2] = new com.xy.w.Class18();
         Class15 var9;
         if (var2 == 0) {
            var9 = this;
            this.aw[var2].dp("sc/d/79.png");
            this.aw[var2].setBounds(205, 70, 204, 243);
         } else if (var2 == 1) {
            var9 = this;
            this.aw[var2].mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            this.aw[var2].setBounds(413, 70, 127, 21);
         } else if (var2 == 2) {
            var9 = this;
            this.aw[var2].mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            this.aw[var2].setBounds(413, 171, 127, 21);
         } else if (var2 == 3) {
            var9 = this;
            this.aw[var2].mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
            this.aw[var2].setBounds(413, 70, 127, 101);
         } else {
            if (var2 == 4) {
               this.aw[var2].mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
               this.aw[var2].setBounds(413, 171, 127, 187);
            }

            var9 = this;
         }

         var9.add(this.aw[var2++]);
      }
   }

   public void kn(Skill var1, boolean var2) {
      this.bj.setText(null);
      if (var1 != null) {
         RoleData var3 = this.ob.yx();
         int var4 = com.xy.v.Class4.s(var3.getLoginResult().getGrade());
         int var5 = com.xy.v.Class4.q(var3.getLoginResult().getGrade());
         double var6 = var4 * 150;
         String var8;
         if ((var8 = Class9.gb(Integer.parseInt(var1.getSkillid()), var1, var6, var4, var5)) != null) {
            this.bj.addText(var8);
         }

         Dimension var9 = this.bj.computeSize(110);
         this.bj.setSize(var9);
         this.bj.setPreferredSize(var9);
      }
   }

   public void fn(Pal var1, PalData var2) {
      this.od.removeAllElements();
      this.kn(null, false);
      if (var2.getSkill() != null && !var2.getSkill().equals("")) {
         String[] var3 = var2.getSkill().split("\\|");

         int var4;
         for (int var6 = var4 = 0; var6 < var3.length; var6 = ++var4) {
            Skill var5;
            if ((var5 = this.ob.yt().ac(var3[var4])) != null) {
               this.od.addElement(var5.getSkillname());
            }
         }
      }
   }
}
