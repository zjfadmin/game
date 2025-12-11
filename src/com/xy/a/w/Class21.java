package com.xy.a.w;

import com.xy.bean.LoginResult;
import com.xy.bean.PrivateData;
import com.xy.formula.SkillUtil;
import com.xy.game.RoleData;
import com.xy.q.Class49;
import com.xy.readbean.Skill;
import com.xy.text.GameView;
import javax.swing.JLabel;

public class Class21 extends com.xy.q.Class30 {
   private JLabel[] gj;
   private Class31[] aas;
   private com.xy.i.Class18 me;

   public void h() {
      com.xy.v.Class8 var1 = this.yt();
      RoleData var2;
      if ((var2 = this.yx()) != null) {
         LoginResult var3;
         int var4 = com.xy.v.Class4.q((var3 = var2.getLoginResult()).getGrade());
         PrivateData var10000 = var2.getPrivateData();
         String var10001 = "i";
         String[] var5;
         if ((var5 = var10000.getSkill("S")) == null || var5.length == 0) {
            var5 = null;
         }

         boolean var6 = false;
         boolean var7 = this.za().gameBattle && (var2.getRoleProperty().sld1 > 0 || var2.getRoleProperty().sld2 > 0);

         int var8;
         for (int var20 = var8 = 0; var20 < this.aas.length; var20 = ++var8) {
            Class31 var9;
            Class31 var21 = var9 = this.aas[var8];
            int var10 = SkillUtil.getSepciesIndex(var3.getSpecies_id(), var8);
            Class31.anh(var9)[0].setText(SkillUtil.getSkillMsg(var10));
            Class31.anh(var21)[2].setText(SkillUtil.getSkillBySM(var10));
            int var11 = var4 == 0 ? 10000 : (var4 == 1 ? 15000 : (var4 == 2 ? 20000 : 25000));
            int var12 = 0;
            if (var7) {
               int var13;
               int var22;
               if ((var13 = var10 + 1) == var2.getRoleProperty().sm1) {
                  var12 = (int)(var12 + var2.getRoleProperty().sld1 * 67.5);
                  var22 = var11;
               } else {
                  if (var13 == var2.getRoleProperty().sm2) {
                     var12 = (int)(var12 + var2.getRoleProperty().sld2 * 67.5);
                  }

                  var22 = var11;
               }

               var11 = var22 + var12;
            }

            int var19;
            for (int var23 = var19 = 0; var23 < Class31.ang(var9).length; var23 = ++var19) {
               int var15;
               Skill var16;
               int var25;
               label76: {
                  int var14 = 1001 + var10 * 5 + var19;
                  var15 = 0;
                  if ((var16 = var1.ac(String.valueOf(var14))) != null && var5 != null) {
                     String var17 = var14 + "_";

                     int var18;
                     for (int var24 = var18 = 0; var24 < var5.length; var24 = ++var18) {
                        if (var5[var18].startsWith(var17)) {
                           var25 = var15 = Integer.parseInt(var5[var18].substring(var17.length())) + var12;
                           break label76;
                        }
                     }
                  }

                  var25 = var15;
               }

               if (var25 == 0) {
                  var6 = true;
                  Class31.ang(var9)[var19].os(null, 0, 0);
               } else {
                  Class31.ang(var9)[var19].os(var16, var15, var11);
               }
            }
         }

         this.me.setVisible(var6);
      }
   }

   public Class21(GameView var1) {
      super(-1, -1, com.xy.q.Class30.agf, var1);
      this.yy(0, 0, 602, 425, com.xy.q.Class30.agf);
      String var10008 = "I\n\u0015\f\u0015[\u0002GJ\u0007]";
      String var10013 = "丳锍孕乃";
      this.me = new com.xy.i.Class18("sc/e/28.png", 1, 116, Class49.bz, Class49.r, "一键学习", this);
      this.me.setBounds(500, 372, 68, 17);
      this.add(this.me);
      this.gj = new JLabel[2];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.gj.length; var10000 = var2) {
         int var10002 = 48 + 80 * var2;
         String var11;
         if (var2 == 0) {
            var11 = "JYY\nY\nY\n";
            var11 = "#c000000";
         } else {
            var11 = "\u0010@ue\u0003\u0013\u0003\u0013";
            var11 = "#cFF0000";
         }

         this.gj[var2] = com.xy.q.Class1.f(var10002, 370, 520, 18, 10, Class49.c(var11), Class49.k);
         JLabel var4 = this.gj[var2];
         String var6;
         if (var2 == 0) {
            var6 = "渓駁揪祓＠";
            var6 = "温馨提示：";
         } else if (var2 == 1) {
            var6 = "炊凘泦朌尼囝栴双拥劋刃抣胎忈捄栬";
            var6 = "点击法术小图标可拖动到技能快捷栏";
         } else {
            var6 = "嬏乚仍浻";
            var6 = "学习交流";
         }

         var4.setText(var6);
         this.add(this.gj[var2++]);
      }

      this.aas = new Class31[3];

      for (int var5 = var2 = 0; var5 < this.aas.length; var5 = var2) {
         this.aas[var2] = new Class31(this);
         Class31 var10003 = this.aas[var2];
         String var10004 = "PP\fW\f\u0002\u0014\u001dS]D";
         var10003.mt(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false));
         this.aas[var2].setBounds(48 + var2 * 176, 63, 170, 300);
         this.add(this.aas[var2++]);
      }
   }
}
