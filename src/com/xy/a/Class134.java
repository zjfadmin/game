package com.xy.a;

import com.xy.bean.LoginResult;
import com.xy.game.RoleData;
import com.xy.game.TaskRecord;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.math.BigDecimal;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;

public class Class134 extends com.xy.q.Class30 {
   private JTable axn;
   private JScrollPane ab;
   private DefaultListModel<String> yp;
   private JLabel[] r;
   private com.xy.w.Class18[] ar;
   private JScrollPane jo;
   private JList<String> aly;
   private Vector<Vector<Object>> ve;

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.wt) {
         this.wt = false;
         this.axn.updateUI();
         this.ab.updateUI();
      }
   }

   public String ua(int var1) {
      int var2;
      if ((var2 = var1 / 100) <= 0) {
         String var9 = "兣闑";
         return "入门";
      } else if (var2 == 1) {
         String var8 = "辚阓";
         return "进阶";
      } else if (var2 == 2) {
         String var7 = "粸锩";
         return "精锐";
      } else if (var2 == 3) {
         String var6 = "芰杕";
         return "英杰";
      } else if (var2 == 4) {
         String var5 = "豬侙";
         return "豪侠";
      } else if (var2 == 5) {
         String var4 = "寖席";
         return "宗师";
      } else if (var2 == 6) {
         String var3 = "歠圚";
         return "武圣";
      } else {
         String var10000 = "珊耠";
         return "王者";
      }
   }

   // $VF: synthetic method
   static JList ani(Class134 var0) {
      return var0.aly;
   }

   public void g(int var1) {
      String var2 = Agreement.getSendTextAES("pankinglist", String.valueOf(var1));
      this.za().k(var2);
   }

   public void so(int var1, List<LoginResult> var2) {
      if (var1 == 0) {
         var1 = this.aly.getSelectedIndex() + 1;
      }

      RoleData var3 = this.yx();
      this.aly.setSelectedIndex(var1 - 1);
      Class134 var10000;
      if (var1 == 1) {
         var10000 = this;
         TableColumn var10003 = this.axn.getTableHeader().getColumnModel().getColumn(3);
         String var10004 = "釗针";
         var10003.setHeaderValue("金钱");
         JLabel var10002 = this.r[0];
         String var48 = "佅盅釴铰\u001f";
         var10002.setText("你的金钱:");
         this.r[1].setText(var3.getLoginResult().getGold().toString());
      } else if (var1 == 2) {
         var10000 = this;
         this.axn.getTableHeader().getColumnModel().getColumn(3).setHeaderValue("");
         this.r[0].setText(null);
         this.r[1].setText(null);
      } else if (var1 == 3) {
         var10000 = this;
         TableColumn var49 = this.axn.getTableHeader().getColumnModel().getColumn(3);
         String var65 = "戞劦";
         var49.setHeaderValue("战功");
         JLabel var32 = this.r[0];
         String var50 = "伡皡勞绌偽\u001f";
         var32.setText("你的功绩值:");
         JLabel var10001 = this.r[1];
         LoginResult var33 = var3.getLoginResult();
         String var51 = "帨洇秩刿";
         var10001.setText(var33.getScoretype("帮派积分").toString());
      } else if (var1 == 4) {
         var10000 = this;
         TableColumn var52 = this.axn.getTableHeader().getColumnModel().getColumn(3);
         String var66 = "禮刣";
         var52.setHeaderValue("积分");
         JLabel var34 = this.r[0];
         String var53 = "余皂秖刀\u0003";
         var34.setText("你的积分:");
         JLabel var25 = this.r[1];
         LoginResult var35 = var3.getLoginResult();
         String var54 = "汵陣禮刣";
         var25.setText(var35.getScoretype("水陆积分").toString());
      } else if (var1 == 5) {
         var10000 = this;
         TableColumn var55 = this.axn.getTableHeader().getColumnModel().getColumn(3);
         String var67 = "秩刿";
         var55.setHeaderValue("积分");
         JLabel var36 = this.r[0];
         String var56 = "佅盅秊則\u001f";
         var36.setText("你的积分:");
         this.r[1].setText("0");
      } else if (var1 == 6) {
         TableColumn var57 = this.axn.getTableHeader().getColumnModel().getColumn(3);
         String var68 = "秩刿";
         var57.setHeaderValue("积分");
         JLabel var37 = this.r[0];
         String var58 = "佅盅秊則\u001f";
         var37.setText("你的积分:");
         BigDecimal var4;
         String var5 = this.ua((var4 = var3.getLoginResult().getPkrecord()) != null ? var4.intValue() : 0);
         JLabel var20 = this.r[1];
         StringBuilder var26 = new StringBuilder(String.valueOf(var5)).append(var4 != null ? var4 : 0);
         String var38 = "炀";
         var20.setText(var26.append("点").toString());
         var10000 = this;
      } else if (var1 == 7) {
         TableColumn var39 = this.axn.getTableHeader().getColumnModel().getColumn(3);
         String var59 = "禮刣";
         var39.setHeaderValue("积分");
         JLabel var27 = this.r[0];
         String var40 = "余皂屻敶\u0003";
         var27.setText("你的层数:");
         int var11 = var3.getTaskSystem().f(6, 3);
         int var14 = 0;
         int var6 = 0;
         if (var11 != 0) {
            var14 = var11 % 6 != 0 ? var11 / 6 + 1 : var11 / 6;
            var6 = var11 % 6 == 0 ? 6 : var11 % 6;
         }

         var10000 = this;
         var27 = this.r[1];
         StringBuilder var41 = new StringBuilder(String.valueOf(var14));
         var59 = "屧";
         StringBuilder var42 = var41.append("层").append(var6);
         var59 = "兊";
         var27.setText(var42.append("关").toString());
      } else {
         if (var1 == 8) {
            TaskRecord var12;
            int var15 = (var12 = var3.getTaskSystem().getTaskRecord(8)) != null ? var12.getNewID() >> 8 : 0;
            TableColumn var43 = this.axn.getTableHeader().getColumnModel().getColumn(3);
            String var62 = "禮刣";
            var43.setHeaderValue("积分");
            JLabel var29 = this.r[0];
            String var44 = "余皂秖刀\u0003";
            var29.setText("你的积分:");
            this.r[1].setText(String.valueOf(var15));
         }

         var10000 = this;
      }

      var10000.ve.clear();
      int var13 = 0;

      int var16;
      for (int var21 = var16 = 0; var21 < var2.size(); var21 = ++var16) {
         LoginResult var17 = var2.get(var16);
         Vector var7;
         (var7 = new Vector()).add(String.valueOf(var16 + 1));
         var7.add(var17.getRolename());
         StringBuilder var69 = new StringBuilder(String.valueOf(com.xy.v.Class4.h(var17.getGrade())));
         String var10005 = "纂";
         var7.add(var69.append("级").toString());
         Vector var22;
         if (var17.getGold() != null && var17.getGold().compareTo(new BigDecimal(0)) > 0) {
            var22 = var7;
            var7.add(var17.getGold().toString());
         } else if (var17.getBangScore() != null) {
            if (var1 == 7) {
               int var8 = var17.getBangScore();
               int var9 = 0;
               int var10 = 0;
               if (var8 != 0) {
                  var9 = var8 % 6 != 0 ? var8 / 6 + 1 : var8 / 6;
                  var10 = var8 % 6 == 0 ? 6 : var8 % 6;
               }

               var22 = var7;
               StringBuilder var45 = new StringBuilder(String.valueOf(var9));
               String var63 = "屻";
               var45 = var45.append("层").append(var10);
               var63 = "兖";
               var7.add(var45.append("关").toString());
            } else {
               var22 = var7;
               var7.add(String.valueOf(var17.getBangScore()));
            }
         } else {
            if (var17.getPkrecord() != null && var1 == 6) {
               BigDecimal var18 = var17.getPkrecord();
               String var19 = this.ua(var18 != null ? var18.intValue() : 0);
               StringBuilder var30 = new StringBuilder(String.valueOf(var19)).append(var18 != null ? var18 : 0);
               String var47 = "炀";
               var7.add(var30.append("点").toString());
            }

            var22 = var7;
         }

         if (var22.size() == 3) {
            var7.add("");
         }

         this.ve.addElement(var7);
         if (var17.getRole_id().compareTo(this.afx.roleUnit.ap.getRole_id()) == 0) {
            var13 = var16 + 1;
         }
      }

      if (var13 != 0) {
         this.r[3].setText(String.valueOf(var13));
         var10000 = this;
      } else {
         JLabel var24 = this.r[3];
         String var31 = "曃旓杫胘之榹m诒约终勡沜";
         var24.setText("暂时未能上榜,请继续加油");
         var10000 = this;
      }

      if (var10000.axn.getRowCount() > 0) {
         this.axn.setRowSelectionInterval(0, 0);
      }

      this.axn.updateUI();
      this.ab.getVerticalScrollBar().setValue(0);
   }

   @Override
   public void l() {
      Class134 var10000;
      if (this.aly.getSelectedIndex() != 0) {
         var10000 = this;
         this.aly.setSelectedIndex(0);
      } else {
         var10000 = this;
         this.g(1);
      }

      var10000.l();
   }

   public Class134(GameView var1) {
      super(60, 2, com.xy.q.Class30.afz, var1);
      String var10003 = "2FnAn\u0014oU/B";
      this.yy(-1, 0, 702, 470, com.xy.q.Class30.agh);
      com.xy.w.Class9 var24 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10004 = "掫衊榥";
      this.yu(var24, "排行榜");
      this.r = new JLabel[4];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.r.length; var10000 = var2) {
         String var10008 = "bF\u0007c\u0007c\u0007c";
         this.r[var2] = com.xy.q.Class1.f(250, 37, 100, 17, 10, com.xy.q.Class49.c("#cFFFFFF"), com.xy.q.Class49.w);
         JLabel var6 = this.r[var2];
         String var10001;
         if (var2 == 0) {
            var10001 = "";
         } else if (var2 == 1) {
            var10001 = "";
         } else if (var2 == 2) {
            var10001 = "余盨剴皂掫衊Ｃ";
            var10001 = "你目前的排行：";
         } else if (var2 == 3) {
            var10001 = "曃旓杫胘之榹ｍ诒约终勡沜";
            var10001 = "暂时未能上榜，请继续加油";
         } else {
            var10001 = "";
         }

         var6.setText(var10001);
         if (var2 == 0) {
            JLabel var7 = this.r[var2];
            var10001 = "%Z@\u007f@\u007f6\t";
            var7.setForeground(com.xy.q.Class49.c("#cFFFF00"));
         }

         if (var2 == 1) {
            this.r[var2].setBounds(360, 37, 250, 17);
         }

         if (var2 == 2) {
            JLabel var12 = this.r[var2];
            String var10002 = "bF\u0007c\u0007cq\u0015";
            var12.setForeground(com.xy.q.Class49.c("#cFFFF00"));
            this.r[var2].setBounds(250, 55, 120, 17);
         }

         if (var2 == 3) {
            this.r[var2].setBounds(366, 55, 250, 17);
         }

         this.add(this.r[var2++]);
      }

      this.yp = new DefaultListModel<>();
      String var29 = "\u0019&趼纡寵豬榥";
      this.yp.addElement("  超级富豪榜");
      String var10007 = "\u0005a绦勞狧任榹";
      this.yp.addElement("  练功狂人榜");
      String var10006 = "\u0019&帗洸戡劙榥";
      this.yp.addElement("  帮派战功榜");
      String var10005 = "\u0005a民趮秊則榹";
      this.yp.addElement("  水路积分榜");
      var10004 = "\u0019&擻叶秖刀榥";
      this.yp.addElement("  擂台积分榜");
      var10003 = "\u0005a免汐竻拁榹";
      this.yp.addElement("  全民竞技榜");
      String var19 = "\u0019&诬為幂墅榥";
      this.yp.addElement("  试炼幻境榜");
      if (this.za().VALUE.indexOf(74) != -1) {
         String var13 = "\u0005a宅爨毱旖榹";
         this.yp.addElement("  宠物比斗榜");
      }

      this.aly = new JList<>();
      this.aly.setOpaque(false);
      this.aly.setSelectionBackground(new Color(33, 42, 52));
      this.aly.setSelectionForeground(Color.white);
      this.aly.setForeground(Color.white);
      this.aly.setFont(com.xy.q.Class49.cp);
      this.aly.setBackground(com.xy.q.Class49.bk);
      this.aly.setModel(this.yp);
      this.aly.setSelectionMode(0);
      this.aly.addListSelectionListener(new Class69(this));
      this.jo = com.xy.q.Class1.g(48, 30, 190, 370, this.aly, -1);
      this.add(this.jo);
      Vector var5 = new Vector();
      var10004 = "醐钔";
      var10006 = "筏纞";
      var29 = "晴秕";
      String var10010 = "吋欘";
      var5.addElement("名次");
      var5.addElement("昵称");
      var5.addElement("等级");
      var5.addElement("金钱");
      this.ve = new Vector<>();
      this.axn = com.xy.q.Class1.l(this.ve, var5, com.xy.q.Class49.cp, Color.white, 60, 130, 125, 95);
      Class135 var3;
      (var3 = new Class135(this)).setHorizontalAlignment(0);
      this.axn.setDefaultRenderer(Object.class, var3);
      this.ab = com.xy.q.Class1.g(239, 77, 440, 372, this.axn, 20);
      this.add(this.ab);
      this.ar = new com.xy.w.Class18[4];

      int var4;
      for (int var8 = var4 = 0; var8 < this.ar.length; var8 = ++var4) {
         this.ar[var4] = new com.xy.w.Class18();
         this.add(this.ar[var4]);
         if (var4 == 0) {
            com.xy.w.Class18 var14 = this.ar[var4];
            var19 = "Je\u0016b\u00164\r(Ih^";
            var14.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
            this.ar[var4].setBounds(45, 28, 190, 422);
         }

         if (var4 == 1) {
            com.xy.w.Class18 var15 = this.ar[var4];
            var19 = "V\"\n%\nu\u001coU/B";
            var15.mt(com.xy.w.Class16.m("sc/d/49.png", 6, 6, 6, 6, false));
            this.ar[var4].setBounds(239, 29, 440, 48);
         }

         if (var4 == 2) {
            com.xy.w.Class18 var16 = this.ar[var4];
            var19 = "Je\u0016b\u00164\f(Ih^";
            var16.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            this.ar[var4].setBounds(239, 77, 440, 21);
         }

         if (var4 == 3) {
            com.xy.w.Class18 var17 = this.ar[var4];
            var19 = "V\"\n%\ns\u0011oU/B";
            var17.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
            this.ar[var4].setBounds(239, 77, 440, 372);
         }
      }
   }
}
