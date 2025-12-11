package com.xy.a.a;

import javax.swing.JLabel;

class Class10 {
   private com.xy.w.Class18 a;
   private JLabel b;
   private int c;
   private com.xy.i.Class4 d;
   // $VF: synthetic field
   final Class27 e;

   public void a() {
      if (this.c != 0) {
         if (Class27.tv(this.e) == this.c) {
            String var6;
            if (this.c == 1) {
               var6 = "3$o#ovuqn7. ";
               var6 = "sc/d/156.png";
            } else if (this.c == 2) {
               var6 = "\\I\u0000N\u0000\u001b\u001a\u001e\u0001ZAM";
               var6 = "sc/d/154.png";
            } else if (this.c == 3) {
               var6 = "3$o#ovuun7. ";
               var6 = "sc/d/152.png";
            } else if (this.c == 4) {
               var6 = "\\I\u0000N\u0000\u001b\u001a\u0012\u0001ZAM";
               var6 = "sc/d/158.png";
            } else {
               var6 = "";
            }

            this.a.dp(var6);
         } else {
            String var1;
            if (this.c == 1) {
               var1 = "3$o#ovupn7. ";
               var1 = "sc/d/157.png";
            } else if (this.c == 2) {
               var1 = "\\I\u0000N\u0000\u001b\u001a\u001f\u0001ZAM";
               var1 = "sc/d/155.png";
            } else if (this.c == 3) {
               var1 = "3$o#ovutn7. ";
               var1 = "sc/d/153.png";
            } else if (this.c == 4) {
               var1 = "\\I\u0000N\u0000\u001b\u001a\u0013\u0001ZAM";
               var1 = "sc/d/159.png";
            } else {
               var1 = "";
            }

            this.a.dp(var1);
         }
      }
   }

   // $VF: synthetic method
   static com.xy.i.Class4 b(Class10 var0) {
      return var0.d;
   }

   public Class10(Class27 var1, int var2, com.xy.q.Class30 var3) {
      this.e = var1;
      this.c = var2;
      String var10010 = "c$\u0003\u0002\u0002~xp";
      this.b = com.xy.q.Class1.k(116, 290, 32, 15, com.xy.q.Class49.c("#cCEB987"), com.xy.q.Class49.n);
      this.b.setText(String.valueOf(var2));
      this.b.setHorizontalAlignment(0);
      this.a = new com.xy.w.Class18();
      this.a();
      com.xy.q.Class30 var10000;
      if (var2 == 0) {
         var10000 = var3;
         String var10005 = "\\I\u0000N\u0000\u001b\u0018\u001f\u0001ZAM";
         this.a.dp("sc/d/175.png");
         this.a.setBounds(116, 281, 32, 32);
         this.d = new com.xy.i.Class4(null, 2, 181, var3);
         this.d.setBounds(100, 255, 60, 65);
      } else if (var2 == 1) {
         var10000 = var3;
         this.b.setBounds(51, 266, 32, 15);
         this.a.setBounds(47, 101, 102, 305);
         String var4 = "3$o\"ovwun7. ";
         this.d = new com.xy.i.Class4("sc/e/172.png", 2, 182, var3);
         this.d.setBounds(43, 246, 50, 126);
      } else if (var2 == 2) {
         var10000 = var3;
         this.b.setBounds(195, 187, 32, 15);
         this.a.setBounds(132, 183, 121, 223);
         String var5 = "\\I\u0000O\u0000\u001b\u0018\u001b\u0001ZAM";
         this.d = new com.xy.i.Class4("sc/e/171.png", 2, 183, var3);
         this.d.setBounds(186, 167, 50, 126);
      } else if (var2 == 3) {
         var10000 = var3;
         this.b.setBounds(82, 79, 32, 15);
         this.a.setBounds(63, 51, 192, 148);
         String var6 = "3$o\"ovwwn7. ";
         this.d = new com.xy.i.Class4("sc/e/170.png", 2, 184, var3);
         this.d.setBounds(73, 58, 50, 126);
      } else {
         if (var2 == 4) {
            this.b.setBounds(157, 403, 32, 15);
            this.a.setBounds(48, 389, 138, 107);
            String var10004 = "\\I\u0000O\u0000\u001b\u0018\u0019\u0001ZAM";
            this.d = new com.xy.i.Class4("sc/e/173.png", 2, 185, var3);
            this.d.setBounds(148, 383, 50, 126);
         }

         var10000 = var3;
      }

      var10000.add(this.b);
      var3.add(this.d);
      var3.add(this.a);
      if (var2 == 0) {
         var3.add(Class27.tt(var1));
      }
   }

   // $VF: synthetic method
   static JLabel c(Class10 var0) {
      return var0.b;
   }
}
