package com.xy.a.a;

import com.xy.readbean.Skill;
import com.xy.richtext.RichLabel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JLabel;

class Class63 extends JComponent {
   private com.xy.i.Class4 atk;
   private RichLabel aqq;
   private com.xy.w.Class9 azc;
   private RichLabel re;
   private int z;
   private Skill ij;
   private JLabel bd;
   private RichLabel in;
   private int cb;
   private int ae;
   private int ds;
   // $VF: synthetic field
   final Class9 azd;
   private int ah;

   public int pq(int var1, int var2) {
      this.ds = var1;
      this.z = 5 + var2;
      this.ae = 30;
      if (var1 == -1) {
         String var10003 = "辺沗形吙Aq奋赽边阀";
         this.re.setText("还没开启#G天赋进阶");
         Dimension var3 = this.re.computeSize(180);
         this.re.setBounds(10, this.z + 3, (int)var3.getWidth(), (int)var3.getHeight());
         StringBuffer var4;
         StringBuffer var10000 = var4 = new StringBuffer();
         String var10001 = "{v乘阒奱赯攐枸b\f层朎澘洟q";
         var10000.append("#R一阶天赋效果:(尚未激活)");
         var4.append(Class9.fy(3036, 1));
         this.aqq.setText(var4.toString());
         var3 = Class9.fs(this.azd).aqq.computeSize(210);
         this.aqq.setBounds(10, this.z + 28 + 5 + 18, (int)var3.getWidth(), (int)var3.getHeight());
         this.ae = this.ae + (int)var3.getHeight() + 6 + 20;
      } else {
         String var10006 = "嶐绹形吙Aq奋赽边阀";
         this.re.setText("已经开启#G天赋进阶");
         Dimension var6 = this.re.computeSize(180);
         this.re.setBounds(10, this.z + 3, (int)var6.getWidth(), (int)var6.getHeight());
         this.bd.setBounds(8, this.z + 28 + 5, 68, 14);
         JLabel var9 = this.bd;
         String var10004 = "笑纃b";
         StringBuilder var10002 = new StringBuilder("等级:").append(var1);
         String var13 = "M\u0003";
         var9.setText(var10002.append("/5").toString());
         this.bd.setVisible(true);
         StringBuffer var8 = new StringBuffer();
         String var12 = "{c弋剩奱赯攐枸b";
         var8.append("#G当前天赋效果:");
         var8.append(Class9.fy(3036, var1));
         if (var1 < 5) {
            if (var8.length() != 0) {
               String var10 = "AD";
               var8.append("#r");
            }

            String var11 = "\u0007\n丯乘阒奱赯攐枸b\f层朎澘洟q";
            var8.append("#R下一阶天赋效果:(尚未激活)");
            var8.append(Class9.fy(3036, var1 + 1));
         }

         this.aqq.setText(var8.toString());
         var6 = Class9.fs(this.azd).aqq.computeSize(210);
         this.aqq.setBounds(10, this.z + 28 + 5 + 18, (int)var6.getWidth(), (int)var6.getHeight());
         this.ae = this.ae + (int)var6.getHeight() + 6 + 20;
      }

      return 10 + this.ae;
   }

   // $VF: synthetic method
   static RichLabel apk(Class63 var0) {
      return var0.in;
   }

   public Class63(Class9 var1) {
      this.azd = var1;
      this.cb = 5;
      this.ah = 215;
      this.in = new RichLabel("", com.xy.q.Class49.n);
      this.add(this.in);
      this.re = new RichLabel();
      this.add(this.re);
      this.aqq = new RichLabel();
      this.add(this.aqq);
      String var10008 = "W;\u000b=\u000bm\n(J?";
      this.atk = new com.xy.i.Class4("sc/e/5.png", 1, 45, com.xy.q.Class49.bz, com.xy.q.Class49.r, null, var1.eg());
      this.add(this.atk);
      String var10011 = "笫纑";
      this.bd = new JLabel("等级", 0);
      this.bd.setFont(com.xy.q.Class49.bz);
      this.bd.setForeground(Color.white);
      this.add(this.bd);
   }

   public void t() {
      this.in.setText(null);
      this.re.setText(null);
      this.aqq.setText(null);
      this.atk.setVisible(false);
      this.bd.setVisible(false);
   }

   // $VF: synthetic method
   static void apl(Class63 var0, Skill var1) {
      var0.ij = var1;
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.azc == null) {
         String var10001 = "+Gw@w\u0015o\n(J?";
         this.azc = com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false);
      }

      var1.translate(this.cb, this.z);
      this.azc.g(var1, this.ah, this.ae);
      var1.translate(-this.cb, -this.z);
   }

   // $VF: synthetic method
   static Skill apm(Class63 var0) {
      return var0.ij;
   }

   public int qj(int var1, int var2) {
      this.ds = var1;
      this.z = 5 + var2;
      this.ae = 30;
      if (var1 == -3) {
         String var10003 = "歒拢胋斂泣惽灃";
         this.re.setText("此技能无法悟灵");
         Dimension var3 = this.re.computeSize(180);
         this.re.setBounds(10, this.z + 3, (int)var3.getWidth(), (int)var3.getHeight());
      } else if (var1 == -2) {
         String var12 = "护肥悻瀭与攨\u0007\n巖迦丮阈";
         this.re.setText("技能悟灵个数#R已达上限");
         Dimension var6 = this.re.computeSize(180);
         this.re.setBounds(10, this.z + 3, (int)var6.getWidth(), (int)var6.getHeight());
      } else if (var1 == -1) {
         String var10006 = "拢胋厍仓形吙Aq惽灃狔怷";
         this.re.setText("技能可以开启#G悟灵状态");
         Dimension var7 = this.re.computeSize(180);
         this.re.setBounds(10, this.z + 3, (int)var7.getWidth(), (int)var7.getHeight());
         String var13 = "弤呷";
         this.atk.setText("开启");
         this.atk.setBounds(175, this.z + 3, 34, 17);
         this.atk.setVisible(true);
      } else {
         String var10010 = "歒拢胋奦亸Aq惽灃狔怷";
         this.re.setText("此技能处于#G悟灵状态");
         Dimension var8 = this.re.computeSize(180);
         this.re.setBounds(10, this.z + 3, (int)var8.getWidth(), (int)var8.getHeight());
         String var10007 = "兗閵";
         this.atk.setText("关闭");
         this.atk.setBounds(175, this.z + 3, 34, 17);
         this.atk.setVisible(true);
         this.bd.setBounds(8, this.z + 28 + 5, 68, 14);
         JLabel var10002 = this.bd;
         String var10005 = "筿绅\f";
         StringBuilder var14 = new StringBuilder("等级:").append(var1);
         String var10004 = "w\u0015h";
         var10002.setText(var14.append("/10").toString());
         this.bd.setVisible(true);
         int var4 = Integer.parseInt(this.ij.getSkillid());
         StringBuffer var5 = new StringBuffer();
         if (var1 > 0) {
            String var10001 = "\u0015%彥刯灃陔敾柾\f";
            var5.append("#G当前灵阶效果:");
            var5.append(Class9.fy(var4, var1));
         }

         if (var1 < 10) {
            if (var5.length() != 0) {
               String var10 = "\u0007*";
               var5.append("#r");
            }

            String var11 = "\u00150丽乢灃陔敾柾\fJ尬杈濶浙\u001f";
            var5.append("#R下一灵阶效果:(尚未激活)");
            var5.append(Class9.fy(var4, var1 + 1));
         }

         this.aqq.setText(var5.toString());
         var8 = Class9.fs(this.azd).aqq.computeSize(210);
         this.aqq.setBounds(10, this.z + 28 + 5 + 18, (int)var8.getWidth(), (int)var8.getHeight());
         this.ae = this.ae + (int)var8.getHeight() + 6 + 20;
      }

      return 10 + this.ae;
   }
}
