package com.xy.a;

import com.xy.bean.FriendBean;
import com.xy.bean.RoleShow;
import com.xy.formula.SkillUtil;
import com.xy.text.GameView;
import javax.swing.JLabel;

public class Class26 extends com.xy.q.Class30 {
   private com.xy.w.Class18[] ar;
   private RoleShow qg;
   private com.xy.i.Class18[] qh;
   private JLabel[] au;

   public Class26(GameView var1) {
      super(154, 2, com.xy.q.Class30.afz, var1);
      this.yy(0, 80, 160, 177, com.xy.q.Class30.agf);
      this.qh = new com.xy.i.Class18[10];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.qh.length; var10000 = var2) {
         com.xy.i.Class18[] var5 = this.qh;
         String var10004 = "6$j\"jqk7+ ";
         int var10006 = 261 + var2;
         String var22;
         Class26 var10010;
         if (var2 == 0) {
            var22 = "囑阼";
            var22 = "团队";
            var10010 = this;
         } else if (var2 == 1) {
            var22 = "仡豏";
            var22 = "交谈";
            var10010 = this;
         } else if (var2 == 2) {
            var22 = "绪享";
            var22 = "给予";
            var10010 = this;
         } else if (var2 == 3) {
            var22 = "枠睌";
            var22 = "查看";
            var10010 = this;
         } else if (var2 == 4) {
            var22 = "裶才";
            var22 = "装扮";
            var10010 = this;
         } else if (var2 == 5) {
            var22 = "纁陘";
            var22 = "组队";
            var10010 = this;
         } else if (var2 == 6) {
            var22 = "奎叨";
            var22 = "好友";
            var10010 = this;
         } else if (var2 == 7) {
            var22 = "仡晔";
            var22 = "交易";
            var10010 = this;
         } else if (var2 == 8) {
            var22 = "不抆";
            var22 = "举报";
            var10010 = this;
         } else if (var2 == 9) {
            var22 = "镄寝";
            var22 = "锁定";
            var10010 = this;
         } else {
            var22 = "";
            var10010 = this;
         }

         com.xy.i.Class18 var10002 = new com.xy.i.Class18("sc/e/6.png", 1, var10006, com.xy.q.Class49.bz, null, var22, var10010);
         var5[var2] = var10002;
         this.qh[var2].setOffsetTexts(com.xy.q.Class49.ag);
         this.qh[var2].setBounds(64 + var2 / 5 * 50, 67 + var2 % 5 * 21, 34, 18);
         this.add(this.qh[var2++]);
      }

      this.au = new JLabel[4];

      for (int var6 = var2 = 0; var6 < this.au.length; var6 = ++var2) {
         String var10007 = "\u0010@ueueue";
         this.au[var2] = com.xy.q.Class1.k(61, 5, 96, 14, com.xy.q.Class49.c("#cFFFFFF"), com.xy.q.Class49.n);
         JLabel var7 = this.au[var2];
         String var11;
         if (var2 == 0) {
            var11 = "嬣丧仡洆";
            var11 = "学习交流";
         } else if (var2 == 1) {
            var11 = "\n轏\u000b\u001b\u0005纄";
            var11 = "9转886级";
         } else if (var2 == 2) {
            var11 = "冤份";
            var11 = "凡人";
         } else if (var2 == 3) {
            var11 = "绰乃万摚";
            var11 = "练习临摹";
         } else {
            var11 = "";
         }

         var7.setText(var11);
         this.au[var2].setHorizontalAlignment(10);
         this.add(this.au[var2]);
         if (var2 == 0) {
            JLabel var8 = this.au[var2];
            var11 = "f$vw\u0000\u0002\u0003\u0001";
            var8.setForeground(com.xy.q.Class49.c("#c30EEFF"));
         } else if (var2 == 1) {
            this.au[var2].setBounds(61, 20, 65, 14);
         } else if (var2 == 2) {
            this.au[var2].setBounds(125, 20, 37, 14);
         } else if (var2 == 3) {
            this.au[var2].setBounds(61, 36, 96, 14);
            JLabel var9 = this.au[var2];
            var11 = "\u0010@\n\u001a\n\u001a\n\u001a";
            var9.setForeground(com.xy.q.Class49.c("#c999999"));
         }
      }

      this.ar = new com.xy.w.Class18[5];

      for (int var10 = var2 = 0; var10 < this.ar.length; var10 = ++var2) {
         this.ar[var2] = new com.xy.w.Class18();
         this.add(this.ar[var2]);
         if (var2 == 0) {
            this.ar[var2].setBounds(11, 11, 40, 40);
         } else if (var2 == 1) {
            com.xy.w.Class18 var17 = this.ar[var2];
            String var20 = "4&h!hw\u007fk7+ ";
            var17.dp("sc/d/28.png");
            this.ar[var2].setBounds(5, 5, 52, 52);
         } else if (var2 >= 2 && var2 <= 4) {
            com.xy.w.Class18 var18 = this.ar[var2];
            String var21 = "PP\fW\f\u0007\u001a\u001dS]D";
            var18.mt(com.xy.w.Class16.m("sc/d/49.png", 6, 6, 6, 6, false));
            if (var2 == 2) {
               this.ar[var2].setBounds(0, 0, 160, 62);
            } else if (var2 == 3) {
               this.ar[var2].setBounds(58, 62, 46, 115);
            } else if (var2 == 4) {
               this.ar[var2].setBounds(108, 62, 46, 115);
            }
         }
      }
   }

   public void kt(RoleShow var1) {
      this.qg = var1;
      this.au[0].setText(var1.getRolename());
      JLabel var10004 = this.au[1];
      StringBuilder var10005 = new StringBuilder(String.valueOf(com.xy.v.Class4.h(var1.getGrade())));
      String var10006 = "绠";
      var10004.setText(var10005.append("级").toString());
      this.au[2].setText(SkillUtil.getSepciesN(var1.getSpecies_id()));
      this.au[3].setText(var1.getTitle());
      com.xy.w.Class18 var10001 = this.ar[0];
      String var2 = "P";
      var10001.dp(com.xy.w.Class15.l("s" + var1.getSpecies_id()));
      this.zc().b(this.lj());
   }

   public void g(int var1) {
      if (var1 != 261) {
         if (var1 == 262) {
            FriendBean var4;
            if ((var4 = this.yx().getFriend(this.qg.getRole_id().longValue())) == null) {
               FriendBean var7 = var4 = new FriendBean();
               var4.setFid(this.qg.getRole_id().longValue());
               var4.setRoleName(this.qg.getRolename());
               var4.setSpeciesId(this.qg.getSpecies_id().intValue());
               var7.setLvl(this.qg.getGrade());
               var4 = this.yx().am(var4);
            }

            ((Class52)this.afx.getFormManagement().j(56)).st(var4);
            return;
         }

         if (var1 == 263) {
            com.xy.d.Class8 var3;
            if ((var3 = this.afx.mapScene.ag(this.qg.getRole_id())) == null) {
               String var6 = "珮寳秼伥奭辙仁";
               this.afx.dp("玩家离你太远了");
               return;
            }

            com.xy.d.Class8.bn(var3, this.afx);
            return;
         }

         if (var1 != 264 && var1 != 265) {
            if (var1 == 266) {
               com.xy.d.Class8.az(this.qg.getRole_id(), this.ze());
               return;
            }

            if (var1 == 267) {
               com.xy.d.Class8.bq(this.qg.getRole_id(), this.qg.getRolename(), this.ze());
               return;
            }

            if (var1 == 268) {
               com.xy.d.Class8 var2;
               if ((var2 = this.afx.mapScene.ag(this.qg.getRole_id())) == null) {
                  String var10001 = "玊宅禘体変迯亥";
                  this.afx.dp("玩家离你太远了");
                  return;
               }

               com.xy.d.Class8.bt(var2, this.afx);
               return;
            }

            if (var1 != 269) {
            }
         }
      }
   }
}
