package com.xy.a;

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
import java.awt.Graphics;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class Class47 extends com.xy.q.Class30 {
   private JList<String> vg;
   private DefaultListModel<String> vh;
   private com.xy.q.Class14[] vi;
   private FB vj;
   private JScrollPane rf;
   private JLabel[] ch;
   private com.xy.w.Class0 or;
   private JScrollPane cp;
   private com.xy.w.Class18[] ar;
   private com.xy.i.Class18[] vk;
   private com.xy.q.Class54[] ni;
   private RichLabel bj;

   @Override
   protected void paintChildren(Graphics var1) {
      super.paintChildren(var1);
      if (this.or != null) {
         this.or.r(var1, 285, 230, 4, com.xy.v.Class22.l());
      }
   }

   public void pk(FB var1) {
      if ((this.vj = var1) == null) {
         int var26 = 0;
         this.bj.setTextSize("", 192);
         this.or = null;

         for (int var10 = 0; var26 < this.vi.length; var26 = var10) {
            this.vi[var10++].setText("");
         }

         int var11;
         for (int var27 = var11 = 0; var27 < this.ni.length; var27 = var11) {
            this.ni[var11].gs(0, null);
            this.ni[var11++].setVisible(true);
         }

         for (int var28 = var11 = 0; var28 < this.vk.length; var28 = var11) {
            this.vk[var11++].setVisible(false);
         }
      } else {
         TaskData var2;
         TaskData var10000 = var2 = this.yt().ce(var1.getFbDId());
         TaskSet var3 = var10000.getTaskSet();
         if (var10000 != null && var3 != null) {
            RoleData var4 = this.yx();
            TaskTQ var5 = var3.getTq();
            this.bj.setTextSize(var1.getFbMsg(), 192);
            this.or = com.xy.w.Class11.t(var1.getFbSkin(), 7, 1, null);
            this.vi[0].setText(String.valueOf(var2.getTeamSum()));
            this.vi[1].setText(RoleTaskData.getMinLvl(var2.getLvl()));
            com.xy.q.Class14 var17 = this.vi[2];
            StringBuilder var10001 = new StringBuilder(String.valueOf(var4.getTaskSystem().f(var3.getTaskSetID(), 1)));
            String var10002 = "\u0015";
            var17.setText(var10001.append("/").append(var4.getTaskSystem().getTaskSetNum(var3, 1)).toString());
            FB var18;
            if (var3.getResetcycle() == 0) {
               var18 = var1;
               com.xy.q.Class14 var29 = this.vi[3];
               var10002 = "乕釩缶";
               var29.setText("不重置");
            } else if (var3.getResetcycle() == 1) {
               var18 = var1;
               com.xy.q.Class14 var30 = this.vi[3];
               var10002 = "殦旟";
               var30.setText("每日");
            } else if (var3.getResetcycle() == 2) {
               var18 = var1;
               com.xy.q.Class14 var31 = this.vi[3];
               var10002 = "毫吰";
               var31.setText("每周");
            } else if (var3.getResetcycle() == 3) {
               var18 = var1;
               com.xy.q.Class14 var32 = this.vi[3];
               var10002 = "殦朲";
               var32.setText("每月");
            } else {
               if (var3.getResetcycle() >= 1024 && var3.getResetcycle() < 2048) {
                  int var6 = var3.getResetcycle() - 1000;
                  StringBuffer var7 = new StringBuffer();

                  int var8;
                  for (int var19 = var8 = 0; var19 < 7; var19 = ++var8) {
                     if ((var6 >> var8 & 1) != 0) {
                        if (var7.length() != 0) {
                           String var33 = "x";
                           var7.append(" ");
                        }

                        if (var8 == 6) {
                           String var34 = "吁旟";
                           var7.append("周日");
                        } else {
                           String var35 = "吰";
                           var7.append("周");
                           var7.append(MsgUntil.h(var8 + 1));
                        }
                     }
                  }

                  this.vi[3].setText(var7.toString());
               }

               var18 = var1;
            }

            String[] var20;
            if (var18.getFbDrop() != null && !var1.getFbDrop().equals("")) {
               String var21 = var1.getFbDrop();
               String var36 = "5F";
               var20 = var21.split("\\|");
            } else {
               var20 = null;
            }

            String[] var13 = var20;

            int var14;
            for (int var22 = var14 = 0; var22 < this.ni.length; var22 = ++var14) {
               BigDecimal var16 = var13 != null && var14 < var13.length ? new BigDecimal(var13[var14]) : null;
               Goodstable var9;
               if ((var9 = this.yt().ay(var16)) != null) {
                  this.ni[var14].gs(1, var9);
               } else {
                  this.ni[var14].gs(0, null);
                  this.ni[var14].setVisible(true);
               }
            }

            Class47 var23;
            if ((var14 = var4.getTaskSystem().f(var3.getTaskSetID(), 3)) >> 4 == 0) {
               var23 = this;
               com.xy.i.Class18 var49 = this.vk[0];
               String var10003 = "颢厎奲勩";
               var49.setText("领取奖励");
               com.xy.i.Class18 var37 = this.vk[0];
               var10003 = "I\n\u0015\f\u0015\\\fGJ\u0007]";
               var37.setBtn(-1, "sc/e/56.png");
            } else if ((var14 & 1) != 0) {
               com.xy.i.Class18 var24 = this.vk[0];
               String var38 = "嶪颢厎";
               var24.setText("已领取");
               var23 = this;
               com.xy.i.Class18 var39 = this.vk[0];
               String var51 = "I\n\u0015\f\u0015\\\fGJ\u0007]";
               var39.setBtn(-1, "sc/e/56.png");
            } else {
               com.xy.i.Class18 var25 = this.vk[0];
               String var40 = "颢厎奲勩";
               var25.setText("领取奖励");
               var23 = this;
               com.xy.i.Class18 var41 = this.vk[0];
               String var52 = "I\n\u0015\f\u0015[\fGJ\u0007]";
               var41.setBtn(1, "sc/e/26.png");
            }

            var23.vk[0].setVisible(true);
            this.vk[1].setVisible(true);
            this.vk[2].setVisible(var5 != null && var5.getBuyNum() > 0);
         } else {
            this.pk(null);
         }
      }
   }

   @Override
   public void l() {
      this.h();
      super.l();
   }

   public void g(int var1) {
      if (this.vj != null) {
         TaskData var10000 = this.yt().ce(this.vj.getFbDId());
         TaskSet var3 = var10000.getTaskSet();
         if (var10000 != null && var3 != null) {
            if (var1 == 151) {
               String var17 = "b\u001a";
               String var10 = Agreement.getSendTextAES("taskN", "FB" + this.vj.getFbId());
               this.za().k(var10);
            } else if (var1 == 152) {
               String var16 = "v";
               String var9 = Agreement.getSendTextAES("taskN", "L" + this.vj.getFbDId());
               this.za().k(var9);
            } else {
               if (var1 == 153) {
                  TaskTQ var4 = var3 != null ? var3.getTq() : null;
                  if (var4 == null || var4.getBuyNum() == 0) {
                     return;
                  }

                  RoleData var5;
                  RoleData var11 = var5 = this.yx();
                  String var10001 = "本匹";
                  if (var11.getLimit("月卡") == null) {
                     var10001 = "革覻条卛覊锻";
                     this.afx.dp("需要月卡解锁");
                     return;
                  }

                  int var6 = var5.getTaskSystem().f(var3.getTaskSetID(), 5);
                  TaskBuy var7;
                  if ((var7 = var4.getTaskBuy(var6)) == null) {
                     var10001 = "辚剨贉丨丮阈";
                     this.afx.dp("达到购买上限");
                     return;
                  }

                  StringBuffer var8;
                  StringBuffer var12 = var8 = new StringBuffer();
                  var10001 = "Jm伉硔寳覻苘贃Jh";
                  var12.append("#W你确定要花费#R");
                  var8.append(var7.getMoney());
                  String var10003 = "\u0007\u000f";
                  var8.append("#W");
                  var8.append(var7.getType());
                  String var10005 = "\u0016资乊乩欛";
                  var8.append(",购买一次");
                  var8.append(this.vj.getFbName());
                  String var10007 = "欅攨";
                  var8.append("次数");
                  String var10013 = "x";
                  this.afx.dm(new ConfirmBean(17, "B" + var3.getTaskSetID(), var8.toString()));
               }
            }
         }
      }
   }

   @Override
   public boolean ah() {
      this.pk(null);
      return super.ah();
   }

   public void ci(String var1) {
      AllFB var2;
      if ((var2 = this.yt().bh()) != null) {
         this.pk(var2.getFB(var1));
      }
   }

   public Class47(GameView var1) {
      super(113, 2, com.xy.q.Class30.afz, var1);
      String var10016 = "W;\u000b<\u000bi\n(J?";
      this.yy(-1, 0, 632, 401, com.xy.q.Class30.agh);
      com.xy.w.Class9 var42 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10017 = "殦旟分朖";
      this.yu(var42, "每日副本");
      this.vh = new DefaultListModel<>();
      this.vg = new JList<>();
      this.vg.setSelectionBackground(new Color(33, 42, 52));
      this.vg.setSelectionForeground(Color.white);
      this.vg.setForeground(Color.white);
      this.vg.setFont(com.xy.q.Class49.bm);
      this.vg.setBackground(com.xy.q.Class49.bk);
      this.vg.setModel(this.vh);
      this.vg.setSelectionMode(0);
      this.vg.addListSelectionListener(new Class85(this));
      this.cp = com.xy.q.Class1.g(50, 45, 148, 328, this.vg, 20);
      this.add(this.cp);
      this.bj = new RichLabel("", com.xy.q.Class49.bm);
      this.rf = com.xy.q.Class1.g(386, 67, 214, 182, this.bj, 20);
      this.add(this.rf);
      this.vk = new com.xy.i.Class18[3];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.vk.length; var10000 = var2) {
         com.xy.i.Class18[] var7 = this.vk;
         String var36;
         if (var2 == 2) {
            var36 = "+GwAw\u0012h\n(J?";
            var36 = "sc/e/60.png";
         } else {
            var36 = "I\n\u0015\f\u0015[\fGJ\u0007]";
            var36 = "sc/e/26.png";
         }

         int var10006 = 151 + var2;
         String var40;
         Class47 var10010;
         if (var2 == 0) {
            var40 = "颢厎奲勩";
            var40 = "领取奖励";
            var10010 = this;
         } else if (var2 == 1) {
            var40 = "農兟分朖";
            var40 = "进入副本";
            var10010 = this;
         } else {
            var40 = "";
            var10010 = this;
         }

         com.xy.i.Class18 var10001 = new com.xy.i.Class18(var36, 1, var10006, com.xy.q.Class49.ch, com.xy.q.Class49.bv, var40, var10010);
         var7[var2] = var10001;
         Class47 var8;
         if (var2 == 2) {
            var8 = this;
            this.vk[var2].setBounds(354, 326, 18, 18);
         } else {
            var8 = this;
            this.vk[var2].setBounds(384 + 116 * var2, 346, 99, 25);
         }

         var8.add(this.vk[var2++]);
      }

      this.vi = new com.xy.q.Class14[4];

      for (int var9 = var2 = 0; var9 < this.vi.length; var9 = var2) {
         this.vi[var2] = com.xy.q.Class1.i(288, 267 + var2 * 29, 84, 19, 10, Color.white, com.xy.q.Class49.w);
         com.xy.q.Class14 var28 = this.vi[var2];
         String var10003 = "+Gw@w\u0015o\n(J?";
         var28.mt(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false));
         this.add(this.vi[var2++]);
      }

      this.ch = new JLabel[8];

      for (int var10 = var2 = 0; var10 < this.ch.length; var10 = ++var2) {
         int var38 = 267 + 29 * var2;
         String var10008 = "JYY\nY\nY\n";
         this.ch[var2] = com.xy.q.Class1.f(207, var38, 72, 19, 0, com.xy.q.Class49.c("#c000000"), com.xy.q.Class49.ch);
         JLabel var11 = this.ch[var2];
         String var16;
         if (var2 == 0) {
            var16 = "剋杴亞攨";
            var16 = "副本人数";
         } else if (var2 == 1) {
            var16 = "分朖仓敊";
            var16 = "副本人数";
         } else if (var2 == 2) {
            var16 = "剋杴欅攨";
            var16 = "副本次数";
         } else if (var2 == 3) {
            var16 = "醤罔斟闎";
            var16 = "重置时间";
         } else if (var2 == 4) {
            var16 = "剋杴刳蠰";
            var16 = "副本列表";
         } else if (var2 == 5) {
            var16 = "分朖侈恕";
            var16 = "副本信息";
         } else if (var2 == 6) {
            var16 = "奲勩颠覐";
            var16 = "奖励预览";
         } else if (var2 == 7) {
            var16 = "湀馒掹礀ｳ毵斌凶昁亮烐刍旙釷缇〸";
            var16 = "温馨提示：每日凌晨五点刷新重置。";
         } else {
            var16 = "";
         }

         label134: {
            var11.setText(var16);
            this.add(this.ch[var2]);
            if (var2 >= 4 && var2 <= 6) {
               JLabel var24 = this.ch[var2];
               String var30 = "\u0007;b\u001eb\u001eb\u001e";
               var24.setForeground(com.xy.q.Class49.c("#cFFFFFF"));
               if (var2 == 4) {
                  var10 = var2;
                  this.ch[var2].setBounds(48, 24, 150, 21);
                  break label134;
               }

               if (var2 == 5) {
                  var10 = var2;
                  this.ch[var2].setBounds(384, 48, 215, 21);
                  break label134;
               }

               if (var2 == 6) {
                  this.ch[var2].setBounds(384, 260, 215, 21);
               }
            }

            var10 = var2;
         }

         if (var10 == 7) {
            this.ch[var2].setBounds(209, 28, 250, 16);
            this.ch[var2].setFont(com.xy.q.Class49.n);
            this.ch[var2].setHorizontalAlignment(10);
         }
      }

      this.ni = new com.xy.q.Class54[4];

      for (int var13 = var2 = 0; var13 < this.ni.length; var13 = var2) {
         this.ni[var2] = new com.xy.q.Class54(this);
         this.ni[var2].wp(com.xy.q.Class54.atu);
         com.xy.q.Class54 var35 = this.ni[var2];
         String var39 = "\u001aYF^F\u000eGJ\u0007]";
         var35.mt(com.xy.w.Class16.m("sc/d/4.png", 5, 5, 5, 5, false));
         this.ni[var2].setBounds(389 + 49 * var2, 283, 48, 48);
         this.add(this.ni[var2++]);
      }

      this.ar = new com.xy.w.Class18[7];

      for (int var14 = var2 = 0; var14 < this.ar.length; var14 = ++var2) {
         this.ar[var2] = new com.xy.w.Class18();
         this.add(this.ar[var2]);
         if (var2 >= 0 && var2 <= 2) {
            com.xy.w.Class18 var27 = this.ar[var2];
            String var34 = "+Gw@w\u0016m\n(J?";
            var27.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            if (var2 == 0) {
               this.ar[var2].setBounds(48, 24, 150, 21);
            } else if (var2 == 1) {
               this.ar[var2].setBounds(384, 48, 215, 21);
            } else if (var2 == 2) {
               this.ar[var2].setBounds(384, 260, 215, 21);
            }
         } else if (var2 >= 3 && var2 <= 5) {
            com.xy.w.Class18 var26 = this.ar[var2];
            String var33 = "I\n\u0015\r\u0015[\u000eGJ\u0007]";
            var26.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
            if (var2 == 3) {
               this.ar[var2].setBounds(48, 24, 150, 350);
            } else if (var2 == 4) {
               this.ar[var2].setBounds(384, 48, 215, 202);
            } else if (var2 == 5) {
               this.ar[var2].setBounds(384, 260, 215, 75);
            }
         } else if (var2 == 6) {
            com.xy.w.Class18 var25 = this.ar[var2];
            String var32 = "+Gw@w\u0015n\n(J?";
            var25.dp("sc/d/16.png");
            this.ar[var2].setBounds(209, 48, 165, 202);
         }
      }
   }

   // $VF: synthetic method
   static JList pl(Class47 var0) {
      return var0.vg;
   }

   public void h() {
      this.vh.removeAllElements();
      this.pk(null);
      AllFB var1;
      if ((var1 = this.yt().bh()) != null) {
         List var2 = var1.getList();

         int var3;
         for (int var10000 = var3 = 0; var10000 < var2.size(); var10000 = var3) {
            DefaultListModel var4 = this.vh;
            Object var10001 = var2.get(var3);
            var3++;
            var4.addElement(((FB)var10001).getFbName());
         }
      }
   }
}
