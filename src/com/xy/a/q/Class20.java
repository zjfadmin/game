package com.xy.a.q;

import com.xy.bean.LoginResult;
import com.xy.formula.BaseValue;
import com.xy.game.RoleData;
import com.xy.readbean.petExchange;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.plaf.basic.BasicTreeUI;
import javax.swing.tree.DefaultMutableTreeNode;

public class Class20 extends com.xy.q.Class30 {
   private long pr;
   private List<Class51> lf;
   private JScrollPane ps;
   private long pt;
   private petExchange pu;
   private com.xy.i.Class19 pv;
   private com.xy.w.Class18[] pw;
   private com.xy.q.Class14[] nt;
   private int gw = -1;
   private DefaultMutableTreeNode px;
   private com.xy.i.Class19 py;
   private com.xy.q.Class36 ea;
   private JTree pz;
   private long qa = 0L;
   private long qb;
   private com.xy.q.Class27 qc;
   private long qd = -1L;
   private JLabel[] ay;
   private com.xy.w.Class18 af;
   private JComponent qe;
   private com.xy.i.Class19 qf;

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.afx.dh()) {
         this.f();
      }
   }

   public void lm(int var1) {
      if (this.pu != null && this.pu.geteId() == var1) {
         long var2;
         if ((var2 = this.qc.ee() - 1L) > 0L) {
            this.ea.setText(String.valueOf(var2));
            this.h();
         }
      }
   }

   public void ln(petExchange var1) {
      this.pu = var1;
      this.lr(var1);
      if (var1 != null) {
         this.pr = var1.getHp();
         int var2 = 0;
         int var3 = 0;
         int var4 = 0;
         String var5;
         petExchange var34;
         if (!com.xy.v.Class12.h(var5 = var1.getConsume())) {
            int var6 = 0;
            int var7 = 0;

            label142:
            while (true) {
               int var10000 = var7;

               while (var10000 != -1) {
                  String var10002 = "k";
                  var6 = var5.indexOf("|", var7);
                  String var8 = var5.substring(var7, var6 != -1 ? var6 : var5.length());
                  var7 = var6 == -1 ? -1 : var6 + 1;
                  String var10001 = ")\u0010";
                  if (var8.startsWith("G=")) {
                     var10001 = "*";
                     var6 = var8.indexOf("=", 2);
                     BigDecimal var9 = new BigDecimal(var8.substring(2, var6));
                     int var10 = Integer.parseInt(var8.substring(var6 + 1));
                     Class51 var33 = this.lo(var4);
                     int var44 = var2;
                     com.xy.v.Class8 var10004 = this.yt();
                     var2++;
                     var33.wc(var44, var10, var10, var10004.ay(var9));
                     var4++;
                     var10000 = var7;
                  } else {
                     var10001 = "洖勵\u0010";
                     if (!var8.startsWith("活力=")) {
                        continue label142;
                     }

                     var10000 = var7;
                     this.pt = Long.parseLong(var8.substring(3));
                  }
               }

               var34 = var1;
               break;
            }
         } else {
            var34 = var1;
         }

         if ((var5 = var34.getSkin()) != null && !var5.equals("")) {
            int var21 = 0;
            int var25;
            int var35 = var25 = 0;

            label127:
            while (var35 != -1) {
               String var51 = "k";
               var21 = var5.indexOf("|", var25);
               String var28 = var5.substring(var25, var21 != -1 ? var21 : var5.length());
               var25 = var21 == -1 ? -1 : var21 + 1;
               String var46 = "牄咯\u0010";
               if (!var28.startsWith("物品=")) {
                  var35 = var25;
               } else {
                  var46 = "1";

                  String[] var30;
                  int var32;
                  for (int var36 = var32 = (var30 = var28.split("&")).length - 1; var36 >= 1; var36 = --var32) {
                     String var37 = var30[var32];
                     var46 = "2\t";
                     String[] var38 = var37.split("\\$");
                     double var12 = Double.parseDouble(var38[2]);
                     int var14 = Integer.parseInt(var38[1]);
                     String var39 = var38[0];
                     var46 = ":";
                     String[] var15 = var39.split("-");

                     int var16;
                     for (int var40 = var16 = 0; var40 < var15.length; var40 = ++var16) {
                        Class51 var17 = this.lo(var4);
                        if (var30.length == 2 && var15.length == 1 && var12 >= 100.0) {
                           var17.wc(100 + var3, var14, var14, this.yt().ay(new BigDecimal(var15[var16])));
                        } else {
                           var17.wc(100 + var3, 0, var14, this.yt().ay(new BigDecimal(var15[var16])));
                        }

                        var3++;
                        var4++;
                        if (var3 >= 5) {
                           break label127;
                        }
                     }
                  }

                  var35 = var25;
               }
            }
         }

         short var23 = 0;
         short var26 = 0;
         int var41;
         if (var2 == 3) {
            var23 = 313;
            var41 = var3;
         } else if (var2 == 5) {
            var23 = 249;
            var41 = var3;
         } else if (var2 == 4) {
            var23 = 286;
            var41 = var3;
         } else if (var2 == 2) {
            var23 = 340;
            var41 = var3;
         } else {
            var23 = 377;
            var41 = var3;
         }

         if (var41 == 3) {
            var26 = 313;
         } else if (var3 == 5) {
            var26 = 249;
         } else if (var3 == 4) {
            var26 = 286;
         } else if (var3 == 2) {
            var26 = 340;
         } else {
            var26 = 377;
         }

         int var29;
         for (int var42 = var29 = 0; var42 < this.lf.size(); var42 = ++var29) {
            Class51 var31;
            if (Class51.wb(var31 = this.lf.get(var29)) < 100) {
               var31.setBounds(var23 + 64 * Class51.wb(var31), 263, 54, 54);
            } else {
               var31.setBounds(var26 + 64 * (Class51.wb(var31) - 100), 166, 54, 54);
            }
         }

         String var50 = "\u0014W\u0014";
         this.ea.setText("999");
      }
   }

   public Class51 lo(int var1) {
      if (var1 < this.lf.size()) {
         return this.lf.get(var1);
      } else {
         Class51 var2 = new Class51(this);
         this.add(var2, 5);
         this.lf.add(var2);
         return var2;
      }
   }

   // $VF: synthetic method
   private void f() {
      LoginResult var1;
      LoginResult var10000 = var1 = this.yx().getLoginResult();
      String var10001 = "聡乴熲纭庋";
      long var2;
      long var4;
      if ((var4 = BaseValue.getFZLvl(var2 = var10000.getScoretype("职业熟练度").longValue())) != this.qa) {
         this.qa = var4;
         this.nt[0].setText(String.valueOf(this.qa));
         com.xy.q.Class14 var8 = this.nt[1];
         StringBuilder var10 = new StringBuilder(String.valueOf(this.qd));
         String var10002 = "8";
         var8.setText(var10.append("/").append(BaseValue.getFZExp(this.qa + 1L)).toString());
      }

      if ((var4 = var2 - BaseValue.getFZTotalExp(this.qa)) != this.qd) {
         this.qd = var4;
         com.xy.q.Class14 var9 = this.nt[1];
         StringBuilder var11 = new StringBuilder(String.valueOf(this.qd));
         String var13 = "\u0002";
         var9.setText(var11.append("/").append(BaseValue.getFZExp(this.qa + 1L)).toString());
      }

      var10001 = "浖劌";
      var4 = var1.getScoretype("活力").longValue();
      if (var2 != this.qb) {
         this.qb = var4;
         this.nt[3].setText(String.valueOf(this.qb));
      }
   }

   public Class20(GameView var1) {
      super(-1, -1, com.xy.q.Class30.agf, var1);
      this.qb = 0L;
      this.yy(0, 0, 622, 462, com.xy.q.Class30.agf);
      this.lf = new ArrayList<>();
      String var10009 = "d\u000e8\b8^&Cg\u0003p";
      String var10014 = "甲N亊";
      this.py = new com.xy.i.Class19("sc/e/31.png", 1, 291, com.xy.q.Class49.ch, null, "生 产", this);
      this.py.setForeground(Color.black);
      this.py.setBounds(449, 392, 79, 25);
      this.add(this.py);
      this.qe = new Class96(this);
      this.qe.setBounds(0, 0, 622, 462);
      this.qe.addMouseListener(com.xy.q.Class1.c);
      this.qe.setVisible(false);
      this.add(this.qe);
      var10014 = "d\u000e8\u000f8/&Z\"Cg\u0003p";
      this.pv = new com.xy.i.Class19("sc/b/B175.png", 1, 292, this);
      String var10013 = "^\r\u0002\f\u0002,\u001cY\u001b@]\u0000J";
      this.qf = new com.xy.i.Class19("sc/b/B176.png", 1, 292, this);
      this.pv.setBounds(62, 63, 16, 82);
      this.qf.setBounds(202, 63, 16, 82);
      this.af = new com.xy.w.Class18();
      this.af.setBounds(78, 64, 124, 80);
      this.add(this.pv);
      this.add(this.qf);
      this.add(this.af);
      this.ay = new JLabel[8];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.ay.length; var10000 = ++var2) {
         this.ay[var2] = com.xy.q.Class1.k(283, 72 + 23 * var2, 58, 19, Color.black, com.xy.q.Class49.ch);
         JLabel var7 = this.ay[var2];
         String var13;
         if (var2 == 0) {
            var13 = "笤7M纰";
            var13 = "等  级";
         } else if (var2 == 1) {
            var13 = "熲纭庋";
            var13 = "熟练度";
         } else if (var2 == 2) {
            var13 = "洬勶倫";
            var13 = "活力值";
         } else if (var2 == 3) {
            var13 = "淦耺浕劶";
            var13 = "消耗活力";
         } else if (var2 == 4) {
            var13 = "淥耀斛镨";
            var13 = "消耗时长";
         } else if (var2 == 5) {
            var13 = "剘佱攞釢";
            var13 = "制作数量";
         } else if (var2 == 6) {
            var13 = "抈朞";
            var13 = "拥有";
         } else if (var2 == 7) {
            var13 = "攞釢";
            var13 = "数量";
         } else {
            var13 = "";
         }

         var7.setText(var13);
         this.ay[var2].setHorizontalAlignment(0);
         this.add(this.ay[var2]);
         if (var2 >= 3 && var2 <= 5) {
            this.ay[var2].setForeground(Color.white);
            this.ay[var2].setBounds(276, 337 + 29 * (var2 - 3), 72, 19);
         }

         if (var2 >= 6 && var2 <= 7) {
            this.ay[var2].setForeground(Color.white);
            this.ay[var2].setBounds(69 + 101 * (var2 - 6), 167, 36, 19);
         }
      }

      this.nt = new com.xy.q.Class14[6];

      for (int var8 = var2 = 0; var8 < this.nt.length; var8 = var2) {
         this.nt[var2] = com.xy.q.Class1.i(344, 72 + 23 * var2, 119, 19, 10, Color.white, com.xy.q.Class49.w);
         com.xy.q.Class14 var9 = this.nt[var2];
         String var21 = "d\u000e8\t8\\ Cg\u0003p";
         var9.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
         Class20 var10;
         if (var2 >= 3 && var2 <= 4) {
            var10 = this;
            this.nt[var2].setBounds(359, 337 + 29 * (var2 - 3), 165, 19);
         } else {
            if (var2 == 5) {
               this.nt[var2].setBounds(58, 146, 165, 19);
            }

            var10 = this;
         }

         var10.add(this.nt[var2++]);
      }

      for (int var11 = var2 = 0; var11 < 5; var11 = var2) {
         this.nt[var2++].setText("0");
      }

      String var10005 = "^\r\u0002\n\u0002_\u001a@]\u0000J";
      this.ea = com.xy.q.Class1.j(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false), com.xy.q.Class49.w, Color.white);
      this.ea.setBounds(357, 395, 77, 19);
      this.add(this.ea);
      this.qc = new com.xy.q.Class27(15, this.ea, this);
      this.px = new DefaultMutableTreeNode("");
      this.px.add(new DefaultMutableTreeNode(""));
      this.pz = new JTree(this.px);
      this.pz.setOpaque(false);
      String var10003 = "]9e\brC{\u0004y\bD\u0019n\u0001r";
      String var10004 = " B\u0000H";
      this.pz.putClientProperty("JTree.lineStyle", "None");
      ((BasicTreeUI)this.pz.getUI()).setLeftChildIndent(0);
      Class72 var6 = new Class72(this);
      var6.setLeafIcon(null);
      var6.setOpenIcon(com.xy.q.Class47.arm);
      var6.setClosedIcon(com.xy.q.Class47.arp);
      var6.setFont(com.xy.q.Class49.ac);
      var6.setBackgroundNonSelectionColor(com.xy.q.Class49.bk);
      var6.setBackgroundSelectionColor(new Color(99, 93, 90));
      var6.setBorderSelectionColor(com.xy.q.Class49.bk);
      var6.setTextNonSelectionColor(Color.white);
      var6.setTextSelectionColor(Color.white);
      this.pz.setCellRenderer(var6);
      this.pz.setRootVisible(false);
      this.pz.setRowHeight(20);
      this.pz.addMouseListener(new Class110(this));
      this.pz.addTreeSelectionListener(new Class91(this));
      this.ps = com.xy.q.Class1.g(61, 187, 162, 238, this.pz, -1);
      this.add(this.ps);
      this.pw = new com.xy.w.Class18[7];

      int var3;
      for (int var12 = var3 = 0; var12 < this.pw.length; var12 = ++var3) {
         this.pw[var3] = new com.xy.w.Class18();
         this.add(this.pw[var3]);
         if (var3 == 0) {
            com.xy.w.Class18 var23 = this.pw[var3];
            String var30 = "d\u000e8\t8_\"Cg\u0003p";
            var23.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            this.pw[var3].setBounds(58, 166, 165, 21);
         } else if (var3 == 1) {
            com.xy.w.Class18 var24 = this.pw[var3];
            String var31 = "^\r\u0002\n\u0002\\\u0019@]\u0000J";
            var24.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
            this.pw[var3].setBounds(58, 166, 165, 261);
         } else if (var3 == 2) {
            com.xy.w.Class18 var25 = this.pw[var3];
            String var32 = "d\u000e8\t8^!Cg\u0003p";
            var25.mt(com.xy.w.Class16.m("sc/d/36.png", 16, 16, 16, 16, false));
            this.pw[var3].setBounds(228, 63, 351, 81);
         } else if (var3 == 3) {
            com.xy.w.Class18 var26 = this.pw[var3];
            String var33 = "^\r\u0002\n\u0002W\u001f@]\u0000J";
            var26.dp("sc/d/92.png");
            this.pw[var3].setBounds(376, 223, 56, 30);
         } else if (var3 == 4) {
            com.xy.w.Class18 var27 = this.pw[var3];
            String var34 = "d\u000e8\t8^!Cg\u0003p";
            var27.mt(com.xy.w.Class16.m("sc/d/36.png", 16, 16, 16, 16, false));
            this.pw[var3].setBounds(302, 255, 203, 69);
         } else if (var3 == 5) {
            com.xy.w.Class18 var28 = this.pw[var3];
            String var35 = "^\r\u0002\n\u0002Z\u0014@]\u0000J";
            var28.mt(com.xy.w.Class16.m("sc/d/49.png", 5, 5, 5, 5, false));
            this.pw[var3].setBounds(228, 147, 351, 280);
         } else if (var3 == 6) {
            com.xy.w.Class18 var29 = this.pw[var3];
            String var36 = "d\u000e8\t8^!Cg\u0003p";
            var29.mt(com.xy.w.Class16.m("sc/d/36.png", 16, 16, 16, 16, false));
            this.pw[var3].setBounds(45, 54, 549, 383);
         }
      }
   }

   // $VF: synthetic method
   static JTree lp(Class20 var0) {
      return var0.pz;
   }

   // $VF: synthetic method
   static JScrollPane lq(Class20 var0) {
      return var0.ps;
   }

   public long ee() {
      if (this.pu == null) {
         return 0L;
      } else {
         LoginResult var10000 = this.yx().getLoginResult();
         String var10001 = "浖劌";
         long var1 = var10000.getScoretype("活力").longValue() / (this.pt != 0L ? this.pt : 999L);

         int var3;
         for (int var6 = var3 = 0; var6 < this.lf.size(); var6 = ++var3) {
            Class51 var4;
            if (Class51.wb(var4 = this.lf.get(var3)) < 100 && var1 > 0L) {
               int var5 = var4.lj();
               if (var1 > var5) {
                  var1 = var5;
               }
            }
         }

         return var1;
      }
   }

   public void bi(int var1) {
      Class20 var10000;
      label76: {
         if (var1 == -1) {
            if ((var1 = this.gw + 1) > 6) {
               var1 = 1;
               var10000 = this;
               break label76;
            }
         } else if (var1 == -2 && (var1 = this.gw - 1) < 1) {
            var1 = 6;
         }

         var10000 = this;
      }

      if (var10000.gw != var1) {
         this.gw = var1;
         String var10007 = "\u001dNAOA~";
         this.af.dq("sc/b/S" + (315 + var1) + ".png");
         var1 = 5000 + this.gw;
         this.ln(null);
         this.px.removeAllChildren();
         ArrayList var2 = new ArrayList();
         Iterator var5;
         Iterator var15 = var5 = this.yt().aq().getAllPetExchange().entrySet().iterator();

         label71:
         while (var15.hasNext()) {
            petExchange var6;
            if ((var6 = (petExchange)((Entry)var5.next()).getValue()).geteType() != var1) {
               var15 = var5;
            } else {
               int var7;
               for (int var16 = var7 = 0; var16 < var2.size(); var16 = ++var7) {
                  if (((petExchange)var2.get(var7)).geteId() > var6.geteId()) {
                     var15 = var5;
                     var2.add(var7, var6);
                     continue label71;
                  }
               }

               var15 = var5;
               var2.add(var6);
            }
         }

         int var4;
         label55:
         for (int var17 = var4 = 0; var17 < var2.size(); var17 = ++var4) {
            petExchange var11 = (petExchange)var2.get(var4);
            int var12 = this.px.getChildCount();

            int var13;
            for (int var18 = var13 = 0; var18 < var12; var18 = ++var13) {
               DefaultMutableTreeNode var8 = (DefaultMutableTreeNode)this.px.getChildAt(var13);
               if (var11.getType().equals(var8.toString())) {
                  DefaultMutableTreeNode var9 = new DefaultMutableTreeNode(new com.xy.v.Class11(var11.getName(), String.valueOf(var11.geteId())));
                  var8.add(var9);
                  continue label55;
               }
            }

            DefaultMutableTreeNode var14 = new DefaultMutableTreeNode(var11.getType());
            var14.add(new DefaultMutableTreeNode(new com.xy.v.Class11(var11.getName(), String.valueOf(var11.geteId()))));
            this.px.add(var14);
         }

         if (this.pz != null) {
            this.pz.updateUI();
         }
      }
   }

   public void y(int var1) {
      if (this.afx.getGameReadBar().readBarType == 2 || this.afx.getGameReadBar().readBarType == 3) {
         this.afx.getGameReadBar().setReadBar(0, 0, null, 0.0, 0L, null);
      }

      this.f();
      this.cr(false);
      this.bi(this.yx().getPackRecord().getFZType());
   }

   public void cr(boolean var1) {
      this.qe.setVisible(var1);
      String var2;
      if (var1) {
         var2 = "倲歏";
         var2 = "停止";
      } else {
         var2 = "畲亰";
         var2 = "生产";
      }

      this.py.setText(var2);
   }

   // $VF: synthetic method
   private void lr(petExchange var1) {
      Class20 var10000;
      if (var1 == null) {
         var10000 = this;
         this.py.setVisible(false);
      } else if (var1.geteType() != 5000 + this.yx().getPackRecord().getFZType()) {
         String var10002 = "d\u000e8\b8X/Cg\u0003p";
         this.py.setBtn(-1, "sc/e/58.png");
         var10000 = this;
         this.py.setVisible(true);
      } else {
         var10000 = this;
         String var10003 = "^\r\u0002\u000b\u0002]\u001c@]\u0000J";
         this.py.setBtn(1, "sc/e/31.png");
         this.py.setVisible(true);
      }

      var10000.pt = 0L;
      int var3 = 0;
      this.pr = 0L;

      for (int var2 = 0; var3 < this.lf.size(); var3 = var2) {
         Class51 var4 = this.lf.get(var2);
         var2++;
         var4.wc(-1, 0, 0, null);
      }

      if (var1 == null) {
         this.nt[3].setText("0");
         this.nt[4].setText("0");
         this.ea.setText("0");
      }
   }

   public void h() {
      if (this.pu != null) {
         RoleData var1;
         if ((var1 = this.yx()).getPackRecord().getFZType() != this.pu.geteType() - 5000) {
            GameView var5 = this.afx;
            String var18 = "位盪剂耢丷乣昂";
            StringBuilder var9 = new StringBuilder("你的副职业不是");
            String var12;
            if (this.pu.geteType() == 5001) {
               var12 = "由牰";
               var12 = "畜牧";
            } else if (this.pu.geteType() == 5002) {
               var12 = "禣椠";
               var12 = "种植";
            } else if (this.pu.geteType() == 5003) {
               var12 = "醪矨";
               var12 = "采矿";
            } else if (this.pu.geteType() == 5004) {
               var12 = "寘党";
               var12 = "家具";
            } else if (this.pu.geteType() == 5005) {
               var12 = "剛荸";
               var12 = "制药";
            } else {
               var12 = "筈斪";
               var12 = "符文";
            }

            var5._do(var9.append(var12).toString());
         } else {
            if (this.pu.getPid() != null) {
               LoginResult var10001 = var1.getLoginResult();
               String var10002 = "聛乷熈纮庱";
               long var2 = BaseValue.getFZLvl(var10001.getScoretype("职业熟练度").longValue());
               if (this.pu.getPid().longValue() > var2) {
                  GameView var10000 = this.afx;
                  StringBuilder var8 = new StringBuilder().append(this.pu.getPid());
                  var10002 = "纊覍锬鄣斔";
                  var10000._do(var8.append("级解锁配方").toString());
                  return;
               }
            }

            if (this.qc.ee() <= 0L) {
               String var7 = "诠迾兲畲亰攝釘";
               this.afx._do("请输入生产数量");
            } else if (this.ee() <= 0L) {
               String var6 = "缗両趞奱皩朾斴";
               this.afx._do("缺乏足够的材料");
            } else {
               String var10003 = "Q7V";
               String var4 = Agreement.getSendTextAES("clickmonsters", "FZA" + this.pu.geteId());
               this.za().k(var4);
            }
         }
      }
   }

   public boolean du(long var1, JTextField var3) {
      return true;
   }

   public Long dt(long var1, JTextField var3) {
      if (var1 <= 1L) {
         return 1L;
      } else if (var1 > 999L) {
         return 999L;
      } else {
         long var4;
         if ((var4 = this.ee()) <= 0L) {
            var4 = 1L;
         }

         return var1 > var4 ? var4 : null;
      }
   }

   public boolean ls() {
      return !this.qe.isVisible();
   }

   public void ds(long var1, JTextField var3) {
      if (this.pu != null) {
         int var4;
         for (int var10000 = var4 = 0; var10000 < this.lf.size(); var10000 = var4) {
            Class51 var13 = this.lf.get(var4);
            var4++;
            var13.n((int)var1);
         }

         this.nt[3].setText(String.valueOf(this.pt * var1));
         if (this.pu.getPid() != null) {
            LoginResult var10001 = this.yx().getLoginResult();
            String var10002 = "聡乴熲纭庋";
            long var9 = BaseValue.getFZLvl(var10001.getScoretype("职业熟练度").longValue());
            if (this.pu.getPid().longValue() > var9) {
               com.xy.q.Class14 var14 = this.nt[4];
               StringBuilder var15 = new StringBuilder().append(this.pu.getPid());
               var10002 = "纰覎锖鄠斮";
               var14.setText(var15.append("级解锁配方").toString());
               return;
            }
         }

         StringBuffer var10 = new StringBuffer();
         this.pr = 60L;
         long var5;
         long var7;
         if ((var7 = (var5 = this.pr * var1) / 3600L) > 0L) {
            var10.append(var7);
            String var16 = "旛";
            var10.append("时");
         }

         if ((var7 = var5 / 60L % 60L) > 0L) {
            var10.append(var7);
            String var17 = "刑";
            var10.append("分");
         }

         if ((var7 = var5 % 60L) > 0L) {
            var10.append(var7);
            String var18 = "秿";
            var10.append("秒");
         }

         this.nt[4].setText(var10.toString());
      }
   }

   public void g(int var1) {
      if (var1 == 291) {
         if (this.afx.getGameReadBar().readBarType != 2 && this.afx.getGameReadBar().readBarType != 3) {
            this.h();
         } else {
            this.afx.getGameReadBar().setReadBar(0, 0, null, 0.0, 0L, null);
         }
      } else if (var1 == 292) {
         this.bi(-2);
      } else {
         if (var1 == 293) {
            this.bi(-1);
         }
      }
   }

   public boolean dh() {
      return this.qe.isVisible();
   }
}
