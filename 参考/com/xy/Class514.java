package com.xy;

import com.xy.battle.BattleBuff;
import com.xy.battle.BattleControl;
import com.xy.battle.BattleDisplay;
import com.xy.battle.BattleHandle;
import com.xy.battle.BattleMan;
import com.xy.battle.BattlePlayProgress;
import com.xy.battle.BattleScene;
import com.xy.battle.BattleSkillShow;
import com.xy.battle.FightingState;
import com.xy.battle.effect.MoveEffect;
import com.xy.bean.PathPoint;
import com.xy.game.GameMove;
import com.xy.richtext.FloatBox;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.ImageObserver;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Class514 extends Class292 {
   private double at;
   private int h;
   private BattleScene au;
   public int i;
   private int av;
   private boolean aw;
   private BattleMan ax;
   private int o;
   private LinkedList<BattleDisplay> ay;

   public void t(Graphics var1) {
      if (this.ad != null) {
         Graphics2D var6;
         Graphics2D var10000 = var6 = (Graphics2D)var1;
         Object var5 = var10000.getRenderingHint(RenderingHints.KEY_STROKE_CONTROL);
         Object var4 = var10000.getRenderingHint(RenderingHints.KEY_ANTIALIASING);
         Object var9;
         if (var5 != RenderingHints.VALUE_STROKE_DEFAULT) {
            var9 = var4;
            var6.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_DEFAULT);
         } else {
            var5 = null;
            var9 = var4;
         }

         Graphics var10;
         if (var9 != RenderingHints.VALUE_ANTIALIAS_ON) {
            var10 = var1;
            var6.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
         } else {
            var4 = null;
            var10 = var1;
         }

         var10.setFont(Class681.cd);
         int var3 = this.ak + (23 & 127);
         if (this.ag == 0) {
            this.ag = var1.getFontMetrics().stringWidth(this.ad) / --2;
         }

         int var2;
         Class514 var11;
         label59: {
            var2 = this.am - this.ag;
            if (this.ax.getW() != null) {
               if (this.ax.getW() == (30 & 103)) {
                  Class8 var7;
                  if ((var7 = Class330.q(Class222.m(this.ax.getW().toString()))) != null) {
                     var11 = this;
                     var7.d(this.an, 3 >> 2);
                     var7.aa(var1, var2 - (62 & 93), var3 - (21 & 126));
                     break label59;
                  }
               } else {
                  Image var8 = Class222.u(this.ax.getW());
                  var1.drawImage(var8, var2 - (92 & 63), var3 - (62 & 83), (ImageObserver)null);
               }
            }

            var11 = this;
         }

         if (var11.ax.getType() != 0 && this.ax.getType() != 3 >> 1) {
            if (this.ax.getType() == 5 >> 1) {
               var9 = var5;
               var1.setColor(Class681.au);
               var1.drawString(this.ad, var2 + (4 ^ 5), var3 + (3 >> 1));
               var1.setColor(Color.GREEN);
               var1.drawString(this.ad, var2, var3);
            } else {
               if (this.ax.getType() == --3) {
                  var10 = var1;
                  var3 += 15;
               } else {
                  if (this.ax.getType() == --4) {
                     var3 -= 5;
                  }

                  var10 = var1;
               }

               var10.setColor(Class681.au);
               var9 = var5;
               var1.drawString(this.ad, var2 + (3 & 5), var3 + (5 >> 2));
               var1.setColor(Color.GREEN);
               var1.drawString(this.ad, var2, var3);
            }
         } else {
            var1.setColor(Class681.au);
            var1.drawString(this.ad, var2 + (4 ^ 5), var3 + --1);
            var1.setColor(Class681.i(this.ax.getZs()));
            var1.drawString(this.ad, var2, var3);
            var9 = var5;
         }

         if (var9 != null) {
            var6.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, var5);
         }

         if (var4 != null) {
            var6.setRenderingHint(RenderingHints.KEY_ANTIALIASING, var4);
         }

      }
   }

   public BattleMan bt() {
      return this.ax;
   }

   public void bu(long var1) {
      this.bf();
      this.h = (int)((long)this.h + var1);
      this.an = (long)(this.at != 1.0D ? (int)((double)this.h * this.at) : this.h);
      this.af((int)var1);
   }

   public void bv(BattlePlayProgress var1) {
      if (this.ax.a(var1.getHp_Change(), var1.getMp_Change(), var1.getYq_Change(), var1.getNq_Change(), var1.getXy_Change())) {
         this.au.aa(this);
      }

      int var10001;
      BattlePlayProgress var10002;
      if (this.ax.getHp_Current() > 0) {
         var10001 = 15 & 119;
         var10002 = var1;
      } else {
         var10001 = 8;
         var10002 = var1;
      }

      this.bz(var10001, var10002.getDirend());
   }

   public void ac() {
      int var1 = 3 ^ 3;
      int var2 = 3 ^ 3;
      int var3 = this.ax.getMan();
      int var10000;
      if (this.ax.getType() == --3) {
         var3 -= 10;
         var10000 = var3;
      } else {
         if (this.ax.getType() == --4) {
            var3 -= 15;
         }

         var10000 = var3;
      }

      Class514 var4;
      if (var10000 == 0) {
         var1 = --3;
         var2 = --3;
         var4 = this;
      } else if (var3 == --5) {
         var1 = --5;
         var2 = --3;
         var4 = this;
      } else if (var3 == 3 >> 1) {
         var1 = --3;
         var2 = --4;
         var4 = this;
      } else if (var3 == (102 & 31)) {
         var1 = --5;
         var2 = --4;
         var4 = this;
      } else if (var3 == (1 ^ 3)) {
         var1 = --3;
         var2 = --5;
         var4 = this;
      } else if (var3 == (95 & 39)) {
         var1 = --5;
         var2 = --5;
         var4 = this;
      } else if (var3 == 3) {
         var1 = 3;
         var2 = 7 & 126;
         var4 = this;
      } else if (var3 == (63 & 72)) {
         var1 = 5;
         var2 = 118 & 15;
         var4 = this;
      } else if (var3 == 4) {
         var1 = 3;
         var2 = 127 & 7;
         var4 = this;
      } else {
         if (var3 == (43 & 93)) {
            var1 = 5;
            var2 = 47 & 87;
         }

         var4 = this;
      }

      var4.ab = 315 + (127 & 60) * var1 - (61 & 126) * var2;
      this.al = (-43 & -273) + (118 & 123) * var2 + (58 & 93) * var1;
      if (this.ax.getType() == 3) {
         this.ab -= 58 & 119;
      } else {
         if (this.ax.getType() == 4) {
            this.ab -= 42 & 125;
         }

      }
   }

   public boolean g() {
      return (boolean)(this.an >= (long)this.af.e() ? --1 : 0);
   }

   public static PathPoint bw(int var0, int var1) {
      int var2 = 3 >> 2;
      int var3 = 3 >> 2;
      if (var1 == 0) {
         var2 = --3;
         var3 = --3;
      } else if (var1 == --5) {
         var2 = --5;
         var3 = --3;
      } else if (var1 == 3 >> 1) {
         var2 = --3;
         var3 = --4;
      } else if (var1 == (79 & 54)) {
         var2 = --5;
         var3 = --4;
      } else if (var1 == --2) {
         var2 = --3;
         var3 = --5;
      } else if (var1 == (119 & 15)) {
         var2 = --5;
         var3 = --5;
      } else if (var1 == --3) {
         var2 = --3;
         var3 = 14 & 119;
      } else if (var1 == (125 & 10)) {
         var2 = 5;
         var3 = 87 & 46;
      } else if (var1 == 4) {
         var2 = 3;
         var3 = 119 & 15;
      } else if (var1 == (47 & 89)) {
         var2 = 5;
         var3 = 63 & 71;
      }

      return new PathPoint((24379 & 8703) + (60 & 127) * var2 - (126 & 61) * var3, (-59 & -257) + (119 & 122) * var3 + (122 & 29) * var2);
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

   public void bx(BattleDisplay var1) {
      if (var1 != null) {
         synchronized(this) {
            Class514 var10000;
            if (this.ay == null) {
               this.ay = new LinkedList();
               var10000 = this;
            } else {
               BattleDisplay var3;
               if (this.ay.size() != 0 && (var3 = (BattleDisplay)this.ay.getLast()) != null) {
                  var1.setTime(Math.min(0L, var3.getTime() - 100L));
               }

               var10000 = this;
            }

            var10000.ay.addLast(var1);
         }
      }
   }

   public Class514(BattleMan var1, FightingState var2, BattleScene var3) {
      int var10007 = 3 >> 2;
      super();
      this.at = 1.0D;
      this.o = var10007;
      this.au = var3;
      var1.i();
      this.ax = var1;
      if (this.ax.b("隐身")) {
         this.ax.setAlpha(0.3F);
      }

      this.af = var1.getPart();
      this.af.r(var1.getHp_Current() <= 0 ? 60 & 75 : 7);
      this.ad = var1.getManname();
      int var6;
      this.av = (var6 = var1.getCampId()) & --3;
      this.as = var6 >> --2 & 111 & 31;
      StringBuffer var4;
      (var4 = new StringBuffer()).append(var6 >> (95 & 38) & --3);
      var4.append("|");
      var4.append(var6 >> (42 & 93) & 127 & 63);
      int var7 = var6 >> (110 & 31) & 31 & 111;
      if (var7 != 0) {
         var4.append("|");
         var4.append(var7);
      }

      PathPoint var5;
      PathPoint var10001 = var5 = MoveEffect.b(var4.toString(), var1.getCampId() & --3);
      this.ab = var5.getX();
      this.al = var10001.getY();
   }

   public BattleScene by() {
      return this.au;
   }

   public void bz(int var1, int var2) {
      if (var1 != 0 && var1 != 5 >> 1) {
         this.an = (long)(this.h = 5 >> 3);
         this.af.r(var1);
         this.af.u();
         if (var2 == 0) {
            var2 = --3;
         }

         this.as = var2;
         if (var1 == (27 & 109)) {
            this.at = 2.0D;
         } else if (var1 != --4 && var1 != --5) {
            if (var1 != --3 && var1 != (75 & 63) && var1 != (94 & 45)) {
               this.at = 1.3D;
            } else {
               this.at = 1.8D;
            }
         } else {
            this.at = 1.4D;
         }
      }
   }


   private void ca(BattleSkillShow var1) {
      if (var1 != null) {
         if (var1.getSkinpath() != 0 && var1.getSkinpath() != --4 && var1.getSkinpath() != --5) {
            int var2;
            for(int var10000 = var2 = this.au.showSkillList.size() - --1; var10000 >= 0; var10000 = var2) {
               BattleSkillShow var3;
               if ((var3 = (BattleSkillShow)this.au.showSkillList.get(var2)).getRound() == var1.getRound() && var3.getSkillid().equals(var1.getSkillid())) {
                  return;
               }

               --var2;
            }

            this.au.showSkillList.add(var1);
         } else {
            this.au.showSkillList.add(var1);
         }
      }
   }

   public void a(GameView var1) {
   }

   public Class514(BattleMan var1, BattleScene var2) {
      int var10007 = 5 >> 3;
      super();
      this.at = 1.0D;
      this.o = var10007;
      this.au = var2;
      var1.i();
      this.ax = var1;
      if (this.ax.b("隐身")) {
         this.ax.setAlpha(0.3F);
      }

      this.af = var1.getPart();
      this.af.r(var1.getHp_Current() <= 0 ? 25 & 110 : 7);
      int var10005 = --3;
      this.ad = var1.getManname();
      this.as = var10005;
      this.av = var1.getCamp();
      this.ac();
      if (var2.getBattleRound() == (2 ^ 3)) {
         Class514 var10000;
         label28: {
            if (var1.getCamp() == 0 && var1.getMan() == 5 >> 1) {
               if (var2.getBattleType() == (127 & 15)) {
                  var10000 = this;
                  this.as("大胆狗贼!哪里逃");
                  break label28;
               }

               if (var2.getBattleType() == (22 & 121)) {
                  this.as("现在年轻人真是没有眼力劲");
               }
            }

            var10000 = this;
         }

         var10000.ae();
      }
   }

   public void i(boolean var1) {
      this.aw = var1;
   }

   public boolean c(int var1, int var2) {
      return this.af.x(var1 - this.am, var2 - this.ak);
   }

   public void ae() {
      if (this.ax.getHp_Current() > 0) {
         String var1;
         if ((var1 = this.ax.getMsg()) != null && !var1.equals("")) {
            this.as(var1);
            this.au.v("#Q[" + this.ad + "]" + var1);
         }
      }
   }

   public void cb(BattlePlayProgress var1) {
      if (var1.getData() != null || var1.getHp_Change() != 0 || var1.getMp_Change() != 0) {
         boolean var5 = var1.getData() != null && (var1.getData().equals("法力不足") || var1.getData().equals("无法用药") || var1.getData().equals("怨气不足"));
         BattleDisplay var4 = null;
         int var3 = var1.getHp_Change();
         int var2 = var1.getMp_Change();
         if (var3 < 0 && -var3 > this.ax.getHp_Current()) {
            var3 = -this.ax.getHp_Current();
         }

         if (var2 < 0 && -var2 > this.ax.getMp_Current()) {
            var2 = -this.ax.getMp_Current();
         }

         var4 = new BattleDisplay(var5, var1.getData(), var3, var2);
         this.bx(var4);
      }
   }

   public void cc(Graphics var1, int var2) {
      if (this.ay != null && this.ay.size() != 0) {
         int var7 = this.am;
         int var4 = this.ak;
         int var5 = 3 ^ 3;

         Iterator var3;
         for(Iterator var10000 = var3 = this.ay.iterator(); var10000.hasNext(); var10000 = var3) {
            BattleDisplay var6;
            if ((var6 = (BattleDisplay)var3.next()).c((boolean)(var2 == this.ax.getCamp() ? 3 & 5 : 0))) {
               int var10003 = var4 - (63 & 89) + var5 * (56 & 87);
               ++var5;
               var6.b(var1, var7, var10003, (boolean)(var2 == this.ax.getCamp() ? 3 & 5 : 0));
            }
         }

      }
   }

   public int l(Class292 var1) {
      Class514 var2 = (Class514)var1;
      return this.ax.getType() < var2.ax.getType() ? 3 & 5 : -1;
   }

   public void cd(double var1, double var3, int var5, int var6, int var7) {
      double var10000;
      if (var7 != this.av) {
         var10000 = var1;
         this.am = this.ab;
         this.ak = this.al;
         this.i = this.as;
      } else {
         int var10003 = 2014 & 31481;
         this.am = (13342 & 20449) - this.ab;
         this.ak = var10003 - this.al;
         this.i = BattleHandle.getdir(this.as);
         var10000 = var1;
      }

      if (var10000 < 1.0D) {
         this.am = (int)((double)this.am * var1);
      }

      if (var3 < 1.0D) {
         this.ak = (int)((double)this.ak * var3);
      }

      this.am += var5;
      this.ak += var6;
   }

   public void af(int var1) {
      if (this.ay != null && this.ay.size() != 0) {
         synchronized(this) {
            Iterator var3;
            Iterator var10000 = var3 = this.ay.iterator();

            while(var10000.hasNext()) {
               BattleDisplay var4;
               if ((var4 = (BattleDisplay)var3.next()).getTime() < (long)BattleDisplay.TILIU) {
                  var10000 = var3;
                  var4.a(var1);
               } else {
                  var10000 = var3;
                  var3.remove();
               }
            }

         }
      }
   }

   public boolean h() {
      return this.aw;
   }

   public void ce(Graphics var1, int var2, BattleControl var3) {
      if (this.ax.getType() != --3 && this.ax.getType() != --4 && this.ax.getType() != (20479 & 13287)) {
         label53: {
            if (var2 != this.ax.getCamp()) {
               if (this.ax.getCamp() == (3 & 5)) {
                  if (!this.au.buffUtil.isMcqh2) {
                     break label53;
                  }
               } else if (!this.au.buffUtil.isMcqh1) {
                  break label53;
               }
            }

            Graphics var10000;
            if ((var2 = (int)(60.0D * (double)this.ax.getHp_Current() / (double)this.ax.getHp_Total())) > (126 & 61)) {
               var2 = 63 & 124;
               var10000 = var1;
            } else {
               if (var2 < 0) {
                  var2 = 2 & 5;
               }

               var10000 = var1;
            }

            var10000.drawImage(Class572.q[3 & 4], this.am - (63 & 99), this.ak - (126 & 127), 127 & 60, --5, (ImageObserver)null);
            var1.drawImage(Class572.q[4 ^ 5], this.am - (107 & 55), this.ak - (127 & 126), var2, --5, (ImageObserver)null);
            var2 = (int)(60.0D * (double)this.ax.getMp_Current() / (double)this.ax.getMp_Total());
            if (var2 > (125 & 62)) {
               var2 = 63 & 124;
               var10000 = var1;
            } else {
               if (var2 < 0) {
                  var2 = 5 >> 3;
               }

               var10000 = var1;
            }

            var10000.drawImage(Class572.q[2 & 5], this.am - (107 & 55), this.ak - (121 & 126), 127 & 60, --5, (ImageObserver)null);
            var1.drawImage(Class572.q[--2], this.am - (55 & 107), this.ak - (121 & 126), var2, --5, (ImageObserver)null);
         }

         if (var3.battleCamp == this.ax.getCamp() && !this.aw && var3.battleScene.getBattleState() == (3 & 5)) {
            var1.drawImage(Class572.q[--3], this.am - (127 & 49), this.ak - 127, 13, 13, (ImageObserver)null);
         }

      }
   }

   public boolean cf(List<PathPoint> var1, String var2) {
      if (var2.equals("遁地")) {
         long var3 = (long)this.af.e();
         Class514 var10000;
         if (this.an > var3 - 100L && var1.size() > (2 ^ 3)) {
            this.ab = ((PathPoint)var1.get(--1)).getX();
            this.al = ((PathPoint)var1.get(2 ^ 3)).getY();
            var10000 = this;
            var1.clear();
         } else {
            if (var1.size() == 3 >> 1) {
               this.ab = ((PathPoint)var1.get(3 >> 2)).getX();
               this.al = ((PathPoint)var1.get(5 >> 3)).getY();
               var1.clear();
            }

            var10000 = this;
         }

         if (var10000.an > var3) {
            return (boolean)(3 ^ 3);
         }
      } else if (GameMove.getMovetime((Class514)this, var1)) {
         int var5 = 5 >> 3;
         var1.clear();
         return (boolean)var5;
      }

      return true;
   }

   public int ap() {
      return this.ax.getCamp();
   }

   public void cg(Graphics var1, int var2, Class292 var3, BattleControl var4) {
      if (!this.ax.f() && !this.ax.m()) {
         int var7 = this == var3 ? --1 : 0;
         BattleBuff var5 = this.au.buffUtil.getZT(this.av);
         boolean var6 = this.ax.l(var1, this.an, this.am, this.ak, this.au.getBattleRound());
         Class514 var10000;
         if (var7 != 0) {
            if (this.af.z() == (15 & 120)) {
               this.af.p(var1, this.am, this.ak, this.i, -1L, var5 != null ? 0.3F : this.ax.getAlpha());
               var10000 = this;
            } else if (this.ax.getType() == --3 && this.af.z() == --5) {
               this.af.p(var1, var4.gameView.screenData.Screen_x / (1 ^ 3), var4.gameView.screenData.Screen_y / (1 ^ 3), this.i, this.an, var5 != null ? 0.3F : this.ax.getAlpha());
               var10000 = this;
            } else {
               this.af.p(var1, this.am, this.ak, this.i, this.an, var5 != null ? 0.3F : this.ax.getAlpha());
               var10000 = this;
            }
         } else if (this.af.z() == (58 & 77)) {
            this.af.f(var1, this.am, this.ak, this.i, var5 != null ? 0.3F : this.ax.getAlpha());
            var10000 = this;
         } else if (this.ax.getType() == --3 && this.af.z() == --5) {
            this.af.o(var1, var4.gameView.screenData.Screen_x / (5 >> 1), var4.gameView.screenData.Screen_y / --2, this.i, this.an, var5 != null ? 0.3F : this.ax.getAlpha());
            var10000 = this;
         } else {
            this.af.o(var1, this.am, this.ak, this.i, this.an, var5 != null ? 0.3F : this.ax.getAlpha());
            var10000 = this;
         }

         var10000.ce(var1, var2, var4);
         if (var6) {
            this.ax.c(var1, this.an, this.am, this.ak);
         }

         this.bn(var1);
         this.t(var1);
      } else {
         this.bn(var1);
         this.t(var1);
      }
   }

   public boolean ch(BattlePlayProgress var1) {
      if (var1.getZxzt() == --2) {
         return (boolean)(3 >> 2);
      } else if (var1.getZxzt() == 0) {
         this.cb(var1);
         this.au.y(var1.getMusic());
         this.ca(var1.getSpell());
         this.as(var1.getText());
         if (this.o == 0) {
            this.o = 5 >> 2;
            var1.setZxzt(5 >> 2);
            this.bz(var1.getType(), var1.getDir());
            return this.ch(var1);
         } else {
            var1.setZxzt(--2);
            if (this.ax.a(var1.getHp_Change(), var1.getMp_Change(), var1.getYq_Change(), var1.getNq_Change(), var1.getXy_Change())) {
               this.au.aa(this);
            }

            this.ax.h(var1.getAddchixu());
            this.ax.d(var1.getDeletechixu());
            this.au.buffUtil.b(var1.getBuff());
            return (boolean)(5 >> 3);
         }
      } else {
         Class514 var10000;
         if (var1.getZxzt() == (4 ^ 5)) {
            if (var1.getPath() != null) {
               if (!this.cf(var1.getPath(), var1.getData2())) {
                  var1.setZxzt(1 ^ 3);
                  var10000 = this;
                  this.o = --3;
                  this.bv(var1);
                  this.ax.h(var1.getAddchixu());
                  this.ax.d(var1.getDeletechixu());
                  this.au.buffUtil.b(var1.getBuff());
                  return (boolean)(var10000.o == --3 ? (this.o = 3 & 4) : 1);
               }
            } else {
               if (this.o == 5 >> 2 && this.ci(var1.getType())) {
                  this.o = 1 ^ 3;
                  this.bv(var1);
                  return this.ch(var1);
               }

               if (this.o == --2) {
                  int var10004 = 5 >> 1;
                  this.o = --3;
                  var1.setZxzt(var10004);
                  this.ax.h(var1.getAddchixu());
                  this.ax.d(var1.getDeletechixu());
                  this.au.buffUtil.b(var1.getBuff());
               }
            }
         }

         var10000 = this;
         return (boolean)(var10000.o == --3 ? (this.o = 3 & 4) : 1);
      }
   }

   public boolean ci(int var1) {
      if (var1 != 0 && var1 != 5 >> 1) {
         return (boolean)(this.an >= (long)this.af.e() ? 4 ^ 5 : 0);
      } else {
         return true;
      }
   }
}
