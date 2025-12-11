package com.xy.a.a;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class Class55 implements MouseListener {
   // $VF: synthetic field
   final Class43 ate;
   private int ah;

   public Class55(Class43 var1, int var2) {
      this.ate = var1;
      this.ah = var2;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      if (this.ah < 4) {
         if (Class43.aej(this.ate) != this.ah) {
            Class43.aeg(this.ate, this.ah);

            int var3;
            for (int var5 = var3 = 0; var5 < 4; var5 = ++var3) {
               com.xy.w.Class18 var6 = Class43.aek(this.ate)[var3 + 4];
               String var10;
               if (Class43.aej(this.ate) == var3) {
                  var10 = "H\u0012\u0014\u0014\u0014G\f_K\u001f\\";
                  var10 = "sc/e/67.png";
               } else {
                  var10 = "co?i?:(\"`bw";
                  var10 = "sc/e/68.png";
               }

               var6.dp(var10);
            }
         }
      } else if (Class43.ael(this.ate) != this.ah - 4) {
         Class43.aei(this.ate, this.ah - 4);

         int var2;
         for (int var10000 = var2 = 0; var10000 < 4; var10000 = ++var2) {
            com.xy.w.Class18 var4 = Class43.aek(this.ate)[var2 + 8];
            String var7;
            if (Class43.ael(this.ate) == var2) {
               var7 = "H\u0012\u0014\u0014\u0014G\f_K\u001f\\";
               var7 = "sc/e/67.png";
            } else {
               var7 = "co?i?:(\"`bw";
               var7 = "sc/e/68.png";
            }

            var4.dp(var7);
         }
      }
   }
}
