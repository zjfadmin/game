package com.xy;

import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.readbean.Activity;
import com.xy.readbean.ActivityFC;
import com.xy.readbean.ActivityFCBase;
import com.xy.readbean.ActivityFCBuy;
import com.xy.readbean.ActivityFCTarget;
import com.xy.readbean.Goodstable;
import com.xy.readbean.LaborShop;
import com.xy.readbean.LaborVip;
import com.xy.socket.Agreement;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;

public class Class489 extends Class93 {
   private int cy;
   private Object cz;

   public void bm(int var1, int var2, int var3) {
      if (var3 > 0) {
         if (var1 != 0) {
            LaborShop var4;
            if ((var4 = (LaborShop)this.form.vc().au().getShops().get(var1)) == null) {
               return;
            }

            long var5 = bn(var4, this.form.vd()).longValue();
            long var7 = var4.getMoney();
            double var9;
            if (var4.getZk() != null && (var9 = bp(this.form.vd())) != 1.0D) {
               var7 = (long)((double)var7 * var9);
            }

            if (var7 * (long)var3 > var5) {
               this.form.aej.fw(var4.getMoneyType() + "不足");
               return;
            }

            if (var4.getChoice() != null && var2 == -4 >> 2) {
               this.form.aej.fw("请选择其中一个购买");
               return;
            }
         }

         String var11 = Agreement.getSendTextAES("labor", "NL|" + var1 + "|" + var2 + "|" + var3);
         this.form.uw().d(var11);
      }
   }

   public void mouseExited(MouseEvent var1) {
      super.mouseExited(var1);
      if (this.cy == (127 & 53)) {
         this.form.ve().n(126 & 47);
      }

   }

   public Class489(String var1, int var2, int var3, Font var4, Color[] var5, String var6, Class345 var7) {
      super(var1, var2, var5, var7);
      this.cy = var3;
      Class489 var10000;
      if (var4 != null) {
         this.setFont(var4);
         var10000 = this;
      } else {
         this.setFont(Class681.bm);
         var10000 = this;
      }

      var10000.setHorizontalAlignment(0);
      this.setText(var6);
   }

   public static BigDecimal bn(LaborShop var0, RoleData var1) {
      if (var0.getMoneyType().equals("仙玉")) {
         return var1.getLoginResult().getCodecard();
      } else if (var0.getMoneyType().equals("金钱")) {
         return var1.getLoginResult().getGold();
      } else {
         return var0.getMoneyType().equals("积分") ? new BigDecimal(var1.getLoginResult().getMoney()) : var1.getLoginResult().getScoretype(var0.getMoneyType());
      }
   }

   public Class489(String var1, int var2, int var3, Class345 var4) {
      super(var1, var2, var4);
      this.cy = var3;
      this.form = var4;
   }

   public void ac(MouseEvent var1, boolean var2) {
      if (this.cy >= (59 & 109) && this.cy <= (110 & 61)) {
         if (var2) {
            ((Class181)this.form).as(this.cy - (45 & 123));
            return;
         }
      } else if (this.cy >= (113 & 95) && this.cy <= (115 & 94) && var2) {
         ((Class660)this.form).dp(this.cy - (125 & 83));
      }

   }

   public int ae() {
      return this.cy;
   }

   public void ab(int var1) {
      this.cy = var1;
   }

   public void bo(Activity var1, ActivityFC var2, int var3) {
      if (var3 > 0) {
         RoleData var4 = this.form.vd();
         int var5 = 2 & 5;
         int var6 = 3 ^ 3;
         Class603 var7 = this.form.vc();
         ActivityFCBase[] var8 = null;
         if (var2.getType() == --1) {
            var8 = ((ActivityFCBuy)var2.getData()).getGains();
         } else if (var2.getType() == 5 >> 1) {
            var8 = ((ActivityFCTarget)var2.getData()).getGains();
         }

         int var9;
         for(int var10000 = var9 = 0; var10000 < var8.length; var10000 = var9) {
            ActivityFCBase var10;
            if ((var10 = var8[var9]).getType() != 5 >> 2) {
               if (var10.getType() == 5 >> 1) {
                  Goodstable var11;
                  if ((var11 = var7.n(new BigDecimal(var10.getId()))) != null && GoodType.ag(var11.getType())) {
                     ++var5;
                  } else {
                     var6 = (int)((long)var6 + var10.getNum());
                  }
               } else if (var10.getType() == --3) {
                  ++var6;
               } else {
                  var10.getType();
               }
            }

            ++var9;
         }

         var9 = var4.getGoodPackSum(-1L, new BigDecimal(-4 >> 2), var5 + var6 * var3) - var5;
         if (var6 > 0) {
            var3 = var9 / var6;
         }

         if (var3 > 0 && var9 >= 0) {
            String var12 = Agreement.getSendTextAES("activity", var1.getId() + "|" + var2.getId() + "|" + var3);
            this.form.uw().d(var12);
         } else {
            this.form.aej.f("你的背包不够");
         }
      }
   }

   public Class489(String var1, int var2, int var3, String var4, Class345 var5) {
      this(var1, var2, var3, (Font)null, (Color[])null, var4, var5);
   }

   public void af(MouseEvent var1) {
      if (this.cy == (2 ^ 3)) {
         ((Class401)this.form).s();
      } else if (this.cy == --2) {
         ((Class14)this.form).s();
      } else if (this.cy == --3) {
         ((Class568)this.form).p();
      } else if (this.cy == --4) {
         ((Class37)this.form).s();
      } else if (this.cy != --5 && this.cy != (111 & 22)) {
         if (this.cy == (11 & 125)) {
            ((Class407)this.form).y(this.cy);
         } else if (this.cy == (29 & 110)) {
            ((Class263)this.form).s();
         } else if (this.cy != (15 & 125) && this.cy != (82 & 61)) {
            if (this.cy == (87 & 58)) {
               Class658.cy(102 & 89, this.form.aej);
            } else if (this.cy >= (79 & 62) && this.cy <= (27 & 119)) {
               ((Class218)this.form).y(this.cy);
            } else if (this.cy >= (93 & 54) && this.cy <= (95 & 54)) {
               ((Class86)this.form).au(this.cy);
            } else if (this.cy == (127 & 31)) {
               ((Class459)this.form).s();
            } else if (this.cy == (116 & 43)) {
               Class658.cy(24286 & 8621, this.form.aej);
            } else if (this.cy == (49 & 111)) {
               Class658.cy(15519 & 17387, this.form.aej);
            } else if (this.cy == 34) {
               ((Class391)this.form).d();
            } else if (this.cy == 35) {
               ((Class588)this.form).s();
            } else if (this.cy != 51 && this.cy != 52) {
               if (this.cy == 53) {
                  this.bm(2 & 5, Integer.parseInt(this.getName()), 2 ^ 3);
               } else if (this.cy == 54) {
                  Class538 var3 = (Class538)this.form;
                  this.bm(var3.ael().getId(), var3.e(), --1);
               } else {
                  if (this.cy == 55) {
                     Class67 var2;
                     if ((var2 = (Class67)this.form).ael() != null) {
                        this.bm(var2.ael().getId(), 3 >> 2, (int)var2.gl());
                        return;
                     }

                     if (var2.aen() != null) {
                        this.bo(var2.kd(), var2.aen(), (int)var2.gl());
                        return;
                     }
                  } else {
                     if (this.cy == 61 || this.cy == 62) {
                        ((Class65)this.form).y(this.cy);
                        return;
                     }

                     if (this.cy == 71 || this.cy == 72) {
                        ((Class232)this.form).y(this.cy);
                        return;
                     }

                     if (this.cy == 83 || this.cy == 84 || this.cy == 85) {
                        ((Class660)this.form).y(this.cy);
                     }
                  }

               }
            } else {
               ((Class181)this.form).y(this.cy == 51 ? -2 : -1);
            }
         } else {
            Class658.cy(63, this.form.aej);
         }
      } else {
         ((Class644)this.form).y(this.cy);
      }
   }

   public static double bp(RoleData var0) {
      int var1 = var0.getLoginResult().getPaysum().intValue();

      LaborVip[] var2;
      int var3;
      for(int var10000 = var3 = (var2 = var0.getObjectArea().au().getVips()).length - (5 >> 2); var10000 >= 0; var10000 = var3) {
         if (var1 >= var2[var3].getMoney()) {
            return var2[var3].getZk();
         }

         --var3;
      }

      return 1.0D;
   }

   public void bq(Object var1) {
      this.cz = var1;
   }

   public void mouseEntered(MouseEvent var1) {
      super.mouseEntered(var1);
      if (this.cy == (125 & 55)) {
         LaborVip var3 = this.form.vc().au().getVips()[Integer.parseInt(this.getName())];
         Class270 var2 = (Class270)this.form.ve().e(127 & 46);
         var2.rl(var3.getMoney() + "累冲奖励", var3.getText());
      }

   }
}
