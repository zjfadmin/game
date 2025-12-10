package com.xy;

import com.xy.bean.SuitOperBean;
import com.xy.entity.PartJade;
import com.xy.game.RoleData;
import com.xy.readbean.Skill;
import com.xy.readbean.StarSoul;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

public class Class551 extends Class345 {
   private Class8 xf;
   private <undefinedtype>[] aff;
   private <undefinedtype> afg;
   private long afh;
   public static Class8 nb = null;
   private Class8 afi;
   private <undefinedtype> afj;
   private static Class8 afk;
   private <undefinedtype> afl;
   private List<null> ie;
   private int cy;
   private static Class8 bc;

   public void d() {
      int var10 = 3 >> 2;
      RoleData var5 = this.vd();
      Class603 var9 = this.vc();

      int var4;
      for(int var10000 = var4 = 3 ^ 3; var10000 < this.aff.length; var10000 = var4) {
         StarSoul var2 = var9.k((16185 & 26582) + this.aff[var4].bn);
         long var6 = var5.getPackRecord().getStarSoulType(var2.getId());
         int var8 = Class394.f((char)('\u007f' & '|'), var2.getValue()) + (2 ^ 3);
         int var3 = --1;

         int var1;
         label53: {
            for(var10000 = var1 = 3 >> 2; var10000 < var8; var10000 = var1) {
               if ((var6 >> var1 & 1L) != 1L) {
                  var10000 = var3 = 0;
                  break label53;
               }

               ++var1;
            }

            var10000 = var3;
         }

         if (var10000 != 0) {
            ++var10;
         }

         this.aff[var4].bb = (boolean)var3;
         if (this.cy + (14235 & 28532) == var2.getId()) {
            for(var10000 = var1 = 3 & 4; var10000 < var8; var10000 = var1) {
               <undefinedtype> var11 = var1 < this.ie.size() ? (<undefinedtype>)this.ie.get(var1) : null;
               int var10001 = var11.m;
               int var10002;
               Class551 var10003;
               if ((var6 >> var1 & 1L) == 1L) {
                  var10002 = 3 & 5;
                  var10003 = this;
               } else {
                  var10002 = 0;
                  var10003 = this;
               }

               var11.vl(var10001, (boolean)var10002, var10003.vn(this.cy, var1++));
            }
         }

         ++var4;
      }

      this.afg.ab(var10);
      this.afg.y((int)var5.getPackRecord().getStarSoulType(24416 & 28351));
      this.afl.cy = this.afg.cy == this.cy ? 1 ^ 3 : (this.cy > 0 && this.aff[this.cy - --1].bb ? 5 >> 2 : 0);
   }

   public Class551(GameView var1) {
      int var10001 = 120 & 15;
      int var10006 = -4 >> 2;
      super(9945 & 22959, --2, Class345.aef, var1);
      this.afh = -1L;
      this.va(var10006, 2 & 5, 26279 & 7134, 4052 & 29179, Class345.aei);
      this.afj = new Class111(-4 >> 2) {
         private int cy;

         public void af(MouseEvent var1) {
            if (this.cy == -4 >> 2) {
               Class551.this.ve().a(11178 & 21727);
            }

         }

         public void ac(MouseEvent var1, boolean var2) {
         }

         public {
            this.cy = var2;
            if (var2 == -4 >> 2) {
               Image[] var10000 = new Image[--3];
               boolean var10002 = true;
               Image[] var3 = var10000;
               Class8 var4;
               if ((var4 = Class330.s("sc/bang/XPBtnXP.tcp", (short[])null)) != null) {
                  int var10001 = --2;
                  int var10003 = --1;
                  var3[3 & 4] = Class330.l(var4.n(), var4.c()[3 & 4], var4);
                  var3[var10003] = Class330.l(var4.n(), var4.c()[5 >> 1], var4);
                  var3[var10001] = Class330.l(var4.n(), var4.c()[4 ^ 5], var4);
               }

               if (var3[3 & 4] == null || var3[5 >> 2] == null || var3[--2] == null) {
                  var3[3 & 4] = var3[2 ^ 3] = var3[1 ^ 3] = Class511.p();
               }

               this.aeu(var3);
            }

         }
      };
      this.afj.setBounds(127 & 123, 20351 & 12792, 63 & 127, 63 & 122);
      this.add(this.afj);
      this.afg = new MouseListener() {
         private Class8 bm;
         private int bn;
         private int cy;
         private Class8 bc;

         public void y(int var1) {
            if (this.cy != var1) {
               this.cy = var1;
               this.bc = this.cy != 0 ? Class330.s("sc/bang/XPJH" + this.cy + ".tcp", (short[])null) : null;
            }
         }

         public void mouseExited(MouseEvent var1) {
            Class551.this.aej.getFormManagement().n(127 & 46);
         }

         public {
            this.addMouseListener(this);
         }

         public Class8 jk(int var1) {
            return var1 == this.cy ? this.bc : null;
         }

         public void mouseClicked(MouseEvent var1) {
         }

         public void mousePressed(MouseEvent var1) {
         }

         protected void paintComponent(Graphics var1) {
            super.paintComponent(var1);
            if (this.bm != null) {
               this.bm.d(Class280.l(), 2 & 5);
               this.bm.aa(var1, 63 & 121, 87 & 105);
            }

         }

         public void mouseEntered(MouseEvent var1) {
            Class603 var10000 = Class551.this.vc();
            Skill var2;
            if ((var2 = var10000.bf(String.valueOf(var10000.z().getSkillId()))) != null) {
               ((Class270)Class551.this.ve().e(111 & 62)).sa(2 ^ 3, var2, this.bn);
            }
         }

         public void ab(int var1) {
            if (this.bn != var1) {
               this.bn = var1;
               this.bm = this.bn != 0 ? Class330.s("sc/bang/XPJD" + this.bn + ".tcp", (short[])null) : null;
            }
         }

         public void mouseReleased(MouseEvent var1) {
         }
      };
      this.afg.setBounds(28623 & 4595, 15318 & 17789, 122 & 117, 124 & 127);
      this.add(this.afg);
      this.afl = new MouseListener() {
         private int cy;

         public void mousePressed(MouseEvent var1) {
            if (this.cy == --1) {
               SuitOperBean var2 = new SuitOperBean();
               var2.setType(117 & 126);
               var2.setJade(new PartJade((long)(Class551.this.cy + (10138 & 32629)), 3 & 4));
               String var3 = Agreement.getSendTextAES("suitoperate", Class695.b().toJson(var2));
               Class551.this.uw().d(var3);
            }

         }

         public void mouseReleased(MouseEvent var1) {
         }

         public void mouseClicked(MouseEvent var1) {
         }

         public {
            this.addMouseListener(this);
         }

         protected void paintComponent(Graphics var1) {
            super.paintComponent(var1);
            if (this.cy == 0) {
               Graphics2D var2 = (Graphics2D)var1;
               int var10002 = 3 >> 2;
               var2.setComposite(Class8.m);
               var2.setColor(Color.BLACK);
               var2.fillRect(var10002, 3 >> 2, this.getWidth(), this.getHeight());
               var2.setComposite(Class8.g);
            }

         }

         public void mouseEntered(MouseEvent var1) {
            Class603 var3 = Class551.this.vc();
            StarSoul var2 = Class551.this.cy != 0 ? var3.k((10141 & 32626) + Class551.this.cy) : null;
            if (var2 != null) {
               Skill var4;
               if ((var4 = var3.bf(String.valueOf(var2.getLvl()))) != null) {
                  ((Class270)Class551.this.ve().e(127 & 46)).sa(3 ^ 3, var4, this.cy);
               }
            }
         }

         public void mouseExited(MouseEvent var1) {
            Class551.this.ve().e(47 & 126);
         }
      };
      this.add(this.afl);
      <undefinedtype>[] var3 = new <undefinedtype>[var10001];
      boolean var10003 = true;
      this.aff = var3;

      int var2;
      for(int var10000 = var2 = 3 & 4; var10000 < this.aff.length; var10000 = var2) {
         this.aff[var2] = new Class111(var2 + (3 & 5)) {
            private Class8 bm;
            private int bn;
            private boolean bb;

            public void ac(MouseEvent var1, boolean var2) {
            }

            public void af(MouseEvent var1) {
               if (Class551.this.afh == -1L) {
                  Class551.this.afh = Class280.l();
                  Class551.this.y(this.bn);
               }
            }

            public void mouseExited(MouseEvent var1) {
               super.mouseExited(var1);
               Class551.this.aej.getFormManagement().n(110 & 63);
            }

            public {
               this.aeu(Class551.vo(var2));
               this.bn = var2;
               if (var2 == (2 ^ 3)) {
                  this.setBounds(3071 & 29943, 79 & 56, 30943 & 1961, 115 & 77);
               } else if (var2 == (1 ^ 3)) {
                  this.setBounds(19879 & 13276, 94 & 61, 127 & 115, 125 & 115);
               } else if (var2 == --3) {
                  this.setBounds(25055 & 8181, 31725 & 1183, 101 & 91, 12011 & 20893);
               } else if (var2 == --4) {
                  this.setBounds(11707 & 21455, 21434 & 11613, 127 & 114, 123 & 119);
               } else if (var2 == --5) {
                  this.setBounds(263, 365, 135, 61);
               } else if (var2 == 6) {
                  this.setBounds(146, 291, 114, 116);
               } else if (var2 == 7) {
                  this.setBounds(115, 156, 65, 140);
               } else {
                  if (var2 == 8) {
                     this.setBounds(137, 39, 114, 113);
                  }

               }
            }

            public void mouseEntered(MouseEvent var1) {
               super.mouseEntered(var1);
               StarSoul var2 = Class551.this.vc().k((28446 & 14321) + this.bn);
               ((Class270)Class551.this.ve().e(127 & 46)).sg(var2, (long)(this.bb ? 4 ^ 5 : 0));
            }

            protected void ar(Class8 var1, Graphics var2) {
               Class8 var10000;
               label18: {
                  if (this.bb) {
                     if (this.bm != null) {
                        this.bm.d(Class280.l(), 2 & 5);
                        var10000 = var1;
                        this.bm.aa(var2, this.getX(), this.getY());
                        break label18;
                     }

                     this.bm = Class330.s("sc/bang/XPDL" + this.bn + ".tcp", (short[])null);
                  }

                  var10000 = var1;
               }

               if (var10000 != null) {
                  var1.d(Class280.l(), 3 >> 2);
                  var1.aa(var2, this.getX(), this.getY());
               }

            }
         };
         this.add(this.aff[var2++]);
      }

      this.ie = new ArrayList();
   }

   public Point vn(int var1, int var2) {
      if (var1 == (3 & 5)) {
         if (var2 == 0) {
            return new Point(29063 & 4093, 4090 & 28877);
         }

         if (var2 == --1) {
            return new Point(5477 & 27578, 21241 & 11775);
         }

         if (var2 == --2) {
            return new Point(22269 & 10750, 13486 & 19445);
         }
      } else if (var1 == (1 ^ 3)) {
         if (var2 == 0) {
            return new Point(19927 & 13176, 31741 & 1271);
         }

         if (var2 == 5 >> 2) {
            return new Point(19350 & 13695, 15222 & 17819);
         }

         if (var2 == --2) {
            return new Point(30955 & 2045, 10968 & 22015);
         }

         if (var2 == --3) {
            return new Point(21849 & 11174, 125 & 127);
         }
      } else if (var1 == --3) {
         if (var2 == 0) {
            return new Point(17295 & 15871, 30367 & 2544);
         }

         if (var2 == (4 ^ 5)) {
            return new Point(229, 270);
         }

         if (var2 == 5 >> 1) {
            return new Point(302, 250);
         }

         if (var2 == --3) {
            return new Point(250, 201);
         }

         if (var2 == --4) {
            return new Point(348, 117);
         }
      } else if (var1 == --4) {
         if (var2 == 0) {
            return new Point(322, 244);
         }

         if (var2 == (2 ^ 3)) {
            return new Point(268, 238);
         }

         if (var2 == (1 ^ 3)) {
            return new Point(297, 199);
         }

         if (var2 == --3) {
            return new Point(390, 166);
         }

         if (var2 == --4) {
            return new Point(366, 112);
         }
      } else if (var1 == --5) {
         if (var2 == 0) {
            return new Point(394, 143);
         }

         if (var2 == --1) {
            return new Point(401, 190);
         }

         if (var2 == --2) {
            return new Point(232, 232);
         }

         if (var2 == --3) {
            return new Point(309, 213);
         }

         if (var2 == --4) {
            return new Point(244, 179);
         }

         if (var2 == 5) {
            return new Point(299, 137);
         }
      } else if (var1 == 6) {
         if (var2 == 0) {
            return new Point(335, 266);
         }

         if (var2 == --1) {
            return new Point(430, 200);
         }

         if (var2 == 2) {
            return new Point(354, 184);
         }

         if (var2 == 3) {
            return new Point(361, 130);
         }

         if (var2 == 4) {
            return new Point(296, 126);
         }
      } else if (var1 == 7) {
         if (var2 == 0) {
            return new Point(392, 290);
         }

         if (var2 == 5 >> 2) {
            return new Point(363, 210);
         }

         if (var2 == 2) {
            return new Point(291, 166);
         }

         if (var2 == 3) {
            return new Point(298, 115);
         }
      } else if (var1 == 8) {
         if (var2 == 0) {
            return new Point(398, 142);
         }

         if (var2 == 5 >> 2) {
            return new Point(347, 208);
         }

         if (var2 == 2) {
            return new Point(247, 274);
         }

         if (var2 == 3) {
            return new Point(236, 214);
         }
      } else if (var1 == 100) {
         if (var2 == --1) {
            return new Point(300, 85);
         }

         if (var2 == 2) {
            return new Point(353, 121);
         }

         if (var2 == 3) {
            return new Point(354, 259);
         }

         if (var2 == 4) {
            return new Point(300, 288);
         }

         if (var2 == 5) {
            return new Point(351, 260);
         }

         if (var2 == 6) {
            return new Point(206, 187);
         }

         if (var2 == 7) {
            return new Point(267, 270);
         }

         if (var2 == 8) {
            return new Point(357, 257);
         }
      }

      return new Point(3 >> 2, 3 >> 2);
   }

   public void as(int var1) {
      Class551 var10000;
      label18: {
         this.d();
         if (var1 == -4 >> 2) {
            if (this.cy == 0) {
               var1 = 5 >> 2;
               var10000 = this;
               break label18;
            }

            var1 = this.cy;
         }

         var10000 = this;
      }

      var10000.y(var1);
      if (this.ve().m(this.ae()) == null) {
         this.ve().a(this.ae());
      }

   }

   public static Image[] vo(int var0) {
      Image[] var10000 = new Image[--3];
      boolean var10002 = true;
      Image[] var1 = var10000;
      Class8 var2;
      if ((var2 = Class330.s("sc/bang/XPBtn" + var0 + ".tcp", (short[])null)) != null) {
         int var10001 = 5 >> 1;
         var1[--1] = Class330.l(var2.n(), var2.c()[1 ^ 3], var2);
         var1[var10001] = Class330.l(var2.n(), var2.c()[4 ^ 5], var2);
      }

      return var1;
   }

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (bc == null) {
         bc = Class330.s("sc/bang/XPBack.tcp", (short[])null);
         bc.d(Class280.l(), 3 ^ 3);
      }

      bc.aa(var1, 3 >> 2, 3 >> 2);
      if (this.vq() != null) {
         this.xf.d(Class280.l(), 3 & 4);
         this.xf.aa(var1, 21691 & 11261, 123 & 79);
      }

   }

   public void y(int var1) {
      this.xf = this.cy == var1 ? this.xf : null;
      int var10000 = 2 & 5;
      this.cy = var1;

      int var10001;
      for(int var2 = var10000; var10000 < this.ie.size(); var10000 = var2) {
         <undefinedtype> var10 = (<undefinedtype>)this.ie.get(var2);
         var10001 = 3 & 4;
         ++var2;
         var10.vl(var10001, (boolean)var10001, (Point)null);
      }

      StarSoul var7 = var1 != 0 ? this.vc().k((32568 & 10199) + var1) : null;
      if (var7 != null) {
         long var3 = this.vd().getPackRecord().getStarSoulType(var7.getId());
         String[] var8 = var7.getValue().split("\\|");

         int var5;
         for(var10000 = var5 = 3 ^ 3; var10000 < var8.length; var10000 = var5) {
            Object var6 = var5 < this.ie.size() ? (<undefinedtype>)this.ie.get(var5) : null;
            if (var6 == null) {
               var6 = new MouseListener() {
                  private boolean ee;
                  private Class436 av;
                  private JLabel rk;
                  private int m;

                  public void mousePressed(MouseEvent var1) {
                     if (this.ee) {
                        ((Class459)Class551.this.ve().e(18365 & 14543)).y(this.m);
                     } else {
                        SuitOperBean var2 = new SuitOperBean();
                        var2.setType(127 & 115);
                        var2.setJade(new PartJade((long)(Class551.this.cy + (16186 & 26581)), this.m));
                        String var3 = Agreement.getSendTextAES("suitoperate", Class695.b().toJson(var2));
                        Class551.this.uw().d(var3);
                     }
                  }

                  public void mouseReleased(MouseEvent var1) {
                  }

                  public void mouseEntered(MouseEvent var1) {
                     if (this.ee) {
                        StarSoul var4 = Class551.this.vc().k(this.m);
                        long var2 = Class551.this.vd().getPackRecord().getStarSoulType(var4.getId()) % 10000L;
                        ((Class270)Class551.this.ve().e(63 & 110)).sg(var4, var2);
                     }
                  }

                  public void mouseExited(MouseEvent var1) {
                     Class551.this.aej.getFormManagement().n(126 & 47);
                  }

                  protected void paintChildren(Graphics var1) {
                     super.paintChildren(var1);
                     if (this.ee) {
                        if (Class551.afk == null) {
                           Class551.afk = Class330.s("sc/bang/XPBackDL.tcp", (short[])null);
                        }

                        Class551.afk.d(Class280.l(), 2 & 5);
                        Class551.afk.aa(var1, 46 & 95, 31 & 126);
                     }

                  }

                  public {
                     int var10005 = 3 ^ 3;
                     this.rk = Class133.c(var10005, 5 >> 3, 30 & 125, 123 & 20, 5 >> 3, Color.white, Class681.ad);
                     this.av = new Class436("sc/d/43.png");
                     this.av.setBounds(3 ^ 3, 89 & 54, 95 & 60, 95 & 60);
                     this.av.addMouseListener(this);
                     this.add(this.rk);
                     this.add(this.av);
                     this.setVisible((boolean)(5 >> 3));
                  }

                  public void mouseClicked(MouseEvent var1) {
                  }

                  public void vl(int var1, boolean var2, Point var3) {
                     this.m = var1;
                     this.ee = var2;
                     if (var1 == 0) {
                        this.setVisible((boolean)(5 >> 3));
                     } else {
                        StarSoul var4 = Class551.this.vc().k(var1);
                        this.rk.setText(var4.getName());
                        this.setBounds(var3.x - (46 & 95), var3.y - (30 & 127), 63 & 92, 125 & 46);
                        this.setVisible((boolean)(5 >> 2));
                     }
                  }
               };
               this.ie.add(var6);
               this.add((Component)var6);
            }

            var10001 = Integer.parseInt(var8[var5]);
            int var10002;
            Class551 var10003;
            if ((var3 >> var5 & 1L) == 1L) {
               var10002 = --1;
               var10003 = this;
            } else {
               var10002 = 0;
               var10003 = this;
            }

            ((<undefinedtype>)var6).vl(var10001, (boolean)var10002, var10003.vn(var1, var5++));
         }

         this.afl.cy = this.afg.cy == var1 ? --2 : (var1 > 0 && this.aff[var1 - (3 >> 1)].bb ? 4 ^ 5 : 0);
         Point var9 = this.vn(125 & 102, var1);
         this.afl.setBounds(var9.x, var9.y, 117 & 58, 117 & 58);
      }
   }

   public Class8 vq() {
      if (this.cy == 0) {
         return null;
      } else {
         if (this.xf == null) {
            this.xf = Class330.q("sc/bang/XPXJ" + this.cy + ".tcp");
         }

         return this.xf;
      }
   }

   protected void paintChildren(Graphics var1) {
      int var10000 = 5 >> 3;
      super.paintChildren(var1);

      for(int var2 = var10000; var10000 < this.aff.length; var10000 = var2) {
         <undefinedtype> var3 = this.aff[var2];
         int var10002 = var2 + (5 >> 2);
         ++var2;
         var3.ar(this.afg.jk(var10002), var1);
      }

      if (this.afl.cy == --2) {
         if (nb == null) {
            nb = Class330.s("sc/mouse/flicker.tcp", (short[])null);
         }

         nb.d(Class280.l(), 3 >> 2);
         nb.aa(var1, this.afl.getX(), this.afl.getY());
      }

      if (this.afh != -1L) {
         if (this.afi == null) {
            this.afi = Class330.s("sc/bang/XPBackYY.tcp", (short[])null);
         }

         this.afi.d(Math.min(Class280.l() - this.afh, (long)(this.afi.k() - --1)), 5 >> 3);
         this.afi.aa(var1, 9074 & 24015, 2804 & 30175);
         if (Class280.l() - this.afh >= (long)this.afi.k()) {
            this.afh = -1L;
         }
      }

   }
}
