package com.xy;

import com.xy.entity.RoleSummoning;
import com.xy.game.HandlePet;
import com.xy.game.RolePet;
import com.xy.readbean.Goodstable;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.ImageObserver;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class Class680 extends Class345 {
   private RichLabel en;
   private Class44 aix;
   private JScrollPane hd;
   private <undefinedtype>[] aiy;
   private Class548 aiz;
   private Class436[] ce;
   private JScrollPane o;
   private Class643[] aja;
   private JLabel[] c;
   private static Image bx = Class511.a("sc/d/113.png");
   private BigDecimal ne;
   private Class248 ajb;
   private BigDecimal py;

   public void y(int var1) {
      if (var1 == (4831 & 28077) || var1 == (26863 & 6046)) {
         RoleSummoning var4 = this.vd().getPet(this.py);
         Goodstable var3 = this.vd().getGood(this.ne);
         if (var4 == null || var3 == null) {
            return;
         }

         if (var3.getGoodlock() == (4 ^ 5)) {
            this.aej.fw("该物品已加锁");
            return;
         }

         if (var1 == (24719 & 8189)) {
            String var8 = var4.getPetSkills();
            int var9;
            if ((var9 = var4.getOpenSealByType(3 >> 2)) > 0 && var8 != null && !var8.equals("")) {
               int var7 = var8.split("\\|").length;
               if (var8.indexOf("L") != -4 >> 2) {
                  --var7;
               }

               if (var8.indexOf("Q") != -4 >> 2) {
                  --var7;
               }

               if (var8.indexOf("X") != -4 >> 2) {
                  --var7;
               }

               if (var8.indexOf("T") != -4 >> 2) {
                  --var7;
               }

               if (HandlePet.getSkillNum(var9) <= var7) {
                  this.aej.f("召唤兽技能格子已经满了");
                  return;
               }
            }

            String var6 = Agreement.getSendTextAES("userpet", var3.getRgid().toString() + "|" + var4.getSid());
            this.uw().d(var6);
            return;
         }

         if (var1 == (6318 & 26591)) {
            int var2 = !var4.getSsn().equals("2") && !var4.getSsn().equals("3") && !var4.getSsn().equals("4") ? 9 : 9;
            if (var4.getOpenSealByType(2 ^ 3) >= var2) {
               this.aej.f("这只召唤兽的技能格子都已解开！");
               return;
            }

            String var5 = Agreement.getSendTextAES("userpet", "JP|" + var4.getSid() + "|" + var3.getRgid());
            this.uw().d(var5);
         }
      }

   }

   public void s() {
      int var10000 = 3 ^ 3;
      this.py = null;

      for(int var1 = var10000; var10000 < this.aiy.length; var10000 = var1) {
         <undefinedtype> var2 = this.aiy[var1];
         ++var1;
         var2.cf(-4 >> 2, -4 >> 2);
      }

   }

   public void w(RolePet var1) {
      if (var1 == null) {
         this.s();
      } else {
         RoleSummoning var5 = var1.getPet();
         ArrayList var4 = new ArrayList();
         int var10000;
         int var2;
         if (var5.getPetSkills() != null && !var5.getPetSkills().equals("")) {
            String[] var3 = var5.getPetSkills().split("\\|");

            for(var10000 = var2 = 5 >> 3; var10000 < var3.length; var10000 = var2) {
               if (!var3[var2].startsWith("L") && !var3[var2].startsWith("Q") && !var3[var2].startsWith("T") && !var3[var2].startsWith("X")) {
                  var4.add(var3[var2]);
               }

               ++var2;
            }
         }

         this.py = var1.getId();
         int var10 = var5.getOpenSealByType(3 & 4);
         var2 = var5.getOpenSealByType(--1);

         int var9;
         for(var10000 = var9 = 2 & 5; var10000 < 9; var10000 = var9) {
            if (var9 >= var10) {
               if (this.uw().gamePetSkill && var9 >= var2) {
                  this.aiy[var9].cf(-1 & -2, -4 >> 2);
               } else {
                  this.aiy[var9].cf(-4 >> 2, -4 >> 2);
               }
            } else if (var9 != (103 & 30) || var5.getBeastSkills() == null || var5.getBeastSkills().equals("")) {
               if ((var9 >= (94 & 39) || var4 == null || var9 >= var4.size()) && (var9 <= (111 & 22) || var4 == null || var9 - --1 >= var4.size())) {
                  this.aiy[var9].cf(2 & 5, -4 >> 2);
               } else {
                  String var6;
                  int var7;
                  int var8 = (var7 = (var6 = (String)var4.get(var9 < (111 & 22) ? var9 : var9 - (4 ^ 5))).indexOf("=")) == -4 >> 2 ? -4 >> 2 : Integer.parseInt(var6.substring(var7 + (3 & 5)));
                  this.aiy[var9].cf(Integer.parseInt(var7 == -4 >> 2 ? var6 : var6.substring(3 >> 2, var7)), var8);
               }
            }

            ++var9;
         }

      }
   }

   public void ax(Goodstable var1) {
      if (var1 == null) {
         this.ne = null;
         this.en.clear();
         this.aix.c(3 & 4, (Object)null);
      } else {
         this.ne = var1.getRgid();
         String var2 = Class394.d(var1.getValue(), "技能=", "|");
         String var3 = Class394.d(var1.getValue(), "技能等级=", "|");
         this.aix.c(5 >> 2, var1);
         this.en.setTextSize("#Y技能：#G" + var2 + "#r#Y技能等级：#G" + var3, 23294 & 9661);
         this.en.setBounds(19835 & 13206, 21455 & 11646, this.en.getWidth(), this.en.getHeight());
      }
   }

   public void d() {
      this.ajb.q();
      this.aiz.q();
   }

   public Class680(GameView var1) {
      int var10001 = --3;
      int var10005 = 127 & 43;
      int var10007 = 59 & 111;
      int var10014 = -4 >> 2;
      super(20919 & 12011, --2, Class345.aef, var1);
      this.va(var10014, 3 ^ 3, 28159 & 5095, 27599 & 5616, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 94 & 101, 94 & 101, 94 & 101, 94 & 101, (boolean)(5 >> 3)), "聚魄丹");
      this.ajb = new Class248(this);
      this.ajb.setBounds(3 >> 2, 3 >> 2, 11999 & 20918, 62 & 85);
      this.aiz = new Class548(this);
      this.aiz.setBounds(2 & 5, 2 & 5, 26302 & 6615, 95 & 52);
      this.hd = Class133.f(var10007, 127 & 59, 12251 & 20671, 3759 & 29176, this.ajb, 54 & 93);
      this.o = Class133.f(var10005, 7166 & 25853, 29151 & 3771, 168, this.aiz, 20);
      this.add(this.hd);
      this.add(this.o);
      Class643[] var5 = new Class643[var10001];
      boolean var10003 = true;
      this.aja = var5;

      int var2;
      Class680 var4;
      int var10000;
      for(var10000 = var2 = 2 & 5; var10000 < this.aja.length; var10000 = var2) {
         Class643[] var3 = this.aja;
         Class643 var6 = new Class643;
         String var10004 = var2 == --2 ? "sc/e/1.png" : "sc/e/26.png";
         int var10006 = 141 + var2;
         Font var10 = Class681.ak;
         Color[] var10008 = Class681.c;
         String var10009;
         Class680 var10010;
         if (var2 == 0) {
            var10009 = "获得技能";
            var10010 = this;
         } else if (var2 == 5 >> 2) {
            var10009 = "开技能格";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var6.<init>(var10004, 1, var10006, var10, var10008, var10009, var10010);
         var3[var2] = var6;
         if (var2 == --2) {
            var4 = this;
            this.aja[var2].setBounds(437, 48, 18, 18);
         } else {
            var4 = this;
            this.aja[var2].setBounds(223 + 128 * var2, 398, 99, 25);
         }

         var4.add(this.aja[var2++]);
      }

      JLabel[] var7 = new JLabel[1 ^ 3];
      var10003 = true;
      this.c = var7;

      for(var10000 = var2 = 3 >> 2; var10000 < this.c.length; var10000 = var2) {
         this.c[var2] = Class133.b(43, 38 + 193 * var2, 155, 21, Color.white, Class681.ak);
         this.c[var2].setText(var2 == 0 ? "召唤兽列表" : (var2 == (3 & 5) ? "拥有聚魄丹" : ""));
         this.c[var2].setHorizontalAlignment(3 ^ 3);
         this.add(this.c[var2++]);
      }

      this.en = new RichLabel("", Class681.q);
      this.add(this.en);
      <undefinedtype>[] var8 = new <undefinedtype>[9];
      var10003 = true;
      this.aiy = var8;

      for(var10000 = var2 = 3 & 4; var10000 < this.aiy.length; var10000 = var2) {
         this.aiy[var2] = new MouseListener(var2) {
            private int ay;
            private Image bx;
            private int bn;
            private Image fq;
            private int m;

            public void mousePressed(MouseEvent var1) {
            }

            public void mouseReleased(MouseEvent var1) {
            }

            public void mouseExited(MouseEvent var1) {
               if (this.ay == -4 >> 2 || this.ay == (-2 & -1)) {
                  Class680.this.ve().n(111 & 62);
               }

            }

            protected void paintComponent(Graphics var1) {
               var1.drawImage(Class680.bx, 5 >> 3, 5 >> 3, this.getWidth(), this.getHeight(), (ImageObserver)null);
               if (this.bx != null) {
                  var1.drawImage(this.bx, 39 & 94, 39 & 94, 118 & 59, 118 & 59, (ImageObserver)null);
               }

               if (this.fq != null) {
                  var1.drawImage(this.fq, 43 & 124, 71 & 63, 95 & 47, 95 & 47, (ImageObserver)null);
               }

            }

            public {
               this.m = var2;
               this.addMouseListener(this);
            }

            public void mouseClicked(MouseEvent var1) {
            }

            public void mouseEntered(MouseEvent var1) {
               if (this.ay == -4 >> 2 || this.ay == (-1 & -2)) {
                  Class270 var2 = (Class270)Class680.this.ve().e(63 & 110);
                  if (this.ay == (-2 & -1)) {
                     var2.f("#R技能格(未获取)#r#Y获取技能格的方式:#r1.召唤兽点化后,使用提炼过的聚魄丹时有几率获得;#r2.召唤兽启灵时,有几率获得(封印状态);");
                     return;
                  }

                  if (this.ay == -4 >> 2) {
                     var2.f("#Y技能格(封印)#r解封技能格方式:#r1.明雷战斗可随机开启(园子有更高的概率解封);#r2.使用启魂丹开启;");
                  }
               }

            }

            public void cf(int var1, int var2) {
               this.ay = var1;
               this.bn = var2;
               <undefinedtype> var10000;
               if (var1 == -4 >> 2) {
                  var10000 = this;
                  this.bx = Class511.a("sc/d/59.png");
               } else if (var1 == (-1 & -2)) {
                  var10000 = this;
                  this.bx = Class511.a("sc/d/115.png");
               } else if (var1 == 0) {
                  this.bx = null;
                  var10000 = this;
               } else {
                  this.bx = Class222.g(String.valueOf(var1));
                  var10000 = this;
               }

               var10000.fq = var2 >= 0 ? Class511.a("sc/c/83") : null;
            }
         };
         if (var2 == 0) {
            var4 = this;
            this.aiy[var2].setBounds(301, 40, 62, 62);
         } else if (var2 == (2 ^ 3)) {
            var4 = this;
            this.aiy[var2].setBounds(233, 82, 62, 62);
         } else if (var2 == (1 ^ 3)) {
            var4 = this;
            this.aiy[var2].setBounds(204, 149, 62, 62);
         } else if (var2 == --3) {
            var4 = this;
            this.aiy[var2].setBounds(233, 217, 62, 62);
         } else if (var2 == --4) {
            var4 = this;
            this.aiy[var2].setBounds(301, 259, 62, 62);
         } else if (var2 == --5) {
            var4 = this;
            this.aiy[var2].setBounds(370, 216, 62, 62);
         } else if (var2 == 6) {
            var4 = this;
            this.aiy[var2].setVisible((boolean)(2 & 5));
         } else if (var2 == 7) {
            var4 = this;
            this.aiy[var2].setBounds(398, 149, 62, 62);
         } else {
            if (var2 == 8) {
               this.aiy[var2].setBounds(369, 82, 62, 62);
            }

            var4 = this;
         }

         var4.add(this.aiy[var2++]);
      }

      this.aix = new Class44(this);
      this.aix.setBounds(210, 337, 50, 50);
      this.add(this.aix);
      Class436[] var9 = new Class436[7];
      var10003 = true;
      this.ce = var9;

      for(var10000 = var2 = 3 & 4; var10000 < this.ce.length; var10000 = var2) {
         this.ce[var2] = new Class436();
         if (var2 != 0 && var2 != 3 >> 1) {
            if (var2 != (1 ^ 3) && var2 != --3) {
               if (var2 == --4) {
                  var4 = this;
                  this.ce[var2].setBounds(202, 37, 264, 291);
                  this.ce[var2].fw("sc/d/114.png");
               } else if (var2 == 5) {
                  var4 = this;
                  this.ce[var2].setBounds(206, 333, 59, 57);
                  this.ce[var2].fw("sc/d/4.png");
               } else {
                  if (var2 == 6) {
                     this.ce[var2].eq(Class511.q("sc/d/24.png", 2, 2, 2, 2, (boolean)(3 ^ 3)));
                     this.ce[var2].setBounds(270, 333, 195, 56);
                  }

                  var4 = this;
               }
            } else {
               var4 = this;
               this.ce[var2].eq(Class511.q("sc/d/24.png", 5 >> 1, 5 >> 1, 5 >> 1, 5 >> 1, (boolean)(3 & 4)));
               this.ce[var2].setBounds(43, 38 + 193 * (var2 - (1 ^ 3)), 155, 190);
            }
         } else {
            var4 = this;
            this.ce[var2].eq(Class511.q("sc/d/25.png", 5 >> 1, 5 >> 1, 5 >> 1, 5 >> 1, (boolean)(3 ^ 3)));
            this.ce[var2].setBounds(43, 38 + 193 * var2, 155, 21);
         }

         var4.add(this.ce[var2++]);
      }

   }

   public void zo(Goodstable var1, RoleSummoning var2) {
      this.ajb.gh(var2.getSid().longValue());
      this.aiz.gh(var1.getRgid().longValue());
      this.d();
      this.ve().a(this.ae());
   }
}
