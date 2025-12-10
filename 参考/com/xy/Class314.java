package com.xy;

import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTextField;

public class Class314 extends Class345 {
   private RichLabel[] rb;
   private Class436[] an;
   private int m;

   public RichLabel[] jn() {
      if (this.rb == null) {
         RichLabel[] var10001 = new RichLabel[43 & 124];
         boolean var10003 = true;
         this.rb = var10001;
      }

      int var1;
      for(int var10000 = var1 = 0; var10000 < 40; var10000 = var1) {
         int var2;
         if ((var2 = (this.m - --1) * (59 & 108) + var1) < (23295 & 9640)) {
            if (this.rb[var1] != null) {
               this.rb[var1].setText("#" + var2);
            } else {
               this.rb[var1] = new RichLabel("#" + var2, Class681.bm);
            }
         } else if (this.rb[var1] != null) {
            this.rb[var1].setText("");
         }

         ++var1;
      }

      return this.rb;
   }

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.rb == null) {
         this.jn();
      }

      int var2;
      for(int var10000 = var2 = 0; var10000 < this.rb.length; var10000 = var2) {
         if (this.rb[var2] != null && !this.rb[var2].getText().equals("")) {
            int var3 = var2 % (9 & 126);
            int var4 = var2 / (46 & 89);
            Graphics var5 = var1.create((42 & 93) + (62 & 127) * var3, (57 & 78) + (126 & 63) * var4, 55 & 122, 55 & 122);
            this.rb[var2].paint(var5);
            var5.dispose();
         }

         ++var2;
      }

   }

   public Class314(GameView var1) {
      int var10001 = 42 & 125;
      int var10005 = -4 >> 2;
      int var10007 = 4 ^ 5;
      super(119 & 60, --2, Class345.aef, var1);
      this.m = var10007;
      this.va(var10005, 3 >> 2, 6650 & 26621, 28639 & 4476, Class345.aei);
      this.uv(Class511.q("sc/d/49.png", 54 & 79, 54 & 79, 54 & 79, 54 & 79, (boolean)(3 & 4)), (String)null);
      Class436[] var6 = new Class436[var10001];
      boolean var10003 = true;
      this.an = var6;

      int var4;
      int var10000;
      for(var10000 = var4 = 3 ^ 3; var10000 < 40; var10000 = var4) {
         int var2 = var4 % (60 & 75);
         int var3 = var4 / (28 & 107);
         this.an[var4] = new Class436();
         this.an[var4].setBounds(--5 + (125 & 62) * var2 + var2 * (5 >> 1), --5 + (126 & 61) * var3 + var3 * (5 >> 1), 125 & 62, 125 & 62);
         this.an[var4].setBackground(Class681.cu);
         this.an[var4].addMouseListener(new MouseListener(var4) {
            private int m;

            public void mouseReleased(MouseEvent var1) {
            }

            public void mouseEntered(MouseEvent var1) {
            }

            public {
               this.m = var2;
            }

            public void mousePressed(MouseEvent var1) {
            }

            public void mouseClicked(MouseEvent var1) {
               if (this.m >= (111 & 116)) {
                  Class314.this.m = this.m - (126 & 101);
                  Class314.this.jn();
               } else if (var1.isMetaDown()) {
                  Class314.this.ve().n(Class314.this.ae());
               } else {
                  if ((Class314.this.m - (4 ^ 5)) * (122 & 45) + this.m <= (31471 & 1464)) {
                     JTextField var2 = Class314.this.aej.baseView.jj();
                     var2.setText(var2.getText() + "#" + ((Class314.this.m - (3 & 5)) * (44 & 123) + this.m));
                  }

               }
            }

            public void mouseExited(MouseEvent var1) {
            }
         });
         this.add(this.an[var4++]);
      }

      for(var10000 = var4 = 3 & 4; var10000 < 5; var10000 = var4) {
         Class245 var5 = Class133.a(10 + var4 * (53 & 122), 11135 & 21950, 109 & 59, 93 & 59, 3 & 4, Color.WHITE, Class681.ce);
         var5.setText(String.valueOf(var4 + --1));
         var5.eq(Class511.q("sc/b/B162.png", 39 & 94, 39 & 94, 39 & 94, 39 & 94, (boolean)(3 >> 2)));
         int var10006 = var4 + (4 ^ 5) + (103 & 124);
         ++var4;
         var5.addMouseListener(new MouseListener(var10006) {
            private int m;

            public void mouseReleased(MouseEvent var1) {
            }

            public void mouseEntered(MouseEvent var1) {
            }

            public {
               this.m = var2;
            }

            public void mousePressed(MouseEvent var1) {
            }

            public void mouseClicked(MouseEvent var1) {
               if (this.m >= (111 & 116)) {
                  Class314.this.m = this.m - (126 & 101);
                  Class314.this.jn();
               } else if (var1.isMetaDown()) {
                  Class314.this.ve().n(Class314.this.ae());
               } else {
                  if ((Class314.this.m - (4 ^ 5)) * (122 & 45) + this.m <= (31471 & 1464)) {
                     JTextField var2 = Class314.this.aej.baseView.jj();
                     var2.setText(var2.getText() + "#" + ((Class314.this.m - (3 & 5)) * (44 & 123) + this.m));
                  }

               }
            }

            public void mouseExited(MouseEvent var1) {
            }
         });
         this.add(var5);
      }

   }
}
