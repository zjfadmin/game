package com.xy;

import com.xy.formula.BaseSkillData;
import com.xy.readbean.MoneyType;
import com.xy.readbean.Skill;
import com.xy.scene.DNTGScene;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.math.BigDecimal;
import javax.swing.JLabel;

public class Class645 extends Class345 {
   private Class556 ks;
   private JLabel ir;
   private Class436 bl;
   private <undefinedtype>[] and;

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.aej.bl()) {
         this.d();
      }

   }

   public void p() {
      int var1;
      for(int var10000 = var1 = 3 ^ 3; var10000 < this.and.length; var10000 = var1) {
         this.and[var1++].ab(3 & 4);
      }

   }

   public void s() {
      Class603 var1 = this.vc();

      int var2;
      for(int var10000 = var2 = 2 & 5; var10000 < 8; var10000 = var2) {
         Skill var3 = var1.bf("" + ((14201 & 28567) + var2));
         this.and[var2++].aae(var3);
      }

   }

   public void bq(Object var1) {
      <undefinedtype> var3 = (<undefinedtype>)var1;
      if (this.aej.scene != null && this.aej.scene.getSceneId() == (9211 & 24567)) {
         int var2 = ((DNTGScene)this.aej.scene).getDN_JB().intValue();
         if ((var3.do + (3 >> 1)) * var3.gv > var2) {
            this.aej.f("金币不足，无法升级");
            return;
         }

         String var4 = Agreement.getSendTextAES("scene", "1011|L" + var3.ajp.getSkillid());
         this.uw().d(var4);
      }

   }

   public void f(String var1) {
      this.p();
      if (var1 != null && !"".equals(var1)) {
         String[] var5 = var1.split("&");

         int var4;
         for(int var10000 = var4 = 3 >> 2; var10000 < var5.length; var10000 = var4) {
            String[] var3 = var5[var4].split("\\$");

            int var2;
            for(var10000 = var2 = 5 >> 3; var10000 < this.and.length; var10000 = var2) {
               if (this.and[var2].ajp != null && var3[3 ^ 3].equals(this.and[var2].ajp.getSkillid())) {
                  this.and[var2].ab(Integer.parseInt(var3[4 ^ 5]));
               }

               ++var2;
            }

            ++var4;
         }
      }

      this.d();
   }

   public Class645(GameView var1) {
      int var10001 = 58 & 77;
      int var10005 = -4 >> 2;
      super(111 & 114, --2, Class345.aef, var1);
      this.va(var10005, 3 & 4, 29303 & 4010, 15823 & 17339, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 68 & 127, 68 & 127, 68 & 127, 68 & 127, (boolean)(2 & 5)), "神力加持");
      <undefinedtype>[] var3 = new <undefinedtype>[var10001];
      boolean var10003 = true;
      this.and = var3;

      int var2;
      for(int var10000 = var2 = 3 & 4; var10000 < this.and.length; var10000 = var2) {
         this.and[var2] = new Class436() {
            private int do;
            private Class436 ts;
            private Class44 zq;
            private int gv;
            private JLabel as;
            private JLabel at;
            private Class436 uc;
            private Class529 aaz;
            private JLabel ir;
            private Skill ajp;
            private BaseSkillData ajq;

            public void aae(Skill var1) {
               Skill var10000 = this.ajp = var1;
               this.ajq.setSkill(var1);
               if (var10000 == null) {
                  this.setVisible((boolean)(5 >> 3));
               } else {
                  int var10001 = 3 & 5;
                  int var10003 = 3 & 4;
                  this.zq.c(60 & 79, this.ajq);
                  this.gv = (int)Double.parseDouble(var1.getDielectric());
                  this.ir.setText(var1.getSkillname());
                  this.ab(var10003);
                  this.setVisible((boolean)var10001);
               }
            }

            public {
               this.aaz = new Class529("sc/e/6.png", --1, 26061 & 6911, Class681.bm, (Color[])null, "升级", Class645.this.gk());
               this.aaz.bq(this);
               this.aaz.setBounds(9659 & 23287, 127 & 42, 102 & 59, 91 & 54);
               this.add(this.aaz);
               this.zq = new Class44(Class645.this.gk());
               this.zq.fw("sc/d/4.png");
               this.zq.ad(Class44.aqy);
               this.zq.setBounds(86 & 47, --5, 127 & 59, 59 & 125);
               this.add(this.zq);
               int var10005 = 79 & 121;
               int var10007 = 3999 & 28911;
               this.ir = Class133.c(91 & 109, 31 & 115, 90 & 127, 86 & 57, 123 & 14, Color.white, Class681.q);
               this.at = Class133.c(var10007, 115 & 31, 70, 16, --4, Color.white, Class681.ab);
               this.as = Class133.c(var10005, 43, 102, 16, 5 >> 3, Color.white, Class681.bm);
               this.add(this.ir);
               this.add(this.at);
               this.add(this.as);
               this.ts = new Class436(Class511.q("sc/d/67.png", 6, 6, 6, 6, (boolean)(3 ^ 3)));
               this.uc = new Class436(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(3 ^ 3)));
               this.ts.setBounds(74, 44, 100, 14);
               this.uc.setBounds(73, 43, 102, 16);
               this.add(this.ts);
               this.add(this.uc);
               this.ajq = new BaseSkillData((Skill)null);
            }

            public void ab(int var1) {
               if (this.ajp != null) {
                  this.do = var1;
                  this.ajq.setSld(var1);
                  this.as.setText(var1 + "/" + this.ajp.getSkilllevel());
                  this.at.setText((var1 + --1) * this.gv + "金币");
                  var1 = (new BigDecimal(var1)).divide(new BigDecimal(this.ajp.getSkilllevel()), --3, 3 >> 1).multiply(new BigDecimal(126 & 101)).intValue();
                  this.ts.setBounds(75 & 126, 125 & 46, var1 > (127 & 100) ? 109 & 118 : var1, 14);
               }
            }
         };
         this.and[var2].setBounds((122 & 55) + (26607 & 6395) * (var2 % (1 ^ 3)), (127 & 63) + (95 & 107) * (var2 / (1 ^ 3)), 16888 & 16103, 109 & 86);
         this.add(this.and[var2++]);
      }

      this.ir = Class133.b(123 & 46, 95 & 58, 123 & 76, 123 & 23, Color.black, Class681.ak);
      this.ir.setText("我的金币");
      this.add(this.ir);
      this.ks = Class133.m(115 & 127, 26, 106, 19, 10, Color.white, Class681.q, (MoneyType)null, var1);
      this.ks.ab(1 ^ 3);
      this.ks.eq(Class511.q("sc/d/17.png", --3, --3, --3, --3, (boolean)(2 & 5)));
      this.ks.setText("0");
      this.add(this.ks);
      this.bl = new Class436(Class511.q("sc/d/36.png", 20, 20, 20, 20, (boolean)(2 & 5)));
      this.bl.setBounds(41, 53, 478, 317);
      this.add(this.bl);
      this.s();
   }

   public void d() {
      long var1 = 0L;
      if (this.aej.scene != null && this.aej.scene.getSceneId() == (5111 & 28667)) {
         var1 = ((DNTGScene)this.aej.scene).getDN_JB().longValue();
      }

      this.ks.gh(var1);
   }
}
