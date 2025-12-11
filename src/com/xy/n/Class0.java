package com.xy.n;

import com.xy.a.Class107;
import com.xy.a.Class127;
import com.xy.bean.CreepsMovePath;
import com.xy.bean.MonsterBean;
import com.xy.bean.PathPoint;
import com.xy.bean.RoleShow;
import com.xy.bean.StallBean;
import com.xy.readbean.Door;
import com.xy.readbean.MapModel;
import com.xy.readbean.NpcInfoBean;
import com.xy.script.ScriptTask;
import com.xy.text.GameView;
import com.xy.text.SystemData;
import com.xy.v.Class12;
import com.xy.v.Class22;
import com.xy.w.Class11;
import com.xy.w.Class15;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Class0 {
   public long a;
   public static final com.xy.d.Class10 b = new com.xy.d.Class10();
   private ArrayList<com.xy.d.Class4> c;
   public List<com.xy.d.Class9> d;
   com.xy.d.Class6 e = null;
   public com.xy.v.Class8 f;
   static int g = 50;
   public static final int h = 20;
   public List<com.xy.d.Class1> i;
   public List<com.xy.d.Class3> j;
   static int k = 95;
   public boolean l;
   static com.xy.w.Class1[] m = new com.xy.w.Class1[3];
   public Class2 n;
   static Color o = new Color(255, 255, 255, 96);
   public ConcurrentHashMap<String, com.xy.d.Class8> p = new ConcurrentHashMap<>();
   private ArrayList<com.xy.d.Class4> q;
   public MapModel r;
   public List<Door> s;
   private com.xy.d.Class6 t;

   public void a(long var1) {
      try {
         Iterator var4;
         Iterator var10000 = var4 = this.p.values().iterator();

         while (var10000.hasNext()) {
            com.xy.d.Class8 var3 = (com.xy.d.Class8)var4.next();
            var10000 = var4;
            var3.aj(var1, this);
         }

         int var6 = 0;
         int var9 = this.i.size();

         for (int var11 = var6; var11 < var9; var11 = var6) {
            com.xy.d.Class1 var12 = this.i.get(var6);
            var6++;
            var12.aj(var1, this);
         }

         var6 = 0;
         int var10 = this.d.size();

         for (int var13 = var6; var13 < var10; var13 = var6) {
            com.xy.d.Class9 var14 = this.d.get(var6);
            var6++;
            var14.aj(var1, this);
         }

         for (int var15 = var6 = this.j.size() - 1; var15 >= 0; var15 = var6) {
            com.xy.d.Class3 var16 = this.j.get(var6);
            var6--;
            var16.aj(var1, this);
         }
      } catch (Exception var5) {
         var5.printStackTrace();
      }
   }

   public void b(NpcInfoBean var1) {
      synchronized (this) {
         com.xy.d.Class1 var3 = new com.xy.d.Class1(var1);
         this.i.add(var3);
      }
   }

   public void c() {
      this.r = null;
      this.n = null;
      this.s.clear();
      this.r();
   }

   public void d(String var1, int var2, int var3) {
      synchronized (this) {
         String var10001 = "炙凢";
         if (!var1.equals("点击")) {
            com.xy.d.Class6 var7 = new com.xy.d.Class6(var1, var2, var3);
            if (this.t != null) {
               var7.e = this.t;
            }

            this.t = var7;
         } else {
            Class0 var10000;
            if (this.e == null) {
               var10000 = this;
               this.e = new com.xy.d.Class6(var1, var2, var3);
            } else {
               var10000 = this;
               this.e.b(var2, var3);
            }

            com.xy.d.Class6 var5;
            for (com.xy.d.Class6 var8 = var5 = var10000.t; var8 != null; var8 = var5 = var5.e) {
               if (var5 == this.e) {
                  return;
               }
            }

            this.e.e = null;
            if (this.t != null) {
               this.e.e = this.t;
            }

            this.t = this.e;
         }
      }
   }

   public void e(GameView var1) {
      int var2 = 0;
      int var3 = this.i.size();

      for (int var10000 = var2; var10000 < var3; var10000 = ++var2) {
         String var4;
         if ((var4 = this.i.get(var2).f()) != null) {
            boolean var10004 = false;
            String var5 = "/9W";
            var1.chatBox.addChat(0, "#Q[" + this.i.get(var2).ae() + "]" + var4);
         }
      }
   }

   public boolean f(int var1, int var2, int var3) {
      return this.n.h(var1, var2, var3);
   }

   public com.xy.d.Class8 g(String var1) {
      return this.p.remove(var1);
   }

   public com.xy.d.Class9 h(int var1) {
      int var2;
      for (int var10000 = var2 = this.d.size() - 1; var10000 >= 0; var10000 = --var2) {
         com.xy.d.Class9 var3;
         if ((var3 = this.d.get(var2)).au.getI() == var1) {
            return var3;
         }
      }

      return null;
   }

   public void i(StallBean var1, GameView var2) {
      if (var1.getState() == com.xy.d.Class3.r) {
         Class107 var6;
         if ((var6 = (Class107)var2.getFormManagement().l(153)) != null) {
            var6.agr(var1);
         }

         com.xy.d.Class8 var7;
         if ((var7 = this.j(var1.getRole())) != null) {
            var7.ap.setBooth_id(null);
            if (var2.roleUnit == var7) {
               var2.getFormManagement().f(152);
            }
         }

         int var5;
         for (int var8 = var5 = this.j.size() - 1; var8 >= 0; var8 = --var5) {
            if (this.j.get(var5).j.getId() == var1.getId()) {
               this.j.remove(var5);
               return;
            }
         }
      } else {
         com.xy.d.Class8 var3;
         if ((var3 = this.j(var1.getRole())) != null) {
            if (var2.roleUnit == var3) {
               if (var3.ap.getBooth_id() == null) {
                  ((Class127)var2.getFormManagement().j(152)).agr(var1);
               }

               var2.getFormManagement().f(152);
            }

            var3.ap.setBooth_id(new BigDecimal(var1.getId()));
            var3.al(var1.getX() + 50, var1.getY() + 135, 0);
         }

         int var4;
         for (int var10000 = var4 = this.j.size() - 1; var10000 >= 0; var10000 = --var4) {
            if (this.j.get(var4).j.getId() == var1.getId()) {
               this.j.get(var4).p(var1);
               return;
            }
         }

         this.j.add(new com.xy.d.Class3(var1));
      }
   }

   public com.xy.d.Class8 j(String var1) {
      return this.p.get(var1);
   }

   public boolean k(GameView var1) {
      com.xy.d.Class4 var2 = var1.XZUnit;
      if (var1.XZUnit != null) {
         if (!var1.roleUnit.k() && !(var2 instanceof com.xy.d.Class3)) {
            return false;
         } else if (var2 instanceof com.xy.d.Class8) {
            var2.b(var1);
            return true;
         } else if (!var1.roleUnit.bb()) {
            return false;
         } else {
            if (var2 instanceof com.xy.d.Class3 || ac(var2.ae, var2.v, var1)) {
               var2.b(var1);
            }

            return true;
         }
      } else {
         return false;
      }
   }

   public MapModel l() {
      return this.r;
   }

   public com.xy.d.Class1 m(long var1) {
      String var3 = String.valueOf(var1);

      int var4;
      for (int var10000 = var4 = 0; var10000 < this.i.size(); var10000 = ++var4) {
         com.xy.d.Class1 var5;
         if ((var5 = this.i.get(var4)).d.getNpcid().equals(var3)) {
            return var5;
         }
      }

      return null;
   }

   public void n(com.xy.d.Class8 var1) {
      synchronized (this) {
         if (this.j(var1.ae()) == null) {
            this.p.put(var1.ae(), var1);
         }
      }
   }

   public synchronized void o(Graphics var1, GameView var2) {
      this.q.clear();
      this.c.clear();
      Object var3 = null;
      int var4 = var2.getMousePoint().x + var2.mapCamera.q();
      int var5 = var2.getMousePoint().y + var2.mapCamera.m();
      int var6 = var2.roleUnit.al;
      boolean var7 = var2.XZ;
      boolean var8 = var2.getClient().drawCloud && !SystemData.isWing;

      List var9;
      int var10;
      for (int var10000 = var10 = (var9 = var2.roleData.getTaskSystem().getUnits()).size() - 1; var10000 >= 0; var10000 = --var10) {
         com.xy.d.Class0 var11;
         if (((var11 = (com.xy.d.Class0)var9.get(var10)).b.getType() == 5 || var11.b.getMap() == this.a) && var11.x(var2)) {
            if (var7 && var11.al == var6 && (var3 == null || ((com.xy.d.Class4)var3).v < var11.v) && var11.l(var4, var5)) {
               var3 = var11;
            }

            this.q.add(var11);
         }
      }

      for (int var37 = var10 = this.d.size() - 1; var37 >= 0; var37 = --var10) {
         com.xy.d.Class9 var25;
         if ((var25 = this.d.get(var10)).x(var2)) {
            if (var7 && var25.al == var6 && (var3 == null || ((com.xy.d.Class4)var3).v < var25.v) && var25.l(var4, var5)) {
               var3 = var25;
            }

            this.q.add(var25);
         }
      }

      Iterator<com.xy.d.Class8> var26;
      Iterator<com.xy.d.Class8> class8Iterator = var26 = this.p.values().iterator();

      while (class8Iterator.hasNext()) {
         com.xy.d.Class8 var14;
         if (!(var14 = (com.xy.d.Class8)var26.next()).x(var2)) {
            class8Iterator = var26;
         } else {
            if (var7 && var14.al == var6 && (var3 == null || ((com.xy.d.Class4)var3).v < var14.v) && var14.l(var4, var5)) {
               var3 = var14;
            }

            if (var8 && var14.n()) {
               class8Iterator = var26;
               this.c.add(var14);
            } else {
               this.q.add(var14);
               class8Iterator = var26;
            }
         }
      }

      var10 = 0;
      int var27 = this.i.size();

      for (int var39 = var10; var39 < var27; var39 = ++var10) {
         com.xy.d.Class1 var12;
         if ((var12 = this.i.get(var10)).x(var2)) {
            if (var7 && var12.al == var6 && (var3 == null || ((com.xy.d.Class4)var3).v < var12.v) && var12.l(var4, var5) && !Class12.h(var12.d.getNpctype())) {
               var3 = var12;
            }

            this.q.add(var12);
         }
      }

      if (SystemData.ISSTALL) {
         com.xy.d.Class3 class3;
         for (int var40 = var10 = this.j.size() - 1; var40 >= 0; var40 = --var10) {
            com.xy.d.Class3 var28;
            if ((var28 = this.j.get(var10)).x(var2)) {
               label201: {
                  if (var7 && var28.al == var6 && (var3 == null || !(var3 instanceof com.xy.d.Class3) || ((com.xy.d.Class4)var3).v < var28.v)) {
                     if (var28.m(var4, var5)) {
                        class3 = (com.xy.d.Class3)(var3 = var28);
                        break label201;
                     }

                     if (var3 != null && ((com.xy.d.Class4)var3).v < var28.v && var28.l(var4, var5)) {
                        var3 = var28;
                     }
                  }

                  class3 = var28;
               }

               if (class3.k()) {
                  this.q.add(var28);
               }
            }
         }
      }

      com.xy.d.Class10.c(this.q, 0, this.q.size() - 1);
      com.xy.d.Class10.c(this.c, 0, this.c.size() - 1);
      var2.XZUnit = (com.xy.d.Class4)var3;
      var10 = 0;
      int var29 = this.q.size();

      for (int var42 = var10; var42 < var29; var42 = var10) {
         com.xy.d.Class4 var43 = this.q.get(var10);
         var10++;
         var43.o(var1, (com.xy.d.Class4)var3, var2);
      }

      var10 = 0;
      int var30 = this.q.size();

      for (int var44 = var10; var44 < var30; var44 = var10) {
         com.xy.d.Class4 class4 = this.q.get(var10);
         var10++;
         ((com.xy.d.Class4)class4).i(var1);
      }

      Class0 var51;
      if (var8 && var2.roleUnit.n()) {
         if (SystemData.ISSTALL) {
            for (int var52 = var10 = this.j.size() - 1; var52 >= 0; var52 = --var10) {
               com.xy.d.Class3 var34;
               if ((var34 = this.j.get(var10)).x(var2)) {
                  var34.j(var1, (com.xy.d.Class4)var3, var2);
               }
            }
         }

         this.ad(var1, var2);
         var10 = 0;
         int var35 = this.c.size();

         for (int var53 = var10; var53 < var35; var53 = var10) {
            com.xy.d.Class4 var54 = this.c.get(var10);
            var10++;
            var54.o(var1, (com.xy.d.Class4)var3, var2);
         }

         var10 = 0;
         int var36 = this.c.size();

         for (int var55 = var10; var55 < var36; var55 = var10) {
            com.xy.d.Class4 class4 = this.c.get(var10);
            var10++;
            ((com.xy.d.Class4)class4).i(var1);
         }

         var51 = this;
      } else {
         var10 = 0;
         int var31 = this.c.size();

         for (int var46 = var10; var46 < var31; var46 = var10) {
            com.xy.d.Class4 var47 = this.c.get(var10);
            var10++;
            var47.o(var1, (com.xy.d.Class4)var3, var2);
         }

         var10 = 0;
         int var32 = this.c.size();

         for (int var48 = var10; var48 < var32; var48 = var10) {
            com.xy.d.Class4 class4 = this.c.get(var10);
            var10++;
            ((com.xy.d.Class4)class4).i(var1);
         }

         if (SystemData.ISSTALL) {
            for (int var50 = var10 = this.j.size() - 1; var50 >= 0; var50 = --var10) {
               com.xy.d.Class3 var33;
               if ((var33 = this.j.get(var10)).x(var2)) {
                  var33.j(var1, (com.xy.d.Class4)var3, var2);
               }
            }
         }

         var51 = this;
      }

      var51.t(var1, var2);
   }

   public int p() {
      return this.n.o;
   }

   public Class0() {
      this.i = new ArrayList<>();
      this.d = new ArrayList<>();
      this.j = new ArrayList<>();
      this.q = new ArrayList<>();
      this.c = new ArrayList<>();
   }

   public com.xy.d.Class9 q(int var1) {
      synchronized (this) {
         int var3;
         for (int var10000 = var3 = this.d.size() - 1; var10000 >= 0; var10000 = --var3) {
            com.xy.d.Class9 var4;
            if ((var4 = this.d.get(var3)).au.getI() == var1) {
               this.d.remove(var3);
               return var4;
            }
         }

         return null;
      }
   }

   public void r() {
      synchronized (this) {
         this.p.clear();
         this.i.clear();
         this.j.clear();
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void s(String var1, boolean var2, GameView var3) {
      if (var2 || !Class12.h(var1)) {
         Class0 var4 = this;
         synchronized (this) {
            Class0 var10000;
            label81: {
               try {
                  if (var2) {
                     this.d.clear();
                     if (Class12.h(var1)) {
                        return;
                     }
                  }

                  int var14 = 0;
                  HashMap var6 = null;
                  if (var1.startsWith("M")) {
                     String var10001 = "e";
                     if ((var14 = var1.indexOf("|")) == -1) {
                        return;
                     }

                     var6 = new HashMap();
                     int var7 = 1;
                     int var8;
                     int var19 = var8 = 0;

                     while (var19 != var14) {
                        var10001 = "/";
                        if ((var8 = var1.indexOf("#", var7 + 1)) == -1 || var8 > var14) {
                           var8 = var14;
                        }

                        var10001 = "G";
                        int var9;
                        if ((var9 = var1.indexOf("^", var7 + 1)) == -1) {
                           var9 = var14;
                        }

                        int var10 = Class12.ad(var1, var7, var9);
                        String var20 = var1.substring(var9 + 1, var8);
                        var10001 = "R";
                        String var10002 = "3";
                        String var11 = var20.replace("^", "*");
                        var6.put(var10, var11);
                        var7 = var8 + 1;
                        var19 = var8;
                     }

                     var14++;
                  }

                  int var15 = var14;
                  int var17;
                  int var21 = var17 = 0;

                  while (var21 != var1.length()) {
                     String var25 = "p";
                     if ((var17 = var1.indexOf("|", var15 + 1)) == -1) {
                        var17 = var1.length();
                     }

                     this.x(var1, var15, var17, var6);
                     var15 = var17 + 1;
                     var21 = var17;
                  }
               } catch (Exception var12) {
                  var10000 = var4;
                  var12.printStackTrace();
                  break label81;
               }

               var10000 = var4;
            }

            // $VF: monitorexit
         }
      }
   }

   public void t(Graphics var1, GameView var2) {
      if (this.t != null) {
         synchronized (this) {
            long var4 = Class22.l();
            com.xy.d.Class6 var6 = null;
            com.xy.d.Class6 var7;
            com.xy.d.Class6 var10000 = var7 = this.t;

            while (var10000 != null) {
               if (var7.c(var1, var4, var2.mapCamera)) {
                  if (var6 != null) {
                     var10000 = var7;
                     var6.e = var7.e;
                  } else {
                     this.t = var7.e;
                     var10000 = var7;
                  }

                  com.xy.d.Class6 var8 = var10000;
                  var10000 = var7 = var7.e;
                  var8.e = null;
               } else {
                  var6 = var7;
                  var10000 = var7 = var7.e;
               }
            }
         }
      }
   }

   public boolean u(int var1, int var2, int var3) {
      return this.n.c(var1, var2, var3);
   }

   public com.xy.d.Class9 v(int var1, int var2, int var3, ScriptTask var4) {
      int var5 = Integer.MAX_VALUE;
      boolean var6 = false;
      com.xy.d.Class9 var7 = null;

      int var8;
      for (int var10000 = var8 = this.d.size() - 1; var10000 >= 0; var10000 = --var8) {
         com.xy.d.Class9 var9;
         if ((var9 = this.d.get(var8)).au.getRobotid() == var1 && var9.au.getType() == 0) {
            int var10 = (var9.ae - var2) / 20;
            int var11 = (var9.v - var3) / 20;
            int var12 = var10 * var10 + var11 * var11;
            if ((var7 == null || var5 > var12) && (var7 == null || !var4.g(var9.au.getI().intValue()))) {
               var7 = var9;
               var6 = var4.g(var9.au.getI().intValue());
               var5 = var12;
               if (var12 < 160 && !var6) {
                  return var9;
               }
            }
         }
      }

      return var7;
   }

   public long w() {
      return this.a;
   }

   // $VF: synthetic method
   private void x(String var1, int var2, int var3, Map<Integer, String> var4) {
      int var5 = 0;
      int var6 = 0;
      String var7 = null;
      String var8 = null;
      String var9 = null;
      int var10 = 0;
      int var11;
      int var10000 = var11 = 0;

      while (var10000 != var3) {
         String var10001 = ":";
         if ((var11 = var1.indexOf("#", var2)) == -1 || var11 > var3) {
            var11 = var3;
         }

         if (var10 == 0) {
            var5 = Class12.ad(var1, var2, var11);
            var10000 = var11;
         } else {
            label132: {
               if (var10 == 1) {
                  String var30 = var7 = var1.substring(var2, var11);
                  var10001 = "*";
                  int var12;
                  if ((var12 = var30.indexOf("&")) != -1) {
                     var8 = var7.substring(var12 + 1);
                     var7 = var7.substring(0, var12);
                     var10000 = var11;
                     break label132;
                  }
               } else {
                  if (var10 == 2) {
                     var9 = var1.substring(var2, var11);
                     var10000 = var11;
                     break label132;
                  }

                  if (var10 == 3) {
                     var6 = Class12.ad(var1, var2, var11);
                     var10000 = var11;
                     break label132;
                  }

                  MonsterBean var20 = new MonsterBean();
                  var20.setRobotid(var5);
                  var20.setRobotname(var7);
                  var20.setRobottitle(var8);
                  var20.setRobotskin(var9);
                  var20.setRobottype(var6);
                  var20.setType(0);
                  int var13 = 0;
                  int var14;
                  var10000 = var14 = 0;

                  while (var10000 != var11) {
                     var10001 = "G";
                     if ((var14 = var1.indexOf("^", var2 + 1)) == -1 || var14 > var11) {
                        var14 = var11;
                     }

                     if (var13 == 0) {
                        var10000 = var14;
                        var20.setI(Class12.ad(var1, var2, var14));
                     } else if (var13 == 1) {
                        var10000 = var14;
                        var20.setX(Class12.ad(var1, var2, var14));
                     } else if (var13 == 2) {
                        var10000 = var14;
                        var20.setY(Class12.ad(var1, var2, var14));
                     } else {
                        label135: {
                           if (var1.charAt(var2) == 'S') {
                              var20.setType(Class12.ad(var1, var2 + 1, var14));
                              if (var20.getType() == 2) {
                                 var10000 = var11;
                                 break label132;
                              }
                           } else if (var1.charAt(var2) == 'L') {
                              int var15 = var4 != null ? var1.indexOf(",", var2 + 1) : -1;
                              if (var15 != -1) {
                                 if (var15 > var14) {
                                    var10000 = var14;
                                 } else {
                                    String var16;
                                    if ((var16 = var4.get(Class12.ad(var1, var2 + 1, var15))) == null) {
                                       var10000 = var14;
                                    } else {
                                       int var17 = Class12.ad(var1, var15 + 1, var14);
                                       CreepsMovePath var18 = new CreepsMovePath(var20.getX(), var20.getY(), var17, var16);
                                       var10000 = var14;
                                       var20.setMovePath(var18);
                                    }
                                 }
                                 break label135;
                              }
                           } else if (var1.charAt(var2) == 'H') {
                              int var23;
                              if ((var23 = var1.indexOf(",", var2 + 1)) != -1) {
                                 if (var23 > var14) {
                                    var10000 = var14;
                                 } else {
                                    int var26 = Class12.ad(var1, var2 + 1, var23);
                                    int var28 = Class12.ad(var1, var23 + 1, var14);
                                    if (var20.getHP() != null) {
                                       var20.getHP().setX(var26);
                                       var10000 = var14;
                                       var20.getHP().setY(var28);
                                    } else {
                                       var20.setHP(new PathPoint(var26, var28));
                                       var10000 = var14;
                                    }
                                 }
                                 break label135;
                              }
                           } else if (var1.charAt(var2) == 'G') {
                              com.xy.d.Class8 var24;
                              if ((var24 = this.ag(new BigDecimal(var1.substring(var2 + 1, var14)))) != null) {
                                 var10000 = var14;
                                 var20.setFollow(var24.ae());
                                 break label135;
                              }
                           } else if (var1.charAt(var2) == 'T') {
                              String[] var25 = var1.substring(var2 + 1, var14).split(",");
                              ArrayList var27 = new ArrayList();

                              int var29;
                              for (int var34 = var29 = 0; var34 < var25.length; var34 = var29) {
                                 var10001 = var25[var29];
                                 var29++;
                                 var27.add(Integer.parseInt(var10001));
                              }

                              if (var27.size() >= 2) {
                                 var20.setTaskList(var27);
                              }
                           }

                           var10000 = var14;
                        }
                     }

                     var13++;
                     var2 = var10000 + 1;
                     var10000 = var14;
                  }

                  com.xy.d.Class9 var21 = new com.xy.d.Class9(var20);
                  this.d.add(var21);
               }

               var10000 = var11;
            }
         }

         var10++;
         var2 = var10000 + 1;
         var10000 = var11;
      }
   }

   public void y() {
      Iterator var2;
      Iterator var10000 = var2 = this.p.values().iterator();

      while (var10000.hasNext()) {
         com.xy.d.Class8 var1;
         if ((var1 = (com.xy.d.Class8)var2.next()).ap.getMount_id() == 0) {
            var10000 = var2;
         } else {
            var1.af(null, var1.ap);
            var10000 = var2;
         }
      }
   }

   public Image z(int var1, int var2) {
      if (var1 >= 0 && var2 >= 0 && var2 < this.n.a.length && var1 < this.n.a[0].length) {
         Class1 var3;
         if ((var3 = this.n.a[var2][var1]) == null) {
            return null;
         } else {
            if (var3.a != 0 && var3.b == null) {
               this.n.j(var3);
            }

            return var3.b;
         }
      } else {
         return null;
      }
   }

   public void aa(RoleShow var1) {
      synchronized (this) {
         com.xy.d.Class8 var3;
         if ((var3 = this.j(var1.getRolename())) == null) {
            var3 = new com.xy.d.Class8(var1);
            this.p.put(var3.ae(), var3);
         } else {
            var3.bs(var1);
         }
      }
   }

   public void ab(MapModel var1, Class2 var2) {
      this.r = var1;
      this.n = var2;
      Class0 var10000;
      if (this.s != null) {
         var10000 = this;
         this.s.clear();
      } else {
         var10000 = this;
         this.s = new ArrayList<>();
      }

      var10000.l = !Class12.h(var1.getMapMonster());
      if (!Class12.h(var1.getMapDoor())) {
         List var3 = Class12.ak(var1.getMapDoor());

         int var4;
         for (int var6 = var4 = 0; var6 < var3.size(); var6 = ++var4) {
            Door var5;
            if ((var5 = this.f.c((String)var3.get(var4))) != null) {
               this.s.add(var5);
            }
         }
      }
   }

   public static boolean ac(int var0, int var1, GameView var2) {
      var0 = Math.abs(var2.roleUnit.ae - var0);
      var1 = Math.abs(var2.roleUnit.v - var1);
      if (var0 <= 305 && var1 <= 230) {
         return true;
      } else {
         String var10001 = "伈跑秓夦辴亊D读霈违乨炵";
         var2._do("你距离太远了,请靠近一点");
         return false;
      }
   }

   public void ad(Graphics var1, GameView var2) {
      var1.setColor(o);
      var1.fillRect(0, 0, var2.screenData.Screen_x, var2.screenData.Screen_y);
      int var3 = (int)(Class22.l() / 50L);
      int var4 = var2.mapCamera.m() - 64;
      var4 += 160 - var4 % 160;
      int var5 = 1 + this.n.i / 3600;
      int var6 = var4;
      int var7 = var4 + var2.screenData.Screen_y;

      for (int var10000 = var4; var10000 < var7; var10000 = var6) {
         int var8;
         var8 = (var8 = var6 / 160) * 1245 + var8 % 3 * 420 + var3;

         int var9;
         for (int var16 = var9 = 0; var16 < 3; var16 = ++var9) {
            int var10 = (var9 * 1200 + var8) % 3600;

            int var11;
            for (int var17 = var11 = -1; var17 < var5; var17 = ++var11) {
               Point var12;
               com.xy.w.Class1 var13;
               if ((var12 = var2.mapCamera.k(var10 + 3600 * var11, var6)) != null && (var13 = Class11.x(Class15.j[var9])) != null) {
                  var13.ab(var1, var12.x, var12.y);
               }
            }
         }

         var6 += 160;
      }
   }

   public int ae(Door var1, int var2, int var3) {
      if (var1 == null) {
         return 1001;
      } else {
         int[] var4;
         return (var4 = var1.getRects()) == null
            ? 1001
            : (Math.abs(Math.abs((var4[0] + var4[1]) / 2) - var2) + Math.abs(Math.abs((var4[2] + var4[3]) / 2) - var3)) / 2;
      }
   }

   public Door af(int var1, int var2, int var3) {
      if (this.s != null && this.s.size() != 0) {
         if (this.n.h) {
            Iterator var10;
            Iterator var13 = var10 = this.s.iterator();

            while (var13.hasNext()) {
               Door var9;
               int[] var11;
               if ((var11 = (var9 = (Door)var10.next()).getRects()) == null) {
                  var13 = var10;
               } else {
                  int var12 = (var11[0] + var11[1]) / 2;
                  int var8 = (var11[2] + var11[3]) / 2;
                  if (Math.abs(var12 - var1) < k && Math.abs(var8 - var2) < g) {
                     return var9;
                  }

                  var13 = var10;
               }
            }

            return null;
         } else if (!this.n.n(var1 / Class2.q, var2 / Class2.q, var3)) {
            return null;
         } else {
            Door var4 = null;
            int var5 = 1000;

            int var6;
            for (int var10000 = var6 = 0; var10000 < this.s.size(); var10000 = ++var6) {
               int var7;
               if ((var7 = this.ae(this.s.get(var6), var1, var2)) < var5 && var7 < 250) {
                  var5 = var7;
                  var4 = this.s.get(var6);
               }
            }

            return var4;
         }
      } else {
         return null;
      }
   }

   public com.xy.d.Class8 ag(BigDecimal var1) {
      Iterator var3;
      for (Iterator var10000 = var3 = this.p.values().iterator(); var10000.hasNext(); var10000 = var3) {
         com.xy.d.Class8 var2;
         if ((var2 = (com.xy.d.Class8)var3.next()).ap.getRole_id().compareTo(var1) == 0) {
            return var2;
         }
      }

      return null;
   }

   public int ah() {
      return this.n.i;
   }
}
