package com.xy.a.a;

import java.awt.Color;
import javax.swing.JLabel;

class Class56 extends com.xy.w.Class18 {
   // $VF: synthetic field
   final Class4 atf;
   private JLabel di;
   private com.xy.q.Class54 ft;

   // $VF: synthetic method
   static com.xy.q.Class54 ale(Class56 var0) {
      return var0.ft;
   }

   public Class56(Class4 var1, int var2, int var3) {
      this.atf = var1;
      if (var2 == 0) {
         this.ft = new com.xy.q.Class54(var1.eg());
         this.ft.setBounds(2, 2, 41, 41);
         this.add(this.ft);
         String var10010 = "~9dcdcdc";
         this.di = com.xy.q.Class1.f(0, 0, 45, 45, 0, com.xy.q.Class49.c("#c999999"), com.xy.q.Class49.bz);
         String var10004 = "暷斷";
         this.di.setText("暂无");
         this.add(this.di);
         String var10003 = ")>u9uons*3=";
         this.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
      } else if (var2 == 1) {
         this.ft = new com.xy.q.Class54(var1.eg());
         this.ft.setBounds(4, 4, 50, 50);
         this.add(this.ft);
         this.di = com.xy.q.Class1.f(0, 0, 59, 57, 0, Color.white, com.xy.q.Class49.bz);
         String var4;
         if (var3 == 0) {
            var4 = "衖杚";
            var4 = "衣服";
         } else if (var3 == 1) {
            var4 = "幠嬊";
            var4 = "帽子";
         } else if (var3 == 2) {
            var4 = "鞾嬇";
            var4 = "鞋子";
         } else if (var3 == 3) {
            var4 = "欻嘲";
            var4 = "武器";
         } else {
            var4 = "";
         }

         this.di.setText(var4);
         this.add(this.di);
         String var9 = "F4\u001a3\u001ac\u001b'[0";
         this.dq("sc/d/4.png");
      } else if (var2 == 2) {
         this.ft = new com.xy.q.Class54(var1.eg());
         this.ft.setBounds(4, 4, 50, 50);
         this.add(this.ft);
         String var8 = ".9r>rns*3=";
         this.dq("sc/d/4.png");
      } else {
         if (var2 == 3) {
            this.ft = new com.xy.q.Class54(var1.eg());
            this.ft.setBounds(11, 11, 38, 38);
            this.add(this.ft);
            String var10002 = "$VxQx\u0001g\u001b'[0";
            this.dq("sc/d/40.png");
         }
      }
   }
}
