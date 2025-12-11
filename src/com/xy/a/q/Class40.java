package com.xy.a.q;

import com.xy.bean.LoginResult;
import com.xy.bean.SummonPetBean;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.readbean.Skill;
import com.xy.readbean.petExchange;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.tree.DefaultMutableTreeNode;

public class Class40 extends com.xy.q.Class30 {
   private com.xy.q.Class52 xq;
   private JLabel[] xr;
   private com.xy.i.Class19 xs;
   private int xt;
   private BigDecimal xu;
   private JScrollPane xv;
   private RichLabel xw;
   private int gt;
   private com.xy.w.Class0 xx;
   private com.xy.q.Class54[] xy;
   private com.xy.q.Class47 xz;
   private int ia;
   private RichLabel to;
   private BigDecimal bt;
   private petExchange ya;
   private RichLabel av;
   private RichLabel ed;
   private int ha;
   private com.xy.q.Class14 gb;
   private int ae;
   private com.xy.w.Class18[] j;
   private JScrollPane ba;
   private BigDecimal hh;

   @Override
   public boolean ah() {
      this.h();
      return super.ah();
   }

   public void sp(petExchange var1, int var2) {
      Class40 var10000;
      if (!com.xy.v.Class12.h((this.ya = var1).getSkin())) {
         var10000 = this;
         this.xx = com.xy.w.Class11.t(var1.getSkin(), 7, 1, null);
      } else {
         var10000 = this;
         this.xx = null;
      }

      var10000.lr(var1);
      this.sr(var1);
      this.ln(var1);
   }

   public void sq(Map<Integer, petExchange> var1) {
      this.xz.ajq().removeAllChildren();
      ArrayList var2 = new ArrayList();
      Iterator var5;
      Iterator var10000 = var5 = var1.entrySet().iterator();

      label77:
      while (var10000.hasNext()) {
         label88: {
            petExchange var6 = (petExchange)((Entry)var5.next()).getValue();
            if (this.ha != 0 || var6.geteType() != 2 && var6.geteType() != 22) {
               if (this.ha != 1 || var6.geteType() < 10) {
                  break label88;
               }

               if (var6.geteType() > 15) {
                  var10000 = var5;
                  continue;
               }
            }

            int var7;
            for (int var16 = var7 = 0; var16 < var2.size(); var16 = ++var7) {
               if (((petExchange)var2.get(var7)).geteId() > var6.geteId()) {
                  var10000 = var5;
                  var2.add(var7, var6);
                  continue label77;
               }
            }

            var2.add(var6);
         }

         var10000 = var5;
      }

      int var4;
      label48:
      for (int var17 = var4 = 0; var17 < var2.size(); var17 = ++var4) {
         petExchange var11;
         if ((var11 = (petExchange)var2.get(var4)).geteType() == 22) {
            com.xy.q.Class34 var13 = new com.xy.q.Class34(var11.getType(), var11);
            var13.m(Color.white);
            var13.f(com.xy.q.Class49.ac);
            this.xz.ajq().add(new DefaultMutableTreeNode(var13));
         } else {
            com.xy.q.Class34 var12;
            com.xy.q.Class34 var18 = var12 = new com.xy.q.Class34(var11.getName(), var11);
            var18.m(Color.white);
            var18.f(com.xy.q.Class49.ac);
            DefaultMutableTreeNode var14 = new DefaultMutableTreeNode(var12);
            int var8 = this.xz.ajq().getChildCount();

            int var9;
            for (int var19 = var9 = 0; var19 < var8; var19 = ++var9) {
               DefaultMutableTreeNode var10 = (DefaultMutableTreeNode)this.xz.ajq().getChildAt(var9);
               if (var11.getType().equals(var10.toString())) {
                  var10.add(var14);
                  continue label48;
               }
            }

            DefaultMutableTreeNode var15 = new DefaultMutableTreeNode(var11.getType());
            var15.add(var14);
            this.xz.ajq().add(var15);
         }
      }

      this.xz.t();
   }

   public Class40(GameView var1) {
      super(36, 2, com.xy.q.Class30.afz, var1);
      String var10006 = "\u001a;F<FiG(\u0007?";
      this.ha = -1;
      this.yy(-1, 0, 527, 410, com.xy.q.Class30.agh);
      com.xy.w.Class9 var33 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10007 = "吏户";
      this.yu(var33, "合成");
      String var10008 = "\u001a;F=FoG(\u0007?";
      String var10013 = "吏户";
      this.xs = new com.xy.i.Class19("sc/e/7.png", 1, 71, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "合成", this);
      this.xs.setBounds(396, 199, 59, 25);
      this.add(this.xs);
      this.gb = com.xy.q.Class1.i(395, 146, 101, 19, 10, Color.white, com.xy.q.Class49.ac);
      var10006 = "+\nw\rwXoG(\u0007?";
      this.gb.mt(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false));
      this.add(this.gb);
      this.xq = com.xy.q.Class1.a(10, Color.white, com.xy.q.Class49.ac, null, var1);
      String var10010 = "Td\bc\b6\u0010)Wi@";
      this.xq.mt(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false));
      this.xq.n(2);
      this.xq.setText("0");
      this.xq.setBounds(395, 172, 101, 19);
      this.add(this.xq);
      this.xr = new JLabel[7];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.xr.length; var10000 = var2) {
         int var10004 = 32 + 26 * var2;
         var10008 = "J;/\u001e/\u001e/\u001e";
         this.xr[var2] = com.xy.q.Class1.f(46, var10004, 36, 19, 0, com.xy.q.Class49.c("#cFFFFFF"), com.xy.q.Class49.ch);
         JLabel var5 = this.xr[var2];
         String var10;
         if (var2 == 0) {
            var10 = "叨启戗友唣党";
            var10 = "可合成召唤兽";
         } else if (var2 == 1) {
            var10 = "剴偤尷恿";
            var10 = "初值属性";
         } else if (var2 == 2) {
            var10 = "央甸抇胚";
            var10 = "天生技能";
         } else if (var2 == 3) {
            var10 = "摢幏觙氫ｂ";
            var10 = "携带要求：";
         } else if (var2 == 4) {
            var10 = "\u0017轫\u00147纀";
            var10 = "0转30级";
         } else if (var2 == 5) {
            var10 = "淡聏";
            var10 = "消耗";
         } else if (var2 == 6) {
            var10 = "玷釶";
            var10 = "现金";
         } else {
            var10 = "";
         }

         var5.setText(var10);
         Class40 var6;
         if (var2 == 0) {
            var6 = this;
            this.xr[var2].setBounds(48, 32, 163, 21);
         } else if (var2 == 1) {
            var6 = this;
            this.xr[var2].setBounds(220, 246, 137, 21);
         } else if (var2 == 2) {
            var6 = this;
            this.xr[var2].setBounds(365, 246, 137, 21);
         } else if (var2 == 3) {
            var6 = this;
            JLabel var10003 = this.xr[var2];
            String var30 = "J;YhYhYh";
            var10003.setForeground(com.xy.q.Class49.c("#c000000"));
            this.xr[var2].setHorizontalAlignment(10);
            this.xr[var2].setBounds(359, 43, 90, 19);
         } else if (var2 == 4) {
            var6 = this;
            JLabel var31 = this.xr[var2];
            String var10005 = "$D7\u00177\u00177\u0017";
            var31.setForeground(com.xy.q.Class49.c("#c000000"));
            this.xr[var2].setHorizontalAlignment(10);
            this.xr[var2].setFont(com.xy.q.Class49.ac);
            this.xr[var2].setBounds(438, 43, 70, 19);
         } else {
            if (var2 >= 5 && var2 <= 6) {
               JLabel var10002 = this.xr[var2];
               String var27 = "J;YhYhYh";
               var10002.setForeground(com.xy.q.Class49.c("#c000000"));
               this.xr[var2].setHorizontalAlignment(10);
               this.xr[var2].setBounds(359, 146 + 26 * (var2 - 5), 72, 19);
            }

            var6 = this;
         }

         var6.add(this.xr[var2++]);
      }

      this.xz = new com.xy.q.Class47(this, 30);
      this.xz.be(true);
      this.xz.setBounds(49, 53, 164, 335);
      this.xz.ajr().setFont(com.xy.q.Class49.ac);
      this.add(this.xz);
      this.xz.ajq().removeAllChildren();
      this.xz.t();
      this.av = new RichLabel();
      this.ed = new RichLabel();
      String var10009 = "\u0004U\u00167\u00177\u0004d\u00155\u001fE\u00155\b>\u001e>\u001e";
      this.av.setText("#R1000#c228B22/9999");
      var10008 = "{;iYhY{\nj[`+j[wPaPa";
      this.ed.setText("#R1000#c228B22/9999");
      this.av.setBounds(359, 122, 60, 16);
      this.ed.setBounds(432, 122, 60, 16);
      this.add(this.av);
      this.add(this.ed);
      this.to = new RichLabel();
      this.xw = new RichLabel();
      this.to.setTextSize("", 123);
      this.xw.setTextSize("", 123);
      this.ba = com.xy.q.Class1.g(221, 265, 138, 119, this.to, 20);
      this.xv = com.xy.q.Class1.g(366, 265, 138, 119, this.xw, 20);
      this.add(this.ba);
      this.add(this.xv);
      this.xy = new com.xy.q.Class54[2];

      for (int var7 = var2 = 0; var7 < this.xy.length; var7 = var2) {
         this.xy[var2] = new com.xy.q.Class54(this);
         this.xy[var2].wp(com.xy.q.Class54.auc);
         com.xy.q.Class54 var28 = this.xy[var2];
         String var32 = "tD(C(\u0013)Wi@";
         var28.dq("sc/d/4.png");
         this.xy[var2].setBounds(359 + 73 * var2, 66, 59, 57);
         this.add(this.xy[var2++]);
      }

      this.j = new com.xy.w.Class18[8];

      for (int var8 = var2 = 0; var8 < this.j.length; var8 = var2) {
         Class40 var9;
         label132: {
            this.j[var2] = new com.xy.w.Class18();
            if (var2 >= 0 && var2 <= 2) {
               com.xy.w.Class18 var19 = this.j[var2];
               String var25 = "+\nw\rw[mG(\u0007?";
               var19.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
               if (var2 == 0) {
                  var9 = this;
                  this.j[var2].setBounds(48, 32, 163, 21);
                  break label132;
               }

               if (var2 == 1) {
                  var9 = this;
                  this.j[var2].setBounds(220, 246, 137, 21);
                  break label132;
               }

               if (var2 == 2) {
                  var9 = this;
                  this.j[var2].setBounds(365, 246, 137, 21);
                  break label132;
               }
            } else if (var2 >= 3 && var2 <= 5) {
               com.xy.w.Class18 var18 = this.j[var2];
               String var24 = "Td\bc\b5\u0013)Wi@";
               var18.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
               if (var2 == 3) {
                  var9 = this;
                  this.j[var2].setBounds(48, 32, 163, 355);
                  break label132;
               }

               if (var2 == 4) {
                  var9 = this;
                  this.j[var2].setBounds(220, 246, 137, 141);
                  break label132;
               }

               if (var2 == 5) {
                  var9 = this;
                  this.j[var2].setBounds(365, 246, 137, 141);
                  break label132;
               }
            } else {
               if (var2 == 6) {
                  var9 = this;
                  com.xy.w.Class18 var23 = this.j[var2];
                  String var29 = "+\nw\rwXnG(\u0007?";
                  var23.mt(com.xy.w.Class16.m("sc/d/16.png", 2, 2, 2, 2, false));
                  this.j[var2].setBounds(226, 43, 127, 180);
                  break label132;
               }

               if (var2 == 7) {
                  com.xy.w.Class18 var17 = this.j[var2];
                  String var22 = "Td\bc\b4\u0011)Wi@";
                  var17.mt(com.xy.w.Class16.m("sc/d/36.png", 20, 20, 20, 20, false));
                  this.j[var2].setBounds(219, 32, 284, 205);
               }
            }

            var9 = this;
         }

         var9.add(this.j[var2++]);
      }
   }

   public void c() {
      RoleData var1;
      Class40 var5;
      label28: {
         LoginResult var2 = (var1 = this.yx()).getLoginResult();
         this.xq.ef(var2.getGold().longValue());
         int var3;
         if (this.hh != null && (var3 = var1.getGoodNum(this.hh)) != this.ae) {
            if (this.xt > var3) {
               RichLabel var6 = this.av;
               String var17 = "J\n";
               StringBuilder var9 = new StringBuilder("#R").append(var3);
               String var13 = "\u0004d\u00155\u001fE\u00155\b";
               StringBuilder var14 = var9.append("#c228B22/");
               var5 = this;
               var6.setText(var14.append(this.xt).toString());
               break label28;
            }

            RichLabel var10000 = this.av;
            String var10003 = "J;[jQ\u001a[j";
            StringBuilder var10001 = new StringBuilder("#c228B22").append(var3);
            String var10002 = "\b";
            var10000.setText(var10001.append("/").append(this.xt).toString());
         }

         var5 = this;
      }

      int var4;
      if (var5.xu != null && (var4 = var1.getGoodNum(this.xu)) != this.gt) {
         if (this.ia > var4) {
            RichLabel var8 = this.ed;
            String var19 = "J\n";
            StringBuilder var12 = new StringBuilder("#R").append(var4);
            String var16 = "\u0004d\u00155\u001fE\u00155\b";
            var8.setText(var12.append("#c228B22/").append(this.ia).toString());
            return;
         }

         RichLabel var7 = this.ed;
         String var18 = "J;[jQ\u001a[j";
         StringBuilder var11 = new StringBuilder("#c228B22").append(var4);
         String var15 = "\b";
         var7.setText(var11.append("/").append(this.ia).toString());
      }
   }

   public void e() {
      int var1;
      for (int var10000 = var1 = 0; var10000 < this.xy.length; var10000 = var1) {
         this.xy[var1].gs(0, null);
         this.xy[var1++].setVisible(true);
      }

      this.av.setText("");
      this.ed.setText("");
      this.hh = null;
      this.xu = null;
      this.xt = 0;
      this.ae = 0;
      this.ia = 0;
      this.gt = 0;
      this.gb.setText(null);
      this.bt = null;
   }

   public void sr(petExchange var1) {
      StringBuffer var2 = new StringBuffer();
      String var3;
      if (var1 != null && this.ha == 0 && var1.geteType() == 2 && (var3 = var1.getSkill()) != null && !"".equals(var3)) {
         String var10001 = "[[";
         String[] var4 = var3.split("\\|");

         int var5;
         for (int var10000 = var5 = 0; var10000 < var4.length; var10000 = var5) {
            Skill var6 = this.yt().ac(var4[var5]);
            var2.append(var6.getSkillname());
            String var10002 = "J*";
            var2.append("#r");
            this.xw.setText(var2.toString());
            Dimension var7 = this.xw.computeSize(123);
            this.xw.setSize(var7);
            var5++;
            this.xw.setPreferredSize(var7);
         }
      } else {
         this.xw.setTextSize(var2.toString(), 123);
      }
   }

   public void g(int var1) {
      if (this.ha != var1) {
         this.ha = var1;
         String var2;
         if (this.ha == 0) {
            var2 = "呡扈";
            var2 = "合成";
         } else {
            var2 = "幼匱";
            var2 = "幻化";
         }

         this.xs.setText(var2);
         this.h();
         this.sq(this.yt().aq().getAllPetExchange());
      }

      this.c();
      this.zc().b(this.lj());
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.afx.dh()) {
         this.c();
      }
   }

   public void f() {
      RoleData var1 = this.yx();
      if (this.ha == 0 && var1.pets.size() >= 21) {
         String var19 = "悯皣叫唃兺又搽币皃敗釈巕滦Ｆ＆Ｆ";
         this.afx._do("您的召唤兽可携带的数量已满！！！");
      } else {
         petExchange var2 = this.ya;
         if (this.ya == null) {
            String var18 = "泹杠遑乄厴啍儥";
            this.afx._do("没有选中召唤兽");
         } else if (this.bt != null && var1.getLoginResult().getGold().compareTo(this.bt) < 0) {
            String var17 = "釖颺上趔";
            this.afx._do("金额不足");
         } else {
            String var3;
            if ((var3 = var2.getConsume()) != null && !"".equals(var3)) {
               String var10001 = "5$";
               String[] var4 = var3.split("\\|");

               int var5;
               for (int var10000 = var5 = 0; var10000 < var4.length; var10000 = ++var5) {
                  String var12 = var4[var5];
                  var10001 = "`";
                  if (var12.startsWith("G")) {
                     String var13 = var4[var5];
                     var10001 = "e";
                     String[] var6 = var13.split("=");
                     Goodstable var7 = this.yt().ay(new BigDecimal(var6[1]));
                     int var8 = Integer.parseInt(var6[2]);
                     int var9 = var1.getGoodNum(var7.getGoodsid());
                     if (var8 > var9) {
                        var10001 = "吏户杗斾上趔";
                        this.afx._do("合成材料不足");
                        return;
                     }
                  }
               }
            }

            SummonPetBean var10 = new SummonPetBean();
            var10.setOpertype(2);
            var10.setPetid(new BigDecimal(var2.geteId()));
            String var11 = Agreement.getSendTextAES("summonpet", com.xy.v.Class31.a().toJson(var10));
            this.za().k(var11);
         }
      }
   }

   @Override
   protected void paintChildren(Graphics var1) {
      super.paintChildren(var1);
      if (this.xx != null) {
         this.xx.r(var1, 300, 201, 0, com.xy.v.Class22.l());
      }
   }

   public void ln(petExchange var1) {
      this.e();
      if (var1 != null) {
         String var2;
         if (!com.xy.v.Class12.h(var2 = var1.getConsume())) {
            String var10001 = "5$";
            String[] var3 = var2.split("\\|");
            int var4 = 0;

            int var5;
            for (int var10000 = var5 = 0; var10000 < var3.length; var10000 = ++var5) {
               String var10 = var3[var5];
               var10001 = "c";
               if (var10.startsWith("D")) {
                  String var11 = var3[var5];
                  var10001 = "e";
                  String[] var6 = var11.split("=");
                  this.bt = new BigDecimal(var6[1]);
                  com.xy.q.Class49.b(this.gb, this.bt.longValue());
               } else {
                  String var12 = var3[var5];
                  var10001 = "`";
                  if (var12.startsWith("G")) {
                     String var13 = var3[var5];
                     var10001 = "e";
                     String[] var9 = var13.split("=");
                     BigDecimal var7 = new BigDecimal(var9[1]);
                     Class40 var14;
                     if (var4 == 0) {
                        this.hh = var7;
                        var14 = this;
                        this.xt = Integer.parseInt(var9[2]);
                        this.ae = -1;
                     } else {
                        this.xu = var7;
                        var14 = this;
                        this.ia = Integer.parseInt(var9[2]);
                        this.gt = -1;
                     }

                     Goodstable var8 = var14.yt().ay(var7);
                     com.xy.q.Class54 var15 = this.xy[var4];
                     var4++;
                     var15.gs(1, var8);
                  }
               }
            }

            this.c();
         }
      }
   }

   public void lr(petExchange var1) {
      StringBuffer var2 = new StringBuffer();
      if (var1 != null && this.ha == 0 && var1.geteType() == 2) {
         String var10001 = "戗镘玀\u001d";
         var2.append("成长率:");
         var2.append(var1.getGrow());
         String var10003 = "J*";
         var2.append("#r");
         String var10004 = "衇刺倻\u001d";
         var2.append("血初值:");
         var2.append(var1.getHp());
         String var10006 = "J*";
         var2.append("#r");
         String var10007 = "泒刺倻\u001d";
         var2.append("法初值:");
         var2.append(var1.getMp());
         String var10009 = "J*";
         var2.append("#r");
         String var10010 = "劘刺倻\u001d";
         var2.append("功初值:");
         var2.append(var1.getAp());
         String var10012 = "J*";
         var2.append("#r");
         String var10013 = "效刺倻\u001d";
         var2.append("敏初值:");
         var2.append(var1.getSp());
         String var10015 = "J*";
         var2.append("#r");
         String var10016 = "亳衋\u001d";
         var2.append("五行:");
         var2.append(var1.getFive());
         String var10018 = "J*";
         var2.append("#r");
      }

      this.to.setTextSize(var2.toString(), 123);
   }

   public void h() {
      this.ya = null;
      this.xx = null;
      this.lr(null);
      this.sr(null);
      this.e();
   }
}
