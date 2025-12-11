package com.xy.q;

import java.awt.Color;
import java.awt.Font;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.swing.Icon;

public class Class34 {
   private Font a;
   private List<String> b;
   private String c;
   private Object d;
   private Map<String, Class34> e;
   private Icon f;
   private Color g;

   public void a(Class34 var1) {
      Class34 var2;
      if ((var2 = this.l(var1.c)) != null) {
         var2.a(var1);
      } else {
         if (this.e == null) {
            this.e = new HashMap<>();
         }

         if (this.b == null) {
            this.b = new LinkedList<>();
         }

         this.e.put(var1.c, var1);
         this.b.add(var1.c);
      }
   }

   public Class34(String var1, Object var2) {
      this.c = var1;
      this.d = var2;
   }

   public void b(Icon var1) {
      this.f = var1;
   }

   public void c(List<String> var1) {
      this.b = var1;
   }

   public String d() {
      return this.c;
   }

   public Color e() {
      return this.g;
   }

   public void f(Font var1) {
      this.a = var1;
   }

   public Icon g() {
      return this.f;
   }

   public void h(Map<String, Class34> var1) {
      this.e = var1;
   }

   public void i(Object var1) {
      this.d = var1;
   }

   public Object j() {
      return this.d;
   }

   public void k(String var1) {
      this.c = var1;
   }

   public Class34 l(String var1) {
      return this.e != null ? this.e.get(var1) : null;
   }

   public void m(Color var1) {
      this.g = var1;
   }

   public List<String> n() {
      return this.b;
   }

   public Map<String, Class34> o() {
      return this.e;
   }

   public Font p() {
      return this.a;
   }
}
