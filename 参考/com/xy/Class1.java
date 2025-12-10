package com.xy;

import com.xy.bean.LoginResult;
import com.xy.bean.RoleShow;
import com.xy.game.RoleData;
import com.xy.game.TaskRecord;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.ImageObserver;
import java.math.BigDecimal;
import java.util.List;
import java.util.Vector;
import javax.swing.Box;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListCellRenderer;
import javax.swing.JTable.DropLocation;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;

public class Class1 extends Class345 {
   public Class530[] avp;
   private JLabel lj;
   private JLabel lk;
   private JScrollPane ea;
   private JList<String> ja;
   public Class19[] avq;
   private JLabel at;
   private JTable avr;
   private JLabel d;
   private JScrollPane nk;
   private DefaultListModel<String> fn;
   private Vector<Vector<Object>> vq;

   public void y(int var1) {
      String var2 = Agreement.getSendTextAES("pankinglist", String.valueOf(var1));
      this.uw().d(var2);
   }

   public String tq(int var1) {
      if ((var1 /= 126 & 101) <= 0) {
         return "入门";
      } else if (var1 == 5 >> 2) {
         return "进阶";
      } else if (var1 == (1 ^ 3)) {
         return "精锐";
      } else if (var1 == --3) {
         return "英杰";
      } else if (var1 == --4) {
         return "豪侠";
      } else if (var1 == --5) {
         return "宗师";
      } else {
         return var1 == (126 & 7) ? "武圣" : "王者";
      }
   }

   public void tr(int var1, List<LoginResult> var2) {
      if (var1 == 0) {
         var1 = this.ja.getSelectedIndex() + (2 ^ 3);
      }

      RoleData var3 = this.vd();
      this.ja.setSelectedIndex(var1 - --1);
      this.at.setText(Class224.r(this.vd().getLoginResult().getGrade()) + "级");
      int var12;
      int var14;
      Class1 var10000;
      if (var1 == 3 >> 1) {
         var10000 = this;
         this.avr.getTableHeader().getColumnModel().getColumn(--3).setHeaderValue("金钱");
         this.d.setText(var3.getLoginResult().getGold().toString());
      } else if (var1 == 5 >> 1) {
         var10000 = this;
         this.avr.getTableHeader().getColumnModel().getColumn(--3).setHeaderValue("");
         this.d.setText((String)null);
      } else if (var1 == --3) {
         var10000 = this;
         this.avr.getTableHeader().getColumnModel().getColumn(--3).setHeaderValue("战功");
         this.d.setText(var3.getLoginResult().getScoretype("帮派积分").toString());
      } else if (var1 == --4) {
         var10000 = this;
         this.avr.getTableHeader().getColumnModel().getColumn(--3).setHeaderValue("积分");
         this.d.setText(var3.getLoginResult().getScoretype("水陆积分").toString());
      } else if (var1 == --5) {
         var10000 = this;
         this.avr.getTableHeader().getColumnModel().getColumn(--3).setHeaderValue("积分");
         this.d.setText("0");
      } else if (var1 == (47 & 86)) {
         this.avr.getTableHeader().getColumnModel().getColumn(--3).setHeaderValue("积分");
         BigDecimal var4;
         String var5 = this.tq((var4 = var3.getLoginResult().getPkrecord()) != null ? var4.intValue() : 0);
         this.d.setText(var5 + (var4 != null ? var4 : 0) + "点");
         var10000 = this;
      } else if (var1 == (15 & 119)) {
         this.avr.getTableHeader().getColumnModel().getColumn(--3).setHeaderValue("积分");
         var12 = var3.getTaskSystem().d(30 & 103, --3);
         var14 = 3 ^ 3;
         int var6 = 3 ^ 3;
         if (var12 != 0) {
            var14 = var12 % (30 & 103) != 0 ? var12 / (39 & 94) + (2 ^ 3) : var12 / 6;
            var6 = var12 % (23 & 110) == 0 ? 94 & 39 : var12 % (46 & 87);
         }

         var10000 = this;
         this.d.setText(var14 + "层" + var6 + "关");
      } else {
         if (var1 == (57 & 78)) {
            TaskRecord var13;
            var14 = (var13 = var3.getTaskSystem().getTaskRecord(105 & 30)) != null ? var13.getNewID() >> (29 & 106) : 0;
            this.avr.getTableHeader().getColumnModel().getColumn(--3).setHeaderValue("积分");
            this.d.setText(String.valueOf(var14));
         }

         var10000 = this;
      }

      var10000.vq.clear();

      int var18;
      for(var18 = var12 = 3 & 4; var18 < this.avq.length; var18 = var12) {
         this.avq[var12++] = null;
      }

      var12 = 2 & 5;

      for(var18 = var14 = 3 & 4; var18 < var2.size(); var18 = var14) {
         LoginResult var15 = (LoginResult)var2.get(var14);
         if (var14 >= 0 && var14 <= --4) {
            RoleShow var10 = new RoleShow();
            var10.setSpecies_id(var15.getSpecies_id());
            var10.setSkin(var15.getSkin());
            this.avq[var14] = Class292.bo((String)null, var10);
         }

         Vector var11;
         (var11 = new Vector()).add(String.valueOf(var14 + (2 ^ 3)));
         var11.add(var15.getRolename());
         var11.add(Class224.r(var15.getGrade()) + "级");
         Vector var19;
         if (var15.getGold() != null && var15.getGold().compareTo(new BigDecimal(3 >> 2)) > 0) {
            var19 = var11;
            var11.add(var15.getGold().toString());
         } else if (var15.getBangScore() != null) {
            if (var1 == (39 & 95)) {
               int var7 = var15.getBangScore();
               int var8 = 3 & 4;
               int var9 = 3 ^ 3;
               if (var7 != 0) {
                  var8 = var7 % (54 & 79) != 0 ? var7 / (86 & 47) + --1 : var7 / 6;
                  var9 = var7 % (39 & 94) == 0 ? 47 & 86 : var7 % 6;
               }

               var19 = var11;
               var11.add(var8 + "层" + var9 + "关");
            } else {
               var19 = var11;
               var11.add(String.valueOf(var15.getBangScore()));
            }
         } else {
            if (var15.getPkrecord() != null && var1 == 6) {
               BigDecimal var16 = var15.getPkrecord();
               String var17 = this.tq(var16 != null ? var16.intValue() : 0);
               var11.add(var17 + (var16 != null ? var16 : 0) + "点");
            }

            var19 = var11;
         }

         if (var19.size() == --3) {
            var11.add("");
         }

         this.vq.addElement(var11);
         if (var15.getRole_id().compareTo(this.aej.roleUnit.r.getRole_id()) == 0) {
            var12 = var14 + (5 >> 2);
         }

         ++var14;
      }

      if (var12 != 0) {
         this.lk.setText(String.valueOf(var12));
         var10000 = this;
      } else {
         this.lk.setText("未上榜");
         var10000 = this;
      }

      if (var10000.avr.getRowCount() > 0) {
         this.avr.setRowSelectionInterval(5 >> 3, 5 >> 3);
      }

      this.avr.updateUI();
      this.nk.getVerticalScrollBar().setValue(3 ^ 3);
   }

   public void q() {
      Class1 var10000;
      if (this.ja.getSelectedIndex() != 0) {
         this.ja.setSelectedIndex(5 >> 3);
         var10000 = this;
      } else {
         this.y(1);
         var10000 = this;
      }

      var10000.q();
   }

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.aeg) {
         this.aeg = (boolean)(2 & 5);
         this.avr.updateUI();
         this.nk.updateUI();
      }

      Graphics2D var5;
      Graphics2D var10000 = var5 = (Graphics2D)var1;
      Object var7 = var10000.getRenderingHint(RenderingHints.KEY_STROKE_CONTROL);
      Object var4 = var10000.getRenderingHint(RenderingHints.KEY_ANTIALIASING);
      Object var10;
      if (var7 != RenderingHints.VALUE_STROKE_DEFAULT) {
         var10 = var4;
         var5.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_DEFAULT);
      } else {
         var7 = null;
         var10 = var4;
      }

      Graphics var11;
      if (var10 != RenderingHints.VALUE_ANTIALIAS_ON) {
         var11 = var1;
         var5.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      } else {
         var4 = null;
         var11 = var1;
      }

      var11.setFont(Class681.ce);

      int var2;
      for(int var12 = var2 = 5 >> 3; var12 < this.avq.length && var2 < this.vq.size(); var12 = var2) {
         if (this.avq[var2] != null) {
            String var6 = (String)((Vector)this.vq.get(var2)).get(5 >> 2);
            String var3 = (String)((Vector)this.vq.get(var2)).get(--2);
            int var8 = 5 >> 3;
            if (var3.startsWith("飞升")) {
               var8 = --4;
               var11 = var1;
            } else {
               var8 = Integer.parseInt(var3.split("转")[5 >> 3]);
               var11 = var1;
            }

            int var9 = var11.getFontMetrics().stringWidth(var6);
            int var10002;
            if (var2 == 0) {
               this.avq[var2].a(var1, 16375 & 16877, 19946 & 12991, 63 & 72, Class280.l());
               var10002 = 29694 & 3551;
               var1.setColor(Class681.i(var8));
               var1.drawString(var6, var10002 - var9 / (1 ^ 3), 30427 & 2543);
            } else if (var2 == --1) {
               this.avq[var2].a(var1, 16894 & 16253, 30200 & 2767, 10 & 125, Class280.l());
               var10002 = 12787 & 20348;
               var1.setColor(Class681.i(var8));
               var1.drawString(var6, var10002 - var9 / --2, 32743 & 252);
            } else if (var2 == 5 >> 1) {
               this.avq[var2].a(var1, 11110 & 22267, 10216 & 22751, 120 & 15, Class280.l());
               var10002 = 28541 & 4826;
               var1.setColor(Class681.i(var8));
               var1.drawString(var6, var10002 - var9 / (5 >> 1), 11748 & 21247);
            } else if (var2 == --3) {
               this.avq[var2].a(var1, 8959 & 24063, 220, 8, Class280.l());
               var1.setColor(Class681.i(var8));
               var1.drawString(var6, 251 - var9 / (5 >> 1), 253);
            } else if (var2 == --4) {
               this.avq[var2].a(var1, 710, 220, 8, Class280.l());
               var1.setColor(Class681.i(var8));
               var1.drawString(var6, 710 - var9 / (1 ^ 3), 253);
            }
         }

         ++var2;
      }

      if (var7 != null) {
         var5.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, var7);
      }

      if (var4 != null) {
         var5.setRenderingHint(RenderingHints.KEY_ANTIALIASING, var4);
      }

   }

   public Class1(GameView var1) {
      int var10001 = --5;
      super(125 & 62, 5 >> 1, Class345.aef, var1);
      Class19[] var5 = new Class19[var10001];
      boolean var10003 = true;
      this.avq = var5;
      Class530[] var6 = new Class530[--5];
      var10003 = true;
      this.avp = var6;
      this.va(-4 >> 2, 3 & 4, 3062 & 30575, 2943 & 30395, Class345.aeo);
      this.im("sc/d/204.png");
      this.aea.setBounds(28670 & 4895, 119 & 28, 63 & 94, 63 & 94);
      Font var2 = Class681.ce;
      this.lj = new JLabel();
      this.lj.setForeground(Color.white);
      this.lj.setFont(var2);
      this.lj.setBounds(7660 & 25467, 24054 & 9213, 85 & 127, 94 & 53);
      this.lj.setText(this.vd().getLoginResult().getRolename());
      this.add(this.lj);
      this.d = new JLabel();
      this.d.setForeground(Color.white);
      this.d.setFont(var2);
      this.d.setVerticalTextPosition(2 & 5);
      this.d.setHorizontalTextPosition(3 >> 2);
      this.d.setBounds(30463 & 2929, 18420 & 14847, 31227 & 1710, 62 & 85);
      this.d.setHorizontalAlignment(3 >> 2);
      this.add(this.d);
      this.at = new JLabel();
      this.at.setForeground(Color.white);
      this.at.setFont(var2);
      this.at.setVerticalTextPosition(5 >> 3);
      this.at.setHorizontalTextPosition(3 ^ 3);
      this.at.setBounds(14995 & 18302, 23029 & 10238, 100, 20);
      this.add(this.at);
      this.lk = new JLabel();
      this.lk.setForeground(Color.white);
      this.lk.setFont(var2);
      this.lk.setVerticalTextPosition(3 & 4);
      this.lk.setHorizontalTextPosition(3 & 4);
      this.lk.setBounds(230, 500, 200, 20);
      this.lk.setText("未上榜");
      this.add(this.lk);
      this.fn = new DefaultListModel();
      this.fn.addElement("  超级富豪");
      this.fn.addElement("  练功狂人");
      this.fn.addElement("  帮派战功");
      this.fn.addElement("  水路积分");
      this.fn.addElement("  擂台积分");
      this.fn.addElement("  全民竞技");
      this.fn.addElement("  试炼幻境");
      if (this.uw().VALUE.indexOf(74) != -4 >> 2) {
         this.fn.addElement("  宠物比斗");
      }

      this.ja = new JList();
      this.ja.setOpaque((boolean)(3 & 4));
      this.ja.setSelectionBackground(new Color(33, 42, 52));
      this.ja.setSelectionForeground(Color.black);
      this.ja.setForeground(Color.black);
      this.ja.setFont(Class681.v);
      this.ja.setBackground(Class681.cu);
      this.ja.setModel(this.fn);
      this.ja.setCellRenderer(new ListCellRenderer() {
         private int fk;
         private boolean ee;
         private Image bx;
         private Object ni;
         private Image rv;

         protected void paintComponent(Graphics var1) {
            super.paintComponent(var1);
            Graphics2D var2 = (Graphics2D)var1;
            if (this.ee) {
               var1.drawImage(this.bx, -2 & -1, 4 ^ 5, 127 & 125, 35 & 127, (ImageObserver)null);
            }

            var1.drawImage(this.rv, 3 >> 2, 95 & 38, 62 & 91, 91 & 60, (ImageObserver)null);
            int var10005 = --3;
            var2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
            var2.setComposite(AlphaComposite.getInstance(var10005, 0.6F));
            var2.setFont(Class681.bd);
            var2.drawString("" + this.ni, 126 & 11, 31 & 119);
            var2.drawString("" + this.ni, 111 & 26, 87 & 63);
            var2.drawString("" + this.ni, 25 & 111, 31 & 119);
         }

         public {
            int var10002 = 2 & 5;
            this.bx = Class511.a("sc/d/210.png");
            this.removeAll();
            this.setOpaque((boolean)var10002);
            this.setLayout(new FlowLayout(5 >> 3));
            this.add(Box.createHorizontalBox());
         }

         public Component getListCellRendererComponent(JList var1, Object var2, int var3, boolean var4, boolean var5) {
            this.tm(var3, var2, var4);
            return this;
         }

         public void tm(int var1, Object var2, boolean var3) {
            this.fk = var1;
            this.ee = var3;
            this.ni = var2;
            this.rv = Class511.a("sc/d/" + Math.min((28367 & 4605) + var1, 29693 & 3283) + ".png");
         }

         public Dimension getPreferredSize() {
            return new Dimension(this.getWidth(), 108 & 59);
         }
      });
      this.ja.setSelectionMode(3 ^ 3);
      this.ja.addListSelectionListener(new ListSelectionListener() {
         public void valueChanged(ListSelectionEvent var1) {
            if (!var1.getValueIsAdjusting()) {
               int var2;
               if ((var2 = Class1.this.ja.getSelectedIndex()) == -4 >> 2) {
                  return;
               }

               Class1.this.y(var2 + --1);
            }

         }
      });
      this.ea = Class133.f(45, 50, 130, 420, this.ja, -4 >> 2);
      this.add(this.ea);
      Vector var3 = new Vector();
      var3.addElement("名次");
      var3.addElement("昵称");
      var3.addElement("等级");
      var3.addElement("金钱");
      this.vq = new Vector();
      int[] var10014 = new int[--4];
      boolean var10016 = true;
      var10014[2 & 5] = 60;
      var10014[4 ^ 5] = 130;
      var10014[--2] = 125;
      var10014[--3] = 95;
      this.avr = Class133.e(this.vq, var3, Class681.bx, Color.black, var10014);
      this.avr.setRowHeight(24);
      DefaultTableCellRenderer var4;
      (var4 = new DefaultTableCellRenderer() {
         public Component getTableCellRendererComponent(JTable var1, Object var2, boolean var3, boolean var4, int var5, int var6) {
            if (var1 == null) {
               return this;
            } else {
               DropLocation var7;
               if ((var7 = var1.getDropLocation()) != null && !var7.isInsertRow() && !var7.isInsertColumn() && var7.getRow() == var5 && var7.getColumn() == var6) {
                  var3 = 4 ^ 5;
               }

               int var10000;
               if (var3 != 0) {
                  super.setBackground(Class681.bk);
                  var10000 = var5;
               } else {
                  super.setBackground(Class681.cu);
                  var10000 = var5;
               }

               if (var10000 < 5 && var6 == 0) {
                  this.setIcon(Class1.this.avp[var5]);
                  this.setValue((Object)null);
                  return this;
               } else {
                  this.setIcon((Icon)null);
                  this.setFont(var1.getFont());
                  this.setValue(var2);
                  return this;
               }
            }
         }
      }).setHorizontalAlignment(3 ^ 3);
      this.avr.setDefaultRenderer(Object.class, var4);
      this.avr.getTableHeader().setDefaultRenderer(Class133.b);
      this.nk = Class133.f(180, 261, 609, 235, this.avr, 24);
      this.nk.getVerticalScrollBar().setUI(new Class179(Class511.q("sc/d/106.png", --3, --3, --3, --3, (boolean)(3 >> 2)), 8));
      this.add(this.nk);
      var6 = new Class530[--5];
      var10003 = true;
      this.avp = var6;
      this.avp[3 & 4] = new Class530(Class511.a("sc/d/211.png"), 21, 25);
      this.avp[5 >> 2] = new Class530(Class511.a("sc/d/212.png"), 21, 24);
      this.avp[1 ^ 3] = new Class530(Class511.a("sc/d/213.png"), 21, 25);
      this.avp[--3] = new Class530(Class511.a("sc/d/214.png"), 18, 20);
      this.avp[--4] = new Class530(Class511.a("sc/d/215.png"), 18, 20);
   }
}
