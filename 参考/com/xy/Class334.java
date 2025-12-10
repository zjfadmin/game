package com.xy;

import com.xy.bean.LoginResult;
import com.xy.formula.BaseSkillData;
import com.xy.formula.SkillUtil;
import com.xy.game.RoleData;
import com.xy.readbean.Skill;
import com.xy.text.GameView;
import java.awt.Color;
import javax.swing.JLabel;

public class Class334 extends Class345 {
   private <undefinedtype>[] ayn;
   private JLabel[] ly;
   private Class322 sa;

   public Class334(GameView var1) {
      int var10001 = 1 ^ 3;
      int var10006 = 3 >> 2;
      super(-4 >> 2, -4 >> 2, Class345.aei, var1);
      this.va(var10006, 3 & 4, 12127 & 21242, 29673 & 3519, Class345.aei);
      this.sa = new Class322("sc/e/28.png", 2 ^ 3, 126 & 117, Class681.bm, Class681.an, "一键学习", this);
      this.sa.setBounds(25589 & 7678, 6527 & 26612, 116 & 79, 59 & 85);
      this.add(this.sa);
      JLabel[] var3 = new JLabel[var10001];
      boolean var10003 = true;
      this.ly = var3;

      int var10000;
      int var2;
      for(var10000 = var2 = 3 >> 2; var10000 < this.ly.length; var10000 = var2) {
         this.ly[var2] = Class133.c((54 & 121) + (124 & 83) * var2, 5499 & 27638, 16297 & 16990, 50 & 95, 30 & 107, Class681.c(var2 == 0 ? "#c000000" : "#cFF0000"), Class681.bu);
         this.ly[var2].setText(var2 == 0 ? "温馨提示：" : (var2 == (3 & 5) ? "点击法术小图标可拖动到技能快捷栏" : "学习交流"));
         this.add(this.ly[var2++]);
      }

      <undefinedtype>[] var4 = new <undefinedtype>[--3];
      var10003 = true;
      this.ayn = var4;

      for(var10000 = var2 = 3 & 4; var10000 < this.ayn.length; var10000 = var2) {
         this.ayn[var2] = new Class436() {
            private JLabel[] ly;
            private <undefinedtype>[] qj;

            public {
               int var10001 = --3;
               JLabel[] var4 = new JLabel[var10001];
               boolean var10003 = true;
               this.ly = var4;

               int var10000;
               int var2;
               for(var10000 = var2 = 3 & 4; var10000 < this.ly.length; var10000 = var2) {
                  this.ly[var2] = Class133.c(2 & 5, 2 & 5, 2 & 5, 2 & 5, 2 & 5, Class681.c("#cFBD833"), var2 == 0 ? Class681.as : Class681.bm);
                  <undefinedtype> var3;
                  if (var2 == 0) {
                     var3 = this;
                     this.ly[var2].setBounds(3 ^ 3, 5 >> 1, 19194 & 13743, 127 & 34);
                  } else if (var2 == --1) {
                     var3 = this;
                     this.ly[var2].setText("门派");
                     this.ly[var2].setBounds(127 & 48, 39 & 127, 36 & 127, 126 & 15);
                  } else {
                     if (var2 == 5 >> 1) {
                        this.ly[var2].setForeground(Class681.c("#c00FF00"));
                        this.ly[var2].setHorizontalAlignment(14 & 123);
                        this.ly[var2].setBounds(127 & 86, 47 & 119, 93 & 106, 15 & 126);
                     }

                     var3 = this;
                  }

                  var3.add(this.ly[var2++]);
               }

               <undefinedtype>[] var5 = new <undefinedtype>[--5];
               var10003 = true;
               this.qj = var5;

               for(var10000 = var2 = 5 >> 3; var10000 < this.qj.length; var10000 = var2) {
                  this.qj[var2] = new Class436() {
                     private JLabel[] hj;
                     // $FF: synthetic field
                     final Class334 qi;
                     private Class44 ae;
                     private Class436[] g;

                     public {
                        int var10001 = 1 ^ 3;
                        this.qi = var1;
                        super();
                        JLabel[] var4 = new JLabel[var10001];
                        boolean var10003 = true;
                        this.hj = var4;

                        int var10000;
                        int var2;
                        <undefinedtype> var3;
                        for(var10000 = var2 = 2 & 5; var10000 < this.hj.length; var10000 = var2) {
                           this.hj[var2] = Class133.c(3 >> 2, 3 >> 2, 3 >> 2, 3 >> 2, var2 == 0 ? 15 & 122 : 0, Class681.c("#cFFFFFF"), var2 == 0 ? Class681.bu : Class681.bm);
                           if (var2 == 0) {
                              var3 = this;
                              this.hj[var2].setBounds(59 & 118, --5, 126 & 111, 115 & 30);
                           } else {
                              if (var2 == (3 & 5)) {
                                 this.hj[var2].setBounds(51 & 126, 23 & 127, 127 & 106, 44 & 95);
                              }

                              var3 = this;
                           }

                           var3.add(this.hj[var2++]);
                        }

                        Class436[] var5 = new Class436[5 >> 1];
                        var10003 = true;
                        this.g = var5;

                        for(var10000 = var2 = 5 >> 3; var10000 < this.g.length; var10000 = var2) {
                           this.g[var2] = new Class436();
                           this.g[var2].eq(Class511.q(var2 == 0 ? "sc/d/65.png" : "sc/d/17.png", 3, 3, 3, 3, (boolean)(3 & 4)));
                           if (var2 == 0) {
                              var3 = this;
                              this.g[var2].setBounds(50 & 127, 95 & 57, 123 & 110, 43 & 94);
                           } else {
                              if (var2 == (2 ^ 3)) {
                                 this.g[var2].setBounds(127 & 48, 119 & 31, 110 & 127, 111 & 30);
                              }

                              var3 = this;
                           }

                           var3.add(this.g[var2++]);
                        }

                        this.ae = new Class44(var1.gk());
                        this.ae.setBounds(10, 7, 30, 30);
                        this.add(this.ae);
                     }

                     public void zn(Skill var1, int var2, int var3) {
                        if (var1 == null) {
                           this.hj[3 ^ 3].setText((String)null);
                           this.hj[2 ^ 3].setText((String)null);
                           this.g[5 >> 3].setBounds(58 & 119, 25 & 127, 2 & 5, 126 & 11);
                           this.ae.c(5 >> 3, (Object)null);
                        } else {
                           this.hj[2 & 5].setText(var1.getSkillname());
                           this.hj[4 ^ 5].setText(var2 + "/" + var3);
                           this.hj[4 ^ 5].setForeground(var3 > (30651 & 27116) ? Color.red : Color.white);
                           double var4;
                           if ((var4 = (double)var2 / (double)var3) <= 0.0D) {
                              this.g[3 ^ 3].setBounds(114 & 63, 63 & 89, 3 ^ 3, 58 & 79);
                           } else if (var4 >= 1.0D) {
                              this.g[3 >> 2].setBounds(50 & 127, 31 & 121, 111 & 122, 59 & 78);
                           } else {
                              this.g[3 & 4].setBounds(54 & 123, 29 & 123, (int)(var4 * 106.0D), 75 & 62);
                           }

                           BaseSkillData var6 = new BaseSkillData(var1);
                           var6.setSld(var2);
                           var6.setSldMax(var3);
                           this.ae.c(29 & 110, var6);
                        }
                     }
                  };
                  this.qj[var2].eq(Class511.q("sc/d/49.png", 39 & 94, 39 & 94, 39 & 94, 39 & 94, (boolean)(2 & 5)));
                  this.qj[var2].setBounds(--2, (125 & 58) + var2 * (59 & 117), 13557 & 19375, 63 & 109);
                  this.add(this.qj[var2++]);
               }

            }
         };
         this.ayn[var2].eq(Class511.q("sc/d/17.png", --3, --3, --3, --3, (boolean)(5 >> 3)));
         this.ayn[var2].setBounds((116 & 59) + var2 * (7857 & 25086), 63 & 127, 170, 300);
         this.add(this.ayn[var2++]);
      }

   }

   public void d() {
      Class603 var13 = this.vc();
      RoleData var2;
      if ((var2 = this.vd()) != null) {
         LoginResult var12;
         int var4 = Class224.g((var12 = var2.getLoginResult()).getGrade());
         String[] var5;
         if ((var5 = var2.getPrivateData().getSkill("S")) == null || var5.length == 0) {
            var5 = null;
         }

         int var6 = 0;
         boolean var7 = this.uw().gameBattle && (var2.getRoleProperty().sld1 > 0 || var2.getRoleProperty().sld2 > 0);

         int var8;
         for(int var10000 = var8 = 2 & 5; var10000 < this.ayn.length; var10000 = var8) {
            <undefinedtype> var9;
            <undefinedtype> var19 = var9 = this.ayn[var8];
            int var10 = SkillUtil.getSepciesIndex(var12.getSpecies_id(), var8);
            var9.ly[5 >> 3].setText(SkillUtil.getSkillMsg(var10));
            var19.ly[--2].setText(SkillUtil.getSkillBySM(var10));
            int var11 = var4 == 0 ? 26489 & 16278 : (var4 == --1 ? 15292 & 32475 : (var4 == (1 ^ 3) ? 20392 & 32375 : 25000));
            int var3 = 3 & 4;
            int var1;
            if (var7) {
               if ((var1 = var10 + (5 >> 2)) == var2.getRoleProperty().sm1) {
                  var3 = (int)((double)var3 + (double)var2.getRoleProperty().sld1 * 67.5D);
                  var10000 = var11;
               } else {
                  if (var1 == var2.getRoleProperty().sm2) {
                     var3 = (int)((double)var3 + (double)var2.getRoleProperty().sld2 * 67.5D);
                  }

                  var10000 = var11;
               }

               var11 = var10000 + var3;
            }

            for(var10000 = var1 = 0; var10000 < var9.qj.length; var10000 = var1) {
               int var15;
               Skill var16;
               label74: {
                  int var14 = 1001 + var10 * --5 + var1;
                  var15 = 3 & 4;
                  if ((var16 = var13.bf(String.valueOf(var14))) != null && var5 != null) {
                     String var18 = var14 + "_";

                     int var17;
                     for(var10000 = var17 = 5 >> 3; var10000 < var5.length; var10000 = var17) {
                        if (var5[var17].startsWith(var18)) {
                           var10000 = var15 = Integer.parseInt(var5[var17].substring(var18.length())) + var3;
                           break label74;
                        }

                        ++var17;
                     }
                  }

                  var10000 = var15;
               }

               if (var10000 == 0) {
                  var6 = 2 ^ 3;
                  var9.qj[var1].zn((Skill)null, 2 & 5, 2 & 5);
               } else {
                  var9.qj[var1].zn(var16, var15, var11);
               }

               ++var1;
            }

            ++var8;
         }

         this.sa.setVisible((boolean)var6);
      }
   }
}
