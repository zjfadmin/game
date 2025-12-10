package com.xy;

import com.google.gson.Gson;

public class Class695 {
   private Gson a = new Gson();
   private static Class695 b;


   private static Class695 a() {
      if (b == null) {
         b = new Class695();
      }

      return b;
   }

   public static Gson b() {
      return a().a;
   }
}
