package com.xy;

import com.xy.bean.LoginResult;
import com.xy.game.RoleData;
import com.xy.game.TaskRecord;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.math.BigDecimal;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTable.DropLocation;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;

public class Class633 extends Class345 {
   private JScrollPane eb;
   private JTable nu;
   private JScrollPane mv;
   private DefaultListModel<String> ace;
   private JLabel[] hj;
   private Class436[] e;
   private JList<String> rx;
   private Vector<Vector<Object>> vq;

   public String tq(int var1) {
      if ((var1 /= 118 & 109) <= 0) {
         return "入门";
      } else if (var1 == (3 & 5)) {
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
         return var1 == (102 & 31) ? "武圣" : "王者";
      }
   }

   public void tr(int var1, List<LoginResult> var2) {
      if (var1 == 0) {
         var1 = this.rx.getSelectedIndex() + (4 ^ 5);
      }

      RoleData var3 = this.vd();
      this.rx.setSelectedIndex(var1 - (2 ^ 3));
      int var11;
      int var13;
      Class633 var10000;
      if (var1 == (3 & 5)) {
         var10000 = this;
         this.nu.getTableHeader().getColumnModel().getColumn(--3).setHeaderValue("金钱");
         this.hj[2 & 5].setText("你的金钱:");
         this.hj[2 ^ 3].setText(var3.getLoginResult().getGold().toString());
      } else if (var1 == 5 >> 1) {
         var10000 = this;
         this.nu.getTableHeader().getColumnModel().getColumn(--3).setHeaderValue("");
         this.hj[3 ^ 3].setText((String)null);
         this.hj[3 & 5].setText((String)null);
      } else if (var1 == --3) {
         var10000 = this;
         this.nu.getTableHeader().getColumnModel().getColumn(--3).setHeaderValue("战功");
         this.hj[3 >> 2].setText("你的功绩值:");
         this.hj[2 ^ 3].setText(var3.getLoginResult().getScoretype("帮派积分").toString());
      } else if (var1 == --4) {
         var10000 = this;
         this.nu.getTableHeader().getColumnModel().getColumn(--3).setHeaderValue("积分");
         this.hj[3 ^ 3].setText("你的积分:");
         this.hj[5 >> 2].setText(var3.getLoginResult().getScoretype("水陆积分").toString());
      } else if (var1 == --5) {
         var10000 = this;
         this.nu.getTableHeader().getColumnModel().getColumn(--3).setHeaderValue("积分");
         this.hj[3 ^ 3].setText("你的积分:");
         this.hj[2 ^ 3].setText("0");
      } else if (var1 == (39 & 94)) {
         this.nu.getTableHeader().getColumnModel().getColumn(--3).setHeaderValue("积分");
         this.hj[2 & 5].setText("你的积分:");
         BigDecimal var4;
         String var5 = this.tq((var4 = var3.getLoginResult().getPkrecord()) != null ? var4.intValue() : 0);
         this.hj[3 >> 1].setText(var5 + (var4 != null ? var4 : 0) + "点");
         var10000 = this;
      } else if (var1 == (119 & 15)) {
         this.nu.getTableHeader().getColumnModel().getColumn(--3).setHeaderValue("积分");
         this.hj[3 & 4].setText("你的层数:");
         var11 = var3.getTaskSystem().d(38 & 95, --3);
         var13 = 3 ^ 3;
         int var6 = 2 & 5;
         if (var11 != 0) {
            var13 = var11 % (94 & 39) != 0 ? var11 / (102 & 31) + (2 ^ 3) : var11 / 6;
            var6 = var11 % (94 & 39) == 0 ? 70 & 63 : var11 % (15 & 118);
         }

         var10000 = this;
         this.hj[2 ^ 3].setText(var13 + "层" + var6 + "关");
      } else {
         if (var1 == (72 & 63)) {
            TaskRecord var12;
            var13 = (var12 = var3.getTaskSystem().getTaskRecord(126 & 9)) != null ? var12.getNewID() >> (14 & 121) : 0;
            this.nu.getTableHeader().getColumnModel().getColumn(--3).setHeaderValue("积分");
            this.hj[0].setText("你的积分:");
            this.hj[1].setText(String.valueOf(var13));
         }

         var10000 = this;
      }

      var10000.vq.clear();
      var11 = 0;

      for(int var17 = var13 = 0; var17 < var2.size(); var17 = var13) {
         LoginResult var14 = (LoginResult)var2.get(var13);
         Vector var10;
         (var10 = new Vector()).add(String.valueOf(var13 + 1));
         var10.add(var14.getRolename());
         var10.add(Class224.r(var14.getGrade()) + "级");
         Vector var18;
         if (var14.getGold() != null && var14.getGold().compareTo(new BigDecimal(0)) > 0) {
            var18 = var10;
            var10.add(var14.getGold().toString());
         } else if (var14.getBangScore() != null) {
            if (var1 == (119 & 15)) {
               int var7 = var14.getBangScore();
               int var8 = 0;
               int var9 = 0;
               if (var7 != 0) {
                  var8 = var7 % (47 & 86) != 0 ? var7 / (54 & 79) + 1 : var7 / 6;
                  var9 = var7 % (22 & 111) == 0 ? 119 & 14 : var7 % 6;
               }

               var18 = var10;
               var10.add(var8 + "层" + var9 + "关");
            } else {
               var18 = var10;
               var10.add(String.valueOf(var14.getBangScore()));
            }
         } else {
            if (var14.getPkrecord() != null && var1 == 6) {
               BigDecimal var15 = var14.getPkrecord();
               String var16 = this.tq(var15 != null ? var15.intValue() : 0);
               var10.add(var16 + (var15 != null ? var15 : 0) + "点");
            }

            var18 = var10;
         }

         if (var18.size() == --3) {
            var10.add("");
         }

         this.vq.addElement(var10);
         if (var14.getRole_id().compareTo(this.aej.roleUnit.r.getRole_id()) == 0) {
            var11 = var13 + 1;
         }

         ++var13;
      }

      if (var11 != 0) {
         this.hj[--3].setText(String.valueOf(var11));
         var10000 = this;
      } else {
         this.hj[--3].setText("暂时未能上榜,请继续加油");
         var10000 = this;
      }

      if (var10000.nu.getRowCount() > 0) {
         this.nu.setRowSelectionInterval(0, 0);
      }

      this.nu.updateUI();
      this.mv.getVerticalScrollBar().setValue(0);
   }

   public void q() {
      Class633 var10000;
      if (this.rx.getSelectedIndex() != 0) {
         this.rx.setSelectedIndex(3 ^ 3);
         var10000 = this;
      } else {
         this.y(1);
         var10000 = this;
      }

      var10000.q();
   }

   public void y(int var1) {
      String var2 = Agreement.getSendTextAES("pankinglist", String.valueOf(var1));
      this.uw().d(var2);
   }

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.aeg) {
         this.aeg = (boolean)(3 >> 2);
         this.nu.updateUI();
         this.mv.updateUI();
      }

   }

   public Class633(GameView var1) {
      int var10001 = --4;
      int var10005 = -4 >> 2;
      super(60 & 127, 1 ^ 3, Class345.aef, var1);
      this.va(var10005, 3 >> 2, 26303 & 7166, 31199 & 2038, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 92 & 103, 92 & 103, 92 & 103, 92 & 103, (boolean)(5 >> 3)), "排行榜");
      JLabel[] var5 = new JLabel[var10001];
      boolean var10003 = true;
      this.hj = var5;

      int var2;
      int var10000;
      for(var10000 = var2 = 3 ^ 3; var10000 < this.hj.length; var10000 = var2) {
         this.hj[var2] = Class133.c(3322 & 29695, 111 & 53, 100 & 127, 23 & 121, 75 & 62, Class681.c("#cFFFFFF"), Class681.q);
         this.hj[var2].setText(var2 == 0 ? "" : (var2 == 5 >> 2 ? "" : (var2 == (1 ^ 3) ? "你目前的排行：" : (var2 == --3 ? "暂时未能上榜，请继续加油" : ""))));
         if (var2 == 0) {
            this.hj[var2].setForeground(Class681.c("#cFFFF00"));
         }

         if (var2 == 3 >> 1) {
            this.hj[var2].setBounds(29546 & 3581, 111 & 53, 11519 & 21498, 17 & 127);
         }

         if (var2 == --2) {
            this.hj[var2].setForeground(Class681.c("#cFFFF00"));
            this.hj[var2].setBounds(32762 & 255, 55 & 127, 127 & 120, 17);
         }

         if (var2 == --3) {
            this.hj[var2].setBounds(366, 55, 250, 17);
         }

         this.add(this.hj[var2++]);
      }

      this.ace = new DefaultListModel();
      this.ace.addElement("  超级富豪榜");
      this.ace.addElement("  练功狂人榜");
      this.ace.addElement("  帮派战功榜");
      this.ace.addElement("  水路积分榜");
      this.ace.addElement("  擂台积分榜");
      this.ace.addElement("  全民竞技榜");
      this.ace.addElement("  试炼幻境榜");
      if (this.uw().VALUE.indexOf(74) != -4 >> 2) {
         this.ace.addElement("  宠物比斗榜");
      }

      this.rx = new JList();
      this.rx.setOpaque((boolean)(5 >> 3));
      this.rx.setSelectionBackground(new Color(33, 42, 52));
      this.rx.setSelectionForeground(Color.white);
      this.rx.setForeground(Color.white);
      this.rx.setFont(Class681.bx);
      this.rx.setBackground(Class681.cu);
      this.rx.setModel(this.ace);
      this.rx.setSelectionMode(3 ^ 3);
      this.rx.addListSelectionListener(new ListSelectionListener() {
         public void valueChanged(ListSelectionEvent var1) {
            if (!var1.getValueIsAdjusting()) {
               int var2;
               if ((var2 = Class633.this.rx.getSelectedIndex()) == -4 >> 2) {
                  return;
               }

               Class633.this.y(var2 + (3 >> 1));
            }

         }
      });
      this.eb = Class133.f(48, 30, 190, 370, this.rx, -4 >> 2);
      this.add(this.eb);
      Vector var3 = new Vector();
      var3.addElement("名次");
      var3.addElement("昵称");
      var3.addElement("等级");
      var3.addElement("金钱");
      this.vq = new Vector();
      int[] var10011 = new int[--4];
      boolean var10013 = true;
      var10011[5 >> 3] = 60;
      var10011[--1] = 130;
      var10011[--2] = 125;
      var10011[--3] = 95;
      this.nu = Class133.e(this.vq, var3, Class681.bx, Color.white, var10011);
      DefaultTableCellRenderer var4;
      (var4 = new DefaultTableCellRenderer() {
         public Component getTableCellRendererComponent(JTable var1, Object var2, boolean var3, boolean var4, int var5, int var6) {
            if (var1 == null) {
               return this;
            } else {
               DropLocation var7;
               if ((var7 = var1.getDropLocation()) != null && !var7.isInsertRow() && !var7.isInsertColumn() && var7.getRow() == var5 && var7.getColumn() == var6) {
                  var3 = 5 >> 2;
               }

               int var10000;
               if (var3 != 0) {
                  super.setBackground(Class681.bk);
                  var10000 = var5;
               } else {
                  super.setBackground(Class681.cu);
                  var10000 = var5;
               }

               <undefinedtype> var8;
               if (var10000 < 3) {
                  var8 = this;
                  super.setForeground(Color.yellow);
               } else {
                  var8 = this;
                  super.setForeground(Color.white);
               }

               var8.setFont(var1.getFont());
               this.setValue(var2);
               return this;
            }
         }
      }).setHorizontalAlignment(3 >> 2);
      this.nu.setDefaultRenderer(Object.class, var4);
      this.mv = Class133.f(239, 77, 440, 372, this.nu, 20);
      this.add(this.mv);
      Class436[] var6 = new Class436[--4];
      var10003 = true;
      this.e = var6;

      for(var10000 = var2 = 3 >> 2; var10000 < this.e.length; var10000 = var2) {
         this.e[var2] = new Class436();
         this.add(this.e[var2]);
         if (var2 == 0) {
            this.e[var2].eq(Class511.q("sc/d/24.png", --2, --2, --2, --2, (boolean)(3 >> 2)));
            this.e[var2].setBounds(45, 28, 190, 422);
         }

         if (var2 == (2 ^ 3)) {
            this.e[var2].eq(Class511.q("sc/d/49.png", 6, 6, 6, 6, (boolean)(5 >> 3)));
            this.e[var2].setBounds(239, 29, 440, 48);
         }

         if (var2 == 5 >> 1) {
            this.e[var2].eq(Class511.q("sc/d/25.png", 1 ^ 3, 1 ^ 3, 1 ^ 3, 1 ^ 3, (boolean)(3 >> 2)));
            this.e[var2].setBounds(239, 77, 440, 21);
         }

         if (var2 == 3) {
            this.e[var2].eq(Class511.q("sc/d/24.png", 2, 2, 2, 2, (boolean)(3 >> 2)));
            this.e[var2].setBounds(239, 77, 440, 372);
         }

         ++var2;
      }

   }
}
