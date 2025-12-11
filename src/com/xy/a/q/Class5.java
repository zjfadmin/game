package com.xy.a.q;

import com.xy.readbean.Goodstable;
import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JLabel;

class Class5 extends JComponent {
   // $VF: synthetic field
   final Class105 gn;
   private com.xy.i.Class19 go;
   private JLabel fs;
   private int eg;
   private com.xy.q.Class54 ft;

   // $VF: synthetic method
   static int fa(Class5 var0) {
      return var0.eg;
   }

   // $VF: synthetic method
   static JLabel fb(Class5 var0) {
      return var0.fs;
   }

   // $VF: synthetic method
   static com.xy.q.Class54 fc(Class5 var0) {
      return var0.ft;
   }

   public Class5(Class105 var1) {
      this.gn = var1;
      this.fs = com.xy.q.Class1.f(0, 0, 51, 51, 0, Color.white, com.xy.q.Class49.n);
      this.ft = new com.xy.q.Class54(var1.eg());
      this.ft.wp(com.xy.q.Class54.aus);
      String var10007 = "\u000ewRpR Sd\u0013s";
      this.ft.mt(com.xy.w.Class16.m("sc/d/4.png", 5, 5, 5, 5, false));
      this.ft.setBounds(0, 0, 51, 51);
      var10007 = "Qw\rq\r&\u0015:RzE";
      this.go = new com.xy.i.Class19("sc/e/27.png", 1, 187, com.xy.q.Class49.bz, null, "", var1.eg());
      this.go.gw(this);
      this.go.setBounds(0, 52, 51, 18);
      this.add(this.fs);
      this.add(this.ft);
      this.add(this.go);
   }

   public void fd(int var1, Goodstable var2) {
      this.eg = var1;
      if (var2 == null) {
         this.fs.setVisible(true);
         this.ft.gs(0, null);
         this.ft.setVisible(true);
         this.go.setForeground(Color.GRAY);
         String var5 = "叻戮逴";
         this.go.setText("可打造");
         this.go.setBtn(0, null);
      } else {
         this.fs.setVisible(false);
         this.ft.gs(1, var2);
         if (var1 == 1) {
            this.go.setForeground(Color.white);
            String var3 = "摌陆";
            this.go.setText("摘除");
            var3 = "g\u001e;\u0018;O#Sd\u0013s";
            this.go.setBtn(1, "sc/e/27.png");
         } else {
            this.go.setForeground(Color.red);
            String var10002 = "徧扇适";
            this.go.setText("待打造");
            this.go.setBtn(0, null);
         }
      }
   }
}
