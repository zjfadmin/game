package com.xy;

import java.util.LinkedList;

public class Class370<T> {
   private LinkedList<T> a;
   private int b;

   public Class370(int var1) {
      this.a = null;
      this.b = var1;
      this.a = new LinkedList();
   }

   public void a(T var1) {
      synchronized(this) {
         if (this.a.size() < this.b) {
            this.a.addLast(var1);
         }
      }
   }

   public Class370() {
      this(115 & 62);
   }

   public T b() {
      synchronized(this) {
         return this.a.size() == 0 ? null : this.a.removeFirst();
      }
   }
}
