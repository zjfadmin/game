package com.xy.a;

import com.xy.bean.UseCardBean;
import com.xy.game.RoleData;
import com.xy.text.ScreenData;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JLabel;

class Class35 extends JComponent implements MouseListener {
   boolean _do;
   private int ha;
   private com.xy.w.Class18 nn;
   boolean dr;
   private List<Class66> eq;
   private com.xy.i.Class18 ce;
   // $VF: synthetic field
   final Class74 q;

   public Class35(Class74 var1) {
      this.q = var1;
      this.dr = true;
      this._do = false;
      this.eq = new ArrayList<>();
      String var10006 = "8HdHd\u001f}";
      this.nn = new com.xy.w.Class18(com.xy.w.Class16.m("sc/c/46", 6, 6, 6, 6, false));
      String var10005 = "[C\u0007C\u0007\u0015\u001d";
      this.ce = new com.xy.i.Class18("sc/c/55", 1, 7, var1.eg());
      this.add(this.nn);
      this.add(this.ce);
      this.addMouseListener(this);
      this.nn.setVisible(false);
      this.ce.setVisible(false);
      this.l();
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   public void h() {
      if (this.dr && !this._do) {
         this._do = true;
         this.nn.setVisible(this._do);
         this.ce.setVisible(this._do);
         this.add(this.nn);
      }
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      this.h();
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      Point var2;
      if (this.dr
         && this._do
         && (
            (var2 = this.q.afx.getMousePoint()).x < this.getX()
               || var2.x > this.getX() + this.getWidth()
               || var2.y < this.getY()
               || var2.y > this.getY() + this.getHeight()
         )) {
         this._do = false;
         this.nn.setVisible(this._do);
         this.ce.setVisible(this._do);
      }
   }

   // $VF: synthetic method
   static com.xy.w.Class18 mx(Class35 var0) {
      return var0.nn;
   }

   public void l() {
      if (this.ha == 0) {
         this.setVisible(false);
      } else {
         ScreenData var1 = this.q.afx.screenData;
         Class35 var7;
         if (this.dr) {
            int var2 = this.ha * 24 + 8 + 13;
            byte var3 = 40;

            int var4;
            for (int var10000 = var4 = 0; var10000 < this.ha; var10000 = var4) {
               Class66 var5 = this.eq.get(var4);
               int var10003 = var2 - 8 - (var4 + 1) * 24;
               var4++;
               var5.setBounds(var10003, 0, 24, 40);
               var5.setVisible(true);
            }

            var7 = this;
            this.nn.setBounds(13, 0, this.ha * 24 + 8, 40);
            this.ce.setBounds(0, 2, 13, 37);
            this.setBounds(var1.getScreen_x() - var2, 78, var2, var3);
         } else {
            int var6;
            for (int var8 = var6 = 0; var8 < this.ha; var8 = var6) {
               Class66 var9 = this.eq.get(var6);
               var6++;
               var9.setVisible(false);
            }

            var7 = this;
            this.ce.setBounds(0, 2, 11, 37);
            this.setBounds(var1.Screen_x - 11, 78, 11, 40);
         }

         var7.setVisible(true);
      }
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   public void t() {
      RoleData var1 = this.q.yx();
      int var2 = 0;
      Iterator var4;
      Iterator var10000 = var4 = var1.limitMap.values().iterator();

      while (var10000.hasNext()) {
         UseCardBean var3;
         if (!(var3 = (UseCardBean)var4.next()).getType().equals("限时礼包")) {
            if (var3.getType().equals("靓号")) {
               var10000 = var4;
               continue;
            }

            Class66 var5 = var2 < this.eq.size() ? this.eq.get(var2) : null;
            if (var5 == null) {
               var5 = new Class66(this.q);
               this.add(var5);
               this.eq.add(var5);
            }

            Class66.wi(var5).gs(10, var3);
            long var6;
            if ((var6 = Math.max(var3.getUseTime(), 0)) == 0L) {
               Class66.wj(var5).setText(null);
            } else if (var6 < 60L) {
               Class66.wj(var5).setForeground(Color.red);
               JLabel var9 = Class66.wj(var5);
               StringBuilder var10001 = new StringBuilder(String.valueOf(var6));
               String var10002 = "&";
               var9.setText(var10001.append("m").toString());
            } else if (var6 < 1440L) {
               Class66.wj(var5).setForeground(Color.yellow);
               JLabel var10 = Class66.wj(var5);
               StringBuilder var13 = new StringBuilder(String.valueOf(var6 / 60L));
               String var16 = "@";
               var10.setText(var13.append("h").toString());
            } else {
               Class66.wj(var5).setForeground(Color.green);
               JLabel var11 = Class66.wj(var5);
               StringBuilder var14 = new StringBuilder(String.valueOf(var6 / 1440L));
               String var17 = "/";
               var11.setText(var14.append("d").toString());
            }

            var2++;
         }

         var10000 = var4;
      }

      int var8;
      for (int var12 = var8 = var2; var12 < this.eq.size(); var12 = var8) {
         this.eq.get(var8++).t();
      }

      this.ha = var2;
      this.l();
   }

   // $VF: synthetic method
   static com.xy.i.Class18 my(Class35 var0) {
      return var0.ce;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }
}
