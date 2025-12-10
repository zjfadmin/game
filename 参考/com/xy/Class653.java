package com.xy;

import com.xy.entity.RoleSummoning;
import com.xy.game.GameUtil;
import com.xy.game.RoleData;
import com.xy.game.RolePet;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Class653 extends Class345 {
   private <undefinedtype> sb;
   private Class529[] sc;
   private Class436[] pv;
   private Class19 sd;
   private <undefinedtype>[] se;
   private int cy;
   private <undefinedtype> sf;

   public void as(int var1) {
      if (!this.bl()) {
         if (this.cy != var1) {
            this.pv[--1].fw(var1 == 0 ? "sc/b/S325.png" : "sc/b/S326.png");
         }

         this.cy = var1;

         for(int var10000 = var1 = 3 >> 2; var10000 < this.sc.length; var10000 = var1) {
            this.sc[var1].setKeep((boolean)(var1 == this.cy ? --1 : 0));
            ++var1;
         }

         if (this.cy == 0) {
            if (this.sb != null) {
               this.sb.setVisible((boolean)(3 ^ 3));
            }

            if (this.sf == null) {
               this.sf = new JComponent() {
                  private Class529 hy;
                  private boolean ee;
                  private JLabel d;
                  private Class529 qr;
                  private Class529 qs;

                  public {
                     int var10003 = 2 & 5;
                     this.setBounds(var10003, 3 & 4, 19163 & 14206, 21495 & 11647);
                     this.qr = new Class529((String)null, 2 ^ 3, 1501 & 31474, Class653.this.gk());
                     this.add(this.qr);
                     this.qs = new Class529("sc/b/B443.png", 3 >> 1, 30717 & 2259, Class653.this.gk());
                     this.qs.setBounds(32527 & 499, 22779 & 10199, 119 & 108, 25 & 127);
                     this.add(this.qs);
                     this.hy = new Class529("sc/b/B444.png", 3 & 5, 17138 & 15839, Class653.this.gk());
                     this.hy.setBounds(1299 & 31727, 3836 & 29171, 109 & 118, 25 & 127);
                     this.add(this.hy);
                     this.d = Class133.b(26591 & 6583, 1279 & 31727, 125 & 102, 26, Color.WHITE, Class681.bx);
                     this.d.setText("正在匹配");
                     this.add(this.d);
                     this.ak((boolean)(2 & 5));
                  }

                  public boolean t() {
                     return this.ee;
                  }

                  public void ak(boolean var1) {
                     this.ee = var1;
                     this.d.setVisible(var1);
                     this.qr.setImage(var1 ? "sc/c/60" : "sc/b/B439.png");
                     if (var1) {
                        this.qr.setBounds(29162 & 4087, 8447 & 24559, 63 & 89, 63 & 89);
                     } else {
                        this.qr.setBounds(28087 & 5087, 1519 & 31487, 124 & 103, 31 & 122);
                     }
                  }
               };
               this.add(this.sf, 1 ^ 3);
            }

            this.sf.setVisible((boolean)(--1));
         } else {
            if (this.cy == 3 >> 1) {
               if (this.sf != null) {
                  this.sf.setVisible((boolean)(5 >> 3));
               }

               if (this.sb == null) {
                  this.sb = new JComponent() {
                     private Class529 ala;
                     private Class529 ui;
                     private Class529 hy;
                     private Class529 bba;
                     private JLabel d;
                     private Class529 k;
                     private boolean op;

                     public {
                        int var10003 = 3 ^ 3;
                        this.setBounds(var10003, 5 >> 3, 30431 & 2938, 13303 & 19839);
                        this.bba = new Class529((String)null, 3 & 5, 27135 & 5843, Class653.this.gk());
                        this.add(this.bba);
                        this.hy = new Class529("sc/b/B443.png", --1, 15356 & 17623, Class653.this.gk());
                        this.ala = new Class529("sc/b/B445.png", 3 & 5, 4093 & 28887, Class653.this.gk());
                        this.k = new Class529("sc/b/B446.png", 5 >> 2, 31454 & 1527, Class653.this.gk());
                        this.ui = new Class529("sc/b/B447.png", 2 ^ 3, 11743 & 21239, Class653.this.gk());
                        this.ala.setBounds(10135 & 22891, 981 & 32062, 127 & 100, 121 & 31);
                        this.k.setBounds(18403 & 14623, 29109 & 3963, 116 & 111, 61 & 91);
                        this.ui.setBounds(18423 & 14783, 276, 100, 25);
                        this.hy.setBounds(439, 305, 100, 25);
                        this.hy.setVisible((boolean)(5 >> 3));
                        this.add(this.hy);
                        this.add(this.ala);
                        this.add(this.k);
                        this.add(this.ui);
                        this.d = Class133.b(98, 300, 100, 26, Color.WHITE, Class681.bx);
                        this.d.setText("正在匹配");
                        this.add(this.d);
                        this.ak((boolean)(3 & 4));
                     }

                     public void ak(boolean var1) {
                        this.op = var1;
                        this.d.setVisible(var1);
                        this.bba.setImage(var1 ? "sc/c/60" : "sc/b/B440.png");
                        if (var1) {
                           this.bba.setBounds(7357 & 25583, 11199 & 21868, 95 & 57, 95 & 57);
                        } else {
                           this.bba.setBounds(106 & 119, 21374 & 11693, 111 & 116, 91 & 62);
                        }
                     }

                     public boolean t() {
                        return this.op;
                     }
                  };
                  this.add(this.sb, --2);
               }

               this.sb.setVisible((boolean)(--1));
            }

         }
      }
   }

   public void s() {
      RoleData var1 = this.vd();

      int var2;
      for(int var10000 = var2 = 3 & 4; var10000 < this.se.length; var10000 = var2) {
         RolePet var3 = var1.getBBRolePet(var2 + (3 & 5));
         this.se[var2++].w(var3);
      }

   }

   public void d() {
      RoleData var10000 = this.vd();
      long var2 = var10000.getLoginResult().getSpecies_id().longValue();
      Goodstable var1;
      long var4;
      if ((var1 = var10000.getGoodEquip(var10000.goodChoses[5 >> 3])) != null && (var4 = (long)GameUtil.e(Integer.parseInt(var1.getSkin()))) != 0L) {
         var2 |= (var4 += 18L) << (105 & 54);
      }

      if (this.sd == null) {
         this.sd = Class330.ai(var2, 5 >> 1, 3 & 5, (String)null);
      } else {
         this.sd = Class330.w(this.sd, --1, String.valueOf(var2));
      }
   }

   public <undefinedtype> jx() {
      return this.sf;
   }

   public boolean t() {
      if (this.bl()) {
         int var10000 = 3 >> 2;
         this.aej.f("你正在匹配中无法关闭面板");
         return (boolean)var10000;
      } else {
         this.sd = null;
         return super.t();
      }
   }

   protected void paintChildren(Graphics var1) {
      super.paintChildren(var1);
      if (this.sd != null) {
         this.sd.a(var1, 3511 & 29405, 11734 & 21243, --4, Class280.l());
      }

   }

   public void y(int var1) {
      String var3;
      int var4;
      if (var1 == (8411 & 24564)) {
         if (this.sb != null && this.sb.t()) {
            this.aej.f("你正在匹配团队召唤兽比斗");
         } else {
            var4 = this.sf != null && this.sf.t() ? 3 >> 1 : 0;
            var3 = Agreement.getSendTextAES("petArena", var4 != 0 ? "311" : "310");
            this.uw().d(var3);
         }
      } else if (var1 == (15607 & 17371)) {
         if (this.sf != null && this.sf.t()) {
            this.aej.f("你正在匹配单人召唤兽比斗");
         } else {
            var4 = this.sb != null && this.sb.t() ? --1 : 0;
            var3 = Agreement.getSendTextAES("petArena", var4 != 0 ? "313" : "312");
            this.uw().d(var3);
         }
      } else {
         String var2 = null;
         String var10000;
         if (var1 == (29147 & 3829)) {
            var10000 = var2 = "320";
         } else if (var1 == (4058 & 28919)) {
            var10000 = var2 = "321";
         } else if (var1 == (16886 & 16093)) {
            var10000 = var2 = "330";
         } else if (var1 == (19191 & 13789)) {
            var10000 = var2 = "331";
         } else if (var1 == (26327 & 6654)) {
            var10000 = var2 = "332";
         } else {
            if (var1 == (21215 & 11767)) {
               var2 = "333";
            }

            var10000 = var2;
         }

         if (var10000 != null) {
            var3 = Agreement.getSendTextAES("petArena", var2);
            this.uw().d(var3);
         }
      }
   }

   public void jy(int var1, boolean var2) {
      if (var1 == 0 && this.sf != null) {
         this.sf.ak(var2);
      } else {
         if (var1 == 5 >> 2 && this.sb != null) {
            this.sb.ak(var2);
         }

      }
   }

   public void q() {
      if (!this.bl()) {
         int var10002 = 3 >> 2;
         this.s();
         this.d();
         this.as(var10002);
         super.q();
      }
   }

   public <undefinedtype> jz() {
      return this.sb;
   }

   public Class653(GameView var1) {
      int var10001 = 1 ^ 3;
      int var10005 = -4 >> 2;
      int var10007 = -4 >> 2;
      super(29919 & 2983, --2, Class345.aef, var1);
      this.cy = var10007;
      this.va(var10005, 2 & 5, 2778 & 30591, 29695 & 3447, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 95 & 100, 95 & 100, 95 & 100, 95 & 100, (boolean)(5 >> 3)), "召唤兽比斗");
      Class529[] var4 = new Class529[var10001];
      boolean var10003 = true;
      this.sc = var4;

      int var2;
      int var10000;
      for(var10000 = var2 = 3 >> 2; var10000 < this.sc.length; var10000 = var2) {
         Class529[] var3 = this.sc;
         Class529 var10002 = new Class529;
         var10005 = 5 >> 1;
         int var10006 = (14062 & 18911) + var2;
         Font var9 = Class681.cf;
         Color[] var10008 = Class681.c;
         String var10009;
         Class653 var10010;
         if (var2 == 0) {
            var10009 = "单挑王者";
            var10010 = this;
         } else if (var2 == (3 & 5)) {
            var10009 = "最强团队";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var10002.<init>("sc/e/38.png", var10005, var10006, var9, var10008, var10009, var10010);
         var3[var2] = var10002;
         this.sc[var2].setOffsetTexts(Class681.cl);
         this.sc[var2].setBounds((64 & 127) + (102 & 127) * var2, 59 & 86, 95 & 127, 125 & 35);
         this.add(this.sc[var2++]);
      }

      <undefinedtype>[] var5 = new <undefinedtype>[--4];
      var10003 = true;
      this.se = var5;

      for(var10000 = var2 = 3 >> 2; var10000 < this.se.length; var10000 = var2) {
         this.se[var2] = new Class93("sc/b/B441.png", 3 >> 1, var2 + (3 >> 1)) {
            private JLabel d;
            private Class436 bl;
            private int m;

            public void mouseExited(MouseEvent var1) {
               super.mouseExited(var1);
               Class653.this.ve().n(107 & 62);
            }

            public void mouseEntered(MouseEvent var1) {
               super.mouseEntered(var1);
               RolePet var2;
               if ((var2 = Class653.this.vd().getBBRolePet(this.m)) != null) {
                  ((Class106)Class653.this.ve().e(126 & 43)).amj(var2.getPet(), (String)null, (List)null, (boolean)(3 >> 2));
               }
            }

            public void mouseReleased(MouseEvent var1) {
               super.mouseReleased(var1);
               this.bl.setBounds(4 ^ 5, 4 ^ 5, 111 & 55, 111 & 55);
            }

            public {
               this.m = var4;
               this.bl = new Class436();
               this.bl.setBounds(--1, --1, 119 & 47, 119 & 47);
               this.add(this.bl);
               this.d = Class133.c(2 & 5, 127 & 38, 59 & 110, 127 & 14, 3 ^ 3, Color.white, Class681.ad);
               this.d.setText(var4 == --4 ? "支援" : String.valueOf(var4));
               this.add(this.d);
            }

            public void ac(MouseEvent var1, boolean var2) {
            }

            public void w(RolePet var1) {
               RoleSummoning var2 = var1 != null ? var1.getPet() : null;
               this.bl.hf(var2 != null ? Class222.t("p" + var2.getSummoningskin()) : null);
            }

            public void af(MouseEvent var1) {
               ((Class234)Class653.this.ve().e(15339 & 17564)).y(Class653.this.cy);
            }

            public void mousePressed(MouseEvent var1) {
               super.mousePressed(var1);
               this.bl.setBounds(--2, --2, 103 & 63, 103 & 63);
            }
         };
         this.se[var2].setBounds((75 & 119) + var2 * (42 & 127), 2302 & 30699, 111 & 58, 127 & 55);
         this.add(this.se[var2++]);
      }

      Class436[] var6 = new Class436[1 ^ 3];
      var10003 = true;
      this.pv = var6;

      for(var10000 = var2 = 2 & 5; var10000 < this.pv.length; var10000 = var2) {
         this.pv[var2] = new Class436();
         Class653 var7;
         if (var2 == 0) {
            var7 = this;
            this.pv[var2].eq(Class511.q("sc/d/35.png", 80, 59 & 78, 80, 10, (boolean)(2 & 5)));
            this.pv[var2].setBounds(50, 32, 430, 20);
         } else {
            if (var2 == --1) {
               this.pv[var2].setBounds(50, 51, 519, 290);
            }

            var7 = this;
         }

         var7.add(this.pv[var2++]);
      }

   }

   public boolean bl() {
      if (this.sf != null && this.sf.t()) {
         return (boolean)(3 >> 1);
      } else {
         return (boolean)(this.sb != null && this.sb.t() ? 3 >> 1 : 0);
      }
   }
}
