package com.xy.a.i;

import com.xy.bean.SuitOperBean;
import com.xy.entity.PartJade;
import com.xy.readbean.Skill;
import com.xy.readbean.StarSoul;
import com.xy.socket.Agreement;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class Class48 extends com.xy.w.Class18 implements MouseListener {
   // $VF: synthetic field
   final Class22 aze;
   private int ah;

   // $VF: synthetic method
   static void apn(Class48 var0, int var1) {
      var0.ah = var1;
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      com.xy.v.Class8 var2 = this.aze.yt();
      StarSoul var3 = Class22.vx(this.aze) != 0 ? var2.p(10000 + Class22.vx(this.aze)) : null;
      if (var3 != null) {
         Skill var4;
         if ((var4 = var2.ac(String.valueOf(var3.getLvl()))) != null) {
            ((com.xy.a.Class48)this.aze.zc().j(46)).qq(0, var4, this.ah);
         }
      }
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.ah == 0) {
         Graphics2D var2 = (Graphics2D)var1;
         var2.setComposite(com.xy.w.Class1.l);
         var2.setColor(Color.BLACK);
         var2.fillRect(0, 0, this.getWidth(), this.getHeight());
         var2.setComposite(com.xy.w.Class1.c);
      }
   }

   // $VF: synthetic method
   static int apo(Class48 var0) {
      return var0.ah;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      if (this.ah == 1) {
         SuitOperBean var2 = new SuitOperBean();
         var2.setType(116);
         var2.setJade(new PartJade(Class22.vx(this.aze) + 10000, 0));
         String var3 = Agreement.getSendTextAES("suitoperate", com.xy.v.Class31.a().toJson(var2));
         this.aze.za().k(var3);
      }
   }

   public Class48(Class22 var1) {
      super(com.xy.w.Class16.c("sc/bang/XPSkill.png"));
      String var10003 = "\u0005oYn\u0017b\u0011#.\\%g\u001f`\u001a\"\u0006b\u0011";
      this.aze = var1;
      this.addMouseListener(this);
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      this.aze.zc().j(46);
   }
}
