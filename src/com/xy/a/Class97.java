package com.xy.a;

import com.xy.battle.BattleControl;
import com.xy.bean.FightOperation;
import com.xy.text.GameView;
import java.awt.Color;
import javax.swing.JLabel;

public class Class97 extends com.xy.q.Class30 {
   private com.xy.i.Class14 akq;
   private JLabel dh;
   private JLabel fs;
   private JLabel di;
   private JLabel im;

   @Override
   public void l() {
      super.l();
   }

   public void g(int var1) {
      this.zc().f(this.lj());
   }

   public Class97(GameView var1) {
      super(151, 2, com.xy.q.Class30.afz, var1);
      String var10009 = "\u000ewRwR$";
      this.yy(-1, 0, 150, 90, com.xy.q.Class30.agf);
      this.yu(com.xy.w.Class16.m("sc/c/0", 6, 6, 6, 6, false), null);
      this.dh = com.xy.q.Class1.k(20, 15, 50, 20, Color.white, com.xy.q.Class49.ac);
      this.di = com.xy.q.Class1.k(20, 35, 50, 20, Color.white, com.xy.q.Class49.ac);
      String var10004 = "代『爰";
      this.dh.setText("人　物");
      String var10003 = "司啙兩";
      this.di.setText("召唤兽");
      this.add(this.dh);
      this.add(this.di);
      String var10013 = "-:H\u001fH\u001b7`";
      this.im = com.xy.q.Class1.k(75, 15, 80, 20, com.xy.q.Class49.c("#cFFFB99"), com.xy.q.Class49.ac);
      String var10011 = "^w;R;VD-";
      this.fs = com.xy.q.Class1.k(75, 35, 80, 20, com.xy.q.Class49.c("#cFFFB99"), com.xy.q.Class49.ac);
      String var10006 = "晠遃攵冢";
      this.im.setText("普通攻击");
      String var10005 = "易逎敆凯";
      this.fs.setText("普通攻击");
      this.add(this.im);
      this.add(this.fs);
      String var10016 = "变淑";
      this.akq = new com.xy.i.Class14(null, 1, 0, com.xy.q.Class49.ac, null, "取消", this);
      this.akq.setForeground(Color.GREEN);
      this.akq.setBounds(55, 60, 40, 16);
      this.add(this.akq);
   }

   @Override
   public boolean ah() {
      this.afx.getBattleControl().s();
      return super.ah();
   }

   public void acy(int var1, FightOperation var2, BattleControl var3) {
      String var4 = null;
      int var5;
      if (var2.getType() == 0) {
         String var10000 = "易逎敆凯";
         var4 = "普通攻击";
         var5 = var1;
      } else if (var2.getType() == 1) {
         var4 = var2.getSpell();
         var5 = var1;
      } else if (var2.getType() == 2) {
         String var6 = "荡咘";
         var4 = "药品";
         var5 = var1;
      } else if (var2.getType() == 3) {
         String var7 = "侠抰";
         var4 = "保护";
         var5 = var1;
      } else if (var2.getType() == 4) {
         String var8 = "捛挐";
         var4 = "捕捉";
         var5 = var1;
      } else if (var2.getType() == 5) {
         String var9 = "陏徵";
         var4 = "防御";
         var5 = var1;
      } else if (var2.getType() == 6) {
         String var10 = "逍趈";
         var4 = "逃跑";
         var5 = var1;
      } else {
         if (var2.getType() == 7) {
            String var11 = "厑囊";
            var4 = "召回";
         }

         var5 = var1;
      }

      if (var5 == 0) {
         this.im.setText(var4);
      } else {
         this.fs.setText(var4);
      }
   }
}
