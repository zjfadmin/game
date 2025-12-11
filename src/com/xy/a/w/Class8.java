package com.xy.a.w;

import com.xy.game.NpcOption;
import java.awt.Dimension;
import javax.swing.JList;
import javax.swing.JScrollPane;

class Class8 {
   private JList<NpcOption> a;
   private int b;
   private JScrollPane c;
   // $VF: synthetic field
   final Class17 d;

   public void a(JList<NpcOption> var1) {
      this.a = var1;
      this.c.setViewportView(var1);
   }

   // $VF: synthetic method
   static JList b(Class8 var0) {
      return var0.a;
   }

   public void c() {
      this.b = 0;
      this.a.removeAll();
   }

   public void d(NpcOption var1) {
      this.a.add(var1);
      var1.setBounds(0, this.b, 149, var1.getHeight());
      this.b = this.b + var1.getHeight();
      this.a.setPreferredSize(new Dimension(149, this.b));
   }

   public Class8(Class17 var1, int var2, Class17 var3) {
      this.d = var1;
      this.a = new JList<>();
      this.c = com.xy.q.Class1.g(var2 == 0 ? 60 : 235, 110, 149, 155, this.a, 20);
      var3.add(this.c);
   }
}
