package com.xy;

import com.xy.game.RoleData;
import com.xy.socket.GameClient;
import com.xy.text.GameView;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.ImageObserver;
import java.lang.reflect.Field;
import javax.swing.JComponent;

public class Class345 extends JComponent implements MouseListener, MouseMotionListener {
   private int adv;
   public static Class116 adw = new Class116(111 & 30, 3 ^ 3, 3 ^ 3, 3 ^ 3);
   protected Class116 adx;
   protected String ady;
   protected Class604 adz;
   protected Class658 aea;
   protected Class386 aeb;
   private boolean aec;
   private static Image aed;
   private int aee;
   public static byte aef = 3 & 5;
   protected boolean aeg;
   public static Field aeh;
   public static byte aei = 3 >> 2;
   private int dp;
   public GameView aej;
   public static Field aek;
   public static Field ael;
   private int gw;
   private int fk;
   public static Field aem;
   public static Field aen;
   protected Image rg;
   private int cy;
   public static byte aeo = 2 ^ 3;

   public void mouseMoved(MouseEvent var1) {
   }

   public void uu(Class585 var1, int var2, int var3) {
      Class216[] var10001;
      Class345 var10002;
      if (var1.aiz() != null) {
         var10001 = var1.aiz().f();
         var10002 = this;
      } else {
         var10001 = null;
         var10002 = this;
      }

      Class216[] var4 = this.vg(var10001, var10002.vd().goodPacks.length / (124 & 27), var1.t(), 5 >> 3, var2, var3);
      var1.aiw(var4, 2 & 5);
   }

   static {
      try {
         Class var0 = Component.class;
         ael = var0.getDeclaredField("x");
         aem = var0.getDeclaredField("y");
         aeh = var0.getDeclaredField("width");
         aek = var0.getDeclaredField("height");
         aen = var0.getDeclaredField("visible");
         ael.setAccessible((boolean)(--1));
         aem.setAccessible((boolean)(3 & 5));
         aeh.setAccessible((boolean)(--1));
         aek.setAccessible((boolean)(5 >> 2));
         aen.setAccessible((boolean)(--1));
      } catch (Exception var1) {
         var1.printStackTrace();
      }
   }

   public void uv(Class604 var1, String var2) {
      if (var1 != null) {
         this.rg = this.ady = null;
         this.adz = var1;
         if (var2 != null) {
            this.fw(var2);
            return;
         }
      } else {
         this.ady = var2;
         this.rg = null;
         this.adz = var1;
      }

   }

   public GameClient uw() {
      return this.aej.getClient();
   }

   public void setVisible(boolean var1) {
      if (var1 != this.isVisible()) {
         try {
            aen.set(this, var1);
         } catch (Exception var2) {
            var2.printStackTrace();
         }
      }
   }

   public GameView ux() {
      return this.aej;
   }

   public void uy(Class397 var1, int var2, int var3) {
      Class216[] var10001;
      Class345 var10002;
      if (var1.aiz() != null) {
         var10001 = var1.aiz().f();
         var10002 = this;
      } else {
         var10001 = null;
         var10002 = this;
      }

      Class216[] var4 = this.vg(var10001, var10002.vd().goodPacks.length / (30 & 121), (boolean)(3 & 4), 3 & 4, var2, var3);
      var1.aiw(var4, 5 >> 3);
   }

   public void uz(String var1, Class604 var2) {
      if (this.aeb == null) {
         this.add(this.aeb = new Class386());
         int var10002 = --3;
         this.ak((boolean)(--1));
         this.ad(adw);
         this.bm(var10002, 126 & 77, 44 & 115);
      }

      int var10001 = 3 ^ 3;
      this.aeb.uz(var1, var2);
      this.vb(var10001, --5, 63 & 107, (1719 & 31231) + var1.length() * (123 & 37));
   }

   public void repaint(long var1, int var3, int var4, int var5, int var6) {
   }

   public void mouseExited(MouseEvent var1) {
   }

   public void mouseEntered(MouseEvent var1) {
   }

   public void bm(int var1, int var2, int var3) {
      this.aeb.bm(var1, var2, var3);
   }

   public void setBounds(int var1, int var2, int var3, int var4) {
      try {
         if (this.getX() != var1) {
            ael.set(this, var1);
         }

         if (this.getY() != var2) {
            aem.set(this, var2);
         }

         if (this.getWidth() != var3) {
            aeh.set(this, var3);
         }

         if (this.getHeight() != var4) {
            aek.set(this, var4);
            return;
         }
      } catch (Exception var5) {
         var5.printStackTrace();
      }

   }

   public boolean t() {
      if (this.isVisible()) {
         this.gb((boolean)(5 >> 3));
      }

      this.setVisible((boolean)(3 >> 2));
      this.aej.remove(this);
      if (this.fk == (111 & 22)) {
         int var10000 = --1;
         this.fk = 5 >> 1;
         return (boolean)var10000;
      } else {
         return (boolean)(this.fk == --3 ? 3 >> 1 : 0);
      }
   }

   public void im(String var1) {
      this.uv(this.adz, var1);
   }

   public void paint(Graphics var1) {
      if (this.aeg) {
         int var10001 = 3 >> 2;
         this.revalidate();
         this.aeg = (boolean)var10001;
      }

      super.paint(var1);
   }

   public void va(int var1, int var2, int var3, int var4, byte var5) {
      this.setLayout((LayoutManager)null);
      this.setBackground(Class681.cu);
      this.vf(var1, var2, var3, var4);
      if (var5 == aeo) {
         this.aea = new Class658("sc/c/60", 4 ^ 5, this.cy, this);
         this.aea.setBounds(var3 - (127 & 37), 122 & 13, 123 & 29, 123 & 29);
         this.add(this.aea);
      }

   }

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      Class345 var10000;
      if (this.adz != null) {
         if (this.adx != null) {
            var10000 = this;
            var1.translate(this.adx.g(), this.adx.d());
            this.adz.g(var1, this.getWidth() - this.adx.k(), this.getHeight() - this.adx.j());
            var1.translate(-this.adx.g(), -this.adx.d());
         } else {
            var10000 = this;
            this.adz.g(var1, this.getWidth(), this.getHeight());
         }
      } else {
         label27: {
            if (this.ady != null) {
               if (this.rg == null) {
                  this.rg = Class511.a(this.ady);
               }

               if (this.adx != null) {
                  var1.drawImage(this.rg, this.adx.g(), this.adx.d(), this.getWidth() - this.adx.k(), this.getHeight() - this.adx.j(), (ImageObserver)null);
                  var10000 = this;
                  break label27;
               }

               var1.drawImage(this.rg, 5 >> 3, 5 >> 3, this.getWidth(), this.getHeight(), (ImageObserver)null);
            }

            var10000 = this;
         }
      }

      if (var10000.aec) {
         var1.drawImage(aed, 87 & 57, --3, 1899 & 31668, 11155 & 22141, (ImageObserver)null);
      }

   }

   public void vb(int var1, int var2, int var3, int var4) {
      this.aeb.setBounds(var1, var2, var3, var4);
   }

   public Class603 vc() {
      return this.aej.getObjectArea();
   }

   public void mouseReleased(MouseEvent var1) {
   }

   public void mousePressed(MouseEvent var1) {
      if (this.aej.choseImg.o != 0 && var1.isMetaDown()) {
         this.aej.choseImg.g();
      } else {
         Class345 var10000;
         label20: {
            if (this.cy >= 0) {
               if (var1.isMetaDown()) {
                  if (this.cy != (125 & 110)) {
                     Class326 var10001 = this.ve();
                     var10000 = this;
                     var10001.n(this.cy);
                     break label20;
                  }
               } else {
                  this.ve().h(this.cy);
               }
            }

            var10000 = this;
         }

         var10000.dp = var1.getX();
         this.adv = var1.getY();
      }
   }

   public RoleData vd() {
      return this.aej.roleData;
   }

   public Class345(int var1, int var2, byte var3, GameView var4) {
      this.cy = var1;
      this.fk = var2;
      this.aej = var4;
      if (var3 == aef) {
         this.addMouseMotionListener(this);
         this.addMouseListener(this);
      }

      if (var1 >= 0) {
         this.setVisible((boolean)(3 ^ 3));
      }

   }

   public void mouseClicked(MouseEvent var1) {
   }

   public Class326 ve() {
      return this.aej.getFormManagement();
   }

   public void fw(String var1) {
      this.uz(var1, Class511.q("sc/d/3.png", 124 & 23, 107 & 86, 79 & 61, 16125 & 16799, (boolean)(3 >> 2)));
   }

   public void mouseDragged(MouseEvent var1) {
      if (this.isVisible()) {
         int var10002 = var1.getX();
         MouseEvent var10001 = var1;
         int var3 = var10002 - this.dp;
         int var2 = var10001.getY() - this.adv;
         this.setBounds(var3 + this.getX(), var2 + this.getY(), this.getWidth(), this.getHeight());
      }

   }

   public void cc() {
   }

   public void fx(String var1) {
      this.ady = var1;
      this.rg = null;
   }

   public int tp() {
      return this.fk;
   }

   public void q() {
      if (this.getX() > this.aej.screenData.Screen_x || this.getY() > this.aej.screenData.Screen_y) {
         this.vf(this.aee, this.gw, this.getWidth(), this.getHeight());
      }

      if (!this.isVisible()) {
         this.gb((boolean)(--1));
      }

      int var10002 = 2 ^ 3;
      this.setVisible((boolean)(5 >> 2));
      this.aeg = (boolean)var10002;
      this.aej.add(this);
   }

   public void vf(int var1, int var2, int var3, int var4) {
      this.aee = var1;
      this.gw = var2;
      int var5;
      if (this.aea != null && (var5 = var3 - this.getWidth()) != 0) {
         this.aea.setBounds(this.aea.getX() + var5, this.aea.getY(), this.aea.getWidth(), this.aea.getHeight());
      }

      int var10001;
      int var10002;
      int var10003;
      int var6;
      if (var1 == -4 >> 2) {
         var5 = (this.aej.screenData.getScreen_x() - var3) / (5 >> 1);
         var6 = (this.aej.screenData.getScreen_y() - var4) / (5 >> 1);
         if (var5 > 0) {
            var10001 = var5;
            var10002 = var6;
         } else {
            var10001 = 0;
            var10002 = var6;
         }

         if (var10002 > 0) {
            var10002 = var6;
            var10003 = var3;
         } else {
            var10002 = 0;
            var10003 = var3;
         }

         this.setBounds(var10001, var10002, var10003, var4);
      } else if (var1 == (-2 & -1)) {
         var5 = (this.aej.screenData.getScreen_x() / (1 ^ 3) - var3) / (5 >> 1);
         var6 = (this.aej.screenData.getScreen_y() - var4) / (5 >> 1);
         if (var5 > 0) {
            var10001 = var5;
            var10002 = var6;
         } else {
            var10001 = 0;
            var10002 = var6;
         }

         if (var10002 > 0) {
            var10002 = var6;
            var10003 = var3;
         } else {
            var10002 = 0;
            var10003 = var3;
         }

         this.setBounds(var10001, var10002, var10003, var4);
      } else if (var1 == (-3 & -1)) {
         var5 = (this.aej.screenData.getScreen_x() / --2 * --3 - var3) / --2;
         var6 = (this.aej.screenData.getScreen_y() - var4) / --2;
         if (var5 > 0) {
            var10001 = var5;
            var10002 = var6;
         } else {
            var10001 = 0;
            var10002 = var6;
         }

         if (var10002 > 0) {
            var10002 = var6;
            var10003 = var3;
         } else {
            var10002 = 0;
            var10003 = var3;
         }

         this.setBounds(var10001, var10002, var10003, var4);
      } else if (var1 == (-1 & -9)) {
         var5 = this.aej.screenData.getScreen_x() - var3;
         var6 = 14815 & 18167;
         if (var5 > 0) {
            var10001 = var5;
            var10002 = var6;
         } else {
            var10001 = 0;
            var10002 = var6;
         }

         if (var10002 > 0) {
            var10002 = var6;
            var10003 = var3;
         } else {
            var10002 = 0;
            var10003 = var3;
         }

         this.setBounds(var10001, var10002, var10003, var4);
      } else {
         this.setBounds(var1, var2, var3, var4);
      }
   }

   public Class216[] vg(Class216[] var1, int var2, boolean var3, int var4, int var5, int var6) {
      int var10001 = var3 ? 2 ^ 3 : 0;
      int var10000 = var2 + (var3 ? 2 ^ 3 : 0);
      var2 += var10001;
      int var7 = var10000 > (55 & 78) ? --2 : 1;
      var4 = Math.min(var4, var7 - --1);
      int var8 = 2 & 5;
      Class216[] var12;
      if (var7 == 3 >> 1) {
         var8 = var2;
         var12 = var1;
      } else {
         var8 = 1 + Math.min(127 & 6, var2 - var4 * (127 & 6));
         var12 = var1;
      }

      int var10;
      if (var12 == null || var1.length != var8) {
         var12 = new Class216[var8];
         boolean var10002 = true;
         Class216[] var9 = var12;
         if (var1 != null && var1.length > var9.length) {
            for(var10000 = var10 = 2 & 5; var10000 < var1.length; var10000 = var10) {
               if (var10 < var9.length) {
                  var9[var10] = var1[var10];
               } else if (this instanceof Class130) {
                  ((Class130)this).fj().remove(var1[var10]);
               } else {
                  this.remove(var1[var10]);
               }

               ++var10;
            }

            var12 = var9;
         } else {
            var10 = 0;
            var8 = var1 != null ? var1.length : 0;

            for(var10000 = var10; var10000 < var9.length; var10000 = var10) {
               if (var10 < var8) {
                  var9[var10] = var1[var10];
               } else if (this instanceof Class130) {
                  ((Class130)this).fj().add(var9[var10] = new Class216((String)null, 1 ^ 3, var10, this), 3 >> 2);
               } else {
                  this.add(var9[var10] = new Class216((String)null, --2, var10, this));
               }

               ++var10;
            }

            var12 = var9;
         }

         var1 = var12;
      }

      int var11;
      for(var10000 = var11 = 0; var10000 < var1.length; var10000 = var11) {
         var10 = var11 + var4 * (47 & 86);
         if (var7 > (3 & 5) && var11 + (2 ^ 3) == var1.length) {
            var1[var11].setBtnPath("sc/e/5.png");
            var1[var11].setFont(Class681.bm);
            var1[var11].setHorizontalAlignment(3 ^ 3);
            var1[var11].setText("翻页");
            var1[var11].setBounds(var5, var6 + (28405 & 4554), 58 & 103, 123 & 21);
            var1[var11].ab((-4 & -97) - var4);
            var1[var11].ad(new Class116(var5, var6, var2 - (var3 ? --1 : 0), var3 ? 4 ^ 5 : 0));
         } else {
            var1[var11].ab(var10);
            if (var3 && var10 == var2 - (2 ^ 3)) {
               var1[var11].setBtnPath("sc/e/13.png");
               var1[var11].setText((String)null);
               var1[var11].setBounds(var5, var6 + var11 * (103 & 56), 38 & 125, 53 & 107);
            } else if (var10 <= --4) {
               var1[var11].setBtnPath("sc/e/" + ((58 & 77) + var10) + ".png");
               var1[var11].setText((String)null);
               var1[var11].setBounds(var5, var6 + var11 * (43 & 116), 46 & 117, 119 & 41);
            } else {
               var1[var11].setBtnPath("sc/b/" + ((2 ^ 3) + var10) + ".png");
               var1[var11].setText((String)null);
               var1[var11].setBounds(var5, var6 + var11 * (33 & 126), 44 & 119, 33);
            }
         }

         ++var11;
      }

      return var1;
   }

   public void gb(boolean var1) {
      if (this.cy >= 0 && this.cy != (106 & 63) && this.cy != (47 & 125) && this.cy != (126 & 47) && this.cy != (77 & 127) && this.cy != (10654 & 22267)) {
         this.aej.abh((boolean)(2 & 5), var1 ? "开关窗口.mp3" : "关闭窗口.mp3");
      }
   }

   public Class345 gk() {
      return this;
   }

   public void ab(int var1) {
      this.fk = var1;
   }

   public void ad(Class116 var1) {
      int var2 = this.getWidth() - (this.adx != null ? this.adx.h() : 0);
      int var3 = this.adx != null ? this.adx.i() : 0;
      this.adx = var1;
      if (this.aea != null) {
         var2 = this.getWidth() - (var1 != null ? var1.h() : 0) - var2;
         int var10000;
         int var10001;
         if (var1 != null) {
            var10000 = var1.i();
            var10001 = var3;
         } else {
            var10000 = 0;
            var10001 = var3;
         }

         var3 = var10000 - var10001;
         if (var2 != 0 || var3 != 0) {
            this.aea.setBounds(this.aea.getX() + var2, this.aea.getY(), this.aea.getWidth(), this.aea.getHeight());
         }
      }

   }

   public int ae() {
      return this.cy;
   }

   public void ak(boolean var1) {
      if ((this.aec = var1) && aed == null) {
         aed = Class511.a("sc/d/2.png");
      }

   }
}
