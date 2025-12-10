package com.xy;

import com.xy.bean.ConfirmBean;
import com.xy.bean.GangResultBean;
import com.xy.bean.LoginResult;
import com.xy.entity.Gangapplytable;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import java.util.List;
import java.util.Vector;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTable.DropLocation;
import javax.swing.table.DefaultTableCellRenderer;

public class Class210 extends Class345 {
   private Class217 hc;
   private JScrollPane hd;
   private Class322[] he;
   private JTable hf;
   private Class436[] ce;
   private boolean hg;
   private Class322[] hh;
   private Vector<Vector<Object>> hi;
   private JLabel[] hj;
   private int bn;
   private GangResultBean hk;
   private int m;

   public Class210(GameView var1) {
      int var10001 = --3;
      int var10003 = 3 ^ 3;
      super(-4 >> 2, -4 >> 2, Class345.aei, var1);
      this.va(var10003, 3 ^ 3, 8087 & 25342, 12283 & 20959, Class345.aei);
      Class322[] var6 = new Class322[var10001];
      boolean var11 = true;
      this.hh = var6;

      int var2;
      int var10000;
      for(var10000 = var2 = 2 & 5; var10000 < this.hh.length; var10000 = var2) {
         Class322[] var5 = this.hh;
         Class322 var10002 = new Class322;
         int var10005 = 5 >> 1;
         int var10006 = (28655 & 4318) + var2;
         Font var10007 = Class681.cw;
         String var10009;
         Class210 var10010;
         if (var2 == 0) {
            var10009 = "全部成员";
            var10010 = this;
         } else if (var2 == 3 >> 1) {
            var10009 = "核心成员";
            var10010 = this;
         } else if (var2 == (1 ^ 3)) {
            var10009 = "申请人";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var10002.<init>("sc/e/61.png", var10005, var10006, var10007, (Color[])null, var10009, var10010);
         var5[var2] = var10002;
         this.hh[var2].setOffsetTexts(Class681.cl);
         this.hh[var2].setBounds((126 & 57) + (95 & 124) * var2, 89 & 103, 123 & 94, 62 & 89);
         this.add(this.hh[var2++]);
      }

      var6 = new Class322[--5];
      var11 = true;
      this.he = var6;

      Class210 var7;
      for(var10000 = var2 = 3 >> 2; var10000 < this.he.length; var10000 = var2) {
         this.he[var2] = new Class322(var2 != 0 && var2 != (3 & 5) && var2 != --4 ? "sc/e/7.png" : "sc/e/26.png", 1, (17913 & 15063) + var2, Class681.ak, Class681.c, "", this);
         if (var2 == 0) {
            var7 = this;
            this.he[var2].setBounds(6577 & 26623, 20975 & 12221, 103 & 123, 91 & 61);
         } else if (var2 == --1) {
            var7 = this;
            this.he[var2].setBounds(20122 & 13181, 25519 & 7677, 99 & 127, 25);
         } else if (var2 == (1 ^ 3)) {
            var7 = this;
            this.he[var2].setBounds(204, 429, 59, 25);
         } else if (var2 == --3) {
            var7 = this;
            this.he[var2].setBounds(267, 429, 59, 25);
         } else {
            if (var2 == --4) {
               this.he[var2].setBounds(330, 429, 99, 25);
            }

            var7 = this;
         }

         var7.he[var2].setText(var2 == 0 ? "脱离帮派" : (var2 == (2 ^ 3) ? "加为好友" : (var2 == 5 >> 1 ? "任职" : (var2 == --3 ? "卸任" : (var2 == --4 ? "踢出帮派" : "")))));
         this.add(this.he[var2++]);
      }

      JLabel[] var8 = new JLabel[5 >> 1];
      var11 = true;
      this.hj = var8;

      for(var10000 = var2 = 3 ^ 3; var10000 < this.hj.length; var10000 = var2) {
         this.hj[var2] = Class133.b(499, 68, 36, 19, Color.black, Class681.ak);
         this.hj[var2].setText(var2 == 0 ? "搜索" : (var2 == (4 ^ 5) ? "只显示在线玩家" : ""));
         this.hj[var2].setHorizontalAlignment(10);
         this.add(this.hj[var2]);
         if (var2 == (2 ^ 3)) {
            this.hj[var2].setBounds(72, 432, 120, 19);
         }

         ++var2;
      }

      Vector var3 = new Vector();
      var3.addElement("名字");
      var3.addElement("职位");
      var3.addElement("种族");
      var3.addElement("等级");
      var3.addElement("贡献");
      var3.addElement("离线");
      this.hi = new Vector();
      int[] var12 = new int[6];
      boolean var10012 = true;
      var12[5 >> 3] = 100;
      var12[5 >> 2] = 100;
      var12[1 ^ 3] = 90;
      var12[--3] = 95;
      var12[--4] = 100;
      var12[5] = 100;
      this.hf = Class133.e(this.hi, var3, Class681.ce, Color.white, var12);
      DefaultTableCellRenderer var4;
      (var4 = new DefaultTableCellRenderer() {
         public Component getTableCellRendererComponent(JTable var1, Object var2, boolean var3, boolean var4, int var5, int var6) {
            if (var1 == null) {
               return this;
            } else {
               DropLocation var7;
               if ((var7 = var1.getDropLocation()) != null && !var7.isInsertRow() && !var7.isInsertColumn() && var7.getRow() == var5 && var7.getColumn() == var6) {
                  var3 = 3 & 5;
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
               if (var10000 < Class210.this.bn) {
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
      this.hf.setDefaultRenderer(Object.class, var4);
      this.hd = Class133.f(49, 89, 589, 336, this.hf, 20);
      this.add(this.hd);
      this.hc = Class133.n(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(3 >> 2)), Class681.q, Color.white);
      this.hc.setHorizontalAlignment(10);
      this.hc.setBounds(539, 68, 97, 19);
      this.add(this.hc);
      Class436[] var10 = new Class436[3];
      var11 = true;
      this.ce = var10;

      for(var10000 = var2 = 2 & 5; var10000 < this.ce.length; var10000 = var2) {
         this.ce[var2] = new Class436();
         if (var2 == 0) {
            var7 = this;
            this.ce[var2].eq(Class511.q("sc/d/25.png", 2, 2, 2, 2, (boolean)(2 & 5)));
            this.ce[var2].setBounds(49, 89, 589, 21);
         } else if (var2 == --1) {
            var7 = this;
            this.ce[var2].eq(Class511.q("sc/d/24.png", 2, 2, 2, 2, (boolean)(5 >> 3)));
            this.ce[var2].setBounds(49, 89, 589, 336);
         } else {
            if (var2 == 2) {
               this.ce[var2].fw("sc/e/29.png");
               this.ce[var2].setBounds(49, 433, 17, 17);
               this.ce[var2].addMouseListener(new MouseListener() {
                  public void mousePressed(MouseEvent var1) {
                     Class210.this.hg = (boolean)(Class210.this.hg ? 2 & 5 : 1);
                     Class210.this.ce[5 >> 1].fw(Class210.this.hg ? "sc/e/30.png" : "sc/e/29.png");
                     Class210.this.ea(Class210.this.hk);
                  }

                  public void mouseReleased(MouseEvent var1) {
                  }

                  public void mouseExited(MouseEvent var1) {
                  }

                  public void mouseEntered(MouseEvent var1) {
                  }

                  public void mouseClicked(MouseEvent var1) {
                  }
               });
            }

            var7 = this;
         }

         var7.add(this.ce[var2++]);
      }

   }

   public void r(boolean var1) {
      try {
         LoginResult var2 = this.vd().getLoginResult();
         if (this.m < 5 >> 1) {
            if (!var1) {
               this.he[--4].setVisible(var1);
               this.he[--2].setVisible(var1);
               this.he[--3].setVisible(var1);
               return;
            }

            if (this.ee(var2.getGangpost())) {
               this.he[--2].setBounds(22476 & 10495, 21501 & 11695, 63 & 123, 127 & 25);
               this.he[--3].setText("卸任");
               this.he[--3].setImage("sc/e/7.png");
               this.he[--3].setBounds(11707 & 21327, 3501 & 29695, 127 & 59, 127 & 25);
               this.he[3 >> 2].setText("脱离帮派");
               this.he[--4].setText("踢出帮派");
               this.he[--4].setVisible(var1);
               this.he[5 >> 1].setVisible(var1);
               this.he[--3].setVisible(var1);
               return;
            }

            if (this.dx(var2.getGangpost())) {
               this.he[3 ^ 3].setText("脱离帮派");
               return;
            }
         } else if (this.m == 5 >> 1) {
            if (!var1) {
               this.he[4].setVisible(var1);
               this.he[3].setVisible(var1);
               return;
            }

            if (this.dx(var2.getGangpost())) {
               this.he[--3].setText("拒绝玩家");
               this.he[--3].setImage("sc/e/26.png");
               this.he[--3].setBounds(17147 & 15847, 23535 & 9661, 99 & 127, 30 & 123);
               this.he[5 >> 3].setText("清空列表");
               this.he[4].setText("接收玩家");
               this.he[4].setVisible(var1);
               this.he[3].setVisible(var1);
               return;
            }
         }
      } catch (Exception var3) {
         var3.printStackTrace();
      }

   }

   public boolean dx(String var1) {
      if (var1 == null) {
         return (boolean)(3 >> 2);
      } else {
         return (boolean)(!var1.equals("帮主") && !var1.equals("护法") ? 3 ^ 3 : 1);
      }
   }

   public void as(int var1) {
      int var10000 = 5 >> 3;
      this.r((boolean)(2 & 5));
      this.m = var1;

      for(var1 = var10000; var10000 < this.hh.length; var10000 = var1) {
         this.hh[var1].setKeep((boolean)(var1 == this.m ? --1 : 0));
         ++var1;
      }

      int var10001 = 4 ^ 5;
      this.ea(this.hk);
      this.r((boolean)var10001);
   }

   public GangResultBean dy() {
      return this.hk;
   }

   public void y(int var1) {
      if (var1 == (10193 & 22783)) {
         if (this.he[3 ^ 3].getText().equals("脱离帮派")) {
            if (this.vd().getLoginResult().getGangpost().equals("帮主")) {
               this.aej.f("帮主不能退出帮派!");
               return;
            }

            this.aej.aal(new ConfirmBean(26 & 125, (String)null, "#Y您确定要脱离帮派吗?"));
            return;
         }

         if (this.he[3 ^ 3].getText().equals("清空列表")) {
            if (!this.dx(this.vd().getLoginResult().getGangpost())) {
               this.aej.f("你不是帮主或者护法");
               return;
            }

            String var2 = Agreement.getSendTextAES("gangrefuse", (String)null);
            this.uw().d(var2);
            this.hk.getGangapplytables().clear();
            this.ea(this.hk);
            return;
         }
      } else {
         BigDecimal var3;
         Vector var4;
         String var5;
         int var8;
         if (var1 == (20991 & 11986)) {
            if ((var8 = this.hf.getSelectedRow()) == -4 >> 2) {
               this.aej.f("请选择一个人员！");
               return;
            }

            var3 = (BigDecimal)(var4 = (Vector)this.hi.get(var8)).get(127 & 6);
            var5 = (String)var4.get(2 & 5);
            if (Class394.v(var3, this.vd().getLoginResult().getRole_id())) {
               this.aej.f("不能对自己进行操作!");
               return;
            }

            Class183.ao(var3, var5, this.aej);
            return;
         }

         if (var1 == (10207 & 22771)) {
            if (!this.vd().getLoginResult().getGangpost().equals("帮主")) {
               this.aej.f("只有帮主才有权利!");
               return;
            }

            if ((var8 = this.hf.getSelectedRow()) == -4 >> 2) {
               this.aej.f("请选择一个帮派人员！");
               return;
            }

            if (Class394.v(var3 = (BigDecimal)(var4 = (Vector)this.hi.get(var8)).get(30 & 103), this.vd().getLoginResult().getRole_id())) {
               this.aej.f("不能对自己进行操作!");
               return;
            }

            var5 = (String)var4.get(3 >> 2);
            String var6 = (String)var4.get(--2);
            String var7 = (String)var4.get(--3);
            ((Class432)this.ve().e(61 & 103)).fh(var3, var5, var6, var7);
            return;
         }

         if (var1 == (30974 & 2005)) {
            if (this.he[--3].getText().equals("卸任")) {
               if (!this.vd().getLoginResult().getGangpost().equals("帮主")) {
                  this.aej.f("你不是帮主吧!");
                  return;
               }

               if ((var8 = this.hf.getSelectedRow()) == -4 >> 2) {
                  this.aej.f("请选择一个帮派人员！");
                  return;
               }

               var3 = (BigDecimal)(var4 = (Vector)this.hi.get(var8)).get(87 & 46);
               var5 = (String)var4.get(3 & 4);
               if (Class394.v(var3, this.vd().getLoginResult().getRole_id())) {
                  this.aej.f("不能对自己进行操作!");
                  return;
               }

               this.aej.aal(new ConfirmBean(27 & 125, var3.toString(), "#Y  您确定要退位给  #G" + var5 + "    #Y吗?"));
               return;
            }

            if (this.he[--3].getText().equals("拒绝玩家")) {
               if (!this.dx(this.vd().getLoginResult().getGangpost())) {
                  this.aej.f("你不是帮主或者护法");
                  return;
               }

               if ((var8 = this.hf.getSelectedRow()) == -4 >> 2) {
                  this.aej.f("请选择一个帮派人员！");
                  return;
               }

               var3 = (BigDecimal)((Vector)this.hi.get(var8)).get(47 & 86);
               this.hk.getGangapplytables().remove(var8);
               this.hi.remove(var8);
               this.hf.updateUI();
               var5 = Agreement.getSendTextAES("gangrefuse", var3.toString());
               this.uw().d(var5);
               return;
            }
         } else if (var1 == (15829 & 17151)) {
            if (this.he[--4].getText().equals("踢出帮派")) {
               if (!this.vd().getLoginResult().getGangpost().equals("帮主")) {
                  this.aej.f("只有帮主才有权利!");
                  return;
               }

               if ((var8 = this.hf.getSelectedRow()) == -4 >> 2) {
                  this.aej.f("请选择一个帮派人员！");
                  return;
               }

               var3 = (BigDecimal)(var4 = (Vector)this.hi.get(var8)).get(79 & 54);
               var5 = (String)var4.get(3 >> 2);
               if (Class394.v(var3, this.vd().getLoginResult().getRole_id())) {
                  this.aej.f("不能对自己进行操作!");
                  return;
               }

               this.aej.aal(new ConfirmBean(91 & 62, var3.toString(), "#Y  您确定要将  #G" + var5 + "    #Y踢出帮派吗?"));
               return;
            }

            if (this.he[--4].getText().equals("接收玩家")) {
               if (!this.dx(this.vd().getLoginResult().getGangpost())) {
                  this.aej.f("你不是帮主或者护法");
                  return;
               }

               if ((var8 = this.hf.getSelectedRow()) == -4 >> 2) {
                  this.aej.f("请选择一个帮派人员！");
                  return;
               }

               var3 = (BigDecimal)((Vector)this.hi.get(var8)).get(103 & 30);
               this.hk.getGangapplytables().remove(var8);
               this.hi.remove(var8);
               this.hf.updateUI();
               var5 = Agreement.getSendTextAES("gangagree", var3.toString());
               this.uw().d(var5);
            }
         }
      }

   }

   public void ea(GangResultBean var1) {
      int var10002 = 3 & 4;
      this.hk = var1;
      this.hi.clear();
      this.bn = var10002;
      if (var1 == null) {
         this.hf.updateUI();
      } else {
         Class210 var10000;
         if (this.m != 0 && this.m != (2 ^ 3)) {
            var10000 = this;
            this.hf.getTableHeader().getColumnModel().getColumn(4 ^ 5).setHeaderValue("种族");
            this.hf.getTableHeader().getColumnModel().getColumn(--2).setHeaderValue("等级");
            this.hf.getTableHeader().getColumnModel().getColumn(--3).setHeaderValue("");
            this.hf.getTableHeader().getColumnModel().getColumn(--4).setHeaderValue("");
            this.hf.getTableHeader().getColumnModel().getColumn(--5).setHeaderValue("");
            this.hf.getColumnModel().getColumn(2 & 5).setPreferredWidth(11007 & 21950);
            this.hf.getColumnModel().getColumn(--1).setPreferredWidth(7678 & 25279);
            this.hf.getColumnModel().getColumn(1 ^ 3).setPreferredWidth(18431 & 14526);
            this.hf.getColumnModel().getColumn(--3).setPreferredWidth(3 >> 2);
            this.hf.getColumnModel().getColumn(--4).setPreferredWidth(3 ^ 3);
            this.hf.getColumnModel().getColumn(--5).setPreferredWidth(5 >> 3);
         } else {
            var10000 = this;
            this.hf.getTableHeader().getColumnModel().getColumn(5 >> 2).setHeaderValue("职位");
            this.hf.getTableHeader().getColumnModel().getColumn(5 >> 1).setHeaderValue("种族");
            this.hf.getTableHeader().getColumnModel().getColumn(--3).setHeaderValue("等级");
            this.hf.getTableHeader().getColumnModel().getColumn(--4).setHeaderValue("贡献");
            this.hf.getTableHeader().getColumnModel().getColumn(--5).setHeaderValue("离线");
            this.hf.getColumnModel().getColumn(3 >> 2).setPreferredWidth(127 & 110);
            this.hf.getColumnModel().getColumn(--1).setPreferredWidth(94 & 123);
            this.hf.getColumnModel().getColumn(--2).setPreferredWidth(111 & 121);
            this.hf.getColumnModel().getColumn(--3).setPreferredWidth(86 & 121);
            this.hf.getColumnModel().getColumn(--4).setPreferredWidth(124 & 123);
            this.hf.getColumnModel().getColumn(--5).setPreferredWidth(67 & 125);
         }

         LoginResult var2;
         Vector var3;
         List var4;
         int var5;
         int var7;
         Vector var8;
         if (var10000.m == 0) {
            var4 = var1.getRoleTables();

            for(var7 = var5 = 2 & 5; var7 < var4.size(); var7 = var5) {
               var2 = (LoginResult)var4.get(var5);
               if (!this.hg || "在线".equals(var2.getUptime())) {
                  var3 = new Vector();
                  var3.add(var2.getRolename());
                  var3.add(var2.getGangpost());
                  var3.add(var2.getRace_name());
                  var3.add(Class224.r(var2.getGrade()));
                  var3.add(var2.getContribution().toString());
                  if (!"在线".equals(var2.getUptime())) {
                     var8 = var3;
                     var3.add(Class280.c(new Long(var2.getUptime()), "yy-MM-dd"));
                  } else {
                     this.bn += 5 >> 2;
                     var8 = var3;
                     var3.add(var2.getUptime());
                  }

                  var8.add(var2.getRole_id());
                  this.hi.addElement(var3);
               }

               ++var5;
            }

            var10000 = this;
         } else if (this.m == (2 ^ 3)) {
            var4 = var1.getRoleTables();

            for(var7 = var5 = 5 >> 3; var7 < var4.size(); var7 = var5) {
               var2 = (LoginResult)var4.get(var5);
               if ((!this.hg || "在线".equals(var2.getUptime())) && this.dx(var2.getGangpost())) {
                  var3 = new Vector();
                  var3.add(var2.getRolename());
                  var3.add(var2.getGangpost());
                  var3.add(var2.getRace_name());
                  var3.add(Class224.r(var2.getGrade()));
                  var3.add(var2.getContribution().toString());
                  if (!"在线".equals(var2.getUptime())) {
                     var8 = var3;
                     var3.add(Class280.c(new Long(var2.getUptime()), "yy-MM-dd"));
                  } else {
                     this.bn += 5 >> 2;
                     var8 = var3;
                     var3.add(var2.getUptime());
                  }

                  var8.add(var2.getRole_id());
                  this.hi.addElement(var3);
               }

               ++var5;
            }

            var10000 = this;
         } else {
            if (this.m == 2) {
               var4 = var1.getGangapplytables();

               for(var7 = var5 = 3 ^ 3; var7 < var4.size(); var7 = var5) {
                  Gangapplytable var6 = (Gangapplytable)var4.get(var5);
                  (var3 = new Vector()).add(var6.getRolename());
                  var3.add(var6.getRace_name());
                  var3.add(Class224.r(var6.getGrade().intValue()));
                  var3.add("");
                  var3.add("");
                  var3.add("");
                  var3.add(var6.getRole_id());
                  ++var5;
                  this.hi.addElement(var3);
               }
            }

            var10000 = this;
         }

         if (var10000.hf.getRowCount() > 0) {
            this.hf.setRowSelectionInterval(2 & 5, 2 & 5);
         }

         this.hf.updateUI();
         this.hd.getVerticalScrollBar().setValue(5 >> 3);
      }
   }

   public void eb(BigDecimal var1, String var2) {
      if (this.hk != null) {
         int var3;
         int var10000 = var3 = 0;

         Class210 var5;
         while(true) {
            if (var10000 >= this.hk.getRoleTables().size()) {
               var5 = this;
               break;
            }

            LoginResult var4;
            if (Class394.v((var4 = (LoginResult)this.hk.getRoleTables().get(var3)).getRole_id(), var1)) {
               var5 = this;
               var4.setGangpost(var2);
               break;
            }

            ++var3;
            var10000 = var3;
         }

         var5.ea(this.hk);
      }
   }

   public boolean ee(String var1) {
      return (boolean)(var1 == null ? 2 & 5 : var1.equals("帮主"));
   }

   public void bk(BigDecimal var1) {
      if (this.hk != null) {
         int var2;
         int var10000 = var2 = 0;

         Class210 var5;
         while(true) {
            if (var10000 >= this.hk.getRoleTables().size()) {
               var5 = this;
               break;
            }

            if (Class394.v(((LoginResult)this.hk.getRoleTables().get(var2)).getRole_id(), var1)) {
               var5 = this;
               this.hk.getRoleTables().remove(var2);
               break;
            }

            ++var2;
            var10000 = var2;
         }

         List var4 = var5.hk.getGangapplytables();
         int var3;
         var10000 = var3 = 3 ^ 3;

         while(true) {
            if (var10000 >= var4.size()) {
               var5 = this;
               break;
            }

            if (Class394.v(((Gangapplytable)var4.get(var3)).getRole_id(), var1)) {
               var5 = this;
               this.hk.getGangapplytables().remove(var3);
               break;
            }

            ++var3;
            var10000 = var3;
         }

         var5.ea(this.hk);
      }
   }
}
