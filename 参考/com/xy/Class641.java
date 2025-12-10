package com.xy;

import com.xy.entity.PartJade;
import com.xy.readbean.Goodstable;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;

public class Class641 extends JComponent {
   private Image bx;
   public PartJade acb;
   public Class436[] an;
   private Class345 pr;

   public static Goodstable to(PartJade var0, int var1) {
      String var2 = "";
      if (var1 == (3 & 5)) {
         var2 = "灵宝天尊炼制的玉符，可辟邪，可祛病，可祈福，可令装备产生玄妙的变化。        品质：把玩";
      } else if (var1 == (1 ^ 3)) {
         var2 = "灵宝天尊炼制的玉符，可辟邪，可祛病，可祈福，可令装备产生玄妙的变化。        品质：贴身";
      } else if (var1 == --3) {
         var2 = "灵宝天尊炼制的玉符，可辟邪，可祛病，可祈福，可令装备产生玄妙的变化。        品质：珍藏";
      } else if (var1 == --4) {
         var2 = "灵宝天尊炼制的玉符，可辟邪，可祛病，可祈福，可令装备产生玄妙的变化。        品质：无价";
      } else if (var1 == --5) {
         var2 = "灵宝天尊炼制的玉符，可辟邪，可祛病，可祈福，可令装备产生玄妙的变化。        品质：传世";
      }

      Goodstable var3 = new Goodstable();
      var3.setSkin("tzyf" + var1);
      var3.setGoodsname("灵宝玉符");
      var3.setInstruction(var2);
      var3.setValue("");
      var3.setQuality(1L);
      return var3;
   }

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.bx == null) {
         this.bx = Class511.a("sc/b/S57.png");
      }

      var1.drawImage(this.bx, 2 & 5, 2 & 5, 19951 & 13107, 22187 & 10751, this);
      var1.setColor(Color.white);
      var1.setFont(Class681.ce);
      var1.drawString(String.valueOf(this.acb.getJade1()), 63 & 94, 59 & 95);
      var1.drawString(String.valueOf(this.acb.getJade2()), 123 & 124, 127 & 27);
      var1.drawString(String.valueOf(this.acb.getJade3()), 10711 & 22266, 63 & 91);
      var1.drawString(String.valueOf(this.acb.getJade4()), 123 & 79, 105 & 127);
      var1.drawString(String.valueOf(this.acb.getJade5()), 12031 & 20901, 109 & 123);
   }

   public Class641(Class345 var1, PartJade var2) {
      int var10001 = --5;
      super();
      Class436[] var5 = new Class436[var10001];
      boolean var10003 = true;
      this.an = var5;
      int var10000 = 5 >> 3;
      this.setPreferredSize(new Dimension(22335 & 10702, 2030 & 30907));
      this.setLayout((LayoutManager)null);
      this.setBackground(Class681.cu);
      this.acb = var2;
      this.pr = var1;

      for(int var3 = var10000; var10000 < 5; var10000 = var3) {
         this.an[var3] = new Class436();
         this.an[var3].addMouseListener(new MouseListener(var3 + --1) {
            private int cy;

            public {
               this.cy = var2;
            }

            public void mouseExited(MouseEvent var1) {
               Class641.this.pr.ve().n(110 & 63);
            }

            public void mouseReleased(MouseEvent var1) {
            }

            public void mouseClicked(MouseEvent var1) {
               if (Class641.this.pr instanceof Class401) {
                  if (Class641.this.acb.getJade(this.cy) > 0) {
                     ((Class401)Class641.this.pr).iu()[3 >> 1].c((108 & 119) + this.cy, Class641.this.acb);
                  }
               } else if (Class641.this.pr instanceof Class37) {
                  Class37 var3 = (Class37)Class641.this.pr;
                  var3.u().c((124 & 103) + this.cy, Class641.this.acb);
                  var3.d();
               } else if (Class641.this.pr instanceof Class407) {
                  if (Class641.this.acb.getJade(this.cy) > 0) {
                     Class407 var2 = (Class407)Class641.this.pr;
                     var2.u().c((108 & 119) + this.cy, Class641.this.acb);
                     var2.ajz()[5 >> 2].setText("1");
                  }
               } else {
                  if (Class641.this.pr instanceof Class263) {
                     if (Class641.this.acb.getJade(this.cy) <= 0) {
                        return;
                     }

                     Class263 var10000 = (Class263)Class641.this.pr;
                     var10000.u().c((100 & 127) + this.cy, Class641.this.acb);
                     var10000.p();
                  }

               }
            }

            public void mousePressed(MouseEvent var1) {
            }

            public void mouseEntered(MouseEvent var1) {
               ((Class270)Class641.this.pr.ve().e(63 & 110)).oj(Class641.to(Class641.this.acb, this.cy), (boolean)(5 >> 3));
            }
         });
         Class641 var4;
         if (var3 < --3) {
            var4 = this;
            this.an[var3].setBounds((126 & 31) + var3 * (126 & 91), 25 & 119, 126 & 55, 63 & 115);
         } else {
            var4 = this;
            this.an[var3].setBounds((127 & 75) + (var3 - --3) * (91 & 126), 99 & 125, 62 & 119, 55 & 123);
         }

         var4.add(this.an[var3++]);
      }

   }

   public void cb(PartJade var1) {
      this.acb = var1;
   }
}
