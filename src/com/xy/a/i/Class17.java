package com.xy.a.i;

import com.xy.bean.SuitOperBean;
import com.xy.entity.PartJade;
import com.xy.q.Class49;
import com.xy.readbean.StarSoul;
import com.xy.socket.Agreement;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;
import javax.swing.JLabel;

class Class17 extends JComponent implements MouseListener {
   private boolean gk;
   private JLabel dh;
   // $VF: synthetic field
   final Class22 qv;
   private com.xy.w.Class18 dm;
   private int ah;

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      if (this.gk) {
         StarSoul var3 = this.qv.yt().p(this.ah);
         long var4 = this.qv.yx().getPackRecord().getStarSoulType(var3.getId()) % 10000L;
         ((com.xy.a.Class48)this.qv.zc().j(46)).qn(var3, var4);
      }
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      this.qv.afx.getFormManagement().f(46);
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      if (this.gk) {
         ((Class3)this.qv.zc().j(141)).g(this.ah);
      } else {
         SuitOperBean var2 = new SuitOperBean();
         var2.setType(115);
         var2.setJade(new PartJade(Class22.vx(this.qv) + 10000, this.ah));
         String var3 = Agreement.getSendTextAES("suitoperate", com.xy.v.Class31.a().toJson(var2));
         this.qv.za().k(var3);
      }
   }

   @Override
   protected void paintChildren(Graphics var1) {
      super.paintChildren(var1);
      if (this.gk) {
         if (Class22.vv() == null) {
            String var10000 = "}2!3o?i~V\u0001L0m:J\u001d %m!";
            Class22.vy(com.xy.w.Class11.f("sc/bang/XPBackDL.tcp", null));
         }

         Class22.vv().j(com.xy.v.Class22.l(), 0);
         Class22.vv().ab(var1, 14, 30);
      }
   }

   public Class17(Class22 var1) {
      this.qv = var1;
      this.dh = com.xy.q.Class1.f(0, 0, 28, 16, 0, Color.white, Class49.bm);
      String var10007 = "t%(\"(r4hw(`";
      this.dm = new com.xy.w.Class18("sc/d/43.png");
      this.dm.setBounds(0, 16, 28, 28);
      this.dm.addMouseListener(this);
      this.add(this.dh);
      this.add(this.dm);
      this.setVisible(false);
   }

   // $VF: synthetic method
   static int lz(Class17 var0) {
      return var0.ah;
   }

   public void ma(int var1, boolean var2, Point var3) {
      this.ah = var1;
      this.gk = var2;
      if (var1 == 0) {
         this.setVisible(false);
      } else {
         StarSoul var4 = this.qv.yt().p(var1);
         this.dh.setText(var4.getName());
         this.setBounds(var3.x - 14, var3.y - 30, 28, 44);
         this.setVisible(true);
      }
   }
}
