package com.xy;

import com.xy.battle.BattleControl;
import com.xy.bean.FightOperation;
import com.xy.text.GameView;
import java.awt.Color;
import javax.swing.JLabel;

public class Class77 extends Class345 {
   private JLabel bd;
   private JLabel d;
   private JLabel ir;
   private Class600 mq;
   private JLabel ax;

   public void y(int var1) {
      this.ve().n(this.ae());
   }

   public void aje(int var1, FightOperation var2, BattleControl var3) {
      String var4 = null;
      int var10000;
      if (var2.getType() == 0) {
         var4 = "普通攻击";
         var10000 = var1;
      } else if (var2.getType() == 5 >> 2) {
         var4 = var2.getSpell();
         var10000 = var1;
      } else if (var2.getType() == 5 >> 1) {
         var4 = "药品";
         var10000 = var1;
      } else if (var2.getType() == --3) {
         var4 = "保护";
         var10000 = var1;
      } else if (var2.getType() == --4) {
         var4 = "捕捉";
         var10000 = var1;
      } else if (var2.getType() == --5) {
         var4 = "防御";
         var10000 = var1;
      } else if (var2.getType() == (55 & 78)) {
         var4 = "逃跑";
         var10000 = var1;
      } else {
         if (var2.getType() == (103 & 31)) {
            var4 = "召回";
         }

         var10000 = var1;
      }

      if (var10000 == 0) {
         this.d.setText(var4);
      } else {
         this.ax.setText(var4);
      }
   }

   public Class77(GameView var1) {
      int var10005 = 125 & 22;
      int var10007 = 23 & 124;
      int var10011 = -4 >> 2;
      super(25311 & 7607, --2, Class345.aef, var1);
      this.va(var10011, 3 & 4, 2807 & 30110, 94 & 123, Class345.aei);
      this.uv(Class511.q("sc/c/0", 111 & 22, 111 & 22, 111 & 22, 111 & 22, (boolean)(3 >> 2)), (String)null);
      this.ir = Class133.b(var10007, 31 & 111, 51 & 126, 84 & 63, Color.white, Class681.ce);
      this.bd = Class133.b(var10005, 123 & 39, 55 & 122, 125 & 22, Color.white, Class681.ce);
      this.ir.setText("人　物");
      this.bd.setText("召唤兽");
      this.add(this.ir);
      this.add(this.bd);
      var10007 = 91 & 111;
      this.d = Class133.b(75 & 127, 127 & 15, 126 & 81, 20, Class681.c("#cFFFB99"), Class681.ce);
      this.ax = Class133.b(var10007, 35, 80, 20, Class681.c("#cFFFB99"), Class681.ce);
      this.d.setText("普通攻击");
      this.ax.setText("普通攻击");
      this.add(this.d);
      this.add(this.ax);
      this.mq = new Class600((String)null, --1, 5 >> 3, Class681.ce, (Color[])null, "取消", this);
      this.mq.setForeground(Color.GREEN);
      this.mq.setBounds(55, 60, 40, 16);
      this.add(this.mq);
   }

   public void q() {
      super.q();
   }

   public boolean t() {
      this.aej.getBattleControl().k();
      return super.t();
   }
}
