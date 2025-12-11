package com.xy.q;

import com.xy.readbean.MoneyType;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JLabel;

public class Class52 extends JLabel {
   static final int cn = 1000;
   protected MoneyType lv;
   protected GameView ati;
   protected Long cq;
   protected int ds;
   protected long fh;
   protected com.xy.w.Class9 rm;

   public void l() {
      if (this.lv != null) {
         long var1 = 0L;
         Class52 var10000;
         if (this.lv.getId() == -1) {
            var10000 = this;
            var1 = this.lv.getMax();
         } else if (this.lv.getId() == -2) {
            var10000 = this;
            var1 = this.ati.roleData.getMoney(this.lv);
         } else {
            if (this.lv.getKey() != null) {
               var1 = this.ati.roleData.getMoney(this.lv);
            }

            var10000 = this;
         }

         if (var10000.fh != var1) {
            this.fh = var1;
            this.t();
         }
      }
   }

   public void alg(Long var1) {
      this.cq = var1;
      this.t();
   }

   public void alh(int var1, long var2, Long var4) {
      if (this.lv == null || this.lv.getKey() != null) {
         this.lv = new MoneyType(var1, var2);
      }

      this.lv.setIdAndMax(var1, var2);
      this.cq = var4;
      this.fh = 0L;
      this.t();
   }

   public void ali(MoneyType var1) {
      this.lv = var1;
   }

   public void n(int var1) {
      this.ds = var1;
   }

   public Class52(com.xy.w.Class9 var1, MoneyType var2, GameView var3) {
      this.rm = var1;
      this.lv = var2;
      this.ati = var3;
      Class49.b(this, this.fh);
   }

   public long ee() {
      return this.fh;
   }

   public void ef(long var1) {
      if (this.fh != var1) {
         this.fh = var1;
         this.t();
      }
   }

   public void t() {
      if (this.cq != null) {
         StringBuilder var10000 = new StringBuilder(String.valueOf(Class49.k(this.cq)));
         String var10003 = ",";
         this.setText(var10000.append("/").append(Class49.k(this.fh)).toString());
         this.setForeground(this.fh >= this.cq ? Color.green : Color.red);
      } else {
         Class49.b(this, this.fh);
      }
   }

   public void alj(MoneyType var1) {
      if (this.lv != var1) {
         this.lv = var1;
         if (this.lv != null) {
            this.l();
         } else {
            this.fh = 0L;
            if (this.cq != null) {
               this.t();
            } else {
               this.setText(null);
            }
         }
      }
   }

   public Class52(MoneyType var1, GameView var2) {
      this(null, var1, var2);
   }

   public MoneyType alk() {
      return this.lv;
   }

   @Override
   protected void paintComponent(Graphics var1) {
      if (this.ati.dh()) {
         this.l();
      }

      if (this.rm != null) {
         this.rm.g(var1, this.getWidth(), this.getHeight());
      }

      if (this.ds != 0) {
         var1.translate(this.ds, 0);
         super.paintComponent(var1);
         var1.translate(-this.ds, 0);
      } else {
         super.paintComponent(var1);
      }
   }

   public void mt(com.xy.w.Class9 var1) {
      this.rm = var1;
   }
}
