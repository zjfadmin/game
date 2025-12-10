package com.xy;

import com.xy.bean.Coordinates;
import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.readbean.GoodFight;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MapModel;
import com.xy.richtext.InputBean;
import com.xy.script.ScriptEnd;
import com.xy.script.ScriptOpen;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Class571 {
   List<Integer> a = new ArrayList();
   Map<Integer, Class686> b = new HashMap();
   List<null> c = new ArrayList();
   List<Integer> d = new ArrayList();
   Class603 e;
   List<String> f = new ArrayList();
   List<Class543> g = new ArrayList();

   public <undefinedtype> a(Object var1, Object var2) {
      this.c.clear();
      <undefinedtype> var5 = null;
      this.c.add(new Object(var1.e, var1.d, var1.f, var1.g) {
         private Class543 a;
         private transient <undefinedtype> b;
         private int c;
         private int d;
         private int e;
         private int f;
         private int g;

         public boolean b(int var1) {
            if (this.a == null) {
               return (boolean)(2 & 5);
            } else if (this.a.b == var1) {
               return (boolean)(--1);
            } else {
               return this.b != null ? this.b.b(var1) : false;
            }
         }

         public {
            this.a = var1;
            this.e = var1.g();
            this.d = var1.p();
            this.f = var1.q();
            this.g = var1.f();
            this.b = var2;
            if (var1.l() == (1 ^ 3)) {
               this.c = var2.c;
            } else {
               this.c = var2.c + Class571.c(var2.d, var2.f, var1.f, var1.j) + '鱀';
            }
         }

         public boolean c(int var1) {
            if (this.a != null && var1 != 0) {
               if (this.a.u() == var1) {
                  return (boolean)(--1);
               } else {
                  return this.b != null ? this.b.c(var1) : false;
               }
            } else {
               return false;
            }
         }

         public int f() {
            return this.a != null ? this.a.b : this.e;
         }

         public <undefinedtype> i() {
            return (<undefinedtype>)(this.a != null ? new <anonymous constructor>(this.a.b, this.a.f, this.a.j, this.a.c) : this);
         }

         public {
            this.e = var1;
            this.d = var2;
            this.f = var3;
            this.g = var4;
         }

         public {
            this.e = var1;
            this.d = var2;
            this.f = var3;
            this.g = var4;
            this.b = var5;
            this.c = var5.c + Class571.c(var5.d, var5.f, var2, var3);
         }
      });
      Class686 var7 = this.e(var1.e);
      if (var7 == null) {
         return (<undefinedtype>)this.c.get(3 ^ 3);
      } else {
         List var8 = var7.a();

         do {
            <undefinedtype> var4 = (<undefinedtype>)this.c.get(3 & 4);

            int var10000;
            int var3;
            for(var10000 = var3 = this.c.size() - (3 & 5); var10000 >= 0; var10000 = var3) {
               if (var4.c > ((<undefinedtype>)this.c.get(var3)).c) {
                  var4 = (<undefinedtype>)this.c.get(var3);
               }

               --var3;
            }

            this.c.remove(var4);
            if (var4.d != var2.d || var4.f != var2.f || var4.g != var2.g) {
               for(var10000 = var3 = (var8 != null ? var8.size() : 0) - 1; var10000 >= 0; var10000 = var3) {
                  Class543 var6;
                  if ((var6 = (Class543)var8.get(var3)).g() == var6.k() && !var4.c(var6.u())) {
                     Object var9 = new Object(var6, var4) {
                        private Class543 a;
                        private transient <undefinedtype> b;
                        private int c;
                        private int d;
                        private int e;
                        private int f;
                        private int g;

                        public boolean b(int var1) {
                           if (this.a == null) {
                              return (boolean)(2 & 5);
                           } else if (this.a.b == var1) {
                              return (boolean)(--1);
                           } else {
                              return this.b != null ? this.b.b(var1) : false;
                           }
                        }

                        public {
                           this.a = var1;
                           this.e = var1.g();
                           this.d = var1.p();
                           this.f = var1.q();
                           this.g = var1.f();
                           this.b = var2;
                           if (var1.l() == (1 ^ 3)) {
                              this.c = var2.c;
                           } else {
                              this.c = var2.c + Class571.c(var2.d, var2.f, var1.f, var1.j) + '鱀';
                           }
                        }

                        public boolean c(int var1) {
                           if (this.a != null && var1 != 0) {
                              if (this.a.u() == var1) {
                                 return (boolean)(--1);
                              } else {
                                 return this.b != null ? this.b.c(var1) : false;
                              }
                           } else {
                              return false;
                           }
                        }

                        public int f() {
                           return this.a != null ? this.a.b : this.e;
                        }

                        public <undefinedtype> i() {
                           return (<undefinedtype>)(this.a != null ? new <anonymous constructor>(this.a.b, this.a.f, this.a.j, this.a.c) : this);
                        }

                        public {
                           this.e = var1;
                           this.d = var2;
                           this.f = var3;
                           this.g = var4;
                        }

                        public {
                           this.e = var1;
                           this.d = var2;
                           this.f = var3;
                           this.g = var4;
                           this.b = var5;
                           this.c = var5.c + Class571.c(var5.d, var5.f, var2, var3);
                        }
                     };
                     ((<undefinedtype>)var9).c = ((<undefinedtype>)var9).c + '鱀';
                     this.c.add(var9);
                  }

                  --var3;
               }

               this.c.add(new Object(var2.e, var2.d, var2.f, var2.g, var4) {
                  private Class543 a;
                  private transient <undefinedtype> b;
                  private int c;
                  private int d;
                  private int e;
                  private int f;
                  private int g;

                  public boolean b(int var1) {
                     if (this.a == null) {
                        return (boolean)(2 & 5);
                     } else if (this.a.b == var1) {
                        return (boolean)(--1);
                     } else {
                        return this.b != null ? this.b.b(var1) : false;
                     }
                  }

                  public {
                     this.a = var1;
                     this.e = var1.g();
                     this.d = var1.p();
                     this.f = var1.q();
                     this.g = var1.f();
                     this.b = var2;
                     if (var1.l() == (1 ^ 3)) {
                        this.c = var2.c;
                     } else {
                        this.c = var2.c + Class571.c(var2.d, var2.f, var1.f, var1.j) + '鱀';
                     }
                  }

                  public boolean c(int var1) {
                     if (this.a != null && var1 != 0) {
                        if (this.a.u() == var1) {
                           return (boolean)(--1);
                        } else {
                           return this.b != null ? this.b.c(var1) : false;
                        }
                     } else {
                        return false;
                     }
                  }

                  public int f() {
                     return this.a != null ? this.a.b : this.e;
                  }

                  public <undefinedtype> i() {
                     return (<undefinedtype>)(this.a != null ? new <anonymous constructor>(this.a.b, this.a.f, this.a.j, this.a.c) : this);
                  }

                  public {
                     this.e = var1;
                     this.d = var2;
                     this.f = var3;
                     this.g = var4;
                  }

                  public {
                     this.e = var1;
                     this.d = var2;
                     this.f = var3;
                     this.g = var4;
                     this.b = var5;
                     this.c = var5.c + Class571.c(var5.d, var5.f, var2, var3);
                  }
               });
            }

            for(var10000 = var3 = this.c.size() - (3 & 5); var10000 >= 0; var10000 = var3) {
               if (var5 != null && var5.c <= ((<undefinedtype>)this.c.get(var3)).c) {
                  this.c.remove(var3);
               } else if (((<undefinedtype>)this.c.get(var3)).d == var2.d && ((<undefinedtype>)this.c.get(var3)).f == var2.f) {
                  if (var5 == null) {
                     var5 = (<undefinedtype>)this.c.get(var3);
                  } else {
                     var5 = (<undefinedtype>)this.c.get(var3);
                  }
               }

               --var3;
            }
         } while(this.c.size() != 0);

         return var5;
      }
   }

   public String b(MapModel var1, MapModel var2, RoleData var3) {
      synchronized(this) {
         int var5 = (int)var1.getMapId();
         int var6 = (int)var2.getMapId();
         if (var5 == var6) {
            return "";
         } else {
            Class603 var10 = var3.getObjectArea();
            int var10000 = 2 & 5;
            this.d.clear();
            this.f.clear();

            String var8;
            for(int var7 = var10000; var10000 < 100 && (var8 = this.j(var5, var6, var10)) != null; var10000 = var7) {
               ++var7;
               this.f.add(var8);
            }

            StringBuffer var11;
            (var11 = new StringBuffer()).append("从");
            var11.append(var1.getMapName());
            var11.append("到");
            var11.append(var2.getMapName());
            var11.append("共有");
            var11.append(this.f.size());
            var11.append("条路径:#r　");
            int var12 = 2 & 5;

            for(var10000 = var12; var10000 < this.f.size(); var10000 = var12) {
               var11.append(var12 == 0 ? "#r路径" : "#r　#r路径");
               var11.append(var12 + (3 & 5));
               var11.append(":");
               var11.append((String)this.f.get(var12++));
            }

            this.d.clear();
            this.f.clear();
            return var11.toString();
         }
      }
   }


   private static int c(int var0, int var1, int var2, int var3) {
      var0 -= var2;
      var1 -= var3;
      var0 *= var0;
      var1 *= var1;
      return var0 + var1;
   }

   public List<Object> d(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RoleData var10) {
      synchronized(this) {
         if (var9 == --1) {
            ArrayList var22 = new ArrayList();
            ScriptOpen var24 = new ScriptOpen(--4, 0L, var5, var6, var7, var8);
            ScriptEnd var27 = new ScriptEnd(var5, var6, var7, var8);
            var22.add(var27);
            var22.add(var24);
            return var22;
         } else {
            this.a.clear();
            this.c.clear();
            this.g(var1, var2, var3, var4, var10);
            Object var19 = null;
            Object var31;
            if (var1 != var5) {
               this.c.add(new Object(var1, var2, var3, var4) {
                  private Class543 a;
                  private transient <undefinedtype> b;
                  private int c;
                  private int d;
                  private int e;
                  private int f;
                  private int g;

                  public boolean b(int var1) {
                     if (this.a == null) {
                        return (boolean)(2 & 5);
                     } else if (this.a.b == var1) {
                        return (boolean)(--1);
                     } else {
                        return this.b != null ? this.b.b(var1) : false;
                     }
                  }

                  public {
                     this.a = var1;
                     this.e = var1.g();
                     this.d = var1.p();
                     this.f = var1.q();
                     this.g = var1.f();
                     this.b = var2;
                     if (var1.l() == (1 ^ 3)) {
                        this.c = var2.c;
                     } else {
                        this.c = var2.c + Class571.c(var2.d, var2.f, var1.f, var1.j) + '鱀';
                     }
                  }

                  public boolean c(int var1) {
                     if (this.a != null && var1 != 0) {
                        if (this.a.u() == var1) {
                           return (boolean)(--1);
                        } else {
                           return this.b != null ? this.b.c(var1) : false;
                        }
                     } else {
                        return false;
                     }
                  }

                  public int f() {
                     return this.a != null ? this.a.b : this.e;
                  }

                  public <undefinedtype> i() {
                     return (<undefinedtype>)(this.a != null ? new <anonymous constructor>(this.a.b, this.a.f, this.a.j, this.a.c) : this);
                  }

                  public {
                     this.e = var1;
                     this.d = var2;
                     this.f = var3;
                     this.g = var4;
                  }

                  public {
                     this.e = var1;
                     this.d = var2;
                     this.f = var3;
                     this.g = var4;
                     this.b = var5;
                     this.c = var5.c + Class571.c(var5.d, var5.f, var2, var3);
                  }
               });

               Class571 var30;
               do {
                  <undefinedtype> var12 = (<undefinedtype>)this.c.get(3 >> 2);

                  int var13;
                  int var10000;
                  for(var10000 = var13 = this.c.size() - (4 ^ 5); var10000 >= 0; var10000 = var13) {
                     if (var12.c > ((<undefinedtype>)this.c.get(var13)).c) {
                        var12 = (<undefinedtype>)this.c.get(var13);
                     }

                     --var13;
                  }

                  this.c.remove(var12);
                  Class686 var25 = this.e(var12.e);
                  if (var25 == null) {
                     var30 = this;
                  } else {
                     List var20 = var25.a();
                     int var14 = --1;

                     int var15;
                     Class543 var16;
                     Object var17;
                     for(var10000 = var15 = (var20 != null ? var20.size() : 0) - 1; var10000 >= 0; var10000 = var15) {
                        if ((var16 = (Class543)var20.get(var15)).g() != var12.e) {
                           if (var14 != 0 && var16.g() == var5) {
                              var14 = 3 >> 2;
                           }

                           if (!var12.c(var16.u()) && !var12.b(var16.g()) && !this.a.contains(var16.g())) {
                              var17 = new Object(var16, var12) {
                                 private Class543 a;
                                 private transient <undefinedtype> b;
                                 private int c;
                                 private int d;
                                 private int e;
                                 private int f;
                                 private int g;

                                 public boolean b(int var1) {
                                    if (this.a == null) {
                                       return (boolean)(2 & 5);
                                    } else if (this.a.b == var1) {
                                       return (boolean)(--1);
                                    } else {
                                       return this.b != null ? this.b.b(var1) : false;
                                    }
                                 }

                                 public {
                                    this.a = var1;
                                    this.e = var1.g();
                                    this.d = var1.p();
                                    this.f = var1.q();
                                    this.g = var1.f();
                                    this.b = var2;
                                    if (var1.l() == (1 ^ 3)) {
                                       this.c = var2.c;
                                    } else {
                                       this.c = var2.c + Class571.c(var2.d, var2.f, var1.f, var1.j) + '鱀';
                                    }
                                 }

                                 public boolean c(int var1) {
                                    if (this.a != null && var1 != 0) {
                                       if (this.a.u() == var1) {
                                          return (boolean)(--1);
                                       } else {
                                          return this.b != null ? this.b.c(var1) : false;
                                       }
                                    } else {
                                       return false;
                                    }
                                 }

                                 public int f() {
                                    return this.a != null ? this.a.b : this.e;
                                 }

                                 public <undefinedtype> i() {
                                    return (<undefinedtype>)(this.a != null ? new <anonymous constructor>(this.a.b, this.a.f, this.a.j, this.a.c) : this);
                                 }

                                 public {
                                    this.e = var1;
                                    this.d = var2;
                                    this.f = var3;
                                    this.g = var4;
                                 }

                                 public {
                                    this.e = var1;
                                    this.d = var2;
                                    this.f = var3;
                                    this.g = var4;
                                    this.b = var5;
                                    this.c = var5.c + Class571.c(var5.d, var5.f, var2, var3);
                                 }
                              };
                              this.c.add(var17);
                           }
                        }

                        --var15;
                     }

                     if (var12.e == var1) {
                        for(var10000 = var15 = this.g.size() - (3 & 5); var10000 >= 0; var10000 = var15) {
                           if ((var16 = (Class543)this.g.get(var15)).g() != var12.e) {
                              if (var14 != 0 && var16.g() == var5) {
                                 var14 = 3 & 4;
                              }

                              if (!var12.c(var16.u()) && !var12.b(var16.g()) && !this.a.contains(var16.g())) {
                                 var17 = new Object(var16, var12) {
                                    private Class543 a;
                                    private transient <undefinedtype> b;
                                    private int c;
                                    private int d;
                                    private int e;
                                    private int f;
                                    private int g;

                                    public boolean b(int var1) {
                                       if (this.a == null) {
                                          return (boolean)(2 & 5);
                                       } else if (this.a.b == var1) {
                                          return (boolean)(--1);
                                       } else {
                                          return this.b != null ? this.b.b(var1) : false;
                                       }
                                    }

                                    public {
                                       this.a = var1;
                                       this.e = var1.g();
                                       this.d = var1.p();
                                       this.f = var1.q();
                                       this.g = var1.f();
                                       this.b = var2;
                                       if (var1.l() == (1 ^ 3)) {
                                          this.c = var2.c;
                                       } else {
                                          this.c = var2.c + Class571.c(var2.d, var2.f, var1.f, var1.j) + '鱀';
                                       }
                                    }

                                    public boolean c(int var1) {
                                       if (this.a != null && var1 != 0) {
                                          if (this.a.u() == var1) {
                                             return (boolean)(--1);
                                          } else {
                                             return this.b != null ? this.b.c(var1) : false;
                                          }
                                       } else {
                                          return false;
                                       }
                                    }

                                    public int f() {
                                       return this.a != null ? this.a.b : this.e;
                                    }

                                    public <undefinedtype> i() {
                                       return (<undefinedtype>)(this.a != null ? new <anonymous constructor>(this.a.b, this.a.f, this.a.j, this.a.c) : this);
                                    }

                                    public {
                                       this.e = var1;
                                       this.d = var2;
                                       this.f = var3;
                                       this.g = var4;
                                    }

                                    public {
                                       this.e = var1;
                                       this.d = var2;
                                       this.f = var3;
                                       this.g = var4;
                                       this.b = var5;
                                       this.c = var5.c + Class571.c(var5.d, var5.f, var2, var3);
                                    }
                                 };
                                 this.c.add(var17);
                              }
                           }

                           --var15;
                        }
                     }

                     if (var14 != 0) {
                        this.a.add(var12.e);
                     }

                     for(var10000 = var15 = this.c.size() - (3 & 5); var10000 >= 0; var10000 = var15) {
                        if (var19 != null && ((<undefinedtype>)var19).c <= ((<undefinedtype>)this.c.get(var15)).c) {
                           this.c.remove(var15);
                        } else if (((<undefinedtype>)this.c.get(var15)).e == var5) {
                           if (var19 == null) {
                              var19 = (<undefinedtype>)this.c.get(var15);
                           } else {
                              var19 = (<undefinedtype>)this.c.get(var15);
                           }
                        }

                        --var15;
                     }

                     var30 = this;
                  }
               } while(var30.c.size() != 0);

               var31 = var19;
            } else {
               var31 = var19 = new Object(var1, var2, var3, var4) {
                  private Class543 a;
                  private transient <undefinedtype> b;
                  private int c;
                  private int d;
                  private int e;
                  private int f;
                  private int g;

                  public boolean b(int var1) {
                     if (this.a == null) {
                        return (boolean)(2 & 5);
                     } else if (this.a.b == var1) {
                        return (boolean)(--1);
                     } else {
                        return this.b != null ? this.b.b(var1) : false;
                     }
                  }

                  public {
                     this.a = var1;
                     this.e = var1.g();
                     this.d = var1.p();
                     this.f = var1.q();
                     this.g = var1.f();
                     this.b = var2;
                     if (var1.l() == (1 ^ 3)) {
                        this.c = var2.c;
                     } else {
                        this.c = var2.c + Class571.c(var2.d, var2.f, var1.f, var1.j) + '鱀';
                     }
                  }

                  public boolean c(int var1) {
                     if (this.a != null && var1 != 0) {
                        if (this.a.u() == var1) {
                           return (boolean)(--1);
                        } else {
                           return this.b != null ? this.b.c(var1) : false;
                        }
                     } else {
                        return false;
                     }
                  }

                  public int f() {
                     return this.a != null ? this.a.b : this.e;
                  }

                  public <undefinedtype> i() {
                     return (<undefinedtype>)(this.a != null ? new <anonymous constructor>(this.a.b, this.a.f, this.a.j, this.a.c) : this);
                  }

                  public {
                     this.e = var1;
                     this.d = var2;
                     this.f = var3;
                     this.g = var4;
                  }

                  public {
                     this.e = var1;
                     this.d = var2;
                     this.f = var3;
                     this.g = var4;
                     this.b = var5;
                     this.c = var5.c + Class571.c(var5.d, var5.f, var2, var3);
                  }
               };
            }

            if (var31 == null) {
               return null;
            } else {
               ArrayList var23 = new ArrayList();
               ScriptOpen var26 = new ScriptOpen(var6, var7, var8);
               ScriptEnd var21 = new ScriptEnd(var5, var6, var7, var8);
               var23.add(var21);
               var23.add(var26);
               Object var28;
               ((<undefinedtype>)(var28 = new Object(var5, var6, var7, var8) {
                  private Class543 a;
                  private transient <undefinedtype> b;
                  private int c;
                  private int d;
                  private int e;
                  private int f;
                  private int g;

                  public boolean b(int var1) {
                     if (this.a == null) {
                        return (boolean)(2 & 5);
                     } else if (this.a.b == var1) {
                        return (boolean)(--1);
                     } else {
                        return this.b != null ? this.b.b(var1) : false;
                     }
                  }

                  public {
                     this.a = var1;
                     this.e = var1.g();
                     this.d = var1.p();
                     this.f = var1.q();
                     this.g = var1.f();
                     this.b = var2;
                     if (var1.l() == (1 ^ 3)) {
                        this.c = var2.c;
                     } else {
                        this.c = var2.c + Class571.c(var2.d, var2.f, var1.f, var1.j) + '鱀';
                     }
                  }

                  public boolean c(int var1) {
                     if (this.a != null && var1 != 0) {
                        if (this.a.u() == var1) {
                           return (boolean)(--1);
                        } else {
                           return this.b != null ? this.b.c(var1) : false;
                        }
                     } else {
                        return false;
                     }
                  }

                  public int f() {
                     return this.a != null ? this.a.b : this.e;
                  }

                  public <undefinedtype> i() {
                     return (<undefinedtype>)(this.a != null ? new <anonymous constructor>(this.a.b, this.a.f, this.a.j, this.a.c) : this);
                  }

                  public {
                     this.e = var1;
                     this.d = var2;
                     this.f = var3;
                     this.g = var4;
                  }

                  public {
                     this.e = var1;
                     this.d = var2;
                     this.f = var3;
                     this.g = var4;
                     this.b = var5;
                     this.c = var5.c + Class571.c(var5.d, var5.f, var2, var3);
                  }
               })).b = (<undefinedtype>)var19;

               for(var31 = var28; ((<undefinedtype>)var31).b != null; var31 = var28) {
                  label119: {
                     if (((<undefinedtype>)var28).a == null) {
                        if (((<undefinedtype>)var28).e == ((<undefinedtype>)var28).b.e) {
                           <undefinedtype> var29 = this.a(((<undefinedtype>)var28).b, (<undefinedtype>)var28);
                           var31 = var28;
                           i(var29, var23);
                           break label119;
                        }
                     } else if (((<undefinedtype>)var28).f() == ((<undefinedtype>)var28).b.f()) {
                        i(this.a(((<undefinedtype>)var28).b.i(), ((<undefinedtype>)var28).i()), var23);
                     }

                     var31 = var28;
                  }

                  if (((<undefinedtype>)(var28 = ((<undefinedtype>)var31).b)).a != null) {
                     h(var23, (<undefinedtype>)var28);
                  }
               }

               this.a.clear();
               this.c.clear();
               return var23;
            }
         }
      }
   }

   public Class686 e(int var1) {
      Class686 var2;
      if ((var2 = (Class686)this.b.get(var1)) == null) {
         var2 = new Class686(var1, this.e);
         this.b.put(var1, var2);
      }

      return var2;
   }

   public void g(int var1, int var2, int var3, int var4, RoleData var5) {
      int var10000 = 5 >> 3;
      this.g.clear();

      for(int var6 = var10000; var10000 < var5.goodPacks.length; var10000 = var6) {
         Goodstable var7;
         GoodFight var8;
         if ((var7 = var5.getGood(var5.goodPacks[var6])) != null && GoodType.au(var7.getType()) && (var8 = var7.getFight()) != null) {
            while(var8 != null) {
               Class543 var9 = new Class543(var7.getRgid().longValue(), var8);
               var9.b = var1;
               var9.f = var2;
               var9.j = var3;
               var9.c = var4;
               this.g.add(var9);
               var8 = var8.getNextFight();
            }
         }

         ++var6;
      }

   }

   public static void h(List<Object> var0, null var1) {
      ScriptOpen var2;
      ScriptEnd var3;
      if (var1.a.l() == --2) {
         var3 = new ScriptEnd(var1.e, var1.d, var1.f, var1.g);
         var0.add(var3);
         var2 = new ScriptOpen(--3, var1.a.d(), var1.e, var1.d, var1.f, var1.g);
         var0.add(var2);
         var2 = new ScriptOpen(11 & 126, var1.a.d());
         var0.add(var2);
      } else if (var1.a.l() == 5 >> 2) {
         var3 = new ScriptEnd(var1.e, var1.d, var1.f, var1.g);
         var0.add(var3);
         var2 = new ScriptOpen(1 ^ 3, (long)var1.a.u());
         var0.add(var2);
         var2 = new ScriptOpen(27 & 111, var1.a.d());
         var0.add(var2);
         var3 = new ScriptEnd(var1.a.b, var1.a.f, var1.a.j, var1.a.c);
         var0.add(var3);
         var2 = new ScriptOpen(var1.a.f, var1.a.j, var1.a.c);
         var0.add(var2);
      } else {
         var3 = new ScriptEnd(var1.e, var1.d, var1.f, var1.g);
         var0.add(var3);
         var2 = new ScriptOpen(4 ^ 5, (long)var1.a.u());
         var0.add(var2);
         var3 = new ScriptEnd(var1.a.b, var1.a.f, var1.a.j, var1.a.c);
         var0.add(var3);
         var2 = new ScriptOpen(var1.a.f, var1.a.j, var1.a.c);
         var0.add(var2);
      }
   }

   public Class571(Class603 var1) {
      this.e = var1;
   }

   public static void i(null var0, List<Object> var1) {
      if (var0 != null) {
         for(<undefinedtype> var10000 = var0 = var0.b; var10000.b != null; var10000 = var0 = var0.b) {
            h(var1, var0);
         }

      }
   }


   private String j(int var1, int var2, Class603 var3) {
      <undefinedtype> var4 = null;
      this.a.clear();
      this.c.clear();
      this.c.add(new Object(var1, 3 >> 2, 3 >> 2, 3 >> 2) {
         private Class543 a;
         private transient <undefinedtype> b;
         private int c;
         private int d;
         private int e;
         private int f;
         private int g;

         public boolean b(int var1) {
            if (this.a == null) {
               return (boolean)(2 & 5);
            } else if (this.a.b == var1) {
               return (boolean)(--1);
            } else {
               return this.b != null ? this.b.b(var1) : false;
            }
         }

         public {
            this.a = var1;
            this.e = var1.g();
            this.d = var1.p();
            this.f = var1.q();
            this.g = var1.f();
            this.b = var2;
            if (var1.l() == (1 ^ 3)) {
               this.c = var2.c;
            } else {
               this.c = var2.c + Class571.c(var2.d, var2.f, var1.f, var1.j) + '鱀';
            }
         }

         public boolean c(int var1) {
            if (this.a != null && var1 != 0) {
               if (this.a.u() == var1) {
                  return (boolean)(--1);
               } else {
                  return this.b != null ? this.b.c(var1) : false;
               }
            } else {
               return false;
            }
         }

         public int f() {
            return this.a != null ? this.a.b : this.e;
         }

         public <undefinedtype> i() {
            return (<undefinedtype>)(this.a != null ? new <anonymous constructor>(this.a.b, this.a.f, this.a.j, this.a.c) : this);
         }

         public {
            this.e = var1;
            this.d = var2;
            this.f = var3;
            this.g = var4;
         }

         public {
            this.e = var1;
            this.d = var2;
            this.f = var3;
            this.g = var4;
            this.b = var5;
            this.c = var5.c + Class571.c(var5.d, var5.f, var2, var3);
         }
      });
      var1 = 5 >> 3;

      int var10000;
      for(var10000 = var1; var10000 < this.d.size(); var10000 = var1) {
         this.a.add((Integer)this.d.get(var1++));
      }

      Class571 var20;
      do {
         <undefinedtype> var11 = (<undefinedtype>)this.c.get(5 >> 3);

         int var5;
         for(var10000 = var5 = this.c.size() - --1; var10000 >= 0; var10000 = var5) {
            if (var11.c > ((<undefinedtype>)this.c.get(var5)).c) {
               var11 = (<undefinedtype>)this.c.get(var5);
            }

            --var5;
         }

         this.c.remove(var11);
         Class686 var14 = this.e(var11.e);
         if (var14 == null) {
            var20 = this;
         } else {
            List var6 = var14.a();
            int var7 = 4 ^ 5;

            int var8;
            for(var10000 = var8 = (var6 != null ? var6.size() : 0) - 1; var10000 >= 0; var10000 = var8) {
               Class543 var9;
               if ((var9 = (Class543)var6.get(var8)).g() != var11.e) {
                  if (var7 != 0 && var9.g() == var2) {
                     var7 = 2 & 5;
                  }

                  if (!var11.c(var9.u()) && !var11.b(var9.g()) && !this.a.contains(var9.g())) {
                     Object var10 = new Object(var9, var11) {
                        private Class543 a;
                        private transient <undefinedtype> b;
                        private int c;
                        private int d;
                        private int e;
                        private int f;
                        private int g;

                        public boolean b(int var1) {
                           if (this.a == null) {
                              return (boolean)(2 & 5);
                           } else if (this.a.b == var1) {
                              return (boolean)(--1);
                           } else {
                              return this.b != null ? this.b.b(var1) : false;
                           }
                        }

                        public {
                           this.a = var1;
                           this.e = var1.g();
                           this.d = var1.p();
                           this.f = var1.q();
                           this.g = var1.f();
                           this.b = var2;
                           if (var1.l() == (1 ^ 3)) {
                              this.c = var2.c;
                           } else {
                              this.c = var2.c + Class571.c(var2.d, var2.f, var1.f, var1.j) + '鱀';
                           }
                        }

                        public boolean c(int var1) {
                           if (this.a != null && var1 != 0) {
                              if (this.a.u() == var1) {
                                 return (boolean)(--1);
                              } else {
                                 return this.b != null ? this.b.c(var1) : false;
                              }
                           } else {
                              return false;
                           }
                        }

                        public int f() {
                           return this.a != null ? this.a.b : this.e;
                        }

                        public <undefinedtype> i() {
                           return (<undefinedtype>)(this.a != null ? new <anonymous constructor>(this.a.b, this.a.f, this.a.j, this.a.c) : this);
                        }

                        public {
                           this.e = var1;
                           this.d = var2;
                           this.f = var3;
                           this.g = var4;
                        }

                        public {
                           this.e = var1;
                           this.d = var2;
                           this.f = var3;
                           this.g = var4;
                           this.b = var5;
                           this.c = var5.c + Class571.c(var5.d, var5.f, var2, var3);
                        }
                     };
                     this.c.add(var10);
                  }
               }

               --var8;
            }

            if (var7 != 0) {
               this.a.add(var11.e);
            }

            for(var10000 = var8 = this.c.size() - (3 & 5); var10000 >= 0; var10000 = var8) {
               if (var4 != null && var4.c <= ((<undefinedtype>)this.c.get(var8)).c) {
                  this.c.remove(var8);
               } else if (((<undefinedtype>)this.c.get(var8)).e == var2) {
                  if (var4 == null) {
                     var4 = (<undefinedtype>)this.c.get(var8);
                  } else {
                     var4 = (<undefinedtype>)this.c.get(var8);
                  }
               }

               --var8;
            }

            var20 = this;
         }
      } while(var20.c.size() != 0);

      if (var4 == null) {
         return null;
      } else {
         ArrayList var13 = new ArrayList();

         for(<undefinedtype> var21 = var4; var21 != null; var21 = var4) {
            var13.add(var4);
            var4 = var4.b;
         }

         StringBuffer var15 = new StringBuffer();

         int var16;
         for(var10000 = var16 = var13.size() - --1; var10000 >= 0; var10000 = var16) {
            Class543 var17;
            if ((var17 = ((<undefinedtype>)var13.get(var16)).a) != null) {
               this.d.add(var17.g());
               MapModel var18 = var3.ay(String.valueOf(var17.k()));
               Coordinates var19 = new Coordinates(var17.k(), var17.j(), var17.r());
               InputBean var12 = new InputBean(27 & 110, var18.getMapName() + "(" + var19.getX() / (31 & 116) + "," + var19.getY() / (55 & 92) + ")", var19);
               var12.setColor("G");
               var15.append("#r#Y⊙#W");
               var15.append("走到");
               var15.append("#V");
               var15.append(Class695.b().toJson(var12));
               var15.append("#L处");
               Class603 var22;
               if (var17.l() == 0) {
                  var22 = var3;
                  var15.append("触发地图传送到");
               } else {
                  if (var17.l() == --1) {
                     var15.append("点击驿站老板传送到");
                  }

                  var22 = var3;
               }

               var18 = var22.ay(String.valueOf(var17.g()));
               var19 = new Coordinates(var17.g(), var17.p(), var17.q());
               var12 = new InputBean(47 & 90, var18.getMapName(), var19);
               var12.setColor("Y");
               var15.append("#V");
               var15.append(Class695.b().toJson(var12));
               var15.append("#L");
            }

            --var16;
         }

         if (var15.length() != 0) {
            return var15.toString();
         } else {
            return null;
         }
      }
   }
}
