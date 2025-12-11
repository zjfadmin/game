package com.xy.q;

import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.socket.ParamTool;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;

public class Class58 extends Class25 {
   @Override
   protected void ao(int var1, MouseEvent var2, RoleData var3) {
      Goodstable var4 = var3.getStarCardGood(var1);
      if (this.wd instanceof com.xy.a.a.Class19) {
         if (var4 != null) {
            if (var2.isShiftDown()) {
               try {
                  JTextField var5;
                  Class11 var10000 = (Class11)(var5 = this.wd.afx.getBaseView().ty()).getDocument();
                  int var11 = var5.getCaretPosition();
                  BigDecimal var10003 = var4.getRgid();
                  String var10004 = "[" + var4.getGoodsname() + "]";
                  String var10005 = "S";
                  var10000.lx(var11, 2, var10003, var10004, "G", null);
               } catch (BadLocationException var6) {
                  var6.printStackTrace();
               }
            } else if (this.wd.afx.getMouseIndex() == com.xy.v.Class3.c) {
               if (var4.getGoodlock() == 1) {
                  String var10 = "诐爾哴嶥劕镖";
                  this.wd.afx.dp("该物品已加锁");
               } else if (GoodType.z(var4.getType())) {
                  String var9 = "诱爔哕斝況勝锕";
                  this.wd.afx.dp("该物品无法加锁");
               } else {
                  var4.setGoodlock(1);
                  ParamTool.j(var4, 0, this.wd.afx.getClient());
                  this.wd.afx.setMouseIndex(com.xy.v.Class3.k);
                  String var8 = "劕镖戥勈";
                  this.wd.afx.dp("加锁成功");
               }
            } else if (this.wd.afx.getMouseIndex() == com.xy.v.Class3.g) {
               if (var4.getGoodlock() == 0) {
                  String var7 = "讘牽咼朾勝锕";
                  this.wd.afx.dp("该物品未加锁");
               } else {
                  var4.setGoodlock(0);
                  ParamTool.j(var4, 0, this.wd.afx.getClient());
                  this.wd.afx.setMouseIndex(com.xy.v.Class3.k);
                  String var10001 = "觖镖戥勈";
                  this.wd.afx.dp("解锁成功");
               }
            } else {
               ((com.xy.a.a.Class19)this.wd).bb(var4);
            }
         }
      } else if (this.wd instanceof com.xy.a.a.Class25) {
         if (var4 != null) {
            ((com.xy.a.a.Class25)this.wd).i(var4.getRgid());
         }
      } else {
         if (this.wd instanceof com.xy.a.a.Class43) {
            if (var4 == null) {
               return;
            }

            ((com.xy.a.a.Class43)this.wd).aeh(1, null, var4);
         }
      }
   }

   public Class58(Class30 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   @Override
   protected void am(RoleData var1) {
      Goodstable var2;
      if ((var2 = var1.getStarCardGood(this.ia + this.dx())) != null) {
         ((com.xy.a.Class48)this.wd.zc().j(46)).hr(var2, false);
      }
   }

   @Override
   protected void ap(int var1, MouseEvent var2, RoleData var3) {
      Goodstable var4;
      if ((var4 = var3.getStarCardGood(var1)) != null) {
         if (this.wd instanceof com.xy.a.a.Class19) {
            ((com.xy.a.a.Class19)this.wd).bb(var4);
         } else if (this.wd instanceof com.xy.a.a.Class25) {
            ((com.xy.a.a.Class25)this.wd).i(var4.getRgid());
         } else {
            if (this.wd instanceof com.xy.a.a.Class43) {
               ((com.xy.a.a.Class43)this.wd).aeh(1, null, var4);
            }
         }
      }
   }

   @Override
   protected void an(Graphics var1, RoleData var2) {
      List var3 = null;
      if (this.wd instanceof com.xy.a.a.Class25) {
         var3 = ((com.xy.a.a.Class25)this.wd).rs();
      }

      int var4;
      for (int var10000 = var4 = 0; var10000 < this.abe.length; var10000 = ++var4) {
         if (this.lp != null) {
            var1.drawImage(this.lp, var4 % this.ae * this.z, var4 / this.ae * this.cb, this.gz + 2, this.ah + 2, null);
         }

         Goodstable var5;
         if ((var5 = var2.getStarCardGood(var4)) == null) {
            if (this.abe[var4] != null) {
               this.abe[var4].e();
            }
         } else {
            if (this.abe[var4] == null || var5.getRgid() != this.abe[var4].e) {
               if (this.abe[var4] == null) {
                  this.abe[var4] = new com.xy.w.Class14();
               }

               this.abe[var4].g(var5);
            }

            List var6;
            if (var4 != this.gv) {
               var6 = var3;
               com.xy.w.Class16.j(var1, this.abe[var4].p, var4 % this.ae * this.z + 1, var4 / this.ae * this.cb + 1, this.gz, this.ah);
            } else {
               com.xy.w.Class16.j(var1, this.abe[var4].p, var4 % this.ae * this.z + 2, var4 / this.ae * this.cb + 2, this.gz, this.ah);
               var6 = var3;
            }

            Goodstable var7;
            label48: {
               if (var6 != null) {
                  if (var3.contains(var5.getRgid())) {
                     var7 = var5;
                     var1.drawImage(com.xy.w.Class15.c, var4 % this.ae * this.z, var4 / this.ae * this.cb, null);
                     break label48;
                  }
               } else if (var5.getStatus() == 1) {
                  var1.drawImage(com.xy.w.Class15.c, var4 % this.ae * this.z, var4 / this.ae * this.cb, null);
               }

               var7 = var5;
            }

            if (var7.getGoodlock() == 1) {
               var1.drawImage(com.xy.w.Class15.s, var4 % this.ae * this.z + 36, var4 / this.ae * this.cb, 10, 12, null);
            }
         }
      }
   }

   @Override
   protected void l() {
      this.wd.zc().f(46);
   }
}
