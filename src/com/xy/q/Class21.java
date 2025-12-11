package com.xy.q;

import com.xy.a.a.Class62;
import com.xy.a.q.Class108;
import com.xy.a.q.Class117;
import com.xy.a.q.Class64;
import com.xy.battle.BattleMan;
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
import java.math.BigDecimal;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;

public class Class21 extends Class25 {
   protected boolean cf;

   @Override
   protected void ao(int var1, MouseEvent var2, RoleData var3) {
      if (this.cf && var1 >= this.ia() - this.abe.length) {
         this.tl(var1 - this.ia() + this.abe.length, true, var3);
      } else {
         Goodstable var4 = var3.getGood(var3.goodPacks[var1]);
         if (this.wd instanceof com.xy.a.a.Class35) {
            if (var2.isShiftDown()) {
               if (var4 != null) {
                  try {
                     JTextField var14;
                     Class11 var15 = (Class11)(var14 = this.wd.afx.getBaseView().ty()).getDocument();
                     int var20 = var14.getCaretPosition();
                     BigDecimal var10003 = var4.getRgid();
                     String var10004 = "[" + var4.getGoodsname() + "]";
                     String var10005 = "'";
                     var15.lx(var20, 2, var10003, var10004, "G", null);
                  } catch (BadLocationException var7) {
                     var7.printStackTrace();
                  }
               }
            } else if (this.wd.afx.getMouseIndex() == com.xy.v.Class3.c) {
               if (var4.getGoodlock() == 1) {
                  String var19 = "讎爭咪嶶勋镅";
                  this.wd.afx.dp("该物品已加锁");
               } else if (GoodType.z(var4.getType())) {
                  String var18 = "讅爋咡斂沵勂镡";
                  this.wd.afx.dp("该物品无法加锁");
               } else {
                  var4.setGoodlock(1);
                  ParamTool.j(var4, 0, this.wd.afx.getClient());
                  this.wd.afx.setMouseIndex(com.xy.v.Class3.k);
                  String var17 = "勋镅扻勛";
                  this.wd.afx.dp("加锁成功");
               }
            } else if (this.wd.afx.getMouseIndex() == com.xy.v.Class3.g) {
               if (var4.getGoodlock() == 0) {
                  String var16 = "讇爉咣杊勂镡";
                  this.wd.afx.dp("该物品未加锁");
               } else {
                  var4.setGoodlock(0);
                  ParamTool.j(var4, 0, this.wd.afx.getClient());
                  this.wd.afx.setMouseIndex(com.xy.v.Class3.k);
                  String var10001 = "覈镅扻勛";
                  this.wd.afx.dp("解锁成功");
               }
            } else {
               com.xy.w.Class14 var13 = this.wd.afx.choseImg;
               if (this.wd.afx.choseImg.l == 1) {
                  Goodstable var6;
                  if ((var6 = var3.getGood(var13.e)) == null) {
                     var13.e();
                     return;
                  }

                  if (var6.getStatus() == 0) {
                     var3.d(var13.e, var1);
                     var13.e();
                     return;
                  }
               } else if (var4 != null) {
                  var13.g(var4);
               }
            }
         } else if (this.wd instanceof com.xy.a.q.Class17) {
            if (var4 != null) {
               this.n(var1);
               com.xy.a.q.Class17 var12;
               (var12 = (com.xy.a.q.Class17)this.wd).hr(var4, false);
            }
         } else if (this.wd instanceof com.xy.a.q.Class12) {
            if (var4 != null) {
               this.n(var1);
               com.xy.a.q.Class12 var11;
               (var11 = (com.xy.a.q.Class12)this.wd).hr(var4, false);
            }
         } else if (this.wd instanceof com.xy.a.i.Class5) {
            if (var4 != null && var4.getType() == 505L) {
               com.xy.a.i.Class5 var10;
               com.xy.a.i.Class5 var10000 = var10 = (com.xy.a.i.Class5)this.wd;
               var10000.ep().gs(1, var4);
               var10000.eo()[1].setText("1");
            }
         } else if (this.wd instanceof Class64) {
            if (var4 != null) {
               Class64 var9;
               (var9 = (Class64)this.wd).ay(var4);
            }
         } else if (this.wd instanceof Class117) {
            if (var4 != null) {
               Class117 var8;
               (var8 = (Class117)this.wd).bb(var4);
            }
         } else {
            if (this.wd instanceof Class108) {
               if (var4 == null) {
                  return;
               }

               Class108 var5;
               (var5 = (Class108)this.wd).hr(var4, false);
            }
         }
      }
   }

   @Override
   protected void l() {
      this.wd.zc().f(46);
   }

   public void rm(boolean var1) {
      this.cf = var1;
   }

   protected void tk(Graphics var1, RoleData var2) {
      int var3 = this.dx();
      int var4 = 0;
      Goodstable[] var5 = var2.getObjectArea().bw();

      int var6;
      for (int var10000 = var6 = 0; var10000 < this.abe.length; var10000 = ++var6) {
         var4 = var6 + var3;
         if (this.lp != null) {
            var1.drawImage(this.lp, var6 % this.ae * this.z, var6 / this.ae * this.cb, this.gz + 2, this.ah + 2, null);
         }

         Goodstable var7;
         if ((var7 = var5[var6]) == null) {
            if (this.abe[var6] != null) {
               this.abe[var6].e();
            }
         } else {
            if (this.abe[var6] == null || var7.getRgid() != this.abe[var6].e) {
               if (this.abe[var6] == null) {
                  this.abe[var6] = new com.xy.w.Class14();
               }

               this.abe[var6].g(var7);
            }

            Goodstable var9;
            if (var4 != this.gv) {
               var9 = var7;
               com.xy.w.Class16.j(var1, this.abe[var6].p, var6 % this.ae * this.z + 1, var6 / this.ae * this.cb + 1, this.gz, this.ah);
            } else {
               com.xy.w.Class16.j(var1, this.abe[var6].p, var6 % this.ae * this.z + 2, var6 / this.ae * this.cb + 2, this.gz, this.ah);
               var9 = var7;
            }

            if (var9.getGoodlock() == 1) {
               var1.drawImage(com.xy.w.Class15.s, var6 % this.ae * this.z + 36, var6 / this.ae * this.cb, 10, 12, null);
            }

            if (this.bi && var4 == this.gw) {
               var1.setColor(Color.red);
               var1.drawRect(var6 % this.ae * this.z + 1, var6 / this.ae * this.cb + 1, this.gz, this.ah);
               var1.drawRect(var6 % this.ae * this.z + 2, var6 / this.ae * this.cb + 2, this.gz - 2, this.ah - 2);
               var1.setColor(Color.white);
            } else if (this.ia == var6) {
               var1.setColor(Color.white);
               var1.drawRect(var6 % this.ae * this.z + 1, var6 / this.ae * this.cb + 1, this.gz, this.ah);
               var1.drawRect(var6 % this.ae * this.z + 2, var6 / this.ae * this.cb + 2, this.gz - 2, this.ah - 2);
               var1.setColor(Color.white);
            }
         }
      }
   }

   public boolean ah() {
      return this.cf;
   }

   public Class21(Class30 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public void tl(int var1, boolean var2, RoleData var3) {
      Goodstable var5;
      if ((var5 = var3.getObjectArea().bw()[var1]) != null && !com.xy.v.Class12.h(var5.getValue())) {
         String var10000 = var5.getValue();
         String var10001 = "晽匁";
         if (var10000.equals("星卡")) {
            com.xy.i.Class0.ff(95, var3.getGameView());
         } else {
            var10000 = var5.getValue();
            var10001 = "晴皜";
            if (var10000.equals("星盘")) {
               com.xy.i.Class0.ff(137, var3.getGameView());
            } else {
               var10000 = var5.getValue();
               var10001 = "佯鬶亄";
               if (var10000.equals("伏魔令")) {
                  com.xy.i.Class0.ff(170, var3.getGameView());
               }
            }
         }
      }
   }

   @Override
   protected void an(Graphics var1, RoleData var2) {
      int var3 = this.dx();
      if (this.cf && var3 >= this.ia() - this.abe.length) {
         this.tk(var1, var2);
      } else {
         boolean var4 = this.wd instanceof com.xy.a.a.Class35 && this.wd.ze().getBattleScene() != null;
         int var5 = 0;
         int var10000 = 0;
         var1.setFont(Class49.ac);
         var1.setColor(Color.white);

         for (int var6 = 0; var10000 < this.abe.length; var10000 = ++var6) {
            var5 = var6 + var3;
            if (this.lp != null) {
               var1.drawImage(this.lp, var6 % this.ae * this.z, var6 / this.ae * this.cb, this.gz + 2, this.ah + 2, null);
            }

            Goodstable var7;
            if ((var7 = var2.getGood(var2.goodPacks[var5])) == null) {
               if (this.abe[var6] != null) {
                  this.abe[var6].e();
               }
            } else {
               if (this.abe[var6] == null || var7.getRgid() != this.abe[var6].e) {
                  if (this.abe[var6] == null) {
                     this.abe[var6] = new com.xy.w.Class14();
                  }

                  this.abe[var6].g(var7);
               }

               Class21 var9;
               if (var5 != this.gv) {
                  var9 = this;
                  com.xy.w.Class16.j(var1, this.abe[var6].p, var6 % this.ae * this.z + 1, var6 / this.ae * this.cb + 1, this.gz, this.ah);
               } else {
                  com.xy.w.Class16.j(var1, this.abe[var6].p, var6 % this.ae * this.z + 2, var6 / this.ae * this.cb + 2, this.gz, this.ah);
                  var9 = this;
               }

               if (var9.abe[var6].c != null) {
                  var1.drawString(this.abe[var6].c, var6 % this.ae * this.z + 4, var6 / this.ae * this.cb + 14);
               }

               if (var7.getGoodlock() == 1) {
                  var1.drawImage(com.xy.w.Class15.s, var6 % this.ae * this.z + 36, var6 / this.ae * this.cb, 10, 12, null);
               }

               boolean var10;
               if (this.bi && var5 == this.gw) {
                  var10 = var4;
                  var1.setColor(Color.red);
                  var1.drawRect(var6 % this.ae * this.z + 1, var6 / this.ae * this.cb + 1, this.gz, this.ah);
                  var1.drawRect(var6 % this.ae * this.z + 2, var6 / this.ae * this.cb + 2, this.gz - 2, this.ah - 2);
                  var1.setColor(Color.white);
               } else {
                  if (this.ia == var6) {
                     var1.setColor(Color.white);
                     var1.drawRect(var6 % this.ae * this.z + 1, var6 / this.ae * this.cb + 1, this.gz, this.ah);
                     var1.drawRect(var6 % this.ae * this.z + 2, var6 / this.ae * this.cb + 2, this.gz - 2, this.ah - 2);
                     var1.setColor(Color.white);
                  }

                  var10 = var4;
               }

               if (var10 && var7.getType() != 0L && var7.getType() != 1L) {
                  var1.setColor(Class49.ce);
                  var1.fillRect(var6 % this.ae * this.z + 1, var6 / this.ae * this.cb + 1, this.gz, this.ah);
                  var1.setColor(Color.white);
               }
            }
         }
      }
   }

   @Override
   protected void ap(int var1, MouseEvent var2, RoleData var3) {
      if (this.cf && var1 >= this.ia() - this.abe.length) {
         this.tl(var1 - this.ia() + this.abe.length, false, var3);
      } else {
         Goodstable var5 = var3.getGood(var3.goodPacks[var1]);
         if (this.wd instanceof com.xy.a.a.Class35) {
            if (var5 != null) {
               if (this.wd.afx.getMouseIndex() != com.xy.v.Class3.c && this.wd.afx.getMouseIndex() != com.xy.v.Class3.g) {
                  if (this.wd.afx.getBattleScene() == null) {
                     try {
                        HandleGood.e(var5, var2.isShiftDown(), var3);
                     } catch (Exception var8) {
                        var8.printStackTrace();
                     }
                  } else if (var5.getType() == 0L || var5.getType() == 1L) {
                     com.xy.d.Class11 var18;
                     if ((var18 = this.wd.afx.getBattleControl().getHandleUnit()) != null) {
                        Class21 var20;
                        label129: {
                           if (!this.wd.za().gameBattle) {
                              BattleMan var19 = var18.cg();
                              String var10001 = "逵徸";
                              if (var19.d("遗忘")) {
                                 var20 = this;
                                 String var10002 = "弸刉狝恅斋沑伔畬茄咅";
                                 this.wd.afx.dp("当前状态无法使用药品");
                                 break label129;
                              }
                           }

                           var20 = this;
                           this.wd.afx.getBattleControl().setMouseIndex(com.xy.v.Class3.e, var5);
                           this.wd.afx.getBattleControl().d();
                        }

                        var20.wd.afx.getFormManagement().f(46);
                        this.wd.afx.getFormManagement().f(2);
                     }
                  }
               }
            }
         } else {
            if (this.wd instanceof Class62) {
               if (var5 == null) {
                  return;
               }

               if (this.wd.afx.getMouseIndex() == com.xy.v.Class3.c || this.wd.afx.getMouseIndex() == com.xy.v.Class3.g) {
                  return;
               }

               if (this.wd.afx.getBattleScene() == null) {
                  try {
                     RoleSummoning var6;
                     if ((var6 = this.wd.yx().getChosePet()) == null) {
                        return;
                     }

                     HandlePet.f(var6, var5, var2.isShiftDown(), var3);
                     return;
                  } catch (Exception var9) {
                     var9.printStackTrace();
                     return;
                  }
               }
            } else if (this.wd instanceof com.xy.a.q.Class34) {
               if (var5 == null) {
                  return;
               }

               long var10;
               if ((var10 = var5.getType()) >= 701L && var10 <= 711L || var10 == 713L || var10 == 714L || var10 == 722L || var10 == 723L) {
                  ((com.xy.a.q.Class34)this.wd).ep().gs(1, var5);
                  ((com.xy.a.q.Class34)this.wd).h();
                  return;
               }
            } else {
               if (this.wd instanceof com.xy.a.q.Class16) {
                  if (var5 == null) {
                     return;
                  }

                  com.xy.a.q.Class16 var17;
                  (var17 = (com.xy.a.q.Class16)this.wd).bb(var5);
                  return;
               }

               if (this.wd instanceof com.xy.a.q.Class17) {
                  if (var5 == null) {
                     return;
                  }

                  this.n(var1);
                  com.xy.a.q.Class17 var16;
                  (var16 = (com.xy.a.q.Class17)this.wd).hr(var5, true);
                  return;
               }

               if (this.wd instanceof com.xy.a.q.Class12) {
                  if (var5 == null) {
                     return;
                  }

                  this.n(var1);
                  com.xy.a.q.Class12 var15;
                  (var15 = (com.xy.a.q.Class12)this.wd).hr(var5, true);
                  return;
               }

               if (this.wd instanceof Class64) {
                  if (var5 == null) {
                     return;
                  }

                  Class64 var14;
                  (var14 = (Class64)this.wd).ay(var5);
                  return;
               }

               if (this.wd instanceof com.xy.a.i.Class5) {
                  if (var5 != null && var5.getType() == 505L) {
                     com.xy.a.i.Class5 var13;
                     com.xy.a.i.Class5 var10000 = var13 = (com.xy.a.i.Class5)this.wd;
                     var10000.ep().gs(1, var5);
                     var10000.eo()[1].setText(String.valueOf(var5.getUsetime()));
                     return;
                  }

                  return;
               }

               if (this.wd instanceof Class117) {
                  if (var5 == null) {
                     return;
                  }

                  Class117 var12;
                  (var12 = (Class117)this.wd).bb(var5);
                  return;
               }

               if (this.wd instanceof Class108) {
                  if (var5 == null) {
                     return;
                  }

                  Class108 var11;
                  (var11 = (Class108)this.wd).hr(var5, true);
               }
            }
         }
      }
   }

   @Override
   protected void am(RoleData var1) {
      int var2 = this.dx();
      if (this.cf && var2 >= this.ia() - this.abe.length) {
         Goodstable var4;
         if ((var4 = var1.getObjectArea().bw()[this.ia + var2 - this.ia() + this.abe.length]) != null) {
            ((com.xy.a.Class48)this.wd.zc().j(46)).hr(var4, false);
         }
      } else {
         Goodstable var3;
         if ((var3 = var1.getGood(var1.goodPacks[this.ia + var2])) != null) {
            ((com.xy.a.Class48)this.wd.zc().j(46)).hr(var3, false);
         }
      }
   }
}
