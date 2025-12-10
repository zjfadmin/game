package com.xy;

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

public class Class73 extends Class345 {
   private JLabel lf;
   private JLabel lg;
   private Class436[] lh;
   private JLabel li;
   private JLabel lj;
   private JLabel lk;
   private Image ll;
   private Class436[] ce;
   private JLabel as;
   private JLabel at;
   private JLabel bd;
   private JLabel[] hj;
   private ChatBoxOld lm;
   private ChatBoxOld ln;
   private JLabel ax;

   public void gd(int var1, String var2) {
      Class73 var10000;
      if (var2.equals("已开启")) {
         var10000 = this;
         this.lh[var1].fw("sc/d/46.png");
      } else if (!var2.equals("未开启") && !var2.equals("无法开启")) {
         var10000 = this;
         this.lh[var1].hf(Class222.a(var2));
      } else {
         var10000 = this;
         this.lh[var1].fw("sc/d/47.png");
      }

      var10000.hj[var1].setText(var2);
   }

   public void r(boolean var1) {
      int var2 = this.getWidth();
      int var3 = this.getHeight();
      Point var4 = var1 ? this.ux().vn(var2, var3) : this.ux().abg(var2, var3);
      this.vf(var4.x, var4.y, var2, var3);
      this.ve().a(this.ae());
   }

   public void ge(Lingbao var1, boolean var2) {
      this.lk.setText("品质  " + var1.getBaoquality());
      this.lj.setText(var1.getBaoname());
      this.ax.setText(var1.getLingbaolvl() + " 级");
      this.lf.setText(" ");
      this.ll = Class222.j(var1.getSkin());
      if (var1.getBaotype().equals("法宝")) {
         this.fn(var1);
         this.r(var2);
      } else {
         if (var1.getTianfuskill() == null) {
            var1.setTianfuskill("");
         }

         String[] var3 = var1.getTianfuskill().split("\\|");
         StringBuffer var4;
         (var4 = new StringBuffer()).append("天赋技能:");
         int var5 = 3 ^ 3;

         int var10000;
         StringBuilder var10001;
         String var10002;
         for(var10000 = var5; var10000 < var3.length; var10000 = var5) {
            var10001 = new StringBuilder(" ");
            var10002 = var3[var5];
            ++var5;
            var4.append(var10001.append(var10002).toString());
         }

         this.lg.setText(var4.toString());
         String[] var13 = null;
         if (var1.getGoodskill() != null && !var1.getGoodskill().equals("")) {
            var13 = var1.getGoodskill().split("\\|");
         }

         StringBuffer var9 = new StringBuffer();
         var9.append("擅长技能:");
         int var11;
         if (var13 != null) {
            for(var10000 = var11 = 3 ^ 3; var10000 < var13.length && var11 < --3; var10000 = var11) {
               var10001 = new StringBuilder(" ");
               var10002 = var13[var11];
               ++var11;
               var9.append(var10001.append(var10002).toString());
            }
         }

         this.li.setText(var9.toString());
         var4 = new StringBuffer();
         int var10;
         if (var13 != null && var13.length >= --3) {
            for(var10000 = var10 = --3; var10000 < var13.length; var10000 = var10) {
               var10001 = new StringBuilder(" ");
               var10002 = var13[var10];
               ++var10;
               var4.append(var10001.append(var10002).toString());
            }
         }

         this.as.setText(var4.toString());
         this.ln.removemsg();
         this.ln.addText(PropertyUtil.getBaoString(var1, this.vd(), 13815 & 19192), 17278 & 15839);
         this.ln.addText("#Y" + var1.getKangxing().split("=")[5 >> 3] + " " + var1.getKangxing().split("=")[3 >> 1], 20319 & 12798);
         this.ln.addText("#Y道行:#R" + ExpUtil.e(var1.getLingbaoexe().longValue() + ExpUtil.b(var1.getLingbaolvl().intValue() - (3 >> 1))) + "/" + ExpUtil.e(ExpUtil.b(var1.getLingbaolvl().intValue())), 11231 & 21886, Class681.ce);
         var13 = null;
         if (var1.getSkills() != null && !var1.getSkills().equals("")) {
            var13 = var1.getSkills().split("\\|");
         }

         for(var10000 = var10 = 0; var10000 < 5; var10000 = var10) {
            if (var10 < var1.getSkillsum()) {
               if (var13 != null && var10 < var13.length) {
                  this.gd(var10, var13[var10].split("=")[5 >> 3]);
               } else {
                  this.gd(var10, "已开启");
               }
            } else {
               this.gd(var10, "未开启");
            }

            ++var10;
         }

         var13 = null;
         if (var1.getFushis() != null && !var1.getFushis().equals("")) {
            var13 = var1.getFushis().split("\\|");
         }

         this.lm.removemsg();

         for(var10000 = var10 = 3 & 4; var10000 < 5; var10000 = var10) {
            if (var10 >= var1.getFusum()) {
               this.gf(var10, "#cD2B48C未开启", Class511.a("sc/d/44.png"));
            } else if (var13 != null && var10 < var13.length) {
               Goodstable var12;
               if ((var12 = this.vd().getGoodEquip(new BigDecimal(var13[var10]))) != null) {
                  String[] var6 = var12.getValue().split("\\|");
                  StringBuffer var7;
                  (var7 = new StringBuffer()).append("#cD2B48C");
                  int var8 = 3 ^ 3;

                  for(var10000 = var8; var10000 < var6.length; var10000 = var8) {
                     if (var8 == 0) {
                        var7.append("[" + var6[var8].split("=")[--1] + "]");
                     } else if (var6[var8].indexOf("炼器属性") == -4 >> 2) {
                        var7.append(var6[var8].split("=")[3 & 4] + var6[var8].split("=")[--1]);
                     }

                     ++var8;
                  }

                  this.gf(var10, var7.toString(), Class222.h(var12.getSkin()));
               }
            } else {
               this.gf(var10, "#cD2B48C已开启", Class511.a("sc/d/43.png"));
            }

            ++var10;
         }

         this.r(var2);
      }
   }

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.ll != null) {
         var1.drawImage(this.ll, 106 & 31, 95 & 62, 106 & 117, 106 & 117, this);
      }

      Graphics var10000 = var1;
      var1 = var1.create(110 & 127, 94 & 63, 31724 & 1403, 125 & 127);
      int var10001 = 14774 & 18173;
      this.ln.paint(var1);
      var1.dispose();
      var1 = var10000.create(var10001, 5375 & 27532, 16735 & 16317, 111 & 121);
      this.lm.paint(var1);
      var1.dispose();
   }

   public Class73(GameView var1) {
      int var10001 = --5;
      super(109 & 63, --4, Class345.aef, var1);
      this.ln = new ChatBoxOld();
      Class436[] var3 = new Class436[var10001];
      boolean var10003 = true;
      this.ce = var3;
      var10001 = --5;
      this.lm = new ChatBoxOld();
      var3 = new Class436[var10001];
      var10003 = true;
      this.lh = var3;
      JLabel[] var4 = new JLabel[--5];
      var10003 = true;
      this.hj = var4;
      this.va(-4 >> 2, 3 ^ 3, 3031 & 30206, 29503 & 3574, Class345.aei);
      this.uv(Class511.q("sc/c/80", 84 & 63, 84 & 63, 84 & 63, 84 & 63, (boolean)(2 & 5)), (String)null);
      this.lk = new JLabel();
      this.lk.setBounds(63 & 79, --5, 91 & 126, 63 & 89);
      this.lk.setForeground(new Color(1759 & 31213, 95 & 111, 63 & 121));
      this.lk.setFont(Class681.ad);
      this.lk.setHorizontalAlignment(3 ^ 3);
      this.lk.setVerticalAlignment(3 ^ 3);
      this.add(this.lk);
      this.lj = new JLabel();
      this.lj.setBounds(126 & 111, --5, 95 & 107, 29 & 123);
      this.lj.setFont(Class681.ad);
      this.lj.setForeground(Color.WHITE);
      this.add(this.lj);
      this.ax = new JLabel();
      this.ax.setBounds(32509 & 443, --5, 120 & 87, 125 & 27);
      this.ax.setFont(Class681.ad);
      this.ax.setForeground(new Color(205, 79, 57));
      this.add(this.ax);
      this.lf = new JLabel();
      this.lf.setBounds(110, 30, 300, 25);
      this.lf.setFont(Class681.ad);
      this.lf.setForeground(Color.WHITE);
      this.add(this.lf);
      this.bd = new JLabel();
      this.bd.setBounds(110, 140, 30, 25);
      this.bd.setFont(Class681.ad);
      this.bd.setForeground(new Color(210, 180, 140));
      this.bd.setText("符石");
      this.add(this.bd);
      int var2 = 3 >> 2;

      int var10000;
      for(var10000 = var2; var10000 < 5; var10000 = var2) {
         this.ce[var2] = new Class436();
         this.ce[var2].setBounds(145, 145 + var2 * 18, 18, 18);
         this.add(this.ce[var2++]);
      }

      this.lg = new JLabel();
      this.lg.setBounds(110, 240, 300, 25);
      this.lg.setFont(Class681.ad);
      this.lg.setForeground(new Color(164, 211, 238));
      this.lg.setText("天赋技能: 低级根骨灰色  低级根骨灰色");
      this.add(this.lg);
      this.li = new JLabel();
      this.li.setBounds(110, 260, 300, 25);
      this.li.setFont(Class681.ad);
      this.li.setForeground(new Color(162, 181, 205));
      this.li.setText("擅长技能: 低级根骨  低级根骨  低级根骨");
      this.add(this.li);
      this.as = new JLabel();
      this.as.setBounds(175, 280, 300, 25);
      this.as.setFont(Class681.ad);
      this.as.setForeground(new Color(162, 181, 205));
      this.as.setText("低级根骨  低级根骨  低级根骨");
      this.add(this.as);
      this.at = new JLabel();
      this.at.setBounds(15, 160, 90, 25);
      this.at.setForeground(new Color(238, 232, 205));
      this.at.setFont(Class681.ad);
      this.at.setHorizontalAlignment(3 ^ 3);
      this.at.setVerticalAlignment(3 >> 2);
      this.at.setText("技能");
      this.add(this.at);
      var2 = 3 ^ 3;

      for(var10000 = var2; var10000 < 5; var10000 = var2) {
         this.lh[var2] = new Class436();
         this.lh[var2].setBounds(15, 185 + var2 * 20, 20, 20);
         this.add(this.lh[var2]);
         this.hj[var2] = new JLabel();
         this.hj[var2].setBounds(40, 176 + var2 * 21, 60, 30);
         this.hj[var2].setFont(Class681.ad);
         this.hj[var2].setForeground(new Color(162, 181, 205));
         this.hj[var2].setText("疾风骤雨");
         this.add(this.hj[var2++]);
      }

   }

   public void gf(int var1, String var2, Image var3) {
      this.lm.addText(var2, 8189 & 24863);
      this.ce[var1].hf(var3);
   }

   public void fn(Lingbao var1) {
      StringBuffer var2;
      (var2 = new StringBuffer()).append("天赋技能:");
      var2.append(var1.getBaoname());
      int var10002 = 3 ^ 3;
      this.lg.setText(var2.toString());
      this.li.setText("擅长技能:无");
      this.as.setText("");
      this.lm.removemsg();
      this.ln.removemsg();
      int var14 = var10002;

      for(int var10000 = var14; var10000 < 5; var10000 = var14) {
         int var10001 = var14;
         this.gd(var14, "无法开启");
         ++var14;
         this.gf(var10001, "#cD2B48C无法开启", Class511.a("sc/d/44.png"));
      }

      this.ln.addText("#Y" + var1.getKangxing().split("=")[5 >> 3] + " " + var1.getKangxing().split("=")[3 & 5], 2398 & 30719);
      this.ln.addText("#Y道行:#R" + ExpUtil.e(var1.getLingbaoexe().longValue() + ExpUtil.b(var1.getLingbaolvl().intValue() - --1)) + "/" + ExpUtil.e(ExpUtil.b(var1.getLingbaolvl().intValue())), 1534 & 31583, Class681.ce);
      Skill var15 = this.vc().bg(var1.getBaoname());
      if (var15 != null) {
         int var6 = Integer.parseInt(var15.getSkillid());
         int var4 = this.aej.roleUnit.r.getTurnAround();
         int var5 = Class224.d(this.aej.roleUnit.r.getGrade());
         int var3 = this.vd().getFaPJ();
         int var12 = BaseValue.getQv(var1.getBaoquality());
         int var7 = var1.getLingbaolvl().intValue();
         var12 = BaseValue.getFBlvl(var4, var5, var3, var12, var7);
         double var8 = 0.0D;
         double var10 = 0.0D;
         if (var15.getGrow() != null && !var15.getGrow().equals("")) {
            var8 = Double.parseDouble(var15.getGrow());
         }

         if (var15.getValue() != null && !var15.getGrow().equals("")) {
            var10 = Double.parseDouble(var15.getValue());
         }

         String var17 = Class394.ak(var10 + (double)var12 * var8, 3 & 5);
         String var18 = String.valueOf(FBUtil.getFBcx(var6, var7));
         String var16 = null;
         String var19 = String.valueOf(FBUtil.getFBsum(var6, var7));
         Skill var20;
         if (var6 == (12286 & 24495)) {
            var16 = String.valueOf((int)((var10 + (double)var12 * var8) * 12500.0D));
            var20 = var15;
         } else {
            if (var6 == (28591 & 8191)) {
               var16 = Class394.ak((var10 + (double)var12 * var8) * 2.0D / 3.0D, 2 ^ 3);
            }

            var20 = var15;
         }

         String var13 = var20.getRemark().replace("{概率}", var17).replace("{回合}", var18);
         if (var16 != null) {
            var13 = var13.replace("{数值}", var16);
         }

         var13 = var13.replace("{目标}", var19);
         this.ln.addText(var13, 19806 & 13311);
      }

   }
}
