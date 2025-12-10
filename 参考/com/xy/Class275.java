package com.xy;

import com.xy.battle.BattleControl;
import com.xy.battle.TypeState;
import com.xy.entity.Lingbao;
import com.xy.entity.RoleSummoning;
import com.xy.formula.PetProperty;
import com.xy.formula.PropertyUtil;
import com.xy.game.RoleData;
import com.xy.game.RolePet;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class Class275 extends Class345 {
   private Class436 ts;
   private Class600[] azy;
   private JScrollPane ea;
   private Class600[] azz;
   private Class436[] il;
   private Class248 aa;
   private Class19 ue;
   private Class612 baa;
   private int bn;
   private Class245[] cj;
   private JLabel[] u;

   public void d() {
      int var1;
      for(int var10000 = var1 = 3 >> 2; var10000 < this.cj.length; var10000 = var1) {
         this.cj[var1++].setText((String)null);
      }

      this.ue = null;
   }

   public Class275(GameView var1) {
      int var10001 = 1 ^ 3;
      int var10005 = -4 >> 2;
      super(6388 & 26571, 5 >> 1, Class345.aef, var1);
      this.va(var10005, 3 >> 2, 27102 & 6125, 12915 & 20398, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 95 & 100, 95 & 100, 95 & 100, 95 & 100, (boolean)(3 >> 2)), "召唤");
      Class600[] var4 = new Class600[var10001];
      boolean var10003 = true;
      this.azz = var4;

      int var2;
      Class600[] var3;
      int var10000;
      int var10006;
      Font var10007;
      String var10009;
      Class275 var10010;
      for(var10000 = var2 = 3 ^ 3; var10000 < this.azz.length; var10000 = var2) {
         var3 = this.azz;
         Class600 var10002 = new Class600;
         var10005 = --2;
         var10006 = (111 & 117) + var2;
         var10007 = Class681.cf;
         Color[] var10008 = Class681.c;
         if (var2 == 0) {
            var10009 = "召唤兽";
            var10010 = this;
         } else if (var2 == (2 ^ 3)) {
            var10009 = "灵 宝";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var10002.<init>("sc/e/38.png", var10005, var10006, var10007, var10008, var10009, var10010);
         var3[var2] = var10002;
         this.azz[var2].setOffsetTexts(Class681.bv);
         this.azz[var2].setBounds((46 & 127) + (118 & 111) * var2, 94 & 59, 95 & 127, 57 & 103);
         this.add(this.azz[var2++]);
      }

      var10001 = 25 & 110;
      this.ts = new Class436();
      this.ts.eq(Class511.q("sc/d/35.png", 91 & 116, 126 & 11, 91 & 116, 15 & 122, (boolean)(3 ^ 3)));
      this.ts.setBounds(63 & 106, 46 & 121, this.getWidth() - 62, 20);
      this.add(this.ts);
      this.aa = new Class248(this);
      this.aa.setBounds(2 & 5, 2 & 5, 150, 20);
      this.baa = new Class612(this);
      this.baa.setBounds(3 >> 2, 3 >> 2, 150, 20);
      this.ea = Class133.f(49, 83, 194, 415, this.aa, 20);
      this.add(this.ea);
      JLabel[] var5 = new JLabel[var10001];
      var10003 = true;
      this.u = var5;

      for(var10000 = var2 = 5 >> 3; var10000 < this.u.length; var10000 = var2) {
         this.u[var2] = Class133.c(40, 146, 130, 18, --4, Color.black, Class681.ak);
         this.u[var2].setText(var2 == 0 ? "名称" : (var2 == --1 ? "等级" : (var2 == (1 ^ 3) ? "亲密" : (var2 == --3 ? "气血" : (var2 == --4 ? "法力" : (var2 == --5 ? "攻击" : (var2 == 6 ? "速度" : (var2 == 7 ? "禅定" : ""))))))));
         this.u[var2].setBounds(239, 306 + var2 * 25, 60, 20);
         this.add(this.u[var2++]);
      }

      Class245[] var6 = new Class245[8];
      var10003 = true;
      this.cj = var6;

      for(var10000 = var2 = 3 >> 2; var10000 < this.cj.length; var10000 = var2) {
         this.cj[var2] = Class133.a(3 >> 2, 3 >> 2, 3 >> 2, 3 >> 2, 10, Color.white, Class681.bx);
         this.cj[var2].eq(Class511.q("sc/d/17.png", --3, --3, --3, --3, (boolean)(3 >> 2)));
         this.cj[var2].setBounds(302, 306 + var2 * 25, 134, 20);
         this.add(this.cj[var2++]);
      }

      var4 = new Class600[1 ^ 3];
      var10003 = true;
      this.azy = var4;

      Class275 var9;
      for(var10000 = var2 = 3 & 4; var10000 < this.azy.length; var10000 = var2) {
         var3 = this.azy;
         Class600 var8 = new Class600;
         String var10004 = var2 == 0 ? "sc/e/6.png" : "sc/e/7.png";
         var10006 = 103 + var2;
         var10007 = Class681.bm;
         if (var2 == 0) {
            var10009 = "抗性";
            var10010 = this;
         } else if (var2 == --1) {
            var10009 = "召唤";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var8.<init>(var10004, 1, var10006, var10007, (Color[])null, var10009, var10010);
         var3[var2] = var8;
         if (var2 == 0) {
            var9 = this;
            this.azy[var2].setBounds(402, 508, 34, 18);
         } else {
            if (var2 == --1) {
               this.azy[var2].setFont(Class681.ak);
               this.azy[var2].setForeground(Color.black);
               this.azy[var2].setBounds(315, 505, 59, 25);
            }

            var9 = this;
         }

         var9.add(this.azy[var2++]);
      }

      Class436[] var10 = new Class436[--3];
      var10003 = true;
      this.il = var10;

      for(var10000 = var2 = 3 & 4; var10000 < this.il.length; var10000 = var2) {
         this.il[var2] = new Class436();
         if (var2 == 0) {
            var9 = this;
            this.il[var2].eq(Class511.q("sc/d/25.png", 5 >> 1, 5 >> 1, 5 >> 1, 5 >> 1, (boolean)(3 ^ 3)));
            this.il[var2].setBounds(49, 62, 194, 21);
         } else if (var2 == --1) {
            var9 = this;
            this.il[var2].eq(Class511.q("sc/d/24.png", --2, --2, --2, --2, (boolean)(5 >> 3)));
            this.il[var2].setBounds(49, 62, 194, 435);
         } else {
            if (var2 == 5 >> 1) {
               this.il[var2].eq(Class511.q("sc/d/16.png", 5 >> 1, 5 >> 1, 5 >> 1, 5 >> 1, (boolean)(3 ^ 3)));
               this.il[var2].setBounds(249, 62, 192, 240);
            }

            var9 = this;
         }

         var9.add(this.il[var2++]);
      }

   }

   public void as(int var1) {
      int var10000 = 3 >> 2;
      this.bn = var1;

      for(var1 = var10000; var10000 < this.azz.length; var10000 = var1) {
         this.azz[var1].setKeep((boolean)(var1 == this.bn ? 5 >> 2 : 0));
         ++var1;
      }

      if (this.bn == 0) {
         for(var10000 = var1 = 3 >> 2; var10000 < this.u.length; var10000 = var1) {
            this.u[var1].setText(var1 == 0 ? "名称" : (var1 == 5 >> 2 ? "等级" : (var1 == 5 >> 1 ? "亲密" : (var1 == --3 ? "气血" : (var1 == --4 ? "法力" : (var1 == --5 ? "攻击" : (var1 == (22 & 111) ? "速度" : (var1 == (31 & 103) ? "禅定" : ""))))))));
            ++var1;
         }

         this.azy[3 ^ 3].setText("抗性");
         this.w(this.vd().getRolePet(this.aa.gl()));
         this.ea.setViewportView(this.aa);
      } else {
         if (this.bn == (3 & 5)) {
            for(var10000 = var1 = 5 >> 3; var10000 < this.u.length; var10000 = var1) {
               this.u[var1].setText(var1 == 0 ? "名称" : (var1 == 3 >> 1 ? "等级" : (var1 == --2 ? "品质" : (var1 == --3 ? "契合" : (var1 == --4 ? "活跃度" : (var1 == --5 ? "伤害" : (var1 == (62 & 71) ? "速度" : (var1 == (71 & 63) ? "抗落宝" : ""))))))));
               ++var1;
            }

            this.azy[3 ^ 3].setText("属性");
            this.fn(this.vd().getLingbao(new BigDecimal(this.baa.gl())));
            this.ea.setViewportView(this.baa);
         }

      }
   }

   public void fn(Lingbao var1) {
      if (this.bn == --1) {
         RoleData var2 = this.vd();
         if (var1 == null) {
            this.d();
         } else {
            Map var3 = PropertyUtil.getBaoMap(var1, var2);
            this.cj[5 >> 3].setText(var1.getBaoname());
            this.cj[3 >> 1].setText(var1.getLingbaolvl() + "级");
            this.cj[5 >> 1].setText(var1.getBaoquality());
            this.cj[--3].setText(((Double)var3.get("契合度")).toString());
            this.cj[--4].setText(((Double)var3.get("活跃")).toString());
            Class275 var10000;
            if (var1.getBaotype().equals("攻击")) {
               this.u[--5].setText("伤害");
               this.cj[--5].setText(Class394.ak((Double)var3.get("伤害") * 100.0D, --1));
               var10000 = this;
            } else if (var1.getBaotype().equals("辅助")) {
               this.u[--5].setText("回复");
               this.cj[--5].setText(Class394.ak((Double)var3.get("回复") * 100.0D, 3 & 5));
               var10000 = this;
            } else {
               this.u[--5].setText("落宝");
               this.cj[--5].setText(Class394.ak((Double)var3.get("落宝") * 100.0D, 2 ^ 3));
               var10000 = this;
            }

            var10000.cj[86 & 47].setText(((Double)var3.get("速度")).toString());
            this.cj[127 & 7].setText(Class394.ak((Double)var3.get("抗落宝") * 100.0D, 3 >> 1));
            this.ue = Class330.f(var1.getSkin(), 127 & 7, 4 ^ 5, (String)null);
         }
      }
   }

   public void q() {
      int var10002 = 3 & 4;
      this.bn = -4 >> 2;
      this.aa.cc();
      this.aa.q();
      this.baa.cc();
      this.baa.q();
      this.as(var10002);
      super.q();
   }

   protected void paintChildren(Graphics var1) {
      super.paintChildren(var1);
      if (this.ue != null) {
         this.ue.a(var1, 23422 & 9695, 26958 & 6079, 3 & 4, Class280.l());
      }

   }

   public void y(int var1) {
      int var10000;
      int var2;
      Class514 var3;
      List var4;
      if (this.bn == 0) {
         if (this.aej.getBattleScene() == null) {
            return;
         }

         RolePet var8;
         if ((var8 = this.vd().getRolePet(this.aa.gl())) == null) {
            return;
         }

         if (var1 == (111 & 119)) {
            ((Class207)this.ve().e(24 & 111)).aoo(PropertyUtil.getPetQl(var8.getPet(), this.vd()), 3 >> 1, var8.getId());
            return;
         }

         if (var1 == (125 & 106)) {
            if ((var3 = this.aej.getBattleControl().getHandleUnit()) != null && var3.bt().getType() == 0) {
               var4 = var3.bt().g("召唤兽");

               for(var10000 = var2 = 3 ^ 3; var10000 < var4.size(); var10000 = var2) {
                  if (((TypeState)var4.get(var2)).getState() == 0 && var8.getId().longValue() == (long)Integer.parseInt(((TypeState)var4.get(var2)).getType())) {
                     BattleControl var6 = this.aej.getBattleControl();
                     var6.c(Class600.acq("召唤&" + ((TypeState)var4.get(var2)).getType(), var3, var6));
                     var3.i((boolean)(3 & 5));
                     var6.m();
                     this.ve().n(110 & 23);
                     this.ve().n(31937 & 1022);
                     return;
                  }

                  ++var2;
               }

               this.aej.f("这只召唤兽无法召唤");
               return;
            }

            return;
         }
      } else if (this.bn == (3 & 5)) {
         if (this.aej.getBattleScene() == null) {
            return;
         }

         Lingbao var5;
         if ((var5 = this.vd().getLingbao(new BigDecimal(this.baa.gl()))) == null) {
            return;
         }

         if (var1 == (127 & 103)) {
            ((Class73)this.ve().e(111 & 61)).ge(var5, (boolean)(2 ^ 3));
            return;
         }

         if (var1 == (109 & 122)) {
            if ((var3 = this.aej.getBattleControl().getHandleUnit()) == null || var3.bt().getType() != 0) {
               return;
            }

            var4 = var3.bt().g("灵宝");

            for(var10000 = var2 = 2 & 5; var10000 < var4.size(); var10000 = var2) {
               if (((TypeState)var4.get(var2)).getState() != 0 && var5.getBaoid().longValue() == (long)Integer.parseInt(((TypeState)var4.get(var2)).getType())) {
                  this.aej.f("这只灵宝无法召唤");
                  return;
               }

               ++var2;
            }

            BattleControl var7 = this.aej.getBattleControl();
            int var10004 = --1;
            var7.c(Class600.acq("灵宝召唤&" + var5.getBaoid(), var3, var7));
            var3.i((boolean)var10004);
            var7.m();
            this.ve().n(47 & 86);
            this.ve().n(17615 & 15344);
         }
      }

   }

   public void w(RolePet var1) {
      if (this.bn == 0) {
         RoleData var2 = this.vd();
         if (var1 == null) {
            this.d();
         } else {
            RoleSummoning var3;
            int[] var4 = PetProperty.getPetHMASp(var3 = var1.getPet(), var2);
            this.cj[5 >> 3].setText(var3.getSummoningname());
            this.cj[2 ^ 3].setText(Class224.t(var3.getGrade()) + "级");
            this.cj[5 >> 1].setText(var3.getFriendliness().toString());
            this.cj[--3].setText(var3.getBasishp(var4[5 >> 3]) + "/" + var4[2 & 5]);
            this.cj[--4].setText(var3.getBasismp(var4[4 ^ 5]) + "/" + var4[--1]);
            this.cj[--5].setText(String.valueOf(var4[--2]));
            this.cj[79 & 54].setText(String.valueOf(var4[--3]));
            this.cj[87 & 47].setText(String.valueOf(var4[--4]));
            this.ue = var3.getPart(this.aej);
         }
      }
   }
}
