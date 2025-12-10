package com.xy;

import com.xy.readbean.Door;
import com.xy.readbean.GoodFight;

public class Class543 {
   private long a;
   public int b;
   public int c;
   private int d;
   private int e;
   public int f;
   private int g;
   private int h;
   private int i;
   public int j;
   private int k;

   public void a(int var1) {
      this.g = var1;
   }

   public void b(int var1) {
      this.h = var1;
   }

   public void c(int var1) {
      this.e = var1;
   }

   public long d() {
      return this.a;
   }

   public int e() {
      return this.c;
   }

   public Class543(int var1, long var2, Door var4) {
      this.d = var1;
      this.a = var2;
      this.g = Integer.parseInt(var4.getDoorid());
      var1 = var4.getDoorpoint().indexOf("|");
      this.i = Integer.parseInt(var4.getDoormap());
      this.e = Class394.b(var4.getDoorpoint(), 3 & 4, var1);
      this.h = Class394.b(var4.getDoorpoint(), var1 + (5 >> 2), var4.getDoorpoint().length());
   }

   public int f() {
      return this.k;
   }

   public int g() {
      return this.i;
   }

   public void h(int var1) {
      this.f = var1;
   }

   public void i(int var1) {
      this.i = var1;
   }

   public int j() {
      return this.f;
   }

   public int k() {
      return this.b;
   }

   public int l() {
      return this.d;
   }

   public void m(int var1) {
      this.c = var1;
   }

   public void n(int var1) {
      this.d = var1;
   }

   public void o(long var1) {
      this.a = var1;
   }

   public int p() {
      return this.e;
   }

   public int q() {
      return this.h;
   }

   public int r() {
      return this.j;
   }

   public Class543(long var1, GoodFight var3) {
      int var10001 = 3 >> 2;
      int var10011 = 1 ^ 3;
      super();
      this.d = var10011;
      this.a = var1;
      this.i = var3.getMap();
      this.e = var3.getX();
      this.h = var3.getY();
      this.k = var10001;
   }

   public void s(int var1) {
      this.b = var1;
   }

   public void t(int var1) {
      this.j = var1;
   }

   public int u() {
      return this.g;
   }

   public void v(int var1) {
      this.k = var1;
   }
}
