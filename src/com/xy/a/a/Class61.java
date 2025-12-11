package com.xy.a.a;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;

class Class61 extends JComponent implements MouseListener {
   private int ha;
   private int cb;
   private int ae;
   private Image hf;
   // $VF: synthetic field
   final Class50 awm;
   private Image bp;

   @Override
   public void mouseExited(MouseEvent var1) {
      if (this.ae == -1 || this.ae == -2) {
         this.awm.zc().f(46);
      }
   }

   public void cc(int var1, int var2) {
      this.ae = var1;
      this.cb = var2;
      Class61 var10000;
      if (var1 == -1) {
         var10000 = this;
         String var10002 = "ou3r3#%8lx{";
         this.bp = com.xy.w.Class16.c("sc/d/59.png");
      } else if (var1 == -2) {
         var10000 = this;
         String var4 = "&\u0010z\u0017zBdF{\u0003;\u0014";
         this.bp = com.xy.w.Class16.c("sc/d/115.png");
      } else if (var1 == 0) {
         this.bp = null;
         var10000 = this;
      } else {
         this.bp = com.xy.w.Class15.h(String.valueOf(var1));
         var10000 = this;
      }

      Image var3;
      if (var2 >= 0) {
         String var10001 = "ou3u3./";
         var3 = com.xy.w.Class16.c("sc/c/83");
      } else {
         var3 = null;
      }

      var10000.hf = var3;
   }

   @Override
   protected void paintComponent(Graphics var1) {
      var1.drawImage(Class50.gu(), 0, 0, this.getWidth(), this.getHeight(), null);
      if (this.bp != null) {
         var1.drawImage(this.bp, 6, 6, 50, 50, null);
      }

      if (this.hf != null) {
         var1.drawImage(this.hf, 40, 7, 15, 15, null);
      }
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      if (this.ae == -1 || this.ae == -2) {
         com.xy.a.Class48 var2 = (com.xy.a.Class48)this.awm.zc().j(46);
         if (this.ae == -2) {
            String var3 = "P\u0007拳肨桏}杙菢厥|P'P\f菄厃拳肨桏监旊彚Iv\u0001d]厹啗儨烊千命y伌畽掣烩辴监耩鬑乊斣杺况珴菢忤nP'A{原啱儎呺瀆斣_杜冓珒菄忂[屔匃狣恲|H";
            var2.bq("#R技能格(未获取)#r#Y获取技能格的方式:#r1.召唤兽点化后,使用提炼过的聚魄丹时有几率获得;#r2.召唤兽启灵时,有几率获得(封印状态);");
            return;
         }

         if (this.ae == -1) {
            String var10001 = "?O抜胫栠>尝卦55n觵尝抖胡株斥弙&5n'2昘雫戎斋叹隓本弜吹4囻孌期曨髎皘榔玛觵尝?'5n$2佩甴吹魞丯弜吹'";
            var2.bq("#Y技能格(封印)#r解封技能格方式:#r1.明雷战斗可随机开启(园子有更高的概率解封);#r2.使用启魂丹开启;");
         }
      }
   }

   public Class61(Class50 var1, int var2) {
      this.awm = var1;
      this.ha = var2;
      this.addMouseListener(this);
   }
}
