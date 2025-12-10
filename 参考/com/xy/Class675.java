package com.xy;

import com.xy.bean.ConfirmBean;
import com.xy.formula.MsgUntil;
import com.xy.game.RoleData;
import com.xy.game.RoleTaskData;
import com.xy.readbean.AllFB;
import com.xy.readbean.FB;
import com.xy.readbean.Goodstable;
import com.xy.readbean.TaskBuy;
import com.xy.readbean.TaskData;
import com.xy.readbean.TaskSet;
import com.xy.readbean.TaskTQ;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Class675 extends Class345 {
   private Class245[] ls;
   private RichLabel lt;
   private JList<String> lu;
   private Class44[] gb;
   private FB lv;
   private Class322[] lw;
   private Class436[] cs;
   private JScrollPane fl;
   private JScrollPane fe;
   private Class19 lx;
   private JLabel[] ly;
   private DefaultListModel<String> lz;

   public void f(String var1) {
      AllFB var2;
      if ((var2 = this.vc().bh()) != null) {
         this.gm(var2.getFB(var1));
      }
   }

   public void q() {
      this.d();
      super.q();
   }

   public void d() {
      this.lz.removeAllElements();
      this.gm((FB)null);
      AllFB var1;
      if ((var1 = this.vc().bh()) != null) {
         List var4 = var1.getList();

         int var2;
         for(int var10000 = var2 = 3 >> 2; var10000 < var4.size(); var10000 = var2) {
            DefaultListModel var3 = this.lz;
            Object var10001 = var4.get(var2);
            ++var2;
            var3.addElement(((FB)var10001).getFbName());
         }

      }
   }

   public void y(int var1) {
      if (this.lv != null) {
         TaskData var10000 = this.vc().am(this.lv.getFbDId());
         TaskSet var2 = var10000.getTaskSet();
         if (var10000 != null && var2 != null) {
            String var7;
            if (var1 == (3743 & 29175)) {
               var7 = Agreement.getSendTextAES("taskN", "FB" + this.lv.getFbId());
               this.uw().d(var7);
            } else if (var1 == (7935 & 24984)) {
               var7 = Agreement.getSendTextAES("taskN", "L" + this.lv.getFbDId());
               this.uw().d(var7);
            } else {
               if (var1 == (18623 & 14297)) {
                  TaskTQ var3 = var2 != null ? var2.getTq() : null;
                  if (var3 == null || var3.getBuyNum() == 0) {
                     return;
                  }

                  RoleData var4;
                  if ((var4 = this.vd()).getLimit("月卡") == null) {
                     this.aej.fw("需要月卡解锁");
                     return;
                  }

                  var1 = var4.getTaskSystem().d(var2.getTaskSetID(), --5);
                  TaskBuy var5;
                  if ((var5 = var3.getTaskBuy(var1)) == null) {
                     this.aej.fw("达到购买上限");
                     return;
                  }

                  StringBuffer var6;
                  (var6 = new StringBuffer()).append("#W你确定要花费#R");
                  var6.append(var5.getMoney());
                  var6.append("#W");
                  var6.append(var5.getType());
                  var6.append(",购买一次");
                  var6.append(this.lv.getFbName());
                  var6.append("次数");
                  this.aej.aal(new ConfirmBean(85 & 59, "B" + var2.getTaskSetID(), var6.toString()));
               }

            }
         }
      }
   }

   protected void paintChildren(Graphics var1) {
      super.paintChildren(var1);
      if (this.lx != null) {
         this.lx.a(var1, 31005 & 2047, 16886 & 16111, --4, Class280.l());
      }

   }

   public void gm(FB var1) {
      int var9;
      int var14;
      if ((this.lv = var1) == null) {
         var14 = 3 ^ 3;
         this.lt.setTextSize("", 9438 & 23521);
         this.lx = null;

         for(var9 = var14; var14 < this.ls.length; var14 = var9) {
            this.ls[var9++].setText("");
         }

         for(var14 = var9 = 5 >> 3; var14 < this.gb.length; var14 = var9) {
            this.gb[var9].c(5 >> 3, (Object)null);
            this.gb[var9++].setVisible((boolean)(--1));
         }

         for(var14 = var9 = 2 & 5; var14 < this.lw.length; var14 = var9) {
            this.lw[var9++].setVisible((boolean)(3 ^ 3));
         }

      } else {
         TaskData var2;
         TaskData var10000 = var2 = this.vc().am(var1.getFbDId());
         TaskSet var6 = var10000.getTaskSet();
         if (var10000 != null && var6 != null) {
            RoleData var4 = this.vd();
            TaskTQ var5 = var6.getTq();
            this.lt.setTextSize(var1.getFbMsg(), 4801 & 28158);
            this.lx = Class330.f(var1.getFbSkin(), 71 & 63, 4 ^ 5, (String)null);
            this.ls[5 >> 3].setText(String.valueOf(var2.getTeamSum()));
            this.ls[3 >> 1].setText(RoleTaskData.getMinLvl(var2.getLvl()));
            this.ls[5 >> 1].setText(var4.getTaskSystem().d(var6.getTaskSetID(), 2 ^ 3) + "/" + var4.getTaskSystem().getTaskSetNum(var6, 5 >> 2));
            FB var13;
            if (var6.getResetcycle() == 0) {
               var13 = var1;
               this.ls[--3].setText("不重置");
            } else if (var6.getResetcycle() == (2 ^ 3)) {
               var13 = var1;
               this.ls[--3].setText("每日");
            } else if (var6.getResetcycle() == 5 >> 1) {
               var13 = var1;
               this.ls[--3].setText("每周");
            } else if (var6.getResetcycle() == --3) {
               var13 = var1;
               this.ls[--3].setText("每月");
            } else {
               if (var6.getResetcycle() >= (16135 & 17656) && var6.getResetcycle() < (7674 & 27141)) {
                  var9 = var6.getResetcycle() - (7150 & 26617);
                  StringBuffer var3 = new StringBuffer();

                  int var7;
                  for(var14 = var7 = 3 & 4; var14 < 7; var14 = var7) {
                     if ((var9 >> var7 & (2 ^ 3)) != 0) {
                        if (var3.length() != 0) {
                           var3.append(" ");
                        }

                        if (var7 == (79 & 54)) {
                           var3.append("周日");
                        } else {
                           var3.append("周");
                           var3.append(MsgUntil.b(var7 + --1));
                        }
                     }

                     ++var7;
                  }

                  this.ls[--3].setText(var3.toString());
               }

               var13 = var1;
            }

            String[] var10 = var13.getFbDrop() != null && !var1.getFbDrop().equals("") ? var1.getFbDrop().split("\\|") : null;

            int var11;
            for(var14 = var11 = 2 & 5; var14 < this.gb.length; var14 = var11) {
               BigDecimal var12 = var10 != null && var11 < var10.length ? new BigDecimal(var10[var11]) : null;
               Goodstable var8;
               if ((var8 = this.vc().n(var12)) != null) {
                  this.gb[var11].c(2 ^ 3, var8);
               } else {
                  this.gb[var11].c(3 ^ 3, (Object)null);
                  this.gb[var11].setVisible((boolean)(--1));
               }

               ++var11;
            }

            Class675 var15;
            if ((var11 = var4.getTaskSystem().d(var6.getTaskSetID(), --3)) >> --4 == 0) {
               var15 = this;
               this.lw[3 & 4].setText("领取奖励");
               this.lw[0].setBtn(-4 >> 2, "sc/e/56.png");
            } else if ((var11 & 1) != 0) {
               this.lw[0].setText("已领取");
               var15 = this;
               this.lw[0].setBtn(-4 >> 2, "sc/e/56.png");
            } else {
               this.lw[0].setText("领取奖励");
               var15 = this;
               this.lw[0].setBtn(1, "sc/e/26.png");
            }

            var15.lw[0].setVisible(true);
            this.lw[1].setVisible(true);
            this.lw[5 >> 1].setVisible(var5 != null && var5.getBuyNum() > 0);
         } else {
            this.gm((FB)null);
         }
      }
   }

   public boolean t() {
      this.gm((FB)null);
      return super.t();
   }

   public Class675(GameView var1) {
      int var10001 = --3;
      int var10005 = 54 & 123;
      int var10018 = -4 >> 2;
      super(113 & 127, 5 >> 1, Class345.aef, var1);
      this.va(var10018, 3 & 4, 5114 & 28285, 10165 & 23003, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 76 & 119, 76 & 119, 76 & 119, 76 & 119, (boolean)(3 >> 2)), "每日副本");
      this.lz = new DefaultListModel();
      this.lu = new JList();
      this.lu.setSelectionBackground(new Color(49 & 111, 43 & 126, 127 & 52));
      this.lu.setSelectionForeground(Color.white);
      this.lu.setForeground(Color.white);
      this.lu.setFont(Class681.ad);
      this.lu.setBackground(Class681.cu);
      this.lu.setModel(this.lz);
      this.lu.setSelectionMode(3 & 4);
      this.lu.addListSelectionListener(new ListSelectionListener() {
         public void valueChanged(ListSelectionEvent var1) {
            if (!var1.getValueIsAdjusting()) {
               Class675.this.f((String)Class675.this.lu.getSelectedValue());
            }

         }
      });
      this.fl = Class133.f(var10005, 45 & 127, 4276 & 28639, 17916 & 15179, this.lu, 125 & 22);
      this.add(this.fl);
      int var10006 = 24475 & 8678;
      this.lt = new RichLabel("", Class681.ad);
      this.fe = Class133.f(var10006, 71 & 123, 4862 & 28119, 8374 & 24575, this.lt, 20);
      this.add(this.fe);
      Class322[] var5 = new Class322[var10001];
      boolean var10003 = true;
      this.lw = var5;

      int var2;
      int var10000;
      for(var10000 = var2 = 3 ^ 3; var10000 < this.lw.length; var10000 = var2) {
         Class322[] var3 = this.lw;
         Class322 var6 = new Class322;
         String var10004 = var2 == (1 ^ 3) ? "sc/e/60.png" : "sc/e/26.png";
         var10006 = 151 + var2;
         Font var10007 = Class681.ak;
         Color[] var10008 = Class681.c;
         String var10009;
         Class675 var10010;
         if (var2 == 0) {
            var10009 = "领取奖励";
            var10010 = this;
         } else if (var2 == --1) {
            var10009 = "进入副本";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var6.<init>(var10004, 1, var10006, var10007, var10008, var10009, var10010);
         var3[var2] = var6;
         Class675 var4;
         if (var2 == (1 ^ 3)) {
            var4 = this;
            this.lw[var2].setBounds(354, 326, 18, 18);
         } else {
            var4 = this;
            this.lw[var2].setBounds(384 + 116 * var2, 346, 99, 25);
         }

         var4.add(this.lw[var2++]);
      }

      Class245[] var7 = new Class245[--4];
      var10003 = true;
      this.ls = var7;

      for(var10000 = var2 = 2 & 5; var10000 < this.ls.length; var10000 = var2) {
         this.ls[var2] = Class133.a(288, 267 + var2 * 29, 84, 19, 10, Color.white, Class681.q);
         this.ls[var2].eq(Class511.q("sc/d/17.png", --3, --3, --3, --3, (boolean)(3 >> 2)));
         this.add(this.ls[var2++]);
      }

      JLabel[] var8 = new JLabel[8];
      var10003 = true;
      this.ly = var8;

      for(var10000 = var2 = 2 & 5; var10000 < this.ly.length; var10000 = var2) {
         label130: {
            this.ly[var2] = Class133.c(207, 267 + 29 * var2, 72, 19, 3 >> 2, Class681.c("#c000000"), Class681.ak);
            this.ly[var2].setText(var2 == 0 ? "副本人数" : (var2 == (3 & 5) ? "副本人数" : (var2 == --2 ? "副本次数" : (var2 == --3 ? "重置时间" : (var2 == --4 ? "副本列表" : (var2 == --5 ? "副本信息" : (var2 == 6 ? "奖励预览" : (var2 == 7 ? "温馨提示：每日凌晨五点刷新重置。" : ""))))))));
            this.add(this.ly[var2]);
            if (var2 >= --4 && var2 <= 6) {
               this.ly[var2].setForeground(Class681.c("#cFFFFFF"));
               if (var2 == --4) {
                  var10000 = var2;
                  this.ly[var2].setBounds(48, 24, 150, 21);
                  break label130;
               }

               if (var2 == --5) {
                  var10000 = var2;
                  this.ly[var2].setBounds(384, 48, 215, 21);
                  break label130;
               }

               if (var2 == 6) {
                  this.ly[var2].setBounds(384, 260, 215, 21);
               }
            }

            var10000 = var2;
         }

         if (var10000 == 7) {
            this.ly[var2].setBounds(209, 28, 250, 16);
            this.ly[var2].setFont(Class681.ab);
            this.ly[var2].setHorizontalAlignment(10);
         }

         ++var2;
      }

      Class44[] var9 = new Class44[--4];
      var10003 = true;
      this.gb = var9;

      for(var10000 = var2 = 5 >> 3; var10000 < this.gb.length; var10000 = var2) {
         this.gb[var2] = new Class44(this);
         this.gb[var2].ad(Class44.adw);
         this.gb[var2].eq(Class511.q("sc/d/4.png", --5, --5, --5, --5, (boolean)(3 >> 2)));
         this.gb[var2].setBounds(389 + 49 * var2, 283, 48, 48);
         this.add(this.gb[var2++]);
      }

      Class436[] var10 = new Class436[7];
      var10003 = true;
      this.cs = var10;

      for(var10000 = var2 = 2 & 5; var10000 < this.cs.length; var10000 = var2) {
         this.cs[var2] = new Class436();
         this.add(this.cs[var2]);
         if (var2 >= 0 && var2 <= 2) {
            this.cs[var2].eq(Class511.q("sc/d/25.png", 2, 2, 2, 2, (boolean)(5 >> 3)));
            if (var2 == 0) {
               this.cs[var2].setBounds(48, 24, 150, 21);
            } else if (var2 == --1) {
               this.cs[var2].setBounds(384, 48, 215, 21);
            } else if (var2 == 2) {
               this.cs[var2].setBounds(384, 260, 215, 21);
            }
         } else if (var2 >= 3 && var2 <= 5) {
            this.cs[var2].eq(Class511.q("sc/d/24.png", 2, 2, 2, 2, (boolean)(3 ^ 3)));
            if (var2 == 3) {
               this.cs[var2].setBounds(48, 24, 150, 350);
            } else if (var2 == 4) {
               this.cs[var2].setBounds(384, 48, 215, 202);
            } else if (var2 == 5) {
               this.cs[var2].setBounds(384, 260, 215, 75);
            }
         } else if (var2 == 6) {
            this.cs[var2].fw("sc/d/16.png");
            this.cs[var2].setBounds(209, 48, 165, 202);
         }

         ++var2;
      }

   }
}
