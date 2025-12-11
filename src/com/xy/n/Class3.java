package com.xy.n;

import com.xy.bean.Coordinates;
import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.readbean.GoodFight;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MapModel;
import com.xy.richtext.InputBean;
import com.xy.script.ScriptEnd;
import com.xy.script.ScriptOpen;
import com.xy.v.Class31;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Class3 {
   List<String> a;
   List<Class4> b;
   List<Integer> c;
   List<Class5> d;
   List<Integer> e;
   com.xy.v.Class8 f;
   Map<Integer, Class8> g = new HashMap<>();

   public Class3(com.xy.v.Class8 var1) {
      this.d = new ArrayList<>();
      this.c = new ArrayList<>();
      this.b = new ArrayList<>();
      this.e = new ArrayList<>();
      this.a = new ArrayList<>();
      this.f = var1;
   }

   public List<Object> a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RoleData var10) {
      synchronized (this) {
         if (var9 == 1) {
            ArrayList var21 = new ArrayList();
            ScriptOpen var23 = new ScriptOpen(4, 0L, var5, var6, var7, var8);
            ScriptEnd var26 = new ScriptEnd(var5, var6, var7, var8);
            var21.add(var26);
            var21.add(var23);
            return var21;
         } else {
            this.c.clear();
            this.d.clear();
            this.j(var1, var2, var3, var4, var10);
            Class5 var12 = null;
            Class5 var38;
            if (var1 != var5) {
               this.d.add(new Class5(var1, var2, var3, var4));

               Class3 var37;
               do {
                  Class5 var13 = this.d.get(0);

                  int var14;
                  for (int var10000 = var14 = this.d.size() - 1; var10000 >= 0; var10000 = --var14) {
                     if (Class5.c(var13) > Class5.c(this.d.get(var14))) {
                        var13 = this.d.get(var14);
                     }
                  }

                  this.d.remove(var13);
                  Class8 var24 = this.e(Class5.d(var13));
                  if (var24 == null) {
                     var37 = this;
                  } else {
                     List var15 = var24.b();
                     boolean var16 = true;

                     int var17;
                     for (int var34 = var17 = (var15 != null ? var15.size() : 0) - 1; var34 >= 0; var34 = --var17) {
                        Class4 var18;
                        if ((var18 = (Class4)var15.get(var17)).i() != Class5.d(var13)) {
                           if (var16 && var18.i() == var5) {
                              var16 = false;
                           }

                           if (!var13.j(var18.r()) && !var13.f(var18.i()) && !this.c.contains(var18.i())) {
                              Class5 var19 = new Class5(var18, var13);
                              this.d.add(var19);
                           }
                        }
                     }

                     if (Class5.d(var13) == var1) {
                        for (int var35 = var17 = this.b.size() - 1; var35 >= 0; var35 = --var17) {
                           Class4 var32;
                           if ((var32 = this.b.get(var17)).i() != Class5.d(var13)) {
                              if (var16 && var32.i() == var5) {
                                 var16 = false;
                              }

                              if (!var13.j(var32.r()) && !var13.f(var32.i()) && !this.c.contains(var32.i())) {
                                 Class5 var33 = new Class5(var32, var13);
                                 this.d.add(var33);
                              }
                           }
                        }
                     }

                     if (var16) {
                        this.c.add(Class5.d(var13));
                     }

                     for (int var36 = var17 = this.d.size() - 1; var36 >= 0; var36 = --var17) {
                        if (var12 != null && Class5.c(var12) <= Class5.c(this.d.get(var17))) {
                           this.d.remove(var17);
                        } else if (Class5.d(this.d.get(var17)) == var5) {
                           if (var12 == null) {
                              var12 = this.d.get(var17);
                           } else {
                              var12 = this.d.get(var17);
                           }
                        }
                     }

                     var37 = this;
                  }
               } while (var37.d.size() != 0);

               var38 = var12;
            } else {
               var38 = var12 = new Class5(var1, var2, var3, var4);
            }

            if (var38 == null) {
               return null;
            } else {
               ArrayList var22 = new ArrayList();
               ScriptOpen var25 = new ScriptOpen(var6, var7, var8);
               ScriptEnd var27 = new ScriptEnd(var5, var6, var7, var8);
               var22.add(var27);
               var22.add(var25);
               Class5 var28;
               Class5.l(var28 = new Class5(var5, var6, var7, var8), var12);

               for (var38 = var28; Class5.a(var38) != null; var38 = var28) {
                  label123: {
                     if (Class5.b(var28) == null) {
                        if (Class5.d(var28) == Class5.d(Class5.a(var28))) {
                           Class5 var31 = this.b(Class5.a(var28), var28);
                           var38 = var28;
                           g(var31, var22);
                           break label123;
                        }
                     } else if (var28.k() == Class5.a(var28).k()) {
                        g(this.b(Class5.a(var28).h(), var28.h()), var22);
                     }

                     var38 = var28;
                  }

                  if (Class5.b(var28 = Class5.a(var38)) != null) {
                     h(var22, var28);
                  }
               }

               this.c.clear();
               this.d.clear();
               return var22;
            }
         }
      }
   }

   public Class5 b(Class5 var1, Class5 var2) {
      this.d.clear();
      Class5 var3 = null;
      this.d.add(new Class5(Class5.d(var1), Class5.i(var1), Class5.e(var1), Class5.g(var1)));
      Class8 var4 = this.e(Class5.d(var1));
      if (var4 == null) {
         return this.d.get(0);
      } else {
         List var5 = var4.b();

         do {
            Class5 var6 = this.d.get(0);

            int var7;
            for (int var10000 = var7 = this.d.size() - 1; var10000 >= 0; var10000 = --var7) {
               if (Class5.c(var6) > Class5.c(this.d.get(var7))) {
                  var6 = this.d.get(var7);
               }
            }

            this.d.remove(var6);
            if (Class5.i(var6) != Class5.i(var2) || Class5.e(var6) != Class5.e(var2) || Class5.g(var6) != Class5.g(var2)) {
               for (int var12 = var7 = (var5 != null ? var5.size() : 0) - 1; var12 >= 0; var12 = --var7) {
                  Class4 var8;
                  if ((var8 = (Class4)var5.get(var7)).i() == var8.s() && !var6.j(var8.r())) {
                     Class5 var9 = new Class5(var8, var6);
                     Class5.m(var9, Class5.c(var9) + 10000);
                     this.d.add(var9);
                  }
               }

               this.d.add(new Class5(Class5.d(var2), Class5.i(var2), Class5.e(var2), Class5.g(var2), var6));
            }

            for (int var13 = var7 = this.d.size() - 1; var13 >= 0; var13 = --var7) {
               if (var3 != null && Class5.c(var3) <= Class5.c(this.d.get(var7))) {
                  this.d.remove(var7);
               } else if (Class5.i(this.d.get(var7)) == Class5.i(var2) && Class5.e(this.d.get(var7)) == Class5.e(var2)) {
                  if (var3 == null) {
                     var3 = this.d.get(var7);
                  } else {
                     var3 = this.d.get(var7);
                  }
               }
            }
         } while (this.d.size() != 0);

         return var3;
      }
   }

   public String c(MapModel var1, MapModel var2, RoleData var3) {
      synchronized (this) {
         int var5 = (int)var1.getMapId();
         int var6 = (int)var2.getMapId();
         if (var5 == var6) {
            return "";
         } else {
            com.xy.v.Class8 var7 = var3.getObjectArea();
            int var10000 = 0;
            this.e.clear();
            this.a.clear();

            String var9;
            for (int var8 = 0; var10000 < 100 && (var9 = this.i(var5, var6, var7)) != null; var10000 = var8) {
               var8++;
               this.a.add(var9);
            }

            StringBuffer var11;
            StringBuffer var13 = var11 = new StringBuffer();
            String var10001 = "仰";
            var13.append("从");
            var11.append(var1.getMapName());
            String var10003 = "刕";
            var11.append("到");
            var11.append(var2.getMapName());
            String var10005 = "公朷";
            var11.append("共有");
            var11.append(this.a.size());
            String var10007 = "杄趮御{\u00063〥";
            var11.append("条路径:#r　");
            int var12 = 0;

            for (int var14 = var12; var14 < this.a.size(); var14 = var12) {
               if (var12 == 0) {
                  var10001 = ">L跲徺";
                  var10001 = "#r路径";
               } else {
                  var10001 = "\u00063〥bW趮御";
                  var10001 = "#r　#r路径";
               }

               var11.append(var10001);
               var11.append(var12 + 1);
               var10003 = "\u0004";
               var11.append(":");
               var11.append(this.a.get(var12++));
            }

            this.e.clear();
            this.a.clear();
            return var11.toString();
         }
      }
   }

   // $VF: synthetic method
   static int d(int var0, int var1, int var2, int var3) {
      return f(var0, var1, var2, var3);
   }

   public Class8 e(int var1) {
      Class8 var2;
      if ((var2 = this.g.get(var1)) == null) {
         var2 = new Class8(var1, this.f);
         this.g.put(var1, var2);
      }

      return var2;
   }

   // $VF: synthetic method
   private static int f(int var0, int var1, int var2, int var3) {
      var0 -= var2;
      var1 -= var3;
      var0 *= var0;
      var1 *= var1;
      return var0 + var1;
   }

   public static void g(Class5 var0, List<Object> var1) {
      if (var0 != null) {
         for (Class5 var10000 = var0 = Class5.a(var0); Class5.a(var10000) != null; var10000 = var0 = Class5.a(var0)) {
            h(var1, var0);
         }
      }
   }

   public static void h(List<Object> var0, Class5 var1) {
      if (Class5.b(var1).q() == 2) {
         ScriptEnd var13 = new ScriptEnd(Class5.d(var1), Class5.i(var1), Class5.e(var1), Class5.g(var1));
         var0.add(var13);
         ScriptOpen var8 = new ScriptOpen(3, Class5.b(var1).h(), Class5.d(var1), Class5.i(var1), Class5.e(var1), Class5.g(var1));
         var0.add(var8);
         var8 = new ScriptOpen(10, Class5.b(var1).h());
         var0.add(var8);
      } else if (Class5.b(var1).q() == 1) {
         ScriptEnd var11 = new ScriptEnd(Class5.d(var1), Class5.i(var1), Class5.e(var1), Class5.g(var1));
         var0.add(var11);
         ScriptOpen var5 = new ScriptOpen(2, Class5.b(var1).r());
         var0.add(var5);
         var5 = new ScriptOpen(11, Class5.b(var1).h());
         var0.add(var5);
         var11 = new ScriptEnd(Class5.b(var1).f, Class5.b(var1).j, Class5.b(var1).c, Class5.b(var1).e);
         var0.add(var11);
         var5 = new ScriptOpen(Class5.b(var1).j, Class5.b(var1).c, Class5.b(var1).e);
         var0.add(var5);
      } else {
         ScriptEnd var3 = new ScriptEnd(Class5.d(var1), Class5.i(var1), Class5.e(var1), Class5.g(var1));
         var0.add(var3);
         ScriptOpen var2 = new ScriptOpen(1, Class5.b(var1).r());
         var0.add(var2);
         var3 = new ScriptEnd(Class5.b(var1).f, Class5.b(var1).j, Class5.b(var1).c, Class5.b(var1).e);
         var0.add(var3);
         var2 = new ScriptOpen(Class5.b(var1).j, Class5.b(var1).c, Class5.b(var1).e);
         var0.add(var2);
      }
   }

   // $VF: synthetic method
   private String i(int var1, int var2, com.xy.v.Class8 var3) {
      Class5 var4 = null;
      this.c.clear();
      this.d.clear();
      this.d.add(new Class5(var1, 0, 0, 0));
      int var5 = 0;

      for (int var10000 = var5; var10000 < this.e.size(); var10000 = var5) {
         this.c.add(this.e.get(var5++));
      }

      Class3 var28;
      do {
         Class5 var13 = this.d.get(0);

         int var6;
         for (int var25 = var6 = this.d.size() - 1; var25 >= 0; var25 = --var6) {
            if (Class5.c(var13) > Class5.c(this.d.get(var6))) {
               var13 = this.d.get(var6);
            }
         }

         this.d.remove(var13);
         Class8 var15 = this.e(Class5.d(var13));
         if (var15 == null) {
            var28 = this;
         } else {
            List var7 = var15.b();
            boolean var8 = true;

            int var9;
            for (int var26 = var9 = (var7 != null ? var7.size() : 0) - 1; var26 >= 0; var26 = --var9) {
               Class4 var10;
               if ((var10 = (Class4)var7.get(var9)).i() != Class5.d(var13)) {
                  if (var8 && var10.i() == var2) {
                     var8 = false;
                  }

                  if (!var13.j(var10.r()) && !var13.f(var10.i()) && !this.c.contains(var10.i())) {
                     Class5 var11 = new Class5(var10, var13);
                     this.d.add(var11);
                  }
               }
            }

            if (var8) {
               this.c.add(Class5.d(var13));
            }

            for (int var27 = var9 = this.d.size() - 1; var27 >= 0; var27 = --var9) {
               if (var4 != null && Class5.c(var4) <= Class5.c(this.d.get(var9))) {
                  this.d.remove(var9);
               } else if (Class5.d(this.d.get(var9)) == var2) {
                  if (var4 == null) {
                     var4 = this.d.get(var9);
                  } else {
                     var4 = this.d.get(var9);
                  }
               }
            }

            var28 = this;
         }
      } while (var28.d.size() != 0);

      if (var4 == null) {
         return null;
      } else {
         ArrayList var14 = new ArrayList();

         for (Class5 var29 = var4; var29 != null; var29 = var4) {
            var14.add(var4);
            var4 = Class5.a(var4);
         }

         StringBuffer var16 = new StringBuffer();

         int var17;
         for (int var30 = var17 = var14.size() - 1; var30 >= 0; var30 = --var17) {
            Class4 var19;
            if ((var19 = Class5.b((Class5)var14.get(var17))) != null) {
               this.e.add(var19.i());
               MapModel var20 = var3.g(String.valueOf(var19.s()));
               Coordinates var22 = new Coordinates(var19.s(), var19.a(), var19.k());
               StringBuilder var10004 = new StringBuilder(String.valueOf(var20.getMapName()));
               String var10005 = "\r";
               var10004 = var10004.append("(").append(var22.getX() / 20).append(",").append(var22.getY() / 20);
               var10005 = "\u0017";
               InputBean var12 = new InputBean(10, var10004.append(")").toString(), var22);
               String var33 = "\u001do\u001dD⊧>i";
               String var38 = "b";
               var12.setColor("G");
               var16.append("#r#Y⊙#W");
               String var10003 = "贱刕";
               var16.append("走到");
               String var39 = ">h";
               var16.append("#V");
               var16.append(Class31.a().toJson(var12));
               String var10006 = "\u0006\r夡";
               var16.append("#L处");
               com.xy.v.Class8 var31;
               if (var19.q() == 0) {
                  var31 = var3;
                  var33 = "觘双圎団伞逜刎";
                  var16.append("触发地图传送到");
               } else {
                  if (var19.q() == 1) {
                     String var10001 = "炜冺驚窘耤朾伅遀刕";
                     var16.append("点击驿站老板传送到");
                  }

                  var31 = var3;
               }

               var20 = var31.g(String.valueOf(var19.i()));
               var22 = new Coordinates(var19.i(), var19.v(), var19.d());
               var12 = new InputBean(10, var20.getMapName(), var22);
               String var32 = "bs";
               var10003 = "g";
               var12.setColor("Y");
               var16.append("#V");
               var16.append(Class31.a().toJson(var12));
               var10003 = ">r";
               var16.append("#L");
            }
         }

         return var16.length() != 0 ? var16.toString() : null;
      }
   }

   public void j(int var1, int var2, int var3, int var4, RoleData var5) {
      int var10000 = 0;
      this.b.clear();

      for (int var6 = 0; var10000 < var5.goodPacks.length; var10000 = ++var6) {
         Goodstable var7;
         GoodFight var8;
         if ((var7 = var5.getGood(var5.goodPacks[var6])) != null && GoodType.aj(var7.getType()) && (var8 = var7.getFight()) != null) {
            while (var8 != null) {
               Class4 var9 = new Class4(var7.getRgid().longValue(), var8);
               var9.f = var1;
               var9.j = var2;
               var9.c = var3;
               var9.e = var4;
               this.b.add(var9);
               var8 = var8.getNextFight();
            }
         }
      }
   }
}
