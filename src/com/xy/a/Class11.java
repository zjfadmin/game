package com.xy.a;

import com.xy.bean.FMBean;
import com.xy.bean.FMRole;
import com.xy.readbean.Goodstable;
import java.awt.Color;
import java.math.BigDecimal;
import java.util.Vector;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

class Class11 extends JComponent {
   // $VF: synthetic field
   final Class44 fl;
   private JScrollPane ab;
   private com.xy.q.Class54[] fm;
   private JLabel[] r;
   private com.xy.i.Class18 fn;
   private Vector<Vector<Object>> fo;
   private com.xy.w.Class18[] fp;
   private JTable fq;

   public Class11(Class44 var1) {
      this.fl = var1;
      String var10008 = "\"m~k~<g !`6";
      String var10013 = "颭厝好勺";
      this.fn = new com.xy.i.Class18("sc/e/26.png", 1, 164, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "领取奖励", var1.eg());
      this.fn.setBounds(459, 100, 99, 25);
      this.add(this.fn);
      this.r = new JLabel[16];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.r.length; var10000 = ++var2) {
         if (var2 != 5 && var2 != 6 && var2 != 7 && var2 != 8) {
            this.r[var2] = com.xy.q.Class1.k(105 + var2 % 2 * 177, 79 + var2 / 2 * 21, 100, 18, Color.white, com.xy.q.Class49.ch);
            JLabel var7 = this.r[var2];
            String var11;
            if (var2 == 0) {
               var11 = "杽朑揃吃ｋ";
               var11 = "本期排名：";
            } else if (var2 == 1) {
               var11 = "乁朴揙否ｑ";
               var11 = "上期排名：";
            } else if (var2 == 2) {
               var11 = "杻丄槍";
               var11 = "未上榜";
            } else if (var2 == 3) {
               var11 = "条両槗";
               var11 = "未上榜";
            } else if (var2 == 4) {
               var11 = "杽朑禾刈ｋ";
               var11 = "本期积分：";
            } else if (var2 == 5) {
               var11 = "否歪";
               var11 = "名次";
            } else if (var2 == 6) {
               var11 = "昻禡";
               var11 = "昵称";
            } else if (var2 == 7) {
               var11 = "筢绬";
               var11 = "等级";
            } else if (var2 == 8) {
               var11 = "秡剗";
               var11 = "积分";
            } else if (var2 == 9) {
               var11 = "乁丫杔榷駝";
               var11 = "上一期榜首";
            } else if (var2 == 10) {
               var11 = "刜协呜举友奘勠屛祫";
               var11 = "前十名丰厚奖励展示";
            } else if (var2 == 11) {
               var11 = "呆秛ｑ";
               var11 = "名称：";
            } else if (var2 == 12) {
               var11 = "qGqJｋ";
               var11 = " I D：";
            } else if (var2 == 13) {
               var11 = "禤刭ｑ";
               var11 = "积分：";
            } else if (var2 == 14) {
               var11 = "6i6i6i";
               var11 = "888888";
            } else if (var2 == 15) {
               var11 = "洐勣旝閿\u0011y\u001by\u001b帿\u001f权\u001a\u007f旎k\u001b{\u0011{\u001bk臘k\u0019{\u0019{幟\u007f朣y\u0013斮\u000by\u0018q\u001er";
               var11 = "活动时间:2020年4月14日 00:00 至 2020年4月28日 23:59";
            } else {
               var11 = "";
            }

            var7.setText(var11);
            this.r[var2].setHorizontalAlignment(10);
            this.add(this.r[var2]);
            if (var2 >= 2 && var2 <= 3) {
               this.r[var2].setFont(com.xy.q.Class49.n);
               this.r[var2].setForeground(Color.green);
            } else if (var2 == 4) {
               this.r[var2].setBounds(459, 77, 200, 18);
            } else if (var2 == 5) {
               this.r[var2].setBounds(64, 137, 36, 21);
            } else if (var2 == 6) {
               this.r[var2].setBounds(146, 137, 36, 21);
            } else if (var2 == 7) {
               this.r[var2].setBounds(232, 137, 36, 21);
            } else if (var2 == 8) {
               this.r[var2].setBounds(310, 137, 36, 21);
            } else if (var2 == 9) {
               this.r[var2].setHorizontalAlignment(0);
               this.r[var2].setBounds(379, 137, 214, 21);
            } else if (var2 == 10) {
               this.r[var2].setHorizontalAlignment(0);
               this.r[var2].setBounds(379, 259, 214, 21);
            } else if (var2 >= 11 && var2 <= 13) {
               this.r[var2].setFont(com.xy.q.Class49.bz);
               this.r[var2].setBounds(468, 171 + (var2 - 11) * 17, 122, 14);
            } else if (var2 == 14) {
               this.r[var2].setFont(com.xy.q.Class49.w);
               this.r[var2].setBounds(540, 77, 120, 18);
               this.r[var2].setForeground(Color.green);
            } else if (var2 == 15) {
               this.r[var2].setFont(com.xy.q.Class49.n);
               this.r[var2].setBounds(44, 448, 500, 15);
               this.r[var2].setForeground(Color.red);
            }
         }
      }

      this.fm = new com.xy.q.Class54[6];

      for (int var8 = var2 = 0; var8 < this.fm.length; var8 = var2) {
         this.fm[var2] = new com.xy.q.Class54(var1.eg());
         com.xy.q.Class54 var10004 = this.fm[var2];
         String var10005 = "}2!5!e !`6";
         var10004.dq("sc/d/4.png");
         this.fm[var2].wp(com.xy.q.Class54.auw);
         this.fm[var2].setBounds(388 + var2 % 3 * 69, 300 + var2 / 3 * 67, 59, 57);
         this.add(this.fm[var2++]);
      }

      Vector var6 = new Vector();
      String var29 = "秡剗";
      String var38 = "筢绬";
      String var10006 = "昻禡";
      var10008 = "否歪";
      var6.addElement("名次");
      var6.addElement("昵称");
      var6.addElement("等级");
      var6.addElement("积分");
      this.fo = new Vector<>();
      this.fq = com.xy.q.Class1.l(this.fo, var6, com.xy.q.Class49.cp, Color.white, 60, 130, 125, 95);
      Class88 var3;
      (var3 = new Class88(this)).setHorizontalAlignment(0);
      this.fq.setDefaultRenderer(Object.class, var3);
      this.ab = com.xy.q.Class1.g(43, 137, 332, 309, this.fq, 20);
      this.add(this.ab);
      this.fp = new com.xy.w.Class18[11];

      int var4;
      for (int var9 = var4 = 0; var9 < this.fp.length; var9 = var4) {
         this.fp[var4] = new com.xy.w.Class18();
         Class11 var10;
         if (var4 == 0) {
            var10 = this;
            this.fp[var4].setBounds(56, 79, 39, 39);
         } else if (var4 == 1) {
            var10 = this;
            com.xy.w.Class18 var30 = this.fp[var4];
            String var10003 = "8HdOd\u001ez\u0005;E,";
            var30.dp("sc/d/51.png");
            this.fp[var4].setBounds(53, 76, 45, 45);
         } else if (var4 == 2) {
            var10 = this;
            this.fp[var4].setBounds(411, 172, 42, 42);
         } else if (var4 == 3) {
            var10 = this;
            com.xy.w.Class18 var31 = this.fp[var4];
            String var36 = "\"m~j~<i !`6";
            var31.dp("sc/d/28.png");
            this.fp[var4].setBounds(406, 167, 52, 52);
         } else if (var4 == 4) {
            var10 = this;
            com.xy.w.Class18 var32 = this.fp[var4];
            String var37 = "8HdOd\u001fr\u0005;E,";
            var32.mt(com.xy.w.Class16.m("sc/d/49.png", 5, 5, 5, 5, false));
            this.fp[var4].setBounds(43, 65, 550, 66);
         } else {
            label190: {
               if (var4 >= 5 && var4 <= 7) {
                  com.xy.w.Class18 var28 = this.fp[var4];
                  var29 = "\"m~j~<d !`6";
                  var28.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
                  if (var4 == 5) {
                     var10 = this;
                     this.fp[var4].setBounds(43, 137, 332, 21);
                     break label190;
                  }

                  if (var4 == 6) {
                     var10 = this;
                     this.fp[var4].setBounds(379, 137, 214, 21);
                     break label190;
                  }

                  if (var4 == 7) {
                     var10 = this;
                     this.fp[var4].setBounds(379, 259, 214, 21);
                     break label190;
                  }
               } else if (var4 >= 8 && var4 <= 10) {
                  com.xy.w.Class18 var27 = this.fp[var4];
                  var29 = "8HdOd\u0019\u007f\u0005;E,";
                  var27.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
                  if (var4 == 8) {
                     var10 = this;
                     this.fp[var4].setBounds(43, 137, 332, 309);
                     break label190;
                  }

                  if (var4 == 9) {
                     var10 = this;
                     this.fp[var4].setBounds(379, 137, 214, 118);
                     break label190;
                  }

                  if (var4 == 10) {
                     this.fp[var4].setBounds(379, 259, 214, 187);
                  }
               }

               var10 = this;
            }
         }

         var10.add(this.fp[var4++]);
      }

      this.setBounds(0, 0, 620, 479);
   }

   public void el(FMBean var1) {
      FMRole var2 = var1.getMyRole();
      this.fp[0].dp(com.xy.w.Class15.l(var2.getSpecies_id().toString()));
      JLabel var10000 = this.r[2];
      String var10001;
      if (var2.getFmPlace() != 0) {
         var10001 = String.valueOf(var2.getFmPlace());
      } else {
         var10001 = "杻丄槍";
         var10001 = "未上榜";
      }

      var10000.setText(var10001);
      var10000 = this.r[3];
      if (var2.getFmPlacePast() != 0) {
         var10001 = String.valueOf(var2.getFmPlacePast());
      } else {
         var10001 = "条両槗";
         var10001 = "未上榜";
      }

      var10000.setText(var10001);
      this.r[14].setText(String.valueOf(var2.getFmjf()));
      FMRole var3 = var1.getFmRole();
      this.fp[2].dp(var3 != null ? com.xy.w.Class15.l(var3.getSpecies_id().toString()) : null);
      var10000 = this.r[11];
      String var10003 = "呜秾ｋ";
      var10000.setText("名称：" + (var3 != null ? var3.getRolename() : ""));
      var10000 = this.r[12];
      var10003 = "kbkoｑ";
      var10000.setText(" I D：" + (var3 != null ? var3.getRole_id().toString() : ""));
      var10000 = this.r[13];
      var10003 = "禾刈ｋ";
      var10000.setText("积分：" + (var3 != null ? var3.getFmjfPast() : ""));
      int var14 = 0;
      this.r[15].setText(var1.getFmTime());

      for (int var4 = 0; var14 < this.fm.length; var14 = ++var4) {
         BigDecimal var5 = var1.getGoodIds() != null && var4 < var1.getGoodIds().length ? var1.getGoodIds()[var4] : null;
         Goodstable var6 = var5 != null ? this.fl.yt().ay(var5) : null;
         com.xy.q.Class54 var15 = this.fm[var4];
         byte var20;
         Goodstable var10002;
         if (var6 != null) {
            var20 = 1;
            var10002 = var6;
         } else {
            var20 = 0;
            var10002 = var6;
         }

         var15.gs(var20, var10002);
      }

      int var16 = 0;
      this.fo.clear();

      for (int var8 = 0; var16 < var1.getFmRoleList().size(); var16 = var8) {
         var3 = var1.getFmRoleList().get(var8);
         Vector var9 = new Vector();
         var9.add(String.valueOf(var3.getFmPlace()));
         var9.add(var3.getRolename());
         StringBuilder var23 = new StringBuilder(String.valueOf(com.xy.v.Class4.h(var3.getGrade())));
         String var10004 = "绬";
         var9.add(var23.append("级").toString());
         var9.add(String.valueOf(var3.getFmjf()));
         var8++;
         this.fo.addElement(var9);
      }

      if (this.fq.getRowCount() > 0) {
         this.fq.setRowSelectionInterval(0, 0);
      }

      this.fq.updateUI();
      this.ab.getVerticalScrollBar().setValue(0);
   }
}
