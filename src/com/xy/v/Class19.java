package com.xy.v;

import java.util.LinkedList;

public class Class19<T> {
   private int a;
   private LinkedList<T> b = null;

   public T a() {
      synchronized (this) {
         return this.b.size() == 0 ? null : this.b.removeFirst();
      }
   }

   public Class19() {
      this(50);
   }

   public void b(T var1) {
      synchronized (this) {
         if (this.b.size() < this.a) {
            this.b.addLast(var1);
         }
      }
   }

   public Class19(int var1) {
      this.a = var1;
      this.b = new LinkedList<>();
   }
}
