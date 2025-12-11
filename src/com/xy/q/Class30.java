package com.xy.q;

import com.xy.a.Class127;
import com.xy.game.RoleData;
import com.xy.socket.GameClient;
import com.xy.text.GameView;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.lang.reflect.Field;
import javax.swing.JComponent;

public class Class30 extends JComponent implements MouseListener, MouseMotionListener {
   public GameView afx;
   public static Field afy;
   public static byte afz = 1;
   public static Field aga;
   public static com.xy.v.Class32 agb = new com.xy.v.Class32(14, 0, 0, 0);
   private int xt;
   private int agc;
   private int sc;
   private int gs;
   public static Field agd;
   protected String age;
   public static byte agf = 0;
   protected com.xy.w.Class9 agg;
   public static byte agh = 1;
   protected com.xy.i.Class0 agi;
   public static Field agj;
   protected boolean wt;
   private int aa;
   public static Field agk;
   protected Class40 agl;
   protected Image acu;
   private int ae;
   private boolean il;
   protected com.xy.v.Class32 adc;
   private static Image bp;

   public Class30 eg() {
      return this;
   }

   public void rm(boolean var1) {
      if ((this.il = var1) && bp == null) {
         String var10000 = "\u001c\u0000@\u0007@QA\u0013\u0001\u0004";
         bp = com.xy.w.Class16.c("sc/d/2.png");
      }
   }

   public void _do(String var1) {
      this.age = var1;
      this.acu = null;
   }

   public boolean ah() {
      if (this.isVisible()) {
         this.be(false);
      }

      this.setVisible(false);
      this.afx.remove(this);
      if (this.gs == 6) {
         this.gs = 2;
         return true;
      } else {
         return this.gs == 3;
      }
   }

   public void dp(String var1) {
      this.yu(this.agg, var1);
   }

   public void n(int var1) {
      this.gs = var1;
   }

   public int lj() {
      return this.aa;
   }

   @Override
   public void paint(Graphics var1) {
      if (this.wt) {
         this.revalidate();
         this.wt = false;
      }

      super.paint(var1);
   }

   public com.xy.i.Class3[] ys(Class25 var1, com.xy.i.Class3[] var2, int var3, int var4) {
      int var5 = this.yx().goodPacks.length / 24;
      if (var2 == null || var2.length != var5) {
         var2 = this.zd(var2, var5, false);

         int var6;
         for (int var10000 = var6 = 0; var10000 < var2.length; var10000 = var6) {
            com.xy.i.Class3 var7 = var2[var6];
            int var10002 = var4 + var6 * 35;
            var6++;
            var7.setBounds(var3, var10002, 36, 33);
         }

         var1.vr(var2, 0);
      }

      return var2;
   }

   public com.xy.v.Class8 yt() {
      return this.afx.getObjectArea();
   }

   @Override
   public void mouseMoved(MouseEvent var1) {
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      Class30 var10000;
      if (this.agg != null) {
         if (this.adc != null) {
            var10000 = this;
            var1.translate(this.adc.f(), this.adc.h());
            this.agg.g(var1, this.getWidth() - this.adc.i(), this.getHeight() - this.adc.a());
            var1.translate(-this.adc.f(), -this.adc.h());
         } else {
            var10000 = this;
            this.agg.g(var1, this.getWidth(), this.getHeight());
         }
      } else {
         label29: {
            if (this.age != null) {
               if (this.acu == null) {
                  this.acu = com.xy.w.Class16.c(this.age);
               }

               if (this.adc != null) {
                  var1.drawImage(this.acu, this.adc.f(), this.adc.h(), this.getWidth() - this.adc.i(), this.getHeight() - this.adc.a(), null);
                  var10000 = this;
                  break label29;
               }

               var1.drawImage(this.acu, 0, 0, this.getWidth(), this.getHeight(), null);
            }

            var10000 = this;
         }
      }

      if (var10000.il) {
         var1.drawImage(bp, 17, 3, 800, 529, null);
      }
   }

   public Class30(int var1, int var2, byte var3, GameView var4) {
      this.aa = var1;
      this.gs = var2;
      this.afx = var4;
      if (var3 == afz) {
         this.addMouseMotionListener(this);
         this.addMouseListener(this);
      }

      if (var1 >= 0) {
         this.setVisible(false);
      }
   }

   public void yu(com.xy.w.Class9 var1, String var2) {
      if (var1 != null) {
         this.acu =null; this.age = null;
         this.agg = var1;
         if (var2 != null) {
            this.dq(var2);
            return;
         }
      } else {
         this.age = var2;
         this.acu = null;
         this.agg = var1;
      }
   }

   public void yv(int var1, int var2, int var3, int var4) {
      this.ae = var1;
      this.xt = var2;
      int var5;
      if (this.agi != null && (var5 = var3 - this.getWidth()) != 0) {
         this.agi.setBounds(this.agi.getX() + var5, this.agi.getY(), this.agi.getWidth(), this.agi.getHeight());
      }

      if (var1 == -1) {
         var5 = (this.afx.screenData.getScreen_x() - var3) / 2;
         int var13 = (this.afx.screenData.getScreen_y() - var4) / 2;
         int var16;
         int var22;
         if (var5 > 0) {
            var16 = var5;
            var22 = var13;
         } else {
            var16 = 0;
            var22 = var13;
         }

         int var26;
         if (var22 > 0) {
            var22 = var13;
            var26 = var3;
         } else {
            var22 = 0;
            var26 = var3;
         }

         this.setBounds(var16, var22, var26, var4);
      } else if (var1 == -2) {
         var5 = (this.afx.screenData.getScreen_x() / 2 - var3) / 2;
         int var12 = (this.afx.screenData.getScreen_y() - var4) / 2;
         int var15;
         int var20;
         if (var5 > 0) {
            var15 = var5;
            var20 = var12;
         } else {
            var15 = 0;
            var20 = var12;
         }

         int var25;
         if (var20 > 0) {
            var20 = var12;
            var25 = var3;
         } else {
            var20 = 0;
            var25 = var3;
         }

         this.setBounds(var15, var20, var25, var4);
      } else if (var1 == -3) {
         var5 = (this.afx.screenData.getScreen_x() / 2 * 3 - var3) / 2;
         int var11 = (this.afx.screenData.getScreen_y() - var4) / 2;
         int var14;
         int var18;
         if (var5 > 0) {
            var14 = var5;
            var18 = var11;
         } else {
            var14 = 0;
            var18 = var11;
         }

         int var24;
         if (var18 > 0) {
            var18 = var11;
            var24 = var3;
         } else {
            var18 = 0;
            var24 = var3;
         }

         this.setBounds(var14, var18, var24, var4);
      } else if (var1 == -9) {
         var5 = this.afx.screenData.getScreen_x() - var3;
         short var6 = 215;
         int var10001;
         short var10002;
         if (var5 > 0) {
            var10001 = var5;
            var10002 = var6;
         } else {
            var10001 = 0;
            var10002 = var6;
         }

         int var10003;
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

   public com.xy.i.Class3[] yw(Class21 var1, com.xy.i.Class3[] var2, int var3, int var4) {
      byte var10000;
      Class30 var10001;
      if (var1.ah()) {
         var10000 = 1;
         var10001 = this;
      } else {
         var10000 = 0;
         var10001 = this;
      }

      int var5 = var10000 + var10001.yx().goodPacks.length / 24;
      if (var2 == null || var2.length != var5) {
         var2 = this.zd(var2, var5, var1.ah());

         int var6;
         for (int var7 = var6 = 0; var7 < var2.length; var7 = var6) {
            com.xy.i.Class3 var8 = var2[var6];
            int var10002 = var4 + var6 * 35;
            var6++;
            var8.setBounds(var3, var10002, 36, 33);
         }

         var1.vr(var2, 0);
      }

      return var2;
   }

   public void l() {
      if (this.getX() > this.afx.screenData.Screen_x || this.getY() > this.afx.screenData.Screen_y) {
         this.yv(this.ae, this.xt, this.getWidth(), this.getHeight());
      }

      if (!this.isVisible()) {
         this.be(true);
      }

      this.setVisible(true);
      this.wt = true;
      this.afx.add(this);
   }

   public void fj(int var1, int var2, int var3) {
      this.agl.fj(var1, var2, var3);
   }

   public RoleData yx() {
      return this.afx.roleData;
   }

   @Override
   public void setBounds(int var1, int var2, int var3, int var4) {
      try {
         if (this.getX() != var1) {
            agd.set(this, var1);
         }

         if (this.getY() != var2) {
            aga.set(this, var2);
         }

         if (this.getWidth() != var3) {
            agk.set(this, var3);
         }

         if (this.getHeight() != var4) {
            afy.set(this, var4);
            return;
         }
      } catch (Exception var6) {
         var6.printStackTrace();
      }
   }

   public void yy(int var1, int var2, int var3, int var4, byte var5) {
      this.setLayout(null);
      this.setBackground(Class49.bk);
      this.yv(var1, var2, var3, var4);
      if (var5 == agh) {
         String var10006 = "\u0010\fL\fLYS";
         this.agi = new com.xy.i.Class0("sc/c/60", 1, this.aa, this);
         this.agi.setBounds(var3 - 37, 8, 25, 25);
         this.add(this.agi);
      }
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      if (this.afx.choseImg.l != 0 && var1.isMetaDown()) {
         this.afx.choseImg.e();
      } else {
         Class30 var10000;
         label22: {
            if (this.aa >= 0) {
               if (var1.isMetaDown()) {
                  if (this.aa != 108) {
                     Class57 var10001 = this.zc();
                     var10000 = this;
                     var10001.f(this.aa);
                     break label22;
                  }
               } else {
                  this.zc().a(this.aa);
               }
            }

            var10000 = this;
         }

         var10000.sc = var1.getX();
         this.agc = var1.getY();
      }
   }

   public void yz(String var1, com.xy.w.Class9 var2) {
      if (this.agl == null) {
         this.add(this.agl = new Class40());
         this.rm(true);
         this.wp(agb);
         this.fj(3, 76, 32);
      }

      this.agl.yz(var1, var2);
      this.zb(0, 5, 43, 183 + var1.length() * 33);
   }

   public void be(boolean var1) {
      if (this.aa >= 0 && this.aa != 42 && this.aa != 45 && this.aa != 46 && this.aa != 77 && this.aa != 154) {
         String var2;
         if (var1) {
            var2 = "彜儭立厽r3,m";
            var2 = "开关窗口.mp3";
         } else {
            var2 = "儜閎竸厀A\u000e\u001fP";
            var2 = "关闭窗口.mp3";
         }

         this.afx.dg(false, var2);
      }
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   static {
      try {
         Class<Component> var0 = Component.class;
         String var10001 = "(5-5<0;";
         String var10003 = "\u0007\u0006\u0006\u0004\u0007\u0017";
         String var10005 = ")5:(6";
         String var10007 = "\u001a";
         String var10009 = "&";
         agd = var0.getDeclaredField("x");
         aga = var0.getDeclaredField("y");
         agk = var0.getDeclaredField("width");
         afy = var0.getDeclaredField("height");
         agj = var0.getDeclaredField("visible");
         agd.setAccessible(true);
         aga.setAccessible(true);
         agk.setAccessible(true);
         afy.setAccessible(true);
         agj.setAccessible(true);
      } catch (Exception var1) {
         var1.printStackTrace();
      }
   }

   public GameClient za() {
      return this.afx.getClient();
   }

   public int il() {
      return this.gs;
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
      if (this.isVisible()) {
         int var2 = var1.getX() - this.sc;
         int var3 = var1.getY() - this.agc;
         this.setBounds(var2 + this.getX(), var3 + this.getY(), this.getWidth(), this.getHeight());
      }
   }

   @Override
   public void repaint(long var1, int var3, int var4, int var5, int var6) {
   }

   public void t() {
   }

   public void wp(com.xy.v.Class32 var1) {
      int var2 = this.getWidth() - (this.adc != null ? this.adc.c() : 0);
      int var3 = this.adc != null ? this.adc.b() : 0;
      this.adc = var1;
      if (this.agi != null) {
         var2 = this.getWidth() - (var1 != null ? var1.c() : 0) - var2;
         int var10000;
         int var10001;
         if (var1 != null) {
            var10000 = var1.b();
            var10001 = var3;
         } else {
            var10000 = 0;
            var10001 = var3;
         }

         var3 = var10000 - var10001;
         if (var2 != 0 || var3 != 0) {
            this.agi.setBounds(this.agi.getX() + var2, this.agi.getY(), this.agi.getWidth(), this.agi.getHeight());
         }
      }
   }

   public void zb(int var1, int var2, int var3, int var4) {
      this.agl.setBounds(var1, var2, var3, var4);
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void setVisible(boolean var1) {
      if (var1 != this.isVisible()) {
         try {
            agj.set(this, var1);
         } catch (Exception var3) {
            var3.printStackTrace();
         }
      }
   }

   public void dq(String var1) {
      String var10002 = "/=s:smr.29";
      this.yz(var1, com.xy.w.Class16.m("sc/d/3.png", 20, 66, 13, 157, false));
   }

   public Class57 zc() {
      return this.afx.getFormManagement();
   }

   public com.xy.i.Class3[] zd(com.xy.i.Class3[] var1, int var2, boolean var3) {
      if (var1 != null && var1.length == var2) {
         return var1;
      } else {
         com.xy.i.Class3[] var4 = new com.xy.i.Class3[var2];
         int var5 = 0;
         int var6 = var1 != null ? var1.length : 0;

         for (int var10000 = var5; var10000 < var4.length; var10000 = ++var5) {
            if (var5 < var6) {
               var4[var5] = var1[var5];
            } else {
               String var10006 = "-?q9q";
               var4[var5] = new com.xy.i.Class3("sc/e/" + (8 + var5) + ".png", 2, var5);
               if (this instanceof Class127) {
                  ((Class127)this).bf().add(var4[var5], 0);
               } else {
                  this.add(var4[var5]);
               }
            }
         }

         if (var3) {
            for (int var8 = var5 = 0; var8 < var4.length; var8 = ++var5) {
               com.xy.i.Class3 var9 = var4[var5];
               String var10;
               if (var5 + 1 == var4.length) {
                  var10 = "\u0010\fL\nL^PA\u0013\u0001\u0004";
                  var10 = "sc/e/13.png";
               } else {
                  String var10003 = "-?q9q";
                  var10 = "sc/e/" + (8 + var5) + ".png";
               }

               var9.setBtnPath(var10);
            }
         }

         return var4;
      }
   }

   public GameView ze() {
      return this.afx;
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }
}
