package com.xy;

import com.xy.bean.FriendBean;
import com.xy.bean.RoleShow;
import com.xy.formula.SkillUtil;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

public class Class119 extends Class345 {
   private JLabel[] hj;
   private RoleShow ada;
   private Class436[] an;
   private Class322[] adb;

   public void y(int var1) {
      if (var1 != (4031 & 28997)) {
         if (var1 == (2326 & 30703)) {
            FriendBean var3;
            if ((var3 = this.vd().getFriend(this.ada.getRole_id().longValue())) == null) {
               FriendBean var10001 = var3 = new FriendBean();
               var3.setFid(this.ada.getRole_id().longValue());
               var3.setRoleName(this.ada.getRolename());
               var3.setSpeciesId(this.ada.getSpecies_id().intValue());
               var10001.setLvl(this.ada.getGrade());
               var3 = this.vd().bh(var3);
            }

            ((Class494)this.aej.getFormManagement().e(125 & 58)).afc(var3);
            return;
         }

         Class183 var2;
         if (var1 == (20967 & 12063)) {
            if ((var2 = this.aej.mapScene.o(this.ada.getRole_id())) == null) {
               this.aej.fw("玩家离你太远了");
               return;
            }

            Class183.al(var2, this.aej);
            return;
         }

         if (var1 != (31116 & 1915) && var1 != (15245 & 17787)) {
            if (var1 == (29983 & 3050)) {
               Class183.y(this.ada.getRole_id(), this.ux());
               return;
            }

            if (var1 == (24895 & 8139)) {
               Class183.ao(this.ada.getRole_id(), this.ada.getRolename(), this.ux());
               return;
            }

            if (var1 == (29631 & 3404)) {
               if ((var2 = this.aej.mapScene.o(this.ada.getRole_id())) == null) {
                  this.aej.fw("玩家离你太远了");
                  return;
               }

               Class183.ak(var2, this.aej);
               return;
            }

            if (var1 != (23951 & 9085)) {
            }
         }
      }

   }

   public Class119(GameView var1) {
      int var10001 = 75 & 62;
      int var10003 = 3 ^ 3;
      super(24570 & 8351, --2, Class345.aef, var1);
      this.va(var10003, 88 & 119, 23215 & 9712, 8115 & 24829, Class345.aei);
      Class322[] var4 = new Class322[var10001];
      boolean var8 = true;
      this.adb = var4;

      int var2;
      int var10000;
      for(var10000 = var2 = 5 >> 3; var10000 < this.adb.length; var10000 = var2) {
         Class322[] var3 = this.adb;
         Class322 var10002 = new Class322;
         int var10005 = 5 >> 2;
         int var10006 = (19287 & 13741) + var2;
         Font var10007 = Class681.bm;
         String var10009;
         Class119 var10010;
         if (var2 == 0) {
            var10009 = "团队";
            var10010 = this;
         } else if (var2 == (3 & 5)) {
            var10009 = "交谈";
            var10010 = this;
         } else if (var2 == --2) {
            var10009 = "给予";
            var10010 = this;
         } else if (var2 == --3) {
            var10009 = "查看";
            var10010 = this;
         } else if (var2 == --4) {
            var10009 = "装扮";
            var10010 = this;
         } else if (var2 == --5) {
            var10009 = "组队";
            var10010 = this;
         } else if (var2 == (14 & 119)) {
            var10009 = "好友";
            var10010 = this;
         } else if (var2 == (119 & 15)) {
            var10009 = "交易";
            var10010 = this;
         } else if (var2 == (110 & 25)) {
            var10009 = "举报";
            var10010 = this;
         } else if (var2 == (77 & 59)) {
            var10009 = "锁定";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var10002.<init>("sc/e/6.png", var10005, var10006, var10007, (Color[])null, var10009, var10010);
         var3[var2] = var10002;
         this.adb[var2].setOffsetTexts(Class681.am);
         this.adb[var2].setBounds((90 & 101) + var2 / --5 * (50 & 127), (119 & 75) + var2 % --5 * (21 & 127), 54 & 107, 59 & 86);
         this.add(this.adb[var2++]);
      }

      JLabel[] var5 = new JLabel[--4];
      var8 = true;
      this.hj = var5;

      for(var10000 = var2 = 2 & 5; var10000 < this.hj.length; var10000 = var2) {
         this.hj[var2] = Class133.b(61, --5, 96, 14, Class681.c("#cFFFFFF"), Class681.ab);
         this.hj[var2].setText(var2 == 0 ? "学习交流" : (var2 == --1 ? "9转886级" : (var2 == 5 >> 1 ? "凡人" : (var2 == --3 ? "练习临摹" : ""))));
         this.hj[var2].setHorizontalAlignment(10);
         this.add(this.hj[var2]);
         if (var2 == 0) {
            this.hj[var2].setForeground(Class681.c("#c30EEFF"));
         } else if (var2 == 5 >> 2) {
            this.hj[var2].setBounds(61, 20, 65, 14);
         } else if (var2 == 5 >> 1) {
            this.hj[var2].setBounds(125, 20, 37, 14);
         } else if (var2 == --3) {
            this.hj[var2].setBounds(61, 36, 96, 14);
            this.hj[var2].setForeground(Class681.c("#c999999"));
         }

         ++var2;
      }

      Class436[] var6 = new Class436[--5];
      var8 = true;
      this.an = var6;

      for(var10000 = var2 = 3 ^ 3; var10000 < this.an.length; var10000 = var2) {
         this.an[var2] = new Class436();
         this.add(this.an[var2]);
         if (var2 == 0) {
            this.an[var2].setBounds(11, 11, 40, 40);
         } else if (var2 == --1) {
            this.an[var2].fw("sc/d/28.png");
            this.an[var2].setBounds(--5, --5, 52, 52);
         } else if (var2 >= --2 && var2 <= 4) {
            this.an[var2].eq(Class511.q("sc/d/49.png", 6, 6, 6, 6, (boolean)(2 & 5)));
            if (var2 == 2) {
               this.an[var2].setBounds(3 & 4, 3 & 4, 160, 62);
            } else if (var2 == 3) {
               this.an[var2].setBounds(58, 62, 46, 115);
            } else if (var2 == 4) {
               this.an[var2].setBounds(108, 62, 46, 115);
            }
         }

         ++var2;
      }

   }

   public void le(RoleShow var1) {
      this.ada = var1;
      this.hj[3 ^ 3].setText(var1.getRolename());
      this.hj[3 >> 1].setText(Class224.r(var1.getGrade()) + "级");
      this.hj[--2].setText(SkillUtil.getSepciesN(var1.getSpecies_id()));
      this.hj[--3].setText(var1.getTitle());
      this.an[3 & 4].fw(Class222.l("s" + var1.getSpecies_id()));
      this.ve().a(this.ae());
   }
}
