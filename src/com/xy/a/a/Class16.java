package com.xy.a.a;

import com.xy.entity.RoleSummoning;
import com.xy.formula.PetProperty;
import com.xy.game.RoleData;
import com.xy.game.RolePet;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.math.BigDecimal;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class Class16 extends com.xy.q.Class30 {
   private JLabel[] ou;
   private boolean al;
   private com.xy.q.Class14[] ov;
   private com.xy.i.Class4[] e;
   private com.xy.q.Class36 nw;
   private Class14 ow;
   private JScrollPane cp;
   private com.xy.w.Class18[] ar;
   private com.xy.w.Class0 as;
   private com.xy.i.Class20[] ag;
   private com.xy.q.Class18 ox;

   @Override
   public boolean ah() {
      this.h();
      return super.ah();
   }

   public com.xy.q.Class36 ku() {
      return this.nw;
   }

   public void i(BigDecimal var1) {
      this.ox.ef(var1 != null ? var1.longValue() : 0L);
   }

   public com.xy.q.Class14[] kv() {
      return this.ov;
   }

   public com.xy.i.Class4[] kw() {
      return this.e;
   }

   public void y(int var1) {
      var1--;
      this.ow.setVisible(false);
      if (var1 >= 0) {
         RoleData var2;
         RolePet var3;
         int var4 = (var3 = (var2 = this.yx()).getRolePet(Class14.jw(this.ow).longValue())) != null ? var2.pets.indexOf(var3) : -1;
         if (var3 != null && var4 != -1) {
            if (var4 != var1) {
               RolePet var5 = var1 < var2.pets.size() ? var2.pets.get(var1) : null;
               if (var5 != null) {
                  var2.pets.set(var4, var5);
                  var2.pets.set(var1, var3);
                  var2.bl();
                  this.ox.dh();
               }
            }
         }
      }
   }

   public Class16(GameView var1) {
      super(6, 2, com.xy.q.Class30.afz, var1);
      this.yy(-2, 0, 397, 495, com.xy.q.Class30.agh);
      com.xy.w.Class9 var76 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10010 = "句啲兴";
      this.yu(var76, "召唤兽");
      this.ox = new com.xy.q.Class18(this);
      this.ox.setBounds(0, 0, 150, 20);
      this.cp = com.xy.q.Class1.g(45, 42, 170, 140, this.ox, 20);
      this.add(this.cp);
      this.ou = new JLabel[17];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.ou.length; var10000 = var2) {
         this.ou[var2] = com.xy.q.Class1.f(40, 146, 130, 18, 0, Color.black, com.xy.q.Class49.ch);
         JLabel var7 = this.ou[var2];
         String var19;
         if (var2 == 0) {
            var19 = "叛啳兊\u007f\u0001x\u0006o\u001e";
            var19 = "召唤兽(6/18)";
         } else if (var2 == 1) {
            var19 = "呛秹";
            var19 = "名称";
         } else if (var2 == 2) {
            var19 = "笞纐";
            var19 = "等级";
         } else if (var2 == 3) {
            var19 = "徶诓";
            var19 = "忠诚";
         } else if (var2 == 4) {
            var19 = "以寱";
            var19 = "亲密";
         } else if (var2 == 5) {
            var19 = "求衉";
            var19 = "气血";
         } else if (var2 == 6) {
            var19 = "沂劬";
            var19 = "法力";
         } else if (var2 == 7) {
            var19 = "敭凲";
            var19 = "攻击";
         } else if (var2 == 8) {
            var19 = "遈庑";
            var19 = "速度";
         } else if (var2 == 9) {
            var19 = "纙骅";
            var19 = "经验";
         } else if (var2 == 10) {
            var19 = "厸刱鄚炎";
            var19 = "可分配点";
         } else if (var2 == 11) {
            var19 = "桯骡";
            var19 = "根骨";
         } else if (var2 == 12) {
            var19 = "瀢怐";
            var19 = "灵性";
         } else if (var2 == 13) {
            var19 = "勍釆";
            var19 = "力量";
         } else if (var2 == 14) {
            var19 = "攘捀";
            var19 = "敏捷";
         } else if (var2 == 15) {
            var19 = "秓宓";
            var19 = "禅定";
         } else if (var2 == 16) {
            var19 = "寍劬";
            var19 = "定力";
         } else {
            var19 = "";
         }

         var7.setText(var19);
         Class16 var8;
         if (var2 == 0) {
            var8 = this;
            this.ou[var2].setBounds(45, 21, 170, 21);
            this.ou[var2].setForeground(Color.white);
         } else if (var2 >= 1 && var2 <= 9) {
            var8 = this;
            this.ou[var2].setBounds(39, 195 + (var2 - 1) * 25, 40, 20);
         } else if (var2 == 10) {
            var8 = this;
            this.ou[var2].setBounds(231, 271, 92, 20);
         } else if (var2 >= 11 && var2 <= 14) {
            var8 = this;
            this.ou[var2].setBounds(231, 297 + (var2 - 11) * 25, 40, 20);
         } else if (var2 == 15) {
            var8 = this;
            this.ou[var2].setBounds(39, 395, 40, 20);
         } else {
            if (var2 == 16) {
               this.ou[var2].setBounds(231, 397, 40, 20);
            }

            var8 = this;
         }

         var8.add(this.ou[var2++]);
      }

      this.e = new com.xy.i.Class4[17];

      for (int var9 = var2 = 0; var9 < this.e.length; var9 = var2) {
         this.e[var2] = new com.xy.i.Class4(null, 1, 21 + var2, com.xy.q.Class49.bz, null, "", this);
         com.xy.i.Class4 var10 = this.e[var2];
         String var37;
         if (var2 == 5) {
            var37 = "攰";
            var37 = "改";
         } else if (var2 == 6) {
            var37 = "敩用";
            var37 = "放生";
         } else if (var2 == 7) {
            var37 = "騹兲";
            var37 = "驯养";
         } else if (var2 == 8) {
            var37 = "去唓";
            var37 = "召唤";
         } else if (var2 == 9) {
            var37 = "厔我";
            var37 = "参战";
         } else if (var2 == 10) {
            var37 = "爾哶";
            var37 = "物品";
         } else if (var2 == 11) {
            var37 = "烪妟";
            var37 = "炼妖";
         } else if (var2 == 12) {
            var37 = "拀怐";
            var37 = "抗性";
         } else if (var2 == 13) {
            var37 = "拖胴";
            var37 = "技能";
         } else if (var2 == 14) {
            var37 = "揿荧勷炎";
            var37 = "推荐加点";
         } else if (var2 == 15) {
            var37 = "砸训勶炰";
            var37 = "确认加点";
         } else if (var2 == 16) {
            var37 = "瀢犷";
            var37 = "灵犀";
         } else {
            var37 = "";
         }

         var10.setText(var37);
         Class16 var11;
         if (var2 == 0) {
            var11 = this;
            com.xy.i.Class4 var54 = this.e[var2];
            String var10003 = "%jyly8xy8n";
            var54.setImage("sc/e/1.png");
            this.e[var2].setBounds(258, 22, 18, 18);
         } else if (var2 == 1) {
            var11 = this;
            com.xy.i.Class4 var55 = this.e[var2];
            String var68 = "$TxRx\u0005yG9P";
            var55.setImage("sc/e/2.png");
            this.e[var2].setBounds(279, 22, 18, 18);
         } else if (var2 >= 2 && var2 <= 4) {
            var11 = this;
            com.xy.i.Class4 var59 = this.e[var2];
            String var71 = "z5&3&b0xy8n";
            var59.setImage("sc/e/49.png");
            this.e[var2].setBounds(217, 93 + (var2 - 2) * 20, 17, 17);
         } else if (var2 == 5) {
            var11 = this;
            com.xy.i.Class4 var56 = this.e[var2];
            String var69 = "D4\u00182\u0018c\u0007yG9P";
            var56.setImage("sc/e/40.png");
            this.e[var2].setBounds(195, 196, 18, 18);
         } else {
            label263:
            if (var2 != 6 && var2 != 7) {
               if ((var2 < 8 || var2 > 13) && var2 != 16) {
                  if (var2 == 14 || var2 == 15) {
                     com.xy.i.Class4 var50 = this.e[var2];
                     String var58 = "z5&3&d>xy8n";
                     var50.setImage("sc/e/27.png");
                     this.e[var2].setBounds(233 + (var2 - 14) * 77, 397, 51, 17);
                  }
               } else {
                  this.e[var2].setFont(com.xy.q.Class49.ch);
                  this.e[var2].setForeground(Color.black);
                  com.xy.i.Class4 var12 = this.e[var2];
                  var37 = "$TxRx\u0000yG9P";
                  var12.setImage("sc/e/7.png");
                  if (var2 == 8) {
                     var11 = this;
                     this.e[var2].setBounds(315, 450, 59, 25);
                     break label263;
                  }

                  if (var2 == 9) {
                     var11 = this;
                     this.e[var2].setBounds(310, 243, 59, 25);
                     break label263;
                  }

                  if (var2 == 10) {
                     var11 = this;
                     this.e[var2].setBounds(43 + (var2 - 10) * 68, 450, 59, 25);
                     break label263;
                  }

                  if (var2 == 11) {
                     var11 = this;
                     this.e[var2].setBounds(43 + (var2 - 10) * 68, 450, 59, 25);
                     break label263;
                  }

                  if (var2 == 12) {
                     var11 = this;
                     this.e[var2].setBounds(43 + (var2 - 10) * 68, 450, 59, 25);
                     break label263;
                  }

                  if (var2 == 13) {
                     var11 = this;
                     this.e[var2].setBounds(43 + (var2 - 10) * 68, 450, 59, 25);
                     break label263;
                  }

                  if (var2 == 16) {
                     var11 = this;
                     this.e[var2].setBounds(244, 243, 59, 25);
                     break label263;
                  }
               }

               var11 = this;
            } else {
               var11 = this;
               com.xy.i.Class4 var57 = this.e[var2];
               String var70 = "%jyly?xy8n";
               var57.setImage("sc/e/6.png");
               this.e[var2].setBounds(178, 221 + (var2 - 6) * 25, 34, 18);
            }
         }

         var11.add(this.e[var2++]);
      }

      this.ag = new com.xy.i.Class20[10];

      for (int var13 = var2 = 0; var13 < this.ag.length; var13 = var2) {
         com.xy.i.Class20[] var14 = this.ag;
         String var74;
         if (var2 % 2 == 0) {
            var74 = "D4\u00182\u0018d\u0005yG9P";
            var74 = "sc/e/32.png";
         } else {
            var74 = "z5&3&e=xy8n";
            var74 = "sc/e/34.png";
         }

         com.xy.i.Class20 var51 = new com.xy.i.Class20(var74, 1, 200 + var2, this);
         var14[var2] = var51;
         this.ag[var2].setBounds(350 + 11 * (var2 % 2), 300 + 25 * (var2 / 2), 11, 15);
         this.add(this.ag[var2++]);
      }

      String var10006 = "D4\u00183\u0018f\u0000yG9P";
      this.nw = com.xy.q.Class1.j(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false), com.xy.q.Class49.cp, Color.white);
      this.nw.setBounds(79, 195, 134, 20);
      this.add(this.nw);
      this.ov = new com.xy.q.Class14[15];

      for (int var15 = var2 = 0; var15 < this.ov.length; var15 = var2) {
         this.ov[var2] = com.xy.q.Class1.i(0, 0, 0, 0, 10, Color.white, var2 == 0 ? com.xy.q.Class49.cp : com.xy.q.Class49.ab);
         com.xy.q.Class14 var52 = this.ov[var2];
         String var62 = "z5&2&g>xy8n";
         var52.mt(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false));
         Class16 var16;
         if (var2 == 0 || var2 == 1) {
            var16 = this;
            this.ov[var2].setBounds(79, 220 + var2 * 25, 98, 20);
         } else if (var2 >= 2 && var2 <= 7) {
            var16 = this;
            this.ov[var2].setBounds(79, 220 + var2 * 25, 134, 20);
         } else if (var2 == 8) {
            var16 = this;
            this.ov[var2].setBounds(323, 271, 52, 20);
         } else if (var2 >= 9 && var2 <= 12) {
            var16 = this;
            this.ov[var2].setBounds(271, 297 + (var2 - 9) * 25, 104, 20);
         } else if (var2 == 13) {
            var16 = this;
            this.ov[var2].setBounds(79, 395, 134, 20);
         } else {
            if (var2 == 14) {
               this.ov[var2].setBounds(271, 397, 104, 20);
            }

            var16 = this;
         }

         var16.add(this.ov[var2++]);
      }

      this.ar = new com.xy.w.Class18[3];

      for (int var17 = var2 = 0; var17 < this.ar.length; var17 = var2) {
         this.ar[var2] = new com.xy.w.Class18();
         Class16 var18;
         if (var2 == 0) {
            var18 = this;
            com.xy.w.Class18 var64 = this.ar[var2];
            String var72 = "D4\u00183\u0018e\u0002yG9P";
            var64.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            this.ar[var2].setBounds(45, 21, 170, 21);
         } else if (var2 == 1) {
            var18 = this;
            com.xy.w.Class18 var65 = this.ar[var2];
            String var73 = "z5&2&d=xy8n";
            var65.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
            this.ar[var2].setBounds(45, 21, 170, 160);
         } else {
            if (var2 == 2) {
               com.xy.w.Class18 var53 = this.ar[var2];
               String var66 = "D4\u00183\u0018f\u0001yG9P";
               var53.mt(com.xy.w.Class16.m("sc/d/16.png", 2, 2, 2, 2, false));
               this.ar[var2].setBounds(234, 40, 143, 200);
            }

            var18 = this;
         }

         var18.add(this.ar[var2++]);
      }

      this.g(0);
   }

   // $VF: synthetic method
   static Class14 kx(Class16 var0) {
      return var0.ow;
   }

   @Override
   public void l() {
      this.ox.l();
      this.ox.t();
      super.l();
   }

   public void cr(boolean var1) {
      this.al = var1;
   }

   public void h() {
      int var10000 = 0;
      this.kz(null);
      this.nw.setText(null);

      for (int var1 = 0; var10000 < this.ov.length; var10000 = var1) {
         this.ov[var1++].setText(null);
      }

      var10000 = 2;
      this.as = null;
      this.al = false;

      for (int var2 = 2; var10000 < 5; var10000 = var2) {
         this.e[var2++].setVisible(false);
      }

      this.g(0);
   }

   public int ky(int var1) {
      try {
         if (var1 == 0) {
            return Integer.parseInt(this.ov[9].getText());
         }

         if (var1 == 1) {
            return Integer.parseInt(this.ov[10].getText());
         }

         if (var1 == 2) {
            return Integer.parseInt(this.ov[11].getText());
         }

         if (var1 == 3) {
            return Integer.parseInt(this.ov[12].getText());
         }

         if (var1 == 4) {
            return Integer.parseInt(this.ov[14].getText());
         }

         if (var1 == 5) {
            return Integer.parseInt(this.ov[8].getText());
         }
      } catch (Exception var3) {
         var1 = 0;
      }

      return var1;
   }

   public void kz(com.xy.q.Class53 var1) {
      if (var1 == null) {
         if (this.ow != null) {
            this.ow.setVisible(false);
         }
      } else if (var1.ee() != 0L) {
         if (this.ow == null) {
            this.ow = new Class14(this);
            this.add(this.ow, 0);
         }

         this.ow.i(new BigDecimal(var1.ee()));
         this.ow.cc(230, 40);
         this.ow.setVisible(true);
      }
   }

   @Override
   protected void paintChildren(Graphics var1) {
      super.paintChildren(var1);
      if (this.as != null) {
         this.as.r(var1, 300, 200, 0, com.xy.v.Class22.l());
      }

      if (this.al) {
         var1.drawImage(com.xy.w.Class15.s, 360, 46, 10, 12, null);
      }
   }

   public void cp(int var1, String var2) {
      this.nw.setText(var2);
      this.ov[0].setForeground(Color.white);
      com.xy.q.Class14 var10002 = this.ov[0];
      StringBuilder var10003 = new StringBuilder(String.valueOf(com.xy.v.Class4.k(var1)));
      String var10004 = "纮";
      var10002.setText(var10003.append("级").toString());
      this.g(com.xy.v.Class4.c(var1));
   }

   // $VF: synthetic method
   static com.xy.q.Class18 la(Class16 var0) {
      return var0.ox;
   }

   public JLabel[] lb() {
      return this.ou;
   }

   public void g(int var1) {
      if (var1 <= 3) {
         this.ag[8].setVisible(false);
         this.ag[9].setVisible(false);
         this.ou[15].setVisible(false);
         this.ou[16].setVisible(false);
         this.ov[13].setVisible(false);
         this.ov[14].setVisible(false);
         this.e[16].setVisible(false);
         this.ou[9].setBounds(39, 395, 40, 20);
         this.ov[7].setBounds(79, 395, 134, 20);
         this.e[14].setBounds(253, 397, 51, 17);
         this.e[15].setBounds(310, 397, 51, 17);
      } else {
         this.ag[8].setVisible(true);
         this.ag[9].setVisible(true);
         this.ou[15].setVisible(true);
         this.ou[16].setVisible(true);
         this.ov[13].setVisible(true);
         this.ov[14].setVisible(true);
         this.e[16].setVisible(true);
         this.ou[9].setBounds(39, 420, 40, 20);
         this.ov[7].setBounds(79, 420, 134, 20);
         this.e[14].setBounds(253, 422, 51, 17);
         this.e[15].setBounds(310, 422, 51, 17);
      }
   }

   public void lc(RolePet var1) {
      RoleData var2;
      (var2 = this.yx()).setChosePetId(var1 != null ? var1.getId() : null);
      if (var1 == null) {
         this.h();
         this.zc().f(18);
         this.zc().f(67);
      } else {
         this.kz(null);
         RoleSummoning var3;
         int[] var4 = PetProperty.getPetHMASp(var3 = var1.getPet(), var2);
         com.xy.q.Class14 var10015 = this.ov[3];
         StringBuilder var10016 = new StringBuilder(String.valueOf(var3.getBasishp(var4[0])));
         String var10017 = "&";
         var10015.setText(var10016.append("/").append(var4[0]).toString());
         com.xy.q.Class14 var10014 = this.ov[4];
         StringBuilder var20 = new StringBuilder(String.valueOf(var3.getBasismp(var4[1])));
         String var21 = "\u0018";
         var10014.setText(var20.append("/").append(var4[1]).toString());
         this.ov[5].setText(String.valueOf(var4[2]));
         this.ov[6].setText(String.valueOf(var4[3]));
         this.ov[13].setText(String.valueOf(var4[4]));
         this.ov[9].setText(String.valueOf(var4[5]));
         this.ov[10].setText(String.valueOf(var4[6]));
         this.ov[11].setText(String.valueOf(var4[7]));
         this.ov[12].setText(String.valueOf(var4[8]));
         this.ov[14].setText(String.valueOf(var4[9]));
         this.ov[8].setText(String.valueOf(var3.getCanpoint()));
         com.xy.q.Class14 var10004 = this.ov[7];
         StringBuilder var10005 = new StringBuilder(String.valueOf(var3.getExp().toString()));
         String var10006 = "&";
         var10004.setText(var10005.append("/").append(this.yt().m(var3.getTurnRount(), com.xy.v.Class4.f(var3.getGrade()))).toString());
         this.ov[1].setText(var3.getFaithful().toString());
         this.ov[2].setText(var3.getFriendliness().toString());
         this.cp(var3.getGrade(), var3.getSummoningname());
         this.afx.baseView.xq(var4, var3);
         BigDecimal var5;
         if ((var5 = var2.getLoginResult().getSummoning_id()) != null && var5.compareTo(var3.getSid()) == 0) {
            com.xy.i.Class4 var12 = this.e[9];
            String var16 = "但恘";
            var12.setText("休息");
         } else {
            com.xy.i.Class4 var10000 = this.e[9];
            String var10001 = "厔我";
            var10000.setText("参战");
         }

         int var6;
         for (int var13 = var6 = 2; var13 < 5; var13 = var6) {
            this.e[var6++].setVisible(false);
         }

         if (var3.getInnerGoods() != null && !var3.getInnerGoods().equals("")) {
            String var14 = var3.getInnerGoods();
            String var18 = "\u000bK";
            String[] var9 = var14.split("\\|");

            int var7;
            for (int var15 = var7 = 0; var15 < var9.length && var7 < 3; var15 = var7) {
               int var19 = var7 + 2;
               var7++;
               this.e[var19].setVisible(true);
            }
         }

         this.as = var3.getPart(this.afx);
         this.al = (var3.getPetlock() >> 0 & 1) == 1;
         Class9 var10;
         if ((var10 = (Class9)this.afx.getFormManagement().l(18)) != null) {
            var10.ew(var3);
         }

         Class62 var11;
         if ((var11 = (Class62)this.afx.getFormManagement().l(67)) != null) {
            var11.ew(var3);
         }

         Class6 var8;
         if ((var8 = (Class6)this.afx.getFormManagement().l(47)) != null) {
            var8.ew(var3);
         }
      }
   }

   public void cc(int var1, int var2) {
      try {
         Class16 var10000;
         if (var1 == 0) {
            var10000 = this;
            var1 = Integer.parseInt(this.ov[9].getText());
            this.ov[9].setText(String.valueOf(var1 + var2));
         } else if (var1 == 1) {
            var10000 = this;
            var1 = Integer.parseInt(this.ov[10].getText());
            this.ov[10].setText(String.valueOf(var1 + var2));
         } else if (var1 == 2) {
            var10000 = this;
            var1 = Integer.parseInt(this.ov[11].getText());
            this.ov[11].setText(String.valueOf(var1 + var2));
         } else if (var1 == 3) {
            var10000 = this;
            var1 = Integer.parseInt(this.ov[12].getText());
            this.ov[12].setText(String.valueOf(var1 + var2));
         } else {
            if (var1 == 4) {
               var1 = Integer.parseInt(this.ov[14].getText());
               this.ov[14].setText(String.valueOf(var1 + var2));
            }

            var10000 = this;
         }

         var1 = Integer.parseInt(var10000.ov[8].getText());
         this.ov[8].setText(String.valueOf(var1 - var2));
      } catch (Exception var4) {
      }
   }
}
