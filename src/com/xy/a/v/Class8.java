package com.xy.a.v;

import com.xy.bean.RoleShow;
import com.xy.scene.BWDHTeam;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Image;
import javax.swing.JLabel;

public class Class8 extends com.xy.q.Class30 {
   private Image hf;
   private Class5[] ku;
   private JLabel[] au;

   // $VF: synthetic method
   static void ho(Class8 var0, Image var1) {
      var0.hf = var1;
   }

   public void hp(BWDHTeam var1, BWDHTeam var2) {
      this.au[0].setText(var1.getName());
      this.au[1].setText(var2.getName());
      RoleShow[] var3 = var1.getRoleShows();

      int var4;
      for (int var10000 = var4 = 0; var10000 < 5; var10000 = ++var4) {
         Class5 var7 = this.ku[var4];
         boolean var10001;
         int var10002;
         if (var4 == 0) {
            var10001 = true;
            var10002 = var4;
         } else {
            var10001 = false;
            var10002 = var4;
         }

         var7.gf(var10001, var10002 < var3.length ? var3[var4] : null);
      }

      var3 = var2.getRoleShows();

      for (int var8 = var4 = 0; var8 < 5; var8 = ++var4) {
         Class5 var9 = this.ku[5 + var4];
         boolean var10;
         int var11;
         if (var4 == 0) {
            var10 = true;
            var11 = var4;
         } else {
            var10 = false;
            var11 = var4;
         }

         var9.gf(var10, var11 < var3.length ? var3[var4] : null);
      }

      this.zc().b(this.lj());
   }

   public Class8(GameView var1) {
      super(177, 2, com.xy.q.Class30.afz, var1);
      String var10005 = "Iw\u0015p\u0015%\u000e\"\u0014dTs";
      this.yy(-1, 0, 794, 362, com.xy.q.Class30.agh);
      this.yu(com.xy.w.Class16.m("sc/d/146.png", 0, 0, 0, 0, false), null);
      String var10004 = "\u0018xD~D*])Ek\u0005|";
      this.agi.setImage("sc/e/162.png");
      this.agi.setBounds(764, 4, 27, 27);
      this.au = new JLabel[2];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.au.length; var10000 = var2) {
         this.au[var2] = com.xy.q.Class1.k(99 + 400 * var2, 2, 200, 32, Color.white, com.xy.q.Class49.ar);
         this.au[var2].setHorizontalAlignment(0);
         this.add(this.au[var2++]);
      }

      this.ku = new Class5[10];

      for (int var4 = var2 = 0; var4 < this.ku.length; var4 = var2) {
         this.ku[var2] = new Class5(this);
         Class8 var5;
         if (var2 == 0 || var2 == 1) {
            var5 = this;
            this.ku[var2].setBounds(167, 97 + 105 * var2, 165, 97);
         } else if (var2 >= 2 && var2 <= 4) {
            var5 = this;
            this.ku[var2].setBounds(7, 44 + 105 * (var2 - 2), 165, 97);
         } else if (var2 != 5 && var2 != 6) {
            if (var2 >= 7 && var2 <= 9) {
               this.ku[var2].setBounds(612, 44 + 105 * (var2 - 7), 165, 97);
            }

            var5 = this;
         } else {
            var5 = this;
            this.ku[var2].setBounds(452, 97 + 105 * (var2 - 5), 165, 97);
         }

         var5.add(this.ku[var2++]);
      }
   }

   // $VF: synthetic method
   static Image hq(Class8 var0) {
      return var0.hf;
   }
}
