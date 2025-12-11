package com.xy.v;

import com.google.gson.Gson;

public class Class31 {
   private Gson a = new Gson();
   private static Class31 b;

   public static Gson a() {
      return b().a;
   }

   // $VF: synthetic method
   private static Class31 b() {
      if (b == null) {
         b = new Class31();
      }

      return b;
   }
}
