package com.xy.d;

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
import com.xy.q.Class49;
import com.xy.text.GameView;
import com.xy.w.Class15;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Class11 extends Class4 {
   private double aw = 1.0;
   private BattleMan ax;
   private int o = 0;
   private boolean ay;
   public int r;
   private BattleScene az;
   private int s;
   private int h;
   private LinkedList<BattleDisplay> ba;

   public void bk() {
      byte var1 = 0;
      byte var2 = 0;
      int var3 = this.ax.getMan();
      int var10000;
      if (this.ax.getType() == 3) {
         var3 -= 10;
         var10000 = var3;
      } else {
         if (this.ax.getType() == 4) {
            var3 -= 15;
         }

         var10000 = var3;
      }

      Class11 var4;
      if (var10000 == 0) {
         var1 = 3;
         var2 = 3;
         var4 = this;
      } else if (var3 == 5) {
         var1 = 5;
         var2 = 3;
         var4 = this;
      } else if (var3 == 1) {
         var1 = 3;
         var2 = 4;
         var4 = this;
      } else if (var3 == 6) {
         var1 = 5;
         var2 = 4;
         var4 = this;
      } else if (var3 == 2) {
         var1 = 3;
         var2 = 5;
         var4 = this;
      } else if (var3 == 7) {
         var1 = 5;
         var2 = 5;
         var4 = this;
      } else if (var3 == 3) {
         var1 = 3;
         var2 = 6;
         var4 = this;
      } else if (var3 == 8) {
         var1 = 5;
         var2 = 6;
         var4 = this;
      } else if (var3 == 4) {
         var1 = 3;
         var2 = 7;
         var4 = this;
      } else {
         if (var3 == 9) {
            var1 = 5;
            var2 = 7;
         }

         var4 = this;
      }

      var4.ae = 315 + 60 * var1 - 60 * var2;
      this.v = -325 + 114 * var2 + 24 * var1;
      if (this.ax.getType() == 3) {
         this.ae -= 50;
      } else {
         if (this.ax.getType() == 4) {
            this.ae -= 40;
         }
      }
   }

   @Override
   public int c(Class4 var1) {
      Class11 var2 = (Class11)var1;
      return this.ax.getType() < var2.ax.getType() ? 1 : -1;
   }

   public void bv(Graphics var1, int var2, Class4 var3, BattleControl var4) {
      if (this.ax.h()) {
         this.ad(var1);
         this.an(var1);
      } else {
         boolean var5 = this == var3;
         BattleBuff var6 = this.az.buffUtil.getZT(this.s);
         boolean var7 = this.ax.a(var1, this.z, this.x, this.y, this.az.getBattleRound());
         Class11 var10000;
         if (var5) {
            if (this.ac.j() == 8) {
               this.ac.n(var1, this.x, this.y, this.r, -1L, var6 != null ? 0.3F : this.ax.getAlpha());
               var10000 = this;
            } else if (this.ax.getType() == 3 && this.ac.j() == 5) {
               this.ac
                  .n(
                     var1,
                     var4.gameView.screenData.Screen_x / 2,
                     var4.gameView.screenData.Screen_y / 2,
                     this.r,
                     this.z,
                     var6 != null ? 0.3F : this.ax.getAlpha()
                  );
               var10000 = this;
            } else {
               this.ac.n(var1, this.x, this.y, this.r, this.z, var6 != null ? 0.3F : this.ax.getAlpha());
               var10000 = this;
            }
         } else if (this.ac.j() == 8) {
            this.ac.a(var1, this.x, this.y, this.r, var6 != null ? 0.3F : this.ax.getAlpha());
            var10000 = this;
         } else if (this.ax.getType() == 3 && this.ac.j() == 5) {
            this.ac
               .o(var1, var4.gameView.screenData.Screen_x / 2, var4.gameView.screenData.Screen_y / 2, this.r, this.z, var6 != null ? 0.3F : this.ax.getAlpha());
            var10000 = this;
         } else {
            this.ac.o(var1, this.x, this.y, this.r, this.z, var6 != null ? 0.3F : this.ax.getAlpha());
            var10000 = this;
         }

         var10000.cf(var1, var2, var4);
         if (var7) {
            this.ax.f(var1, this.z, this.x, this.y);
         }

         this.ad(var1);
         this.an(var1);
      }
   }

   public void bw(BattlePlayProgress var1) {
      if (var1.getData() != null || var1.getHp_Change() != 0 || var1.getMp_Change() != 0) {
         boolean var9;
         label41: {
            label40: {
               if (var1.getData() != null) {
                  String var10000 = var1.getData();
                  String var10001 = "泵劂中趪";
                  if (var10000.equals("法力不足")) {
                     break label40;
                  }

                  String var7 = var1.getData();
                  var10001 = "旕泏甝荵";
                  if (var7.equals("无法用药")) {
                     break label40;
                  }

                  String var8 = var1.getData();
                  var10001 = "怈氍中趪";
                  if (var8.equals("怨气不足")) {
                     break label40;
                  }
               }

               var9 = false;
               break label41;
            }

            var9 = true;
         }

         boolean var2 = var9;
         Object var3 = null;
         int var4 = var1.getHp_Change();
         int var5 = var1.getMp_Change();
         if (var4 < 0 && -var4 > this.ax.getHp_Current()) {
            var4 = -this.ax.getHp_Current();
         }

         if (var5 < 0 && -var5 > this.ax.getMp_Current()) {
            var5 = -this.ax.getMp_Current();
         }

         var3 = new BattleDisplay(var2, var1.getData(), var4, var5);
         this.ci((BattleDisplay)var3);
      }
   }

   public void bx(int var1, int var2) {
      if (var1 != 0 && var1 != 2) {
         this.z = this.h = 0;
         this.ac.t(var1);
         this.ac.u();
         if (var2 == 0) {
            var2 = 3;
         }

         this.ak = var2;
         if (var1 == 9) {
            this.aw = 2.0;
         } else if (var1 == 4 || var1 == 5) {
            this.aw = 1.4;
         } else if (var1 != 3 && var1 != 11 && var1 != 12) {
            this.aw = 1.3;
         } else {
            this.aw = 1.8;
         }
      }
   }

   public void by(double var1, double var3, int var5, int var6, int var7) {
      double var10000;
      if (var7 != this.s) {
         var10000 = var1;
         this.x = this.ae;
         this.y = this.v;
         this.r = this.ak;
      } else {
         this.x = 1024 - this.ae;
         this.y = 700 - this.v;
         this.r = BattleHandle.getdir(this.ak);
         var10000 = var1;
      }

      if (var10000 < 1.0) {
         this.x = (int)(this.x * var1);
      }

      if (var3 < 1.0) {
         this.y = (int)(this.y * var3);
      }

      this.x += var5;
      this.y += var6;
   }

   public Class11(BattleMan var1, BattleScene var2) {
      this.az = var2;
      var1.i();
      this.ax = var1;
      String var10001 = "隥躱";
      if (this.ax.d("隐身")) {
         this.ax.setAlpha(0.3F);
      }

      this.ac = var1.getPart();
      this.ac.t(var1.getHp_Current() <= 0 ? 8 : 7);
      this.w = var1.getManname();
      this.ak = 3;
      this.s = var1.getCamp();
      this.bk();
      if (var2.getBattleRound() == 1) {
         Class11 var10000;
         label30: {
            if (var1.getCamp() == 0 && var1.getMan() == 2) {
               if (var2.getBattleType() == 15) {
                  var10000 = this;
                  String var10002 = "备胟狷败\u0001哳釬通";
                  this.ak("大胆狗贼!哪里逃");
                  break label30;
               }

               if (var2.getBattleType() == 16) {
                  var10001 = "玅圲幁轡亏眅昚治朼眦劮动";
                  this.ak("现在年轻人真是没有眼力劲");
               }
            }

            var10000 = this;
         }

         var10000.g();
      }
   }

   public boolean bz(BattlePlayProgress var1) {
      if (var1.getZxzt() == 2) {
         return false;
      } else if (var1.getZxzt() == 0) {
         this.bw(var1);
         this.az.j(var1.getMusic());
         this.cj(var1.getSpell());
         this.ak(var1.getText());
         if (this.o == 0) {
            this.o = 1;
            var1.setZxzt(1);
            this.bx(var1.getType(), var1.getDir());
            return this.bz(var1);
         } else {
            var1.setZxzt(2);
            if (this.ax.b(var1.getHp_Change(), var1.getMp_Change(), var1.getYq_Change(), var1.getNq_Change())) {
               this.az.i(this);
            }

            this.ax.c(var1.getAddchixu());
            this.ax.e(var1.getDeletechixu());
            this.az.buffUtil.f(var1.getBuff());
            return false;
         }
      } else {
         if (var1.getZxzt() == 1) {
            if (var1.getPath() != null) {
               if (!this.ca(var1.getPath(), var1.getData2())) {
                  var1.setZxzt(2);
                  this.o = 3;
                  this.cd(var1);
                  this.ax.c(var1.getAddchixu());
                  this.ax.e(var1.getDeletechixu());
                  this.az.buffUtil.f(var1.getBuff());
                  return (boolean)((this.o == 3 ? (this.o = 0) : 1) == 1);
               }
            } else {
               if (this.o == 1 && this.ck(var1.getType())) {
                  this.o = 2;
                  this.cd(var1);
                  return this.bz(var1);
               }

               if (this.o == 2) {
                  this.o = 3;
                  var1.setZxzt(2);
                  this.ax.c(var1.getAddchixu());
                  this.ax.e(var1.getDeletechixu());
                  this.az.buffUtil.f(var1.getBuff());
               }
            }
         }

         return (boolean)((this.o == 3 ? (this.o = 0) : 1) == 1);
      }
   }

   public boolean ca(List<PathPoint> var1, String var2) {
      String var10001 = "遴圪";
      if (var2.equals("遁地")) {
         long var3 = this.ac.p();
         Class11 var10000;
         if (var1.size() > 1) {
            this.ae = var1.get(1).getX();
            this.v = var1.get(1).getY();
            var10000 = this;
            var1.clear();
         } else {
            if (var1.size() == 1) {
               this.ae = var1.get(0).getX();
               this.v = var1.get(0).getY();
               var1.clear();
            }

            var10000 = this;
         }

         if (var10000.z > var3) {
            return false;
         }
      } else if (GameMove.getMovetime(this, var1)) {
         var1.clear();
         return false;
      }

      return true;
   }

   public void cb(long var1) {
      this.y();
      this.h = (int)(this.h + var1);
      this.z = this.aw != 1.0 ? (int)(this.h * this.aw) : this.h;
      this.bd((int)var1);
   }

   public void cc(Graphics var1, int var2) {
      if (this.ba != null && this.ba.size() != 0) {
         int var3 = this.x;
         int var4 = this.y;
         int var5 = 0;

         Iterator var7;
         for (Iterator var10000 = var7 = this.ba.iterator(); var10000.hasNext(); var10000 = var7) {
            BattleDisplay var6;
            if ((var6 = (BattleDisplay)var7.next()).c(var2 == this.ax.getCamp())) {
               int var10003 = var4 - 25 + var5 * 16;
               var5++;
               var6.a(var1, var3, var10003, var2 == this.ax.getCamp());
            }
         }
      }
   }

   public void q(boolean var1) {
      this.ay = var1;
   }

   public void cd(BattlePlayProgress var1) {
      if (this.ax.b(var1.getHp_Change(), var1.getMp_Change(), var1.getYq_Change(), var1.getNq_Change())) {
         this.az.i(this);
      }

      byte var10001;
      BattlePlayProgress var10002;
      if (this.ax.getHp_Current() > 0) {
         var10001 = 7;
         var10002 = var1;
      } else {
         var10001 = 8;
         var10002 = var1;
      }

      this.bx(var10001, var10002.getDirend());
   }

   @Override
   public void an(Graphics var1) {
      if (this.w != null) {
         Graphics2D var2;
         Graphics2D var10000 = var2 = (Graphics2D)var1;
         Object var3 = var10000.getRenderingHint(RenderingHints.KEY_STROKE_CONTROL);
         Object var4 = var10000.getRenderingHint(RenderingHints.KEY_ANTIALIASING);
         Object var9;
         if (var3 != RenderingHints.VALUE_STROKE_DEFAULT) {
            var9 = var4;
            var2.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_DEFAULT);
         } else {
            var3 = null;
            var9 = var4;
         }

         if (var9 != RenderingHints.VALUE_ANTIALIAS_ON) {
            var2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
         } else {
            var4 = null;
         }

         var1.setFont(Class49.ab);
         int var5 = this.y + 23;
         if (this.aj == 0) {
            this.aj = var1.getFontMetrics().stringWidth(this.w) / 2;
         }

         int var6;
         Class11 var11;
         label61: {
            var6 = this.x - this.aj;
            if (this.ax.getW() != null) {
               if (this.ax.getW() == 6) {
                  com.xy.w.Class1 var7;
                  if ((var7 = com.xy.w.Class11.x(Class15.p(this.ax.getW().toString()))) != null) {
                     var11 = this;
                     var7.j(this.z, 0);
                     var7.ab(var1, var6 - 28, var5 - 20);
                     break label61;
                  }
               } else {
                  Image var8 = Class15.n(this.ax.getW());
                  var1.drawImage(var8, var6 - 28, var5 - 18, null);
               }
            }

            var11 = this;
         }

         if (var11.ax.getType() == 0 || this.ax.getType() == 1) {
            var1.setColor(Class49.z);
            var1.drawString(this.w, var6 + 1, var5 + 1);
            var1.setColor(Class49.d(this.ax.getZs()));
            var1.drawString(this.w, var6, var5);
            var9 = var3;
         } else if (this.ax.getType() == 2) {
            var9 = var3;
            var1.setColor(Class49.z);
            var1.drawString(this.w, var6 + 1, var5 + 1);
            var1.setColor(Color.GREEN);
            var1.drawString(this.w, var6, var5);
         } else {
            if (this.ax.getType() == 3) {
               var5 += 15;
            } else {
               if (this.ax.getType() == 4) {
                  var5 -= 5;
               }

            }

            var1.setColor(Class49.z);
            var9 = var3;
            var1.drawString(this.w, var6 + 1, var5 + 1);
            var1.setColor(Color.GREEN);
            var1.drawString(this.w, var6, var5);
         }

         if (var9 != null) {
            var2.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, var3);
         }

         if (var4 != null) {
            var2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, var4);
         }
      }
   }

   public BattleScene ce() {
      return this.az;
   }

   public void g() {
      if (this.ax.getHp_Current() > 0) {
         String var1;
         if ((var1 = this.ax.getMsg()) != null && !var1.equals("")) {
            this.ak(var1);
            String var10004 = "9dA";
            this.az.x("#Q[" + this.w + "]" + var1);
         }
      }
   }

   public int ab() {
      return this.ax.getCamp();
   }

   public void cf(Graphics var1, int var2, BattleControl var3) {
      if (this.ax.getType() != 3 && this.ax.getType() != 4 && this.ax.getType() != 999) {
         if (var2 == this.ax.getCamp() || (this.ax.getCamp() == 1 ? this.az.buffUtil.isMcqh2 : this.az.buffUtil.isMcqh1)) {
            int var4;
            Graphics var10000;
            if ((var4 = (int)(60.0 * this.ax.getHp_Current() / this.ax.getHp_Total())) > 60) {
               var4 = 60;
               var10000 = var1;
            } else {
               if (var4 < 0) {
                  var4 = 0;
               }

               var10000 = var1;
            }

            var10000.drawImage(Class9.av[0], this.x - 35, this.y - 126, 60, 5, null);
            var1.drawImage(Class9.av[1], this.x - 35, this.y - 126, var4, 5, null);
            int var5 = (int)(60.0 * this.ax.getMp_Current() / this.ax.getMp_Total());
            if (var5 > 60) {
               var5 = 60;
               var10000 = var1;
            } else {
               if (var5 < 0) {
                  var5 = 0;
               }

               var10000 = var1;
            }

            var10000.drawImage(Class9.av[0], this.x - 35, this.y - 120, 60, 5, null);
            var1.drawImage(Class9.av[2], this.x - 35, this.y - 120, var5, 5, null);
         }

         if (var3.battleCamp == this.ax.getCamp() && !this.ay && var3.battleScene.getBattleState() == 1) {
            var1.drawImage(Class9.av[3], this.x - 49, this.y - 127, 13, 13, null);
         }
      }
   }

   @Override
   public void b(GameView var1) {
   }

   public Class11(BattleMan var1, FightingState var2, BattleScene var3) {
      this.az = var3;
      var1.i();
      this.ax = var1;
      String var10001 = "隰躲";
      if (this.ax.d("隐身")) {
         this.ax.setAlpha(0.3F);
      }

      this.ac = var1.getPart();
      this.ac.t(var1.getHp_Current() <= 0 ? 8 : 7);
      this.w = var1.getManname();
      int var4;
      this.s = (var4 = var1.getCampId()) & 3;
      this.ak = var4 >> 2 & 15;
      StringBuffer var6;
      (var6 = new StringBuffer()).append(var4 >> 6 & 3);
      String var10002 = "f";
      var6.append("|");
      var6.append(var4 >> 8 & 63);
      int var5 = var4 >> 14 & 15;
      if (var5 != 0) {
         var10001 = "e";
         var6.append("|");
         var6.append(var5);
      }

      PathPoint var7;
      PathPoint var9 = var7 = MoveEffect.c(var6.toString(), var1.getCampId() & 3);
      this.ae = var7.getX();
      this.v = var9.getY();
   }

   public void bd(int var1) {
      if (this.ba != null && this.ba.size() != 0) {
         synchronized (this) {
            Iterator var3;
            Iterator var10000 = var3 = this.ba.iterator();

            while (var10000.hasNext()) {
               BattleDisplay var4;
               if ((var4 = (BattleDisplay)var3.next()).getTime() < BattleDisplay.TILIU) {
                  var10000 = var3;
                  var4.b(var1);
               } else {
                  var10000 = var3;
                  var3.remove();
               }
            }
         }
      }
   }

   public BattleMan cg() {
      return this.ax;
   }

   public boolean k() {
      return this.z >= this.ac.p();
   }

   public static PathPoint ch(int var0, int var1) {
      byte var2 = 0;
      byte var3 = 0;
      if (var1 == 0) {
         var2 = 3;
         var3 = 3;
      } else if (var1 == 5) {
         var2 = 5;
         var3 = 3;
      } else if (var1 == 1) {
         var2 = 3;
         var3 = 4;
      } else if (var1 == 6) {
         var2 = 5;
         var3 = 4;
      } else if (var1 == 2) {
         var2 = 3;
         var3 = 5;
      } else if (var1 == 7) {
         var2 = 5;
         var3 = 5;
      } else if (var1 == 3) {
         var2 = 3;
         var3 = 6;
      } else if (var1 == 8) {
         var2 = 5;
         var3 = 6;
      } else if (var1 == 4) {
         var2 = 3;
         var3 = 7;
      } else if (var1 == 9) {
         var2 = 5;
         var3 = 7;
      }

      return new PathPoint(315 + 60 * var2 - 60 * var3, -325 + 114 * var3 + 24 * var2);
   }

   @Override
   public boolean l(int var1, int var2) {
      return this.ac.h(var1 - this.x, var2 - this.y);
   }

   public boolean n() {
      return this.ay;
   }

   public void ci(BattleDisplay var1) {
      if (var1 != null) {
         synchronized (this) {
            Class11 var10000;
            if (this.ba == null) {
               var10000 = this;
               this.ba = new LinkedList<>();
            } else {
               BattleDisplay var3;
               if (this.ba.size() != 0 && (var3 = this.ba.getLast()) != null) {
                  var1.setTime(Math.min(0L, var3.getTime() - 100L));
               }

               var10000 = this;
            }

            var10000.ba.addLast(var1);
         }
      }
   }

   // $VF: synthetic method
   private void cj(BattleSkillShow var1) {
      if (var1 != null) {
         if (var1.getSkinpath() != 0 && var1.getSkinpath() != 4 && var1.getSkinpath() != 5) {
            int var2;
            for (int var10000 = var2 = this.az.showSkillList.size() - 1; var10000 >= 0; var10000 = --var2) {
               BattleSkillShow var3;
               if ((var3 = this.az.showSkillList.get(var2)).getRound() == var1.getRound() && var3.getSkillid().equals(var1.getSkillid())) {
                  return;
               }
            }

            this.az.showSkillList.add(var1);
         } else {
            this.az.showSkillList.add(var1);
         }
      }
   }

   public boolean ck(int var1) {
      return var1 != 0 && var1 != 2 ? this.z >= this.ac.p() : true;
   }
}
