package com.xy;

import com.xy.entity.RoleSummoning;
import com.xy.game.RoleData;
import com.xy.game.RolePet;
import com.xy.readbean.MoneyType;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class Class258 extends Class345 {
   private Class248 mf;
   private JScrollPane w;
   private JScrollPane ea;
   private Class248 mg;
   private Class529[] mh;
   private BigDecimal ge;
   private RichLabel q;
   private Class556 ks;
   private Class436[] e;
   private Class245 cv;
   private JLabel[] u;

   public Class258(GameView var1) {
      int var10001 = 5 >> 1;
      int var10005 = 67 & 127;
      int var10011 = -4 >> 2;
      super(19335 & 13563, 5 >> 1, Class345.aef, var1);
      this.ge = new BigDecimal(1000000);
      this.va(var10011, 3 >> 2, 9118 & 24191, 30199 & 2943, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 110 & 85, 110 & 85, 110 & 85, 110 & 85, (boolean)(5 >> 3)), "召唤兽寄存");
      this.mf = new Class248(this);
      this.mf.setBounds(3 & 4, 3 & 4, 18175 & 14772, 62 & 85);
      this.w = Class133.f(var10005, 12247 & 20671, 29887 & 3060, 17853 & 15063, this.mf, 60 & 87);
      this.add(this.w);
      int var10006 = 5054 & 28031;
      this.mg = new Class248(this);
      this.mg.setBounds(3 & 4, 3 & 4, 19708 & 13239, 94 & 53);
      this.ea = Class133.f(var10006, 11455 & 21463, 4532 & 28415, 149, this.mg, 20);
      this.add(this.ea);
      this.q = new RichLabel("", Class681.ab);
      this.q.setTextSize("#c000000温馨提示：1、左右列表各选1只召唤兽可以交换位置；#r         2、寄存（交换）费用与召唤兽列表所选召唤兽级别有关。", 408);
      this.q.setBounds(95, 41, this.q.getWidth(), this.q.getHeight());
      this.add(this.q);
      Class529[] var6 = new Class529[var10001];
      boolean var10003 = true;
      this.mh = var6;

      int var2;
      int var10000;
      for(var10000 = var2 = 5 >> 3; var10000 < this.mh.length; var10000 = var2) {
         Class529[] var5 = this.mh;
         Class529 var10002 = new Class529;
         var10005 = 3 >> 1;
         var10006 = 106 + var2;
         Font var10007 = Class681.ak;
         Color[] var10008 = Class681.c;
         String var10009;
         Class258 var10010;
         if (var2 == 0) {
            var10009 = "寄 存";
            var10010 = this;
         } else if (var2 == (4 ^ 5)) {
            var10009 = "取 回";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var10002.<init>("sc/e/26.png", var10005, var10006, var10007, var10008, var10009, var10010);
         var5[var2] = var10002;
         this.mh[var2].setBounds(109 + 245 * var2, 308, 99, 25);
         this.add(this.mh[var2++]);
      }

      this.cv = Class133.a(166, 94, 104, 19, 10, Color.white, Class681.q);
      this.cv.eq(Class511.q("sc/d/17.png", --3, --3, --3, --3, (boolean)(2 & 5)));
      this.add(this.cv);
      Class681.j(this.cv, this.ge.longValue());
      this.ks = Class133.m(364, 94, 104, 19, 10, Color.white, Class681.q, (MoneyType)null, var1);
      this.ks.eq(Class511.q("sc/d/17.png", --3, --3, --3, --3, (boolean)(3 >> 2)));
      this.ks.ab(1 ^ 3);
      this.ks.setText("0");
      MoneyType var4;
      (var4 = new MoneyType()).setIdAndKey(4 ^ 5, "现金");
      this.ks.xa(var4);
      this.add(this.ks);
      JLabel[] var7 = new JLabel[--4];
      var10003 = true;
      this.u = var7;

      int var3;
      for(var10000 = var3 = 5 >> 3; var10000 < this.u.length; var10000 = var3) {
         this.u[var3] = Class133.c(92 + 198 * var3, 94, 72, 19, 3 ^ 3, Class681.c("#c000000"), Class681.ak);
         this.u[var3].setText(var3 == 0 ? "消耗金钱" : (var3 == --1 ? "拥有现金" : (var3 == 5 >> 1 ? "召唤兽列表" : (var3 == --3 ? "寄存列表" : ""))));
         this.add(this.u[var3]);
         if (var3 >= (1 ^ 3) && var3 <= --3) {
            this.u[var3].setForeground(Class681.c("#cFFFFFF"));
            this.u[var3].setBounds(67 + 251 * (var3 - --2), 130, 180, 21);
         }

         ++var3;
      }

      Class436[] var8 = new Class436[7];
      var10003 = true;
      this.e = var8;

      for(var10000 = var3 = 3 >> 2; var10000 < this.e.length; var10000 = var3) {
         this.e[var3] = new Class436();
         this.add(this.e[var3]);
         if (var3 >= 0 && var3 <= (3 & 5)) {
            this.e[var3].eq(Class511.q("sc/d/25.png", 5 >> 1, 5 >> 1, 5 >> 1, 5 >> 1, (boolean)(3 & 4)));
            this.e[var3].setBounds(67 + 251 * var3, 130, 180, 21);
         }

         if (var3 >= (1 ^ 3) && var3 <= --3) {
            this.e[var3].eq(Class511.q("sc/d/24.png", --2, --2, --2, --2, (boolean)(3 ^ 3)));
            this.e[var3].setBounds(67 + 251 * (var3 - 2), 130, 180, 170);
         }

         if (var3 >= 4 && var3 <= 5) {
            this.e[var3].setBounds(251 + 33 * (var3 - 4), 166, 30, 56);
            if (var3 == 4) {
               this.e[var3].fw("sc/d/68.png");
            }

            if (var3 == 5) {
               this.e[var3].fw("sc/d/69.png");
            }
         }

         if (var3 == 6) {
            this.e[var3].eq(Class511.q("sc/d/36.png", 20, 20, 20, 20, (boolean)(3 & 4)));
            this.e[var3].setBounds(54, 28, 460, 320);
         }

         ++var3;
      }

   }

   public void ck(List<RoleSummoning> var1) {
      this.mg.ck((List)(var1 != null ? var1 : new ArrayList()));
      this.ve().a(this.ae());
   }

   public void q() {
      this.mf.q();
      this.ks.cc();
      super.q();
   }

   public void y(int var1) {
      RoleData var4 = this.vd();
      if (var1 == (123 & 110)) {
         RolePet var7;
         RoleSummoning var6 = (var7 = var4.getRolePet(this.mf.gl())) != null ? var7.getPet() : null;
         if (var6 == null) {
            this.aej.f("请先选中召唤兽");
         } else if (!this.aej.getClient().gameUX.equals("MVI") && var6.getGoods() != null) {
            this.aej.fw("该召唤兽携带着装备或内丹");
         } else if (var4.getPetMount(var6.getSid()) != null) {
            this.aej.f("这只召唤兽被管制中，不可放生！！！");
         } else if (Class394.v(var4.getLoginResult().getSummoning_id(), var6.getSid())) {
            this.aej.f("这只召唤兽已在参战中！！！");
         } else {
            String var5 = Agreement.getSendTextAES("pawnpet", "P" + var6.getSid());
            this.uw().d(var5);
         }
      } else {
         if (var1 == (111 & 123)) {
            if (var4.pets.size() >= (117 & 31)) {
               this.aej.f("您的召唤兽可携带的数量已满！！！");
               return;
            }

            RoleSummoning var3;
            if ((var3 = this.mg.gj()) == null) {
               this.aej.f("请先选中召唤兽");
               return;
            }

            String var2 = Agreement.getSendTextAES("pawnpet", "R" + var3.getSid());
            this.uw().d(var2);
         }

      }
   }

   public void gs(RoleSummoning var1, int var2) {
      List var3 = this.mg.ci();
      Class258 var10000;
      if (var2 == --1) {
         var10000 = this;
         var3.add(var1);
      } else {
         label25: {
            for(int var4 = var2 = 0; var4 < var3.size(); var4 = var2) {
               if (Class394.v(var1.getSid(), ((RoleSummoning)var3.get(var2)).getSid())) {
                  var3.remove(var2);
                  var10000 = this;
                  break label25;
               }

               ++var2;
            }

            var10000 = this;
         }
      }

      var10000.mf.q();
      this.mg.q();
      this.ks.cc();
   }
}
