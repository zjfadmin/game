package com.xy;

import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.ImageObserver;

public class Class419 extends Class345 {
   private <undefinedtype>[] abg;

   public Class419(GameView var1) {
      int var10001 = --3;
      int var10005 = -4 >> 2;
      super(122 & 125, 1 ^ 3, Class345.aef, var1);
      this.va(var10005, 5 >> 3, 18350 & 15101, 10711 & 22511, Class345.aei);
      this.fx("sc/b/S277.png");
      <undefinedtype>[] var3 = new <undefinedtype>[var10001];
      boolean var10003 = true;
      this.abg = var3;

      int var2;
      for(int var10000 = var2 = 2 & 5; var10000 < this.abg.length; var10000 = var2) {
         this.abg[var2] = new MouseListener(var2) {
            private int fk;
            private boolean ee;
            private Image rg;
            private Image fq;
            private boolean op;

            public void mouseExited(MouseEvent var1) {
               this.ee = Boolean.FALSE;
               this.op = Boolean.FALSE;
            }

            public void mousePressed(MouseEvent var1) {
               this.ee = Boolean.TRUE;
               if (this.op) {
                  if (this.fk == 0) {
                     String var2 = Agreement.getSendTextAES("teamArena", "X");
                     Class419.this.uw().d(var2);
                  } else if (this.fk == 3 >> 1 && Class419.this.uw().VALUE.indexOf(127 & 74) != -4 >> 2) {
                     Class419.this.ve().a(26519 & 6383);
                  } else {
                     Class419.this.aej.f("暂未开放");
                  }
               }
            }

            public void mouseEntered(MouseEvent var1) {
               this.op = Boolean.TRUE;
            }

            protected void paintComponent(Graphics var1) {
               if (this.ee) {
                  var1.drawImage(this.ads(4 ^ 5), 3 >> 1, 3 >> 1, this.getWidth(), this.getHeight(), (ImageObserver)null);
               } else if (this.op) {
                  var1.drawImage(this.ads(--1), 3 ^ 3, 3 ^ 3, this.getWidth(), this.getHeight(), (ImageObserver)null);
               } else {
                  var1.drawImage(this.ads(2 & 5), 2 & 5, 2 & 5, this.getWidth(), this.getHeight(), (ImageObserver)null);
               }
            }

            public void mouseReleased(MouseEvent var1) {
               this.ee = Boolean.FALSE;
            }

            public void mouseClicked(MouseEvent var1) {
            }

            public {
               this.fk = var2;
               this.addMouseListener(this);
            }

            public Image ads(int var1) {
               int var10000;
               if (var1 == 0 && this.fq == null || var1 != 0 && this.rg == null) {
                  if (var1 == 0) {
                     this.fq = Class511.a("sc/b/S" + (this.fk * (5 >> 1) + (17878 & 15167)) + ".png");
                     var10000 = var1;
                     return var10000 == 0 ? this.fq : this.rg;
                  }

                  this.rg = Class511.a("sc/b/S" + (this.fk * (1 ^ 3) + (16287 & 16759)) + ".png");
               }

               var10000 = var1;
               return var10000 == 0 ? this.fq : this.rg;
            }
         };
         this.abg[var2].setBounds((61 & 95) + (7935 & 25048) * var2, 39 & 126, 8697 & 24262, 30586 & 2559);
         this.add(this.abg[var2++]);
      }

   }
}
