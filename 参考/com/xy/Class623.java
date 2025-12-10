package com.xy;

import com.xy.bean.LoginResult;
import com.xy.formula.BaseValue;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.readbean.petExchange;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.plaf.basic.BasicTreeUI;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreePath;

public class Class623 extends Class345 {
   private DefaultMutableTreeNode yt;
   private long yu;
   private Class217 yv;
   private JLabel[] yw;
   private int ek;
   private Class245[] vg;
   private long yx;
   private long yy;
   private JComponent yz;
   private JScrollPane za;
   private Class529 zb;
   private List<null> zc;
   private Class529 xg;
   private long zd;
   private Class529 ui;
   private petExchange ze;
   private long gf;
   private Class436 r;
   private JTree zf;
   private Class436[] an;
   private Class319 zg;

   public void bu(petExchange var1) {
      this.ze = var1;
      this.bv(var1);
      if (var1 != null) {
         this.yy = (long)var1.getHp();
         int var6 = 3 ^ 3;
         int var7 = 3 & 4;
         int var4 = 5 >> 3;
         int var2;
         int var3;
         String var5;
         String var8;
         int var10;
         int var10000;
         int var10001;
         petExchange var22;
         if (!Class394.o(var5 = var1.getConsume())) {
            var2 = 3 & 4;
            var3 = 5 >> 3;

            label139:
            while(true) {
               var10000 = var3;

               while(var10000 != -1) {
                  var2 = var5.indexOf("|", var3);
                  var8 = var5.substring(var3, var2 != -4 >> 2 ? var2 : var5.length());
                  var3 = var2 == -4 >> 2 ? -4 >> 2 : var2 + (2 ^ 3);
                  if (var8.startsWith("G=")) {
                     var2 = var8.indexOf("=", --2);
                     BigDecimal var9 = new BigDecimal(var8.substring(5 >> 1, var2));
                     var10 = Integer.parseInt(var8.substring(var2 + (4 ^ 5)));
                     <undefinedtype> var21 = this.pf(var4);
                     var10001 = var6;
                     Class603 var10004 = this.vc();
                     ++var6;
                     var21.aha(var10001, var10, var10, var10004.n(var9));
                     ++var4;
                     var10000 = var3;
                  } else {
                     if (!var8.startsWith("活力=")) {
                        continue label139;
                     }

                     var10000 = var3;
                     this.yu = Long.parseLong(var8.substring(--3));
                  }
               }

               var22 = var1;
               break;
            }
         } else {
            var22 = var1;
         }

         if ((var5 = var22.getSkin()) != null && !var5.equals("")) {
            var2 = 3 >> 2;
            var10000 = var3 = 3 ^ 3;

            label124:
            while(true) {
               while(true) {
                  if (var10000 == -1) {
                     break label124;
                  }

                  var2 = var5.indexOf("|", var3);
                  var8 = var5.substring(var3, var2 != -4 >> 2 ? var2 : var5.length());
                  var3 = var2 == -4 >> 2 ? -4 >> 2 : var2 + --1;
                  if (!var8.startsWith("物品=")) {
                     var10000 = var3;
                  } else {
                     String[] var19;
                     for(var10000 = var10 = (var19 = var8.split("&")).length - (2 ^ 3); var10000 >= 1; var10000 = var10) {
                        String[] var23 = var19[var10].split("\\$");
                        double var12 = Double.parseDouble(var23[--2]);
                        int var16 = Integer.parseInt(var23[--1]);
                        String[] var11 = var23[2 & 5].split("-");

                        int var14;
                        for(var10000 = var14 = 2 & 5; var10000 < var11.length; var10000 = var14) {
                           <undefinedtype> var15 = this.pf(var4);
                           if (var19.length == (1 ^ 3) && var11.length == (2 ^ 3) && var12 >= 100.0D) {
                              var15.aha((109 & 118) + var7, var16, var16, this.vc().n(new BigDecimal(var11[var14])));
                           } else {
                              var15.aha((116 & 111) + var7, 3 & 4, var16, this.vc().n(new BigDecimal(var11[var14])));
                           }

                           ++var7;
                           var10001 = --5;
                           ++var4;
                           if (var7 >= var10001) {
                              break label124;
                           }

                           ++var14;
                        }

                        --var10;
                     }

                     var10000 = var3;
                  }
               }
            }
         }

         boolean var17 = false;
         var3 = 3 ^ 3;
         if (var6 == --3) {
            var2 = 24061 & 9019;
            var10000 = var7;
         } else if (var6 == --5) {
            var2 = 12797 & 20219;
            var10000 = var7;
         } else if (var6 == --4) {
            var2 = 7103 & 25950;
            var10000 = var7;
         } else if (var6 == --2) {
            var2 = 3060 & 30047;
            var10000 = var7;
         } else {
            var2 = 377;
            var10000 = var7;
         }

         if (var10000 == 3) {
            var3 = 2365 & 30715;
         } else if (var7 == 5) {
            var3 = 5375 & 27641;
         } else if (var7 == 4) {
            var3 = 32159 & 894;
         } else if (var7 == 2) {
            var3 = 18812 & 14295;
         } else {
            var3 = 377;
         }

         int var18;
         for(var10000 = var18 = 0; var10000 < this.zc.size(); var10000 = var18) {
            <undefinedtype> var20;
            if ((var20 = (<undefinedtype>)this.zc.get(var18)).aqa < (102 & 125)) {
               var20.setBounds(var2 + (84 & 107) * var20.aqa, 9015 & 24015, 54 & 127, 54 & 127);
            } else {
               var20.setBounds(var3 + (98 & 93) * (var20.aqa - (110 & 117)), 166, 54, 54);
            }

            ++var18;
         }

         this.yv.setText("999");
      }
   }

   public void z(long var1, JTextField var3) {
      if (this.ze != null) {
         int var4;
         for(int var10000 = var4 = 0; var10000 < this.zc.size(); var10000 = var4) {
            <undefinedtype> var9 = (<undefinedtype>)this.zc.get(var4);
            ++var4;
            var9.y((int)var1);
         }

         this.vg[--3].setText(String.valueOf(this.yu * var1));
         if (this.ze.getPid() != null) {
            long var7 = BaseValue.getFZLvl(this.vd().getLoginResult().getScoretype("职业熟练度").longValue());
            if (this.ze.getPid().longValue() > var7) {
               this.vg[--4].setText(this.ze.getPid() + "级解锁配方");
               return;
            }
         }

         StringBuffer var8 = new StringBuffer();
         this.yy = 60L;
         long var5;
         if ((var1 = (var5 = this.yy * var1) / 3600L) > 0L) {
            var8.append(var1);
            var8.append("时");
         }

         if ((var1 = var5 / 60L % 60L) > 0L) {
            var8.append(var1);
            var8.append("分");
         }

         if ((var1 = var5 % 60L) > 0L) {
            var8.append(var1);
            var8.append("秒");
         }

         this.vg[--4].setText(var8.toString());
      }
   }

   public boolean pd() {
      return (boolean)(this.yz.isVisible() ? 3 >> 2 : 1);
   }

   public Class623(GameView var1) {
      int var10001 = 41 & 94;
      int var10008 = 3 ^ 3;
      int var10016 = -4 >> 2;
      super(-4 >> 2, -4 >> 2, Class345.aei, var1);
      this.ek = var10016;
      this.gf = 0L;
      this.yx = -1L;
      this.zd = 0L;
      this.va(var10008, 3 >> 2, 18030 & 15359, 29135 & 4094, Class345.aei);
      this.zc = new ArrayList();
      this.xg = new Class529("sc/e/31.png", 3 & 5, 11055 & 22003, Class681.ak, (Color[])null, "生 产", this);
      this.xg.setForeground(Color.black);
      this.xg.setBounds(24569 & 8647, 8077 & 25082, 95 & 111, 59 & 93);
      this.add(this.xg);
      this.yz = new JComponent() {
         protected void paintComponent(Graphics var1) {
            Graphics2D var2 = (Graphics2D)var1;
            var2.setComposite(Class8.n);
            var2.setColor(Color.BLACK);
            var2.fill(this.getBounds());
            var2.dispose();
         }
      };
      this.yz.setBounds(3 & 4, 3 & 4, 17263 & 16126, 5119 & 28110);
      this.yz.addMouseListener(Class133.a);
      this.yz.setVisible((boolean)(3 & 4));
      this.add(this.yz);
      this.zb = new Class529("sc/b/B175.png", --1, 14134 & 18925, this);
      this.ui = new Class529("sc/b/B176.png", 3 >> 1, 19327 & 13732, this);
      this.zb.setBounds(127 & 62, 127 & 63, 124 & 19, 127 & 82);
      this.ui.setBounds(202, 63, 16, 82);
      this.r = new Class436();
      this.r.setBounds(78, 64, 124, 80);
      this.add(this.zb);
      this.add(this.ui);
      this.add(this.r);
      JLabel[] var5 = new JLabel[var10001];
      boolean var10003 = true;
      this.yw = var5;

      int var2;
      int var10000;
      for(var10000 = var2 = 3 & 4; var10000 < this.yw.length; var10000 = var2) {
         this.yw[var2] = Class133.b(283, 72 + 23 * var2, 58, 19, Color.black, Class681.ak);
         this.yw[var2].setText(var2 == 0 ? "等  级" : (var2 == --1 ? "熟练度" : (var2 == (1 ^ 3) ? "活力值" : (var2 == --3 ? "消耗活力" : (var2 == --4 ? "消耗时长" : (var2 == --5 ? "制作数量" : (var2 == 6 ? "拥有" : (var2 == 7 ? "数量" : ""))))))));
         this.yw[var2].setHorizontalAlignment(3 & 4);
         this.add(this.yw[var2]);
         if (var2 >= --3 && var2 <= --5) {
            this.yw[var2].setForeground(Color.white);
            this.yw[var2].setBounds(276, 337 + 29 * (var2 - --3), 72, 19);
         }

         if (var2 >= 6 && var2 <= 7) {
            this.yw[var2].setForeground(Color.white);
            this.yw[var2].setBounds(69 + 101 * (var2 - 6), 167, 36, 19);
         }

         ++var2;
      }

      Class245[] var6 = new Class245[6];
      var10003 = true;
      this.vg = var6;

      for(var10000 = var2 = 3 ^ 3; var10000 < this.vg.length; var10000 = var2) {
         this.vg[var2] = Class133.a(344, 72 + 23 * var2, 119, 19, 10, Color.white, Class681.q);
         this.vg[var2].eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(3 ^ 3)));
         Class623 var4;
         if (var2 >= --3 && var2 <= --4) {
            var4 = this;
            this.vg[var2].setBounds(359, 337 + 29 * (var2 - --3), 165, 19);
         } else {
            if (var2 == --5) {
               this.vg[var2].setBounds(58, 146, 165, 19);
            }

            var4 = this;
         }

         var4.add(this.vg[var2++]);
      }

      for(var10000 = var2 = 5 >> 3; var10000 < 5; var10000 = var2) {
         this.vg[var2++].setText("0");
      }

      this.yv = Class133.n(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(2 & 5)), Class681.q, Color.white);
      this.yv.setBounds(357, 395, 77, 19);
      this.add(this.yv);
      this.zg = new Class319(15, this.yv, this);
      this.yt = new DefaultMutableTreeNode("");
      this.yt.add(new DefaultMutableTreeNode(""));
      this.zf = new JTree(this.yt);
      this.zf.setOpaque((boolean)(3 & 4));
      this.zf.putClientProperty("JTree.lineStyle", "None");
      ((BasicTreeUI)this.zf.getUI()).setLeftChildIndent(2 & 5);
      DefaultTreeCellRenderer var3 = new DefaultTreeCellRenderer() {
         public Component getTreeCellRendererComponent(JTree var1, Object var2, boolean var3, boolean var4, boolean var5, int var6, boolean var7) {
            DefaultMutableTreeNode var8;
            DefaultMutableTreeNode var10000 = var8 = (DefaultMutableTreeNode)var2;
            super.getTreeCellRendererComponent(var1, var2, var3, var4, var5, var6, var7);
            if (var10000.getUserObject() instanceof Class656) {
               Class656 var9 = (Class656)var8.getUserObject();
               this.setText(var9.f());
            }

            return this;
         }
      };
      var3.setLeafIcon((Icon)null);
      var3.setOpenIcon(Class512.azt);
      var3.setClosedIcon(Class512.azr);
      var3.setFont(Class681.ce);
      var3.setBackgroundNonSelectionColor(Class681.cu);
      var3.setBackgroundSelectionColor(new Color(99, 93, 90));
      var3.setBorderSelectionColor(Class681.cu);
      var3.setTextNonSelectionColor(Color.white);
      var3.setTextSelectionColor(Color.white);
      this.zf.setCellRenderer(var3);
      this.zf.setRootVisible((boolean)(3 ^ 3));
      this.zf.setRowHeight(20);
      this.zf.addMouseListener(new MouseAdapter() {
         public void mouseClicked(MouseEvent var1) {
            TreePath var2;
            if (SwingUtilities.isLeftMouseButton(var1) && (var2 = Class623.this.zf.getSelectionPath()) != null) {
               if (Class623.this.zf.isExpanded(var2)) {
                  Class623.this.zf.collapsePath(var2);
                  return;
               }

               Class623.this.zf.expandPath(var2);
            }

         }
      });
      this.zf.addTreeSelectionListener(new TreeSelectionListener() {
         public void valueChanged(TreeSelectionEvent var1) {
            DefaultMutableTreeNode var2;
            if ((var2 = (DefaultMutableTreeNode)((JTree)var1.getSource()).getLastSelectedPathComponent()) == null) {
               Class623.this.za.setViewportView((Component)null);
            } else {
               if (var2.getUserObject() instanceof Class656) {
                  int var3 = Integer.parseInt(((Class656)var2.getUserObject()).a());
                  Class623.this.bu(Class623.this.vc().as(var3));
               }

            }
         }
      });
      this.za = Class133.f(61, 187, 162, 238, this.zf, -4 >> 2);
      this.add(this.za);
      Class436[] var7 = new Class436[7];
      var10003 = true;
      this.an = var7;

      for(var10000 = var2 = 3 >> 2; var10000 < this.an.length; var10000 = var2) {
         this.an[var2] = new Class436();
         this.add(this.an[var2]);
         if (var2 == 0) {
            this.an[var2].eq(Class511.q("sc/d/25.png", 1 ^ 3, 1 ^ 3, 1 ^ 3, 1 ^ 3, (boolean)(3 ^ 3)));
            this.an[var2].setBounds(58, 166, 165, 21);
         } else if (var2 == (2 ^ 3)) {
            this.an[var2].eq(Class511.q("sc/d/24.png", --2, --2, --2, --2, false));
            this.an[var2].setBounds(58, 166, 165, 261);
         } else if (var2 == 2) {
            this.an[var2].eq(Class511.q("sc/d/36.png", 16, 16, 16, 16, false));
            this.an[var2].setBounds(228, 63, 351, 81);
         } else if (var2 == 3) {
            this.an[var2].fw("sc/d/92.png");
            this.an[var2].setBounds(376, 223, 56, 30);
         } else if (var2 == 4) {
            this.an[var2].eq(Class511.q("sc/d/36.png", 16, 16, 16, 16, false));
            this.an[var2].setBounds(302, 255, 203, 69);
         } else if (var2 == 5) {
            this.an[var2].eq(Class511.q("sc/d/49.png", 5, 5, 5, 5, false));
            this.an[var2].setBounds(228, 147, 351, 280);
         } else if (var2 == 6) {
            this.an[var2].eq(Class511.q("sc/d/36.png", 16, 16, 16, 16, false));
            this.an[var2].setBounds(45, 54, 549, 383);
         }

         ++var2;
      }

   }

   public boolean bl() {
      return this.yz.isVisible();
   }

   public void s() {
      if (this.ze != null) {
         RoleData var1;
         if ((var1 = this.vd()).getPackRecord().getFZType() != this.ze.geteType() - (14312 & 23455)) {
            this.aej.f("你的副职业不是" + (this.ze.geteType() == (13231 & 24537) ? "畜牧" : (this.ze.geteType() == (21386 & 16383) ? "种植" : (this.ze.geteType() == (29643 & 8127) ? "采矿" : (this.ze.geteType() == (23455 & 14316) ? "家具" : (this.ze.geteType() == (14237 & 23535) ? "制药" : "符文"))))));
         } else {
            if (this.ze.getPid() != null) {
               long var2 = BaseValue.getFZLvl(var1.getLoginResult().getScoretype("职业熟练度").longValue());
               if (this.ze.getPid().longValue() > var2) {
                  this.aej.f(this.ze.getPid() + "级解锁配方");
                  return;
               }
            }

            if (this.zg.gl() <= 0L) {
               this.aej.f("请输入生产数量");
            } else if (this.gl() <= 0L) {
               this.aej.f("缺乏足够的材料");
            } else {
               String var4 = Agreement.getSendTextAES("clickmonsters", "FZA" + this.ze.geteId());
               this.uw().d(var4);
            }
         }
      }
   }


   private void d() {
      LoginResult var1;
      long var2;
      long var4;
      if ((var4 = BaseValue.getFZLvl(var2 = (var1 = this.vd().getLoginResult()).getScoretype("职业熟练度").longValue())) != this.gf) {
         this.gf = var4;
         this.vg[5 >> 3].setText(String.valueOf(this.gf));
         this.vg[--1].setText(this.yx + "/" + BaseValue.getFZExp(this.gf + 1L));
      }

      if ((var4 = var2 - BaseValue.getFZTotalExp(this.gf)) != this.yx) {
         this.yx = var4;
         this.vg[--1].setText(this.yx + "/" + BaseValue.getFZExp(this.gf + 1L));
      }

      var4 = var1.getScoretype("活力").longValue();
      if (var2 != this.zd) {
         this.zd = var4;
         this.vg[--3].setText(String.valueOf(this.zd));
      }

   }

   public void do(int var1) {
      Class623 var10000;
      label75: {
         if (var1 == -4 >> 2) {
            if ((var1 = this.ek + (3 & 5)) > (38 & 95)) {
               var1 = 3 & 5;
               var10000 = this;
               break label75;
            }
         } else if (var1 == (-1 & -2) && (var1 = this.ek - (5 >> 2)) < 5 >> 2) {
            var1 = 118 & 15;
         }

         var10000 = this;
      }

      if (var10000.ek != var1) {
         int var10003 = 13215 & 24552;
         this.ek = var1;
         this.r.fx("sc/b/S" + ((11259 & 21823) + var1) + ".png");
         var1 = var10003 + this.ek;
         this.bu((petExchange)null);
         this.yt.removeAllChildren();
         ArrayList var4 = new ArrayList();
         Iterator var2;
         Iterator var12 = var2 = this.vc().cn().getAllPetExchange().entrySet().iterator();

         while(true) {
            int var3;
            int var13;
            label68:
            while(var12.hasNext()) {
               petExchange var5;
               if ((var5 = (petExchange)((Entry)var2.next()).getValue()).geteType() != var1) {
                  var12 = var2;
               } else {
                  for(var13 = var3 = 0; var13 < var4.size(); var13 = var3) {
                     if (((petExchange)var4.get(var3)).geteId() > var5.geteId()) {
                        var12 = var2;
                        var4.add(var3, var5);
                        continue label68;
                     }

                     ++var3;
                  }

                  var12 = var2;
                  var4.add(var5);
               }
            }

            int var6;
            for(var13 = var6 = 3 & 4; var13 < var4.size(); var13 = var6) {
               petExchange var8 = (petExchange)var4.get(var6);
               int var11 = this.yt.getChildCount();

               label50: {
                  for(var13 = var3 = 3 >> 2; var13 < var11; var13 = var3) {
                     DefaultMutableTreeNode var9 = (DefaultMutableTreeNode)this.yt.getChildAt(var3);
                     if (var8.getType().equals(var9.toString())) {
                        DefaultMutableTreeNode var7 = new DefaultMutableTreeNode(new Class656(var8.getName(), String.valueOf(var8.geteId())));
                        var9.add(var7);
                        break label50;
                     }

                     ++var3;
                  }

                  DefaultMutableTreeNode var10 = new DefaultMutableTreeNode(var8.getType());
                  var10.add(new DefaultMutableTreeNode(new Class656(var8.getName(), String.valueOf(var8.geteId()))));
                  this.yt.add(var10);
               }

               ++var6;
            }

            if (this.zf != null) {
               this.zf.updateUI();
            }

            return;
         }
      }
   }

   public void dp(int var1) {
      if (this.ze != null && this.ze.geteId() == var1) {
         long var2;
         if ((var2 = this.zg.gl() - 1L) > 0L) {
            this.yv.setText(String.valueOf(var2));
            this.s();
         }
      }
   }

   public long gl() {
      if (this.ze == null) {
         return 0L;
      } else {
         long var1 = this.vd().getLoginResult().getScoretype("活力").longValue() / (this.yu != 0L ? this.yu : 999L);

         int var4;
         for(int var10000 = var4 = 2 & 5; var10000 < this.zc.size(); var10000 = var4) {
            <undefinedtype> var3;
            if ((var3 = (<undefinedtype>)this.zc.get(var4)).aqa < (103 & 124) && var1 > 0L) {
               int var5 = var3.e();
               if (var1 > (long)var5) {
                  var1 = (long)var5;
               }
            }

            ++var4;
         }

         return var1;
      }
   }

   public <undefinedtype> pf(int var1) {
      if (var1 < this.zc.size()) {
         return (<undefinedtype>)this.zc.get(var1);
      } else {
         Class44 var2 = new Class44(this) {
            // $FF: synthetic field
            final Class623 apz;
            private int ay;
            private String aar;
            private int aqa;
            private int bn;
            private Goodstable aqb;
            private int m;

            public void y(int var1) {
               if (this.aqb == null) {
                  this.aar = null;
               } else if (this.aqa < (117 & 110)) {
                  this.bn = this.apz.vd().getGoodNum(this.aqb.getGoodsid());
                  this.m = this.ay * var1;
                  this.aar = this.bn + "/" + this.m;
               } else {
                  this.aar = null;
               }
            }

            public {
               this.eq(Class511.q("sc/d/4.png", --5, --5, --5, --5, (boolean)(3 ^ 3)));
               this.ad(Class44.asb);
            }

            public void aha(int var1, int var2, int var3, Goodstable var4) {
               this.aqa = var1;
               this.ay = var2;
               this.m = var3;
               this.aqb = var4;
               int var10001;
               Goodstable var10002;
               if (var4 != null) {
                  var10001 = 2 ^ 3;
                  var10002 = var4;
               } else {
                  var10001 = 0;
                  var10002 = var4;
               }

               this.c(var10001, var10002);
               this.y(2 ^ 3);
               this.setVisible((boolean)(var1 != -4 >> 2 ? 2 ^ 3 : 0));
            }

            protected void paintComponent(Graphics var1) {
               super.paintComponent(var1);
               if (this.aar != null) {
                  var1.setFont(Class681.ce);
                  Graphics var10000;
                  if (this.aqa < (116 & 111)) {
                     int var2 = this.apz.vd().getGoodNum(this.aqb.getGoodsid());
                     if (this.bn != var2) {
                        this.bn = var2;
                        this.m = this.ay * var2;
                        this.aar = this.bn + "/" + this.m;
                     }

                     var1.setColor(this.bn >= this.m ? Color.green : Color.WHITE);
                     var10000 = var1;
                  } else {
                     var10000 = var1;
                     var1.setColor(Color.WHITE);
                  }

                  var10000.drawString(this.aar, 47 & 88, 31 & 111);
               }
            }

            public int e() {
               return this.apz.vd().getGoodNum(this.aqb.getGoodsid()) / this.ay;
            }
         };
         this.add(var2, --5);
         this.zc.add(var2);
         return var2;
      }
   }


   private void bv(petExchange var1) {
      Class623 var10000;
      if (var1 == null) {
         var10000 = this;
         this.xg.setVisible((boolean)(3 & 4));
      } else if (var1.geteType() != (7162 & 30605) + this.vd().getPackRecord().getFZType()) {
         this.xg.setBtn(-4 >> 2, "sc/e/58.png");
         var10000 = this;
         this.xg.setVisible((boolean)(2 ^ 3));
      } else {
         var10000 = this;
         this.xg.setBtn(--1, "sc/e/31.png");
         this.xg.setVisible((boolean)(3 >> 1));
      }

      var10000.yu = 0L;
      int var3 = 2 & 5;
      this.yy = 0L;

      for(int var2 = var3; var3 < this.zc.size(); var3 = var2) {
         <undefinedtype> var4 = (<undefinedtype>)this.zc.get(var2);
         int var10001 = -4 >> 2;
         int var10002 = 3 & 4;
         ++var2;
         var4.aha(var10001, var10002, var10002, (Goodstable)null);
      }

      if (var1 == null) {
         this.vg[--3].setText("0");
         this.vg[--4].setText("0");
         this.yv.setText("0");
      }

   }

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.aej.bl()) {
         this.d();
      }

   }

   public void r(boolean var1) {
      this.yz.setVisible(var1);
      this.xg.setText(var1 ? "停止" : "生产");
   }

   public void as(int var1) {
      if (this.aej.getGameReadBar().readBarType == --2 || this.aej.getGameReadBar().readBarType == --3) {
         this.aej.getGameReadBar().setReadBar(3 ^ 3, 3 ^ 3, (String)null, 0.0D, 0L, (Object)null);
      }

      int var10003 = 3 & 4;
      this.d();
      this.r((boolean)var10003);
      this.do(this.vd().getPackRecord().getFZType());
   }

   public boolean aa(long var1, JTextField var3) {
      return (boolean)(4 ^ 5);
   }

   public Long x(long var1, JTextField var3) {
      if (var1 <= 1L) {
         return 1L;
      } else if (var1 > 999L) {
         return 999L;
      } else {
         long var4;
         if ((var4 = this.gl()) <= 0L) {
            var4 = 1L;
         }

         return var1 > var4 ? var4 : null;
      }
   }

   public void y(int var1) {
      if (var1 == (4979 & 28079)) {
         if (this.aej.getGameReadBar().readBarType != (1 ^ 3) && this.aej.getGameReadBar().readBarType != --3) {
            this.s();
         } else {
            this.aej.getGameReadBar().setReadBar(5 >> 3, 5 >> 3, (String)null, 0.0D, 0L, (Object)null);
         }
      } else if (var1 == (6590 & 26469)) {
         this.do(-1 & -2);
      } else {
         if (var1 == (1453 & 31607)) {
            this.do(-4 >> 2);
         }

      }
   }
}
