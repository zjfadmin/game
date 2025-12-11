package com.xy.n;

import com.xy.readbean.Door;
import com.xy.readbean.GoodFight;
import com.xy.v.Class12;

public class Class4 {
   private int a;
   private int b;
   public int c;
   private int d;
   public int e;
   public int f;
   private int g;
   private int h;
   private long i;
   public int j;
   private int k;

   public int a() {
      return this.j;
   }

   public Class4(int var1, long var2, Door var4) {
      this.k = var1;
      this.i = var2;
      this.a = Integer.parseInt(var4.getDoorid());
      String var10006 = var4.getDoorpoint();
      String var10007 = ";";
      int var5 = var10006.indexOf("|");
      this.h = Integer.parseInt(var4.getDoormap());
      this.b = Class12.ad(var4.getDoorpoint(), 0, var5);
      this.g = Class12.ad(var4.getDoorpoint(), var5 + 1, var4.getDoorpoint().length());
   }

   public void b(int var1) {
      this.d = var1;
   }

   public void c(int var1) {
      this.a = var1;
   }

   public int d() {
      return this.g;
   }

   public void e(int var1) {
      this.j = var1;
   }

   public void f(int var1) {
      this.e = var1;
   }

   public void g(int var1) {
      this.f = var1;
   }

   public long h() {
      return this.i;
   }

   public int i() {
      return this.h;
   }

   public void j(int var1) {
      this.g = var1;
   }

   public int k() {
      return this.c;
   }

   public Class4(long var1, GoodFight var3) {
      this.k = 2;
      this.i = var1;
      this.h = var3.getMap();
      this.b = var3.getX();
      this.g = var3.getY();
      this.d = 0;
   }

   public void l(int var1) {
      this.h = var1;
   }

   public void m(long var1) {
      this.i = var1;
   }

   public void n(int var1) {
      this.k = var1;
   }

   public void o(int var1) {
      this.b = var1;
   }

   public void p(int var1) {
      this.c = var1;
   }

   public int q() {
      return this.k;
   }

   public int r() {
      return this.a;
   }

   public int s() {
      return this.f;
   }

   public int t() {
      return this.d;
   }

   public int u() {
      return this.e;
   }

   public int v() {
      return this.b;
   }
}
