package com.xy.i;

import com.xy.a.Class48;
import com.xy.a.i.Class24;
import com.xy.a.i.Class28;
import com.xy.a.i.Class34;
import com.xy.a.i.Class37;
import com.xy.a.i.Class38;
import com.xy.a.i.Class45;
import com.xy.a.i.Class47;
import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.q.Class30;
import com.xy.q.Class49;
import com.xy.readbean.Activity;
import com.xy.readbean.ActivityFC;
import com.xy.readbean.ActivityFCBase;
import com.xy.readbean.ActivityFCBuy;
import com.xy.readbean.ActivityFCTarget;
import com.xy.readbean.Goodstable;
import com.xy.readbean.LaborShop;
import com.xy.readbean.LaborVip;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;

public class Class11 extends Class1 {
   private int eg;
   private Object acx;

   public void fj(int var1, int var2, int var3) {
      if (var3 > 0) {
         if (var1 != 0) {
            LaborShop var4;
            if ((var4 = this.form.yt().am().getShops().get(var1)) == null) {
               return;
            }

            long var5 = aes(var4, this.form.yx()).longValue();
            long var7 = var4.getMoney();
            double var9;
            if (var4.getZk() != null && (var9 = aeu(this.form.yx())) != 1.0) {
               var7 = (long)(var7 * var9);
            }

            if ((var7 = var7 * var3) > var5) {
               GameView var10000 = this.form.afx;
               StringBuilder var15 = new StringBuilder(String.valueOf(var4.getMoneyType()));
               String var17 = "乛趺";
               var10000.dp(var15.append("不足").toString());
               return;
            }

            if (var4.getChoice() != null && var2 == -1) {
               String var14 = "诒逗拌全丈丞丏贳乕";
               this.form.afx.dp("请选择其中一个购买");
               return;
            }
         }

         String var10003 = "G\u001au";
         StringBuilder var10001 = new StringBuilder("NL|").append(var1);
         String var10002 = "Y";
         var10001 = var10001.append("|").append(var2);
         var10002 = "u";
         String var11 = Agreement.getSendTextAES("labor", var10001.append("|").append(var3).toString());
         this.form.za().k(var11);
      }
   }

   public Class11(String var1, int var2, int var3, String var4, Class30 var5) {
      this(var1, var2, var3, null, null, var4, var5);
   }

   public void n(int var1) {
      this.eg = var1;
   }

   public int il() {
      return this.eg;
   }

   @Override
   public void cw(MouseEvent var1) {
      if (this.eg == 1) {
         ((com.xy.a.i.Class13)this.form).f();
      } else if (this.eg == 2) {
         ((Class45)this.form).f();
      } else if (this.eg == 3) {
         ((com.xy.a.i.Class20)this.form).e();
      } else if (this.eg == 4) {
         ((Class34)this.form).f();
      } else if (this.eg == 5 || this.eg == 6) {
         ((Class37)this.form).g(this.eg);
      } else if (this.eg == 9) {
         ((com.xy.a.i.Class5)this.form).g(this.eg);
      } else if (this.eg == 12) {
         ((com.xy.a.i.Class14)this.form).e();
      } else if (this.eg == 13 || this.eg == 16) {
         Class0.ff(63, this.form.afx);
      } else if (this.eg == 18) {
         Class0.ff(64, this.form.afx);
      } else if (this.eg >= 14 && this.eg <= 19) {
         ((com.xy.a.i.Class15)this.form).g(this.eg);
      } else if (this.eg >= 20 && this.eg <= 22) {
         ((com.xy.a.i.Class1)this.form).at(this.eg);
      } else if (this.eg == 31) {
         ((com.xy.a.i.Class3)this.form).f();
      } else if (this.eg == 32) {
         Class0.ff(140, this.form.afx);
      } else if (this.eg == 33) {
         Class0.ff(139, this.form.afx);
      } else if (this.eg == 34) {
         ((Class24)this.form).f();
      } else if (this.eg == 35) {
         ((Class38)this.form).h();
      } else if (this.eg == 51 || this.eg == 52) {
         ((Class28)this.form).g(this.eg == 51 ? -2 : -1);
      } else if (this.eg == 53) {
         this.fj(0, Integer.parseInt(this.getName()), 1);
      } else if (this.eg == 54) {
         com.xy.a.i.Class9 var3 = (com.xy.a.i.Class9)this.form;
         this.fj(var3.he().getId(), var3.dx(), 1);
      } else {
         if (this.eg == 55) {
            Class47 var2;
            if ((var2 = (Class47)this.form).he() != null) {
               this.fj(var2.he().getId(), 0, (int)var2.ee());
               return;
            }

            if (var2.anj() != null) {
               this.aet(var2.wg(), var2.anj(), (int)var2.ee());
               return;
            }
         } else {
            if (this.eg == 61 || this.eg == 62) {
               ((com.xy.a.i.Class10)this.form).y(this.eg);
               return;
            }

            if (this.eg == 71 || this.eg == 72) {
               ((com.xy.a.i.Class6)this.form).g(this.eg);
               return;
            }

            if (this.eg == 83 || this.eg == 84 || this.eg == 85) {
               ((com.xy.a.i.Class11)this.form).g(this.eg);
            }
         }
      }
   }

   public static BigDecimal aes(LaborShop var0, RoleData var1) {
      String var10000 = var0.getMoneyType();
      String var10001 = "仇玬";
      if (var10000.equals("仙玉")) {
         return var1.getLoginResult().getCodecard();
      } else {
         var10000 = var0.getMoneyType();
         var10001 = "醇钸";
         if (var10000.equals("金钱")) {
            return var1.getLoginResult().getGold();
         } else {
            var10000 = var0.getMoneyType();
            var10001 = "秱刣";
            return var10000.equals("积分") ? new BigDecimal(var1.getLoginResult().getMoney()) : var1.getLoginResult().getScoretype(var0.getMoneyType());
         }
      }
   }

   @Override
   public void fe(MouseEvent var1, boolean var2) {
      if (this.eg >= 41 && this.eg <= 44) {
         if (var2) {
            ((Class28)this.form).y(this.eg - 41);
            return;
         }
      } else if (this.eg >= 81 && this.eg <= 82 && var2) {
         ((com.xy.a.i.Class11)this.form).bi(this.eg - 81);
      }
   }

   public Class11(String var1, int var2, int var3, Font var4, Color[] var5, String var6, Class30 var7) {
      super(var1, var2, var5, var7);
      this.eg = var3;
      Class11 var10000;
      if (var4 != null) {
         var10000 = this;
         this.setFont(var4);
      } else {
         var10000 = this;
         this.setFont(Class49.bz);
      }

      var10000.setHorizontalAlignment(0);
      this.setText(var6);
   }

   public void gw(Object var1) {
      this.acx = var1;
   }

   public Class11(String var1, int var2, int var3, Class30 var4) {
      super(var1, var2, var4);
      this.eg = var3;
      this.form = var4;
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      super.mouseEntered(var1);
      if (this.eg == 53) {
         LaborVip var2 = this.form.yt().am().getVips()[Integer.parseInt(this.getName())];
         Class48 var3 = (Class48)this.form.zc().j(46);
         StringBuilder var10001 = new StringBuilder(String.valueOf(var2.getMoney()));
         String var10002 = "絹冻夀劸";
         var3.es(var10001.append("累冲奖励").toString(), var2.getText());
      }
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      super.mouseExited(var1);
      if (this.eg == 53) {
         this.form.zc().f(46);
      }
   }

   public void aet(Activity var1, ActivityFC var2, int var3) {
      if (var3 > 0) {
         RoleData var4 = this.form.yx();
         int var5 = 0;
         int var6 = 0;
         com.xy.v.Class8 var7 = this.form.yt();
         ActivityFCBase[] var8 = null;
         if (var2.getType() == 1) {
            var8 = ((ActivityFCBuy)var2.getData()).getGains();
         } else if (var2.getType() == 2) {
            var8 = ((ActivityFCTarget)var2.getData()).getGains();
         }

         int var9;
         for (int var10000 = var9 = 0; var10000 < var8.length; var10000 = ++var9) {
            ActivityFCBase var10;
            if ((var10 = var8[var9]).getType() != 1) {
               if (var10.getType() == 2) {
                  Goodstable var11;
                  if ((var11 = var7.ay(new BigDecimal(var10.getId()))) != null && GoodType.z(var11.getType())) {
                     var5++;
                  } else {
                     var6 = (int)(var6 + var10.getNum());
                  }
               } else if (var10.getType() == 3) {
                  var6++;
               } else {
                  var10.getType();
               }
            }
         }

         var9 = var4.getGoodPackSum(-1L, new BigDecimal(-1), var5 + var6 * var3) - var5;
         if (var6 > 0) {
            var3 = var9 / var6;
         }

         if (var3 > 0 && var9 >= 0) {
            StringBuilder var14 = new StringBuilder(String.valueOf(var1.getId()));
            String var10002 = "u";
            var14 = var14.append("|").append(var2.getId());
            var10002 = "Y";
            String var13 = Agreement.getSendTextAES("activity", var14.append("|").append(var3).toString());
            this.form.za().k(var13);
         } else {
            String var10001 = "佾皡胒匠专夺";
            this.form.afx._do("你的背包不够");
         }
      }
   }

   public static double aeu(RoleData var0) {
      int var1 = var0.getLoginResult().getPaysum().intValue();

      LaborVip[] var2;
      int var3;
      for (int var10000 = var3 = (var2 = var0.getObjectArea().am().getVips()).length - 1; var10000 >= 0; var10000 = --var3) {
         if (var1 >= var2[var3].getMoney()) {
            return var2[var3].getZk();
         }
      }

      return 1.0;
   }
}
