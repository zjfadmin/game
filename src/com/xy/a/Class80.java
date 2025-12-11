package com.xy.a;

import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.readbean.petExchange;
import java.awt.Color;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.plaf.basic.BasicTreeUI;
import javax.swing.tree.DefaultMutableTreeNode;

class Class80 extends JComponent {
   private com.xy.q.Class54 agu;
   private Class12[] agv;
   private com.xy.q.Class52 agw;
   private JLabel[] ou;
   private com.xy.w.Class18[] iq;
   private long agx;
   private JTree agy;
   private com.xy.q.Class13 agz;
   private petExchange aha;
   private JScrollPane cp;
   private DefaultMutableTreeNode ahb;
   // $VF: synthetic field
   final Class93 tz;
   private com.xy.i.Class18[] qh;
   private com.xy.q.Class14 p;

   // $VF: synthetic method
   static petExchange zj(Class80 var0) {
      return var0.aha;
   }

   public void lr(petExchange var1) {
      int var10000 = 0;
      this.aha = var1;
      this.agu.gs(0, null);
      this.agu.setVisible(true);

      for (int var2 = 0; var10000 < this.agv.length; var10000 = var2) {
         Class12 var13 = this.agv[var2];
         var2++;
         var13.cb(null, 0);
      }

      this.agx = 0L;
      this.p.setText(null);
      if (var1 != null) {
         Goodstable var11 = this.tz.yt().ay(var1.getPid());
         byte var10001;
         Goodstable var10002;
         if (var11 != null) {
            var10001 = 1;
            var10002 = var11;
         } else {
            var10001 = 0;
            var10002 = var11;
         }

         this.agu.gs(var10001, var10002);
         this.agu.setVisible(true);
         String var3;
         if ((var3 = var1.getConsume()) != null && !var3.equals("")) {
            String var19 = "R-";
            String[] var4 = var3.split("\\|");
            int var5 = 0;

            int var6;
            for (int var14 = var6 = 0; var14 < var4.length; var14 = ++var6) {
               String var15 = var4[var6];
               String var20 = "^";
               if (var15.startsWith("D")) {
                  String var16 = var4[var6];
                  String var21 = "l";
                  String[] var7 = var16.split("=");
                  this.agx = Long.parseLong(var7[1]);
                  com.xy.q.Class49.b(this.p, this.agx);
               } else {
                  String var17 = var4[var6];
                  String var22 = "]";
                  if (var17.startsWith("G")) {
                     String var18 = var4[var6];
                     String var23 = "l";
                     String[] var12 = var18.split("=");
                     BigDecimal var8 = new BigDecimal(var12[1]);
                     Goodstable var9 = this.tz.yt().ay(var8);
                     int var10 = Integer.parseInt(var12[2]);
                     if (var5 < this.agv.length) {
                        this.agv[var5].cb(var9, var10);
                     }

                     var5++;
                  }
               }
            }
         }
      }
   }

   // $VF: synthetic method
   static long zk(Class80 var0) {
      return var0.agx;
   }

   // $VF: synthetic method
   static com.xy.q.Class52 zl(Class80 var0) {
      return var0.agw;
   }

   // $VF: synthetic method
   static Class93 zm(Class80 var0) {
      return var0.tz;
   }

   public void sq(Map<Integer, petExchange> var1) {
      this.ahb.removeAllChildren();
      ArrayList var2 = new ArrayList();
      Iterator var5;
      Iterator var10000 = var5 = var1.entrySet().iterator();

      label54:
      while (var10000.hasNext()) {
         petExchange var6;
         if ((var6 = (petExchange)((Entry)var5.next()).getValue()).geteType() != 3) {
            var10000 = var5;
         } else {
            int var7;
            for (int var14 = var7 = 0; var14 < var2.size(); var14 = ++var7) {
               if (((petExchange)var2.get(var7)).geteId() > var6.geteId()) {
                  var10000 = var5;
                  var2.add(var7, var6);
                  continue label54;
               }
            }

            var10000 = var5;
            var2.add(var6);
         }
      }

      int var4;
      label38:
      for (int var15 = var4 = 0; var15 < var2.size(); var15 = ++var4) {
         petExchange var10 = (petExchange)var2.get(var4);
         int var11 = this.ahb.getChildCount();

         int var12;
         for (int var16 = var12 = 0; var16 < var11; var16 = ++var12) {
            DefaultMutableTreeNode var8 = (DefaultMutableTreeNode)this.ahb.getChildAt(var12);
            if (var10.getType().equals(var8.toString())) {
               DefaultMutableTreeNode var9 = new DefaultMutableTreeNode(new com.xy.v.Class11(var10.getName(), String.valueOf(var10.geteId())));
               var8.add(var9);
               continue label38;
            }
         }

         DefaultMutableTreeNode var13 = new DefaultMutableTreeNode(var10.getType());
         var13.add(new DefaultMutableTreeNode(new com.xy.v.Class11(var10.getName(), String.valueOf(var10.geteId()))));
         this.ahb.add(var13);
      }
   }

   public boolean ah() {
      if (this.aha == null) {
         return false;
      } else {
         boolean var1 = false;

         int var2;
         for (int var10000 = var2 = 0; var10000 < this.agv.length; var10000 = ++var2) {
            if (this.agv[var2].em() != null) {
               if (this.agv[var2].en().getForeground() != Color.green) {
                  return false;
               }

               var1 = true;
            }
         }

         return var1;
      }
   }

   // $VF: synthetic method
   static JTree zn(Class80 var0) {
      return var0.agy;
   }

   public Class80(Class93 var1) {
      this.tz = var1;
      this.qh = new com.xy.i.Class18[2];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.qh.length; var10000 = var2) {
         com.xy.i.Class18[] var8 = this.qh;
         String var36;
         if (var2 == 1) {
            var36 = "\"m~k~<g !`6";
            var36 = "sc/e/26.png";
         } else {
            var36 = "ty(\u007f(-)ji}";
            var36 = "sc/e/7.png";
         }

         int var10006 = 193 + var2;
         String var42;
         Class93 var10010;
         if (var2 == 0) {
            var42 = "吆扁";
            var42 = "合成";
            var10010 = var1;
         } else if (var2 == 1) {
            var42 = "万锴吏戊";
            var42 = "一键合成";
            var10010 = var1;
         } else {
            var42 = "";
            var10010 = var1;
         }

         com.xy.i.Class18 var10001 = new com.xy.i.Class18(var36, 1, var10006, com.xy.q.Class49.ch, com.xy.q.Class49.bv, var42, var10010.eg());
         var8[var2] = var10001;
         Class80 var9;
         if (var2 == 0) {
            var9 = this;
            this.qh[var2].setBounds(271, 299, 59, 25);
         } else {
            if (var2 == 1) {
               this.qh[var2].setBounds(335, 299, 99, 25);
            }

            var9 = this;
         }

         var9.add(this.qh[var2++]);
      }

      this.ou = new JLabel[4];

      for (int var10 = var2 = 0; var10 < this.ou.length; var10 = ++var2) {
         this.ou[var2] = com.xy.q.Class1.k(47, 57, 150, 19, Color.black, com.xy.q.Class49.ch);
         JLabel var11 = this.ou[var2];
         String var16;
         if (var2 == 0) {
            var16 = "所歭坹吆扁牧咐";
            var16 = "我正在合成物品";
         } else if (var2 == 1) {
            var16 = "吏戊";
            var16 = "合成";
         } else if (var2 == 2) {
            var16 = "涆聆";
            var16 = "消耗";
         } else if (var2 == 3) {
            var16 = "玷釋";
            var16 = "现金";
         } else {
            var16 = "";
         }

         var11.setText(var16);
         this.ou[var2].setHorizontalAlignment(10);
         this.add(this.ou[var2]);
         if (var2 == 1) {
            JLabel var26 = this.ou[var2];
            String var10003 = "-2K\u0014K\u0014K\u0014";
            var26.setForeground(com.xy.q.Class49.c("#cEEEEEE"));
            this.ou[var2].setBounds(306, 220, 27, 14);
            this.ou[var2].setFont(com.xy.q.Class49.bz);
         } else if (var2 >= 2 && var2 <= 3) {
            this.ou[var2].setForeground(Color.white);
            this.ou[var2].setFont(com.xy.q.Class49.n);
            this.ou[var2].setBounds(278, 247 + (var2 - 2) * 25, 36, 19);
         }
      }

      MoneyType var6 = new MoneyType();
      String var34 = "釖钫";
      var6.setIdAndKey(1, "金钱");
      this.agw = com.xy.q.Class1.m(310, 272, 124, 19, 10, Color.white, com.xy.q.Class49.w, var6, var1.afx);
      this.p = com.xy.q.Class1.i(310, 247, 124, 19, 10, Color.white, com.xy.q.Class49.w);
      String var40 = "\"m~j~?f !`6";
      this.agw.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      String var10005 = "id5c56-)ji}";
      this.p.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      this.agw.n(2);
      this.add(this.agw);
      this.add(this.p);
      this.agv = new Class12[5];

      int var3;
      for (int var12 = var3 = 0; var12 < this.agv.length; var12 = var3) {
         this.agv[var3] = new Class12(var1, 0);
         Class80 var13;
         if (var3 < 3) {
            var13 = this;
            this.agv[var3].setBounds(210 + 80 * var3, 100, 55, 70);
         } else {
            this.agv[var3].setBounds(210 + (var3 == 4 ? 160 : 0), 170, 55, 70);
            var13 = this;
         }

         var13.add(this.agv[var3++]);
      }

      this.agu = new com.xy.q.Class54(var1.eg());
      var40 = "}2!5!e !`6";
      this.agu.mt(com.xy.w.Class16.m("sc/d/4.png", 5, 5, 5, 5, false));
      this.agu.wp(com.xy.q.Class54.aum);
      this.agu.setBounds(210, 240, 55, 55);
      this.add(this.agu);
      this.ahb = new DefaultMutableTreeNode("");
      this.sq(var1.yt().aq().getAllPetExchange());
      this.agy = new JTree(this.ahb);
      this.agy.setOpaque(false);
      var34 = "PShb\u007f)vntbIsck\u007f";
      String var38 = "@>`4";
      this.agy.putClientProperty("JTree.lineStyle", "None");
      ((BasicTreeUI)this.agy.getUI()).setLeftChildIndent(0);
      Class114 var7 = new Class114(this);
      var7.setLeafIcon(null);
      var7.setOpenIcon(com.xy.q.Class47.arm);
      var7.setClosedIcon(com.xy.q.Class47.arp);
      var7.setFont(com.xy.q.Class49.ac);
      var7.setBackgroundNonSelectionColor(com.xy.q.Class49.bk);
      var7.setBackgroundSelectionColor(new Color(99, 93, 90));
      var7.setBorderSelectionColor(com.xy.q.Class49.bk);
      var7.setTextNonSelectionColor(Color.white);
      var7.setTextSelectionColor(Color.white);
      this.agy.setCellRenderer(var7);
      this.agy.setRootVisible(false);
      this.agy.setRowHeight(20);
      this.agy.addMouseListener(new Class73(this));
      this.agy.addTreeSelectionListener(new Class96(this));
      this.cp = com.xy.q.Class1.g(50, 98, 145, 230, this.agy, 20);
      this.add(this.cp);
      this.iq = new com.xy.w.Class18[6];

      int var4;
      for (int var14 = var4 = 0; var14 < this.iq.length; var14 = ++var4) {
         this.iq[var4] = new com.xy.w.Class18();
         this.add(this.iq[var4]);
         if (var4 == 0) {
            com.xy.w.Class18 var20 = this.iq[var4];
            String var28 = "id5c50+)ji}";
            var20.dp("sc/d/71.png");
            this.iq[var4].setBounds(279, 213, 78, 30);
         } else if (var4 == 1) {
            com.xy.w.Class18 var21 = this.iq[var4];
            String var29 = "\"m~j~<d !`6";
            var21.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            this.iq[var4].setBounds(47, 78, 144, 21);
         } else if (var4 == 2) {
            com.xy.w.Class18 var22 = this.iq[var4];
            String var30 = "id5c55/)ji}";
            var22.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            this.iq[var4].setBounds(190, 78, 265, 21);
         } else if (var4 == 3) {
            com.xy.w.Class18 var23 = this.iq[var4];
            String var31 = "\"m~j~<e !`6";
            var23.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
            this.iq[var4].setBounds(47, 78, 144, 250);
         } else if (var4 == 4) {
            com.xy.w.Class18 var24 = this.iq[var4];
            String var32 = "id5c55.)ji}";
            var24.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
            this.iq[var4].setBounds(190, 78, 265, 250);
         } else if (var4 == 5) {
            com.xy.w.Class18 var25 = this.iq[var4];
            String var33 = "\"m~j~?h !`6";
            var25.mt(com.xy.w.Class16.m("sc/d/19.png", 5, 5, 5, 5, false));
            this.iq[var4].setBounds(45, 328, 412, 156);
         }
      }

      this.agz = new com.xy.q.Class13(var1.eg(), 8, 3, 51, 51, 0, 0, 46, 330);
      var38 = "id5c56\")ji}";
      this.agz.gt(com.xy.w.Class16.c("sc/d/18.png"));
      this.agz.ol(-1L);
      this.add(this.agz);
   }
}
