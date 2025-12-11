package com.xy.q;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Class26 extends JComponent {
   private boolean _do;
   private static Image g;
   private static Image acu;
   private JLabel dh;
   private static com.xy.v.Class32 adb = new com.xy.v.Class32(0, 0, 59, 57);
   private static com.xy.v.Class32 adc = new com.xy.v.Class32(1, 57, 58, 1);
   private Class54 ft;

   public Class26(Class30 var1) {
      this(var1, true);
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this._do) {
         var1.drawImage(acu, adc.d, adc.a, adc.b, adc.c, null);
      }

      var1.drawImage(g, adb.d, adb.a, adb.b, adb.c, null);
   }

   public void gs(int var1, Object var2) {
      this.ft.gs(var1, var2);
      if (this.dh != null) {
         this.dh.setVisible(this.ft.il() == 0);
      }
   }

   public Class26(Class30 var1, boolean var2) {
      this.ft = new Class54(var1);
      this.ft.setBounds(4, 4, 50, 50);
      this.add(this.ft);
      if (g == null) {
         String var10000 = "}:!=!m )`>";
         g = com.xy.w.Class16.c("sc/d/4.png");
      }

      if (var2 && acu == null) {
         String var3 = "A\n\u001d\r\u001dZ\u0002GB\u0007U";
         acu = com.xy.w.Class16.c("sc/d/30.png");
      }
   }

   public Class54 ep() {
      return this.ft;
   }

   public void dq(String var1) {
      if (var1 != null || this.dh != null) {
         if (this.dh == null) {
            this.dh = Class1.f(0, 21, 58, 16, 0, Color.gray, Class49.bz);
            this.dh.setVisible(false);
            this.add(this.dh);
         }

         this.dh.setText(var1);
         this.dh.setVisible(this.ft.il() == 0);
         this.setVisible(true);
      }
   }
}
