package com.xy;

import com.xy.bean.ConfirmBean;
import com.xy.bean.RoleShow;
import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.readbean.NpcInfoBean;
import com.xy.socket.Agreement;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;

public class Class393 extends Class93 {
   private int m;

   public Class393(String var1, int var2, int var3, Class345 var4) {
      super(var1, var2, var4);
      this.m = var3;
      this.form = var4;
   }

   public Class393(String var1, int var2, int var3, String var4, Class345 var5) {
      this(var1, var2, var3, (Font)null, (Color[])null, var4, var5);
   }

   public void ac(MouseEvent var1, boolean var2) {
   }

   public void af(MouseEvent var1) {
      if (this.m == (3 & 5)) {
         if (this.form.aej.getBattleScene() == null) {
            this.form.aej.setMouseIndex(Class320.g);
         }
      } else if (this.m == (1 ^ 3)) {
         if (this.form.aej.getBattleScene() == null) {
            if (!this.form.aej.t()) {
               this.form.aej.setMouseIndex(Class320.m);
            }
         }
      } else if (this.m == --3) {
         if (!this.form.aej.t()) {
            this.form.vd().setLockPack();
            this.form.ux().f("背包已加锁！");
         }
      } else if (this.m == --4) {
         ((Class289)this.form.ve().e(41 & 118)).as(Class394.o(this.form.vd().getLoginResult().getPassword()) ? 3 ^ 3 : 1);
      } else if (this.m == --5) {
         ((Class472)this.form.ve().e(27 & 127)).ll((Class165)null, (NpcInfoBean)null, 125 & 35);
      } else {
         String var12;
         if (this.m == (103 & 30)) {
            if (!this.form.aej.t()) {
               RoleShow var10 = this.form.aej.roleUnit.r;
               if (!this.form.uw().n(--2, --3)) {
                  if (var10.getMapid() != 1236L || var10.getX() <= 5977 || var10.getX() >= 8290 || var10.getY() <= 3099 || var10.getY() >= 4174) {
                     this.form.aej.fw("只能在洛阳集市摆摊");
                     return;
                  }

                  if (var10.getMapid() == 1236L && var10.getX() > 7130 && var10.getX() < 7370 && var10.getY() > 3435 && var10.getY() < 3585) {
                     this.form.aej.fw("车夫周围禁止摆摊");
                     return;
                  }
               } else {
                  if ((var10.getMapid() != 1236L || var10.getX() <= (32637 & 6107) || var10.getX() >= (29542 & 11515) || var10.getY() <= (7899 & 27967) || var10.getY() >= (6606 & 30335)) && (var10.getMapid() != 1207L || var10.getX() <= (16377 & 19710) || var10.getX() >= (15844 & 21243) || var10.getY() <= (13180 & 23807) || var10.getY() >= (15774 & 21493))) {
                     this.form.aej.fw("在洛阳集市或者长安集市摆摊");
                     return;
                  }

                  if (var10.getMapid() == 1236L && var10.getX() > (23519 & 16378) && var10.getX() < (32511 & 7626) && var10.getY() > (32747 & 3455) && var10.getY() < (32275 & 4077)) {
                     this.form.aej.fw("车夫周围禁止摆摊");
                     return;
                  }
               }

               if (var10.getTroop_id() == null && this.form.ux().getBattleScene() == null && this.form.ve().m(14) == null) {
                  if (var10.getBooth_id() != null) {
                     var12 = Agreement.getSendTextAES("stallget", var10.getBooth_id().toString());
                     this.form.uw().d(var12);
                  } else {
                     Class658.cy(152, this.form.aej);
                  }
               } else {
                  this.form.aej.f("当前状态不能摆摊！");
               }
            }
         } else if (this.m == 7) {
            Class658.cy(38, this.form.aej);
         } else if (this.m == 8) {
            if (this.form.vd().an()) {
               Class658.cy(182, this.form.aej);
            } else {
               var12 = Agreement.getSendTextAES("parcel", "GET");
               this.form.uw().d(var12);
            }
         } else if (this.m == 9) {
            this.form.vd().m();
         } else if (this.m == 10) {
            ((Class433)this.form).s();
         } else if (this.m >= 11 && this.m <= 13) {
            Class433 var9 = (Class433)this.form;
            RoleData var11;
            BigDecimal[] var14;
            if ((var14 = (var11 = this.form.vd()).getPackRecord().setEquipType(this.m - 11)) != null) {
               String var13 = Agreement.getSendTextAES("rolechange", "EO" + (this.m - 11));
               this.form.uw().d(var13);
               var9.y(this.m - 11);
               var11.setEquipGoodsList(var14);
               var11.getRoleProperty().q();

               RoleData var18;
               label195: {
                  try {
                     Thread.sleep(5L);
                  } catch (Exception var7) {
                     var18 = var11;
                     var7.printStackTrace();
                     break label195;
                  }

                  var18 = var11;
               }

               var18.f(false);
               var9.s();
            }
         } else if (this.m != 21 && this.m != 22 && this.m != 23) {
            if (this.m != 22 && this.m != 23 && this.m == 24) {
               RoleData var8 = this.form.vd();
               Class585 var2;
               Class585 var10000 = var2 = ((Class433)this.form).anc();
               int var4 = var10000.ot();
               if (var10000.t() && var4 >= var2.tp() - var2.aiy().length) {
                  return;
               }

               StringBuffer var3 = new StringBuffer();

               int var5;
               for(int var17 = var5 = 2 & 5; var17 < var2.aiy().length; var17 = var5) {
                  int var6 = var5 + var4;
                  Goodstable var16;
                  if ((var16 = var8.getGood(var8.goodPacks[var6])) != null && var16.getGoodlock() != --1 && (GoodType.ai(var16.getType()) == -4 >> 2 || GoodType.getExtra(var16.getValue(), GoodType.Extras[--4]) == null)) {
                     if (var3.length() != 0) {
                        var3.append("|");
                     }

                     var3.append(var16.getRgid());
                  }

                  ++var5;
               }

               if (var3.length() == 0) {
                  this.form.aej.f("当前背包栏没有要清理的物品");
                  return;
               }

               ConfirmBean var15 = new ConfirmBean(4 ^ 5, var3.toString(), "#W确定要将当前背包栏的物品丢弃吗(不包含加锁物品)?");
               this.form.aej.aal(var15);
            }

         } else {
            ((Class31)this.form).as(this.m);
         }
      }
   }

   public void ab(int var1) {
      this.m = var1;
   }

   public int ae() {
      return this.m;
   }

   public Class393(String var1, int var2, int var3, Font var4, Color[] var5, String var6, Class345 var7) {
      super(var1, var2, var5, var7);
      this.m = var3;
      Class393 var10000;
      if (var4 != null) {
         this.setFont(var4);
         var10000 = this;
      } else {
         this.setFont(Class681.bm);
         var10000 = this;
      }

      var10000.setHorizontalAlignment(0);
      this.setVerticalTextPosition(3 >> 2);
      this.setText(var6);
   }
}
