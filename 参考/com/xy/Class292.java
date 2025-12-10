package com.xy;

import com.xy.bean.PathPoint;
import com.xy.bean.RoleShow;
import com.xy.game.GameMove;
import com.xy.richtext.FloatBox;
import com.xy.text.GameView;
import com.xy.text.SystemData;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.util.List;

public abstract class Class292 {
   protected Color aa;
   public int ab;
   public int ac;
   protected String ad;
   protected FloatBox ae;
   protected Class19 af;
   protected int ag;
   private static int h = 3 ^ 3;
   public int ah = ap();
   protected String ai;
   protected int aj;
   public int ak;
   public int al;
   public int am;
   public long an;
   protected Class446 ao;
   public long ap;
   protected GameMove aq;
   public int ar;
   public int as;

   public FloatBox as(String var1) {
      if (var1 != null && !var1.equals("")) {
         FloatBox var2 = new FloatBox(var1);
         this.bj(var2);
         return var2;
      } else {
         return null;
      }
   }

   public void at(boolean var1) {
      if (this.aq == null) {
         this.aj();
      }

      this.aq.setFlag(var1);
   }

   public boolean au() {
      return (boolean)(this.aq != null && this.aq.b() ? --1 : 0);
   }

   public void aj() {
      if (this.aq == null) {
         this.aq = new GameMove(this instanceof Class514 ? 0.5D : (this instanceof Class572 ? 0.07D : 0.24D));
      }

      this.aq.setSp(this instanceof Class514 ? 0.5D : (this instanceof Class572 ? 0.07D : 0.24D));
   }

   public void av(int var1, long var2, String var4) {
      if (this.aq == null) {
         this.aj();
      }

      if (!this.aq.a() || var1 <= 0) {
         this.aq.setValue(var1, var2, var4);
         if (var4 != null) {
            this.x(this.aq.x1, this.aq.y1, this.aq.z1, this.as);
         }

      }
   }

   public void n(Graphics var1) {
   }

   public void o(long var1, Class471 var3) {
      this.an += var1;
      if (this.ao != null) {
         this.ao.d(var1);
      }

      if (this.aq != null) {
         this.aq.d(var1, this);
      }

      this.bf();
   }

   public String aw() {
      return this.ad;
   }

   public void k(Graphics var1) {
   }

   public void ax(String var1) {
      int var10001 = 2 & 5;
      this.ad = var1;
      this.ag = var10001;
   }

   public void b(Graphics var1, Class292 var2, GameView var3) {
      if (!SystemData.ISTCP && this.ac == --1) {
         this.af.n();
         if (SystemData.ISNAME) {
            this.t(var1);
         }

         this.k(var1);
      } else {
         Class292 var10000;
         if (var3.mapScene.w(this.ab / Class409.a, this.al / Class409.a, 5 >> 3)) {
            if (var2 == this) {
               var10000 = this;
               this.af.t(var1, this.am, this.ak, this.as, this.an, 0.6F);
            } else {
               var10000 = this;
               this.af.w(var1, this.am, this.ak, this.as, this.an, 0.6F);
            }
         } else if (var2 == this) {
            var10000 = this;
            this.af.t(var1, this.am, this.ak, this.as, this.an, 1.0F);
         } else {
            var10000 = this;
            this.af.a(var1, this.am, this.ak, this.as, this.an);
         }

         if (var10000.ao != null) {
            this.ao.b(var1, var3);
         }

      }
   }

   public Class19 ay() {
      return this.af;
   }

   public abstract int l(Class292 var1);

   public void az(int var1) {
      if (this.af.z() != var1) {
         this.af.r(var1);
      }
   }

   public void ba(String var1, RoleShow var2) {
      int var5 = 3 ^ 3;
      Object var4 = this.af = null;
      if (var2 != null && !Class394.o(var2.getSkin())) {
         String[] var3 = var2.getSkin().split("\\|");

         int var6;
         for(int var10000 = var6 = 3 & 4; var10000 < var3.length; var10000 = var6) {
            Class19 var8;
            if (!var3[var6].startsWith("X") && !var3[var6].startsWith("P")) {
               if (var3[var6].startsWith("J")) {
                  var5 = 5 >> 2;
                  if (this.ao == null) {
                     this.ao = new Class446("tx/tx" + var3[var6].substring(3 >> 1));
                  } else {
                     this.ao.c("tx/tx" + var3[var6].substring(3 & 5));
                  }
               } else if (var3[var6].startsWith("S")) {
                  var1 = var3[var6].substring(3 & 5);
               } else if (var3[var6].startsWith("C")) {
                  Class19 var10 = Class330.f("tx/" + var3[var6].substring(--1), -1 & -2, 102 & 31, (String)null);
                  if (this.af == null) {
                     this.af = var10;
                  } else {
                     this.af = this.af.d(var10);
                  }
               } else if (var3[var6].startsWith("B")) {
                  if (!SystemData.isWing) {
                     String var11 = var3[var6].substring(3 >> 1);
                     var8 = Class330.f("tx/" + var11 + "0", -1 & -2, -5 & -1, (String)null);
                     if (this.af == null) {
                        this.af = var8;
                     } else {
                        this.af = this.af.d(var8);
                     }

                     var8 = Class330.f("tx/" + var11 + "1", -1 & -2, --5, (String)null);
                     this.af = this.af.d(var8);
                  }
               } else if (var3[var6].startsWith("F")) {
                  var4 = var3[var6].substring(--1);
               }
            } else if (var2.getMount_id() == 0 || var1 == null || var1.length() >= (127 & 10)) {
               String[] var7 = var3[var6].substring(2 ^ 3).split("_");
               var8 = Class330.f("tx/tx" + var7[2 & 5], -2 & -1, Integer.parseInt(var7[--1]), (String)null);
               if (this.af == null) {
                  this.af = var8;
               } else {
                  this.af = this.af.d(var8);
               }
            }

            ++var6;
         }
      }

      Class19 var9;
      Class292 var12;
      if (var1 != null && (var2 == null || var2.getMount_id() == 0 || var1.length() < (106 & 31))) {
         var9 = Class330.f(var1, 5 >> 1, --1, (String)null);
         if (this.af == null) {
            this.af = var9;
            var12 = this;
         } else {
            this.af = this.af.d(var9);
            var12 = this;
         }
      } else if (SystemData.ISMOUNT && var2.getMount_id() != 0 && var4 == null) {
         var9 = Class330.ai((long)var2.getMount_id() << (111 & 56) | var2.getSpecies_id().longValue(), 5 >> 1, 4 ^ 5, (String)null);
         if (this.af == null) {
            this.af = var9;
            var12 = this;
         } else {
            this.af = this.af.d(var9);
            var12 = this;
         }
      } else {
         var9 = Class330.ai(var2.getSpecies_id().longValue(), 1 ^ 3, 4 ^ 5, (String)null);
         if (this.af == null) {
            this.af = var9;
            var12 = this;
         } else {
            this.af = this.af.d(var9);
            var12 = this;
         }
      }

      var12.af.q((String)var4);
      if (var5 == 0) {
         this.ao = null;
      }

      if (var2 != null) {
         Class183 var13 = (Class183)this;
         int var10001;
         RoleShow var10002;
         if (var4 != null) {
            var10001 = 3 >> 1;
            var10002 = var2;
         } else {
            var10001 = 0;
            var10002 = var2;
         }

         var13.aq((boolean)var10001, (boolean)(var10002.getMount_id() == (47 & 87) ? 3 >> 1 : 0));
      }

   }

   public GameMove bb() {
      return this.aq;
   }

   public int bc() {
      return this.as;
   }

   public boolean bd(GameView var1) {
      Point var2;
      if ((var2 = var1.mapCamera.i(this.ab, this.al)) == null) {
         if (this.af != null) {
            this.af.n();
         }

         return false;
      } else {
         this.am = var2.x;
         this.ak = var2.y;
         return (boolean)(2 ^ 3);
      }
   }


   private static int ap() {
      int var10000 = h;
      h = var10000 + --1;
      return var10000;
   }

   public int be() {
      return this.af != null ? this.af.z() : 0;
   }

   public void bf() {
      if (this.ae != null) {
         synchronized(this) {
            long var2 = Class280.l();
            FloatBox var4 = null;

            FloatBox var1;
            for(FloatBox var10000 = var1 = this.ae; var10000 != null; var10000 = var1 = var10000.nextFloatBox) {
               if (var1.IsTime(var2)) {
                  var4 = var1;
                  var10000 = var1;
               } else {
                  var1.removeLabel();
                  if (var4 != null) {
                     var10000 = var1;
                     var4.nextFloatBox = var1.nextFloatBox;
                  } else {
                     this.ae = var1.nextFloatBox;
                     var10000 = var1;
                  }
               }
            }

         }
      }
   }

   public Class292() {
      this.aa = Class681.bp;
   }

   public void bg(Class116 var1) {
      this.ab = var1.a;
      this.al = var1.b;
      this.as = var1.d;
      this.az(var1.c);
   }

   public abstract void a(GameView var1);

   public void bh(Class19 var1) {
      this.af = var1;
   }

   public void x(int var1, int var2, int var3, int var4) {
      this.ab = var1;
      this.al = var2;
      this.ar = var3;
      this.as = var4;
   }

   public void ag(String var1, Color var2) {
      int var10001 = 3 & 4;
      this.ai = var1;
      this.aa = var2;
      this.aj = var10001;
   }

   public static int bi(int var0) {
      if (var0 == --1) {
         return 5 >> 3;
      } else if (var0 == --3) {
         return --5;
      } else if (var0 == --5) {
         return --1;
      } else {
         return var0 == (127 & 7) ? 111 & 23 : 1;
      }
   }

   public void bj(FloatBox var1) {
      synchronized(this) {
         if (this.ae == null) {
            this.ae = var1;
         } else {
            var1.nextFloatBox = this.ae;
            this.ae = var1;
         }
      }
   }

   public FloatBox bk(String var1) {
      if (var1 != null && !var1.equals("")) {
         FloatBox var4 = new FloatBox(var1);
         synchronized(this) {
            FloatBox var2;
            for(FloatBox var10000 = var2 = this.ae; var10000 != null; var10000 = var2 = var2.nextFloatBox) {
               if (Class394.r(var1, var2.getText())) {
                  return null;
               }
            }

            this.bj(var4);
            return var4;
         }
      } else {
         return null;
      }
   }

   public void j(Graphics var1) {
      this.t(var1);
      this.bn(var1);
      this.k(var1);
      this.n(var1);
   }

   public void bl(double var1) {
      if (this.aq != null) {
         this.aq.setSp(var1);
      }
   }

   public void t(Graphics var1) {
      Graphics2D var6;
      Graphics2D var10000 = var6 = (Graphics2D)var1;
      Object var4 = var10000.getRenderingHint(RenderingHints.KEY_STROKE_CONTROL);
      Object var3 = var10000.getRenderingHint(RenderingHints.KEY_ANTIALIASING);
      Object var7;
      if (var4 != RenderingHints.VALUE_STROKE_DEFAULT) {
         var7 = var3;
         var6.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_DEFAULT);
      } else {
         var4 = null;
         var7 = var3;
      }

      Graphics var8;
      if (var7 != RenderingHints.VALUE_ANTIALIAS_ON) {
         var8 = var1;
         var6.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      } else {
         var3 = null;
         var8 = var1;
      }

      var8.setFont(Class681.cd);
      int var5 = this.ak + (23 & 127);
      int var2;
      if (this.ai != null) {
         if (this.aj == 0) {
            this.aj = var1.getFontMetrics().stringWidth(this.ai) / (5 >> 1);
         }

         var2 = this.am - this.aj;
         var1.setColor(Class681.au);
         var1.drawString(this.ai, var2 + (5 >> 2), var5 + (3 & 5));
         var1.setColor(this.aa);
         int var10003 = var5;
         var5 += 19;
         var1.drawString(this.ai, var2, var10003);
      }

      if (this.ad != null) {
         if (this.ag == 0) {
            this.ag = var1.getFontMetrics().stringWidth(this.ad) / (5 >> 1);
         }

         var2 = this.am - this.ag;
         var1.setColor(Class681.au);
         var1.drawString(this.ad, var2 + --1, var5 + (4 ^ 5));
         var1.setColor(Class681.cp);
         var1.drawString(this.ad, var2, var5);
      }

      if (var4 != null) {
         var6.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, var4);
      }

      if (var3 != null) {
         var6.setRenderingHint(RenderingHints.KEY_ANTIALIASING, var3);
      }

   }

   public boolean c(int var1, int var2) {
      return this.af.x(var1 - this.ab, var2 - this.al);
   }

   public void bm(int var1, int var2, int var3) {
      if (this.aq != null) {
         this.aq.setValue(3 & 4, 0L, (String)null);
      }

      int var10001 = --2;
      this.x(var1, var2, var3, this.as);
      this.az(var10001);
   }

   public void bn(Graphics var1) {
      if (this.ae != null) {
         synchronized(this) {
            if (this.ae != null) {
               int var3;
               if ((var3 = this.af.m()) != -4 >> 2) {
                  ((Graphics2D)var1).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_DEFAULT);
                  var3 = this.ak - var3 + (45 & 90);

                  FloatBox var4;
                  for(FloatBox var10000 = var4 = this.ae; var10000 != null; var10000 = var4 = var4.nextFloatBox) {
                     int var5 = this.am - var4.getWidth() / --2;
                     var3 -= var4.getHeight() + (1 ^ 3);
                     var1.translate(var5, var3);
                     var4.paint(var1);
                     var1.translate(-var5, -var3);
                  }

                  ((Graphics2D)var1).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
               }
            }
         }
      }
   }

   public static Class19 bo(String var0, RoleShow var1) {
      int var10000 = 3 & 4;
      Class19 var2 = null;
      String var4 = null;
      if (var1 != null && !Class394.o(var1.getSkin())) {
         String[] var3 = var1.getSkin().split("\\|");

         int var5;
         for(var10000 = var5 = 3 ^ 3; var10000 < var3.length; var10000 = var5) {
            Class19 var7;
            if (!var3[var5].startsWith("X") && !var3[var5].startsWith("P")) {
               if (var3[var5].startsWith("J")) {
                  var10000 = --1;
               } else if (var3[var5].startsWith("S")) {
                  var0 = var3[var5].substring(--1);
               } else if (var3[var5].startsWith("C")) {
                  Class19 var9 = Class330.f("tx/" + var3[var5].substring(3 >> 1), -2 & -1, 47 & 86, (String)null);
                  if (var2 == null) {
                     var2 = var9;
                  } else {
                     var2 = var2.d(var9);
                  }
               } else if (var3[var5].startsWith("B")) {
                  if (!SystemData.isWing) {
                     String var10 = var3[var5].substring(--1);
                     var7 = Class330.f("tx/" + var10 + "0", -2 & -1, -5 & -1, (String)null);
                     if (var2 == null) {
                        var2 = var7;
                     } else {
                        var2 = var2.d(var7);
                     }

                     var7 = Class330.f("tx/" + var10 + "1", -1 & -2, --5, (String)null);
                     var2 = var2.d(var7);
                  }
               } else if (var3[var5].startsWith("F")) {
                  var4 = var3[var5].substring(3 & 5);
               }
            } else if (var1.getMount_id() == 0 || var0 == null || var0.length() >= (90 & 47)) {
               String[] var6 = var3[var5].substring(2 ^ 3).split("_");
               var7 = Class330.f("tx/tx" + var6[5 >> 3], -1 & -2, Integer.parseInt(var6[--1]), (String)null);
               if (var2 == null) {
                  var2 = var7;
               } else {
                  var2 = var2.d(var7);
               }
            }

            ++var5;
         }
      }

      Class19 var8;
      Class19 var11;
      if (var0 != null && (var1 == null || var1.getMount_id() == 0 || var0.length() < (10 & 127))) {
         var8 = Class330.f(var0, 5 >> 1, --1, (String)null);
         var11 = var2 == null ? (var2 = var8) : (var2 = var2.d(var8));
      } else if (SystemData.ISMOUNT && var1.getMount_id() != 0 && var4 == null) {
         var8 = Class330.ai((long)var1.getMount_id() << (120 & 47) | var1.getSpecies_id().longValue(), 1 ^ 3, 3 >> 1, (String)null);
         var11 = var2 == null ? (var2 = var8) : (var2 = var2.d(var8));
      } else {
         var8 = Class330.ai(var1.getSpecies_id().longValue(), 1 ^ 3, 4 ^ 5, (String)null);
         var11 = var2 == null ? (var2 = var8) : (var2 = var2.d(var8));
      }

      var11.q(var4);
      return var2;
   }

   public static Class19 bp(Class19 var0, Class19 var1) {
      return var0 == null ? var1 : var0.d(var1);
   }

   public void bq() {
      if (this.aq != null) {
         int var10001 = 1 ^ 3;
         this.aq.setValue(5 >> 3, 0L, (String)null);
         this.az(var10001);
      }
   }

   public void br(Class116 var1) {
      this.ab = var1.a + --5;
      this.al = var1.b + --5;
      this.as = var1.d;
      this.az(var1.c);
   }

   public void bs(List<PathPoint> var1, double var2) {
      List var10000;
      if (this.aq == null) {
         this.aq = new GameMove(var2);
         var10000 = var1;
      } else {
         this.aq.setSp(var2);
         var10000 = var1;
      }

      if (var10000 != null && var1.size() >= --2) {
         StringBuffer var5 = new StringBuffer(var1.size() * (126 & 9));

         int var3;
         for(int var6 = var3 = 2 & 5; var6 < var1.size(); var6 = var3) {
            PathPoint var4 = (PathPoint)var1.get(var3);
            if (var3 != 0) {
               var5.append("*");
            }

            var5.append(var4.getX());
            var5.append("*");
            ++var3;
            var5.append(var4.getY());
         }

         this.aq.setValue(3 & 4, 0L, var5.toString());
      } else {
         this.aq.setValue(5 >> 3, 0L, (String)null);
      }
   }
}
