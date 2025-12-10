package com.xy;

import com.xy.readbean.Buff;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.ImageObserver;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class Class392 extends Class345 {
   private int j;
   private Class529 k;
   private <undefinedtype>[] l;
   private int m;

   public Class392(GameView var1) {
      int var10001 = --3;
      int var10006 = -4 >> 2;
      super(126 & 125, 1 ^ 3, Class345.aef, var1);
      this.va(var10006, 2 & 5, 17023 & 16375, 17807 & 15347, Class345.aeo);
      this.fx("sc/b/S291.png");
      this.aea.setBounds(1021 & 32338, 123 & 95, 63 & 89, 63 & 89);
      <undefinedtype>[] var3 = new <undefinedtype>[var10001];
      boolean var10003 = true;
      this.l = var3;

      int var2;
      for(int var10000 = var2 = 5 >> 3; var10000 < this.l.length; var10000 = var2) {
         this.l[var2] = new MouseListener(var2) {
            private int bn;
            private Image fq;
            private RichLabel gi;

            public void mouseEntered(MouseEvent var1) {
            }

            public void ab(int var1) {
               this.bn = var1;
               Buff var2;
               if ((var2 = Class392.this.vc().p(var1)) == null) {
                  this.gi.setText("");
               } else {
                  this.gi.setText(var2.getColor() + var2.getbName() + ":" + var2.getbText());
               }
            }

            public void mouseReleased(MouseEvent var1) {
            }

            public void mouseExited(MouseEvent var1) {
            }

            public {
               this.gi = new RichLabel("", Class681.ad, 14843 & 18429);
               this.gi.setBounds(117 & 62, 3 >> 2, 14323 & 18959, 127 & 45);
               this.add(this.gi);
               this.addMouseListener(this);
            }

            public void mousePressed(MouseEvent var1) {
            }

            public void mouseClicked(MouseEvent var1) {
               int var2;
               for(int var10000 = var2 = 3 & 4; var10000 < Class392.this.l.length; var10000 = var2) {
                  if (Class392.this.l[var2] == this) {
                     Class392.this.l[var2].setBorder(BorderFactory.createLineBorder(Color.red, 5 >> 1));
                  } else {
                     Class392.this.l[var2].setBorder((Border)null);
                  }

                  ++var2;
               }

            }

            protected void paintComponent(Graphics var1) {
               super.paintComponent(var1);
               if (this.fq == null) {
                  this.fq = Class511.a("sc/b/S292.png");
               }

               var1.drawImage(this.fq, 3 & 4, 3 & 4, this.getWidth(), this.getHeight(), (ImageObserver)null);
            }
         };
         this.l[var2].setBounds(95 & 62, (19407 & 13493) + var2 * (62 & 127), 18012 & 15335, 51 & 126);
         this.add(this.l[var2++]);
      }

      this.k = new Class529("sc/e/26.png", 4 ^ 5, 89 & 103, Class681.ak, Class681.c, "确定选择", this);
      this.k.setBounds(13583 & 19451, 4063 & 29037, 115 & 111, 31 & 122);
      this.add(this.k);
   }

   public void d() {
      int var1;
      if ((var1 = this.e()) == -4 >> 2) {
         this.aej.f("你还未选中BUFF");
      } else {
         Class392 var10000;
         String var2;
         if (this.m == 0) {
            var2 = Agreement.getSendTextAES("teamArena", "B" + var1);
            var10000 = this;
            this.uw().d(var2);
         } else {
            if (this.m == (3 & 5)) {
               var2 = Agreement.getSendTextAES("teamArena", "T" + this.j + "|" + var1);
               this.uw().d(var2);
            }

            var10000 = this;
         }

         var10000.ve().n(this.ae());
      }
   }

   public int e() {
      int var1;
      for(int var10000 = var1 = 3 >> 2; var10000 < this.l.length; var10000 = var1) {
         if (this.l[var1].getBorder() != null) {
            return this.l[var1].bn;
         }

         ++var1;
      }

      return -4 >> 2;
   }

   public void f(String var1) {
      this.m = var1.startsWith("B") ? 3 >> 2 : 1;
      this.j = 5 >> 3;
      String[] var4 = var1.split("\\|");
      var4[3 ^ 3] = var4[5 >> 3].substring(--1);
      int var10000;
      int var2;
      String var3;
      Class392 var5;
      if (this.m == 0) {
         for(var10000 = var2 = 5 >> 3; var10000 < 3; var10000 = var2) {
            var3 = var2 < var4.length ? var4[var2] : "";
            this.l[var2].ab(!var3.equals("") ? Integer.parseInt(var3) : 0);
            this.l[var2].setVisible((boolean)(this.l[var2].bn != 0 ? 4 ^ 5 : 0));
            ++var2;
         }

         var5 = this;
      } else {
         if (this.m == --1) {
            int var10003 = 5 >> 3;
            var10000 = 5 >> 3;
            this.j = Integer.parseInt(var4[var10003]);

            for(var2 = var10003; var10000 < 3; var10000 = var2) {
               var3 = var2 + (4 ^ 5) < var4.length ? var4[var2 + (3 & 5)] : "";
               this.l[var2].ab(!var3.equals("") ? Integer.parseInt(var3) : 0);
               this.l[var2].setVisible((boolean)(this.l[var2].bn != 0 ? 2 ^ 3 : 0));
               ++var2;
            }
         }

         var5 = this;
      }

      var5.ve().a(this.ae());
   }
}
