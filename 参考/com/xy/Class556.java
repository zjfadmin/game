package com.xy;

import com.xy.readbean.MoneyType;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JLabel;

public class Class556 extends JLabel {
   static final int gw = 1000;
   protected MoneyType rr;
   protected long gf;
   protected Long ul;
   protected GameView agz;
   protected int cy;
   protected Class604 ip;

   public void ab(int var1) {
      this.cy = var1;
   }

   public void xa(MoneyType var1) {
      if (this.rr != var1) {
         this.rr = var1;
         if (this.rr != null) {
            this.cc();
         } else {
            this.gf = 0L;
            if (this.ul != null) {
               this.q();
            } else {
               this.setText((String)null);
            }
         }
      }
   }

   public MoneyType xb() {
      return this.rr;
   }

   public void eq(Class604 var1) {
      this.ip = var1;
   }

   public Class556(MoneyType var1, GameView var2) {
      this((Class604)null, var1, var2);
   }

   public void xc(Long var1) {
      this.ul = var1;
      this.q();
   }

   public void cc() {
      if (this.rr != null) {
         long var1 = 0L;
         Class556 var10000;
         if (this.rr.getId() == -4 >> 2) {
            var10000 = this;
            var1 = this.rr.getMax();
         } else if (this.rr.getId() == (-1 & -2)) {
            var10000 = this;
            var1 = this.agz.roleData.getMoney(this.rr);
         } else {
            if (this.rr.getKey() != null) {
               var1 = this.agz.roleData.getMoney(this.rr);
            }

            var10000 = this;
         }

         if (var10000.gf != var1) {
            this.gf = var1;
            this.q();
         }
      }
   }

   public void xd(MoneyType var1) {
      this.rr = var1;
   }

   public void q() {
      if (this.ul != null) {
         this.setText(Class681.h(this.ul) + "/" + Class681.h(this.gf));
         this.setForeground(this.gf >= this.ul ? Color.green : Color.red);
      } else {
         Class681.j(this, this.gf);
      }
   }

   protected void paintComponent(Graphics var1) {
      if (this.agz.bl()) {
         this.cc();
      }

      if (this.ip != null) {
         this.ip.g(var1, this.getWidth(), this.getHeight());
      }

      if (this.cy != 0) {
         var1.translate(this.cy, 5 >> 3);
         super.paintComponent(var1);
         var1.translate(-this.cy, 3 ^ 3);
      } else {
         super.paintComponent(var1);
      }
   }

   public void gh(long var1) {
      if (this.gf != var1) {
         this.gf = var1;
         this.q();
      }
   }

   public void xe(int var1, long var2, Long var4) {
      if (this.rr == null || this.rr.getKey() != null) {
         this.rr = new MoneyType(var1, var2);
      }

      this.rr.setIdAndMax(var1, var2);
      this.ul = var4;
      this.gf = 0L;
      this.q();
   }

   public Class556(Class604 var1, MoneyType var2, GameView var3) {
      this.ip = var1;
      this.rr = var2;
      this.agz = var3;
      Class681.j(this, this.gf);
   }

   public long gl() {
      return this.gf;
   }
}
