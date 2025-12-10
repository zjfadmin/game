package com.xy;

import com.xy.formula.BaseXuanBao;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.readbean.XuanBao;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.image.ImageObserver;
import java.math.BigDecimal;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;

public class Class197 extends Class397 {
   public int[] bbf;

   public int ae() {
      int var6 = this.cy * this.gw;
      RoleData var2;
      if ((var2 = this.lo.vd()) == null) {
         return 3 ^ 3;
      } else {
         int var3 = 0;
         int var10000;
         if (this.bbf[3 ^ 3] == 0 && this.bbf[2 ^ 3] == 0 && this.bbf[--2] == 0) {
            var10000 = var2.xuanBaoList.size();
         } else {
            Class603 var4 = this.lo.vc();

            int var5;
            for(var10000 = var5 = 3 ^ 3; var10000 < var2.xuanBaoList.size(); var10000 = var5) {
               Goodstable var1;
               if ((var1 = var2.getGood((BigDecimal)var2.xuanBaoList.get(var5))) != null) {
                  BaseXuanBao var7 = var1.getBaseXuanBao();
                  XuanBao var8;
                  if ((var8 = var4.cb(var7.getId())) != null && this.ee(var8.getRace()) && this.asd(var8.getType()) && this.ajm(var8.getLevel())) {
                     ++var3;
                  }
               }

               ++var5;
            }

            var10000 = var3;
         }

         return (var10000 - 1) / var6;
      }
   }

   public boolean au(int var1) {
      if ((var1 = var1 * this.cy * this.gw) == 0) {
         return (boolean)(2 ^ 3);
      } else if (this.lo.vd() == null) {
         return (boolean)(2 & 5);
      } else {
         return (boolean)(this.hp(var1) != null ? 3 & 5 : 0);
      }
   }


   private boolean asd(int var1) {
      if (this.bbf[3 & 5] == 0) {
         return (boolean)(3 >> 1);
      } else if (this.bbf[3 & 5] == (2 ^ 3) && var1 == --1) {
         return (boolean)(5 >> 2);
      } else if (this.bbf[--1] == --2 && var1 == --2) {
         return (boolean)(2 ^ 3);
      } else {
         return (boolean)(this.bbf[2 ^ 3] == --3 && var1 == --3 ? 4 ^ 5 : 0);
      }
   }

   public boolean ee(String var1) {
      if (this.bbf[5 >> 3] == 0) {
         return (boolean)(4 ^ 5);
      } else if (this.bbf[3 >> 2] == --1 && var1.equals("通用")) {
         return (boolean)(--1);
      } else if (this.bbf[3 ^ 3] == --2 && var1.indexOf("人") != -4 >> 2) {
         return (boolean)(--1);
      } else if (this.bbf[3 & 4] == --3 && var1.indexOf("魔") != -4 >> 2) {
         return (boolean)(2 ^ 3);
      } else if (this.bbf[2 & 5] == --4 && var1.indexOf("仙") != -4 >> 2) {
         return (boolean)(3 >> 1);
      } else if (this.bbf[2 & 5] == --5 && var1.indexOf("鬼") != -4 >> 2) {
         return (boolean)(5 >> 2);
      } else {
         return (boolean)(this.bbf[3 ^ 3] == (78 & 55) && var1.indexOf("龙") != -4 >> 2 ? --1 : 0);
      }
   }

   protected void cm(Graphics var1, RoleData var2) {
      int var7 = this.ot();
      int var4 = 3 >> 2;

      int var3;
      for(int var10000 = var3 = 3 ^ 3; var10000 < this.asw.length; var10000 = var3) {
         var4 = var3 + var7;
         Goodstable var5;
         if ((var5 = this.hp(var4)) == null) {
            int var6;
            for(var10000 = var6 = var3; var10000 < this.asw.length; var10000 = var6) {
               if (this.asw[var6] != null) {
                  this.asw[var6].g();
               }

               if (this.ama != null) {
                  var1.drawImage(this.ama, var6 % this.cy * this.dp, var6 / this.cy * this.gc, this.bn + --2, this.m + (1 ^ 3), (ImageObserver)null);
               }

               ++var6;
            }

            return;
         }

         if (this.asw[var3] == null || var5.getRgid() != this.asw[var3].i) {
            if (this.asw[var3] == null) {
               this.asw[var3] = new Class467();
            }

            this.asw[var3].d(var5);
         }

         if (this.ama != null) {
            var1.drawImage(this.ama, var3 % this.cy * this.dp, var3 / this.cy * this.gc, this.bn + (1 ^ 3), this.m + --2, (ImageObserver)null);
         }

         Goodstable var8;
         if (var3 != this.gv) {
            var8 = var5;
            Class511.d(var1, this.asw[var3].p, var3 % this.cy * this.dp + --1, var3 / this.cy * this.gc + (4 ^ 5), this.bn, this.m);
         } else {
            Class511.d(var1, this.asw[var3].p, var3 % this.cy * this.dp + (1 ^ 3), var3 / this.cy * this.gc + (5 >> 1), this.bn, this.m);
            var8 = var5;
         }

         if (var8.getStatus() == --1) {
            var1.drawImage(Class222.i, var3 % this.cy * this.dp, var3 / this.cy * this.gc, (ImageObserver)null);
         }

         ++var3;
      }

   }

   protected void cj(int var1, MouseEvent var2, RoleData var3) {
      Goodstable var5;
      if ((var5 = this.hp(var1)) != null) {
         if (var2.isShiftDown()) {
            try {
               JTextField var6;
               ((Class175)(var6 = this.lo.aej.getBaseView().jj()).getDocument()).arf(var6.getCaretPosition(), 1 ^ 3, var5.getRgid(), "[" + var5.getGoodsname() + "]", "G", (AttributeSet)null);
            } catch (BadLocationException var4) {
               var4.printStackTrace();
            }
         } else {
            if (this.lo instanceof Class300) {
               ((Class300)this.lo).ly(var5);
            }

         }
      }
   }

   protected void cn(int var1, MouseEvent var2, RoleData var3) {
      Goodstable var4;
      if ((var4 = this.hp(var1)) != null) {
         if (this.lo instanceof Class300) {
            ((Class300)this.lo).ax(var4);
         }

      }
   }


   private boolean ajm(int var1) {
      if (this.bbf[1 ^ 3] == 0) {
         return (boolean)(4 ^ 5);
      } else if (this.bbf[1 ^ 3] == (2 ^ 3) && var1 == 3 >> 1) {
         return (boolean)(3 >> 1);
      } else if (this.bbf[--2] == (1 ^ 3) && var1 == --2) {
         return (boolean)(3 >> 1);
      } else {
         return (boolean)(this.bbf[--2] == --3 && var1 == --3 ? 2 ^ 3 : 0);
      }
   }

   protected void q() {
      this.lo.ve().n(111 & 62);
   }

   public Class197(Class345 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10001 = --3;
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9);
      int[] var10 = new int[var10001];
      boolean var10003 = true;
      this.bbf = var10;
   }

   protected void cl(RoleData var1) {
      Goodstable var2;
      if ((var2 = this.hp(this.j + this.ot())) != null) {
         ((Class270)this.lo.ve().e(46 & 127)).oj(var2, (boolean)(3 >> 2));
      }
   }

   public Goodstable hp(int var1) {
      RoleData var6;
      if ((var6 = this.lo.vd()) == null) {
         return null;
      } else if (this.bbf[2 & 5] == 0 && this.bbf[3 >> 1] == 0 && this.bbf[--2] == 0) {
         return var6.getXuanBaoGood(var1);
      } else {
         Class603 var5 = this.lo.vc();

         int var4;
         for(int var10000 = var4 = 3 ^ 3; var10000 < var6.xuanBaoList.size(); var10000 = var4) {
            Goodstable var3;
            if ((var3 = var6.getGood((BigDecimal)var6.xuanBaoList.get(var4))) != null) {
               BaseXuanBao var2 = var3.getBaseXuanBao();
               XuanBao var7;
               if ((var7 = var5.cb(var2.getId())) != null && this.ee(var7.getRace()) && this.asd(var7.getType()) && this.ajm(var7.getLevel())) {
                  if (var1 <= 0) {
                     return var3;
                  }

                  --var1;
               }
            }

            ++var4;
         }

         return null;
      }
   }
}
