package com.xy.v;

import javax.swing.JComponent;

public class Class11 {
   private JComponent a;
   private String b;
   private String c;

   public String a() {
      return this.b;
   }

   public void b(JComponent var1) {
      this.a = var1;
   }

   public Class11(String var1, String var2) {
      this.c = var1;
      this.b = var2;
   }

   public Class11(String var1) {
      this.c = var1;
   }

   public void c(String var1) {
      this.c = var1;
   }

   public String d() {
      return this.c;
   }

   public void e(String var1) {
      this.b = var1;
   }

   public static String f(String var0) {
      int var10000 = (2 ^ 5) << 3 ^ 2;
      int var10001 = 2 << 3 ^ 5;
      int var10002 = (3 ^ 5) << 4 ^ 2 << 2 ^ 1;
      String var5;
      int var10003 = (var5 = var0).length();
      char[] var10005 = new char[var10003];
      int var3;
      int var10 = var3 = var10003 - 1;
      char[] var1 = var10005;
      int var4 = var10002;
      var10000 = var10;

      for (int var2 = var10000; var10000 >= 0; var10000 = var3) {
         var10001 = var3;
         int var11 = var5.charAt(var3);
         var3--;
         var1[var10001] = (char)(var11 ^ var2);
         if (var3 < 0) {
            break;
         }

         var11 = var3--;
         var1[var11] = (char)(var5.charAt(var11) ^ var4);
      }

      return new String(var1);
   }

   public JComponent g() {
      return this.a;
   }
}
