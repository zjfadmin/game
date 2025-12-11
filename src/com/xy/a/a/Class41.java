package com.xy.a.a;

import com.xy.readbean.Skill;
import com.xy.readbean.TYC;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;

class Class41 extends JComponent implements MouseListener {
   private TYC all;
   private int gz;
   private int z;
   private Image lp;
   private int cn;
   private boolean wb;
   private int cb;
   private boolean dr;
   private int ds;
   // $VF: synthetic field
   final Class12 alm;
   private boolean cf;

   // $VF: synthetic method
   static int adr(Class41 var0) {
      return var0.ds;
   }

   public void ads(TYC var1) {
      this.cn = var1 != null ? var1.getV2() : 0;
      this.all = var1;
      this.cb = 0;
      this.z = 0;
      this.ds = 0;
      if (this.cn == 0) {
         this.lp = null;
         this.setVisible(false);
      } else {
         this.lp = com.xy.w.Class15.h(String.valueOf(this.cn));
         this.setVisible(true);
         Skill var2;
         if ((var2 = this.alm.yt().ac(String.valueOf(this.cn))) != null) {
            this.ds = Integer.parseInt(var2.getSkilllevel());
         }
      }
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      this.dr = Boolean.TRUE;
   }

   // $VF: synthetic method
   static void adt(Class41 var0, boolean var1) {
      var0.cf = var1;
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      Skill var2;
      if ((var2 = this.alm.yt().ac(String.valueOf(this.cn))) != null) {
         ((com.xy.a.Class48)this.alm.zc().j(46)).es(var2.getSkillname(), this.alm.jn(var2, this));
      }
   }

   // $VF: synthetic method
   static TYC adu(Class41 var0) {
      return var0.all;
   }

   // $VF: synthetic method
   static void adv(Class41 var0, int var1) {
      var0.cb = var1;
   }

   // $VF: synthetic method
   static int adw(Class41 var0) {
      return var0.cb;
   }

   // $VF: synthetic method
   static int adx(Class41 var0) {
      return var0.gz;
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      this.dr = Boolean.FALSE;
      this.alm.zc().f(46);
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      this.dr = Boolean.FALSE;
      if (this.cf) {
         if (!Class12.jp(this.alm).getText().equals("0")) {
            int var2;
            if ((var2 = this.z + (var1.isMetaDown() ? -1 : 1)) >= this.cb) {
               if (var2 <= this.ds) {
                  this.z = var2;
                  this.alm.c();
               }
            }
         }
      }
   }

   // $VF: synthetic method
   static int ady(Class41 var0) {
      return var0.z;
   }

   // $VF: synthetic method
   static int adz(Class41 var0) {
      return var0.cn;
   }

   // $VF: synthetic method
   static void aea(Class41 var0, int var1) {
      var0.z = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   public Class41(Class12 var1, int var2) {
      this.alm = var1;
      this.gz = var2;
      this.setVisible(false);
      this.addMouseListener(this);
      this.setBounds(90 + (var2 / 10 - 1) * 78, 30 + (var2 % 10 - 1) * 55, 50, 50);
   }

   // $VF: synthetic method
   static void aeb(Class41 var0, int var1) {
      var0.ds = var1;
   }

   @Override
   protected void paintComponent(Graphics var1) {
      if (this.cn != 0 && this.lp != null) {
         var1.drawImage(Class12.jj(this.alm), 0, 0, this.getWidth(), this.getHeight(), this);
         Class41 var10000;
         if (this.dr) {
            var10000 = this;
            var1.drawImage(this.lp, 5, 5, this.getWidth() - 8, this.getHeight() - 8, this);
         } else {
            var1.drawImage(this.lp, 4, 4, this.getWidth() - 8, this.getHeight() - 8, this);
            var10000 = this;
         }

         if (var10000.cf) {
            var1.drawImage(Class12.ji(this.alm), 25, 35, 25, 15, this);
            var1.setColor(Color.white);
            var1.setFont(com.xy.q.Class49.bz);
            StringBuilder var10002 = new StringBuilder(String.valueOf(this.z));
            String var10003 = "h";
            var1.drawString(var10002.append("/").append(this.ds).toString(), 27, 48);
            var10000 = this;
         } else {
            var1.drawImage(Class12.jl(this.alm), 0, 0, this.getWidth(), this.getHeight(), this);
            var10000 = this;
         }

         if (var10000.wb) {
            var1.drawImage(Class12.jf(this.alm), 16, 14, 16, 18, this);
         }
      }
   }

   // $VF: synthetic method
   static void aec(Class41 var0, boolean var1) {
      var0.wb = var1;
   }
}
