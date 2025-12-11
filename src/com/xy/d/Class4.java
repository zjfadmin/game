package com.xy.d;

import com.xy.bean.PathPoint;
import com.xy.bean.RoleShow;
import com.xy.game.GameMove;
import com.xy.q.Class49;
import com.xy.richtext.FloatBox;
import com.xy.text.GameView;
import com.xy.text.SystemData;
import com.xy.v.Class12;
import com.xy.v.Class22;
import com.xy.v.Class32;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.util.List;

public abstract class Class4 {
   public int v;
   protected String w;
   public int x;
   public int y;
   public long z;
   public int aa;
   public int ab = ab();
   protected com.xy.w.Class0 ac;
   protected GameMove ad;
   public int ae;
   protected FloatBox af;
   protected String ag;
   public long ah;
   protected Class2 ai;
   protected int aj;
   private static int h = 0;
   public int ak;
   public int al;
   protected int am;

   public void r(Class32 var1) {
      this.ae = var1.d + 5;
      this.v = var1.a + 5;
      this.ak = var1.b;
      this.s(var1.c);
   }

   public void s(int var1) {
      if (this.ac.j() != var1) {
         this.ac.t(var1);
      }
   }

   public void t(List<PathPoint> var1, double var2) {
      List var10000;
      if (this.ad == null) {
         var10000 = var1;
         this.ad = new GameMove(var2);
      } else {
         this.ad.setSp(var2);
         var10000 = var1;
      }

      if (var10000 != null && var1.size() >= 2) {
         StringBuffer var4 = new StringBuffer(var1.size() * 8);

         int var5;
         for (int var7 = var5 = 0; var7 < var1.size(); var7 = var5) {
            PathPoint var6 = var1.get(var5);
            if (var5 != 0) {
               String var10001 = "^";
               var4.append("*");
            }

            var4.append(var6.getX());
            String var10002 = "y";
            var4.append("*");
            var5++;
            var4.append(var6.getY());
         }

         this.ad.setValue(0, 0L, var4.toString());
      } else {
         this.ad.setValue(0, 0L, null);
      }
   }

   public void u(int var1, int var2, int var3, int var4) {
      this.ae = var1;
      this.v = var2;
      this.al = var3;
      this.ak = var4;
   }

   public void v(Class32 var1) {
      this.ae = var1.d;
      this.v = var1.a;
      this.ak = var1.b;
      this.s(var1.c);
   }

   public void i(Graphics var1) {
      this.an(var1);
      this.ad(var1);
      this.d(var1);
      this.aw(var1);
   }

   public void w(boolean var1) {
      if (this.ad == null) {
         this.aa();
      }

      this.ad.setFlag(var1);
   }

   public boolean x(GameView var1) {
      Point var2;
      if ((var2 = var1.mapCamera.k(this.ae, this.v)) == null) {
         if (this.ac != null) {
            this.ac.m();
         }

         return false;
      } else {
         this.x = var2.x;
         this.y = var2.y;
         return true;
      }
   }

   public void o(Graphics var1, Class4 var2, GameView var3) {
      if (!SystemData.ISTCP && this.aa == 1) {
         this.ac.m();
         if (SystemData.ISNAME) {
            this.an(var1);
         }

         this.d(var1);
      } else {
         Class4 var10000;
         if (var3.mapScene.f(this.ae / com.xy.n.Class2.q, this.v / com.xy.n.Class2.q, 0)) {
            if (var2 == this) {
               var10000 = this;
               this.ac.d(var1, this.x, this.y, this.ak, this.z, 0.6F);
            } else {
               var10000 = this;
               this.ac.c(var1, this.x, this.y, this.ak, this.z, 0.6F);
            }
         } else if (var2 == this) {
            var10000 = this;
            this.ac.d(var1, this.x, this.y, this.ak, this.z, 1.0F);
         } else {
            var10000 = this;
            this.ac.r(var1, this.x, this.y, this.ak, this.z);
         }

         if (var10000.ai != null) {
            this.ai.d(var1, var3);
         }
      }
   }

   public void y() {
      if (this.af != null) {
         synchronized (this) {
            long var2 = Class22.l();
            FloatBox var4 = null;
            FloatBox var5;
            FloatBox var10000 = var5 = this.af;

            while (var10000 != null) {
               if (var5.IsTime(var2)) {
                  var4 = var5;
                  var10000 = var5;
               } else {
                  var5.removeLabel();
                  if (var4 != null) {
                     var10000 = var5;
                     var4.nextFloatBox = var5.nextFloatBox;
                  } else {
                     this.af = var5.nextFloatBox;
                     var10000 = var5;
                  }
               }

               var10000 = var5 = var10000.nextFloatBox;
            }
         }
      }
   }

   public void z(int var1, long var2, String var4) {
      if (this.ad == null) {
         this.aa();
      }

      if (!this.ad.c() || var1 <= 0) {
         this.ad.setValue(var1, var2, var4);
         if (var4 != null) {
            this.u(this.ad.x1, this.ad.y1, this.ad.z1, this.ak);
         }
      }
   }

   public void aa() {
      if (this.ad == null) {
         this.ad = new GameMove(this instanceof Class11 ? 0.5 : (this instanceof Class9 ? 0.07 : 0.24));
      }

      this.ad.setSp(this instanceof Class11 ? 0.5 : (this instanceof Class9 ? 0.07 : 0.24));
   }

   // $VF: synthetic method
   private static int ab() {
      return h++;
   }

   public static com.xy.w.Class0 ac(com.xy.w.Class0 var0, com.xy.w.Class0 var1) {
      return var0 == null ? var1 : var0.q(var1);
   }

   public void ad(Graphics var1) {
      if (this.af != null) {
         synchronized (this) {
            if (this.af != null) {
               int var3;
               if ((var3 = this.ac.i()) != -1) {
                  ((Graphics2D)var1).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_DEFAULT);
                  int var4 = this.y - var3 + 8;

                  FloatBox var5;
                  for (FloatBox var10000 = var5 = this.af; var10000 != null; var10000 = var5 = var5.nextFloatBox) {
                     int var6 = this.x - var5.getWidth() / 2;
                     var4 -= var5.getHeight() + 2;
                     var1.translate(var6, var4);
                     var5.paint(var1);
                     var1.translate(-var6, -var4);
                  }

                  ((Graphics2D)var1).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
               }
            }
         }
      }
   }

   public abstract int c(Class4 var1);

   public String ae() {
      return this.w;
   }

   public void af(String var1, RoleShow var2) {
      boolean var3 = false;
      Object var4 = this.ac = null;
      if (var2 != null && !Class12.h(var2.getSkin())) {
         String var10000 = var2.getSkin();
         String var10001 = "f\b";
         String[] var5 = var10000.split("\\|");

         int var6;
         for (int var16 = var6 = 0; var16 < var5.length; var16 = ++var6) {
            var10000 = var5[var6];
            var10001 = "\u000b";
            if (!var10000.startsWith("X")) {
               var10000 = var5[var6];
               var10001 = "$";
               if (!var10000.startsWith("P")) {
                  var10000 = var5[var6];
                  var10001 = ">";
                  if (var10000.startsWith("J")) {
                     var3 = true;
                     if (this.ai == null) {
                        String var10005 = "'t|x+";
                        this.ai = new Class2("tx/tx" + var5[var6].substring(1));
                     } else {
                        String var10003 = "\u0000B[N\f";
                        this.ai.e("tx/tx" + var5[var6].substring(1));
                     }
                  } else {
                     var10000 = var5[var6];
                     var10001 = "\u0000";
                     if (var10000.startsWith("S")) {
                        var1 = var5[var6].substring(1);
                     } else {
                        var10000 = var5[var6];
                        var10001 = "7";
                        if (var10000.startsWith("C")) {
                           String var34 = "'t|";
                           com.xy.w.Class0 var12 = com.xy.w.Class11.t("tx/" + var5[var6].substring(1), -2, 6, null);
                           if (this.ac == null) {
                              this.ac = var12;
                           } else {
                              this.ac = this.ac.q(var12);
                           }
                        } else {
                           var10000 = var5[var6];
                           var10001 = "6";
                           if (var10000.startsWith("B")) {
                              if (!SystemData.isWing) {
                                 String var13 = var5[var6].substring(1);
                                 String var35 = "'t|";
                                 com.xy.w.Class0 var14 = com.xy.w.Class11.t("tx/" + var13 + "0", -2, -5, null);
                                 if (this.ac == null) {
                                    this.ac = var14;
                                 } else {
                                    this.ac = this.ac.q(var14);
                                 }

                                 var35 = "\u0000B[";
                                 var14 = com.xy.w.Class11.t("tx/" + var13 + "1", -2, 5, null);
                                 this.ac = this.ac.q(var14);
                              }
                           } else {
                              var10000 = var5[var6];
                              var10001 = "\u0015";
                              if (var10000.startsWith("F")) {
                                 var4 = var5[var6].substring(1);
                              }
                           }
                        }
                     }
                  }
                  continue;
               }
            }

            if (var2.getMount_id() == 0 || var1 == null || var1.length() >= 10) {
               String[] var7 = var5[var6].substring(1).split("_");
               String var10002 = "'t|x+";
               com.xy.w.Class0 var8 = com.xy.w.Class11.t("tx/tx" + var7[0], -2, Integer.parseInt(var7[1]), null);
               if (this.ac == null) {
                  this.ac = var8;
               } else {
                  this.ac = this.ac.q(var8);
               }
            }
         }
      }

      Class4 var24;
      if (var1 == null || var2 != null && var2.getMount_id() != 0 && var1.length() >= 10) {
         if (SystemData.ISMOUNT && var2.getMount_id() != 0 && var4 == null) {
            com.xy.w.Class0 var11 = com.xy.w.Class11.p((long)var2.getMount_id() << 40 | var2.getSpecies_id().longValue(), 2, 1, null);
            if (this.ac == null) {
               this.ac = var11;
               var24 = this;
            } else {
               this.ac = this.ac.q(var11);
               var24 = this;
            }
         } else {
            com.xy.w.Class0 var10 = com.xy.w.Class11.p(var2.getSpecies_id().longValue(), 2, 1, null);
            if (this.ac == null) {
               this.ac = var10;
               var24 = this;
            } else {
               this.ac = this.ac.q(var10);
               var24 = this;
            }
         }
      } else {
         com.xy.w.Class0 var9 = com.xy.w.Class11.t(var1, 2, 1, null);
         if (this.ac == null) {
            this.ac = var9;
            var24 = this;
         } else {
            this.ac = this.ac.q(var9);
            var24 = this;
         }
      }

      var24.ac.w((String)var4);
      if (!var3) {
         this.ai = null;
      }

      if (var2 != null) {
         Class8 var25 = (Class8)this;
         boolean var33;
         RoleShow var37;
         if (var4 != null) {
            var33 = true;
            var37 = var2;
         } else {
            var33 = false;
            var37 = var2;
         }

         var25.bf(var33, var37.getMount_id() == 7);
      }
   }

   public boolean l(int var1, int var2) {
      return this.ac.h(var1 - this.ae, var2 - this.v);
   }

   public FloatBox ag(String var1) {
      if (var1 != null && !var1.equals("")) {
         synchronized (this) {
            FloatBox var3;
            for (FloatBox var10000 = var3 = this.af; var10000 != null; var10000 = var3 = var3.nextFloatBox) {
               if (Class12.am(var1, var3.getText())) {
                  return null;
               }
            }

            var3 = new FloatBox(var1);
            this.ax(var3);
            return var3;
         }
      } else {
         return null;
      }
   }

   public boolean ah() {
      return this.ad != null && this.ad.b();
   }

   public void ai(double var1) {
      if (this.ad != null) {
         this.ad.setSp(var1);
      }
   }

   public void d(Graphics var1) {
   }

   public void aj(long var1, com.xy.n.Class0 var3) {
      this.z += var1;
      if (this.ai != null) {
         this.ai.b(var1);
      }

      if (this.ad != null) {
         this.ad.d(var1, this);
      }

      this.y();
   }

   public FloatBox ak(String var1) {
      if (var1 != null && !var1.equals("")) {
         FloatBox var2 = new FloatBox(var1);
         this.ax(var2);
         return var2;
      } else {
         return null;
      }
   }

   public void al(int var1, int var2, int var3) {
      if (this.ad != null) {
         this.ad.setValue(0, 0L, null);
      }

      this.u(var1, var2, var3, this.ak);
      this.s(2);
   }

   public void am(com.xy.w.Class0 var1) {
      this.ac = var1;
   }

   public void an(Graphics var1) {
      Graphics2D var2;
      Graphics2D var10000 = var2 = (Graphics2D)var1;
      Object var3 = var10000.getRenderingHint(RenderingHints.KEY_STROKE_CONTROL);
      Object var4 = var10000.getRenderingHint(RenderingHints.KEY_ANTIALIASING);
      Graphics var8;
      if (var3 != RenderingHints.VALUE_STROKE_DEFAULT) {
         var8 = (Graphics)var4;
         var2.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_DEFAULT);
      } else {
         var3 = null;
         var8 = (Graphics)var4;
      }

      if (var8 != RenderingHints.VALUE_ANTIALIAS_ON) {
         var8 = var1;
         var2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      } else {
         var4 = null;
         var8 = var1;
      }

      var8.setFont(Class49.ab);
      int var5 = this.y + 23;
      if (this.ag != null) {
         if (this.am == 0) {
            this.am = var1.getFontMetrics().stringWidth(this.ag) / 2;
         }

         int var6 = this.x - this.am;
         var1.setColor(Class49.z);
         var1.drawString(this.ag, var6 + 1, var5 + 1);
         var1.setColor(Class49.u);
         int var10003 = var5;
         var5 += 19;
         var1.drawString(this.ag, var6, var10003);
      }

      if (this.w != null) {
         if (this.aj == 0) {
            this.aj = var1.getFontMetrics().stringWidth(this.w) / 2;
         }

         int var7 = this.x - this.aj;
         var1.setColor(Class49.z);
         var1.drawString(this.w, var7 + 1, var5 + 1);
         var1.setColor(Class49.cb);
         var1.drawString(this.w, var7, var5);
      }

      if (var3 != null) {
         var2.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, var3);
      }

      if (var4 != null) {
         var2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, var4);
      }
   }

   public static int ao(int var0) {
      if (var0 == 1) {
         return 0;
      } else if (var0 == 3) {
         return 5;
      } else if (var0 == 5) {
         return 1;
      } else {
         return var0 == 7 ? 7 : 1;
      }
   }

   public int ap() {
      return this.ak;
   }

   public void aq(String var1) {
      this.ag = var1;
      this.am = 0;
   }

   public GameMove ar() {
      return this.ad;
   }

   public void as() {
      if (this.ad != null) {
         this.ad.setValue(0, 0L, null);
         this.s(2);
      }
   }

   public com.xy.w.Class0 at() {
      return this.ac;
   }

   public void au(String var1) {
      this.w = var1;
      this.aj = 0;
   }

   public abstract void b(GameView var1);

   public int av() {
      return this.ac != null ? this.ac.j() : 0;
   }

   public void aw(Graphics var1) {
   }

   public void ax(FloatBox var1) {
      synchronized (this) {
         if (this.af == null) {
            this.af = var1;
         } else {
            var1.nextFloatBox = this.af;
            this.af = var1;
         }
      }
   }
}
