package com.xy.a.q;

import com.xy.readbean.Goodstable;
import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JLabel;

class Class14 extends JComponent {
   private JLabel dh;
   private JLabel fs;
   // $VF: synthetic field
   final Class101 mp;
   private com.xy.q.Class54 ft;

   // $VF: synthetic method
   static com.xy.q.Class54 jr(Class14 var0) {
      return var0.ft;
   }

   public Class14(Class101 var1) {
      this.mp = var1;
      this.fs = com.xy.q.Class1.f(45, 7, 17, 12, 4, Color.red, com.xy.q.Class49.bz);
      this.dh = com.xy.q.Class1.f(0, 58, 75, 20, 0, Color.black, com.xy.q.Class49.bz);
      this.ft = new com.xy.q.Class54(var1.eg());
      String var10005 = "\u0018IDND\u001eEZ\u0005M";
      this.ft.dq("sc/d/4.png");
      this.ft.wp(com.xy.q.Class54.auw);
      this.ft.setBounds(8, 0, 59, 57);
      this.add(this.fs);
      this.add(this.ft);
      this.add(this.dh);
   }

   public void cb(Goodstable var1, int var2) {
      if (var1 == null) {
         this.ft.gs(0, null);
         String var10004 = "f7";
         this.ft.gt(com.xy.w.Class15.e("p0"));
         this.ft.setVisible(true);
         this.fs.setText("");
         this.dh.setText("");
      } else {
         this.ft.gs(1, var1);
         this.fs.setText(String.valueOf(var2));
         this.dh.setText(var1.getGoodsname());
      }
   }
}
