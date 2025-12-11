package com.xy.a;

import com.xy.entity.Lingbao;
import com.xy.formula.BaseValue;
import com.xy.formula.ExpUtil;
import com.xy.formula.FBUtil;
import com.xy.formula.PropertyUtil;
import com.xy.readbean.Goodstable;
import com.xy.readbean.Skill;
import com.xy.richtext.ChatBoxOld;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.math.BigDecimal;
import javax.swing.JLabel;

public class Class7 extends com.xy.q.Class30 {
   private JLabel cy;
   private JLabel cz;
   private JLabel da;
   private JLabel db;
   private JLabel dc;
   private JLabel[] c;
   private Image dd;
   private com.xy.w.Class18[] de;
   private JLabel bd;
   private JLabel df;
   private ChatBoxOld dg = new ChatBoxOld();
   private JLabel dh;
   private com.xy.w.Class18[] j;
   private JLabel di;
   private ChatBoxOld dj;

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.dd != null) {
         var1.drawImage(this.dd, 10, 30, 96, 96, this);
      }

      Graphics var2 = var1.create(110, 30, 360, 125);
      this.dg.paint(var2);
      var2.dispose();
      Graphics var3 = var1.create(180, 140, 285, 105);
      this.dj.paint(var3);
      var3.dispose();
   }

   public void cp(int var1, String var2) {
      String var10001 = "巟彮吂";
      Class7 var10000;
      if (var2.equals("已开启")) {
         var10000 = this;
         com.xy.w.Class18 var3 = this.j[var1];
         String var10002 = "\u0007Y[^[\u000eB\u0014\u0004T\u0013";
         var3.dp("sc/d/46.png");
      } else {
         label16: {
            var10001 = "朇彮吂";
            if (!var2.equals("未开启")) {
               var10001 = "旚没强呛";
               if (!var2.equals("无法开启")) {
                  var10000 = this;
                  this.j[var1].gt(com.xy.w.Class15.o(var2));
                  break label16;
               }
            }

            var10000 = this;
            com.xy.w.Class18 var6 = this.j[var1];
            String var7 = "^\r\u0002\n\u0002Z\u001a@]\u0000J";
            var6.dp("sc/d/47.png");
         }
      }

      var10000.c[var1].setText(var2);
   }

   public Class7(GameView var1) {
      super(45, 4, com.xy.q.Class30.afz, var1);
      this.de = new com.xy.w.Class18[5];
      this.dj = new ChatBoxOld();
      this.j = new com.xy.w.Class18[5];
      this.c = new JLabel[5];
      String var10009 = "^\r\u0002\r\u0002V\u001d";
      this.yy(-1, 0, 470, 310, com.xy.q.Class30.agf);
      this.yu(com.xy.w.Class16.m("sc/c/80", 20, 20, 20, 20, false), null);
      this.dh = new JLabel();
      this.dh.setBounds(15, 5, 90, 25);
      this.dh.setForeground(new Color(205, 79, 57));
      this.dh.setFont(com.xy.q.Class49.bm);
      this.dh.setHorizontalAlignment(0);
      this.dh.setVerticalAlignment(0);
      this.add(this.dh);
      this.cz = new JLabel();
      this.cz.setBounds(110, 5, 75, 25);
      this.cz.setFont(com.xy.q.Class49.bm);
      this.cz.setForeground(Color.WHITE);
      this.add(this.cz);
      this.cy = new JLabel();
      this.cy.setBounds(185, 5, 80, 25);
      this.cy.setFont(com.xy.q.Class49.bm);
      this.cy.setForeground(new Color(205, 79, 57));
      this.add(this.cy);
      this.di = new JLabel();
      this.di.setBounds(110, 30, 300, 25);
      this.di.setFont(com.xy.q.Class49.bm);
      this.di.setForeground(Color.WHITE);
      this.add(this.di);
      this.bd = new JLabel();
      this.bd.setBounds(110, 140, 30, 25);
      this.bd.setFont(com.xy.q.Class49.bm);
      this.bd.setForeground(new Color(210, 180, 140));
      String var10007 = "笜瞇";
      this.bd.setText("符石");
      this.add(this.bd);
      int var2 = 0;

      for (int var10000 = var2; var10000 < 5; var10000 = var2) {
         this.de[var2] = new com.xy.w.Class18();
         this.de[var2].setBounds(145, 145 + var2 * 18, 18, 18);
         this.add(this.de[var2++]);
      }

      this.df = new JLabel();
      this.df.setBounds(110, 240, 300, 25);
      this.df.setFont(com.xy.q.Class49.bm);
      this.df.setForeground(new Color(164, 211, 238));
      String var10003 = "奇赦拮胐T\r传纊桗骅瀞艟N\r传纊桗骅瀞艟";
      this.df.setText("天赋技能: 低级根骨灰色  低级根骨灰色");
      this.add(this.df);
      this.da = new JLabel();
      this.da.setBounds(110, 260, 300, 25);
      this.da.setFont(com.xy.q.Class49.bm);
      this.da.setForeground(new Color(162, 181, 205));
      String var10004 = "擿锋抺肉\u0000T佴结栃髜\u001aT佴结栃髜\u001aT佴结栃髜";
      this.da.setText("擅长技能: 低级根骨  低级根骨  低级根骨");
      this.add(this.da);
      this.db = new JLabel();
      this.db.setBounds(175, 280, 300, 25);
      this.db.setFont(com.xy.q.Class49.bm);
      this.db.setForeground(new Color(162, 181, 205));
      String var10005 = "传纊桗骅N\r传纊桗骅N\r传纊桗骅";
      this.db.setText("低级根骨  低级根骨  低级根骨");
      this.add(this.db);
      this.dc = new JLabel();
      this.dc.setBounds(15, 160, 90, 25);
      this.dc.setForeground(new Color(238, 232, 205));
      this.dc.setFont(com.xy.q.Class49.bm);
      this.dc.setHorizontalAlignment(0);
      this.dc.setVerticalAlignment(0);
      String var10006 = "抺肉";
      this.dc.setText("技能");
      this.add(this.dc);
      var2 = 0;

      for (int var4 = var2; var4 < 5; var4 = var2) {
         this.j[var2] = new com.xy.w.Class18();
         this.j[var2].setBounds(15, 185 + var2 * 20, 20, 20);
         this.add(this.j[var2]);
         this.c[var2] = new JLabel();
         this.c[var2].setBounds(40, 176 + var2 * 21, 60, 30);
         this.c[var2].setFont(com.xy.q.Class49.bm);
         this.c[var2].setForeground(new Color(162, 181, 205));
         JLabel var5 = this.c[var2];
         var10004 = "痐飣髊雅";
         var5.setText("疾风骤雨");
         this.add(this.c[var2++]);
      }
   }

   public void cq(Lingbao var1) {
      StringBuffer var2;
      StringBuffer var10000 = var2 = new StringBuffer();
      String var10001 = "奝赱拴胇N";
      var10000.append("天赋技能:");
      var2.append(var1.getBaoname());
      this.df.setText(var2.toString());
      String var10007 = "撫镒拮胐T旍";
      this.da.setText("擅长技能:无");
      this.db.setText("");
      this.dj.removemsg();
      this.dg.removemsg();
      int var3 = 0;

      for (int var22 = var3; var22 < 5; var22 = var3) {
         int var27 = var3;
         String var10004 = "旚没强呛";
         this.cp(var3, "无法开启");
         String var10002 = "MN*\u001f,\u0019Vn斎泸彮吂";
         String var10003 = "\u0007Y[^[\u000e@\u0014\u0004T\u0013";
         var3++;
         this.ct(var27, "#cD2B48C无法开启", com.xy.w.Class16.c("sc/d/44.png"));
      }

      ChatBoxOld var28 = this.dg;
      String var42 = "Mt";
      StringBuilder var34 = new StringBuilder("#Y");
      String var38 = var1.getKangxing();
      var42 = "I";
      var34 = var34.append(var38.split("=")[0]);
      var38 = "\r";
      var34 = var34.append(" ");
      var38 = var1.getKangxing();
      var42 = "I";
      var28.addText(var34.append(var38.split("=")[1]).toString(), 350);
      ChatBoxOld var23 = this.dg;
      var38 = "\u000e7遾蠢\u0017M\u007f";
      StringBuilder var29 = new StringBuilder("#Y道行:#R").append(ExpUtil.h(var1.getLingbaoexe().longValue() + ExpUtil.e(var1.getLingbaolvl().intValue() - 1)));
      String var37 = "[";
      var23.addText(var29.append("/").append(ExpUtil.h(ExpUtil.e(var1.getLingbaolvl().intValue()))).toString(), 350, com.xy.q.Class49.ac);
      Skill var20 = this.yt().bq(var1.getBaoname());
      if (var20 != null) {
         int var4 = Integer.parseInt(var20.getSkillid());
         int var5 = this.afx.roleUnit.ap.getTurnAround();
         int var6 = com.xy.v.Class4.s(this.afx.roleUnit.ap.getGrade());
         int var7 = this.yx().getFaPJ();
         int var8 = BaseValue.getQv(var1.getBaoquality());
         int var9 = var1.getLingbaolvl().intValue();
         int var10 = BaseValue.getFBlvl(var5, var6, var7, var8, var9);
         double var11 = 0.0;
         double var13 = 0.0;
         if (var20.getGrow() != null && !var20.getGrow().equals("")) {
            var11 = Double.parseDouble(var20.getGrow());
         }

         if (var20.getValue() != null && !var20.getGrow().equals("")) {
            var13 = Double.parseDouble(var20.getValue());
         }

         String var15 = com.xy.v.Class12.e(var13 + var10 * var11, 1);
         String var16 = String.valueOf(FBUtil.getFBcx(var4, var9));
         String var17 = null;
         String var18 = String.valueOf(FBUtil.getFBsum(var4, var9));
         Skill var24;
         if (var4 == 4014) {
            var17 = String.valueOf((int)((var13 + var10 * var11) * 12500.0));
            var24 = var20;
         } else {
            if (var4 == 4015) {
               var17 = com.xy.v.Class12.e((var13 + var10 * var11) * 2.0 / 3.0, 1);
            }

            var24 = var20;
         }

         String var25 = var24.getRemark();
         var10001 = "\u0015榯珩P";
         String var26 = var25.replace("{概率}", var15);
         var10001 = "A嚪吲\t";
         String var19 = var26.replace("{回合}", var16);
         if (var17 != null) {
            var10001 = "\u0015敝偒P";
            var19 = var19.replace("{数值}", var17);
         }

         var10001 = "A皚栽\t";
         var19 = var19.replace("{目标}", var18);
         this.dg.addText(var19, 350);
      }
   }

   public void cr(boolean var1) {
      int var2 = this.getWidth();
      int var3 = this.getHeight();
      Point var4 = var1 ? this.ze().df(var2, var3) : this.ze().dd(var2, var3);
      this.yv(var4.x, var4.y, var2, var3);
      this.zc().b(this.lj());
   }

   public void cs(Lingbao var1, boolean var2) {
      String var10009 = "哻赜\u001aT";
      this.dh.setText("品质  " + var1.getBaoquality());
      this.cz.setText(var1.getBaoname());
      JLabel var10004 = this.cy;
      StringBuilder var10005 = new StringBuilder().append(var1.getLingbaolvl());
      String var10006 = "N纊";
      var10004.setText(var10005.append(" 级").toString());
      String var75 = "T";
      this.di.setText(" ");
      this.dd = com.xy.w.Class15.b(var1.getSkin());
      String var10000 = var1.getBaotype();
      String var10001 = "治宰";
      if (var10000.equals("法宝")) {
         this.cq(var1);
         this.cr(var2);
      } else {
         if (var1.getTianfuskill() == null) {
            var1.setTianfuskill("");
         }

         var10000 = var1.getTianfuskill();
         var10001 = "f\b";
         String[] var3 = var10000.split("\\|");
         StringBuffer var4;
         StringBuffer var20 = var4 = new StringBuffer();
         var10001 = "处败抭肓\u0017";
         var20.append("天赋技能:");
         int var5 = 0;

         for (int var21 = var5; var21 < var3.length; var21 = var5) {
            String var10003 = "T";
            StringBuilder var36 = new StringBuilder(" ");
            String var10002 = var3[var5];
            var5++;
            var4.append(var36.append(var10002).toString());
         }

         this.df.setText(var4.toString());
         String[] var13 = null;
         if (var1.getGoodskill() != null && !var1.getGoodskill().equals("")) {
            var10000 = var1.getGoodskill();
            var10001 = "2Q";
            var13 = var10000.split("\\|");
         }

         StringBuffer var6 = new StringBuffer();
         String var49 = "撱镅拴胇N";
         var6.append("擅长技能:");
         int var7;
         if (var13 != null) {
            for (int var23 = var7 = 0; var23 < var13.length && var7 < 3; var23 = var7) {
               String var63 = "\r";
               StringBuilder var38 = new StringBuilder(" ");
               var49 = var13[var7];
               var7++;
               var6.append(var38.append(var49).toString());
            }
         }

         this.da.setText(var6.toString());
         StringBuffer var16 = new StringBuffer();
         int var8;
         if (var13 != null && var13.length >= 3) {
            for (int var24 = var8 = 3; var24 < var13.length; var24 = var8) {
               String var64 = "T";
               StringBuilder var39 = new StringBuilder(" ");
               var49 = var13[var8];
               var8++;
               var16.append(var39.append(var49).toString());
            }
         }

         this.db.setText(var16.toString());
         this.dg.removemsg();
         this.dg.addText(PropertyUtil.getBaoString(var1, this.yx(), 240), 350);
         ChatBoxOld var40 = this.dg;
         String var76 = "Mt";
         StringBuilder var52 = new StringBuilder("#Y");
         String var65 = var1.getKangxing();
         String var77 = "I";
         StringBuilder var53 = var52.append(var65.split("=")[0]);
         var65 = "\r";
         StringBuilder var54 = var53.append(" ");
         var65 = var1.getKangxing();
         String var78 = "I";
         var40.addText(var54.append(var65.split("=")[1]).toString(), 350);
         ChatBoxOld var25 = this.dg;
         var65 = "\u000e7遾蠢\u0017M\u007f";
         StringBuilder var41 = new StringBuilder("#Y道行:#R")
            .append(ExpUtil.h(var1.getLingbaoexe().longValue() + ExpUtil.e(var1.getLingbaolvl().intValue() - 1)));
         var49 = "[";
         var25.addText(var41.append("/").append(ExpUtil.h(ExpUtil.e(var1.getLingbaolvl().intValue()))).toString(), 350, com.xy.q.Class49.ac);
         String[] var14 = null;
         if (var1.getSkills() != null && !var1.getSkills().equals("")) {
            var10000 = var1.getSkills();
            var10001 = "2Q";
            var14 = var10000.split("\\|");
         }

         for (int var27 = var8 = 0; var27 < 5; var27 = ++var8) {
            if (var8 < var1.getSkillsum()) {
               if (var14 != null && var8 < var14.length) {
                  var49 = var14[var8];
                  var65 = "I";
                  this.cp(var8, var49.split("=")[0]);
               } else {
                  var49 = "巟彮吂";
                  this.cp(var8, "已开启");
               }
            } else {
               var49 = "杞强呛";
               this.cp(var8, "未开启");
            }
         }

         String[] var15 = null;
         if (var1.getFushis() != null && !var1.getFushis().equals("")) {
            var10000 = var1.getFushis();
            var10001 = "2Q";
            var15 = var10000.split("\\|");
         }

         this.dj.removemsg();

         for (int var29 = var8 = 0; var29 < 5; var29 = ++var8) {
            if (var8 >= var1.getFusum()) {
               var49 = "WY0\b6\u000eLy杞强呛";
               var65 = "^\r\u0002\n\u0002Z\u0019@]\u0000J";
               this.ct(var8, "#cD2B48C未开启", com.xy.w.Class16.c("sc/d/44.png"));
            } else if (var15 != null && var8 < var15.length) {
               Goodstable var9;
               if ((var9 = this.yx().getGoodEquip(new BigDecimal(var15[var8]))) != null) {
                  var10000 = var9.getValue();
                  var10001 = "f\b";
                  String[] var10 = var10000.split("\\|");
                  StringBuffer var11;
                  StringBuffer var31 = var11 = new StringBuffer();
                  var10001 = "MN*\u001f,\u0019Vn";
                  var31.append("#cD2B48C");
                  int var12 = 0;

                  for (int var32 = var12; var32 < var10.length; var32 = ++var12) {
                     if (var12 == 0) {
                        StringBuilder var46 = new StringBuilder("[");
                        var49 = var10[var12];
                        var65 = "I";
                        var11.append(var46.append(var49.split("=")[1]).append("]").toString());
                     } else {
                        var10000 = var10[var12];
                        var10001 = "烒噅尰怊";
                        if (var10000.indexOf("炼器属性") == -1) {
                           var65 = var10[var12];
                           String var79 = "I";
                           StringBuilder var48 = new StringBuilder(String.valueOf(var65.split("=")[0]));
                           var49 = var10[var12];
                           var65 = "\u0010";
                           var11.append(var48.append(var49.split("=")[1]).toString());
                        }
                     }
                  }

                  this.ct(var8, var11.toString(), com.xy.w.Class15.j(var9.getSkin()));
               }
            } else {
               var49 = "WY0\b6\u000eLy嶆强呛";
               var65 = "^\r\u0002\n\u0002Z\u001e@]\u0000J";
               this.ct(var8, "#cD2B48C已开启", com.xy.w.Class16.c("sc/d/43.png"));
            }
         }

         this.cr(var2);
      }
   }

   public void ct(int var1, String var2, Image var3) {
      this.dj.addText(var2, 285);
      this.de[var1].gt(var3);
   }
}
