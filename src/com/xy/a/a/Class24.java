package com.xy.a.a;

import com.xy.entity.RoleSummoning;
import com.xy.readbean.Skill;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;

class Class24 extends JComponent implements MouseListener {
   private Image kr;
   // $VF: synthetic field
   final Class9 vf;
   private int cb;
   private int ae;
   private Image hf;
   private int eg;
   private int ah;

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (this.eg > 0) {
         RoleSummoning var2 = this.vf.yx().getChosePet();
         Skill var3 = this.eg != 0 ? this.vf.yt().ac(String.valueOf(this.eg)) : null;
         this.vf.fp(var2, this.eg, this.cb, var3, this.ah == 1);
         if (this.vf.za().gameBBXY && (this.eg == 1250 || this.eg == 1269)) {
            ((Class42)this.vf.zc().j(146)).ew(var2);
         }
      }
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      if ((this.eg == -1 || this.eg == -2) && this.vf.za().gamePetSkill) {
         com.xy.a.Class48 var2 = (com.xy.a.Class48)this.vf.zc().j(46);
         if (this.ae == 6) {
            if (this.eg == -2) {
               var2.bq("#R神兽技能格(未获取)#r#Y获取技能格的方式:#r前6个技能格都获取时自动获取;");
               return;
            }

            if (this.eg == -1) {
               var2.bq("#Y神兽技能格(封印)#r解封技能格方式:#r前6个技能格都开启时自动开启;");
               return;
            }
         } else {
            if (this.eg == -2) {
               var2.bq("#R技能格(未获取)#r#Y获取技能格的方式:#r1.召唤兽点化后,使用提炼过的聚魄丹时有几率获得;#r2.召唤兽启灵时,有几率获得(封印状态);");
               return;
            }

            if (this.eg == -1) {
               var2.bq("#Y技能格(封印)#r解封技能格方式:#r1.明雷战斗可随机开启;#r2.使用启魂丹开启;");
            }
         }
      }
   }

   // $VF: synthetic method
   static int pi(Class24 var0) {
      return var0.eg;
   }

   public Class24(Class9 var1, int var2, int var3) {
      this.vf = var1;
      this.ah = var2;
      this.ae = var3;
      this.addMouseListener(this);
   }

   @Override
   protected void paintComponent(Graphics var1) {
      if (this.hf != null) {
         var1.drawImage(this.hf, 2, 2, this.getWidth() - 4, this.getHeight() - 4, null);
      }

      if (this.kr != null) {
         var1.drawImage(this.kr, 36, 3, 15, 15, null);
      }
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   // $VF: synthetic method
   static int pj(Class24 var0) {
      return var0.cb;
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      if ((this.eg == -1 || this.eg == -2) && this.vf.za().gamePetSkill) {
         this.vf.zc().f(46);
      }
   }

   public void cc(int var1, int var2) {
      this.eg = var1;
      this.cb = var2;
      Class24 var10000;
      if (var1 == -1) {
         var10000 = this;
         String var10002 = "E\u0001\u0019\u0006\u0019W\u000fLF\fQ";
         this.hf = com.xy.w.Class16.c("sc/d/59.png");
      } else if (var1 == -2) {
         var10000 = this;
         String var4 = "\u001c\u0000@\u0007@R^VA\u0013\u0001\u0004";
         this.hf = com.xy.w.Class16.c("sc/d/115.png");
      } else if (var1 == 0) {
         this.hf = null;
         var10000 = this;
      } else {
         this.hf = com.xy.w.Class15.h(String.valueOf(var1));
         var10000 = this;
      }

      Image var3;
      if (var2 >= 0) {
         String var10001 = "E\u0001\u0019\u0001\u0019Z\u0005";
         var3 = com.xy.w.Class16.c("sc/c/83");
      } else {
         var3 = null;
      }

      var10000.kr = var3;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }
}
