package com.xy.a.w;

import com.xy.bean.BeauBean;
import com.xy.bean.LoginResult;
import com.xy.game.RoleData;
import com.xy.q.Class49;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import java.awt.Color;
import javax.swing.JLabel;

public class Class30 extends com.xy.q.Class30 {
   private com.xy.q.Class14[] jk;
   private com.xy.w.Class18 co;
   private com.xy.i.Class20[] ph;
   private RichLabel bk;
   private com.xy.w.Class18 af;
   private JLabel[] o;
   private com.xy.i.Class20[] fk;

   public void cc(int var1, int var2) {
      try {
         Class30 var10000;
         if (var1 == 0) {
            var10000 = this;
            var1 = Integer.parseInt(this.jk[13].getText());
            this.jk[13].setText(String.valueOf(var1 + var2));
         } else if (var1 == 1) {
            var10000 = this;
            var1 = Integer.parseInt(this.jk[14].getText());
            this.jk[14].setText(String.valueOf(var1 + var2));
         } else if (var1 == 2) {
            var10000 = this;
            var1 = Integer.parseInt(this.jk[15].getText());
            this.jk[15].setText(String.valueOf(var1 + var2));
         } else if (var1 == 3) {
            var10000 = this;
            var1 = Integer.parseInt(this.jk[16].getText());
            this.jk[16].setText(String.valueOf(var1 + var2));
         } else {
            if (var1 == 4) {
               var1 = Integer.parseInt(this.jk[18].getText());
               this.jk[18].setText(String.valueOf(var1 + var2));
            }

            var10000 = this;
         }

         var1 = Integer.parseInt(var10000.jk[12].getText());
         this.jk[12].setText(String.valueOf(var1 - var2));
      } catch (Exception var4) {
      }
   }

   public void h() {
      RoleData var1;
      if ((var1 = this.yx()) != null) {
         LoginResult var2;
         LoginResult var10001 = var2 = var1.getLoginResult();
         int var3 = com.xy.v.Class4.q(var10001.getGrade());
         int var4 = com.xy.v.Class4.s(var10001.getGrade());
         this.af.dp(com.xy.w.Class15.l(var2.getSpecies_id().toString()));
         com.xy.q.Class14 var10005 = this.jk[6];
         StringBuilder var10006 = new StringBuilder(String.valueOf(com.xy.v.Class4.h(var2.getGrade())));
         String var10007 = "绻";
         var10005.setText(var10006.append("级").toString());
         JLabel var10004 = this.o[0];
         StringBuilder var22 = new StringBuilder(String.valueOf(var2.getRace_name()));
         String var25 = "\u0094";
         var10004.setText(var22.append("·").append(var2.getLocalname()).toString());
         this.jk[2].setText(var2.getGangname());
         this.jk[5].setText(var2.getTitle());
         this.jk[0].setText(var2.getRolename());
         BeauBean var5;
         Class30 var10000;
         if ((var5 = var1.getBeau()) == null) {
            var10000 = this;
            String var19 = "/\u000b";
            this.bk.setText("#W" + var2.getRole_id());
         } else if (var5.a()) {
            RichLabel var7 = this.bk;
            String var10003 = "\u0010uqfrv";
            StringBuilder var11 = new StringBuilder("#VBEAU").append(var5.toString());
            String var10002 = "/\u0010";
            var7.setText(var11.append("#L").toString());
            var10000 = this;
         } else {
            String var16 = "\u0010@ue\u0003\u0013ue";
            this.bk.setText("#cFF00FF" + var5.getBeau());
            var10000 = this;
         }

         var10000.jk[3].setText(var2.getPrestige().toString());
         this.jk[4].setText(var2.getPkrecord().toString());
         this.g(var3);
         this.jk[11].setText(var2.getExperience().toString());
         this.jk[12].setText(var2.getCanpoint().toString());
         this.jk[13].setText(String.valueOf(var1.getRoleProperty().getBone()));
         this.jk[14].setText(String.valueOf(var1.getRoleProperty().getSpir()));
         this.jk[15].setText(String.valueOf(var1.getRoleProperty().getPower()));
         this.jk[16].setText(String.valueOf(var1.getRoleProperty().getSpeed()));
         this.jk[18].setText(String.valueOf(var1.getRoleProperty().getCalm()));
         com.xy.d.Class11 var6 = this.afx.getBattleScene() != null ? this.afx.getBattleScene().getBattleUnit(0, this.afx.roleData.getRoleId()) : null;
         if (var6 != null) {
            com.xy.q.Class14 var8 = this.jk[7];
            StringBuilder var12 = new StringBuilder(String.valueOf(var6.cg().getHp_Current()));
            String var14 = "s";
            var8.setText(var12.append("/").append(var6.cg().getHp_Total()).toString());
            var10000 = this;
            com.xy.q.Class14 var17 = this.jk[8];
            StringBuilder var20 = new StringBuilder(String.valueOf(var6.cg().getMp_Current()));
            String var23 = "\f";
            var17.setText(var20.append("/").append(var6.cg().getMp_Total()).toString());
            this.jk[9].setText(String.valueOf(var6.cg().getBap()));
            this.jk[10].setText(String.valueOf(var6.cg().getBsp()));
         } else {
            com.xy.q.Class14 var10 = this.jk[7];
            StringBuilder var13 = new StringBuilder(String.valueOf(var2.getHp().intValue()));
            String var15 = "s";
            var10.setText(var13.append("/").append(var1.getRoleProperty().getHp()).toString());
            var10000 = this;
            com.xy.q.Class14 var18 = this.jk[8];
            StringBuilder var21 = new StringBuilder(String.valueOf(var2.getMp().intValue()));
            String var24 = "\f";
            var18.setText(var21.append("/").append(var1.getRoleProperty().getMp()).toString());
            this.jk[9].setText(String.valueOf(var1.getRoleProperty().getAp()));
            this.jk[10].setText(String.valueOf(var1.getRoleProperty().getSp()));
         }

         var10000.jk[17].setText(String.valueOf(var1.getRoleProperty().getCdz()));
      }
   }

   @Override
   public void l() {
      if (this.yx() != null) {
         this.h();
         super.l();
      }
   }

   public Class30(GameView var1) {
      super(0, 2, com.xy.q.Class30.afz, var1);
      String var10009 = "@@\u001cG\u001c\u0012\u001dS]D";
      this.yy(-3, 0, 362, 455, com.xy.q.Class30.agh);
      com.xy.w.Class9 var59 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10010 = "亶爵屒恻";
      this.yu(var59, "人物属性");
      this.af = new com.xy.w.Class18();
      this.co = new com.xy.w.Class18();
      this.af.setBounds(67, 41, 75, 100);
      String var10006 = "PP\fW\f\u0001\u0014\u001dS]D";
      this.co.dp("sc/d/27.png");
      this.co.setBounds(61, 35, 87, 112);
      this.add(this.af);
      this.add(this.co);
      this.o = new JLabel[17];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.o.length; var10000 = var2) {
         this.o[var2] = com.xy.q.Class1.f(40, 146, 130, 18, 0, Color.black, Class49.ch);
         JLabel var6 = this.o[var2];
         String var15;
         if (var2 == 0) {
            var15 = "嬺乬仸浍ë臦嬺";
            var15 = "学习交流·自学";
         } else if (var2 == 1) {
            var15 = "帝洝";
            var15 = "帮派";
         } else if (var2 == 2) {
            var15 = "壼杇";
            var15 = "声望";
         } else if (var2 == 3) {
            var15 = "戫绊";
            var15 = "战绩";
         } else if (var2 == 4) {
            var15 = "筅绻";
            var15 = "等级";
         } else if (var2 == 5) {
            var15 = "氧衣";
            var15 = "气血";
         } else if (var2 == 6) {
            var15 = "泙勇";
            var15 = "法力";
         } else if (var2 == 7) {
            var15 = "攈凘";
            var15 = "攻击";
         } else if (var2 == 8) {
            var15 = "逓建";
            var15 = "速度";
         } else if (var2 == 9) {
            var15 = "综骯";
            var15 = "经验";
         } else if (var2 == 10) {
            var15 = "口剚酁烥";
            var15 = "可分配点";
         } else if (var2 == 11) {
            var15 = "栊骋";
            var15 = "根骨";
         } else if (var2 == 12) {
            var15 = "灹恻";
            var15 = "灵性";
         } else if (var2 == 13) {
            var15 = "动釬";
            var15 = "力量";
         } else if (var2 == 14) {
            var15 = "敃挫";
            var15 = "敏捷";
         } else if (var2 == 15) {
            var15 = "禶容";
            var15 = "禅定";
         } else if (var2 == 16) {
            var15 = "宖勇";
            var15 = "定力";
         } else {
            var15 = "";
         }

         var6.setText(var15);
         Class30 var7;
         if (var2 >= 1 && var2 <= 3) {
            var7 = this;
            this.o[var2].setBounds(167, 80 + (var2 - 1) * 24, 40, 19);
         } else if (var2 >= 4 && var2 <= 9) {
            var7 = this;
            this.o[var2].setBounds(40, 187 + (var2 - 4) * 24, 40, 20);
         } else if (var2 == 10) {
            var7 = this;
            this.o[var2].setBounds(216, 187, 70, 20);
         } else if (var2 >= 11 && var2 <= 14) {
            var7 = this;
            this.o[var2].setBounds(220, 209 + (var2 - 11) * 24, 40, 20);
         } else if (var2 == 15) {
            var7 = this;
            this.o[var2].setBounds(40, 307, 40, 20);
         } else {
            if (var2 == 16) {
               this.o[var2].setBounds(220, 305, 40, 20);
            }

            var7 = this;
         }

         var7.add(this.o[var2++]);
      }

      this.ph = new com.xy.i.Class20[13];

      for (int var8 = var2 = 0; var8 < this.ph.length; var8 = var2) {
         com.xy.i.Class20[] var9 = this.ph;
         int var58 = 1 + var2;
         Class30 var74;
         if (var2 == 0) {
            var10009 = "吾孴";
            var10009 = "名字";
            var74 = this;
         } else if (var2 == 1) {
            var10009 = "\u0015,\u0018";
            var10009 = "I D";
            var74 = this;
         } else if (var2 == 2) {
            var10009 = "秃谰";
            var10009 = "称谓";
            var74 = this;
         } else if (var2 == 3) {
            var10009 = "剛屒恻";
            var10009 = "切属性";
            var74 = this;
         } else if (var2 == 4) {
            var10009 = "掛荳劓炚";
            var10009 = "推荐加点";
            var74 = this;
         } else if (var2 == 5) {
            var10009 = "硢诸劬烥";
            var10009 = "确认加点";
            var74 = this;
         } else if (var2 == 6) {
            var10009 = "丰卢亿叻";
            var10009 = "七十二变";
            var74 = this;
         } else if (var2 == 7) {
            var10009 = "瀩,寁";
            var10009 = "灵 宝";
            var74 = this;
         } else if (var2 == 8) {
            var10009 = "抴\u0013怄";
            var10009 = "抗 性";
            var74 = this;
         } else if (var2 == 9) {
            var10009 = "亶爵抌股";
            var10009 = "人物技能";
            var74 = this;
         } else if (var2 == 10) {
            var10009 = "坳\u0013骲";
            var10009 = "坐 骑";
            var74 = this;
         } else if (var2 == 11) {
            var10009 = "伀,圖";
            var10009 = "作 坊";
            var74 = this;
         } else if (var2 == 12) {
            var10009 = "轟捁";
            var10009 = "转换";
            var74 = this;
         } else {
            var10009 = "";
            var74 = this;
         }

         com.xy.i.Class20 var39 = new com.xy.i.Class20(null, 1, var58, Class49.bz, null, var10009, var74);
         var9[var2] = var39;
         if (var2 == 0 || var2 == 1) {
            com.xy.i.Class20 var36 = this.ph[var2];
            String var48 = "\u007f?#9#i\",b;";
            var36.setImage("sc/e/5.png");
            this.ph[var2].setBounds(170, 33 + 24 * var2, 34, 17);
            var8 = var2;
         } else if (var2 == 2) {
            var8 = var2;
            var39 = this.ph[var2];
            String var10003 = "@@\u001cF\u001c\u0016\u001dS]D";
            var39.setImage("sc/e/5.png");
            this.ph[var2].setBounds(170, 153, 34, 17);
         } else if (var2 == 3) {
            var8 = var2;
            var39 = this.ph[var2];
            String var53 = "/osis>k\",b;";
            var39.setImage("sc/e/27.png");
            this.ph[var2].setBounds(165, 188, 51, 17);
         } else if (var2 == 4 || var2 == 5) {
            com.xy.i.Class20 var35 = this.ph[var2];
            String var47 = "PP\fV\f\u0001\u0014\u001dS]D";
            var35.setImage("sc/e/27.png");
            this.ph[var2].setBounds(225 + (var2 - 4) * 57, 307, 51, 17);
            var8 = var2;
         } else if (var2 == 6) {
            var8 = var2;
            var39 = this.ph[var2];
            String var54 = "/osis>j\",b;";
            var39.setImage("sc/e/26.png");
            this.ph[var2].setBounds(48, 368, 99, 25);
         } else if (var2 == 7 || var2 == 8) {
            com.xy.i.Class20 var34 = this.ph[var2];
            String var46 = "PP\fV\f\u0000\u0012\u001dS]D";
            var34.setImage("sc/e/31.png");
            this.ph[var2].setBounds(161 + (var2 - 7) * 94, 368, 79, 25);
            var8 = var2;
         } else if (var2 == 9) {
            var8 = var2;
            var39 = this.ph[var2];
            String var55 = "/osis>j\",b;";
            var39.setImage("sc/e/26.png");
            this.ph[var2].setBounds(48, 403, 99, 25);
         } else if (var2 != 10 && var2 != 11) {
            if (var2 == 12) {
               com.xy.i.Class20 var33 = this.ph[var2];
               String var45 = "\u007f?#9#i\",b;";
               var33.setImage("sc/e/5.png");
               this.ph[var2].setBounds(179, 333, 34, 17);
            }

            var8 = var2;
         } else {
            com.xy.i.Class20 var32 = this.ph[var2];
            String var44 = "PP\fV\f\u0000\u0012\u001dS]D";
            var32.setImage("sc/e/31.png");
            this.ph[var2].setBounds(161 + (var2 - 10) * 94, 403, 79, 25);
            var8 = var2;
         }

         if (var8 >= 6 && var2 <= 11) {
            this.ph[var2].setFont(Class49.ch);
            this.ph[var2].setForeground(Color.black);
         }

         this.add(this.ph[var2++]);
      }

      this.fk = new com.xy.i.Class20[10];

      for (int var11 = var2 = 0; var11 < this.fk.length; var11 = var2) {
         com.xy.i.Class20[] var12 = this.fk;
         String var56;
         if (var2 % 2 == 0) {
            var56 = "PP\fV\f\u0000\u0011\u001dS]D";
            var56 = "sc/e/32.png";
         } else {
            var56 = "/osis?h\",b;";
            var56 = "sc/e/34.png";
         }

         com.xy.i.Class20 var37 = new com.xy.i.Class20(var56, 1, 100 + var2, this);
         var12[var2] = var37;
         this.fk[var2].setBounds(312 + 11 * (var2 % 2), 211 + 24 * (var2 / 2), 11, 15);
         this.add(this.fk[var2++]);
      }

      this.jk = new com.xy.q.Class14[19];

      for (int var13 = var2 = 0; var13 < this.jk.length; var13 = var2) {
         if (var2 == 1) {
            this.bk = new RichLabel("", Class49.w);
            this.bk.setBounds(213, 29 + var2 * 24, 124, 19);
            this.add(this.bk);
         }

         this.jk[var2] = com.xy.q.Class1.i(0, 0, 0, 0, 10, Color.white, var2 == 6 ? Class49.cp : (var2 >= 7 ? Class49.ab : Class49.ac));
         com.xy.q.Class14 var38 = this.jk[var2];
         String var51 = "PP\fW\f\u0002\u0014\u001dS]D";
         var38.mt(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false));
         Class30 var14;
         if (var2 >= 0 && var2 <= 5) {
            var14 = this;
            this.jk[var2].setBounds(211, 32 + var2 * 24, 124, 19);
         } else if (var2 == 6) {
            var14 = this;
            this.jk[var2].setBounds(79, 187, 86, 20);
         } else if (var2 >= 7 && var2 <= 11) {
            var14 = this;
            this.jk[var2].setBounds(79, 211 + (var2 - 7) * 24, 134, 20);
         } else if (var2 == 12) {
            var14 = this;
            this.jk[var2].setBounds(290, 187, 44, 20);
         } else if (var2 >= 13 && var2 <= 16) {
            var14 = this;
            this.jk[var2].setBounds(262, 209 + (var2 - 13) * 24, 74, 20);
         } else if (var2 == 17) {
            var14 = this;
            this.jk[var2].setBounds(79, 307, 134, 20);
         } else {
            if (var2 == 18) {
               this.jk[var2].setBounds(262, 305, 74, 20);
            }

            var14 = this;
         }

         var14.add(this.jk[var2++]);
      }
   }

   public int ky(int var1) {
      try {
         if (var1 == 0) {
            return Integer.parseInt(this.jk[13].getText());
         }

         if (var1 == 1) {
            return Integer.parseInt(this.jk[14].getText());
         }

         if (var1 == 2) {
            return Integer.parseInt(this.jk[15].getText());
         }

         if (var1 == 3) {
            return Integer.parseInt(this.jk[16].getText());
         }

         if (var1 == 4) {
            return Integer.parseInt(this.jk[18].getText());
         }

         if (var1 == 5) {
            return Integer.parseInt(this.jk[12].getText());
         }
      } catch (Exception var3) {
         var1 = 0;
      }

      return var1;
   }

   public void g(int var1) {
      if (var1 <= 3) {
         this.fk[8].setVisible(false);
         this.fk[9].setVisible(false);
         this.o[15].setVisible(false);
         this.o[16].setVisible(false);
         this.jk[17].setVisible(false);
         this.jk[18].setVisible(false);
         this.ph[12].setVisible(false);
         this.o[9].setBounds(40, 307, 40, 20);
         this.jk[11].setBounds(79, 307, 134, 20);
         this.ph[4].setBounds(225, 307, 51, 17);
         this.ph[5].setBounds(282, 307, 51, 17);
      } else {
         this.fk[8].setVisible(true);
         this.fk[9].setVisible(true);
         this.o[15].setVisible(true);
         this.o[16].setVisible(true);
         this.jk[17].setVisible(true);
         this.jk[18].setVisible(true);
         this.ph[12].setVisible(true);
         this.o[9].setBounds(40, 331, 40, 20);
         this.jk[11].setBounds(79, 331, 134, 20);
         this.ph[4].setBounds(225, 331, 51, 17);
         this.ph[5].setBounds(282, 331, 51, 17);
      }
   }
}
