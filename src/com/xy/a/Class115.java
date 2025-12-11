package com.xy.a;

import com.xy.bean.ConfirmBean;
import com.xy.bean.GangResultBean;
import com.xy.bean.LoginResult;
import com.xy.entity.Gangapplytable;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.math.BigDecimal;
import java.util.List;
import java.util.Vector;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;

public class Class115 extends com.xy.q.Class30 {
   private int ia;
   private int gy;
   private com.xy.i.Class18[] aew;
   private GangResultBean apd;
   private com.xy.i.Class18[] jj;
   private JLabel[] ch;
   private Vector<Vector<Object>> ape;
   private JTable apf;
   private boolean dr;
   private JScrollPane jo;
   private com.xy.w.Class18[] fp;
   private com.xy.q.Class36 apg;

   public void y(int var1) {
      int var10000 = 0;
      this.cr(false);
      this.ia = var1;

      for (int var2 = 0; var10000 < this.jj.length; var10000 = ++var2) {
         this.jj[var2].setKeep(var2 == this.ia);
      }

      this.add(this.apd);
      this.cr(true);
   }

   public boolean ahe(String var1) {
      if (var1 == null) {
         return false;
      } else {
         String var10001 = "帩丱";
         if (!var1.equals("帮主")) {
            var10001 = "拥泰";
            if (!var1.equals("护法")) {
               return false;
            }
         }

         return true;
      }
   }

   public void i(BigDecimal var1) {
      if (this.apd != null) {
         int var2;
         int var10000 = var2 = 0;

         Class115 var5;
         while (true) {
            if (var10000 >= this.apd.getRoleTables().size()) {
               var5 = this;
               break;
            }

            if (com.xy.v.Class12.x(this.apd.getRoleTables().get(var2).getRole_id(), var1)) {
               var5 = this;
               this.apd.getRoleTables().remove(var2);
               break;
            }

            var10000 = ++var2;
         }

         List var4 = var5.apd.getGangapplytables();
         int var3;
         var10000 = var3 = 0;

         Class115 var7;
         while (true) {
            if (var10000 >= var4.size()) {
               var7 = this;
               break;
            }

            if (com.xy.v.Class12.x(((Gangapplytable)var4.get(var3)).getRole_id(), var1)) {
               var7 = this;
               this.apd.getGangapplytables().remove(var3);
               break;
            }

            var10000 = ++var3;
         }

         var7.add(this.apd);
      }
   }

   // $VF: synthetic method
   static boolean ahf(Class115 var0) {
      return var0.dr;
   }

   // $VF: synthetic method
   static GangResultBean ahg(Class115 var0) {
      return var0.apd;
   }

   public void g(int var1) {
      if (var1 == 209) {
         String var10000 = this.aew[0].getText();
         String var10001 = "腰禞幯洛";
         if (var10000.equals("脱离帮派")) {
            var10000 = this.yx().getLoginResult().getGangpost();
            var10001 = "帩丱";
            if (var10000.equals("帮主")) {
               var10001 = "帋乺丨肼逥冻帋浿\u0004";
               this.afx._do("帮主不能退出帮派!");
               return;
            }

            String var10005 = "$S悯硤宝見脶禱帩洴吐5";
            this.afx.dm(new ConfirmBean(24, null, "#Y您确定要脱离帮派吗?"));
            return;
         }

         var10000 = this.aew[0].getText();
         var10001 = "湄穟剖衍";
         if (var10000.equals("清空列表")) {
            if (!this.ahe(this.yx().getLoginResult().getGangpost())) {
               var10001 = "佪上春帩丱我耏抣泟";
               this.afx._do("你不是帮主或者护法");
               return;
            }

            String var2 = Agreement.getSendTextAES("gangrefuse", null);
            this.za().k(var2);
            this.apd.getGangapplytables().clear();
            this.add(this.apd);
            return;
         }
      } else {
         if (var1 == 210) {
            int var13;
            if ((var13 = this.apf.getSelectedRow()) == -1) {
               String var63 = "讶逬抨严乫亟吙Ｄ";
               this.afx._do("请选择一个人员！");
               return;
            }

            Vector var16;
            BigDecimal var21 = (BigDecimal)(var16 = this.ape.get(var13)).get(6);
            String var26 = (String)var16.get(0);
            if (com.xy.v.Class12.x(var21, this.yx().getLoginResult().getRole_id())) {
               String var62 = "上胷対臠巶近衋擇佛+";
               this.afx._do("不能对自己进行操作!");
               return;
            }

            com.xy.d.Class8.bq(var21, var26, this.afx);
            return;
         }

         if (var1 == 211) {
            String var37 = this.yx().getLoginResult().getGangpost();
            String var58 = "幯丞";
            if (!var37.equals("帮主")) {
               var58 = "叠朎帤丼扇朎杉刮+";
               this.afx._do("只有帮主才有权利!");
               return;
            }

            int var12;
            if ((var12 = this.apf.getSelectedRow()) == -1) {
               var58 = "讶逬抨严乫帋浿亟吙Ｄ";
               this.afx._do("请选择一个帮派人员！");
               return;
            }

            Vector var15;
            BigDecimal var20;
            if (com.xy.v.Class12.x(var20 = (BigDecimal)(var15 = this.ape.get(var12)).get(6), this.yx().getLoginResult().getRole_id())) {
               var58 = "上胷対臠巶近衋擇佛+";
               this.afx._do("不能对自己进行操作!");
               return;
            }

            String var25 = (String)var15.get(0);
            String var6 = (String)var15.get(2);
            String var7 = (String)var15.get(3);
            ((Class91)this.zc().j(37)).acg(var20, var25, var6, var7);
            return;
         }

         if (var1 == 212) {
            String var29 = this.aew[3].getText();
            String var42 = "匹仞";
            if (var29.equals("卸任")) {
               var29 = this.yx().getLoginResult().getGangpost();
               var42 = "帩丱";
               if (!var29.equals("帮主")) {
                  var42 = "佅乌昊幯丞呦\u0004";
                  this.afx._do("你不是帮主吧!");
                  return;
               }

               int var9;
               if ((var9 = this.apf.getSelectedRow()) == -1) {
                  var42 = "诰逃拮上中帤洹亰呟＋";
                  this.afx._do("请选择一个帮派人员！");
                  return;
               }

               Vector var3;
               BigDecimal var17 = (BigDecimal)(var3 = this.ape.get(var9)).get(6);
               String var22 = (String)var3.get(0);
               if (com.xy.v.Class12.x(var17, this.yx().getLoginResult().getRole_id())) {
                  var42 = "乌胘宸臏嶰迾蠍擨伝\u0004";
                  this.afx._do("不能对自己进行操作!");
                  return;
               }

               GameView var32 = this.afx;
               String var10004 = var17.toString();
               String var10007 = ")^*'悢硩宐覆逊佊结'*$M";
               StringBuilder var65 = new StringBuilder("#Y  您确定要退位给  #G").append(var22);
               String var10006 = "a\u0005a\u0005b|呖\u001a";
               var32.dm(new ConfirmBean(25, var10004, var65.append("    #Y吗?").toString()));
               return;
            }

            var29 = this.aew[3].getText();
            var42 = "拕绗玮宼";
            if (var29.equals("拒绝玩家")) {
               if (!this.ahe(this.yx().getLoginResult().getGangpost())) {
                  var42 = "佅乌昊幯丞扗耠拥泰";
                  this.afx._do("你不是帮主或者护法");
                  return;
               }

               int var8;
               if ((var8 = this.apf.getSelectedRow()) == -1) {
                  var42 = "诰逃拮上中帤洹亰呟＋";
                  this.afx._do("请选择一个帮派人员！");
                  return;
               }

               BigDecimal var4 = (BigDecimal)this.ape.get(var8).get(6);
               this.apd.getGangapplytables().remove(var8);
               this.ape.remove(var8);
               this.apf.updateUI();
               String var5 = Agreement.getSendTextAES("gangrefuse", var4.toString());
               this.za().k(var5);
               return;
            }
         } else if (var1 == 213) {
            String var33 = this.aew[4].getText();
            String var50 = "蹣凟幯洛";
            if (var33.equals("踢出帮派")) {
               var33 = this.yx().getLoginResult().getGangpost();
               var50 = "帩丱";
               if (!var33.equals("帮主")) {
                  var50 = "叏杈帋乺扨杈杦剨\u0004";
                  this.afx._do("只有帮主才有权利!");
                  return;
               }

               int var11;
               if ((var11 = this.apf.getSelectedRow()) == -1) {
                  var50 = "诰逃拮上中帤洹亰呟＋";
                  this.afx._do("请选择一个帮派人员！");
                  return;
               }

               Vector var14;
               BigDecimal var19 = (BigDecimal)(var14 = this.ape.get(var11)).get(6);
               String var24 = (String)var14.get(0);
               if (com.xy.v.Class12.x(var19, this.yx().getLoginResult().getRole_id())) {
                  var50 = "乌胘宸臏嶰迾蠍擨伝\u0004";
                  this.afx._do("不能对自己进行操作!");
                  return;
               }

               GameView var36 = this.afx;
               String var64 = var19.toString();
               String var68 = ")^*'悢硩宐覆尌'*$M";
               StringBuilder var66 = new StringBuilder("#Y  您确定要将  #G").append(var24);
               String var67 = "a\u0005a\u0005b|蹣凟幯洛呖\u001a";
               var36.dm(new ConfirmBean(26, var64, var66.append("    #Y踢出帮派吗?").toString()));
               return;
            }

            var33 = this.aew[4].getText();
            var50 = "探攼玮宼";
            if (var33.equals("接收玩家")) {
               if (!this.ahe(this.yx().getLoginResult().getGangpost())) {
                  var50 = "佅乌昊幯丞扗耠拥泰";
                  this.afx._do("你不是帮主或者护法");
                  return;
               }

               int var10;
               if ((var10 = this.apf.getSelectedRow()) == -1) {
                  var50 = "诰逃拮上中帤洹亰呟＋";
                  this.afx._do("请选择一个帮派人员！");
                  return;
               }

               BigDecimal var18 = (BigDecimal)this.ape.get(var10).get(6);
               this.apd.getGangapplytables().remove(var10);
               this.ape.remove(var10);
               this.apf.updateUI();
               String var23 = Agreement.getSendTextAES("gangagree", var18.toString());
               this.za().k(var23);
            }
         }
      }
   }

   public Class115(GameView var1) {
      super(-1, -1, com.xy.q.Class30.agf, var1);
      this.yy(0, 0, 662, 475, com.xy.q.Class30.agf);
      this.jj = new com.xy.i.Class18[3];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.jj.length; var10000 = var2) {
         com.xy.i.Class18[] var8 = this.jj;
         String var10004 = "V\"\n$\nw\u0014oU/B";
         int var10006 = 206 + var2;
         String var40;
         Class115 var10010;
         if (var2 == 0) {
            var40 = "兯郢戗呒";
            var40 = "全部成员";
            var10010 = this;
         } else if (var2 == 1) {
            var40 = "桹忦扑命";
            var40 = "核心成员";
            var10010 = this;
         } else if (var2 == 2) {
            var40 = "甹诰亰";
            var40 = "申请人";
            var10010 = this;
         } else {
            var40 = "";
            var10010 = this;
         }

         com.xy.i.Class18 var10002 = new com.xy.i.Class18("sc/e/61.png", 2, var10006, com.xy.q.Class49.ck, null, var40, var10010);
         var8[var2] = var10002;
         this.jj[var2].setOffsetTexts(com.xy.q.Class49.bo);
         this.jj[var2].setBounds(56 + 92 * var2, 65, 90, 24);
         this.add(this.jj[var2++]);
      }

      this.aew = new com.xy.i.Class18[5];

      for (int var9 = var2 = 0; var9 < this.aew.length; var9 = var2) {
         com.xy.i.Class18[] var10 = this.aew;
         String var36;
         if (var2 != 0 && var2 != 1 && var2 != 4) {
            var36 = "ti(o(=)zim";
            var36 = "sc/e/7.png";
         } else {
            var36 = "V\"\n$\ns\u0013oU/B";
            var36 = "sc/e/26.png";
         }

         com.xy.i.Class18 var10001 = new com.xy.i.Class18(var36, 1, 209 + var2, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "", this);
         var10[var2] = var10001;
         Class115 var11;
         if (var2 == 0) {
            var11 = this;
            this.aew[var2].setBounds(433, 429, 99, 25);
         } else if (var2 == 1) {
            var11 = this;
            this.aew[var2].setBounds(536, 429, 99, 25);
         } else if (var2 == 2) {
            var11 = this;
            this.aew[var2].setBounds(204, 429, 59, 25);
         } else if (var2 == 3) {
            var11 = this;
            this.aew[var2].setBounds(267, 429, 59, 25);
         } else {
            if (var2 == 4) {
               this.aew[var2].setBounds(330, 429, 99, 25);
            }

            var11 = this;
         }

         com.xy.i.Class18 var12 = var11.aew[var2];
         String var18;
         if (var2 == 0) {
            String var17 = "腰禞幯洛";
            var18 = "脱离帮派";
         } else if (var2 == 1) {
            String var19 = "劧丰奺叁";
            var18 = "加为好友";
         } else if (var2 == 2) {
            String var20 = "人聩";
            var18 = "任职";
         } else if (var2 == 3) {
            String var21 = "卿仱";
            var18 = "卸任";
         } else if (var2 == 4) {
            String var22 = "蹣凟幯洛";
            var18 = "踢出帮派";
         } else {
            var18 = "";
         }

         var12.setText(var18);
         this.add(this.aew[var2++]);
      }

      this.ch = new JLabel[2];

      for (int var13 = var2 = 0; var13 < this.ch.length; var13 = ++var2) {
         this.ch[var2] = com.xy.q.Class1.k(499, 68, 36, 19, Color.black, com.xy.q.Class49.ch);
         JLabel var14 = this.ch[var2];
         String var24;
         if (var2 == 0) {
            var24 = "搛紨";
            var24 = "搜索";
         } else if (var2 == 1) {
            var24 = "叏晿礟坩纚珨宓";
            var24 = "只显示在线玩家";
         } else {
            var24 = "";
         }

         var14.setText(var24);
         this.ch[var2].setHorizontalAlignment(10);
         this.add(this.ch[var2]);
         if (var2 == 1) {
            this.ch[var2].setBounds(72, 432, 120, 19);
         }
      }

      Vector var7 = new Vector();
      String var28 = "秺纚";
      String var38 = "账猤";
      String var39 = "笈纂";
      String var10008 = "秊旅";
      String var43 = "耍佨";
      String var10012 = "吊孝";
      var7.addElement("名字");
      var7.addElement("职位");
      var7.addElement("种族");
      var7.addElement("等级");
      var7.addElement("贡献");
      var7.addElement("离线");
      this.ape = new Vector<>();
      this.apf = com.xy.q.Class1.l(this.ape, var7, com.xy.q.Class49.ac, Color.white, 100, 100, 90, 95, 100, 100);
      Class87 var3;
      (var3 = new Class87(this)).setHorizontalAlignment(0);
      this.apf.setDefaultRenderer(Object.class, var3);
      this.jo = com.xy.q.Class1.g(49, 89, 589, 336, this.apf, 20);
      this.add(this.jo);
      String var10007 = "yd%c%6=)zim";
      this.apg = com.xy.q.Class1.j(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false), com.xy.q.Class49.w, Color.white);
      this.apg.setHorizontalAlignment(10);
      this.apg.setBounds(539, 68, 97, 19);
      this.add(this.apg);
      this.fp = new com.xy.w.Class18[3];

      int var4;
      for (int var15 = var4 = 0; var15 < this.fp.length; var15 = var4) {
         this.fp[var4] = new com.xy.w.Class18();
         Class115 var16;
         if (var4 == 0) {
            var16 = this;
            com.xy.w.Class18 var29 = this.fp[var4];
            String var10003 = "V\"\n%\ns\u0010oU/B";
            var29.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            this.fp[var4].setBounds(49, 89, 589, 21);
         } else if (var4 == 1) {
            var16 = this;
            com.xy.w.Class18 var30 = this.fp[var4];
            String var33 = "yd%c%5>)zim";
            var30.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
            this.fp[var4].setBounds(49, 89, 589, 336);
         } else {
            if (var4 == 2) {
               com.xy.w.Class18 var31 = this.fp[var4];
               String var34 = "V\"\n$\ns\u001coU/B";
               var31.dp("sc/e/29.png");
               this.fp[var4].setBounds(49, 433, 17, 17);
               this.fp[var4].addMouseListener(new Class18(this));
            }

            var16 = this;
         }

         var16.add(this.fp[var4++]);
      }
   }

   // $VF: synthetic method
   static void ahh(Class115 var0, boolean var1) {
      var0.dr = var1;
   }

   public void adb(BigDecimal var1, String var2) {
      if (this.apd != null) {
         int var3;
         int var10000 = var3 = 0;

         Class115 var5;
         while (true) {
            if (var10000 >= this.apd.getRoleTables().size()) {
               var5 = this;
               break;
            }

            LoginResult var4;
            if (com.xy.v.Class12.x((var4 = this.apd.getRoleTables().get(var3)).getRole_id(), var1)) {
               var5 = this;
               var4.setGangpost(var2);
               break;
            }

            var10000 = ++var3;
         }

         var5.add(this.apd);
      }
   }

   public void cr(boolean var1) {
      try {
         LoginResult var2 = this.yx().getLoginResult();
         if (this.ia < 2) {
            if (!var1) {
               this.aew[4].setVisible(var1);
               this.aew[2].setVisible(var1);
               this.aew[3].setVisible(var1);
               return;
            }

            if (this.nb(var2.getGangpost())) {
               this.aew[2].setBounds(204, 429, 59, 25);
               com.xy.i.Class18 var10007 = this.aew[3];
               String var10008 = "匹仞";
               var10007.setText("卸任");
               com.xy.i.Class18 var10006 = this.aew[3];
               String var11 = "ti(o(=)zim";
               var10006.setImage("sc/e/7.png");
               this.aew[3].setBounds(267, 429, 59, 25);
               com.xy.i.Class18 var10004 = this.aew[0];
               String var10005 = "腰禞幯洛";
               var10004.setText("脱离帮派");
               com.xy.i.Class18 var10003 = this.aew[4];
               String var6 = "踥凰帩洴";
               var10003.setText("踢出帮派");
               this.aew[4].setVisible(var1);
               this.aew[2].setVisible(var1);
               this.aew[3].setVisible(var1);
               return;
            }

            if (this.ahe(var2.getGangpost())) {
               com.xy.i.Class18 var10000 = this.aew[0];
               String var10001 = "腰禞幯洛";
               var10000.setText("脱离帮派");
               return;
            }
         } else if (this.ia == 2) {
            if (!var1) {
               this.aew[4].setVisible(var1);
               this.aew[3].setVisible(var1);
               return;
            }

            if (this.ahe(var2.getGangpost())) {
               com.xy.i.Class18 var9 = this.aew[3];
               String var12 = "拕绗玮宼";
               var9.setText("拒绝玩家");
               com.xy.i.Class18 var8 = this.aew[3];
               String var10 = "V\"\n$\ns\u0013oU/B";
               var8.setImage("sc/e/26.png");
               this.aew[3].setBounds(227, 429, 99, 26);
               com.xy.i.Class18 var4 = this.aew[0];
               String var7 = "渂穰刐衢";
               var4.setText("清空列表");
               com.xy.i.Class18 var10002 = this.aew[4];
               String var5 = "揤攓珨宓";
               var10002.setText("接收玩家");
               this.aew[4].setVisible(var1);
               this.aew[3].setVisible(var1);
               return;
            }
         }
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }

   public GangResultBean ahi() {
      return this.apd;
   }

   public boolean nb(String var1) {
      if (var1 == null) {
         return false;
      } else {
         String var10001 = "帩丱";
         return var1.equals("帮主");
      }
   }

   // $VF: synthetic method
   static com.xy.w.Class18[] ahj(Class115 var0) {
      return var0.fp;
   }

   public void add(GangResultBean var1) {
      this.apd = var1;
      this.ape.clear();
      this.gy = 0;
      if (var1 == null) {
         this.apf.updateUI();
      } else {
         Class115 var10000;
         if (this.ia != 0 && this.ia != 1) {
            var10000 = this;
            TableColumn var31 = this.apf.getTableHeader().getColumnModel().getColumn(1);
            String var33 = "禌旪";
            var31.setHeaderValue("种族");
            TableColumn var29 = this.apf.getTableHeader().getColumnModel().getColumn(2);
            String var32 = "筎纭";
            var29.setHeaderValue("等级");
            this.apf.getTableHeader().getColumnModel().getColumn(3).setHeaderValue("");
            this.apf.getTableHeader().getColumnModel().getColumn(4).setHeaderValue("");
            this.apf.getTableHeader().getColumnModel().getColumn(5).setHeaderValue("");
            this.apf.getColumnModel().getColumn(0).setPreferredWidth(190);
            this.apf.getColumnModel().getColumn(1).setPreferredWidth(190);
            this.apf.getColumnModel().getColumn(2).setPreferredWidth(190);
            this.apf.getColumnModel().getColumn(3).setPreferredWidth(0);
            this.apf.getColumnModel().getColumn(4).setPreferredWidth(0);
            this.apf.getColumnModel().getColumn(5).setPreferredWidth(0);
         } else {
            var10000 = this;
            TableColumn var10011 = this.apf.getTableHeader().getColumnModel().getColumn(1);
            String var10012 = "聋佇";
            var10011.setHeaderValue("职位");
            TableColumn var10010 = this.apf.getTableHeader().getColumnModel().getColumn(2);
            String var30 = "禌旪";
            var10010.setHeaderValue("种族");
            TableColumn var10009 = this.apf.getTableHeader().getColumnModel().getColumn(3);
            String var28 = "筎纭";
            var10009.setHeaderValue("等级");
            TableColumn var10008 = this.apf.getTableHeader().getColumnModel().getColumn(4);
            String var27 = "赠猋";
            var10008.setHeaderValue("贡献");
            TableColumn var10007 = this.apf.getTableHeader().getColumnModel().getColumn(5);
            String var26 = "禼纵";
            var10007.setHeaderValue("离线");
            this.apf.getColumnModel().getColumn(0).setPreferredWidth(110);
            this.apf.getColumnModel().getColumn(1).setPreferredWidth(90);
            this.apf.getColumnModel().getColumn(2).setPreferredWidth(105);
            this.apf.getColumnModel().getColumn(3).setPreferredWidth(80);
            this.apf.getColumnModel().getColumn(4).setPreferredWidth(120);
            this.apf.getColumnModel().getColumn(5).setPreferredWidth(65);
         }

         if (var10000.ia == 0) {
            List var2 = var1.getRoleTables();

            int var3;
            for (int var14 = var3 = 0; var14 < var2.size(); var14 = ++var3) {
               LoginResult var4 = (LoginResult)var2.get(var3);
               if (this.dr) {
                  String var15 = "坩纚";
                  if (!"在线".equals(var4.getUptime())) {
                     continue;
                  }
               }

               Vector var5 = new Vector();
               String var16 = "圯纵";
               var5.add(var4.getRolename());
               var5.add(var4.getGangpost());
               var5.add(var4.getRace_name());
               var5.add(com.xy.v.Class4.h(var4.getGrade()));
               var5.add(var4.getContribution().toString());
               Vector var17;
               if (!"在线".equals(var4.getUptime())) {
                  var17 = var5;
                  long var10002 = new Long(var4.getUptime());
                  String var10003 = "8\\lh\f\b%A";
                  var5.add(com.xy.v.Class22.j(var10002, "yy-MM-dd"));
               } else {
                  this.gy++;
                  var17 = var5;
                  var5.add(var4.getUptime());
               }

               var17.add(var4.getRole_id());
               this.ape.addElement(var5);
            }

            var10000 = this;
         } else if (this.ia == 1) {
            List var6 = var1.getRoleTables();

            int var8;
            for (int var19 = var8 = 0; var19 < var6.size(); var19 = ++var8) {
               LoginResult var10 = (LoginResult)var6.get(var8);
               if (this.dr) {
                  String var20 = "圯纵";
                  if (!"在线".equals(var10.getUptime())) {
                     continue;
                  }
               }

               if (this.ahe(var10.getGangpost())) {
                  Vector var12 = new Vector();
                  String var21 = "坩纚";
                  var12.add(var10.getRolename());
                  var12.add(var10.getGangpost());
                  var12.add(var10.getRace_name());
                  var12.add(com.xy.v.Class4.h(var10.getGrade()));
                  var12.add(var10.getContribution().toString());
                  Vector var22;
                  if (!"在线".equals(var10.getUptime())) {
                     var22 = var12;
                     long var24 = new Long(var10.getUptime());
                     String var25 = "~s*GJ'cn";
                     var12.add(com.xy.v.Class22.j(var24, "yy-MM-dd"));
                  } else {
                     this.gy++;
                     var22 = var12;
                     var12.add(var10.getUptime());
                  }

                  var22.add(var10.getRole_id());
                  this.ape.addElement(var12);
               }
            }

            var10000 = this;
         } else {
            if (this.ia == 2) {
               List var7 = var1.getGangapplytables();

               int var9;
               for (int var23 = var9 = 0; var23 < var7.size(); var23 = var9) {
                  Gangapplytable var11 = (Gangapplytable)var7.get(var9);
                  Vector var13;
                  (var13 = new Vector()).add(var11.getRolename());
                  var13.add(var11.getRace_name());
                  var13.add(com.xy.v.Class4.h(var11.getGrade().intValue()));
                  var13.add("");
                  var13.add("");
                  var13.add("");
                  var13.add(var11.getRole_id());
                  var9++;
                  this.ape.addElement(var13);
               }
            }

            var10000 = this;
         }

         if (var10000.apf.getRowCount() > 0) {
            this.apf.setRowSelectionInterval(0, 0);
         }

         this.apf.updateUI();
         this.jo.getVerticalScrollBar().setValue(0);
      }
   }

   // $VF: synthetic method
   static int ahk(Class115 var0) {
      return var0.gy;
   }
}
