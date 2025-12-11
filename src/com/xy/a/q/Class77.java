package com.xy.a.q;

import com.xy.game.RolePet;
import com.xy.readbean.Buff;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

class Class77 extends com.xy.q.Class54 {
   private JLabel fs;
   // $VF: synthetic field
   final Class81 akw;
   private boolean cf;

   public Class77(Class81 var1) {
      super((var1).eg());
      this.akw = var1;
      String var10007 = "6Yj^j\u000b}\u00145T\"";
      this.dq("sc/d/18.png");
      this.fs = new JLabel();
      this.fs.setBounds(0, 29, 49, 20);
      this.fs.setFont(com.xy.q.Class49.ac);
      this.fs.setForeground(Color.green);
      this.fs.setHorizontalAlignment(4);
      this.add(this.fs);
   }

   public void ade(Buff var1) {
      byte var10001;
      Buff var10002;
      if (var1 != null) {
         var10001 = 17;
         var10002 = var1;
      } else {
         var10001 = 0;
         var10002 = var1;
      }

      this.gs(var10001, var10002);
      this.setVisible(true);
      this.fs.setText(var1 != null ? var1.getbName() : null);
      this.cf = var1 != null ? this.akw.yx().z(var1.getbId()) : false;
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.cf) {
         var1.drawImage(com.xy.w.Class15.c, 33, 0, 16, 16, null);
      }
   }

   @Override
   public void cw(MouseEvent var1) {
      Buff var2;
      if ((var2 = (Buff)this.jx()) != null) {
         RolePet var3;
         if ((var3 = this.akw.yx().getRolePet(Class69.aam(Class81.adm(this.akw)))) != null) {
            Class77 var10000;
            if (var2.getbId() == var3.getBb1()) {
               var10000 = this;
               var3.setBb1(0);
            } else if (var2.getbId() == var3.getBb2()) {
               var10000 = this;
               var3.setBb2(0);
            } else {
               if (this.akw.yx().z(var2.getbId())) {
                  return;
               }

               if (Class69.aap(Class81.adm(this.akw)) == 0) {
                  var3.setBb1(var2.getbId());
                  var10000 = this;
               } else {
                  var3.setBb2(var2.getbId());
                  var10000 = this;
               }
            }

            Class81.adm(var10000.akw).setVisible(false);
            this.akw.yx().bl();
            this.akw.g(Class81.adj(this.akw));
         }
      }
   }
}
