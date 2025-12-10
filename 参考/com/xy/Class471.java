package com.xy;

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

public class Class471 {
   private Class230 a;
   public List<Door> b;
   public Class603 c;
   public MapModel d;
   static Class8[] e;
   public static final int f = 20;
   public List<Class124> g = new ArrayList();
   private ArrayList<Class292> h = new ArrayList();
   public boolean i;
   static int j;
   public List<Class572> k = new ArrayList();
   public long l;
   public List<Class165> m = new ArrayList();
   static Color n;
   public static final Class493 o = new Class493();
   private ArrayList<Class292> p = new ArrayList();
   static int q;
   public Class409 r;
   public ConcurrentHashMap<String, Class183> s = new ConcurrentHashMap();
   Class230 t = null;

   public Class183 a(String var1) {
      return (Class183)this.s.get(var1);
   }

   public long b() {
      return this.l;
   }

   public Class572 c(int var1, int var2, int var3, ScriptTask var4) {
      int var5 = Integer.MAX_VALUE;
      int var6 = 2 & 5;
      Class572 var7 = null;

      int var8;
      for(int var10000 = var8 = this.k.size() - (3 >> 1); var10000 >= 0; var10000 = var8) {
         Class572 var9;
         if ((var9 = (Class572)this.k.get(var8)).p.getRobotid() == var1 && var9.p.getType() == 0) {
            int var10 = (var9.ab - var2) / (85 & 62);
            int var11 = (var9.al - var3) / (125 & 22);
            var10 = var10 * var10 + var11 * var11;
            if ((var7 == null || var5 > var10) && (var7 == null || !var4.e((long)var9.p.getI()))) {
               var7 = var9;
               boolean var12 = var4.e((long)var9.p.getI());
               var5 = var10;
               if (var10 < (7614 & 25313) && !var12) {
                  return var9;
               }
            }
         }

         --var8;
      }

      return var7;
   }

   public void d(String var1, boolean var2, GameView var3) {
      if (var2 || !Class394.o(var1)) {
         Class471 var12 = this;
         synchronized(this) {
            Class471 var10000;
            label78: {
               try {
                  if (var2) {
                     this.k.clear();
                     if (Class394.o(var1)) {
                        return;
                     }
                  }

                  int var11 = 0;
                  HashMap var4 = null;
                  int var5;
                  int var6;
                  int var14;
                  if (var1.startsWith("M")) {
                     if ((var11 = var1.indexOf("|")) == -4 >> 2) {
                        return;
                     }

                     var4 = new HashMap();
                     var5 = 3 & 5;
                     var14 = var6 = 5 >> 3;

                     while(true) {
                        if (var14 == var11) {
                           ++var11;
                           break;
                        }

                        if ((var6 = var1.indexOf("#", var5 + (2 ^ 3))) == -4 >> 2 || var6 > var11) {
                           var6 = var11;
                        }

                        int var7;
                        if ((var7 = var1.indexOf("^", var5 + --1)) == -4 >> 2) {
                           var7 = var11;
                        }

                        int var8 = Class394.b(var1, var5, var7);
                        String var13 = var1.substring(var7 + (4 ^ 5), var6).replace("^", "*");
                        var4.put(var8, var13);
                        var5 = var6 + (3 >> 1);
                        var14 = var6;
                     }
                  }

                  var5 = var11;

                  for(var14 = var6 = 3 >> 2; var14 != var1.length(); var14 = var6) {
                     if ((var6 = var1.indexOf("|", var5 + --1)) == -4 >> 2) {
                        var6 = var1.length();
                     }

                     this.v(var1, var5, var6, var4);
                     var5 = var6 + (5 >> 2);
                  }
               } catch (Exception var9) {
                  var10000 = var12;
                  var9.printStackTrace();
                  break label78;
               }

               var10000 = var12;
            }

         }
      }
   }

   public void e(NpcInfoBean var1) {
      synchronized(this) {
         Class165 var4 = new Class165(var1);
         this.m.add(var4);
      }
   }

   public boolean f(int var1, int var2, int var3) {
      return this.r.e(var1, var2, var3);
   }

   public void g(long var1) {
      try {
         Iterator var4;
         Iterator var10000 = var4 = this.s.values().iterator();

         while(var10000.hasNext()) {
            Class183 var3 = (Class183)var4.next();
            var10000 = var4;
            var3.o(var1, this);
         }

         int var6 = 3 >> 2;
         int var7 = this.m.size();

         int var8;
         for(var8 = var6; var8 < var7; var8 = var6) {
            Class165 var9 = (Class165)this.m.get(var6);
            ++var6;
            var9.o(var1, this);
         }

         var6 = 3 >> 2;
         var7 = this.k.size();

         for(var8 = var6; var8 < var7; var8 = var6) {
            Class572 var10 = (Class572)this.k.get(var6);
            ++var6;
            var10.o(var1, this);
         }

         for(var8 = var6 = this.g.size() - (4 ^ 5); var8 >= 0; var8 = var6) {
            Class124 var11 = (Class124)this.g.get(var6);
            --var6;
            var11.o(var1, this);
         }

      } catch (Exception var5) {
         var5.printStackTrace();
      }
   }

   public boolean h(GameView var1) {
      Class292 var2;
      if ((var2 = var1.XZUnit) != null) {
         if (!var1.roleUnit.g() && !(var2 instanceof Class124)) {
            return (boolean)(5 >> 3);
         } else if (var2 instanceof Class183) {
            int var10000 = --1;
            var2.a(var1);
            return (boolean)var10000;
         } else if (!var1.roleUnit.h()) {
            return (boolean)(5 >> 3);
         } else {
            if (var2 instanceof Class124 || ac(var2.ab, var2.al, var1)) {
               var2.a(var1);
            }

            return true;
         }
      } else {
         return false;
      }
   }

   public void i() {
      synchronized(this) {
         this.s.clear();
         this.m.clear();
         this.g.clear();
      }
   }

   public void j(String var1, int var2, int var3) {
      synchronized(this) {
         Class230 var5;
         if (!var1.equals("点击")) {
            var5 = new Class230(var1, var2, var3);
            if (this.a != null) {
               var5.b = this.a;
            }

            this.a = var5;
         } else {
            Class471 var10000;
            if (this.t == null) {
               this.t = new Class230(var1, var2, var3);
               var10000 = this;
            } else {
               this.t.b(var2, var3);
               var10000 = this;
            }

            for(Class230 var7 = var5 = var10000.a; var7 != null; var7 = var5 = var5.b) {
               if (var5 == this.t) {
                  return;
               }
            }

            this.t.b = null;
            if (this.a != null) {
               this.t.b = this.a;
            }

            this.a = this.t;
         }
      }
   }

   public Class572 k(int var1) {
      synchronized(this) {
         int var3;
         for(int var10000 = var3 = this.k.size() - (3 & 5); var10000 >= 0; var10000 = var3) {
            Class572 var4;
            if ((var4 = (Class572)this.k.get(var3)).p.getI() == var1) {
               this.k.remove(var3);
               return var4;
            }

            --var3;
         }

         return null;
      }
   }

   public Class165 l(long var1) {
      String var4 = String.valueOf(var1);

      int var2;
      for(int var10000 = var2 = 3 ^ 3; var10000 < this.m.size(); var10000 = var2) {
         Class165 var3;
         if ((var3 = (Class165)this.m.get(var2)).bb.getNpcid().equals(var4)) {
            return var3;
         }

         ++var2;
      }

      return null;
   }

   public Class183 m(String var1) {
      return (Class183)this.s.remove(var1);
   }

   public int n(Door var1, int var2, int var3) {
      if (var1 == null) {
         return 5101 & 28667;
      } else {
         int[] var4;
         return (var4 = var1.getRects()) == null ? 18415 & 15353 : (Math.abs(Math.abs((var4[5 >> 3] + var4[2 ^ 3]) / (5 >> 1)) - var2) + Math.abs(Math.abs((var4[1 ^ 3] + var4[--3]) / (1 ^ 3)) - var3)) / --2;
      }
   }

   public Class183 o(BigDecimal var1) {
      Iterator var3;
      for(Iterator var10000 = var3 = this.s.values().iterator(); var10000.hasNext(); var10000 = var3) {
         Class183 var2;
         if ((var2 = (Class183)var3.next()).r.getRole_id().compareTo(var1) == 0) {
            return var2;
         }
      }

      return null;
   }

   static {
      Class8[] var10000 = new Class8[--3];
      boolean var10002 = true;
      e = var10000;
      n = new Color(14591 & 18431, 14591 & 18431, 14591 & 18431, 126 & 97);
      q = 127 & 95;
      j = 126 & 51;
   }

   public void p(Graphics var1, GameView var2) {
      if (this.a != null) {
         synchronized(this) {
            long var4 = Class280.l();
            Class230 var6 = null;
            Class230 var3;
            Class230 var10000 = var3 = this.a;

            while(var10000 != null) {
               if (var3.a(var1, var4, var2.mapCamera)) {
                  if (var6 != null) {
                     var10000 = var3;
                     var6.b = var3.b;
                  } else {
                     this.a = var3.b;
                     var10000 = var3;
                  }

                  Class230 var8 = var10000;
                  var10000 = var3 = var3.b;
                  var8.b = null;
               } else {
                  var6 = var3;
                  var10000 = var3 = var3.b;
               }
            }

         }
      }
   }

   public Class572 q(int var1) {
      int var2;
      for(int var10000 = var2 = this.k.size() - (5 >> 2); var10000 >= 0; var10000 = var2) {
         Class572 var3;
         if ((var3 = (Class572)this.k.get(var2)).p.getI() == var1) {
            return var3;
         }

         --var2;
      }

      return null;
   }

   public void r() {
      this.d = null;
      this.r = null;
      this.b.clear();
      this.i();
   }

   public synchronized void s(Graphics var1, GameView var2) {
      this.h.clear();
      this.p.clear();
      Object var10 = null;
      int var4 = var2.getMousePoint().x + var2.mapCamera.j();
      int var5 = var2.getMousePoint().y + var2.mapCamera.h();
      int var6 = var2.roleUnit.ar;
      boolean var7 = var2.XZ;
      int var8 = var2.getClient().drawCloud && !SystemData.isWing ? --1 : 0;

      int var3;
      List var9;
      int var10000;
      for(var10000 = var3 = (var9 = var2.roleData.getTaskSystem().getUnits()).size() - (3 >> 1); var10000 >= 0; var10000 = var3) {
         Class526 var11;
         if (((var11 = (Class526)var9.get(var3)).y.getType() == --5 || (long)var11.y.getMap() == this.l) && var11.bd(var2)) {
            if (var7 && var11.ar == var6 && (var10 == null || ((Class292)var10).al < var11.al) && var11.c(var4, var5)) {
               var10 = var11;
            }

            this.h.add(var11);
         }

         --var3;
      }

      for(var10000 = var3 = this.k.size() - (3 >> 1); var10000 >= 0; var10000 = var3) {
         Class572 var14;
         if ((var14 = (Class572)this.k.get(var3)).bd(var2)) {
            if (var7 && var14.ar == var6 && (var10 == null || ((Class292)var10).al < var14.al) && var14.c(var4, var5)) {
               var10 = var14;
            }

            this.h.add(var14);
         }

         --var3;
      }

      Iterator var15;
      Iterator var18 = var15 = this.s.values().iterator();

      while(true) {
         while(var18.hasNext()) {
            Class183 var12;
            if (!(var12 = (Class183)var15.next()).bd(var2)) {
               var18 = var15;
            } else {
               if (var7 && var12.ar == var6 && (var10 == null || ((Class292)var10).al < var12.al) && var12.c(var4, var5)) {
                  var10 = var12;
               }

               if (var8 != 0 && var12.u()) {
                  var18 = var15;
                  this.p.add(var12);
               } else {
                  this.h.add(var12);
                  var18 = var15;
               }
            }
         }

         var3 = 3 ^ 3;
         int var16 = this.m.size();

         for(var10000 = var3; var10000 < var16; var10000 = var3) {
            Class165 var13;
            if ((var13 = (Class165)this.m.get(var3)).bd(var2)) {
               if (var7 && var13.ar == var6 && (var10 == null || ((Class292)var10).al < var13.al) && var13.c(var4, var5) && !Class394.o(var13.bb.getNpctype())) {
                  var10 = var13;
               }

               this.h.add(var13);
            }

            ++var3;
         }

         Class124 var17;
         Object var19;
         if (SystemData.ISSTALL) {
            for(var10000 = var3 = this.g.size() - (4 ^ 5); var10000 >= 0; var10000 = var3) {
               if ((var17 = (Class124)this.g.get(var3)).bd(var2)) {
                  label203: {
                     if (var7 && var17.ar == var6 && (var10 == null || !(var10 instanceof Class124) || ((Class292)var10).al < var17.al)) {
                        if (var17.e(var4, var5)) {
                           var19 = var10 = var17;
                           break label203;
                        }

                        if (var10 != null && ((Class292)var10).al < var17.al && var17.c(var4, var5)) {
                           var10 = var17;
                        }
                     }

                     var19 = var17;
                  }

                  if (((Class124)var19).g()) {
                     this.h.add(var17);
                  }
               }

               --var3;
            }
         }

         int var10001 = 2 & 5;
         Class493.f(this.h, 3 >> 2, this.h.size() - (3 & 5));
         Class493.f(this.p, 3 >> 2, this.p.size() - --1);
         var2.XZUnit = (Class292)var10;
         var3 = var10001;
         var16 = this.h.size();

         Class292 var20;
         for(var10000 = var3; var10000 < var16; var10000 = var3) {
            var20 = (Class292)this.h.get(var3);
            ++var3;
            var20.b(var1, (Class292)var10, var2);
         }

         var3 = 2 & 5;
         var16 = this.h.size();

         for(var10000 = var3; var10000 < var16; var10000 = var3) {
            var19 = this.h.get(var3);
            ++var3;
            ((Class292)var19).j(var1);
         }

         Class471 var21;
         if (var8 != 0 && var2.roleUnit.u()) {
            if (SystemData.ISSTALL) {
               for(var10000 = var3 = this.g.size() - (4 ^ 5); var10000 >= 0; var10000 = var3) {
                  if ((var17 = (Class124)this.g.get(var3)).bd(var2)) {
                     var17.d(var1, (Class292)var10, var2);
                  }

                  --var3;
               }
            }

            var10001 = 3 ^ 3;
            this.aa(var1, var2);
            var3 = var10001;
            var16 = this.p.size();

            for(var10000 = var3; var10000 < var16; var10000 = var3) {
               var20 = (Class292)this.p.get(var3);
               ++var3;
               var20.b(var1, (Class292)var10, var2);
            }

            var3 = 2 & 5;
            var16 = this.p.size();

            for(var10000 = var3; var10000 < var16; var10000 = var3) {
               var19 = this.p.get(var3);
               ++var3;
               ((Class292)var19).j(var1);
            }

            var21 = this;
         } else {
            var3 = 0;
            var16 = this.p.size();

            for(var10000 = var3; var10000 < var16; var10000 = var3) {
               var20 = (Class292)this.p.get(var3);
               ++var3;
               var20.b(var1, (Class292)var10, var2);
            }

            var3 = 3 ^ 3;
            var16 = this.p.size();

            for(var10000 = var3; var10000 < var16; var10000 = var3) {
               var19 = this.p.get(var3);
               ++var3;
               ((Class292)var19).j(var1);
            }

            if (SystemData.ISSTALL) {
               for(var10000 = var3 = this.g.size() - (3 >> 1); var10000 >= 0; var10000 = var3) {
                  if ((var17 = (Class124)this.g.get(var3)).bd(var2)) {
                     var17.d(var1, (Class292)var10, var2);
                  }

                  --var3;
               }
            }

            var21 = this;
         }

         var21.p(var1, var2);
         return;
      }
   }

   public int t() {
      return this.r.b;
   }

   public void u() {
      Iterator var2;
      Iterator var10000 = var2 = this.s.values().iterator();

      while(var10000.hasNext()) {
         Class183 var1;
         if ((var1 = (Class183)var2.next()).r.getMount_id() == 0) {
            var10000 = var2;
         } else {
            var1.ba((String)null, var1.r);
            var10000 = var2;
         }
      }

   }


   private void v(String var1, int var2, int var3, Map<Integer, String> var4) {
      int var5 = 3 >> 2;
      int var6 = 3 >> 2;
      String var7 = null;
      String var8 = null;
      String var9 = null;
      int var10 = 5 >> 3;

      int var11;
      for(int var10000 = var11 = 3 >> 2; var10000 != var3; var10000 = var11) {
         if ((var11 = var1.indexOf("#", var2)) == -4 >> 2 || var11 > var3) {
            var11 = var3;
         }

         if (var10 == 0) {
            var5 = Class394.b(var1, var2, var11);
            var10000 = var11;
         } else {
            label130: {
               if (var10 == --1) {
                  int var12;
                  if ((var12 = (var7 = var1.substring(var2, var11)).indexOf("&")) != -4 >> 2) {
                     var8 = var7.substring(var12 + --1);
                     var7 = var7.substring(3 & 4, var12);
                     var10000 = var11;
                     break label130;
                  }
               } else {
                  if (var10 == (1 ^ 3)) {
                     var9 = var1.substring(var2, var11);
                     var10000 = var11;
                     break label130;
                  }

                  if (var10 == --3) {
                     var6 = Class394.b(var1, var2, var11);
                     var10000 = var11;
                     break label130;
                  }

                  MonsterBean var19 = new MonsterBean();
                  var10000 = 3 >> 2;
                  int var10002 = 3 >> 2;
                  var19.setRobotid(var5);
                  var19.setRobotname(var7);
                  var19.setRobottitle(var8);
                  var19.setRobotskin(var9);
                  var19.setRobottype(var6);
                  var19.setType(var10002);
                  int var13 = var10000;

                  int var14;
                  for(var10000 = var14 = 3 ^ 3; var10000 != var11; var10000 = var14) {
                     if ((var14 = var1.indexOf("^", var2 + (3 & 5))) == -4 >> 2 || var14 > var11) {
                        var14 = var11;
                     }

                     if (var13 == 0) {
                        var10000 = var14;
                        var19.setI(Class394.b(var1, var2, var14));
                     } else if (var13 == (2 ^ 3)) {
                        var10000 = var14;
                        var19.setX(Class394.b(var1, var2, var14));
                     } else if (var13 == --2) {
                        var10000 = var14;
                        var19.setY(Class394.b(var1, var2, var14));
                     } else {
                        label133: {
                           if (var1.charAt(var2) == (119 & 91)) {
                              var19.setType(Class394.b(var1, var2 + --1, var14));
                              if (var19.getType() == (1 ^ 3)) {
                                 var10000 = var11;
                                 break label130;
                              }
                           } else {
                              int var15;
                              int var17;
                              if (var1.charAt(var2) == (94 & 109)) {
                                 var15 = var4 != null ? var1.indexOf(",", var2 + --1) : -1;
                                 if (var15 != -4 >> 2) {
                                    if (var15 > var14) {
                                       var10000 = var14;
                                    } else {
                                       String var16;
                                       if ((var16 = (String)var4.get(Class394.b(var1, var2 + --1, var15))) == null) {
                                          var10000 = var14;
                                       } else {
                                          var17 = Class394.b(var1, var15 + (4 ^ 5), var14);
                                          CreepsMovePath var18 = new CreepsMovePath(var19.getX(), var19.getY(), var17, var16);
                                          var10000 = var14;
                                          var19.setMovePath(var18);
                                       }
                                    }
                                    break label133;
                                 }
                              } else if (var1.charAt(var2) == (109 & 90)) {
                                 if ((var15 = var1.indexOf(",", var2 + (3 >> 1))) != -4 >> 2) {
                                    if (var15 > var14) {
                                       var10000 = var14;
                                    } else {
                                       int var23 = Class394.b(var1, var2 + (5 >> 2), var15);
                                       var17 = Class394.b(var1, var15 + (5 >> 2), var14);
                                       if (var19.getHP() != null) {
                                          var19.getHP().setX(var23);
                                          var10000 = var14;
                                          var19.getHP().setY(var17);
                                       } else {
                                          var19.setHP(new PathPoint(var23, var17));
                                          var10000 = var14;
                                       }
                                    }
                                    break label133;
                                 }
                              } else if (var1.charAt(var2) == (111 & 87)) {
                                 Class183 var21;
                                 if ((var21 = this.o(new BigDecimal(var1.substring(var2 + (2 ^ 3), var14)))) != null) {
                                    var10000 = var14;
                                    var19.setFollow(var21.aw());
                                    break label133;
                                 }
                              } else if (var1.charAt(var2) == (86 & 125)) {
                                 String[] var22 = var1.substring(var2 + (5 >> 2), var14).split(",");
                                 ArrayList var24 = new ArrayList();

                                 for(var10000 = var17 = 0; var10000 < var22.length; var10000 = var17) {
                                    String var10001 = var22[var17];
                                    ++var17;
                                    var24.add(Integer.parseInt(var10001));
                                 }

                                 if (var24.size() >= (1 ^ 3)) {
                                    var19.setTaskList(var24);
                                 }
                              }
                           }

                           var10000 = var14;
                        }
                     }

                     ++var13;
                     var2 = var10000 + 1;
                  }

                  Class572 var20 = new Class572(var19);
                  this.k.add(var20);
               }

               var10000 = var11;
            }
         }

         ++var10;
         var2 = var10000 + 1;
      }

   }

   public boolean w(int var1, int var2, int var3) {
      return this.r.b(var1, var2, var3);
   }

   public void x(RoleShow var1) {
      synchronized(this) {
         Class183 var3;
         if ((var3 = this.a(var1.getRolename())) == null) {
            var3 = new Class183(var1);
            this.s.put(var3.aw(), var3);
         } else {
            var3.w(var1);
         }
      }
   }

   public void y(GameView var1) {
      int var2 = 3 & 4;
      int var3 = this.m.size();

      for(int var10000 = var2; var10000 < var3; var10000 = var2) {
         String var4;
         if ((var4 = ((Class165)this.m.get(var2)).cl()) != null) {
            var1.chatBox.addChat(2 & 5, "#Q[" + ((Class165)this.m.get(var2)).aw() + "]" + var4);
         }

         ++var2;
      }

   }

   public Door z(int var1, int var2, int var3) {
      if (this.b != null && this.b.size() != 0) {
         Door var4;
         int var7;
         if (this.r.o) {
            Iterator var9;
            Iterator var11 = var9 = this.b.iterator();

            while(var11.hasNext()) {
               int[] var10;
               if ((var10 = (var4 = (Door)var9.next()).getRects()) == null) {
                  var11 = var9;
               } else {
                  var7 = (var10[3 & 4] + var10[3 >> 1]) / (1 ^ 3);
                  int var8 = (var10[--2] + var10[--3]) / (1 ^ 3);
                  if (Math.abs(var7 - var1) < q && Math.abs(var8 - var2) < j) {
                     return var4;
                  }

                  var11 = var9;
               }
            }

            return null;
         } else if (!this.r.j(var1 / Class409.a, var2 / Class409.a, var3)) {
            return null;
         } else {
            var4 = null;
            int var5 = 26607 & 7160;

            int var6;
            for(int var10000 = var6 = 3 >> 2; var10000 < this.b.size(); var10000 = var6) {
               if ((var7 = this.n((Door)this.b.get(var6), var1, var2)) < var5 && var7 < (11003 & 22014)) {
                  var5 = var7;
                  var4 = (Door)this.b.get(var6);
               }

               ++var6;
            }

            return var4;
         }
      } else {
         return null;
      }
   }

   public void aa(Graphics var1, GameView var2) {
      int var10002 = 2 & 5;
      var1.setColor(n);
      var1.fillRect(var10002, 3 >> 2, var2.screenData.Screen_x, var2.screenData.Screen_y);
      int var4 = (int)(Class280.l() / 50L);
      int var3 = var2.mapCamera.h() - (93 & 98);
      var3 += (6327 & 26600) - var3 % (12989 & 19938);
      int var5 = (3 & 5) + this.r.b / (20401 & 15966);
      int var6 = var3;
      var3 += var2.screenData.Screen_y;

      for(int var10000 = var6; var10000 < var3; var10000 = var6) {
         int var7 = (var7 = var6 / (27112 & 5815)) * (16383 & 17629) + var7 % --3 * (2484 & 30703) + var4;

         int var8;
         for(var10000 = var8 = 3 >> 2; var10000 < 3; var10000 = var8) {
            int var9 = (var8 * (7419 & 26548) + var7) % (15895 & 20472);

            int var10;
            for(var10000 = var10 = -4 >> 2; var10000 < var5; var10000 = var10) {
               Point var11;
               Class8 var12;
               if ((var11 = var2.mapCamera.i(var9 + (20208 & 16159) * var10, var6)) != null && (var12 = Class330.q(Class222.g[var8])) != null) {
                  var12.aa(var1, var11.x, var11.y);
               }

               ++var10;
            }

            ++var8;
         }

         var6 += 160;
      }

   }

   public int ab() {
      return this.r.j;
   }

   public static boolean ac(int var0, int var1, GameView var2) {
      var0 = Math.abs(var2.roleUnit.ab - var0);
      var1 = Math.abs(var2.roleUnit.al - var1);
      if (var0 <= (23473 & 9599) && var1 <= (11758 & 21239)) {
         return true;
      } else {
         var2.f("你距离太远了,请靠近一点");
         return (boolean)(3 >> 2);
      }
   }

   public MapModel ad() {
      return this.d;
   }

   public Image ae(int var1, int var2) {
      if (var1 >= 0 && var2 >= 0 && var2 < this.r.s.length && var1 < this.r.s[2 & 5].length) {
         <undefinedtype> var3;
         if ((var3 = this.r.s[var2][var1]) == null) {
            return null;
         } else {
            if (var3.a != 0 && var3.b == null) {
               this.r.a(var3);
            }

            return var3.b;
         }
      } else {
         return null;
      }
   }

   public void af(MapModel var1, Class409 var2) {
      this.d = var1;
      this.r = var2;
      Class471 var10000;
      if (this.b != null) {
         this.b.clear();
         var10000 = this;
      } else {
         this.b = new ArrayList();
         var10000 = this;
      }

      var10000.i = (boolean)(Class394.o(var1.getMapMonster()) ? 5 >> 3 : 1);
      if (!Class394.o(var1.getMapDoor())) {
         List var4 = Class394.ae(var1.getMapDoor());

         int var5;
         for(int var6 = var5 = 3 & 4; var6 < var4.size(); var6 = var5) {
            Door var3;
            if ((var3 = this.c.bo((String)var4.get(var5))) != null) {
               this.b.add(var3);
            }

            ++var5;
         }
      }

   }

   public void ag(Class183 var1) {
      synchronized(this) {
         if (this.a(var1.aw()) == null) {
            this.s.put(var1.aw(), var1);
         }
      }
   }

   public void ah(StallBean var1, GameView var2) {
      int var10000;
      if (var1.getState() == Class124.f) {
         Class9 var7;
         if ((var7 = (Class9)var2.getFormManagement().m(8121 & 24799)) != null) {
            var7.fm(var1);
         }

         Class183 var6;
         if ((var6 = this.a(var1.getRole())) != null) {
            var6.r.setBooth_id((BigDecimal)null);
            if (var2.roleUnit == var6) {
               var2.getFormManagement().n(15516 & 17403);
            }
         }

         int var5;
         for(var10000 = var5 = this.g.size() - (3 & 5); var10000 >= 0; var10000 = var5) {
            if (((Class124)this.g.get(var5)).d.getId() == var1.getId()) {
               this.g.remove(var5);
               return;
            }

            --var5;
         }

      } else {
         Class183 var4;
         if ((var4 = this.a(var1.getRole())) != null) {
            if (var2.roleUnit == var4) {
               if (var4.r.getBooth_id() == null) {
                  ((Class130)var2.getFormManagement().e(31416 & 1503)).fm(var1);
               }

               var2.getFormManagement().n(21496 & 11423);
            }

            var4.r.setBooth_id(new BigDecimal(var1.getId()));
            var4.bm(var1.getX() + (123 & 54), var1.getY() + (8439 & 24463), 2 & 5);
         }

         int var3;
         for(var10000 = var3 = this.g.size() - (3 & 5); var10000 >= 0; var10000 = var3) {
            if (((Class124)this.g.get(var3)).d.getId() == var1.getId()) {
               ((Class124)this.g.get(var3)).f(var1);
               return;
            }

            --var3;
         }

         this.g.add(new Class124(var1));
      }
   }
}
