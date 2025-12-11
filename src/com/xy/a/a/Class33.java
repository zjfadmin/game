package com.xy.a.a;

import com.xy.bean.ConfirmBean;
import com.xy.entity.Lingbao;
import com.xy.formula.ExpUtil;
import com.xy.formula.PropertyUtil;
import com.xy.game.HandleLingbao;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.text.GameView;
import java.awt.Font;
import java.math.BigDecimal;
import javax.swing.JLabel;

public class Class33 extends com.xy.q.Class30 {
   private Class59 aiz;
   private com.xy.w.Class18[] sk;
   private com.xy.q.Class7 aja;
   private com.xy.q.Class7 ajb;
   private Class51 ajc;
   private com.xy.i.Class7 ajd;
   private com.xy.i.Class7 km;
   private JLabel[] au;

   public void y(int var1) {
      RoleData var2;
      if ((var2 = this.yx()) != null) {
         Lingbao var3;
         if ((var3 = var2.getChoseBao()) != null) {
            if (var1 == 21) {
               String var11 = var3.getBaotype();
               String var14 = "沱寍";
               if (var11.equals("法宝")) {
                  var14 = "么肺剥阣沐寚";
                  this.afx._do("不能删除法宝");
               } else if (!com.xy.v.Class12.h(var3.getFushis())) {
                  var14 = "剄阴利儘匜乛筂瞣";
                  this.afx._do("删除前先卸下符石");
               } else {
                  GameView var12 = this.afx;
                  String var17 = var3.getBaoid().toString();
                  String var18 = "d\u001c砩察视屃订瀰寚剥阣呒ｘｚｘ";
                  var12.dm(new ConfirmBean(8, var17, "#Y确定要将该灵宝删除吗？？？"));
               }
            } else if (var1 == 22) {
               int var4 = var3.getLingbaolvl().intValue();
               long var5 = var3.getLingbaoexe().longValue();
               long var7 = ExpUtil.a(var4);
               if (var4 % 30 == 0 && var5 >= var7 && var4 != 0) {
                  StringBuffer var9;
                  StringBuffer var10 = var9 = new StringBuffer();
                  String var13 = "f\u001e伥晨呣视淍聐f\u0015";
                  var10.append("#Y你是否要消耗#R");
                  var9.append(var4 / 5);
                  String var10003 = "G\t乎瀥对她婥匠辿蠜童硤";
                  var9.append("#Y个灵宝天威印进行突破");
                  this.afx.dm(new ConfirmBean(9, var3.getBaoid().toString(), var9.toString()));
               } else {
                  String var10001 = "込杺迚剠童硤朅亦";
                  this.afx._do("还未达到突破条件");
               }
            } else {
               if (var1 == 23) {
                  GameView var10000 = this.afx;
                  String var10004 = var3.getBaoid().toString();
                  String var10005 = "d\u001c砩察视屃苶egf\u0000wwuwuwed\u001c钱乡雈板瀲寘阃勥拐恢呐zx";
                  var10000.dm(new ConfirmBean(10, var10004, "#Y确定要将花  #G200000 #Y银两随机灵宝附加抗性吗??"));
               }
            }
         }
      }
   }

   public void acb(Lingbao var1) {
      if (this.ajc.isVisible()) {
         this.yx().h(var1.getBaoid(), 0);
      } else {
         this.cq(var1);
      }
   }

   public void cq(Lingbao var1) {
      RoleData var2;
      if ((var2 = this.yx()) == null) {
         this.h();
      } else {
         var2.setChoseBaoId(var1 != null ? var1.getBaoid() : null);
         if (var1 == null) {
            this.h();
         } else {
            Class59.alu(this.aiz).gt(com.xy.w.Class15.b(var1.getSkin()));
            Class59.alt(this.aiz)[0].setText(var1.getBaoname());
            Class59.alt(this.aiz)[8].setText(var1.getBaoquality());
            com.xy.q.Class14 var10002 = Class59.alv(this.aiz)[0];
            StringBuilder var10003 = new StringBuilder().append(var1.getLingbaolvl());
            String var10004 = "绠";
            var10002.setText(var10003.append("级").toString());
            Class59.alv(this.aiz)[1].setText(var1.getKangxing());
            Class59.aly(this.aiz)[1].ant(var1.getLingbaoexe().doubleValue() / ExpUtil.a(var1.getLingbaolvl().intValue()), 98);
            String var10000 = var1.getBaotype();
            String var10001 = "沱寍";
            if (var10000.equals("法宝")) {
               int var15 = 0;
               Class59.alw(this.aiz).setTextSize(null, 200);

               for (int var7 = 0; var15 < Class59.alx(this.aiz).length; var15 = var7) {
                  com.xy.q.Class54 var16 = Class59.alx(this.aiz)[var7];
                  var7++;
                  var16.gs(0, null);
               }
            } else {
               Class59.alw(this.aiz).setTextSize(PropertyUtil.getBaoString(var1, var2, 200), 200);
               String[] var10;
               if (!com.xy.v.Class12.h(var1.getFushis())) {
                  var10000 = var1.getFushis();
                  var10001 = "\u0019;";
                  var10 = var10000.split("\\|");
               } else {
                  var10 = null;
               }

               String[] var3 = var10;

               int var4;
               for (int var11 = var4 = 0; var11 < 5; var11 = ++var4) {
                  Goodstable var5;
                  if (var3 != null && var4 < var3.length && (var5 = var2.getGoodEquip(new BigDecimal(var3[var4]))) != null) {
                     Class59.alx(this.aiz)[var4].gs(1, var5);
                  } else if (var4 >= var1.getFusum()) {
                     Class59.alx(this.aiz)[var4].gs(6, 1);
                  } else {
                     Class59.alx(this.aiz)[var4].gs(0, null);
                  }
               }

               String[] var13;
               if (!com.xy.v.Class12.h(var1.getSkills())) {
                  var10000 = var1.getSkills();
                  var10001 = "8,";
                  var13 = var10000.split("\\|");
               } else {
                  var13 = null;
               }

               var3 = var13;

               for (int var14 = var4 = 0; var14 < 5; var14 = ++var4) {
                  if (var3 != null && var4 < var3.length) {
                     Class59.alx(this.aiz)[5 + var4].gs(7, var3[var4]);
                  } else if (var4 >= var1.getSkillsum()) {
                     Class59.alx(this.aiz)[5 + var4].gs(6, 2);
                  } else {
                     Class59.alx(this.aiz)[5 + var4].gs(0, null);
                  }
               }
            }
         }
      }
   }

   public void h() {
      int var10000 = 0;
      this.sk[1].setVisible(false);
      Class59.alu(this.aiz).l();
      Class59.alt(this.aiz)[0].setText(null);
      Class59.alt(this.aiz)[8].setText(null);
      Class59.alv(this.aiz)[0].setText(null);
      Class59.alv(this.aiz)[1].setText(null);
      Class59.aly(this.aiz)[1].ant(0.0, 98);

      for (int var1 = 0; var10000 < Class59.alx(this.aiz).length; var10000 = var1) {
         com.xy.q.Class54 var2 = Class59.alx(this.aiz)[var1];
         var1++;
         var2.gs(0, null);
      }

      Class59.alw(this.aiz).setTextSize(null, 200);
   }

   @Override
   public void l() {
      if (this.yx() != null) {
         this.g(1);
         super.l();
      }
   }

   public Class33(GameView var1) {
      super(43, 2, com.xy.q.Class30.afz, var1);
      String var10002 = "6$j#jvk7+ ";
      this.yy(-2, 0, 542, 475, com.xy.q.Class30.agh);
      com.xy.w.Class9 var20 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10003 = "p瀑p对p";
      this.yu(var20, " 灵 宝 ");
      var10003 = "4&h hqvk7+ ";
      Font var10006 = com.xy.q.Class49.k;
      String[] var10008 = new String[4];
      String var10011 = "瀥";
      var10008[0] = "灵";
      var10011 = "寚";
      var10008[1] = "宝";
      var10011 = "袕";
      var10008[2] = "装";
      var10011 = "奀";
      var10008[3] = "备";
      this.ajd = new com.xy.i.Class7("sc/e/41.png", 2, 1, var10006, null, var10008, this);
      var10003 = "#\u0007\u007f\u0001\u007fPaJ \n7";
      var10006 = com.xy.q.Class49.k;
      var10008 = new String[4];
      var10011 = "瀲";
      var10008[0] = "灵";
      var10011 = "寍";
      var10008[1] = "宝";
      var10011 = "尙";
      var10008[2] = "属";
      var10011 = "恷";
      var10008[3] = "性";
      this.km = new com.xy.i.Class7("sc/e/41.png", 2, 2, var10006, null, var10008, this);
      this.ajd.wp(new com.xy.v.Class32(6, 19, 0, 18));
      this.km.wp(new com.xy.v.Class32(6, 19, 0, 18));
      this.ajd.setBounds(42, 40, 30, 80);
      this.km.setBounds(42, 121, 30, 80);
      this.ajd.ne(com.xy.q.Class49.d);
      this.km.ne(com.xy.q.Class49.d);
      this.add(this.ajd);
      this.add(this.km);
      this.ajc = new Class51(this);
      this.ajc.setBounds(72, 35, 440, 295);
      this.add(this.ajc);
      this.aiz = new Class59(this);
      this.aiz.setBounds(72, 35, 440, 295);
      this.add(this.aiz);
      this.sk = new com.xy.w.Class18[5];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.sk.length; var10000 = var2) {
         this.sk[var2] = new com.xy.w.Class18();
         Class33 var7;
         if (var2 == 0) {
            var7 = this;
            com.xy.w.Class18 var21 = this.sk[var2];
            var10003 = "4&h!hqvk7+ ";
            var21.dp("sc/d/41.png");
            this.sk[var2].setBounds(166, 9, 247, 41);
         } else if (var2 == 1) {
            var7 = this;
            com.xy.w.Class18 var10001 = this.sk[var2];
            var10002 = "#\u0007\u007f\u0000\u007fWgJ \n7";
            var10001.dp("sc/d/37.png");
         } else if (var2 != 2 && var2 != 3) {
            if (var2 == 4) {
               com.xy.w.Class18 var12 = this.sk[var2];
               var10002 = "#\u0007\u007f\u0000\u007fWfJ \n7";
               var12.mt(com.xy.w.Class16.m("sc/d/36.png", 30, 30, 30, 30, false));
               this.sk[var2].setBounds(72, 35, 440, 295);
            }

            var7 = this;
         } else {
            var7 = this;
            com.xy.w.Class18 var23 = this.sk[var2];
            var10003 = "4&h!ht~k7+ ";
            var23.mt(com.xy.w.Class16.m("sc/d/19.png", 5, 5, 5, 5, false));
            this.sk[var2].setBounds(71 + (var2 - 2) * 233, 329, 207, 105);
         }

         var7.add(this.sk[var2++]);
      }

      this.au = new JLabel[14];

      for (int var8 = var2 = 0; var8 < this.au.length; var8 = var2) {
         int var31 = 50 + var2 % 2 * 234;
         int var10004 = 358 + var2 / 2 * 29;
         String var42 = "f$uwuwuw";
         this.au[var2] = com.xy.q.Class1.f(var31, var10004, 20, 20, 0, com.xy.q.Class49.c("#c000000"), com.xy.q.Class49.ch);
         JLabel var9 = this.au[var2];
         String var14;
         if (var2 == 0) {
            var14 = "瀥";
            var14 = "灵";
         } else if (var2 == 1) {
            var14 = "沒";
            var14 = "法";
         } else if (var2 == 2) {
            var14 = "寍";
            var14 = "宝";
         } else if (var2 == 3) {
            var14 = "寚";
            var14 = "宝";
         } else {
            var14 = "";
         }

         var9.setText(var14);
         this.add(this.au[var2++]);
      }

      com.xy.i.Class3[] var6 = new com.xy.i.Class3[2];
      com.xy.i.Class3[] var3 = new com.xy.i.Class3[2];

      int var4;
      for (int var10 = var4 = 0; var10 < var6.length; var10 = var4) {
         String var34;
         if (var4 == 0) {
            var34 = "#\u0007\u007f\u0001\u007fPbJ \n7";
            var34 = "sc/e/42.png";
         } else {
            var34 = "4&h hqtk7+ ";
            var34 = "sc/e/43.png";
         }

         com.xy.i.Class3 var18 = new com.xy.i.Class3(var34, 1, var4, this);
         var6[var4] = var18;
         if (var4 == 0) {
            var34 = "#\u0007\u007f\u0001\u007fPbJ \n7";
            var34 = "sc/e/42.png";
         } else {
            var34 = "4&h hqtk7+ ";
            var34 = "sc/e/43.png";
         }

         var18 = new com.xy.i.Class3(var34, 1, var4, this);
         var3[var4] = var18;
         Class33 var11;
         if (var4 == 0) {
            var6[var4].setBounds(238, 435, 18, 18);
            var11 = this;
            var3[var4].setBounds(471, 435, 18, 18);
         } else {
            var6[var4].setBounds(260, 435, 18, 18);
            var11 = this;
            var3[var4].setBounds(493, 435, 18, 18);
         }

         var11.add(var6[var4]);
         this.add(var3[var4++]);
      }

      this.aja = new com.xy.q.Class7(true, this, 4, 2, 51, 51, 0, 0, 72, 331);
      String var39 = "#\u0007\u007f\u0000\u007fUhJ \n7";
      this.aja.gt(com.xy.w.Class16.c("sc/d/18.png"));
      this.aja.vr(var6, 1);
      this.add(this.aja);
      this.ajb = new com.xy.q.Class7(false, this, 4, 2, 51, 51, 0, 0, 305, 331);
      String var10005 = "4&h!ht\u007fk7+ ";
      this.ajb.gt(com.xy.w.Class16.c("sc/d/18.png"));
      this.ajb.vr(var3, 1);
      this.add(this.ajb);
   }

   public void ak(com.xy.q.Class54 var1) {
      RoleData var2;
      if ((var2 = this.yx()) != null) {
         Lingbao var3;
         if ((var3 = var2.getChoseBao()) != null) {
            String var10000 = var3.getBaotype();
            String var10001 = "沱寍";
            if (!var10000.equals("法宝")) {
               if (var1.il() == 6 && var1.ee() == 1L) {
                  int var5;
                  if ((var5 = var3.b(4)) != -1) {
                     GameView var12 = this.afx;
                     String var25 = var3.getBaoid().toString();
                     String var46 = "f\u001e砫寝规屁苴d\u0002g";
                     StringBuilder var35 = new StringBuilder("#Y确定要将花#G ").append(var5 * 8);
                     String var42 = "pG\t乎瀥对她婥匠彤呿筈s#p";
                     var35 = var35.append(" #Y个灵宝天威印开启第#G ").append(var5);
                     var42 = "ed\u001c乭筣瞴桹嬗呒x";
                     var12.dm(new ConfirmBean(5, var25, var35.append(" #Y个符石格子吗?").toString()));
                  }
               } else if (var1.il() == 6 && var1.ee() == 2L) {
                  int var4;
                  if ((var4 = var3.a(4)) != -1) {
                     if ((var4 - 2) * 30 + 1 > var3.getLingbaolvl().intValue()) {
                        GameView var11 = this.afx;
                        String var10003 = "靤觑笭绷奃仞";
                        StringBuilder var16 = new StringBuilder("需要等级大于").append((var4 - 2) * 30 + 1);
                        String var10002 = "戈肺彅周";
                        StringBuilder var17 = var16.append("才能开启").append(var4);
                        var10002 = "乺拤肭桘嬀";
                        var11._do(var17.append("个技能格子").toString());
                     } else {
                        if (var4 >= 4) {
                           var10000 = var3.getBaoquality();
                           var10001 = "斥亰";
                           if (!var10000.equals("无价")) {
                              var10000 = var3.getBaoquality();
                              var10001 = "佄乆";
                              if (!var10000.equals("传世")) {
                                 var10001 = "瀰寚咄赯靅视晪斧亲扑聀佧乓戊肸彇呪筫q哋p盃担肺桹嬗";
                                 this.afx._do("灵宝品质需要是无价或者传世才能开启第4和5的技能格子");
                                 return;
                              }
                           }
                        }

                        GameView var10 = this.afx;
                        String var24 = var3.getBaoid().toString();
                        String var45 = "G\t砊寊觥屖苕s#p";
                        StringBuilder var33 = new StringBuilder("#Y确定要将花#G ").append(var4 * 8);
                        String var40 = "gf\u001e乯瀲寘奮婄匷彅周筩d\u0002g";
                        var33 = var33.append(" #Y个灵宝天威印开启第#G ").append(var4);
                        var40 = "Ds=乺拤肭桘嬀味o";
                        var10.dm(new ConfirmBean(6, var24, var33.append(" #Y个技能格子吗?").toString()));
                     }
                  }
               } else if (var1.il() == 1) {
                  HandleLingbao.c(new BigDecimal(var1.ee()), var3, var2);
               } else {
                  if (var1.il() == 7) {
                     if (this.za().l(2, 12)) {
                        GameView var7 = this.afx;
                        StringBuilder var21 = new StringBuilder(String.valueOf(var3.getBaoid().toString()));
                        String var29 = ";";
                        var21 = var21.append("|").append(var1.jx());
                        var29 = "m";
                        String var23 = var21.append("=").append(var1.ee()).toString();
                        String var44 = "f\u001e砫寝规苶ed\u0002vuwuwud\u001c钱乡剧阡gf\u0000";
                        StringBuilder var31 = new StringBuilder("#Y确定要花 #G100000#Y银两删除 #G").append(var1.jx());
                        String var38 = "\u3040";
                        StringBuilder var32 = var31.append("【").append(var1.ee());
                        var38 = "仿呏担ざ";
                        var7.dm(new ConfirmBean(7, var23, var32.append("人合技】").toString()));
                        return;
                     }

                     GameView var6 = this.afx;
                     StringBuilder var10004 = new StringBuilder(String.valueOf(var3.getBaoid().toString()));
                     String var10005 = ",";
                     var10004 = var10004.append("|").append(var1.jx());
                     var10005 = "z";
                     String var20 = var10004.append("=").append(var1.ee()).toString();
                     String var10007 = "G\t砊寊觥苡Ds#hT`T`Ts=钦乀剰阀pG\u0017";
                     StringBuilder var27 = new StringBuilder("#Y确定要花 #G800000#Y银两删除 #G").append(var1.jx());
                     String var10006 = "し";
                     StringBuilder var28 = var27.append("【").append(var1.ee());
                     var10006 = "仞员拤ぁ";
                     var6.dm(new ConfirmBean(7, var20, var28.append("人合技】").toString()));
                  }
               }
            }
         }
      }
   }

   public void g(int var1) {
      this.ajd.be(var1 == 1);
      this.km.be(var1 == 2);
      this.sk[1].setVisible(false);
      this.ajc.setVisible(var1 == 1);
      Class33 var10000;
      if (var1 == 1) {
         var10000 = this;
         this.cq(null);
      } else {
         if (var1 == 2) {
            this.cq(this.yx().getLingbao(this.yx().lingbaoChoses[0]));
         }

         var10000 = this;
      }

      var10000.aiz.setVisible(var1 == 2);
   }

   @Override
   public boolean ah() {
      this.cq(null);
      return super.ah();
   }
}
