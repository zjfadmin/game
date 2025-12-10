package com.xy;

import com.xy.battle.BattleControl;
import com.xy.formula.GoodType;
import com.xy.game.HandleGood;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.readbean.Skill;
import com.xy.text.GameView;
import com.xy.text.ScreenData;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.ImageObserver;
import java.math.BigDecimal;

public class Class90 extends Class345 {
   private static Image bx = Class511.a("sc/c/45");
   private <undefinedtype>[] aqj;
   private int m;

   public void setVisible(boolean var1) {
      if (var1) {
         this.cc();
      }

      super.setVisible(var1);
   }

   public Class90(int var1, GameView var2) {
      int var10001 = 104 & 31;
      int var10003 = 5 >> 3;
      int var10005 = -4 >> 2;
      super(-4 >> 2, -4 >> 2, Class345.aei, var2);
      this.m = var10005;
      this.va(var10003, 3 ^ 3, 3 ^ 3, 3 ^ 3, Class345.aei);
      <undefinedtype>[] var3 = new <undefinedtype>[var10001];
      boolean var4 = true;
      this.aqj = var3;

      for(int var10000 = var1 = 3 >> 2; var10000 < this.aqj.length; var10000 = var1) {
         this.aqj[var1] = new MouseListener(var1) {
            private Image xs;
            private String nc;
            private int bn;
            private Long aai;
            private String rf;

            public void mouseEntered(MouseEvent var1) {
               Class90.this.m = this.bn;
               long var2;
               RoleData var6;
               if ((var2 = (var6 = Class90.this.vd()).getShortCutSkill(this.bn)) > 2147483647L) {
                  Goodstable var7;
                  if ((var7 = var6.getGood(new BigDecimal(var2 - 2147483647L))) != null) {
                     ((Class270)Class90.this.ve().e(110 & 63)).oj(var7, (boolean)(3 & 4));
                  }
               } else {
                  Skill var4;
                  if ((var4 = var6.getShortCutSkillById(var2)) != null) {
                     int var5 = Class224.i(var6.getLoginResult().getGrade());
                     ((Class270)Class90.this.ve().e(111 & 62)).sf(var4, (double)var5, Class224.d(var6.getLoginResult().getGrade()), Class224.g(var6.getLoginResult().getGrade()));
                  }
               }
            }

            public void mouseClicked(MouseEvent var1) {
            }

            public void mouseReleased(MouseEvent var1) {
            }

            public void qp(long var1, Goodstable var3) {
               this.aai = var1;
               this.xs = Class222.i(var3.getSkin());
               this.rf = GoodType.ag(var3.getType()) ? String.valueOf(var3.getUsetime()) : null;
            }

            public void mouseExited(MouseEvent var1) {
               Class90.this.m = -4 >> 2;
               Class90.this.ve().n(110 & 63);
            }

            public void mousePressed(MouseEvent var1) {
               RoleData var2 = Class90.this.vd();
               Class467 var3;
               if ((var3 = Class90.this.aej.choseImg).o != 5 >> 1 && var3.o != (77 & 62)) {
                  if (var3.o != (2 ^ 3) && var3.o != (91 & 47)) {
                     int var10001;
                     long var8;
                     if ((var8 = var2.getShortCutSkill(this.bn)) > 2147483647L) {
                        Goodstable var6;
                        if ((var6 = var2.getGood(new BigDecimal(var8 - 2147483647L))) == null) {
                           return;
                        }

                        if (var1.getButton() == (2 ^ 3)) {
                           var10001 = 59 & 79;
                           var2.ar(var8, -4 >> 2);
                           var2.bp();
                           var3.j((byte)var10001, var6, var6.getUsetime());
                           return;
                        }

                        if (var1.getButton() == --3) {
                           Class90.this.aho(this);
                           return;
                        }
                     } else {
                        Skill var9;
                        if ((var9 = var2.getShortCutSkillById(var8)) == null) {
                           return;
                        }

                        if (var1.getButton() == 5 >> 2) {
                           var10001 = 29 & 110;
                           var2.ar(var8, -4 >> 2);
                           var2.bp();
                           var3.f((byte)var10001, var9, 2 & 5);
                           return;
                        }

                        if (var1.getButton() == --3) {
                           Class90.this.aho(this);
                        }
                     }

                  } else {
                     Goodstable var7;
                     if ((var7 = var2.getGood(var3.i)) != null) {
                        if (var7.getType() != 0L && var7.getType() != 1L) {
                           Class90.this.ux().f("该类物品无法放入快捷栏");
                        } else {
                           Long var5;
                           if ((var5 = var2.getShortCutGoodByIndex(var3.i)) != null) {
                              var2.ar(var5, this.bn);
                              var2.bp();
                              var3.g();
                           }

                        }
                     }
                  }
               } else {
                  Long var4;
                  if ((var4 = var2.getShortCutSkillByIndex(var3.i.intValue())) != null) {
                     var2.ar(var4, this.bn);
                     var2.bp();
                     var3.g();
                  }

               }
            }

            public void qq(long var1, Skill var3) {
               this.aai = var1;
               <undefinedtype> var10000;
               int var4;
               if ((var4 = Integer.parseInt(var3.getSkillid())) > (16112 & 28655) && var4 <= (30670 & 15097)) {
                  var10000 = this;
                  this.xs = Class222.s(var4);
               } else {
                  var10000 = this;
                  this.xs = Class222.g(var3.getSkillid());
               }

               var10000.rf = null;
            }

            public void q() {
               this.xs = this.aai = null;
               this.rf = null;
            }

            public {
               this.bn = var2;
               this.nc = "F" + (var2 + (3 >> 1));
               this.addMouseListener(this);
            }
         };
         this.aqj[var1].setBounds(var1 * (126 & 41), 5 >> 3, 63 & 107, 63 & 107);
         this.add(this.aqj[var1++]);
      }

   }

   public void aho(Object var1) {
      if (this.aej.getBattleScene() == null) {
         RoleData var8;
         long var9;
         if ((var9 = (var8 = this.vd()).getShortCutSkill(var1.bn)) > 2147483647L) {
            Goodstable var5;
            if ((var5 = var8.getGood(new BigDecimal(var9 - 2147483647L))) != null) {
               try {
                  HandleGood.p(var5, (boolean)(3 & 4), var8);
               } catch (Exception var7) {
                  var7.printStackTrace();
               }
            }
         }
      } else {
         Class514 var2;
         if ((var2 = this.aej.getBattleControl().getHandleUnit()) != null) {
            RoleData var3;
            long var4;
            if ((var4 = (var3 = this.vd()).getShortCutSkill(var1.bn)) > 2147483647L) {
               Goodstable var10;
               if ((var10 = var3.getGood(new BigDecimal(var4 - 2147483647L))) != null) {
                  if (!var2.bt().b("遗忘")) {
                     this.aej.getBattleControl().setMouseIndex(Class320.j, var10);
                     this.aej.getBattleControl().f();
                  } else {
                     this.aej.fw("当前状态无法使用药品");
                  }
               }
            } else if (var2.bt().getType() == 0) {
               Skill var6;
               if ((var6 = var3.getShortCutSkillById(var4)) != null) {
                  BattleControl var10001 = this.aej.getBattleControl();
                  var10001.setMouseIndex(Class320.f, var6);
                  var10001.f();
                  this.aej.getFormManagement().n(51 & 110);
               }
            }
         }
      }
   }

   public void y(int var1) {
      this.aho(this.aqj[var1]);
   }

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      RoleData var2;
      if ((var2 = this.vd()) != null && this.aej.isDraw) {
         this.cm(var1, var2);
      }
   }

   public void cc() {
      ScreenData var10001 = this.aej.screenData;
      int var1 = var10001.getScreen_x() - (15866 & 17223);
      int var2 = var10001.getScreen_y() - (91 & 119);
      this.setBounds(var1, var2, 27487 & 5603, 43 & 127);
   }


   private void cm(Graphics var1, RoleData var2) {
      int var10000 = 5 >> 3;
      var1.setColor(Color.white);
      var1.setFont(Class681.bo);

      for(int var4 = var10000; var10000 < this.aqj.length; var10000 = var4) {
         <undefinedtype> var3 = this.aqj[var4];
         var1.drawImage(bx, var3.getX(), 5 >> 3, 59 & 111, 59 & 111, (ImageObserver)null);
         long var5 = var2.getShortCutSkill(var3.bn);
         Graphics var9;
         if (var5 == 0L) {
            var3.q();
            var9 = var1;
         } else {
            label40: {
               if (var3.aai == null || var3.aai != var5) {
                  if (var5 > 2147483647L) {
                     Goodstable var7;
                     if ((var7 = var2.getGood(new BigDecimal(var5 - 2147483647L))) != null) {
                        var9 = var1;
                        var3.qp(var5, var7);
                        break label40;
                     }
                  } else {
                     Skill var8;
                     if ((var8 = var2.getShortCutSkillById(var5)) != null) {
                        var3.qq(var5, var8);
                     }
                  }
               }

               var9 = var1;
            }

            var9.drawImage(var3.xs, var3.getX() + --4, --4, 119 & 44, 119 & 44, (ImageObserver)null);
            var9 = var1;
         }

         String var10001 = var3.nc;
         int var10002 = var3.getX();
         int var10003 = 62 & 71;
         ++var4;
         var9.drawString(var10001, var10002 + var10003, 111 & 29);
      }

   }
}
