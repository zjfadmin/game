package com.xy;

import com.xy.bean.BeauBean;
import com.xy.bean.LoginResult;
import com.xy.game.RoleData;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

public class Class145 extends Class345 {
   private Class70 adl;
   private Class436 ec;
   private JLabel[] iv;
   private Class245[] jc;
   private Class70[] db;
   private RichLabel bw;
   private Class436 bl;
   private Class70[] adm;

   public void y(int var1) {
      if (var1 <= --3) {
         this.adm[28 & 107].setVisible((boolean)(5 >> 3));
         this.adm[123 & 13].setVisible((boolean)(3 ^ 3));
         this.iv[127 & 15].setVisible((boolean)(3 & 4));
         this.iv[53 & 90].setVisible((boolean)(5 >> 3));
         this.jc[127 & 17].setVisible((boolean)(5 >> 3));
         this.jc[22 & 123].setVisible((boolean)(3 & 4));
         this.db[77 & 62].setVisible((boolean)(5 >> 3));
         this.iv[59 & 77].setBounds(45 & 122, 30207 & 2867, 45 & 122, 30 & 117);
         this.jc[11 & 127].setBounds(95 & 111, 20787 & 12287, 4094 & 28807, 92 & 55);
         this.db[--4].setBounds(225, 307, 51, 17);
         this.db[--5].setBounds(282, 307, 51, 17);
      } else {
         this.adm[8].setVisible((boolean)(3 & 5));
         this.adm[9].setVisible((boolean)(3 & 5));
         this.iv[15].setVisible((boolean)(--1));
         this.iv[16].setVisible((boolean)(2 ^ 3));
         this.jc[17].setVisible((boolean)(2 ^ 3));
         this.jc[18].setVisible((boolean)(2 ^ 3));
         this.db[12].setVisible((boolean)(--1));
         this.iv[9].setBounds(40, 331, 40, 20);
         this.jc[11].setBounds(79, 331, 134, 20);
         this.db[--4].setBounds(225, 331, 51, 17);
         this.db[--5].setBounds(282, 331, 51, 17);
      }
   }

   public Class145(GameView var1) {
      int var10001 = 31 & 113;
      int var10011 = -1 & -3;
      super(3 >> 2, 5 >> 1, Class345.aef, var1);
      this.va(var10011, 2 & 5, 13163 & 19966, 4047 & 29175, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 92 & 103, 92 & 103, 92 & 103, 92 & 103, (boolean)(2 & 5)), "人物属性");
      this.ec = new Class436();
      this.bl = new Class436();
      this.ec.setBounds(95 & 99, 107 & 61, 79 & 123, 117 & 110);
      this.bl.fw("sc/d/27.png");
      this.bl.setBounds(63 & 125, 115 & 47, 119 & 95, 127 & 112);
      this.add(this.ec);
      this.add(this.bl);
      JLabel[] var4 = new JLabel[var10001];
      boolean var10003 = true;
      this.iv = var4;

      int var2;
      Class145 var3;
      int var10000;
      for(var10000 = var2 = 3 >> 2; var10000 < this.iv.length; var10000 = var2) {
         this.iv[var2] = Class133.c(124 & 43, 31482 & 1431, 31198 & 1699, 18, 5 >> 3, Color.black, Class681.ak);
         this.iv[var2].setText(var2 == 0 ? "学习交流·自学" : (var2 == --1 ? "帮派" : (var2 == --2 ? "声望" : (var2 == --3 ? "战绩" : (var2 == --4 ? "等级" : (var2 == --5 ? "气血" : (var2 == 6 ? "法力" : (var2 == 7 ? "攻击" : (var2 == 8 ? "速度" : (var2 == 9 ? "经验" : (var2 == 10 ? "可分配点" : (var2 == 11 ? "根骨" : (var2 == 12 ? "灵性" : (var2 == 13 ? "力量" : (var2 == 14 ? "敏捷" : (var2 == 15 ? "禅定" : (var2 == 16 ? "定力" : "")))))))))))))))));
         if (var2 >= 3 >> 1 && var2 <= --3) {
            var3 = this;
            this.iv[var2].setBounds(167, 80 + (var2 - (3 & 5)) * 24, 40, 19);
         } else if (var2 >= --4 && var2 <= 9) {
            var3 = this;
            this.iv[var2].setBounds(40, 187 + (var2 - --4) * 24, 40, 20);
         } else if (var2 == 10) {
            var3 = this;
            this.iv[var2].setBounds(216, 187, 70, 20);
         } else if (var2 >= 11 && var2 <= 14) {
            var3 = this;
            this.iv[var2].setBounds(220, 209 + (var2 - 11) * 24, 40, 20);
         } else if (var2 == 15) {
            var3 = this;
            this.iv[var2].setBounds(40, 307, 40, 20);
         } else {
            if (var2 == 16) {
               this.iv[var2].setBounds(220, 305, 40, 20);
            }

            var3 = this;
         }

         var3.add(this.iv[var2++]);
      }

      Class70[] var5 = new Class70[13];
      var10003 = true;
      this.db = var5;

      for(var10000 = var2 = 5 >> 3; var10000 < this.db.length; var10000 = var2) {
         Class70[] var8 = this.db;
         Class70 var6 = new Class70;
         int var10005 = --1;
         int var10006 = --1 + var2;
         Font var10007 = Class681.bm;
         String var10009;
         Class145 var10010;
         if (var2 == 0) {
            var10009 = "名字";
            var10010 = this;
         } else if (var2 == (2 ^ 3)) {
            var10009 = "I D";
            var10010 = this;
         } else if (var2 == (1 ^ 3)) {
            var10009 = "称谓";
            var10010 = this;
         } else if (var2 == --3) {
            var10009 = "切属性";
            var10010 = this;
         } else if (var2 == --4) {
            var10009 = "推荐加点";
            var10010 = this;
         } else if (var2 == --5) {
            var10009 = "确认加点";
            var10010 = this;
         } else if (var2 == 6) {
            var10009 = "七十二变";
            var10010 = this;
         } else if (var2 == 7) {
            var10009 = "灵 宝";
            var10010 = this;
         } else if (var2 == 8) {
            var10009 = "抗 性";
            var10010 = this;
         } else if (var2 == 9) {
            var10009 = "人物技能";
            var10010 = this;
         } else if (var2 == 10) {
            var10009 = "坐 骑";
            var10010 = this;
         } else if (var2 == 11) {
            var10009 = "作 坊";
            var10010 = this;
         } else if (var2 == 12) {
            var10009 = "转换";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var6.<init>((String)null, var10005, var10006, var10007, (Color[])null, var10009, var10010);
         var8[var2] = var6;
         if (var2 != 0 && var2 != 3 >> 1) {
            if (var2 == (1 ^ 3)) {
               var10000 = var2;
               this.db[var2].setImage("sc/e/5.png");
               this.db[var2].setBounds(170, 153, 34, 17);
            } else if (var2 == --3) {
               var10000 = var2;
               this.db[var2].setImage("sc/e/27.png");
               this.db[var2].setBounds(165, 188, 51, 17);
            } else if (var2 != --4 && var2 != --5) {
               if (var2 == 6) {
                  var10000 = var2;
                  this.db[var2].setImage("sc/e/26.png");
                  this.db[var2].setBounds(48, 368, 99, 25);
               } else if (var2 != 7 && var2 != 8) {
                  if (var2 == 9) {
                     var10000 = var2;
                     this.db[var2].setImage("sc/e/26.png");
                     this.db[var2].setBounds(48, 403, 99, 25);
                  } else if (var2 != 10 && var2 != 11) {
                     if (var2 == 12) {
                        this.db[var2].setImage("sc/e/5.png");
                        this.db[var2].setBounds(179, 333, 34, 17);
                     }

                     var10000 = var2;
                  } else {
                     this.db[var2].setImage("sc/e/31.png");
                     this.db[var2].setBounds(161 + (var2 - 10) * 94, 403, 79, 25);
                     var10000 = var2;
                  }
               } else {
                  this.db[var2].setImage("sc/e/31.png");
                  this.db[var2].setBounds(161 + (var2 - 7) * 94, 368, 79, 25);
                  var10000 = var2;
               }
            } else {
               this.db[var2].setImage("sc/e/27.png");
               this.db[var2].setBounds(225 + (var2 - 4) * 57, 307, 51, 17);
               var10000 = var2;
            }
         } else {
            this.db[var2].setImage("sc/e/5.png");
            this.db[var2].setBounds(170, 33 + 24 * var2, 34, 17);
            var10000 = var2;
         }

         if (var10000 >= 6 && var2 <= 11) {
            this.db[var2].setFont(Class681.ak);
            this.db[var2].setForeground(Color.black);
         }

         this.add(this.db[var2++]);
      }

      if (this.uw().gameXuanBao) {
         this.adl = new Class70("sc/e/31.png", --1, 14, Class681.ak, (Color[])null, "玄 宝", this);
         this.adl.setForeground(Color.black);
         this.adl.setBounds(161, 403, 79, 25);
         this.add(this.adl);
         this.db[10].setVisible((boolean)(3 & 4));
      }

      var5 = new Class70[10];
      var10003 = true;
      this.adm = var5;

      for(var10000 = var2 = 3 ^ 3; var10000 < this.adm.length; var10000 = var2) {
         this.adm[var2] = new Class70(var2 % 2 == 0 ? "sc/e/32.png" : "sc/e/34.png", 1, 100 + var2, this);
         this.adm[var2].setBounds(312 + 11 * (var2 % 2), 211 + 24 * (var2 / 2), 11, 15);
         this.add(this.adm[var2++]);
      }

      Class245[] var7 = new Class245[19];
      var10003 = true;
      this.jc = var7;

      for(var10000 = var2 = 3 >> 2; var10000 < this.jc.length; var10000 = var2) {
         if (var2 == 3 >> 1) {
            this.bw = new RichLabel("", Class681.q);
            this.bw.setBounds(213, 29 + var2 * 24, 124, 19);
            this.add(this.bw);
         }

         this.jc[var2] = Class133.a(3 & 4, 3 & 4, 3 & 4, 3 & 4, 10, Color.white, var2 == 6 ? Class681.bx : (var2 >= 7 ? Class681.cd : Class681.ce));
         this.jc[var2].eq(Class511.q("sc/d/17.png", 3, 3, 3, 3, (boolean)(5 >> 3)));
         if (var2 >= 0 && var2 <= 5) {
            var3 = this;
            this.jc[var2].setBounds(211, 32 + var2 * 24, 124, 19);
         } else if (var2 == 6) {
            var3 = this;
            this.jc[var2].setBounds(79, 187, 86, 20);
         } else if (var2 >= 7 && var2 <= 11) {
            var3 = this;
            this.jc[var2].setBounds(79, 211 + (var2 - 7) * 24, 134, 20);
         } else if (var2 == 12) {
            var3 = this;
            this.jc[var2].setBounds(290, 187, 44, 20);
         } else if (var2 >= 13 && var2 <= 16) {
            var3 = this;
            this.jc[var2].setBounds(262, 209 + (var2 - 13) * 24, 74, 20);
         } else if (var2 == 17) {
            var3 = this;
            this.jc[var2].setBounds(79, 307, 134, 20);
         } else {
            if (var2 == 18) {
               this.jc[var2].setBounds(262, 305, 74, 20);
            }

            var3 = this;
         }

         var3.add(this.jc[var2++]);
      }

   }

   public int mi(int var1) {
      try {
         if (var1 == 0) {
            return Integer.parseInt(this.jc[79 & 61].getText());
         }

         if (var1 == (3 & 5)) {
            return Integer.parseInt(this.jc[62 & 79].getText());
         }

         if (var1 == --2) {
            return Integer.parseInt(this.jc[127 & 15].getText());
         }

         if (var1 == --3) {
            return Integer.parseInt(this.jc[28 & 115].getText());
         }

         if (var1 == --4) {
            return Integer.parseInt(this.jc[118 & 27].getText());
         }

         if (var1 == --5) {
            var1 = Integer.parseInt(this.jc[94 & 45].getText());
            return var1;
         }
      } catch (Exception var2) {
         var1 = 3 ^ 3;
      }

      return var1;
   }

   public void q() {
      if (this.vd() != null) {
         this.d();
         super.q();
      }
   }

   public void d() {
      RoleData var1;
      if ((var1 = this.vd()) != null) {
         LoginResult var2;
         LoginResult var10001 = var2 = var1.getLoginResult();
         int var3 = Class224.g(var10001.getGrade());
         Class224.d(var10001.getGrade());
         this.ec.fw(Class222.l(var2.getSpecies_id().toString()));
         this.jc[46 & 87].setText(Class224.r(var2.getGrade()) + "级");
         this.iv[2 & 5].setText(var2.getRace_name() + "·" + var2.getLocalname());
         this.jc[1 ^ 3].setText(var2.getGangname());
         this.jc[--5].setText(var2.getTitle());
         this.jc[3 >> 2].setText(var2.getRolename());
         Class145 var10000;
         BeauBean var4;
         if ((var4 = var1.getBeau()) == null) {
            var10000 = this;
            this.bw.setText("#W" + var2.getRole_id());
         } else if (var4.a()) {
            this.bw.setText("#VBEAU" + var4.toString() + "#L");
            var10000 = this;
         } else {
            this.bw.setText("#cFF00FF" + var4.getBeau());
            var10000 = this;
         }

         var10000.jc[--3].setText(var2.getPrestige().toString());
         this.jc[--4].setText(var2.getPkrecord().toString());
         this.y(var3);
         this.jc[31 & 107].setText(var2.getExperience().toString());
         this.jc[44 & 95].setText(var2.getCanpoint().toString());
         this.jc[13 & 127].setText(String.valueOf(var1.getRoleProperty().getBone()));
         this.jc[62 & 79].setText(String.valueOf(var1.getRoleProperty().getSpir()));
         this.jc[127 & 15].setText(String.valueOf(var1.getRoleProperty().getPower()));
         this.jc[85 & 58].setText(String.valueOf(var1.getRoleProperty().getSpeed()));
         this.jc[94 & 51].setText(String.valueOf(var1.getRoleProperty().getCalm()));
         Class514 var5 = this.aej.getBattleScene() != null ? this.aej.getBattleScene().getBattleUnit(5 >> 3, this.aej.roleData.getRoleId()) : null;
         if (var5 != null) {
            this.jc[23 & 111].setText(var5.bt().getHp_Current() + "/" + var5.bt().getHp_Total());
            var10000 = this;
            this.jc[109 & 26].setText(var5.bt().getMp_Current() + "/" + var5.bt().getMp_Total());
            this.jc[73 & 63].setText(String.valueOf(var5.bt().getBap()));
            this.jc[122 & 15].setText(String.valueOf(var5.bt().getBsp()));
         } else {
            this.jc[47 & 87].setText(var2.getHp().intValue() + "/" + var1.getRoleProperty().getHp());
            var10000 = this;
            this.jc[74 & 61].setText(var2.getMp().intValue() + "/" + var1.getRoleProperty().getMp());
            this.jc[45 & 91].setText(String.valueOf(var1.getRoleProperty().getAp()));
            this.jc[10 & 127].setText(String.valueOf(var1.getRoleProperty().getSp()));
         }

         var10000.jc[17].setText(String.valueOf(var1.getRoleProperty().getCdz()));
      }
   }

   public void cf(int var1, int var2) {
      try {
         Class145 var10000;
         if (var1 == 0) {
            var10000 = this;
            var1 = Integer.parseInt(this.jc[79 & 61].getText());
            this.jc[125 & 15].setText(String.valueOf(var1 + var2));
         } else if (var1 == (3 & 5)) {
            var10000 = this;
            var1 = Integer.parseInt(this.jc[62 & 79].getText());
            this.jc[47 & 94].setText(String.valueOf(var1 + var2));
         } else if (var1 == 5 >> 1) {
            var10000 = this;
            var1 = Integer.parseInt(this.jc[111 & 31].getText());
            this.jc[47 & 95].setText(String.valueOf(var1 + var2));
         } else if (var1 == --3) {
            var10000 = this;
            var1 = Integer.parseInt(this.jc[28 & 115].getText());
            this.jc[126 & 17].setText(String.valueOf(var1 + var2));
         } else {
            if (var1 == --4) {
               var1 = Integer.parseInt(this.jc[55 & 90].getText());
               this.jc[118 & 27].setText(String.valueOf(var1 + var2));
            }

            var10000 = this;
         }

         var1 = Integer.parseInt(var10000.jc[13 & 126].getText());
         this.jc[13 & 126].setText(String.valueOf(var1 - var2));
      } catch (Exception var3) {
      }
   }
}
