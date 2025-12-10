package com.xy;

import com.xy.bean.BeauBean;
import com.xy.bean.UseCardBean;
import com.xy.game.RoleData;
import com.xy.readbean.MoneyType;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

public class Class627 extends Class345 {
   private Class245 acf;
   private JLabel[] er;
   private RichLabel z;
   private RichLabel aj;
   private Class436[] pv;
   private int j;
   private Class70 acg;
   private Class70[] ach;
   private Class556 aci;

   public Class627(GameView var1) {
      int var10001 = --4;
      int var10005 = -4 >> 2;
      super(27387 & 5564, 5 >> 1, Class345.aef, var1);
      this.va(var10005, 3 >> 2, 11743 & 21366, 32631 & 491, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 70 & 125, 70 & 125, 70 & 125, 70 & 125, (boolean)(5 >> 3)), "靓号染色");
      Class70[] var6 = new Class70[var10001];
      boolean var10003 = true;
      this.ach = var6;

      int var2;
      int var10000;
      for(var10000 = var2 = 5 >> 3; var10000 < this.ach.length; var10000 = var2) {
         Class70[] var5 = this.ach;
         Class70 var10002 = new Class70;
         var10005 = 5 >> 1;
         int var10006 = (4015 & 29143) + var2;
         Font var10007 = Class681.bm;
         String var10009;
         Class627 var10010;
         if (var2 == 0) {
            var10009 = "水波蓝玉";
            var10010 = this;
         } else if (var2 == (3 & 5)) {
            var10009 = "青玉红沁";
            var10010 = this;
         } else if (var2 == --2) {
            var10009 = "梅枝白玉";
            var10010 = this;
         } else if (var2 == --3) {
            var10009 = "溢彩流光";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var10002.<init>("sc/e/185.png", var10005, var10006, var10007, (Color[])null, var10009, var10010);
         var5[var2] = var10002;
         this.ach[var2].setBounds((127 & 47) + (114 & 79) * var2, 223 & 32745, 126 & 61, 86 & 63);
         this.add(this.ach[var2++]);
      }

      var10001 = --4;
      this.acg = new Class70("sc/e/26.png", 5 >> 2, 13815 & 19342, Class681.ak, (Color[])null, "确定染色", this);
      this.acg.setBounds(27281 & 5615, 29567 & 3511, 107 & 119, 61 & 91);
      this.acg.setForeground(Color.black);
      this.add(this.acg);
      JLabel[] var8 = new JLabel[var10001];
      var10003 = true;
      this.er = var8;

      Class627 var7;
      for(var10000 = var2 = 3 >> 2; var10000 < this.er.length; var10000 = var2) {
         this.er[var2] = Class133.b(123 & 54, 32, 260, 21, var2 == 0 ? Color.white : Color.black, Class681.ak);
         this.er[var2].setText(var2 == 0 ? "染色效果" : (var2 == (2 ^ 3) ? "染色方案" : (var2 == 5 >> 1 ? "消耗积分" : (var2 == --3 ? "拥有积分" : ""))));
         this.er[var2].setHorizontalAlignment(var2 == 0 ? 5 >> 3 : 10);
         if (var2 == (3 & 5)) {
            var7 = this;
            this.er[var2].setBounds(48, 157, 72, 19);
         } else if (var2 == --2) {
            var7 = this;
            this.er[var2].setBounds(70, 243, 72, 19);
         } else {
            if (var2 == --3) {
               this.er[var2].setBounds(70, 271, 72, 19);
            }

            var7 = this;
         }

         var7.add(this.er[var2++]);
      }

      this.aj = new RichLabel("", Class681.ab);
      this.aj.setTextSize("#c000000染色后#cFF0000开通频道显示#c000000可类似土豪金显示", 260);
      this.aj.setBounds(50, 177, this.aj.getWidth(), this.aj.getHeight());
      this.add(this.aj);
      this.acf = Class133.a(154, 243, 134, 19, 10, Color.white, Class681.q);
      this.acf.eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(3 >> 2)));
      this.add(this.acf);
      MoneyType var4 = new MoneyType();
      var4.setIdAndKey(--4, "积分");
      this.aci = Class133.m(154, 271, 134, 19, 10, Color.white, Class681.q, var4, var1);
      this.aci.eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(3 & 4)));
      this.add(this.aci);
      this.z = new RichLabel("", Class681.q);
      this.add(this.z);
      Class436[] var9 = new Class436[--3];
      var10003 = true;
      this.pv = var9;

      int var3;
      for(var10000 = var3 = 3 >> 2; var10000 < this.pv.length; var10000 = var3) {
         this.pv[var3] = new Class436();
         if (var3 == 0) {
            var7 = this;
            this.pv[var3].eq(Class511.q("sc/d/66.png", 100, 2 ^ 3, 100, 5 >> 2, (boolean)(3 >> 2)));
            this.pv[var3].setBounds(50, 232, 260, 5 >> 1);
         } else if (var3 == --1) {
            var7 = this;
            this.pv[var3].eq(Class511.q("sc/d/25.png", 5 >> 1, 5 >> 1, 5 >> 1, 5 >> 1, (boolean)(5 >> 3)));
            this.pv[var3].setBounds(50, 32, 260, 21);
         } else {
            if (var3 == --2) {
               this.pv[var3].eq(Class511.q("sc/d/24.png", 2, 2, 2, 2, (boolean)(3 >> 2)));
               this.pv[var3].setBounds(50, 32, 260, 120);
            }

            var7 = this;
         }

         var7.add(this.pv[var3++]);
      }

   }

   public void as(int var1) {
      if (var1 == (3030 & 30127)) {
         String var2 = Agreement.getSendTextAES("BEAU", "C" + (this.j + --1));
         this.uw().d(var2);
      }

   }

   public void y(int var1) {
      int var10000 = 3 & 4;
      this.j = var1;

      for(int var2 = var10000; var10000 < this.ach.length; var10000 = var2) {
         this.ach[var2].setKeep((boolean)(var2 == var1 ? --1 : 0));
         this.ach[var2].setForeground(var2 == var1 ? Color.green : Color.white);
         ++var2;
      }

      UseCardBean var4;
      BeauBean var3 = (var4 = this.vd().getLimit("靓号")) != null ? var4.a() : null;
      Class627 var5;
      if (var3 == null) {
         this.z.setTextSize("", 11534 & 21493);
         var5 = this;
      } else {
         this.z.setTextSize("#VBEAU" + var3.getLvl() + "," + var3.getBeau() + "," + (var1 + --1) + "#L", 24471 & 8556);
         var5 = this;
      }

      var5.z.setBounds((127 & 50) + ((27566 & 5461) - this.z.getWidth()) / (5 >> 1), 82 & 127, this.z.getWidth(), this.z.getHeight());
   }

   public boolean bl() {
      RoleData var1;
      if ((var1 = this.vd()) == null) {
         return (boolean)(2 & 5);
      } else {
         UseCardBean var3;
         BeauBean var2 = (var3 = var1.getLimit("靓号")) != null ? var3.a() : null;
         if (var2 == null) {
            return (boolean)(5 >> 3);
         } else {
            int var10001 = 3 & 4;
            Class681.j(this.acf, 30L);
            this.y(Math.max(var10001, var2.getSkin() - (5 >> 2)));
            return (boolean)(4 ^ 5);
         }
      }
   }

   public void q() {
      if (this.bl()) {
         super.q();
      }
   }
}
