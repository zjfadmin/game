package com.xy;

import com.xy.entity.RoleSummoning;
import com.xy.formula.GoodType;
import com.xy.game.HandleGood;
import com.xy.game.HandlePet;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.socket.ParamTool;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.image.ImageObserver;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;

public class Class585 extends Class397 {
   protected boolean op;

   public Class585(Class345 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public boolean t() {
      return this.op;
   }

   protected void cm(Graphics var1, RoleData var2) {
      int var6 = this.ot();
      if (this.op && var6 >= this.tp() - this.asw.length) {
         this.xx(var1, var2);
      } else {
         int var4 = this.lo instanceof Class433 && this.lo.ux().getBattleScene() != null ? 4 ^ 5 : 0;
         int var5 = 3 >> 2;
         int var10000 = 5 >> 3;
         var1.setFont(Class681.ce);
         var1.setColor(Color.white);

         for(int var3 = var10000; var10000 < this.asw.length; var10000 = var3) {
            var5 = var3 + var6;
            if (this.ama != null) {
               var1.drawImage(this.ama, var3 % this.cy * this.dp, var3 / this.cy * this.gc, this.bn + --2, this.m + (1 ^ 3), (ImageObserver)null);
            }

            Goodstable var7;
            if ((var7 = var2.getGood(var2.goodPacks[var5])) == null) {
               if (this.asw[var3] != null) {
                  this.asw[var3].g();
               }
            } else {
               if (this.asw[var3] == null || var7.getRgid() != this.asw[var3].i) {
                  if (this.asw[var3] == null) {
                     this.asw[var3] = new Class467();
                  }

                  this.asw[var3].d(var7);
               }

               Class585 var8;
               if (var5 != this.gv) {
                  var8 = this;
                  Class511.d(var1, this.asw[var3].p, var3 % this.cy * this.dp + (2 ^ 3), var3 / this.cy * this.gc + (3 >> 1), this.bn, this.m);
               } else {
                  Class511.d(var1, this.asw[var3].p, var3 % this.cy * this.dp + (1 ^ 3), var3 / this.cy * this.gc + (1 ^ 3), this.bn, this.m);
                  var8 = this;
               }

               if (var8.asw[var3].k != null) {
                  var1.drawString(this.asw[var3].k, var3 % this.cy * this.dp + --4, var3 / this.cy * this.gc + (110 & 31));
               }

               if (this.asw[var3].a != null) {
                  var1.drawString(this.asw[var3].a, var3 % this.cy * this.dp + --4, var3 / this.cy * this.gc + this.m - (5 >> 1));
               }

               if (var7.getGoodlock() == --1) {
                  var1.drawImage(Class222.u, var3 % this.cy * this.dp + (111 & 52), var3 / this.cy * this.gc, 94 & 43, 93 & 46, (ImageObserver)null);
               }

               if (this.aeg && var5 == this.fk) {
                  var10000 = var4;
                  var1.setColor(Color.red);
                  var1.drawRect(var3 % this.cy * this.dp + (3 >> 1), var3 / this.cy * this.gc + (3 >> 1), this.bn, this.m);
                  var1.drawRect(var3 % this.cy * this.dp + --2, var3 / this.cy * this.gc + (5 >> 1), this.bn - (1 ^ 3), this.m - (5 >> 1));
                  var1.setColor(Color.white);
               } else {
                  if (this.j == var3) {
                     var1.setColor(Color.white);
                     var1.drawRect(var3 % this.cy * this.dp + (2 ^ 3), var3 / this.cy * this.gc + (5 >> 2), this.bn, this.m);
                     var1.drawRect(var3 % this.cy * this.dp + (1 ^ 3), var3 / this.cy * this.gc + (1 ^ 3), this.bn - (1 ^ 3), this.m - (5 >> 1));
                     var1.setColor(Color.white);
                  }

                  var10000 = var4;
               }

               if (var10000 != 0 && var7.getType() != 0L && var7.getType() != 1L) {
                  var1.setColor(Class681.l);
                  var1.fillRect(var3 % this.cy * this.dp + --1, var3 / this.cy * this.gc + (3 & 5), this.bn, this.m);
                  var1.setColor(Color.white);
               }
            }

            ++var3;
         }

      }
   }

   public void gb(boolean var1) {
      this.op = var1;
   }

   protected void q() {
      this.lo.ve().n(127 & 46);
   }

   protected void cn(int var1, MouseEvent var2, RoleData var3) {
      if (this.op && var1 >= this.tp() - this.asw.length) {
         this.abm(var1 - this.tp() + this.asw.length, (boolean)(3 & 4), var3);
      } else {
         Goodstable var4 = var3.getGood(var3.goodPacks[var1]);
         if (this.lo instanceof Class433) {
            if (var4 != null) {
               if (this.lo.aej.getMouseIndex() != Class320.g && this.lo.aej.getMouseIndex() != Class320.m) {
                  if (this.lo.aej.getBattleScene() == null) {
                     try {
                        HandleGood.p(var4, var2.isShiftDown(), var3);
                     } catch (Exception var7) {
                        var7.printStackTrace();
                     }
                  } else if (var4.getType() == 0L || var4.getType() == 1L) {
                     Class514 var10;
                     if ((var10 = this.lo.aej.getBattleControl().getHandleUnit()) != null) {
                        Class585 var11;
                        if (!this.lo.uw().gameBattle && var10.bt().b("遗忘")) {
                           var11 = this;
                           this.lo.aej.fw("当前状态无法使用药品");
                        } else {
                           var11 = this;
                           this.lo.aej.getBattleControl().setMouseIndex(Class320.j, var4);
                           this.lo.aej.getBattleControl().f();
                        }

                        var11.lo.aej.getFormManagement().n(47 & 126);
                        this.lo.aej.getFormManagement().n(--2);
                     }
                  }
               }
            }
         } else {
            if (this.lo instanceof Class47) {
               if (var4 == null) {
                  return;
               }

               if (this.lo.aej.getMouseIndex() == Class320.g || this.lo.aej.getMouseIndex() == Class320.m) {
                  return;
               }

               if (this.lo.aej.getBattleScene() == null) {
                  try {
                     RoleSummoning var9;
                     if ((var9 = this.lo.vd().getChosePet()) == null) {
                        return;
                     }

                     HandlePet.a(var9, var4, var2.isShiftDown(), var3);
                     return;
                  } catch (Exception var8) {
                     var8.printStackTrace();
                     return;
                  }
               }
            } else if (this.lo instanceof Class429) {
               if (var4 == null) {
                  return;
               }

               long var5;
               if ((var5 = var4.getType()) >= 701L && var5 <= 711L || var5 == 713L || var5 == 714L || var5 == 722L || var5 == 723L) {
                  ((Class429)this.lo).u().c(--1, var4);
                  ((Class429)this.lo).o();
                  return;
               }
            } else {
               if (this.lo instanceof Class108) {
                  if (var4 == null) {
                     return;
                  }

                  ((Class108)this.lo).ax(var4);
                  return;
               }

               if (this.lo instanceof Class381) {
                  if (var4 == null) {
                     return;
                  }

                  this.y(var1);
                  ((Class381)this.lo).oj(var4, (boolean)(5 >> 2));
                  return;
               }

               if (this.lo instanceof Class242) {
                  if (var4 == null) {
                     return;
                  }

                  this.y(var1);
                  ((Class242)this.lo).oj(var4, (boolean)(--1));
                  return;
               }

               if (this.lo instanceof Class250) {
                  if (var4 == null) {
                     return;
                  }

                  ((Class250)this.lo).av(var4);
                  return;
               }

               if (this.lo instanceof Class407) {
                  if (var4 != null && var4.getType() == 505L) {
                     Class407 var10000 = (Class407)this.lo;
                     var10000.u().c(4 ^ 5, var4);
                     var10000.ajz()[3 >> 1].setText(String.valueOf(var4.getUsetime()));
                     return;
                  }

                  return;
               }

               if (this.lo instanceof Class583) {
                  if (var4 == null) {
                     return;
                  }

                  ((Class583)this.lo).ax(var4);
                  return;
               }

               if (this.lo instanceof Class674) {
                  if (var4 == null) {
                     return;
                  }

                  ((Class674)this.lo).oj(var4, (boolean)(--1));
               }
            }

         }
      }
   }

   protected void xx(Graphics var1, RoleData var2) {
      int var7 = this.ot();
      int var5 = 2 & 5;
      Goodstable[] var4 = var2.getObjectArea().ai();

      int var3;
      for(int var8 = var3 = 3 >> 2; var8 < this.asw.length; var8 = var3) {
         var5 = var3 + var7;
         if (this.ama != null) {
            var1.drawImage(this.ama, var3 % this.cy * this.dp, var3 / this.cy * this.gc, this.bn + (5 >> 1), this.m + (1 ^ 3), (ImageObserver)null);
         }

         Goodstable var6;
         if ((var6 = var4[var3]) == null) {
            if (this.asw[var3] != null) {
               this.asw[var3].g();
            }
         } else {
            if (this.asw[var3] == null || var6.getRgid() != this.asw[var3].i) {
               if (this.asw[var3] == null) {
                  this.asw[var3] = new Class467();
               }

               this.asw[var3].d(var6);
            }

            Goodstable var9;
            if (var5 != this.gv) {
               var9 = var6;
               Class511.d(var1, this.asw[var3].p, var3 % this.cy * this.dp + --1, var3 / this.cy * this.gc + (4 ^ 5), this.bn, this.m);
            } else {
               Class511.d(var1, this.asw[var3].p, var3 % this.cy * this.dp + (5 >> 1), var3 / this.cy * this.gc + (5 >> 1), this.bn, this.m);
               var9 = var6;
            }

            if (var9.getGoodlock() == 3 >> 1) {
               var1.drawImage(Class222.u, var3 % this.cy * this.dp + (108 & 55), var3 / this.cy * this.gc, 91 & 46, 93 & 46, (ImageObserver)null);
            }

            if (this.aeg && var5 == this.fk) {
               var1.setColor(Color.red);
               var1.drawRect(var3 % this.cy * this.dp + (4 ^ 5), var3 / this.cy * this.gc + (2 ^ 3), this.bn, this.m);
               var1.drawRect(var3 % this.cy * this.dp + (1 ^ 3), var3 / this.cy * this.gc + --2, this.bn - (1 ^ 3), this.m - (5 >> 1));
               var1.setColor(Color.white);
            } else if (this.j == var3) {
               var1.setColor(Color.white);
               var1.drawRect(var3 % this.cy * this.dp + (3 & 5), var3 / this.cy * this.gc + (3 & 5), this.bn, this.m);
               var1.drawRect(var3 % this.cy * this.dp + (5 >> 1), var3 / this.cy * this.gc + (1 ^ 3), this.bn - --2, this.m - --2);
               var1.setColor(Color.white);
            }
         }

         ++var3;
      }

   }

   public void abm(int var1, boolean var2, RoleData var3) {
      Goodstable var4;
      if ((var4 = var3.getObjectArea().ai()[var1]) != null && !Class394.o(var4.getValue())) {
         if (var4.getValue().equals("星卡")) {
            Class658.cy(127 & 95, var3.getGameView());
         } else if (var4.getValue().equals("星盘")) {
            Class658.cy(20697 & 12207, var3.getGameView());
         } else {
            if (var4.getValue().equals("伏魔令")) {
               Class658.cy(19371 & 13566, var3.getGameView());
            }

         }
      }
   }

   protected void cl(RoleData var1) {
      int var2 = this.ot();
      if (this.op && var2 >= this.tp() - this.asw.length) {
         Goodstable var4;
         if ((var4 = var1.getObjectArea().ai()[this.j + var2 - this.tp() + this.asw.length]) != null) {
            ((Class270)this.lo.ve().e(62 & 111)).oj(var4, (boolean)(3 ^ 3));
         }
      } else {
         Goodstable var3;
         if ((var3 = var1.getGood(var1.goodPacks[this.j + var2])) != null) {
            ((Class270)this.lo.ve().e(111 & 62)).oj(var3, (boolean)(3 & 4));
         }
      }
   }

   protected void cj(int var1, MouseEvent var2, RoleData var3) {
      if (this.op && var1 >= this.tp() - this.asw.length) {
         this.abm(var1 - this.tp() + this.asw.length, (boolean)(5 >> 2), var3);
      } else {
         Goodstable var4 = var3.getGood(var3.goodPacks[var1]);
         if (this.lo instanceof Class433) {
            if (var2.isShiftDown()) {
               if (var4 != null) {
                  try {
                     JTextField var8;
                     ((Class175)(var8 = this.lo.aej.getBaseView().jj()).getDocument()).arf(var8.getCaretPosition(), 5 >> 1, var4.getRgid(), "[" + var4.getGoodsname() + "]", "G", (AttributeSet)null);
                  } catch (BadLocationException var6) {
                     var6.printStackTrace();
                  }
               }
            } else if (this.lo.aej.getMouseIndex() == Class320.g) {
               if (var4.getGoodlock() == (4 ^ 5)) {
                  this.lo.aej.fw("该物品已加锁");
               } else if (GoodType.ag(var4.getType())) {
                  this.lo.aej.fw("该物品无法加锁");
               } else {
                  int var10001 = 3 >> 2;
                  var4.setGoodlock(3 >> 1);
                  ParamTool.g(var4, var10001, this.lo.aej.getClient());
                  this.lo.aej.setMouseIndex(Class320.l);
                  this.lo.aej.fw("加锁成功");
               }
            } else if (this.lo.aej.getMouseIndex() == Class320.m) {
               if (var4.getGoodlock() == 0) {
                  this.lo.aej.fw("该物品未加锁");
               } else {
                  int var10003 = 3 & 4;
                  var4.setGoodlock(3 & 4);
                  ParamTool.g(var4, var10003, this.lo.aej.getClient());
                  this.lo.aej.setMouseIndex(Class320.l);
                  this.lo.aej.fw("解锁成功");
               }
            } else {
               Class467 var5;
               if ((var5 = this.lo.aej.choseImg).o == (3 & 5)) {
                  Goodstable var7;
                  if ((var7 = var3.getGood(var5.i)) == null) {
                     var5.g();
                     return;
                  }

                  if (var7.getStatus() == 0) {
                     var3.bl(var5.i, var1);
                     var5.g();
                     return;
                  }
               } else if (var4 != null) {
                  var5.d(var4);
               }

            }
         } else if (this.lo instanceof Class381) {
            if (var4 != null) {
               this.y(var1);
               ((Class381)this.lo).oj(var4, (boolean)(5 >> 3));
            }
         } else if (this.lo instanceof Class242) {
            if (var4 != null) {
               this.y(var1);
               ((Class242)this.lo).oj(var4, (boolean)(5 >> 3));
            }
         } else if (this.lo instanceof Class407) {
            if (var4 != null && var4.getType() == 505L) {
               Class407 var10000 = (Class407)this.lo;
               var10000.u().c(--1, var4);
               var10000.ajz()[3 >> 1].setText("1");
            }
         } else if (this.lo instanceof Class250) {
            if (var4 != null) {
               ((Class250)this.lo).av(var4);
            }
         } else if (this.lo instanceof Class583) {
            if (var4 != null) {
               ((Class583)this.lo).ax(var4);
            }
         } else {
            if (this.lo instanceof Class674) {
               if (var4 == null) {
                  return;
               }

               ((Class674)this.lo).oj(var4, (boolean)(3 ^ 3));
            }

         }
      }
   }
}
