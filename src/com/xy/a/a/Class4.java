package com.xy.a.a;

import com.xy.entity.Baby;
import com.xy.formula.BaseValue;
import com.xy.formula.PropertyUtil;
import com.xy.game.HandleEquip;
import com.xy.game.RoleData;
import com.xy.readbean.BabyResult;
import com.xy.readbean.Goodstable;
import com.xy.readbean.Talent;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.socket.ParamTool;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import javax.swing.JLabel;

public class Class4 extends com.xy.q.Class30 {
   private com.xy.w.Class18[] bb;
   private Class56[] bc;
   private JLabel bd;
   private Class56[] be;
   private Class2 bf;
   private com.xy.i.Class4[] bg;
   private Class57 bh;
   protected boolean bi;
   private RichLabel bj;

   public void af(com.xy.q.Class54 var1) {
      RoleData var2;
      if ((var2 = this.yx()) != null) {
         Baby var3;
         if ((var3 = var2.getChoseBaby()) != null) {
            int var4 = -1;
            int var5;
            int var10000 = var5 = 0;

            while (true) {
               if (var10000 >= Class57.alf(this.bh).length) {
                  var10000 = var4;
                  break;
               }

               if (Class56.ale(Class57.alf(this.bh)[var5]) == var1) {
                  var10000 = var4 = var5;
                  break;
               }

               var10000 = ++var5;
            }

            if (var10000 != -1) {
               String var9;
               if (!com.xy.v.Class12.h(var9 = var3.getTalents())) {
                  com.xy.v.Class8 var6 = this.yt();
                  String var10001 = "BY";
                  String var11 = var9.split("\\|")[var4 % 3];
                  var10001 = "\u001a";
                  String[] var7 = var11.split("=");
                  Talent var8;
                  if ((var8 = var6.az(Integer.parseInt(var7[0]))) != null) {
                     com.xy.a.Class48 var12 = (com.xy.a.Class48)this.zc().j(46);
                     int var10003 = Integer.parseInt(var7[1]);
                     boolean var10004;
                     Baby var10005;
                     if (var4 < 3) {
                        var10004 = true;
                        var10005 = var3;
                     } else {
                        var10004 = false;
                        var10005 = var3;
                     }

                     var12.qi(var3, var8, var10003, var10004, var10005.getOutcome(), var4 % 3);
                  }
               }
            }
         }
      }
   }

   public void ag(int var1, int var2, String var3) {
      int var4 = var1 / 30 % 12;
      int var5 = var1 / 360;
      int var10000;
      if (var3 != null && !var3.equals("")) {
         this.bd.setText(var3);
         var10000 = var5;
      } else {
         StringBuffer var6 = new StringBuffer();
         if (var5 > 0) {
            var6.append(var5);
            var6.append("岁");
         }

         var6.append(var4);
         var6.append("月");
         this.bd.setText(var6.toString());
         var10000 = var5;
      }

      if ((var5 = var10000 / 3) > 5) {
         var5 = 5;
      }

      if (var2 == 0) {
         this.bb[1].dp("sc/baby/c110" + var5 + ".png");
      } else {
         this.bb[1].dp("sc/baby/c100" + var5 + ".png");
      }
   }

   public void e() {
      int var10000 = 0;
      this.bb[0].setVisible(false);
      this.bb[1].l();

      for (int var1 = 0; var10000 < this.bc.length; var10000 = var1) {
         com.xy.q.Class54 var2 = Class56.ale(this.bc[var1]);
         var1++;
         var2.gs(0, null);
      }

      this.bf.t();
      this.bh.t();
   }

   public void y(int var1) {
      int var2;
      for (int var10000 = var2 = 0; var10000 < this.bg.length; var10000 = ++var2) {
         this.bg[var2].setKeep(var1 - 1 == var2);
      }

      if (var1 == 1) {
         this.bf.setVisible(true);
         this.bh.setVisible(false);
      } else {
         if (var1 == 2) {
            this.bf.setVisible(false);
            this.bh.setVisible(true);
         }
      }
   }

   // $VF: synthetic method
   private void f() {
      this.e();
      RoleData var1;
      Baby var2 = (var1 = this.yx()) != null ? var1.getChoseBaby() : null;
      if (var2 != null) {
         this.ag(var2.getBabyage(), var2.getChildSex(), var2.getOutcome());
         BigDecimal[] var3 = var2.getpartAll();

         int var4;
         for (int var10000 = var4 = 0; var10000 < var3.length; var10000 = ++var4) {
            Goodstable var5;
            if ((var5 = var1.getGoodEquip(var3[var4])) != null) {
               Class56.ale(this.bc[var4]).gs(1, var5);
            }
         }

         String var15;
         if (!com.xy.v.Class12.h(var15 = var2.getTalents())) {
            com.xy.v.Class8 var16 = this.yt();
            String var10001 = "BY";
            String[] var6 = var15.split("\\|");

            int var7;
            for (int var27 = var7 = 0; var27 < var6.length; var27 = ++var7) {
               String var28 = var6[var7];
               var10001 = "\u001a";
               int var8 = var28.indexOf("=");
               Talent var9;
               if ((var9 = var16.az(com.xy.v.Class12.ad(var6[var7], 0, var8))) != null) {
                  Class56.ale(Class57.alf(this.bh)[var7]).gs(3, var9);
                  if (var9.getId() > 3) {
                     Class56.ale(Class57.alf(this.bh)[3 + var7]).gs(4, var9);
                  }
               }
            }
         }

         BigDecimal var17;
         if ((var17 = var1.getLoginResult().getBabyId()) != null && var17.compareTo(var2.getBabyid()) == 0) {
            Class2.q(this.bf)[2].setText("待机");
         } else {
            Class2.q(this.bf)[2].setText("参战");
         }

         Class2.r(this.bf).setText(var2.getBabyname());
         if (this.za().gameBaby) {
            int var18 = 400;
            BabyResult var21;
            if ((var21 = this.yt().av(var2.getOutcome())) != null) {
               var18 = var21.getQ1() == 11 && var21.getQ2() == 11 && var21.getQ3() == 11 ? 800 : 600;
            }

            Map var22 = var2.getBabyMap(var1);

            int var23;
            for (int var30 = var23 = 1; var30 <= 7; var30 = var23) {
               double var10 = PropertyUtil.getMapValue(var22, BaseValue.babyKeys[var23]);
               Class2.s(this.bf)[var23 - 1].setForeground(var10 >= 1200.0 ? Color.white : Color.white);
               com.xy.q.Class14 var31 = Class2.s(this.bf)[var23 - 1];
               var23++;
               var31.setText(String.valueOf((int)var10));
            }

            int var32 = 9;
            Class2.s(this.bf)[7].setText(String.valueOf((int)PropertyUtil.getMapValue(var22, BaseValue.babyKeys[8])));

            for (int var24 = 9; var32 <= 10; var32 = var24) {
               double var26 = PropertyUtil.getMapValue(var22, BaseValue.babyKeys[var24]);
               Class2.s(this.bf)[var24 - 1].setForeground(var26 >= var18 ? Color.white : Color.white);
               com.xy.q.Class14 var33 = Class2.s(this.bf)[var24 - 1];
               StringBuilder var48 = new StringBuilder(String.valueOf(String.valueOf((int)var26)));
               var48 = var48.append("/");
               var24++;
               var33.setText(var48.append(var18).toString());
            }

            Class2.s(this.bf)[10].setText(var2.getWenbao().toString());
            Class2.s(this.bf)[11].setText(var2.getPilao().toString());
            Class2.s(this.bf)[12].setText(var2.getYangyujin().toString());
            double var25;
            double var11 = var25 = (Double)var22.get(BaseValue.babyTotal3);

            int var13;
            for (int var34 = var13 = 9; var34 <= 10; var34 = ++var13) {
               Double var14;
               if ((var14 = (Double)var22.get(BaseValue.babyKeys[var13])) != null) {
                  if (var14 > 400.0) {
                     var14 = 400.0 + (var14 - 400.0) / 6.4;
                  }

                  var11 += var25 * var14 * 0.002;
               }
            }

            this.bj.setTextSize(new StringBuilder("#Z#W评分:#G").append((int)var11).append("#W(").append((int)var25).append(")").toString(), 200);
            this.bj.setBounds(110 + (200 - this.bj.getWidth()) / 2, 55, this.bj.getWidth(), this.bj.getHeight());
            com.xy.v.Class27.k(var22);
         } else {
            Map var19 = BaseValue.getProperty(var2, var3, var1);
            Class2.s(this.bf)[0].setText(((Integer)var19.get("气质")).toString());
            Class2.s(this.bf)[1].setText(((Integer)var19.get("内力")).toString());
            Class2.s(this.bf)[2].setText(((Integer)var19.get("智力")).toString());
            Class2.s(this.bf)[3].setText(((Integer)var19.get("耐力")).toString());
            Class2.s(this.bf)[4].setText(((Integer)var19.get("名气")).toString());
            Class2.s(this.bf)[5].setText(((Integer)var19.get("道德")).toString());
            Class2.s(this.bf)[6].setText(((Integer)var19.get("叛逆")).toString());
            Class2.s(this.bf)[7].setText(((Integer)var19.get("玩性")).toString());
            Class2.s(this.bf)[8].setText(var2.getQingmi().toString());
            Class2.s(this.bf)[9].setText(((Integer)var19.get("孝心")).toString());
            Class2.s(this.bf)[10].setText(var2.getWenbao().toString());
            Class2.s(this.bf)[11].setText(var2.getPilao().toString());
            Class2.s(this.bf)[12].setText(var2.getYangyujin().toString());
         }

         int var20;
         for (int var44 = var20 = 0; var44 < this.be.length; var44 = ++var20) {
            if (Class56.ale(this.be[var20]).il() == 2 && Class56.ale(this.be[var20]).ee() == var2.getBabyid().longValue()) {
               this.bb[0].setBounds(this.be[var20].getX() - 3, this.be[var20].getY() - 3, 52, 52);
               this.bb[0].setVisible(true);
               return;
            }
         }
      }
   }

   @Override
   public boolean ah() {
      this.aj(null);
      this.f();
      return super.ah();
   }

   public void ai(com.xy.q.Class54 var1) {
      RoleData var2;
      if ((var2 = this.yx()) != null) {
         Baby var3;
         if ((var3 = var2.getChoseBaby()) != null) {
            String var4;
            if ((var4 = var3.getOutcome()) != null && !var4.equals("")) {
               Goodstable var5;
               if ((var5 = var2.bk(new BigDecimal(615))) == null) {
                  this.afx.dp("你背包没有琼浆玉液");
               } else {
                  int var6 = -1;
                  int var7;
                  int var10000 = var7 = 3;

                  while (true) {
                     if (var10000 >= Class57.alf(this.bh).length) {
                        var10000 = var6;
                        break;
                     }

                     if (Class56.ale(Class57.alf(this.bh)[var7]) == var1) {
                        var10000 = var6 = var7 - 3;
                        break;
                     }

                     var10000 = ++var7;
                  }

                  if (var10000 != -1) {
                     StringBuilder var10 = new StringBuilder().append(var5.getRgid());
                     String var10002 = "Y";
                     var10 = var10.append("|").append(var3.getBabyid());
                     var10002 = "[";
                     String var8 = Agreement.getSendTextAES("userbaby", var10.append("|").append(var6).toString());
                     this.za().k(var8);
                  }
               }
            } else {
               this.afx.dp("成年后才能强化技能");
            }
         }
      }
   }

   public Class4(GameView var1) {
      super(1, 2, com.xy.q.Class30.afz, var1);
      this.yy(-2, 0, 582, 375, com.xy.q.Class30.agh);
      this.yu(com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false), "养育");
      this.bg = new com.xy.i.Class4[2];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.bg.length; var10000 = var2) {
         com.xy.i.Class4[] var6 = this.bg;
         int var10006 = 1 + var2;
         String var24;
         Class4 var10010;
         if (var2 == 0) {
            var24 = "属性";
            var10010 = this;
         } else if (var2 == 1) {
            var24 = "天资";
            var10010 = this;
         } else {
            var24 = "";
            var10010 = this;
         }

         com.xy.i.Class4 var10002 = new com.xy.i.Class4("sc/e/39.png", 2, var10006, com.xy.q.Class49.ck, null, var24, var10010);
         var6[var2] = var10002;
         this.bg[var2].setOffsetTexts(com.xy.q.Class49.bo);
         this.bg[var2].setBounds(323 + 65 * var2, 36, 63, 24);
         this.add(this.bg[var2++]);
      }

      this.be = new Class56[6];

      for (int var7 = var2 = 0; var7 < this.be.length; var7 = var2) {
         this.be[var2] = new Class56(this, 0, var2);
         this.be[var2].setBounds(54, 34 + var2 * 50, 46, 46);
         this.add(this.be[var2++]);
      }

      this.bc = new Class56[4];

      for (int var8 = var2 = 0; var8 < this.bc.length; var8 = var2) {
         this.bc[var2] = new Class56(this, 1, var2);
         this.bc[var2].setBounds(320 + var2 * 60, 278, 59, 57);
         this.add(this.bc[var2++]);
      }

      this.bd = com.xy.q.Class1.f(110, 35, 200, 20, 0, Color.YELLOW, com.xy.q.Class49.bx);
      this.add(this.bd);
      this.bj = new RichLabel("", com.xy.q.Class49.bx, 200);
      this.add(this.bj);
      this.bf = new Class2(this);
      this.bh = new Class57(this);
      this.bf.setBounds(318, 60, 240, 215);
      this.bh.setBounds(318, 60, 240, 215);
      this.add(this.bf);
      this.add(this.bh);
      this.bb = new com.xy.w.Class18[8];

      for (int var9 = var2 = 0; var9 < this.bb.length; var9 = var2) {
         this.bb[var2] = new com.xy.w.Class18();
         Class4 var10;
         String var10003;
         if (var2 == 0) {
            var10 = this;
            com.xy.w.Class18 var10001 = this.bb[var2];
            String var15 = "V}\nz\n-\u00120UpB";
            var10001.mt(com.xy.w.Class16.m("sc/d/37.png", 2, 2, 2, 2, false));
         } else if (var2 == 1) {
            var10 = this;
            this.bb[var2].setBounds(111, 35, 200, 300);
         } else if (var2 == 2) {
            var10 = this;
            com.xy.w.Class18 var16 = this.bb[var2];
            var10003 = "T\t\b\u000e\bX\u0013DW\u0004@";
            var16.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
            this.bb[var2].setBounds(109, 33, 204, 304);
         } else if (var2 >= 3 && var2 <= 6) {
            var10 = this;
            com.xy.w.Class18 var18 = this.bb[var2];
            var10003 = "V}\nz\n-\u00150UpB";
            var18.dp("sc/d/30.png");
            this.bb[var2].setBounds(321 + (var2 - 3) * 60, 335, 58, 1);
         } else {
            if (var2 == 7) {
               com.xy.w.Class18 var11 = this.bb[var2];
               String var17 = "T\t\b\u000e\bY\u0011DW\u0004@";
               var11.mt(com.xy.w.Class16.m("sc/d/36.png", 30, 30, 30, 30, false));
               this.bb[var2].setBounds(318, 60, 240, 215);
            }

            var10 = this;
         }

         var10.add(this.bb[var2++]);
      }

      this.y(1);
   }

   public void aj(Baby var1) {
      RoleData var2;
      if ((var2 = this.yx()) != null) {
         var2.setChoseBabyId(var1 != null ? var1.getBabyid() : null);
      }

      this.bi = true;
   }

   public void g(int var1) {
      RoleData var2;
      if ((var2 = this.yx()) != null) {
         Baby var3;
         if ((var3 = var2.getChoseBaby()) != null) {
            if (var1 == 3) {
               String var6;
               if (com.xy.v.Class12.h(var6 = Class2.r(this.bf).getText().trim()) || com.xy.v.Class12.am(var3.getBabyname(), var6)) {
                  this.afx._do("请输入孩子的新名称");
               } else if (var6.length() > 9) {
                  this.afx._do("名称太长");
               } else if (!com.xy.v.Class0.j(var6)) {
                  this.afx.dp("修改后的名字不能有特殊符号");
               } else if (!com.xy.v.Class0.b(var6)) {
                  this.afx.dp("名称中包含非法字符！！");
               } else {
                  var3.setBabyname(var6);
                  ParamTool.c(var3, this.za());
                  this.afx.dp("孩子名称修改成功");
               }
            } else {
               if (var1 == 5) {
                  BigDecimal var4;
                  if ((var4 = var2.getLoginResult().getBabyId()) == null || var4.compareTo(var3.getBabyid()) != 0) {
                     Class2.q(this.bf)[2].setText("待机");
                     var2.getLoginResult().setBabyId(var3.getBabyid());
                     String var7 = Agreement.getSendTextAES("rolechange", "B" + var3.getBabyid());
                     this.za().k(var7);
                     var2.getRoleProperty().s(var3);
                     return;
                  }

                  Class2.q(this.bf)[2].setText("参战");
                  var2.getLoginResult().setBabyId(null);
                  String var5 = Agreement.getSendTextAES("rolechange", "B");
                  this.za().k(var5);
                  var2.getRoleProperty().s(null);
               }
            }
         }
      }
   }

   public void ak(com.xy.q.Class54 var1) {
      RoleData var2;
      if ((var2 = this.yx()) != null) {
         Baby var3;
         if ((var3 = var2.getChoseBaby()) != null) {
            int var4 = -1;
            int var5;
            int var10000 = var5 = 0;

            while (true) {
               if (var10000 >= this.bc.length) {
                  var10000 = var4;
                  break;
               }

               if (Class56.ale(this.bc[var5]) == var1) {
                  var10000 = var4 = var5;
                  break;
               }

               var10000 = ++var5;
            }

            if (var10000 != -1) {
               if (this.za().gameBaby) {
                  Goodstable var7 = (Goodstable)var1.jx();
                  StringBuilder var10001 = new StringBuilder().append(var7.getRgid());
                  String var10002 = "Y";
                  String var6 = Agreement.getSendTextAES("userbaby", var10001.append("|").append(var3.getBabyid()).toString());
                  this.za().k(var6);
               } else {
                  if (HandleEquip.c(var2, var3, null, var4)) {
                     this.aj(var3);
                  }
               }
            }
         }
      }
   }

   public Baby al() {
      RoleData var1;
      return (var1 = this.yx()) == null ? null : var1.getChoseBaby();
   }

   @Override
   protected void paintComponent(Graphics var1) {
      if (this.bi) {
         this.f();
         this.bi = false;
      }

      super.paintComponent(var1);
   }

   public void h() {
      com.xy.w.Class18 var10001 = this.bb[0];
      int var10000 = 0;
      var10001.setVisible(false);

      for (int var1 = 0; var10000 < this.be.length; var10000 = var1) {
         com.xy.q.Class54 var6 = Class56.ale(this.be[var1]);
         var1++;
         var6.gs(0, null);
      }

      RoleData var5;
      if ((var5 = this.yx()) != null) {
         List var2 = var5.getBabys();

         int var3;
         for (int var7 = var3 = 0; var7 < var2.size() && var3 < this.be.length; var7 = var3) {
            Baby var4 = (Baby)var2.get(var3);
            com.xy.q.Class54 var8 = Class56.ale(this.be[var3]);
            var3++;
            var8.gs(2, var4);
         }

         this.aj(var2.size() > 0 ? (Baby)var2.get(0) : null);
      }
   }

   @Override
   public void l() {
      this.h();
      super.l();
   }
}
