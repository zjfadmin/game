package com.xy;

import java.awt.Color;
import java.awt.Font;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.swing.Icon;

public class Class625 {
   private String a;
   private Icon b;
   private Map<String, Class625> c;
   private Font d;
   private Color e;
   private List<String> f;
   private Object g;

   public void a(Icon var1) {
      this.b = var1;
   }

   public Class625 b(String var1) {
      return this.c != null ? (Class625)this.c.get(var1) : null;
   }

   public Color c() {
      return this.e;
   }

   public void d(Class625 var1) {
      Class625 var2;
      if ((var2 = this.b(var1.a)) != null) {
         var2.d(var1);
      } else {
         if (this.c == null) {
            this.c = new HashMap();
         }

         if (this.f == null) {
            this.f = new LinkedList();
         }

         this.c.put(var1.a, var1);
         this.f.add(var1.a);
      }
   }

   public void e(String var1) {
      this.a = var1;
   }

   public void f(Font var1) {
      this.d = var1;
   }

   public Object g() {
      return this.g;
   }

   public String h() {
      return this.a;
   }

   public Icon i() {
      return this.b;
   }

   public Map<String, Class625> j() {
      return this.c;
   }

   public void k(Color var1) {
      this.e = var1;
   }

   public Font l() {
      return this.d;
   }

   public void m(Map<String, Class625> var1) {
      this.c = var1;
   }

   public List<String> n() {
      return this.f;
   }

   public void o(List<String> var1) {
      this.f = var1;
   }

   public Class625(String var1, Object var2) {
      this.a = var1;
      this.g = var2;
   }

   public void p(Object var1) {
      this.g = var1;
   }
}
